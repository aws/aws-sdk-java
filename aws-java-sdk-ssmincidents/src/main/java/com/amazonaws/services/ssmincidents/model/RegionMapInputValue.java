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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The mapping between a Region and the key that's used to encrypt the data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/RegionMapInputValue" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegionMapInputValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The KMS key used to encrypt the data in your replication set.
     * </p>
     */
    private String sseKmsKeyId;

    /**
     * <p>
     * The KMS key used to encrypt the data in your replication set.
     * </p>
     * 
     * @param sseKmsKeyId
     *        The KMS key used to encrypt the data in your replication set.
     */

    public void setSseKmsKeyId(String sseKmsKeyId) {
        this.sseKmsKeyId = sseKmsKeyId;
    }

    /**
     * <p>
     * The KMS key used to encrypt the data in your replication set.
     * </p>
     * 
     * @return The KMS key used to encrypt the data in your replication set.
     */

    public String getSseKmsKeyId() {
        return this.sseKmsKeyId;
    }

    /**
     * <p>
     * The KMS key used to encrypt the data in your replication set.
     * </p>
     * 
     * @param sseKmsKeyId
     *        The KMS key used to encrypt the data in your replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionMapInputValue withSseKmsKeyId(String sseKmsKeyId) {
        setSseKmsKeyId(sseKmsKeyId);
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
        if (getSseKmsKeyId() != null)
            sb.append("SseKmsKeyId: ").append(getSseKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegionMapInputValue == false)
            return false;
        RegionMapInputValue other = (RegionMapInputValue) obj;
        if (other.getSseKmsKeyId() == null ^ this.getSseKmsKeyId() == null)
            return false;
        if (other.getSseKmsKeyId() != null && other.getSseKmsKeyId().equals(this.getSseKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSseKmsKeyId() == null) ? 0 : getSseKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public RegionMapInputValue clone() {
        try {
            return (RegionMapInputValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.RegionMapInputValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
