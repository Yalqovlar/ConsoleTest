package maths.pure.algebra.linear.vectors;

/**
 * Katta harflar bilan nuqtalar beriladi, kichik harflar bilan esa vektorlar
 * beriladi.
 * Qavslar ichidagi x va y (yoki a va b) koordinatalar bundan mustasno.
 */

public final class Vector {

    /**
     * Boshi A(a1; a2) nuqtada oxiri B(b1; b2) nuqtada bo'lgan
     * AB = a vektorning koordinatalari.
     * Natijani ikki o'lchamli massiv ko'rinishida qaytaradi.
     */
    public double[] vektor_koordinatlari(double a1, double a2, double b1, double b2) {
        return new double[]{b2 - a2, b1 - a1};
    }

    /**
     * a(x1; y1) dan b(x2, y2) vektorni ayirish. Ya'ni c = a - b;
     * Yangi hosil bo'lgan c vektor koordinatalarini ikki o'lchovli
     * massiv ko'rinishida qaytaradi.
     */
    public double[] ayirmasi(double x1, double y1, double x2, double y2) {
        return new double[]{x1 - x2, y1 - y2};
    }

    /**
     * Berilgan a(x1, y1) vektorni t songa ko'paytirish.
     * Natijani ikki o'lchamli massiv ko'rinishida qaytaradi.
     */
    public double[] songa_kupaytmasi(double x1, double y1, double t) {
        return new double[]{x1 * t, y1 * t};
    }
}
