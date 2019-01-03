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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains additional data that is needed to process a handshake.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/HandshakeResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HandshakeResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The information that is passed to the other party in the handshake. The format of the value string must match the
     * requirements of the specified type.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The type of information being passed, specifying how the value is to be interpreted by the other party:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Specifies an AWS account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Specifies an organization ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code> - Specifies the email address that is associated with the account that receives the handshake.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_EMAIL</code> - Specifies the email address associated with the master account. Included as
     * information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_NAME</code> - Specifies the name associated with the master account. Included as information about an
     * organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTES</code> - Additional text provided by the handshake initiator and intended for the recipient to read.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * When needed, contains an additional array of <code>HandshakeResource</code> objects.
     * </p>
     */
    private java.util.List<HandshakeResource> resources;

    /**
     * <p>
     * The information that is passed to the other party in the handshake. The format of the value string must match the
     * requirements of the specified type.
     * </p>
     * 
     * @param value
     *        The information that is passed to the other party in the handshake. The format of the value string must
     *        match the requirements of the specified type.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The information that is passed to the other party in the handshake. The format of the value string must match the
     * requirements of the specified type.
     * </p>
     * 
     * @return The information that is passed to the other party in the handshake. The format of the value string must
     *         match the requirements of the specified type.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The information that is passed to the other party in the handshake. The format of the value string must match the
     * requirements of the specified type.
     * </p>
     * 
     * @param value
     *        The information that is passed to the other party in the handshake. The format of the value string must
     *        match the requirements of the specified type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HandshakeResource withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The type of information being passed, specifying how the value is to be interpreted by the other party:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Specifies an AWS account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Specifies an organization ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code> - Specifies the email address that is associated with the account that receives the handshake.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_EMAIL</code> - Specifies the email address associated with the master account. Included as
     * information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_NAME</code> - Specifies the name associated with the master account. Included as information about an
     * organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTES</code> - Additional text provided by the handshake initiator and intended for the recipient to read.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of information being passed, specifying how the value is to be interpreted by the other
     *        party:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACCOUNT</code> - Specifies an AWS account ID number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORGANIZATION</code> - Specifies an organization ID number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMAIL</code> - Specifies the email address that is associated with the account that receives the
     *        handshake.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OWNER_EMAIL</code> - Specifies the email address associated with the master account. Included as
     *        information about an organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OWNER_NAME</code> - Specifies the name associated with the master account. Included as information
     *        about an organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOTES</code> - Additional text provided by the handshake initiator and intended for the recipient to
     *        read.
     *        </p>
     *        </li>
     * @see HandshakeResourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of information being passed, specifying how the value is to be interpreted by the other party:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Specifies an AWS account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Specifies an organization ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code> - Specifies the email address that is associated with the account that receives the handshake.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_EMAIL</code> - Specifies the email address associated with the master account. Included as
     * information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_NAME</code> - Specifies the name associated with the master account. Included as information about an
     * organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTES</code> - Additional text provided by the handshake initiator and intended for the recipient to read.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of information being passed, specifying how the value is to be interpreted by the other
     *         party:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACCOUNT</code> - Specifies an AWS account ID number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ORGANIZATION</code> - Specifies an organization ID number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EMAIL</code> - Specifies the email address that is associated with the account that receives the
     *         handshake.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OWNER_EMAIL</code> - Specifies the email address associated with the master account. Included as
     *         information about an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OWNER_NAME</code> - Specifies the name associated with the master account. Included as information
     *         about an organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOTES</code> - Additional text provided by the handshake initiator and intended for the recipient
     *         to read.
     *         </p>
     *         </li>
     * @see HandshakeResourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of information being passed, specifying how the value is to be interpreted by the other party:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Specifies an AWS account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Specifies an organization ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code> - Specifies the email address that is associated with the account that receives the handshake.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_EMAIL</code> - Specifies the email address associated with the master account. Included as
     * information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_NAME</code> - Specifies the name associated with the master account. Included as information about an
     * organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTES</code> - Additional text provided by the handshake initiator and intended for the recipient to read.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of information being passed, specifying how the value is to be interpreted by the other
     *        party:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACCOUNT</code> - Specifies an AWS account ID number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORGANIZATION</code> - Specifies an organization ID number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMAIL</code> - Specifies the email address that is associated with the account that receives the
     *        handshake.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OWNER_EMAIL</code> - Specifies the email address associated with the master account. Included as
     *        information about an organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OWNER_NAME</code> - Specifies the name associated with the master account. Included as information
     *        about an organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOTES</code> - Additional text provided by the handshake initiator and intended for the recipient to
     *        read.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HandshakeResourceType
     */

    public HandshakeResource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of information being passed, specifying how the value is to be interpreted by the other party:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Specifies an AWS account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Specifies an organization ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code> - Specifies the email address that is associated with the account that receives the handshake.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_EMAIL</code> - Specifies the email address associated with the master account. Included as
     * information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_NAME</code> - Specifies the name associated with the master account. Included as information about an
     * organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTES</code> - Additional text provided by the handshake initiator and intended for the recipient to read.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of information being passed, specifying how the value is to be interpreted by the other
     *        party:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACCOUNT</code> - Specifies an AWS account ID number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORGANIZATION</code> - Specifies an organization ID number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMAIL</code> - Specifies the email address that is associated with the account that receives the
     *        handshake.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OWNER_EMAIL</code> - Specifies the email address associated with the master account. Included as
     *        information about an organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OWNER_NAME</code> - Specifies the name associated with the master account. Included as information
     *        about an organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOTES</code> - Additional text provided by the handshake initiator and intended for the recipient to
     *        read.
     *        </p>
     *        </li>
     * @see HandshakeResourceType
     */

    public void setType(HandshakeResourceType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of information being passed, specifying how the value is to be interpreted by the other party:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCOUNT</code> - Specifies an AWS account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORGANIZATION</code> - Specifies an organization ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMAIL</code> - Specifies the email address that is associated with the account that receives the handshake.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_EMAIL</code> - Specifies the email address associated with the master account. Included as
     * information about an organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OWNER_NAME</code> - Specifies the name associated with the master account. Included as information about an
     * organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTES</code> - Additional text provided by the handshake initiator and intended for the recipient to read.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of information being passed, specifying how the value is to be interpreted by the other
     *        party:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACCOUNT</code> - Specifies an AWS account ID number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORGANIZATION</code> - Specifies an organization ID number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMAIL</code> - Specifies the email address that is associated with the account that receives the
     *        handshake.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OWNER_EMAIL</code> - Specifies the email address associated with the master account. Included as
     *        information about an organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OWNER_NAME</code> - Specifies the name associated with the master account. Included as information
     *        about an organization.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOTES</code> - Additional text provided by the handshake initiator and intended for the recipient to
     *        read.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HandshakeResourceType
     */

    public HandshakeResource withType(HandshakeResourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * When needed, contains an additional array of <code>HandshakeResource</code> objects.
     * </p>
     * 
     * @return When needed, contains an additional array of <code>HandshakeResource</code> objects.
     */

    public java.util.List<HandshakeResource> getResources() {
        return resources;
    }

    /**
     * <p>
     * When needed, contains an additional array of <code>HandshakeResource</code> objects.
     * </p>
     * 
     * @param resources
     *        When needed, contains an additional array of <code>HandshakeResource</code> objects.
     */

    public void setResources(java.util.Collection<HandshakeResource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<HandshakeResource>(resources);
    }

    /**
     * <p>
     * When needed, contains an additional array of <code>HandshakeResource</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        When needed, contains an additional array of <code>HandshakeResource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HandshakeResource withResources(HandshakeResource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<HandshakeResource>(resources.length));
        }
        for (HandshakeResource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * When needed, contains an additional array of <code>HandshakeResource</code> objects.
     * </p>
     * 
     * @param resources
     *        When needed, contains an additional array of <code>HandshakeResource</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HandshakeResource withResources(java.util.Collection<HandshakeResource> resources) {
        setResources(resources);
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
            sb.append("Value: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HandshakeResource == false)
            return false;
        HandshakeResource other = (HandshakeResource) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public HandshakeResource clone() {
        try {
            return (HandshakeResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.HandshakeResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
