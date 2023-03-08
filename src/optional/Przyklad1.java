package optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Przyklad1 {
    public static void main(String[] args) {
        Optional<User> firstUserOptional = getFirstUser();
        if (firstUserOptional.isPresent()) {
            String streetName = firstUserOptional
                    .map(user -> user.getAddress())
                    .map(Address::getCity)
                    .map(City::getStreetName)
                    .orElse("1");
            System.out.println(streetName);
        }
    }

    private static Optional<User> getFirstUser() {
        int num = 1;
        User user = new User("Andrzej", "Nowak", new Address(new City("asd")));
        if(num > 0) {
            return Optional.ofNullable(user);
        }
        return Optional.empty();
    }
}
