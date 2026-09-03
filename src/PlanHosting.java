public class PlanHosting {
    private  String nombreDominio;
    private int capacidadMaximaGB;
    private double espacioOcupadoGB;

    public PlanHosting(String nombreDominio, int capacidadMaximaGB, double espacioOcupadoGB) {
        this.nombreDominio = nombreDominio;

        if (capacidadMaximaGB > 0) {
            this.capacidadMaximaGB = capacidadMaximaGB;
        } else {
            this.capacidadMaximaGB = 1;
        }

        if (espacioOcupadoGB >= 0 && espacioOcupadoGB <= this.capacidadMaximaGB) {
            this.espacioOcupadoGB = espacioOcupadoGB;
        } else {
            this.espacioOcupadoGB = 0;
        }
    }

    public String getNombreDominio() {
        return nombreDominio;
    }

    public void setNombreDominio(String nombreDominio) {
        this.nombreDominio = nombreDominio;
    }

    public int getCapacidadMaximaGB() {
        return capacidadMaximaGB;
    }

    public void setCapacidadMaximaGB(int capacidadMaximaGB) {
        if (capacidadMaximaGB > 0) {
            this.capacidadMaximaGB = capacidadMaximaGB;
        }
    }

    public double getEspacioOcupadoGB() {
        return espacioOcupadoGB;
    }

    public void setEspacioOcupadoGB(double espacioOcupadoGB) {
        if (espacioOcupadoGB >= 0 && espacioOcupadoGB <= capacidadMaximaGB) {
            this.espacioOcupadoGB = espacioOcupadoGB;
        }
    }

    public void subirArchivos(double pesoGB) {
        if (pesoGB > 0) {
            if (espacioOcupadoGB + pesoGB <= capacidadMaximaGB) {
                espacioOcupadoGB += pesoGB;
                System.out.println("Archivo subido correctamente.");
            } else {
                System.out.println("Alerta: se supera la capacidad máxima.");
            }
        }
    }
}
