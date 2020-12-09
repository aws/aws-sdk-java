/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An entity that defines the scope of audit evidence collected by AWS Audit Manager. An AWS Audit Manager assessment is
 * an implementation of an AWS Audit Manager framework.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/Assessment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Assessment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The AWS account associated with the assessment.
     * </p>
     */
    private AWSAccount awsAccount;
    /**
     * <p>
     * The metadata for the specified assessment.
     * </p>
     */
    private AssessmentMetadata metadata;
    /**
     * <p>
     * The framework from which the assessment was created.
     * </p>
     */
    private AssessmentFramework framework;
    /**
     * <p>
     * The tags associated with the assessment.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the assessment.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the assessment.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assessment withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The AWS account associated with the assessment.
     * </p>
     * 
     * @param awsAccount
     *        The AWS account associated with the assessment.
     */

    public void setAwsAccount(AWSAccount awsAccount) {
        this.awsAccount = awsAccount;
    }

    /**
     * <p>
     * The AWS account associated with the assessment.
     * </p>
     * 
     * @return The AWS account associated with the assessment.
     */

    public AWSAccount getAwsAccount() {
        return this.awsAccount;
    }

    /**
     * <p>
     * The AWS account associated with the assessment.
     * </p>
     * 
     * @param awsAccount
     *        The AWS account associated with the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assessment withAwsAccount(AWSAccount awsAccount) {
        setAwsAccount(awsAccount);
        return this;
    }

    /**
     * <p>
     * The metadata for the specified assessment.
     * </p>
     * 
     * @param metadata
     *        The metadata for the specified assessment.
     */

    public void setMetadata(AssessmentMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata for the specified assessment.
     * </p>
     * 
     * @return The metadata for the specified assessment.
     */

    public AssessmentMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The metadata for the specified assessment.
     * </p>
     * 
     * @param metadata
     *        The metadata for the specified assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assessment withMetadata(AssessmentMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The framework from which the assessment was created.
     * </p>
     * 
     * @param framework
     *        The framework from which the assessment was created.
     */

    public void setFramework(AssessmentFramework framework) {
        this.framework = framework;
    }

    /**
     * <p>
     * The framework from which the assessment was created.
     * </p>
     * 
     * @return The framework from which the assessment was created.
     */

    public AssessmentFramework getFramework() {
        return this.framework;
    }

    /**
     * <p>
     * The framework from which the assessment was created.
     * </p>
     * 
     * @param framework
     *        The framework from which the assessment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assessment withFramework(AssessmentFramework framework) {
        setFramework(framework);
        return this;
    }

    /**
     * <p>
     * The tags associated with the assessment.
     * </p>
     * 
     * @return The tags associated with the assessment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the assessment.
     * </p>
     * 
     * @param tags
     *        The tags associated with the assessment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the assessment.
     * </p>
     * 
     * @param tags
     *        The tags associated with the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assessment withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Assessment#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Assessment addTagsEntry(String key, String value) {
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

    public Assessment clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAwsAccount() != null)
            sb.append("AwsAccount: ").append(getAwsAccount()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getFramework() != null)
            sb.append("Framework: ").append(getFramework()).append(",");
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

        if (obj instanceof Assessment == false)
            return false;
        Assessment other = (Assessment) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAwsAccount() == null ^ this.getAwsAccount() == null)
            return false;
        if (other.getAwsAccount() != null && other.getAwsAccount().equals(this.getAwsAccount()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getFramework() == null ^ this.getFramework() == null)
            return false;
        if (other.getFramework() != null && other.getFramework().equals(this.getFramework()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAwsAccount() == null) ? 0 : getAwsAccount().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getFramework() == null) ? 0 : getFramework().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Assessment clone() {
        try {
            return (Assessment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.AssessmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
