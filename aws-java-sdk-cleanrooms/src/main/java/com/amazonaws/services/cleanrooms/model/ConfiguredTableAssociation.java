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
 * A configured table association links a configured table to a collaboration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ConfiguredTableAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfiguredTableAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ARN for the configured table association.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The unique ID for the configured table association.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The unique ID for the configured table that the association refers to.
     * </p>
     */
    private String configuredTableId;
    /**
     * <p>
     * The unique ARN for the configured table that the association refers to.
     * </p>
     */
    private String configuredTableArn;
    /**
     * <p>
     * The unique ID for the membership this configured table association belongs to.
     * </p>
     */
    private String membershipId;
    /**
     * <p>
     * The unique ARN for the membership this configured table association belongs to.
     * </p>
     */
    private String membershipArn;
    /**
     * <p>
     * The service will assume this role to access catalog metadata and query the table.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The name of the configured table association, in lowercase. The table is identified by this name when running
     * protected queries against the underlying data.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the configured table association.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time the configured table association was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The time the configured table association was last updated.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The unique ARN for the configured table association.
     * </p>
     * 
     * @param arn
     *        The unique ARN for the configured table association.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The unique ARN for the configured table association.
     * </p>
     * 
     * @return The unique ARN for the configured table association.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The unique ARN for the configured table association.
     * </p>
     * 
     * @param arn
     *        The unique ARN for the configured table association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociation withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The unique ID for the configured table association.
     * </p>
     * 
     * @param id
     *        The unique ID for the configured table association.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID for the configured table association.
     * </p>
     * 
     * @return The unique ID for the configured table association.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID for the configured table association.
     * </p>
     * 
     * @param id
     *        The unique ID for the configured table association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The unique ID for the configured table that the association refers to.
     * </p>
     * 
     * @param configuredTableId
     *        The unique ID for the configured table that the association refers to.
     */

    public void setConfiguredTableId(String configuredTableId) {
        this.configuredTableId = configuredTableId;
    }

    /**
     * <p>
     * The unique ID for the configured table that the association refers to.
     * </p>
     * 
     * @return The unique ID for the configured table that the association refers to.
     */

    public String getConfiguredTableId() {
        return this.configuredTableId;
    }

    /**
     * <p>
     * The unique ID for the configured table that the association refers to.
     * </p>
     * 
     * @param configuredTableId
     *        The unique ID for the configured table that the association refers to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociation withConfiguredTableId(String configuredTableId) {
        setConfiguredTableId(configuredTableId);
        return this;
    }

    /**
     * <p>
     * The unique ARN for the configured table that the association refers to.
     * </p>
     * 
     * @param configuredTableArn
     *        The unique ARN for the configured table that the association refers to.
     */

    public void setConfiguredTableArn(String configuredTableArn) {
        this.configuredTableArn = configuredTableArn;
    }

    /**
     * <p>
     * The unique ARN for the configured table that the association refers to.
     * </p>
     * 
     * @return The unique ARN for the configured table that the association refers to.
     */

    public String getConfiguredTableArn() {
        return this.configuredTableArn;
    }

    /**
     * <p>
     * The unique ARN for the configured table that the association refers to.
     * </p>
     * 
     * @param configuredTableArn
     *        The unique ARN for the configured table that the association refers to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociation withConfiguredTableArn(String configuredTableArn) {
        setConfiguredTableArn(configuredTableArn);
        return this;
    }

    /**
     * <p>
     * The unique ID for the membership this configured table association belongs to.
     * </p>
     * 
     * @param membershipId
     *        The unique ID for the membership this configured table association belongs to.
     */

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    /**
     * <p>
     * The unique ID for the membership this configured table association belongs to.
     * </p>
     * 
     * @return The unique ID for the membership this configured table association belongs to.
     */

    public String getMembershipId() {
        return this.membershipId;
    }

    /**
     * <p>
     * The unique ID for the membership this configured table association belongs to.
     * </p>
     * 
     * @param membershipId
     *        The unique ID for the membership this configured table association belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociation withMembershipId(String membershipId) {
        setMembershipId(membershipId);
        return this;
    }

    /**
     * <p>
     * The unique ARN for the membership this configured table association belongs to.
     * </p>
     * 
     * @param membershipArn
     *        The unique ARN for the membership this configured table association belongs to.
     */

    public void setMembershipArn(String membershipArn) {
        this.membershipArn = membershipArn;
    }

    /**
     * <p>
     * The unique ARN for the membership this configured table association belongs to.
     * </p>
     * 
     * @return The unique ARN for the membership this configured table association belongs to.
     */

    public String getMembershipArn() {
        return this.membershipArn;
    }

    /**
     * <p>
     * The unique ARN for the membership this configured table association belongs to.
     * </p>
     * 
     * @param membershipArn
     *        The unique ARN for the membership this configured table association belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociation withMembershipArn(String membershipArn) {
        setMembershipArn(membershipArn);
        return this;
    }

    /**
     * <p>
     * The service will assume this role to access catalog metadata and query the table.
     * </p>
     * 
     * @param roleArn
     *        The service will assume this role to access catalog metadata and query the table.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The service will assume this role to access catalog metadata and query the table.
     * </p>
     * 
     * @return The service will assume this role to access catalog metadata and query the table.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The service will assume this role to access catalog metadata and query the table.
     * </p>
     * 
     * @param roleArn
     *        The service will assume this role to access catalog metadata and query the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociation withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The name of the configured table association, in lowercase. The table is identified by this name when running
     * protected queries against the underlying data.
     * </p>
     * 
     * @param name
     *        The name of the configured table association, in lowercase. The table is identified by this name when
     *        running protected queries against the underlying data.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configured table association, in lowercase. The table is identified by this name when running
     * protected queries against the underlying data.
     * </p>
     * 
     * @return The name of the configured table association, in lowercase. The table is identified by this name when
     *         running protected queries against the underlying data.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configured table association, in lowercase. The table is identified by this name when running
     * protected queries against the underlying data.
     * </p>
     * 
     * @param name
     *        The name of the configured table association, in lowercase. The table is identified by this name when
     *        running protected queries against the underlying data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the configured table association.
     * </p>
     * 
     * @param description
     *        A description of the configured table association.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the configured table association.
     * </p>
     * 
     * @return A description of the configured table association.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the configured table association.
     * </p>
     * 
     * @param description
     *        A description of the configured table association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time the configured table association was created.
     * </p>
     * 
     * @param createTime
     *        The time the configured table association was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time the configured table association was created.
     * </p>
     * 
     * @return The time the configured table association was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time the configured table association was created.
     * </p>
     * 
     * @param createTime
     *        The time the configured table association was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociation withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The time the configured table association was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the configured table association was last updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time the configured table association was last updated.
     * </p>
     * 
     * @return The time the configured table association was last updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time the configured table association was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the configured table association was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociation withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getConfiguredTableId() != null)
            sb.append("ConfiguredTableId: ").append(getConfiguredTableId()).append(",");
        if (getConfiguredTableArn() != null)
            sb.append("ConfiguredTableArn: ").append(getConfiguredTableArn()).append(",");
        if (getMembershipId() != null)
            sb.append("MembershipId: ").append(getMembershipId()).append(",");
        if (getMembershipArn() != null)
            sb.append("MembershipArn: ").append(getMembershipArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfiguredTableAssociation == false)
            return false;
        ConfiguredTableAssociation other = (ConfiguredTableAssociation) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getConfiguredTableId() == null ^ this.getConfiguredTableId() == null)
            return false;
        if (other.getConfiguredTableId() != null && other.getConfiguredTableId().equals(this.getConfiguredTableId()) == false)
            return false;
        if (other.getConfiguredTableArn() == null ^ this.getConfiguredTableArn() == null)
            return false;
        if (other.getConfiguredTableArn() != null && other.getConfiguredTableArn().equals(this.getConfiguredTableArn()) == false)
            return false;
        if (other.getMembershipId() == null ^ this.getMembershipId() == null)
            return false;
        if (other.getMembershipId() != null && other.getMembershipId().equals(this.getMembershipId()) == false)
            return false;
        if (other.getMembershipArn() == null ^ this.getMembershipArn() == null)
            return false;
        if (other.getMembershipArn() != null && other.getMembershipArn().equals(this.getMembershipArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getConfiguredTableId() == null) ? 0 : getConfiguredTableId().hashCode());
        hashCode = prime * hashCode + ((getConfiguredTableArn() == null) ? 0 : getConfiguredTableArn().hashCode());
        hashCode = prime * hashCode + ((getMembershipId() == null) ? 0 : getMembershipId().hashCode());
        hashCode = prime * hashCode + ((getMembershipArn() == null) ? 0 : getMembershipArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public ConfiguredTableAssociation clone() {
        try {
            return (ConfiguredTableAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ConfiguredTableAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
