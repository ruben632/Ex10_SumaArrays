void main() {
    java.util.Scanner sc = new java.util.Scanner(System.in);

    int[] a = new int[5];
    int[] b = new int[5];
    int[] resultat = new int[5];

    System.out.println("Introdueix 5 nombres per a l'array a:");
    for (int i = 0; i < 5; i++) {
        a[i] = sc.nextInt();
    }

    System.out.println("Introdueix 5 nombres per a l'array b:");
    for (int i = 0; i < 5; i++) {
        b[i] = sc.nextInt();
    }

    for (int i = 0; i < 5; i++) {
        resultat[i] = a[i] + b[i];
    }

    System.out.println("a: " + java.util.Arrays.toString(a));
    System.out.println("b: " + java.util.Arrays.toString(b));
    System.out.println("resultat: " + java.util.Arrays.toString(resultat));

    sc.close();
}