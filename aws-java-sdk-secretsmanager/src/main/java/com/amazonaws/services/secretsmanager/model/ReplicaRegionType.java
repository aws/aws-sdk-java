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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * (Optional) Custom type consisting of a <code>Region</code> (required) and the <code>KmsKeyId</code> which can be an
 * <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ReplicaRegionType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaRegionType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes a single instance of Region objects.
     * </p>
     */
    private String region;
    /**
     * <p>
     * Can be an <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Describes a single instance of Region objects.
     * </p>
     * 
     * @param region
     *        Describes a single instance of Region objects.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * Describes a single instance of Region objects.
     * </p>
     * 
     * @return Describes a single instance of Region objects.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * Describes a single instance of Region objects.
     * </p>
     * 
     * @param region
     *        Describes a single instance of Region objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaRegionType withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * Can be an <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
     * </p>
     * 
     * @param kmsKeyId
     *        Can be an <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Can be an <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
     * </p>
     * 
     * @return Can be an <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Can be an <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
     * </p>
     * 
     * @param kmsKeyId
     *        Can be an <code>ARN</code>, <code>Key ID</code>, or <code>Alias</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaRegionType withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaRegionType == false)
            return false;
        ReplicaRegionType other = (ReplicaRegionType) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaRegionType clone() {
        try {
            return (ReplicaRegionType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.secretsmanager.model.transform.ReplicaRegionTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
