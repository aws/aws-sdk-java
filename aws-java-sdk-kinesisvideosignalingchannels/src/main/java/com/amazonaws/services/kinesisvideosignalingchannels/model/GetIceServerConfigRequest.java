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
package com.amazonaws.services.kinesisvideosignalingchannels.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-signaling-2019-12-04/GetIceServerConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIceServerConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the signaling channel to be used for the peer-to-peer connection between configured peers.
     * </p>
     */
    private String channelARN;
    /**
     * <p>
     * Unique identifier for the viewer. Must be unique within the signaling channel.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * Specifies the desired service. Currently, <code>TURN</code> is the only valid value.
     * </p>
     */
    private String service;
    /**
     * <p>
     * An optional user ID to be associated with the credentials.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The ARN of the signaling channel to be used for the peer-to-peer connection between configured peers.
     * </p>
     * 
     * @param channelARN
     *        The ARN of the signaling channel to be used for the peer-to-peer connection between configured peers.
     */

    public void setChannelARN(String channelARN) {
        this.channelARN = channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel to be used for the peer-to-peer connection between configured peers.
     * </p>
     * 
     * @return The ARN of the signaling channel to be used for the peer-to-peer connection between configured peers.
     */

    public String getChannelARN() {
        return this.channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel to be used for the peer-to-peer connection between configured peers.
     * </p>
     * 
     * @param channelARN
     *        The ARN of the signaling channel to be used for the peer-to-peer connection between configured peers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIceServerConfigRequest withChannelARN(String channelARN) {
        setChannelARN(channelARN);
        return this;
    }

    /**
     * <p>
     * Unique identifier for the viewer. Must be unique within the signaling channel.
     * </p>
     * 
     * @param clientId
     *        Unique identifier for the viewer. Must be unique within the signaling channel.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * Unique identifier for the viewer. Must be unique within the signaling channel.
     * </p>
     * 
     * @return Unique identifier for the viewer. Must be unique within the signaling channel.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * Unique identifier for the viewer. Must be unique within the signaling channel.
     * </p>
     * 
     * @param clientId
     *        Unique identifier for the viewer. Must be unique within the signaling channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIceServerConfigRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * Specifies the desired service. Currently, <code>TURN</code> is the only valid value.
     * </p>
     * 
     * @param service
     *        Specifies the desired service. Currently, <code>TURN</code> is the only valid value.
     * @see Service
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * Specifies the desired service. Currently, <code>TURN</code> is the only valid value.
     * </p>
     * 
     * @return Specifies the desired service. Currently, <code>TURN</code> is the only valid value.
     * @see Service
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * Specifies the desired service. Currently, <code>TURN</code> is the only valid value.
     * </p>
     * 
     * @param service
     *        Specifies the desired service. Currently, <code>TURN</code> is the only valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Service
     */

    public GetIceServerConfigRequest withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * Specifies the desired service. Currently, <code>TURN</code> is the only valid value.
     * </p>
     * 
     * @param service
     *        Specifies the desired service. Currently, <code>TURN</code> is the only valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Service
     */

    public GetIceServerConfigRequest withService(Service service) {
        this.service = service.toString();
        return this;
    }

    /**
     * <p>
     * An optional user ID to be associated with the credentials.
     * </p>
     * 
     * @param username
     *        An optional user ID to be associated with the credentials.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * An optional user ID to be associated with the credentials.
     * </p>
     * 
     * @return An optional user ID to be associated with the credentials.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * An optional user ID to be associated with the credentials.
     * </p>
     * 
     * @param username
     *        An optional user ID to be associated with the credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIceServerConfigRequest withUsername(String username) {
        setUsername(username);
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
        if (getChannelARN() != null)
            sb.append("ChannelARN: ").append(getChannelARN()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIceServerConfigRequest == false)
            return false;
        GetIceServerConfigRequest other = (GetIceServerConfigRequest) obj;
        if (other.getChannelARN() == null ^ this.getChannelARN() == null)
            return false;
        if (other.getChannelARN() != null && other.getChannelARN().equals(this.getChannelARN()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelARN() == null) ? 0 : getChannelARN().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public GetIceServerConfigRequest clone() {
        return (GetIceServerConfigRequest) super.clone();
    }

}
