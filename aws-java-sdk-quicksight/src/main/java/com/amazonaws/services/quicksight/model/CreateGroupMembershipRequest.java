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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateGroupMembership" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGroupMembershipRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the user that you want to add to the group membership.
     * </p>
     */
    private String memberName;
    /**
     * <p>
     * The name of the group that you want to add the user to.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The name of the user that you want to add to the group membership.
     * </p>
     * 
     * @param memberName
     *        The name of the user that you want to add to the group membership.
     */

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * <p>
     * The name of the user that you want to add to the group membership.
     * </p>
     * 
     * @return The name of the user that you want to add to the group membership.
     */

    public String getMemberName() {
        return this.memberName;
    }

    /**
     * <p>
     * The name of the user that you want to add to the group membership.
     * </p>
     * 
     * @param memberName
     *        The name of the user that you want to add to the group membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupMembershipRequest withMemberName(String memberName) {
        setMemberName(memberName);
        return this;
    }

    /**
     * <p>
     * The name of the group that you want to add the user to.
     * </p>
     * 
     * @param groupName
     *        The name of the group that you want to add the user to.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group that you want to add the user to.
     * </p>
     * 
     * @return The name of the group that you want to add the user to.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the group that you want to add the user to.
     * </p>
     * 
     * @param groupName
     *        The name of the group that you want to add the user to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupMembershipRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that
     *        contains your Amazon QuickSight account.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     * 
     * @return The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that
     *         contains your Amazon QuickSight account.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your
     * Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that
     *        contains your Amazon QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupMembershipRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * 
     * @param namespace
     *        The namespace. Currently, you should set this to <code>default</code>.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * 
     * @return The namespace. Currently, you should set this to <code>default</code>.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * 
     * @param namespace
     *        The namespace. Currently, you should set this to <code>default</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupMembershipRequest withNamespace(String namespace) {
        setNamespace(namespace);
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
        if (getMemberName() != null)
            sb.append("MemberName: ").append(getMemberName()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGroupMembershipRequest == false)
            return false;
        CreateGroupMembershipRequest other = (CreateGroupMembershipRequest) obj;
        if (other.getMemberName() == null ^ this.getMemberName() == null)
            return false;
        if (other.getMemberName() != null && other.getMemberName().equals(this.getMemberName()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public CreateGroupMembershipRequest clone() {
        return (CreateGroupMembershipRequest) super.clone();
    }

}
