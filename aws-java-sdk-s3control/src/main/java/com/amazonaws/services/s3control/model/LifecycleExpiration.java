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
 * The container of the Outposts bucket lifecycle expiration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/LifecycleExpiration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecycleExpiration implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates at what date the object is to be deleted. Should be in GMT ISO 8601 format.
     * </p>
     */
    private java.util.Date date;
    /**
     * <p>
     * Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero
     * positive integer.
     * </p>
     */
    private Integer days;
    /**
     * <p>
     * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the delete
     * marker will be expired. If set to false, the policy takes no action. This cannot be specified with Days or Date
     * in a Lifecycle Expiration Policy.
     * </p>
     */
    private Boolean expiredObjectDeleteMarker;

    /**
     * <p>
     * Indicates at what date the object is to be deleted. Should be in GMT ISO 8601 format.
     * </p>
     * 
     * @param date
     *        Indicates at what date the object is to be deleted. Should be in GMT ISO 8601 format.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * Indicates at what date the object is to be deleted. Should be in GMT ISO 8601 format.
     * </p>
     * 
     * @return Indicates at what date the object is to be deleted. Should be in GMT ISO 8601 format.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * Indicates at what date the object is to be deleted. Should be in GMT ISO 8601 format.
     * </p>
     * 
     * @param date
     *        Indicates at what date the object is to be deleted. Should be in GMT ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExpiration withDate(java.util.Date date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero
     * positive integer.
     * </p>
     * 
     * @param days
     *        Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero
     *        positive integer.
     */

    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * <p>
     * Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero
     * positive integer.
     * </p>
     * 
     * @return Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a
     *         non-zero positive integer.
     */

    public Integer getDays() {
        return this.days;
    }

    /**
     * <p>
     * Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero
     * positive integer.
     * </p>
     * 
     * @param days
     *        Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero
     *        positive integer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExpiration withDays(Integer days) {
        setDays(days);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the delete
     * marker will be expired. If set to false, the policy takes no action. This cannot be specified with Days or Date
     * in a Lifecycle Expiration Policy.
     * </p>
     * 
     * @param expiredObjectDeleteMarker
     *        Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the
     *        delete marker will be expired. If set to false, the policy takes no action. This cannot be specified with
     *        Days or Date in a Lifecycle Expiration Policy.
     */

    public void setExpiredObjectDeleteMarker(Boolean expiredObjectDeleteMarker) {
        this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the delete
     * marker will be expired. If set to false, the policy takes no action. This cannot be specified with Days or Date
     * in a Lifecycle Expiration Policy.
     * </p>
     * 
     * @return Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the
     *         delete marker will be expired. If set to false, the policy takes no action. This cannot be specified with
     *         Days or Date in a Lifecycle Expiration Policy.
     */

    public Boolean getExpiredObjectDeleteMarker() {
        return this.expiredObjectDeleteMarker;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the delete
     * marker will be expired. If set to false, the policy takes no action. This cannot be specified with Days or Date
     * in a Lifecycle Expiration Policy.
     * </p>
     * 
     * @param expiredObjectDeleteMarker
     *        Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the
     *        delete marker will be expired. If set to false, the policy takes no action. This cannot be specified with
     *        Days or Date in a Lifecycle Expiration Policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExpiration withExpiredObjectDeleteMarker(Boolean expiredObjectDeleteMarker) {
        setExpiredObjectDeleteMarker(expiredObjectDeleteMarker);
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the delete
     * marker will be expired. If set to false, the policy takes no action. This cannot be specified with Days or Date
     * in a Lifecycle Expiration Policy.
     * </p>
     * 
     * @return Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the
     *         delete marker will be expired. If set to false, the policy takes no action. This cannot be specified with
     *         Days or Date in a Lifecycle Expiration Policy.
     */

    public Boolean isExpiredObjectDeleteMarker() {
        return this.expiredObjectDeleteMarker;
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
        if (getExpiredObjectDeleteMarker() != null)
            sb.append("ExpiredObjectDeleteMarker: ").append(getExpiredObjectDeleteMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecycleExpiration == false)
            return false;
        LifecycleExpiration other = (LifecycleExpiration) obj;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getDays() == null ^ this.getDays() == null)
            return false;
        if (other.getDays() != null && other.getDays().equals(this.getDays()) == false)
            return false;
        if (other.getExpiredObjectDeleteMarker() == null ^ this.getExpiredObjectDeleteMarker() == null)
            return false;
        if (other.getExpiredObjectDeleteMarker() != null && other.getExpiredObjectDeleteMarker().equals(this.getExpiredObjectDeleteMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getDays() == null) ? 0 : getDays().hashCode());
        hashCode = prime * hashCode + ((getExpiredObjectDeleteMarker() == null) ? 0 : getExpiredObjectDeleteMarker().hashCode());
        return hashCode;
    }

    @Override
    public LifecycleExpiration clone() {
        try {
            return (LifecycleExpiration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
