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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Aggregate status of Agent components.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/AggregateStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregateStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sparse map of failure signatures.
     * </p>
     */
    private java.util.Map<String, Boolean> signatureMap;
    /**
     * <p>
     * Aggregate status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Sparse map of failure signatures.
     * </p>
     * 
     * @return Sparse map of failure signatures.
     */

    public java.util.Map<String, Boolean> getSignatureMap() {
        return signatureMap;
    }

    /**
     * <p>
     * Sparse map of failure signatures.
     * </p>
     * 
     * @param signatureMap
     *        Sparse map of failure signatures.
     */

    public void setSignatureMap(java.util.Map<String, Boolean> signatureMap) {
        this.signatureMap = signatureMap;
    }

    /**
     * <p>
     * Sparse map of failure signatures.
     * </p>
     * 
     * @param signatureMap
     *        Sparse map of failure signatures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateStatus withSignatureMap(java.util.Map<String, Boolean> signatureMap) {
        setSignatureMap(signatureMap);
        return this;
    }

    /**
     * Add a single SignatureMap entry
     *
     * @see AggregateStatus#withSignatureMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AggregateStatus addSignatureMapEntry(String key, Boolean value) {
        if (null == this.signatureMap) {
            this.signatureMap = new java.util.HashMap<String, Boolean>();
        }
        if (this.signatureMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.signatureMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SignatureMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateStatus clearSignatureMapEntries() {
        this.signatureMap = null;
        return this;
    }

    /**
     * <p>
     * Aggregate status.
     * </p>
     * 
     * @param status
     *        Aggregate status.
     * @see AgentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Aggregate status.
     * </p>
     * 
     * @return Aggregate status.
     * @see AgentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Aggregate status.
     * </p>
     * 
     * @param status
     *        Aggregate status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AggregateStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Aggregate status.
     * </p>
     * 
     * @param status
     *        Aggregate status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AggregateStatus withStatus(AgentStatus status) {
        this.status = status.toString();
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
        if (getSignatureMap() != null)
            sb.append("SignatureMap: ").append(getSignatureMap()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregateStatus == false)
            return false;
        AggregateStatus other = (AggregateStatus) obj;
        if (other.getSignatureMap() == null ^ this.getSignatureMap() == null)
            return false;
        if (other.getSignatureMap() != null && other.getSignatureMap().equals(this.getSignatureMap()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSignatureMap() == null) ? 0 : getSignatureMap().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AggregateStatus clone() {
        try {
            return (AggregateStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.AggregateStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
