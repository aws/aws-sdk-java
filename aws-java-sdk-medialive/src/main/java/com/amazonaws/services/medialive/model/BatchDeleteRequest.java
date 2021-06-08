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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to delete resources
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchDelete" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** List of channel IDs */
    private java.util.List<String> channelIds;
    /** List of input IDs */
    private java.util.List<String> inputIds;
    /** List of input security group IDs */
    private java.util.List<String> inputSecurityGroupIds;
    /** List of multiplex IDs */
    private java.util.List<String> multiplexIds;

    /**
     * List of channel IDs
     * 
     * @return List of channel IDs
     */

    public java.util.List<String> getChannelIds() {
        return channelIds;
    }

    /**
     * List of channel IDs
     * 
     * @param channelIds
     *        List of channel IDs
     */

    public void setChannelIds(java.util.Collection<String> channelIds) {
        if (channelIds == null) {
            this.channelIds = null;
            return;
        }

        this.channelIds = new java.util.ArrayList<String>(channelIds);
    }

    /**
     * List of channel IDs
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannelIds(java.util.Collection)} or {@link #withChannelIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param channelIds
     *        List of channel IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRequest withChannelIds(String... channelIds) {
        if (this.channelIds == null) {
            setChannelIds(new java.util.ArrayList<String>(channelIds.length));
        }
        for (String ele : channelIds) {
            this.channelIds.add(ele);
        }
        return this;
    }

    /**
     * List of channel IDs
     * 
     * @param channelIds
     *        List of channel IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRequest withChannelIds(java.util.Collection<String> channelIds) {
        setChannelIds(channelIds);
        return this;
    }

    /**
     * List of input IDs
     * 
     * @return List of input IDs
     */

    public java.util.List<String> getInputIds() {
        return inputIds;
    }

    /**
     * List of input IDs
     * 
     * @param inputIds
     *        List of input IDs
     */

    public void setInputIds(java.util.Collection<String> inputIds) {
        if (inputIds == null) {
            this.inputIds = null;
            return;
        }

        this.inputIds = new java.util.ArrayList<String>(inputIds);
    }

    /**
     * List of input IDs
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputIds(java.util.Collection)} or {@link #withInputIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param inputIds
     *        List of input IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRequest withInputIds(String... inputIds) {
        if (this.inputIds == null) {
            setInputIds(new java.util.ArrayList<String>(inputIds.length));
        }
        for (String ele : inputIds) {
            this.inputIds.add(ele);
        }
        return this;
    }

    /**
     * List of input IDs
     * 
     * @param inputIds
     *        List of input IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRequest withInputIds(java.util.Collection<String> inputIds) {
        setInputIds(inputIds);
        return this;
    }

    /**
     * List of input security group IDs
     * 
     * @return List of input security group IDs
     */

    public java.util.List<String> getInputSecurityGroupIds() {
        return inputSecurityGroupIds;
    }

    /**
     * List of input security group IDs
     * 
     * @param inputSecurityGroupIds
     *        List of input security group IDs
     */

    public void setInputSecurityGroupIds(java.util.Collection<String> inputSecurityGroupIds) {
        if (inputSecurityGroupIds == null) {
            this.inputSecurityGroupIds = null;
            return;
        }

        this.inputSecurityGroupIds = new java.util.ArrayList<String>(inputSecurityGroupIds);
    }

    /**
     * List of input security group IDs
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputSecurityGroupIds(java.util.Collection)} or
     * {@link #withInputSecurityGroupIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inputSecurityGroupIds
     *        List of input security group IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRequest withInputSecurityGroupIds(String... inputSecurityGroupIds) {
        if (this.inputSecurityGroupIds == null) {
            setInputSecurityGroupIds(new java.util.ArrayList<String>(inputSecurityGroupIds.length));
        }
        for (String ele : inputSecurityGroupIds) {
            this.inputSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * List of input security group IDs
     * 
     * @param inputSecurityGroupIds
     *        List of input security group IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRequest withInputSecurityGroupIds(java.util.Collection<String> inputSecurityGroupIds) {
        setInputSecurityGroupIds(inputSecurityGroupIds);
        return this;
    }

    /**
     * List of multiplex IDs
     * 
     * @return List of multiplex IDs
     */

    public java.util.List<String> getMultiplexIds() {
        return multiplexIds;
    }

    /**
     * List of multiplex IDs
     * 
     * @param multiplexIds
     *        List of multiplex IDs
     */

    public void setMultiplexIds(java.util.Collection<String> multiplexIds) {
        if (multiplexIds == null) {
            this.multiplexIds = null;
            return;
        }

        this.multiplexIds = new java.util.ArrayList<String>(multiplexIds);
    }

    /**
     * List of multiplex IDs
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMultiplexIds(java.util.Collection)} or {@link #withMultiplexIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param multiplexIds
     *        List of multiplex IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRequest withMultiplexIds(String... multiplexIds) {
        if (this.multiplexIds == null) {
            setMultiplexIds(new java.util.ArrayList<String>(multiplexIds.length));
        }
        for (String ele : multiplexIds) {
            this.multiplexIds.add(ele);
        }
        return this;
    }

    /**
     * List of multiplex IDs
     * 
     * @param multiplexIds
     *        List of multiplex IDs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRequest withMultiplexIds(java.util.Collection<String> multiplexIds) {
        setMultiplexIds(multiplexIds);
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
        if (getChannelIds() != null)
            sb.append("ChannelIds: ").append(getChannelIds()).append(",");
        if (getInputIds() != null)
            sb.append("InputIds: ").append(getInputIds()).append(",");
        if (getInputSecurityGroupIds() != null)
            sb.append("InputSecurityGroupIds: ").append(getInputSecurityGroupIds()).append(",");
        if (getMultiplexIds() != null)
            sb.append("MultiplexIds: ").append(getMultiplexIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteRequest == false)
            return false;
        BatchDeleteRequest other = (BatchDeleteRequest) obj;
        if (other.getChannelIds() == null ^ this.getChannelIds() == null)
            return false;
        if (other.getChannelIds() != null && other.getChannelIds().equals(this.getChannelIds()) == false)
            return false;
        if (other.getInputIds() == null ^ this.getInputIds() == null)
            return false;
        if (other.getInputIds() != null && other.getInputIds().equals(this.getInputIds()) == false)
            return false;
        if (other.getInputSecurityGroupIds() == null ^ this.getInputSecurityGroupIds() == null)
            return false;
        if (other.getInputSecurityGroupIds() != null && other.getInputSecurityGroupIds().equals(this.getInputSecurityGroupIds()) == false)
            return false;
        if (other.getMultiplexIds() == null ^ this.getMultiplexIds() == null)
            return false;
        if (other.getMultiplexIds() != null && other.getMultiplexIds().equals(this.getMultiplexIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelIds() == null) ? 0 : getChannelIds().hashCode());
        hashCode = prime * hashCode + ((getInputIds() == null) ? 0 : getInputIds().hashCode());
        hashCode = prime * hashCode + ((getInputSecurityGroupIds() == null) ? 0 : getInputSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getMultiplexIds() == null) ? 0 : getMultiplexIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteRequest clone() {
        return (BatchDeleteRequest) super.clone();
    }

}
