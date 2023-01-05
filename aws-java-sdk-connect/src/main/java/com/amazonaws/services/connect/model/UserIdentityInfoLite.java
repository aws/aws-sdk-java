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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The user's first name and last name.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UserIdentityInfoLite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserIdentityInfoLite implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user's first name.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * The user's last name.
     * </p>
     */
    private String lastName;

    /**
     * <p>
     * The user's first name.
     * </p>
     * 
     * @param firstName
     *        The user's first name.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The user's first name.
     * </p>
     * 
     * @return The user's first name.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * The user's first name.
     * </p>
     * 
     * @param firstName
     *        The user's first name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdentityInfoLite withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * The user's last name.
     * </p>
     * 
     * @param lastName
     *        The user's last name.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The user's last name.
     * </p>
     * 
     * @return The user's last name.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * The user's last name.
     * </p>
     * 
     * @param lastName
     *        The user's last name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdentityInfoLite withLastName(String lastName) {
        setLastName(lastName);
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
            sb.append("FirstName: ").append(getFirstName()).append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append(getLastName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserIdentityInfoLite == false)
            return false;
        UserIdentityInfoLite other = (UserIdentityInfoLite) obj;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        return hashCode;
    }

    @Override
    public UserIdentityInfoLite clone() {
        try {
            return (UserIdentityInfoLite) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.UserIdentityInfoLiteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
