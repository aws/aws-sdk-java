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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the grantee.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Grantee implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Type of grantee
     * </p>
     */
    private String type;
    /**
     * <p>
     * Screen name of the grantee.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * URI of the grantee group.
     * </p>
     */
    private String uRI;
    /**
     * <p>
     * The canonical user ID of the grantee.
     * </p>
     */
    private String iD;
    /**
     * <p>
     * Email address of the grantee.
     * </p>
     */
    private String emailAddress;

    /**
     * <p>
     * Type of grantee
     * </p>
     * 
     * @param type
     *        Type of grantee
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of grantee
     * </p>
     * 
     * @return Type of grantee
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of grantee
     * </p>
     * 
     * @param type
     *        Type of grantee
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public Grantee withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of grantee
     * </p>
     * 
     * @param type
     *        Type of grantee
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public Grantee withType(Type type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Screen name of the grantee.
     * </p>
     * 
     * @param displayName
     *        Screen name of the grantee.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * Screen name of the grantee.
     * </p>
     * 
     * @return Screen name of the grantee.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * Screen name of the grantee.
     * </p>
     * 
     * @param displayName
     *        Screen name of the grantee.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grantee withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * URI of the grantee group.
     * </p>
     * 
     * @param uRI
     *        URI of the grantee group.
     */

    public void setURI(String uRI) {
        this.uRI = uRI;
    }

    /**
     * <p>
     * URI of the grantee group.
     * </p>
     * 
     * @return URI of the grantee group.
     */

    public String getURI() {
        return this.uRI;
    }

    /**
     * <p>
     * URI of the grantee group.
     * </p>
     * 
     * @param uRI
     *        URI of the grantee group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grantee withURI(String uRI) {
        setURI(uRI);
        return this;
    }

    /**
     * <p>
     * The canonical user ID of the grantee.
     * </p>
     * 
     * @param iD
     *        The canonical user ID of the grantee.
     */

    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     * <p>
     * The canonical user ID of the grantee.
     * </p>
     * 
     * @return The canonical user ID of the grantee.
     */

    public String getID() {
        return this.iD;
    }

    /**
     * <p>
     * The canonical user ID of the grantee.
     * </p>
     * 
     * @param iD
     *        The canonical user ID of the grantee.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grantee withID(String iD) {
        setID(iD);
        return this;
    }

    /**
     * <p>
     * Email address of the grantee.
     * </p>
     * 
     * @param emailAddress
     *        Email address of the grantee.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * Email address of the grantee.
     * </p>
     * 
     * @return Email address of the grantee.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * Email address of the grantee.
     * </p>
     * 
     * @param emailAddress
     *        Email address of the grantee.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grantee withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getURI() != null)
            sb.append("URI: ").append(getURI()).append(",");
        if (getID() != null)
            sb.append("ID: ").append(getID()).append(",");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Grantee == false)
            return false;
        Grantee other = (Grantee) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getURI() == null ^ this.getURI() == null)
            return false;
        if (other.getURI() != null && other.getURI().equals(this.getURI()) == false)
            return false;
        if (other.getID() == null ^ this.getID() == null)
            return false;
        if (other.getID() != null && other.getID().equals(this.getID()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getURI() == null) ? 0 : getURI().hashCode());
        hashCode = prime * hashCode + ((getID() == null) ? 0 : getID().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        return hashCode;
    }

    @Override
    public Grantee clone() {
        try {
            return (Grantee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.GranteeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
