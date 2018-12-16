package ex3;

public class Vector3d {
    private double coordinateX;
    private double coordinateY;
    private double coordinateZ;

    public Vector3d(double coordinateX, double coordinateY, double coordinateZ) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
    }

    public Vector3d() {
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public double getCoordinateZ() {
        return coordinateZ;
    }

    public void setCoordinateZ(double coordinateZ) {
        this.coordinateZ = coordinateZ;
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", coordinateZ=" + coordinateZ +
                '}';
    }

    public static Vector3d addingVectors(Vector3d vector3dOne, Vector3d vector3dTwo) {
        double newCoordinateX = vector3dOne.coordinateX + vector3dTwo.coordinateX;
        double newCoordinateY = vector3dOne.coordinateY + vector3dTwo.coordinateY;
        double newCoordinateZ = vector3dOne.coordinateZ + vector3dTwo.coordinateZ;

        return new Vector3d(newCoordinateX, newCoordinateY, newCoordinateZ);
    }

    public static double scalarProductOfVectors(Vector3d vector3dOne, Vector3d vector3dTwo) {
        return vector3dOne.coordinateX * vector3dTwo.coordinateX
                + vector3dOne.coordinateY * vector3dTwo.coordinateY
                + vector3dOne.coordinateZ * vector3dTwo.coordinateZ;
    }

    public static Vector3d vectorProductOfVectors(Vector3d vector3dOne, Vector3d vector3dTwo) {
        double newCoordinateX = vector3dOne.coordinateY * vector3dTwo.coordinateZ
                - vector3dOne.coordinateZ * vector3dTwo.coordinateY;
        double newCoordinateY = vector3dOne.coordinateZ * vector3dTwo.coordinateX
                - vector3dOne.coordinateX * vector3dTwo.coordinateZ;
        double newCoordinateZ = vector3dOne.coordinateX * vector3dTwo.coordinateY
                - vector3dOne.coordinateY * vector3dTwo.coordinateX;

        return new Vector3d(newCoordinateX, newCoordinateY, newCoordinateZ);
    }
}
