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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Multiplex output destination settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MultiplexOutputDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiplexOutputDestination implements Serializable, Cloneable, StructuredPojo {

    /** Multiplex MediaConnect output destination settings. */
    private MultiplexMediaConnectOutputDestinationSettings mediaConnectSettings;

    /**
     * Multiplex MediaConnect output destination settings.
     * 
     * @param mediaConnectSettings
     *        Multiplex MediaConnect output destination settings.
     */

    public void setMediaConnectSettings(MultiplexMediaConnectOutputDestinationSettings mediaConnectSettings) {
        this.mediaConnectSettings = mediaConnectSettings;
    }

    /**
     * Multiplex MediaConnect output destination settings.
     * 
     * @return Multiplex MediaConnect output destination settings.
     */

    public MultiplexMediaConnectOutputDestinationSettings getMediaConnectSettings() {
        return this.mediaConnectSettings;
    }

    /**
     * Multiplex MediaConnect output destination settings.
     * 
     * @param mediaConnectSettings
     *        Multiplex MediaConnect output destination settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiplexOutputDestination withMediaConnectSettings(MultiplexMediaConnectOutputDestinationSettings mediaConnectSettings) {
        setMediaConnectSettings(mediaConnectSettings);
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
        if (getMediaConnectSettings() != null)
            sb.append("MediaConnectSettings: ").append(getMediaConnectSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiplexOutputDestination == false)
            return false;
        MultiplexOutputDestination other = (MultiplexOutputDestination) obj;
        if (other.getMediaConnectSettings() == null ^ this.getMediaConnectSettings() == null)
            return false;
        if (other.getMediaConnectSettings() != null && other.getMediaConnectSettings().equals(this.getMediaConnectSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaConnectSettings() == null) ? 0 : getMediaConnectSettings().hashCode());
        return hashCode;
    }

    @Override
    public MultiplexOutputDestination clone() {
        try {
            return (MultiplexOutputDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MultiplexOutputDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
