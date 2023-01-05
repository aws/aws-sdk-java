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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ClaimPhoneNumber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClaimPhoneNumberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The phone number you want to claim. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The description of the phone number.
     * </p>
     */
    private String phoneNumberDescription;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * <p>
     * Pattern: <code>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$</code>
     * </p>
     */
    private String clientToken;

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

    public ClaimPhoneNumberRequest withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The phone number you want to claim. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number you want to claim. Phone numbers are formatted
     *        <code>[+] [country code] [subscriber number including area code]</code>.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number you want to claim. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     * 
     * @return The phone number you want to claim. Phone numbers are formatted
     *         <code>[+] [country code] [subscriber number including area code]</code>.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number you want to claim. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number you want to claim. Phone numbers are formatted
     *        <code>[+] [country code] [subscriber number including area code]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimPhoneNumberRequest withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
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

    public ClaimPhoneNumberRequest withPhoneNumberDescription(String phoneNumberDescription) {
        setPhoneNumberDescription(phoneNumberDescription);
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

    public ClaimPhoneNumberRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ClaimPhoneNumberRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ClaimPhoneNumberRequest addTagsEntry(String key, String value) {
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

    public ClaimPhoneNumberRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * <p>
     * Pattern: <code>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$</code>
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.</p>
     *        <p>
     *        Pattern: <code>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$</code>
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * <p>
     * Pattern: <code>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$</code>
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *         provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see
     *         <a href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making
     *         retries safe with idempotent APIs</a>.</p>
     *         <p>
     *         Pattern: <code>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$</code>
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * <p>
     * Pattern: <code>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$</code>
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.</p>
     *        <p>
     *        Pattern: <code>^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClaimPhoneNumberRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber()).append(",");
        if (getPhoneNumberDescription() != null)
            sb.append("PhoneNumberDescription: ").append(getPhoneNumberDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClaimPhoneNumberRequest == false)
            return false;
        ClaimPhoneNumberRequest other = (ClaimPhoneNumberRequest) obj;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getPhoneNumberDescription() == null ^ this.getPhoneNumberDescription() == null)
            return false;
        if (other.getPhoneNumberDescription() != null && other.getPhoneNumberDescription().equals(this.getPhoneNumberDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberDescription() == null) ? 0 : getPhoneNumberDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public ClaimPhoneNumberRequest clone() {
        return (ClaimPhoneNumberRequest) super.clone();
    }

}
