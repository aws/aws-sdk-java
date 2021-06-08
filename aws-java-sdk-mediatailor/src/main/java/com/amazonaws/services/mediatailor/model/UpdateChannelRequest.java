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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The channel's output properties.
     * </p>
     */
    private java.util.List<RequestOutputItem> outputs;

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     * 
     * @param channelName
     *        The identifier for the channel you are working on.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     * 
     * @return The identifier for the channel you are working on.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The identifier for the channel you are working on.
     * </p>
     * 
     * @param channelName
     *        The identifier for the channel you are working on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The channel's output properties.
     * </p>
     * 
     * @return The channel's output properties.
     */

    public java.util.List<RequestOutputItem> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The channel's output properties.
     * </p>
     * 
     * @param outputs
     *        The channel's output properties.
     */

    public void setOutputs(java.util.Collection<RequestOutputItem> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<RequestOutputItem>(outputs);
    }

    /**
     * <p>
     * The channel's output properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The channel's output properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withOutputs(RequestOutputItem... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<RequestOutputItem>(outputs.length));
        }
        for (RequestOutputItem ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The channel's output properties.
     * </p>
     * 
     * @param outputs
     *        The channel's output properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withOutputs(java.util.Collection<RequestOutputItem> outputs) {
        setOutputs(outputs);
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
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChannelRequest == false)
            return false;
        UpdateChannelRequest other = (UpdateChannelRequest) obj;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChannelRequest clone() {
        return (UpdateChannelRequest) super.clone();
    }

}
