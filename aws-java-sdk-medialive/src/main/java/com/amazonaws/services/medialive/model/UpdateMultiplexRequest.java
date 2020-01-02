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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to update a multiplex.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateMultiplex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMultiplexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** ID of the multiplex to update. */
    private String multiplexId;
    /** The new settings for a multiplex. */
    private MultiplexSettings multiplexSettings;
    /** Name of the multiplex. */
    private String name;

    /**
     * ID of the multiplex to update.
     * 
     * @param multiplexId
     *        ID of the multiplex to update.
     */

    public void setMultiplexId(String multiplexId) {
        this.multiplexId = multiplexId;
    }

    /**
     * ID of the multiplex to update.
     * 
     * @return ID of the multiplex to update.
     */

    public String getMultiplexId() {
        return this.multiplexId;
    }

    /**
     * ID of the multiplex to update.
     * 
     * @param multiplexId
     *        ID of the multiplex to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMultiplexRequest withMultiplexId(String multiplexId) {
        setMultiplexId(multiplexId);
        return this;
    }

    /**
     * The new settings for a multiplex.
     * 
     * @param multiplexSettings
     *        The new settings for a multiplex.
     */

    public void setMultiplexSettings(MultiplexSettings multiplexSettings) {
        this.multiplexSettings = multiplexSettings;
    }

    /**
     * The new settings for a multiplex.
     * 
     * @return The new settings for a multiplex.
     */

    public MultiplexSettings getMultiplexSettings() {
        return this.multiplexSettings;
    }

    /**
     * The new settings for a multiplex.
     * 
     * @param multiplexSettings
     *        The new settings for a multiplex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMultiplexRequest withMultiplexSettings(MultiplexSettings multiplexSettings) {
        setMultiplexSettings(multiplexSettings);
        return this;
    }

    /**
     * Name of the multiplex.
     * 
     * @param name
     *        Name of the multiplex.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name of the multiplex.
     * 
     * @return Name of the multiplex.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Name of the multiplex.
     * 
     * @param name
     *        Name of the multiplex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMultiplexRequest withName(String name) {
        setName(name);
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
        if (getMultiplexId() != null)
            sb.append("MultiplexId: ").append(getMultiplexId()).append(",");
        if (getMultiplexSettings() != null)
            sb.append("MultiplexSettings: ").append(getMultiplexSettings()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMultiplexRequest == false)
            return false;
        UpdateMultiplexRequest other = (UpdateMultiplexRequest) obj;
        if (other.getMultiplexId() == null ^ this.getMultiplexId() == null)
            return false;
        if (other.getMultiplexId() != null && other.getMultiplexId().equals(this.getMultiplexId()) == false)
            return false;
        if (other.getMultiplexSettings() == null ^ this.getMultiplexSettings() == null)
            return false;
        if (other.getMultiplexSettings() != null && other.getMultiplexSettings().equals(this.getMultiplexSettings()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMultiplexId() == null) ? 0 : getMultiplexId().hashCode());
        hashCode = prime * hashCode + ((getMultiplexSettings() == null) ? 0 : getMultiplexSettings().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMultiplexRequest clone() {
        return (UpdateMultiplexRequest) super.clone();
    }

}
