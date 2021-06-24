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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about what Amazon S3 does when a multipart upload is incomplete.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of days after which Amazon S3 cancels an incomplete multipart upload.
     * </p>
     */
    private Integer daysAfterInitiation;

    /**
     * <p>
     * The number of days after which Amazon S3 cancels an incomplete multipart upload.
     * </p>
     * 
     * @param daysAfterInitiation
     *        The number of days after which Amazon S3 cancels an incomplete multipart upload.
     */

    public void setDaysAfterInitiation(Integer daysAfterInitiation) {
        this.daysAfterInitiation = daysAfterInitiation;
    }

    /**
     * <p>
     * The number of days after which Amazon S3 cancels an incomplete multipart upload.
     * </p>
     * 
     * @return The number of days after which Amazon S3 cancels an incomplete multipart upload.
     */

    public Integer getDaysAfterInitiation() {
        return this.daysAfterInitiation;
    }

    /**
     * <p>
     * The number of days after which Amazon S3 cancels an incomplete multipart upload.
     * </p>
     * 
     * @param daysAfterInitiation
     *        The number of days after which Amazon S3 cancels an incomplete multipart upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails withDaysAfterInitiation(Integer daysAfterInitiation) {
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

        if (obj instanceof AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails == false)
            return false;
        AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails other = (AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails) obj;
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
    public AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails clone() {
        try {
            return (AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketBucketLifecycleConfigurationRulesAbortIncompleteMultipartUploadDetailsMarshaller
                .getInstance().marshall(this, protocolMarshaller);
    }
}
