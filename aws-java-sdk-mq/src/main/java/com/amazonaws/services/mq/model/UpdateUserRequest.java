/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the information for an ActiveMQ user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
     */
    private String brokerId;
    /**
     * <p>
     * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * </p>
     */
    private Boolean consoleAccess;
    /**
     * <p>
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * </p>
     */
    private java.util.List<String> groups;
    /**
     * <p>
     * The password of the user. This value must be at least 12 characters long, must contain at least 4 unique
     * characters, and must not contain commas, colons, or equal signs (,:=).
     * </p>
     */
    private String password;
    /**
     * <p>
     * The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
     * 
     * @param brokerId
     *        The unique ID that Amazon MQ generates for the broker.
     */

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
     * 
     * @return The unique ID that Amazon MQ generates for the broker.
     */

    public String getBrokerId() {
        return this.brokerId;
    }

    /**
     * <p>
     * The unique ID that Amazon MQ generates for the broker.
     * </p>
     * 
     * @param brokerId
     *        The unique ID that Amazon MQ generates for the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withBrokerId(String brokerId) {
        setBrokerId(brokerId);
        return this;
    }

    /**
     * <p>
     * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * </p>
     * 
     * @param consoleAccess
     *        Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     */

    public void setConsoleAccess(Boolean consoleAccess) {
        this.consoleAccess = consoleAccess;
    }

    /**
     * <p>
     * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * </p>
     * 
     * @return Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     */

    public Boolean getConsoleAccess() {
        return this.consoleAccess;
    }

    /**
     * <p>
     * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * </p>
     * 
     * @param consoleAccess
     *        Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withConsoleAccess(Boolean consoleAccess) {
        setConsoleAccess(consoleAccess);
        return this;
    }

    /**
     * <p>
     * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * </p>
     * 
     * @return Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     */

    public Boolean isConsoleAccess() {
        return this.consoleAccess;
    }

    /**
     * <p>
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * </p>
     * 
     * @return The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *         alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *         characters long.
     */

    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * </p>
     * 
     * @param groups
     *        The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *        alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *        characters long.
     */

    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<String>(groups);
    }

    /**
     * <p>
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *        alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *        characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withGroups(String... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<String>(groups.length));
        }
        for (String ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * </p>
     * 
     * @param groups
     *        The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *        alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *        characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The password of the user. This value must be at least 12 characters long, must contain at least 4 unique
     * characters, and must not contain commas, colons, or equal signs (,:=).
     * </p>
     * 
     * @param password
     *        The password of the user. This value must be at least 12 characters long, must contain at least 4 unique
     *        characters, and must not contain commas, colons, or equal signs (,:=).
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password of the user. This value must be at least 12 characters long, must contain at least 4 unique
     * characters, and must not contain commas, colons, or equal signs (,:=).
     * </p>
     * 
     * @return The password of the user. This value must be at least 12 characters long, must contain at least 4 unique
     *         characters, and must not contain commas, colons, or equal signs (,:=).
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password of the user. This value must be at least 12 characters long, must contain at least 4 unique
     * characters, and must not contain commas, colons, or equal signs (,:=).
     * </p>
     * 
     * @param password
     *        The password of the user. This value must be at least 12 characters long, must contain at least 4 unique
     *        characters, and must not contain commas, colons, or equal signs (,:=).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * </p>
     * 
     * @param username
     *        The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods,
     *        underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * </p>
     * 
     * @return The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods,
     *         underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods,
     * underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * </p>
     * 
     * @param username
     *        The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods,
     *        underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUsername(String username) {
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
        if (getBrokerId() != null)
            sb.append("BrokerId: ").append(getBrokerId()).append(",");
        if (getConsoleAccess() != null)
            sb.append("ConsoleAccess: ").append(getConsoleAccess()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append(getPassword()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserRequest == false)
            return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;
        if (other.getBrokerId() == null ^ this.getBrokerId() == null)
            return false;
        if (other.getBrokerId() != null && other.getBrokerId().equals(this.getBrokerId()) == false)
            return false;
        if (other.getConsoleAccess() == null ^ this.getConsoleAccess() == null)
            return false;
        if (other.getConsoleAccess() != null && other.getConsoleAccess().equals(this.getConsoleAccess()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
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

        hashCode = prime * hashCode + ((getBrokerId() == null) ? 0 : getBrokerId().hashCode());
        hashCode = prime * hashCode + ((getConsoleAccess() == null) ? 0 : getConsoleAccess().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserRequest clone() {
        return (UpdateUserRequest) super.clone();
    }

}
