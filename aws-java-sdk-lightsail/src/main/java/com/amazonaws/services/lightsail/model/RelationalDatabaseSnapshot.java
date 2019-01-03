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
 * Describes a database snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RelationalDatabaseSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalDatabaseSnapshot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the database snapshot.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database snapshot.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The support code for the database snapshot. Include this code in your email to support when you have questions
     * about a database snapshot in Lightsail. This code enables our support team to look up your Lightsail information
     * more easily.
     * </p>
     */
    private String supportCode;
    /**
     * <p>
     * The timestamp when the database snapshot was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Region name and Availability Zone where the database snapshot is located.
     * </p>
     */
    private ResourceLocation location;
    /**
     * <p>
     * The Lightsail resource type.
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
     * The software of the database snapshot (for example, <code>MySQL</code>)
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The database engine version for the database snapshot (for example, <code>5.7.23</code>).
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The size of the disk in GB (for example, <code>32</code>) for the database snapshot.
     * </p>
     */
    private Integer sizeInGb;
    /**
     * <p>
     * The state of the database snapshot.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The name of the source database from which the database snapshot was created.
     * </p>
     */
    private String fromRelationalDatabaseName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database from which the database snapshot was created.
     * </p>
     */
    private String fromRelationalDatabaseArn;
    /**
     * <p>
     * The bundle ID of the database from which the database snapshot was created.
     * </p>
     */
    private String fromRelationalDatabaseBundleId;
    /**
     * <p>
     * The blueprint ID of the database from which the database snapshot was created. A blueprint describes the major
     * engine version of a database.
     * </p>
     */
    private String fromRelationalDatabaseBlueprintId;

    /**
     * <p>
     * The name of the database snapshot.
     * </p>
     * 
     * @param name
     *        The name of the database snapshot.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the database snapshot.
     * </p>
     * 
     * @return The name of the database snapshot.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the database snapshot.
     * </p>
     * 
     * @param name
     *        The name of the database snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseSnapshot withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database snapshot.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the database snapshot.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database snapshot.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the database snapshot.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database snapshot.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the database snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseSnapshot withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The support code for the database snapshot. Include this code in your email to support when you have questions
     * about a database snapshot in Lightsail. This code enables our support team to look up your Lightsail information
     * more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code for the database snapshot. Include this code in your email to support when you have
     *        questions about a database snapshot in Lightsail. This code enables our support team to look up your
     *        Lightsail information more easily.
     */

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code for the database snapshot. Include this code in your email to support when you have questions
     * about a database snapshot in Lightsail. This code enables our support team to look up your Lightsail information
     * more easily.
     * </p>
     * 
     * @return The support code for the database snapshot. Include this code in your email to support when you have
     *         questions about a database snapshot in Lightsail. This code enables our support team to look up your
     *         Lightsail information more easily.
     */

    public String getSupportCode() {
        return this.supportCode;
    }

    /**
     * <p>
     * The support code for the database snapshot. Include this code in your email to support when you have questions
     * about a database snapshot in Lightsail. This code enables our support team to look up your Lightsail information
     * more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code for the database snapshot. Include this code in your email to support when you have
     *        questions about a database snapshot in Lightsail. This code enables our support team to look up your
     *        Lightsail information more easily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseSnapshot withSupportCode(String supportCode) {
        setSupportCode(supportCode);
        return this;
    }

    /**
     * <p>
     * The timestamp when the database snapshot was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the database snapshot was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the database snapshot was created.
     * </p>
     * 
     * @return The timestamp when the database snapshot was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the database snapshot was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the database snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseSnapshot withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Region name and Availability Zone where the database snapshot is located.
     * </p>
     * 
     * @param location
     *        The Region name and Availability Zone where the database snapshot is located.
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The Region name and Availability Zone where the database snapshot is located.
     * </p>
     * 
     * @return The Region name and Availability Zone where the database snapshot is located.
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The Region name and Availability Zone where the database snapshot is located.
     * </p>
     * 
     * @param location
     *        The Region name and Availability Zone where the database snapshot is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseSnapshot withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type.
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type.
     * </p>
     * 
     * @return The Lightsail resource type.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type.
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RelationalDatabaseSnapshot withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Lightsail resource type.
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RelationalDatabaseSnapshot withResourceType(ResourceType resourceType) {
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

    public RelationalDatabaseSnapshot withTags(Tag... tags) {
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

    public RelationalDatabaseSnapshot withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The software of the database snapshot (for example, <code>MySQL</code>)
     * </p>
     * 
     * @param engine
     *        The software of the database snapshot (for example, <code>MySQL</code>)
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The software of the database snapshot (for example, <code>MySQL</code>)
     * </p>
     * 
     * @return The software of the database snapshot (for example, <code>MySQL</code>)
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The software of the database snapshot (for example, <code>MySQL</code>)
     * </p>
     * 
     * @param engine
     *        The software of the database snapshot (for example, <code>MySQL</code>)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseSnapshot withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The database engine version for the database snapshot (for example, <code>5.7.23</code>).
     * </p>
     * 
     * @param engineVersion
     *        The database engine version for the database snapshot (for example, <code>5.7.23</code>).
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The database engine version for the database snapshot (for example, <code>5.7.23</code>).
     * </p>
     * 
     * @return The database engine version for the database snapshot (for example, <code>5.7.23</code>).
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The database engine version for the database snapshot (for example, <code>5.7.23</code>).
     * </p>
     * 
     * @param engineVersion
     *        The database engine version for the database snapshot (for example, <code>5.7.23</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseSnapshot withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The size of the disk in GB (for example, <code>32</code>) for the database snapshot.
     * </p>
     * 
     * @param sizeInGb
     *        The size of the disk in GB (for example, <code>32</code>) for the database snapshot.
     */

    public void setSizeInGb(Integer sizeInGb) {
        this.sizeInGb = sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB (for example, <code>32</code>) for the database snapshot.
     * </p>
     * 
     * @return The size of the disk in GB (for example, <code>32</code>) for the database snapshot.
     */

    public Integer getSizeInGb() {
        return this.sizeInGb;
    }

    /**
     * <p>
     * The size of the disk in GB (for example, <code>32</code>) for the database snapshot.
     * </p>
     * 
     * @param sizeInGb
     *        The size of the disk in GB (for example, <code>32</code>) for the database snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseSnapshot withSizeInGb(Integer sizeInGb) {
        setSizeInGb(sizeInGb);
        return this;
    }

    /**
     * <p>
     * The state of the database snapshot.
     * </p>
     * 
     * @param state
     *        The state of the database snapshot.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the database snapshot.
     * </p>
     * 
     * @return The state of the database snapshot.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the database snapshot.
     * </p>
     * 
     * @param state
     *        The state of the database snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseSnapshot withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The name of the source database from which the database snapshot was created.
     * </p>
     * 
     * @param fromRelationalDatabaseName
     *        The name of the source database from which the database snapshot was created.
     */

    public void setFromRelationalDatabaseName(String fromRelationalDatabaseName) {
        this.fromRelationalDatabaseName = fromRelationalDatabaseName;
    }

    /**
     * <p>
     * The name of the source database from which the database snapshot was created.
     * </p>
     * 
     * @return The name of the source database from which the database snapshot was created.
     */

    public String getFromRelationalDatabaseName() {
        return this.fromRelationalDatabaseName;
    }

    /**
     * <p>
     * The name of the source database from which the database snapshot was created.
     * </p>
     * 
     * @param fromRelationalDatabaseName
     *        The name of the source database from which the database snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseSnapshot withFromRelationalDatabaseName(String fromRelationalDatabaseName) {
        setFromRelationalDatabaseName(fromRelationalDatabaseName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database from which the database snapshot was created.
     * </p>
     * 
     * @param fromRelationalDatabaseArn
     *        The Amazon Resource Name (ARN) of the database from which the database snapshot was created.
     */

    public void setFromRelationalDatabaseArn(String fromRelationalDatabaseArn) {
        this.fromRelationalDatabaseArn = fromRelationalDatabaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database from which the database snapshot was created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the database from which the database snapshot was created.
     */

    public String getFromRelationalDatabaseArn() {
        return this.fromRelationalDatabaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database from which the database snapshot was created.
     * </p>
     * 
     * @param fromRelationalDatabaseArn
     *        The Amazon Resource Name (ARN) of the database from which the database snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseSnapshot withFromRelationalDatabaseArn(String fromRelationalDatabaseArn) {
        setFromRelationalDatabaseArn(fromRelationalDatabaseArn);
        return this;
    }

    /**
     * <p>
     * The bundle ID of the database from which the database snapshot was created.
     * </p>
     * 
     * @param fromRelationalDatabaseBundleId
     *        The bundle ID of the database from which the database snapshot was created.
     */

    public void setFromRelationalDatabaseBundleId(String fromRelationalDatabaseBundleId) {
        this.fromRelationalDatabaseBundleId = fromRelationalDatabaseBundleId;
    }

    /**
     * <p>
     * The bundle ID of the database from which the database snapshot was created.
     * </p>
     * 
     * @return The bundle ID of the database from which the database snapshot was created.
     */

    public String getFromRelationalDatabaseBundleId() {
        return this.fromRelationalDatabaseBundleId;
    }

    /**
     * <p>
     * The bundle ID of the database from which the database snapshot was created.
     * </p>
     * 
     * @param fromRelationalDatabaseBundleId
     *        The bundle ID of the database from which the database snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseSnapshot withFromRelationalDatabaseBundleId(String fromRelationalDatabaseBundleId) {
        setFromRelationalDatabaseBundleId(fromRelationalDatabaseBundleId);
        return this;
    }

    /**
     * <p>
     * The blueprint ID of the database from which the database snapshot was created. A blueprint describes the major
     * engine version of a database.
     * </p>
     * 
     * @param fromRelationalDatabaseBlueprintId
     *        The blueprint ID of the database from which the database snapshot was created. A blueprint describes the
     *        major engine version of a database.
     */

    public void setFromRelationalDatabaseBlueprintId(String fromRelationalDatabaseBlueprintId) {
        this.fromRelationalDatabaseBlueprintId = fromRelationalDatabaseBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID of the database from which the database snapshot was created. A blueprint describes the major
     * engine version of a database.
     * </p>
     * 
     * @return The blueprint ID of the database from which the database snapshot was created. A blueprint describes the
     *         major engine version of a database.
     */

    public String getFromRelationalDatabaseBlueprintId() {
        return this.fromRelationalDatabaseBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID of the database from which the database snapshot was created. A blueprint describes the major
     * engine version of a database.
     * </p>
     * 
     * @param fromRelationalDatabaseBlueprintId
     *        The blueprint ID of the database from which the database snapshot was created. A blueprint describes the
     *        major engine version of a database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseSnapshot withFromRelationalDatabaseBlueprintId(String fromRelationalDatabaseBlueprintId) {
        setFromRelationalDatabaseBlueprintId(fromRelationalDatabaseBlueprintId);
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
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getSizeInGb() != null)
            sb.append("SizeInGb: ").append(getSizeInGb()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getFromRelationalDatabaseName() != null)
            sb.append("FromRelationalDatabaseName: ").append(getFromRelationalDatabaseName()).append(",");
        if (getFromRelationalDatabaseArn() != null)
            sb.append("FromRelationalDatabaseArn: ").append(getFromRelationalDatabaseArn()).append(",");
        if (getFromRelationalDatabaseBundleId() != null)
            sb.append("FromRelationalDatabaseBundleId: ").append(getFromRelationalDatabaseBundleId()).append(",");
        if (getFromRelationalDatabaseBlueprintId() != null)
            sb.append("FromRelationalDatabaseBlueprintId: ").append(getFromRelationalDatabaseBlueprintId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationalDatabaseSnapshot == false)
            return false;
        RelationalDatabaseSnapshot other = (RelationalDatabaseSnapshot) obj;
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
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getSizeInGb() == null ^ this.getSizeInGb() == null)
            return false;
        if (other.getSizeInGb() != null && other.getSizeInGb().equals(this.getSizeInGb()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getFromRelationalDatabaseName() == null ^ this.getFromRelationalDatabaseName() == null)
            return false;
        if (other.getFromRelationalDatabaseName() != null && other.getFromRelationalDatabaseName().equals(this.getFromRelationalDatabaseName()) == false)
            return false;
        if (other.getFromRelationalDatabaseArn() == null ^ this.getFromRelationalDatabaseArn() == null)
            return false;
        if (other.getFromRelationalDatabaseArn() != null && other.getFromRelationalDatabaseArn().equals(this.getFromRelationalDatabaseArn()) == false)
            return false;
        if (other.getFromRelationalDatabaseBundleId() == null ^ this.getFromRelationalDatabaseBundleId() == null)
            return false;
        if (other.getFromRelationalDatabaseBundleId() != null
                && other.getFromRelationalDatabaseBundleId().equals(this.getFromRelationalDatabaseBundleId()) == false)
            return false;
        if (other.getFromRelationalDatabaseBlueprintId() == null ^ this.getFromRelationalDatabaseBlueprintId() == null)
            return false;
        if (other.getFromRelationalDatabaseBlueprintId() != null
                && other.getFromRelationalDatabaseBlueprintId().equals(this.getFromRelationalDatabaseBlueprintId()) == false)
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
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getSizeInGb() == null) ? 0 : getSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getFromRelationalDatabaseName() == null) ? 0 : getFromRelationalDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getFromRelationalDatabaseArn() == null) ? 0 : getFromRelationalDatabaseArn().hashCode());
        hashCode = prime * hashCode + ((getFromRelationalDatabaseBundleId() == null) ? 0 : getFromRelationalDatabaseBundleId().hashCode());
        hashCode = prime * hashCode + ((getFromRelationalDatabaseBlueprintId() == null) ? 0 : getFromRelationalDatabaseBlueprintId().hashCode());
        return hashCode;
    }

    @Override
    public RelationalDatabaseSnapshot clone() {
        try {
            return (RelationalDatabaseSnapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.RelationalDatabaseSnapshotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
