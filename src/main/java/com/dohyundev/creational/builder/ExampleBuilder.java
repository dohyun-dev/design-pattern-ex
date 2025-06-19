package com.dohyundev.creational.builder;

public class ExampleBuilder {
    private String field1;
    private Integer field2;
    private Double field3;

    public static Builder builder() {
        return new Builder();
    }

    private ExampleBuilder(Builder builder) {
        this.field1 = builder.field1;
        this.field2 = builder.field2;
        this.field3 = builder.field3;
    }

    @Override
    public String toString() {
        return "ExampleBuilder{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                ", field3=" + field3 +
                '}';
    }

    public static class Builder {
        private String field1;
        private Integer field2;
        private Double field3;

        private Builder() {
        }

        public Builder field1(String field1) {
            this.field1 = field1;
            return this;
        }

        public Builder field2(Integer field2) {
            this.field2 = field2;
            return this;
        }

        public Builder field3(Double field3) {
            this.field3 = field3;
            return this;
        }

        public ExampleBuilder build() {
            return new ExampleBuilder(this);
        }
    }

    public static void main(String[] args) {
        ExampleBuilder ss = ExampleBuilder.builder().field1("ss").field2(1).build();
        System.out.println(ss);
    }
}