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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains settings for an existing Resolver on an Outpost.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/OutpostResolver" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutpostResolver implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the Resolver on an Outpost.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the Outpost Resolver was created, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The date and time that the Outpost Resolver was modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     */
    private String modificationTime;
    /**
     * <p>
     * A unique string that identifies the request that created the Resolver endpoint. The <code>CreatorRequestId</code>
     * allows failed requests to be retried without the risk of running the operation twice.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * The ID of the Resolver on Outpost.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Amazon EC2 instance count for the Resolver on the Outpost.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The Amazon EC2 instance type.
     * </p>
     */
    private String preferredInstanceType;
    /**
     * <p>
     * Name of the Resolver.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Status of the Resolver.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A detailed description of the Resolver.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The ARN (Amazon Resource Name) for the Outpost.
     * </p>
     */
    private String outpostArn;

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the Resolver on an Outpost.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) for the Resolver on an Outpost.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the Resolver on an Outpost.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) for the Resolver on an Outpost.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the Resolver on an Outpost.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) for the Resolver on an Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutpostResolver withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the Outpost Resolver was created, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the Outpost Resolver was created, in Unix time format and Coordinated Universal
     *        Time (UTC).
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the Outpost Resolver was created, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @return The date and time that the Outpost Resolver was created, in Unix time format and Coordinated Universal
     *         Time (UTC).
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the Outpost Resolver was created, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the Outpost Resolver was created, in Unix time format and Coordinated Universal
     *        Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutpostResolver withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the Outpost Resolver was modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the Outpost Resolver was modified, in Unix time format and Coordinated Universal
     *        Time (UTC).
     */

    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }

    /**
     * <p>
     * The date and time that the Outpost Resolver was modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @return The date and time that the Outpost Resolver was modified, in Unix time format and Coordinated Universal
     *         Time (UTC).
     */

    public String getModificationTime() {
        return this.modificationTime;
    }

    /**
     * <p>
     * The date and time that the Outpost Resolver was modified, in Unix time format and Coordinated Universal Time
     * (UTC).
     * </p>
     * 
     * @param modificationTime
     *        The date and time that the Outpost Resolver was modified, in Unix time format and Coordinated Universal
     *        Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutpostResolver withModificationTime(String modificationTime) {
        setModificationTime(modificationTime);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request that created the Resolver endpoint. The <code>CreatorRequestId</code>
     * allows failed requests to be retried without the risk of running the operation twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request that created the Resolver endpoint. The
     *        <code>CreatorRequestId</code> allows failed requests to be retried without the risk of running the
     *        operation twice.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request that created the Resolver endpoint. The <code>CreatorRequestId</code>
     * allows failed requests to be retried without the risk of running the operation twice.
     * </p>
     * 
     * @return A unique string that identifies the request that created the Resolver endpoint. The
     *         <code>CreatorRequestId</code> allows failed requests to be retried without the risk of running the
     *         operation twice.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request that created the Resolver endpoint. The <code>CreatorRequestId</code>
     * allows failed requests to be retried without the risk of running the operation twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request that created the Resolver endpoint. The
     *        <code>CreatorRequestId</code> allows failed requests to be retried without the risk of running the
     *        operation twice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutpostResolver withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * The ID of the Resolver on Outpost.
     * </p>
     * 
     * @param id
     *        The ID of the Resolver on Outpost.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the Resolver on Outpost.
     * </p>
     * 
     * @return The ID of the Resolver on Outpost.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the Resolver on Outpost.
     * </p>
     * 
     * @param id
     *        The ID of the Resolver on Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutpostResolver withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Amazon EC2 instance count for the Resolver on the Outpost.
     * </p>
     * 
     * @param instanceCount
     *        Amazon EC2 instance count for the Resolver on the Outpost.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * Amazon EC2 instance count for the Resolver on the Outpost.
     * </p>
     * 
     * @return Amazon EC2 instance count for the Resolver on the Outpost.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * Amazon EC2 instance count for the Resolver on the Outpost.
     * </p>
     * 
     * @param instanceCount
     *        Amazon EC2 instance count for the Resolver on the Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutpostResolver withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance type.
     * </p>
     * 
     * @param preferredInstanceType
     *        The Amazon EC2 instance type.
     */

    public void setPreferredInstanceType(String preferredInstanceType) {
        this.preferredInstanceType = preferredInstanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type.
     * </p>
     * 
     * @return The Amazon EC2 instance type.
     */

    public String getPreferredInstanceType() {
        return this.preferredInstanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type.
     * </p>
     * 
     * @param preferredInstanceType
     *        The Amazon EC2 instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutpostResolver withPreferredInstanceType(String preferredInstanceType) {
        setPreferredInstanceType(preferredInstanceType);
        return this;
    }

    /**
     * <p>
     * Name of the Resolver.
     * </p>
     * 
     * @param name
     *        Name of the Resolver.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the Resolver.
     * </p>
     * 
     * @return Name of the Resolver.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the Resolver.
     * </p>
     * 
     * @param name
     *        Name of the Resolver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutpostResolver withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Status of the Resolver.
     * </p>
     * 
     * @param status
     *        Status of the Resolver.
     * @see OutpostResolverStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the Resolver.
     * </p>
     * 
     * @return Status of the Resolver.
     * @see OutpostResolverStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the Resolver.
     * </p>
     * 
     * @param status
     *        Status of the Resolver.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutpostResolverStatus
     */

    public OutpostResolver withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the Resolver.
     * </p>
     * 
     * @param status
     *        Status of the Resolver.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutpostResolverStatus
     */

    public OutpostResolver withStatus(OutpostResolverStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A detailed description of the Resolver.
     * </p>
     * 
     * @param statusMessage
     *        A detailed description of the Resolver.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed description of the Resolver.
     * </p>
     * 
     * @return A detailed description of the Resolver.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A detailed description of the Resolver.
     * </p>
     * 
     * @param statusMessage
     *        A detailed description of the Resolver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutpostResolver withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the Outpost.
     * </p>
     * 
     * @param outpostArn
     *        The ARN (Amazon Resource Name) for the Outpost.
     */

    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the Outpost.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) for the Outpost.
     */

    public String getOutpostArn() {
        return this.outpostArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the Outpost.
     * </p>
     * 
     * @param outpostArn
     *        The ARN (Amazon Resource Name) for the Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutpostResolver withOutpostArn(String outpostArn) {
        setOutpostArn(outpostArn);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getModificationTime() != null)
            sb.append("ModificationTime: ").append(getModificationTime()).append(",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getPreferredInstanceType() != null)
            sb.append("PreferredInstanceType: ").append(getPreferredInstanceType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: ").append(getOutpostArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutpostResolver == false)
            return false;
        OutpostResolver other = (OutpostResolver) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getModificationTime() == null ^ this.getModificationTime() == null)
            return false;
        if (other.getModificationTime() != null && other.getModificationTime().equals(this.getModificationTime()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getPreferredInstanceType() == null ^ this.getPreferredInstanceType() == null)
            return false;
        if (other.getPreferredInstanceType() != null && other.getPreferredInstanceType().equals(this.getPreferredInstanceType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null && other.getOutpostArn().equals(this.getOutpostArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getModificationTime() == null) ? 0 : getModificationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getPreferredInstanceType() == null) ? 0 : getPreferredInstanceType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        return hashCode;
    }

    @Override
    public OutpostResolver clone() {
        try {
            return (OutpostResolver) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.OutpostResolverMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
