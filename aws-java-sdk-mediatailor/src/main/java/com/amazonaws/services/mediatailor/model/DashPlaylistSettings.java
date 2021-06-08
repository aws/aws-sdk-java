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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Dash manifest configuration parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DashPlaylistSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashPlaylistSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total duration (in seconds) of each manifest. Minimum value: 30 seconds. Maximum value: 3600 seconds.
     * </p>
     */
    private Integer manifestWindowSeconds;
    /**
     * <p>
     * Minimum amount of content (measured in seconds) that a player must keep available in the buffer. Minimum value: 2
     * seconds. Maximum value: 60 seconds.
     * </p>
     */
    private Integer minBufferTimeSeconds;
    /**
     * <p>
     * Minimum amount of time (in seconds) that the player should wait before requesting updates to the manifest.
     * Minimum value: 2 seconds. Maximum value: 60 seconds.
     * </p>
     */
    private Integer minUpdatePeriodSeconds;
    /**
     * <p>
     * Amount of time (in seconds) that the player should be from the live point at the end of the manifest. Minimum
     * value: 2 seconds. Maximum value: 60 seconds.
     * </p>
     */
    private Integer suggestedPresentationDelaySeconds;

    /**
     * <p>
     * The total duration (in seconds) of each manifest. Minimum value: 30 seconds. Maximum value: 3600 seconds.
     * </p>
     * 
     * @param manifestWindowSeconds
     *        The total duration (in seconds) of each manifest. Minimum value: 30 seconds. Maximum value: 3600 seconds.
     */

    public void setManifestWindowSeconds(Integer manifestWindowSeconds) {
        this.manifestWindowSeconds = manifestWindowSeconds;
    }

    /**
     * <p>
     * The total duration (in seconds) of each manifest. Minimum value: 30 seconds. Maximum value: 3600 seconds.
     * </p>
     * 
     * @return The total duration (in seconds) of each manifest. Minimum value: 30 seconds. Maximum value: 3600 seconds.
     */

    public Integer getManifestWindowSeconds() {
        return this.manifestWindowSeconds;
    }

    /**
     * <p>
     * The total duration (in seconds) of each manifest. Minimum value: 30 seconds. Maximum value: 3600 seconds.
     * </p>
     * 
     * @param manifestWindowSeconds
     *        The total duration (in seconds) of each manifest. Minimum value: 30 seconds. Maximum value: 3600 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashPlaylistSettings withManifestWindowSeconds(Integer manifestWindowSeconds) {
        setManifestWindowSeconds(manifestWindowSeconds);
        return this;
    }

    /**
     * <p>
     * Minimum amount of content (measured in seconds) that a player must keep available in the buffer. Minimum value: 2
     * seconds. Maximum value: 60 seconds.
     * </p>
     * 
     * @param minBufferTimeSeconds
     *        Minimum amount of content (measured in seconds) that a player must keep available in the buffer. Minimum
     *        value: 2 seconds. Maximum value: 60 seconds.
     */

    public void setMinBufferTimeSeconds(Integer minBufferTimeSeconds) {
        this.minBufferTimeSeconds = minBufferTimeSeconds;
    }

    /**
     * <p>
     * Minimum amount of content (measured in seconds) that a player must keep available in the buffer. Minimum value: 2
     * seconds. Maximum value: 60 seconds.
     * </p>
     * 
     * @return Minimum amount of content (measured in seconds) that a player must keep available in the buffer. Minimum
     *         value: 2 seconds. Maximum value: 60 seconds.
     */

    public Integer getMinBufferTimeSeconds() {
        return this.minBufferTimeSeconds;
    }

    /**
     * <p>
     * Minimum amount of content (measured in seconds) that a player must keep available in the buffer. Minimum value: 2
     * seconds. Maximum value: 60 seconds.
     * </p>
     * 
     * @param minBufferTimeSeconds
     *        Minimum amount of content (measured in seconds) that a player must keep available in the buffer. Minimum
     *        value: 2 seconds. Maximum value: 60 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashPlaylistSettings withMinBufferTimeSeconds(Integer minBufferTimeSeconds) {
        setMinBufferTimeSeconds(minBufferTimeSeconds);
        return this;
    }

    /**
     * <p>
     * Minimum amount of time (in seconds) that the player should wait before requesting updates to the manifest.
     * Minimum value: 2 seconds. Maximum value: 60 seconds.
     * </p>
     * 
     * @param minUpdatePeriodSeconds
     *        Minimum amount of time (in seconds) that the player should wait before requesting updates to the manifest.
     *        Minimum value: 2 seconds. Maximum value: 60 seconds.
     */

    public void setMinUpdatePeriodSeconds(Integer minUpdatePeriodSeconds) {
        this.minUpdatePeriodSeconds = minUpdatePeriodSeconds;
    }

    /**
     * <p>
     * Minimum amount of time (in seconds) that the player should wait before requesting updates to the manifest.
     * Minimum value: 2 seconds. Maximum value: 60 seconds.
     * </p>
     * 
     * @return Minimum amount of time (in seconds) that the player should wait before requesting updates to the
     *         manifest. Minimum value: 2 seconds. Maximum value: 60 seconds.
     */

    public Integer getMinUpdatePeriodSeconds() {
        return this.minUpdatePeriodSeconds;
    }

    /**
     * <p>
     * Minimum amount of time (in seconds) that the player should wait before requesting updates to the manifest.
     * Minimum value: 2 seconds. Maximum value: 60 seconds.
     * </p>
     * 
     * @param minUpdatePeriodSeconds
     *        Minimum amount of time (in seconds) that the player should wait before requesting updates to the manifest.
     *        Minimum value: 2 seconds. Maximum value: 60 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashPlaylistSettings withMinUpdatePeriodSeconds(Integer minUpdatePeriodSeconds) {
        setMinUpdatePeriodSeconds(minUpdatePeriodSeconds);
        return this;
    }

    /**
     * <p>
     * Amount of time (in seconds) that the player should be from the live point at the end of the manifest. Minimum
     * value: 2 seconds. Maximum value: 60 seconds.
     * </p>
     * 
     * @param suggestedPresentationDelaySeconds
     *        Amount of time (in seconds) that the player should be from the live point at the end of the manifest.
     *        Minimum value: 2 seconds. Maximum value: 60 seconds.
     */

    public void setSuggestedPresentationDelaySeconds(Integer suggestedPresentationDelaySeconds) {
        this.suggestedPresentationDelaySeconds = suggestedPresentationDelaySeconds;
    }

    /**
     * <p>
     * Amount of time (in seconds) that the player should be from the live point at the end of the manifest. Minimum
     * value: 2 seconds. Maximum value: 60 seconds.
     * </p>
     * 
     * @return Amount of time (in seconds) that the player should be from the live point at the end of the manifest.
     *         Minimum value: 2 seconds. Maximum value: 60 seconds.
     */

    public Integer getSuggestedPresentationDelaySeconds() {
        return this.suggestedPresentationDelaySeconds;
    }

    /**
     * <p>
     * Amount of time (in seconds) that the player should be from the live point at the end of the manifest. Minimum
     * value: 2 seconds. Maximum value: 60 seconds.
     * </p>
     * 
     * @param suggestedPresentationDelaySeconds
     *        Amount of time (in seconds) that the player should be from the live point at the end of the manifest.
     *        Minimum value: 2 seconds. Maximum value: 60 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashPlaylistSettings withSuggestedPresentationDelaySeconds(Integer suggestedPresentationDelaySeconds) {
        setSuggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds);
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
        if (getManifestWindowSeconds() != null)
            sb.append("ManifestWindowSeconds: ").append(getManifestWindowSeconds()).append(",");
        if (getMinBufferTimeSeconds() != null)
            sb.append("MinBufferTimeSeconds: ").append(getMinBufferTimeSeconds()).append(",");
        if (getMinUpdatePeriodSeconds() != null)
            sb.append("MinUpdatePeriodSeconds: ").append(getMinUpdatePeriodSeconds()).append(",");
        if (getSuggestedPresentationDelaySeconds() != null)
            sb.append("SuggestedPresentationDelaySeconds: ").append(getSuggestedPresentationDelaySeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashPlaylistSettings == false)
            return false;
        DashPlaylistSettings other = (DashPlaylistSettings) obj;
        if (other.getManifestWindowSeconds() == null ^ this.getManifestWindowSeconds() == null)
            return false;
        if (other.getManifestWindowSeconds() != null && other.getManifestWindowSeconds().equals(this.getManifestWindowSeconds()) == false)
            return false;
        if (other.getMinBufferTimeSeconds() == null ^ this.getMinBufferTimeSeconds() == null)
            return false;
        if (other.getMinBufferTimeSeconds() != null && other.getMinBufferTimeSeconds().equals(this.getMinBufferTimeSeconds()) == false)
            return false;
        if (other.getMinUpdatePeriodSeconds() == null ^ this.getMinUpdatePeriodSeconds() == null)
            return false;
        if (other.getMinUpdatePeriodSeconds() != null && other.getMinUpdatePeriodSeconds().equals(this.getMinUpdatePeriodSeconds()) == false)
            return false;
        if (other.getSuggestedPresentationDelaySeconds() == null ^ this.getSuggestedPresentationDelaySeconds() == null)
            return false;
        if (other.getSuggestedPresentationDelaySeconds() != null
                && other.getSuggestedPresentationDelaySeconds().equals(this.getSuggestedPresentationDelaySeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestWindowSeconds() == null) ? 0 : getManifestWindowSeconds().hashCode());
        hashCode = prime * hashCode + ((getMinBufferTimeSeconds() == null) ? 0 : getMinBufferTimeSeconds().hashCode());
        hashCode = prime * hashCode + ((getMinUpdatePeriodSeconds() == null) ? 0 : getMinUpdatePeriodSeconds().hashCode());
        hashCode = prime * hashCode + ((getSuggestedPresentationDelaySeconds() == null) ? 0 : getSuggestedPresentationDelaySeconds().hashCode());
        return hashCode;
    }

    @Override
    public DashPlaylistSettings clone() {
        try {
            return (DashPlaylistSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.DashPlaylistSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
