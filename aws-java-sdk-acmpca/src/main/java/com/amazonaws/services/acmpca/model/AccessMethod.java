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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the type and format of extension access. Only one of <code>CustomObjectIdentifier</code> or
 * <code>AccessMethodType</code> may be provided. Providing both results in <code>InvalidArgsException</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/AccessMethod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessMethod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object identifier (OID) specifying the <code>AccessMethod</code>. The OID must satisfy the regular expression
     * shown below. For more information, see NIST's definition of <a
     * href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.
     * </p>
     */
    private String customObjectIdentifier;
    /**
     * <p>
     * Specifies the <code>AccessMethod</code>.
     * </p>
     */
    private String accessMethodType;

    /**
     * <p>
     * An object identifier (OID) specifying the <code>AccessMethod</code>. The OID must satisfy the regular expression
     * shown below. For more information, see NIST's definition of <a
     * href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.
     * </p>
     * 
     * @param customObjectIdentifier
     *        An object identifier (OID) specifying the <code>AccessMethod</code>. The OID must satisfy the regular
     *        expression shown below. For more information, see NIST's definition of <a
     *        href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.
     */

    public void setCustomObjectIdentifier(String customObjectIdentifier) {
        this.customObjectIdentifier = customObjectIdentifier;
    }

    /**
     * <p>
     * An object identifier (OID) specifying the <code>AccessMethod</code>. The OID must satisfy the regular expression
     * shown below. For more information, see NIST's definition of <a
     * href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.
     * </p>
     * 
     * @return An object identifier (OID) specifying the <code>AccessMethod</code>. The OID must satisfy the regular
     *         expression shown below. For more information, see NIST's definition of <a
     *         href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.
     */

    public String getCustomObjectIdentifier() {
        return this.customObjectIdentifier;
    }

    /**
     * <p>
     * An object identifier (OID) specifying the <code>AccessMethod</code>. The OID must satisfy the regular expression
     * shown below. For more information, see NIST's definition of <a
     * href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.
     * </p>
     * 
     * @param customObjectIdentifier
     *        An object identifier (OID) specifying the <code>AccessMethod</code>. The OID must satisfy the regular
     *        expression shown below. For more information, see NIST's definition of <a
     *        href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessMethod withCustomObjectIdentifier(String customObjectIdentifier) {
        setCustomObjectIdentifier(customObjectIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>AccessMethod</code>.
     * </p>
     * 
     * @param accessMethodType
     *        Specifies the <code>AccessMethod</code>.
     * @see AccessMethodType
     */

    public void setAccessMethodType(String accessMethodType) {
        this.accessMethodType = accessMethodType;
    }

    /**
     * <p>
     * Specifies the <code>AccessMethod</code>.
     * </p>
     * 
     * @return Specifies the <code>AccessMethod</code>.
     * @see AccessMethodType
     */

    public String getAccessMethodType() {
        return this.accessMethodType;
    }

    /**
     * <p>
     * Specifies the <code>AccessMethod</code>.
     * </p>
     * 
     * @param accessMethodType
     *        Specifies the <code>AccessMethod</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessMethodType
     */

    public AccessMethod withAccessMethodType(String accessMethodType) {
        setAccessMethodType(accessMethodType);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>AccessMethod</code>.
     * </p>
     * 
     * @param accessMethodType
     *        Specifies the <code>AccessMethod</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessMethodType
     */

    public AccessMethod withAccessMethodType(AccessMethodType accessMethodType) {
        this.accessMethodType = accessMethodType.toString();
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
        if (getCustomObjectIdentifier() != null)
            sb.append("CustomObjectIdentifier: ").append(getCustomObjectIdentifier()).append(",");
        if (getAccessMethodType() != null)
            sb.append("AccessMethodType: ").append(getAccessMethodType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessMethod == false)
            return false;
        AccessMethod other = (AccessMethod) obj;
        if (other.getCustomObjectIdentifier() == null ^ this.getCustomObjectIdentifier() == null)
            return false;
        if (other.getCustomObjectIdentifier() != null && other.getCustomObjectIdentifier().equals(this.getCustomObjectIdentifier()) == false)
            return false;
        if (other.getAccessMethodType() == null ^ this.getAccessMethodType() == null)
            return false;
        if (other.getAccessMethodType() != null && other.getAccessMethodType().equals(this.getAccessMethodType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomObjectIdentifier() == null) ? 0 : getCustomObjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAccessMethodType() == null) ? 0 : getAccessMethodType().hashCode());
        return hashCode;
    }

    @Override
    public AccessMethod clone() {
        try {
            return (AccessMethod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.AccessMethodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
