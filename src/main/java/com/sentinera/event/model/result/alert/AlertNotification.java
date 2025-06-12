package com.sentinera.event.model.result.alert;

import java.util.Date;

public class AlertNotification {

    private String alert_id;
    private Date alert_date;

    public AlertNotification(String alert_id, Date alert_date) {
        this.alert_id = alert_id;
        this.alert_date = alert_date;
    }

    public String getAlert_id() {
        return alert_id;
    }

    public void setAlert_id(String alert_id) {
        this.alert_id = alert_id;
    }

    public Date getAlert_date() {
        return alert_date;
    }

    public void setAlert_date(Date alert_date) {
        this.alert_date = alert_date;
    }

    public AlertNotification() {
    }
}
