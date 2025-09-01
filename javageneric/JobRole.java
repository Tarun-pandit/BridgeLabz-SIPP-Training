/**
 * Abstract class representing a job role.
 */
public abstract class JobRole {
    private String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public abstract String getRoleName();

    @Override
    public String toString() {
        return String.format("%s Candidate: %s", getRoleName(), candidateName);
    }
}
