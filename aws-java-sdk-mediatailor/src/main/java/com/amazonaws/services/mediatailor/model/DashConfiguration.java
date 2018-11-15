/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The configuration object for DASH content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DashConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL that is used to initiate a playback session for devices that support DASH.
     * </p>
     */
    private String manifestEndpointPrefix;

    /**
     * <p>
     * The URL that is used to initiate a playback session for devices that support DASH.
     * </p>
     * 
     * @param manifestEndpointPrefix
     *        The URL that is used to initiate a playback session for devices that support DASH.
     */

    public void setManifestEndpointPrefix(String manifestEndpointPrefix) {
        this.manifestEndpointPrefix = manifestEndpointPrefix;
    }

    /**
     * <p>
     * The URL that is used to initiate a playback session for devices that support DASH.
     * </p>
     * 
     * @return The URL that is used to initiate a playback session for devices that support DASH.
     */

    public String getManifestEndpointPrefix() {
        return this.manifestEndpointPrefix;
    }

    /**
     * <p>
     * The URL that is used to initiate a playback session for devices that support DASH.
     * </p>
     * 
     * @param manifestEndpointPrefix
     *        The URL that is used to initiate a playback session for devices that support DASH.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashConfiguration withManifestEndpointPrefix(String manifestEndpointPrefix) {
        setManifestEndpointPrefix(manifestEndpointPrefix);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getManifestEndpointPrefix() != null)
            sb.append("ManifestEndpointPrefix: ").append(getManifestEndpointPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashConfiguration == false)
            return false;
        DashConfiguration other = (DashConfiguration) obj;
        if (other.getManifestEndpointPrefix() == null ^ this.getManifestEndpointPrefix() == null)
            return false;
        if (other.getManifestEndpointPrefix() != null && other.getManifestEndpointPrefix().equals(this.getManifestEndpointPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestEndpointPrefix() == null) ? 0 : getManifestEndpointPrefix().hashCode());
        return hashCode;
    }

    @Override
    public DashConfiguration clone() {
        try {
            return (DashConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.DashConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
