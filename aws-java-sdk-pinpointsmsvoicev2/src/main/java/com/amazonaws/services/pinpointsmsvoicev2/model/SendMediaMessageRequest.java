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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SendMediaMessage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendMediaMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The destination phone number in E.164 format.
     * </p>
     */
    private String destinationPhoneNumber;
    /**
     * <p>
     * The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId, PhoneNumberArn,
     * SenderId, SenderIdArn, PoolId, or PoolArn.
     * </p>
     */
    private String originationIdentity;
    /**
     * <p>
     * The text body of the message.
     * </p>
     */
    private String messageBody;
    /**
     * <p>
     * An array of URLs to each media file to send.
     * </p>
     * <p>
     * The media files have to be stored in a publicly available S3 bucket. Supported media file formats are listed in
     * <a href="https://docs.aws.amazon.com/sms-voice/latest/userguide/mms-limitations-character.html">MMS file types,
     * size and character limits</a>. For more information on creating an S3 bucket and managing objects, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-bucket-overview.html">Creating a bucket</a>
     * and <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/upload-objects.html">Uploading objects</a> in
     * the S3 user guide.
     * </p>
     */
    private java.util.List<String> mediaUrls;
    /**
     * <p>
     * The name of the configuration set to use. This can be either the ConfigurationSetName or ConfigurationSetArn.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * The maximum amount that you want to spend, in US dollars, per each MMS message.
     * </p>
     */
    private String maxPrice;
    /**
     * <p>
     * How long the text message is valid for. By default this is 72 hours.
     * </p>
     */
    private Integer timeToLive;
    /**
     * <p>
     * You can specify custom data in this field. If you do, that data is logged to the event destination.
     * </p>
     */
    private java.util.Map<String, String> context;
    /**
     * <p>
     * When set to true, the message is checked and validated, but isn't sent to the end recipient.
     * </p>
     */
    private Boolean dryRun;
    /**
     * <p>
     * The unique identifier of the protect configuration to use.
     * </p>
     */
    private String protectConfigurationId;

    /**
     * <p>
     * The destination phone number in E.164 format.
     * </p>
     * 
     * @param destinationPhoneNumber
     *        The destination phone number in E.164 format.
     */

    public void setDestinationPhoneNumber(String destinationPhoneNumber) {
        this.destinationPhoneNumber = destinationPhoneNumber;
    }

    /**
     * <p>
     * The destination phone number in E.164 format.
     * </p>
     * 
     * @return The destination phone number in E.164 format.
     */

    public String getDestinationPhoneNumber() {
        return this.destinationPhoneNumber;
    }

    /**
     * <p>
     * The destination phone number in E.164 format.
     * </p>
     * 
     * @param destinationPhoneNumber
     *        The destination phone number in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMediaMessageRequest withDestinationPhoneNumber(String destinationPhoneNumber) {
        setDestinationPhoneNumber(destinationPhoneNumber);
        return this;
    }

    /**
     * <p>
     * The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId, PhoneNumberArn,
     * SenderId, SenderIdArn, PoolId, or PoolArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId,
     *        PhoneNumberArn, SenderId, SenderIdArn, PoolId, or PoolArn.
     */

    public void setOriginationIdentity(String originationIdentity) {
        this.originationIdentity = originationIdentity;
    }

    /**
     * <p>
     * The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId, PhoneNumberArn,
     * SenderId, SenderIdArn, PoolId, or PoolArn.
     * </p>
     * 
     * @return The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId,
     *         PhoneNumberArn, SenderId, SenderIdArn, PoolId, or PoolArn.
     */

    public String getOriginationIdentity() {
        return this.originationIdentity;
    }

    /**
     * <p>
     * The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId, PhoneNumberArn,
     * SenderId, SenderIdArn, PoolId, or PoolArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId,
     *        PhoneNumberArn, SenderId, SenderIdArn, PoolId, or PoolArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMediaMessageRequest withOriginationIdentity(String originationIdentity) {
        setOriginationIdentity(originationIdentity);
        return this;
    }

    /**
     * <p>
     * The text body of the message.
     * </p>
     * 
     * @param messageBody
     *        The text body of the message.
     */

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    /**
     * <p>
     * The text body of the message.
     * </p>
     * 
     * @return The text body of the message.
     */

    public String getMessageBody() {
        return this.messageBody;
    }

    /**
     * <p>
     * The text body of the message.
     * </p>
     * 
     * @param messageBody
     *        The text body of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMediaMessageRequest withMessageBody(String messageBody) {
        setMessageBody(messageBody);
        return this;
    }

    /**
     * <p>
     * An array of URLs to each media file to send.
     * </p>
     * <p>
     * The media files have to be stored in a publicly available S3 bucket. Supported media file formats are listed in
     * <a href="https://docs.aws.amazon.com/sms-voice/latest/userguide/mms-limitations-character.html">MMS file types,
     * size and character limits</a>. For more information on creating an S3 bucket and managing objects, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-bucket-overview.html">Creating a bucket</a>
     * and <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/upload-objects.html">Uploading objects</a> in
     * the S3 user guide.
     * </p>
     * 
     * @return An array of URLs to each media file to send. </p>
     *         <p>
     *         The media files have to be stored in a publicly available S3 bucket. Supported media file formats are
     *         listed in <a
     *         href="https://docs.aws.amazon.com/sms-voice/latest/userguide/mms-limitations-character.html">MMS file
     *         types, size and character limits</a>. For more information on creating an S3 bucket and managing objects,
     *         see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-bucket-overview.html">Creating
     *         a bucket</a> and <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/upload-objects.html">Uploading objects</a> in
     *         the S3 user guide.
     */

    public java.util.List<String> getMediaUrls() {
        return mediaUrls;
    }

    /**
     * <p>
     * An array of URLs to each media file to send.
     * </p>
     * <p>
     * The media files have to be stored in a publicly available S3 bucket. Supported media file formats are listed in
     * <a href="https://docs.aws.amazon.com/sms-voice/latest/userguide/mms-limitations-character.html">MMS file types,
     * size and character limits</a>. For more information on creating an S3 bucket and managing objects, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-bucket-overview.html">Creating a bucket</a>
     * and <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/upload-objects.html">Uploading objects</a> in
     * the S3 user guide.
     * </p>
     * 
     * @param mediaUrls
     *        An array of URLs to each media file to send. </p>
     *        <p>
     *        The media files have to be stored in a publicly available S3 bucket. Supported media file formats are
     *        listed in <a
     *        href="https://docs.aws.amazon.com/sms-voice/latest/userguide/mms-limitations-character.html">MMS file
     *        types, size and character limits</a>. For more information on creating an S3 bucket and managing objects,
     *        see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-bucket-overview.html">Creating a
     *        bucket</a> and <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/upload-objects.html">Uploading objects</a> in
     *        the S3 user guide.
     */

    public void setMediaUrls(java.util.Collection<String> mediaUrls) {
        if (mediaUrls == null) {
            this.mediaUrls = null;
            return;
        }

        this.mediaUrls = new java.util.ArrayList<String>(mediaUrls);
    }

    /**
     * <p>
     * An array of URLs to each media file to send.
     * </p>
     * <p>
     * The media files have to be stored in a publicly available S3 bucket. Supported media file formats are listed in
     * <a href="https://docs.aws.amazon.com/sms-voice/latest/userguide/mms-limitations-character.html">MMS file types,
     * size and character limits</a>. For more information on creating an S3 bucket and managing objects, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-bucket-overview.html">Creating a bucket</a>
     * and <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/upload-objects.html">Uploading objects</a> in
     * the S3 user guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMediaUrls(java.util.Collection)} or {@link #withMediaUrls(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mediaUrls
     *        An array of URLs to each media file to send. </p>
     *        <p>
     *        The media files have to be stored in a publicly available S3 bucket. Supported media file formats are
     *        listed in <a
     *        href="https://docs.aws.amazon.com/sms-voice/latest/userguide/mms-limitations-character.html">MMS file
     *        types, size and character limits</a>. For more information on creating an S3 bucket and managing objects,
     *        see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-bucket-overview.html">Creating a
     *        bucket</a> and <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/upload-objects.html">Uploading objects</a> in
     *        the S3 user guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMediaMessageRequest withMediaUrls(String... mediaUrls) {
        if (this.mediaUrls == null) {
            setMediaUrls(new java.util.ArrayList<String>(mediaUrls.length));
        }
        for (String ele : mediaUrls) {
            this.mediaUrls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of URLs to each media file to send.
     * </p>
     * <p>
     * The media files have to be stored in a publicly available S3 bucket. Supported media file formats are listed in
     * <a href="https://docs.aws.amazon.com/sms-voice/latest/userguide/mms-limitations-character.html">MMS file types,
     * size and character limits</a>. For more information on creating an S3 bucket and managing objects, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-bucket-overview.html">Creating a bucket</a>
     * and <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/upload-objects.html">Uploading objects</a> in
     * the S3 user guide.
     * </p>
     * 
     * @param mediaUrls
     *        An array of URLs to each media file to send. </p>
     *        <p>
     *        The media files have to be stored in a publicly available S3 bucket. Supported media file formats are
     *        listed in <a
     *        href="https://docs.aws.amazon.com/sms-voice/latest/userguide/mms-limitations-character.html">MMS file
     *        types, size and character limits</a>. For more information on creating an S3 bucket and managing objects,
     *        see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/create-bucket-overview.html">Creating a
     *        bucket</a> and <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/upload-objects.html">Uploading objects</a> in
     *        the S3 user guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMediaMessageRequest withMediaUrls(java.util.Collection<String> mediaUrls) {
        setMediaUrls(mediaUrls);
        return this;
    }

    /**
     * <p>
     * The name of the configuration set to use. This can be either the ConfigurationSetName or ConfigurationSetArn.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set to use. This can be either the ConfigurationSetName or
     *        ConfigurationSetArn.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use. This can be either the ConfigurationSetName or ConfigurationSetArn.
     * </p>
     * 
     * @return The name of the configuration set to use. This can be either the ConfigurationSetName or
     *         ConfigurationSetArn.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to use. This can be either the ConfigurationSetName or ConfigurationSetArn.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set to use. This can be either the ConfigurationSetName or
     *        ConfigurationSetArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMediaMessageRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * The maximum amount that you want to spend, in US dollars, per each MMS message.
     * </p>
     * 
     * @param maxPrice
     *        The maximum amount that you want to spend, in US dollars, per each MMS message.
     */

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    /**
     * <p>
     * The maximum amount that you want to spend, in US dollars, per each MMS message.
     * </p>
     * 
     * @return The maximum amount that you want to spend, in US dollars, per each MMS message.
     */

    public String getMaxPrice() {
        return this.maxPrice;
    }

    /**
     * <p>
     * The maximum amount that you want to spend, in US dollars, per each MMS message.
     * </p>
     * 
     * @param maxPrice
     *        The maximum amount that you want to spend, in US dollars, per each MMS message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMediaMessageRequest withMaxPrice(String maxPrice) {
        setMaxPrice(maxPrice);
        return this;
    }

    /**
     * <p>
     * How long the text message is valid for. By default this is 72 hours.
     * </p>
     * 
     * @param timeToLive
     *        How long the text message is valid for. By default this is 72 hours.
     */

    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * <p>
     * How long the text message is valid for. By default this is 72 hours.
     * </p>
     * 
     * @return How long the text message is valid for. By default this is 72 hours.
     */

    public Integer getTimeToLive() {
        return this.timeToLive;
    }

    /**
     * <p>
     * How long the text message is valid for. By default this is 72 hours.
     * </p>
     * 
     * @param timeToLive
     *        How long the text message is valid for. By default this is 72 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMediaMessageRequest withTimeToLive(Integer timeToLive) {
        setTimeToLive(timeToLive);
        return this;
    }

    /**
     * <p>
     * You can specify custom data in this field. If you do, that data is logged to the event destination.
     * </p>
     * 
     * @return You can specify custom data in this field. If you do, that data is logged to the event destination.
     */

    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * <p>
     * You can specify custom data in this field. If you do, that data is logged to the event destination.
     * </p>
     * 
     * @param context
     *        You can specify custom data in this field. If you do, that data is logged to the event destination.
     */

    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * <p>
     * You can specify custom data in this field. If you do, that data is logged to the event destination.
     * </p>
     * 
     * @param context
     *        You can specify custom data in this field. If you do, that data is logged to the event destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMediaMessageRequest withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    /**
     * Add a single Context entry
     *
     * @see SendMediaMessageRequest#withContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SendMediaMessageRequest addContextEntry(String key, String value) {
        if (null == this.context) {
            this.context = new java.util.HashMap<String, String>();
        }
        if (this.context.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.context.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Context.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMediaMessageRequest clearContextEntries() {
        this.context = null;
        return this;
    }

    /**
     * <p>
     * When set to true, the message is checked and validated, but isn't sent to the end recipient.
     * </p>
     * 
     * @param dryRun
     *        When set to true, the message is checked and validated, but isn't sent to the end recipient.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * When set to true, the message is checked and validated, but isn't sent to the end recipient.
     * </p>
     * 
     * @return When set to true, the message is checked and validated, but isn't sent to the end recipient.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * When set to true, the message is checked and validated, but isn't sent to the end recipient.
     * </p>
     * 
     * @param dryRun
     *        When set to true, the message is checked and validated, but isn't sent to the end recipient.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMediaMessageRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * When set to true, the message is checked and validated, but isn't sent to the end recipient.
     * </p>
     * 
     * @return When set to true, the message is checked and validated, but isn't sent to the end recipient.
     */

    public Boolean isDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * The unique identifier of the protect configuration to use.
     * </p>
     * 
     * @param protectConfigurationId
     *        The unique identifier of the protect configuration to use.
     */

    public void setProtectConfigurationId(String protectConfigurationId) {
        this.protectConfigurationId = protectConfigurationId;
    }

    /**
     * <p>
     * The unique identifier of the protect configuration to use.
     * </p>
     * 
     * @return The unique identifier of the protect configuration to use.
     */

    public String getProtectConfigurationId() {
        return this.protectConfigurationId;
    }

    /**
     * <p>
     * The unique identifier of the protect configuration to use.
     * </p>
     * 
     * @param protectConfigurationId
     *        The unique identifier of the protect configuration to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendMediaMessageRequest withProtectConfigurationId(String protectConfigurationId) {
        setProtectConfigurationId(protectConfigurationId);
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
        if (getDestinationPhoneNumber() != null)
            sb.append("DestinationPhoneNumber: ").append(getDestinationPhoneNumber()).append(",");
        if (getOriginationIdentity() != null)
            sb.append("OriginationIdentity: ").append(getOriginationIdentity()).append(",");
        if (getMessageBody() != null)
            sb.append("MessageBody: ").append(getMessageBody()).append(",");
        if (getMediaUrls() != null)
            sb.append("MediaUrls: ").append(getMediaUrls()).append(",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getMaxPrice() != null)
            sb.append("MaxPrice: ").append(getMaxPrice()).append(",");
        if (getTimeToLive() != null)
            sb.append("TimeToLive: ").append(getTimeToLive()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun()).append(",");
        if (getProtectConfigurationId() != null)
            sb.append("ProtectConfigurationId: ").append(getProtectConfigurationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendMediaMessageRequest == false)
            return false;
        SendMediaMessageRequest other = (SendMediaMessageRequest) obj;
        if (other.getDestinationPhoneNumber() == null ^ this.getDestinationPhoneNumber() == null)
            return false;
        if (other.getDestinationPhoneNumber() != null && other.getDestinationPhoneNumber().equals(this.getDestinationPhoneNumber()) == false)
            return false;
        if (other.getOriginationIdentity() == null ^ this.getOriginationIdentity() == null)
            return false;
        if (other.getOriginationIdentity() != null && other.getOriginationIdentity().equals(this.getOriginationIdentity()) == false)
            return false;
        if (other.getMessageBody() == null ^ this.getMessageBody() == null)
            return false;
        if (other.getMessageBody() != null && other.getMessageBody().equals(this.getMessageBody()) == false)
            return false;
        if (other.getMediaUrls() == null ^ this.getMediaUrls() == null)
            return false;
        if (other.getMediaUrls() != null && other.getMediaUrls().equals(this.getMediaUrls()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getMaxPrice() == null ^ this.getMaxPrice() == null)
            return false;
        if (other.getMaxPrice() != null && other.getMaxPrice().equals(this.getMaxPrice()) == false)
            return false;
        if (other.getTimeToLive() == null ^ this.getTimeToLive() == null)
            return false;
        if (other.getTimeToLive() != null && other.getTimeToLive().equals(this.getTimeToLive()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getProtectConfigurationId() == null ^ this.getProtectConfigurationId() == null)
            return false;
        if (other.getProtectConfigurationId() != null && other.getProtectConfigurationId().equals(this.getProtectConfigurationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationPhoneNumber() == null) ? 0 : getDestinationPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getOriginationIdentity() == null) ? 0 : getOriginationIdentity().hashCode());
        hashCode = prime * hashCode + ((getMessageBody() == null) ? 0 : getMessageBody().hashCode());
        hashCode = prime * hashCode + ((getMediaUrls() == null) ? 0 : getMediaUrls().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getMaxPrice() == null) ? 0 : getMaxPrice().hashCode());
        hashCode = prime * hashCode + ((getTimeToLive() == null) ? 0 : getTimeToLive().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getProtectConfigurationId() == null) ? 0 : getProtectConfigurationId().hashCode());
        return hashCode;
    }

    @Override
    public SendMediaMessageRequest clone() {
        return (SendMediaMessageRequest) super.clone();
    }

}
