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
 * The launch profile ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateLaunchProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLaunchProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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

    public UpdateLaunchProfileRequest withClientToken(String clientToken) {
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

    public UpdateLaunchProfileRequest withDescription(String description) {
        setDescription(description);
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

    public UpdateLaunchProfileRequest withLaunchProfileId(String launchProfileId) {
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

    public UpdateLaunchProfileRequest withLaunchProfileProtocolVersions(String... launchProfileProtocolVersions) {
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

    public UpdateLaunchProfileRequest withLaunchProfileProtocolVersions(java.util.Collection<String> launchProfileProtocolVersions) {
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

    public UpdateLaunchProfileRequest withName(String name) {
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

    public UpdateLaunchProfileRequest withStreamConfiguration(StreamConfigurationCreate streamConfiguration) {
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

    public UpdateLaunchProfileRequest withStudioComponentIds(String... studioComponentIds) {
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

    public UpdateLaunchProfileRequest withStudioComponentIds(java.util.Collection<String> studioComponentIds) {
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

    public UpdateLaunchProfileRequest withStudioId(String studioId) {
        setStudioId(studioId);
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
        if (getLaunchProfileId() != null)
            sb.append("LaunchProfileId: ").append(getLaunchProfileId()).append(",");
        if (getLaunchProfileProtocolVersions() != null)
            sb.append("LaunchProfileProtocolVersions: ").append(getLaunchProfileProtocolVersions()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStreamConfiguration() != null)
            sb.append("StreamConfiguration: ").append(getStreamConfiguration()).append(",");
        if (getStudioComponentIds() != null)
            sb.append("StudioComponentIds: ").append(getStudioComponentIds()).append(",");
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLaunchProfileRequest == false)
            return false;
        UpdateLaunchProfileRequest other = (UpdateLaunchProfileRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLaunchProfileId() == null) ? 0 : getLaunchProfileId().hashCode());
        hashCode = prime * hashCode + ((getLaunchProfileProtocolVersions() == null) ? 0 : getLaunchProfileProtocolVersions().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStreamConfiguration() == null) ? 0 : getStreamConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStudioComponentIds() == null) ? 0 : getStudioComponentIds().hashCode());
        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLaunchProfileRequest clone() {
        return (UpdateLaunchProfileRequest) super.clone();
    }

}
