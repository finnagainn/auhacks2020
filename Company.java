public class Company {
	private String name;
	private String website;
	private String description;
	private String job;
	private String jobReq;

	public Company(String nameIn, String websiteIn, String descriptionIn, String jobIn, String jobReqIn) {
		setName(nameIn);
		setName(websiteIn);
		setDescription(descriptionIn);
		setJob(jobIn);
		setJobReq(jobReqIn);
	}
	public void setName(String nameIn) {
		name = nameIn;
	}
	public String getName() {
		return name;
	}
	public void setWebsite(String websiteIn) {
		website = websiteIn;
	}
	public String getWebsite() {
		return website;
	}
	public void setDescription(String descriptionIn) {
		description = descriptionIn;
	}
	public String getDescription() {
		return description;
	}
	public void setJob(String jobIn) {
		job = jobIn;
	}
	public String getJob() {
		return job;
	}
	public void setJobReq(String jobReqIn) {
		jobReq = jobReqIn;
	}
	public String getJobReq() {
		return jobReq;
	}
}