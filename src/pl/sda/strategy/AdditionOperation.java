package pl.sda.strategy;

class AdditionOperation implements Operation {

    @Override
    public int calculate(int arg1, int arg2) {
        return arg1 + arg2;
    }
}
