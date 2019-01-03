/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The QualificationType data structure represents a Qualification type, a description of a property of a Worker that
 * must match the requirements of a HIT for the Worker to be able to accept the HIT. The type also describes how a
 * Worker can obtain a Qualification of that type, such as through a Qualification test.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/QualificationType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QualificationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the Qualification type. A Qualification type is given a Qualification type ID when you
     * call the CreateQualificationType operation.
     * </p>
     */
    private String qualificationTypeId;
    /**
     * <p>
     * The date and time the Qualification type was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The name of the Qualification type. The type name is used to identify the type, and to find the type using a
     * Qualification type search.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A long description for the Qualification type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * One or more words or phrases that describe theQualification type, separated by commas. The Keywords make the type
     * easier to find using a search.
     * </p>
     */
    private String keywords;
    /**
     * <p>
     * The status of the Qualification type. A Qualification type's status determines if users can apply to receive a
     * Qualification of this type, and if HITs can be created with requirements based on this type. Valid values are
     * Active | Inactive.
     * </p>
     */
    private String qualificationTypeStatus;
    /**
     * <p>
     * The questions for a Qualification test associated with this Qualification type that a user can take to obtain a
     * Qualification of this type. This parameter must be specified if AnswerKey is present. A Qualification type cannot
     * have both a specified Test parameter and an AutoGranted value of true.
     * </p>
     */
    private String test;
    /**
     * <p>
     * The amount of time, in seconds, given to a Worker to complete the Qualification test, beginning from the time the
     * Worker requests the Qualification.
     * </p>
     */
    private Long testDurationInSeconds;
    /**
     * <p>
     * The answers to the Qualification test specified in the Test parameter.
     * </p>
     */
    private String answerKey;
    /**
     * <p>
     * The amount of time, in seconds, Workers must wait after taking the Qualification test before they can take it
     * again. Workers can take a Qualification test multiple times if they were not granted the Qualification from a
     * previous attempt, or if the test offers a gradient score and they want a better score. If not specified, retries
     * are disabled and Workers can request a Qualification only once.
     * </p>
     */
    private Long retryDelayInSeconds;
    /**
     * <p>
     * Specifies whether the Qualification type is one that a user can request through the Amazon Mechanical Turk web
     * site, such as by taking a Qualification test. This value is False for Qualifications assigned automatically by
     * the system. Valid values are True | False.
     * </p>
     */
    private Boolean isRequestable;
    /**
     * <p>
     * Specifies that requests for the Qualification type are granted immediately, without prompting the Worker with a
     * Qualification test. Valid values are True | False.
     * </p>
     */
    private Boolean autoGranted;
    /**
     * <p>
     * The Qualification integer value to use for automatically granted Qualifications, if AutoGranted is true. This is
     * 1 by default.
     * </p>
     */
    private Integer autoGrantedValue;

    /**
     * <p>
     * A unique identifier for the Qualification type. A Qualification type is given a Qualification type ID when you
     * call the CreateQualificationType operation.
     * </p>
     * 
     * @param qualificationTypeId
     *        A unique identifier for the Qualification type. A Qualification type is given a Qualification type ID when
     *        you call the CreateQualificationType operation.
     */

    public void setQualificationTypeId(String qualificationTypeId) {
        this.qualificationTypeId = qualificationTypeId;
    }

    /**
     * <p>
     * A unique identifier for the Qualification type. A Qualification type is given a Qualification type ID when you
     * call the CreateQualificationType operation.
     * </p>
     * 
     * @return A unique identifier for the Qualification type. A Qualification type is given a Qualification type ID
     *         when you call the CreateQualificationType operation.
     */

    public String getQualificationTypeId() {
        return this.qualificationTypeId;
    }

    /**
     * <p>
     * A unique identifier for the Qualification type. A Qualification type is given a Qualification type ID when you
     * call the CreateQualificationType operation.
     * </p>
     * 
     * @param qualificationTypeId
     *        A unique identifier for the Qualification type. A Qualification type is given a Qualification type ID when
     *        you call the CreateQualificationType operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationType withQualificationTypeId(String qualificationTypeId) {
        setQualificationTypeId(qualificationTypeId);
        return this;
    }

    /**
     * <p>
     * The date and time the Qualification type was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time the Qualification type was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the Qualification type was created.
     * </p>
     * 
     * @return The date and time the Qualification type was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time the Qualification type was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time the Qualification type was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationType withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The name of the Qualification type. The type name is used to identify the type, and to find the type using a
     * Qualification type search.
     * </p>
     * 
     * @param name
     *        The name of the Qualification type. The type name is used to identify the type, and to find the type using
     *        a Qualification type search.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Qualification type. The type name is used to identify the type, and to find the type using a
     * Qualification type search.
     * </p>
     * 
     * @return The name of the Qualification type. The type name is used to identify the type, and to find the type
     *         using a Qualification type search.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Qualification type. The type name is used to identify the type, and to find the type using a
     * Qualification type search.
     * </p>
     * 
     * @param name
     *        The name of the Qualification type. The type name is used to identify the type, and to find the type using
     *        a Qualification type search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationType withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A long description for the Qualification type.
     * </p>
     * 
     * @param description
     *        A long description for the Qualification type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A long description for the Qualification type.
     * </p>
     * 
     * @return A long description for the Qualification type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A long description for the Qualification type.
     * </p>
     * 
     * @param description
     *        A long description for the Qualification type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationType withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * One or more words or phrases that describe theQualification type, separated by commas. The Keywords make the type
     * easier to find using a search.
     * </p>
     * 
     * @param keywords
     *        One or more words or phrases that describe theQualification type, separated by commas. The Keywords make
     *        the type easier to find using a search.
     */

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * <p>
     * One or more words or phrases that describe theQualification type, separated by commas. The Keywords make the type
     * easier to find using a search.
     * </p>
     * 
     * @return One or more words or phrases that describe theQualification type, separated by commas. The Keywords make
     *         the type easier to find using a search.
     */

    public String getKeywords() {
        return this.keywords;
    }

    /**
     * <p>
     * One or more words or phrases that describe theQualification type, separated by commas. The Keywords make the type
     * easier to find using a search.
     * </p>
     * 
     * @param keywords
     *        One or more words or phrases that describe theQualification type, separated by commas. The Keywords make
     *        the type easier to find using a search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationType withKeywords(String keywords) {
        setKeywords(keywords);
        return this;
    }

    /**
     * <p>
     * The status of the Qualification type. A Qualification type's status determines if users can apply to receive a
     * Qualification of this type, and if HITs can be created with requirements based on this type. Valid values are
     * Active | Inactive.
     * </p>
     * 
     * @param qualificationTypeStatus
     *        The status of the Qualification type. A Qualification type's status determines if users can apply to
     *        receive a Qualification of this type, and if HITs can be created with requirements based on this type.
     *        Valid values are Active | Inactive.
     * @see QualificationTypeStatus
     */

    public void setQualificationTypeStatus(String qualificationTypeStatus) {
        this.qualificationTypeStatus = qualificationTypeStatus;
    }

    /**
     * <p>
     * The status of the Qualification type. A Qualification type's status determines if users can apply to receive a
     * Qualification of this type, and if HITs can be created with requirements based on this type. Valid values are
     * Active | Inactive.
     * </p>
     * 
     * @return The status of the Qualification type. A Qualification type's status determines if users can apply to
     *         receive a Qualification of this type, and if HITs can be created with requirements based on this type.
     *         Valid values are Active | Inactive.
     * @see QualificationTypeStatus
     */

    public String getQualificationTypeStatus() {
        return this.qualificationTypeStatus;
    }

    /**
     * <p>
     * The status of the Qualification type. A Qualification type's status determines if users can apply to receive a
     * Qualification of this type, and if HITs can be created with requirements based on this type. Valid values are
     * Active | Inactive.
     * </p>
     * 
     * @param qualificationTypeStatus
     *        The status of the Qualification type. A Qualification type's status determines if users can apply to
     *        receive a Qualification of this type, and if HITs can be created with requirements based on this type.
     *        Valid values are Active | Inactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualificationTypeStatus
     */

    public QualificationType withQualificationTypeStatus(String qualificationTypeStatus) {
        setQualificationTypeStatus(qualificationTypeStatus);
        return this;
    }

    /**
     * <p>
     * The status of the Qualification type. A Qualification type's status determines if users can apply to receive a
     * Qualification of this type, and if HITs can be created with requirements based on this type. Valid values are
     * Active | Inactive.
     * </p>
     * 
     * @param qualificationTypeStatus
     *        The status of the Qualification type. A Qualification type's status determines if users can apply to
     *        receive a Qualification of this type, and if HITs can be created with requirements based on this type.
     *        Valid values are Active | Inactive.
     * @see QualificationTypeStatus
     */

    public void setQualificationTypeStatus(QualificationTypeStatus qualificationTypeStatus) {
        withQualificationTypeStatus(qualificationTypeStatus);
    }

    /**
     * <p>
     * The status of the Qualification type. A Qualification type's status determines if users can apply to receive a
     * Qualification of this type, and if HITs can be created with requirements based on this type. Valid values are
     * Active | Inactive.
     * </p>
     * 
     * @param qualificationTypeStatus
     *        The status of the Qualification type. A Qualification type's status determines if users can apply to
     *        receive a Qualification of this type, and if HITs can be created with requirements based on this type.
     *        Valid values are Active | Inactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualificationTypeStatus
     */

    public QualificationType withQualificationTypeStatus(QualificationTypeStatus qualificationTypeStatus) {
        this.qualificationTypeStatus = qualificationTypeStatus.toString();
        return this;
    }

    /**
     * <p>
     * The questions for a Qualification test associated with this Qualification type that a user can take to obtain a
     * Qualification of this type. This parameter must be specified if AnswerKey is present. A Qualification type cannot
     * have both a specified Test parameter and an AutoGranted value of true.
     * </p>
     * 
     * @param test
     *        The questions for a Qualification test associated with this Qualification type that a user can take to
     *        obtain a Qualification of this type. This parameter must be specified if AnswerKey is present. A
     *        Qualification type cannot have both a specified Test parameter and an AutoGranted value of true.
     */

    public void setTest(String test) {
        this.test = test;
    }

    /**
     * <p>
     * The questions for a Qualification test associated with this Qualification type that a user can take to obtain a
     * Qualification of this type. This parameter must be specified if AnswerKey is present. A Qualification type cannot
     * have both a specified Test parameter and an AutoGranted value of true.
     * </p>
     * 
     * @return The questions for a Qualification test associated with this Qualification type that a user can take to
     *         obtain a Qualification of this type. This parameter must be specified if AnswerKey is present. A
     *         Qualification type cannot have both a specified Test parameter and an AutoGranted value of true.
     */

    public String getTest() {
        return this.test;
    }

    /**
     * <p>
     * The questions for a Qualification test associated with this Qualification type that a user can take to obtain a
     * Qualification of this type. This parameter must be specified if AnswerKey is present. A Qualification type cannot
     * have both a specified Test parameter and an AutoGranted value of true.
     * </p>
     * 
     * @param test
     *        The questions for a Qualification test associated with this Qualification type that a user can take to
     *        obtain a Qualification of this type. This parameter must be specified if AnswerKey is present. A
     *        Qualification type cannot have both a specified Test parameter and an AutoGranted value of true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationType withTest(String test) {
        setTest(test);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, given to a Worker to complete the Qualification test, beginning from the time the
     * Worker requests the Qualification.
     * </p>
     * 
     * @param testDurationInSeconds
     *        The amount of time, in seconds, given to a Worker to complete the Qualification test, beginning from the
     *        time the Worker requests the Qualification.
     */

    public void setTestDurationInSeconds(Long testDurationInSeconds) {
        this.testDurationInSeconds = testDurationInSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, given to a Worker to complete the Qualification test, beginning from the time the
     * Worker requests the Qualification.
     * </p>
     * 
     * @return The amount of time, in seconds, given to a Worker to complete the Qualification test, beginning from the
     *         time the Worker requests the Qualification.
     */

    public Long getTestDurationInSeconds() {
        return this.testDurationInSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, given to a Worker to complete the Qualification test, beginning from the time the
     * Worker requests the Qualification.
     * </p>
     * 
     * @param testDurationInSeconds
     *        The amount of time, in seconds, given to a Worker to complete the Qualification test, beginning from the
     *        time the Worker requests the Qualification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationType withTestDurationInSeconds(Long testDurationInSeconds) {
        setTestDurationInSeconds(testDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * The answers to the Qualification test specified in the Test parameter.
     * </p>
     * 
     * @param answerKey
     *        The answers to the Qualification test specified in the Test parameter.
     */

    public void setAnswerKey(String answerKey) {
        this.answerKey = answerKey;
    }

    /**
     * <p>
     * The answers to the Qualification test specified in the Test parameter.
     * </p>
     * 
     * @return The answers to the Qualification test specified in the Test parameter.
     */

    public String getAnswerKey() {
        return this.answerKey;
    }

    /**
     * <p>
     * The answers to the Qualification test specified in the Test parameter.
     * </p>
     * 
     * @param answerKey
     *        The answers to the Qualification test specified in the Test parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationType withAnswerKey(String answerKey) {
        setAnswerKey(answerKey);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, Workers must wait after taking the Qualification test before they can take it
     * again. Workers can take a Qualification test multiple times if they were not granted the Qualification from a
     * previous attempt, or if the test offers a gradient score and they want a better score. If not specified, retries
     * are disabled and Workers can request a Qualification only once.
     * </p>
     * 
     * @param retryDelayInSeconds
     *        The amount of time, in seconds, Workers must wait after taking the Qualification test before they can take
     *        it again. Workers can take a Qualification test multiple times if they were not granted the Qualification
     *        from a previous attempt, or if the test offers a gradient score and they want a better score. If not
     *        specified, retries are disabled and Workers can request a Qualification only once.
     */

    public void setRetryDelayInSeconds(Long retryDelayInSeconds) {
        this.retryDelayInSeconds = retryDelayInSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, Workers must wait after taking the Qualification test before they can take it
     * again. Workers can take a Qualification test multiple times if they were not granted the Qualification from a
     * previous attempt, or if the test offers a gradient score and they want a better score. If not specified, retries
     * are disabled and Workers can request a Qualification only once.
     * </p>
     * 
     * @return The amount of time, in seconds, Workers must wait after taking the Qualification test before they can
     *         take it again. Workers can take a Qualification test multiple times if they were not granted the
     *         Qualification from a previous attempt, or if the test offers a gradient score and they want a better
     *         score. If not specified, retries are disabled and Workers can request a Qualification only once.
     */

    public Long getRetryDelayInSeconds() {
        return this.retryDelayInSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, Workers must wait after taking the Qualification test before they can take it
     * again. Workers can take a Qualification test multiple times if they were not granted the Qualification from a
     * previous attempt, or if the test offers a gradient score and they want a better score. If not specified, retries
     * are disabled and Workers can request a Qualification only once.
     * </p>
     * 
     * @param retryDelayInSeconds
     *        The amount of time, in seconds, Workers must wait after taking the Qualification test before they can take
     *        it again. Workers can take a Qualification test multiple times if they were not granted the Qualification
     *        from a previous attempt, or if the test offers a gradient score and they want a better score. If not
     *        specified, retries are disabled and Workers can request a Qualification only once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationType withRetryDelayInSeconds(Long retryDelayInSeconds) {
        setRetryDelayInSeconds(retryDelayInSeconds);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Qualification type is one that a user can request through the Amazon Mechanical Turk web
     * site, such as by taking a Qualification test. This value is False for Qualifications assigned automatically by
     * the system. Valid values are True | False.
     * </p>
     * 
     * @param isRequestable
     *        Specifies whether the Qualification type is one that a user can request through the Amazon Mechanical Turk
     *        web site, such as by taking a Qualification test. This value is False for Qualifications assigned
     *        automatically by the system. Valid values are True | False.
     */

    public void setIsRequestable(Boolean isRequestable) {
        this.isRequestable = isRequestable;
    }

    /**
     * <p>
     * Specifies whether the Qualification type is one that a user can request through the Amazon Mechanical Turk web
     * site, such as by taking a Qualification test. This value is False for Qualifications assigned automatically by
     * the system. Valid values are True | False.
     * </p>
     * 
     * @return Specifies whether the Qualification type is one that a user can request through the Amazon Mechanical
     *         Turk web site, such as by taking a Qualification test. This value is False for Qualifications assigned
     *         automatically by the system. Valid values are True | False.
     */

    public Boolean getIsRequestable() {
        return this.isRequestable;
    }

    /**
     * <p>
     * Specifies whether the Qualification type is one that a user can request through the Amazon Mechanical Turk web
     * site, such as by taking a Qualification test. This value is False for Qualifications assigned automatically by
     * the system. Valid values are True | False.
     * </p>
     * 
     * @param isRequestable
     *        Specifies whether the Qualification type is one that a user can request through the Amazon Mechanical Turk
     *        web site, such as by taking a Qualification test. This value is False for Qualifications assigned
     *        automatically by the system. Valid values are True | False.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationType withIsRequestable(Boolean isRequestable) {
        setIsRequestable(isRequestable);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Qualification type is one that a user can request through the Amazon Mechanical Turk web
     * site, such as by taking a Qualification test. This value is False for Qualifications assigned automatically by
     * the system. Valid values are True | False.
     * </p>
     * 
     * @return Specifies whether the Qualification type is one that a user can request through the Amazon Mechanical
     *         Turk web site, such as by taking a Qualification test. This value is False for Qualifications assigned
     *         automatically by the system. Valid values are True | False.
     */

    public Boolean isRequestable() {
        return this.isRequestable;
    }

    /**
     * <p>
     * Specifies that requests for the Qualification type are granted immediately, without prompting the Worker with a
     * Qualification test. Valid values are True | False.
     * </p>
     * 
     * @param autoGranted
     *        Specifies that requests for the Qualification type are granted immediately, without prompting the Worker
     *        with a Qualification test. Valid values are True | False.
     */

    public void setAutoGranted(Boolean autoGranted) {
        this.autoGranted = autoGranted;
    }

    /**
     * <p>
     * Specifies that requests for the Qualification type are granted immediately, without prompting the Worker with a
     * Qualification test. Valid values are True | False.
     * </p>
     * 
     * @return Specifies that requests for the Qualification type are granted immediately, without prompting the Worker
     *         with a Qualification test. Valid values are True | False.
     */

    public Boolean getAutoGranted() {
        return this.autoGranted;
    }

    /**
     * <p>
     * Specifies that requests for the Qualification type are granted immediately, without prompting the Worker with a
     * Qualification test. Valid values are True | False.
     * </p>
     * 
     * @param autoGranted
     *        Specifies that requests for the Qualification type are granted immediately, without prompting the Worker
     *        with a Qualification test. Valid values are True | False.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationType withAutoGranted(Boolean autoGranted) {
        setAutoGranted(autoGranted);
        return this;
    }

    /**
     * <p>
     * Specifies that requests for the Qualification type are granted immediately, without prompting the Worker with a
     * Qualification test. Valid values are True | False.
     * </p>
     * 
     * @return Specifies that requests for the Qualification type are granted immediately, without prompting the Worker
     *         with a Qualification test. Valid values are True | False.
     */

    public Boolean isAutoGranted() {
        return this.autoGranted;
    }

    /**
     * <p>
     * The Qualification integer value to use for automatically granted Qualifications, if AutoGranted is true. This is
     * 1 by default.
     * </p>
     * 
     * @param autoGrantedValue
     *        The Qualification integer value to use for automatically granted Qualifications, if AutoGranted is true.
     *        This is 1 by default.
     */

    public void setAutoGrantedValue(Integer autoGrantedValue) {
        this.autoGrantedValue = autoGrantedValue;
    }

    /**
     * <p>
     * The Qualification integer value to use for automatically granted Qualifications, if AutoGranted is true. This is
     * 1 by default.
     * </p>
     * 
     * @return The Qualification integer value to use for automatically granted Qualifications, if AutoGranted is true.
     *         This is 1 by default.
     */

    public Integer getAutoGrantedValue() {
        return this.autoGrantedValue;
    }

    /**
     * <p>
     * The Qualification integer value to use for automatically granted Qualifications, if AutoGranted is true. This is
     * 1 by default.
     * </p>
     * 
     * @param autoGrantedValue
     *        The Qualification integer value to use for automatically granted Qualifications, if AutoGranted is true.
     *        This is 1 by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationType withAutoGrantedValue(Integer autoGrantedValue) {
        setAutoGrantedValue(autoGrantedValue);
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
        if (getQualificationTypeId() != null)
            sb.append("QualificationTypeId: ").append(getQualificationTypeId()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKeywords() != null)
            sb.append("Keywords: ").append(getKeywords()).append(",");
        if (getQualificationTypeStatus() != null)
            sb.append("QualificationTypeStatus: ").append(getQualificationTypeStatus()).append(",");
        if (getTest() != null)
            sb.append("Test: ").append(getTest()).append(",");
        if (getTestDurationInSeconds() != null)
            sb.append("TestDurationInSeconds: ").append(getTestDurationInSeconds()).append(",");
        if (getAnswerKey() != null)
            sb.append("AnswerKey: ").append(getAnswerKey()).append(",");
        if (getRetryDelayInSeconds() != null)
            sb.append("RetryDelayInSeconds: ").append(getRetryDelayInSeconds()).append(",");
        if (getIsRequestable() != null)
            sb.append("IsRequestable: ").append(getIsRequestable()).append(",");
        if (getAutoGranted() != null)
            sb.append("AutoGranted: ").append(getAutoGranted()).append(",");
        if (getAutoGrantedValue() != null)
            sb.append("AutoGrantedValue: ").append(getAutoGrantedValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QualificationType == false)
            return false;
        QualificationType other = (QualificationType) obj;
        if (other.getQualificationTypeId() == null ^ this.getQualificationTypeId() == null)
            return false;
        if (other.getQualificationTypeId() != null && other.getQualificationTypeId().equals(this.getQualificationTypeId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKeywords() == null ^ this.getKeywords() == null)
            return false;
        if (other.getKeywords() != null && other.getKeywords().equals(this.getKeywords()) == false)
            return false;
        if (other.getQualificationTypeStatus() == null ^ this.getQualificationTypeStatus() == null)
            return false;
        if (other.getQualificationTypeStatus() != null && other.getQualificationTypeStatus().equals(this.getQualificationTypeStatus()) == false)
            return false;
        if (other.getTest() == null ^ this.getTest() == null)
            return false;
        if (other.getTest() != null && other.getTest().equals(this.getTest()) == false)
            return false;
        if (other.getTestDurationInSeconds() == null ^ this.getTestDurationInSeconds() == null)
            return false;
        if (other.getTestDurationInSeconds() != null && other.getTestDurationInSeconds().equals(this.getTestDurationInSeconds()) == false)
            return false;
        if (other.getAnswerKey() == null ^ this.getAnswerKey() == null)
            return false;
        if (other.getAnswerKey() != null && other.getAnswerKey().equals(this.getAnswerKey()) == false)
            return false;
        if (other.getRetryDelayInSeconds() == null ^ this.getRetryDelayInSeconds() == null)
            return false;
        if (other.getRetryDelayInSeconds() != null && other.getRetryDelayInSeconds().equals(this.getRetryDelayInSeconds()) == false)
            return false;
        if (other.getIsRequestable() == null ^ this.getIsRequestable() == null)
            return false;
        if (other.getIsRequestable() != null && other.getIsRequestable().equals(this.getIsRequestable()) == false)
            return false;
        if (other.getAutoGranted() == null ^ this.getAutoGranted() == null)
            return false;
        if (other.getAutoGranted() != null && other.getAutoGranted().equals(this.getAutoGranted()) == false)
            return false;
        if (other.getAutoGrantedValue() == null ^ this.getAutoGrantedValue() == null)
            return false;
        if (other.getAutoGrantedValue() != null && other.getAutoGrantedValue().equals(this.getAutoGrantedValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQualificationTypeId() == null) ? 0 : getQualificationTypeId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        hashCode = prime * hashCode + ((getQualificationTypeStatus() == null) ? 0 : getQualificationTypeStatus().hashCode());
        hashCode = prime * hashCode + ((getTest() == null) ? 0 : getTest().hashCode());
        hashCode = prime * hashCode + ((getTestDurationInSeconds() == null) ? 0 : getTestDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getAnswerKey() == null) ? 0 : getAnswerKey().hashCode());
        hashCode = prime * hashCode + ((getRetryDelayInSeconds() == null) ? 0 : getRetryDelayInSeconds().hashCode());
        hashCode = prime * hashCode + ((getIsRequestable() == null) ? 0 : getIsRequestable().hashCode());
        hashCode = prime * hashCode + ((getAutoGranted() == null) ? 0 : getAutoGranted().hashCode());
        hashCode = prime * hashCode + ((getAutoGrantedValue() == null) ? 0 : getAutoGrantedValue().hashCode());
        return hashCode;
    }

    @Override
    public QualificationType clone() {
        try {
            return (QualificationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.QualificationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
