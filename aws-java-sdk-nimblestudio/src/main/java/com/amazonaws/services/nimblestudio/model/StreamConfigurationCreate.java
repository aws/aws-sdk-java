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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StreamConfigurationCreate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamConfigurationCreate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enable or disable the use of the system clipboard to copy and paste between the streaming session and streaming
     * client.
     * </p>
     */
    private String clipboardMode;
    /**
     * <p>
     * The EC2 instance types that users can select from when launching a streaming session with this launch profile.
     * </p>
     */
    private java.util.List<String> ec2InstanceTypes;
    /**
     * <p>
     * The length of time, in minutes, that a streaming session can run. After this point, Nimble Studio automatically
     * terminates the session.
     * </p>
     */
    private Integer maxSessionLengthInMinutes;
    /**
     * <p>
     * The streaming images that users can select from when launching a streaming session with this launch profile.
     * </p>
     */
    private java.util.List<String> streamingImageIds;

    /**
     * <p>
     * Enable or disable the use of the system clipboard to copy and paste between the streaming session and streaming
     * client.
     * </p>
     * 
     * @param clipboardMode
     *        Enable or disable the use of the system clipboard to copy and paste between the streaming session and
     *        streaming client.
     * @see StreamingClipboardMode
     */

    public void setClipboardMode(String clipboardMode) {
        this.clipboardMode = clipboardMode;
    }

    /**
     * <p>
     * Enable or disable the use of the system clipboard to copy and paste between the streaming session and streaming
     * client.
     * </p>
     * 
     * @return Enable or disable the use of the system clipboard to copy and paste between the streaming session and
     *         streaming client.
     * @see StreamingClipboardMode
     */

    public String getClipboardMode() {
        return this.clipboardMode;
    }

    /**
     * <p>
     * Enable or disable the use of the system clipboard to copy and paste between the streaming session and streaming
     * client.
     * </p>
     * 
     * @param clipboardMode
     *        Enable or disable the use of the system clipboard to copy and paste between the streaming session and
     *        streaming client.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingClipboardMode
     */

    public StreamConfigurationCreate withClipboardMode(String clipboardMode) {
        setClipboardMode(clipboardMode);
        return this;
    }

    /**
     * <p>
     * Enable or disable the use of the system clipboard to copy and paste between the streaming session and streaming
     * client.
     * </p>
     * 
     * @param clipboardMode
     *        Enable or disable the use of the system clipboard to copy and paste between the streaming session and
     *        streaming client.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingClipboardMode
     */

    public StreamConfigurationCreate withClipboardMode(StreamingClipboardMode clipboardMode) {
        this.clipboardMode = clipboardMode.toString();
        return this;
    }

    /**
     * <p>
     * The EC2 instance types that users can select from when launching a streaming session with this launch profile.
     * </p>
     * 
     * @return The EC2 instance types that users can select from when launching a streaming session with this launch
     *         profile.
     * @see StreamingInstanceType
     */

    public java.util.List<String> getEc2InstanceTypes() {
        return ec2InstanceTypes;
    }

    /**
     * <p>
     * The EC2 instance types that users can select from when launching a streaming session with this launch profile.
     * </p>
     * 
     * @param ec2InstanceTypes
     *        The EC2 instance types that users can select from when launching a streaming session with this launch
     *        profile.
     * @see StreamingInstanceType
     */

    public void setEc2InstanceTypes(java.util.Collection<String> ec2InstanceTypes) {
        if (ec2InstanceTypes == null) {
            this.ec2InstanceTypes = null;
            return;
        }

        this.ec2InstanceTypes = new java.util.ArrayList<String>(ec2InstanceTypes);
    }

    /**
     * <p>
     * The EC2 instance types that users can select from when launching a streaming session with this launch profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2InstanceTypes(java.util.Collection)} or {@link #withEc2InstanceTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ec2InstanceTypes
     *        The EC2 instance types that users can select from when launching a streaming session with this launch
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingInstanceType
     */

    public StreamConfigurationCreate withEc2InstanceTypes(String... ec2InstanceTypes) {
        if (this.ec2InstanceTypes == null) {
            setEc2InstanceTypes(new java.util.ArrayList<String>(ec2InstanceTypes.length));
        }
        for (String ele : ec2InstanceTypes) {
            this.ec2InstanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 instance types that users can select from when launching a streaming session with this launch profile.
     * </p>
     * 
     * @param ec2InstanceTypes
     *        The EC2 instance types that users can select from when launching a streaming session with this launch
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingInstanceType
     */

    public StreamConfigurationCreate withEc2InstanceTypes(java.util.Collection<String> ec2InstanceTypes) {
        setEc2InstanceTypes(ec2InstanceTypes);
        return this;
    }

    /**
     * <p>
     * The EC2 instance types that users can select from when launching a streaming session with this launch profile.
     * </p>
     * 
     * @param ec2InstanceTypes
     *        The EC2 instance types that users can select from when launching a streaming session with this launch
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingInstanceType
     */

    public StreamConfigurationCreate withEc2InstanceTypes(StreamingInstanceType... ec2InstanceTypes) {
        java.util.ArrayList<String> ec2InstanceTypesCopy = new java.util.ArrayList<String>(ec2InstanceTypes.length);
        for (StreamingInstanceType value : ec2InstanceTypes) {
            ec2InstanceTypesCopy.add(value.toString());
        }
        if (getEc2InstanceTypes() == null) {
            setEc2InstanceTypes(ec2InstanceTypesCopy);
        } else {
            getEc2InstanceTypes().addAll(ec2InstanceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The length of time, in minutes, that a streaming session can run. After this point, Nimble Studio automatically
     * terminates the session.
     * </p>
     * 
     * @param maxSessionLengthInMinutes
     *        The length of time, in minutes, that a streaming session can run. After this point, Nimble Studio
     *        automatically terminates the session.
     */

    public void setMaxSessionLengthInMinutes(Integer maxSessionLengthInMinutes) {
        this.maxSessionLengthInMinutes = maxSessionLengthInMinutes;
    }

    /**
     * <p>
     * The length of time, in minutes, that a streaming session can run. After this point, Nimble Studio automatically
     * terminates the session.
     * </p>
     * 
     * @return The length of time, in minutes, that a streaming session can run. After this point, Nimble Studio
     *         automatically terminates the session.
     */

    public Integer getMaxSessionLengthInMinutes() {
        return this.maxSessionLengthInMinutes;
    }

    /**
     * <p>
     * The length of time, in minutes, that a streaming session can run. After this point, Nimble Studio automatically
     * terminates the session.
     * </p>
     * 
     * @param maxSessionLengthInMinutes
     *        The length of time, in minutes, that a streaming session can run. After this point, Nimble Studio
     *        automatically terminates the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamConfigurationCreate withMaxSessionLengthInMinutes(Integer maxSessionLengthInMinutes) {
        setMaxSessionLengthInMinutes(maxSessionLengthInMinutes);
        return this;
    }

    /**
     * <p>
     * The streaming images that users can select from when launching a streaming session with this launch profile.
     * </p>
     * 
     * @return The streaming images that users can select from when launching a streaming session with this launch
     *         profile.
     */

    public java.util.List<String> getStreamingImageIds() {
        return streamingImageIds;
    }

    /**
     * <p>
     * The streaming images that users can select from when launching a streaming session with this launch profile.
     * </p>
     * 
     * @param streamingImageIds
     *        The streaming images that users can select from when launching a streaming session with this launch
     *        profile.
     */

    public void setStreamingImageIds(java.util.Collection<String> streamingImageIds) {
        if (streamingImageIds == null) {
            this.streamingImageIds = null;
            return;
        }

        this.streamingImageIds = new java.util.ArrayList<String>(streamingImageIds);
    }

    /**
     * <p>
     * The streaming images that users can select from when launching a streaming session with this launch profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreamingImageIds(java.util.Collection)} or {@link #withStreamingImageIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param streamingImageIds
     *        The streaming images that users can select from when launching a streaming session with this launch
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamConfigurationCreate withStreamingImageIds(String... streamingImageIds) {
        if (this.streamingImageIds == null) {
            setStreamingImageIds(new java.util.ArrayList<String>(streamingImageIds.length));
        }
        for (String ele : streamingImageIds) {
            this.streamingImageIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The streaming images that users can select from when launching a streaming session with this launch profile.
     * </p>
     * 
     * @param streamingImageIds
     *        The streaming images that users can select from when launching a streaming session with this launch
     *        profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamConfigurationCreate withStreamingImageIds(java.util.Collection<String> streamingImageIds) {
        setStreamingImageIds(streamingImageIds);
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
        if (getClipboardMode() != null)
            sb.append("ClipboardMode: ").append(getClipboardMode()).append(",");
        if (getEc2InstanceTypes() != null)
            sb.append("Ec2InstanceTypes: ").append(getEc2InstanceTypes()).append(",");
        if (getMaxSessionLengthInMinutes() != null)
            sb.append("MaxSessionLengthInMinutes: ").append(getMaxSessionLengthInMinutes()).append(",");
        if (getStreamingImageIds() != null)
            sb.append("StreamingImageIds: ").append(getStreamingImageIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamConfigurationCreate == false)
            return false;
        StreamConfigurationCreate other = (StreamConfigurationCreate) obj;
        if (other.getClipboardMode() == null ^ this.getClipboardMode() == null)
            return false;
        if (other.getClipboardMode() != null && other.getClipboardMode().equals(this.getClipboardMode()) == false)
            return false;
        if (other.getEc2InstanceTypes() == null ^ this.getEc2InstanceTypes() == null)
            return false;
        if (other.getEc2InstanceTypes() != null && other.getEc2InstanceTypes().equals(this.getEc2InstanceTypes()) == false)
            return false;
        if (other.getMaxSessionLengthInMinutes() == null ^ this.getMaxSessionLengthInMinutes() == null)
            return false;
        if (other.getMaxSessionLengthInMinutes() != null && other.getMaxSessionLengthInMinutes().equals(this.getMaxSessionLengthInMinutes()) == false)
            return false;
        if (other.getStreamingImageIds() == null ^ this.getStreamingImageIds() == null)
            return false;
        if (other.getStreamingImageIds() != null && other.getStreamingImageIds().equals(this.getStreamingImageIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClipboardMode() == null) ? 0 : getClipboardMode().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceTypes() == null) ? 0 : getEc2InstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getMaxSessionLengthInMinutes() == null) ? 0 : getMaxSessionLengthInMinutes().hashCode());
        hashCode = prime * hashCode + ((getStreamingImageIds() == null) ? 0 : getStreamingImageIds().hashCode());
        return hashCode;
    }

    @Override
    public StreamConfigurationCreate clone() {
        try {
            return (StreamConfigurationCreate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StreamConfigurationCreateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
