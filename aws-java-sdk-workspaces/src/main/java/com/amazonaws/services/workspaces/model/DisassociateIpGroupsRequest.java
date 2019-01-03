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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DisassociateIpGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateIpGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The identifiers of one or more IP access control groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groupIds;

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @return The identifier of the directory.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateIpGroupsRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The identifiers of one or more IP access control groups.
     * </p>
     * 
     * @return The identifiers of one or more IP access control groups.
     */

    public java.util.List<String> getGroupIds() {
        if (groupIds == null) {
            groupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groupIds;
    }

    /**
     * <p>
     * The identifiers of one or more IP access control groups.
     * </p>
     * 
     * @param groupIds
     *        The identifiers of one or more IP access control groups.
     */

    public void setGroupIds(java.util.Collection<String> groupIds) {
        if (groupIds == null) {
            this.groupIds = null;
            return;
        }

        this.groupIds = new com.amazonaws.internal.SdkInternalList<String>(groupIds);
    }

    /**
     * <p>
     * The identifiers of one or more IP access control groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupIds(java.util.Collection)} or {@link #withGroupIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param groupIds
     *        The identifiers of one or more IP access control groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateIpGroupsRequest withGroupIds(String... groupIds) {
        if (this.groupIds == null) {
            setGroupIds(new com.amazonaws.internal.SdkInternalList<String>(groupIds.length));
        }
        for (String ele : groupIds) {
            this.groupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of one or more IP access control groups.
     * </p>
     * 
     * @param groupIds
     *        The identifiers of one or more IP access control groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateIpGroupsRequest withGroupIds(java.util.Collection<String> groupIds) {
        setGroupIds(groupIds);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getGroupIds() != null)
            sb.append("GroupIds: ").append(getGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateIpGroupsRequest == false)
            return false;
        DisassociateIpGroupsRequest other = (DisassociateIpGroupsRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getGroupIds() == null ^ this.getGroupIds() == null)
            return false;
        if (other.getGroupIds() != null && other.getGroupIds().equals(this.getGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getGroupIds() == null) ? 0 : getGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateIpGroupsRequest clone() {
        return (DisassociateIpGroupsRequest) super.clone();
    }

}
