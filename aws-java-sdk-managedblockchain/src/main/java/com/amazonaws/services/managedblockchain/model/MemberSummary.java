/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of configuration properties for a member.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/MemberSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the member.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the member.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional description of the member.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the member.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The AWS account is in the process of creating a member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The member has been created and can participate in the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The member and all associated resources are in the process of being deleted. Either the
     * AWS account that owns the member deleted it, or the member is being deleted as the result of an
     * <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The member can no longer participate on the network and all associated resources are
     * deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of
     * an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The date and time that the member was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * An indicator of whether the member is owned by your AWS account or a different AWS account.
     * </p>
     */
    private Boolean isOwned;

    /**
     * <p>
     * The unique identifier of the member.
     * </p>
     * 
     * @param id
     *        The unique identifier of the member.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the member.
     * </p>
     * 
     * @return The unique identifier of the member.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the member.
     * </p>
     * 
     * @param id
     *        The unique identifier of the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the member.
     * </p>
     * 
     * @param name
     *        The name of the member.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the member.
     * </p>
     * 
     * @return The name of the member.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the member.
     * </p>
     * 
     * @param name
     *        The name of the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional description of the member.
     * </p>
     * 
     * @param description
     *        An optional description of the member.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of the member.
     * </p>
     * 
     * @return An optional description of the member.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of the member.
     * </p>
     * 
     * @param description
     *        An optional description of the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the member.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The AWS account is in the process of creating a member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The member has been created and can participate in the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The member and all associated resources are in the process of being deleted. Either the
     * AWS account that owns the member deleted it, or the member is being deleted as the result of an
     * <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The member can no longer participate on the network and all associated resources are
     * deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of
     * an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the member.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The AWS account is in the process of creating a member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The member has been created and can participate in the network.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The member and all associated resources are in the process of being deleted.
     *        Either the AWS account that owns the member deleted it, or the member is being deleted as the result of an
     *        <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - The member can no longer participate on the network and all associated resources
     *        are deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the
     *        result of an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *        </p>
     *        </li>
     * @see MemberStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the member.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The AWS account is in the process of creating a member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The member has been created and can participate in the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The member and all associated resources are in the process of being deleted. Either the
     * AWS account that owns the member deleted it, or the member is being deleted as the result of an
     * <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The member can no longer participate on the network and all associated resources are
     * deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of
     * an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the member.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The AWS account is in the process of creating a member.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - The member has been created and can participate in the network.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The member and all associated resources are in the process of being deleted.
     *         Either the AWS account that owns the member deleted it, or the member is being deleted as the result of
     *         an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETED</code> - The member can no longer participate on the network and all associated resources
     *         are deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as
     *         the result of an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *         </p>
     *         </li>
     * @see MemberStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the member.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The AWS account is in the process of creating a member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The member has been created and can participate in the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The member and all associated resources are in the process of being deleted. Either the
     * AWS account that owns the member deleted it, or the member is being deleted as the result of an
     * <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The member can no longer participate on the network and all associated resources are
     * deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of
     * an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the member.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The AWS account is in the process of creating a member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The member has been created and can participate in the network.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The member and all associated resources are in the process of being deleted.
     *        Either the AWS account that owns the member deleted it, or the member is being deleted as the result of an
     *        <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - The member can no longer participate on the network and all associated resources
     *        are deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the
     *        result of an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberStatus
     */

    public MemberSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the member.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The AWS account is in the process of creating a member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The member has been created and can participate in the network.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The member and all associated resources are in the process of being deleted. Either the
     * AWS account that owns the member deleted it, or the member is being deleted as the result of an
     * <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - The member can no longer participate on the network and all associated resources are
     * deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the result of
     * an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the member.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The AWS account is in the process of creating a member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The member has been created and can participate in the network.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code> - The AWS account attempted to create a member and creation failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The member and all associated resources are in the process of being deleted.
     *        Either the AWS account that owns the member deleted it, or the member is being deleted as the result of an
     *        <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - The member can no longer participate on the network and all associated resources
     *        are deleted. Either the AWS account that owns the member deleted it, or the member is being deleted as the
     *        result of an <code>APPROVED</code> <code>PROPOSAL</code> to remove the member.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MemberStatus
     */

    public MemberSummary withStatus(MemberStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the member was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time that the member was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time that the member was created.
     * </p>
     * 
     * @return The date and time that the member was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time that the member was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time that the member was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberSummary withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * An indicator of whether the member is owned by your AWS account or a different AWS account.
     * </p>
     * 
     * @param isOwned
     *        An indicator of whether the member is owned by your AWS account or a different AWS account.
     */

    public void setIsOwned(Boolean isOwned) {
        this.isOwned = isOwned;
    }

    /**
     * <p>
     * An indicator of whether the member is owned by your AWS account or a different AWS account.
     * </p>
     * 
     * @return An indicator of whether the member is owned by your AWS account or a different AWS account.
     */

    public Boolean getIsOwned() {
        return this.isOwned;
    }

    /**
     * <p>
     * An indicator of whether the member is owned by your AWS account or a different AWS account.
     * </p>
     * 
     * @param isOwned
     *        An indicator of whether the member is owned by your AWS account or a different AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberSummary withIsOwned(Boolean isOwned) {
        setIsOwned(isOwned);
        return this;
    }

    /**
     * <p>
     * An indicator of whether the member is owned by your AWS account or a different AWS account.
     * </p>
     * 
     * @return An indicator of whether the member is owned by your AWS account or a different AWS account.
     */

    public Boolean isOwned() {
        return this.isOwned;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getIsOwned() != null)
            sb.append("IsOwned: ").append(getIsOwned());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberSummary == false)
            return false;
        MemberSummary other = (MemberSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getIsOwned() == null ^ this.getIsOwned() == null)
            return false;
        if (other.getIsOwned() != null && other.getIsOwned().equals(this.getIsOwned()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getIsOwned() == null) ? 0 : getIsOwned().hashCode());
        return hashCode;
    }

    @Override
    public MemberSummary clone() {
        try {
            return (MemberSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.MemberSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
