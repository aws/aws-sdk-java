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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Complex data type that defines destination-configuration objects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An IVS channel to be used for broadcasting, for server-side composition. Either a <code>channel</code> or an
     * <code>s3</code> must be specified.
     * </p>
     */
    private ChannelDestinationConfiguration channel;
    /**
     * <p>
     * Name that can be specified to help identify the destination.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An S3 storage configuration to be used for recording video data. Either a <code>channel</code> or an
     * <code>s3</code> must be specified.
     * </p>
     */
    private S3DestinationConfiguration s3;

    /**
     * <p>
     * An IVS channel to be used for broadcasting, for server-side composition. Either a <code>channel</code> or an
     * <code>s3</code> must be specified.
     * </p>
     * 
     * @param channel
     *        An IVS channel to be used for broadcasting, for server-side composition. Either a <code>channel</code> or
     *        an <code>s3</code> must be specified.
     */

    public void setChannel(ChannelDestinationConfiguration channel) {
        this.channel = channel;
    }

    /**
     * <p>
     * An IVS channel to be used for broadcasting, for server-side composition. Either a <code>channel</code> or an
     * <code>s3</code> must be specified.
     * </p>
     * 
     * @return An IVS channel to be used for broadcasting, for server-side composition. Either a <code>channel</code> or
     *         an <code>s3</code> must be specified.
     */

    public ChannelDestinationConfiguration getChannel() {
        return this.channel;
    }

    /**
     * <p>
     * An IVS channel to be used for broadcasting, for server-side composition. Either a <code>channel</code> or an
     * <code>s3</code> must be specified.
     * </p>
     * 
     * @param channel
     *        An IVS channel to be used for broadcasting, for server-side composition. Either a <code>channel</code> or
     *        an <code>s3</code> must be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfiguration withChannel(ChannelDestinationConfiguration channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * Name that can be specified to help identify the destination.
     * </p>
     * 
     * @param name
     *        Name that can be specified to help identify the destination.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name that can be specified to help identify the destination.
     * </p>
     * 
     * @return Name that can be specified to help identify the destination.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name that can be specified to help identify the destination.
     * </p>
     * 
     * @param name
     *        Name that can be specified to help identify the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An S3 storage configuration to be used for recording video data. Either a <code>channel</code> or an
     * <code>s3</code> must be specified.
     * </p>
     * 
     * @param s3
     *        An S3 storage configuration to be used for recording video data. Either a <code>channel</code> or an
     *        <code>s3</code> must be specified.
     */

    public void setS3(S3DestinationConfiguration s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * An S3 storage configuration to be used for recording video data. Either a <code>channel</code> or an
     * <code>s3</code> must be specified.
     * </p>
     * 
     * @return An S3 storage configuration to be used for recording video data. Either a <code>channel</code> or an
     *         <code>s3</code> must be specified.
     */

    public S3DestinationConfiguration getS3() {
        return this.s3;
    }

    /**
     * <p>
     * An S3 storage configuration to be used for recording video data. Either a <code>channel</code> or an
     * <code>s3</code> must be specified.
     * </p>
     * 
     * @param s3
     *        An S3 storage configuration to be used for recording video data. Either a <code>channel</code> or an
     *        <code>s3</code> must be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfiguration withS3(S3DestinationConfiguration s3) {
        setS3(s3);
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
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getS3() != null)
            sb.append("S3: ").append(getS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationConfiguration == false)
            return false;
        DestinationConfiguration other = (DestinationConfiguration) obj;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        return hashCode;
    }

    @Override
    public DestinationConfiguration clone() {
        try {
            return (DestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.DestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
