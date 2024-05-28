/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the organization under which the group exists.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The identifier for the group to be updated.
     * </p>
     * <p>
     * The identifier can accept <i>GroupId</i>, <i>Groupname</i>, or <i>email</i>. The following identity formats are
     * available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Group ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: group@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * Group name: group
     * </p>
     * </li>
     * </ul>
     */
    private String groupId;
    /**
     * <p>
     * If enabled, the group is hidden from the global address list.
     * </p>
     */
    private Boolean hiddenFromGlobalAddressList;

    /**
     * <p>
     * The identifier for the organization under which the group exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization under which the group exists.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the group exists.
     * </p>
     * 
     * @return The identifier for the organization under which the group exists.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the group exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization under which the group exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGroupRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The identifier for the group to be updated.
     * </p>
     * <p>
     * The identifier can accept <i>GroupId</i>, <i>Groupname</i>, or <i>email</i>. The following identity formats are
     * available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Group ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: group@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * Group name: group
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupId
     *        The identifier for the group to be updated.</p>
     *        <p>
     *        The identifier can accept <i>GroupId</i>, <i>Groupname</i>, or <i>email</i>. The following identity
     *        formats are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Group ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Email address: group@domain.tld
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Group name: group
     *        </p>
     *        </li>
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The identifier for the group to be updated.
     * </p>
     * <p>
     * The identifier can accept <i>GroupId</i>, <i>Groupname</i>, or <i>email</i>. The following identity formats are
     * available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Group ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: group@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * Group name: group
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier for the group to be updated.</p>
     *         <p>
     *         The identifier can accept <i>GroupId</i>, <i>Groupname</i>, or <i>email</i>. The following identity
     *         formats are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Group ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Email address: group@domain.tld
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Group name: group
     *         </p>
     *         </li>
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The identifier for the group to be updated.
     * </p>
     * <p>
     * The identifier can accept <i>GroupId</i>, <i>Groupname</i>, or <i>email</i>. The following identity formats are
     * available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Group ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: group@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * Group name: group
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupId
     *        The identifier for the group to be updated.</p>
     *        <p>
     *        The identifier can accept <i>GroupId</i>, <i>Groupname</i>, or <i>email</i>. The following identity
     *        formats are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Group ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Email address: group@domain.tld
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Group name: group
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGroupRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * If enabled, the group is hidden from the global address list.
     * </p>
     * 
     * @param hiddenFromGlobalAddressList
     *        If enabled, the group is hidden from the global address list.
     */

    public void setHiddenFromGlobalAddressList(Boolean hiddenFromGlobalAddressList) {
        this.hiddenFromGlobalAddressList = hiddenFromGlobalAddressList;
    }

    /**
     * <p>
     * If enabled, the group is hidden from the global address list.
     * </p>
     * 
     * @return If enabled, the group is hidden from the global address list.
     */

    public Boolean getHiddenFromGlobalAddressList() {
        return this.hiddenFromGlobalAddressList;
    }

    /**
     * <p>
     * If enabled, the group is hidden from the global address list.
     * </p>
     * 
     * @param hiddenFromGlobalAddressList
     *        If enabled, the group is hidden from the global address list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGroupRequest withHiddenFromGlobalAddressList(Boolean hiddenFromGlobalAddressList) {
        setHiddenFromGlobalAddressList(hiddenFromGlobalAddressList);
        return this;
    }

    /**
     * <p>
     * If enabled, the group is hidden from the global address list.
     * </p>
     * 
     * @return If enabled, the group is hidden from the global address list.
     */

    public Boolean isHiddenFromGlobalAddressList() {
        return this.hiddenFromGlobalAddressList;
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getHiddenFromGlobalAddressList() != null)
            sb.append("HiddenFromGlobalAddressList: ").append(getHiddenFromGlobalAddressList());
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
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getHiddenFromGlobalAddressList() == null ^ this.getHiddenFromGlobalAddressList() == null)
            return false;
        if (other.getHiddenFromGlobalAddressList() != null && other.getHiddenFromGlobalAddressList().equals(this.getHiddenFromGlobalAddressList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getHiddenFromGlobalAddressList() == null) ? 0 : getHiddenFromGlobalAddressList().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGroupRequest clone() {
        return (UpdateGroupRequest) super.clone();
    }

}
