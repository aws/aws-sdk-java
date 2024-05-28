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
 * The configured table association summary for the objects listed by the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ConfiguredTableAssociationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfiguredTableAssociationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique configured table ID that this configured table association refers to.
     * </p>
     */
    private String configuredTableId;
    /**
     * <p>
     * The unique ID for the membership that the configured table association belongs to.
     * </p>
     */
    private String membershipId;
    /**
     * <p>
     * The unique ARN for the membership that the configured table association belongs to.
     * </p>
     */
    private String membershipArn;
    /**
     * <p>
     * The name of the configured table association. The table is identified by this name when running Protected Queries
     * against the underlying data.
     * </p>
     */
    private String name;
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
     * The unique ID for the configured table association.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The unique ARN for the configured table association.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The unique configured table ID that this configured table association refers to.
     * </p>
     * 
     * @param configuredTableId
     *        The unique configured table ID that this configured table association refers to.
     */

    public void setConfiguredTableId(String configuredTableId) {
        this.configuredTableId = configuredTableId;
    }

    /**
     * <p>
     * The unique configured table ID that this configured table association refers to.
     * </p>
     * 
     * @return The unique configured table ID that this configured table association refers to.
     */

    public String getConfiguredTableId() {
        return this.configuredTableId;
    }

    /**
     * <p>
     * The unique configured table ID that this configured table association refers to.
     * </p>
     * 
     * @param configuredTableId
     *        The unique configured table ID that this configured table association refers to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociationSummary withConfiguredTableId(String configuredTableId) {
        setConfiguredTableId(configuredTableId);
        return this;
    }

    /**
     * <p>
     * The unique ID for the membership that the configured table association belongs to.
     * </p>
     * 
     * @param membershipId
     *        The unique ID for the membership that the configured table association belongs to.
     */

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    /**
     * <p>
     * The unique ID for the membership that the configured table association belongs to.
     * </p>
     * 
     * @return The unique ID for the membership that the configured table association belongs to.
     */

    public String getMembershipId() {
        return this.membershipId;
    }

    /**
     * <p>
     * The unique ID for the membership that the configured table association belongs to.
     * </p>
     * 
     * @param membershipId
     *        The unique ID for the membership that the configured table association belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociationSummary withMembershipId(String membershipId) {
        setMembershipId(membershipId);
        return this;
    }

    /**
     * <p>
     * The unique ARN for the membership that the configured table association belongs to.
     * </p>
     * 
     * @param membershipArn
     *        The unique ARN for the membership that the configured table association belongs to.
     */

    public void setMembershipArn(String membershipArn) {
        this.membershipArn = membershipArn;
    }

    /**
     * <p>
     * The unique ARN for the membership that the configured table association belongs to.
     * </p>
     * 
     * @return The unique ARN for the membership that the configured table association belongs to.
     */

    public String getMembershipArn() {
        return this.membershipArn;
    }

    /**
     * <p>
     * The unique ARN for the membership that the configured table association belongs to.
     * </p>
     * 
     * @param membershipArn
     *        The unique ARN for the membership that the configured table association belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociationSummary withMembershipArn(String membershipArn) {
        setMembershipArn(membershipArn);
        return this;
    }

    /**
     * <p>
     * The name of the configured table association. The table is identified by this name when running Protected Queries
     * against the underlying data.
     * </p>
     * 
     * @param name
     *        The name of the configured table association. The table is identified by this name when running Protected
     *        Queries against the underlying data.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configured table association. The table is identified by this name when running Protected Queries
     * against the underlying data.
     * </p>
     * 
     * @return The name of the configured table association. The table is identified by this name when running Protected
     *         Queries against the underlying data.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configured table association. The table is identified by this name when running Protected Queries
     * against the underlying data.
     * </p>
     * 
     * @param name
     *        The name of the configured table association. The table is identified by this name when running Protected
     *        Queries against the underlying data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableAssociationSummary withName(String name) {
        setName(name);
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

    public ConfiguredTableAssociationSummary withCreateTime(java.util.Date createTime) {
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

    public ConfiguredTableAssociationSummary withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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

    public ConfiguredTableAssociationSummary withId(String id) {
        setId(id);
        return this;
    }

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

    public ConfiguredTableAssociationSummary withArn(String arn) {
        setArn(arn);
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
        if (getConfiguredTableId() != null)
            sb.append("ConfiguredTableId: ").append(getConfiguredTableId()).append(",");
        if (getMembershipId() != null)
            sb.append("MembershipId: ").append(getMembershipId()).append(",");
        if (getMembershipArn() != null)
            sb.append("MembershipArn: ").append(getMembershipArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfiguredTableAssociationSummary == false)
            return false;
        ConfiguredTableAssociationSummary other = (ConfiguredTableAssociationSummary) obj;
        if (other.getConfiguredTableId() == null ^ this.getConfiguredTableId() == null)
            return false;
        if (other.getConfiguredTableId() != null && other.getConfiguredTableId().equals(this.getConfiguredTableId()) == false)
            return false;
        if (other.getMembershipId() == null ^ this.getMembershipId() == null)
            return false;
        if (other.getMembershipId() != null && other.getMembershipId().equals(this.getMembershipId()) == false)
            return false;
        if (other.getMembershipArn() == null ^ this.getMembershipArn() == null)
            return false;
        if (other.getMembershipArn() != null && other.getMembershipArn().equals(this.getMembershipArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguredTableId() == null) ? 0 : getConfiguredTableId().hashCode());
        hashCode = prime * hashCode + ((getMembershipId() == null) ? 0 : getMembershipId().hashCode());
        hashCode = prime * hashCode + ((getMembershipArn() == null) ? 0 : getMembershipArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public ConfiguredTableAssociationSummary clone() {
        try {
            return (ConfiguredTableAssociationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ConfiguredTableAssociationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
