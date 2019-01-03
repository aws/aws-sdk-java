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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * In the response to an <a>AssociateResolverRule</a>, <a>DisassociateResolverRule</a>, or
 * <a>ListResolverRuleAssociations</a> request, information about an association between a resolver rule and a VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ResolverRuleAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolverRuleAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the association between a resolver rule and a VPC. Resolver assigns this value when you submit an
     * <a>AssociateResolverRule</a> request.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the resolver rule that you associated with the VPC that is specified by <code>VPCId</code>.
     * </p>
     */
    private String resolverRuleId;
    /**
     * <p>
     * The name of an association between a resolver rule and a VPC.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the VPC that you associated the resolver rule with.
     * </p>
     */
    private String vPCId;
    /**
     * <p>
     * A code that specifies the current status of the association between a resolver rule and a VPC.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A detailed description of the status of the association between a resolver rule and a VPC.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The ID of the association between a resolver rule and a VPC. Resolver assigns this value when you submit an
     * <a>AssociateResolverRule</a> request.
     * </p>
     * 
     * @param id
     *        The ID of the association between a resolver rule and a VPC. Resolver assigns this value when you submit
     *        an <a>AssociateResolverRule</a> request.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the association between a resolver rule and a VPC. Resolver assigns this value when you submit an
     * <a>AssociateResolverRule</a> request.
     * </p>
     * 
     * @return The ID of the association between a resolver rule and a VPC. Resolver assigns this value when you submit
     *         an <a>AssociateResolverRule</a> request.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the association between a resolver rule and a VPC. Resolver assigns this value when you submit an
     * <a>AssociateResolverRule</a> request.
     * </p>
     * 
     * @param id
     *        The ID of the association between a resolver rule and a VPC. Resolver assigns this value when you submit
     *        an <a>AssociateResolverRule</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRuleAssociation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the resolver rule that you associated with the VPC that is specified by <code>VPCId</code>.
     * </p>
     * 
     * @param resolverRuleId
     *        The ID of the resolver rule that you associated with the VPC that is specified by <code>VPCId</code>.
     */

    public void setResolverRuleId(String resolverRuleId) {
        this.resolverRuleId = resolverRuleId;
    }

    /**
     * <p>
     * The ID of the resolver rule that you associated with the VPC that is specified by <code>VPCId</code>.
     * </p>
     * 
     * @return The ID of the resolver rule that you associated with the VPC that is specified by <code>VPCId</code>.
     */

    public String getResolverRuleId() {
        return this.resolverRuleId;
    }

    /**
     * <p>
     * The ID of the resolver rule that you associated with the VPC that is specified by <code>VPCId</code>.
     * </p>
     * 
     * @param resolverRuleId
     *        The ID of the resolver rule that you associated with the VPC that is specified by <code>VPCId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRuleAssociation withResolverRuleId(String resolverRuleId) {
        setResolverRuleId(resolverRuleId);
        return this;
    }

    /**
     * <p>
     * The name of an association between a resolver rule and a VPC.
     * </p>
     * 
     * @param name
     *        The name of an association between a resolver rule and a VPC.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an association between a resolver rule and a VPC.
     * </p>
     * 
     * @return The name of an association between a resolver rule and a VPC.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of an association between a resolver rule and a VPC.
     * </p>
     * 
     * @param name
     *        The name of an association between a resolver rule and a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRuleAssociation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC that you associated the resolver rule with.
     * </p>
     * 
     * @param vPCId
     *        The ID of the VPC that you associated the resolver rule with.
     */

    public void setVPCId(String vPCId) {
        this.vPCId = vPCId;
    }

    /**
     * <p>
     * The ID of the VPC that you associated the resolver rule with.
     * </p>
     * 
     * @return The ID of the VPC that you associated the resolver rule with.
     */

    public String getVPCId() {
        return this.vPCId;
    }

    /**
     * <p>
     * The ID of the VPC that you associated the resolver rule with.
     * </p>
     * 
     * @param vPCId
     *        The ID of the VPC that you associated the resolver rule with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRuleAssociation withVPCId(String vPCId) {
        setVPCId(vPCId);
        return this;
    }

    /**
     * <p>
     * A code that specifies the current status of the association between a resolver rule and a VPC.
     * </p>
     * 
     * @param status
     *        A code that specifies the current status of the association between a resolver rule and a VPC.
     * @see ResolverRuleAssociationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A code that specifies the current status of the association between a resolver rule and a VPC.
     * </p>
     * 
     * @return A code that specifies the current status of the association between a resolver rule and a VPC.
     * @see ResolverRuleAssociationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A code that specifies the current status of the association between a resolver rule and a VPC.
     * </p>
     * 
     * @param status
     *        A code that specifies the current status of the association between a resolver rule and a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverRuleAssociationStatus
     */

    public ResolverRuleAssociation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A code that specifies the current status of the association between a resolver rule and a VPC.
     * </p>
     * 
     * @param status
     *        A code that specifies the current status of the association between a resolver rule and a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverRuleAssociationStatus
     */

    public ResolverRuleAssociation withStatus(ResolverRuleAssociationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A detailed description of the status of the association between a resolver rule and a VPC.
     * </p>
     * 
     * @param statusMessage
     *        A detailed description of the status of the association between a resolver rule and a VPC.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed description of the status of the association between a resolver rule and a VPC.
     * </p>
     * 
     * @return A detailed description of the status of the association between a resolver rule and a VPC.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A detailed description of the status of the association between a resolver rule and a VPC.
     * </p>
     * 
     * @param statusMessage
     *        A detailed description of the status of the association between a resolver rule and a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolverRuleAssociation withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getResolverRuleId() != null)
            sb.append("ResolverRuleId: ").append(getResolverRuleId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVPCId() != null)
            sb.append("VPCId: ").append(getVPCId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolverRuleAssociation == false)
            return false;
        ResolverRuleAssociation other = (ResolverRuleAssociation) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getResolverRuleId() == null ^ this.getResolverRuleId() == null)
            return false;
        if (other.getResolverRuleId() != null && other.getResolverRuleId().equals(this.getResolverRuleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVPCId() == null ^ this.getVPCId() == null)
            return false;
        if (other.getVPCId() != null && other.getVPCId().equals(this.getVPCId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getResolverRuleId() == null) ? 0 : getResolverRuleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVPCId() == null) ? 0 : getVPCId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public ResolverRuleAssociation clone() {
        try {
            return (ResolverRuleAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.ResolverRuleAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
