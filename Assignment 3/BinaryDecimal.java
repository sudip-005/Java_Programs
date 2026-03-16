class BinaryDecimal {
    public static void main(String[] args) {
        int binary = 1010;
        int decimal = Integer.parseInt(""+binary,2);
        System.out.println("Decimal: "+decimal);
        System.out.println("Binary: "+Integer.toBinaryString(decimal));
    }
}