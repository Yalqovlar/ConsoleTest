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

    /**
     * Berilgan a(x1, y1, z1) vektorni t songa ko'paytirish.
     * Hosil bo'lgan vektor koordinatalarini 3 elementli
     * massiv ko'rinishida qaytaradi.
     */
    public double[] vektor3d_songa_kupaytirish(double t, double x1, double y1, double z1) {
        return new double[]{t * x1, t * y1, t * z1};
    }

    /**
     * Berilgan a(x1, y1, z1) vektorning uzunligi.
     * Natijani double ko'rinishida qaytaradi.
     */
    public double vektor3d_uzunlik(double x1, double y1, double z1) {
        return Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1);
    }

    /**
     * a(x1, y1, z1) va b(x2, y2, z2) vektorlarning skalyar
     * ko'paytmasi, ya'ni   a*b.
     * Natijani double ko'rinishida qaytaradi.
     */
    public double vektor3d_skalyar_kupaytma(double x1, double y1, double z1, double x2, double y2, double z2) {
        return x1 * x2 + y1 * y2 + z1 * z2;
    }

    /**
     * Agar a va b vektorlarning uzunligi va ular orasidagi burchak
     * ma'lum bo'lsa ularning skalyar ko'paytmasi.
     * Natija double qaytariladi.
     * burchak radian da berilishi lozim.
     */
    public double vektor3d_skalyar_burchak_orqali(double a, double b, double burchak) {
        return a * b * Math.cos(burchak);
    }
}
