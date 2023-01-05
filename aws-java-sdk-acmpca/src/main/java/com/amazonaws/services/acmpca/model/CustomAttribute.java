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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the X.500 relative distinguished name (RDN).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CustomAttribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomAttribute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the object identifier (OID) of the attribute type of the relative distinguished name (RDN).
     * </p>
     */
    private String objectIdentifier;
    /**
     * <p/>
     * <p>
     * Specifies the attribute value of relative distinguished name (RDN).
     * </p>
     */
    private String value;

    /**
     * <p>
     * Specifies the object identifier (OID) of the attribute type of the relative distinguished name (RDN).
     * </p>
     * 
     * @param objectIdentifier
     *        Specifies the object identifier (OID) of the attribute type of the relative distinguished name (RDN).
     */

    public void setObjectIdentifier(String objectIdentifier) {
        this.objectIdentifier = objectIdentifier;
    }

    /**
     * <p>
     * Specifies the object identifier (OID) of the attribute type of the relative distinguished name (RDN).
     * </p>
     * 
     * @return Specifies the object identifier (OID) of the attribute type of the relative distinguished name (RDN).
     */

    public String getObjectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * <p>
     * Specifies the object identifier (OID) of the attribute type of the relative distinguished name (RDN).
     * </p>
     * 
     * @param objectIdentifier
     *        Specifies the object identifier (OID) of the attribute type of the relative distinguished name (RDN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAttribute withObjectIdentifier(String objectIdentifier) {
        setObjectIdentifier(objectIdentifier);
        return this;
    }

    /**
     * <p/>
     * <p>
     * Specifies the attribute value of relative distinguished name (RDN).
     * </p>
     * 
     * @param value
     *        <p>
     *        Specifies the attribute value of relative distinguished name (RDN).
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p/>
     * <p>
     * Specifies the attribute value of relative distinguished name (RDN).
     * </p>
     * 
     * @return <p>
     *         Specifies the attribute value of relative distinguished name (RDN).
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p/>
     * <p>
     * Specifies the attribute value of relative distinguished name (RDN).
     * </p>
     * 
     * @param value
     *        <p>
     *        Specifies the attribute value of relative distinguished name (RDN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAttribute withValue(String value) {
        setValue(value);
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
        if (getObjectIdentifier() != null)
            sb.append("ObjectIdentifier: ").append(getObjectIdentifier()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomAttribute == false)
            return false;
        CustomAttribute other = (CustomAttribute) obj;
        if (other.getObjectIdentifier() == null ^ this.getObjectIdentifier() == null)
            return false;
        if (other.getObjectIdentifier() != null && other.getObjectIdentifier().equals(this.getObjectIdentifier()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectIdentifier() == null) ? 0 : getObjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public CustomAttribute clone() {
        try {
            return (CustomAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.CustomAttributeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
