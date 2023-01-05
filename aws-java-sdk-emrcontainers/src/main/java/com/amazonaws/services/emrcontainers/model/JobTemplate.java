/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This entity describes a job template. Job template stores values of StartJobRun API request in a template and can be
 * used to start a job run. Job template allows two use cases: avoid repeating recurring StartJobRun API request values,
 * enforcing certain values in StartJobRun API request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/JobTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the job template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the job template.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN of the job template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time when the job template was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user who created the job template.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The tags assigned to the job template.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The job template data which holds values of StartJobRun API request.
     * </p>
     */
    private JobTemplateData jobTemplateData;
    /**
     * <p>
     * The KMS key ARN used to encrypt the job template.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The error message in case the decryption of job template fails.
     * </p>
     */
    private String decryptionError;

    /**
     * <p>
     * The name of the job template.
     * </p>
     * 
     * @param name
     *        The name of the job template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the job template.
     * </p>
     * 
     * @return The name of the job template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the job template.
     * </p>
     * 
     * @param name
     *        The name of the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the job template.
     * </p>
     * 
     * @param id
     *        The ID of the job template.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the job template.
     * </p>
     * 
     * @return The ID of the job template.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the job template.
     * </p>
     * 
     * @param id
     *        The ID of the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * 
     * @param arn
     *        The ARN of the job template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * 
     * @return The ARN of the job template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the job template.
     * </p>
     * 
     * @param arn
     *        The ARN of the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time when the job template was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the job template was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the job template was created.
     * </p>
     * 
     * @return The date and time when the job template was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the job template was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the job template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user who created the job template.
     * </p>
     * 
     * @param createdBy
     *        The user who created the job template.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user who created the job template.
     * </p>
     * 
     * @return The user who created the job template.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user who created the job template.
     * </p>
     * 
     * @param createdBy
     *        The user who created the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the job template.
     * </p>
     * 
     * @return The tags assigned to the job template.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the job template.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the job template.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the job template.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see JobTemplate#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The job template data which holds values of StartJobRun API request.
     * </p>
     * 
     * @param jobTemplateData
     *        The job template data which holds values of StartJobRun API request.
     */

    public void setJobTemplateData(JobTemplateData jobTemplateData) {
        this.jobTemplateData = jobTemplateData;
    }

    /**
     * <p>
     * The job template data which holds values of StartJobRun API request.
     * </p>
     * 
     * @return The job template data which holds values of StartJobRun API request.
     */

    public JobTemplateData getJobTemplateData() {
        return this.jobTemplateData;
    }

    /**
     * <p>
     * The job template data which holds values of StartJobRun API request.
     * </p>
     * 
     * @param jobTemplateData
     *        The job template data which holds values of StartJobRun API request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withJobTemplateData(JobTemplateData jobTemplateData) {
        setJobTemplateData(jobTemplateData);
        return this;
    }

    /**
     * <p>
     * The KMS key ARN used to encrypt the job template.
     * </p>
     * 
     * @param kmsKeyArn
     *        The KMS key ARN used to encrypt the job template.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The KMS key ARN used to encrypt the job template.
     * </p>
     * 
     * @return The KMS key ARN used to encrypt the job template.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The KMS key ARN used to encrypt the job template.
     * </p>
     * 
     * @param kmsKeyArn
     *        The KMS key ARN used to encrypt the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The error message in case the decryption of job template fails.
     * </p>
     * 
     * @param decryptionError
     *        The error message in case the decryption of job template fails.
     */

    public void setDecryptionError(String decryptionError) {
        this.decryptionError = decryptionError;
    }

    /**
     * <p>
     * The error message in case the decryption of job template fails.
     * </p>
     * 
     * @return The error message in case the decryption of job template fails.
     */

    public String getDecryptionError() {
        return this.decryptionError;
    }

    /**
     * <p>
     * The error message in case the decryption of job template fails.
     * </p>
     * 
     * @param decryptionError
     *        The error message in case the decryption of job template fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobTemplate withDecryptionError(String decryptionError) {
        setDecryptionError(decryptionError);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getJobTemplateData() != null)
            sb.append("JobTemplateData: ").append(getJobTemplateData()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getDecryptionError() != null)
            sb.append("DecryptionError: ").append(getDecryptionError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobTemplate == false)
            return false;
        JobTemplate other = (JobTemplate) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getJobTemplateData() == null ^ this.getJobTemplateData() == null)
            return false;
        if (other.getJobTemplateData() != null && other.getJobTemplateData().equals(this.getJobTemplateData()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getDecryptionError() == null ^ this.getDecryptionError() == null)
            return false;
        if (other.getDecryptionError() != null && other.getDecryptionError().equals(this.getDecryptionError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getJobTemplateData() == null) ? 0 : getJobTemplateData().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getDecryptionError() == null) ? 0 : getDecryptionError().hashCode());
        return hashCode;
    }

    @Override
    public JobTemplate clone() {
        try {
            return (JobTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.JobTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
