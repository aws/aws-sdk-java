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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Source details for an Amazon S3 data access asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/S3DataAccessAssetSourceEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DataAccessAssetSourceEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * Organizes Amazon S3 asset key prefixes stored in an Amazon S3 bucket.
     * </p>
     */
    private java.util.List<String> keyPrefixes;
    /**
     * <p>
     * The keys used to create the Amazon S3 data access.
     * </p>
     */
    private java.util.List<String> keys;

    /**
     * <p>
     * The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
     * </p>
     * 
     * @return The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessAssetSourceEntry withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * Organizes Amazon S3 asset key prefixes stored in an Amazon S3 bucket.
     * </p>
     * 
     * @return Organizes Amazon S3 asset key prefixes stored in an Amazon S3 bucket.
     */

    public java.util.List<String> getKeyPrefixes() {
        return keyPrefixes;
    }

    /**
     * <p>
     * Organizes Amazon S3 asset key prefixes stored in an Amazon S3 bucket.
     * </p>
     * 
     * @param keyPrefixes
     *        Organizes Amazon S3 asset key prefixes stored in an Amazon S3 bucket.
     */

    public void setKeyPrefixes(java.util.Collection<String> keyPrefixes) {
        if (keyPrefixes == null) {
            this.keyPrefixes = null;
            return;
        }

        this.keyPrefixes = new java.util.ArrayList<String>(keyPrefixes);
    }

    /**
     * <p>
     * Organizes Amazon S3 asset key prefixes stored in an Amazon S3 bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyPrefixes(java.util.Collection)} or {@link #withKeyPrefixes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keyPrefixes
     *        Organizes Amazon S3 asset key prefixes stored in an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessAssetSourceEntry withKeyPrefixes(String... keyPrefixes) {
        if (this.keyPrefixes == null) {
            setKeyPrefixes(new java.util.ArrayList<String>(keyPrefixes.length));
        }
        for (String ele : keyPrefixes) {
            this.keyPrefixes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Organizes Amazon S3 asset key prefixes stored in an Amazon S3 bucket.
     * </p>
     * 
     * @param keyPrefixes
     *        Organizes Amazon S3 asset key prefixes stored in an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessAssetSourceEntry withKeyPrefixes(java.util.Collection<String> keyPrefixes) {
        setKeyPrefixes(keyPrefixes);
        return this;
    }

    /**
     * <p>
     * The keys used to create the Amazon S3 data access.
     * </p>
     * 
     * @return The keys used to create the Amazon S3 data access.
     */

    public java.util.List<String> getKeys() {
        return keys;
    }

    /**
     * <p>
     * The keys used to create the Amazon S3 data access.
     * </p>
     * 
     * @param keys
     *        The keys used to create the Amazon S3 data access.
     */

    public void setKeys(java.util.Collection<String> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        this.keys = new java.util.ArrayList<String>(keys);
    }

    /**
     * <p>
     * The keys used to create the Amazon S3 data access.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeys(java.util.Collection)} or {@link #withKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param keys
     *        The keys used to create the Amazon S3 data access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessAssetSourceEntry withKeys(String... keys) {
        if (this.keys == null) {
            setKeys(new java.util.ArrayList<String>(keys.length));
        }
        for (String ele : keys) {
            this.keys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The keys used to create the Amazon S3 data access.
     * </p>
     * 
     * @param keys
     *        The keys used to create the Amazon S3 data access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessAssetSourceEntry withKeys(java.util.Collection<String> keys) {
        setKeys(keys);
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
        if (getKeyPrefixes() != null)
            sb.append("KeyPrefixes: ").append(getKeyPrefixes()).append(",");
        if (getKeys() != null)
            sb.append("Keys: ").append(getKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DataAccessAssetSourceEntry == false)
            return false;
        S3DataAccessAssetSourceEntry other = (S3DataAccessAssetSourceEntry) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKeyPrefixes() == null ^ this.getKeyPrefixes() == null)
            return false;
        if (other.getKeyPrefixes() != null && other.getKeyPrefixes().equals(this.getKeyPrefixes()) == false)
            return false;
        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKeyPrefixes() == null) ? 0 : getKeyPrefixes().hashCode());
        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        return hashCode;
    }

    @Override
    public S3DataAccessAssetSourceEntry clone() {
        try {
            return (S3DataAccessAssetSourceEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.S3DataAccessAssetSourceEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
