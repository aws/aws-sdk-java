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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The single sign-on details of the user profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SsoUserProfileDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SsoUserProfileDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The first name included in the single sign-on details of the user profile.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * The last name included in the single sign-on details of the user profile.
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * The username included in the single sign-on details of the user profile.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The first name included in the single sign-on details of the user profile.
     * </p>
     * 
     * @param firstName
     *        The first name included in the single sign-on details of the user profile.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name included in the single sign-on details of the user profile.
     * </p>
     * 
     * @return The first name included in the single sign-on details of the user profile.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * The first name included in the single sign-on details of the user profile.
     * </p>
     * 
     * @param firstName
     *        The first name included in the single sign-on details of the user profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsoUserProfileDetails withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * The last name included in the single sign-on details of the user profile.
     * </p>
     * 
     * @param lastName
     *        The last name included in the single sign-on details of the user profile.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name included in the single sign-on details of the user profile.
     * </p>
     * 
     * @return The last name included in the single sign-on details of the user profile.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * The last name included in the single sign-on details of the user profile.
     * </p>
     * 
     * @param lastName
     *        The last name included in the single sign-on details of the user profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsoUserProfileDetails withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * The username included in the single sign-on details of the user profile.
     * </p>
     * 
     * @param username
     *        The username included in the single sign-on details of the user profile.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username included in the single sign-on details of the user profile.
     * </p>
     * 
     * @return The username included in the single sign-on details of the user profile.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The username included in the single sign-on details of the user profile.
     * </p>
     * 
     * @param username
     *        The username included in the single sign-on details of the user profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsoUserProfileDetails withUsername(String username) {
        setUsername(username);
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
        if (getFirstName() != null)
            sb.append("FirstName: ").append("***Sensitive Data Redacted***").append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append("***Sensitive Data Redacted***").append(",");
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SsoUserProfileDetails == false)
            return false;
        SsoUserProfileDetails other = (SsoUserProfileDetails) obj;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public SsoUserProfileDetails clone() {
        try {
            return (SsoUserProfileDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.SsoUserProfileDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
