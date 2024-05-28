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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetGroupProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGroupProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the group profile exists.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The name of the group for which the specified group profile exists.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The identifier of the group profile.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier of the group profile.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the group profile exists.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which the group profile exists.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the group profile exists.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which the group profile exists.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the group profile exists.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which the group profile exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupProfileResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The name of the group for which the specified group profile exists.
     * </p>
     * 
     * @param groupName
     *        The name of the group for which the specified group profile exists.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group for which the specified group profile exists.
     * </p>
     * 
     * @return The name of the group for which the specified group profile exists.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the group for which the specified group profile exists.
     * </p>
     * 
     * @param groupName
     *        The name of the group for which the specified group profile exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupProfileResult withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The identifier of the group profile.
     * </p>
     * 
     * @param id
     *        The identifier of the group profile.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the group profile.
     * </p>
     * 
     * @return The identifier of the group profile.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the group profile.
     * </p>
     * 
     * @param id
     *        The identifier of the group profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupProfileResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier of the group profile.
     * </p>
     * 
     * @param status
     *        The identifier of the group profile.
     * @see GroupProfileStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The identifier of the group profile.
     * </p>
     * 
     * @return The identifier of the group profile.
     * @see GroupProfileStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The identifier of the group profile.
     * </p>
     * 
     * @param status
     *        The identifier of the group profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupProfileStatus
     */

    public GetGroupProfileResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The identifier of the group profile.
     * </p>
     * 
     * @param status
     *        The identifier of the group profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupProfileStatus
     */

    public GetGroupProfileResult withStatus(GroupProfileStatus status) {
        this.status = status.toString();
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append("***Sensitive Data Redacted***").append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGroupProfileResult == false)
            return false;
        GetGroupProfileResult other = (GetGroupProfileResult) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetGroupProfileResult clone() {
        try {
            return (GetGroupProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
