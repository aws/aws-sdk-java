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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the user who made a specified commit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UserInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the user who made the specified commit.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The email address associated with the user who made the commit, if any.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The date when the specified commit was commited, in timestamp format with GMT offset.
     * </p>
     */
    private String date;

    /**
     * <p>
     * The name of the user who made the specified commit.
     * </p>
     * 
     * @param name
     *        The name of the user who made the specified commit.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the user who made the specified commit.
     * </p>
     * 
     * @return The name of the user who made the specified commit.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the user who made the specified commit.
     * </p>
     * 
     * @param name
     *        The name of the user who made the specified commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The email address associated with the user who made the commit, if any.
     * </p>
     * 
     * @param email
     *        The email address associated with the user who made the commit, if any.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address associated with the user who made the commit, if any.
     * </p>
     * 
     * @return The email address associated with the user who made the commit, if any.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address associated with the user who made the commit, if any.
     * </p>
     * 
     * @param email
     *        The email address associated with the user who made the commit, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserInfo withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The date when the specified commit was commited, in timestamp format with GMT offset.
     * </p>
     * 
     * @param date
     *        The date when the specified commit was commited, in timestamp format with GMT offset.
     */

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * <p>
     * The date when the specified commit was commited, in timestamp format with GMT offset.
     * </p>
     * 
     * @return The date when the specified commit was commited, in timestamp format with GMT offset.
     */

    public String getDate() {
        return this.date;
    }

    /**
     * <p>
     * The date when the specified commit was commited, in timestamp format with GMT offset.
     * </p>
     * 
     * @param date
     *        The date when the specified commit was commited, in timestamp format with GMT offset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserInfo withDate(String date) {
        setDate(date);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getDate() != null)
            sb.append("Date: ").append(getDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserInfo == false)
            return false;
        UserInfo other = (UserInfo) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        return hashCode;
    }

    @Override
    public UserInfo clone() {
        try {
            return (UserInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.UserInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
