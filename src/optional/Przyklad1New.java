package optional;

import java.util.Optional;

public class Przyklad1New {
    public static void main(String[] args) {
        Optional<User> firstUserOptional = getFirstUser();
        if (firstUserOptional.isPresent()) {
            String streetName = firstUserOptional
                    .filter(u -> !u.getFirstName().isEmpty())
                    .map(User::getAddress)
                    .map(Address::getCity)
                    .map(City::getStreetName)
                    .get();
            System.out.println(streetName);
        }
    }

    private static Optional<User> getFirstUser() {
        int num = 1;
        User user = new User("Andrzej", "Nowak", new Address(new City("Kościuszki")));
        if(num > 0) {
            return Optional.of(user);
        }
        return Optional.empty();
    }
}
