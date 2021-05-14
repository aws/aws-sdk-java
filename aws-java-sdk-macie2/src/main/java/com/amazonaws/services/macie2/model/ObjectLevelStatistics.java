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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the total storage size (in bytes) or number of objects that Amazon Macie can't analyze in
 * one or more S3 buckets. In a BucketMetadata or MatchingBucket object, this data is for a specific bucket. In a
 * GetBucketStatisticsResponse object, this data is aggregated for all the buckets in the query results. If versioning
 * is enabled for a bucket, total storage size values are based on the size of the latest version of each applicable
 * object in the bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ObjectLevelStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectLevelStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects don't
     * have a file name extension for a supported file or storage format.
     * </p>
     */
    private Long fileType;
    /**
     * <p>
     * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects use an
     * unsupported storage class.
     * </p>
     */
    private Long storageClass;
    /**
     * <p>
     * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects use an
     * unsupported storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     */
    private Long total;

    /**
     * <p>
     * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects don't
     * have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param fileType
     *        The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects
     *        don't have a file name extension for a supported file or storage format.
     */

    public void setFileType(Long fileType) {
        this.fileType = fileType;
    }

    /**
     * <p>
     * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects don't
     * have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @return The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the
     *         objects don't have a file name extension for a supported file or storage format.
     */

    public Long getFileType() {
        return this.fileType;
    }

    /**
     * <p>
     * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects don't
     * have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param fileType
     *        The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects
     *        don't have a file name extension for a supported file or storage format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectLevelStatistics withFileType(Long fileType) {
        setFileType(fileType);
        return this;
    }

    /**
     * <p>
     * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects use an
     * unsupported storage class.
     * </p>
     * 
     * @param storageClass
     *        The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects
     *        use an unsupported storage class.
     */

    public void setStorageClass(Long storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects use an
     * unsupported storage class.
     * </p>
     * 
     * @return The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the
     *         objects use an unsupported storage class.
     */

    public Long getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p>
     * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects use an
     * unsupported storage class.
     * </p>
     * 
     * @param storageClass
     *        The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects
     *        use an unsupported storage class.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectLevelStatistics withStorageClass(Long storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * <p>
     * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects use an
     * unsupported storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param total
     *        The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects
     *        use an unsupported storage class or don't have a file name extension for a supported file or storage
     *        format.
     */

    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * <p>
     * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects use an
     * unsupported storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @return The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the
     *         objects use an unsupported storage class or don't have a file name extension for a supported file or
     *         storage format.
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects use an
     * unsupported storage class or don't have a file name extension for a supported file or storage format.
     * </p>
     * 
     * @param total
     *        The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects
     *        use an unsupported storage class or don't have a file name extension for a supported file or storage
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectLevelStatistics withTotal(Long total) {
        setTotal(total);
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
        if (getFileType() != null)
            sb.append("FileType: ").append(getFileType()).append(",");
        if (getStorageClass() != null)
            sb.append("StorageClass: ").append(getStorageClass()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectLevelStatistics == false)
            return false;
        ObjectLevelStatistics other = (ObjectLevelStatistics) obj;
        if (other.getFileType() == null ^ this.getFileType() == null)
            return false;
        if (other.getFileType() != null && other.getFileType().equals(this.getFileType()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileType() == null) ? 0 : getFileType().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public ObjectLevelStatistics clone() {
        try {
            return (ObjectLevelStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ObjectLevelStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
