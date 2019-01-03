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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Summary of the information about a CloudFront origin access identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CloudFrontOriginAccessIdentitySummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudFrontOriginAccessIdentitySummary implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the origin access identity. For example: <code>E74FTE3AJFJ256A</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon S3 canonical user ID for the origin access identity, which you use when giving the origin access
     * identity read permission to an object in Amazon S3.
     * </p>
     */
    private String s3CanonicalUserId;
    /**
     * <p>
     * The comment for this origin access identity, as originally specified when created.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The ID for the origin access identity. For example: <code>E74FTE3AJFJ256A</code>.
     * </p>
     * 
     * @param id
     *        The ID for the origin access identity. For example: <code>E74FTE3AJFJ256A</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for the origin access identity. For example: <code>E74FTE3AJFJ256A</code>.
     * </p>
     * 
     * @return The ID for the origin access identity. For example: <code>E74FTE3AJFJ256A</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for the origin access identity. For example: <code>E74FTE3AJFJ256A</code>.
     * </p>
     * 
     * @param id
     *        The ID for the origin access identity. For example: <code>E74FTE3AJFJ256A</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFrontOriginAccessIdentitySummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 canonical user ID for the origin access identity, which you use when giving the origin access
     * identity read permission to an object in Amazon S3.
     * </p>
     * 
     * @param s3CanonicalUserId
     *        The Amazon S3 canonical user ID for the origin access identity, which you use when giving the origin
     *        access identity read permission to an object in Amazon S3.
     */

    public void setS3CanonicalUserId(String s3CanonicalUserId) {
        this.s3CanonicalUserId = s3CanonicalUserId;
    }

    /**
     * <p>
     * The Amazon S3 canonical user ID for the origin access identity, which you use when giving the origin access
     * identity read permission to an object in Amazon S3.
     * </p>
     * 
     * @return The Amazon S3 canonical user ID for the origin access identity, which you use when giving the origin
     *         access identity read permission to an object in Amazon S3.
     */

    public String getS3CanonicalUserId() {
        return this.s3CanonicalUserId;
    }

    /**
     * <p>
     * The Amazon S3 canonical user ID for the origin access identity, which you use when giving the origin access
     * identity read permission to an object in Amazon S3.
     * </p>
     * 
     * @param s3CanonicalUserId
     *        The Amazon S3 canonical user ID for the origin access identity, which you use when giving the origin
     *        access identity read permission to an object in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFrontOriginAccessIdentitySummary withS3CanonicalUserId(String s3CanonicalUserId) {
        setS3CanonicalUserId(s3CanonicalUserId);
        return this;
    }

    /**
     * <p>
     * The comment for this origin access identity, as originally specified when created.
     * </p>
     * 
     * @param comment
     *        The comment for this origin access identity, as originally specified when created.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * The comment for this origin access identity, as originally specified when created.
     * </p>
     * 
     * @return The comment for this origin access identity, as originally specified when created.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * The comment for this origin access identity, as originally specified when created.
     * </p>
     * 
     * @param comment
     *        The comment for this origin access identity, as originally specified when created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFrontOriginAccessIdentitySummary withComment(String comment) {
        setComment(comment);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getS3CanonicalUserId() != null)
            sb.append("S3CanonicalUserId: ").append(getS3CanonicalUserId()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudFrontOriginAccessIdentitySummary == false)
            return false;
        CloudFrontOriginAccessIdentitySummary other = (CloudFrontOriginAccessIdentitySummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getS3CanonicalUserId() == null ^ this.getS3CanonicalUserId() == null)
            return false;
        if (other.getS3CanonicalUserId() != null && other.getS3CanonicalUserId().equals(this.getS3CanonicalUserId()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getS3CanonicalUserId() == null) ? 0 : getS3CanonicalUserId().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public CloudFrontOriginAccessIdentitySummary clone() {
        try {
            return (CloudFrontOriginAccessIdentitySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
