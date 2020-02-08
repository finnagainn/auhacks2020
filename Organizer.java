public class Organizer {

private String name;
private String organization;
private String title;
private String phoneNumber;

public Organizer(String titleIn, String nameIn, String organizationIn, String phoneNumberIn){
name = nameIn;
title = titleIn;
organization = organizationIn;
phoneNumber = phoneNumberIn;
}

public String getName() {
return name;
}

public String getOrganization() {
return organization;
}

public String getTitle() {
return title;
}

public String getPhoneNumber() {
return phoneNumber;
}

public void setName(String nameIn) {
name = nameIn;
}

public void setTitle(String titleIn) {
title = titleIn;
}

public void setPhoneNumber(String phoneNumberIn) {
phoneNumber = phoneNumberIn;
}

public void setOrganization(String organizationIn) {
organization = organizationIn;
}
}