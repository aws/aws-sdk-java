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
package com.amazonaws.services.voiceid.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request failed due to a conflict. Check the <code>ConflictType</code> and error message for more details.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.voiceid.model.AmazonVoiceIDException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The type of conflict which caused a ConflictException. Possible types and the corresponding error messages are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DOMAIN_NOT_ACTIVE</code>: The domain is not active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANNOT_CHANGE_SPEAKER_AFTER_ENROLLMENT</code>: You cannot change the speaker ID after an enrollment has
     * been requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENROLLMENT_ALREADY_EXISTS</code>: There is already an enrollment for this session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPEAKER_NOT_SET</code>: You must set the speaker ID before requesting an enrollment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPEAKER_OPTED_OUT</code>: You cannot request an enrollment for an opted out speaker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONCURRENT_CHANGES</code>: The request could not be processed as the resource was modified by another
     * request during execution.
     * </p>
     * </li>
     * </ul>
     */
    private String conflictType;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

    /**
     * <p>
     * The type of conflict which caused a ConflictException. Possible types and the corresponding error messages are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DOMAIN_NOT_ACTIVE</code>: The domain is not active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANNOT_CHANGE_SPEAKER_AFTER_ENROLLMENT</code>: You cannot change the speaker ID after an enrollment has
     * been requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENROLLMENT_ALREADY_EXISTS</code>: There is already an enrollment for this session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPEAKER_NOT_SET</code>: You must set the speaker ID before requesting an enrollment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPEAKER_OPTED_OUT</code>: You cannot request an enrollment for an opted out speaker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONCURRENT_CHANGES</code>: The request could not be processed as the resource was modified by another
     * request during execution.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conflictType
     *        The type of conflict which caused a ConflictException. Possible types and the corresponding error messages
     *        are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DOMAIN_NOT_ACTIVE</code>: The domain is not active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANNOT_CHANGE_SPEAKER_AFTER_ENROLLMENT</code>: You cannot change the speaker ID after an enrollment
     *        has been requested.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENROLLMENT_ALREADY_EXISTS</code>: There is already an enrollment for this session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPEAKER_NOT_SET</code>: You must set the speaker ID before requesting an enrollment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPEAKER_OPTED_OUT</code>: You cannot request an enrollment for an opted out speaker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONCURRENT_CHANGES</code>: The request could not be processed as the resource was modified by
     *        another request during execution.
     *        </p>
     *        </li>
     * @see ConflictType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ConflictType")
    public void setConflictType(String conflictType) {
        this.conflictType = conflictType;
    }

    /**
     * <p>
     * The type of conflict which caused a ConflictException. Possible types and the corresponding error messages are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DOMAIN_NOT_ACTIVE</code>: The domain is not active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANNOT_CHANGE_SPEAKER_AFTER_ENROLLMENT</code>: You cannot change the speaker ID after an enrollment has
     * been requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENROLLMENT_ALREADY_EXISTS</code>: There is already an enrollment for this session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPEAKER_NOT_SET</code>: You must set the speaker ID before requesting an enrollment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPEAKER_OPTED_OUT</code>: You cannot request an enrollment for an opted out speaker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONCURRENT_CHANGES</code>: The request could not be processed as the resource was modified by another
     * request during execution.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of conflict which caused a ConflictException. Possible types and the corresponding error
     *         messages are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DOMAIN_NOT_ACTIVE</code>: The domain is not active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANNOT_CHANGE_SPEAKER_AFTER_ENROLLMENT</code>: You cannot change the speaker ID after an enrollment
     *         has been requested.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENROLLMENT_ALREADY_EXISTS</code>: There is already an enrollment for this session.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SPEAKER_NOT_SET</code>: You must set the speaker ID before requesting an enrollment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SPEAKER_OPTED_OUT</code>: You cannot request an enrollment for an opted out speaker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONCURRENT_CHANGES</code>: The request could not be processed as the resource was modified by
     *         another request during execution.
     *         </p>
     *         </li>
     * @see ConflictType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ConflictType")
    public String getConflictType() {
        return this.conflictType;
    }

    /**
     * <p>
     * The type of conflict which caused a ConflictException. Possible types and the corresponding error messages are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DOMAIN_NOT_ACTIVE</code>: The domain is not active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANNOT_CHANGE_SPEAKER_AFTER_ENROLLMENT</code>: You cannot change the speaker ID after an enrollment has
     * been requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENROLLMENT_ALREADY_EXISTS</code>: There is already an enrollment for this session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPEAKER_NOT_SET</code>: You must set the speaker ID before requesting an enrollment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPEAKER_OPTED_OUT</code>: You cannot request an enrollment for an opted out speaker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONCURRENT_CHANGES</code>: The request could not be processed as the resource was modified by another
     * request during execution.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conflictType
     *        The type of conflict which caused a ConflictException. Possible types and the corresponding error messages
     *        are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DOMAIN_NOT_ACTIVE</code>: The domain is not active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANNOT_CHANGE_SPEAKER_AFTER_ENROLLMENT</code>: You cannot change the speaker ID after an enrollment
     *        has been requested.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENROLLMENT_ALREADY_EXISTS</code>: There is already an enrollment for this session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPEAKER_NOT_SET</code>: You must set the speaker ID before requesting an enrollment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPEAKER_OPTED_OUT</code>: You cannot request an enrollment for an opted out speaker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONCURRENT_CHANGES</code>: The request could not be processed as the resource was modified by
     *        another request during execution.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictType
     */

    public ConflictException withConflictType(String conflictType) {
        setConflictType(conflictType);
        return this;
    }

    /**
     * <p>
     * The type of conflict which caused a ConflictException. Possible types and the corresponding error messages are as
     * follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DOMAIN_NOT_ACTIVE</code>: The domain is not active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANNOT_CHANGE_SPEAKER_AFTER_ENROLLMENT</code>: You cannot change the speaker ID after an enrollment has
     * been requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENROLLMENT_ALREADY_EXISTS</code>: There is already an enrollment for this session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPEAKER_NOT_SET</code>: You must set the speaker ID before requesting an enrollment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SPEAKER_OPTED_OUT</code>: You cannot request an enrollment for an opted out speaker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONCURRENT_CHANGES</code>: The request could not be processed as the resource was modified by another
     * request during execution.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conflictType
     *        The type of conflict which caused a ConflictException. Possible types and the corresponding error messages
     *        are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DOMAIN_NOT_ACTIVE</code>: The domain is not active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANNOT_CHANGE_SPEAKER_AFTER_ENROLLMENT</code>: You cannot change the speaker ID after an enrollment
     *        has been requested.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENROLLMENT_ALREADY_EXISTS</code>: There is already an enrollment for this session.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPEAKER_NOT_SET</code>: You must set the speaker ID before requesting an enrollment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SPEAKER_OPTED_OUT</code>: You cannot request an enrollment for an opted out speaker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONCURRENT_CHANGES</code>: The request could not be processed as the resource was modified by
     *        another request during execution.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictType
     */

    public ConflictException withConflictType(ConflictType conflictType) {
        this.conflictType = conflictType.toString();
        return this;
    }

}
