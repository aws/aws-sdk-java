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
 * The Amazon S3 data access that is the asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/S3DataAccessAsset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DataAccessAsset implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket hosting data to be shared in the S3 data access.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
     * </p>
     */
    private java.util.List<String> keyPrefixes;
    /**
     * <p>
     * S3 keys made available using this asset.
     * </p>
     */
    private java.util.List<String> keys;
    /**
     * <p>
     * The automatically-generated bucket-style alias for your Amazon S3 Access Point. Customers can access their
     * entitled data using the S3 Access Point alias.
     * </p>
     */
    private String s3AccessPointAlias;
    /**
     * <p>
     * The ARN for your Amazon S3 Access Point. Customers can also access their entitled data using the S3 Access Point
     * ARN.
     * </p>
     */
    private String s3AccessPointArn;

    /**
     * <p>
     * The Amazon S3 bucket hosting data to be shared in the S3 data access.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket hosting data to be shared in the S3 data access.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket hosting data to be shared in the S3 data access.
     * </p>
     * 
     * @return The Amazon S3 bucket hosting data to be shared in the S3 data access.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket hosting data to be shared in the S3 data access.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket hosting data to be shared in the S3 data access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessAsset withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
     * </p>
     * 
     * @return The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
     */

    public java.util.List<String> getKeyPrefixes() {
        return keyPrefixes;
    }

    /**
     * <p>
     * The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
     * </p>
     * 
     * @param keyPrefixes
     *        The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
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
     * The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyPrefixes(java.util.Collection)} or {@link #withKeyPrefixes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keyPrefixes
     *        The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessAsset withKeyPrefixes(String... keyPrefixes) {
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
     * The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
     * </p>
     * 
     * @param keyPrefixes
     *        The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessAsset withKeyPrefixes(java.util.Collection<String> keyPrefixes) {
        setKeyPrefixes(keyPrefixes);
        return this;
    }

    /**
     * <p>
     * S3 keys made available using this asset.
     * </p>
     * 
     * @return S3 keys made available using this asset.
     */

    public java.util.List<String> getKeys() {
        return keys;
    }

    /**
     * <p>
     * S3 keys made available using this asset.
     * </p>
     * 
     * @param keys
     *        S3 keys made available using this asset.
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
     * S3 keys made available using this asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeys(java.util.Collection)} or {@link #withKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param keys
     *        S3 keys made available using this asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessAsset withKeys(String... keys) {
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
     * S3 keys made available using this asset.
     * </p>
     * 
     * @param keys
     *        S3 keys made available using this asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessAsset withKeys(java.util.Collection<String> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * <p>
     * The automatically-generated bucket-style alias for your Amazon S3 Access Point. Customers can access their
     * entitled data using the S3 Access Point alias.
     * </p>
     * 
     * @param s3AccessPointAlias
     *        The automatically-generated bucket-style alias for your Amazon S3 Access Point. Customers can access their
     *        entitled data using the S3 Access Point alias.
     */

    public void setS3AccessPointAlias(String s3AccessPointAlias) {
        this.s3AccessPointAlias = s3AccessPointAlias;
    }

    /**
     * <p>
     * The automatically-generated bucket-style alias for your Amazon S3 Access Point. Customers can access their
     * entitled data using the S3 Access Point alias.
     * </p>
     * 
     * @return The automatically-generated bucket-style alias for your Amazon S3 Access Point. Customers can access
     *         their entitled data using the S3 Access Point alias.
     */

    public String getS3AccessPointAlias() {
        return this.s3AccessPointAlias;
    }

    /**
     * <p>
     * The automatically-generated bucket-style alias for your Amazon S3 Access Point. Customers can access their
     * entitled data using the S3 Access Point alias.
     * </p>
     * 
     * @param s3AccessPointAlias
     *        The automatically-generated bucket-style alias for your Amazon S3 Access Point. Customers can access their
     *        entitled data using the S3 Access Point alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessAsset withS3AccessPointAlias(String s3AccessPointAlias) {
        setS3AccessPointAlias(s3AccessPointAlias);
        return this;
    }

    /**
     * <p>
     * The ARN for your Amazon S3 Access Point. Customers can also access their entitled data using the S3 Access Point
     * ARN.
     * </p>
     * 
     * @param s3AccessPointArn
     *        The ARN for your Amazon S3 Access Point. Customers can also access their entitled data using the S3 Access
     *        Point ARN.
     */

    public void setS3AccessPointArn(String s3AccessPointArn) {
        this.s3AccessPointArn = s3AccessPointArn;
    }

    /**
     * <p>
     * The ARN for your Amazon S3 Access Point. Customers can also access their entitled data using the S3 Access Point
     * ARN.
     * </p>
     * 
     * @return The ARN for your Amazon S3 Access Point. Customers can also access their entitled data using the S3
     *         Access Point ARN.
     */

    public String getS3AccessPointArn() {
        return this.s3AccessPointArn;
    }

    /**
     * <p>
     * The ARN for your Amazon S3 Access Point. Customers can also access their entitled data using the S3 Access Point
     * ARN.
     * </p>
     * 
     * @param s3AccessPointArn
     *        The ARN for your Amazon S3 Access Point. Customers can also access their entitled data using the S3 Access
     *        Point ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataAccessAsset withS3AccessPointArn(String s3AccessPointArn) {
        setS3AccessPointArn(s3AccessPointArn);
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
            sb.append("Keys: ").append(getKeys()).append(",");
        if (getS3AccessPointAlias() != null)
            sb.append("S3AccessPointAlias: ").append(getS3AccessPointAlias()).append(",");
        if (getS3AccessPointArn() != null)
            sb.append("S3AccessPointArn: ").append(getS3AccessPointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DataAccessAsset == false)
            return false;
        S3DataAccessAsset other = (S3DataAccessAsset) obj;
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
        if (other.getS3AccessPointAlias() == null ^ this.getS3AccessPointAlias() == null)
            return false;
        if (other.getS3AccessPointAlias() != null && other.getS3AccessPointAlias().equals(this.getS3AccessPointAlias()) == false)
            return false;
        if (other.getS3AccessPointArn() == null ^ this.getS3AccessPointArn() == null)
            return false;
        if (other.getS3AccessPointArn() != null && other.getS3AccessPointArn().equals(this.getS3AccessPointArn()) == false)
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
        hashCode = prime * hashCode + ((getS3AccessPointAlias() == null) ? 0 : getS3AccessPointAlias().hashCode());
        hashCode = prime * hashCode + ((getS3AccessPointArn() == null) ? 0 : getS3AccessPointArn().hashCode());
        return hashCode;
    }

    @Override
    public S3DataAccessAsset clone() {
        try {
            return (S3DataAccessAsset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.S3DataAccessAssetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
