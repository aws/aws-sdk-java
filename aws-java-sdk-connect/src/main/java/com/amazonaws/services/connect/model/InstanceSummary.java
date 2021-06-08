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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/InstanceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the instance.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The identity management type of the instance.
     * </p>
     */
    private String identityManagementType;
    /**
     * <p>
     * The alias of the instance.
     * </p>
     */
    private String instanceAlias;
    /**
     * <p>
     * When the instance was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The service role of the instance.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * The state of the instance.
     * </p>
     */
    private String instanceStatus;
    /**
     * <p>
     * Whether inbound calls are enabled.
     * </p>
     */
    private Boolean inboundCallsEnabled;
    /**
     * <p>
     * Whether outbound calls are enabled.
     * </p>
     */
    private Boolean outboundCallsEnabled;

    /**
     * <p>
     * The identifier of the instance.
     * </p>
     * 
     * @param id
     *        The identifier of the instance.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the instance.
     * </p>
     * 
     * @return The identifier of the instance.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the instance.
     * </p>
     * 
     * @param id
     *        The identifier of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the instance.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the instance.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The identity management type of the instance.
     * </p>
     * 
     * @param identityManagementType
     *        The identity management type of the instance.
     * @see DirectoryType
     */

    public void setIdentityManagementType(String identityManagementType) {
        this.identityManagementType = identityManagementType;
    }

    /**
     * <p>
     * The identity management type of the instance.
     * </p>
     * 
     * @return The identity management type of the instance.
     * @see DirectoryType
     */

    public String getIdentityManagementType() {
        return this.identityManagementType;
    }

    /**
     * <p>
     * The identity management type of the instance.
     * </p>
     * 
     * @param identityManagementType
     *        The identity management type of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryType
     */

    public InstanceSummary withIdentityManagementType(String identityManagementType) {
        setIdentityManagementType(identityManagementType);
        return this;
    }

    /**
     * <p>
     * The identity management type of the instance.
     * </p>
     * 
     * @param identityManagementType
     *        The identity management type of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryType
     */

    public InstanceSummary withIdentityManagementType(DirectoryType identityManagementType) {
        this.identityManagementType = identityManagementType.toString();
        return this;
    }

    /**
     * <p>
     * The alias of the instance.
     * </p>
     * 
     * @param instanceAlias
     *        The alias of the instance.
     */

    public void setInstanceAlias(String instanceAlias) {
        this.instanceAlias = instanceAlias;
    }

    /**
     * <p>
     * The alias of the instance.
     * </p>
     * 
     * @return The alias of the instance.
     */

    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    /**
     * <p>
     * The alias of the instance.
     * </p>
     * 
     * @param instanceAlias
     *        The alias of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withInstanceAlias(String instanceAlias) {
        setInstanceAlias(instanceAlias);
        return this;
    }

    /**
     * <p>
     * When the instance was created.
     * </p>
     * 
     * @param createdTime
     *        When the instance was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * When the instance was created.
     * </p>
     * 
     * @return When the instance was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * When the instance was created.
     * </p>
     * 
     * @param createdTime
     *        When the instance was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The service role of the instance.
     * </p>
     * 
     * @param serviceRole
     *        The service role of the instance.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The service role of the instance.
     * </p>
     * 
     * @return The service role of the instance.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The service role of the instance.
     * </p>
     * 
     * @param serviceRole
     *        The service role of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * The state of the instance.
     * </p>
     * 
     * @param instanceStatus
     *        The state of the instance.
     * @see InstanceStatus
     */

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    /**
     * <p>
     * The state of the instance.
     * </p>
     * 
     * @return The state of the instance.
     * @see InstanceStatus
     */

    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * <p>
     * The state of the instance.
     * </p>
     * 
     * @param instanceStatus
     *        The state of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStatus
     */

    public InstanceSummary withInstanceStatus(String instanceStatus) {
        setInstanceStatus(instanceStatus);
        return this;
    }

    /**
     * <p>
     * The state of the instance.
     * </p>
     * 
     * @param instanceStatus
     *        The state of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStatus
     */

    public InstanceSummary withInstanceStatus(InstanceStatus instanceStatus) {
        this.instanceStatus = instanceStatus.toString();
        return this;
    }

    /**
     * <p>
     * Whether inbound calls are enabled.
     * </p>
     * 
     * @param inboundCallsEnabled
     *        Whether inbound calls are enabled.
     */

    public void setInboundCallsEnabled(Boolean inboundCallsEnabled) {
        this.inboundCallsEnabled = inboundCallsEnabled;
    }

    /**
     * <p>
     * Whether inbound calls are enabled.
     * </p>
     * 
     * @return Whether inbound calls are enabled.
     */

    public Boolean getInboundCallsEnabled() {
        return this.inboundCallsEnabled;
    }

    /**
     * <p>
     * Whether inbound calls are enabled.
     * </p>
     * 
     * @param inboundCallsEnabled
     *        Whether inbound calls are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withInboundCallsEnabled(Boolean inboundCallsEnabled) {
        setInboundCallsEnabled(inboundCallsEnabled);
        return this;
    }

    /**
     * <p>
     * Whether inbound calls are enabled.
     * </p>
     * 
     * @return Whether inbound calls are enabled.
     */

    public Boolean isInboundCallsEnabled() {
        return this.inboundCallsEnabled;
    }

    /**
     * <p>
     * Whether outbound calls are enabled.
     * </p>
     * 
     * @param outboundCallsEnabled
     *        Whether outbound calls are enabled.
     */

    public void setOutboundCallsEnabled(Boolean outboundCallsEnabled) {
        this.outboundCallsEnabled = outboundCallsEnabled;
    }

    /**
     * <p>
     * Whether outbound calls are enabled.
     * </p>
     * 
     * @return Whether outbound calls are enabled.
     */

    public Boolean getOutboundCallsEnabled() {
        return this.outboundCallsEnabled;
    }

    /**
     * <p>
     * Whether outbound calls are enabled.
     * </p>
     * 
     * @param outboundCallsEnabled
     *        Whether outbound calls are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withOutboundCallsEnabled(Boolean outboundCallsEnabled) {
        setOutboundCallsEnabled(outboundCallsEnabled);
        return this;
    }

    /**
     * <p>
     * Whether outbound calls are enabled.
     * </p>
     * 
     * @return Whether outbound calls are enabled.
     */

    public Boolean isOutboundCallsEnabled() {
        return this.outboundCallsEnabled;
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
        if (getIdentityManagementType() != null)
            sb.append("IdentityManagementType: ").append(getIdentityManagementType()).append(",");
        if (getInstanceAlias() != null)
            sb.append("InstanceAlias: ").append("***Sensitive Data Redacted***").append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getInstanceStatus() != null)
            sb.append("InstanceStatus: ").append(getInstanceStatus()).append(",");
        if (getInboundCallsEnabled() != null)
            sb.append("InboundCallsEnabled: ").append(getInboundCallsEnabled()).append(",");
        if (getOutboundCallsEnabled() != null)
            sb.append("OutboundCallsEnabled: ").append(getOutboundCallsEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceSummary == false)
            return false;
        InstanceSummary other = (InstanceSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getIdentityManagementType() == null ^ this.getIdentityManagementType() == null)
            return false;
        if (other.getIdentityManagementType() != null && other.getIdentityManagementType().equals(this.getIdentityManagementType()) == false)
            return false;
        if (other.getInstanceAlias() == null ^ this.getInstanceAlias() == null)
            return false;
        if (other.getInstanceAlias() != null && other.getInstanceAlias().equals(this.getInstanceAlias()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getInstanceStatus() == null ^ this.getInstanceStatus() == null)
            return false;
        if (other.getInstanceStatus() != null && other.getInstanceStatus().equals(this.getInstanceStatus()) == false)
            return false;
        if (other.getInboundCallsEnabled() == null ^ this.getInboundCallsEnabled() == null)
            return false;
        if (other.getInboundCallsEnabled() != null && other.getInboundCallsEnabled().equals(this.getInboundCallsEnabled()) == false)
            return false;
        if (other.getOutboundCallsEnabled() == null ^ this.getOutboundCallsEnabled() == null)
            return false;
        if (other.getOutboundCallsEnabled() != null && other.getOutboundCallsEnabled().equals(this.getOutboundCallsEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getIdentityManagementType() == null) ? 0 : getIdentityManagementType().hashCode());
        hashCode = prime * hashCode + ((getInstanceAlias() == null) ? 0 : getInstanceAlias().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getInstanceStatus() == null) ? 0 : getInstanceStatus().hashCode());
        hashCode = prime * hashCode + ((getInboundCallsEnabled() == null) ? 0 : getInboundCallsEnabled().hashCode());
        hashCode = prime * hashCode + ((getOutboundCallsEnabled() == null) ? 0 : getOutboundCallsEnabled().hashCode());
        return hashCode;
    }

    @Override
    public InstanceSummary clone() {
        try {
            return (InstanceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.InstanceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
