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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the configured audience model association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ConfiguredAudienceModelAssociationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfiguredAudienceModelAssociationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier of the membership that contains the configured audience model association.
     * </p>
     */
    private String membershipId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the membership that contains the configured audience model association.
     * </p>
     */
    private String membershipArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collaboration that contains the configured audience model association.
     * </p>
     */
    private String collaborationArn;
    /**
     * <p>
     * A unique identifier of the collaboration that configured audience model is associated with.
     * </p>
     */
    private String collaborationId;
    /**
     * <p>
     * The time at which the configured audience model association was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The most recent time at which the configured audience model association was updated.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * A unique identifier of the configured audience model association.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model association.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the configured audience model association.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that was used for this configured audience model
     * association.
     * </p>
     */
    private String configuredAudienceModelArn;
    /**
     * <p>
     * The description of the configured audience model association.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A unique identifier of the membership that contains the configured audience model association.
     * </p>
     * 
     * @param membershipId
     *        A unique identifier of the membership that contains the configured audience model association.
     */

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    /**
     * <p>
     * A unique identifier of the membership that contains the configured audience model association.
     * </p>
     * 
     * @return A unique identifier of the membership that contains the configured audience model association.
     */

    public String getMembershipId() {
        return this.membershipId;
    }

    /**
     * <p>
     * A unique identifier of the membership that contains the configured audience model association.
     * </p>
     * 
     * @param membershipId
     *        A unique identifier of the membership that contains the configured audience model association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredAudienceModelAssociationSummary withMembershipId(String membershipId) {
        setMembershipId(membershipId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the membership that contains the configured audience model association.
     * </p>
     * 
     * @param membershipArn
     *        The Amazon Resource Name (ARN) of the membership that contains the configured audience model association.
     */

    public void setMembershipArn(String membershipArn) {
        this.membershipArn = membershipArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the membership that contains the configured audience model association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the membership that contains the configured audience model association.
     */

    public String getMembershipArn() {
        return this.membershipArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the membership that contains the configured audience model association.
     * </p>
     * 
     * @param membershipArn
     *        The Amazon Resource Name (ARN) of the membership that contains the configured audience model association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredAudienceModelAssociationSummary withMembershipArn(String membershipArn) {
        setMembershipArn(membershipArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collaboration that contains the configured audience model association.
     * </p>
     * 
     * @param collaborationArn
     *        The Amazon Resource Name (ARN) of the collaboration that contains the configured audience model
     *        association.
     */

    public void setCollaborationArn(String collaborationArn) {
        this.collaborationArn = collaborationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collaboration that contains the configured audience model association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the collaboration that contains the configured audience model
     *         association.
     */

    public String getCollaborationArn() {
        return this.collaborationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the collaboration that contains the configured audience model association.
     * </p>
     * 
     * @param collaborationArn
     *        The Amazon Resource Name (ARN) of the collaboration that contains the configured audience model
     *        association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredAudienceModelAssociationSummary withCollaborationArn(String collaborationArn) {
        setCollaborationArn(collaborationArn);
        return this;
    }

    /**
     * <p>
     * A unique identifier of the collaboration that configured audience model is associated with.
     * </p>
     * 
     * @param collaborationId
     *        A unique identifier of the collaboration that configured audience model is associated with.
     */

    public void setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
    }

    /**
     * <p>
     * A unique identifier of the collaboration that configured audience model is associated with.
     * </p>
     * 
     * @return A unique identifier of the collaboration that configured audience model is associated with.
     */

    public String getCollaborationId() {
        return this.collaborationId;
    }

    /**
     * <p>
     * A unique identifier of the collaboration that configured audience model is associated with.
     * </p>
     * 
     * @param collaborationId
     *        A unique identifier of the collaboration that configured audience model is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredAudienceModelAssociationSummary withCollaborationId(String collaborationId) {
        setCollaborationId(collaborationId);
        return this;
    }

    /**
     * <p>
     * The time at which the configured audience model association was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the configured audience model association was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the configured audience model association was created.
     * </p>
     * 
     * @return The time at which the configured audience model association was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time at which the configured audience model association was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the configured audience model association was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredAudienceModelAssociationSummary withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The most recent time at which the configured audience model association was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the configured audience model association was updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The most recent time at which the configured audience model association was updated.
     * </p>
     * 
     * @return The most recent time at which the configured audience model association was updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The most recent time at which the configured audience model association was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the configured audience model association was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredAudienceModelAssociationSummary withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * A unique identifier of the configured audience model association.
     * </p>
     * 
     * @param id
     *        A unique identifier of the configured audience model association.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier of the configured audience model association.
     * </p>
     * 
     * @return A unique identifier of the configured audience model association.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier of the configured audience model association.
     * </p>
     * 
     * @param id
     *        A unique identifier of the configured audience model association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredAudienceModelAssociationSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model association.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the configured audience model association.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the configured audience model association.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model association.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the configured audience model association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredAudienceModelAssociationSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the configured audience model association.
     * </p>
     * 
     * @param name
     *        The name of the configured audience model association.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configured audience model association.
     * </p>
     * 
     * @return The name of the configured audience model association.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configured audience model association.
     * </p>
     * 
     * @param name
     *        The name of the configured audience model association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredAudienceModelAssociationSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that was used for this configured audience model
     * association.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model that was used for this configured audience
     *        model association.
     */

    public void setConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        this.configuredAudienceModelArn = configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that was used for this configured audience model
     * association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the configured audience model that was used for this configured
     *         audience model association.
     */

    public String getConfiguredAudienceModelArn() {
        return this.configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that was used for this configured audience model
     * association.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model that was used for this configured audience
     *        model association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredAudienceModelAssociationSummary withConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        setConfiguredAudienceModelArn(configuredAudienceModelArn);
        return this;
    }

    /**
     * <p>
     * The description of the configured audience model association.
     * </p>
     * 
     * @param description
     *        The description of the configured audience model association.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the configured audience model association.
     * </p>
     * 
     * @return The description of the configured audience model association.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the configured audience model association.
     * </p>
     * 
     * @param description
     *        The description of the configured audience model association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredAudienceModelAssociationSummary withDescription(String description) {
        setDescription(description);
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
        if (getMembershipId() != null)
            sb.append("MembershipId: ").append(getMembershipId()).append(",");
        if (getMembershipArn() != null)
            sb.append("MembershipArn: ").append(getMembershipArn()).append(",");
        if (getCollaborationArn() != null)
            sb.append("CollaborationArn: ").append(getCollaborationArn()).append(",");
        if (getCollaborationId() != null)
            sb.append("CollaborationId: ").append(getCollaborationId()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getConfiguredAudienceModelArn() != null)
            sb.append("ConfiguredAudienceModelArn: ").append(getConfiguredAudienceModelArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfiguredAudienceModelAssociationSummary == false)
            return false;
        ConfiguredAudienceModelAssociationSummary other = (ConfiguredAudienceModelAssociationSummary) obj;
        if (other.getMembershipId() == null ^ this.getMembershipId() == null)
            return false;
        if (other.getMembershipId() != null && other.getMembershipId().equals(this.getMembershipId()) == false)
            return false;
        if (other.getMembershipArn() == null ^ this.getMembershipArn() == null)
            return false;
        if (other.getMembershipArn() != null && other.getMembershipArn().equals(this.getMembershipArn()) == false)
            return false;
        if (other.getCollaborationArn() == null ^ this.getCollaborationArn() == null)
            return false;
        if (other.getCollaborationArn() != null && other.getCollaborationArn().equals(this.getCollaborationArn()) == false)
            return false;
        if (other.getCollaborationId() == null ^ this.getCollaborationId() == null)
            return false;
        if (other.getCollaborationId() != null && other.getCollaborationId().equals(this.getCollaborationId()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfiguredAudienceModelArn() == null ^ this.getConfiguredAudienceModelArn() == null)
            return false;
        if (other.getConfiguredAudienceModelArn() != null && other.getConfiguredAudienceModelArn().equals(this.getConfiguredAudienceModelArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembershipId() == null) ? 0 : getMembershipId().hashCode());
        hashCode = prime * hashCode + ((getMembershipArn() == null) ? 0 : getMembershipArn().hashCode());
        hashCode = prime * hashCode + ((getCollaborationArn() == null) ? 0 : getCollaborationArn().hashCode());
        hashCode = prime * hashCode + ((getCollaborationId() == null) ? 0 : getCollaborationId().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfiguredAudienceModelArn() == null) ? 0 : getConfiguredAudienceModelArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ConfiguredAudienceModelAssociationSummary clone() {
        try {
            return (ConfiguredAudienceModelAssociationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ConfiguredAudienceModelAssociationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
