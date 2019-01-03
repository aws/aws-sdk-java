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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/CreateBotVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBotVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bot.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the bot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     * </p>
     */
    private java.util.List<Intent> intents;
    /**
     * <p>
     * The message that Amazon Lex uses when it doesn't understand the user's request. For more information, see
     * <a>PutBot</a>.
     * </p>
     */
    private Prompt clarificationPrompt;
    /**
     * <p>
     * The message that Amazon Lex uses to abort a conversation. For more information, see <a>PutBot</a>.
     * </p>
     */
    private Statement abortStatement;
    /**
     * <p>
     * When you send a request to create or update a bot, Amazon Lex sets the <code>status</code> response element to
     * <code>BUILDING</code>. After Amazon Lex builds the bot, it sets <code>status</code> to <code>READY</code>. If
     * Amazon Lex can't build the bot, it sets <code>status</code> to <code>FAILED</code>. Amazon Lex returns the reason
     * for the failure in the <code>failureReason</code> response element.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to build the bot.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The date when the <code>$LATEST</code> version of this bot was updated.
     * </p>
     */
    private java.util.Date lastUpdatedDate;
    /**
     * <p>
     * The date when the bot version was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. For more information,
     * see <a>PutBot</a>.
     * </p>
     */
    private Integer idleSessionTTLInSeconds;
    /**
     * <p>
     * The Amazon Polly voice ID that Amazon Lex uses for voice interactions with the user.
     * </p>
     */
    private String voiceId;
    /**
     * <p>
     * Checksum identifying the version of the bot that was created.
     * </p>
     */
    private String checksum;
    /**
     * <p>
     * The version of the bot.
     * </p>
     */
    private String version;
    /**
     * <p>
     * Specifies the target locale for the bot.
     * </p>
     */
    private String locale;
    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of
     * Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in
     * part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying
     * <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By specifying <code>true</code>
     * in the <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is</b> related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children under age 13 and
     * subject to COPPA. By specifying <code>false</code> in the <code>childDirected</code> field, you confirm that your
     * use of Amazon Lex <b>is not</b> related to a website, program, or other application that is directed or targeted,
     * in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the
     * <code>childDirected</code> field that does not accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in whole or in part, to children under age
     * 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in
     * part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For
     * information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are
     * directed or targeted, in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     */
    private Boolean childDirected;

    /**
     * <p>
     * The name of the bot.
     * </p>
     * 
     * @param name
     *        The name of the bot.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bot.
     * </p>
     * 
     * @return The name of the bot.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the bot.
     * </p>
     * 
     * @param name
     *        The name of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * 
     * @param description
     *        A description of the bot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * 
     * @return A description of the bot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * 
     * @param description
     *        A description of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     * </p>
     * 
     * @return An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     */

    public java.util.List<Intent> getIntents() {
        return intents;
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     * </p>
     * 
     * @param intents
     *        An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     */

    public void setIntents(java.util.Collection<Intent> intents) {
        if (intents == null) {
            this.intents = null;
            return;
        }

        this.intents = new java.util.ArrayList<Intent>(intents);
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntents(java.util.Collection)} or {@link #withIntents(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param intents
     *        An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withIntents(Intent... intents) {
        if (this.intents == null) {
            setIntents(new java.util.ArrayList<Intent>(intents.length));
        }
        for (Intent ele : intents) {
            this.intents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     * </p>
     * 
     * @param intents
     *        An array of <code>Intent</code> objects. For more information, see <a>PutBot</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withIntents(java.util.Collection<Intent> intents) {
        setIntents(intents);
        return this;
    }

    /**
     * <p>
     * The message that Amazon Lex uses when it doesn't understand the user's request. For more information, see
     * <a>PutBot</a>.
     * </p>
     * 
     * @param clarificationPrompt
     *        The message that Amazon Lex uses when it doesn't understand the user's request. For more information, see
     *        <a>PutBot</a>.
     */

    public void setClarificationPrompt(Prompt clarificationPrompt) {
        this.clarificationPrompt = clarificationPrompt;
    }

    /**
     * <p>
     * The message that Amazon Lex uses when it doesn't understand the user's request. For more information, see
     * <a>PutBot</a>.
     * </p>
     * 
     * @return The message that Amazon Lex uses when it doesn't understand the user's request. For more information, see
     *         <a>PutBot</a>.
     */

    public Prompt getClarificationPrompt() {
        return this.clarificationPrompt;
    }

    /**
     * <p>
     * The message that Amazon Lex uses when it doesn't understand the user's request. For more information, see
     * <a>PutBot</a>.
     * </p>
     * 
     * @param clarificationPrompt
     *        The message that Amazon Lex uses when it doesn't understand the user's request. For more information, see
     *        <a>PutBot</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withClarificationPrompt(Prompt clarificationPrompt) {
        setClarificationPrompt(clarificationPrompt);
        return this;
    }

    /**
     * <p>
     * The message that Amazon Lex uses to abort a conversation. For more information, see <a>PutBot</a>.
     * </p>
     * 
     * @param abortStatement
     *        The message that Amazon Lex uses to abort a conversation. For more information, see <a>PutBot</a>.
     */

    public void setAbortStatement(Statement abortStatement) {
        this.abortStatement = abortStatement;
    }

    /**
     * <p>
     * The message that Amazon Lex uses to abort a conversation. For more information, see <a>PutBot</a>.
     * </p>
     * 
     * @return The message that Amazon Lex uses to abort a conversation. For more information, see <a>PutBot</a>.
     */

    public Statement getAbortStatement() {
        return this.abortStatement;
    }

    /**
     * <p>
     * The message that Amazon Lex uses to abort a conversation. For more information, see <a>PutBot</a>.
     * </p>
     * 
     * @param abortStatement
     *        The message that Amazon Lex uses to abort a conversation. For more information, see <a>PutBot</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withAbortStatement(Statement abortStatement) {
        setAbortStatement(abortStatement);
        return this;
    }

    /**
     * <p>
     * When you send a request to create or update a bot, Amazon Lex sets the <code>status</code> response element to
     * <code>BUILDING</code>. After Amazon Lex builds the bot, it sets <code>status</code> to <code>READY</code>. If
     * Amazon Lex can't build the bot, it sets <code>status</code> to <code>FAILED</code>. Amazon Lex returns the reason
     * for the failure in the <code>failureReason</code> response element.
     * </p>
     * 
     * @param status
     *        When you send a request to create or update a bot, Amazon Lex sets the <code>status</code> response
     *        element to <code>BUILDING</code>. After Amazon Lex builds the bot, it sets <code>status</code> to
     *        <code>READY</code>. If Amazon Lex can't build the bot, it sets <code>status</code> to <code>FAILED</code>.
     *        Amazon Lex returns the reason for the failure in the <code>failureReason</code> response element.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * When you send a request to create or update a bot, Amazon Lex sets the <code>status</code> response element to
     * <code>BUILDING</code>. After Amazon Lex builds the bot, it sets <code>status</code> to <code>READY</code>. If
     * Amazon Lex can't build the bot, it sets <code>status</code> to <code>FAILED</code>. Amazon Lex returns the reason
     * for the failure in the <code>failureReason</code> response element.
     * </p>
     * 
     * @return When you send a request to create or update a bot, Amazon Lex sets the <code>status</code> response
     *         element to <code>BUILDING</code>. After Amazon Lex builds the bot, it sets <code>status</code> to
     *         <code>READY</code>. If Amazon Lex can't build the bot, it sets <code>status</code> to <code>FAILED</code>
     *         . Amazon Lex returns the reason for the failure in the <code>failureReason</code> response element.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * When you send a request to create or update a bot, Amazon Lex sets the <code>status</code> response element to
     * <code>BUILDING</code>. After Amazon Lex builds the bot, it sets <code>status</code> to <code>READY</code>. If
     * Amazon Lex can't build the bot, it sets <code>status</code> to <code>FAILED</code>. Amazon Lex returns the reason
     * for the failure in the <code>failureReason</code> response element.
     * </p>
     * 
     * @param status
     *        When you send a request to create or update a bot, Amazon Lex sets the <code>status</code> response
     *        element to <code>BUILDING</code>. After Amazon Lex builds the bot, it sets <code>status</code> to
     *        <code>READY</code>. If Amazon Lex can't build the bot, it sets <code>status</code> to <code>FAILED</code>.
     *        Amazon Lex returns the reason for the failure in the <code>failureReason</code> response element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public CreateBotVersionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * When you send a request to create or update a bot, Amazon Lex sets the <code>status</code> response element to
     * <code>BUILDING</code>. After Amazon Lex builds the bot, it sets <code>status</code> to <code>READY</code>. If
     * Amazon Lex can't build the bot, it sets <code>status</code> to <code>FAILED</code>. Amazon Lex returns the reason
     * for the failure in the <code>failureReason</code> response element.
     * </p>
     * 
     * @param status
     *        When you send a request to create or update a bot, Amazon Lex sets the <code>status</code> response
     *        element to <code>BUILDING</code>. After Amazon Lex builds the bot, it sets <code>status</code> to
     *        <code>READY</code>. If Amazon Lex can't build the bot, it sets <code>status</code> to <code>FAILED</code>.
     *        Amazon Lex returns the reason for the failure in the <code>failureReason</code> response element.
     * @see Status
     */

    public void setStatus(Status status) {
        withStatus(status);
    }

    /**
     * <p>
     * When you send a request to create or update a bot, Amazon Lex sets the <code>status</code> response element to
     * <code>BUILDING</code>. After Amazon Lex builds the bot, it sets <code>status</code> to <code>READY</code>. If
     * Amazon Lex can't build the bot, it sets <code>status</code> to <code>FAILED</code>. Amazon Lex returns the reason
     * for the failure in the <code>failureReason</code> response element.
     * </p>
     * 
     * @param status
     *        When you send a request to create or update a bot, Amazon Lex sets the <code>status</code> response
     *        element to <code>BUILDING</code>. After Amazon Lex builds the bot, it sets <code>status</code> to
     *        <code>READY</code>. If Amazon Lex can't build the bot, it sets <code>status</code> to <code>FAILED</code>.
     *        Amazon Lex returns the reason for the failure in the <code>failureReason</code> response element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public CreateBotVersionResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to build the bot.
     * </p>
     * 
     * @param failureReason
     *        If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to build the
     *        bot.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to build the bot.
     * </p>
     * 
     * @return If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to build the
     *         bot.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to build the bot.
     * </p>
     * 
     * @param failureReason
     *        If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to build the
     *        bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The date when the <code>$LATEST</code> version of this bot was updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date when the <code>$LATEST</code> version of this bot was updated.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date when the <code>$LATEST</code> version of this bot was updated.
     * </p>
     * 
     * @return The date when the <code>$LATEST</code> version of this bot was updated.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The date when the <code>$LATEST</code> version of this bot was updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date when the <code>$LATEST</code> version of this bot was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * The date when the bot version was created.
     * </p>
     * 
     * @param createdDate
     *        The date when the bot version was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date when the bot version was created.
     * </p>
     * 
     * @return The date when the bot version was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date when the bot version was created.
     * </p>
     * 
     * @param createdDate
     *        The date when the bot version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. For more information,
     * see <a>PutBot</a>.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. For more
     *        information, see <a>PutBot</a>.
     */

    public void setIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. For more information,
     * see <a>PutBot</a>.
     * </p>
     * 
     * @return The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. For more
     *         information, see <a>PutBot</a>.
     */

    public Integer getIdleSessionTTLInSeconds() {
        return this.idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. For more information,
     * see <a>PutBot</a>.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. For more
     *        information, see <a>PutBot</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        setIdleSessionTTLInSeconds(idleSessionTTLInSeconds);
        return this;
    }

    /**
     * <p>
     * The Amazon Polly voice ID that Amazon Lex uses for voice interactions with the user.
     * </p>
     * 
     * @param voiceId
     *        The Amazon Polly voice ID that Amazon Lex uses for voice interactions with the user.
     */

    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * <p>
     * The Amazon Polly voice ID that Amazon Lex uses for voice interactions with the user.
     * </p>
     * 
     * @return The Amazon Polly voice ID that Amazon Lex uses for voice interactions with the user.
     */

    public String getVoiceId() {
        return this.voiceId;
    }

    /**
     * <p>
     * The Amazon Polly voice ID that Amazon Lex uses for voice interactions with the user.
     * </p>
     * 
     * @param voiceId
     *        The Amazon Polly voice ID that Amazon Lex uses for voice interactions with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withVoiceId(String voiceId) {
        setVoiceId(voiceId);
        return this;
    }

    /**
     * <p>
     * Checksum identifying the version of the bot that was created.
     * </p>
     * 
     * @param checksum
     *        Checksum identifying the version of the bot that was created.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Checksum identifying the version of the bot that was created.
     * </p>
     * 
     * @return Checksum identifying the version of the bot that was created.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * Checksum identifying the version of the bot that was created.
     * </p>
     * 
     * @param checksum
     *        Checksum identifying the version of the bot that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * The version of the bot.
     * </p>
     * 
     * @param version
     *        The version of the bot.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the bot.
     * </p>
     * 
     * @return The version of the bot.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the bot.
     * </p>
     * 
     * @param version
     *        The version of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Specifies the target locale for the bot.
     * </p>
     * 
     * @param locale
     *        Specifies the target locale for the bot.
     * @see Locale
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * Specifies the target locale for the bot.
     * </p>
     * 
     * @return Specifies the target locale for the bot.
     * @see Locale
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * Specifies the target locale for the bot.
     * </p>
     * 
     * @param locale
     *        Specifies the target locale for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public CreateBotVersionResult withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * Specifies the target locale for the bot.
     * </p>
     * 
     * @param locale
     *        Specifies the target locale for the bot.
     * @see Locale
     */

    public void setLocale(Locale locale) {
        withLocale(locale);
    }

    /**
     * <p>
     * Specifies the target locale for the bot.
     * </p>
     * 
     * @param locale
     *        Specifies the target locale for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public CreateBotVersionResult withLocale(Locale locale) {
        this.locale = locale.toString();
        return this;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of
     * Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in
     * part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying
     * <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By specifying <code>true</code>
     * in the <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is</b> related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children under age 13 and
     * subject to COPPA. By specifying <code>false</code> in the <code>childDirected</code> field, you confirm that your
     * use of Amazon Lex <b>is not</b> related to a website, program, or other application that is directed or targeted,
     * in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the
     * <code>childDirected</code> field that does not accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in whole or in part, to children under age
     * 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in
     * part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For
     * information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are
     * directed or targeted, in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     * 
     * @param childDirected
     *        For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your
     *        use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in
     *        whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act
     *        (COPPA) by specifying <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By
     *        specifying <code>true</code> in the <code>childDirected</code> field, you confirm that your use of Amazon
     *        Lex <b>is</b> related to a website, program, or other application that is directed or targeted, in whole
     *        or in part, to children under age 13 and subject to COPPA. By specifying <code>false</code> in the
     *        <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is not</b> related to a
     *        website, program, or other application that is directed or targeted, in whole or in part, to children
     *        under age 13 and subject to COPPA. You may not specify a default value for the <code>childDirected</code>
     *        field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or
     *        other application that is directed or targeted, in whole or in part, to children under age 13 and subject
     *        to COPPA.</p>
     *        <p>
     *        If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or
     *        in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA.
     *        For information regarding the use of Amazon Lex in connection with websites, programs, or other
     *        applications that are directed or targeted, in whole or in part, to children under age 13, see the <a
     *        href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     */

    public void setChildDirected(Boolean childDirected) {
        this.childDirected = childDirected;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of
     * Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in
     * part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying
     * <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By specifying <code>true</code>
     * in the <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is</b> related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children under age 13 and
     * subject to COPPA. By specifying <code>false</code> in the <code>childDirected</code> field, you confirm that your
     * use of Amazon Lex <b>is not</b> related to a website, program, or other application that is directed or targeted,
     * in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the
     * <code>childDirected</code> field that does not accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in whole or in part, to children under age
     * 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in
     * part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For
     * information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are
     * directed or targeted, in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     * 
     * @return For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your
     *         use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in
     *         whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act
     *         (COPPA) by specifying <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By
     *         specifying <code>true</code> in the <code>childDirected</code> field, you confirm that your use of Amazon
     *         Lex <b>is</b> related to a website, program, or other application that is directed or targeted, in whole
     *         or in part, to children under age 13 and subject to COPPA. By specifying <code>false</code> in the
     *         <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is not</b> related to a
     *         website, program, or other application that is directed or targeted, in whole or in part, to children
     *         under age 13 and subject to COPPA. You may not specify a default value for the <code>childDirected</code>
     *         field that does not accurately reflect whether your use of Amazon Lex is related to a website, program,
     *         or other application that is directed or targeted, in whole or in part, to children under age 13 and
     *         subject to COPPA.</p>
     *         <p>
     *         If your use of Amazon Lex relates to a website, program, or other application that is directed in whole
     *         or in part, to children under age 13, you must obtain any required verifiable parental consent under
     *         COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other
     *         applications that are directed or targeted, in whole or in part, to children under age 13, see the <a
     *         href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     */

    public Boolean getChildDirected() {
        return this.childDirected;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of
     * Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in
     * part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying
     * <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By specifying <code>true</code>
     * in the <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is</b> related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children under age 13 and
     * subject to COPPA. By specifying <code>false</code> in the <code>childDirected</code> field, you confirm that your
     * use of Amazon Lex <b>is not</b> related to a website, program, or other application that is directed or targeted,
     * in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the
     * <code>childDirected</code> field that does not accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in whole or in part, to children under age
     * 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in
     * part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For
     * information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are
     * directed or targeted, in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     * 
     * @param childDirected
     *        For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your
     *        use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in
     *        whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act
     *        (COPPA) by specifying <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By
     *        specifying <code>true</code> in the <code>childDirected</code> field, you confirm that your use of Amazon
     *        Lex <b>is</b> related to a website, program, or other application that is directed or targeted, in whole
     *        or in part, to children under age 13 and subject to COPPA. By specifying <code>false</code> in the
     *        <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is not</b> related to a
     *        website, program, or other application that is directed or targeted, in whole or in part, to children
     *        under age 13 and subject to COPPA. You may not specify a default value for the <code>childDirected</code>
     *        field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or
     *        other application that is directed or targeted, in whole or in part, to children under age 13 and subject
     *        to COPPA.</p>
     *        <p>
     *        If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or
     *        in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA.
     *        For information regarding the use of Amazon Lex in connection with websites, programs, or other
     *        applications that are directed or targeted, in whole or in part, to children under age 13, see the <a
     *        href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionResult withChildDirected(Boolean childDirected) {
        setChildDirected(childDirected);
        return this;
    }

    /**
     * <p>
     * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of
     * Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in
     * part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying
     * <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By specifying <code>true</code>
     * in the <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is</b> related to a website,
     * program, or other application that is directed or targeted, in whole or in part, to children under age 13 and
     * subject to COPPA. By specifying <code>false</code> in the <code>childDirected</code> field, you confirm that your
     * use of Amazon Lex <b>is not</b> related to a website, program, or other application that is directed or targeted,
     * in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the
     * <code>childDirected</code> field that does not accurately reflect whether your use of Amazon Lex is related to a
     * website, program, or other application that is directed or targeted, in whole or in part, to children under age
     * 13 and subject to COPPA.
     * </p>
     * <p>
     * If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in
     * part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For
     * information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are
     * directed or targeted, in whole or in part, to children under age 13, see the <a
     * href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     * </p>
     * 
     * @return For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your
     *         use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in
     *         whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act
     *         (COPPA) by specifying <code>true</code> or <code>false</code> in the <code>childDirected</code> field. By
     *         specifying <code>true</code> in the <code>childDirected</code> field, you confirm that your use of Amazon
     *         Lex <b>is</b> related to a website, program, or other application that is directed or targeted, in whole
     *         or in part, to children under age 13 and subject to COPPA. By specifying <code>false</code> in the
     *         <code>childDirected</code> field, you confirm that your use of Amazon Lex <b>is not</b> related to a
     *         website, program, or other application that is directed or targeted, in whole or in part, to children
     *         under age 13 and subject to COPPA. You may not specify a default value for the <code>childDirected</code>
     *         field that does not accurately reflect whether your use of Amazon Lex is related to a website, program,
     *         or other application that is directed or targeted, in whole or in part, to children under age 13 and
     *         subject to COPPA.</p>
     *         <p>
     *         If your use of Amazon Lex relates to a website, program, or other application that is directed in whole
     *         or in part, to children under age 13, you must obtain any required verifiable parental consent under
     *         COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other
     *         applications that are directed or targeted, in whole or in part, to children under age 13, see the <a
     *         href="https://aws.amazon.com/lex/faqs#data-security">Amazon Lex FAQ.</a>
     */

    public Boolean isChildDirected() {
        return this.childDirected;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIntents() != null)
            sb.append("Intents: ").append(getIntents()).append(",");
        if (getClarificationPrompt() != null)
            sb.append("ClarificationPrompt: ").append(getClarificationPrompt()).append(",");
        if (getAbortStatement() != null)
            sb.append("AbortStatement: ").append(getAbortStatement()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getIdleSessionTTLInSeconds() != null)
            sb.append("IdleSessionTTLInSeconds: ").append(getIdleSessionTTLInSeconds()).append(",");
        if (getVoiceId() != null)
            sb.append("VoiceId: ").append(getVoiceId()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale()).append(",");
        if (getChildDirected() != null)
            sb.append("ChildDirected: ").append(getChildDirected());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBotVersionResult == false)
            return false;
        CreateBotVersionResult other = (CreateBotVersionResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIntents() == null ^ this.getIntents() == null)
            return false;
        if (other.getIntents() != null && other.getIntents().equals(this.getIntents()) == false)
            return false;
        if (other.getClarificationPrompt() == null ^ this.getClarificationPrompt() == null)
            return false;
        if (other.getClarificationPrompt() != null && other.getClarificationPrompt().equals(this.getClarificationPrompt()) == false)
            return false;
        if (other.getAbortStatement() == null ^ this.getAbortStatement() == null)
            return false;
        if (other.getAbortStatement() != null && other.getAbortStatement().equals(this.getAbortStatement()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getIdleSessionTTLInSeconds() == null ^ this.getIdleSessionTTLInSeconds() == null)
            return false;
        if (other.getIdleSessionTTLInSeconds() != null && other.getIdleSessionTTLInSeconds().equals(this.getIdleSessionTTLInSeconds()) == false)
            return false;
        if (other.getVoiceId() == null ^ this.getVoiceId() == null)
            return false;
        if (other.getVoiceId() != null && other.getVoiceId().equals(this.getVoiceId()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getChildDirected() == null ^ this.getChildDirected() == null)
            return false;
        if (other.getChildDirected() != null && other.getChildDirected().equals(this.getChildDirected()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIntents() == null) ? 0 : getIntents().hashCode());
        hashCode = prime * hashCode + ((getClarificationPrompt() == null) ? 0 : getClarificationPrompt().hashCode());
        hashCode = prime * hashCode + ((getAbortStatement() == null) ? 0 : getAbortStatement().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getIdleSessionTTLInSeconds() == null) ? 0 : getIdleSessionTTLInSeconds().hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getChildDirected() == null) ? 0 : getChildDirected().hashCode());
        return hashCode;
    }

    @Override
    public CreateBotVersionResult clone() {
        try {
            return (CreateBotVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
