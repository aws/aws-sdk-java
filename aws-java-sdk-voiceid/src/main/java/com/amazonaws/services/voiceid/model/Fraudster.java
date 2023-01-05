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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains all the information about a fraudster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/Fraudster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Fraudster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp when Voice ID identified the fraudster.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The identifier for the domain containing the fraudster.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The service-generated identifier for the fraudster.
     * </p>
     */
    private String generatedFraudsterId;

    /**
     * <p>
     * The timestamp when Voice ID identified the fraudster.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when Voice ID identified the fraudster.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when Voice ID identified the fraudster.
     * </p>
     * 
     * @return The timestamp when Voice ID identified the fraudster.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when Voice ID identified the fraudster.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when Voice ID identified the fraudster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fraudster withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The identifier for the domain containing the fraudster.
     * </p>
     * 
     * @param domainId
     *        The identifier for the domain containing the fraudster.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier for the domain containing the fraudster.
     * </p>
     * 
     * @return The identifier for the domain containing the fraudster.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier for the domain containing the fraudster.
     * </p>
     * 
     * @param domainId
     *        The identifier for the domain containing the fraudster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fraudster withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The service-generated identifier for the fraudster.
     * </p>
     * 
     * @param generatedFraudsterId
     *        The service-generated identifier for the fraudster.
     */

    public void setGeneratedFraudsterId(String generatedFraudsterId) {
        this.generatedFraudsterId = generatedFraudsterId;
    }

    /**
     * <p>
     * The service-generated identifier for the fraudster.
     * </p>
     * 
     * @return The service-generated identifier for the fraudster.
     */

    public String getGeneratedFraudsterId() {
        return this.generatedFraudsterId;
    }

    /**
     * <p>
     * The service-generated identifier for the fraudster.
     * </p>
     * 
     * @param generatedFraudsterId
     *        The service-generated identifier for the fraudster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fraudster withGeneratedFraudsterId(String generatedFraudsterId) {
        setGeneratedFraudsterId(generatedFraudsterId);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getGeneratedFraudsterId() != null)
            sb.append("GeneratedFraudsterId: ").append(getGeneratedFraudsterId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Fraudster == false)
            return false;
        Fraudster other = (Fraudster) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getGeneratedFraudsterId() == null ^ this.getGeneratedFraudsterId() == null)
            return false;
        if (other.getGeneratedFraudsterId() != null && other.getGeneratedFraudsterId().equals(this.getGeneratedFraudsterId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getGeneratedFraudsterId() == null) ? 0 : getGeneratedFraudsterId().hashCode());
        return hashCode;
    }

    @Override
    public Fraudster clone() {
        try {
            return (Fraudster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.FraudsterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
