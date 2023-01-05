/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The audio artifact concatenation configuration object.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/AudioConcatenationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioConcatenationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables the <i>name</i> object, where <i>name</i> is the name of the configuration object, such as
     * <code>AudioConcatenation</code>.
     * </p>
     */
    private String state;

    /**
     * <p>
     * Enables the <i>name</i> object, where <i>name</i> is the name of the configuration object, such as
     * <code>AudioConcatenation</code>.
     * </p>
     * 
     * @param state
     *        Enables the <i>name</i> object, where <i>name</i> is the name of the configuration object, such as
     *        <code>AudioConcatenation</code>.
     * @see AudioArtifactsConcatenationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Enables the <i>name</i> object, where <i>name</i> is the name of the configuration object, such as
     * <code>AudioConcatenation</code>.
     * </p>
     * 
     * @return Enables the <i>name</i> object, where <i>name</i> is the name of the configuration object, such as
     *         <code>AudioConcatenation</code>.
     * @see AudioArtifactsConcatenationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Enables the <i>name</i> object, where <i>name</i> is the name of the configuration object, such as
     * <code>AudioConcatenation</code>.
     * </p>
     * 
     * @param state
     *        Enables the <i>name</i> object, where <i>name</i> is the name of the configuration object, such as
     *        <code>AudioConcatenation</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioArtifactsConcatenationState
     */

    public AudioConcatenationConfiguration withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Enables the <i>name</i> object, where <i>name</i> is the name of the configuration object, such as
     * <code>AudioConcatenation</code>.
     * </p>
     * 
     * @param state
     *        Enables the <i>name</i> object, where <i>name</i> is the name of the configuration object, such as
     *        <code>AudioConcatenation</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioArtifactsConcatenationState
     */

    public AudioConcatenationConfiguration withState(AudioArtifactsConcatenationState state) {
        this.state = state.toString();
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
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioConcatenationConfiguration == false)
            return false;
        AudioConcatenationConfiguration other = (AudioConcatenationConfiguration) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public AudioConcatenationConfiguration clone() {
        try {
            return (AudioConcatenationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.AudioConcatenationConfigurationMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
