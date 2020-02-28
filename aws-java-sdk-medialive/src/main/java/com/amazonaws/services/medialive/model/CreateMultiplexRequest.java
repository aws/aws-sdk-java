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
 * A request to create a multiplex.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateMultiplex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMultiplexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A list of availability zones for the multiplex. You must specify exactly two. */
    private java.util.List<String> availabilityZones;
    /** Configuration for a multiplex event. */
    private MultiplexSettings multiplexSettings;
    /** Name of multiplex. */
    private String name;
    /**
     * Unique request ID. This prevents retries from creating multiple resources.
     */
    private String requestId;
    /** A collection of key-value pairs. */
    private java.util.Map<String, String> tags;

    /**
     * A list of availability zones for the multiplex. You must specify exactly two.
     * 
     * @return A list of availability zones for the multiplex. You must specify exactly two.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * A list of availability zones for the multiplex. You must specify exactly two.
     * 
     * @param availabilityZones
     *        A list of availability zones for the multiplex. You must specify exactly two.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * A list of availability zones for the multiplex. You must specify exactly two.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of availability zones for the multiplex. You must specify exactly two.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiplexRequest withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * A list of availability zones for the multiplex. You must specify exactly two.
     * 
     * @param availabilityZones
     *        A list of availability zones for the multiplex. You must specify exactly two.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiplexRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * Configuration for a multiplex event.
     * 
     * @param multiplexSettings
     *        Configuration for a multiplex event.
     */

    public void setMultiplexSettings(MultiplexSettings multiplexSettings) {
        this.multiplexSettings = multiplexSettings;
    }

    /**
     * Configuration for a multiplex event.
     * 
     * @return Configuration for a multiplex event.
     */

    public MultiplexSettings getMultiplexSettings() {
        return this.multiplexSettings;
    }

    /**
     * Configuration for a multiplex event.
     * 
     * @param multiplexSettings
     *        Configuration for a multiplex event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiplexRequest withMultiplexSettings(MultiplexSettings multiplexSettings) {
        setMultiplexSettings(multiplexSettings);
        return this;
    }

    /**
     * Name of multiplex.
     * 
     * @param name
     *        Name of multiplex.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name of multiplex.
     * 
     * @return Name of multiplex.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Name of multiplex.
     * 
     * @param name
     *        Name of multiplex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiplexRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Unique request ID. This prevents retries from creating multiple resources.
     * 
     * @param requestId
     *        Unique request ID. This prevents retries from creating multiple resources.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Unique request ID. This prevents retries from creating multiple resources.
     * 
     * @return Unique request ID. This prevents retries from creating multiple resources.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Unique request ID. This prevents retries from creating multiple resources.
     * 
     * @param requestId
     *        Unique request ID. This prevents retries from creating multiple resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiplexRequest withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * A collection of key-value pairs.
     * 
     * @return A collection of key-value pairs.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * A collection of key-value pairs.
     * 
     * @param tags
     *        A collection of key-value pairs.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * A collection of key-value pairs.
     * 
     * @param tags
     *        A collection of key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiplexRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateMultiplexRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiplexRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiplexRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getMultiplexSettings() != null)
            sb.append("MultiplexSettings: ").append(getMultiplexSettings()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMultiplexRequest == false)
            return false;
        CreateMultiplexRequest other = (CreateMultiplexRequest) obj;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getMultiplexSettings() == null ^ this.getMultiplexSettings() == null)
            return false;
        if (other.getMultiplexSettings() != null && other.getMultiplexSettings().equals(this.getMultiplexSettings()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getMultiplexSettings() == null) ? 0 : getMultiplexSettings().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMultiplexRequest clone() {
        return (CreateMultiplexRequest) super.clone();
    }

}
