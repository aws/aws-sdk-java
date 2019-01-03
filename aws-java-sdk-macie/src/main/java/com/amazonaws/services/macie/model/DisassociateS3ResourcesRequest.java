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
package com.amazonaws.services.macie.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/DisassociateS3Resources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateS3ResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Macie member account whose resources you want to remove from being monitored by Amazon
     * Macie.
     * </p>
     */
    private String memberAccountId;
    /**
     * <p>
     * The S3 resources (buckets or prefixes) that you want to remove from being monitored and classified by Amazon
     * Macie.
     * </p>
     */
    private java.util.List<S3Resource> associatedS3Resources;

    /**
     * <p>
     * The ID of the Amazon Macie member account whose resources you want to remove from being monitored by Amazon
     * Macie.
     * </p>
     * 
     * @param memberAccountId
     *        The ID of the Amazon Macie member account whose resources you want to remove from being monitored by
     *        Amazon Macie.
     */

    public void setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Macie member account whose resources you want to remove from being monitored by Amazon
     * Macie.
     * </p>
     * 
     * @return The ID of the Amazon Macie member account whose resources you want to remove from being monitored by
     *         Amazon Macie.
     */

    public String getMemberAccountId() {
        return this.memberAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Macie member account whose resources you want to remove from being monitored by Amazon
     * Macie.
     * </p>
     * 
     * @param memberAccountId
     *        The ID of the Amazon Macie member account whose resources you want to remove from being monitored by
     *        Amazon Macie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateS3ResourcesRequest withMemberAccountId(String memberAccountId) {
        setMemberAccountId(memberAccountId);
        return this;
    }

    /**
     * <p>
     * The S3 resources (buckets or prefixes) that you want to remove from being monitored and classified by Amazon
     * Macie.
     * </p>
     * 
     * @return The S3 resources (buckets or prefixes) that you want to remove from being monitored and classified by
     *         Amazon Macie.
     */

    public java.util.List<S3Resource> getAssociatedS3Resources() {
        return associatedS3Resources;
    }

    /**
     * <p>
     * The S3 resources (buckets or prefixes) that you want to remove from being monitored and classified by Amazon
     * Macie.
     * </p>
     * 
     * @param associatedS3Resources
     *        The S3 resources (buckets or prefixes) that you want to remove from being monitored and classified by
     *        Amazon Macie.
     */

    public void setAssociatedS3Resources(java.util.Collection<S3Resource> associatedS3Resources) {
        if (associatedS3Resources == null) {
            this.associatedS3Resources = null;
            return;
        }

        this.associatedS3Resources = new java.util.ArrayList<S3Resource>(associatedS3Resources);
    }

    /**
     * <p>
     * The S3 resources (buckets or prefixes) that you want to remove from being monitored and classified by Amazon
     * Macie.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedS3Resources(java.util.Collection)} or
     * {@link #withAssociatedS3Resources(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param associatedS3Resources
     *        The S3 resources (buckets or prefixes) that you want to remove from being monitored and classified by
     *        Amazon Macie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateS3ResourcesRequest withAssociatedS3Resources(S3Resource... associatedS3Resources) {
        if (this.associatedS3Resources == null) {
            setAssociatedS3Resources(new java.util.ArrayList<S3Resource>(associatedS3Resources.length));
        }
        for (S3Resource ele : associatedS3Resources) {
            this.associatedS3Resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The S3 resources (buckets or prefixes) that you want to remove from being monitored and classified by Amazon
     * Macie.
     * </p>
     * 
     * @param associatedS3Resources
     *        The S3 resources (buckets or prefixes) that you want to remove from being monitored and classified by
     *        Amazon Macie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateS3ResourcesRequest withAssociatedS3Resources(java.util.Collection<S3Resource> associatedS3Resources) {
        setAssociatedS3Resources(associatedS3Resources);
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
        if (getMemberAccountId() != null)
            sb.append("MemberAccountId: ").append(getMemberAccountId()).append(",");
        if (getAssociatedS3Resources() != null)
            sb.append("AssociatedS3Resources: ").append(getAssociatedS3Resources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateS3ResourcesRequest == false)
            return false;
        DisassociateS3ResourcesRequest other = (DisassociateS3ResourcesRequest) obj;
        if (other.getMemberAccountId() == null ^ this.getMemberAccountId() == null)
            return false;
        if (other.getMemberAccountId() != null && other.getMemberAccountId().equals(this.getMemberAccountId()) == false)
            return false;
        if (other.getAssociatedS3Resources() == null ^ this.getAssociatedS3Resources() == null)
            return false;
        if (other.getAssociatedS3Resources() != null && other.getAssociatedS3Resources().equals(this.getAssociatedS3Resources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberAccountId() == null) ? 0 : getMemberAccountId().hashCode());
        hashCode = prime * hashCode + ((getAssociatedS3Resources() == null) ? 0 : getAssociatedS3Resources().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateS3ResourcesRequest clone() {
        return (DisassociateS3ResourcesRequest) super.clone();
    }

}
