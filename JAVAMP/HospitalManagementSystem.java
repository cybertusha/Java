import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Patient {
    private int id;
    private String name;
    private int age;
    private int weight;
    private int height;
    private String gender;
    private String address;

    public Patient(int id, String name, int age, int weight, int height, String gender, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.address = address;
    }

    // Getters for patient attributes
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }
}

class Doctor {
    private int id;
    private String name;
    private String specialization;

    public Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    // Getters for doctor attributes
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
}

class Appointment {
    private int appointmentId;
    private int patientId;
    private int doctorId;
    private String date;

    public Appointment(int appointmentId, int patientId, int doctorId, String date) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
    }

    // Getters for appointment attributes
    public int getAppointmentId() {
        return appointmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getDate() {
        return date;
    }
}

class Bill {
    private int patientId;
    private double amount;

    public Bill(int patientId, double amount) {
        this.patientId = patientId;
        this.amount = amount;
    }

    // Getters for bill attributes
    public int getPatientId() {
        return patientId;
    }

    public double getAmount() {
        return amount;
    }
}

class Hospital {
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();
    private List<Bill> bills = new ArrayList<>();
    private int nextPatientId = 1;
    private int nextDoctorId = 1;
    private int nextAppointmentId = 1;

    public void addPatient(String name, int age, int weight, int height, String gender, String address) {
        Patient patient = new Patient(nextPatientId, name, age, weight, height, gender, address);
        patients.add(patient);
        nextPatientId++;
    }

    public Patient viewPatient(int patientId) {
        for (Patient patient : patients) {
            if (patient.getId() == patientId) {
                return patient;
            }
        }
        return null; // Patient not found
    }

    public void addDoctor(String name, String specialization) {
        Doctor doctor = new Doctor(nextDoctorId, name, specialization);
        doctors.add(doctor);
        nextDoctorId++;
    }

    public List<Doctor> viewDoctors() {
        return doctors;
    }

    public void makeAppointment(int patientId, int doctorId, String date) {
        Appointment appointment = new Appointment(nextAppointmentId, patientId, doctorId, date);
        appointments.add(appointment);
        nextAppointmentId++;
    }

    public List<Appointment> viewAppointment() {
        return appointments;
    }

    public void deletePatient(int patientId) {
        patients.removeIf(patient -> patient.getId() == patientId);
    }

    public void generateBill(int patientId, double amount) {
        Bill bill = new Bill(patientId, amount);
        bills.add(bill);
    }

    public List<Bill> viewBills() {
        return bills;
    }
}

class HospitalManagementSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Life Hospital");
            int view;
            do {
                System.out.println("What Section do you view");
                System.out.println("1. Patients\t\t\t2. Doctors\t\t\t3. Appointments\t\t\t4. Quit");
                view = scanner.nextInt();
                if (view == 1) {
                    System.out.println("Welcome to Patients Section");
                    int moreupdate;
                    do {
                        System.out.println("What Do you want to UPDATE!..\n");
                        System.out.println("1. Add Patient");
                        System.out.println("2. View Patient");
                        System.out.println("3. Delete Patient");
                        System.out.println("4. Generate Bill");
                        System.out.println("5. View Bills");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                scanner.nextLine();
                                System.out.print("Enter patient name: ");
                                String name = scanner.nextLine();
                                System.out.print("Enter patient age: ");
                                int age = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter patient weight: ");
                                int weight = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter patient height: ");
                                int height = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter patient gender: ");
                                String gender = scanner.nextLine();
                                System.out.print("Enter patient address: ");
                                String address = scanner.nextLine();
                                hospital.addPatient(name, age, weight, height, gender, address);
                                System.out.println("Patient added successfully.");
                                break;

                            case 2:
                                System.out.print("Enter patient ID: ");
                                int patientId = scanner.nextInt();
                                scanner.nextLine();
                                Patient patient = hospital.viewPatient(patientId);
                                if (patient != null) {
                                    System.out.println("Patient ID: " + patient.getId());
                                    System.out.println("Name: " + patient.getName());
                                    System.out.println("Age: " + patient.getAge());
                                    System.out.println("Weight: " + patient.getWeight());
                                    System.out.println("Height: " + patient.getHeight());
                                    System.out.println("Gender: " + patient.getGender());
                                    System.out.println("Address: " + patient.getAddress());
                                } else {
                                    System.out.println("Patient not found.");
                                }
                                break;

                            case 3:
                                System.out.print("Enter patient ID to delete: ");
                                int patientIdToDelete = scanner.nextInt();
                                hospital.deletePatient(patientIdToDelete);
                                System.out.println("Patient deleted successfully.");
                                break;

                            case 4:
                                int anotherbill;
                                do {
                                    System.out.print("Enter patient ID to generate bill: ");
                                    int patientIdForBill = scanner.nextInt();
                                    Patient billpatient = hospital.viewPatient(patientIdForBill);
                                    if (billpatient != null) {
                                        System.out.print("Enter bill amount: ");
                                        double billAmount = scanner.nextDouble();
                                        hospital.generateBill(patientIdForBill, billAmount);
                                        System.out.println("Bill generated successfully.");
                                    } else {
                                        System.out.println("Patient does not exist.");
                                    }
                                    System.out.print("Make another Bill? (1/0)");
                                    anotherbill = scanner.nextInt();
                                } while (anotherbill == 1);
                                break;

                            case 5:
                                List<Bill> bills = hospital.viewBills();
                                if (bills.isEmpty()) {
                                    System.out.println("No bills found.");
                                } else {
                                    System.out.println("List of Bills:");
                                    for (Bill bill : bills) {
                                        System.out.println("Patient ID: " + bill.getPatientId() + ", Amount: $" + bill.getAmount());
                                    }
                                }
                                break;
                        }

                        System.out.print("Update More? (1/0): ");
                        moreupdate = scanner.nextInt();
                    } while (moreupdate == 1);
                } else if (view == 2) {
                    System.out.println("Welcome to Doctors Section");
                    System.out.println("What Do you want to UPDATE!..");
                    System.out.println("1. Add Doctor");
                    System.out.println("2. View Doctors");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            scanner.nextLine();
                            System.out.print("Enter doctor name: ");
                            String doctorName = scanner.nextLine();
                            System.out.print("Enter doctor specialization: ");
                            String specialization = scanner.nextLine();
                            hospital.addDoctor(doctorName, specialization);
                            System.out.println("Doctor added successfully.");
                            break;

                        case 2:
                            List<Doctor> doctors = hospital.viewDoctors();
                            if (doctors.isEmpty()) {
                                System.out.println("No doctors found.");
                            } else {
                                System.out.println("List of Doctors:");
                                for (Doctor doctor : doctors) {
                                    System.out.println("ID: " + doctor.getId() + ", Name: " + doctor.getName() + ", Specialization: " + doctor.getSpecialization());
                                }
                            }
                            break;
                    }
                } else if (view == 3) {
                    System.out.println("Welcome to Appointments Section");
                    System.out.println("1. Make Appointment");
                    System.out.println("2. View Appointments");
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        int anotherapp;
                        do {
                            System.out.print("Enter patient ID: ");
                            int patientIdForAppointment = scanner.nextInt();
                            Patient patient = hospital.viewPatient(patientIdForAppointment);
                            if (patient != null) {
                                System.out.print("Enter doctor ID: ");
                                int doctorIdForAppointment = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Enter appointment date: ");
                                String appointmentDate = scanner.nextLine();
                                hospital.makeAppointment(patientIdForAppointment, doctorIdForAppointment, appointmentDate);
                                System.out.println("Appointment created successfully.");
                            } else {
                                System.out.println("Invalid Patient!");
                            }

                            System.out.print("Make another Appointment? (1/0): ");
                            anotherapp = scanner.nextInt();
                        } while (anotherapp == 1);
                    } else if (choice == 2) {
                        List<Appointment> appointments = hospital.viewAppointment();
                        if (appointments.isEmpty()) {
                            System.out.println("No Appointments found.");
                        } else {
                            System.out.println("List of Appointments:");
                            for (Appointment appoint : appointments) {
                                System.out.println("ID: " + appoint.getAppointmentId() + ", Patient ID: " + appoint.getPatientId()
                                        + ", Doctor ID: " + appoint.getDoctorId() + ", Date: " + appoint.getDate());
                            }
                        }
                    } else {
                        System.out.println("Invalid Choice");
                    }
                }
            } while (view != 4);

            if (view >= 4) {
                scanner.close();
                System.exit(0);
            }
        }
    }
}