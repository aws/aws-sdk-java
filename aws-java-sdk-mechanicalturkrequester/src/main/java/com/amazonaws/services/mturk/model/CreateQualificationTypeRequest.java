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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateQualificationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateQualificationTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name you give to the Qualification type. The type name is used to represent the Qualification to Workers, and
     * to find the type using a Qualification type search. It must be unique across all of your Qualification types.
     * </p>
     */
    private String name;
    /**
     * <p>
     * One or more words or phrases that describe the Qualification type, separated by commas. The keywords of a type
     * make the type easier to find during a search.
     * </p>
     */
    private String keywords;
    /**
     * <p>
     * A long description for the Qualification type. On the Amazon Mechanical Turk website, the long description is
     * displayed when a Worker examines a Qualification type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The initial status of the Qualification type.
     * </p>
     * <p>
     * Constraints: Valid values are: Active | Inactive
     * </p>
     */
    private String qualificationTypeStatus;
    /**
     * <p>
     * The number of seconds that a Worker must wait after requesting a Qualification of the Qualification type before
     * the worker can retry the Qualification request.
     * </p>
     * <p>
     * Constraints: None. If not specified, retries are disabled and Workers can request a Qualification of this type
     * only once, even if the Worker has not been granted the Qualification. It is not possible to disable retries for a
     * Qualification type after it has been created with retries enabled. If you want to disable retries, you must
     * delete existing retry-enabled Qualification type and then create a new Qualification type with retries disabled.
     * </p>
     */
    private Long retryDelayInSeconds;
    /**
     * <p>
     * The questions for the Qualification test a Worker must answer correctly to obtain a Qualification of this type.
     * If this parameter is specified, <code>TestDurationInSeconds</code> must also be specified.
     * </p>
     * <p>
     * Constraints: Must not be longer than 65535 bytes. Must be a QuestionForm data structure. This parameter cannot be
     * specified if AutoGranted is true.
     * </p>
     * <p>
     * Constraints: None. If not specified, the Worker may request the Qualification without answering any questions.
     * </p>
     */
    private String test;
    /**
     * <p>
     * The answers to the Qualification test specified in the Test parameter, in the form of an AnswerKey data
     * structure.
     * </p>
     * <p>
     * Constraints: Must not be longer than 65535 bytes.
     * </p>
     * <p>
     * Constraints: None. If not specified, you must process Qualification requests manually.
     * </p>
     */
    private String answerKey;
    /**
     * <p>
     * The number of seconds the Worker has to complete the Qualification test, starting from the time the Worker
     * requests the Qualification.
     * </p>
     */
    private Long testDurationInSeconds;
    /**
     * <p>
     * Specifies whether requests for the Qualification type are granted immediately, without prompting the Worker with
     * a Qualification test.
     * </p>
     * <p>
     * Constraints: If the Test parameter is specified, this parameter cannot be true.
     * </p>
     */
    private Boolean autoGranted;
    /**
     * <p>
     * The Qualification value to use for automatically granted Qualifications. This parameter is used only if the
     * AutoGranted parameter is true.
     * </p>
     */
    private Integer autoGrantedValue;

    /**
     * <p>
     * The name you give to the Qualification type. The type name is used to represent the Qualification to Workers, and
     * to find the type using a Qualification type search. It must be unique across all of your Qualification types.
     * </p>
     * 
     * @param name
     *        The name you give to the Qualification type. The type name is used to represent the Qualification to
     *        Workers, and to find the type using a Qualification type search. It must be unique across all of your
     *        Qualification types.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name you give to the Qualification type. The type name is used to represent the Qualification to Workers, and
     * to find the type using a Qualification type search. It must be unique across all of your Qualification types.
     * </p>
     * 
     * @return The name you give to the Qualification type. The type name is used to represent the Qualification to
     *         Workers, and to find the type using a Qualification type search. It must be unique across all of your
     *         Qualification types.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name you give to the Qualification type. The type name is used to represent the Qualification to Workers, and
     * to find the type using a Qualification type search. It must be unique across all of your Qualification types.
     * </p>
     * 
     * @param name
     *        The name you give to the Qualification type. The type name is used to represent the Qualification to
     *        Workers, and to find the type using a Qualification type search. It must be unique across all of your
     *        Qualification types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQualificationTypeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * One or more words or phrases that describe the Qualification type, separated by commas. The keywords of a type
     * make the type easier to find during a search.
     * </p>
     * 
     * @param keywords
     *        One or more words or phrases that describe the Qualification type, separated by commas. The keywords of a
     *        type make the type easier to find during a search.
     */

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * <p>
     * One or more words or phrases that describe the Qualification type, separated by commas. The keywords of a type
     * make the type easier to find during a search.
     * </p>
     * 
     * @return One or more words or phrases that describe the Qualification type, separated by commas. The keywords of a
     *         type make the type easier to find during a search.
     */

    public String getKeywords() {
        return this.keywords;
    }

    /**
     * <p>
     * One or more words or phrases that describe the Qualification type, separated by commas. The keywords of a type
     * make the type easier to find during a search.
     * </p>
     * 
     * @param keywords
     *        One or more words or phrases that describe the Qualification type, separated by commas. The keywords of a
     *        type make the type easier to find during a search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQualificationTypeRequest withKeywords(String keywords) {
        setKeywords(keywords);
        return this;
    }

    /**
     * <p>
     * A long description for the Qualification type. On the Amazon Mechanical Turk website, the long description is
     * displayed when a Worker examines a Qualification type.
     * </p>
     * 
     * @param description
     *        A long description for the Qualification type. On the Amazon Mechanical Turk website, the long description
     *        is displayed when a Worker examines a Qualification type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A long description for the Qualification type. On the Amazon Mechanical Turk website, the long description is
     * displayed when a Worker examines a Qualification type.
     * </p>
     * 
     * @return A long description for the Qualification type. On the Amazon Mechanical Turk website, the long
     *         description is displayed when a Worker examines a Qualification type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A long description for the Qualification type. On the Amazon Mechanical Turk website, the long description is
     * displayed when a Worker examines a Qualification type.
     * </p>
     * 
     * @param description
     *        A long description for the Qualification type. On the Amazon Mechanical Turk website, the long description
     *        is displayed when a Worker examines a Qualification type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQualificationTypeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The initial status of the Qualification type.
     * </p>
     * <p>
     * Constraints: Valid values are: Active | Inactive
     * </p>
     * 
     * @param qualificationTypeStatus
     *        The initial status of the Qualification type.</p>
     *        <p>
     *        Constraints: Valid values are: Active | Inactive
     * @see QualificationTypeStatus
     */

    public void setQualificationTypeStatus(String qualificationTypeStatus) {
        this.qualificationTypeStatus = qualificationTypeStatus;
    }

    /**
     * <p>
     * The initial status of the Qualification type.
     * </p>
     * <p>
     * Constraints: Valid values are: Active | Inactive
     * </p>
     * 
     * @return The initial status of the Qualification type.</p>
     *         <p>
     *         Constraints: Valid values are: Active | Inactive
     * @see QualificationTypeStatus
     */

    public String getQualificationTypeStatus() {
        return this.qualificationTypeStatus;
    }

    /**
     * <p>
     * The initial status of the Qualification type.
     * </p>
     * <p>
     * Constraints: Valid values are: Active | Inactive
     * </p>
     * 
     * @param qualificationTypeStatus
     *        The initial status of the Qualification type.</p>
     *        <p>
     *        Constraints: Valid values are: Active | Inactive
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualificationTypeStatus
     */

    public CreateQualificationTypeRequest withQualificationTypeStatus(String qualificationTypeStatus) {
        setQualificationTypeStatus(qualificationTypeStatus);
        return this;
    }

    /**
     * <p>
     * The initial status of the Qualification type.
     * </p>
     * <p>
     * Constraints: Valid values are: Active | Inactive
     * </p>
     * 
     * @param qualificationTypeStatus
     *        The initial status of the Qualification type.</p>
     *        <p>
     *        Constraints: Valid values are: Active | Inactive
     * @see QualificationTypeStatus
     */

    public void setQualificationTypeStatus(QualificationTypeStatus qualificationTypeStatus) {
        withQualificationTypeStatus(qualificationTypeStatus);
    }

    /**
     * <p>
     * The initial status of the Qualification type.
     * </p>
     * <p>
     * Constraints: Valid values are: Active | Inactive
     * </p>
     * 
     * @param qualificationTypeStatus
     *        The initial status of the Qualification type.</p>
     *        <p>
     *        Constraints: Valid values are: Active | Inactive
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualificationTypeStatus
     */

    public CreateQualificationTypeRequest withQualificationTypeStatus(QualificationTypeStatus qualificationTypeStatus) {
        this.qualificationTypeStatus = qualificationTypeStatus.toString();
        return this;
    }

    /**
     * <p>
     * The number of seconds that a Worker must wait after requesting a Qualification of the Qualification type before
     * the worker can retry the Qualification request.
     * </p>
     * <p>
     * Constraints: None. If not specified, retries are disabled and Workers can request a Qualification of this type
     * only once, even if the Worker has not been granted the Qualification. It is not possible to disable retries for a
     * Qualification type after it has been created with retries enabled. If you want to disable retries, you must
     * delete existing retry-enabled Qualification type and then create a new Qualification type with retries disabled.
     * </p>
     * 
     * @param retryDelayInSeconds
     *        The number of seconds that a Worker must wait after requesting a Qualification of the Qualification type
     *        before the worker can retry the Qualification request.</p>
     *        <p>
     *        Constraints: None. If not specified, retries are disabled and Workers can request a Qualification of this
     *        type only once, even if the Worker has not been granted the Qualification. It is not possible to disable
     *        retries for a Qualification type after it has been created with retries enabled. If you want to disable
     *        retries, you must delete existing retry-enabled Qualification type and then create a new Qualification
     *        type with retries disabled.
     */

    public void setRetryDelayInSeconds(Long retryDelayInSeconds) {
        this.retryDelayInSeconds = retryDelayInSeconds;
    }

    /**
     * <p>
     * The number of seconds that a Worker must wait after requesting a Qualification of the Qualification type before
     * the worker can retry the Qualification request.
     * </p>
     * <p>
     * Constraints: None. If not specified, retries are disabled and Workers can request a Qualification of this type
     * only once, even if the Worker has not been granted the Qualification. It is not possible to disable retries for a
     * Qualification type after it has been created with retries enabled. If you want to disable retries, you must
     * delete existing retry-enabled Qualification type and then create a new Qualification type with retries disabled.
     * </p>
     * 
     * @return The number of seconds that a Worker must wait after requesting a Qualification of the Qualification type
     *         before the worker can retry the Qualification request.</p>
     *         <p>
     *         Constraints: None. If not specified, retries are disabled and Workers can request a Qualification of this
     *         type only once, even if the Worker has not been granted the Qualification. It is not possible to disable
     *         retries for a Qualification type after it has been created with retries enabled. If you want to disable
     *         retries, you must delete existing retry-enabled Qualification type and then create a new Qualification
     *         type with retries disabled.
     */

    public Long getRetryDelayInSeconds() {
        return this.retryDelayInSeconds;
    }

    /**
     * <p>
     * The number of seconds that a Worker must wait after requesting a Qualification of the Qualification type before
     * the worker can retry the Qualification request.
     * </p>
     * <p>
     * Constraints: None. If not specified, retries are disabled and Workers can request a Qualification of this type
     * only once, even if the Worker has not been granted the Qualification. It is not possible to disable retries for a
     * Qualification type after it has been created with retries enabled. If you want to disable retries, you must
     * delete existing retry-enabled Qualification type and then create a new Qualification type with retries disabled.
     * </p>
     * 
     * @param retryDelayInSeconds
     *        The number of seconds that a Worker must wait after requesting a Qualification of the Qualification type
     *        before the worker can retry the Qualification request.</p>
     *        <p>
     *        Constraints: None. If not specified, retries are disabled and Workers can request a Qualification of this
     *        type only once, even if the Worker has not been granted the Qualification. It is not possible to disable
     *        retries for a Qualification type after it has been created with retries enabled. If you want to disable
     *        retries, you must delete existing retry-enabled Qualification type and then create a new Qualification
     *        type with retries disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQualificationTypeRequest withRetryDelayInSeconds(Long retryDelayInSeconds) {
        setRetryDelayInSeconds(retryDelayInSeconds);
        return this;
    }

    /**
     * <p>
     * The questions for the Qualification test a Worker must answer correctly to obtain a Qualification of this type.
     * If this parameter is specified, <code>TestDurationInSeconds</code> must also be specified.
     * </p>
     * <p>
     * Constraints: Must not be longer than 65535 bytes. Must be a QuestionForm data structure. This parameter cannot be
     * specified if AutoGranted is true.
     * </p>
     * <p>
     * Constraints: None. If not specified, the Worker may request the Qualification without answering any questions.
     * </p>
     * 
     * @param test
     *        The questions for the Qualification test a Worker must answer correctly to obtain a Qualification of this
     *        type. If this parameter is specified, <code>TestDurationInSeconds</code> must also be specified. </p>
     *        <p>
     *        Constraints: Must not be longer than 65535 bytes. Must be a QuestionForm data structure. This parameter
     *        cannot be specified if AutoGranted is true.
     *        </p>
     *        <p>
     *        Constraints: None. If not specified, the Worker may request the Qualification without answering any
     *        questions.
     */

    public void setTest(String test) {
        this.test = test;
    }

    /**
     * <p>
     * The questions for the Qualification test a Worker must answer correctly to obtain a Qualification of this type.
     * If this parameter is specified, <code>TestDurationInSeconds</code> must also be specified.
     * </p>
     * <p>
     * Constraints: Must not be longer than 65535 bytes. Must be a QuestionForm data structure. This parameter cannot be
     * specified if AutoGranted is true.
     * </p>
     * <p>
     * Constraints: None. If not specified, the Worker may request the Qualification without answering any questions.
     * </p>
     * 
     * @return The questions for the Qualification test a Worker must answer correctly to obtain a Qualification of this
     *         type. If this parameter is specified, <code>TestDurationInSeconds</code> must also be specified. </p>
     *         <p>
     *         Constraints: Must not be longer than 65535 bytes. Must be a QuestionForm data structure. This parameter
     *         cannot be specified if AutoGranted is true.
     *         </p>
     *         <p>
     *         Constraints: None. If not specified, the Worker may request the Qualification without answering any
     *         questions.
     */

    public String getTest() {
        return this.test;
    }

    /**
     * <p>
     * The questions for the Qualification test a Worker must answer correctly to obtain a Qualification of this type.
     * If this parameter is specified, <code>TestDurationInSeconds</code> must also be specified.
     * </p>
     * <p>
     * Constraints: Must not be longer than 65535 bytes. Must be a QuestionForm data structure. This parameter cannot be
     * specified if AutoGranted is true.
     * </p>
     * <p>
     * Constraints: None. If not specified, the Worker may request the Qualification without answering any questions.
     * </p>
     * 
     * @param test
     *        The questions for the Qualification test a Worker must answer correctly to obtain a Qualification of this
     *        type. If this parameter is specified, <code>TestDurationInSeconds</code> must also be specified. </p>
     *        <p>
     *        Constraints: Must not be longer than 65535 bytes. Must be a QuestionForm data structure. This parameter
     *        cannot be specified if AutoGranted is true.
     *        </p>
     *        <p>
     *        Constraints: None. If not specified, the Worker may request the Qualification without answering any
     *        questions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQualificationTypeRequest withTest(String test) {
        setTest(test);
        return this;
    }

    /**
     * <p>
     * The answers to the Qualification test specified in the Test parameter, in the form of an AnswerKey data
     * structure.
     * </p>
     * <p>
     * Constraints: Must not be longer than 65535 bytes.
     * </p>
     * <p>
     * Constraints: None. If not specified, you must process Qualification requests manually.
     * </p>
     * 
     * @param answerKey
     *        The answers to the Qualification test specified in the Test parameter, in the form of an AnswerKey data
     *        structure.</p>
     *        <p>
     *        Constraints: Must not be longer than 65535 bytes.
     *        </p>
     *        <p>
     *        Constraints: None. If not specified, you must process Qualification requests manually.
     */

    public void setAnswerKey(String answerKey) {
        this.answerKey = answerKey;
    }

    /**
     * <p>
     * The answers to the Qualification test specified in the Test parameter, in the form of an AnswerKey data
     * structure.
     * </p>
     * <p>
     * Constraints: Must not be longer than 65535 bytes.
     * </p>
     * <p>
     * Constraints: None. If not specified, you must process Qualification requests manually.
     * </p>
     * 
     * @return The answers to the Qualification test specified in the Test parameter, in the form of an AnswerKey data
     *         structure.</p>
     *         <p>
     *         Constraints: Must not be longer than 65535 bytes.
     *         </p>
     *         <p>
     *         Constraints: None. If not specified, you must process Qualification requests manually.
     */

    public String getAnswerKey() {
        return this.answerKey;
    }

    /**
     * <p>
     * The answers to the Qualification test specified in the Test parameter, in the form of an AnswerKey data
     * structure.
     * </p>
     * <p>
     * Constraints: Must not be longer than 65535 bytes.
     * </p>
     * <p>
     * Constraints: None. If not specified, you must process Qualification requests manually.
     * </p>
     * 
     * @param answerKey
     *        The answers to the Qualification test specified in the Test parameter, in the form of an AnswerKey data
     *        structure.</p>
     *        <p>
     *        Constraints: Must not be longer than 65535 bytes.
     *        </p>
     *        <p>
     *        Constraints: None. If not specified, you must process Qualification requests manually.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQualificationTypeRequest withAnswerKey(String answerKey) {
        setAnswerKey(answerKey);
        return this;
    }

    /**
     * <p>
     * The number of seconds the Worker has to complete the Qualification test, starting from the time the Worker
     * requests the Qualification.
     * </p>
     * 
     * @param testDurationInSeconds
     *        The number of seconds the Worker has to complete the Qualification test, starting from the time the Worker
     *        requests the Qualification.
     */

    public void setTestDurationInSeconds(Long testDurationInSeconds) {
        this.testDurationInSeconds = testDurationInSeconds;
    }

    /**
     * <p>
     * The number of seconds the Worker has to complete the Qualification test, starting from the time the Worker
     * requests the Qualification.
     * </p>
     * 
     * @return The number of seconds the Worker has to complete the Qualification test, starting from the time the
     *         Worker requests the Qualification.
     */

    public Long getTestDurationInSeconds() {
        return this.testDurationInSeconds;
    }

    /**
     * <p>
     * The number of seconds the Worker has to complete the Qualification test, starting from the time the Worker
     * requests the Qualification.
     * </p>
     * 
     * @param testDurationInSeconds
     *        The number of seconds the Worker has to complete the Qualification test, starting from the time the Worker
     *        requests the Qualification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQualificationTypeRequest withTestDurationInSeconds(Long testDurationInSeconds) {
        setTestDurationInSeconds(testDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * Specifies whether requests for the Qualification type are granted immediately, without prompting the Worker with
     * a Qualification test.
     * </p>
     * <p>
     * Constraints: If the Test parameter is specified, this parameter cannot be true.
     * </p>
     * 
     * @param autoGranted
     *        Specifies whether requests for the Qualification type are granted immediately, without prompting the
     *        Worker with a Qualification test.</p>
     *        <p>
     *        Constraints: If the Test parameter is specified, this parameter cannot be true.
     */

    public void setAutoGranted(Boolean autoGranted) {
        this.autoGranted = autoGranted;
    }

    /**
     * <p>
     * Specifies whether requests for the Qualification type are granted immediately, without prompting the Worker with
     * a Qualification test.
     * </p>
     * <p>
     * Constraints: If the Test parameter is specified, this parameter cannot be true.
     * </p>
     * 
     * @return Specifies whether requests for the Qualification type are granted immediately, without prompting the
     *         Worker with a Qualification test.</p>
     *         <p>
     *         Constraints: If the Test parameter is specified, this parameter cannot be true.
     */

    public Boolean getAutoGranted() {
        return this.autoGranted;
    }

    /**
     * <p>
     * Specifies whether requests for the Qualification type are granted immediately, without prompting the Worker with
     * a Qualification test.
     * </p>
     * <p>
     * Constraints: If the Test parameter is specified, this parameter cannot be true.
     * </p>
     * 
     * @param autoGranted
     *        Specifies whether requests for the Qualification type are granted immediately, without prompting the
     *        Worker with a Qualification test.</p>
     *        <p>
     *        Constraints: If the Test parameter is specified, this parameter cannot be true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQualificationTypeRequest withAutoGranted(Boolean autoGranted) {
        setAutoGranted(autoGranted);
        return this;
    }

    /**
     * <p>
     * Specifies whether requests for the Qualification type are granted immediately, without prompting the Worker with
     * a Qualification test.
     * </p>
     * <p>
     * Constraints: If the Test parameter is specified, this parameter cannot be true.
     * </p>
     * 
     * @return Specifies whether requests for the Qualification type are granted immediately, without prompting the
     *         Worker with a Qualification test.</p>
     *         <p>
     *         Constraints: If the Test parameter is specified, this parameter cannot be true.
     */

    public Boolean isAutoGranted() {
        return this.autoGranted;
    }

    /**
     * <p>
     * The Qualification value to use for automatically granted Qualifications. This parameter is used only if the
     * AutoGranted parameter is true.
     * </p>
     * 
     * @param autoGrantedValue
     *        The Qualification value to use for automatically granted Qualifications. This parameter is used only if
     *        the AutoGranted parameter is true.
     */

    public void setAutoGrantedValue(Integer autoGrantedValue) {
        this.autoGrantedValue = autoGrantedValue;
    }

    /**
     * <p>
     * The Qualification value to use for automatically granted Qualifications. This parameter is used only if the
     * AutoGranted parameter is true.
     * </p>
     * 
     * @return The Qualification value to use for automatically granted Qualifications. This parameter is used only if
     *         the AutoGranted parameter is true.
     */

    public Integer getAutoGrantedValue() {
        return this.autoGrantedValue;
    }

    /**
     * <p>
     * The Qualification value to use for automatically granted Qualifications. This parameter is used only if the
     * AutoGranted parameter is true.
     * </p>
     * 
     * @param autoGrantedValue
     *        The Qualification value to use for automatically granted Qualifications. This parameter is used only if
     *        the AutoGranted parameter is true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQualificationTypeRequest withAutoGrantedValue(Integer autoGrantedValue) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getKeywords() != null)
            sb.append("Keywords: ").append(getKeywords()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getQualificationTypeStatus() != null)
            sb.append("QualificationTypeStatus: ").append(getQualificationTypeStatus()).append(",");
        if (getRetryDelayInSeconds() != null)
            sb.append("RetryDelayInSeconds: ").append(getRetryDelayInSeconds()).append(",");
        if (getTest() != null)
            sb.append("Test: ").append(getTest()).append(",");
        if (getAnswerKey() != null)
            sb.append("AnswerKey: ").append(getAnswerKey()).append(",");
        if (getTestDurationInSeconds() != null)
            sb.append("TestDurationInSeconds: ").append(getTestDurationInSeconds()).append(",");
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

        if (obj instanceof CreateQualificationTypeRequest == false)
            return false;
        CreateQualificationTypeRequest other = (CreateQualificationTypeRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getKeywords() == null ^ this.getKeywords() == null)
            return false;
        if (other.getKeywords() != null && other.getKeywords().equals(this.getKeywords()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getQualificationTypeStatus() == null ^ this.getQualificationTypeStatus() == null)
            return false;
        if (other.getQualificationTypeStatus() != null && other.getQualificationTypeStatus().equals(this.getQualificationTypeStatus()) == false)
            return false;
        if (other.getRetryDelayInSeconds() == null ^ this.getRetryDelayInSeconds() == null)
            return false;
        if (other.getRetryDelayInSeconds() != null && other.getRetryDelayInSeconds().equals(this.getRetryDelayInSeconds()) == false)
            return false;
        if (other.getTest() == null ^ this.getTest() == null)
            return false;
        if (other.getTest() != null && other.getTest().equals(this.getTest()) == false)
            return false;
        if (other.getAnswerKey() == null ^ this.getAnswerKey() == null)
            return false;
        if (other.getAnswerKey() != null && other.getAnswerKey().equals(this.getAnswerKey()) == false)
            return false;
        if (other.getTestDurationInSeconds() == null ^ this.getTestDurationInSeconds() == null)
            return false;
        if (other.getTestDurationInSeconds() != null && other.getTestDurationInSeconds().equals(this.getTestDurationInSeconds()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getQualificationTypeStatus() == null) ? 0 : getQualificationTypeStatus().hashCode());
        hashCode = prime * hashCode + ((getRetryDelayInSeconds() == null) ? 0 : getRetryDelayInSeconds().hashCode());
        hashCode = prime * hashCode + ((getTest() == null) ? 0 : getTest().hashCode());
        hashCode = prime * hashCode + ((getAnswerKey() == null) ? 0 : getAnswerKey().hashCode());
        hashCode = prime * hashCode + ((getTestDurationInSeconds() == null) ? 0 : getTestDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getAutoGranted() == null) ? 0 : getAutoGranted().hashCode());
        hashCode = prime * hashCode + ((getAutoGrantedValue() == null) ? 0 : getAutoGrantedValue().hashCode());
        return hashCode;
    }

    @Override
    public CreateQualificationTypeRequest clone() {
        return (CreateQualificationTypeRequest) super.clone();
    }

}
