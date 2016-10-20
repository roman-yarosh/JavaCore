package module9.practice;

public class Job {
    private int personId;
    private String description;

    public Job (int personId, String description) {
        this.personId = personId;
        this.description = description;
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder("Job{");
        sb.append("personId=").append(personId);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
