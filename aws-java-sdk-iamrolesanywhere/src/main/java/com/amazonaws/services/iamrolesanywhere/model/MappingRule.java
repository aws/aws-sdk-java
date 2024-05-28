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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single mapping entry for each supported specifier or sub-field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/MappingRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MappingRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifier within a certificate field, such as CN, OU, or UID from the Subject field.
     * </p>
     */
    private String specifier;

    /**
     * <p>
     * Specifier within a certificate field, such as CN, OU, or UID from the Subject field.
     * </p>
     * 
     * @param specifier
     *        Specifier within a certificate field, such as CN, OU, or UID from the Subject field.
     */

    public void setSpecifier(String specifier) {
        this.specifier = specifier;
    }

    /**
     * <p>
     * Specifier within a certificate field, such as CN, OU, or UID from the Subject field.
     * </p>
     * 
     * @return Specifier within a certificate field, such as CN, OU, or UID from the Subject field.
     */

    public String getSpecifier() {
        return this.specifier;
    }

    /**
     * <p>
     * Specifier within a certificate field, such as CN, OU, or UID from the Subject field.
     * </p>
     * 
     * @param specifier
     *        Specifier within a certificate field, such as CN, OU, or UID from the Subject field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MappingRule withSpecifier(String specifier) {
        setSpecifier(specifier);
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
        if (getSpecifier() != null)
            sb.append("Specifier: ").append(getSpecifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MappingRule == false)
            return false;
        MappingRule other = (MappingRule) obj;
        if (other.getSpecifier() == null ^ this.getSpecifier() == null)
            return false;
        if (other.getSpecifier() != null && other.getSpecifier().equals(this.getSpecifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpecifier() == null) ? 0 : getSpecifier().hashCode());
        return hashCode;
    }

    @Override
    public MappingRule clone() {
        try {
            return (MappingRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iamrolesanywhere.model.transform.MappingRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
