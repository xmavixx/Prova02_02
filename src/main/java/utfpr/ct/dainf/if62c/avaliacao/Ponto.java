package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Segunda avaliação parcial 2014/2.
 *
 * @author
 */
public class Ponto {

    private double x, y, z;

    /**
     * Retorna no nome não-qualificado da classe.
     *
     * @return O nome não qualificado da classe.
     */
    public String getNome() {
        return getClass().getSimpleName();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = 0;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = 0;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = 0;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        return hash;
    }

    public Ponto() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Ponto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double dist(Ponto p1) {
        double distancia;
        double x1, y1, z1;
        double soma;
        x1 = p1.x - x;
        y1 = p1.y - y;
        z1 = p1.z - z;
        distancia = Math.sqrt((Math.pow(x1, 2) + Math.pow(y1, 2) + Math.pow(z1, 2)));
        return distancia;

    }

    @Override
    public String toString() {
        String nomePonto;
        nomePonto = getNome() + "(" + x + "," + y + "," + z + ")";
        return nomePonto;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != getClass() || obj == null) {
            return false;
        } else {
            Ponto p1 = (Ponto) obj;
            if (x == p1.x && y == p1.y && z == p1.z) {
                return true;
            }
            return false;
        }
    }
}
