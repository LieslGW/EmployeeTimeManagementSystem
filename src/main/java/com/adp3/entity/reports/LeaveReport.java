package com.adp3.entity.reports;

import java.io.Serializable;

/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Class Description: LeaveReport
 */

public class LeaveReport implements Serializable {

    private String leaveReportID;
    private String leaveReportDesc;

    private LeaveReport(Builder builder) {
        this.leaveReportID = builder.leaveReportID;
        this.leaveReportDesc = builder.leaveReportDesc;
    }

    private LeaveReport(){}

    public String getLeaveReportID() {
        return leaveReportID;
    }

    public String getLeaveReportDesc() {
        return leaveReportDesc;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "leaveReportID='" + leaveReportID + '\'' +
                   ", leaveReportDesc='" + leaveReportDesc + '\'' +
                '}';
    }

    public static class Builder{
        private String leaveReportID;
        private String leaveReportDesc;

        public Builder setLeaveReportID(String leaveReportID) {
            this.leaveReportID = leaveReportID;
            return this;
        }

        public Builder setLeaveReportDesc(String leaveReportDesc) {
            this.leaveReportDesc = leaveReportDesc;
            return this;
        }

        public Builder copy(LeaveReport leaveReport) {
            this.leaveReportID = leaveReport.leaveReportID;
            this.leaveReportDesc = leaveReport.leaveReportDesc;

            return this;
        }

        public LeaveReport build() {
            return new LeaveReport(this);
        }


    }

}
