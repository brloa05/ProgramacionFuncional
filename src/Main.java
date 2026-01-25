





void main() {
    //Reto #1
    List<Integer> numeros = List.of(-3, -2, 0, 1, 2, 4, 7, 8);

    Predicate<Integer> IsPositiveAndPar = n ->  n > 0 && n % 2 == 0;

    List<Integer> numbersAccept = numeros.stream().filter(IsPositiveAndPar).toList();

    numbersAccept.forEach(System.out:: println);
}
