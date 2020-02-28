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

/**
 * Placeholder documentation for StartMultiplexResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartMultiplex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMultiplexResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The unique arn of the multiplex. */
    private String arn;
    /** A list of availability zones for the multiplex. */
    private java.util.List<String> availabilityZones;
    /** A list of the multiplex output destinations. */
    private java.util.List<MultiplexOutputDestination> destinations;
    /** The unique id of the multiplex. */
    private String id;
    /** Configuration for a multiplex event. */
    private MultiplexSettings multiplexSettings;
    /** The name of the multiplex. */
    private String name;
    /** The number of currently healthy pipelines. */
    private Integer pipelinesRunningCount;
    /** The number of programs in the multiplex. */
    private Integer programCount;
    /** The current state of the multiplex. */
    private String state;
    /** A collection of key-value pairs. */
    private java.util.Map<String, String> tags;

    /**
     * The unique arn of the multiplex.
     * 
     * @param arn
     *        The unique arn of the multiplex.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The unique arn of the multiplex.
     * 
     * @return The unique arn of the multiplex.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The unique arn of the multiplex.
     * 
     * @param arn
     *        The unique arn of the multiplex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMultiplexResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * A list of availability zones for the multiplex.
     * 
     * @return A list of availability zones for the multiplex.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * A list of availability zones for the multiplex.
     * 
     * @param availabilityZones
     *        A list of availability zones for the multiplex.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * A list of availability zones for the multiplex.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of availability zones for the multiplex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMultiplexResult withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * A list of availability zones for the multiplex.
     * 
     * @param availabilityZones
     *        A list of availability zones for the multiplex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMultiplexResult withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * A list of the multiplex output destinations.
     * 
     * @return A list of the multiplex output destinations.
     */

    public java.util.List<MultiplexOutputDestination> getDestinations() {
        return destinations;
    }

    /**
     * A list of the multiplex output destinations.
     * 
     * @param destinations
     *        A list of the multiplex output destinations.
     */

    public void setDestinations(java.util.Collection<MultiplexOutputDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<MultiplexOutputDestination>(destinations);
    }

    /**
     * A list of the multiplex output destinations.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        A list of the multiplex output destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMultiplexResult withDestinations(MultiplexOutputDestination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<MultiplexOutputDestination>(destinations.length));
        }
        for (MultiplexOutputDestination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * A list of the multiplex output destinations.
     * 
     * @param destinations
     *        A list of the multiplex output destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMultiplexResult withDestinations(java.util.Collection<MultiplexOutputDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * The unique id of the multiplex.
     * 
     * @param id
     *        The unique id of the multiplex.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique id of the multiplex.
     * 
     * @return The unique id of the multiplex.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The unique id of the multiplex.
     * 
     * @param id
     *        The unique id of the multiplex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMultiplexResult withId(String id) {
        setId(id);
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

    public StartMultiplexResult withMultiplexSettings(MultiplexSettings multiplexSettings) {
        setMultiplexSettings(multiplexSettings);
        return this;
    }

    /**
     * The name of the multiplex.
     * 
     * @param name
     *        The name of the multiplex.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the multiplex.
     * 
     * @return The name of the multiplex.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the multiplex.
     * 
     * @param name
     *        The name of the multiplex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMultiplexResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The number of currently healthy pipelines.
     * 
     * @param pipelinesRunningCount
     *        The number of currently healthy pipelines.
     */

    public void setPipelinesRunningCount(Integer pipelinesRunningCount) {
        this.pipelinesRunningCount = pipelinesRunningCount;
    }

    /**
     * The number of currently healthy pipelines.
     * 
     * @return The number of currently healthy pipelines.
     */

    public Integer getPipelinesRunningCount() {
        return this.pipelinesRunningCount;
    }

    /**
     * The number of currently healthy pipelines.
     * 
     * @param pipelinesRunningCount
     *        The number of currently healthy pipelines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMultiplexResult withPipelinesRunningCount(Integer pipelinesRunningCount) {
        setPipelinesRunningCount(pipelinesRunningCount);
        return this;
    }

    /**
     * The number of programs in the multiplex.
     * 
     * @param programCount
     *        The number of programs in the multiplex.
     */

    public void setProgramCount(Integer programCount) {
        this.programCount = programCount;
    }

    /**
     * The number of programs in the multiplex.
     * 
     * @return The number of programs in the multiplex.
     */

    public Integer getProgramCount() {
        return this.programCount;
    }

    /**
     * The number of programs in the multiplex.
     * 
     * @param programCount
     *        The number of programs in the multiplex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMultiplexResult withProgramCount(Integer programCount) {
        setProgramCount(programCount);
        return this;
    }

    /**
     * The current state of the multiplex.
     * 
     * @param state
     *        The current state of the multiplex.
     * @see MultiplexState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * The current state of the multiplex.
     * 
     * @return The current state of the multiplex.
     * @see MultiplexState
     */

    public String getState() {
        return this.state;
    }

    /**
     * The current state of the multiplex.
     * 
     * @param state
     *        The current state of the multiplex.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MultiplexState
     */

    public StartMultiplexResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * The current state of the multiplex.
     * 
     * @param state
     *        The current state of the multiplex.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MultiplexState
     */

    public StartMultiplexResult withState(MultiplexState state) {
        this.state = state.toString();
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

    public StartMultiplexResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartMultiplexResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartMultiplexResult addTagsEntry(String key, String value) {
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

    public StartMultiplexResult clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMultiplexSettings() != null)
            sb.append("MultiplexSettings: ").append(getMultiplexSettings()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPipelinesRunningCount() != null)
            sb.append("PipelinesRunningCount: ").append(getPipelinesRunningCount()).append(",");
        if (getProgramCount() != null)
            sb.append("ProgramCount: ").append(getProgramCount()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof StartMultiplexResult == false)
            return false;
        StartMultiplexResult other = (StartMultiplexResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMultiplexSettings() == null ^ this.getMultiplexSettings() == null)
            return false;
        if (other.getMultiplexSettings() != null && other.getMultiplexSettings().equals(this.getMultiplexSettings()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPipelinesRunningCount() == null ^ this.getPipelinesRunningCount() == null)
            return false;
        if (other.getPipelinesRunningCount() != null && other.getPipelinesRunningCount().equals(this.getPipelinesRunningCount()) == false)
            return false;
        if (other.getProgramCount() == null ^ this.getProgramCount() == null)
            return false;
        if (other.getProgramCount() != null && other.getProgramCount().equals(this.getProgramCount()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMultiplexSettings() == null) ? 0 : getMultiplexSettings().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPipelinesRunningCount() == null) ? 0 : getPipelinesRunningCount().hashCode());
        hashCode = prime * hashCode + ((getProgramCount() == null) ? 0 : getProgramCount().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartMultiplexResult clone() {
        try {
            return (StartMultiplexResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
