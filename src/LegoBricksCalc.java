public class LegoBricksCalc {
    public static void main(String[] args) {

        //the number of bricks we have
        int amountOfBricks = 69;

        //the capacity of the container for bricks, i.e. how many bricks can fit in a single container
        int containerCapacity = 8;

        //number of full containers
        int containers = amountOfBricks/containerCapacity;
        System.out.println("We have: " + containers + " full containers");

        //variable holding the remainder of the division,
        // i.e. whether we have a free container and how many blocks are in it
        int remainder = amountOfBricks % containerCapacity;

        if (remainder != 0 ){
            containers++;
            containerCapacity = remainder;
        }

        System.out.println("Total number of containers: " + containers);
        System.out.println("Number of blocks in an incomplete container: " + containerCapacity);

    }
}
