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
 * High-level information about a list of firewall domains for use in a <a>FirewallRule</a>. This is returned by
 * <a>GetFirewallDomainList</a>.
 * </p>
 * <p>
 * To retrieve the domains that are defined for this domain list, call <a>ListFirewallDomains</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/FirewallDomainList" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallDomainList implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the domain list.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall domain list.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the domain list.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The number of domain names that are specified in the domain list.
     * </p>
     */
    private Integer domainCount;
    /**
     * <p>
     * The status of the domain list.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Additional information about the status of the list, if available.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The owner of the list, used only for lists that are not managed by you. For example, the managed domain list
     * <code>AWSManagedDomainsMalwareDomainList</code> has the managed owner name
     * <code>Route 53 Resolver DNS Firewall</code>.
     * </p>
     */
    private String managedOwnerName;
    /**
     * <p>
     * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk
     * of running the operation twice. This can be any unique string, for example, a timestamp.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * The date and time that the domain list was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The date and time that the domain list was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     */
    private String modificationTime;

    /**
     * <p>
     * The ID of the domain list.
     * </p>
     * 
     * @param id
     *        The ID of the domain list.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the domain list.
     * </p>
     * 
     * @return The ID of the domain list.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the domain list.
     * </p>
     * 
     * @param id
     *        The ID of the domain list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallDomainList withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall domain list.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the firewall domain list.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall domain list.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the firewall domain list.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall domain list.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the firewall domain list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallDomainList withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the domain list.
     * </p>
     * 
     * @param name
     *        The name of the domain list.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain list.
     * </p>
     * 
     * @return The name of the domain list.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain list.
     * </p>
     * 
     * @param name
     *        The name of the domain list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallDomainList withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The number of domain names that are specified in the domain list.
     * </p>
     * 
     * @param domainCount
     *        The number of domain names that are specified in the domain list.
     */

    public void setDomainCount(Integer domainCount) {
        this.domainCount = domainCount;
    }

    /**
     * <p>
     * The number of domain names that are specified in the domain list.
     * </p>
     * 
     * @return The number of domain names that are specified in the domain list.
     */

    public Integer getDomainCount() {
        return this.domainCount;
    }

    /**
     * <p>
     * The number of domain names that are specified in the domain list.
     * </p>
     * 
     * @param domainCount
     *        The number of domain names that are specified in the domain list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallDomainList withDomainCount(Integer domainCount) {
        setDomainCount(domainCount);
        return this;
    }

    /**
     * <p>
     * The status of the domain list.
     * </p>
     * 
     * @param status
     *        The status of the domain list.
     * @see FirewallDomainListStatus
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
     * @see FirewallDomainListStatus
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
     * @see FirewallDomainListStatus
     */

    public FirewallDomainList withStatus(String status) {
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
     * @see FirewallDomainListStatus
     */

    public FirewallDomainList withStatus(FirewallDomainListStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Additional information about the status of the list, if available.
     * </p>
     * 
     * @param statusMessage
     *        Additional information about the status of the list, if available.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Additional information about the status of the list, if available.
     * </p>
     * 
     * @return Additional information about the status of the list, if available.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Additional information about the status of the list, if available.
     * </p>
     * 
     * @param statusMessage
     *        Additional information about the status of the list, if available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallDomainList withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The owner of the list, used only for lists that are not managed by you. For example, the managed domain list
     * <code>AWSManagedDomainsMalwareDomainList</code> has the managed owner name
     * <code>Route 53 Resolver DNS Firewall</code>.
     * </p>
     * 
     * @param managedOwnerName
     *        The owner of the list, used only for lists that are not managed by you. For example, the managed domain
     *        list <code>AWSManagedDomainsMalwareDomainList</code> has the managed owner name
     *        <code>Route 53 Resolver DNS Firewall</code>.
     */

    public void setManagedOwnerName(String managedOwnerName) {
        this.managedOwnerName = managedOwnerName;
    }

    /**
     * <p>
     * The owner of the list, used only for lists that are not managed by you. For example, the managed domain list
     * <code>AWSManagedDomainsMalwareDomainList</code> has the managed owner name
     * <code>Route 53 Resolver DNS Firewall</code>.
     * </p>
     * 
     * @return The owner of the list, used only for lists that are not managed by you. For example, the managed domain
     *         list <code>AWSManagedDomainsMalwareDomainList</code> has the managed owner name
     *         <code>Route 53 Resolver DNS Firewall</code>.
     */

    public String getManagedOwnerName() {
        return this.managedOwnerName;
    }

    /**
     * <p>
     * The owner of the list, used only for lists that are not managed by you. For example, the managed domain list
     * <code>AWSManagedDomainsMalwareDomainList</code> has the managed owner name
     * <code>Route 53 Resolver DNS Firewall</code>.
     * </p>
     * 
     * @param managedOwnerName
     *        The owner of the list, used only for lists that are not managed by you. For example, the managed domain
     *        list <code>AWSManagedDomainsMalwareDomainList</code> has the managed owner name
     *        <code>Route 53 Resolver DNS Firewall</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallDomainList withManagedOwnerName(String managedOwnerName) {
        setManagedOwnerName(managedOwnerName);
        return this;
    }

    /**
     * <p>
     * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk
     * of running the operation twice. This can be any unique string, for example, a timestamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string defined by you to identify the request. This allows you to retry failed requests without
     *        the risk of running the operation twice. This can be any unique string, for example, a timestamp.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk
     * of running the operation twice. This can be any unique string, for example, a timestamp.
     * </p>
     * 
     * @return A unique string defined by you to identify the request. This allows you to retry failed requests without
     *         the risk of running the operation twice. This can be any unique string, for example, a timestamp.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk
     * of running the operation twice. This can be any unique string, for example, a timestamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string defined by you to identify the request. This allows you to retry failed requests without
     *        the risk of running the operation twice. This can be any unique string, for example, a timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallDomainList withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * The date and time that the domain list was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the domain list was created, in Unix time format and Coordinated Universal Time
     *        (UTC).
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the domain list was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @return The date and time that the domain list was created, in Unix time format and Coordinated Universal Time
     *         (UTC).
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the domain list was created, in Unix time format and Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the domain list was created, in Unix time format and Coordinated Universal Time
     *        (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallDomainList withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the domain list was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the domain list was last modified, in Unix time format and Coordinated Universal
     *        Time (UTC).
     */

    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    /**
     * <p>
     * The date and time that the domain list was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @return The date and time that the domain list was last modified, in Unix time format and Coordinated Universal
     *         Time (UTC).
     */

    public String getModificationTime() {
        return this.modificationTime;
    }

    /**
     * <p>
     * The date and time that the domain list was last modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the domain list was last modified, in Unix time format and Coordinated Universal
     *        Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallDomainList withModificationTime(String modificationTime) {
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
        if (getDomainCount() != null)
            sb.append("DomainCount: ").append(getDomainCount()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getManagedOwnerName() != null)
            sb.append("ManagedOwnerName: ").append(getManagedOwnerName()).append(",");
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

        if (obj instanceof FirewallDomainList == false)
            return false;
        FirewallDomainList other = (FirewallDomainList) obj;
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
        if (other.getDomainCount() == null ^ this.getDomainCount() == null)
            return false;
        if (other.getDomainCount() != null && other.getDomainCount().equals(this.getDomainCount()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getManagedOwnerName() == null ^ this.getManagedOwnerName() == null)
            return false;
        if (other.getManagedOwnerName() != null && other.getManagedOwnerName().equals(this.getManagedOwnerName()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDomainCount() == null) ? 0 : getDomainCount().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getManagedOwnerName() == null) ? 0 : getManagedOwnerName().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getModificationTime() == null) ? 0 : getModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public FirewallDomainList clone() {
        try {
            return (FirewallDomainList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.FirewallDomainListMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
