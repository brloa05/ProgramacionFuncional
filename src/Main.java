void main(String[] args) {
    //Reto #1
    List<Integer> numeros = List.of(-3, -2, 0, 1, 2, 4, 7, 8);

    Predicate<Integer> isPositiveAndEven = n ->  n > 0 && n % 2 == 0;

    List<Integer> acceptedNumbers = numeros.stream().filter(isPositiveAndEven).toList();

    acceptedNumbers.forEach(System.out:: println);
}
