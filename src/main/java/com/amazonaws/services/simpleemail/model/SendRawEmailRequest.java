/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#sendRawEmail(SendRawEmailRequest) SendRawEmail operation}.
 * <p>
 * Sends an email message, with header and content specified by the client. The <code>SendRawEmail</code> action is useful for sending multipart MIME
 * emails. The raw text of the message must comply with Internet email standards; otherwise, the message cannot be sent.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>If you have not yet requested production access to Amazon SES, then you will only be able to send email to and from verified email
 * addresses and domains. For more information, go to the Amazon SES Developer Guide.
 * </p>
 * <p>
 * The total size of the message cannot exceed 10 MB. This includes any attachments that are part of the message.
 * </p>
 * <p>
 * Amazon SES has a limit on the total number of recipients per message: The combined number of To:, CC: and BCC: email addresses cannot exceed 50. If
 * you need to send an email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call Amazon SES
 * repeatedly to send the message to each group.
 * </p>
 * <p>
 * For every message that you send, the total number of recipients (To:, CC: and BCC:) is counted against your <i>sending quota</i> - the maximum number
 * of emails you can send in a 24-hour period. For information about your sending quota, go to the "Managing Your Sending Activity" section of the<a
 * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide"> Amazon SES Developer Guide </a> .
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#sendRawEmail(SendRawEmailRequest)
 */
