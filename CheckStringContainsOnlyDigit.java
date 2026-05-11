class CheckStringContainsOnlyDigits {
    public static void main(String[] args) {

        String str = "12 345";

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch < '0' || ch > '9') {

                System.out.println("Not Only Digits");
                return;
            }
        }

        System.out.println("Contains Only Digits");
    }
}
