/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the attack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AttackVectorDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttackVectorDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attack type, for example, SNMP reflection or SYN flood.
     * </p>
     */
    private String vectorType;

    /**
     * <p>
     * The attack type, for example, SNMP reflection or SYN flood.
     * </p>
     * 
     * @param vectorType
     *        The attack type, for example, SNMP reflection or SYN flood.
     */

    public void setVectorType(String vectorType) {
        this.vectorType = vectorType;
    }

    /**
     * <p>
     * The attack type, for example, SNMP reflection or SYN flood.
     * </p>
     * 
     * @return The attack type, for example, SNMP reflection or SYN flood.
     */

    public String getVectorType() {
        return this.vectorType;
    }

    /**
     * <p>
     * The attack type, for example, SNMP reflection or SYN flood.
     * </p>
     * 
     * @param vectorType
     *        The attack type, for example, SNMP reflection or SYN flood.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttackVectorDescription withVectorType(String vectorType) {
        setVectorType(vectorType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVectorType() != null)
            sb.append("VectorType: ").append(getVectorType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttackVectorDescription == false)
            return false;
        AttackVectorDescription other = (AttackVectorDescription) obj;
        if (other.getVectorType() == null ^ this.getVectorType() == null)
            return false;
        if (other.getVectorType() != null && other.getVectorType().equals(this.getVectorType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVectorType() == null) ? 0 : getVectorType().hashCode());
        return hashCode;
    }

    @Override
    public AttackVectorDescription clone() {
        try {
            return (AttackVectorDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.AttackVectorDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
