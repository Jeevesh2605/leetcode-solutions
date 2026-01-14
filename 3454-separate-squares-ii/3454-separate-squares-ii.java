class Solution {

    static class Seg {
        int l, r, cnt;
        double len;
        Seg left, right;
        Seg(int l, int r){ this.l=l; this.r=r; }
    }

    Seg build(int l, int r){
        Seg n=new Seg(l,r);
        if(l+1<r){
            int m=(l+r)/2;
            n.left=build(l,m);
            n.right=build(m,r);
        }
        return n;
    }

    void update(Seg n,int l,int r,int v,double[] X){
        if(n.r<=l||n.l>=r) return;
        if(l<=n.l&&n.r<=r){
            n.cnt+=v;
        }else{
            update(n.left,l,r,v,X);
            update(n.right,l,r,v,X);
        }
        if(n.cnt>0) n.len=X[n.r]-X[n.l];
        else if(n.left!=null) n.len=n.left.len+n.right.len;
        else n.len=0;
    }

    public double separateSquares(int[][] A) {
        List<double[]> e=new ArrayList<>();
        TreeSet<Double> xs=new TreeSet<>();

        for(int[] s:A){
            e.add(new double[]{s[1],s[0],s[0]+s[2],1});
            e.add(new double[]{s[1]+s[2],s[0],s[0]+s[2],-1});
            xs.add((double)s[0]);
            xs.add((double)s[0]+s[2]);
        }

        double[] X=xs.stream().mapToDouble(d->d).toArray();
        Map<Double,Integer> id=new HashMap<>();
        for(int i=0;i<X.length;i++) id.put(X[i],i);

        e.sort(Comparator.comparingDouble(a->a[0]));
        Seg root=build(0,X.length-1);

        double tot=0,py=e.get(0)[0];
        List<double[]> s=new ArrayList<>();

        for(double[] v:e){
            double y=v[0];
            double a=root.len*(y-py);
            if(a>0){ s.add(new double[]{py,y,a}); tot+=a; }
            update(root,id.get(v[1]),id.get(v[2]),(int)v[3],X);
            py=y;
        }

        double h=tot/2,cur=0;
        for(double[] v:s){
            if(cur+v[2]>=h) return v[0]+(h-cur)/v[2]*(v[1]-v[0]);
            cur+=v[2];
        }
        return 0;
    }
}
