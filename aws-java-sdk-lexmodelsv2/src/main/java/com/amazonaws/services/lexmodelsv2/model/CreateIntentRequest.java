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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateIntent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIntentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the intent. Intent names must be unique in the locale that contains the intent and cannot match the
     * name of any built-in intent.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * A description of the intent. Use the description to help identify the intent in lists.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique identifier for the built-in intent to base this intent on.
     * </p>
     */
    private String parentIntentSignature;
    /**
     * <p>
     * An array of strings that a user might say to signal the intent. For example, "I want a pizza", or
     * "I want a {PizzaSize} pizza".
     * </p>
     * <p>
     * In an utterance, slot names are enclosed in curly braces ("{", "}") to indicate where they should be displayed in
     * the utterance shown to the user..
     * </p>
     */
    private java.util.List<SampleUtterance> sampleUtterances;
    /**
     * <p>
     * Specifies that Amazon Lex invokes the alias Lambda function for each user input. You can invoke this Lambda
     * function to personalize user interaction.
     * </p>
     * <p>
     * For example, suppose that your bot determines that the user's name is John. You Lambda function might retrieve
     * John's information from a backend database and prepopulate some of the values. For example, if you find that John
     * is gluten intolerant, you might set the corresponding intent slot, <code>glutenIntolerant</code> to
     * <code>true</code>. You might find John's phone number and set the corresponding session attribute.
     * </p>
     */
    private DialogCodeHookSettings dialogCodeHook;
    /**
     * <p>
     * Specifies that Amazon Lex invokes the alias Lambda function when the intent is ready for fulfillment. You can
     * invoke this function to complete the bot's transaction with the user.
     * </p>
     * <p>
     * For example, in a pizza ordering bot, the Lambda function can look up the closest pizza restaurant to the
     * customer's location and then place an order on the customer's behalf.
     * </p>
     */
    private FulfillmentCodeHookSettings fulfillmentCodeHook;
    /**
     * <p>
     * Provides prompts that Amazon Lex sends to the user to confirm the completion of an intent. If the user answers
     * "no," the settings contain a statement that is sent to the user to end the intent.
     * </p>
     */
    private IntentConfirmationSetting intentConfirmationSetting;
    /**
     * <p>
     * Sets the response that Amazon Lex sends to the user when the intent is closed.
     * </p>
     */
    private IntentClosingSetting intentClosingSetting;
    /**
     * <p>
     * A list of contexts that must be active for this intent to be considered by Amazon Lex.
     * </p>
     * <p>
     * When an intent has an input context list, Amazon Lex only considers using the intent in an interaction with the
     * user when the specified contexts are included in the active context list for the session. If the contexts are not
     * active, then Amazon Lex will not use the intent.
     * </p>
     * <p>
     * A context can be automatically activated using the <code>outputContexts</code> property or it can be set at
     * runtime.
     * </p>
     * <p>
     * For example, if there are two intents with different input contexts that respond to the same utterances, only the
     * intent with the active context will respond.
     * </p>
     * <p>
     * An intent may have up to 5 input contexts. If an intent has multiple input contexts, all of the contexts must be
     * active to consider the intent.
     * </p>
     */
    private java.util.List<InputContext> inputContexts;
    /**
     * <p>
     * A lists of contexts that the intent activates when it is fulfilled.
     * </p>
     * <p>
     * You can use an output context to indicate the intents that Amazon Lex should consider for the next turn of the
     * conversation with a customer.
     * </p>
     * <p>
     * When you use the <code>outputContextsList</code> property, all of the contexts specified in the list are
     * activated when the intent is fulfilled. You can set up to 10 output contexts. You can also set the number of
     * conversation turns that the context should be active, or the length of time that the context should be active.
     * </p>
     */
    private java.util.List<OutputContext> outputContexts;
    /**
     * <p>
     * Configuration information required to use the <code>AMAZON.KendraSearchIntent</code> intent to connect to an
     * Amazon Kendra index. The <code>AMAZON.KendraSearchIntent</code> intent is called when Amazon Lex can't determine
     * another intent to invoke.
     * </p>
     */
    private KendraConfiguration kendraConfiguration;
    /**
     * <p>
     * The identifier of the bot associated with this intent.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The identifier of the version of the bot associated with this intent.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale where this intent is used. All of the bots, slot types, and slots used
     * by the intent must have the same locale. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     */
    private String localeId;

    /**
     * <p>
     * The name of the intent. Intent names must be unique in the locale that contains the intent and cannot match the
     * name of any built-in intent.
     * </p>
     * 
     * @param intentName
     *        The name of the intent. Intent names must be unique in the locale that contains the intent and cannot
     *        match the name of any built-in intent.
     */

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The name of the intent. Intent names must be unique in the locale that contains the intent and cannot match the
     * name of any built-in intent.
     * </p>
     * 
     * @return The name of the intent. Intent names must be unique in the locale that contains the intent and cannot
     *         match the name of any built-in intent.
     */

    public String getIntentName() {
        return this.intentName;
    }

    /**
     * <p>
     * The name of the intent. Intent names must be unique in the locale that contains the intent and cannot match the
     * name of any built-in intent.
     * </p>
     * 
     * @param intentName
     *        The name of the intent. Intent names must be unique in the locale that contains the intent and cannot
     *        match the name of any built-in intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * A description of the intent. Use the description to help identify the intent in lists.
     * </p>
     * 
     * @param description
     *        A description of the intent. Use the description to help identify the intent in lists.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the intent. Use the description to help identify the intent in lists.
     * </p>
     * 
     * @return A description of the intent. Use the description to help identify the intent in lists.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the intent. Use the description to help identify the intent in lists.
     * </p>
     * 
     * @param description
     *        A description of the intent. Use the description to help identify the intent in lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the built-in intent to base this intent on.
     * </p>
     * 
     * @param parentIntentSignature
     *        A unique identifier for the built-in intent to base this intent on.
     */

    public void setParentIntentSignature(String parentIntentSignature) {
        this.parentIntentSignature = parentIntentSignature;
    }

    /**
     * <p>
     * A unique identifier for the built-in intent to base this intent on.
     * </p>
     * 
     * @return A unique identifier for the built-in intent to base this intent on.
     */

    public String getParentIntentSignature() {
        return this.parentIntentSignature;
    }

    /**
     * <p>
     * A unique identifier for the built-in intent to base this intent on.
     * </p>
     * 
     * @param parentIntentSignature
     *        A unique identifier for the built-in intent to base this intent on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withParentIntentSignature(String parentIntentSignature) {
        setParentIntentSignature(parentIntentSignature);
        return this;
    }

    /**
     * <p>
     * An array of strings that a user might say to signal the intent. For example, "I want a pizza", or
     * "I want a {PizzaSize} pizza".
     * </p>
     * <p>
     * In an utterance, slot names are enclosed in curly braces ("{", "}") to indicate where they should be displayed in
     * the utterance shown to the user..
     * </p>
     * 
     * @return An array of strings that a user might say to signal the intent. For example, "I want a pizza", or
     *         "I want a {PizzaSize} pizza". </p>
     *         <p>
     *         In an utterance, slot names are enclosed in curly braces ("{", "}") to indicate where they should be
     *         displayed in the utterance shown to the user..
     */

    public java.util.List<SampleUtterance> getSampleUtterances() {
        return sampleUtterances;
    }

    /**
     * <p>
     * An array of strings that a user might say to signal the intent. For example, "I want a pizza", or
     * "I want a {PizzaSize} pizza".
     * </p>
     * <p>
     * In an utterance, slot names are enclosed in curly braces ("{", "}") to indicate where they should be displayed in
     * the utterance shown to the user..
     * </p>
     * 
     * @param sampleUtterances
     *        An array of strings that a user might say to signal the intent. For example, "I want a pizza", or
     *        "I want a {PizzaSize} pizza". </p>
     *        <p>
     *        In an utterance, slot names are enclosed in curly braces ("{", "}") to indicate where they should be
     *        displayed in the utterance shown to the user..
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
     * An array of strings that a user might say to signal the intent. For example, "I want a pizza", or
     * "I want a {PizzaSize} pizza".
     * </p>
     * <p>
     * In an utterance, slot names are enclosed in curly braces ("{", "}") to indicate where they should be displayed in
     * the utterance shown to the user..
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSampleUtterances(java.util.Collection)} or {@link #withSampleUtterances(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sampleUtterances
     *        An array of strings that a user might say to signal the intent. For example, "I want a pizza", or
     *        "I want a {PizzaSize} pizza". </p>
     *        <p>
     *        In an utterance, slot names are enclosed in curly braces ("{", "}") to indicate where they should be
     *        displayed in the utterance shown to the user..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withSampleUtterances(SampleUtterance... sampleUtterances) {
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
     * An array of strings that a user might say to signal the intent. For example, "I want a pizza", or
     * "I want a {PizzaSize} pizza".
     * </p>
     * <p>
     * In an utterance, slot names are enclosed in curly braces ("{", "}") to indicate where they should be displayed in
     * the utterance shown to the user..
     * </p>
     * 
     * @param sampleUtterances
     *        An array of strings that a user might say to signal the intent. For example, "I want a pizza", or
     *        "I want a {PizzaSize} pizza". </p>
     *        <p>
     *        In an utterance, slot names are enclosed in curly braces ("{", "}") to indicate where they should be
     *        displayed in the utterance shown to the user..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withSampleUtterances(java.util.Collection<SampleUtterance> sampleUtterances) {
        setSampleUtterances(sampleUtterances);
        return this;
    }

    /**
     * <p>
     * Specifies that Amazon Lex invokes the alias Lambda function for each user input. You can invoke this Lambda
     * function to personalize user interaction.
     * </p>
     * <p>
     * For example, suppose that your bot determines that the user's name is John. You Lambda function might retrieve
     * John's information from a backend database and prepopulate some of the values. For example, if you find that John
     * is gluten intolerant, you might set the corresponding intent slot, <code>glutenIntolerant</code> to
     * <code>true</code>. You might find John's phone number and set the corresponding session attribute.
     * </p>
     * 
     * @param dialogCodeHook
     *        Specifies that Amazon Lex invokes the alias Lambda function for each user input. You can invoke this
     *        Lambda function to personalize user interaction.</p>
     *        <p>
     *        For example, suppose that your bot determines that the user's name is John. You Lambda function might
     *        retrieve John's information from a backend database and prepopulate some of the values. For example, if
     *        you find that John is gluten intolerant, you might set the corresponding intent slot,
     *        <code>glutenIntolerant</code> to <code>true</code>. You might find John's phone number and set the
     *        corresponding session attribute.
     */

    public void setDialogCodeHook(DialogCodeHookSettings dialogCodeHook) {
        this.dialogCodeHook = dialogCodeHook;
    }

    /**
     * <p>
     * Specifies that Amazon Lex invokes the alias Lambda function for each user input. You can invoke this Lambda
     * function to personalize user interaction.
     * </p>
     * <p>
     * For example, suppose that your bot determines that the user's name is John. You Lambda function might retrieve
     * John's information from a backend database and prepopulate some of the values. For example, if you find that John
     * is gluten intolerant, you might set the corresponding intent slot, <code>glutenIntolerant</code> to
     * <code>true</code>. You might find John's phone number and set the corresponding session attribute.
     * </p>
     * 
     * @return Specifies that Amazon Lex invokes the alias Lambda function for each user input. You can invoke this
     *         Lambda function to personalize user interaction.</p>
     *         <p>
     *         For example, suppose that your bot determines that the user's name is John. You Lambda function might
     *         retrieve John's information from a backend database and prepopulate some of the values. For example, if
     *         you find that John is gluten intolerant, you might set the corresponding intent slot,
     *         <code>glutenIntolerant</code> to <code>true</code>. You might find John's phone number and set the
     *         corresponding session attribute.
     */

    public DialogCodeHookSettings getDialogCodeHook() {
        return this.dialogCodeHook;
    }

    /**
     * <p>
     * Specifies that Amazon Lex invokes the alias Lambda function for each user input. You can invoke this Lambda
     * function to personalize user interaction.
     * </p>
     * <p>
     * For example, suppose that your bot determines that the user's name is John. You Lambda function might retrieve
     * John's information from a backend database and prepopulate some of the values. For example, if you find that John
     * is gluten intolerant, you might set the corresponding intent slot, <code>glutenIntolerant</code> to
     * <code>true</code>. You might find John's phone number and set the corresponding session attribute.
     * </p>
     * 
     * @param dialogCodeHook
     *        Specifies that Amazon Lex invokes the alias Lambda function for each user input. You can invoke this
     *        Lambda function to personalize user interaction.</p>
     *        <p>
     *        For example, suppose that your bot determines that the user's name is John. You Lambda function might
     *        retrieve John's information from a backend database and prepopulate some of the values. For example, if
     *        you find that John is gluten intolerant, you might set the corresponding intent slot,
     *        <code>glutenIntolerant</code> to <code>true</code>. You might find John's phone number and set the
     *        corresponding session attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withDialogCodeHook(DialogCodeHookSettings dialogCodeHook) {
        setDialogCodeHook(dialogCodeHook);
        return this;
    }

    /**
     * <p>
     * Specifies that Amazon Lex invokes the alias Lambda function when the intent is ready for fulfillment. You can
     * invoke this function to complete the bot's transaction with the user.
     * </p>
     * <p>
     * For example, in a pizza ordering bot, the Lambda function can look up the closest pizza restaurant to the
     * customer's location and then place an order on the customer's behalf.
     * </p>
     * 
     * @param fulfillmentCodeHook
     *        Specifies that Amazon Lex invokes the alias Lambda function when the intent is ready for fulfillment. You
     *        can invoke this function to complete the bot's transaction with the user.</p>
     *        <p>
     *        For example, in a pizza ordering bot, the Lambda function can look up the closest pizza restaurant to the
     *        customer's location and then place an order on the customer's behalf.
     */

    public void setFulfillmentCodeHook(FulfillmentCodeHookSettings fulfillmentCodeHook) {
        this.fulfillmentCodeHook = fulfillmentCodeHook;
    }

    /**
     * <p>
     * Specifies that Amazon Lex invokes the alias Lambda function when the intent is ready for fulfillment. You can
     * invoke this function to complete the bot's transaction with the user.
     * </p>
     * <p>
     * For example, in a pizza ordering bot, the Lambda function can look up the closest pizza restaurant to the
     * customer's location and then place an order on the customer's behalf.
     * </p>
     * 
     * @return Specifies that Amazon Lex invokes the alias Lambda function when the intent is ready for fulfillment. You
     *         can invoke this function to complete the bot's transaction with the user.</p>
     *         <p>
     *         For example, in a pizza ordering bot, the Lambda function can look up the closest pizza restaurant to the
     *         customer's location and then place an order on the customer's behalf.
     */

    public FulfillmentCodeHookSettings getFulfillmentCodeHook() {
        return this.fulfillmentCodeHook;
    }

    /**
     * <p>
     * Specifies that Amazon Lex invokes the alias Lambda function when the intent is ready for fulfillment. You can
     * invoke this function to complete the bot's transaction with the user.
     * </p>
     * <p>
     * For example, in a pizza ordering bot, the Lambda function can look up the closest pizza restaurant to the
     * customer's location and then place an order on the customer's behalf.
     * </p>
     * 
     * @param fulfillmentCodeHook
     *        Specifies that Amazon Lex invokes the alias Lambda function when the intent is ready for fulfillment. You
     *        can invoke this function to complete the bot's transaction with the user.</p>
     *        <p>
     *        For example, in a pizza ordering bot, the Lambda function can look up the closest pizza restaurant to the
     *        customer's location and then place an order on the customer's behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withFulfillmentCodeHook(FulfillmentCodeHookSettings fulfillmentCodeHook) {
        setFulfillmentCodeHook(fulfillmentCodeHook);
        return this;
    }

    /**
     * <p>
     * Provides prompts that Amazon Lex sends to the user to confirm the completion of an intent. If the user answers
     * "no," the settings contain a statement that is sent to the user to end the intent.
     * </p>
     * 
     * @param intentConfirmationSetting
     *        Provides prompts that Amazon Lex sends to the user to confirm the completion of an intent. If the user
     *        answers "no," the settings contain a statement that is sent to the user to end the intent.
     */

    public void setIntentConfirmationSetting(IntentConfirmationSetting intentConfirmationSetting) {
        this.intentConfirmationSetting = intentConfirmationSetting;
    }

    /**
     * <p>
     * Provides prompts that Amazon Lex sends to the user to confirm the completion of an intent. If the user answers
     * "no," the settings contain a statement that is sent to the user to end the intent.
     * </p>
     * 
     * @return Provides prompts that Amazon Lex sends to the user to confirm the completion of an intent. If the user
     *         answers "no," the settings contain a statement that is sent to the user to end the intent.
     */

    public IntentConfirmationSetting getIntentConfirmationSetting() {
        return this.intentConfirmationSetting;
    }

    /**
     * <p>
     * Provides prompts that Amazon Lex sends to the user to confirm the completion of an intent. If the user answers
     * "no," the settings contain a statement that is sent to the user to end the intent.
     * </p>
     * 
     * @param intentConfirmationSetting
     *        Provides prompts that Amazon Lex sends to the user to confirm the completion of an intent. If the user
     *        answers "no," the settings contain a statement that is sent to the user to end the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withIntentConfirmationSetting(IntentConfirmationSetting intentConfirmationSetting) {
        setIntentConfirmationSetting(intentConfirmationSetting);
        return this;
    }

    /**
     * <p>
     * Sets the response that Amazon Lex sends to the user when the intent is closed.
     * </p>
     * 
     * @param intentClosingSetting
     *        Sets the response that Amazon Lex sends to the user when the intent is closed.
     */

    public void setIntentClosingSetting(IntentClosingSetting intentClosingSetting) {
        this.intentClosingSetting = intentClosingSetting;
    }

    /**
     * <p>
     * Sets the response that Amazon Lex sends to the user when the intent is closed.
     * </p>
     * 
     * @return Sets the response that Amazon Lex sends to the user when the intent is closed.
     */

    public IntentClosingSetting getIntentClosingSetting() {
        return this.intentClosingSetting;
    }

    /**
     * <p>
     * Sets the response that Amazon Lex sends to the user when the intent is closed.
     * </p>
     * 
     * @param intentClosingSetting
     *        Sets the response that Amazon Lex sends to the user when the intent is closed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withIntentClosingSetting(IntentClosingSetting intentClosingSetting) {
        setIntentClosingSetting(intentClosingSetting);
        return this;
    }

    /**
     * <p>
     * A list of contexts that must be active for this intent to be considered by Amazon Lex.
     * </p>
     * <p>
     * When an intent has an input context list, Amazon Lex only considers using the intent in an interaction with the
     * user when the specified contexts are included in the active context list for the session. If the contexts are not
     * active, then Amazon Lex will not use the intent.
     * </p>
     * <p>
     * A context can be automatically activated using the <code>outputContexts</code> property or it can be set at
     * runtime.
     * </p>
     * <p>
     * For example, if there are two intents with different input contexts that respond to the same utterances, only the
     * intent with the active context will respond.
     * </p>
     * <p>
     * An intent may have up to 5 input contexts. If an intent has multiple input contexts, all of the contexts must be
     * active to consider the intent.
     * </p>
     * 
     * @return A list of contexts that must be active for this intent to be considered by Amazon Lex.</p>
     *         <p>
     *         When an intent has an input context list, Amazon Lex only considers using the intent in an interaction
     *         with the user when the specified contexts are included in the active context list for the session. If the
     *         contexts are not active, then Amazon Lex will not use the intent.
     *         </p>
     *         <p>
     *         A context can be automatically activated using the <code>outputContexts</code> property or it can be set
     *         at runtime.
     *         </p>
     *         <p>
     *         For example, if there are two intents with different input contexts that respond to the same utterances,
     *         only the intent with the active context will respond.
     *         </p>
     *         <p>
     *         An intent may have up to 5 input contexts. If an intent has multiple input contexts, all of the contexts
     *         must be active to consider the intent.
     */

    public java.util.List<InputContext> getInputContexts() {
        return inputContexts;
    }

    /**
     * <p>
     * A list of contexts that must be active for this intent to be considered by Amazon Lex.
     * </p>
     * <p>
     * When an intent has an input context list, Amazon Lex only considers using the intent in an interaction with the
     * user when the specified contexts are included in the active context list for the session. If the contexts are not
     * active, then Amazon Lex will not use the intent.
     * </p>
     * <p>
     * A context can be automatically activated using the <code>outputContexts</code> property or it can be set at
     * runtime.
     * </p>
     * <p>
     * For example, if there are two intents with different input contexts that respond to the same utterances, only the
     * intent with the active context will respond.
     * </p>
     * <p>
     * An intent may have up to 5 input contexts. If an intent has multiple input contexts, all of the contexts must be
     * active to consider the intent.
     * </p>
     * 
     * @param inputContexts
     *        A list of contexts that must be active for this intent to be considered by Amazon Lex.</p>
     *        <p>
     *        When an intent has an input context list, Amazon Lex only considers using the intent in an interaction
     *        with the user when the specified contexts are included in the active context list for the session. If the
     *        contexts are not active, then Amazon Lex will not use the intent.
     *        </p>
     *        <p>
     *        A context can be automatically activated using the <code>outputContexts</code> property or it can be set
     *        at runtime.
     *        </p>
     *        <p>
     *        For example, if there are two intents with different input contexts that respond to the same utterances,
     *        only the intent with the active context will respond.
     *        </p>
     *        <p>
     *        An intent may have up to 5 input contexts. If an intent has multiple input contexts, all of the contexts
     *        must be active to consider the intent.
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
     * A list of contexts that must be active for this intent to be considered by Amazon Lex.
     * </p>
     * <p>
     * When an intent has an input context list, Amazon Lex only considers using the intent in an interaction with the
     * user when the specified contexts are included in the active context list for the session. If the contexts are not
     * active, then Amazon Lex will not use the intent.
     * </p>
     * <p>
     * A context can be automatically activated using the <code>outputContexts</code> property or it can be set at
     * runtime.
     * </p>
     * <p>
     * For example, if there are two intents with different input contexts that respond to the same utterances, only the
     * intent with the active context will respond.
     * </p>
     * <p>
     * An intent may have up to 5 input contexts. If an intent has multiple input contexts, all of the contexts must be
     * active to consider the intent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputContexts(java.util.Collection)} or {@link #withInputContexts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputContexts
     *        A list of contexts that must be active for this intent to be considered by Amazon Lex.</p>
     *        <p>
     *        When an intent has an input context list, Amazon Lex only considers using the intent in an interaction
     *        with the user when the specified contexts are included in the active context list for the session. If the
     *        contexts are not active, then Amazon Lex will not use the intent.
     *        </p>
     *        <p>
     *        A context can be automatically activated using the <code>outputContexts</code> property or it can be set
     *        at runtime.
     *        </p>
     *        <p>
     *        For example, if there are two intents with different input contexts that respond to the same utterances,
     *        only the intent with the active context will respond.
     *        </p>
     *        <p>
     *        An intent may have up to 5 input contexts. If an intent has multiple input contexts, all of the contexts
     *        must be active to consider the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withInputContexts(InputContext... inputContexts) {
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
     * A list of contexts that must be active for this intent to be considered by Amazon Lex.
     * </p>
     * <p>
     * When an intent has an input context list, Amazon Lex only considers using the intent in an interaction with the
     * user when the specified contexts are included in the active context list for the session. If the contexts are not
     * active, then Amazon Lex will not use the intent.
     * </p>
     * <p>
     * A context can be automatically activated using the <code>outputContexts</code> property or it can be set at
     * runtime.
     * </p>
     * <p>
     * For example, if there are two intents with different input contexts that respond to the same utterances, only the
     * intent with the active context will respond.
     * </p>
     * <p>
     * An intent may have up to 5 input contexts. If an intent has multiple input contexts, all of the contexts must be
     * active to consider the intent.
     * </p>
     * 
     * @param inputContexts
     *        A list of contexts that must be active for this intent to be considered by Amazon Lex.</p>
     *        <p>
     *        When an intent has an input context list, Amazon Lex only considers using the intent in an interaction
     *        with the user when the specified contexts are included in the active context list for the session. If the
     *        contexts are not active, then Amazon Lex will not use the intent.
     *        </p>
     *        <p>
     *        A context can be automatically activated using the <code>outputContexts</code> property or it can be set
     *        at runtime.
     *        </p>
     *        <p>
     *        For example, if there are two intents with different input contexts that respond to the same utterances,
     *        only the intent with the active context will respond.
     *        </p>
     *        <p>
     *        An intent may have up to 5 input contexts. If an intent has multiple input contexts, all of the contexts
     *        must be active to consider the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withInputContexts(java.util.Collection<InputContext> inputContexts) {
        setInputContexts(inputContexts);
        return this;
    }

    /**
     * <p>
     * A lists of contexts that the intent activates when it is fulfilled.
     * </p>
     * <p>
     * You can use an output context to indicate the intents that Amazon Lex should consider for the next turn of the
     * conversation with a customer.
     * </p>
     * <p>
     * When you use the <code>outputContextsList</code> property, all of the contexts specified in the list are
     * activated when the intent is fulfilled. You can set up to 10 output contexts. You can also set the number of
     * conversation turns that the context should be active, or the length of time that the context should be active.
     * </p>
     * 
     * @return A lists of contexts that the intent activates when it is fulfilled.</p>
     *         <p>
     *         You can use an output context to indicate the intents that Amazon Lex should consider for the next turn
     *         of the conversation with a customer.
     *         </p>
     *         <p>
     *         When you use the <code>outputContextsList</code> property, all of the contexts specified in the list are
     *         activated when the intent is fulfilled. You can set up to 10 output contexts. You can also set the number
     *         of conversation turns that the context should be active, or the length of time that the context should be
     *         active.
     */

    public java.util.List<OutputContext> getOutputContexts() {
        return outputContexts;
    }

    /**
     * <p>
     * A lists of contexts that the intent activates when it is fulfilled.
     * </p>
     * <p>
     * You can use an output context to indicate the intents that Amazon Lex should consider for the next turn of the
     * conversation with a customer.
     * </p>
     * <p>
     * When you use the <code>outputContextsList</code> property, all of the contexts specified in the list are
     * activated when the intent is fulfilled. You can set up to 10 output contexts. You can also set the number of
     * conversation turns that the context should be active, or the length of time that the context should be active.
     * </p>
     * 
     * @param outputContexts
     *        A lists of contexts that the intent activates when it is fulfilled.</p>
     *        <p>
     *        You can use an output context to indicate the intents that Amazon Lex should consider for the next turn of
     *        the conversation with a customer.
     *        </p>
     *        <p>
     *        When you use the <code>outputContextsList</code> property, all of the contexts specified in the list are
     *        activated when the intent is fulfilled. You can set up to 10 output contexts. You can also set the number
     *        of conversation turns that the context should be active, or the length of time that the context should be
     *        active.
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
     * A lists of contexts that the intent activates when it is fulfilled.
     * </p>
     * <p>
     * You can use an output context to indicate the intents that Amazon Lex should consider for the next turn of the
     * conversation with a customer.
     * </p>
     * <p>
     * When you use the <code>outputContextsList</code> property, all of the contexts specified in the list are
     * activated when the intent is fulfilled. You can set up to 10 output contexts. You can also set the number of
     * conversation turns that the context should be active, or the length of time that the context should be active.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputContexts(java.util.Collection)} or {@link #withOutputContexts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputContexts
     *        A lists of contexts that the intent activates when it is fulfilled.</p>
     *        <p>
     *        You can use an output context to indicate the intents that Amazon Lex should consider for the next turn of
     *        the conversation with a customer.
     *        </p>
     *        <p>
     *        When you use the <code>outputContextsList</code> property, all of the contexts specified in the list are
     *        activated when the intent is fulfilled. You can set up to 10 output contexts. You can also set the number
     *        of conversation turns that the context should be active, or the length of time that the context should be
     *        active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withOutputContexts(OutputContext... outputContexts) {
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
     * A lists of contexts that the intent activates when it is fulfilled.
     * </p>
     * <p>
     * You can use an output context to indicate the intents that Amazon Lex should consider for the next turn of the
     * conversation with a customer.
     * </p>
     * <p>
     * When you use the <code>outputContextsList</code> property, all of the contexts specified in the list are
     * activated when the intent is fulfilled. You can set up to 10 output contexts. You can also set the number of
     * conversation turns that the context should be active, or the length of time that the context should be active.
     * </p>
     * 
     * @param outputContexts
     *        A lists of contexts that the intent activates when it is fulfilled.</p>
     *        <p>
     *        You can use an output context to indicate the intents that Amazon Lex should consider for the next turn of
     *        the conversation with a customer.
     *        </p>
     *        <p>
     *        When you use the <code>outputContextsList</code> property, all of the contexts specified in the list are
     *        activated when the intent is fulfilled. You can set up to 10 output contexts. You can also set the number
     *        of conversation turns that the context should be active, or the length of time that the context should be
     *        active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withOutputContexts(java.util.Collection<OutputContext> outputContexts) {
        setOutputContexts(outputContexts);
        return this;
    }

    /**
     * <p>
     * Configuration information required to use the <code>AMAZON.KendraSearchIntent</code> intent to connect to an
     * Amazon Kendra index. The <code>AMAZON.KendraSearchIntent</code> intent is called when Amazon Lex can't determine
     * another intent to invoke.
     * </p>
     * 
     * @param kendraConfiguration
     *        Configuration information required to use the <code>AMAZON.KendraSearchIntent</code> intent to connect to
     *        an Amazon Kendra index. The <code>AMAZON.KendraSearchIntent</code> intent is called when Amazon Lex can't
     *        determine another intent to invoke.
     */

    public void setKendraConfiguration(KendraConfiguration kendraConfiguration) {
        this.kendraConfiguration = kendraConfiguration;
    }

    /**
     * <p>
     * Configuration information required to use the <code>AMAZON.KendraSearchIntent</code> intent to connect to an
     * Amazon Kendra index. The <code>AMAZON.KendraSearchIntent</code> intent is called when Amazon Lex can't determine
     * another intent to invoke.
     * </p>
     * 
     * @return Configuration information required to use the <code>AMAZON.KendraSearchIntent</code> intent to connect to
     *         an Amazon Kendra index. The <code>AMAZON.KendraSearchIntent</code> intent is called when Amazon Lex can't
     *         determine another intent to invoke.
     */

    public KendraConfiguration getKendraConfiguration() {
        return this.kendraConfiguration;
    }

    /**
     * <p>
     * Configuration information required to use the <code>AMAZON.KendraSearchIntent</code> intent to connect to an
     * Amazon Kendra index. The <code>AMAZON.KendraSearchIntent</code> intent is called when Amazon Lex can't determine
     * another intent to invoke.
     * </p>
     * 
     * @param kendraConfiguration
     *        Configuration information required to use the <code>AMAZON.KendraSearchIntent</code> intent to connect to
     *        an Amazon Kendra index. The <code>AMAZON.KendraSearchIntent</code> intent is called when Amazon Lex can't
     *        determine another intent to invoke.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withKendraConfiguration(KendraConfiguration kendraConfiguration) {
        setKendraConfiguration(kendraConfiguration);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot associated with this intent.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with this intent.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with this intent.
     * </p>
     * 
     * @return The identifier of the bot associated with this intent.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with this intent.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with this intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The identifier of the version of the bot associated with this intent.
     * </p>
     * 
     * @param botVersion
     *        The identifier of the version of the bot associated with this intent.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The identifier of the version of the bot associated with this intent.
     * </p>
     * 
     * @return The identifier of the version of the bot associated with this intent.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The identifier of the version of the bot associated with this intent.
     * </p>
     * 
     * @param botVersion
     *        The identifier of the version of the bot associated with this intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale where this intent is used. All of the bots, slot types, and slots used
     * by the intent must have the same locale. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale where this intent is used. All of the bots, slot types, and
     *        slots used by the intent must have the same locale. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale where this intent is used. All of the bots, slot types, and slots used
     * by the intent must have the same locale. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @return The identifier of the language and locale where this intent is used. All of the bots, slot types, and
     *         slots used by the intent must have the same locale. For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale where this intent is used. All of the bots, slot types, and slots used
     * by the intent must have the same locale. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale where this intent is used. All of the bots, slot types, and
     *        slots used by the intent must have the same locale. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntentRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
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
            sb.append("LocaleId: ").append(getLocaleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIntentRequest == false)
            return false;
        CreateIntentRequest other = (CreateIntentRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParentIntentSignature() == null) ? 0 : getParentIntentSignature().hashCode());
        hashCode = prime * hashCode + ((getSampleUtterances() == null) ? 0 : getSampleUtterances().hashCode());
        hashCode = prime * hashCode + ((getDialogCodeHook() == null) ? 0 : getDialogCodeHook().hashCode());
        hashCode = prime * hashCode + ((getFulfillmentCodeHook() == null) ? 0 : getFulfillmentCodeHook().hashCode());
        hashCode = prime * hashCode + ((getIntentConfirmationSetting() == null) ? 0 : getIntentConfirmationSetting().hashCode());
        hashCode = prime * hashCode + ((getIntentClosingSetting() == null) ? 0 : getIntentClosingSetting().hashCode());
        hashCode = prime * hashCode + ((getInputContexts() == null) ? 0 : getInputContexts().hashCode());
        hashCode = prime * hashCode + ((getOutputContexts() == null) ? 0 : getOutputContexts().hashCode());
        hashCode = prime * hashCode + ((getKendraConfiguration() == null) ? 0 : getKendraConfiguration().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        return hashCode;
    }

    @Override
    public CreateIntentRequest clone() {
        return (CreateIntentRequest) super.clone();
    }

}