public class SendRawEmailRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identity's email address. <note>If you specify the
     * <code>Source</code> parameter, then bounce notifications and
     * complaints will be sent to this email address. This takes precedence
     * over any <i>Return-Path</i> header that you might include in the raw
     * text of the message. </note>
     */
    private String source;

    /**
     * A list of destinations for the message.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> destinations;

    /**
     * The raw text of the message. The client is responsible for ensuring
     * the following: <p> <ul> <li>Message must contain a header and a body,
     * separated by a blank line.</li> <li>All required header fields must be
     * present.</li> <li>Each part of a multipart MIME message must be
     * formatted properly.</li> <li>MIME content types must be among those
     * supported by Amazon SES. Refer to the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     * SES Developer Guide</a> for more details. </li> <li>Content must be
     * base64-encoded, if MIME requires it.</li> </ul>
     */
    private RawMessage rawMessage;

    /**
     * Default constructor for a new SendRawEmailRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SendRawEmailRequest() {}
    
    /**
     * Constructs a new SendRawEmailRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param rawMessage The raw text of the message. The client is
     * responsible for ensuring the following: <p> <ul> <li>Message must
     * contain a header and a body, separated by a blank line.</li> <li>All
     * required header fields must be present.</li> <li>Each part of a
     * multipart MIME message must be formatted properly.</li> <li>MIME
     * content types must be among those supported by Amazon SES. Refer to
     * the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     * SES Developer Guide</a> for more details. </li> <li>Content must be
     * base64-encoded, if MIME requires it.</li> </ul>
     */
    public SendRawEmailRequest(RawMessage rawMessage) {
        setRawMessage(rawMessage);
    }

    /**
     * The identity's email address. <note>If you specify the
     * <code>Source</code> parameter, then bounce notifications and
     * complaints will be sent to this email address. This takes precedence
     * over any <i>Return-Path</i> header that you might include in the raw
     * text of the message. </note>
     *
     * @return The identity's email address. <note>If you specify the
     *         <code>Source</code> parameter, then bounce notifications and
     *         complaints will be sent to this email address. This takes precedence
     *         over any <i>Return-Path</i> header that you might include in the raw
     *         text of the message. </note>
     */
    public String getSource() {
        return source;
    }
    
    /**
     * The identity's email address. <note>If you specify the
     * <code>Source</code> parameter, then bounce notifications and
     * complaints will be sent to this email address. This takes precedence
     * over any <i>Return-Path</i> header that you might include in the raw
     * text of the message. </note>
     *
     * @param source The identity's email address. <note>If you specify the
     *         <code>Source</code> parameter, then bounce notifications and
     *         complaints will be sent to this email address. This takes precedence
     *         over any <i>Return-Path</i> header that you might include in the raw
     *         text of the message. </note>
     */
    public void setSource(String source) {
        this.source = source;
    }
    
    /**
     * The identity's email address. <note>If you specify the
     * <code>Source</code> parameter, then bounce notifications and
     * complaints will be sent to this email address. This takes precedence
     * over any <i>Return-Path</i> header that you might include in the raw
     * text of the message. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param source The identity's email address. <note>If you specify the
     *         <code>Source</code> parameter, then bounce notifications and
     *         complaints will be sent to this email address. This takes precedence
     *         over any <i>Return-Path</i> header that you might include in the raw
     *         text of the message. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendRawEmailRequest withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * A list of destinations for the message.
     *
     * @return A list of destinations for the message.
     */
    public java.util.List<String> getDestinations() {
        if (destinations == null) {
              destinations = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              destinations.setAutoConstruct(true);
        }
        return destinations;
    }
    
    /**
     * A list of destinations for the message.
     *
     * @param destinations A list of destinations for the message.
     */
    public void setDestinations(java.util.Collection<String> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> destinationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(destinations.size());
        destinationsCopy.addAll(destinations);
        this.destinations = destinationsCopy;
    }
    
    /**
     * A list of destinations for the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinations A list of destinations for the message.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendRawEmailRequest withDestinations(String... destinations) {
        if (getDestinations() == null) setDestinations(new java.util.ArrayList<String>(destinations.length));
        for (String value : destinations) {
            getDestinations().add(value);
        }
        return this;
    }
    
    /**
     * A list of destinations for the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinations A list of destinations for the message.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendRawEmailRequest withDestinations(java.util.Collection<String> destinations) {
        if (destinations == null) {
            this.destinations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> destinationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(destinations.size());
            destinationsCopy.addAll(destinations);
            this.destinations = destinationsCopy;
        }

        return this;
    }

    /**
     * The raw text of the message. The client is responsible for ensuring
     * the following: <p> <ul> <li>Message must contain a header and a body,
     * separated by a blank line.</li> <li>All required header fields must be
     * present.</li> <li>Each part of a multipart MIME message must be
     * formatted properly.</li> <li>MIME content types must be among those
     * supported by Amazon SES. Refer to the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     * SES Developer Guide</a> for more details. </li> <li>Content must be
     * base64-encoded, if MIME requires it.</li> </ul>
     *
     * @return The raw text of the message. The client is responsible for ensuring
     *         the following: <p> <ul> <li>Message must contain a header and a body,
     *         separated by a blank line.</li> <li>All required header fields must be
     *         present.</li> <li>Each part of a multipart MIME message must be
     *         formatted properly.</li> <li>MIME content types must be among those
     *         supported by Amazon SES. Refer to the <a
     *         href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     *         SES Developer Guide</a> for more details. </li> <li>Content must be
     *         base64-encoded, if MIME requires it.</li> </ul>
     */
    public RawMessage getRawMessage() {
        return rawMessage;
    }
    
    /**
     * The raw text of the message. The client is responsible for ensuring
     * the following: <p> <ul> <li>Message must contain a header and a body,
     * separated by a blank line.</li> <li>All required header fields must be
     * present.</li> <li>Each part of a multipart MIME message must be
     * formatted properly.</li> <li>MIME content types must be among those
     * supported by Amazon SES. Refer to the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     * SES Developer Guide</a> for more details. </li> <li>Content must be
     * base64-encoded, if MIME requires it.</li> </ul>
     *
     * @param rawMessage The raw text of the message. The client is responsible for ensuring
     *         the following: <p> <ul> <li>Message must contain a header and a body,
     *         separated by a blank line.</li> <li>All required header fields must be
     *         present.</li> <li>Each part of a multipart MIME message must be
     *         formatted properly.</li> <li>MIME content types must be among those
     *         supported by Amazon SES. Refer to the <a
     *         href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     *         SES Developer Guide</a> for more details. </li> <li>Content must be
     *         base64-encoded, if MIME requires it.</li> </ul>
     */
    public void setRawMessage(RawMessage rawMessage) {
        this.rawMessage = rawMessage;
    }
    
    /**
     * The raw text of the message. The client is responsible for ensuring
     * the following: <p> <ul> <li>Message must contain a header and a body,
     * separated by a blank line.</li> <li>All required header fields must be
     * present.</li> <li>Each part of a multipart MIME message must be
     * formatted properly.</li> <li>MIME content types must be among those
     * supported by Amazon SES. Refer to the <a
     * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     * SES Developer Guide</a> for more details. </li> <li>Content must be
     * base64-encoded, if MIME requires it.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rawMessage The raw text of the message. The client is responsible for ensuring
     *         the following: <p> <ul> <li>Message must contain a header and a body,
     *         separated by a blank line.</li> <li>All required header fields must be
     *         present.</li> <li>Each part of a multipart MIME message must be
     *         formatted properly.</li> <li>MIME content types must be among those
     *         supported by Amazon SES. Refer to the <a
     *         href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     *         SES Developer Guide</a> for more details. </li> <li>Content must be
     *         base64-encoded, if MIME requires it.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SendRawEmailRequest withRawMessage(RawMessage rawMessage) {
        this.rawMessage = rawMessage;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSource() != null) sb.append("Source: " + getSource() + ",");
        if (getDestinations() != null) sb.append("Destinations: " + getDestinations() + ",");
        if (getRawMessage() != null) sb.append("RawMessage: " + getRawMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode()); 
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode()); 
        hashCode = prime * hashCode + ((getRawMessage() == null) ? 0 : getRawMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SendRawEmailRequest == false) return false;
        SendRawEmailRequest other = (SendRawEmailRequest)obj;
        
        if (other.getSource() == null ^ this.getSource() == null) return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false) return false; 
        if (other.getDestinations() == null ^ this.getDestinations() == null) return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false) return false; 
        if (other.getRawMessage() == null ^ this.getRawMessage() == null) return false;
        if (other.getRawMessage() != null && other.getRawMessage().equals(this.getRawMessage()) == false) return false; 
        return true;
    }
    
}
    