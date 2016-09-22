/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about the user who made a specified commit.
 * </p>
 */
public class UserInfo implements Serializable, Cloneable {

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
     * The date when the specified commit was pushed to the repository.
     * </p>
     */
    private String dateValue;

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
     * The date when the specified commit was pushed to the repository.
     * </p>
     * 
     * @param dateValue
     *        The date when the specified commit was pushed to the repository.
     */

    public void setDate(String dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * <p>
     * The date when the specified commit was pushed to the repository.
     * </p>
     * 
     * @return The date when the specified commit was pushed to the repository.
     */

    public String getDate() {
        return this.dateValue;
    }

    /**
     * <p>
     * The date when the specified commit was pushed to the repository.
     * </p>
     * 
     * @param dateValue
     *        The date when the specified commit was pushed to the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserInfo withDate(String dateValue) {
        setDate(dateValue);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Name: " + getName() + ",");
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getDate() != null)
            sb.append("Date: " + getDate());
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
}
