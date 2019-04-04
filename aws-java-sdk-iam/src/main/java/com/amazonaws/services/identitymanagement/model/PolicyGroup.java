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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about a group that a managed policy is attached to.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>ListEntitiesForPolicy</a> operation.
 * </p>
 * <p>
 * For more information about managed policies, refer to <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline
 * Policies</a> in the <i>Using IAM</i> guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/PolicyGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The stable and unique string identifying the group. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     */
    private String groupId;

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the group.
     * </p>
     * 
     * @param groupName
     *        The name (friendly name, not ARN) identifying the group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the group.
     * </p>
     * 
     * @return The name (friendly name, not ARN) identifying the group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the group.
     * </p>
     * 
     * @param groupName
     *        The name (friendly name, not ARN) identifying the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyGroup withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the group. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * 
     * @param groupId
     *        The stable and unique string identifying the group. For more information about IDs, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *        the <i>IAM User Guide</i>.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The stable and unique string identifying the group. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The stable and unique string identifying the group. For more information about IDs, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *         the <i>IAM User Guide</i>.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The stable and unique string identifying the group. For more information about IDs, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * 
     * @param groupId
     *        The stable and unique string identifying the group. For more information about IDs, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in
     *        the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyGroup withGroupId(String groupId) {
        setGroupId(groupId);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyGroup == false)
            return false;
        PolicyGroup other = (PolicyGroup) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        return hashCode;
    }

    @Override
    public PolicyGroup clone() {
        try {
            return (PolicyGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
