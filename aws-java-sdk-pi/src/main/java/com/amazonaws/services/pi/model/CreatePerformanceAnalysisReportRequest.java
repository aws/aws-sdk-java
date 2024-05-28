/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/CreatePerformanceAnalysisReport" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePerformanceAnalysisReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     * <code>RDS</code>.
     * </p>
     */
    private String serviceType;
    /**
     * <p>
     * An immutable, Amazon Web Services Region-unique identifier for a data source. Performance Insights gathers
     * metrics from this data source.
     * </p>
     * <p>
     * To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value. For example,
     * specify <code>db-ADECBTYHKTSAUMUZQYPDS2GW4A</code>.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The start time defined for the analysis report.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time defined for the analysis report.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The metadata assigned to the analysis report consisting of a key-value pair.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     * <code>RDS</code>.
     * </p>
     * 
     * @param serviceType
     *        The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     *        <code>RDS</code>.
     * @see ServiceType
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     * <code>RDS</code>.
     * </p>
     * 
     * @return The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     *         <code>RDS</code>.
     * @see ServiceType
     */

    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     * <code>RDS</code>.
     * </p>
     * 
     * @param serviceType
     *        The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     *        <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public CreatePerformanceAnalysisReportRequest withServiceType(String serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     * <code>RDS</code>.
     * </p>
     * 
     * @param serviceType
     *        The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     *        <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public CreatePerformanceAnalysisReportRequest withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    /**
     * <p>
     * An immutable, Amazon Web Services Region-unique identifier for a data source. Performance Insights gathers
     * metrics from this data source.
     * </p>
     * <p>
     * To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value. For example,
     * specify <code>db-ADECBTYHKTSAUMUZQYPDS2GW4A</code>.
     * </p>
     * 
     * @param identifier
     *        An immutable, Amazon Web Services Region-unique identifier for a data source. Performance Insights gathers
     *        metrics from this data source.</p>
     *        <p>
     *        To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value. For
     *        example, specify <code>db-ADECBTYHKTSAUMUZQYPDS2GW4A</code>.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * An immutable, Amazon Web Services Region-unique identifier for a data source. Performance Insights gathers
     * metrics from this data source.
     * </p>
     * <p>
     * To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value. For example,
     * specify <code>db-ADECBTYHKTSAUMUZQYPDS2GW4A</code>.
     * </p>
     * 
     * @return An immutable, Amazon Web Services Region-unique identifier for a data source. Performance Insights
     *         gathers metrics from this data source.</p>
     *         <p>
     *         To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value. For
     *         example, specify <code>db-ADECBTYHKTSAUMUZQYPDS2GW4A</code>.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * An immutable, Amazon Web Services Region-unique identifier for a data source. Performance Insights gathers
     * metrics from this data source.
     * </p>
     * <p>
     * To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value. For example,
     * specify <code>db-ADECBTYHKTSAUMUZQYPDS2GW4A</code>.
     * </p>
     * 
     * @param identifier
     *        An immutable, Amazon Web Services Region-unique identifier for a data source. Performance Insights gathers
     *        metrics from this data source.</p>
     *        <p>
     *        To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value. For
     *        example, specify <code>db-ADECBTYHKTSAUMUZQYPDS2GW4A</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePerformanceAnalysisReportRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The start time defined for the analysis report.
     * </p>
     * 
     * @param startTime
     *        The start time defined for the analysis report.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time defined for the analysis report.
     * </p>
     * 
     * @return The start time defined for the analysis report.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time defined for the analysis report.
     * </p>
     * 
     * @param startTime
     *        The start time defined for the analysis report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePerformanceAnalysisReportRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time defined for the analysis report.
     * </p>
     * 
     * @param endTime
     *        The end time defined for the analysis report.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time defined for the analysis report.
     * </p>
     * 
     * @return The end time defined for the analysis report.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time defined for the analysis report.
     * </p>
     * 
     * @param endTime
     *        The end time defined for the analysis report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePerformanceAnalysisReportRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The metadata assigned to the analysis report consisting of a key-value pair.
     * </p>
     * 
     * @return The metadata assigned to the analysis report consisting of a key-value pair.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata assigned to the analysis report consisting of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The metadata assigned to the analysis report consisting of a key-value pair.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The metadata assigned to the analysis report consisting of a key-value pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The metadata assigned to the analysis report consisting of a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePerformanceAnalysisReportRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata assigned to the analysis report consisting of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The metadata assigned to the analysis report consisting of a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePerformanceAnalysisReportRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePerformanceAnalysisReportRequest == false)
            return false;
        CreatePerformanceAnalysisReportRequest other = (CreatePerformanceAnalysisReportRequest) obj;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePerformanceAnalysisReportRequest clone() {
        return (CreatePerformanceAnalysisReportRequest) super.clone();
    }

}
