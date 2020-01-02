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
package com.amazonaws.services.iotsecuretunneling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/OpenTunnel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenTunnelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A short text description of the tunnel.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A collection of tag metadata.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The destination configuration for the OpenTunnel request.
     * </p>
     */
    private DestinationConfig destinationConfig;
    /**
     * <p>
     * Timeout configuration for a tunnel.
     * </p>
     */
    private TimeoutConfig timeoutConfig;

    /**
     * <p>
     * A short text description of the tunnel.
     * </p>
     * 
     * @param description
     *        A short text description of the tunnel.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A short text description of the tunnel.
     * </p>
     * 
     * @return A short text description of the tunnel.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A short text description of the tunnel.
     * </p>
     * 
     * @param description
     *        A short text description of the tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenTunnelRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A collection of tag metadata.
     * </p>
     * 
     * @return A collection of tag metadata.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of tag metadata.
     * </p>
     * 
     * @param tags
     *        A collection of tag metadata.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A collection of tag metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A collection of tag metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenTunnelRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of tag metadata.
     * </p>
     * 
     * @param tags
     *        A collection of tag metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenTunnelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The destination configuration for the OpenTunnel request.
     * </p>
     * 
     * @param destinationConfig
     *        The destination configuration for the OpenTunnel request.
     */

    public void setDestinationConfig(DestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
    }

    /**
     * <p>
     * The destination configuration for the OpenTunnel request.
     * </p>
     * 
     * @return The destination configuration for the OpenTunnel request.
     */

    public DestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    /**
     * <p>
     * The destination configuration for the OpenTunnel request.
     * </p>
     * 
     * @param destinationConfig
     *        The destination configuration for the OpenTunnel request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenTunnelRequest withDestinationConfig(DestinationConfig destinationConfig) {
        setDestinationConfig(destinationConfig);
        return this;
    }

    /**
     * <p>
     * Timeout configuration for a tunnel.
     * </p>
     * 
     * @param timeoutConfig
     *        Timeout configuration for a tunnel.
     */

    public void setTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
    }

    /**
     * <p>
     * Timeout configuration for a tunnel.
     * </p>
     * 
     * @return Timeout configuration for a tunnel.
     */

    public TimeoutConfig getTimeoutConfig() {
        return this.timeoutConfig;
    }

    /**
     * <p>
     * Timeout configuration for a tunnel.
     * </p>
     * 
     * @param timeoutConfig
     *        Timeout configuration for a tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenTunnelRequest withTimeoutConfig(TimeoutConfig timeoutConfig) {
        setTimeoutConfig(timeoutConfig);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDestinationConfig() != null)
            sb.append("DestinationConfig: ").append(getDestinationConfig()).append(",");
        if (getTimeoutConfig() != null)
            sb.append("TimeoutConfig: ").append(getTimeoutConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenTunnelRequest == false)
            return false;
        OpenTunnelRequest other = (OpenTunnelRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDestinationConfig() == null ^ this.getDestinationConfig() == null)
            return false;
        if (other.getDestinationConfig() != null && other.getDestinationConfig().equals(this.getDestinationConfig()) == false)
            return false;
        if (other.getTimeoutConfig() == null ^ this.getTimeoutConfig() == null)
            return false;
        if (other.getTimeoutConfig() != null && other.getTimeoutConfig().equals(this.getTimeoutConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDestinationConfig() == null) ? 0 : getDestinationConfig().hashCode());
        hashCode = prime * hashCode + ((getTimeoutConfig() == null) ? 0 : getTimeoutConfig().hashCode());
        return hashCode;
    }

    @Override
    public OpenTunnelRequest clone() {
        return (OpenTunnelRequest) super.clone();
    }

}
