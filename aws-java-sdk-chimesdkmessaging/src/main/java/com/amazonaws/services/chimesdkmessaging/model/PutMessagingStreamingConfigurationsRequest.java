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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/PutMessagingStreamingConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMessagingStreamingConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the streaming configuration.
     * </p>
     */
    private String appInstanceArn;
    /**
     * <p>
     * The streaming configurations.
     * </p>
     */
    private java.util.List<StreamingConfiguration> streamingConfigurations;

    /**
     * <p>
     * The ARN of the streaming configuration.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the streaming configuration.
     */

    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the streaming configuration.
     * </p>
     * 
     * @return The ARN of the streaming configuration.
     */

    public String getAppInstanceArn() {
        return this.appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the streaming configuration.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the streaming configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMessagingStreamingConfigurationsRequest withAppInstanceArn(String appInstanceArn) {
        setAppInstanceArn(appInstanceArn);
        return this;
    }

    /**
     * <p>
     * The streaming configurations.
     * </p>
     * 
     * @return The streaming configurations.
     */

    public java.util.List<StreamingConfiguration> getStreamingConfigurations() {
        return streamingConfigurations;
    }

    /**
     * <p>
     * The streaming configurations.
     * </p>
     * 
     * @param streamingConfigurations
     *        The streaming configurations.
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
     * The streaming configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreamingConfigurations(java.util.Collection)} or
     * {@link #withStreamingConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param streamingConfigurations
     *        The streaming configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMessagingStreamingConfigurationsRequest withStreamingConfigurations(StreamingConfiguration... streamingConfigurations) {
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
     * The streaming configurations.
     * </p>
     * 
     * @param streamingConfigurations
     *        The streaming configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMessagingStreamingConfigurationsRequest withStreamingConfigurations(java.util.Collection<StreamingConfiguration> streamingConfigurations) {
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
        if (getAppInstanceArn() != null)
            sb.append("AppInstanceArn: ").append(getAppInstanceArn()).append(",");
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

        if (obj instanceof PutMessagingStreamingConfigurationsRequest == false)
            return false;
        PutMessagingStreamingConfigurationsRequest other = (PutMessagingStreamingConfigurationsRequest) obj;
        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getStreamingConfigurations() == null) ? 0 : getStreamingConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public PutMessagingStreamingConfigurationsRequest clone() {
        return (PutMessagingStreamingConfigurationsRequest) super.clone();
    }

}
