package TmpPack;

class Statistics{
    int count;
    char ch;
    Statistics (char ch){
        count = 1;
        this.ch = ch;

    }
    @Override
    public int hashCode(){
        return ch;
    }
    @Override
    public boolean equals(Object o){
        Statistics other = (Statistics) o;
        if (this == o){

            this.count = other.count;
            return true;
        }
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        if (this.ch != other.ch)
            return false;
        other.count++;
        this.count = other.count;
        return true;
    }
    public String print(){
        System.out.println(this.ch);
        return "<" + Character.toString(this.ch) + ">: " + this.count;
    }
}