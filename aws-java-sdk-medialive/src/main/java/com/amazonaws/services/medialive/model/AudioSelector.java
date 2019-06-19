/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Audio Selector
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AudioSelector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * The name of this AudioSelector. AudioDescriptions will use this name to uniquely identify this Selector. Selector
     * names should be unique per input.
     */
    private String name;
    /** The audio selector settings. */
    private AudioSelectorSettings selectorSettings;

    /**
     * The name of this AudioSelector. AudioDescriptions will use this name to uniquely identify this Selector. Selector
     * names should be unique per input.
     * 
     * @param name
     *        The name of this AudioSelector. AudioDescriptions will use this name to uniquely identify this Selector.
     *        Selector names should be unique per input.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of this AudioSelector. AudioDescriptions will use this name to uniquely identify this Selector. Selector
     * names should be unique per input.
     * 
     * @return The name of this AudioSelector. AudioDescriptions will use this name to uniquely identify this Selector.
     *         Selector names should be unique per input.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of this AudioSelector. AudioDescriptions will use this name to uniquely identify this Selector. Selector
     * names should be unique per input.
     * 
     * @param name
     *        The name of this AudioSelector. AudioDescriptions will use this name to uniquely identify this Selector.
     *        Selector names should be unique per input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSelector withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The audio selector settings.
     * 
     * @param selectorSettings
     *        The audio selector settings.
     */

    public void setSelectorSettings(AudioSelectorSettings selectorSettings) {
        this.selectorSettings = selectorSettings;
    }

    /**
     * The audio selector settings.
     * 
     * @return The audio selector settings.
     */

    public AudioSelectorSettings getSelectorSettings() {
        return this.selectorSettings;
    }

    /**
     * The audio selector settings.
     * 
     * @param selectorSettings
     *        The audio selector settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSelector withSelectorSettings(AudioSelectorSettings selectorSettings) {
        setSelectorSettings(selectorSettings);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSelectorSettings() != null)
            sb.append("SelectorSettings: ").append(getSelectorSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioSelector == false)
            return false;
        AudioSelector other = (AudioSelector) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSelectorSettings() == null ^ this.getSelectorSettings() == null)
            return false;
        if (other.getSelectorSettings() != null && other.getSelectorSettings().equals(this.getSelectorSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSelectorSettings() == null) ? 0 : getSelectorSettings().hashCode());
        return hashCode;
    }

    @Override
    public AudioSelector clone() {
        try {
            return (AudioSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AudioSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
