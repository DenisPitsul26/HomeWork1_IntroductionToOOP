package ex3;

public class Main {
    public static void main(String[] args) {

        Vector3d vector3dOne = new Vector3d(3, 4,  6);
        System.out.println(vector3dOne);

        Vector3d vector3dTwo = new Vector3d();
        vector3dTwo.setCoordinateX(6);
        vector3dTwo.setCoordinateY(2);
        vector3dTwo.setCoordinateZ(5);
        System.out.println(vector3dTwo);

        System.out.println();
        System.out.println("adding vectors: "+ Vector3d.addingVectors(vector3dOne, vector3dTwo));
        System.out.println("scalar product of vectors: "+ Vector3d.scalarProductOfVectors(vector3dOne, vector3dTwo));
        System.out.println("vector product of vectors: "+ Vector3d.vectorProductOfVectors(vector3dOne, vector3dTwo));

    }
}
