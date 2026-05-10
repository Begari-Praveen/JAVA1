class LongestCommonPrefix {
    public static void main(String[] args) {

        String arr[] = {"flower", "flow", "flight"};

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr[0].length(); i++) {

            char ch = arr[0].charAt(i);

            for(int j = 1; j < arr.length; j++) {

                // Edge case check
                if(i >= arr[j].length() || arr[j].charAt(i) != ch) {

                    System.out.println(sb.toString());
                    return;
                }
            }

            sb.append(ch);
        }

        System.out.println(sb.toString());
    }
}
