/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about potential recommendations that might be created from the analysis of profiling data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/FindingsReportSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingsReportSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The universally unique identifier (UUID) of the recommendation report.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The end time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601
     * format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date profileEndTime;
    /**
     * <p>
     * The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For
     * example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date profileStartTime;
    /**
     * <p>
     * The name of the profiling group that is associated with the analysis data.
     * </p>
     */
    private String profilingGroupName;
    /**
     * <p>
     * The total number of different recommendations that were found by the analysis.
     * </p>
     */
    private Integer totalNumberOfFindings;

    /**
     * <p>
     * The universally unique identifier (UUID) of the recommendation report.
     * </p>
     * 
     * @param id
     *        The universally unique identifier (UUID) of the recommendation report.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the recommendation report.
     * </p>
     * 
     * @return The universally unique identifier (UUID) of the recommendation report.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the recommendation report.
     * </p>
     * 
     * @param id
     *        The universally unique identifier (UUID) of the recommendation report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingsReportSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The end time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601
     * format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param profileEndTime
     *        The end time of the period during which the metric is flagged as anomalous. This is specified using the
     *        ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02
     *        PM UTC.
     */

    public void setProfileEndTime(java.util.Date profileEndTime) {
        this.profileEndTime = profileEndTime;
    }

    /**
     * <p>
     * The end time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601
     * format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @return The end time of the period during which the metric is flagged as anomalous. This is specified using the
     *         ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02
     *         PM UTC.
     */

    public java.util.Date getProfileEndTime() {
        return this.profileEndTime;
    }

    /**
     * <p>
     * The end time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601
     * format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param profileEndTime
     *        The end time of the period during which the metric is flagged as anomalous. This is specified using the
     *        ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02
     *        PM UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingsReportSummary withProfileEndTime(java.util.Date profileEndTime) {
        setProfileEndTime(profileEndTime);
        return this;
    }

    /**
     * <p>
     * The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For
     * example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param profileStartTime
     *        The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For
     *        example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public void setProfileStartTime(java.util.Date profileStartTime) {
        this.profileStartTime = profileStartTime;
    }

    /**
     * <p>
     * The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For
     * example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @return The start time of the profile the analysis data is about. This is specified using the ISO 8601 format.
     *         For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public java.util.Date getProfileStartTime() {
        return this.profileStartTime;
    }

    /**
     * <p>
     * The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For
     * example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param profileStartTime
     *        The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For
     *        example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingsReportSummary withProfileStartTime(java.util.Date profileStartTime) {
        setProfileStartTime(profileStartTime);
        return this;
    }

    /**
     * <p>
     * The name of the profiling group that is associated with the analysis data.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group that is associated with the analysis data.
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group that is associated with the analysis data.
     * </p>
     * 
     * @return The name of the profiling group that is associated with the analysis data.
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group that is associated with the analysis data.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group that is associated with the analysis data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingsReportSummary withProfilingGroupName(String profilingGroupName) {
        setProfilingGroupName(profilingGroupName);
        return this;
    }

    /**
     * <p>
     * The total number of different recommendations that were found by the analysis.
     * </p>
     * 
     * @param totalNumberOfFindings
     *        The total number of different recommendations that were found by the analysis.
     */

    public void setTotalNumberOfFindings(Integer totalNumberOfFindings) {
        this.totalNumberOfFindings = totalNumberOfFindings;
    }

    /**
     * <p>
     * The total number of different recommendations that were found by the analysis.
     * </p>
     * 
     * @return The total number of different recommendations that were found by the analysis.
     */

    public Integer getTotalNumberOfFindings() {
        return this.totalNumberOfFindings;
    }

    /**
     * <p>
     * The total number of different recommendations that were found by the analysis.
     * </p>
     * 
     * @param totalNumberOfFindings
     *        The total number of different recommendations that were found by the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingsReportSummary withTotalNumberOfFindings(Integer totalNumberOfFindings) {
        setTotalNumberOfFindings(totalNumberOfFindings);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getProfileEndTime() != null)
            sb.append("ProfileEndTime: ").append(getProfileEndTime()).append(",");
        if (getProfileStartTime() != null)
            sb.append("ProfileStartTime: ").append(getProfileStartTime()).append(",");
        if (getProfilingGroupName() != null)
            sb.append("ProfilingGroupName: ").append(getProfilingGroupName()).append(",");
        if (getTotalNumberOfFindings() != null)
            sb.append("TotalNumberOfFindings: ").append(getTotalNumberOfFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingsReportSummary == false)
            return false;
        FindingsReportSummary other = (FindingsReportSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getProfileEndTime() == null ^ this.getProfileEndTime() == null)
            return false;
        if (other.getProfileEndTime() != null && other.getProfileEndTime().equals(this.getProfileEndTime()) == false)
            return false;
        if (other.getProfileStartTime() == null ^ this.getProfileStartTime() == null)
            return false;
        if (other.getProfileStartTime() != null && other.getProfileStartTime().equals(this.getProfileStartTime()) == false)
            return false;
        if (other.getProfilingGroupName() == null ^ this.getProfilingGroupName() == null)
            return false;
        if (other.getProfilingGroupName() != null && other.getProfilingGroupName().equals(this.getProfilingGroupName()) == false)
            return false;
        if (other.getTotalNumberOfFindings() == null ^ this.getTotalNumberOfFindings() == null)
            return false;
        if (other.getTotalNumberOfFindings() != null && other.getTotalNumberOfFindings().equals(this.getTotalNumberOfFindings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getProfileEndTime() == null) ? 0 : getProfileEndTime().hashCode());
        hashCode = prime * hashCode + ((getProfileStartTime() == null) ? 0 : getProfileStartTime().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupName() == null) ? 0 : getProfilingGroupName().hashCode());
        hashCode = prime * hashCode + ((getTotalNumberOfFindings() == null) ? 0 : getTotalNumberOfFindings().hashCode());
        return hashCode;
    }

    @Override
    public FindingsReportSummary clone() {
        try {
            return (FindingsReportSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.FindingsReportSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
