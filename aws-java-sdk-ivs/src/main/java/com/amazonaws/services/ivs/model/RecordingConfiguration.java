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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a configuration to record a channel stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/RecordingConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Recording-configuration ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * An arbitrary string (a nickname) assigned to a recording configuration that helps the customer identify that
     * resource. The value does not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A complex type that contains information about where recorded video will be stored.
     * </p>
     */
    private DestinationConfiguration destinationConfiguration;
    /**
     * <p>
     * Indicates the current state of the recording configuration. When the state is <code>ACTIVE</code>, the
     * configuration is ready for recording a channel stream.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Recording-configuration ARN.
     * </p>
     * 
     * @param arn
     *        Recording-configuration ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Recording-configuration ARN.
     * </p>
     * 
     * @return Recording-configuration ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Recording-configuration ARN.
     * </p>
     * 
     * @param arn
     *        Recording-configuration ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordingConfiguration withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * An arbitrary string (a nickname) assigned to a recording configuration that helps the customer identify that
     * resource. The value does not need to be unique.
     * </p>
     * 
     * @param name
     *        An arbitrary string (a nickname) assigned to a recording configuration that helps the customer identify
     *        that resource. The value does not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * An arbitrary string (a nickname) assigned to a recording configuration that helps the customer identify that
     * resource. The value does not need to be unique.
     * </p>
     * 
     * @return An arbitrary string (a nickname) assigned to a recording configuration that helps the customer identify
     *         that resource. The value does not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * An arbitrary string (a nickname) assigned to a recording configuration that helps the customer identify that
     * resource. The value does not need to be unique.
     * </p>
     * 
     * @param name
     *        An arbitrary string (a nickname) assigned to a recording configuration that helps the customer identify
     *        that resource. The value does not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordingConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about where recorded video will be stored.
     * </p>
     * 
     * @param destinationConfiguration
     *        A complex type that contains information about where recorded video will be stored.
     */

    public void setDestinationConfiguration(DestinationConfiguration destinationConfiguration) {
        this.destinationConfiguration = destinationConfiguration;
    }

    /**
     * <p>
     * A complex type that contains information about where recorded video will be stored.
     * </p>
     * 
     * @return A complex type that contains information about where recorded video will be stored.
     */

    public DestinationConfiguration getDestinationConfiguration() {
        return this.destinationConfiguration;
    }

    /**
     * <p>
     * A complex type that contains information about where recorded video will be stored.
     * </p>
     * 
     * @param destinationConfiguration
     *        A complex type that contains information about where recorded video will be stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordingConfiguration withDestinationConfiguration(DestinationConfiguration destinationConfiguration) {
        setDestinationConfiguration(destinationConfiguration);
        return this;
    }

    /**
     * <p>
     * Indicates the current state of the recording configuration. When the state is <code>ACTIVE</code>, the
     * configuration is ready for recording a channel stream.
     * </p>
     * 
     * @param state
     *        Indicates the current state of the recording configuration. When the state is <code>ACTIVE</code>, the
     *        configuration is ready for recording a channel stream.
     * @see RecordingConfigurationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Indicates the current state of the recording configuration. When the state is <code>ACTIVE</code>, the
     * configuration is ready for recording a channel stream.
     * </p>
     * 
     * @return Indicates the current state of the recording configuration. When the state is <code>ACTIVE</code>, the
     *         configuration is ready for recording a channel stream.
     * @see RecordingConfigurationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Indicates the current state of the recording configuration. When the state is <code>ACTIVE</code>, the
     * configuration is ready for recording a channel stream.
     * </p>
     * 
     * @param state
     *        Indicates the current state of the recording configuration. When the state is <code>ACTIVE</code>, the
     *        configuration is ready for recording a channel stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordingConfigurationState
     */

    public RecordingConfiguration withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Indicates the current state of the recording configuration. When the state is <code>ACTIVE</code>, the
     * configuration is ready for recording a channel stream.
     * </p>
     * 
     * @param state
     *        Indicates the current state of the recording configuration. When the state is <code>ACTIVE</code>, the
     *        configuration is ready for recording a channel stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordingConfigurationState
     */

    public RecordingConfiguration withState(RecordingConfigurationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     * 
     * @return Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordingConfiguration withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see RecordingConfiguration#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RecordingConfiguration addTagsEntry(String key, String value) {
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

    public RecordingConfiguration clearTagsEntries() {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDestinationConfiguration() != null)
            sb.append("DestinationConfiguration: ").append(getDestinationConfiguration()).append(",");
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

        if (obj instanceof RecordingConfiguration == false)
            return false;
        RecordingConfiguration other = (RecordingConfiguration) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDestinationConfiguration() == null ^ this.getDestinationConfiguration() == null)
            return false;
        if (other.getDestinationConfiguration() != null && other.getDestinationConfiguration().equals(this.getDestinationConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDestinationConfiguration() == null) ? 0 : getDestinationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public RecordingConfiguration clone() {
        try {
            return (RecordingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.RecordingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
