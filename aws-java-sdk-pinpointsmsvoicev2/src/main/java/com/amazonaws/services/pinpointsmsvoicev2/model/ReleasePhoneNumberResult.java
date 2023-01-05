/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ReleasePhoneNumber"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReleasePhoneNumberResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The PhoneNumberArn of the phone number that was released.
     * </p>
     */
    private String phoneNumberArn;
    /**
     * <p>
     * The PhoneNumberId of the phone number that was released.
     * </p>
     */
    private String phoneNumberId;
    /**
     * <p>
     * The phone number that was released.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The current status of the request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     */
    private String isoCountryCode;
    /**
     * <p>
     * The message type that was associated with the phone number.
     * </p>
     */
    private String messageType;
    /**
     * <p>
     * Specifies if the number could be used for text messages, voice, or both.
     * </p>
     */
    private java.util.List<String> numberCapabilities;
    /**
     * <p>
     * The type of number that was released.
     * </p>
     */
    private String numberType;
    /**
     * <p>
     * The monthly price of the phone number, in US dollars.
     * </p>
     */
    private String monthlyLeasingPrice;
    /**
     * <p>
     * By default this is set to false. When set to true you can receive incoming text messages from your end
     * recipients.
     * </p>
     */
    private Boolean twoWayEnabled;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TwoWayChannel.
     * </p>
     */
    private String twoWayChannelArn;
    /**
     * <p>
     * By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to one of
     * your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end
     * recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're
     * also responsible for tracking and honoring opt-out requests.
     * </p>
     */
    private Boolean selfManagedOptOutsEnabled;
    /**
     * <p>
     * The name of the OptOutList that was associated with the phone number.
     * </p>
     */
    private String optOutListName;
    /**
     * <p>
     * The time when the phone number was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     * format.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The PhoneNumberArn of the phone number that was released.
     * </p>
     * 
     * @param phoneNumberArn
     *        The PhoneNumberArn of the phone number that was released.
     */

    public void setPhoneNumberArn(String phoneNumberArn) {
        this.phoneNumberArn = phoneNumberArn;
    }

    /**
     * <p>
     * The PhoneNumberArn of the phone number that was released.
     * </p>
     * 
     * @return The PhoneNumberArn of the phone number that was released.
     */

    public String getPhoneNumberArn() {
        return this.phoneNumberArn;
    }

    /**
     * <p>
     * The PhoneNumberArn of the phone number that was released.
     * </p>
     * 
     * @param phoneNumberArn
     *        The PhoneNumberArn of the phone number that was released.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleasePhoneNumberResult withPhoneNumberArn(String phoneNumberArn) {
        setPhoneNumberArn(phoneNumberArn);
        return this;
    }

    /**
     * <p>
     * The PhoneNumberId of the phone number that was released.
     * </p>
     * 
     * @param phoneNumberId
     *        The PhoneNumberId of the phone number that was released.
     */

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    /**
     * <p>
     * The PhoneNumberId of the phone number that was released.
     * </p>
     * 
     * @return The PhoneNumberId of the phone number that was released.
     */

    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    /**
     * <p>
     * The PhoneNumberId of the phone number that was released.
     * </p>
     * 
     * @param phoneNumberId
     *        The PhoneNumberId of the phone number that was released.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleasePhoneNumberResult withPhoneNumberId(String phoneNumberId) {
        setPhoneNumberId(phoneNumberId);
        return this;
    }

    /**
     * <p>
     * The phone number that was released.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number that was released.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number that was released.
     * </p>
     * 
     * @return The phone number that was released.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number that was released.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number that was released.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleasePhoneNumberResult withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @param status
     *        The current status of the request.
     * @see NumberStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @return The current status of the request.
     * @see NumberStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @param status
     *        The current status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberStatus
     */

    public ReleasePhoneNumberResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @param status
     *        The current status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberStatus
     */

    public ReleasePhoneNumberResult withStatus(NumberStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @param isoCountryCode
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     */

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @return The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     */

    public String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @param isoCountryCode
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleasePhoneNumberResult withIsoCountryCode(String isoCountryCode) {
        setIsoCountryCode(isoCountryCode);
        return this;
    }

    /**
     * <p>
     * The message type that was associated with the phone number.
     * </p>
     * 
     * @param messageType
     *        The message type that was associated with the phone number.
     * @see MessageType
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * <p>
     * The message type that was associated with the phone number.
     * </p>
     * 
     * @return The message type that was associated with the phone number.
     * @see MessageType
     */

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * <p>
     * The message type that was associated with the phone number.
     * </p>
     * 
     * @param messageType
     *        The message type that was associated with the phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public ReleasePhoneNumberResult withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * <p>
     * The message type that was associated with the phone number.
     * </p>
     * 
     * @param messageType
     *        The message type that was associated with the phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public ReleasePhoneNumberResult withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies if the number could be used for text messages, voice, or both.
     * </p>
     * 
     * @return Specifies if the number could be used for text messages, voice, or both.
     * @see NumberCapability
     */

    public java.util.List<String> getNumberCapabilities() {
        return numberCapabilities;
    }

    /**
     * <p>
     * Specifies if the number could be used for text messages, voice, or both.
     * </p>
     * 
     * @param numberCapabilities
     *        Specifies if the number could be used for text messages, voice, or both.
     * @see NumberCapability
     */

    public void setNumberCapabilities(java.util.Collection<String> numberCapabilities) {
        if (numberCapabilities == null) {
            this.numberCapabilities = null;
            return;
        }

        this.numberCapabilities = new java.util.ArrayList<String>(numberCapabilities);
    }

    /**
     * <p>
     * Specifies if the number could be used for text messages, voice, or both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNumberCapabilities(java.util.Collection)} or {@link #withNumberCapabilities(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param numberCapabilities
     *        Specifies if the number could be used for text messages, voice, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public ReleasePhoneNumberResult withNumberCapabilities(String... numberCapabilities) {
        if (this.numberCapabilities == null) {
            setNumberCapabilities(new java.util.ArrayList<String>(numberCapabilities.length));
        }
        for (String ele : numberCapabilities) {
            this.numberCapabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies if the number could be used for text messages, voice, or both.
     * </p>
     * 
     * @param numberCapabilities
     *        Specifies if the number could be used for text messages, voice, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public ReleasePhoneNumberResult withNumberCapabilities(java.util.Collection<String> numberCapabilities) {
        setNumberCapabilities(numberCapabilities);
        return this;
    }

    /**
     * <p>
     * Specifies if the number could be used for text messages, voice, or both.
     * </p>
     * 
     * @param numberCapabilities
     *        Specifies if the number could be used for text messages, voice, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberCapability
     */

    public ReleasePhoneNumberResult withNumberCapabilities(NumberCapability... numberCapabilities) {
        java.util.ArrayList<String> numberCapabilitiesCopy = new java.util.ArrayList<String>(numberCapabilities.length);
        for (NumberCapability value : numberCapabilities) {
            numberCapabilitiesCopy.add(value.toString());
        }
        if (getNumberCapabilities() == null) {
            setNumberCapabilities(numberCapabilitiesCopy);
        } else {
            getNumberCapabilities().addAll(numberCapabilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The type of number that was released.
     * </p>
     * 
     * @param numberType
     *        The type of number that was released.
     * @see NumberType
     */

    public void setNumberType(String numberType) {
        this.numberType = numberType;
    }

    /**
     * <p>
     * The type of number that was released.
     * </p>
     * 
     * @return The type of number that was released.
     * @see NumberType
     */

    public String getNumberType() {
        return this.numberType;
    }

    /**
     * <p>
     * The type of number that was released.
     * </p>
     * 
     * @param numberType
     *        The type of number that was released.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberType
     */

    public ReleasePhoneNumberResult withNumberType(String numberType) {
        setNumberType(numberType);
        return this;
    }

    /**
     * <p>
     * The type of number that was released.
     * </p>
     * 
     * @param numberType
     *        The type of number that was released.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumberType
     */

    public ReleasePhoneNumberResult withNumberType(NumberType numberType) {
        this.numberType = numberType.toString();
        return this;
    }

    /**
     * <p>
     * The monthly price of the phone number, in US dollars.
     * </p>
     * 
     * @param monthlyLeasingPrice
     *        The monthly price of the phone number, in US dollars.
     */

    public void setMonthlyLeasingPrice(String monthlyLeasingPrice) {
        this.monthlyLeasingPrice = monthlyLeasingPrice;
    }

    /**
     * <p>
     * The monthly price of the phone number, in US dollars.
     * </p>
     * 
     * @return The monthly price of the phone number, in US dollars.
     */

    public String getMonthlyLeasingPrice() {
        return this.monthlyLeasingPrice;
    }

    /**
     * <p>
     * The monthly price of the phone number, in US dollars.
     * </p>
     * 
     * @param monthlyLeasingPrice
     *        The monthly price of the phone number, in US dollars.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleasePhoneNumberResult withMonthlyLeasingPrice(String monthlyLeasingPrice) {
        setMonthlyLeasingPrice(monthlyLeasingPrice);
        return this;
    }

    /**
     * <p>
     * By default this is set to false. When set to true you can receive incoming text messages from your end
     * recipients.
     * </p>
     * 
     * @param twoWayEnabled
     *        By default this is set to false. When set to true you can receive incoming text messages from your end
     *        recipients.
     */

    public void setTwoWayEnabled(Boolean twoWayEnabled) {
        this.twoWayEnabled = twoWayEnabled;
    }

    /**
     * <p>
     * By default this is set to false. When set to true you can receive incoming text messages from your end
     * recipients.
     * </p>
     * 
     * @return By default this is set to false. When set to true you can receive incoming text messages from your end
     *         recipients.
     */

    public Boolean getTwoWayEnabled() {
        return this.twoWayEnabled;
    }

    /**
     * <p>
     * By default this is set to false. When set to true you can receive incoming text messages from your end
     * recipients.
     * </p>
     * 
     * @param twoWayEnabled
     *        By default this is set to false. When set to true you can receive incoming text messages from your end
     *        recipients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleasePhoneNumberResult withTwoWayEnabled(Boolean twoWayEnabled) {
        setTwoWayEnabled(twoWayEnabled);
        return this;
    }

    /**
     * <p>
     * By default this is set to false. When set to true you can receive incoming text messages from your end
     * recipients.
     * </p>
     * 
     * @return By default this is set to false. When set to true you can receive incoming text messages from your end
     *         recipients.
     */

    public Boolean isTwoWayEnabled() {
        return this.twoWayEnabled;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TwoWayChannel.
     * </p>
     * 
     * @param twoWayChannelArn
     *        The Amazon Resource Name (ARN) of the TwoWayChannel.
     */

    public void setTwoWayChannelArn(String twoWayChannelArn) {
        this.twoWayChannelArn = twoWayChannelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TwoWayChannel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the TwoWayChannel.
     */

    public String getTwoWayChannelArn() {
        return this.twoWayChannelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TwoWayChannel.
     * </p>
     * 
     * @param twoWayChannelArn
     *        The Amazon Resource Name (ARN) of the TwoWayChannel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleasePhoneNumberResult withTwoWayChannelArn(String twoWayChannelArn) {
        setTwoWayChannelArn(twoWayChannelArn);
        return this;
    }

    /**
     * <p>
     * By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to one of
     * your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end
     * recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're
     * also responsible for tracking and honoring opt-out requests.
     * </p>
     * 
     * @param selfManagedOptOutsEnabled
     *        By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to
     *        one of your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds
     *        the end recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP
     *        requests. You're also responsible for tracking and honoring opt-out requests.
     */

    public void setSelfManagedOptOutsEnabled(Boolean selfManagedOptOutsEnabled) {
        this.selfManagedOptOutsEnabled = selfManagedOptOutsEnabled;
    }

    /**
     * <p>
     * By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to one of
     * your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end
     * recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're
     * also responsible for tracking and honoring opt-out requests.
     * </p>
     * 
     * @return By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to
     *         one of your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds
     *         the end recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP
     *         requests. You're also responsible for tracking and honoring opt-out requests.
     */

    public Boolean getSelfManagedOptOutsEnabled() {
        return this.selfManagedOptOutsEnabled;
    }

    /**
     * <p>
     * By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to one of
     * your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end
     * recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're
     * also responsible for tracking and honoring opt-out requests.
     * </p>
     * 
     * @param selfManagedOptOutsEnabled
     *        By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to
     *        one of your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds
     *        the end recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP
     *        requests. You're also responsible for tracking and honoring opt-out requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleasePhoneNumberResult withSelfManagedOptOutsEnabled(Boolean selfManagedOptOutsEnabled) {
        setSelfManagedOptOutsEnabled(selfManagedOptOutsEnabled);
        return this;
    }

    /**
     * <p>
     * By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to one of
     * your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end
     * recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're
     * also responsible for tracking and honoring opt-out requests.
     * </p>
     * 
     * @return By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to
     *         one of your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds
     *         the end recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP
     *         requests. You're also responsible for tracking and honoring opt-out requests.
     */

    public Boolean isSelfManagedOptOutsEnabled() {
        return this.selfManagedOptOutsEnabled;
    }

    /**
     * <p>
     * The name of the OptOutList that was associated with the phone number.
     * </p>
     * 
     * @param optOutListName
     *        The name of the OptOutList that was associated with the phone number.
     */

    public void setOptOutListName(String optOutListName) {
        this.optOutListName = optOutListName;
    }

    /**
     * <p>
     * The name of the OptOutList that was associated with the phone number.
     * </p>
     * 
     * @return The name of the OptOutList that was associated with the phone number.
     */

    public String getOptOutListName() {
        return this.optOutListName;
    }

    /**
     * <p>
     * The name of the OptOutList that was associated with the phone number.
     * </p>
     * 
     * @param optOutListName
     *        The name of the OptOutList that was associated with the phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleasePhoneNumberResult withOptOutListName(String optOutListName) {
        setOptOutListName(optOutListName);
        return this;
    }

    /**
     * <p>
     * The time when the phone number was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     * format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the phone number was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     *        time</a> format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time when the phone number was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     * format.
     * </p>
     * 
     * @return The time when the phone number was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     *         time</a> format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time when the phone number was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     * format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the phone number was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     *        time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleasePhoneNumberResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
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
        if (getPhoneNumberArn() != null)
            sb.append("PhoneNumberArn: ").append(getPhoneNumberArn()).append(",");
        if (getPhoneNumberId() != null)
            sb.append("PhoneNumberId: ").append(getPhoneNumberId()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getIsoCountryCode() != null)
            sb.append("IsoCountryCode: ").append(getIsoCountryCode()).append(",");
        if (getMessageType() != null)
            sb.append("MessageType: ").append(getMessageType()).append(",");
        if (getNumberCapabilities() != null)
            sb.append("NumberCapabilities: ").append(getNumberCapabilities()).append(",");
        if (getNumberType() != null)
            sb.append("NumberType: ").append(getNumberType()).append(",");
        if (getMonthlyLeasingPrice() != null)
            sb.append("MonthlyLeasingPrice: ").append(getMonthlyLeasingPrice()).append(",");
        if (getTwoWayEnabled() != null)
            sb.append("TwoWayEnabled: ").append(getTwoWayEnabled()).append(",");
        if (getTwoWayChannelArn() != null)
            sb.append("TwoWayChannelArn: ").append(getTwoWayChannelArn()).append(",");
        if (getSelfManagedOptOutsEnabled() != null)
            sb.append("SelfManagedOptOutsEnabled: ").append(getSelfManagedOptOutsEnabled()).append(",");
        if (getOptOutListName() != null)
            sb.append("OptOutListName: ").append(getOptOutListName()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReleasePhoneNumberResult == false)
            return false;
        ReleasePhoneNumberResult other = (ReleasePhoneNumberResult) obj;
        if (other.getPhoneNumberArn() == null ^ this.getPhoneNumberArn() == null)
            return false;
        if (other.getPhoneNumberArn() != null && other.getPhoneNumberArn().equals(this.getPhoneNumberArn()) == false)
            return false;
        if (other.getPhoneNumberId() == null ^ this.getPhoneNumberId() == null)
            return false;
        if (other.getPhoneNumberId() != null && other.getPhoneNumberId().equals(this.getPhoneNumberId()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getIsoCountryCode() == null ^ this.getIsoCountryCode() == null)
            return false;
        if (other.getIsoCountryCode() != null && other.getIsoCountryCode().equals(this.getIsoCountryCode()) == false)
            return false;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        if (other.getNumberCapabilities() == null ^ this.getNumberCapabilities() == null)
            return false;
        if (other.getNumberCapabilities() != null && other.getNumberCapabilities().equals(this.getNumberCapabilities()) == false)
            return false;
        if (other.getNumberType() == null ^ this.getNumberType() == null)
            return false;
        if (other.getNumberType() != null && other.getNumberType().equals(this.getNumberType()) == false)
            return false;
        if (other.getMonthlyLeasingPrice() == null ^ this.getMonthlyLeasingPrice() == null)
            return false;
        if (other.getMonthlyLeasingPrice() != null && other.getMonthlyLeasingPrice().equals(this.getMonthlyLeasingPrice()) == false)
            return false;
        if (other.getTwoWayEnabled() == null ^ this.getTwoWayEnabled() == null)
            return false;
        if (other.getTwoWayEnabled() != null && other.getTwoWayEnabled().equals(this.getTwoWayEnabled()) == false)
            return false;
        if (other.getTwoWayChannelArn() == null ^ this.getTwoWayChannelArn() == null)
            return false;
        if (other.getTwoWayChannelArn() != null && other.getTwoWayChannelArn().equals(this.getTwoWayChannelArn()) == false)
            return false;
        if (other.getSelfManagedOptOutsEnabled() == null ^ this.getSelfManagedOptOutsEnabled() == null)
            return false;
        if (other.getSelfManagedOptOutsEnabled() != null && other.getSelfManagedOptOutsEnabled().equals(this.getSelfManagedOptOutsEnabled()) == false)
            return false;
        if (other.getOptOutListName() == null ^ this.getOptOutListName() == null)
            return false;
        if (other.getOptOutListName() != null && other.getOptOutListName().equals(this.getOptOutListName()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumberArn() == null) ? 0 : getPhoneNumberArn().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberId() == null) ? 0 : getPhoneNumberId().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getIsoCountryCode() == null) ? 0 : getIsoCountryCode().hashCode());
        hashCode = prime * hashCode + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        hashCode = prime * hashCode + ((getNumberCapabilities() == null) ? 0 : getNumberCapabilities().hashCode());
        hashCode = prime * hashCode + ((getNumberType() == null) ? 0 : getNumberType().hashCode());
        hashCode = prime * hashCode + ((getMonthlyLeasingPrice() == null) ? 0 : getMonthlyLeasingPrice().hashCode());
        hashCode = prime * hashCode + ((getTwoWayEnabled() == null) ? 0 : getTwoWayEnabled().hashCode());
        hashCode = prime * hashCode + ((getTwoWayChannelArn() == null) ? 0 : getTwoWayChannelArn().hashCode());
        hashCode = prime * hashCode + ((getSelfManagedOptOutsEnabled() == null) ? 0 : getSelfManagedOptOutsEnabled().hashCode());
        hashCode = prime * hashCode + ((getOptOutListName() == null) ? 0 : getOptOutListName().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ReleasePhoneNumberResult clone() {
        try {
            return (ReleasePhoneNumberResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
