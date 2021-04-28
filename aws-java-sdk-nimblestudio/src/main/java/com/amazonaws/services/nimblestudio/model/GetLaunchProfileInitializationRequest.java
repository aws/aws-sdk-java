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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfileInitialization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLaunchProfileInitializationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The launch profile ID.
     * </p>
     */
    private String launchProfileId;
    /**
     * <p>
     * A collection of launch profile protocol versions.
     * </p>
     */
    private java.util.List<String> launchProfileProtocolVersions;
    /**
     * <p>
     * The launch purpose.
     * </p>
     */
    private String launchPurpose;
    /**
     * <p>
     * The platform.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The studio ID.
     * </p>
     */
    private String studioId;

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

    public GetLaunchProfileInitializationRequest withLaunchProfileId(String launchProfileId) {
        setLaunchProfileId(launchProfileId);
        return this;
    }

    /**
     * <p>
     * A collection of launch profile protocol versions.
     * </p>
     * 
     * @return A collection of launch profile protocol versions.
     */

    public java.util.List<String> getLaunchProfileProtocolVersions() {
        return launchProfileProtocolVersions;
    }

    /**
     * <p>
     * A collection of launch profile protocol versions.
     * </p>
     * 
     * @param launchProfileProtocolVersions
     *        A collection of launch profile protocol versions.
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
     * A collection of launch profile protocol versions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchProfileProtocolVersions(java.util.Collection)} or
     * {@link #withLaunchProfileProtocolVersions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param launchProfileProtocolVersions
     *        A collection of launch profile protocol versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLaunchProfileInitializationRequest withLaunchProfileProtocolVersions(String... launchProfileProtocolVersions) {
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
     * A collection of launch profile protocol versions.
     * </p>
     * 
     * @param launchProfileProtocolVersions
     *        A collection of launch profile protocol versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLaunchProfileInitializationRequest withLaunchProfileProtocolVersions(java.util.Collection<String> launchProfileProtocolVersions) {
        setLaunchProfileProtocolVersions(launchProfileProtocolVersions);
        return this;
    }

    /**
     * <p>
     * The launch purpose.
     * </p>
     * 
     * @param launchPurpose
     *        The launch purpose.
     */

    public void setLaunchPurpose(String launchPurpose) {
        this.launchPurpose = launchPurpose;
    }

    /**
     * <p>
     * The launch purpose.
     * </p>
     * 
     * @return The launch purpose.
     */

    public String getLaunchPurpose() {
        return this.launchPurpose;
    }

    /**
     * <p>
     * The launch purpose.
     * </p>
     * 
     * @param launchPurpose
     *        The launch purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLaunchProfileInitializationRequest withLaunchPurpose(String launchPurpose) {
        setLaunchPurpose(launchPurpose);
        return this;
    }

    /**
     * <p>
     * The platform.
     * </p>
     * 
     * @param platform
     *        The platform.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform.
     * </p>
     * 
     * @return The platform.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform.
     * </p>
     * 
     * @param platform
     *        The platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLaunchProfileInitializationRequest withPlatform(String platform) {
        setPlatform(platform);
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

    public GetLaunchProfileInitializationRequest withStudioId(String studioId) {
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
        if (getLaunchProfileId() != null)
            sb.append("LaunchProfileId: ").append(getLaunchProfileId()).append(",");
        if (getLaunchProfileProtocolVersions() != null)
            sb.append("LaunchProfileProtocolVersions: ").append(getLaunchProfileProtocolVersions()).append(",");
        if (getLaunchPurpose() != null)
            sb.append("LaunchPurpose: ").append(getLaunchPurpose()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
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

        if (obj instanceof GetLaunchProfileInitializationRequest == false)
            return false;
        GetLaunchProfileInitializationRequest other = (GetLaunchProfileInitializationRequest) obj;
        if (other.getLaunchProfileId() == null ^ this.getLaunchProfileId() == null)
            return false;
        if (other.getLaunchProfileId() != null && other.getLaunchProfileId().equals(this.getLaunchProfileId()) == false)
            return false;
        if (other.getLaunchProfileProtocolVersions() == null ^ this.getLaunchProfileProtocolVersions() == null)
            return false;
        if (other.getLaunchProfileProtocolVersions() != null
                && other.getLaunchProfileProtocolVersions().equals(this.getLaunchProfileProtocolVersions()) == false)
            return false;
        if (other.getLaunchPurpose() == null ^ this.getLaunchPurpose() == null)
            return false;
        if (other.getLaunchPurpose() != null && other.getLaunchPurpose().equals(this.getLaunchPurpose()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
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

        hashCode = prime * hashCode + ((getLaunchProfileId() == null) ? 0 : getLaunchProfileId().hashCode());
        hashCode = prime * hashCode + ((getLaunchProfileProtocolVersions() == null) ? 0 : getLaunchProfileProtocolVersions().hashCode());
        hashCode = prime * hashCode + ((getLaunchPurpose() == null) ? 0 : getLaunchPurpose().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        return hashCode;
    }

    @Override
    public GetLaunchProfileInitializationRequest clone() {
        return (GetLaunchProfileInitializationRequest) super.clone();
    }

}
