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
 * A rule for when objects transition to specific storage classes.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A date on which to transition objects to the specified storage class. If you provide <code>Date</code>, you
     * cannot provide <code>Days</code>.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String date;
    /**
     * <p>
     * The number of days after which to transition the object to the specified storage class. If you provide
     * <code>Days</code>, you cannot provide <code>Date</code>.
     * </p>
     */
    private Integer days;
    /**
     * <p>
     * The storage class to transition the object to.
     * </p>
     */
    private String storageClass;

    /**
     * <p>
     * A date on which to transition objects to the specified storage class. If you provide <code>Date</code>, you
     * cannot provide <code>Days</code>.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param date
     *        A date on which to transition objects to the specified storage class. If you provide <code>Date</code>,
     *        you cannot provide <code>Days</code>.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * <p>
     * A date on which to transition objects to the specified storage class. If you provide <code>Date</code>, you
     * cannot provide <code>Days</code>.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return A date on which to transition objects to the specified storage class. If you provide <code>Date</code>,
     *         you cannot provide <code>Days</code>.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getDate() {
        return this.date;
    }

    /**
     * <p>
     * A date on which to transition objects to the specified storage class. If you provide <code>Date</code>, you
     * cannot provide <code>Days</code>.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param date
     *        A date on which to transition objects to the specified storage class. If you provide <code>Date</code>,
     *        you cannot provide <code>Days</code>.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails withDate(String date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * The number of days after which to transition the object to the specified storage class. If you provide
     * <code>Days</code>, you cannot provide <code>Date</code>.
     * </p>
     * 
     * @param days
     *        The number of days after which to transition the object to the specified storage class. If you provide
     *        <code>Days</code>, you cannot provide <code>Date</code>.
     */

    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * <p>
     * The number of days after which to transition the object to the specified storage class. If you provide
     * <code>Days</code>, you cannot provide <code>Date</code>.
     * </p>
     * 
     * @return The number of days after which to transition the object to the specified storage class. If you provide
     *         <code>Days</code>, you cannot provide <code>Date</code>.
     */

    public Integer getDays() {
        return this.days;
    }

    /**
     * <p>
     * The number of days after which to transition the object to the specified storage class. If you provide
     * <code>Days</code>, you cannot provide <code>Date</code>.
     * </p>
     * 
     * @param days
     *        The number of days after which to transition the object to the specified storage class. If you provide
     *        <code>Days</code>, you cannot provide <code>Date</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails withDays(Integer days) {
        setDays(days);
        return this;
    }

    /**
     * <p>
     * The storage class to transition the object to.
     * </p>
     * 
     * @param storageClass
     *        The storage class to transition the object to.
     */

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The storage class to transition the object to.
     * </p>
     * 
     * @return The storage class to transition the object to.
     */

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p>
     * The storage class to transition the object to.
     * </p>
     * 
     * @param storageClass
     *        The storage class to transition the object to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails withStorageClass(String storageClass) {
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
        if (getDate() != null)
            sb.append("Date: ").append(getDate()).append(",");
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

        if (obj instanceof AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails == false)
            return false;
        AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails other = (AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails) obj;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getDays() == null) ? 0 : getDays().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails clone() {
        try {
            return (AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketBucketLifecycleConfigurationRulesTransitionsDetailsMarshaller.getInstance().marshall(
                this, protocolMarshaller);
    }
}
