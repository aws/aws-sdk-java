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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-signaling-2019-12-04/SendAlexaOfferToMaster"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendAlexaOfferToMasterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the signaling channel by which Alexa and the master peer communicate.
     * </p>
     */
    private String channelARN;
    /**
     * <p>
     * The unique identifier for the sender client.
     * </p>
     */
    private String senderClientId;
    /**
     * <p>
     * The base64-encoded SDP offer content.
     * </p>
     */
    private String messagePayload;

    /**
     * <p>
     * The ARN of the signaling channel by which Alexa and the master peer communicate.
     * </p>
     * 
     * @param channelARN
     *        The ARN of the signaling channel by which Alexa and the master peer communicate.
     */

    public void setChannelARN(String channelARN) {
        this.channelARN = channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel by which Alexa and the master peer communicate.
     * </p>
     * 
     * @return The ARN of the signaling channel by which Alexa and the master peer communicate.
     */

    public String getChannelARN() {
        return this.channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel by which Alexa and the master peer communicate.
     * </p>
     * 
     * @param channelARN
     *        The ARN of the signaling channel by which Alexa and the master peer communicate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendAlexaOfferToMasterRequest withChannelARN(String channelARN) {
        setChannelARN(channelARN);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the sender client.
     * </p>
     * 
     * @param senderClientId
     *        The unique identifier for the sender client.
     */

    public void setSenderClientId(String senderClientId) {
        this.senderClientId = senderClientId;
    }

    /**
     * <p>
     * The unique identifier for the sender client.
     * </p>
     * 
     * @return The unique identifier for the sender client.
     */

    public String getSenderClientId() {
        return this.senderClientId;
    }

    /**
     * <p>
     * The unique identifier for the sender client.
     * </p>
     * 
     * @param senderClientId
     *        The unique identifier for the sender client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendAlexaOfferToMasterRequest withSenderClientId(String senderClientId) {
        setSenderClientId(senderClientId);
        return this;
    }

    /**
     * <p>
     * The base64-encoded SDP offer content.
     * </p>
     * 
     * @param messagePayload
     *        The base64-encoded SDP offer content.
     */

    public void setMessagePayload(String messagePayload) {
        this.messagePayload = messagePayload;
    }

    /**
     * <p>
     * The base64-encoded SDP offer content.
     * </p>
     * 
     * @return The base64-encoded SDP offer content.
     */

    public String getMessagePayload() {
        return this.messagePayload;
    }

    /**
     * <p>
     * The base64-encoded SDP offer content.
     * </p>
     * 
     * @param messagePayload
     *        The base64-encoded SDP offer content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendAlexaOfferToMasterRequest withMessagePayload(String messagePayload) {
        setMessagePayload(messagePayload);
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
        if (getSenderClientId() != null)
            sb.append("SenderClientId: ").append(getSenderClientId()).append(",");
        if (getMessagePayload() != null)
            sb.append("MessagePayload: ").append(getMessagePayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendAlexaOfferToMasterRequest == false)
            return false;
        SendAlexaOfferToMasterRequest other = (SendAlexaOfferToMasterRequest) obj;
        if (other.getChannelARN() == null ^ this.getChannelARN() == null)
            return false;
        if (other.getChannelARN() != null && other.getChannelARN().equals(this.getChannelARN()) == false)
            return false;
        if (other.getSenderClientId() == null ^ this.getSenderClientId() == null)
            return false;
        if (other.getSenderClientId() != null && other.getSenderClientId().equals(this.getSenderClientId()) == false)
            return false;
        if (other.getMessagePayload() == null ^ this.getMessagePayload() == null)
            return false;
        if (other.getMessagePayload() != null && other.getMessagePayload().equals(this.getMessagePayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelARN() == null) ? 0 : getChannelARN().hashCode());
        hashCode = prime * hashCode + ((getSenderClientId() == null) ? 0 : getSenderClientId().hashCode());
        hashCode = prime * hashCode + ((getMessagePayload() == null) ? 0 : getMessagePayload().hashCode());
        return hashCode;
    }

    @Override
    public SendAlexaOfferToMasterRequest clone() {
        return (SendAlexaOfferToMasterRequest) super.clone();
    }

}
