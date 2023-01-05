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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides aggregated statistical data for sensitive data discovery metrics that apply to S3 buckets. Each field
 * contains aggregated data for all the buckets that have a sensitivity score (sensitivityScore) of a specified value or
 * within a specified range (BucketStatisticsBySensitivity). If automated sensitive data discovery is currently disabled
 * for your account, the value for each field is 0.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SensitivityAggregations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SensitivityAggregations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These objects
     * use a supported storage class and have a file name extension for a supported file or storage format.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, this value is based on the size of the latest version of each
     * applicable object in the buckets. This value doesn't reflect the storage size of all versions of all applicable
     * objects in the buckets.
     * </p>
     */
    private Long classifiableSizeInBytes;
    /**
     * <p>
     * The total number of buckets that are publicly accessible based on a combination of permissions settings for each
     * bucket.
     * </p>
     */
    private Long publiclyAccessibleCount;
    /**
     * <p>
     * The total number of buckets.
     * </p>
     */
    private Long totalCount;
    /**
     * <p>
     * The total storage size, in bytes, of the buckets.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, this value is based on the size of the latest version of each
     * object in the buckets. This value doesn't reflect the storage size of all versions of the objects in the buckets.
     * </p>
     */
    private Long totalSizeInBytes;

    /**
     * <p>
     * The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These objects
     * use a supported storage class and have a file name extension for a supported file or storage format.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, this value is based on the size of the latest version of each
     * applicable object in the buckets. This value doesn't reflect the storage size of all versions of all applicable
     * objects in the buckets.
     * </p>
     * 
     * @param classifiableSizeInBytes
     *        The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These
     *        objects use a supported storage class and have a file name extension for a supported file or storage
     *        format.</p>
     *        <p>
     *        If versioning is enabled for any of the buckets, this value is based on the size of the latest version of
     *        each applicable object in the buckets. This value doesn't reflect the storage size of all versions of all
     *        applicable objects in the buckets.
     */

    public void setClassifiableSizeInBytes(Long classifiableSizeInBytes) {
        this.classifiableSizeInBytes = classifiableSizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These objects
     * use a supported storage class and have a file name extension for a supported file or storage format.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, this value is based on the size of the latest version of each
     * applicable object in the buckets. This value doesn't reflect the storage size of all versions of all applicable
     * objects in the buckets.
     * </p>
     * 
     * @return The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These
     *         objects use a supported storage class and have a file name extension for a supported file or storage
     *         format.</p>
     *         <p>
     *         If versioning is enabled for any of the buckets, this value is based on the size of the latest version of
     *         each applicable object in the buckets. This value doesn't reflect the storage size of all versions of all
     *         applicable objects in the buckets.
     */

    public Long getClassifiableSizeInBytes() {
        return this.classifiableSizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These objects
     * use a supported storage class and have a file name extension for a supported file or storage format.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, this value is based on the size of the latest version of each
     * applicable object in the buckets. This value doesn't reflect the storage size of all versions of all applicable
     * objects in the buckets.
     * </p>
     * 
     * @param classifiableSizeInBytes
     *        The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These
     *        objects use a supported storage class and have a file name extension for a supported file or storage
     *        format.</p>
     *        <p>
     *        If versioning is enabled for any of the buckets, this value is based on the size of the latest version of
     *        each applicable object in the buckets. This value doesn't reflect the storage size of all versions of all
     *        applicable objects in the buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitivityAggregations withClassifiableSizeInBytes(Long classifiableSizeInBytes) {
        setClassifiableSizeInBytes(classifiableSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The total number of buckets that are publicly accessible based on a combination of permissions settings for each
     * bucket.
     * </p>
     * 
     * @param publiclyAccessibleCount
     *        The total number of buckets that are publicly accessible based on a combination of permissions settings
     *        for each bucket.
     */

    public void setPubliclyAccessibleCount(Long publiclyAccessibleCount) {
        this.publiclyAccessibleCount = publiclyAccessibleCount;
    }

    /**
     * <p>
     * The total number of buckets that are publicly accessible based on a combination of permissions settings for each
     * bucket.
     * </p>
     * 
     * @return The total number of buckets that are publicly accessible based on a combination of permissions settings
     *         for each bucket.
     */

    public Long getPubliclyAccessibleCount() {
        return this.publiclyAccessibleCount;
    }

    /**
     * <p>
     * The total number of buckets that are publicly accessible based on a combination of permissions settings for each
     * bucket.
     * </p>
     * 
     * @param publiclyAccessibleCount
     *        The total number of buckets that are publicly accessible based on a combination of permissions settings
     *        for each bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitivityAggregations withPubliclyAccessibleCount(Long publiclyAccessibleCount) {
        setPubliclyAccessibleCount(publiclyAccessibleCount);
        return this;
    }

    /**
     * <p>
     * The total number of buckets.
     * </p>
     * 
     * @param totalCount
     *        The total number of buckets.
     */

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of buckets.
     * </p>
     * 
     * @return The total number of buckets.
     */

    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of buckets.
     * </p>
     * 
     * @param totalCount
     *        The total number of buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitivityAggregations withTotalCount(Long totalCount) {
        setTotalCount(totalCount);
        return this;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the buckets.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, this value is based on the size of the latest version of each
     * object in the buckets. This value doesn't reflect the storage size of all versions of the objects in the buckets.
     * </p>
     * 
     * @param totalSizeInBytes
     *        The total storage size, in bytes, of the buckets.</p>
     *        <p>
     *        If versioning is enabled for any of the buckets, this value is based on the size of the latest version of
     *        each object in the buckets. This value doesn't reflect the storage size of all versions of the objects in
     *        the buckets.
     */

    public void setTotalSizeInBytes(Long totalSizeInBytes) {
        this.totalSizeInBytes = totalSizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the buckets.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, this value is based on the size of the latest version of each
     * object in the buckets. This value doesn't reflect the storage size of all versions of the objects in the buckets.
     * </p>
     * 
     * @return The total storage size, in bytes, of the buckets.</p>
     *         <p>
     *         If versioning is enabled for any of the buckets, this value is based on the size of the latest version of
     *         each object in the buckets. This value doesn't reflect the storage size of all versions of the objects in
     *         the buckets.
     */

    public Long getTotalSizeInBytes() {
        return this.totalSizeInBytes;
    }

    /**
     * <p>
     * The total storage size, in bytes, of the buckets.
     * </p>
     * <p>
     * If versioning is enabled for any of the buckets, this value is based on the size of the latest version of each
     * object in the buckets. This value doesn't reflect the storage size of all versions of the objects in the buckets.
     * </p>
     * 
     * @param totalSizeInBytes
     *        The total storage size, in bytes, of the buckets.</p>
     *        <p>
     *        If versioning is enabled for any of the buckets, this value is based on the size of the latest version of
     *        each object in the buckets. This value doesn't reflect the storage size of all versions of the objects in
     *        the buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitivityAggregations withTotalSizeInBytes(Long totalSizeInBytes) {
        setTotalSizeInBytes(totalSizeInBytes);
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
        if (getClassifiableSizeInBytes() != null)
            sb.append("ClassifiableSizeInBytes: ").append(getClassifiableSizeInBytes()).append(",");
        if (getPubliclyAccessibleCount() != null)
            sb.append("PubliclyAccessibleCount: ").append(getPubliclyAccessibleCount()).append(",");
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount()).append(",");
        if (getTotalSizeInBytes() != null)
            sb.append("TotalSizeInBytes: ").append(getTotalSizeInBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SensitivityAggregations == false)
            return false;
        SensitivityAggregations other = (SensitivityAggregations) obj;
        if (other.getClassifiableSizeInBytes() == null ^ this.getClassifiableSizeInBytes() == null)
            return false;
        if (other.getClassifiableSizeInBytes() != null && other.getClassifiableSizeInBytes().equals(this.getClassifiableSizeInBytes()) == false)
            return false;
        if (other.getPubliclyAccessibleCount() == null ^ this.getPubliclyAccessibleCount() == null)
            return false;
        if (other.getPubliclyAccessibleCount() != null && other.getPubliclyAccessibleCount().equals(this.getPubliclyAccessibleCount()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        if (other.getTotalSizeInBytes() == null ^ this.getTotalSizeInBytes() == null)
            return false;
        if (other.getTotalSizeInBytes() != null && other.getTotalSizeInBytes().equals(this.getTotalSizeInBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClassifiableSizeInBytes() == null) ? 0 : getClassifiableSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessibleCount() == null) ? 0 : getPubliclyAccessibleCount().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        hashCode = prime * hashCode + ((getTotalSizeInBytes() == null) ? 0 : getTotalSizeInBytes().hashCode());
        return hashCode;
    }

    @Override
    public SensitivityAggregations clone() {
        try {
            return (SensitivityAggregations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SensitivityAggregationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
