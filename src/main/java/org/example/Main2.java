package org.example;

class Main2 {
    public String addBinary(String a, String b) {
        if (a.length() == 0) return b;
        if (b.length() == 0) return a;

        StringBuffer answer = new StringBuffer();

        StringBuffer bufferA = new StringBuffer(a);
        StringBuffer bufferB = new StringBuffer(b);

        Integer indexA = bufferA.length() - 1;
        Integer indexB = bufferB.length() - 1;

        Character charA;
        Character charB;

        Integer ost = 0;

        Integer bitA;
        Integer bitB;

        while (indexA > -1 || indexB > -1) {
            if (indexA > -1) {
                charA = bufferA.charAt(indexA);
                bitA = Integer.parseInt(charA.toString());
            } else {
                bitA = 0;
            }

            if (indexB > -1) {
                charB = bufferB.charAt(indexB);
                bitB = Integer.parseInt(charB.toString());
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