package com.hibernates.student;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
    private String certificate_name;
    private String Duration;

    public String getCertificate_name() {
        return certificate_name;
    }

    public void setCertificate_name(String certificate_name) {
        this.certificate_name = certificate_name;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public Certificate() {
        super();
    }

    public Certificate(String certificate_name, String duration) {
        super();
        this.certificate_name = certificate_name;
        Duration = duration;
    }
}
