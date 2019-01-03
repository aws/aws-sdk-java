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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the metadata of the user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UserMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the user.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the user.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The given name of the user before a rename operation.
     * </p>
     */
    private String givenName;
    /**
     * <p>
     * The surname of the user.
     * </p>
     */
    private String surname;
    /**
     * <p>
     * The email address of the user.
     * </p>
     */
    private String emailAddress;

    /**
     * <p>
     * The ID of the user.
     * </p>
     * 
     * @param id
     *        The ID of the user.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the user.
     * </p>
     * 
     * @return The ID of the user.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the user.
     * </p>
     * 
     * @param id
     *        The ID of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserMetadata withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param username
     *        The name of the user.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @return The name of the user.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param username
     *        The name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserMetadata withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The given name of the user before a rename operation.
     * </p>
     * 
     * @param givenName
     *        The given name of the user before a rename operation.
     */

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * <p>
     * The given name of the user before a rename operation.
     * </p>
     * 
     * @return The given name of the user before a rename operation.
     */

    public String getGivenName() {
        return this.givenName;
    }

    /**
     * <p>
     * The given name of the user before a rename operation.
     * </p>
     * 
     * @param givenName
     *        The given name of the user before a rename operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserMetadata withGivenName(String givenName) {
        setGivenName(givenName);
        return this;
    }

    /**
     * <p>
     * The surname of the user.
     * </p>
     * 
     * @param surname
     *        The surname of the user.
     */

    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * <p>
     * The surname of the user.
     * </p>
     * 
     * @return The surname of the user.
     */

    public String getSurname() {
        return this.surname;
    }

    /**
     * <p>
     * The surname of the user.
     * </p>
     * 
     * @param surname
     *        The surname of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserMetadata withSurname(String surname) {
        setSurname(surname);
        return this;
    }

    /**
     * <p>
     * The email address of the user.
     * </p>
     * 
     * @param emailAddress
     *        The email address of the user.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address of the user.
     * </p>
     * 
     * @return The email address of the user.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address of the user.
     * </p>
     * 
     * @param emailAddress
     *        The email address of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserMetadata withEmailAddress(String emailAddress) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getGivenName() != null)
            sb.append("GivenName: ").append(getGivenName()).append(",");
        if (getSurname() != null)
            sb.append("Surname: ").append(getSurname()).append(",");
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

        if (obj instanceof UserMetadata == false)
            return false;
        UserMetadata other = (UserMetadata) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getGivenName() == null ^ this.getGivenName() == null)
            return false;
        if (other.getGivenName() != null && other.getGivenName().equals(this.getGivenName()) == false)
            return false;
        if (other.getSurname() == null ^ this.getSurname() == null)
            return false;
        if (other.getSurname() != null && other.getSurname().equals(this.getSurname()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getGivenName() == null) ? 0 : getGivenName().hashCode());
        hashCode = prime * hashCode + ((getSurname() == null) ? 0 : getSurname().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        return hashCode;
    }

    @Override
    public UserMetadata clone() {
        try {
            return (UserMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.UserMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
