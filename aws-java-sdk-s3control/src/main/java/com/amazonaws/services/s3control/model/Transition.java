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
 * Specifies when an object transitions to a specified storage class. For more information about Amazon S3 Lifecycle
 * configuration rules, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html">
 * Transitioning objects using Amazon S3 Lifecycle</a> in the <i>Amazon S3 User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/Transition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Transition implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates when objects are transitioned to the specified storage class. The date value must be in ISO 8601
     * format. The time is always midnight UTC.
     * </p>
     */
    private java.util.Date date;
    /**
     * <p>
     * Indicates the number of days after creation when objects are transitioned to the specified storage class. The
     * value must be a positive integer.
     * </p>
     */
    private Integer days;
    /**
     * <p>
     * The storage class to which you want the object to transition.
     * </p>
     */
    private String storageClass;

    /**
     * <p>
     * Indicates when objects are transitioned to the specified storage class. The date value must be in ISO 8601
     * format. The time is always midnight UTC.
     * </p>
     * 
     * @param date
     *        Indicates when objects are transitioned to the specified storage class. The date value must be in ISO 8601
     *        format. The time is always midnight UTC.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * Indicates when objects are transitioned to the specified storage class. The date value must be in ISO 8601
     * format. The time is always midnight UTC.
     * </p>
     * 
     * @return Indicates when objects are transitioned to the specified storage class. The date value must be in ISO
     *         8601 format. The time is always midnight UTC.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * Indicates when objects are transitioned to the specified storage class. The date value must be in ISO 8601
     * format. The time is always midnight UTC.
     * </p>
     * 
     * @param date
     *        Indicates when objects are transitioned to the specified storage class. The date value must be in ISO 8601
     *        format. The time is always midnight UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transition withDate(java.util.Date date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * Indicates the number of days after creation when objects are transitioned to the specified storage class. The
     * value must be a positive integer.
     * </p>
     * 
     * @param days
     *        Indicates the number of days after creation when objects are transitioned to the specified storage class.
     *        The value must be a positive integer.
     */

    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * <p>
     * Indicates the number of days after creation when objects are transitioned to the specified storage class. The
     * value must be a positive integer.
     * </p>
     * 
     * @return Indicates the number of days after creation when objects are transitioned to the specified storage class.
     *         The value must be a positive integer.
     */

    public Integer getDays() {
        return this.days;
    }

    /**
     * <p>
     * Indicates the number of days after creation when objects are transitioned to the specified storage class. The
     * value must be a positive integer.
     * </p>
     * 
     * @param days
     *        Indicates the number of days after creation when objects are transitioned to the specified storage class.
     *        The value must be a positive integer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transition withDays(Integer days) {
        setDays(days);
        return this;
    }

    /**
     * <p>
     * The storage class to which you want the object to transition.
     * </p>
     * 
     * @param storageClass
     *        The storage class to which you want the object to transition.
     * @see TransitionStorageClass
     */

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The storage class to which you want the object to transition.
     * </p>
     * 
     * @return The storage class to which you want the object to transition.
     * @see TransitionStorageClass
     */

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p>
     * The storage class to which you want the object to transition.
     * </p>
     * 
     * @param storageClass
     *        The storage class to which you want the object to transition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitionStorageClass
     */

    public Transition withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * <p>
     * The storage class to which you want the object to transition.
     * </p>
     * 
     * @param storageClass
     *        The storage class to which you want the object to transition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitionStorageClass
     */

    public Transition withStorageClass(TransitionStorageClass storageClass) {
        this.storageClass = storageClass.toString();
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

        if (obj instanceof Transition == false)
            return false;
        Transition other = (Transition) obj;
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
    public Transition clone() {
        try {
            return (Transition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
