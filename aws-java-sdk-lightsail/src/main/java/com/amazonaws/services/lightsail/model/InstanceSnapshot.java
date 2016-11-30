/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes the snapshot of the virtual private server, or <i>instance</i>.
 * </p>
 */
public class InstanceSnapshot implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot (e.g.,
     * <code>arn:aws:lightsail:us-east-1:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE</code>).
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     */
    private String supportCode;
    /**
     * <p>
     * The timestamp when the snapshot was created (e.g., <code>1479907467.024</code>).
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The region name and availability zone where you created the snapshot.
     * </p>
     */
    private ResourceLocation location;
    /**
     * <p>
     * The type of resource (usually <code>InstanceSnapshot</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The state the snapshot is in.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The progress of the snapshot.
     * </p>
     */
    private String progress;
    /**
     * <p>
     * The instance from which the snapshot was created.
     * </p>
     */
    private String fromInstanceName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance from which the snapshot was created (e.g.,
     * <code>arn:aws:lightsail:us-east-1:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE</code>).
     * </p>
     */
    private String fromInstanceArn;
    /**
     * <p>
     * The blueprint ID from which you created the snapshot (e.g., <code>os_debian_8_3</code>). A blueprint is a virtual
     * private server (or <i>instance</i>) image used to create instances quickly.
     * </p>
     */
    private String fromBlueprintId;
    /**
     * <p>
     * The bundle ID from which you created the snapshot (e.g., <code>micro_1_0</code>).
     * </p>
     */
    private String fromBundleId;
    /**
     * <p>
     * The size in GB of the SSD.
     * </p>
     */
    private Integer sizeInGb;

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * 
     * @param name
     *        The name of the snapshot.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * 
     * @return The name of the snapshot.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * 
     * @param name
     *        The name of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSnapshot withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot (e.g.,
     * <code>arn:aws:lightsail:us-east-1:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE</code>).
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the snapshot (e.g.,
     *        <code>arn:aws:lightsail:us-east-1:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE</code>
     *        ).
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot (e.g.,
     * <code>arn:aws:lightsail:us-east-1:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE</code>).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the snapshot (e.g.,
     *         <code>arn:aws:lightsail:us-east-1:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE</code>
     *         ).
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot (e.g.,
     * <code>arn:aws:lightsail:us-east-1:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE</code>).
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the snapshot (e.g.,
     *        <code>arn:aws:lightsail:us-east-1:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE</code>
     *        ).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSnapshot withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about an instance or
     *        another resource in Lightsail. This code enables our support team to look up your Lightsail information
     *        more easily.
     */

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @return The support code. Include this code in your email to support when you have questions about an instance or
     *         another resource in Lightsail. This code enables our support team to look up your Lightsail information
     *         more easily.
     */

    public String getSupportCode() {
        return this.supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about an instance or
     *        another resource in Lightsail. This code enables our support team to look up your Lightsail information
     *        more easily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSnapshot withSupportCode(String supportCode) {
        setSupportCode(supportCode);
        return this;
    }

    /**
     * <p>
     * The timestamp when the snapshot was created (e.g., <code>1479907467.024</code>).
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the snapshot was created (e.g., <code>1479907467.024</code>).
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the snapshot was created (e.g., <code>1479907467.024</code>).
     * </p>
     * 
     * @return The timestamp when the snapshot was created (e.g., <code>1479907467.024</code>).
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the snapshot was created (e.g., <code>1479907467.024</code>).
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the snapshot was created (e.g., <code>1479907467.024</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSnapshot withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The region name and availability zone where you created the snapshot.
     * </p>
     * 
     * @param location
     *        The region name and availability zone where you created the snapshot.
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The region name and availability zone where you created the snapshot.
     * </p>
     * 
     * @return The region name and availability zone where you created the snapshot.
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The region name and availability zone where you created the snapshot.
     * </p>
     * 
     * @param location
     *        The region name and availability zone where you created the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSnapshot withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The type of resource (usually <code>InstanceSnapshot</code>).
     * </p>
     * 
     * @param resourceType
     *        The type of resource (usually <code>InstanceSnapshot</code>).
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource (usually <code>InstanceSnapshot</code>).
     * </p>
     * 
     * @return The type of resource (usually <code>InstanceSnapshot</code>).
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource (usually <code>InstanceSnapshot</code>).
     * </p>
     * 
     * @param resourceType
     *        The type of resource (usually <code>InstanceSnapshot</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public InstanceSnapshot withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource (usually <code>InstanceSnapshot</code>).
     * </p>
     * 
     * @param resourceType
     *        The type of resource (usually <code>InstanceSnapshot</code>).
     * @see ResourceType
     */

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of resource (usually <code>InstanceSnapshot</code>).
     * </p>
     * 
     * @param resourceType
     *        The type of resource (usually <code>InstanceSnapshot</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public InstanceSnapshot withResourceType(ResourceType resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The state the snapshot is in.
     * </p>
     * 
     * @param state
     *        The state the snapshot is in.
     * @see InstanceSnapshotState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state the snapshot is in.
     * </p>
     * 
     * @return The state the snapshot is in.
     * @see InstanceSnapshotState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state the snapshot is in.
     * </p>
     * 
     * @param state
     *        The state the snapshot is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceSnapshotState
     */

    public InstanceSnapshot withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state the snapshot is in.
     * </p>
     * 
     * @param state
     *        The state the snapshot is in.
     * @see InstanceSnapshotState
     */

    public void setState(InstanceSnapshotState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state the snapshot is in.
     * </p>
     * 
     * @param state
     *        The state the snapshot is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceSnapshotState
     */

    public InstanceSnapshot withState(InstanceSnapshotState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The progress of the snapshot.
     * </p>
     * 
     * @param progress
     *        The progress of the snapshot.
     */

    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The progress of the snapshot.
     * </p>
     * 
     * @return The progress of the snapshot.
     */

    public String getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * The progress of the snapshot.
     * </p>
     * 
     * @param progress
     *        The progress of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSnapshot withProgress(String progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * The instance from which the snapshot was created.
     * </p>
     * 
     * @param fromInstanceName
     *        The instance from which the snapshot was created.
     */

    public void setFromInstanceName(String fromInstanceName) {
        this.fromInstanceName = fromInstanceName;
    }

    /**
     * <p>
     * The instance from which the snapshot was created.
     * </p>
     * 
     * @return The instance from which the snapshot was created.
     */

    public String getFromInstanceName() {
        return this.fromInstanceName;
    }

    /**
     * <p>
     * The instance from which the snapshot was created.
     * </p>
     * 
     * @param fromInstanceName
     *        The instance from which the snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSnapshot withFromInstanceName(String fromInstanceName) {
        setFromInstanceName(fromInstanceName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance from which the snapshot was created (e.g.,
     * <code>arn:aws:lightsail:us-east-1:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE</code>).
     * </p>
     * 
     * @param fromInstanceArn
     *        The Amazon Resource Name (ARN) of the instance from which the snapshot was created (e.g.,
     *        <code>arn:aws:lightsail:us-east-1:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE</code>).
     */

    public void setFromInstanceArn(String fromInstanceArn) {
        this.fromInstanceArn = fromInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance from which the snapshot was created (e.g.,
     * <code>arn:aws:lightsail:us-east-1:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE</code>).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the instance from which the snapshot was created (e.g.,
     *         <code>arn:aws:lightsail:us-east-1:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE</code>).
     */

    public String getFromInstanceArn() {
        return this.fromInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance from which the snapshot was created (e.g.,
     * <code>arn:aws:lightsail:us-east-1:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE</code>).
     * </p>
     * 
     * @param fromInstanceArn
     *        The Amazon Resource Name (ARN) of the instance from which the snapshot was created (e.g.,
     *        <code>arn:aws:lightsail:us-east-1:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSnapshot withFromInstanceArn(String fromInstanceArn) {
        setFromInstanceArn(fromInstanceArn);
        return this;
    }

    /**
     * <p>
     * The blueprint ID from which you created the snapshot (e.g., <code>os_debian_8_3</code>). A blueprint is a virtual
     * private server (or <i>instance</i>) image used to create instances quickly.
     * </p>
     * 
     * @param fromBlueprintId
     *        The blueprint ID from which you created the snapshot (e.g., <code>os_debian_8_3</code>). A blueprint is a
     *        virtual private server (or <i>instance</i>) image used to create instances quickly.
     */

    public void setFromBlueprintId(String fromBlueprintId) {
        this.fromBlueprintId = fromBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID from which you created the snapshot (e.g., <code>os_debian_8_3</code>). A blueprint is a virtual
     * private server (or <i>instance</i>) image used to create instances quickly.
     * </p>
     * 
     * @return The blueprint ID from which you created the snapshot (e.g., <code>os_debian_8_3</code>). A blueprint is a
     *         virtual private server (or <i>instance</i>) image used to create instances quickly.
     */

    public String getFromBlueprintId() {
        return this.fromBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID from which you created the snapshot (e.g., <code>os_debian_8_3</code>). A blueprint is a virtual
     * private server (or <i>instance</i>) image used to create instances quickly.
     * </p>
     * 
     * @param fromBlueprintId
     *        The blueprint ID from which you created the snapshot (e.g., <code>os_debian_8_3</code>). A blueprint is a
     *        virtual private server (or <i>instance</i>) image used to create instances quickly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSnapshot withFromBlueprintId(String fromBlueprintId) {
        setFromBlueprintId(fromBlueprintId);
        return this;
    }

    /**
     * <p>
     * The bundle ID from which you created the snapshot (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @param fromBundleId
     *        The bundle ID from which you created the snapshot (e.g., <code>micro_1_0</code>).
     */

    public void setFromBundleId(String fromBundleId) {
        this.fromBundleId = fromBundleId;
    }

    /**
     * <p>
     * The bundle ID from which you created the snapshot (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @return The bundle ID from which you created the snapshot (e.g., <code>micro_1_0</code>).
     */

    public String getFromBundleId() {
        return this.fromBundleId;
    }

    /**
     * <p>
     * The bundle ID from which you created the snapshot (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @param fromBundleId
     *        The bundle ID from which you created the snapshot (e.g., <code>micro_1_0</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSnapshot withFromBundleId(String fromBundleId) {
        setFromBundleId(fromBundleId);
        return this;
    }

    /**
     * <p>
     * The size in GB of the SSD.
     * </p>
     * 
     * @param sizeInGb
     *        The size in GB of the SSD.
     */

    public void setSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
    }

    /**
     * <p>
     * The size in GB of the SSD.
     * </p>
     * 
     * @return The size in GB of the SSD.
     */

    public Integer getSizeInGb() {
        return this.sizeInGb;
    }

    /**
     * <p>
     * The size in GB of the SSD.
     * </p>
     * 
     * @param sizeInGb
     *        The size in GB of the SSD.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSnapshot withSizeInGb(Integer sizeInGb) {
        setSizeInGb(sizeInGb);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Name: " + getName() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getSupportCode() != null)
            sb.append("SupportCode: " + getSupportCode() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getProgress() != null)
            sb.append("Progress: " + getProgress() + ",");
        if (getFromInstanceName() != null)
            sb.append("FromInstanceName: " + getFromInstanceName() + ",");
        if (getFromInstanceArn() != null)
            sb.append("FromInstanceArn: " + getFromInstanceArn() + ",");
        if (getFromBlueprintId() != null)
            sb.append("FromBlueprintId: " + getFromBlueprintId() + ",");
        if (getFromBundleId() != null)
            sb.append("FromBundleId: " + getFromBundleId() + ",");
        if (getSizeInGb() != null)
            sb.append("SizeInGb: " + getSizeInGb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceSnapshot == false)
            return false;
        InstanceSnapshot other = (InstanceSnapshot) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null && other.getSupportCode().equals(this.getSupportCode()) == false)
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
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getFromInstanceName() == null ^ this.getFromInstanceName() == null)
            return false;
        if (other.getFromInstanceName() != null && other.getFromInstanceName().equals(this.getFromInstanceName()) == false)
            return false;
        if (other.getFromInstanceArn() == null ^ this.getFromInstanceArn() == null)
            return false;
        if (other.getFromInstanceArn() != null && other.getFromInstanceArn().equals(this.getFromInstanceArn()) == false)
            return false;
        if (other.getFromBlueprintId() == null ^ this.getFromBlueprintId() == null)
            return false;
        if (other.getFromBlueprintId() != null && other.getFromBlueprintId().equals(this.getFromBlueprintId()) == false)
            return false;
        if (other.getFromBundleId() == null ^ this.getFromBundleId() == null)
            return false;
        if (other.getFromBundleId() != null && other.getFromBundleId().equals(this.getFromBundleId()) == false)
            return false;
        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getFromInstanceName() == null) ? 0 : getFromInstanceName().hashCode());
        hashCode = prime * hashCode + ((getFromInstanceArn() == null) ? 0 : getFromInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getFromBlueprintId() == null) ? 0 : getFromBlueprintId().hashCode());
        hashCode = prime * hashCode + ((getFromBundleId() == null) ? 0 : getFromBundleId().hashCode());
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        return hashCode;
    }

    @Override
    public InstanceSnapshot clone() {
        try {
            return (InstanceSnapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
