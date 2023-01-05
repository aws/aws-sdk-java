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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PhoneNumberAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhoneNumberAssociation implements Serializable, Cloneable, StructuredPojo {

    private String value;

    private String name;

    private java.util.Date associatedTimestamp;

    /**
     * @param value
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return
     */

    public String getValue() {
        return this.value;
    }

    /**
     * @param value
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberAssociation withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * @param name
     * @see PhoneNumberAssociationName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     * @see PhoneNumberAssociationName
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberAssociationName
     */

    public PhoneNumberAssociation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberAssociationName
     */

    public PhoneNumberAssociation withName(PhoneNumberAssociationName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * @param associatedTimestamp
     */

    public void setAssociatedTimestamp(java.util.Date associatedTimestamp) {
        this.associatedTimestamp = associatedTimestamp;
    }

    /**
     * @return
     */

    public java.util.Date getAssociatedTimestamp() {
        return this.associatedTimestamp;
    }

    /**
     * @param associatedTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberAssociation withAssociatedTimestamp(java.util.Date associatedTimestamp) {
        setAssociatedTimestamp(associatedTimestamp);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAssociatedTimestamp() != null)
            sb.append("AssociatedTimestamp: ").append(getAssociatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumberAssociation == false)
            return false;
        PhoneNumberAssociation other = (PhoneNumberAssociation) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAssociatedTimestamp() == null ^ this.getAssociatedTimestamp() == null)
            return false;
        if (other.getAssociatedTimestamp() != null && other.getAssociatedTimestamp().equals(this.getAssociatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAssociatedTimestamp() == null) ? 0 : getAssociatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public PhoneNumberAssociation clone() {
        try {
            return (PhoneNumberAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.PhoneNumberAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
