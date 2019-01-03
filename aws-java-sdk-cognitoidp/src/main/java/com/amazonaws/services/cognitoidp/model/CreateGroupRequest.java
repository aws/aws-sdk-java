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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the group. Must be unique.
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
     * A string containing the description of the group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The role ARN for the group.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A nonnegative integer value that specifies the precedence of this group relative to the other groups that a user
     * can belong to in the user pool. Zero is the highest precedence value. Groups with lower <code>Precedence</code>
     * values take precedence over groups with higher or null <code>Precedence</code> values. If a user belongs to two
     * or more groups, it is the group with the lowest precedence value whose role ARN will be used in the
     * <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims in the user's tokens.
     * </p>
     * <p>
     * Two groups can have the same <code>Precedence</code> value. If this happens, neither group takes precedence over
     * the other. If two groups with the same <code>Precedence</code> have the same role ARN, that role is used in the
     * <code>cognito:preferred_role</code> claim in tokens for users in each group. If the two groups have different
     * role ARNs, the <code>cognito:preferred_role</code> claim is not set in users' tokens.
     * </p>
     * <p>
     * The default <code>Precedence</code> value is null.
     * </p>
     */
    private Integer precedence;

    /**
     * <p>
     * The name of the group. Must be unique.
     * </p>
     * 
     * @param groupName
     *        The name of the group. Must be unique.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group. Must be unique.
     * </p>
     * 
     * @return The name of the group. Must be unique.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the group. Must be unique.
     * </p>
     * 
     * @param groupName
     *        The name of the group. Must be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withGroupName(String groupName) {
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

    public CreateGroupRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * A string containing the description of the group.
     * </p>
     * 
     * @param description
     *        A string containing the description of the group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A string containing the description of the group.
     * </p>
     * 
     * @return A string containing the description of the group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A string containing the description of the group.
     * </p>
     * 
     * @param description
     *        A string containing the description of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The role ARN for the group.
     * </p>
     * 
     * @param roleArn
     *        The role ARN for the group.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The role ARN for the group.
     * </p>
     * 
     * @return The role ARN for the group.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The role ARN for the group.
     * </p>
     * 
     * @param roleArn
     *        The role ARN for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A nonnegative integer value that specifies the precedence of this group relative to the other groups that a user
     * can belong to in the user pool. Zero is the highest precedence value. Groups with lower <code>Precedence</code>
     * values take precedence over groups with higher or null <code>Precedence</code> values. If a user belongs to two
     * or more groups, it is the group with the lowest precedence value whose role ARN will be used in the
     * <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims in the user's tokens.
     * </p>
     * <p>
     * Two groups can have the same <code>Precedence</code> value. If this happens, neither group takes precedence over
     * the other. If two groups with the same <code>Precedence</code> have the same role ARN, that role is used in the
     * <code>cognito:preferred_role</code> claim in tokens for users in each group. If the two groups have different
     * role ARNs, the <code>cognito:preferred_role</code> claim is not set in users' tokens.
     * </p>
     * <p>
     * The default <code>Precedence</code> value is null.
     * </p>
     * 
     * @param precedence
     *        A nonnegative integer value that specifies the precedence of this group relative to the other groups that
     *        a user can belong to in the user pool. Zero is the highest precedence value. Groups with lower
     *        <code>Precedence</code> values take precedence over groups with higher or null <code>Precedence</code>
     *        values. If a user belongs to two or more groups, it is the group with the lowest precedence value whose
     *        role ARN will be used in the <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims in
     *        the user's tokens.</p>
     *        <p>
     *        Two groups can have the same <code>Precedence</code> value. If this happens, neither group takes
     *        precedence over the other. If two groups with the same <code>Precedence</code> have the same role ARN,
     *        that role is used in the <code>cognito:preferred_role</code> claim in tokens for users in each group. If
     *        the two groups have different role ARNs, the <code>cognito:preferred_role</code> claim is not set in
     *        users' tokens.
     *        </p>
     *        <p>
     *        The default <code>Precedence</code> value is null.
     */

    public void setPrecedence(Integer precedence) {
        this.precedence = precedence;
    }

    /**
     * <p>
     * A nonnegative integer value that specifies the precedence of this group relative to the other groups that a user
     * can belong to in the user pool. Zero is the highest precedence value. Groups with lower <code>Precedence</code>
     * values take precedence over groups with higher or null <code>Precedence</code> values. If a user belongs to two
     * or more groups, it is the group with the lowest precedence value whose role ARN will be used in the
     * <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims in the user's tokens.
     * </p>
     * <p>
     * Two groups can have the same <code>Precedence</code> value. If this happens, neither group takes precedence over
     * the other. If two groups with the same <code>Precedence</code> have the same role ARN, that role is used in the
     * <code>cognito:preferred_role</code> claim in tokens for users in each group. If the two groups have different
     * role ARNs, the <code>cognito:preferred_role</code> claim is not set in users' tokens.
     * </p>
     * <p>
     * The default <code>Precedence</code> value is null.
     * </p>
     * 
     * @return A nonnegative integer value that specifies the precedence of this group relative to the other groups that
     *         a user can belong to in the user pool. Zero is the highest precedence value. Groups with lower
     *         <code>Precedence</code> values take precedence over groups with higher or null <code>Precedence</code>
     *         values. If a user belongs to two or more groups, it is the group with the lowest precedence value whose
     *         role ARN will be used in the <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims in
     *         the user's tokens.</p>
     *         <p>
     *         Two groups can have the same <code>Precedence</code> value. If this happens, neither group takes
     *         precedence over the other. If two groups with the same <code>Precedence</code> have the same role ARN,
     *         that role is used in the <code>cognito:preferred_role</code> claim in tokens for users in each group. If
     *         the two groups have different role ARNs, the <code>cognito:preferred_role</code> claim is not set in
     *         users' tokens.
     *         </p>
     *         <p>
     *         The default <code>Precedence</code> value is null.
     */

    public Integer getPrecedence() {
        return this.precedence;
    }

    /**
     * <p>
     * A nonnegative integer value that specifies the precedence of this group relative to the other groups that a user
     * can belong to in the user pool. Zero is the highest precedence value. Groups with lower <code>Precedence</code>
     * values take precedence over groups with higher or null <code>Precedence</code> values. If a user belongs to two
     * or more groups, it is the group with the lowest precedence value whose role ARN will be used in the
     * <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims in the user's tokens.
     * </p>
     * <p>
     * Two groups can have the same <code>Precedence</code> value. If this happens, neither group takes precedence over
     * the other. If two groups with the same <code>Precedence</code> have the same role ARN, that role is used in the
     * <code>cognito:preferred_role</code> claim in tokens for users in each group. If the two groups have different
     * role ARNs, the <code>cognito:preferred_role</code> claim is not set in users' tokens.
     * </p>
     * <p>
     * The default <code>Precedence</code> value is null.
     * </p>
     * 
     * @param precedence
     *        A nonnegative integer value that specifies the precedence of this group relative to the other groups that
     *        a user can belong to in the user pool. Zero is the highest precedence value. Groups with lower
     *        <code>Precedence</code> values take precedence over groups with higher or null <code>Precedence</code>
     *        values. If a user belongs to two or more groups, it is the group with the lowest precedence value whose
     *        role ARN will be used in the <code>cognito:roles</code> and <code>cognito:preferred_role</code> claims in
     *        the user's tokens.</p>
     *        <p>
     *        Two groups can have the same <code>Precedence</code> value. If this happens, neither group takes
     *        precedence over the other. If two groups with the same <code>Precedence</code> have the same role ARN,
     *        that role is used in the <code>cognito:preferred_role</code> claim in tokens for users in each group. If
     *        the two groups have different role ARNs, the <code>cognito:preferred_role</code> claim is not set in
     *        users' tokens.
     *        </p>
     *        <p>
     *        The default <code>Precedence</code> value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withPrecedence(Integer precedence) {
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

        if (obj instanceof CreateGroupRequest == false)
            return false;
        CreateGroupRequest other = (CreateGroupRequest) obj;
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
    public CreateGroupRequest clone() {
        return (CreateGroupRequest) super.clone();
    }

}
