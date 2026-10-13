class ClinicAppointment {
    String name, id, doctor, type;
    double fee;

    // Constructor 1
    ClinicAppointment(String n, String i, String d) {
        name = n;
        id = i;
        doctor = d;
        type = "General";
        fee = 500;
    }

    // Constructor 2
    ClinicAppointment(String n, String i, String d,
                      String t, double f) {
        name = n;
        id = i;
        doctor = d;
        type = t;
        fee = f;
    }

    // Display method
    void display() {
        System.out.println("\n--- CLINIC APPOINTMENT ---");
        System.out.println("Patient Name: " + name.toUpperCase());
        System.out.println("Patient ID: " + id);
        System.out.println("Doctor Name: " + doctor.toUpperCase());
        System.out.println("Appointment Type: " + type.toUpperCase());
        System.out.println("Consultation Fee: Rs. " + fee);
        System.out.println("Appointment Status: Confirmed");
    }

    // Overloaded method
    void display(boolean b) {
        display();
    }

    public static void main(String[] args) {
        ClinicAppointment a1 =
            new ClinicAppointment("Priya Sharma", "P101",
                                  "Dr. Kumar", "General", 500);

        ClinicAppointment a2 =
            new ClinicAppointment("Rahul Verma", "P102",
                                  "Dr. Meena", "Specialist", 800);

        a1.display();
        a2.display();

        double total = a1.fee + a2.fee;

        System.out.println("\n--- APPOINTMENT SUMMARY ---");
        System.out.println("Total Appointments: 2");
        System.out.println("Total Consultation: Rs. " + total);

        if (a1.name.equalsIgnoreCase("Priya Sharma")) {
            System.out.println("Patient Verification: Names Match");
        } else {
            System.out.println("Patient Verification: Names Do Not Match");
        }
    }
}