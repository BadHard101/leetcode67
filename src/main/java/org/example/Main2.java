package org.example;

class Main2 {
    public String addBinary(String a, String b) {
        if (a.length() == 0) return b;
        if (b.length() == 0) return a;

        StringBuilder answer = new StringBuilder();

        Integer indexA = a.length() - 1;
        Integer indexB = b.length() - 1;

        Integer ost = 0;

        Integer bitA;
        Integer bitB;

        while (indexA > -1 || indexB > -1) {
            if (indexA > -1) {
                char charA = a.charAt(indexA);
                bitA = Integer.parseInt(Character.toString(charA));
            } else {
                bitA = 0;
            }

            if (indexB > -1) {
                char charB = b.charAt(indexB);
                bitB = Integer.parseInt(Character.toString(charB));
            } else {
                bitB = 0;
            }

            Integer sum = ost + bitA + bitB;
            answer.append(sum % 2);
            ost = sum / 2;

            indexA--;
            indexB--;
        }

        if (ost != 0) answer.append(ost);
        return answer.reverse().toString();
    }
}