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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/LaunchProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchProfile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user ID of the user that created the launch profile.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * A human-readable description of the launch profile.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Unique identifiers for a collection of EC2 subnets.
     * </p>
     */
    private java.util.List<String> ec2SubnetIds;
    /**
     * <p>
     * The launch profile ID.
     * </p>
     */
    private String launchProfileId;
    /**
     * <p>
     * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
     * </p>
     */
    private java.util.List<String> launchProfileProtocolVersions;
    /**
     * <p>
     * A friendly name for the launch profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The status code.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * The status message for the launch profile.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * A configuration for a streaming session.
     * </p>
     */
    private StreamConfiguration streamConfiguration;
    /**
     * <p>
     * Unique identifiers for a collection of studio components that can be used with this launch profile.
     * </p>
     */
    private java.util.List<String> studioComponentIds;
    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @return The ARN of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that created the launch profile.
     * </p>
     * 
     * @param createdBy
     *        The user ID of the user that created the launch profile.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user ID of the user that created the launch profile.
     * </p>
     * 
     * @return The user ID of the user that created the launch profile.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user ID of the user that created the launch profile.
     * </p>
     * 
     * @param createdBy
     *        The user ID of the user that created the launch profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * A human-readable description of the launch profile.
     * </p>
     * 
     * @param description
     *        A human-readable description of the launch profile.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A human-readable description of the launch profile.
     * </p>
     * 
     * @return A human-readable description of the launch profile.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A human-readable description of the launch profile.
     * </p>
     * 
     * @param description
     *        A human-readable description of the launch profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Unique identifiers for a collection of EC2 subnets.
     * </p>
     * 
     * @return Unique identifiers for a collection of EC2 subnets.
     */

    public java.util.List<String> getEc2SubnetIds() {
        return ec2SubnetIds;
    }

    /**
     * <p>
     * Unique identifiers for a collection of EC2 subnets.
     * </p>
     * 
     * @param ec2SubnetIds
     *        Unique identifiers for a collection of EC2 subnets.
     */

    public void setEc2SubnetIds(java.util.Collection<String> ec2SubnetIds) {
        if (ec2SubnetIds == null) {
            this.ec2SubnetIds = null;
            return;
        }

        this.ec2SubnetIds = new java.util.ArrayList<String>(ec2SubnetIds);
    }

    /**
     * <p>
     * Unique identifiers for a collection of EC2 subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2SubnetIds(java.util.Collection)} or {@link #withEc2SubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ec2SubnetIds
     *        Unique identifiers for a collection of EC2 subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withEc2SubnetIds(String... ec2SubnetIds) {
        if (this.ec2SubnetIds == null) {
            setEc2SubnetIds(new java.util.ArrayList<String>(ec2SubnetIds.length));
        }
        for (String ele : ec2SubnetIds) {
            this.ec2SubnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Unique identifiers for a collection of EC2 subnets.
     * </p>
     * 
     * @param ec2SubnetIds
     *        Unique identifiers for a collection of EC2 subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withEc2SubnetIds(java.util.Collection<String> ec2SubnetIds) {
        setEc2SubnetIds(ec2SubnetIds);
        return this;
    }

    /**
     * <p>
     * The launch profile ID.
     * </p>
     * 
     * @param launchProfileId
     *        The launch profile ID.
     */

    public void setLaunchProfileId(String launchProfileId) {
        this.launchProfileId = launchProfileId;
    }

    /**
     * <p>
     * The launch profile ID.
     * </p>
     * 
     * @return The launch profile ID.
     */

    public String getLaunchProfileId() {
        return this.launchProfileId;
    }

    /**
     * <p>
     * The launch profile ID.
     * </p>
     * 
     * @param launchProfileId
     *        The launch profile ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withLaunchProfileId(String launchProfileId) {
        setLaunchProfileId(launchProfileId);
        return this;
    }

    /**
     * <p>
     * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
     * </p>
     * 
     * @return The version number of the protocol that is used by the launch profile. The only valid version is
     *         "2021-03-31".
     */

    public java.util.List<String> getLaunchProfileProtocolVersions() {
        return launchProfileProtocolVersions;
    }

    /**
     * <p>
     * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
     * </p>
     * 
     * @param launchProfileProtocolVersions
     *        The version number of the protocol that is used by the launch profile. The only valid version is
     *        "2021-03-31".
     */

    public void setLaunchProfileProtocolVersions(java.util.Collection<String> launchProfileProtocolVersions) {
        if (launchProfileProtocolVersions == null) {
            this.launchProfileProtocolVersions = null;
            return;
        }

        this.launchProfileProtocolVersions = new java.util.ArrayList<String>(launchProfileProtocolVersions);
    }

    /**
     * <p>
     * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchProfileProtocolVersions(java.util.Collection)} or
     * {@link #withLaunchProfileProtocolVersions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param launchProfileProtocolVersions
     *        The version number of the protocol that is used by the launch profile. The only valid version is
     *        "2021-03-31".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withLaunchProfileProtocolVersions(String... launchProfileProtocolVersions) {
        if (this.launchProfileProtocolVersions == null) {
            setLaunchProfileProtocolVersions(new java.util.ArrayList<String>(launchProfileProtocolVersions.length));
        }
        for (String ele : launchProfileProtocolVersions) {
            this.launchProfileProtocolVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
     * </p>
     * 
     * @param launchProfileProtocolVersions
     *        The version number of the protocol that is used by the launch profile. The only valid version is
     *        "2021-03-31".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withLaunchProfileProtocolVersions(java.util.Collection<String> launchProfileProtocolVersions) {
        setLaunchProfileProtocolVersions(launchProfileProtocolVersions);
        return this;
    }

    /**
     * <p>
     * A friendly name for the launch profile.
     * </p>
     * 
     * @param name
     *        A friendly name for the launch profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name for the launch profile.
     * </p>
     * 
     * @return A friendly name for the launch profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name for the launch profile.
     * </p>
     * 
     * @param name
     *        A friendly name for the launch profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @see LaunchProfileState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @return The current state.
     * @see LaunchProfileState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfileState
     */

    public LaunchProfile withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state.
     * </p>
     * 
     * @param state
     *        The current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfileState
     */

    public LaunchProfile withState(LaunchProfileState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param statusCode
     *        The status code.
     * @see LaunchProfileStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @return The status code.
     * @see LaunchProfileStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param statusCode
     *        The status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfileStatusCode
     */

    public LaunchProfile withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param statusCode
     *        The status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchProfileStatusCode
     */

    public LaunchProfile withStatusCode(LaunchProfileStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the launch profile.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the launch profile.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the launch profile.
     * </p>
     * 
     * @return The status message for the launch profile.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for the launch profile.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the launch profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * A configuration for a streaming session.
     * </p>
     * 
     * @param streamConfiguration
     *        A configuration for a streaming session.
     */

    public void setStreamConfiguration(StreamConfiguration streamConfiguration) {
        this.streamConfiguration = streamConfiguration;
    }

    /**
     * <p>
     * A configuration for a streaming session.
     * </p>
     * 
     * @return A configuration for a streaming session.
     */

    public StreamConfiguration getStreamConfiguration() {
        return this.streamConfiguration;
    }

    /**
     * <p>
     * A configuration for a streaming session.
     * </p>
     * 
     * @param streamConfiguration
     *        A configuration for a streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withStreamConfiguration(StreamConfiguration streamConfiguration) {
        setStreamConfiguration(streamConfiguration);
        return this;
    }

    /**
     * <p>
     * Unique identifiers for a collection of studio components that can be used with this launch profile.
     * </p>
     * 
     * @return Unique identifiers for a collection of studio components that can be used with this launch profile.
     */

    public java.util.List<String> getStudioComponentIds() {
        return studioComponentIds;
    }

    /**
     * <p>
     * Unique identifiers for a collection of studio components that can be used with this launch profile.
     * </p>
     * 
     * @param studioComponentIds
     *        Unique identifiers for a collection of studio components that can be used with this launch profile.
     */

    public void setStudioComponentIds(java.util.Collection<String> studioComponentIds) {
        if (studioComponentIds == null) {
            this.studioComponentIds = null;
            return;
        }

        this.studioComponentIds = new java.util.ArrayList<String>(studioComponentIds);
    }

    /**
     * <p>
     * Unique identifiers for a collection of studio components that can be used with this launch profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStudioComponentIds(java.util.Collection)} or {@link #withStudioComponentIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param studioComponentIds
     *        Unique identifiers for a collection of studio components that can be used with this launch profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withStudioComponentIds(String... studioComponentIds) {
        if (this.studioComponentIds == null) {
            setStudioComponentIds(new java.util.ArrayList<String>(studioComponentIds.length));
        }
        for (String ele : studioComponentIds) {
            this.studioComponentIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Unique identifiers for a collection of studio components that can be used with this launch profile.
     * </p>
     * 
     * @param studioComponentIds
     *        Unique identifiers for a collection of studio components that can be used with this launch profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withStudioComponentIds(java.util.Collection<String> studioComponentIds) {
        setStudioComponentIds(studioComponentIds);
        return this;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @return A collection of labels, in the form of key:value pairs, that apply to this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key:value pairs, that apply to this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key:value pairs, that apply to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see LaunchProfile#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix epoch timestamp in seconds for when the resource was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix epoch timestamp in seconds for when the resource was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     * 
     * @param updatedBy
     *        The user ID of the user that most recently updated the resource.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     * 
     * @return The user ID of the user that most recently updated the resource.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user ID of the user that most recently updated the resource.
     * </p>
     * 
     * @param updatedBy
     *        The user ID of the user that most recently updated the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchProfile withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEc2SubnetIds() != null)
            sb.append("Ec2SubnetIds: ").append(getEc2SubnetIds()).append(",");
        if (getLaunchProfileId() != null)
            sb.append("LaunchProfileId: ").append(getLaunchProfileId()).append(",");
        if (getLaunchProfileProtocolVersions() != null)
            sb.append("LaunchProfileProtocolVersions: ").append(getLaunchProfileProtocolVersions()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStreamConfiguration() != null)
            sb.append("StreamConfiguration: ").append(getStreamConfiguration()).append(",");
        if (getStudioComponentIds() != null)
            sb.append("StudioComponentIds: ").append(getStudioComponentIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchProfile == false)
            return false;
        LaunchProfile other = (LaunchProfile) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEc2SubnetIds() == null ^ this.getEc2SubnetIds() == null)
            return false;
        if (other.getEc2SubnetIds() != null && other.getEc2SubnetIds().equals(this.getEc2SubnetIds()) == false)
            return false;
        if (other.getLaunchProfileId() == null ^ this.getLaunchProfileId() == null)
            return false;
        if (other.getLaunchProfileId() != null && other.getLaunchProfileId().equals(this.getLaunchProfileId()) == false)
            return false;
        if (other.getLaunchProfileProtocolVersions() == null ^ this.getLaunchProfileProtocolVersions() == null)
            return false;
        if (other.getLaunchProfileProtocolVersions() != null
                && other.getLaunchProfileProtocolVersions().equals(this.getLaunchProfileProtocolVersions()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStreamConfiguration() == null ^ this.getStreamConfiguration() == null)
            return false;
        if (other.getStreamConfiguration() != null && other.getStreamConfiguration().equals(this.getStreamConfiguration()) == false)
            return false;
        if (other.getStudioComponentIds() == null ^ this.getStudioComponentIds() == null)
            return false;
        if (other.getStudioComponentIds() != null && other.getStudioComponentIds().equals(this.getStudioComponentIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEc2SubnetIds() == null) ? 0 : getEc2SubnetIds().hashCode());
        hashCode = prime * hashCode + ((getLaunchProfileId() == null) ? 0 : getLaunchProfileId().hashCode());
        hashCode = prime * hashCode + ((getLaunchProfileProtocolVersions() == null) ? 0 : getLaunchProfileProtocolVersions().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStreamConfiguration() == null) ? 0 : getStreamConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStudioComponentIds() == null) ? 0 : getStudioComponentIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public LaunchProfile clone() {
        try {
            return (LaunchProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.LaunchProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
