import java.util.Objects;

class Candidate {
    private String name;
    private String email;
    private long phoneNo;

    public Candidate(String name, String email, long phoneNo) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Candidate candidate = (Candidate) o;

        return phoneNo == candidate.phoneNo &&
                Objects.equals(email, candidate.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, phoneNo);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Candidate cand1 = new Candidate("Amit Sharma", "amit@email.com", 9876543210L);
        Candidate cand2 = new Candidate("Amit S.", "amit@email.com", 9876543210L);

        // equals() check
        System.out.println("Kya dono candidates duplicate hain? " + cand1.equals(cand2));

        // HashCode check (Dono ka hashcode bhi same aayega)
        System.out.println("Cand1 HashCode: " + cand1.hashCode());
        System.out.println("Cand2 HashCode: " + cand2.hashCode());
    }
}
