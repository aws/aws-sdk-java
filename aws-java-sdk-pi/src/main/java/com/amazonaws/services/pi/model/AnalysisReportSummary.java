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
 * Retrieves the details of the performance analysis report.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/AnalysisReportSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisReportSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the analysis report.
     * </p>
     */
    private String analysisReportId;
    /**
     * <p>
     * The time you created the analysis report.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The start time of the analysis in the report.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the analysis in the report.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The status of the analysis report.
     * </p>
     */
    private String status;
    /**
     * <p>
     * List of all the tags added to the analysis report.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public AnalysisReportSummary withAnalysisReportId(String analysisReportId) {
        setAnalysisReportId(analysisReportId);
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

    public AnalysisReportSummary withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The start time of the analysis in the report.
     * </p>
     * 
     * @param startTime
     *        The start time of the analysis in the report.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the analysis in the report.
     * </p>
     * 
     * @return The start time of the analysis in the report.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the analysis in the report.
     * </p>
     * 
     * @param startTime
     *        The start time of the analysis in the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisReportSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the analysis in the report.
     * </p>
     * 
     * @param endTime
     *        The end time of the analysis in the report.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the analysis in the report.
     * </p>
     * 
     * @return The end time of the analysis in the report.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the analysis in the report.
     * </p>
     * 
     * @param endTime
     *        The end time of the analysis in the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisReportSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The status of the analysis report.
     * </p>
     * 
     * @param status
     *        The status of the analysis report.
     * @see AnalysisStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the analysis report.
     * </p>
     * 
     * @return The status of the analysis report.
     * @see AnalysisStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the analysis report.
     * </p>
     * 
     * @param status
     *        The status of the analysis report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisStatus
     */

    public AnalysisReportSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the analysis report.
     * </p>
     * 
     * @param status
     *        The status of the analysis report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisStatus
     */

    public AnalysisReportSummary withStatus(AnalysisStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * List of all the tags added to the analysis report.
     * </p>
     * 
     * @return List of all the tags added to the analysis report.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * List of all the tags added to the analysis report.
     * </p>
     * 
     * @param tags
     *        List of all the tags added to the analysis report.
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
     * List of all the tags added to the analysis report.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        List of all the tags added to the analysis report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisReportSummary withTags(Tag... tags) {
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
     * List of all the tags added to the analysis report.
     * </p>
     * 
     * @param tags
     *        List of all the tags added to the analysis report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisReportSummary withTags(java.util.Collection<Tag> tags) {
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
        if (getAnalysisReportId() != null)
            sb.append("AnalysisReportId: ").append(getAnalysisReportId()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof AnalysisReportSummary == false)
            return false;
        AnalysisReportSummary other = (AnalysisReportSummary) obj;
        if (other.getAnalysisReportId() == null ^ this.getAnalysisReportId() == null)
            return false;
        if (other.getAnalysisReportId() != null && other.getAnalysisReportId().equals(this.getAnalysisReportId()) == false)
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

        hashCode = prime * hashCode + ((getAnalysisReportId() == null) ? 0 : getAnalysisReportId().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisReportSummary clone() {
        try {
            return (AnalysisReportSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.AnalysisReportSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
