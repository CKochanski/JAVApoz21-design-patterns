package pl.sda.strategy;

class SubtractionOperation implements Operation {

    @Override
    public int calculate(int arg1, int arg2) {
        return arg1 - arg2;
    }
}
