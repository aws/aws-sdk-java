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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfileDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLaunchProfileDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The launch profile.
     * </p>
     */
    private LaunchProfile launchProfile;
    /**
     * <p>
     * A collection of streaming images.
     * </p>
     */
    private java.util.List<StreamingImage> streamingImages;
    /**
     * <p>
     * A collection of studio component summaries.
     * </p>
     */
    private java.util.List<StudioComponentSummary> studioComponentSummaries;

    /**
     * <p>
     * The launch profile.
     * </p>
     * 
     * @param launchProfile
     *        The launch profile.
     */

    public void setLaunchProfile(LaunchProfile launchProfile) {
        this.launchProfile = launchProfile;
    }

    /**
     * <p>
     * The launch profile.
     * </p>
     * 
     * @return The launch profile.
     */

    public LaunchProfile getLaunchProfile() {
        return this.launchProfile;
    }

    /**
     * <p>
     * The launch profile.
     * </p>
     * 
     * @param launchProfile
     *        The launch profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLaunchProfileDetailsResult withLaunchProfile(LaunchProfile launchProfile) {
        setLaunchProfile(launchProfile);
        return this;
    }

    /**
     * <p>
     * A collection of streaming images.
     * </p>
     * 
     * @return A collection of streaming images.
     */

    public java.util.List<StreamingImage> getStreamingImages() {
        return streamingImages;
    }

    /**
     * <p>
     * A collection of streaming images.
     * </p>
     * 
     * @param streamingImages
     *        A collection of streaming images.
     */

    public void setStreamingImages(java.util.Collection<StreamingImage> streamingImages) {
        if (streamingImages == null) {
            this.streamingImages = null;
            return;
        }

        this.streamingImages = new java.util.ArrayList<StreamingImage>(streamingImages);
    }

    /**
     * <p>
     * A collection of streaming images.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreamingImages(java.util.Collection)} or {@link #withStreamingImages(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param streamingImages
     *        A collection of streaming images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLaunchProfileDetailsResult withStreamingImages(StreamingImage... streamingImages) {
        if (this.streamingImages == null) {
            setStreamingImages(new java.util.ArrayList<StreamingImage>(streamingImages.length));
        }
        for (StreamingImage ele : streamingImages) {
            this.streamingImages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of streaming images.
     * </p>
     * 
     * @param streamingImages
     *        A collection of streaming images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLaunchProfileDetailsResult withStreamingImages(java.util.Collection<StreamingImage> streamingImages) {
        setStreamingImages(streamingImages);
        return this;
    }

    /**
     * <p>
     * A collection of studio component summaries.
     * </p>
     * 
     * @return A collection of studio component summaries.
     */

    public java.util.List<StudioComponentSummary> getStudioComponentSummaries() {
        return studioComponentSummaries;
    }

    /**
     * <p>
     * A collection of studio component summaries.
     * </p>
     * 
     * @param studioComponentSummaries
     *        A collection of studio component summaries.
     */

    public void setStudioComponentSummaries(java.util.Collection<StudioComponentSummary> studioComponentSummaries) {
        if (studioComponentSummaries == null) {
            this.studioComponentSummaries = null;
            return;
        }

        this.studioComponentSummaries = new java.util.ArrayList<StudioComponentSummary>(studioComponentSummaries);
    }

    /**
     * <p>
     * A collection of studio component summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStudioComponentSummaries(java.util.Collection)} or
     * {@link #withStudioComponentSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param studioComponentSummaries
     *        A collection of studio component summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLaunchProfileDetailsResult withStudioComponentSummaries(StudioComponentSummary... studioComponentSummaries) {
        if (this.studioComponentSummaries == null) {
            setStudioComponentSummaries(new java.util.ArrayList<StudioComponentSummary>(studioComponentSummaries.length));
        }
        for (StudioComponentSummary ele : studioComponentSummaries) {
            this.studioComponentSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of studio component summaries.
     * </p>
     * 
     * @param studioComponentSummaries
     *        A collection of studio component summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLaunchProfileDetailsResult withStudioComponentSummaries(java.util.Collection<StudioComponentSummary> studioComponentSummaries) {
        setStudioComponentSummaries(studioComponentSummaries);
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
        if (getLaunchProfile() != null)
            sb.append("LaunchProfile: ").append(getLaunchProfile()).append(",");
        if (getStreamingImages() != null)
            sb.append("StreamingImages: ").append(getStreamingImages()).append(",");
        if (getStudioComponentSummaries() != null)
            sb.append("StudioComponentSummaries: ").append(getStudioComponentSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLaunchProfileDetailsResult == false)
            return false;
        GetLaunchProfileDetailsResult other = (GetLaunchProfileDetailsResult) obj;
        if (other.getLaunchProfile() == null ^ this.getLaunchProfile() == null)
            return false;
        if (other.getLaunchProfile() != null && other.getLaunchProfile().equals(this.getLaunchProfile()) == false)
            return false;
        if (other.getStreamingImages() == null ^ this.getStreamingImages() == null)
            return false;
        if (other.getStreamingImages() != null && other.getStreamingImages().equals(this.getStreamingImages()) == false)
            return false;
        if (other.getStudioComponentSummaries() == null ^ this.getStudioComponentSummaries() == null)
            return false;
        if (other.getStudioComponentSummaries() != null && other.getStudioComponentSummaries().equals(this.getStudioComponentSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchProfile() == null) ? 0 : getLaunchProfile().hashCode());
        hashCode = prime * hashCode + ((getStreamingImages() == null) ? 0 : getStreamingImages().hashCode());
        hashCode = prime * hashCode + ((getStudioComponentSummaries() == null) ? 0 : getStudioComponentSummaries().hashCode());
        return hashCode;
    }

    @Override
    public GetLaunchProfileDetailsResult clone() {
        try {
            return (GetLaunchProfileDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
