/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides summary information for a work team.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LabelingJobForWorkteamSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelingJobForWorkteamSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the labeling job that the work team is assigned to.
     * </p>
     */
    private String labelingJobName;
    /**
     * <p>
     * A unique identifier for a labeling job. You can use this to refer to a specific labeling job.
     * </p>
     */
    private String jobReferenceCode;
    /** <p/> */
    private String workRequesterAccountId;
    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Provides information about the progress of a labeling job.
     * </p>
     */
    private LabelCountersForWorkteam labelCounters;

    /**
     * <p>
     * The name of the labeling job that the work team is assigned to.
     * </p>
     * 
     * @param labelingJobName
     *        The name of the labeling job that the work team is assigned to.
     */

    public void setLabelingJobName(String labelingJobName) {
        this.labelingJobName = labelingJobName;
    }

    /**
     * <p>
     * The name of the labeling job that the work team is assigned to.
     * </p>
     * 
     * @return The name of the labeling job that the work team is assigned to.
     */

    public String getLabelingJobName() {
        return this.labelingJobName;
    }

    /**
     * <p>
     * The name of the labeling job that the work team is assigned to.
     * </p>
     * 
     * @param labelingJobName
     *        The name of the labeling job that the work team is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobForWorkteamSummary withLabelingJobName(String labelingJobName) {
        setLabelingJobName(labelingJobName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for a labeling job. You can use this to refer to a specific labeling job.
     * </p>
     * 
     * @param jobReferenceCode
     *        A unique identifier for a labeling job. You can use this to refer to a specific labeling job.
     */

    public void setJobReferenceCode(String jobReferenceCode) {
        this.jobReferenceCode = jobReferenceCode;
    }

    /**
     * <p>
     * A unique identifier for a labeling job. You can use this to refer to a specific labeling job.
     * </p>
     * 
     * @return A unique identifier for a labeling job. You can use this to refer to a specific labeling job.
     */

    public String getJobReferenceCode() {
        return this.jobReferenceCode;
    }

    /**
     * <p>
     * A unique identifier for a labeling job. You can use this to refer to a specific labeling job.
     * </p>
     * 
     * @param jobReferenceCode
     *        A unique identifier for a labeling job. You can use this to refer to a specific labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobForWorkteamSummary withJobReferenceCode(String jobReferenceCode) {
        setJobReferenceCode(jobReferenceCode);
        return this;
    }

    /**
     * <p/>
     * 
     * @param workRequesterAccountId
     */

    public void setWorkRequesterAccountId(String workRequesterAccountId) {
        this.workRequesterAccountId = workRequesterAccountId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getWorkRequesterAccountId() {
        return this.workRequesterAccountId;
    }

    /**
     * <p/>
     * 
     * @param workRequesterAccountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobForWorkteamSummary withWorkRequesterAccountId(String workRequesterAccountId) {
        setWorkRequesterAccountId(workRequesterAccountId);
        return this;
    }

    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the labeling job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     * 
     * @return The date and time that the labeling job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the labeling job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobForWorkteamSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Provides information about the progress of a labeling job.
     * </p>
     * 
     * @param labelCounters
     *        Provides information about the progress of a labeling job.
     */

    public void setLabelCounters(LabelCountersForWorkteam labelCounters) {
        this.labelCounters = labelCounters;
    }

    /**
     * <p>
     * Provides information about the progress of a labeling job.
     * </p>
     * 
     * @return Provides information about the progress of a labeling job.
     */

    public LabelCountersForWorkteam getLabelCounters() {
        return this.labelCounters;
    }

    /**
     * <p>
     * Provides information about the progress of a labeling job.
     * </p>
     * 
     * @param labelCounters
     *        Provides information about the progress of a labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobForWorkteamSummary withLabelCounters(LabelCountersForWorkteam labelCounters) {
        setLabelCounters(labelCounters);
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
        if (getLabelingJobName() != null)
            sb.append("LabelingJobName: ").append(getLabelingJobName()).append(",");
        if (getJobReferenceCode() != null)
            sb.append("JobReferenceCode: ").append(getJobReferenceCode()).append(",");
        if (getWorkRequesterAccountId() != null)
            sb.append("WorkRequesterAccountId: ").append(getWorkRequesterAccountId()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLabelCounters() != null)
            sb.append("LabelCounters: ").append(getLabelCounters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobForWorkteamSummary == false)
            return false;
        LabelingJobForWorkteamSummary other = (LabelingJobForWorkteamSummary) obj;
        if (other.getLabelingJobName() == null ^ this.getLabelingJobName() == null)
            return false;
        if (other.getLabelingJobName() != null && other.getLabelingJobName().equals(this.getLabelingJobName()) == false)
            return false;
        if (other.getJobReferenceCode() == null ^ this.getJobReferenceCode() == null)
            return false;
        if (other.getJobReferenceCode() != null && other.getJobReferenceCode().equals(this.getJobReferenceCode()) == false)
            return false;
        if (other.getWorkRequesterAccountId() == null ^ this.getWorkRequesterAccountId() == null)
            return false;
        if (other.getWorkRequesterAccountId() != null && other.getWorkRequesterAccountId().equals(this.getWorkRequesterAccountId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLabelCounters() == null ^ this.getLabelCounters() == null)
            return false;
        if (other.getLabelCounters() != null && other.getLabelCounters().equals(this.getLabelCounters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelingJobName() == null) ? 0 : getLabelingJobName().hashCode());
        hashCode = prime * hashCode + ((getJobReferenceCode() == null) ? 0 : getJobReferenceCode().hashCode());
        hashCode = prime * hashCode + ((getWorkRequesterAccountId() == null) ? 0 : getWorkRequesterAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLabelCounters() == null) ? 0 : getLabelCounters().hashCode());
        return hashCode;
    }

    @Override
    public LabelingJobForWorkteamSummary clone() {
        try {
            return (LabelingJobForWorkteamSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LabelingJobForWorkteamSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
