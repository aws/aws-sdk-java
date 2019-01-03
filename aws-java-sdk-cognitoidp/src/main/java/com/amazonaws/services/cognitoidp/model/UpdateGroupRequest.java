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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * A string containing the new description of the group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The new role ARN for the group. This is used for setting the <code>cognito:roles</code> and
     * <code>cognito:preferred_role</code> claims in the token.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The new precedence value for the group. For more information about this parameter, see .
     * </p>
     */
    private Integer precedence;

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param groupName
     *        The name of the group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param groupName
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGroupRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

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

    public UpdateGroupRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * A string containing the new description of the group.
     * </p>
     * 
     * @param description
     *        A string containing the new description of the group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A string containing the new description of the group.
     * </p>
     * 
     * @return A string containing the new description of the group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A string containing the new description of the group.
     * </p>
     * 
     * @param description
     *        A string containing the new description of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The new role ARN for the group. This is used for setting the <code>cognito:roles</code> and
     * <code>cognito:preferred_role</code> claims in the token.
     * </p>
     * 
     * @param roleArn
     *        The new role ARN for the group. This is used for setting the <code>cognito:roles</code> and
     *        <code>cognito:preferred_role</code> claims in the token.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The new role ARN for the group. This is used for setting the <code>cognito:roles</code> and
     * <code>cognito:preferred_role</code> claims in the token.
     * </p>
     * 
     * @return The new role ARN for the group. This is used for setting the <code>cognito:roles</code> and
     *         <code>cognito:preferred_role</code> claims in the token.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The new role ARN for the group. This is used for setting the <code>cognito:roles</code> and
     * <code>cognito:preferred_role</code> claims in the token.
     * </p>
     * 
     * @param roleArn
     *        The new role ARN for the group. This is used for setting the <code>cognito:roles</code> and
     *        <code>cognito:preferred_role</code> claims in the token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGroupRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The new precedence value for the group. For more information about this parameter, see .
     * </p>
     * 
     * @param precedence
     *        The new precedence value for the group. For more information about this parameter, see .
     */

    public void setPrecedence(Integer precedence) {
        this.precedence = precedence;
    }

    /**
     * <p>
     * The new precedence value for the group. For more information about this parameter, see .
     * </p>
     * 
     * @return The new precedence value for the group. For more information about this parameter, see .
     */

    public Integer getPrecedence() {
        return this.precedence;
    }

    /**
     * <p>
     * The new precedence value for the group. For more information about this parameter, see .
     * </p>
     * 
     * @param precedence
     *        The new precedence value for the group. For more information about this parameter, see .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGroupRequest withPrecedence(Integer precedence) {
        setPrecedence(precedence);
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getPrecedence() != null)
            sb.append("Precedence: ").append(getPrecedence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGroupRequest == false)
            return false;
        UpdateGroupRequest other = (UpdateGroupRequest) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getPrecedence() == null ^ this.getPrecedence() == null)
            return false;
        if (other.getPrecedence() != null && other.getPrecedence().equals(this.getPrecedence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getPrecedence() == null) ? 0 : getPrecedence().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGroupRequest clone() {
        return (UpdateGroupRequest) super.clone();
    }

}
