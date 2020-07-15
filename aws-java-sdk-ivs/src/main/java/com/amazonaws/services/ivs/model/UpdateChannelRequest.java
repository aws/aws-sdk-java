/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/UpdateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN of the channel to be updated.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Channel name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Channel latency mode. Default: <code>LOW</code>.
     * </p>
     */
    private String latencyMode;
    /**
     * <p>
     * Channel type, which determines the allowable resolution and bitrate. <code>STANDARD</code>: The stream is
     * transcoded; resolution (width, in landscape orientation) can be up to 1080p or the input source resolution,
     * whichever is lower; and bitrate can be up to 8.5 Mbps. <code>BASIC</code>: The stream is transfixed; resolution
     * can be up to 480p; and bitrate can be up to 1.5 Mbps. Default <code>STANDARD</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * ARN of the channel to be updated.
     * </p>
     * 
     * @param arn
     *        ARN of the channel to be updated.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * ARN of the channel to be updated.
     * </p>
     * 
     * @return ARN of the channel to be updated.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * ARN of the channel to be updated.
     * </p>
     * 
     * @param arn
     *        ARN of the channel to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Channel name.
     * </p>
     * 
     * @param name
     *        Channel name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Channel name.
     * </p>
     * 
     * @return Channel name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Channel name.
     * </p>
     * 
     * @param name
     *        Channel name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Channel latency mode. Default: <code>LOW</code>.
     * </p>
     * 
     * @param latencyMode
     *        Channel latency mode. Default: <code>LOW</code>.
     * @see ChannelLatencyMode
     */

    public void setLatencyMode(String latencyMode) {
        this.latencyMode = latencyMode;
    }

    /**
     * <p>
     * Channel latency mode. Default: <code>LOW</code>.
     * </p>
     * 
     * @return Channel latency mode. Default: <code>LOW</code>.
     * @see ChannelLatencyMode
     */

    public String getLatencyMode() {
        return this.latencyMode;
    }

    /**
     * <p>
     * Channel latency mode. Default: <code>LOW</code>.
     * </p>
     * 
     * @param latencyMode
     *        Channel latency mode. Default: <code>LOW</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelLatencyMode
     */

    public UpdateChannelRequest withLatencyMode(String latencyMode) {
        setLatencyMode(latencyMode);
        return this;
    }

    /**
     * <p>
     * Channel latency mode. Default: <code>LOW</code>.
     * </p>
     * 
     * @param latencyMode
     *        Channel latency mode. Default: <code>LOW</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelLatencyMode
     */

    public UpdateChannelRequest withLatencyMode(ChannelLatencyMode latencyMode) {
        this.latencyMode = latencyMode.toString();
        return this;
    }

    /**
     * <p>
     * Channel type, which determines the allowable resolution and bitrate. <code>STANDARD</code>: The stream is
     * transcoded; resolution (width, in landscape orientation) can be up to 1080p or the input source resolution,
     * whichever is lower; and bitrate can be up to 8.5 Mbps. <code>BASIC</code>: The stream is transfixed; resolution
     * can be up to 480p; and bitrate can be up to 1.5 Mbps. Default <code>STANDARD</code>.
     * </p>
     * 
     * @param type
     *        Channel type, which determines the allowable resolution and bitrate. <code>STANDARD</code>: The stream is
     *        transcoded; resolution (width, in landscape orientation) can be up to 1080p or the input source
     *        resolution, whichever is lower; and bitrate can be up to 8.5 Mbps. <code>BASIC</code>: The stream is
     *        transfixed; resolution can be up to 480p; and bitrate can be up to 1.5 Mbps. Default <code>STANDARD</code>
     *        .
     * @see ChannelType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Channel type, which determines the allowable resolution and bitrate. <code>STANDARD</code>: The stream is
     * transcoded; resolution (width, in landscape orientation) can be up to 1080p or the input source resolution,
     * whichever is lower; and bitrate can be up to 8.5 Mbps. <code>BASIC</code>: The stream is transfixed; resolution
     * can be up to 480p; and bitrate can be up to 1.5 Mbps. Default <code>STANDARD</code>.
     * </p>
     * 
     * @return Channel type, which determines the allowable resolution and bitrate. <code>STANDARD</code>: The stream is
     *         transcoded; resolution (width, in landscape orientation) can be up to 1080p or the input source
     *         resolution, whichever is lower; and bitrate can be up to 8.5 Mbps. <code>BASIC</code>: The stream is
     *         transfixed; resolution can be up to 480p; and bitrate can be up to 1.5 Mbps. Default
     *         <code>STANDARD</code>.
     * @see ChannelType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Channel type, which determines the allowable resolution and bitrate. <code>STANDARD</code>: The stream is
     * transcoded; resolution (width, in landscape orientation) can be up to 1080p or the input source resolution,
     * whichever is lower; and bitrate can be up to 8.5 Mbps. <code>BASIC</code>: The stream is transfixed; resolution
     * can be up to 480p; and bitrate can be up to 1.5 Mbps. Default <code>STANDARD</code>.
     * </p>
     * 
     * @param type
     *        Channel type, which determines the allowable resolution and bitrate. <code>STANDARD</code>: The stream is
     *        transcoded; resolution (width, in landscape orientation) can be up to 1080p or the input source
     *        resolution, whichever is lower; and bitrate can be up to 8.5 Mbps. <code>BASIC</code>: The stream is
     *        transfixed; resolution can be up to 480p; and bitrate can be up to 1.5 Mbps. Default <code>STANDARD</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public UpdateChannelRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Channel type, which determines the allowable resolution and bitrate. <code>STANDARD</code>: The stream is
     * transcoded; resolution (width, in landscape orientation) can be up to 1080p or the input source resolution,
     * whichever is lower; and bitrate can be up to 8.5 Mbps. <code>BASIC</code>: The stream is transfixed; resolution
     * can be up to 480p; and bitrate can be up to 1.5 Mbps. Default <code>STANDARD</code>.
     * </p>
     * 
     * @param type
     *        Channel type, which determines the allowable resolution and bitrate. <code>STANDARD</code>: The stream is
     *        transcoded; resolution (width, in landscape orientation) can be up to 1080p or the input source
     *        resolution, whichever is lower; and bitrate can be up to 8.5 Mbps. <code>BASIC</code>: The stream is
     *        transfixed; resolution can be up to 480p; and bitrate can be up to 1.5 Mbps. Default <code>STANDARD</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public UpdateChannelRequest withType(ChannelType type) {
        this.type = type.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLatencyMode() != null)
            sb.append("LatencyMode: ").append(getLatencyMode()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
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
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLatencyMode() == null ^ this.getLatencyMode() == null)
            return false;
        if (other.getLatencyMode() != null && other.getLatencyMode().equals(this.getLatencyMode()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLatencyMode() == null) ? 0 : getLatencyMode().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChannelRequest clone() {
        return (UpdateChannelRequest) super.clone();
    }

}
