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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a custom language model, including the base model name, when the model was created, the
 * location of the files used to train the model, when the model was last modified, the name you chose for the model,
 * its language, its processing state, and if there is an upgrade available for the base model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/LanguageModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LanguageModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique name, chosen by you, for your custom language model.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The date and time the specified custom language model was created.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The date and time the specified custom language model was last modified.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The language code used to create your custom language model. Each custom language model must contain terms in
     * only one language, and the language you select for your custom language model must match the language of your
     * training and tuning data.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * Note that U.S. English (<code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, used to create your custom language model.
     * </p>
     */
    private String baseModelName;
    /**
     * <p>
     * The status of the specified custom language model. When the status displays as <code>COMPLETED</code> the model
     * is ready for use.
     * </p>
     */
    private String modelStatus;
    /**
     * <p>
     * Shows if a more current base model is available for use with the specified custom language model.
     * </p>
     * <p>
     * If <code>false</code>, your custom language model is using the most up-to-date base model.
     * </p>
     * <p>
     * If <code>true</code>, there is a newer base model available than the one your language model is using.
     * </p>
     * <p>
     * Note that to update a base model, you must recreate the custom language model using the new base model. Base
     * model upgrades for existing custom language models are not supported.
     * </p>
     */
    private Boolean upgradeAvailability;
    /**
     * <p>
     * If <code>ModelStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information about why the
     * custom language model request failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The Amazon S3 location of the input files used to train and tune your custom language model, in addition to the
     * data access role ARN (Amazon Resource Name) that has permissions to access these data.
     * </p>
     */
    private InputDataConfig inputDataConfig;

    /**
     * <p>
     * A unique name, chosen by you, for your custom language model.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account.
     * </p>
     * 
     * @param modelName
     *        A unique name, chosen by you, for your custom language model.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your custom language model.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account.
     * </p>
     * 
     * @return A unique name, chosen by you, for your custom language model.</p>
     *         <p>
     *         This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *         account.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your custom language model.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account.
     * </p>
     * 
     * @param modelName
     *        A unique name, chosen by you, for your custom language model.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LanguageModel withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The date and time the specified custom language model was created.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param createTime
     *        The date and time the specified custom language model was created.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time the specified custom language model was created.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time the specified custom language model was created.</p>
     *         <p>
     *         Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The date and time the specified custom language model was created.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param createTime
     *        The date and time the specified custom language model was created.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LanguageModel withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The date and time the specified custom language model was last modified.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the specified custom language model was last modified.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the specified custom language model was last modified.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time the specified custom language model was last modified.</p>
     *         <p>
     *         Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the specified custom language model was last modified.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the specified custom language model was last modified.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LanguageModel withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The language code used to create your custom language model. Each custom language model must contain terms in
     * only one language, and the language you select for your custom language model must match the language of your
     * training and tuning data.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * Note that U.S. English (<code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your custom language model. Each custom language model must contain terms
     *        in only one language, and the language you select for your custom language model must match the language
     *        of your training and tuning data.</p>
     *        <p>
     *        For a list of supported languages and their associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table. Note that U.S. English (<code>en-US</code>) is the only language supported with Amazon Transcribe
     *        Medical.
     * @see CLMLanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code used to create your custom language model. Each custom language model must contain terms in
     * only one language, and the language you select for your custom language model must match the language of your
     * training and tuning data.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * Note that U.S. English (<code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @return The language code used to create your custom language model. Each custom language model must contain
     *         terms in only one language, and the language you select for your custom language model must match the
     *         language of your training and tuning data.</p>
     *         <p>
     *         For a list of supported languages and their associated language codes, refer to the <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *         table. Note that U.S. English (<code>en-US</code>) is the only language supported with Amazon Transcribe
     *         Medical.
     * @see CLMLanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code used to create your custom language model. Each custom language model must contain terms in
     * only one language, and the language you select for your custom language model must match the language of your
     * training and tuning data.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * Note that U.S. English (<code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your custom language model. Each custom language model must contain terms
     *        in only one language, and the language you select for your custom language model must match the language
     *        of your training and tuning data.</p>
     *        <p>
     *        For a list of supported languages and their associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table. Note that U.S. English (<code>en-US</code>) is the only language supported with Amazon Transcribe
     *        Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CLMLanguageCode
     */

    public LanguageModel withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code used to create your custom language model. Each custom language model must contain terms in
     * only one language, and the language you select for your custom language model must match the language of your
     * training and tuning data.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * Note that U.S. English (<code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code used to create your custom language model. Each custom language model must contain terms
     *        in only one language, and the language you select for your custom language model must match the language
     *        of your training and tuning data.</p>
     *        <p>
     *        For a list of supported languages and their associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table. Note that U.S. English (<code>en-US</code>) is the only language supported with Amazon Transcribe
     *        Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CLMLanguageCode
     */

    public LanguageModel withLanguageCode(CLMLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, used to create your custom language model.
     * </p>
     * 
     * @param baseModelName
     *        The Amazon Transcribe standard language model, or base model, used to create your custom language model.
     * @see BaseModelName
     */

    public void setBaseModelName(String baseModelName) {
        this.baseModelName = baseModelName;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, used to create your custom language model.
     * </p>
     * 
     * @return The Amazon Transcribe standard language model, or base model, used to create your custom language model.
     * @see BaseModelName
     */

    public String getBaseModelName() {
        return this.baseModelName;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, used to create your custom language model.
     * </p>
     * 
     * @param baseModelName
     *        The Amazon Transcribe standard language model, or base model, used to create your custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaseModelName
     */

    public LanguageModel withBaseModelName(String baseModelName) {
        setBaseModelName(baseModelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Transcribe standard language model, or base model, used to create your custom language model.
     * </p>
     * 
     * @param baseModelName
     *        The Amazon Transcribe standard language model, or base model, used to create your custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BaseModelName
     */

    public LanguageModel withBaseModelName(BaseModelName baseModelName) {
        this.baseModelName = baseModelName.toString();
        return this;
    }

    /**
     * <p>
     * The status of the specified custom language model. When the status displays as <code>COMPLETED</code> the model
     * is ready for use.
     * </p>
     * 
     * @param modelStatus
     *        The status of the specified custom language model. When the status displays as <code>COMPLETED</code> the
     *        model is ready for use.
     * @see ModelStatus
     */

    public void setModelStatus(String modelStatus) {
        this.modelStatus = modelStatus;
    }

    /**
     * <p>
     * The status of the specified custom language model. When the status displays as <code>COMPLETED</code> the model
     * is ready for use.
     * </p>
     * 
     * @return The status of the specified custom language model. When the status displays as <code>COMPLETED</code> the
     *         model is ready for use.
     * @see ModelStatus
     */

    public String getModelStatus() {
        return this.modelStatus;
    }

    /**
     * <p>
     * The status of the specified custom language model. When the status displays as <code>COMPLETED</code> the model
     * is ready for use.
     * </p>
     * 
     * @param modelStatus
     *        The status of the specified custom language model. When the status displays as <code>COMPLETED</code> the
     *        model is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public LanguageModel withModelStatus(String modelStatus) {
        setModelStatus(modelStatus);
        return this;
    }

    /**
     * <p>
     * The status of the specified custom language model. When the status displays as <code>COMPLETED</code> the model
     * is ready for use.
     * </p>
     * 
     * @param modelStatus
     *        The status of the specified custom language model. When the status displays as <code>COMPLETED</code> the
     *        model is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public LanguageModel withModelStatus(ModelStatus modelStatus) {
        this.modelStatus = modelStatus.toString();
        return this;
    }

    /**
     * <p>
     * Shows if a more current base model is available for use with the specified custom language model.
     * </p>
     * <p>
     * If <code>false</code>, your custom language model is using the most up-to-date base model.
     * </p>
     * <p>
     * If <code>true</code>, there is a newer base model available than the one your language model is using.
     * </p>
     * <p>
     * Note that to update a base model, you must recreate the custom language model using the new base model. Base
     * model upgrades for existing custom language models are not supported.
     * </p>
     * 
     * @param upgradeAvailability
     *        Shows if a more current base model is available for use with the specified custom language model.</p>
     *        <p>
     *        If <code>false</code>, your custom language model is using the most up-to-date base model.
     *        </p>
     *        <p>
     *        If <code>true</code>, there is a newer base model available than the one your language model is using.
     *        </p>
     *        <p>
     *        Note that to update a base model, you must recreate the custom language model using the new base model.
     *        Base model upgrades for existing custom language models are not supported.
     */

    public void setUpgradeAvailability(Boolean upgradeAvailability) {
        this.upgradeAvailability = upgradeAvailability;
    }

    /**
     * <p>
     * Shows if a more current base model is available for use with the specified custom language model.
     * </p>
     * <p>
     * If <code>false</code>, your custom language model is using the most up-to-date base model.
     * </p>
     * <p>
     * If <code>true</code>, there is a newer base model available than the one your language model is using.
     * </p>
     * <p>
     * Note that to update a base model, you must recreate the custom language model using the new base model. Base
     * model upgrades for existing custom language models are not supported.
     * </p>
     * 
     * @return Shows if a more current base model is available for use with the specified custom language model.</p>
     *         <p>
     *         If <code>false</code>, your custom language model is using the most up-to-date base model.
     *         </p>
     *         <p>
     *         If <code>true</code>, there is a newer base model available than the one your language model is using.
     *         </p>
     *         <p>
     *         Note that to update a base model, you must recreate the custom language model using the new base model.
     *         Base model upgrades for existing custom language models are not supported.
     */

    public Boolean getUpgradeAvailability() {
        return this.upgradeAvailability;
    }

    /**
     * <p>
     * Shows if a more current base model is available for use with the specified custom language model.
     * </p>
     * <p>
     * If <code>false</code>, your custom language model is using the most up-to-date base model.
     * </p>
     * <p>
     * If <code>true</code>, there is a newer base model available than the one your language model is using.
     * </p>
     * <p>
     * Note that to update a base model, you must recreate the custom language model using the new base model. Base
     * model upgrades for existing custom language models are not supported.
     * </p>
     * 
     * @param upgradeAvailability
     *        Shows if a more current base model is available for use with the specified custom language model.</p>
     *        <p>
     *        If <code>false</code>, your custom language model is using the most up-to-date base model.
     *        </p>
     *        <p>
     *        If <code>true</code>, there is a newer base model available than the one your language model is using.
     *        </p>
     *        <p>
     *        Note that to update a base model, you must recreate the custom language model using the new base model.
     *        Base model upgrades for existing custom language models are not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LanguageModel withUpgradeAvailability(Boolean upgradeAvailability) {
        setUpgradeAvailability(upgradeAvailability);
        return this;
    }

    /**
     * <p>
     * Shows if a more current base model is available for use with the specified custom language model.
     * </p>
     * <p>
     * If <code>false</code>, your custom language model is using the most up-to-date base model.
     * </p>
     * <p>
     * If <code>true</code>, there is a newer base model available than the one your language model is using.
     * </p>
     * <p>
     * Note that to update a base model, you must recreate the custom language model using the new base model. Base
     * model upgrades for existing custom language models are not supported.
     * </p>
     * 
     * @return Shows if a more current base model is available for use with the specified custom language model.</p>
     *         <p>
     *         If <code>false</code>, your custom language model is using the most up-to-date base model.
     *         </p>
     *         <p>
     *         If <code>true</code>, there is a newer base model available than the one your language model is using.
     *         </p>
     *         <p>
     *         Note that to update a base model, you must recreate the custom language model using the new base model.
     *         Base model upgrades for existing custom language models are not supported.
     */

    public Boolean isUpgradeAvailability() {
        return this.upgradeAvailability;
    }

    /**
     * <p>
     * If <code>ModelStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information about why the
     * custom language model request failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     * 
     * @param failureReason
     *        If <code>ModelStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information about
     *        why the custom language model request failed. See also: <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If <code>ModelStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information about why the
     * custom language model request failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     * 
     * @return If <code>ModelStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information about
     *         why the custom language model request failed. See also: <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If <code>ModelStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information about why the
     * custom language model request failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     * 
     * @param failureReason
     *        If <code>ModelStatus</code> is <code>FAILED</code>, <code>FailureReason</code> contains information about
     *        why the custom language model request failed. See also: <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LanguageModel withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the input files used to train and tune your custom language model, in addition to the
     * data access role ARN (Amazon Resource Name) that has permissions to access these data.
     * </p>
     * 
     * @param inputDataConfig
     *        The Amazon S3 location of the input files used to train and tune your custom language model, in addition
     *        to the data access role ARN (Amazon Resource Name) that has permissions to access these data.
     */

    public void setInputDataConfig(InputDataConfig inputDataConfig) {
        this.inputDataConfig = inputDataConfig;
    }

    /**
     * <p>
     * The Amazon S3 location of the input files used to train and tune your custom language model, in addition to the
     * data access role ARN (Amazon Resource Name) that has permissions to access these data.
     * </p>
     * 
     * @return The Amazon S3 location of the input files used to train and tune your custom language model, in addition
     *         to the data access role ARN (Amazon Resource Name) that has permissions to access these data.
     */

    public InputDataConfig getInputDataConfig() {
        return this.inputDataConfig;
    }

    /**
     * <p>
     * The Amazon S3 location of the input files used to train and tune your custom language model, in addition to the
     * data access role ARN (Amazon Resource Name) that has permissions to access these data.
     * </p>
     * 
     * @param inputDataConfig
     *        The Amazon S3 location of the input files used to train and tune your custom language model, in addition
     *        to the data access role ARN (Amazon Resource Name) that has permissions to access these data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LanguageModel withInputDataConfig(InputDataConfig inputDataConfig) {
        setInputDataConfig(inputDataConfig);
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getBaseModelName() != null)
            sb.append("BaseModelName: ").append(getBaseModelName()).append(",");
        if (getModelStatus() != null)
            sb.append("ModelStatus: ").append(getModelStatus()).append(",");
        if (getUpgradeAvailability() != null)
            sb.append("UpgradeAvailability: ").append(getUpgradeAvailability()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getInputDataConfig() != null)
            sb.append("InputDataConfig: ").append(getInputDataConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LanguageModel == false)
            return false;
        LanguageModel other = (LanguageModel) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getBaseModelName() == null ^ this.getBaseModelName() == null)
            return false;
        if (other.getBaseModelName() != null && other.getBaseModelName().equals(this.getBaseModelName()) == false)
            return false;
        if (other.getModelStatus() == null ^ this.getModelStatus() == null)
            return false;
        if (other.getModelStatus() != null && other.getModelStatus().equals(this.getModelStatus()) == false)
            return false;
        if (other.getUpgradeAvailability() == null ^ this.getUpgradeAvailability() == null)
            return false;
        if (other.getUpgradeAvailability() != null && other.getUpgradeAvailability().equals(this.getUpgradeAvailability()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getInputDataConfig() == null ^ this.getInputDataConfig() == null)
            return false;
        if (other.getInputDataConfig() != null && other.getInputDataConfig().equals(this.getInputDataConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getBaseModelName() == null) ? 0 : getBaseModelName().hashCode());
        hashCode = prime * hashCode + ((getModelStatus() == null) ? 0 : getModelStatus().hashCode());
        hashCode = prime * hashCode + ((getUpgradeAvailability() == null) ? 0 : getUpgradeAvailability().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getInputDataConfig() == null) ? 0 : getInputDataConfig().hashCode());
        return hashCode;
    }

    @Override
    public LanguageModel clone() {
        try {
            return (LanguageModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.LanguageModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
