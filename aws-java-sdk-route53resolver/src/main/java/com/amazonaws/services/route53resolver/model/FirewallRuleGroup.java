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
 * High-level information for a firewall rule group. A firewall rule group is a collection of rules that DNS Firewall
 * uses to filter DNS network traffic for a VPC. To retrieve the rules for the rule group, call
 * <a>ListFirewallRules</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/FirewallRuleGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallRuleGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the rule group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the rule group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the rule group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The number of rules in the rule group.
     * </p>
     */
    private Integer ruleCount;
    /**
     * <p>
     * The status of the domain list.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Additional information about the status of the rule group, if available.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The AWS account ID for the account that created the rule group. When a rule group is shared with your account,
     * this is the account that has shared the rule group with you.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk
     * of executing the operation twice. This can be any unique string, for example, a timestamp.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * Whether the rule group is shared with other AWS accounts, or was shared with the current account by another AWS
     * account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * </p>
     */
    private String shareStatus;
    /**
     * <p>
     * The date and time that the rule group was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The date and time that the rule group was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     */
    private String modificationTime;

    /**
     * <p>
     * The ID of the rule group.
     * </p>
     * 
     * @param id
     *        The ID of the rule group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the rule group.
     * </p>
     * 
     * @return The ID of the rule group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the rule group.
     * </p>
     * 
     * @param id
     *        The ID of the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroup withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the rule group.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) of the rule group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the rule group.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the rule group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the rule group.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) of the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroup withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the rule group.
     * </p>
     * 
     * @param name
     *        The name of the rule group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule group.
     * </p>
     * 
     * @return The name of the rule group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule group.
     * </p>
     * 
     * @param name
     *        The name of the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The number of rules in the rule group.
     * </p>
     * 
     * @param ruleCount
     *        The number of rules in the rule group.
     */

    public void setRuleCount(Integer ruleCount) {
        this.ruleCount = ruleCount;
    }

    /**
     * <p>
     * The number of rules in the rule group.
     * </p>
     * 
     * @return The number of rules in the rule group.
     */

    public Integer getRuleCount() {
        return this.ruleCount;
    }

    /**
     * <p>
     * The number of rules in the rule group.
     * </p>
     * 
     * @param ruleCount
     *        The number of rules in the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroup withRuleCount(Integer ruleCount) {
        setRuleCount(ruleCount);
        return this;
    }

    /**
     * <p>
     * The status of the domain list.
     * </p>
     * 
     * @param status
     *        The status of the domain list.
     * @see FirewallRuleGroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the domain list.
     * </p>
     * 
     * @return The status of the domain list.
     * @see FirewallRuleGroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the domain list.
     * </p>
     * 
     * @param status
     *        The status of the domain list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallRuleGroupStatus
     */

    public FirewallRuleGroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the domain list.
     * </p>
     * 
     * @param status
     *        The status of the domain list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallRuleGroupStatus
     */

    public FirewallRuleGroup withStatus(FirewallRuleGroupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about the status of the rule group, if available.
     * </p>
     * 
     * @param statusMessage
     *        Additional information about the status of the rule group, if available.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Additional information about the status of the rule group, if available.
     * </p>
     * 
     * @return Additional information about the status of the rule group, if available.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Additional information about the status of the rule group, if available.
     * </p>
     * 
     * @param statusMessage
     *        Additional information about the status of the rule group, if available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroup withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The AWS account ID for the account that created the rule group. When a rule group is shared with your account,
     * this is the account that has shared the rule group with you.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID for the account that created the rule group. When a rule group is shared with your
     *        account, this is the account that has shared the rule group with you.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID for the account that created the rule group. When a rule group is shared with your account,
     * this is the account that has shared the rule group with you.
     * </p>
     * 
     * @return The AWS account ID for the account that created the rule group. When a rule group is shared with your
     *         account, this is the account that has shared the rule group with you.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account ID for the account that created the rule group. When a rule group is shared with your account,
     * this is the account that has shared the rule group with you.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID for the account that created the rule group. When a rule group is shared with your
     *        account, this is the account that has shared the rule group with you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroup withOwnerId(String ownerId) {
        setOwnerId(ownerId);
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

    public FirewallRuleGroup withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * Whether the rule group is shared with other AWS accounts, or was shared with the current account by another AWS
     * account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * </p>
     * 
     * @param shareStatus
     *        Whether the rule group is shared with other AWS accounts, or was shared with the current account by
     *        another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * @see ShareStatus
     */

    public void setShareStatus(String shareStatus) {
        this.shareStatus = shareStatus;
    }

    /**
     * <p>
     * Whether the rule group is shared with other AWS accounts, or was shared with the current account by another AWS
     * account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * </p>
     * 
     * @return Whether the rule group is shared with other AWS accounts, or was shared with the current account by
     *         another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * @see ShareStatus
     */

    public String getShareStatus() {
        return this.shareStatus;
    }

    /**
     * <p>
     * Whether the rule group is shared with other AWS accounts, or was shared with the current account by another AWS
     * account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * </p>
     * 
     * @param shareStatus
     *        Whether the rule group is shared with other AWS accounts, or was shared with the current account by
     *        another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public FirewallRuleGroup withShareStatus(String shareStatus) {
        setShareStatus(shareStatus);
        return this;
    }

    /**
     * <p>
     * Whether the rule group is shared with other AWS accounts, or was shared with the current account by another AWS
     * account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * </p>
     * 
     * @param shareStatus
     *        Whether the rule group is shared with other AWS accounts, or was shared with the current account by
     *        another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public FirewallRuleGroup withShareStatus(ShareStatus shareStatus) {
        this.shareStatus = shareStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the rule group was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the rule group was created, in Unix time format and Coordinated Universal Time
     *        (UTC).
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the rule group was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @return The date and time that the rule group was created, in Unix time format and Coordinated Universal Time
     *         (UTC).
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the rule group was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the rule group was created, in Unix time format and Coordinated Universal Time
     *        (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroup withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the rule group was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the rule group was last modified, in Unix time format and Coordinated Universal
     *        Time (UTC).
     */

    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    /**
     * <p>
     * The date and time that the rule group was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @return The date and time that the rule group was last modified, in Unix time format and Coordinated Universal
     *         Time (UTC).
     */

    public String getModificationTime() {
        return this.modificationTime;
    }

    /**
     * <p>
     * The date and time that the rule group was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the rule group was last modified, in Unix time format and Coordinated Universal
     *        Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallRuleGroup withModificationTime(String modificationTime) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRuleCount() != null)
            sb.append("RuleCount: ").append(getRuleCount()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getShareStatus() != null)
            sb.append("ShareStatus: ").append(getShareStatus()).append(",");
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

        if (obj instanceof FirewallRuleGroup == false)
            return false;
        FirewallRuleGroup other = (FirewallRuleGroup) obj;
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
        if (other.getRuleCount() == null ^ this.getRuleCount() == null)
            return false;
        if (other.getRuleCount() != null && other.getRuleCount().equals(this.getRuleCount()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getShareStatus() == null ^ this.getShareStatus() == null)
            return false;
        if (other.getShareStatus() != null && other.getShareStatus().equals(this.getShareStatus()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRuleCount() == null) ? 0 : getRuleCount().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getShareStatus() == null) ? 0 : getShareStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getModificationTime() == null) ? 0 : getModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public FirewallRuleGroup clone() {
        try {
            return (FirewallRuleGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.FirewallRuleGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
