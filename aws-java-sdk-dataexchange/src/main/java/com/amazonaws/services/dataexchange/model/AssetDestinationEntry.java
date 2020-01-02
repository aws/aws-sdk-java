/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The destination for the asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/AssetDestinationEntry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetDestinationEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the asset.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The S3 bucket that is the destination for the asset.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The name of the object in Amazon S3 for the asset.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The unique identifier for the asset.
     * </p>
     * 
     * @param assetId
     *        The unique identifier for the asset.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The unique identifier for the asset.
     * </p>
     * 
     * @return The unique identifier for the asset.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The unique identifier for the asset.
     * </p>
     * 
     * @param assetId
     *        The unique identifier for the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetDestinationEntry withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The S3 bucket that is the destination for the asset.
     * </p>
     * 
     * @param bucket
     *        The S3 bucket that is the destination for the asset.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The S3 bucket that is the destination for the asset.
     * </p>
     * 
     * @return The S3 bucket that is the destination for the asset.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The S3 bucket that is the destination for the asset.
     * </p>
     * 
     * @param bucket
     *        The S3 bucket that is the destination for the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetDestinationEntry withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The name of the object in Amazon S3 for the asset.
     * </p>
     * 
     * @param key
     *        The name of the object in Amazon S3 for the asset.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the object in Amazon S3 for the asset.
     * </p>
     * 
     * @return The name of the object in Amazon S3 for the asset.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the object in Amazon S3 for the asset.
     * </p>
     * 
     * @param key
     *        The name of the object in Amazon S3 for the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetDestinationEntry withKey(String key) {
        setKey(key);
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetDestinationEntry == false)
            return false;
        AssetDestinationEntry other = (AssetDestinationEntry) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public AssetDestinationEntry clone() {
        try {
            return (AssetDestinationEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.AssetDestinationEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
