/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional information provided by the administrator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UsageInstruction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageInstruction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The usage instruction type for the value.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The usage instruction value for this type.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The usage instruction type for the value.
     * </p>
     * 
     * @param type
     *        The usage instruction type for the value.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The usage instruction type for the value.
     * </p>
     * 
     * @return The usage instruction type for the value.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The usage instruction type for the value.
     * </p>
     * 
     * @param type
     *        The usage instruction type for the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageInstruction withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The usage instruction value for this type.
     * </p>
     * 
     * @param value
     *        The usage instruction value for this type.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The usage instruction value for this type.
     * </p>
     * 
     * @return The usage instruction value for this type.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The usage instruction value for this type.
     * </p>
     * 
     * @param value
     *        The usage instruction value for this type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageInstruction withValue(String value) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof UsageInstruction == false)
            return false;
        UsageInstruction other = (UsageInstruction) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public UsageInstruction clone() {
        try {
            return (UsageInstruction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.UsageInstructionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
