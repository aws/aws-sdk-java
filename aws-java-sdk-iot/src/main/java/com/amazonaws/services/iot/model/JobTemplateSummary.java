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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about the job template.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobTemplateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     */
    private String jobTemplateArn;
    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     */
    private String jobTemplateId;
    /**
     * <p>
     * A description of the job template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * 
     * @param jobTemplateArn
     *        The ARN of the job template.
     */

    public void setJobTemplateArn(String jobTemplateArn) {
        this.jobTemplateArn = jobTemplateArn;
    }

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * 
     * @return The ARN of the job template.
     */

    public String getJobTemplateArn() {
        return this.jobTemplateArn;
    }

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * 
     * @param jobTemplateArn
     *        The ARN of the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSummary withJobTemplateArn(String jobTemplateArn) {
        setJobTemplateArn(jobTemplateArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     * 
     * @param jobTemplateId
     *        The unique identifier of the job template.
     */

    public void setJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     * 
     * @return The unique identifier of the job template.
     */

    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the job template.
     * </p>
     * 
     * @param jobTemplateId
     *        The unique identifier of the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSummary withJobTemplateId(String jobTemplateId) {
        setJobTemplateId(jobTemplateId);
        return this;
    }

    /**
     * <p>
     * A description of the job template.
     * </p>
     * 
     * @param description
     *        A description of the job template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the job template.
     * </p>
     * 
     * @return A description of the job template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the job template.
     * </p>
     * 
     * @param description
     *        A description of the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in seconds since the epoch, when the job template was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     * 
     * @return The time, in seconds since the epoch, when the job template was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job template was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in seconds since the epoch, when the job template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplateSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getJobTemplateArn() != null)
            sb.append("JobTemplateArn: ").append(getJobTemplateArn()).append(",");
        if (getJobTemplateId() != null)
            sb.append("JobTemplateId: ").append(getJobTemplateId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobTemplateSummary == false)
            return false;
        JobTemplateSummary other = (JobTemplateSummary) obj;
        if (other.getJobTemplateArn() == null ^ this.getJobTemplateArn() == null)
            return false;
        if (other.getJobTemplateArn() != null && other.getJobTemplateArn().equals(this.getJobTemplateArn()) == false)
            return false;
        if (other.getJobTemplateId() == null ^ this.getJobTemplateId() == null)
            return false;
        if (other.getJobTemplateId() != null && other.getJobTemplateId().equals(this.getJobTemplateId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobTemplateArn() == null) ? 0 : getJobTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getJobTemplateId() == null) ? 0 : getJobTemplateId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public JobTemplateSummary clone() {
        try {
            return (JobTemplateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.JobTemplateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
