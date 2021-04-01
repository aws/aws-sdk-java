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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An association between a firewall rul group and a VPC, which enables DNS filtering for the VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/FirewallRuleGroupAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallRuleGroupAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the association.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall rule group association.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The unique identifier of the firewall rule group.
     * </p>
     */
    private String firewallRuleGroupId;
    /**
     * <p>
     * The unique identifier of the VPC that is associated with the rule group.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The name of the association.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The setting that determines the processing order of the rule group among the rule groups that are associated with
     * a single VPC. DNS Firewall filters VPC traffic starting from rule group with the lowest numeric priority setting.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * If enabled, this setting disallows modification or removal of the association, to help prevent against
     * accidentally altering DNS firewall protections.
     * </p>
     */
    private String mutationProtection;
    /**
     * <p>
     * The owner of the association, used only for associations that are not managed by you. If you use AWS Firewall
     * Manager to manage your DNS Firewalls, then this reports Firewall Manager as the managed owner.
     * </p>
     */
    private String managedOwnerName;
    /**
     * <p>
     * The current status of the association.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Additional information about the status of the response, if available.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk
     * of executing the operation twice. This can be any unique string, for example, a timestamp.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * The date and time that the association was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The date and time that the association was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     */
    private String modificationTime;

    /**
     * <p>
     * The identifier for the association.
     * </p>
     * 
     * @param id
     *        The identifier for the association.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the association.
     * </p>
     * 
     * @return The identifier for the association.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the association.
     * </p>
     * 
     * @param id
     *        The identifier for the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroupAssociation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall rule group association.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the firewall rule group association.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall rule group association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the firewall rule group association.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall rule group association.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the firewall rule group association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroupAssociation withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group.
     * </p>
     * 
     * @param firewallRuleGroupId
     *        The unique identifier of the firewall rule group.
     */

    public void setFirewallRuleGroupId(String firewallRuleGroupId) {
        this.firewallRuleGroupId = firewallRuleGroupId;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group.
     * </p>
     * 
     * @return The unique identifier of the firewall rule group.
     */

    public String getFirewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group.
     * </p>
     * 
     * @param firewallRuleGroupId
     *        The unique identifier of the firewall rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroupAssociation withFirewallRuleGroupId(String firewallRuleGroupId) {
        setFirewallRuleGroupId(firewallRuleGroupId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the VPC that is associated with the rule group.
     * </p>
     * 
     * @param vpcId
     *        The unique identifier of the VPC that is associated with the rule group.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The unique identifier of the VPC that is associated with the rule group.
     * </p>
     * 
     * @return The unique identifier of the VPC that is associated with the rule group.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The unique identifier of the VPC that is associated with the rule group.
     * </p>
     * 
     * @param vpcId
     *        The unique identifier of the VPC that is associated with the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroupAssociation withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The name of the association.
     * </p>
     * 
     * @param name
     *        The name of the association.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the association.
     * </p>
     * 
     * @return The name of the association.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the association.
     * </p>
     * 
     * @param name
     *        The name of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroupAssociation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The setting that determines the processing order of the rule group among the rule groups that are associated with
     * a single VPC. DNS Firewall filters VPC traffic starting from rule group with the lowest numeric priority setting.
     * </p>
     * 
     * @param priority
     *        The setting that determines the processing order of the rule group among the rule groups that are
     *        associated with a single VPC. DNS Firewall filters VPC traffic starting from rule group with the lowest
     *        numeric priority setting.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The setting that determines the processing order of the rule group among the rule groups that are associated with
     * a single VPC. DNS Firewall filters VPC traffic starting from rule group with the lowest numeric priority setting.
     * </p>
     * 
     * @return The setting that determines the processing order of the rule group among the rule groups that are
     *         associated with a single VPC. DNS Firewall filters VPC traffic starting from rule group with the lowest
     *         numeric priority setting.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The setting that determines the processing order of the rule group among the rule groups that are associated with
     * a single VPC. DNS Firewall filters VPC traffic starting from rule group with the lowest numeric priority setting.
     * </p>
     * 
     * @param priority
     *        The setting that determines the processing order of the rule group among the rule groups that are
     *        associated with a single VPC. DNS Firewall filters VPC traffic starting from rule group with the lowest
     *        numeric priority setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroupAssociation withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * If enabled, this setting disallows modification or removal of the association, to help prevent against
     * accidentally altering DNS firewall protections.
     * </p>
     * 
     * @param mutationProtection
     *        If enabled, this setting disallows modification or removal of the association, to help prevent against
     *        accidentally altering DNS firewall protections.
     * @see MutationProtectionStatus
     */

    public void setMutationProtection(String mutationProtection) {
        this.mutationProtection = mutationProtection;
    }

    /**
     * <p>
     * If enabled, this setting disallows modification or removal of the association, to help prevent against
     * accidentally altering DNS firewall protections.
     * </p>
     * 
     * @return If enabled, this setting disallows modification or removal of the association, to help prevent against
     *         accidentally altering DNS firewall protections.
     * @see MutationProtectionStatus
     */

    public String getMutationProtection() {
        return this.mutationProtection;
    }

    /**
     * <p>
     * If enabled, this setting disallows modification or removal of the association, to help prevent against
     * accidentally altering DNS firewall protections.
     * </p>
     * 
     * @param mutationProtection
     *        If enabled, this setting disallows modification or removal of the association, to help prevent against
     *        accidentally altering DNS firewall protections.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MutationProtectionStatus
     */

    public FirewallRuleGroupAssociation withMutationProtection(String mutationProtection) {
        setMutationProtection(mutationProtection);
        return this;
    }

    /**
     * <p>
     * If enabled, this setting disallows modification or removal of the association, to help prevent against
     * accidentally altering DNS firewall protections.
     * </p>
     * 
     * @param mutationProtection
     *        If enabled, this setting disallows modification or removal of the association, to help prevent against
     *        accidentally altering DNS firewall protections.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MutationProtectionStatus
     */

    public FirewallRuleGroupAssociation withMutationProtection(MutationProtectionStatus mutationProtection) {
        this.mutationProtection = mutationProtection.toString();
        return this;
    }

    /**
     * <p>
     * The owner of the association, used only for associations that are not managed by you. If you use AWS Firewall
     * Manager to manage your DNS Firewalls, then this reports Firewall Manager as the managed owner.
     * </p>
     * 
     * @param managedOwnerName
     *        The owner of the association, used only for associations that are not managed by you. If you use AWS
     *        Firewall Manager to manage your DNS Firewalls, then this reports Firewall Manager as the managed owner.
     */

    public void setManagedOwnerName(String managedOwnerName) {
        this.managedOwnerName = managedOwnerName;
    }

    /**
     * <p>
     * The owner of the association, used only for associations that are not managed by you. If you use AWS Firewall
     * Manager to manage your DNS Firewalls, then this reports Firewall Manager as the managed owner.
     * </p>
     * 
     * @return The owner of the association, used only for associations that are not managed by you. If you use AWS
     *         Firewall Manager to manage your DNS Firewalls, then this reports Firewall Manager as the managed owner.
     */

    public String getManagedOwnerName() {
        return this.managedOwnerName;
    }

    /**
     * <p>
     * The owner of the association, used only for associations that are not managed by you. If you use AWS Firewall
     * Manager to manage your DNS Firewalls, then this reports Firewall Manager as the managed owner.
     * </p>
     * 
     * @param managedOwnerName
     *        The owner of the association, used only for associations that are not managed by you. If you use AWS
     *        Firewall Manager to manage your DNS Firewalls, then this reports Firewall Manager as the managed owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroupAssociation withManagedOwnerName(String managedOwnerName) {
        setManagedOwnerName(managedOwnerName);
        return this;
    }

    /**
     * <p>
     * The current status of the association.
     * </p>
     * 
     * @param status
     *        The current status of the association.
     * @see FirewallRuleGroupAssociationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the association.
     * </p>
     * 
     * @return The current status of the association.
     * @see FirewallRuleGroupAssociationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the association.
     * </p>
     * 
     * @param status
     *        The current status of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallRuleGroupAssociationStatus
     */

    public FirewallRuleGroupAssociation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the association.
     * </p>
     * 
     * @param status
     *        The current status of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallRuleGroupAssociationStatus
     */

    public FirewallRuleGroupAssociation withStatus(FirewallRuleGroupAssociationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about the status of the response, if available.
     * </p>
     * 
     * @param statusMessage
     *        Additional information about the status of the response, if available.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Additional information about the status of the response, if available.
     * </p>
     * 
     * @return Additional information about the status of the response, if available.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Additional information about the status of the response, if available.
     * </p>
     * 
     * @param statusMessage
     *        Additional information about the status of the response, if available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroupAssociation withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk
     * of executing the operation twice. This can be any unique string, for example, a timestamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string defined by you to identify the request. This allows you to retry failed requests without
     *        the risk of executing the operation twice. This can be any unique string, for example, a timestamp.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk
     * of executing the operation twice. This can be any unique string, for example, a timestamp.
     * </p>
     * 
     * @return A unique string defined by you to identify the request. This allows you to retry failed requests without
     *         the risk of executing the operation twice. This can be any unique string, for example, a timestamp.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk
     * of executing the operation twice. This can be any unique string, for example, a timestamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string defined by you to identify the request. This allows you to retry failed requests without
     *        the risk of executing the operation twice. This can be any unique string, for example, a timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroupAssociation withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * The date and time that the association was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the association was created, in Unix time format and Coordinated Universal Time
     *        (UTC).
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the association was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @return The date and time that the association was created, in Unix time format and Coordinated Universal Time
     *         (UTC).
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the association was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the association was created, in Unix time format and Coordinated Universal Time
     *        (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroupAssociation withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the association was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the association was last modified, in Unix time format and Coordinated Universal
     *        Time (UTC).
     */

    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    /**
     * <p>
     * The date and time that the association was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @return The date and time that the association was last modified, in Unix time format and Coordinated Universal
     *         Time (UTC).
     */

    public String getModificationTime() {
        return this.modificationTime;
    }

    /**
     * <p>
     * The date and time that the association was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the association was last modified, in Unix time format and Coordinated Universal
     *        Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroupAssociation withModificationTime(String modificationTime) {
        setModificationTime(modificationTime);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getFirewallRuleGroupId() != null)
            sb.append("FirewallRuleGroupId: ").append(getFirewallRuleGroupId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getMutationProtection() != null)
            sb.append("MutationProtection: ").append(getMutationProtection()).append(",");
        if (getManagedOwnerName() != null)
            sb.append("ManagedOwnerName: ").append(getManagedOwnerName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getModificationTime() != null)
            sb.append("ModificationTime: ").append(getModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirewallRuleGroupAssociation == false)
            return false;
        FirewallRuleGroupAssociation other = (FirewallRuleGroupAssociation) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getFirewallRuleGroupId() == null ^ this.getFirewallRuleGroupId() == null)
            return false;
        if (other.getFirewallRuleGroupId() != null && other.getFirewallRuleGroupId().equals(this.getFirewallRuleGroupId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getMutationProtection() == null ^ this.getMutationProtection() == null)
            return false;
        if (other.getMutationProtection() != null && other.getMutationProtection().equals(this.getMutationProtection()) == false)
            return false;
        if (other.getManagedOwnerName() == null ^ this.getManagedOwnerName() == null)
            return false;
        if (other.getManagedOwnerName() != null && other.getManagedOwnerName().equals(this.getManagedOwnerName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getModificationTime() == null ^ this.getModificationTime() == null)
            return false;
        if (other.getModificationTime() != null && other.getModificationTime().equals(this.getModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getFirewallRuleGroupId() == null) ? 0 : getFirewallRuleGroupId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getMutationProtection() == null) ? 0 : getMutationProtection().hashCode());
        hashCode = prime * hashCode + ((getManagedOwnerName() == null) ? 0 : getManagedOwnerName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getModificationTime() == null) ? 0 : getModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public FirewallRuleGroupAssociation clone() {
        try {
            return (FirewallRuleGroupAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.FirewallRuleGroupAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
