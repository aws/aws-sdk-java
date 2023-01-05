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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to store data used by IoT SiteWise in an Amazon S3 bucket that you manage. You can't change the choice of Amazon
 * S3 storage after your data store is created.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/IotSiteWiseCustomerManagedDatastoreS3Storage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IotSiteWiseCustomerManagedDatastoreS3Storage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon S3 bucket where your data is stored.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * (Optional) The prefix used to create the keys of the data store data objects. Each object in an Amazon S3 bucket
     * has a key that is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix
     * must end with a forward slash (/).
     * </p>
     */
    private String keyPrefix;

    /**
     * <p>
     * The name of the Amazon S3 bucket where your data is stored.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket where your data is stored.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where your data is stored.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket where your data is stored.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where your data is stored.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket where your data is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotSiteWiseCustomerManagedDatastoreS3Storage withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * (Optional) The prefix used to create the keys of the data store data objects. Each object in an Amazon S3 bucket
     * has a key that is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix
     * must end with a forward slash (/).
     * </p>
     * 
     * @param keyPrefix
     *        (Optional) The prefix used to create the keys of the data store data objects. Each object in an Amazon S3
     *        bucket has a key that is its unique identifier in the bucket. Each object in a bucket has exactly one key.
     *        The prefix must end with a forward slash (/).
     */

    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    /**
     * <p>
     * (Optional) The prefix used to create the keys of the data store data objects. Each object in an Amazon S3 bucket
     * has a key that is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix
     * must end with a forward slash (/).
     * </p>
     * 
     * @return (Optional) The prefix used to create the keys of the data store data objects. Each object in an Amazon S3
     *         bucket has a key that is its unique identifier in the bucket. Each object in a bucket has exactly one
     *         key. The prefix must end with a forward slash (/).
     */

    public String getKeyPrefix() {
        return this.keyPrefix;
    }

    /**
     * <p>
     * (Optional) The prefix used to create the keys of the data store data objects. Each object in an Amazon S3 bucket
     * has a key that is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix
     * must end with a forward slash (/).
     * </p>
     * 
     * @param keyPrefix
     *        (Optional) The prefix used to create the keys of the data store data objects. Each object in an Amazon S3
     *        bucket has a key that is its unique identifier in the bucket. Each object in a bucket has exactly one key.
     *        The prefix must end with a forward slash (/).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotSiteWiseCustomerManagedDatastoreS3Storage withKeyPrefix(String keyPrefix) {
        setKeyPrefix(keyPrefix);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getKeyPrefix() != null)
            sb.append("KeyPrefix: ").append(getKeyPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotSiteWiseCustomerManagedDatastoreS3Storage == false)
            return false;
        IotSiteWiseCustomerManagedDatastoreS3Storage other = (IotSiteWiseCustomerManagedDatastoreS3Storage) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKeyPrefix() == null ^ this.getKeyPrefix() == null)
            return false;
        if (other.getKeyPrefix() != null && other.getKeyPrefix().equals(this.getKeyPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKeyPrefix() == null) ? 0 : getKeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public IotSiteWiseCustomerManagedDatastoreS3Storage clone() {
        try {
            return (IotSiteWiseCustomerManagedDatastoreS3Storage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.IotSiteWiseCustomerManagedDatastoreS3StorageMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
