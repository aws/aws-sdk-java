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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Retrieves the summary of the performance analysis report created for a time period.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/AnalysisReport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisReport implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the analysis report.
     * </p>
     */
    private String analysisReportId;
    /**
     * <p>
     * The unique identifier of the analysis report.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid values
     * are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RDS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOCDB</code>
     * </p>
     * </li>
     * </ul>
     */
    private String serviceType;
    /**
     * <p>
     * The time you created the analysis report.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The analysis start time in the report.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The analysis end time in the report.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The status of the created analysis report.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The list of identified insights in the analysis report.
     * </p>
     */
    private java.util.List<Insight> insights;

    /**
     * <p>
     * The name of the analysis report.
     * </p>
     * 
     * @param analysisReportId
     *        The name of the analysis report.
     */

    public void setAnalysisReportId(String analysisReportId) {
        this.analysisReportId = analysisReportId;
    }

    /**
     * <p>
     * The name of the analysis report.
     * </p>
     * 
     * @return The name of the analysis report.
     */

    public String getAnalysisReportId() {
        return this.analysisReportId;
    }

    /**
     * <p>
     * The name of the analysis report.
     * </p>
     * 
     * @param analysisReportId
     *        The name of the analysis report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisReport withAnalysisReportId(String analysisReportId) {
        setAnalysisReportId(analysisReportId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the analysis report.
     * </p>
     * 
     * @param identifier
     *        The unique identifier of the analysis report.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The unique identifier of the analysis report.
     * </p>
     * 
     * @return The unique identifier of the analysis report.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The unique identifier of the analysis report.
     * </p>
     * 
     * @param identifier
     *        The unique identifier of the analysis report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisReport withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid values
     * are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RDS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOCDB</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param serviceType
     *        List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid
     *        values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RDS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOCDB</code>
     *        </p>
     *        </li>
     * @see ServiceType
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid values
     * are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RDS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOCDB</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid
     *         values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RDS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DOCDB</code>
     *         </p>
     *         </li>
     * @see ServiceType
     */

    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * <p>
     * List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid values
     * are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RDS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOCDB</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param serviceType
     *        List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid
     *        values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RDS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOCDB</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public AnalysisReport withServiceType(String serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid values
     * are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RDS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOCDB</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param serviceType
     *        List the tags for the Amazon Web Services service for which Performance Insights returns metrics. Valid
     *        values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RDS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOCDB</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public AnalysisReport withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    /**
     * <p>
     * The time you created the analysis report.
     * </p>
     * 
     * @param createTime
     *        The time you created the analysis report.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time you created the analysis report.
     * </p>
     * 
     * @return The time you created the analysis report.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time you created the analysis report.
     * </p>
     * 
     * @param createTime
     *        The time you created the analysis report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisReport withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The analysis start time in the report.
     * </p>
     * 
     * @param startTime
     *        The analysis start time in the report.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The analysis start time in the report.
     * </p>
     * 
     * @return The analysis start time in the report.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The analysis start time in the report.
     * </p>
     * 
     * @param startTime
     *        The analysis start time in the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisReport withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The analysis end time in the report.
     * </p>
     * 
     * @param endTime
     *        The analysis end time in the report.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The analysis end time in the report.
     * </p>
     * 
     * @return The analysis end time in the report.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The analysis end time in the report.
     * </p>
     * 
     * @param endTime
     *        The analysis end time in the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisReport withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The status of the created analysis report.
     * </p>
     * 
     * @param status
     *        The status of the created analysis report.
     * @see AnalysisStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the created analysis report.
     * </p>
     * 
     * @return The status of the created analysis report.
     * @see AnalysisStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the created analysis report.
     * </p>
     * 
     * @param status
     *        The status of the created analysis report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisStatus
     */

    public AnalysisReport withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the created analysis report.
     * </p>
     * 
     * @param status
     *        The status of the created analysis report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisStatus
     */

    public AnalysisReport withStatus(AnalysisStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The list of identified insights in the analysis report.
     * </p>
     * 
     * @return The list of identified insights in the analysis report.
     */

    public java.util.List<Insight> getInsights() {
        return insights;
    }

    /**
     * <p>
     * The list of identified insights in the analysis report.
     * </p>
     * 
     * @param insights
     *        The list of identified insights in the analysis report.
     */

    public void setInsights(java.util.Collection<Insight> insights) {
        if (insights == null) {
            this.insights = null;
            return;
        }

        this.insights = new java.util.ArrayList<Insight>(insights);
    }

    /**
     * <p>
     * The list of identified insights in the analysis report.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsights(java.util.Collection)} or {@link #withInsights(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param insights
     *        The list of identified insights in the analysis report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisReport withInsights(Insight... insights) {
        if (this.insights == null) {
            setInsights(new java.util.ArrayList<Insight>(insights.length));
        }
        for (Insight ele : insights) {
            this.insights.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of identified insights in the analysis report.
     * </p>
     * 
     * @param insights
     *        The list of identified insights in the analysis report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisReport withInsights(java.util.Collection<Insight> insights) {
        setInsights(insights);
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
        if (getAnalysisReportId() != null)
            sb.append("AnalysisReportId: ").append(getAnalysisReportId()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getInsights() != null)
            sb.append("Insights: ").append(getInsights());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisReport == false)
            return false;
        AnalysisReport other = (AnalysisReport) obj;
        if (other.getAnalysisReportId() == null ^ this.getAnalysisReportId() == null)
            return false;
        if (other.getAnalysisReportId() != null && other.getAnalysisReportId().equals(this.getAnalysisReportId()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getInsights() == null ^ this.getInsights() == null)
            return false;
        if (other.getInsights() != null && other.getInsights().equals(this.getInsights()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalysisReportId() == null) ? 0 : getAnalysisReportId().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getInsights() == null) ? 0 : getInsights().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisReport clone() {
        try {
            return (AnalysisReport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.AnalysisReportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
