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
 * <p/>
 * <p>
 * Specifies the X.509 extension information for a certificate.
 * </p>
 * <p>
 * Extensions present in <code>CustomExtensions</code> follow the <code>ApiPassthrough</code> <a
 * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html#template-order-of-operations">template
 * rules</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CustomExtension" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomExtension implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p/>
     * <p>
     * Specifies the object identifier (OID) of the X.509 extension. For more information, see the <a
     * href="https://oidref.com/2.5.29">Global OID reference database.</a>
     * </p>
     */
    private String objectIdentifier;
    /**
     * <p/>
     * <p>
     * Specifies the base64-encoded value of the X.509 extension.
     * </p>
     */
    private String value;
    /**
     * <p/>
     * <p>
     * Specifies the critical flag of the X.509 extension.
     * </p>
     */
    private Boolean critical;

    /**
     * <p/>
     * <p>
     * Specifies the object identifier (OID) of the X.509 extension. For more information, see the <a
     * href="https://oidref.com/2.5.29">Global OID reference database.</a>
     * </p>
     * 
     * @param objectIdentifier
     *        <p>
     *        Specifies the object identifier (OID) of the X.509 extension. For more information, see the <a
     *        href="https://oidref.com/2.5.29">Global OID reference database.</a>
     */

    public void setObjectIdentifier(String objectIdentifier) {
        this.objectIdentifier = objectIdentifier;
    }

    /**
     * <p/>
     * <p>
     * Specifies the object identifier (OID) of the X.509 extension. For more information, see the <a
     * href="https://oidref.com/2.5.29">Global OID reference database.</a>
     * </p>
     * 
     * @return <p>
     *         Specifies the object identifier (OID) of the X.509 extension. For more information, see the <a
     *         href="https://oidref.com/2.5.29">Global OID reference database.</a>
     */

    public String getObjectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * <p/>
     * <p>
     * Specifies the object identifier (OID) of the X.509 extension. For more information, see the <a
     * href="https://oidref.com/2.5.29">Global OID reference database.</a>
     * </p>
     * 
     * @param objectIdentifier
     *        <p>
     *        Specifies the object identifier (OID) of the X.509 extension. For more information, see the <a
     *        href="https://oidref.com/2.5.29">Global OID reference database.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomExtension withObjectIdentifier(String objectIdentifier) {
        setObjectIdentifier(objectIdentifier);
        return this;
    }

    /**
     * <p/>
     * <p>
     * Specifies the base64-encoded value of the X.509 extension.
     * </p>
     * 
     * @param value
     *        <p>
     *        Specifies the base64-encoded value of the X.509 extension.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p/>
     * <p>
     * Specifies the base64-encoded value of the X.509 extension.
     * </p>
     * 
     * @return <p>
     *         Specifies the base64-encoded value of the X.509 extension.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p/>
     * <p>
     * Specifies the base64-encoded value of the X.509 extension.
     * </p>
     * 
     * @param value
     *        <p>
     *        Specifies the base64-encoded value of the X.509 extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomExtension withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p/>
     * <p>
     * Specifies the critical flag of the X.509 extension.
     * </p>
     * 
     * @param critical
     *        <p>
     *        Specifies the critical flag of the X.509 extension.
     */

    public void setCritical(Boolean critical) {
        this.critical = critical;
    }

    /**
     * <p/>
     * <p>
     * Specifies the critical flag of the X.509 extension.
     * </p>
     * 
     * @return <p>
     *         Specifies the critical flag of the X.509 extension.
     */

    public Boolean getCritical() {
        return this.critical;
    }

    /**
     * <p/>
     * <p>
     * Specifies the critical flag of the X.509 extension.
     * </p>
     * 
     * @param critical
     *        <p>
     *        Specifies the critical flag of the X.509 extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomExtension withCritical(Boolean critical) {
        setCritical(critical);
        return this;
    }

    /**
     * <p/>
     * <p>
     * Specifies the critical flag of the X.509 extension.
     * </p>
     * 
     * @return <p>
     *         Specifies the critical flag of the X.509 extension.
     */

    public Boolean isCritical() {
        return this.critical;
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
            sb.append("Value: ").append(getValue()).append(",");
        if (getCritical() != null)
            sb.append("Critical: ").append(getCritical());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomExtension == false)
            return false;
        CustomExtension other = (CustomExtension) obj;
        if (other.getObjectIdentifier() == null ^ this.getObjectIdentifier() == null)
            return false;
        if (other.getObjectIdentifier() != null && other.getObjectIdentifier().equals(this.getObjectIdentifier()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getCritical() == null ^ this.getCritical() == null)
            return false;
        if (other.getCritical() != null && other.getCritical().equals(this.getCritical()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectIdentifier() == null) ? 0 : getObjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getCritical() == null) ? 0 : getCritical().hashCode());
        return hashCode;
    }

    @Override
    public CustomExtension clone() {
        try {
            return (CustomExtension) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.CustomExtensionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
