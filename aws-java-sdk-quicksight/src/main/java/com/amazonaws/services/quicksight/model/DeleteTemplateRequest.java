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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DeleteTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're deleting.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * An ID for the template you want to delete.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * Specifies the version of the template that you want to delete. If you don't provide a version number,
     * <code>DeleteTemplate</code> deletes all versions of the template.
     * </p>
     */
    private Long versionNumber;

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're deleting.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the template that you're deleting.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're deleting.
     * </p>
     * 
     * @return The ID of the AWS account that contains the template that you're deleting.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're deleting.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the template that you're deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTemplateRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * An ID for the template you want to delete.
     * </p>
     * 
     * @param templateId
     *        An ID for the template you want to delete.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * An ID for the template you want to delete.
     * </p>
     * 
     * @return An ID for the template you want to delete.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * An ID for the template you want to delete.
     * </p>
     * 
     * @param templateId
     *        An ID for the template you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTemplateRequest withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * Specifies the version of the template that you want to delete. If you don't provide a version number,
     * <code>DeleteTemplate</code> deletes all versions of the template.
     * </p>
     * 
     * @param versionNumber
     *        Specifies the version of the template that you want to delete. If you don't provide a version number,
     *        <code>DeleteTemplate</code> deletes all versions of the template.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * Specifies the version of the template that you want to delete. If you don't provide a version number,
     * <code>DeleteTemplate</code> deletes all versions of the template.
     * </p>
     * 
     * @return Specifies the version of the template that you want to delete. If you don't provide a version number,
     *         <code>DeleteTemplate</code> deletes all versions of the template.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * Specifies the version of the template that you want to delete. If you don't provide a version number,
     * <code>DeleteTemplate</code> deletes all versions of the template.
     * </p>
     * 
     * @param versionNumber
     *        Specifies the version of the template that you want to delete. If you don't provide a version number,
     *        <code>DeleteTemplate</code> deletes all versions of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTemplateRequest withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTemplateRequest == false)
            return false;
        DeleteTemplateRequest other = (DeleteTemplateRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTemplateRequest clone() {
        return (DeleteTemplateRequest) super.clone();
    }

}
