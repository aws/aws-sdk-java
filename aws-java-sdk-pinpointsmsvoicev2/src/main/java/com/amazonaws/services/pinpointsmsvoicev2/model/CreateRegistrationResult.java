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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateRegistration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRegistrationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     */
    private String registrationArn;
    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     */
    private String registrationId;
    /**
     * <p>
     * The type of registration form to create. The list of <b>RegistrationTypes</b> can be found using the
     * <a>DescribeRegistrationTypeDefinitions</a> action.
     * </p>
     */
    private String registrationType;
    /**
     * <p>
     * The status of the registration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code>: Your registration is created but not submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: Your registration has been submitted and is awaiting review.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: Your registration has been approved and your origination identity is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code>: Your registration has been approved and and your origination identity has been created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUIRES_UPDATES</code>: You must fix your registration and resubmit it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOSED</code>: The phone number or sender ID has been deleted and you must also delete the registration for
     * the number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code>: The registration has been deleted.
     * </p>
     * </li>
     * </ul>
     */
    private String registrationStatus;
    /**
     * <p>
     * The current version number of the registration.
     * </p>
     */
    private Long currentVersionNumber;
    /**
     * <p>
     * Metadata about a given registration which is specific to that registration type.
     * </p>
     */
    private java.util.Map<String, String> additionalAttributes;
    /**
     * <p>
     * An array of tags (key and value pairs) to associate with the registration.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The time when the registration was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     * format.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     * 
     * @param registrationArn
     *        The Amazon Resource Name (ARN) for the registration.
     */

    public void setRegistrationArn(String registrationArn) {
        this.registrationArn = registrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the registration.
     */

    public String getRegistrationArn() {
        return this.registrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     * 
     * @param registrationArn
     *        The Amazon Resource Name (ARN) for the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationResult withRegistrationArn(String registrationArn) {
        setRegistrationArn(registrationArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     */

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @return The unique identifier for the registration.
     */

    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationResult withRegistrationId(String registrationId) {
        setRegistrationId(registrationId);
        return this;
    }

    /**
     * <p>
     * The type of registration form to create. The list of <b>RegistrationTypes</b> can be found using the
     * <a>DescribeRegistrationTypeDefinitions</a> action.
     * </p>
     * 
     * @param registrationType
     *        The type of registration form to create. The list of <b>RegistrationTypes</b> can be found using the
     *        <a>DescribeRegistrationTypeDefinitions</a> action.
     */

    public void setRegistrationType(String registrationType) {
        this.registrationType = registrationType;
    }

    /**
     * <p>
     * The type of registration form to create. The list of <b>RegistrationTypes</b> can be found using the
     * <a>DescribeRegistrationTypeDefinitions</a> action.
     * </p>
     * 
     * @return The type of registration form to create. The list of <b>RegistrationTypes</b> can be found using the
     *         <a>DescribeRegistrationTypeDefinitions</a> action.
     */

    public String getRegistrationType() {
        return this.registrationType;
    }

    /**
     * <p>
     * The type of registration form to create. The list of <b>RegistrationTypes</b> can be found using the
     * <a>DescribeRegistrationTypeDefinitions</a> action.
     * </p>
     * 
     * @param registrationType
     *        The type of registration form to create. The list of <b>RegistrationTypes</b> can be found using the
     *        <a>DescribeRegistrationTypeDefinitions</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationResult withRegistrationType(String registrationType) {
        setRegistrationType(registrationType);
        return this;
    }

    /**
     * <p>
     * The status of the registration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code>: Your registration is created but not submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: Your registration has been submitted and is awaiting review.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: Your registration has been approved and your origination identity is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code>: Your registration has been approved and and your origination identity has been created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUIRES_UPDATES</code>: You must fix your registration and resubmit it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOSED</code>: The phone number or sender ID has been deleted and you must also delete the registration for
     * the number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code>: The registration has been deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registrationStatus
     *        The status of the registration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: Your registration is created but not submitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBMITTED</code>: Your registration has been submitted and is awaiting review.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code>: Your registration has been approved and your origination identity is being
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETE</code>: Your registration has been approved and and your origination identity has been
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REQUIRES_UPDATES</code>: You must fix your registration and resubmit it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CLOSED</code>: The phone number or sender ID has been deleted and you must also delete the
     *        registration for the number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The registration has been deleted.
     *        </p>
     *        </li>
     * @see RegistrationStatus
     */

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    /**
     * <p>
     * The status of the registration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code>: Your registration is created but not submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: Your registration has been submitted and is awaiting review.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: Your registration has been approved and your origination identity is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code>: Your registration has been approved and and your origination identity has been created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUIRES_UPDATES</code>: You must fix your registration and resubmit it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOSED</code>: The phone number or sender ID has been deleted and you must also delete the registration for
     * the number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code>: The registration has been deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the registration.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATED</code>: Your registration is created but not submitted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUBMITTED</code>: Your registration has been submitted and is awaiting review.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PROVISIONING</code>: Your registration has been approved and your origination identity is being
     *         created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETE</code>: Your registration has been approved and and your origination identity has been
     *         created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REQUIRES_UPDATES</code>: You must fix your registration and resubmit it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CLOSED</code>: The phone number or sender ID has been deleted and you must also delete the
     *         registration for the number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETED</code>: The registration has been deleted.
     *         </p>
     *         </li>
     * @see RegistrationStatus
     */

    public String getRegistrationStatus() {
        return this.registrationStatus;
    }

    /**
     * <p>
     * The status of the registration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code>: Your registration is created but not submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: Your registration has been submitted and is awaiting review.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: Your registration has been approved and your origination identity is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code>: Your registration has been approved and and your origination identity has been created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUIRES_UPDATES</code>: You must fix your registration and resubmit it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOSED</code>: The phone number or sender ID has been deleted and you must also delete the registration for
     * the number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code>: The registration has been deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registrationStatus
     *        The status of the registration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: Your registration is created but not submitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBMITTED</code>: Your registration has been submitted and is awaiting review.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code>: Your registration has been approved and your origination identity is being
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETE</code>: Your registration has been approved and and your origination identity has been
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REQUIRES_UPDATES</code>: You must fix your registration and resubmit it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CLOSED</code>: The phone number or sender ID has been deleted and you must also delete the
     *        registration for the number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The registration has been deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public CreateRegistrationResult withRegistrationStatus(String registrationStatus) {
        setRegistrationStatus(registrationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the registration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code>: Your registration is created but not submitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUBMITTED</code>: Your registration has been submitted and is awaiting review.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code>: Your registration has been approved and your origination identity is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code>: Your registration has been approved and and your origination identity has been created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REQUIRES_UPDATES</code>: You must fix your registration and resubmit it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLOSED</code>: The phone number or sender ID has been deleted and you must also delete the registration for
     * the number.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code>: The registration has been deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param registrationStatus
     *        The status of the registration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code>: Your registration is created but not submitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUBMITTED</code>: Your registration has been submitted and is awaiting review.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REVIEWING</code>: Your registration has been accepted and is being reviewed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code>: Your registration has been approved and your origination identity is being
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETE</code>: Your registration has been approved and and your origination identity has been
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REQUIRES_UPDATES</code>: You must fix your registration and resubmit it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CLOSED</code>: The phone number or sender ID has been deleted and you must also delete the
     *        registration for the number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The registration has been deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public CreateRegistrationResult withRegistrationStatus(RegistrationStatus registrationStatus) {
        this.registrationStatus = registrationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The current version number of the registration.
     * </p>
     * 
     * @param currentVersionNumber
     *        The current version number of the registration.
     */

    public void setCurrentVersionNumber(Long currentVersionNumber) {
        this.currentVersionNumber = currentVersionNumber;
    }

    /**
     * <p>
     * The current version number of the registration.
     * </p>
     * 
     * @return The current version number of the registration.
     */

    public Long getCurrentVersionNumber() {
        return this.currentVersionNumber;
    }

    /**
     * <p>
     * The current version number of the registration.
     * </p>
     * 
     * @param currentVersionNumber
     *        The current version number of the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationResult withCurrentVersionNumber(Long currentVersionNumber) {
        setCurrentVersionNumber(currentVersionNumber);
        return this;
    }

    /**
     * <p>
     * Metadata about a given registration which is specific to that registration type.
     * </p>
     * 
     * @return Metadata about a given registration which is specific to that registration type.
     */

    public java.util.Map<String, String> getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * <p>
     * Metadata about a given registration which is specific to that registration type.
     * </p>
     * 
     * @param additionalAttributes
     *        Metadata about a given registration which is specific to that registration type.
     */

    public void setAdditionalAttributes(java.util.Map<String, String> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
    }

    /**
     * <p>
     * Metadata about a given registration which is specific to that registration type.
     * </p>
     * 
     * @param additionalAttributes
     *        Metadata about a given registration which is specific to that registration type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationResult withAdditionalAttributes(java.util.Map<String, String> additionalAttributes) {
        setAdditionalAttributes(additionalAttributes);
        return this;
    }

    /**
     * Add a single AdditionalAttributes entry
     *
     * @see CreateRegistrationResult#withAdditionalAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationResult addAdditionalAttributesEntry(String key, String value) {
        if (null == this.additionalAttributes) {
            this.additionalAttributes = new java.util.HashMap<String, String>();
        }
        if (this.additionalAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationResult clearAdditionalAttributesEntries() {
        this.additionalAttributes = null;
        return this;
    }

    /**
     * <p>
     * An array of tags (key and value pairs) to associate with the registration.
     * </p>
     * 
     * @return An array of tags (key and value pairs) to associate with the registration.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of tags (key and value pairs) to associate with the registration.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) to associate with the registration.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of tags (key and value pairs) to associate with the registration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) to associate with the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of tags (key and value pairs) to associate with the registration.
     * </p>
     * 
     * @param tags
     *        An array of tags (key and value pairs) to associate with the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The time when the registration was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     * format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the registration was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     *        time</a> format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time when the registration was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     * format.
     * </p>
     * 
     * @return The time when the registration was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     *         time</a> format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time when the registration was created, in <a href="https://www.epochconverter.com/">UNIX epoch time</a>
     * format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the registration was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     *        time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistrationResult withCreatedTimestamp(java.util.Date createdTimestamp) {
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
        if (getRegistrationArn() != null)
            sb.append("RegistrationArn: ").append(getRegistrationArn()).append(",");
        if (getRegistrationId() != null)
            sb.append("RegistrationId: ").append(getRegistrationId()).append(",");
        if (getRegistrationType() != null)
            sb.append("RegistrationType: ").append(getRegistrationType()).append(",");
        if (getRegistrationStatus() != null)
            sb.append("RegistrationStatus: ").append(getRegistrationStatus()).append(",");
        if (getCurrentVersionNumber() != null)
            sb.append("CurrentVersionNumber: ").append(getCurrentVersionNumber()).append(",");
        if (getAdditionalAttributes() != null)
            sb.append("AdditionalAttributes: ").append(getAdditionalAttributes()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateRegistrationResult == false)
            return false;
        CreateRegistrationResult other = (CreateRegistrationResult) obj;
        if (other.getRegistrationArn() == null ^ this.getRegistrationArn() == null)
            return false;
        if (other.getRegistrationArn() != null && other.getRegistrationArn().equals(this.getRegistrationArn()) == false)
            return false;
        if (other.getRegistrationId() == null ^ this.getRegistrationId() == null)
            return false;
        if (other.getRegistrationId() != null && other.getRegistrationId().equals(this.getRegistrationId()) == false)
            return false;
        if (other.getRegistrationType() == null ^ this.getRegistrationType() == null)
            return false;
        if (other.getRegistrationType() != null && other.getRegistrationType().equals(this.getRegistrationType()) == false)
            return false;
        if (other.getRegistrationStatus() == null ^ this.getRegistrationStatus() == null)
            return false;
        if (other.getRegistrationStatus() != null && other.getRegistrationStatus().equals(this.getRegistrationStatus()) == false)
            return false;
        if (other.getCurrentVersionNumber() == null ^ this.getCurrentVersionNumber() == null)
            return false;
        if (other.getCurrentVersionNumber() != null && other.getCurrentVersionNumber().equals(this.getCurrentVersionNumber()) == false)
            return false;
        if (other.getAdditionalAttributes() == null ^ this.getAdditionalAttributes() == null)
            return false;
        if (other.getAdditionalAttributes() != null && other.getAdditionalAttributes().equals(this.getAdditionalAttributes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getRegistrationArn() == null) ? 0 : getRegistrationArn().hashCode());
        hashCode = prime * hashCode + ((getRegistrationId() == null) ? 0 : getRegistrationId().hashCode());
        hashCode = prime * hashCode + ((getRegistrationType() == null) ? 0 : getRegistrationType().hashCode());
        hashCode = prime * hashCode + ((getRegistrationStatus() == null) ? 0 : getRegistrationStatus().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersionNumber() == null) ? 0 : getCurrentVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getAdditionalAttributes() == null) ? 0 : getAdditionalAttributes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public CreateRegistrationResult clone() {
        try {
            return (CreateRegistrationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
