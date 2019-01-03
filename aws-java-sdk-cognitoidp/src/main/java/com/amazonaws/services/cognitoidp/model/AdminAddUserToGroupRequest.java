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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminAddUserToGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminAddUserToGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The username for the user.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The group name.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * 
     * @return The user pool ID for the user pool.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminAddUserToGroupRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The username for the user.
     * </p>
     * 
     * @param username
     *        The username for the user.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username for the user.
     * </p>
     * 
     * @return The username for the user.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The username for the user.
     * </p>
     * 
     * @param username
     *        The username for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminAddUserToGroupRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The group name.
     * </p>
     * 
     * @param groupName
     *        The group name.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The group name.
     * </p>
     * 
     * @return The group name.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The group name.
     * </p>
     * 
     * @param groupName
     *        The group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminAddUserToGroupRequest withGroupName(String groupName) {
        setGroupName(groupName);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***").append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminAddUserToGroupRequest == false)
            return false;
        AdminAddUserToGroupRequest other = (AdminAddUserToGroupRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        return hashCode;
    }

    @Override
    public AdminAddUserToGroupRequest clone() {
        return (AdminAddUserToGroupRequest) super.clone();
    }

}
