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
 * <p>
 * The request object for this operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the group that you want to create.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * A description for the group that you want to create.
     * </p>
     */
    private String description;
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
     * A name for the group that you want to create.
     * </p>
     * 
     * @param groupName
     *        A name for the group that you want to create.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * A name for the group that you want to create.
     * </p>
     * 
     * @return A name for the group that you want to create.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * A name for the group that you want to create.
     * </p>
     * 
     * @param groupName
     *        A name for the group that you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * A description for the group that you want to create.
     * </p>
     * 
     * @param description
     *        A description for the group that you want to create.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the group that you want to create.
     * </p>
     * 
     * @return A description for the group that you want to create.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the group that you want to create.
     * </p>
     * 
     * @param description
     *        A description for the group that you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withDescription(String description) {
        setDescription(description);
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

    public CreateGroupRequest withAwsAccountId(String awsAccountId) {
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

    public CreateGroupRequest withNamespace(String namespace) {
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreateGroupRequest == false)
            return false;
        CreateGroupRequest other = (CreateGroupRequest) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public CreateGroupRequest clone() {
        return (CreateGroupRequest) super.clone();
    }

}
