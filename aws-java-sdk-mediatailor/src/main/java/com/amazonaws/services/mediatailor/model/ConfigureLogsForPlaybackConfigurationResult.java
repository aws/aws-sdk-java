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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ConfigureLogsForPlaybackConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigureLogsForPlaybackConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account.
     * </p>
     */
    private Integer percentEnabled;
    /**
     * <p>
     * The name of the playback configuration.
     * </p>
     */
    private String playbackConfigurationName;

    /**
     * <p>
     * The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account.
     * </p>
     * 
     * @param percentEnabled
     *        The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account.
     */

    public void setPercentEnabled(Integer percentEnabled) {
        this.percentEnabled = percentEnabled;
    }

    /**
     * <p>
     * The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account.
     * </p>
     * 
     * @return The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account.
     */

    public Integer getPercentEnabled() {
        return this.percentEnabled;
    }

    /**
     * <p>
     * The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account.
     * </p>
     * 
     * @param percentEnabled
     *        The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureLogsForPlaybackConfigurationResult withPercentEnabled(Integer percentEnabled) {
        setPercentEnabled(percentEnabled);
        return this;
    }

    /**
     * <p>
     * The name of the playback configuration.
     * </p>
     * 
     * @param playbackConfigurationName
     *        The name of the playback configuration.
     */

    public void setPlaybackConfigurationName(String playbackConfigurationName) {
        this.playbackConfigurationName = playbackConfigurationName;
    }

    /**
     * <p>
     * The name of the playback configuration.
     * </p>
     * 
     * @return The name of the playback configuration.
     */

    public String getPlaybackConfigurationName() {
        return this.playbackConfigurationName;
    }

    /**
     * <p>
     * The name of the playback configuration.
     * </p>
     * 
     * @param playbackConfigurationName
     *        The name of the playback configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureLogsForPlaybackConfigurationResult withPlaybackConfigurationName(String playbackConfigurationName) {
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
        if (getPercentEnabled() != null)
            sb.append("PercentEnabled: ").append(getPercentEnabled()).append(",");
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

        if (obj instanceof ConfigureLogsForPlaybackConfigurationResult == false)
            return false;
        ConfigureLogsForPlaybackConfigurationResult other = (ConfigureLogsForPlaybackConfigurationResult) obj;
        if (other.getPercentEnabled() == null ^ this.getPercentEnabled() == null)
            return false;
        if (other.getPercentEnabled() != null && other.getPercentEnabled().equals(this.getPercentEnabled()) == false)
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

        hashCode = prime * hashCode + ((getPercentEnabled() == null) ? 0 : getPercentEnabled().hashCode());
        hashCode = prime * hashCode + ((getPlaybackConfigurationName() == null) ? 0 : getPlaybackConfigurationName().hashCode());
        return hashCode;
    }

    @Override
    public ConfigureLogsForPlaybackConfigurationResult clone() {
        try {
            return (ConfigureLogsForPlaybackConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
