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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for the superuser.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/SuperuserParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuperuserParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The email address of the superuser.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The first name of the superuser.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * The last name of the superuser.
     * </p>
     */
    private String lastName;

    /**
     * <p>
     * The email address of the superuser.
     * </p>
     * 
     * @param emailAddress
     *        The email address of the superuser.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address of the superuser.
     * </p>
     * 
     * @return The email address of the superuser.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address of the superuser.
     * </p>
     * 
     * @param emailAddress
     *        The email address of the superuser.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuperuserParameters withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The first name of the superuser.
     * </p>
     * 
     * @param firstName
     *        The first name of the superuser.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name of the superuser.
     * </p>
     * 
     * @return The first name of the superuser.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * The first name of the superuser.
     * </p>
     * 
     * @param firstName
     *        The first name of the superuser.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuperuserParameters withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * The last name of the superuser.
     * </p>
     * 
     * @param lastName
     *        The last name of the superuser.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name of the superuser.
     * </p>
     * 
     * @return The last name of the superuser.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * The last name of the superuser.
     * </p>
     * 
     * @param lastName
     *        The last name of the superuser.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuperuserParameters withLastName(String lastName) {
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
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof SuperuserParameters == false)
            return false;
        SuperuserParameters other = (SuperuserParameters) obj;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        return hashCode;
    }

    @Override
    public SuperuserParameters clone() {
        try {
            return (SuperuserParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.SuperuserParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
