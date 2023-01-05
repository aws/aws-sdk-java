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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filtering information for the notifications. The filtering is based on Amazon S3 key names.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketNotificationConfigurationFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketNotificationConfigurationFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details for an Amazon S3 filter.
     * </p>
     */
    private AwsS3BucketNotificationConfigurationS3KeyFilter s3KeyFilter;

    /**
     * <p>
     * Details for an Amazon S3 filter.
     * </p>
     * 
     * @param s3KeyFilter
     *        Details for an Amazon S3 filter.
     */

    public void setS3KeyFilter(AwsS3BucketNotificationConfigurationS3KeyFilter s3KeyFilter) {
        this.s3KeyFilter = s3KeyFilter;
    }

    /**
     * <p>
     * Details for an Amazon S3 filter.
     * </p>
     * 
     * @return Details for an Amazon S3 filter.
     */

    public AwsS3BucketNotificationConfigurationS3KeyFilter getS3KeyFilter() {
        return this.s3KeyFilter;
    }

    /**
     * <p>
     * Details for an Amazon S3 filter.
     * </p>
     * 
     * @param s3KeyFilter
     *        Details for an Amazon S3 filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketNotificationConfigurationFilter withS3KeyFilter(AwsS3BucketNotificationConfigurationS3KeyFilter s3KeyFilter) {
        setS3KeyFilter(s3KeyFilter);
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
        if (getS3KeyFilter() != null)
            sb.append("S3KeyFilter: ").append(getS3KeyFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketNotificationConfigurationFilter == false)
            return false;
        AwsS3BucketNotificationConfigurationFilter other = (AwsS3BucketNotificationConfigurationFilter) obj;
        if (other.getS3KeyFilter() == null ^ this.getS3KeyFilter() == null)
            return false;
        if (other.getS3KeyFilter() != null && other.getS3KeyFilter().equals(this.getS3KeyFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3KeyFilter() == null) ? 0 : getS3KeyFilter().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketNotificationConfigurationFilter clone() {
        try {
            return (AwsS3BucketNotificationConfigurationFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketNotificationConfigurationFilterMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
