/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetPrefetchSchedule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPrefetchScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the prefetch schedule. The name must be unique among all prefetch schedules that are associated with
     * the specified playback configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Returns information about the prefetch schedule for a specific playback configuration. If you call
     * <code>GetPrefetchSchedule</code> on an expired prefetch schedule, MediaTailor returns an HTTP 404 status code.
     * </p>
     */
    private String playbackConfigurationName;

    /**
     * <p>
     * The name of the prefetch schedule. The name must be unique among all prefetch schedules that are associated with
     * the specified playback configuration.
     * </p>
     * 
     * @param name
     *        The name of the prefetch schedule. The name must be unique among all prefetch schedules that are
     *        associated with the specified playback configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the prefetch schedule. The name must be unique among all prefetch schedules that are associated with
     * the specified playback configuration.
     * </p>
     * 
     * @return The name of the prefetch schedule. The name must be unique among all prefetch schedules that are
     *         associated with the specified playback configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the prefetch schedule. The name must be unique among all prefetch schedules that are associated with
     * the specified playback configuration.
     * </p>
     * 
     * @param name
     *        The name of the prefetch schedule. The name must be unique among all prefetch schedules that are
     *        associated with the specified playback configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPrefetchScheduleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Returns information about the prefetch schedule for a specific playback configuration. If you call
     * <code>GetPrefetchSchedule</code> on an expired prefetch schedule, MediaTailor returns an HTTP 404 status code.
     * </p>
     * 
     * @param playbackConfigurationName
     *        Returns information about the prefetch schedule for a specific playback configuration. If you call
     *        <code>GetPrefetchSchedule</code> on an expired prefetch schedule, MediaTailor returns an HTTP 404 status
     *        code.
     */

    public void setPlaybackConfigurationName(String playbackConfigurationName) {
        this.playbackConfigurationName = playbackConfigurationName;
    }

    /**
     * <p>
     * Returns information about the prefetch schedule for a specific playback configuration. If you call
     * <code>GetPrefetchSchedule</code> on an expired prefetch schedule, MediaTailor returns an HTTP 404 status code.
     * </p>
     * 
     * @return Returns information about the prefetch schedule for a specific playback configuration. If you call
     *         <code>GetPrefetchSchedule</code> on an expired prefetch schedule, MediaTailor returns an HTTP 404 status
     *         code.
     */

    public String getPlaybackConfigurationName() {
        return this.playbackConfigurationName;
    }

    /**
     * <p>
     * Returns information about the prefetch schedule for a specific playback configuration. If you call
     * <code>GetPrefetchSchedule</code> on an expired prefetch schedule, MediaTailor returns an HTTP 404 status code.
     * </p>
     * 
     * @param playbackConfigurationName
     *        Returns information about the prefetch schedule for a specific playback configuration. If you call
     *        <code>GetPrefetchSchedule</code> on an expired prefetch schedule, MediaTailor returns an HTTP 404 status
     *        code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPrefetchScheduleRequest withPlaybackConfigurationName(String playbackConfigurationName) {
        setPlaybackConfigurationName(playbackConfigurationName);
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
        if (getPlaybackConfigurationName() != null)
            sb.append("PlaybackConfigurationName: ").append(getPlaybackConfigurationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPrefetchScheduleRequest == false)
            return false;
        GetPrefetchScheduleRequest other = (GetPrefetchScheduleRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPlaybackConfigurationName() == null ^ this.getPlaybackConfigurationName() == null)
            return false;
        if (other.getPlaybackConfigurationName() != null && other.getPlaybackConfigurationName().equals(this.getPlaybackConfigurationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPlaybackConfigurationName() == null) ? 0 : getPlaybackConfigurationName().hashCode());
        return hashCode;
    }

    @Override
    public GetPrefetchScheduleRequest clone() {
        return (GetPrefetchScheduleRequest) super.clone();
    }

}
