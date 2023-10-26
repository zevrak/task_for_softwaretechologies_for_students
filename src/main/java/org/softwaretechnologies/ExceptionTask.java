package org.softwaretechnologies;;

import java.util.Optional;

public class ExceptionTask {
    /**
     * Исправьте функцию printMessage не убирая вызов функции throwRuntimeException.
     * Функция printMessage должна выводить на экран сообщение:
       Вызвана функция printMessage
     */
    public static void printMessage() {
        //throwRuntimeException();
        // TODO: реализуйте вышеуказанную функцию
        try {
            throwRuntimeException();
        }catch (Exception s){
            System.out.println("Вызвана функция printMessage");
        }
    }

    /**
     * Исправьте функцию printMessage2 не убирая вызов функции throwCatchableException.
     * Функция printMessage должна выводить на экран сообщение:
     Вызвана функция printMessage2
     */
    public static void printMessage2() throws Exception {
        //throwCatchableException();
        // TODO: реализуйте вышеуказанную функцию
        try {
            throwRuntimeException();
        }catch (Exception s) {
            System.out.println("Вызвана функция printMessage2");
        }
    }

    private static void throwCatchableException() throws Exception {
        throw new Exception();
    }

    private static void throwRuntimeException() {
        throw new RuntimeException();
    }

    /**
     * Если делитель равен 0, то инициируйте DivideOnNullException
     * @param dividend делимое
     * @param divisor делитель
     * @return dividend/divisor
     * @throws DivideOnNullException если divisor равен 0
     */
    public static int divide(int dividend, int divisor) throws DivideOnNullException {
if (divisor==0){
    throw new DivideOnNullException();
}
        // TODO: реализуйте вышеуказанную функцию
        return dividend/divisor;
    }

    /**
     * Исправьте возможные ошибки в функции.
     * Функция возвращает конкатенацию двух строк: наибольшую из двух строк с другой строкой.
     * Если один из параметров null, то должен возвращаться Optional со значением другой строки (не null).
     * Если обе строки равны null, то должен возвращаться пустой Optional.
     * @param first первая строка
     * @param second вторая строка
     * @return конкатенацию двух строк: кротчайшую из двух строк с другой строкой.
     */
    public static Optional<String> mergeStrings(String first, String second) {
        // TODO: реализуйте вышеуказанную функцию
        if (first==null&&second==null) {
            return Optional.empty();
        }else if (first==null){
            return Optional.of(second);
        }else if (second==null){return  Optional.of(first);}

        return Optional.of(first.length() > second.length() ? first + second : second + first);
    }
}
