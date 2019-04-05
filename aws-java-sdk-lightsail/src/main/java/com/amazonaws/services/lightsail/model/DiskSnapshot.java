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
 * Describes a block storage disk snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DiskSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiskSnapshot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk snapshot.
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
     * The date when the disk snapshot was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The AWS Region and Availability Zone where the disk snapshot was created.
     * </p>
     */
    private ResourceLocation location;
    /**
     * <p>
     * The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     */
    private Integer sizeInGb;
    /**
     * <p>
     * The status of the disk snapshot operation.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The progress of the disk snapshot operation.
     * </p>
     */
    private String progress;
    /**
     * <p>
     * The unique name of the source disk from which the disk snapshot was created.
     * </p>
     */
    private String fromDiskName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source disk from which the disk snapshot was created.
     * </p>
     */
    private String fromDiskArn;
    /**
     * <p>
     * The unique name of the source instance from which the disk (system volume) snapshot was created.
     * </p>
     */
    private String fromInstanceName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance from which the disk (system volume) snapshot was created.
     * </p>
     */
    private String fromInstanceArn;

    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     * </p>
     * 
     * @param name
     *        The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     * </p>
     * 
     * @return The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     * </p>
     * 
     * @param name
     *        The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskSnapshot withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk snapshot.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the disk snapshot.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk snapshot.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the disk snapshot.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk snapshot.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the disk snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskSnapshot withArn(String arn) {
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

    public DiskSnapshot withSupportCode(String supportCode) {
        setSupportCode(supportCode);
        return this;
    }

    /**
     * <p>
     * The date when the disk snapshot was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the disk snapshot was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when the disk snapshot was created.
     * </p>
     * 
     * @return The date when the disk snapshot was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date when the disk snapshot was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the disk snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskSnapshot withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the disk snapshot was created.
     * </p>
     * 
     * @param location
     *        The AWS Region and Availability Zone where the disk snapshot was created.
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the disk snapshot was created.
     * </p>
     * 
     * @return The AWS Region and Availability Zone where the disk snapshot was created.
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the disk snapshot was created.
     * </p>
     * 
     * @param location
     *        The AWS Region and Availability Zone where the disk snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskSnapshot withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     * </p>
     * 
     * @return The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public DiskSnapshot withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>DiskSnapshot</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public DiskSnapshot withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @return The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *         <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *         Guide</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *        Guide</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskSnapshot withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskSnapshot withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     * 
     * @param sizeInGb
     *        The size of the disk in GB.
     */

    public void setSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     * 
     * @return The size of the disk in GB.
     */

    public Integer getSizeInGb() {
        return this.sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB.
     * </p>
     * 
     * @param sizeInGb
     *        The size of the disk in GB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskSnapshot withSizeInGb(Integer sizeInGb) {
        setSizeInGb(sizeInGb);
        return this;
    }

    /**
     * <p>
     * The status of the disk snapshot operation.
     * </p>
     * 
     * @param state
     *        The status of the disk snapshot operation.
     * @see DiskSnapshotState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of the disk snapshot operation.
     * </p>
     * 
     * @return The status of the disk snapshot operation.
     * @see DiskSnapshotState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The status of the disk snapshot operation.
     * </p>
     * 
     * @param state
     *        The status of the disk snapshot operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskSnapshotState
     */

    public DiskSnapshot withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The status of the disk snapshot operation.
     * </p>
     * 
     * @param state
     *        The status of the disk snapshot operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskSnapshotState
     */

    public DiskSnapshot withState(DiskSnapshotState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The progress of the disk snapshot operation.
     * </p>
     * 
     * @param progress
     *        The progress of the disk snapshot operation.
     */

    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The progress of the disk snapshot operation.
     * </p>
     * 
     * @return The progress of the disk snapshot operation.
     */

    public String getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * The progress of the disk snapshot operation.
     * </p>
     * 
     * @param progress
     *        The progress of the disk snapshot operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskSnapshot withProgress(String progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * The unique name of the source disk from which the disk snapshot was created.
     * </p>
     * 
     * @param fromDiskName
     *        The unique name of the source disk from which the disk snapshot was created.
     */

    public void setFromDiskName(String fromDiskName) {
        this.fromDiskName = fromDiskName;
    }

    /**
     * <p>
     * The unique name of the source disk from which the disk snapshot was created.
     * </p>
     * 
     * @return The unique name of the source disk from which the disk snapshot was created.
     */

    public String getFromDiskName() {
        return this.fromDiskName;
    }

    /**
     * <p>
     * The unique name of the source disk from which the disk snapshot was created.
     * </p>
     * 
     * @param fromDiskName
     *        The unique name of the source disk from which the disk snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskSnapshot withFromDiskName(String fromDiskName) {
        setFromDiskName(fromDiskName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source disk from which the disk snapshot was created.
     * </p>
     * 
     * @param fromDiskArn
     *        The Amazon Resource Name (ARN) of the source disk from which the disk snapshot was created.
     */

    public void setFromDiskArn(String fromDiskArn) {
        this.fromDiskArn = fromDiskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source disk from which the disk snapshot was created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source disk from which the disk snapshot was created.
     */

    public String getFromDiskArn() {
        return this.fromDiskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source disk from which the disk snapshot was created.
     * </p>
     * 
     * @param fromDiskArn
     *        The Amazon Resource Name (ARN) of the source disk from which the disk snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskSnapshot withFromDiskArn(String fromDiskArn) {
        setFromDiskArn(fromDiskArn);
        return this;
    }

    /**
     * <p>
     * The unique name of the source instance from which the disk (system volume) snapshot was created.
     * </p>
     * 
     * @param fromInstanceName
     *        The unique name of the source instance from which the disk (system volume) snapshot was created.
     */

    public void setFromInstanceName(String fromInstanceName) {
        this.fromInstanceName = fromInstanceName;
    }

    /**
     * <p>
     * The unique name of the source instance from which the disk (system volume) snapshot was created.
     * </p>
     * 
     * @return The unique name of the source instance from which the disk (system volume) snapshot was created.
     */

    public String getFromInstanceName() {
        return this.fromInstanceName;
    }

    /**
     * <p>
     * The unique name of the source instance from which the disk (system volume) snapshot was created.
     * </p>
     * 
     * @param fromInstanceName
     *        The unique name of the source instance from which the disk (system volume) snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskSnapshot withFromInstanceName(String fromInstanceName) {
        setFromInstanceName(fromInstanceName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance from which the disk (system volume) snapshot was created.
     * </p>
     * 
     * @param fromInstanceArn
     *        The Amazon Resource Name (ARN) of the source instance from which the disk (system volume) snapshot was
     *        created.
     */

    public void setFromInstanceArn(String fromInstanceArn) {
        this.fromInstanceArn = fromInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance from which the disk (system volume) snapshot was created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source instance from which the disk (system volume) snapshot was
     *         created.
     */

    public String getFromInstanceArn() {
        return this.fromInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source instance from which the disk (system volume) snapshot was created.
     * </p>
     * 
     * @param fromInstanceArn
     *        The Amazon Resource Name (ARN) of the source instance from which the disk (system volume) snapshot was
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskSnapshot withFromInstanceArn(String fromInstanceArn) {
        setFromInstanceArn(fromInstanceArn);
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
        if (getSupportCode() != null)
            sb.append("SupportCode: ").append(getSupportCode()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSizeInGb() != null)
            sb.append("SizeInGb: ").append(getSizeInGb()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress()).append(",");
        if (getFromDiskName() != null)
            sb.append("FromDiskName: ").append(getFromDiskName()).append(",");
        if (getFromDiskArn() != null)
            sb.append("FromDiskArn: ").append(getFromDiskArn()).append(",");
        if (getFromInstanceName() != null)
            sb.append("FromInstanceName: ").append(getFromInstanceName()).append(",");
        if (getFromInstanceArn() != null)
            sb.append("FromInstanceArn: ").append(getFromInstanceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiskSnapshot == false)
            return false;
        DiskSnapshot other = (DiskSnapshot) obj;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getFromDiskName() == null ^ this.getFromDiskName() == null)
            return false;
        if (other.getFromDiskName() != null && other.getFromDiskName().equals(this.getFromDiskName()) == false)
            return false;
        if (other.getFromDiskArn() == null ^ this.getFromDiskArn() == null)
            return false;
        if (other.getFromDiskArn() != null && other.getFromDiskArn().equals(this.getFromDiskArn()) == false)
            return false;
        if (other.getFromInstanceName() == null ^ this.getFromInstanceName() == null)
            return false;
        if (other.getFromInstanceName() != null && other.getFromInstanceName().equals(this.getFromInstanceName()) == false)
            return false;
        if (other.getFromInstanceArn() == null ^ this.getFromInstanceArn() == null)
            return false;
        if (other.getFromInstanceArn() != null && other.getFromInstanceArn().equals(this.getFromInstanceArn()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getFromDiskName() == null) ? 0 : getFromDiskName().hashCode());
        hashCode = prime * hashCode + ((getFromDiskArn() == null) ? 0 : getFromDiskArn().hashCode());
        hashCode = prime * hashCode + ((getFromInstanceName() == null) ? 0 : getFromInstanceName().hashCode());
        hashCode = prime * hashCode + ((getFromInstanceArn() == null) ? 0 : getFromInstanceArn().hashCode());
        return hashCode;
    }

    @Override
    public DiskSnapshot clone() {
        try {
            return (DiskSnapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.DiskSnapshotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
