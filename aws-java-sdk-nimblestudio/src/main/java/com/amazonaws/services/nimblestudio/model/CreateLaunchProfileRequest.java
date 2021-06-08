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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A collection of launch profiles.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateLaunchProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLaunchProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The description.
     * </p>
     */
    private String description;

    private java.util.List<String> ec2SubnetIds;
    /**
     * <p>
     * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
     * </p>
     */
    private java.util.List<String> launchProfileProtocolVersions;
    /**
     * <p>
     * The name for the launch profile.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A configuration for a streaming session.
     * </p>
     */
    private StreamConfigurationCreate streamConfiguration;
    /**
     * <p>
     * Unique identifiers for a collection of studio components that can be used with this launch profile.
     * </p>
     */
    private java.util.List<String> studioComponentIds;
    /**
     * <p>
     * The studio ID.
     * </p>
     */
    private String studioId;
    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     * 
     * @param clientToken
     *        To make an idempotent API request using one of these actions, specify a client token in the request. You
     *        should not reuse the same client token for other API requests. If you retry a request that completed
     *        successfully using the same client token and the same parameters, the retry succeeds without performing
     *        any further actions. If you retry a successful request using the same client token, but one or more of the
     *        parameters are different, the retry fails with a ValidationException error.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     * 
     * @return To make an idempotent API request using one of these actions, specify a client token in the request. You
     *         should not reuse the same client token for other API requests. If you retry a request that completed
     *         successfully using the same client token and the same parameters, the retry succeeds without performing
     *         any further actions. If you retry a successful request using the same client token, but one or more of
     *         the parameters are different, the retry fails with a ValidationException error.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     * 
     * @param clientToken
     *        To make an idempotent API request using one of these actions, specify a client token in the request. You
     *        should not reuse the same client token for other API requests. If you retry a request that completed
     *        successfully using the same client token and the same parameters, the retry succeeds without performing
     *        any further actions. If you retry a successful request using the same client token, but one or more of the
     *        parameters are different, the retry fails with a ValidationException error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchProfileRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @return The description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchProfileRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getEc2SubnetIds() {
        return ec2SubnetIds;
    }

    /**
     * @param ec2SubnetIds
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2SubnetIds(java.util.Collection)} or {@link #withEc2SubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ec2SubnetIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchProfileRequest withEc2SubnetIds(String... ec2SubnetIds) {
        if (this.ec2SubnetIds == null) {
            setEc2SubnetIds(new java.util.ArrayList<String>(ec2SubnetIds.length));
        }
        for (String ele : ec2SubnetIds) {
            this.ec2SubnetIds.add(ele);
        }
        return this;
    }

    /**
     * @param ec2SubnetIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchProfileRequest withEc2SubnetIds(java.util.Collection<String> ec2SubnetIds) {
        setEc2SubnetIds(ec2SubnetIds);
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

    public CreateLaunchProfileRequest withLaunchProfileProtocolVersions(String... launchProfileProtocolVersions) {
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

    public CreateLaunchProfileRequest withLaunchProfileProtocolVersions(java.util.Collection<String> launchProfileProtocolVersions) {
        setLaunchProfileProtocolVersions(launchProfileProtocolVersions);
        return this;
    }

    /**
     * <p>
     * The name for the launch profile.
     * </p>
     * 
     * @param name
     *        The name for the launch profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the launch profile.
     * </p>
     * 
     * @return The name for the launch profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the launch profile.
     * </p>
     * 
     * @param name
     *        The name for the launch profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchProfileRequest withName(String name) {
        setName(name);
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

    public void setStreamConfiguration(StreamConfigurationCreate streamConfiguration) {
        this.streamConfiguration = streamConfiguration;
    }

    /**
     * <p>
     * A configuration for a streaming session.
     * </p>
     * 
     * @return A configuration for a streaming session.
     */

    public StreamConfigurationCreate getStreamConfiguration() {
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

    public CreateLaunchProfileRequest withStreamConfiguration(StreamConfigurationCreate streamConfiguration) {
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

    public CreateLaunchProfileRequest withStudioComponentIds(String... studioComponentIds) {
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

    public CreateLaunchProfileRequest withStudioComponentIds(java.util.Collection<String> studioComponentIds) {
        setStudioComponentIds(studioComponentIds);
        return this;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @return The studio ID.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchProfileRequest withStudioId(String studioId) {
        setStudioId(studioId);
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

    public CreateLaunchProfileRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateLaunchProfileRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchProfileRequest addTagsEntry(String key, String value) {
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

    public CreateLaunchProfileRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEc2SubnetIds() != null)
            sb.append("Ec2SubnetIds: ").append(getEc2SubnetIds()).append(",");
        if (getLaunchProfileProtocolVersions() != null)
            sb.append("LaunchProfileProtocolVersions: ").append(getLaunchProfileProtocolVersions()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStreamConfiguration() != null)
            sb.append("StreamConfiguration: ").append(getStreamConfiguration()).append(",");
        if (getStudioComponentIds() != null)
            sb.append("StudioComponentIds: ").append(getStudioComponentIds()).append(",");
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLaunchProfileRequest == false)
            return false;
        CreateLaunchProfileRequest other = (CreateLaunchProfileRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEc2SubnetIds() == null ^ this.getEc2SubnetIds() == null)
            return false;
        if (other.getEc2SubnetIds() != null && other.getEc2SubnetIds().equals(this.getEc2SubnetIds()) == false)
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
        if (other.getStreamConfiguration() == null ^ this.getStreamConfiguration() == null)
            return false;
        if (other.getStreamConfiguration() != null && other.getStreamConfiguration().equals(this.getStreamConfiguration()) == false)
            return false;
        if (other.getStudioComponentIds() == null ^ this.getStudioComponentIds() == null)
            return false;
        if (other.getStudioComponentIds() != null && other.getStudioComponentIds().equals(this.getStudioComponentIds()) == false)
            return false;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEc2SubnetIds() == null) ? 0 : getEc2SubnetIds().hashCode());
        hashCode = prime * hashCode + ((getLaunchProfileProtocolVersions() == null) ? 0 : getLaunchProfileProtocolVersions().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStreamConfiguration() == null) ? 0 : getStreamConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStudioComponentIds() == null) ? 0 : getStudioComponentIds().hashCode());
        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLaunchProfileRequest clone() {
        return (CreateLaunchProfileRequest) super.clone();
    }

}
