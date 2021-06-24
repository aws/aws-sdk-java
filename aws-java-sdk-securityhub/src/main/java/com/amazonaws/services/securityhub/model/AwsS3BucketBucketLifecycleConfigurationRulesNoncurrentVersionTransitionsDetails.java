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
 * A transition rule that describes when noncurrent objects transition to a specified storage class.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
     * </p>
     */
    private Integer days;
    /**
     * <p>
     * The class of storage to change the object to after the object is noncurrent for the specified number of days.
     * </p>
     */
    private String storageClass;

    /**
     * <p>
     * The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
     * </p>
     * 
     * @param days
     *        The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
     */

    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * <p>
     * The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
     * </p>
     * 
     * @return The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
     */

    public Integer getDays() {
        return this.days;
    }

    /**
     * <p>
     * The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
     * </p>
     * 
     * @param days
     *        The number of days that an object is noncurrent before Amazon S3 can perform the associated action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails withDays(Integer days) {
        setDays(days);
        return this;
    }

    /**
     * <p>
     * The class of storage to change the object to after the object is noncurrent for the specified number of days.
     * </p>
     * 
     * @param storageClass
     *        The class of storage to change the object to after the object is noncurrent for the specified number of
     *        days.
     */

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The class of storage to change the object to after the object is noncurrent for the specified number of days.
     * </p>
     * 
     * @return The class of storage to change the object to after the object is noncurrent for the specified number of
     *         days.
     */

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p>
     * The class of storage to change the object to after the object is noncurrent for the specified number of days.
     * </p>
     * 
     * @param storageClass
     *        The class of storage to change the object to after the object is noncurrent for the specified number of
     *        days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails withStorageClass(String storageClass) {
        setStorageClass(storageClass);
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
        if (getDays() != null)
            sb.append("Days: ").append(getDays()).append(",");
        if (getStorageClass() != null)
            sb.append("StorageClass: ").append(getStorageClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails == false)
            return false;
        AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails other = (AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails) obj;
        if (other.getDays() == null ^ this.getDays() == null)
            return false;
        if (other.getDays() != null && other.getDays().equals(this.getDays()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDays() == null) ? 0 : getDays().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails clone() {
        try {
            return (AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketBucketLifecycleConfigurationRulesNoncurrentVersionTransitionsDetailsMarshaller
                .getInstance().marshall(this, protocolMarshaller);
    }
}
