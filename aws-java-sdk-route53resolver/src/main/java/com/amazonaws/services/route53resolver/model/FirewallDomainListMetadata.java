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
 * Minimal high-level information for a firewall domain list. The action <a>ListFirewallDomainLists</a> returns an array
 * of these objects.
 * </p>
 * <p>
 * To retrieve full information for a firewall domain list, call <a>GetFirewallDomainList</a> and
 * <a>ListFirewallDomains</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/FirewallDomainListMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallDomainListMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the domain list.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall domain list metadata.
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
     * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk
     * of running the operation twice. This can be any unique string, for example, a timestamp.
     * </p>
     */
    private String creatorRequestId;
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

    public FirewallDomainListMetadata withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall domain list metadata.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the firewall domain list metadata.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall domain list metadata.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the firewall domain list metadata.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall domain list metadata.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the firewall domain list metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallDomainListMetadata withArn(String arn) {
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

    public FirewallDomainListMetadata withName(String name) {
        setName(name);
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

    public FirewallDomainListMetadata withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
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

    public FirewallDomainListMetadata withManagedOwnerName(String managedOwnerName) {
        setManagedOwnerName(managedOwnerName);
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
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getManagedOwnerName() != null)
            sb.append("ManagedOwnerName: ").append(getManagedOwnerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirewallDomainListMetadata == false)
            return false;
        FirewallDomainListMetadata other = (FirewallDomainListMetadata) obj;
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
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getManagedOwnerName() == null ^ this.getManagedOwnerName() == null)
            return false;
        if (other.getManagedOwnerName() != null && other.getManagedOwnerName().equals(this.getManagedOwnerName()) == false)
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
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getManagedOwnerName() == null) ? 0 : getManagedOwnerName().hashCode());
        return hashCode;
    }

    @Override
    public FirewallDomainListMetadata clone() {
        try {
            return (FirewallDomainListMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.FirewallDomainListMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
