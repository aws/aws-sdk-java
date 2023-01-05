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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeletePrefetchSchedule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePrefetchScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the prefetch schedule. If the action is successful, the service sends back an HTTP 204 response with
     * an empty HTTP body.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the playback configuration for this prefetch schedule.
     * </p>
     */
    private String playbackConfigurationName;

    /**
     * <p>
     * The name of the prefetch schedule. If the action is successful, the service sends back an HTTP 204 response with
     * an empty HTTP body.
     * </p>
     * 
     * @param name
     *        The name of the prefetch schedule. If the action is successful, the service sends back an HTTP 204
     *        response with an empty HTTP body.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the prefetch schedule. If the action is successful, the service sends back an HTTP 204 response with
     * an empty HTTP body.
     * </p>
     * 
     * @return The name of the prefetch schedule. If the action is successful, the service sends back an HTTP 204
     *         response with an empty HTTP body.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the prefetch schedule. If the action is successful, the service sends back an HTTP 204 response with
     * an empty HTTP body.
     * </p>
     * 
     * @param name
     *        The name of the prefetch schedule. If the action is successful, the service sends back an HTTP 204
     *        response with an empty HTTP body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePrefetchScheduleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the playback configuration for this prefetch schedule.
     * </p>
     * 
     * @param playbackConfigurationName
     *        The name of the playback configuration for this prefetch schedule.
     */

    public void setPlaybackConfigurationName(String playbackConfigurationName) {
        this.playbackConfigurationName = playbackConfigurationName;
    }

    /**
     * <p>
     * The name of the playback configuration for this prefetch schedule.
     * </p>
     * 
     * @return The name of the playback configuration for this prefetch schedule.
     */

    public String getPlaybackConfigurationName() {
        return this.playbackConfigurationName;
    }

    /**
     * <p>
     * The name of the playback configuration for this prefetch schedule.
     * </p>
     * 
     * @param playbackConfigurationName
     *        The name of the playback configuration for this prefetch schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePrefetchScheduleRequest withPlaybackConfigurationName(String playbackConfigurationName) {
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

        if (obj instanceof DeletePrefetchScheduleRequest == false)
            return false;
        DeletePrefetchScheduleRequest other = (DeletePrefetchScheduleRequest) obj;
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
    public DeletePrefetchScheduleRequest clone() {
        return (DeletePrefetchScheduleRequest) super.clone();
    }

}
