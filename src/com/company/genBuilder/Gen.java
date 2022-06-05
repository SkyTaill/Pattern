package com.company.genBuilder;

public class Gen {
    private int areal;
    private  int gen;
    private String mutation;

    public Gen(GenBuilder genBuilder) {
        this.areal = genBuilder.areal;
        this.gen = genBuilder.gen;
        this.mutation =genBuilder.mutation;
    }

    @Override
    public String toString() {
        return "Gen{" +
                "areal=" + areal +
                ", gen=" + gen +
                ", mutation='" + mutation + '\'' +
                '}';
    }

    public static class GenBuilder{
        private int areal;
        private  int gen;
        private String mutation;

        public GenBuilder(int gen) {
            this.gen = gen;
        }
        public GenBuilder setArel(int areal){
            this.areal=areal;
            return this;
        }
        public GenBuilder setMutation(String mutation){
            this.mutation=mutation;
            return this;
        }
        public Gen build(){
            return new Gen(this);
        }
    }
}
