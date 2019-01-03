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
 * Describes a system disk or an block storage disk.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/Disk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Disk implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique name of the disk.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk.
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
     * The date when the disk was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The AWS Region and Availability Zone where the disk is located.
     * </p>
     */
    private ResourceLocation location;
    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Disk</code>).
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
     * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     * </p>
     */
    private Boolean isSystemDisk;
    /**
     * <p>
     * The input/output operations per second (IOPS) of the disk.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The disk path.
     * </p>
     */
    private String path;
    /**
     * <p>
     * Describes the status of the disk.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The resources to which the disk is attached.
     * </p>
     */
    private String attachedTo;
    /**
     * <p>
     * A Boolean value indicating whether the disk is attached.
     * </p>
     */
    private Boolean isAttached;
    /**
     * <p>
     * (Deprecated) The attachment state of the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter returned <code>attached</code> for system disks in the API
     * response. It is now deprecated, but still included in the response. Use <code>isAttached</code> instead.
     * </p>
     * </note>
     */
    @Deprecated
    private String attachmentState;
    /**
     * <p>
     * (Deprecated) The number of GB in use by the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter was not included in the API response. It is now
     * deprecated.
     * </p>
     * </note>
     */
    @Deprecated
    private Integer gbInUse;

    /**
     * <p>
     * The unique name of the disk.
     * </p>
     * 
     * @param name
     *        The unique name of the disk.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name of the disk.
     * </p>
     * 
     * @return The unique name of the disk.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name of the disk.
     * </p>
     * 
     * @param name
     *        The unique name of the disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the disk.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the disk.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the disk.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withArn(String arn) {
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

    public Disk withSupportCode(String supportCode) {
        setSupportCode(supportCode);
        return this;
    }

    /**
     * <p>
     * The date when the disk was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the disk was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date when the disk was created.
     * </p>
     * 
     * @return The date when the disk was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date when the disk was created.
     * </p>
     * 
     * @param createdAt
     *        The date when the disk was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the disk is located.
     * </p>
     * 
     * @param location
     *        The AWS Region and Availability Zone where the disk is located.
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the disk is located.
     * </p>
     * 
     * @return The AWS Region and Availability Zone where the disk is located.
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where the disk is located.
     * </p>
     * 
     * @param location
     *        The AWS Region and Availability Zone where the disk is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Disk</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>Disk</code>).
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Disk</code>).
     * </p>
     * 
     * @return The Lightsail resource type (e.g., <code>Disk</code>).
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Disk</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>Disk</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Disk withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Disk</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>Disk</code>).
     * @see ResourceType
     */

    public void setResourceType(ResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The Lightsail resource type (e.g., <code>Disk</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type (e.g., <code>Disk</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Disk withResourceType(ResourceType resourceType) {
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

    public Disk withTags(Tag... tags) {
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

    public Disk withTags(java.util.Collection<Tag> tags) {
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

    public Disk withSizeInGb(Integer sizeInGb) {
        setSizeInGb(sizeInGb);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     * </p>
     * 
     * @param isSystemDisk
     *        A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     */

    public void setIsSystemDisk(Boolean isSystemDisk) {
        this.isSystemDisk = isSystemDisk;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     * </p>
     * 
     * @return A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     */

    public Boolean getIsSystemDisk() {
        return this.isSystemDisk;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     * </p>
     * 
     * @param isSystemDisk
     *        A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withIsSystemDisk(Boolean isSystemDisk) {
        setIsSystemDisk(isSystemDisk);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     * </p>
     * 
     * @return A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
     */

    public Boolean isSystemDisk() {
        return this.isSystemDisk;
    }

    /**
     * <p>
     * The input/output operations per second (IOPS) of the disk.
     * </p>
     * 
     * @param iops
     *        The input/output operations per second (IOPS) of the disk.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The input/output operations per second (IOPS) of the disk.
     * </p>
     * 
     * @return The input/output operations per second (IOPS) of the disk.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The input/output operations per second (IOPS) of the disk.
     * </p>
     * 
     * @param iops
     *        The input/output operations per second (IOPS) of the disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The disk path.
     * </p>
     * 
     * @param path
     *        The disk path.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The disk path.
     * </p>
     * 
     * @return The disk path.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The disk path.
     * </p>
     * 
     * @param path
     *        The disk path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * Describes the status of the disk.
     * </p>
     * 
     * @param state
     *        Describes the status of the disk.
     * @see DiskState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Describes the status of the disk.
     * </p>
     * 
     * @return Describes the status of the disk.
     * @see DiskState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Describes the status of the disk.
     * </p>
     * 
     * @param state
     *        Describes the status of the disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskState
     */

    public Disk withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Describes the status of the disk.
     * </p>
     * 
     * @param state
     *        Describes the status of the disk.
     * @see DiskState
     */

    public void setState(DiskState state) {
        withState(state);
    }

    /**
     * <p>
     * Describes the status of the disk.
     * </p>
     * 
     * @param state
     *        Describes the status of the disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiskState
     */

    public Disk withState(DiskState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The resources to which the disk is attached.
     * </p>
     * 
     * @param attachedTo
     *        The resources to which the disk is attached.
     */

    public void setAttachedTo(String attachedTo) {
        this.attachedTo = attachedTo;
    }

    /**
     * <p>
     * The resources to which the disk is attached.
     * </p>
     * 
     * @return The resources to which the disk is attached.
     */

    public String getAttachedTo() {
        return this.attachedTo;
    }

    /**
     * <p>
     * The resources to which the disk is attached.
     * </p>
     * 
     * @param attachedTo
     *        The resources to which the disk is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withAttachedTo(String attachedTo) {
        setAttachedTo(attachedTo);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the disk is attached.
     * </p>
     * 
     * @param isAttached
     *        A Boolean value indicating whether the disk is attached.
     */

    public void setIsAttached(Boolean isAttached) {
        this.isAttached = isAttached;
    }

    /**
     * <p>
     * A Boolean value indicating whether the disk is attached.
     * </p>
     * 
     * @return A Boolean value indicating whether the disk is attached.
     */

    public Boolean getIsAttached() {
        return this.isAttached;
    }

    /**
     * <p>
     * A Boolean value indicating whether the disk is attached.
     * </p>
     * 
     * @param isAttached
     *        A Boolean value indicating whether the disk is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Disk withIsAttached(Boolean isAttached) {
        setIsAttached(isAttached);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the disk is attached.
     * </p>
     * 
     * @return A Boolean value indicating whether the disk is attached.
     */

    public Boolean isAttached() {
        return this.isAttached;
    }

    /**
     * <p>
     * (Deprecated) The attachment state of the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter returned <code>attached</code> for system disks in the API
     * response. It is now deprecated, but still included in the response. Use <code>isAttached</code> instead.
     * </p>
     * </note>
     * 
     * @param attachmentState
     *        (Deprecated) The attachment state of the disk.</p> <note>
     *        <p>
     *        In releases prior to November 14, 2017, this parameter returned <code>attached</code> for system disks in
     *        the API response. It is now deprecated, but still included in the response. Use <code>isAttached</code>
     *        instead.
     *        </p>
     */
    @Deprecated
    public void setAttachmentState(String attachmentState) {
        this.attachmentState = attachmentState;
    }

    /**
     * <p>
     * (Deprecated) The attachment state of the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter returned <code>attached</code> for system disks in the API
     * response. It is now deprecated, but still included in the response. Use <code>isAttached</code> instead.
     * </p>
     * </note>
     * 
     * @return (Deprecated) The attachment state of the disk.</p> <note>
     *         <p>
     *         In releases prior to November 14, 2017, this parameter returned <code>attached</code> for system disks in
     *         the API response. It is now deprecated, but still included in the response. Use <code>isAttached</code>
     *         instead.
     *         </p>
     */
    @Deprecated
    public String getAttachmentState() {
        return this.attachmentState;
    }

    /**
     * <p>
     * (Deprecated) The attachment state of the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter returned <code>attached</code> for system disks in the API
     * response. It is now deprecated, but still included in the response. Use <code>isAttached</code> instead.
     * </p>
     * </note>
     * 
     * @param attachmentState
     *        (Deprecated) The attachment state of the disk.</p> <note>
     *        <p>
     *        In releases prior to November 14, 2017, this parameter returned <code>attached</code> for system disks in
     *        the API response. It is now deprecated, but still included in the response. Use <code>isAttached</code>
     *        instead.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Disk withAttachmentState(String attachmentState) {
        setAttachmentState(attachmentState);
        return this;
    }

    /**
     * <p>
     * (Deprecated) The number of GB in use by the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter was not included in the API response. It is now
     * deprecated.
     * </p>
     * </note>
     * 
     * @param gbInUse
     *        (Deprecated) The number of GB in use by the disk.</p> <note>
     *        <p>
     *        In releases prior to November 14, 2017, this parameter was not included in the API response. It is now
     *        deprecated.
     *        </p>
     */
    @Deprecated
    public void setGbInUse(Integer gbInUse) {
        this.gbInUse = gbInUse;
    }

    /**
     * <p>
     * (Deprecated) The number of GB in use by the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter was not included in the API response. It is now
     * deprecated.
     * </p>
     * </note>
     * 
     * @return (Deprecated) The number of GB in use by the disk.</p> <note>
     *         <p>
     *         In releases prior to November 14, 2017, this parameter was not included in the API response. It is now
     *         deprecated.
     *         </p>
     */
    @Deprecated
    public Integer getGbInUse() {
        return this.gbInUse;
    }

    /**
     * <p>
     * (Deprecated) The number of GB in use by the disk.
     * </p>
     * <note>
     * <p>
     * In releases prior to November 14, 2017, this parameter was not included in the API response. It is now
     * deprecated.
     * </p>
     * </note>
     * 
     * @param gbInUse
     *        (Deprecated) The number of GB in use by the disk.</p> <note>
     *        <p>
     *        In releases prior to November 14, 2017, this parameter was not included in the API response. It is now
     *        deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Disk withGbInUse(Integer gbInUse) {
        setGbInUse(gbInUse);
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
        if (getIsSystemDisk() != null)
            sb.append("IsSystemDisk: ").append(getIsSystemDisk()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getAttachedTo() != null)
            sb.append("AttachedTo: ").append(getAttachedTo()).append(",");
        if (getIsAttached() != null)
            sb.append("IsAttached: ").append(getIsAttached()).append(",");
        if (getAttachmentState() != null)
            sb.append("AttachmentState: ").append(getAttachmentState()).append(",");
        if (getGbInUse() != null)
            sb.append("GbInUse: ").append(getGbInUse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Disk == false)
            return false;
        Disk other = (Disk) obj;
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
        if (other.getIsSystemDisk() == null ^ this.getIsSystemDisk() == null)
            return false;
        if (other.getIsSystemDisk() != null && other.getIsSystemDisk().equals(this.getIsSystemDisk()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getAttachedTo() == null ^ this.getAttachedTo() == null)
            return false;
        if (other.getAttachedTo() != null && other.getAttachedTo().equals(this.getAttachedTo()) == false)
            return false;
        if (other.getIsAttached() == null ^ this.getIsAttached() == null)
            return false;
        if (other.getIsAttached() != null && other.getIsAttached().equals(this.getIsAttached()) == false)
            return false;
        if (other.getAttachmentState() == null ^ this.getAttachmentState() == null)
            return false;
        if (other.getAttachmentState() != null && other.getAttachmentState().equals(this.getAttachmentState()) == false)
            return false;
        if (other.getGbInUse() == null ^ this.getGbInUse() == null)
            return false;
        if (other.getGbInUse() != null && other.getGbInUse().equals(this.getGbInUse()) == false)
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
        hashCode = prime * hashCode + ((getIsSystemDisk() == null) ? 0 : getIsSystemDisk().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getAttachedTo() == null) ? 0 : getAttachedTo().hashCode());
        hashCode = prime * hashCode + ((getIsAttached() == null) ? 0 : getIsAttached().hashCode());
        hashCode = prime * hashCode + ((getAttachmentState() == null) ? 0 : getAttachmentState().hashCode());
        hashCode = prime * hashCode + ((getGbInUse() == null) ? 0 : getGbInUse().hashCode());
        return hashCode;
    }

    @Override
    public Disk clone() {
        try {
            return (Disk) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.DiskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
