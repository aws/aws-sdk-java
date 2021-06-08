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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The container for abort incomplete multipart upload
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/AbortIncompleteMultipartUpload"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbortIncompleteMultipartUpload implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload to the Outposts bucket.
     * </p>
     */
    private Integer daysAfterInitiation;

    /**
     * <p>
     * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload to the Outposts bucket.
     * </p>
     * 
     * @param daysAfterInitiation
     *        Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload to the Outposts
     *        bucket.
     */

    public void setDaysAfterInitiation(Integer daysAfterInitiation) {
        this.daysAfterInitiation = daysAfterInitiation;
    }

    /**
     * <p>
     * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload to the Outposts bucket.
     * </p>
     * 
     * @return Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload to the Outposts
     *         bucket.
     */

    public Integer getDaysAfterInitiation() {
        return this.daysAfterInitiation;
    }

    /**
     * <p>
     * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload to the Outposts bucket.
     * </p>
     * 
     * @param daysAfterInitiation
     *        Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload to the Outposts
     *        bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbortIncompleteMultipartUpload withDaysAfterInitiation(Integer daysAfterInitiation) {
        setDaysAfterInitiation(daysAfterInitiation);
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
        if (getDaysAfterInitiation() != null)
            sb.append("DaysAfterInitiation: ").append(getDaysAfterInitiation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AbortIncompleteMultipartUpload == false)
            return false;
        AbortIncompleteMultipartUpload other = (AbortIncompleteMultipartUpload) obj;
        if (other.getDaysAfterInitiation() == null ^ this.getDaysAfterInitiation() == null)
            return false;
        if (other.getDaysAfterInitiation() != null && other.getDaysAfterInitiation().equals(this.getDaysAfterInitiation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDaysAfterInitiation() == null) ? 0 : getDaysAfterInitiation().hashCode());
        return hashCode;
    }

    @Override
    public AbortIncompleteMultipartUpload clone() {
        try {
            return (AbortIncompleteMultipartUpload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
