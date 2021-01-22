/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateIntent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIntentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the intent that was updated.
     * </p>
     */
    private String intentId;
    /**
     * <p>
     * The updated name of the intent.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * The updated description of the intent.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The updated built-in intent that is the parent of this intent.
     * </p>
     */
    private String parentIntentSignature;
    /**
     * <p>
     * The updated list of sample utterances for the intent.
     * </p>
     */
    private java.util.List<SampleUtterance> sampleUtterances;
    /**
     * <p>
     * The updated Lambda function called during each turn of the conversation with the user.
     * </p>
     */
    private DialogCodeHookSettings dialogCodeHook;
    /**
     * <p>
     * The updated Lambda function called when the intent is ready for fulfillment.
     * </p>
     */
    private FulfillmentCodeHookSettings fulfillmentCodeHook;
    /**
     * <p>
     * The updated list of slots and their priorities that are elicited from the user for the intent.
     * </p>
     */
    private java.util.List<SlotPriority> slotPriorities;
    /**
     * <p>
     * The updated prompts that Amazon Lex sends to the user to confirm the completion of an intent.
     * </p>
     */
    private IntentConfirmationSetting intentConfirmationSetting;
    /**
     * <p>
     * The updated response that Amazon Lex sends the user when the intent is closed.
     * </p>
     */
    private IntentClosingSetting intentClosingSetting;
    /**
     * <p>
     * The updated list of contexts that must be active for the intent to be considered by Amazon Lex.
     * </p>
     */
    private java.util.List<InputContext> inputContexts;
    /**
     * <p>
     * The updated list of contexts that Amazon Lex activates when the intent is fulfilled.
     * </p>
     */
    private java.util.List<OutputContext> outputContexts;
    /**
     * <p>
     * The updated configuration for connecting to an Amazon Kendra index with the
     * <code>AMAZON.KendraSearchIntent</code> intent.
     * </p>
     */
    private KendraConfiguration kendraConfiguration;
    /**
     * <p>
     * The identifier of the bot that contains the intent.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that contains the intent. Will always be <code>DRAFT</code>.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The updated language and locale of the intent.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * A timestamp of when the intent was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * A timestamp of the last time that the intent was modified.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The identifier of the intent that was updated.
     * </p>
     * 
     * @param intentId
     *        The identifier of the intent that was updated.
     */

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    /**
     * <p>
     * The identifier of the intent that was updated.
     * </p>
     * 
     * @return The identifier of the intent that was updated.
     */

    public String getIntentId() {
        return this.intentId;
    }

    /**
     * <p>
     * The identifier of the intent that was updated.
     * </p>
     * 
     * @param intentId
     *        The identifier of the intent that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withIntentId(String intentId) {
        setIntentId(intentId);
        return this;
    }

    /**
     * <p>
     * The updated name of the intent.
     * </p>
     * 
     * @param intentName
     *        The updated name of the intent.
     */

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The updated name of the intent.
     * </p>
     * 
     * @return The updated name of the intent.
     */

    public String getIntentName() {
        return this.intentName;
    }

    /**
     * <p>
     * The updated name of the intent.
     * </p>
     * 
     * @param intentName
     *        The updated name of the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * The updated description of the intent.
     * </p>
     * 
     * @param description
     *        The updated description of the intent.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of the intent.
     * </p>
     * 
     * @return The updated description of the intent.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated description of the intent.
     * </p>
     * 
     * @param description
     *        The updated description of the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The updated built-in intent that is the parent of this intent.
     * </p>
     * 
     * @param parentIntentSignature
     *        The updated built-in intent that is the parent of this intent.
     */

    public void setParentIntentSignature(String parentIntentSignature) {
        this.parentIntentSignature = parentIntentSignature;
    }

    /**
     * <p>
     * The updated built-in intent that is the parent of this intent.
     * </p>
     * 
     * @return The updated built-in intent that is the parent of this intent.
     */

    public String getParentIntentSignature() {
        return this.parentIntentSignature;
    }

    /**
     * <p>
     * The updated built-in intent that is the parent of this intent.
     * </p>
     * 
     * @param parentIntentSignature
     *        The updated built-in intent that is the parent of this intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withParentIntentSignature(String parentIntentSignature) {
        setParentIntentSignature(parentIntentSignature);
        return this;
    }

    /**
     * <p>
     * The updated list of sample utterances for the intent.
     * </p>
     * 
     * @return The updated list of sample utterances for the intent.
     */

    public java.util.List<SampleUtterance> getSampleUtterances() {
        return sampleUtterances;
    }

    /**
     * <p>
     * The updated list of sample utterances for the intent.
     * </p>
     * 
     * @param sampleUtterances
     *        The updated list of sample utterances for the intent.
     */

    public void setSampleUtterances(java.util.Collection<SampleUtterance> sampleUtterances) {
        if (sampleUtterances == null) {
            this.sampleUtterances = null;
            return;
        }

        this.sampleUtterances = new java.util.ArrayList<SampleUtterance>(sampleUtterances);
    }

    /**
     * <p>
     * The updated list of sample utterances for the intent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSampleUtterances(java.util.Collection)} or {@link #withSampleUtterances(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sampleUtterances
     *        The updated list of sample utterances for the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withSampleUtterances(SampleUtterance... sampleUtterances) {
        if (this.sampleUtterances == null) {
            setSampleUtterances(new java.util.ArrayList<SampleUtterance>(sampleUtterances.length));
        }
        for (SampleUtterance ele : sampleUtterances) {
            this.sampleUtterances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The updated list of sample utterances for the intent.
     * </p>
     * 
     * @param sampleUtterances
     *        The updated list of sample utterances for the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withSampleUtterances(java.util.Collection<SampleUtterance> sampleUtterances) {
        setSampleUtterances(sampleUtterances);
        return this;
    }

    /**
     * <p>
     * The updated Lambda function called during each turn of the conversation with the user.
     * </p>
     * 
     * @param dialogCodeHook
     *        The updated Lambda function called during each turn of the conversation with the user.
     */

    public void setDialogCodeHook(DialogCodeHookSettings dialogCodeHook) {
        this.dialogCodeHook = dialogCodeHook;
    }

    /**
     * <p>
     * The updated Lambda function called during each turn of the conversation with the user.
     * </p>
     * 
     * @return The updated Lambda function called during each turn of the conversation with the user.
     */

    public DialogCodeHookSettings getDialogCodeHook() {
        return this.dialogCodeHook;
    }

    /**
     * <p>
     * The updated Lambda function called during each turn of the conversation with the user.
     * </p>
     * 
     * @param dialogCodeHook
     *        The updated Lambda function called during each turn of the conversation with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withDialogCodeHook(DialogCodeHookSettings dialogCodeHook) {
        setDialogCodeHook(dialogCodeHook);
        return this;
    }

    /**
     * <p>
     * The updated Lambda function called when the intent is ready for fulfillment.
     * </p>
     * 
     * @param fulfillmentCodeHook
     *        The updated Lambda function called when the intent is ready for fulfillment.
     */

    public void setFulfillmentCodeHook(FulfillmentCodeHookSettings fulfillmentCodeHook) {
        this.fulfillmentCodeHook = fulfillmentCodeHook;
    }

    /**
     * <p>
     * The updated Lambda function called when the intent is ready for fulfillment.
     * </p>
     * 
     * @return The updated Lambda function called when the intent is ready for fulfillment.
     */

    public FulfillmentCodeHookSettings getFulfillmentCodeHook() {
        return this.fulfillmentCodeHook;
    }

    /**
     * <p>
     * The updated Lambda function called when the intent is ready for fulfillment.
     * </p>
     * 
     * @param fulfillmentCodeHook
     *        The updated Lambda function called when the intent is ready for fulfillment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withFulfillmentCodeHook(FulfillmentCodeHookSettings fulfillmentCodeHook) {
        setFulfillmentCodeHook(fulfillmentCodeHook);
        return this;
    }

    /**
     * <p>
     * The updated list of slots and their priorities that are elicited from the user for the intent.
     * </p>
     * 
     * @return The updated list of slots and their priorities that are elicited from the user for the intent.
     */

    public java.util.List<SlotPriority> getSlotPriorities() {
        return slotPriorities;
    }

    /**
     * <p>
     * The updated list of slots and their priorities that are elicited from the user for the intent.
     * </p>
     * 
     * @param slotPriorities
     *        The updated list of slots and their priorities that are elicited from the user for the intent.
     */

    public void setSlotPriorities(java.util.Collection<SlotPriority> slotPriorities) {
        if (slotPriorities == null) {
            this.slotPriorities = null;
            return;
        }

        this.slotPriorities = new java.util.ArrayList<SlotPriority>(slotPriorities);
    }

    /**
     * <p>
     * The updated list of slots and their priorities that are elicited from the user for the intent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlotPriorities(java.util.Collection)} or {@link #withSlotPriorities(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param slotPriorities
     *        The updated list of slots and their priorities that are elicited from the user for the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withSlotPriorities(SlotPriority... slotPriorities) {
        if (this.slotPriorities == null) {
            setSlotPriorities(new java.util.ArrayList<SlotPriority>(slotPriorities.length));
        }
        for (SlotPriority ele : slotPriorities) {
            this.slotPriorities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The updated list of slots and their priorities that are elicited from the user for the intent.
     * </p>
     * 
     * @param slotPriorities
     *        The updated list of slots and their priorities that are elicited from the user for the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withSlotPriorities(java.util.Collection<SlotPriority> slotPriorities) {
        setSlotPriorities(slotPriorities);
        return this;
    }

    /**
     * <p>
     * The updated prompts that Amazon Lex sends to the user to confirm the completion of an intent.
     * </p>
     * 
     * @param intentConfirmationSetting
     *        The updated prompts that Amazon Lex sends to the user to confirm the completion of an intent.
     */

    public void setIntentConfirmationSetting(IntentConfirmationSetting intentConfirmationSetting) {
        this.intentConfirmationSetting = intentConfirmationSetting;
    }

    /**
     * <p>
     * The updated prompts that Amazon Lex sends to the user to confirm the completion of an intent.
     * </p>
     * 
     * @return The updated prompts that Amazon Lex sends to the user to confirm the completion of an intent.
     */

    public IntentConfirmationSetting getIntentConfirmationSetting() {
        return this.intentConfirmationSetting;
    }

    /**
     * <p>
     * The updated prompts that Amazon Lex sends to the user to confirm the completion of an intent.
     * </p>
     * 
     * @param intentConfirmationSetting
     *        The updated prompts that Amazon Lex sends to the user to confirm the completion of an intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withIntentConfirmationSetting(IntentConfirmationSetting intentConfirmationSetting) {
        setIntentConfirmationSetting(intentConfirmationSetting);
        return this;
    }

    /**
     * <p>
     * The updated response that Amazon Lex sends the user when the intent is closed.
     * </p>
     * 
     * @param intentClosingSetting
     *        The updated response that Amazon Lex sends the user when the intent is closed.
     */

    public void setIntentClosingSetting(IntentClosingSetting intentClosingSetting) {
        this.intentClosingSetting = intentClosingSetting;
    }

    /**
     * <p>
     * The updated response that Amazon Lex sends the user when the intent is closed.
     * </p>
     * 
     * @return The updated response that Amazon Lex sends the user when the intent is closed.
     */

    public IntentClosingSetting getIntentClosingSetting() {
        return this.intentClosingSetting;
    }

    /**
     * <p>
     * The updated response that Amazon Lex sends the user when the intent is closed.
     * </p>
     * 
     * @param intentClosingSetting
     *        The updated response that Amazon Lex sends the user when the intent is closed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withIntentClosingSetting(IntentClosingSetting intentClosingSetting) {
        setIntentClosingSetting(intentClosingSetting);
        return this;
    }

    /**
     * <p>
     * The updated list of contexts that must be active for the intent to be considered by Amazon Lex.
     * </p>
     * 
     * @return The updated list of contexts that must be active for the intent to be considered by Amazon Lex.
     */

    public java.util.List<InputContext> getInputContexts() {
        return inputContexts;
    }

    /**
     * <p>
     * The updated list of contexts that must be active for the intent to be considered by Amazon Lex.
     * </p>
     * 
     * @param inputContexts
     *        The updated list of contexts that must be active for the intent to be considered by Amazon Lex.
     */

    public void setInputContexts(java.util.Collection<InputContext> inputContexts) {
        if (inputContexts == null) {
            this.inputContexts = null;
            return;
        }

        this.inputContexts = new java.util.ArrayList<InputContext>(inputContexts);
    }

    /**
     * <p>
     * The updated list of contexts that must be active for the intent to be considered by Amazon Lex.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputContexts(java.util.Collection)} or {@link #withInputContexts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputContexts
     *        The updated list of contexts that must be active for the intent to be considered by Amazon Lex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withInputContexts(InputContext... inputContexts) {
        if (this.inputContexts == null) {
            setInputContexts(new java.util.ArrayList<InputContext>(inputContexts.length));
        }
        for (InputContext ele : inputContexts) {
            this.inputContexts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The updated list of contexts that must be active for the intent to be considered by Amazon Lex.
     * </p>
     * 
     * @param inputContexts
     *        The updated list of contexts that must be active for the intent to be considered by Amazon Lex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withInputContexts(java.util.Collection<InputContext> inputContexts) {
        setInputContexts(inputContexts);
        return this;
    }

    /**
     * <p>
     * The updated list of contexts that Amazon Lex activates when the intent is fulfilled.
     * </p>
     * 
     * @return The updated list of contexts that Amazon Lex activates when the intent is fulfilled.
     */

    public java.util.List<OutputContext> getOutputContexts() {
        return outputContexts;
    }

    /**
     * <p>
     * The updated list of contexts that Amazon Lex activates when the intent is fulfilled.
     * </p>
     * 
     * @param outputContexts
     *        The updated list of contexts that Amazon Lex activates when the intent is fulfilled.
     */

    public void setOutputContexts(java.util.Collection<OutputContext> outputContexts) {
        if (outputContexts == null) {
            this.outputContexts = null;
            return;
        }

        this.outputContexts = new java.util.ArrayList<OutputContext>(outputContexts);
    }

    /**
     * <p>
     * The updated list of contexts that Amazon Lex activates when the intent is fulfilled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputContexts(java.util.Collection)} or {@link #withOutputContexts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputContexts
     *        The updated list of contexts that Amazon Lex activates when the intent is fulfilled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withOutputContexts(OutputContext... outputContexts) {
        if (this.outputContexts == null) {
            setOutputContexts(new java.util.ArrayList<OutputContext>(outputContexts.length));
        }
        for (OutputContext ele : outputContexts) {
            this.outputContexts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The updated list of contexts that Amazon Lex activates when the intent is fulfilled.
     * </p>
     * 
     * @param outputContexts
     *        The updated list of contexts that Amazon Lex activates when the intent is fulfilled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withOutputContexts(java.util.Collection<OutputContext> outputContexts) {
        setOutputContexts(outputContexts);
        return this;
    }

    /**
     * <p>
     * The updated configuration for connecting to an Amazon Kendra index with the
     * <code>AMAZON.KendraSearchIntent</code> intent.
     * </p>
     * 
     * @param kendraConfiguration
     *        The updated configuration for connecting to an Amazon Kendra index with the
     *        <code>AMAZON.KendraSearchIntent</code> intent.
     */

    public void setKendraConfiguration(KendraConfiguration kendraConfiguration) {
        this.kendraConfiguration = kendraConfiguration;
    }

    /**
     * <p>
     * The updated configuration for connecting to an Amazon Kendra index with the
     * <code>AMAZON.KendraSearchIntent</code> intent.
     * </p>
     * 
     * @return The updated configuration for connecting to an Amazon Kendra index with the
     *         <code>AMAZON.KendraSearchIntent</code> intent.
     */

    public KendraConfiguration getKendraConfiguration() {
        return this.kendraConfiguration;
    }

    /**
     * <p>
     * The updated configuration for connecting to an Amazon Kendra index with the
     * <code>AMAZON.KendraSearchIntent</code> intent.
     * </p>
     * 
     * @param kendraConfiguration
     *        The updated configuration for connecting to an Amazon Kendra index with the
     *        <code>AMAZON.KendraSearchIntent</code> intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withKendraConfiguration(KendraConfiguration kendraConfiguration) {
        setKendraConfiguration(kendraConfiguration);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot that contains the intent.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the intent.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the intent.
     * </p>
     * 
     * @return The identifier of the bot that contains the intent.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the intent.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that contains the intent. Will always be <code>DRAFT</code>.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the intent. Will always be <code>DRAFT</code>.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the intent. Will always be <code>DRAFT</code>.
     * </p>
     * 
     * @return The version of the bot that contains the intent. Will always be <code>DRAFT</code>.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the intent. Will always be <code>DRAFT</code>.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the intent. Will always be <code>DRAFT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The updated language and locale of the intent.
     * </p>
     * 
     * @param localeId
     *        The updated language and locale of the intent.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The updated language and locale of the intent.
     * </p>
     * 
     * @return The updated language and locale of the intent.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The updated language and locale of the intent.
     * </p>
     * 
     * @param localeId
     *        The updated language and locale of the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * A timestamp of when the intent was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of when the intent was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * A timestamp of when the intent was created.
     * </p>
     * 
     * @return A timestamp of when the intent was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * A timestamp of when the intent was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of when the intent was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * A timestamp of the last time that the intent was modified.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the last time that the intent was modified.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the last time that the intent was modified.
     * </p>
     * 
     * @return A timestamp of the last time that the intent was modified.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the last time that the intent was modified.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the last time that the intent was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntentResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getIntentId() != null)
            sb.append("IntentId: ").append(getIntentId()).append(",");
        if (getIntentName() != null)
            sb.append("IntentName: ").append(getIntentName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParentIntentSignature() != null)
            sb.append("ParentIntentSignature: ").append(getParentIntentSignature()).append(",");
        if (getSampleUtterances() != null)
            sb.append("SampleUtterances: ").append(getSampleUtterances()).append(",");
        if (getDialogCodeHook() != null)
            sb.append("DialogCodeHook: ").append(getDialogCodeHook()).append(",");
        if (getFulfillmentCodeHook() != null)
            sb.append("FulfillmentCodeHook: ").append(getFulfillmentCodeHook()).append(",");
        if (getSlotPriorities() != null)
            sb.append("SlotPriorities: ").append(getSlotPriorities()).append(",");
        if (getIntentConfirmationSetting() != null)
            sb.append("IntentConfirmationSetting: ").append(getIntentConfirmationSetting()).append(",");
        if (getIntentClosingSetting() != null)
            sb.append("IntentClosingSetting: ").append(getIntentClosingSetting()).append(",");
        if (getInputContexts() != null)
            sb.append("InputContexts: ").append(getInputContexts()).append(",");
        if (getOutputContexts() != null)
            sb.append("OutputContexts: ").append(getOutputContexts()).append(",");
        if (getKendraConfiguration() != null)
            sb.append("KendraConfiguration: ").append(getKendraConfiguration()).append(",");
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIntentResult == false)
            return false;
        UpdateIntentResult other = (UpdateIntentResult) obj;
        if (other.getIntentId() == null ^ this.getIntentId() == null)
            return false;
        if (other.getIntentId() != null && other.getIntentId().equals(this.getIntentId()) == false)
            return false;
        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParentIntentSignature() == null ^ this.getParentIntentSignature() == null)
            return false;
        if (other.getParentIntentSignature() != null && other.getParentIntentSignature().equals(this.getParentIntentSignature()) == false)
            return false;
        if (other.getSampleUtterances() == null ^ this.getSampleUtterances() == null)
            return false;
        if (other.getSampleUtterances() != null && other.getSampleUtterances().equals(this.getSampleUtterances()) == false)
            return false;
        if (other.getDialogCodeHook() == null ^ this.getDialogCodeHook() == null)
            return false;
        if (other.getDialogCodeHook() != null && other.getDialogCodeHook().equals(this.getDialogCodeHook()) == false)
            return false;
        if (other.getFulfillmentCodeHook() == null ^ this.getFulfillmentCodeHook() == null)
            return false;
        if (other.getFulfillmentCodeHook() != null && other.getFulfillmentCodeHook().equals(this.getFulfillmentCodeHook()) == false)
            return false;
        if (other.getSlotPriorities() == null ^ this.getSlotPriorities() == null)
            return false;
        if (other.getSlotPriorities() != null && other.getSlotPriorities().equals(this.getSlotPriorities()) == false)
            return false;
        if (other.getIntentConfirmationSetting() == null ^ this.getIntentConfirmationSetting() == null)
            return false;
        if (other.getIntentConfirmationSetting() != null && other.getIntentConfirmationSetting().equals(this.getIntentConfirmationSetting()) == false)
            return false;
        if (other.getIntentClosingSetting() == null ^ this.getIntentClosingSetting() == null)
            return false;
        if (other.getIntentClosingSetting() != null && other.getIntentClosingSetting().equals(this.getIntentClosingSetting()) == false)
            return false;
        if (other.getInputContexts() == null ^ this.getInputContexts() == null)
            return false;
        if (other.getInputContexts() != null && other.getInputContexts().equals(this.getInputContexts()) == false)
            return false;
        if (other.getOutputContexts() == null ^ this.getOutputContexts() == null)
            return false;
        if (other.getOutputContexts() != null && other.getOutputContexts().equals(this.getOutputContexts()) == false)
            return false;
        if (other.getKendraConfiguration() == null ^ this.getKendraConfiguration() == null)
            return false;
        if (other.getKendraConfiguration() != null && other.getKendraConfiguration().equals(this.getKendraConfiguration()) == false)
            return false;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentId() == null) ? 0 : getIntentId().hashCode());
        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParentIntentSignature() == null) ? 0 : getParentIntentSignature().hashCode());
        hashCode = prime * hashCode + ((getSampleUtterances() == null) ? 0 : getSampleUtterances().hashCode());
        hashCode = prime * hashCode + ((getDialogCodeHook() == null) ? 0 : getDialogCodeHook().hashCode());
        hashCode = prime * hashCode + ((getFulfillmentCodeHook() == null) ? 0 : getFulfillmentCodeHook().hashCode());
        hashCode = prime * hashCode + ((getSlotPriorities() == null) ? 0 : getSlotPriorities().hashCode());
        hashCode = prime * hashCode + ((getIntentConfirmationSetting() == null) ? 0 : getIntentConfirmationSetting().hashCode());
        hashCode = prime * hashCode + ((getIntentClosingSetting() == null) ? 0 : getIntentClosingSetting().hashCode());
        hashCode = prime * hashCode + ((getInputContexts() == null) ? 0 : getInputContexts().hashCode());
        hashCode = prime * hashCode + ((getOutputContexts() == null) ? 0 : getOutputContexts().hashCode());
        hashCode = prime * hashCode + ((getKendraConfiguration() == null) ? 0 : getKendraConfiguration().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIntentResult clone() {
        try {
            return (UpdateIntentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
