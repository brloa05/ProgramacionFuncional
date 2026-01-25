void main(String[] args) {
    //Reto #1
    List<Integer> numeros = List.of(-3, -2, 0, 1, 2, 4, 7, 8);

    Predicate<Integer> isPositiveAndEven = n ->  n > 0 && n % 2 == 0;

    List<Integer> acceptedNumbers = numeros.stream().filter(isPositiveAndEven).toList();

    acceptedNumbers.forEach(System.out:: println);

    //Reto #2
    List<String> palabras = List.of("Java", "Streams", "Lambda");

    Function<String, Integer>  lengths = String::length;

    palabras.stream().map(lengths).forEach(System.out::println);
    //Reto #3

    List<Integer> numbers = List.of(3, 7, 10, 12, 15);



    List<Integer> result = numbers.stream().filter(n -> n > 10).map(n -> (int) Math.pow(n,2)).toList();

    result.forEach(System.out::println);


}
