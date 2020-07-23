package maths.pure.algebra.linear.vectors;

public final class Vector3d {

    /**
     * Boshi A(a1, a2, a3) nuqtada oxiri B(b1, b2, b3)
     * nuqtada bo'lgan AB vektorning koordinatalari.
     * Natijani 3 elementli massiv ko'rinishida qaytaradi.
     */
    public double[] vektor3d_koordinatalari(double a1, double a2, double a3, double b1, double b2, double b3) {
        return new double[]{b1 - a1, b2 - a2, b3 - a3};
    }

    /**
     * a(x1, y1, z1) va b(x2, y2, z2) vektorlarni qo'shish.
     * Hosil bo'lgan yangi vektor koordinatalarini 3 elementli
     * massiv ko'rinishida qaytaradi.
     */
    public double[] vektor3d_qushish(double x1, double y1, double z1, double x2, double y2, double z2) {
        return new double[]{x1 + x2, y1 + y1, z1 + z2};
    }

    /**
     * a(x1, y1, z1) dan b(x2, y2, z2) vektorni qo'shish.
     * Hosil bo'lgan yangi vektor koordinatalarini 3 elementli
     * massiv ko'rinishida qaytaradi.
     */
    public double[] vektor3d_ayirish(double x1, double y1, double z1, double x2, double y2, double z2) {
        return new double[]{x1 - x2, y1 - y1, z1 - z2};
    }
}
