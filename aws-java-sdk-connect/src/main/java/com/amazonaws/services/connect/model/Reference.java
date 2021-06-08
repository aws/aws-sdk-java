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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A link that an agent selects to complete a given task. You can have up to 4,096 UTF-8 bytes across all references for
 * a contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Reference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Reference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A formatted URL that displays to an agent in the Contact Control Panel (CCP)
     * </p>
     */
    private String value;
    /**
     * <p>
     * A valid URL.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A formatted URL that displays to an agent in the Contact Control Panel (CCP)
     * </p>
     * 
     * @param value
     *        A formatted URL that displays to an agent in the Contact Control Panel (CCP)
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A formatted URL that displays to an agent in the Contact Control Panel (CCP)
     * </p>
     * 
     * @return A formatted URL that displays to an agent in the Contact Control Panel (CCP)
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A formatted URL that displays to an agent in the Contact Control Panel (CCP)
     * </p>
     * 
     * @param value
     *        A formatted URL that displays to an agent in the Contact Control Panel (CCP)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Reference withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * A valid URL.
     * </p>
     * 
     * @param type
     *        A valid URL.
     * @see ReferenceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * A valid URL.
     * </p>
     * 
     * @return A valid URL.
     * @see ReferenceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * A valid URL.
     * </p>
     * 
     * @param type
     *        A valid URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceType
     */

    public Reference withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A valid URL.
     * </p>
     * 
     * @param type
     *        A valid URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceType
     */

    public Reference withType(ReferenceType type) {
        this.type = type.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Reference == false)
            return false;
        Reference other = (Reference) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Reference clone() {
        try {
            return (Reference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
