//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    PlanHosting plan = new PlanHosting("www.misitio.com", 10, 5);

    plan.subirArchivos(3);
    plan.subirArchivos(4);
    plan.subirArchivos(2);

    System.out.println("Dominio: " + plan.getNombreDominio());
    System.out.println("Espacio ocupado: " + plan.getEspacioOcupadoGB() + " GB");
    System.out.println("Capacidad máxima: " + plan.getCapacidadMaximaGB() + " GB");
}
