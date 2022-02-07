class Hanoi {
    long l;
    public long toh(int N, int from, int to, int aux) {

          if(N>0){
            toh(N-1,from,aux,to);
            System.out.format("move disk %d from rod %d to rod %d\n",N,from,to);
            toh(N-1,aux,to,from);
          l++;  
        }
        return l;
    }
}
