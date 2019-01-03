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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/AssociateS3Resources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateS3ResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Macie member account whose resources you want to associate with Macie.
     * </p>
     */
    private String memberAccountId;
    /**
     * <p>
     * The S3 resources that you want to associate with Amazon Macie for monitoring and data classification.
     * </p>
     */
    private java.util.List<S3ResourceClassification> s3Resources;

    /**
     * <p>
     * The ID of the Amazon Macie member account whose resources you want to associate with Macie.
     * </p>
     * 
     * @param memberAccountId
     *        The ID of the Amazon Macie member account whose resources you want to associate with Macie.
     */

    public void setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Macie member account whose resources you want to associate with Macie.
     * </p>
     * 
     * @return The ID of the Amazon Macie member account whose resources you want to associate with Macie.
     */

    public String getMemberAccountId() {
        return this.memberAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Macie member account whose resources you want to associate with Macie.
     * </p>
     * 
     * @param memberAccountId
     *        The ID of the Amazon Macie member account whose resources you want to associate with Macie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateS3ResourcesRequest withMemberAccountId(String memberAccountId) {
        setMemberAccountId(memberAccountId);
        return this;
    }

    /**
     * <p>
     * The S3 resources that you want to associate with Amazon Macie for monitoring and data classification.
     * </p>
     * 
     * @return The S3 resources that you want to associate with Amazon Macie for monitoring and data classification.
     */

    public java.util.List<S3ResourceClassification> getS3Resources() {
        return s3Resources;
    }

    /**
     * <p>
     * The S3 resources that you want to associate with Amazon Macie for monitoring and data classification.
     * </p>
     * 
     * @param s3Resources
     *        The S3 resources that you want to associate with Amazon Macie for monitoring and data classification.
     */

    public void setS3Resources(java.util.Collection<S3ResourceClassification> s3Resources) {
        if (s3Resources == null) {
            this.s3Resources = null;
            return;
        }

        this.s3Resources = new java.util.ArrayList<S3ResourceClassification>(s3Resources);
    }

    /**
     * <p>
     * The S3 resources that you want to associate with Amazon Macie for monitoring and data classification.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3Resources(java.util.Collection)} or {@link #withS3Resources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param s3Resources
     *        The S3 resources that you want to associate with Amazon Macie for monitoring and data classification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateS3ResourcesRequest withS3Resources(S3ResourceClassification... s3Resources) {
        if (this.s3Resources == null) {
            setS3Resources(new java.util.ArrayList<S3ResourceClassification>(s3Resources.length));
        }
        for (S3ResourceClassification ele : s3Resources) {
            this.s3Resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The S3 resources that you want to associate with Amazon Macie for monitoring and data classification.
     * </p>
     * 
     * @param s3Resources
     *        The S3 resources that you want to associate with Amazon Macie for monitoring and data classification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateS3ResourcesRequest withS3Resources(java.util.Collection<S3ResourceClassification> s3Resources) {
        setS3Resources(s3Resources);
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
        if (getS3Resources() != null)
            sb.append("S3Resources: ").append(getS3Resources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateS3ResourcesRequest == false)
            return false;
        AssociateS3ResourcesRequest other = (AssociateS3ResourcesRequest) obj;
        if (other.getMemberAccountId() == null ^ this.getMemberAccountId() == null)
            return false;
        if (other.getMemberAccountId() != null && other.getMemberAccountId().equals(this.getMemberAccountId()) == false)
            return false;
        if (other.getS3Resources() == null ^ this.getS3Resources() == null)
            return false;
        if (other.getS3Resources() != null && other.getS3Resources().equals(this.getS3Resources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberAccountId() == null) ? 0 : getMemberAccountId().hashCode());
        hashCode = prime * hashCode + ((getS3Resources() == null) ? 0 : getS3Resources().hashCode());
        return hashCode;
    }

    @Override
    public AssociateS3ResourcesRequest clone() {
        return (AssociateS3ResourcesRequest) super.clone();
    }

}
