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
 * The configuration object for an event concatenation pipeline.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/MeetingEventsConcatenationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeetingEventsConcatenationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables or disables the configuration object.
     * </p>
     */
    private String state;

    /**
     * <p>
     * Enables or disables the configuration object.
     * </p>
     * 
     * @param state
     *        Enables or disables the configuration object.
     * @see ArtifactsConcatenationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Enables or disables the configuration object.
     * </p>
     * 
     * @return Enables or disables the configuration object.
     * @see ArtifactsConcatenationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Enables or disables the configuration object.
     * </p>
     * 
     * @param state
     *        Enables or disables the configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactsConcatenationState
     */

    public MeetingEventsConcatenationConfiguration withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Enables or disables the configuration object.
     * </p>
     * 
     * @param state
     *        Enables or disables the configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactsConcatenationState
     */

    public MeetingEventsConcatenationConfiguration withState(ArtifactsConcatenationState state) {
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

        if (obj instanceof MeetingEventsConcatenationConfiguration == false)
            return false;
        MeetingEventsConcatenationConfiguration other = (MeetingEventsConcatenationConfiguration) obj;
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
    public MeetingEventsConcatenationConfiguration clone() {
        try {
            return (MeetingEventsConcatenationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.MeetingEventsConcatenationConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
