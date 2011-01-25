/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#sendRawEmail(SendRawEmailRequest) SendRawEmail operation}.
 * <p>
 * Sends an email message, with header and content specified by the
 * client. The <code>SendRawEmail</code> action is useful for sending
 * multipart MIME emails, with attachments or inline content. The raw
 * text of the message must comply with Internet email standards;
 * otherwise, the message cannot be sent.
 * </p>
 * <p>
 * <b>IMPORTANT:</b>If you have not yet requested production access to
 * Amazon SES, then you will only be able to send email to and from
 * verified email addresses. For more information, go to the Amazon SES
 * Developer Guide.
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#sendRawEmail(SendRawEmailRequest)
 */
public class SendRawEmailRequest extends AmazonWebServiceRequest {

    /**
     * The sender's email address.
     */
    private String source;

    /**
     * A list of destinations for the message.
     */
    private java.util.List<String> destinations;

    /**
     * The raw text of the message. The client is responsible for ensuring
     * the following: <p> <ul> <li>Message must contain a header and a body,
     * separated by a blank line.</li> <li>All required header fields must be
     * present.</li> <li>Each part of a multipart MIME message must be
     * formatted properly.</li> <li>MIME content types must be among those
     * supported by Amazon SES. Refer to the <a
     * f="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     * SES Developer Guide</a> for more details.</li> <li>Content must be
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
     * f="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     * SES Developer Guide</a> for more details.</li> <li>Content must be
     * base64-encoded, if MIME requires it.</li> </ul>
     */
    public SendRawEmailRequest(RawMessage rawMessage) {
        this.rawMessage = rawMessage;
    }
    
    /**
     * The sender's email address.
     *
     * @return The sender's email address.
     */
    public String getSource() {
        return source;
    }
    
    /**
     * The sender's email address.
     *
     * @param source The sender's email address.
     */
    public void setSource(String source) {
        this.source = source;
    }
    
    /**
     * The sender's email address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param source The sender's email address.
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
            destinations = new java.util.ArrayList<String>();
        }
        return destinations;
    }
    
    /**
     * A list of destinations for the message.
     *
     * @param destinations A list of destinations for the message.
     */
    public void setDestinations(java.util.Collection<String> destinations) {
        java.util.List<String> destinationsCopy = new java.util.ArrayList<String>();
        if (destinations != null) {
            destinationsCopy.addAll(destinations);
        }
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
        java.util.List<String> destinationsCopy = new java.util.ArrayList<String>();
        if (destinations != null) {
            destinationsCopy.addAll(destinations);
        }
        this.destinations = destinationsCopy;

        return this;
    }
    
    /**
     * The raw text of the message. The client is responsible for ensuring
     * the following: <p> <ul> <li>Message must contain a header and a body,
     * separated by a blank line.</li> <li>All required header fields must be
     * present.</li> <li>Each part of a multipart MIME message must be
     * formatted properly.</li> <li>MIME content types must be among those
     * supported by Amazon SES. Refer to the <a
     * f="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     * SES Developer Guide</a> for more details.</li> <li>Content must be
     * base64-encoded, if MIME requires it.</li> </ul>
     *
     * @return The raw text of the message. The client is responsible for ensuring
     *         the following: <p> <ul> <li>Message must contain a header and a body,
     *         separated by a blank line.</li> <li>All required header fields must be
     *         present.</li> <li>Each part of a multipart MIME message must be
     *         formatted properly.</li> <li>MIME content types must be among those
     *         supported by Amazon SES. Refer to the <a
     *         f="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     *         SES Developer Guide</a> for more details.</li> <li>Content must be
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
     * f="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     * SES Developer Guide</a> for more details.</li> <li>Content must be
     * base64-encoded, if MIME requires it.</li> </ul>
     *
     * @param rawMessage The raw text of the message. The client is responsible for ensuring
     *         the following: <p> <ul> <li>Message must contain a header and a body,
     *         separated by a blank line.</li> <li>All required header fields must be
     *         present.</li> <li>Each part of a multipart MIME message must be
     *         formatted properly.</li> <li>MIME content types must be among those
     *         supported by Amazon SES. Refer to the <a
     *         f="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     *         SES Developer Guide</a> for more details.</li> <li>Content must be
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
     * f="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     * SES Developer Guide</a> for more details.</li> <li>Content must be
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
     *         f="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide">Amazon
     *         SES Developer Guide</a> for more details.</li> <li>Content must be
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
        sb.append("Source: " + source + ", ");
        sb.append("Destinations: " + destinations + ", ");
        sb.append("RawMessage: " + rawMessage + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    