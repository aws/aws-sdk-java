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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a phone number that has been claimed to your Amazon Connect instance or traffic distribution group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ClaimedPhoneNumberSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClaimedPhoneNumberSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     */
    private String phoneNumberId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     */
    private String phoneNumberArn;
    /**
     * <p>
     * The phone number. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The ISO country code.
     * </p>
     */
    private String phoneNumberCountryCode;
    /**
     * <p>
     * The type of phone number.
     * </p>
     */
    private String phoneNumberType;
    /**
     * <p>
     * The description of the phone number.
     * </p>
     */
    private String phoneNumberDescription;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The status of the phone number.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLAIMED</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html">ClaimedPhoneNumber</a>
     * or <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> means a <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html">ClaimedPhoneNumber</a>
     * or <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation is still in progress and has not yet completed. You can call <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> at a later time to verify if the previous operation has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> indicates that the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html">ClaimedPhoneNumber</a>
     * or <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation has failed. It will include a message indicating the failure reason. A common reason for a failure may
     * be that the <code>TargetArn</code> value you are claiming or updating a phone number to has reached its limit of
     * total claimed numbers. If you received a <code>FAILED</code> status from a <code>ClaimPhoneNumber</code> API
     * call, you have one day to retry claiming the phone number before the number is released back to the inventory for
     * other customers to claim.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You will not be billed for the phone number during the 1-day period if number claiming fails.
     * </p>
     * </note>
     */
    private PhoneNumberStatus phoneNumberStatus;

    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     * 
     * @param phoneNumberId
     *        A unique identifier for the phone number.
     */

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     * 
     * @return A unique identifier for the phone number.
     */

    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     * 
     * @param phoneNumberId
     *        A unique identifier for the phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimedPhoneNumberSummary withPhoneNumberId(String phoneNumberId) {
        setPhoneNumberId(phoneNumberId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     * 
     * @param phoneNumberArn
     *        The Amazon Resource Name (ARN) of the phone number.
     */

    public void setPhoneNumberArn(String phoneNumberArn) {
        this.phoneNumberArn = phoneNumberArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the phone number.
     */

    public String getPhoneNumberArn() {
        return this.phoneNumberArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     * 
     * @param phoneNumberArn
     *        The Amazon Resource Name (ARN) of the phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimedPhoneNumberSummary withPhoneNumberArn(String phoneNumberArn) {
        setPhoneNumberArn(phoneNumberArn);
        return this;
    }

    /**
     * <p>
     * The phone number. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number. Phone numbers are formatted
     *        <code>[+] [country code] [subscriber number including area code]</code>.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     * 
     * @return The phone number. Phone numbers are formatted
     *         <code>[+] [country code] [subscriber number including area code]</code>.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number. Phone numbers are formatted
     *        <code>[+] [country code] [subscriber number including area code]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimedPhoneNumberSummary withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @param phoneNumberCountryCode
     *        The ISO country code.
     * @see PhoneNumberCountryCode
     */

    public void setPhoneNumberCountryCode(String phoneNumberCountryCode) {
        this.phoneNumberCountryCode = phoneNumberCountryCode;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @return The ISO country code.
     * @see PhoneNumberCountryCode
     */

    public String getPhoneNumberCountryCode() {
        return this.phoneNumberCountryCode;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @param phoneNumberCountryCode
     *        The ISO country code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberCountryCode
     */

    public ClaimedPhoneNumberSummary withPhoneNumberCountryCode(String phoneNumberCountryCode) {
        setPhoneNumberCountryCode(phoneNumberCountryCode);
        return this;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @param phoneNumberCountryCode
     *        The ISO country code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberCountryCode
     */

    public ClaimedPhoneNumberSummary withPhoneNumberCountryCode(PhoneNumberCountryCode phoneNumberCountryCode) {
        this.phoneNumberCountryCode = phoneNumberCountryCode.toString();
        return this;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @param phoneNumberType
     *        The type of phone number.
     * @see PhoneNumberType
     */

    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @return The type of phone number.
     * @see PhoneNumberType
     */

    public String getPhoneNumberType() {
        return this.phoneNumberType;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @param phoneNumberType
     *        The type of phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public ClaimedPhoneNumberSummary withPhoneNumberType(String phoneNumberType) {
        setPhoneNumberType(phoneNumberType);
        return this;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @param phoneNumberType
     *        The type of phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public ClaimedPhoneNumberSummary withPhoneNumberType(PhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType.toString();
        return this;
    }

    /**
     * <p>
     * The description of the phone number.
     * </p>
     * 
     * @param phoneNumberDescription
     *        The description of the phone number.
     */

    public void setPhoneNumberDescription(String phoneNumberDescription) {
        this.phoneNumberDescription = phoneNumberDescription;
    }

    /**
     * <p>
     * The description of the phone number.
     * </p>
     * 
     * @return The description of the phone number.
     */

    public String getPhoneNumberDescription() {
        return this.phoneNumberDescription;
    }

    /**
     * <p>
     * The description of the phone number.
     * </p>
     * 
     * @param phoneNumberDescription
     *        The description of the phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimedPhoneNumberSummary withPhoneNumberDescription(String phoneNumberDescription) {
        setPhoneNumberDescription(phoneNumberDescription);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone
     *        numbers are claimed to.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone
     *         numbers are claimed to.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone
     *        numbers are claimed to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimedPhoneNumberSummary withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource. For example, { "tags":
     *         {"key1":"value1", "key2":"value2"} }.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimedPhoneNumberSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ClaimedPhoneNumberSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ClaimedPhoneNumberSummary addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimedPhoneNumberSummary clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The status of the phone number.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLAIMED</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html">ClaimedPhoneNumber</a>
     * or <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> means a <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html">ClaimedPhoneNumber</a>
     * or <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation is still in progress and has not yet completed. You can call <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> at a later time to verify if the previous operation has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> indicates that the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html">ClaimedPhoneNumber</a>
     * or <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation has failed. It will include a message indicating the failure reason. A common reason for a failure may
     * be that the <code>TargetArn</code> value you are claiming or updating a phone number to has reached its limit of
     * total claimed numbers. If you received a <code>FAILED</code> status from a <code>ClaimPhoneNumber</code> API
     * call, you have one day to retry claiming the phone number before the number is released back to the inventory for
     * other customers to claim.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You will not be billed for the phone number during the 1-day period if number claiming fails.
     * </p>
     * </note>
     * 
     * @param phoneNumberStatus
     *        The status of the phone number.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLAIMED</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *        >ClaimedPhoneNumber</a> or <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *        >UpdatePhoneNumber</a> operation succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> means a <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *        >ClaimedPhoneNumber</a> or <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *        >UpdatePhoneNumber</a> operation is still in progress and has not yet completed. You can call <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     *        >DescribePhoneNumber</a> at a later time to verify if the previous operation has completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> indicates that the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *        >ClaimedPhoneNumber</a> or <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *        >UpdatePhoneNumber</a> operation has failed. It will include a message indicating the failure reason. A
     *        common reason for a failure may be that the <code>TargetArn</code> value you are claiming or updating a
     *        phone number to has reached its limit of total claimed numbers. If you received a <code>FAILED</code>
     *        status from a <code>ClaimPhoneNumber</code> API call, you have one day to retry claiming the phone number
     *        before the number is released back to the inventory for other customers to claim.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        You will not be billed for the phone number during the 1-day period if number claiming fails.
     *        </p>
     */

    public void setPhoneNumberStatus(PhoneNumberStatus phoneNumberStatus) {
        this.phoneNumberStatus = phoneNumberStatus;
    }

    /**
     * <p>
     * The status of the phone number.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLAIMED</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html">ClaimedPhoneNumber</a>
     * or <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> means a <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html">ClaimedPhoneNumber</a>
     * or <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation is still in progress and has not yet completed. You can call <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> at a later time to verify if the previous operation has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> indicates that the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html">ClaimedPhoneNumber</a>
     * or <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation has failed. It will include a message indicating the failure reason. A common reason for a failure may
     * be that the <code>TargetArn</code> value you are claiming or updating a phone number to has reached its limit of
     * total claimed numbers. If you received a <code>FAILED</code> status from a <code>ClaimPhoneNumber</code> API
     * call, you have one day to retry claiming the phone number before the number is released back to the inventory for
     * other customers to claim.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You will not be billed for the phone number during the 1-day period if number claiming fails.
     * </p>
     * </note>
     * 
     * @return The status of the phone number.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CLAIMED</code> means the previous <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *         >ClaimedPhoneNumber</a> or <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *         >UpdatePhoneNumber</a> operation succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> means a <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *         >ClaimedPhoneNumber</a> or <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *         >UpdatePhoneNumber</a> operation is still in progress and has not yet completed. You can call <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     *         >DescribePhoneNumber</a> at a later time to verify if the previous operation has completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> indicates that the previous <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *         >ClaimedPhoneNumber</a> or <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *         >UpdatePhoneNumber</a> operation has failed. It will include a message indicating the failure reason. A
     *         common reason for a failure may be that the <code>TargetArn</code> value you are claiming or updating a
     *         phone number to has reached its limit of total claimed numbers. If you received a <code>FAILED</code>
     *         status from a <code>ClaimPhoneNumber</code> API call, you have one day to retry claiming the phone number
     *         before the number is released back to the inventory for other customers to claim.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         You will not be billed for the phone number during the 1-day period if number claiming fails.
     *         </p>
     */

    public PhoneNumberStatus getPhoneNumberStatus() {
        return this.phoneNumberStatus;
    }

    /**
     * <p>
     * The status of the phone number.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLAIMED</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html">ClaimedPhoneNumber</a>
     * or <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> means a <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html">ClaimedPhoneNumber</a>
     * or <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation is still in progress and has not yet completed. You can call <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     * >DescribePhoneNumber</a> at a later time to verify if the previous operation has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> indicates that the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html">ClaimedPhoneNumber</a>
     * or <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html">UpdatePhoneNumber</a>
     * operation has failed. It will include a message indicating the failure reason. A common reason for a failure may
     * be that the <code>TargetArn</code> value you are claiming or updating a phone number to has reached its limit of
     * total claimed numbers. If you received a <code>FAILED</code> status from a <code>ClaimPhoneNumber</code> API
     * call, you have one day to retry claiming the phone number before the number is released back to the inventory for
     * other customers to claim.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You will not be billed for the phone number during the 1-day period if number claiming fails.
     * </p>
     * </note>
     * 
     * @param phoneNumberStatus
     *        The status of the phone number.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLAIMED</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *        >ClaimedPhoneNumber</a> or <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *        >UpdatePhoneNumber</a> operation succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> means a <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *        >ClaimedPhoneNumber</a> or <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *        >UpdatePhoneNumber</a> operation is still in progress and has not yet completed. You can call <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribePhoneNumber.html"
     *        >DescribePhoneNumber</a> at a later time to verify if the previous operation has completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> indicates that the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_ClaimedPhoneNumber.html"
     *        >ClaimedPhoneNumber</a> or <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdatePhoneNumber.html"
     *        >UpdatePhoneNumber</a> operation has failed. It will include a message indicating the failure reason. A
     *        common reason for a failure may be that the <code>TargetArn</code> value you are claiming or updating a
     *        phone number to has reached its limit of total claimed numbers. If you received a <code>FAILED</code>
     *        status from a <code>ClaimPhoneNumber</code> API call, you have one day to retry claiming the phone number
     *        before the number is released back to the inventory for other customers to claim.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        You will not be billed for the phone number during the 1-day period if number claiming fails.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimedPhoneNumberSummary withPhoneNumberStatus(PhoneNumberStatus phoneNumberStatus) {
        setPhoneNumberStatus(phoneNumberStatus);
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
        if (getPhoneNumberId() != null)
            sb.append("PhoneNumberId: ").append(getPhoneNumberId()).append(",");
        if (getPhoneNumberArn() != null)
            sb.append("PhoneNumberArn: ").append(getPhoneNumberArn()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber()).append(",");
        if (getPhoneNumberCountryCode() != null)
            sb.append("PhoneNumberCountryCode: ").append(getPhoneNumberCountryCode()).append(",");
        if (getPhoneNumberType() != null)
            sb.append("PhoneNumberType: ").append(getPhoneNumberType()).append(",");
        if (getPhoneNumberDescription() != null)
            sb.append("PhoneNumberDescription: ").append(getPhoneNumberDescription()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getPhoneNumberStatus() != null)
            sb.append("PhoneNumberStatus: ").append(getPhoneNumberStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClaimedPhoneNumberSummary == false)
            return false;
        ClaimedPhoneNumberSummary other = (ClaimedPhoneNumberSummary) obj;
        if (other.getPhoneNumberId() == null ^ this.getPhoneNumberId() == null)
            return false;
        if (other.getPhoneNumberId() != null && other.getPhoneNumberId().equals(this.getPhoneNumberId()) == false)
            return false;
        if (other.getPhoneNumberArn() == null ^ this.getPhoneNumberArn() == null)
            return false;
        if (other.getPhoneNumberArn() != null && other.getPhoneNumberArn().equals(this.getPhoneNumberArn()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getPhoneNumberCountryCode() == null ^ this.getPhoneNumberCountryCode() == null)
            return false;
        if (other.getPhoneNumberCountryCode() != null && other.getPhoneNumberCountryCode().equals(this.getPhoneNumberCountryCode()) == false)
            return false;
        if (other.getPhoneNumberType() == null ^ this.getPhoneNumberType() == null)
            return false;
        if (other.getPhoneNumberType() != null && other.getPhoneNumberType().equals(this.getPhoneNumberType()) == false)
            return false;
        if (other.getPhoneNumberDescription() == null ^ this.getPhoneNumberDescription() == null)
            return false;
        if (other.getPhoneNumberDescription() != null && other.getPhoneNumberDescription().equals(this.getPhoneNumberDescription()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPhoneNumberStatus() == null ^ this.getPhoneNumberStatus() == null)
            return false;
        if (other.getPhoneNumberStatus() != null && other.getPhoneNumberStatus().equals(this.getPhoneNumberStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumberId() == null) ? 0 : getPhoneNumberId().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberArn() == null) ? 0 : getPhoneNumberArn().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberCountryCode() == null) ? 0 : getPhoneNumberCountryCode().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberType() == null) ? 0 : getPhoneNumberType().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberDescription() == null) ? 0 : getPhoneNumberDescription().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberStatus() == null) ? 0 : getPhoneNumberStatus().hashCode());
        return hashCode;
    }

    @Override
    public ClaimedPhoneNumberSummary clone() {
        try {
            return (ClaimedPhoneNumberSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ClaimedPhoneNumberSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
