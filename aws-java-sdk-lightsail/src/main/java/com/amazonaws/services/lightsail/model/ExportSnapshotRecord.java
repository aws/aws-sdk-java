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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an export snapshot record.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ExportSnapshotRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportSnapshotRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The export snapshot record name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export snapshot record.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date when the export snapshot record was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The AWS Region and Availability Zone where the export snapshot record is located.
     * </p>
     */
    private ResourceLocation location;
    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The state of the export snapshot record.
     * </p>
     */
    private String state;
    /**
     * <p>
     * A list of objects describing the source of the export snapshot record.
     * </p>
     */
    private ExportSnapshotRecordSourceInfo sourceInfo;
    /**
     * <p>
     * A list of objects describing the destination of the export snapshot record.
     * </p>
     */
    private DestinationInfo destinationInfo;

    /**
     * <p>
     * The export snapshot record name.
     * </p>
     * 
     * @param name
     *        The export snapshot record name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The export snapshot record name.
     * </p>
     * 
     * @return The export snapshot record name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The export snapshot record name.
     * </p>
     * 
     * @param name
     *        The export snapshot record name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSnapshotRecord withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export snapshot record.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the export snapshot record.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export snapshot record.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the export snapshot record.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export snapshot record.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the export snapshot record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSnapshotRecord withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date when the export snapshot record was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the export snapshot record was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when the export snapshot record was created.
     * </p>
     * 
     * @return The date when the export snapshot record was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date when the export snapshot record was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the export snapshot record was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSnapshotRecord withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the export snapshot record is located.
     * </p>
     * 
     * @param location
     *        The AWS Region and Availability Zone where the export snapshot record is located.
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the export snapshot record is located.
     * </p>
     * 
     * @return The AWS Region and Availability Zone where the export snapshot record is located.
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the export snapshot record is located.
     * </p>
     * 
     * @param location
     *        The AWS Region and Availability Zone where the export snapshot record is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSnapshotRecord withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * </p>
     * 
     * @return The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ExportSnapshotRecord withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>ExportSnapshotRecord</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ExportSnapshotRecord withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The state of the export snapshot record.
     * </p>
     * 
     * @param state
     *        The state of the export snapshot record.
     * @see RecordState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the export snapshot record.
     * </p>
     * 
     * @return The state of the export snapshot record.
     * @see RecordState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the export snapshot record.
     * </p>
     * 
     * @param state
     *        The state of the export snapshot record.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordState
     */

    public ExportSnapshotRecord withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the export snapshot record.
     * </p>
     * 
     * @param state
     *        The state of the export snapshot record.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordState
     */

    public ExportSnapshotRecord withState(RecordState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A list of objects describing the source of the export snapshot record.
     * </p>
     * 
     * @param sourceInfo
     *        A list of objects describing the source of the export snapshot record.
     */

    public void setSourceInfo(ExportSnapshotRecordSourceInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    /**
     * <p>
     * A list of objects describing the source of the export snapshot record.
     * </p>
     * 
     * @return A list of objects describing the source of the export snapshot record.
     */

    public ExportSnapshotRecordSourceInfo getSourceInfo() {
        return this.sourceInfo;
    }

    /**
     * <p>
     * A list of objects describing the source of the export snapshot record.
     * </p>
     * 
     * @param sourceInfo
     *        A list of objects describing the source of the export snapshot record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSnapshotRecord withSourceInfo(ExportSnapshotRecordSourceInfo sourceInfo) {
        setSourceInfo(sourceInfo);
        return this;
    }

    /**
     * <p>
     * A list of objects describing the destination of the export snapshot record.
     * </p>
     * 
     * @param destinationInfo
     *        A list of objects describing the destination of the export snapshot record.
     */

    public void setDestinationInfo(DestinationInfo destinationInfo) {
        this.destinationInfo = destinationInfo;
    }

    /**
     * <p>
     * A list of objects describing the destination of the export snapshot record.
     * </p>
     * 
     * @return A list of objects describing the destination of the export snapshot record.
     */

    public DestinationInfo getDestinationInfo() {
        return this.destinationInfo;
    }

    /**
     * <p>
     * A list of objects describing the destination of the export snapshot record.
     * </p>
     * 
     * @param destinationInfo
     *        A list of objects describing the destination of the export snapshot record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSnapshotRecord withDestinationInfo(DestinationInfo destinationInfo) {
        setDestinationInfo(destinationInfo);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getSourceInfo() != null)
            sb.append("SourceInfo: ").append(getSourceInfo()).append(",");
        if (getDestinationInfo() != null)
            sb.append("DestinationInfo: ").append(getDestinationInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportSnapshotRecord == false)
            return false;
        ExportSnapshotRecord other = (ExportSnapshotRecord) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getSourceInfo() == null ^ this.getSourceInfo() == null)
            return false;
        if (other.getSourceInfo() != null && other.getSourceInfo().equals(this.getSourceInfo()) == false)
            return false;
        if (other.getDestinationInfo() == null ^ this.getDestinationInfo() == null)
            return false;
        if (other.getDestinationInfo() != null && other.getDestinationInfo().equals(this.getDestinationInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getSourceInfo() == null) ? 0 : getSourceInfo().hashCode());
        hashCode = prime * hashCode + ((getDestinationInfo() == null) ? 0 : getDestinationInfo().hashCode());
        return hashCode;
    }

    @Override
    public ExportSnapshotRecord clone() {
        try {
            return (ExportSnapshotRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.ExportSnapshotRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
