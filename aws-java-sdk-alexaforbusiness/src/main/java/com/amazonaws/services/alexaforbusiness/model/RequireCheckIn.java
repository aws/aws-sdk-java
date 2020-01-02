/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings for the require check in feature that are applied to a room profile. Require check in allows a meeting
 * room’s Alexa or AVS device to prompt the user to check in; otherwise, the room will be released.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RequireCheckIn" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequireCheckIn implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Duration between 5 and 20 minutes to determine when to release the room if it's not checked into.
     * </p>
     */
    private Integer releaseAfterMinutes;
    /**
     * <p>
     * Whether require check in is enabled or not.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Duration between 5 and 20 minutes to determine when to release the room if it's not checked into.
     * </p>
     * 
     * @param releaseAfterMinutes
     *        Duration between 5 and 20 minutes to determine when to release the room if it's not checked into.
     */

    public void setReleaseAfterMinutes(Integer releaseAfterMinutes) {
        this.releaseAfterMinutes = releaseAfterMinutes;
    }

    /**
     * <p>
     * Duration between 5 and 20 minutes to determine when to release the room if it's not checked into.
     * </p>
     * 
     * @return Duration between 5 and 20 minutes to determine when to release the room if it's not checked into.
     */

    public Integer getReleaseAfterMinutes() {
        return this.releaseAfterMinutes;
    }

    /**
     * <p>
     * Duration between 5 and 20 minutes to determine when to release the room if it's not checked into.
     * </p>
     * 
     * @param releaseAfterMinutes
     *        Duration between 5 and 20 minutes to determine when to release the room if it's not checked into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequireCheckIn withReleaseAfterMinutes(Integer releaseAfterMinutes) {
        setReleaseAfterMinutes(releaseAfterMinutes);
        return this;
    }

    /**
     * <p>
     * Whether require check in is enabled or not.
     * </p>
     * 
     * @param enabled
     *        Whether require check in is enabled or not.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether require check in is enabled or not.
     * </p>
     * 
     * @return Whether require check in is enabled or not.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether require check in is enabled or not.
     * </p>
     * 
     * @param enabled
     *        Whether require check in is enabled or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequireCheckIn withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether require check in is enabled or not.
     * </p>
     * 
     * @return Whether require check in is enabled or not.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getReleaseAfterMinutes() != null)
            sb.append("ReleaseAfterMinutes: ").append(getReleaseAfterMinutes()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequireCheckIn == false)
            return false;
        RequireCheckIn other = (RequireCheckIn) obj;
        if (other.getReleaseAfterMinutes() == null ^ this.getReleaseAfterMinutes() == null)
            return false;
        if (other.getReleaseAfterMinutes() != null && other.getReleaseAfterMinutes().equals(this.getReleaseAfterMinutes()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReleaseAfterMinutes() == null) ? 0 : getReleaseAfterMinutes().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public RequireCheckIn clone() {
        try {
            return (RequireCheckIn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.RequireCheckInMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
