public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce euros: ");
    int dineroEnCentimos  = (int) Math.round(sc.nextDouble() * 100);

    System.out.println("videotutorias.Monedas de 2€: " + dineroEnCentimos  / 200);
    dineroEnCentimos  %= 200;

    System.out.println("videotutorias.Monedas de 1€: " + dineroEnCentimos  / 100);
    dineroEnCentimos  %= 100;
    System.out.println("videotutorias.Monedas de 0.50€: " + dineroEnCentimos  / 50);
    dineroEnCentimos  %= 50;
    System.out.println("videotutorias.Monedas de 0.20€: " + dineroEnCentimos  / 20);
    dineroEnCentimos  %= 20;
    System.out.println("videotutorias.Monedas de 0.10€: " + dineroEnCentimos  / 10);
    dineroEnCentimos  %= 10;
    System.out.println("videotutorias.Monedas de 0.05€: " + dineroEnCentimos  / 5);
    dineroEnCentimos  %= 5;
    System.out.println("videotutorias.Monedas de 0.02€: " + dineroEnCentimos  / 2);
    dineroEnCentimos  %= 2;
    System.out.println("videotutorias.Monedas de 0.01€: " + dineroEnCentimos );

    sc.close();
}