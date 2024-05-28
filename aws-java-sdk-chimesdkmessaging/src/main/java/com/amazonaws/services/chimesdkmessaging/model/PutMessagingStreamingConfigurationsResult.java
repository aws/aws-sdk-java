/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/PutMessagingStreamingConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMessagingStreamingConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The requested streaming configurations.
     * </p>
     */
    private java.util.List<StreamingConfiguration> streamingConfigurations;

    /**
     * <p>
     * The requested streaming configurations.
     * </p>
     * 
     * @return The requested streaming configurations.
     */

    public java.util.List<StreamingConfiguration> getStreamingConfigurations() {
        return streamingConfigurations;
    }

    /**
     * <p>
     * The requested streaming configurations.
     * </p>
     * 
     * @param streamingConfigurations
     *        The requested streaming configurations.
     */

    public void setStreamingConfigurations(java.util.Collection<StreamingConfiguration> streamingConfigurations) {
        if (streamingConfigurations == null) {
            this.streamingConfigurations = null;
            return;
        }

        this.streamingConfigurations = new java.util.ArrayList<StreamingConfiguration>(streamingConfigurations);
    }

    /**
     * <p>
     * The requested streaming configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreamingConfigurations(java.util.Collection)} or
     * {@link #withStreamingConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param streamingConfigurations
     *        The requested streaming configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMessagingStreamingConfigurationsResult withStreamingConfigurations(StreamingConfiguration... streamingConfigurations) {
        if (this.streamingConfigurations == null) {
            setStreamingConfigurations(new java.util.ArrayList<StreamingConfiguration>(streamingConfigurations.length));
        }
        for (StreamingConfiguration ele : streamingConfigurations) {
            this.streamingConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The requested streaming configurations.
     * </p>
     * 
     * @param streamingConfigurations
     *        The requested streaming configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMessagingStreamingConfigurationsResult withStreamingConfigurations(java.util.Collection<StreamingConfiguration> streamingConfigurations) {
        setStreamingConfigurations(streamingConfigurations);
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
        if (getStreamingConfigurations() != null)
            sb.append("StreamingConfigurations: ").append(getStreamingConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMessagingStreamingConfigurationsResult == false)
            return false;
        PutMessagingStreamingConfigurationsResult other = (PutMessagingStreamingConfigurationsResult) obj;
        if (other.getStreamingConfigurations() == null ^ this.getStreamingConfigurations() == null)
            return false;
        if (other.getStreamingConfigurations() != null && other.getStreamingConfigurations().equals(this.getStreamingConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamingConfigurations() == null) ? 0 : getStreamingConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public PutMessagingStreamingConfigurationsResult clone() {
        try {
            return (PutMessagingStreamingConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
