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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <a>GroupIdentifier</a> objects. Each identifier is an object that contains both the <code>Name</code>
     * and the <code>GroupArn</code>.
     * </p>
     */
    private java.util.List<GroupIdentifier> groupIdentifiers;
    /**
     * <important>
     * <p>
     * <i> <b>Deprecated - don't use this field. Use the <code>GroupIdentifiers</code> response field instead.</b> </i>
     * </p>
     * </important>
     */
    @Deprecated
    private java.util.List<Group> groups;
    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <a>GroupIdentifier</a> objects. Each identifier is an object that contains both the <code>Name</code>
     * and the <code>GroupArn</code>.
     * </p>
     * 
     * @return A list of <a>GroupIdentifier</a> objects. Each identifier is an object that contains both the
     *         <code>Name</code> and the <code>GroupArn</code>.
     */

    public java.util.List<GroupIdentifier> getGroupIdentifiers() {
        return groupIdentifiers;
    }

    /**
     * <p>
     * A list of <a>GroupIdentifier</a> objects. Each identifier is an object that contains both the <code>Name</code>
     * and the <code>GroupArn</code>.
     * </p>
     * 
     * @param groupIdentifiers
     *        A list of <a>GroupIdentifier</a> objects. Each identifier is an object that contains both the
     *        <code>Name</code> and the <code>GroupArn</code>.
     */

    public void setGroupIdentifiers(java.util.Collection<GroupIdentifier> groupIdentifiers) {
        if (groupIdentifiers == null) {
            this.groupIdentifiers = null;
            return;
        }

        this.groupIdentifiers = new java.util.ArrayList<GroupIdentifier>(groupIdentifiers);
    }

    /**
     * <p>
     * A list of <a>GroupIdentifier</a> objects. Each identifier is an object that contains both the <code>Name</code>
     * and the <code>GroupArn</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupIdentifiers(java.util.Collection)} or {@link #withGroupIdentifiers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param groupIdentifiers
     *        A list of <a>GroupIdentifier</a> objects. Each identifier is an object that contains both the
     *        <code>Name</code> and the <code>GroupArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsResult withGroupIdentifiers(GroupIdentifier... groupIdentifiers) {
        if (this.groupIdentifiers == null) {
            setGroupIdentifiers(new java.util.ArrayList<GroupIdentifier>(groupIdentifiers.length));
        }
        for (GroupIdentifier ele : groupIdentifiers) {
            this.groupIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>GroupIdentifier</a> objects. Each identifier is an object that contains both the <code>Name</code>
     * and the <code>GroupArn</code>.
     * </p>
     * 
     * @param groupIdentifiers
     *        A list of <a>GroupIdentifier</a> objects. Each identifier is an object that contains both the
     *        <code>Name</code> and the <code>GroupArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsResult withGroupIdentifiers(java.util.Collection<GroupIdentifier> groupIdentifiers) {
        setGroupIdentifiers(groupIdentifiers);
        return this;
    }

    /**
     * <important>
     * <p>
     * <i> <b>Deprecated - don't use this field. Use the <code>GroupIdentifiers</code> response field instead.</b> </i>
     * </p>
     * </important>
     * 
     * @return <p>
     *         <i> <b>Deprecated - don't use this field. Use the <code>GroupIdentifiers</code> response field
     *         instead.</b> </i>
     *         </p>
     */
    @Deprecated
    public java.util.List<Group> getGroups() {
        return groups;
    }

    /**
     * <important>
     * <p>
     * <i> <b>Deprecated - don't use this field. Use the <code>GroupIdentifiers</code> response field instead.</b> </i>
     * </p>
     * </important>
     * 
     * @param groups
     *        <p>
     *        <i> <b>Deprecated - don't use this field. Use the <code>GroupIdentifiers</code> response field
     *        instead.</b> </i>
     *        </p>
     */
    @Deprecated
    public void setGroups(java.util.Collection<Group> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<Group>(groups);
    }

    /**
     * <important>
     * <p>
     * <i> <b>Deprecated - don't use this field. Use the <code>GroupIdentifiers</code> response field instead.</b> </i>
     * </p>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        <p>
     *        <i> <b>Deprecated - don't use this field. Use the <code>GroupIdentifiers</code> response field
     *        instead.</b> </i>
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ListGroupsResult withGroups(Group... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<Group>(groups.length));
        }
        for (Group ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <important>
     * <p>
     * <i> <b>Deprecated - don't use this field. Use the <code>GroupIdentifiers</code> response field instead.</b> </i>
     * </p>
     * </important>
     * 
     * @param groups
     *        <p>
     *        <i> <b>Deprecated - don't use this field. Use the <code>GroupIdentifiers</code> response field
     *        instead.</b> </i>
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ListGroupsResult withGroups(java.util.Collection<Group> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, indicates that more output is available than is included in the current response. Use this
     *        value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     *        next part of the output. You should repeat this until the <code>NextToken</code> response element comes
     *        back as <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * 
     * @return If present, indicates that more output is available than is included in the current response. Use this
     *         value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     *         next part of the output. You should repeat this until the <code>NextToken</code> response element comes
     *         back as <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in the current response. Use this value in
     * the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part of the
     * output. You should repeat this until the <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, indicates that more output is available than is included in the current response. Use this
     *        value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     *        next part of the output. You should repeat this until the <code>NextToken</code> response element comes
     *        back as <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getGroupIdentifiers() != null)
            sb.append("GroupIdentifiers: ").append(getGroupIdentifiers()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGroupsResult == false)
            return false;
        ListGroupsResult other = (ListGroupsResult) obj;
        if (other.getGroupIdentifiers() == null ^ this.getGroupIdentifiers() == null)
            return false;
        if (other.getGroupIdentifiers() != null && other.getGroupIdentifiers().equals(this.getGroupIdentifiers()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupIdentifiers() == null) ? 0 : getGroupIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupsResult clone() {
        try {
            return (ListGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
