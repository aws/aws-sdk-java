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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeIntent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIntentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier assigned to the intent when it was created.
     * </p>
     */
    private String intentId;
    /**
     * <p>
     * The name specified for the intent.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * The description of the intent.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the built-in intent that this intent is derived from, if any.
     * </p>
     */
    private String parentIntentSignature;
    /**
     * <p>
     * User utterances that trigger this intent.
     * </p>
     */
    private java.util.List<SampleUtterance> sampleUtterances;
    /**
     * <p>
     * The Lambda function called during each turn of a conversation with the intent.
     * </p>
     */
    private DialogCodeHookSettings dialogCodeHook;
    /**
     * <p>
     * The Lambda function called when the intent is complete and ready for fulfillment.
     * </p>
     */
    private FulfillmentCodeHookSettings fulfillmentCodeHook;
    /**
     * <p>
     * The list that determines the priority that slots should be elicited from the user.
     * </p>
     */
    private java.util.List<SlotPriority> slotPriorities;
    /**
     * <p>
     * Prompts that Amazon Lex sends to the user to confirm completion of an intent.
     * </p>
     */
    private IntentConfirmationSetting intentConfirmationSetting;
    /**
     * <p>
     * The response that Amazon Lex sends to when the intent is closed.
     * </p>
     */
    private IntentClosingSetting intentClosingSetting;
    /**
     * <p>
     * A list of contexts that must be active for the intent to be considered for sending to the user.
     * </p>
     */
    private java.util.List<InputContext> inputContexts;
    /**
     * <p>
     * A list of contexts that are activated when the intent is fulfilled.
     * </p>
     */
    private java.util.List<OutputContext> outputContexts;
    /**
     * <p>
     * Configuration information required to use the <code>AMAZON.KendraSearchIntent</code> intent.
     * </p>
     */
    private KendraConfiguration kendraConfiguration;
    /**
     * <p>
     * The identifier of the bot associated with the intent.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot associated with the intent.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The language and locale specified for the intent.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * A timestamp of the date and time that the intent was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * A timestamp of the date and time that the intent was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The unique identifier assigned to the intent when it was created.
     * </p>
     * 
     * @param intentId
     *        The unique identifier assigned to the intent when it was created.
     */

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    /**
     * <p>
     * The unique identifier assigned to the intent when it was created.
     * </p>
     * 
     * @return The unique identifier assigned to the intent when it was created.
     */

    public String getIntentId() {
        return this.intentId;
    }

    /**
     * <p>
     * The unique identifier assigned to the intent when it was created.
     * </p>
     * 
     * @param intentId
     *        The unique identifier assigned to the intent when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withIntentId(String intentId) {
        setIntentId(intentId);
        return this;
    }

    /**
     * <p>
     * The name specified for the intent.
     * </p>
     * 
     * @param intentName
     *        The name specified for the intent.
     */

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The name specified for the intent.
     * </p>
     * 
     * @return The name specified for the intent.
     */

    public String getIntentName() {
        return this.intentName;
    }

    /**
     * <p>
     * The name specified for the intent.
     * </p>
     * 
     * @param intentName
     *        The name specified for the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * The description of the intent.
     * </p>
     * 
     * @param description
     *        The description of the intent.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the intent.
     * </p>
     * 
     * @return The description of the intent.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the intent.
     * </p>
     * 
     * @param description
     *        The description of the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the built-in intent that this intent is derived from, if any.
     * </p>
     * 
     * @param parentIntentSignature
     *        The identifier of the built-in intent that this intent is derived from, if any.
     */

    public void setParentIntentSignature(String parentIntentSignature) {
        this.parentIntentSignature = parentIntentSignature;
    }

    /**
     * <p>
     * The identifier of the built-in intent that this intent is derived from, if any.
     * </p>
     * 
     * @return The identifier of the built-in intent that this intent is derived from, if any.
     */

    public String getParentIntentSignature() {
        return this.parentIntentSignature;
    }

    /**
     * <p>
     * The identifier of the built-in intent that this intent is derived from, if any.
     * </p>
     * 
     * @param parentIntentSignature
     *        The identifier of the built-in intent that this intent is derived from, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withParentIntentSignature(String parentIntentSignature) {
        setParentIntentSignature(parentIntentSignature);
        return this;
    }

    /**
     * <p>
     * User utterances that trigger this intent.
     * </p>
     * 
     * @return User utterances that trigger this intent.
     */

    public java.util.List<SampleUtterance> getSampleUtterances() {
        return sampleUtterances;
    }

    /**
     * <p>
     * User utterances that trigger this intent.
     * </p>
     * 
     * @param sampleUtterances
     *        User utterances that trigger this intent.
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
     * User utterances that trigger this intent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSampleUtterances(java.util.Collection)} or {@link #withSampleUtterances(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sampleUtterances
     *        User utterances that trigger this intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withSampleUtterances(SampleUtterance... sampleUtterances) {
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
     * User utterances that trigger this intent.
     * </p>
     * 
     * @param sampleUtterances
     *        User utterances that trigger this intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withSampleUtterances(java.util.Collection<SampleUtterance> sampleUtterances) {
        setSampleUtterances(sampleUtterances);
        return this;
    }

    /**
     * <p>
     * The Lambda function called during each turn of a conversation with the intent.
     * </p>
     * 
     * @param dialogCodeHook
     *        The Lambda function called during each turn of a conversation with the intent.
     */

    public void setDialogCodeHook(DialogCodeHookSettings dialogCodeHook) {
        this.dialogCodeHook = dialogCodeHook;
    }

    /**
     * <p>
     * The Lambda function called during each turn of a conversation with the intent.
     * </p>
     * 
     * @return The Lambda function called during each turn of a conversation with the intent.
     */

    public DialogCodeHookSettings getDialogCodeHook() {
        return this.dialogCodeHook;
    }

    /**
     * <p>
     * The Lambda function called during each turn of a conversation with the intent.
     * </p>
     * 
     * @param dialogCodeHook
     *        The Lambda function called during each turn of a conversation with the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withDialogCodeHook(DialogCodeHookSettings dialogCodeHook) {
        setDialogCodeHook(dialogCodeHook);
        return this;
    }

    /**
     * <p>
     * The Lambda function called when the intent is complete and ready for fulfillment.
     * </p>
     * 
     * @param fulfillmentCodeHook
     *        The Lambda function called when the intent is complete and ready for fulfillment.
     */

    public void setFulfillmentCodeHook(FulfillmentCodeHookSettings fulfillmentCodeHook) {
        this.fulfillmentCodeHook = fulfillmentCodeHook;
    }

    /**
     * <p>
     * The Lambda function called when the intent is complete and ready for fulfillment.
     * </p>
     * 
     * @return The Lambda function called when the intent is complete and ready for fulfillment.
     */

    public FulfillmentCodeHookSettings getFulfillmentCodeHook() {
        return this.fulfillmentCodeHook;
    }

    /**
     * <p>
     * The Lambda function called when the intent is complete and ready for fulfillment.
     * </p>
     * 
     * @param fulfillmentCodeHook
     *        The Lambda function called when the intent is complete and ready for fulfillment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withFulfillmentCodeHook(FulfillmentCodeHookSettings fulfillmentCodeHook) {
        setFulfillmentCodeHook(fulfillmentCodeHook);
        return this;
    }

    /**
     * <p>
     * The list that determines the priority that slots should be elicited from the user.
     * </p>
     * 
     * @return The list that determines the priority that slots should be elicited from the user.
     */

    public java.util.List<SlotPriority> getSlotPriorities() {
        return slotPriorities;
    }

    /**
     * <p>
     * The list that determines the priority that slots should be elicited from the user.
     * </p>
     * 
     * @param slotPriorities
     *        The list that determines the priority that slots should be elicited from the user.
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
     * The list that determines the priority that slots should be elicited from the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlotPriorities(java.util.Collection)} or {@link #withSlotPriorities(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param slotPriorities
     *        The list that determines the priority that slots should be elicited from the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withSlotPriorities(SlotPriority... slotPriorities) {
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
     * The list that determines the priority that slots should be elicited from the user.
     * </p>
     * 
     * @param slotPriorities
     *        The list that determines the priority that slots should be elicited from the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withSlotPriorities(java.util.Collection<SlotPriority> slotPriorities) {
        setSlotPriorities(slotPriorities);
        return this;
    }

    /**
     * <p>
     * Prompts that Amazon Lex sends to the user to confirm completion of an intent.
     * </p>
     * 
     * @param intentConfirmationSetting
     *        Prompts that Amazon Lex sends to the user to confirm completion of an intent.
     */

    public void setIntentConfirmationSetting(IntentConfirmationSetting intentConfirmationSetting) {
        this.intentConfirmationSetting = intentConfirmationSetting;
    }

    /**
     * <p>
     * Prompts that Amazon Lex sends to the user to confirm completion of an intent.
     * </p>
     * 
     * @return Prompts that Amazon Lex sends to the user to confirm completion of an intent.
     */

    public IntentConfirmationSetting getIntentConfirmationSetting() {
        return this.intentConfirmationSetting;
    }

    /**
     * <p>
     * Prompts that Amazon Lex sends to the user to confirm completion of an intent.
     * </p>
     * 
     * @param intentConfirmationSetting
     *        Prompts that Amazon Lex sends to the user to confirm completion of an intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withIntentConfirmationSetting(IntentConfirmationSetting intentConfirmationSetting) {
        setIntentConfirmationSetting(intentConfirmationSetting);
        return this;
    }

    /**
     * <p>
     * The response that Amazon Lex sends to when the intent is closed.
     * </p>
     * 
     * @param intentClosingSetting
     *        The response that Amazon Lex sends to when the intent is closed.
     */

    public void setIntentClosingSetting(IntentClosingSetting intentClosingSetting) {
        this.intentClosingSetting = intentClosingSetting;
    }

    /**
     * <p>
     * The response that Amazon Lex sends to when the intent is closed.
     * </p>
     * 
     * @return The response that Amazon Lex sends to when the intent is closed.
     */

    public IntentClosingSetting getIntentClosingSetting() {
        return this.intentClosingSetting;
    }

    /**
     * <p>
     * The response that Amazon Lex sends to when the intent is closed.
     * </p>
     * 
     * @param intentClosingSetting
     *        The response that Amazon Lex sends to when the intent is closed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withIntentClosingSetting(IntentClosingSetting intentClosingSetting) {
        setIntentClosingSetting(intentClosingSetting);
        return this;
    }

    /**
     * <p>
     * A list of contexts that must be active for the intent to be considered for sending to the user.
     * </p>
     * 
     * @return A list of contexts that must be active for the intent to be considered for sending to the user.
     */

    public java.util.List<InputContext> getInputContexts() {
        return inputContexts;
    }

    /**
     * <p>
     * A list of contexts that must be active for the intent to be considered for sending to the user.
     * </p>
     * 
     * @param inputContexts
     *        A list of contexts that must be active for the intent to be considered for sending to the user.
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
     * A list of contexts that must be active for the intent to be considered for sending to the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputContexts(java.util.Collection)} or {@link #withInputContexts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputContexts
     *        A list of contexts that must be active for the intent to be considered for sending to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withInputContexts(InputContext... inputContexts) {
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
     * A list of contexts that must be active for the intent to be considered for sending to the user.
     * </p>
     * 
     * @param inputContexts
     *        A list of contexts that must be active for the intent to be considered for sending to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withInputContexts(java.util.Collection<InputContext> inputContexts) {
        setInputContexts(inputContexts);
        return this;
    }

    /**
     * <p>
     * A list of contexts that are activated when the intent is fulfilled.
     * </p>
     * 
     * @return A list of contexts that are activated when the intent is fulfilled.
     */

    public java.util.List<OutputContext> getOutputContexts() {
        return outputContexts;
    }

    /**
     * <p>
     * A list of contexts that are activated when the intent is fulfilled.
     * </p>
     * 
     * @param outputContexts
     *        A list of contexts that are activated when the intent is fulfilled.
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
     * A list of contexts that are activated when the intent is fulfilled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputContexts(java.util.Collection)} or {@link #withOutputContexts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputContexts
     *        A list of contexts that are activated when the intent is fulfilled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withOutputContexts(OutputContext... outputContexts) {
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
     * A list of contexts that are activated when the intent is fulfilled.
     * </p>
     * 
     * @param outputContexts
     *        A list of contexts that are activated when the intent is fulfilled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withOutputContexts(java.util.Collection<OutputContext> outputContexts) {
        setOutputContexts(outputContexts);
        return this;
    }

    /**
     * <p>
     * Configuration information required to use the <code>AMAZON.KendraSearchIntent</code> intent.
     * </p>
     * 
     * @param kendraConfiguration
     *        Configuration information required to use the <code>AMAZON.KendraSearchIntent</code> intent.
     */

    public void setKendraConfiguration(KendraConfiguration kendraConfiguration) {
        this.kendraConfiguration = kendraConfiguration;
    }

    /**
     * <p>
     * Configuration information required to use the <code>AMAZON.KendraSearchIntent</code> intent.
     * </p>
     * 
     * @return Configuration information required to use the <code>AMAZON.KendraSearchIntent</code> intent.
     */

    public KendraConfiguration getKendraConfiguration() {
        return this.kendraConfiguration;
    }

    /**
     * <p>
     * Configuration information required to use the <code>AMAZON.KendraSearchIntent</code> intent.
     * </p>
     * 
     * @param kendraConfiguration
     *        Configuration information required to use the <code>AMAZON.KendraSearchIntent</code> intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withKendraConfiguration(KendraConfiguration kendraConfiguration) {
        setKendraConfiguration(kendraConfiguration);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot associated with the intent.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with the intent.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with the intent.
     * </p>
     * 
     * @return The identifier of the bot associated with the intent.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with the intent.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot associated with the intent.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot associated with the intent.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot associated with the intent.
     * </p>
     * 
     * @return The version of the bot associated with the intent.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot associated with the intent.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot associated with the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The language and locale specified for the intent.
     * </p>
     * 
     * @param localeId
     *        The language and locale specified for the intent.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The language and locale specified for the intent.
     * </p>
     * 
     * @return The language and locale specified for the intent.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The language and locale specified for the intent.
     * </p>
     * 
     * @param localeId
     *        The language and locale specified for the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the intent was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the intent was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the intent was created.
     * </p>
     * 
     * @return A timestamp of the date and time that the intent was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the intent was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the intent was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the intent was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the intent was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the intent was last updated.
     * </p>
     * 
     * @return A timestamp of the date and time that the intent was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the intent was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the intent was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIntentResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
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

        if (obj instanceof DescribeIntentResult == false)
            return false;
        DescribeIntentResult other = (DescribeIntentResult) obj;
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
    public DescribeIntentResult clone() {
        try {
            return (DescribeIntentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
