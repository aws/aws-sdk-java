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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/UpdateS3Resources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateS3ResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS ID of the Amazon Macie member account whose S3 resources' classification types you want to update.
     * </p>
     */
    private String memberAccountId;
    /**
     * <p>
     * The S3 resources whose classification types you want to update.
     * </p>
     */
    private java.util.List<S3ResourceClassificationUpdate> s3ResourcesUpdate;

    /**
     * <p>
     * The AWS ID of the Amazon Macie member account whose S3 resources' classification types you want to update.
     * </p>
     * 
     * @param memberAccountId
     *        The AWS ID of the Amazon Macie member account whose S3 resources' classification types you want to update.
     */

    public void setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    /**
     * <p>
     * The AWS ID of the Amazon Macie member account whose S3 resources' classification types you want to update.
     * </p>
     * 
     * @return The AWS ID of the Amazon Macie member account whose S3 resources' classification types you want to
     *         update.
     */

    public String getMemberAccountId() {
        return this.memberAccountId;
    }

    /**
     * <p>
     * The AWS ID of the Amazon Macie member account whose S3 resources' classification types you want to update.
     * </p>
     * 
     * @param memberAccountId
     *        The AWS ID of the Amazon Macie member account whose S3 resources' classification types you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateS3ResourcesRequest withMemberAccountId(String memberAccountId) {
        setMemberAccountId(memberAccountId);
        return this;
    }

    /**
     * <p>
     * The S3 resources whose classification types you want to update.
     * </p>
     * 
     * @return The S3 resources whose classification types you want to update.
     */

    public java.util.List<S3ResourceClassificationUpdate> getS3ResourcesUpdate() {
        return s3ResourcesUpdate;
    }

    /**
     * <p>
     * The S3 resources whose classification types you want to update.
     * </p>
     * 
     * @param s3ResourcesUpdate
     *        The S3 resources whose classification types you want to update.
     */

    public void setS3ResourcesUpdate(java.util.Collection<S3ResourceClassificationUpdate> s3ResourcesUpdate) {
        if (s3ResourcesUpdate == null) {
            this.s3ResourcesUpdate = null;
            return;
        }

        this.s3ResourcesUpdate = new java.util.ArrayList<S3ResourceClassificationUpdate>(s3ResourcesUpdate);
    }

    /**
     * <p>
     * The S3 resources whose classification types you want to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3ResourcesUpdate(java.util.Collection)} or {@link #withS3ResourcesUpdate(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param s3ResourcesUpdate
     *        The S3 resources whose classification types you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateS3ResourcesRequest withS3ResourcesUpdate(S3ResourceClassificationUpdate... s3ResourcesUpdate) {
        if (this.s3ResourcesUpdate == null) {
            setS3ResourcesUpdate(new java.util.ArrayList<S3ResourceClassificationUpdate>(s3ResourcesUpdate.length));
        }
        for (S3ResourceClassificationUpdate ele : s3ResourcesUpdate) {
            this.s3ResourcesUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The S3 resources whose classification types you want to update.
     * </p>
     * 
     * @param s3ResourcesUpdate
     *        The S3 resources whose classification types you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateS3ResourcesRequest withS3ResourcesUpdate(java.util.Collection<S3ResourceClassificationUpdate> s3ResourcesUpdate) {
        setS3ResourcesUpdate(s3ResourcesUpdate);
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
        if (getS3ResourcesUpdate() != null)
            sb.append("S3ResourcesUpdate: ").append(getS3ResourcesUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateS3ResourcesRequest == false)
            return false;
        UpdateS3ResourcesRequest other = (UpdateS3ResourcesRequest) obj;
        if (other.getMemberAccountId() == null ^ this.getMemberAccountId() == null)
            return false;
        if (other.getMemberAccountId() != null && other.getMemberAccountId().equals(this.getMemberAccountId()) == false)
            return false;
        if (other.getS3ResourcesUpdate() == null ^ this.getS3ResourcesUpdate() == null)
            return false;
        if (other.getS3ResourcesUpdate() != null && other.getS3ResourcesUpdate().equals(this.getS3ResourcesUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberAccountId() == null) ? 0 : getMemberAccountId().hashCode());
        hashCode = prime * hashCode + ((getS3ResourcesUpdate() == null) ? 0 : getS3ResourcesUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateS3ResourcesRequest clone() {
        return (UpdateS3ResourcesRequest) super.clone();
    }

}
