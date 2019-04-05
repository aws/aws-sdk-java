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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The phone number associations, such as Amazon Chime account ID, Amazon Chime user ID, or Amazon Chime Voice Connector
 * ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PhoneNumberAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhoneNumberAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the ID for the entity specified in Name.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Defines the association with an Amazon Chime account ID, user ID, or Amazon Chime Voice Connector ID.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The timestamp of the phone number association, in ISO 8601 format.
     * </p>
     */
    private java.util.Date associatedTimestamp;

    /**
     * <p>
     * Contains the ID for the entity specified in Name.
     * </p>
     * 
     * @param value
     *        Contains the ID for the entity specified in Name.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Contains the ID for the entity specified in Name.
     * </p>
     * 
     * @return Contains the ID for the entity specified in Name.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Contains the ID for the entity specified in Name.
     * </p>
     * 
     * @param value
     *        Contains the ID for the entity specified in Name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberAssociation withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Defines the association with an Amazon Chime account ID, user ID, or Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @param name
     *        Defines the association with an Amazon Chime account ID, user ID, or Amazon Chime Voice Connector ID.
     * @see PhoneNumberAssociationName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Defines the association with an Amazon Chime account ID, user ID, or Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @return Defines the association with an Amazon Chime account ID, user ID, or Amazon Chime Voice Connector ID.
     * @see PhoneNumberAssociationName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Defines the association with an Amazon Chime account ID, user ID, or Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @param name
     *        Defines the association with an Amazon Chime account ID, user ID, or Amazon Chime Voice Connector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberAssociationName
     */

    public PhoneNumberAssociation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Defines the association with an Amazon Chime account ID, user ID, or Amazon Chime Voice Connector ID.
     * </p>
     * 
     * @param name
     *        Defines the association with an Amazon Chime account ID, user ID, or Amazon Chime Voice Connector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberAssociationName
     */

    public PhoneNumberAssociation withName(PhoneNumberAssociationName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of the phone number association, in ISO 8601 format.
     * </p>
     * 
     * @param associatedTimestamp
     *        The timestamp of the phone number association, in ISO 8601 format.
     */

    public void setAssociatedTimestamp(java.util.Date associatedTimestamp) {
        this.associatedTimestamp = associatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of the phone number association, in ISO 8601 format.
     * </p>
     * 
     * @return The timestamp of the phone number association, in ISO 8601 format.
     */

    public java.util.Date getAssociatedTimestamp() {
        return this.associatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of the phone number association, in ISO 8601 format.
     * </p>
     * 
     * @param associatedTimestamp
     *        The timestamp of the phone number association, in ISO 8601 format.
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
        com.amazonaws.services.chime.model.transform.PhoneNumberAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
