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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The filter, either channel or queues, to apply to the metric results retrieved.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Filters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of up to 100 queue IDs or queue ARNs to use to filter the metrics retrieved. You can include both IDs and
     * ARNs in a request.
     * </p>
     */
    private java.util.List<String> queues;
    /**
     * <p>
     * The Channel to use as a filter for the metrics returned. Only VOICE is supported.
     * </p>
     */
    private java.util.List<String> channels;

    /**
     * <p>
     * A list of up to 100 queue IDs or queue ARNs to use to filter the metrics retrieved. You can include both IDs and
     * ARNs in a request.
     * </p>
     * 
     * @return A list of up to 100 queue IDs or queue ARNs to use to filter the metrics retrieved. You can include both
     *         IDs and ARNs in a request.
     */

    public java.util.List<String> getQueues() {
        return queues;
    }

    /**
     * <p>
     * A list of up to 100 queue IDs or queue ARNs to use to filter the metrics retrieved. You can include both IDs and
     * ARNs in a request.
     * </p>
     * 
     * @param queues
     *        A list of up to 100 queue IDs or queue ARNs to use to filter the metrics retrieved. You can include both
     *        IDs and ARNs in a request.
     */

    public void setQueues(java.util.Collection<String> queues) {
        if (queues == null) {
            this.queues = null;
            return;
        }

        this.queues = new java.util.ArrayList<String>(queues);
    }

    /**
     * <p>
     * A list of up to 100 queue IDs or queue ARNs to use to filter the metrics retrieved. You can include both IDs and
     * ARNs in a request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueues(java.util.Collection)} or {@link #withQueues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param queues
     *        A list of up to 100 queue IDs or queue ARNs to use to filter the metrics retrieved. You can include both
     *        IDs and ARNs in a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filters withQueues(String... queues) {
        if (this.queues == null) {
            setQueues(new java.util.ArrayList<String>(queues.length));
        }
        for (String ele : queues) {
            this.queues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 100 queue IDs or queue ARNs to use to filter the metrics retrieved. You can include both IDs and
     * ARNs in a request.
     * </p>
     * 
     * @param queues
     *        A list of up to 100 queue IDs or queue ARNs to use to filter the metrics retrieved. You can include both
     *        IDs and ARNs in a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filters withQueues(java.util.Collection<String> queues) {
        setQueues(queues);
        return this;
    }

    /**
     * <p>
     * The Channel to use as a filter for the metrics returned. Only VOICE is supported.
     * </p>
     * 
     * @return The Channel to use as a filter for the metrics returned. Only VOICE is supported.
     * @see Channel
     */

    public java.util.List<String> getChannels() {
        return channels;
    }

    /**
     * <p>
     * The Channel to use as a filter for the metrics returned. Only VOICE is supported.
     * </p>
     * 
     * @param channels
     *        The Channel to use as a filter for the metrics returned. Only VOICE is supported.
     * @see Channel
     */

    public void setChannels(java.util.Collection<String> channels) {
        if (channels == null) {
            this.channels = null;
            return;
        }

        this.channels = new java.util.ArrayList<String>(channels);
    }

    /**
     * <p>
     * The Channel to use as a filter for the metrics returned. Only VOICE is supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannels(java.util.Collection)} or {@link #withChannels(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param channels
     *        The Channel to use as a filter for the metrics returned. Only VOICE is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public Filters withChannels(String... channels) {
        if (this.channels == null) {
            setChannels(new java.util.ArrayList<String>(channels.length));
        }
        for (String ele : channels) {
            this.channels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Channel to use as a filter for the metrics returned. Only VOICE is supported.
     * </p>
     * 
     * @param channels
     *        The Channel to use as a filter for the metrics returned. Only VOICE is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public Filters withChannels(java.util.Collection<String> channels) {
        setChannels(channels);
        return this;
    }

    /**
     * <p>
     * The Channel to use as a filter for the metrics returned. Only VOICE is supported.
     * </p>
     * 
     * @param channels
     *        The Channel to use as a filter for the metrics returned. Only VOICE is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public Filters withChannels(Channel... channels) {
        java.util.ArrayList<String> channelsCopy = new java.util.ArrayList<String>(channels.length);
        for (Channel value : channels) {
            channelsCopy.add(value.toString());
        }
        if (getChannels() == null) {
            setChannels(channelsCopy);
        } else {
            getChannels().addAll(channelsCopy);
        }
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
        if (getQueues() != null)
            sb.append("Queues: ").append(getQueues()).append(",");
        if (getChannels() != null)
            sb.append("Channels: ").append(getChannels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filters == false)
            return false;
        Filters other = (Filters) obj;
        if (other.getQueues() == null ^ this.getQueues() == null)
            return false;
        if (other.getQueues() != null && other.getQueues().equals(this.getQueues()) == false)
            return false;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueues() == null) ? 0 : getQueues().hashCode());
        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        return hashCode;
    }

    @Override
    public Filters clone() {
        try {
            return (Filters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.FiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
