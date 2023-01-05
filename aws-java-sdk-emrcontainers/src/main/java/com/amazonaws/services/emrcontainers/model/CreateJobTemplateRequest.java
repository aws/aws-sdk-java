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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CreateJobTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The specified name of the job template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The client token of the job template.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The job template data which holds values of StartJobRun API request.
     * </p>
     */
    private JobTemplateData jobTemplateData;
    /**
     * <p>
     * The tags that are associated with the job template.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The KMS key ARN used to encrypt the job template.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The specified name of the job template.
     * </p>
     * 
     * @param name
     *        The specified name of the job template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The specified name of the job template.
     * </p>
     * 
     * @return The specified name of the job template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The specified name of the job template.
     * </p>
     * 
     * @param name
     *        The specified name of the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The client token of the job template.
     * </p>
     * 
     * @param clientToken
     *        The client token of the job template.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token of the job template.
     * </p>
     * 
     * @return The client token of the job template.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token of the job template.
     * </p>
     * 
     * @param clientToken
     *        The client token of the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public CreateJobTemplateRequest withJobTemplateData(JobTemplateData jobTemplateData) {
        setJobTemplateData(jobTemplateData);
        return this;
    }

    /**
     * <p>
     * The tags that are associated with the job template.
     * </p>
     * 
     * @return The tags that are associated with the job template.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that are associated with the job template.
     * </p>
     * 
     * @param tags
     *        The tags that are associated with the job template.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags that are associated with the job template.
     * </p>
     * 
     * @param tags
     *        The tags that are associated with the job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateJobTemplateRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateRequest addTagsEntry(String key, String value) {
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

    public CreateJobTemplateRequest clearTagsEntries() {
        this.tags = null;
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

    public CreateJobTemplateRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getJobTemplateData() != null)
            sb.append("JobTemplateData: ").append(getJobTemplateData()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobTemplateRequest == false)
            return false;
        CreateJobTemplateRequest other = (CreateJobTemplateRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getJobTemplateData() == null ^ this.getJobTemplateData() == null)
            return false;
        if (other.getJobTemplateData() != null && other.getJobTemplateData().equals(this.getJobTemplateData()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getJobTemplateData() == null) ? 0 : getJobTemplateData().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobTemplateRequest clone() {
        return (CreateJobTemplateRequest) super.clone();
    }

}
