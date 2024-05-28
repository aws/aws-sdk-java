/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstanceTpmEkPubResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The public endorsement key type.
     * </p>
     */
    private String keyType;
    /**
     * <p>
     * The public endorsement key format.
     * </p>
     */
    private String keyFormat;
    /**
     * <p>
     * The public endorsement key material.
     * </p>
     */
    private String keyValue;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceTpmEkPubResult withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The public endorsement key type.
     * </p>
     * 
     * @param keyType
     *        The public endorsement key type.
     * @see EkPubKeyType
     */

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    /**
     * <p>
     * The public endorsement key type.
     * </p>
     * 
     * @return The public endorsement key type.
     * @see EkPubKeyType
     */

    public String getKeyType() {
        return this.keyType;
    }

    /**
     * <p>
     * The public endorsement key type.
     * </p>
     * 
     * @param keyType
     *        The public endorsement key type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EkPubKeyType
     */

    public GetInstanceTpmEkPubResult withKeyType(String keyType) {
        setKeyType(keyType);
        return this;
    }

    /**
     * <p>
     * The public endorsement key type.
     * </p>
     * 
     * @param keyType
     *        The public endorsement key type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EkPubKeyType
     */

    public GetInstanceTpmEkPubResult withKeyType(EkPubKeyType keyType) {
        this.keyType = keyType.toString();
        return this;
    }

    /**
     * <p>
     * The public endorsement key format.
     * </p>
     * 
     * @param keyFormat
     *        The public endorsement key format.
     * @see EkPubKeyFormat
     */

    public void setKeyFormat(String keyFormat) {
        this.keyFormat = keyFormat;
    }

    /**
     * <p>
     * The public endorsement key format.
     * </p>
     * 
     * @return The public endorsement key format.
     * @see EkPubKeyFormat
     */

    public String getKeyFormat() {
        return this.keyFormat;
    }

    /**
     * <p>
     * The public endorsement key format.
     * </p>
     * 
     * @param keyFormat
     *        The public endorsement key format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EkPubKeyFormat
     */

    public GetInstanceTpmEkPubResult withKeyFormat(String keyFormat) {
        setKeyFormat(keyFormat);
        return this;
    }

    /**
     * <p>
     * The public endorsement key format.
     * </p>
     * 
     * @param keyFormat
     *        The public endorsement key format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EkPubKeyFormat
     */

    public GetInstanceTpmEkPubResult withKeyFormat(EkPubKeyFormat keyFormat) {
        this.keyFormat = keyFormat.toString();
        return this;
    }

    /**
     * <p>
     * The public endorsement key material.
     * </p>
     * 
     * @param keyValue
     *        The public endorsement key material.
     */

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    /**
     * <p>
     * The public endorsement key material.
     * </p>
     * 
     * @return The public endorsement key material.
     */

    public String getKeyValue() {
        return this.keyValue;
    }

    /**
     * <p>
     * The public endorsement key material.
     * </p>
     * 
     * @param keyValue
     *        The public endorsement key material.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceTpmEkPubResult withKeyValue(String keyValue) {
        setKeyValue(keyValue);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getKeyType() != null)
            sb.append("KeyType: ").append(getKeyType()).append(",");
        if (getKeyFormat() != null)
            sb.append("KeyFormat: ").append(getKeyFormat()).append(",");
        if (getKeyValue() != null)
            sb.append("KeyValue: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceTpmEkPubResult == false)
            return false;
        GetInstanceTpmEkPubResult other = (GetInstanceTpmEkPubResult) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getKeyType() == null ^ this.getKeyType() == null)
            return false;
        if (other.getKeyType() != null && other.getKeyType().equals(this.getKeyType()) == false)
            return false;
        if (other.getKeyFormat() == null ^ this.getKeyFormat() == null)
            return false;
        if (other.getKeyFormat() != null && other.getKeyFormat().equals(this.getKeyFormat()) == false)
            return false;
        if (other.getKeyValue() == null ^ this.getKeyValue() == null)
            return false;
        if (other.getKeyValue() != null && other.getKeyValue().equals(this.getKeyValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getKeyType() == null) ? 0 : getKeyType().hashCode());
        hashCode = prime * hashCode + ((getKeyFormat() == null) ? 0 : getKeyFormat().hashCode());
        hashCode = prime * hashCode + ((getKeyValue() == null) ? 0 : getKeyValue().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceTpmEkPubResult clone() {
        try {
            return (GetInstanceTpmEkPubResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
