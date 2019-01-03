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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutIntent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutIntentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the intent. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in intent name, or a built-in intent name with "AMAZON." removed. For example,
     * because there is a built-in intent called <code>AMAZON.HelpIntent</code>, you can't create a custom intent called
     * <code>HelpIntent</code>.
     * </p>
     * <p>
     * For a list of built-in intents, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the intent.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An array of intent slots. At runtime, Amazon Lex elicits required slot values from the user using prompts defined
     * in the slots. For more information, see <a>how-it-works</a>.
     * </p>
     */
    private java.util.List<Slot> slots;
    /**
     * <p>
     * An array of utterances (strings) that a user might say to signal the intent. For example,
     * "I want {PizzaSize} pizza", "Order {Quantity} {PizzaSize} pizzas".
     * </p>
     * <p>
     * In each utterance, a slot name is enclosed in curly braces.
     * </p>
     */
    private java.util.List<String> sampleUtterances;
    /**
     * <p>
     * Prompts the user to confirm the intent. This question should have a yes or no answer.
     * </p>
     * <p>
     * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment. For
     * example, with the <code>OrderPizza</code> intent, you might want to confirm that the order is correct before
     * placing it. For other intents, such as intents that simply respond to user questions, you might not need to ask
     * the user for confirmation before providing the information.
     * </p>
     * <note>
     * <p>
     * You you must provide both the <code>rejectionStatement</code> and the <code>confirmationPrompt</code>, or
     * neither.
     * </p>
     * </note>
     */
    private Prompt confirmationPrompt;
    /**
     * <p>
     * When the user answers "no" to the question defined in <code>confirmationPrompt</code>, Amazon Lex responds with
     * this statement to acknowledge that the intent was canceled.
     * </p>
     * <note>
     * <p>
     * You must provide both the <code>rejectionStatement</code> and the <code>confirmationPrompt</code>, or neither.
     * </p>
     * </note>
     */
    private Statement rejectionStatement;
    /**
     * <p>
     * Amazon Lex uses this prompt to solicit additional activity after fulfilling an intent. For example, after the
     * <code>OrderPizza</code> intent is fulfilled, you might prompt the user to order a drink.
     * </p>
     * <p>
     * The action that Amazon Lex takes depends on the user's response, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the user says "Yes" it responds with the clarification prompt that is configured for the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * if the user says "Yes" and continues with an utterance that triggers an intent it starts a conversation for the
     * intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the user says "No" it responds with the rejection statement configured for the the follow-up prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * If it doesn't recognize the utterance it repeats the follow-up prompt again.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>followUpPrompt</code> field and the <code>conclusionStatement</code> field are mutually exclusive. You
     * can specify only one.
     * </p>
     */
    private FollowUpPrompt followUpPrompt;
    /**
     * <p>
     * The statement that you want Amazon Lex to convey to the user after the intent is successfully fulfilled by the
     * Lambda function.
     * </p>
     * <p>
     * This element is relevant only if you provide a Lambda function in the <code>fulfillmentActivity</code>. If you
     * return the intent to the client application, you can't specify this element.
     * </p>
     * <note>
     * <p>
     * The <code>followUpPrompt</code> and <code>conclusionStatement</code> are mutually exclusive. You can specify only
     * one.
     * </p>
     * </note>
     */
    private Statement conclusionStatement;
    /**
     * <p>
     * Specifies a Lambda function to invoke for each user input. You can invoke this Lambda function to personalize
     * user interaction.
     * </p>
     * <p>
     * For example, suppose your bot determines that the user is John. Your Lambda function might retrieve John's
     * information from a backend database and prepopulate some of the values. For example, if you find that John is
     * gluten intolerant, you might set the corresponding intent slot, <code>GlutenIntolerant</code>, to true. You might
     * find John's phone number and set the corresponding session attribute.
     * </p>
     */
    private CodeHook dialogCodeHook;
    /**
     * <p>
     * Required. Describes how the intent is fulfilled. For example, after a user provides all of the information for a
     * pizza order, <code>fulfillmentActivity</code> defines how the bot places an order with a local pizza store.
     * </p>
     * <p>
     * You might configure Amazon Lex to return all of the intent information to the client application, or direct it to
     * invoke a Lambda function that can process the intent (for example, place an order with a pizzeria).
     * </p>
     */
    private FulfillmentActivity fulfillmentActivity;
    /**
     * <p>
     * A unique identifier for the built-in intent to base this intent on. To find the signature for an intent, see <a
     * href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     */
    private String parentIntentSignature;
    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new intent, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a intent, set the <code>checksum</code> field to the checksum of the most recent revision
     * of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the checksum
     * does not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code> exception.
     * </p>
     */
    private String checksum;

    private Boolean createVersion;

    /**
     * <p>
     * The name of the intent. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in intent name, or a built-in intent name with "AMAZON." removed. For example,
     * because there is a built-in intent called <code>AMAZON.HelpIntent</code>, you can't create a custom intent called
     * <code>HelpIntent</code>.
     * </p>
     * <p>
     * For a list of built-in intents, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @param name
     *        The name of the intent. The name is <i>not</i> case sensitive. </p>
     *        <p>
     *        The name can't match a built-in intent name, or a built-in intent name with "AMAZON." removed. For
     *        example, because there is a built-in intent called <code>AMAZON.HelpIntent</code>, you can't create a
     *        custom intent called <code>HelpIntent</code>.
     *        </p>
     *        <p>
     *        For a list of built-in intents, see <a href=
     *        "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *        >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the intent. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in intent name, or a built-in intent name with "AMAZON." removed. For example,
     * because there is a built-in intent called <code>AMAZON.HelpIntent</code>, you can't create a custom intent called
     * <code>HelpIntent</code>.
     * </p>
     * <p>
     * For a list of built-in intents, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @return The name of the intent. The name is <i>not</i> case sensitive. </p>
     *         <p>
     *         The name can't match a built-in intent name, or a built-in intent name with "AMAZON." removed. For
     *         example, because there is a built-in intent called <code>AMAZON.HelpIntent</code>, you can't create a
     *         custom intent called <code>HelpIntent</code>.
     *         </p>
     *         <p>
     *         For a list of built-in intents, see <a href=
     *         "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *         >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the intent. The name is <i>not</i> case sensitive.
     * </p>
     * <p>
     * The name can't match a built-in intent name, or a built-in intent name with "AMAZON." removed. For example,
     * because there is a built-in intent called <code>AMAZON.HelpIntent</code>, you can't create a custom intent called
     * <code>HelpIntent</code>.
     * </p>
     * <p>
     * For a list of built-in intents, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @param name
     *        The name of the intent. The name is <i>not</i> case sensitive. </p>
     *        <p>
     *        The name can't match a built-in intent name, or a built-in intent name with "AMAZON." removed. For
     *        example, because there is a built-in intent called <code>AMAZON.HelpIntent</code>, you can't create a
     *        custom intent called <code>HelpIntent</code>.
     *        </p>
     *        <p>
     *        For a list of built-in intents, see <a href=
     *        "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *        >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the intent.
     * </p>
     * 
     * @param description
     *        A description of the intent.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the intent.
     * </p>
     * 
     * @return A description of the intent.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the intent.
     * </p>
     * 
     * @param description
     *        A description of the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An array of intent slots. At runtime, Amazon Lex elicits required slot values from the user using prompts defined
     * in the slots. For more information, see <a>how-it-works</a>.
     * </p>
     * 
     * @return An array of intent slots. At runtime, Amazon Lex elicits required slot values from the user using prompts
     *         defined in the slots. For more information, see <a>how-it-works</a>.
     */

    public java.util.List<Slot> getSlots() {
        return slots;
    }

    /**
     * <p>
     * An array of intent slots. At runtime, Amazon Lex elicits required slot values from the user using prompts defined
     * in the slots. For more information, see <a>how-it-works</a>.
     * </p>
     * 
     * @param slots
     *        An array of intent slots. At runtime, Amazon Lex elicits required slot values from the user using prompts
     *        defined in the slots. For more information, see <a>how-it-works</a>.
     */

    public void setSlots(java.util.Collection<Slot> slots) {
        if (slots == null) {
            this.slots = null;
            return;
        }

        this.slots = new java.util.ArrayList<Slot>(slots);
    }

    /**
     * <p>
     * An array of intent slots. At runtime, Amazon Lex elicits required slot values from the user using prompts defined
     * in the slots. For more information, see <a>how-it-works</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlots(java.util.Collection)} or {@link #withSlots(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param slots
     *        An array of intent slots. At runtime, Amazon Lex elicits required slot values from the user using prompts
     *        defined in the slots. For more information, see <a>how-it-works</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntentRequest withSlots(Slot... slots) {
        if (this.slots == null) {
            setSlots(new java.util.ArrayList<Slot>(slots.length));
        }
        for (Slot ele : slots) {
            this.slots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of intent slots. At runtime, Amazon Lex elicits required slot values from the user using prompts defined
     * in the slots. For more information, see <a>how-it-works</a>.
     * </p>
     * 
     * @param slots
     *        An array of intent slots. At runtime, Amazon Lex elicits required slot values from the user using prompts
     *        defined in the slots. For more information, see <a>how-it-works</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntentRequest withSlots(java.util.Collection<Slot> slots) {
        setSlots(slots);
        return this;
    }

    /**
     * <p>
     * An array of utterances (strings) that a user might say to signal the intent. For example,
     * "I want {PizzaSize} pizza", "Order {Quantity} {PizzaSize} pizzas".
     * </p>
     * <p>
     * In each utterance, a slot name is enclosed in curly braces.
     * </p>
     * 
     * @return An array of utterances (strings) that a user might say to signal the intent. For example,
     *         "I want {PizzaSize} pizza", "Order {Quantity} {PizzaSize} pizzas". </p>
     *         <p>
     *         In each utterance, a slot name is enclosed in curly braces.
     */

    public java.util.List<String> getSampleUtterances() {
        return sampleUtterances;
    }

    /**
     * <p>
     * An array of utterances (strings) that a user might say to signal the intent. For example,
     * "I want {PizzaSize} pizza", "Order {Quantity} {PizzaSize} pizzas".
     * </p>
     * <p>
     * In each utterance, a slot name is enclosed in curly braces.
     * </p>
     * 
     * @param sampleUtterances
     *        An array of utterances (strings) that a user might say to signal the intent. For example,
     *        "I want {PizzaSize} pizza", "Order {Quantity} {PizzaSize} pizzas". </p>
     *        <p>
     *        In each utterance, a slot name is enclosed in curly braces.
     */

    public void setSampleUtterances(java.util.Collection<String> sampleUtterances) {
        if (sampleUtterances == null) {
            this.sampleUtterances = null;
            return;
        }

        this.sampleUtterances = new java.util.ArrayList<String>(sampleUtterances);
    }

    /**
     * <p>
     * An array of utterances (strings) that a user might say to signal the intent. For example,
     * "I want {PizzaSize} pizza", "Order {Quantity} {PizzaSize} pizzas".
     * </p>
     * <p>
     * In each utterance, a slot name is enclosed in curly braces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSampleUtterances(java.util.Collection)} or {@link #withSampleUtterances(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sampleUtterances
     *        An array of utterances (strings) that a user might say to signal the intent. For example,
     *        "I want {PizzaSize} pizza", "Order {Quantity} {PizzaSize} pizzas". </p>
     *        <p>
     *        In each utterance, a slot name is enclosed in curly braces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntentRequest withSampleUtterances(String... sampleUtterances) {
        if (this.sampleUtterances == null) {
            setSampleUtterances(new java.util.ArrayList<String>(sampleUtterances.length));
        }
        for (String ele : sampleUtterances) {
            this.sampleUtterances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of utterances (strings) that a user might say to signal the intent. For example,
     * "I want {PizzaSize} pizza", "Order {Quantity} {PizzaSize} pizzas".
     * </p>
     * <p>
     * In each utterance, a slot name is enclosed in curly braces.
     * </p>
     * 
     * @param sampleUtterances
     *        An array of utterances (strings) that a user might say to signal the intent. For example,
     *        "I want {PizzaSize} pizza", "Order {Quantity} {PizzaSize} pizzas". </p>
     *        <p>
     *        In each utterance, a slot name is enclosed in curly braces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntentRequest withSampleUtterances(java.util.Collection<String> sampleUtterances) {
        setSampleUtterances(sampleUtterances);
        return this;
    }

    /**
     * <p>
     * Prompts the user to confirm the intent. This question should have a yes or no answer.
     * </p>
     * <p>
     * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment. For
     * example, with the <code>OrderPizza</code> intent, you might want to confirm that the order is correct before
     * placing it. For other intents, such as intents that simply respond to user questions, you might not need to ask
     * the user for confirmation before providing the information.
     * </p>
     * <note>
     * <p>
     * You you must provide both the <code>rejectionStatement</code> and the <code>confirmationPrompt</code>, or
     * neither.
     * </p>
     * </note>
     * 
     * @param confirmationPrompt
     *        Prompts the user to confirm the intent. This question should have a yes or no answer.</p>
     *        <p>
     *        Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment.
     *        For example, with the <code>OrderPizza</code> intent, you might want to confirm that the order is correct
     *        before placing it. For other intents, such as intents that simply respond to user questions, you might not
     *        need to ask the user for confirmation before providing the information.
     *        </p>
     *        <note>
     *        <p>
     *        You you must provide both the <code>rejectionStatement</code> and the <code>confirmationPrompt</code>, or
     *        neither.
     *        </p>
     */

    public void setConfirmationPrompt(Prompt confirmationPrompt) {
        this.confirmationPrompt = confirmationPrompt;
    }

    /**
     * <p>
     * Prompts the user to confirm the intent. This question should have a yes or no answer.
     * </p>
     * <p>
     * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment. For
     * example, with the <code>OrderPizza</code> intent, you might want to confirm that the order is correct before
     * placing it. For other intents, such as intents that simply respond to user questions, you might not need to ask
     * the user for confirmation before providing the information.
     * </p>
     * <note>
     * <p>
     * You you must provide both the <code>rejectionStatement</code> and the <code>confirmationPrompt</code>, or
     * neither.
     * </p>
     * </note>
     * 
     * @return Prompts the user to confirm the intent. This question should have a yes or no answer.</p>
     *         <p>
     *         Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for
     *         fulfillment. For example, with the <code>OrderPizza</code> intent, you might want to confirm that the
     *         order is correct before placing it. For other intents, such as intents that simply respond to user
     *         questions, you might not need to ask the user for confirmation before providing the information.
     *         </p>
     *         <note>
     *         <p>
     *         You you must provide both the <code>rejectionStatement</code> and the <code>confirmationPrompt</code>, or
     *         neither.
     *         </p>
     */

    public Prompt getConfirmationPrompt() {
        return this.confirmationPrompt;
    }

    /**
     * <p>
     * Prompts the user to confirm the intent. This question should have a yes or no answer.
     * </p>
     * <p>
     * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment. For
     * example, with the <code>OrderPizza</code> intent, you might want to confirm that the order is correct before
     * placing it. For other intents, such as intents that simply respond to user questions, you might not need to ask
     * the user for confirmation before providing the information.
     * </p>
     * <note>
     * <p>
     * You you must provide both the <code>rejectionStatement</code> and the <code>confirmationPrompt</code>, or
     * neither.
     * </p>
     * </note>
     * 
     * @param confirmationPrompt
     *        Prompts the user to confirm the intent. This question should have a yes or no answer.</p>
     *        <p>
     *        Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment.
     *        For example, with the <code>OrderPizza</code> intent, you might want to confirm that the order is correct
     *        before placing it. For other intents, such as intents that simply respond to user questions, you might not
     *        need to ask the user for confirmation before providing the information.
     *        </p>
     *        <note>
     *        <p>
     *        You you must provide both the <code>rejectionStatement</code> and the <code>confirmationPrompt</code>, or
     *        neither.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntentRequest withConfirmationPrompt(Prompt confirmationPrompt) {
        setConfirmationPrompt(confirmationPrompt);
        return this;
    }

    /**
     * <p>
     * When the user answers "no" to the question defined in <code>confirmationPrompt</code>, Amazon Lex responds with
     * this statement to acknowledge that the intent was canceled.
     * </p>
     * <note>
     * <p>
     * You must provide both the <code>rejectionStatement</code> and the <code>confirmationPrompt</code>, or neither.
     * </p>
     * </note>
     * 
     * @param rejectionStatement
     *        When the user answers "no" to the question defined in <code>confirmationPrompt</code>, Amazon Lex responds
     *        with this statement to acknowledge that the intent was canceled. </p> <note>
     *        <p>
     *        You must provide both the <code>rejectionStatement</code> and the <code>confirmationPrompt</code>, or
     *        neither.
     *        </p>
     */

    public void setRejectionStatement(Statement rejectionStatement) {
        this.rejectionStatement = rejectionStatement;
    }

    /**
     * <p>
     * When the user answers "no" to the question defined in <code>confirmationPrompt</code>, Amazon Lex responds with
     * this statement to acknowledge that the intent was canceled.
     * </p>
     * <note>
     * <p>
     * You must provide both the <code>rejectionStatement</code> and the <code>confirmationPrompt</code>, or neither.
     * </p>
     * </note>
     * 
     * @return When the user answers "no" to the question defined in <code>confirmationPrompt</code>, Amazon Lex
     *         responds with this statement to acknowledge that the intent was canceled. </p> <note>
     *         <p>
     *         You must provide both the <code>rejectionStatement</code> and the <code>confirmationPrompt</code>, or
     *         neither.
     *         </p>
     */

    public Statement getRejectionStatement() {
        return this.rejectionStatement;
    }

    /**
     * <p>
     * When the user answers "no" to the question defined in <code>confirmationPrompt</code>, Amazon Lex responds with
     * this statement to acknowledge that the intent was canceled.
     * </p>
     * <note>
     * <p>
     * You must provide both the <code>rejectionStatement</code> and the <code>confirmationPrompt</code>, or neither.
     * </p>
     * </note>
     * 
     * @param rejectionStatement
     *        When the user answers "no" to the question defined in <code>confirmationPrompt</code>, Amazon Lex responds
     *        with this statement to acknowledge that the intent was canceled. </p> <note>
     *        <p>
     *        You must provide both the <code>rejectionStatement</code> and the <code>confirmationPrompt</code>, or
     *        neither.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntentRequest withRejectionStatement(Statement rejectionStatement) {
        setRejectionStatement(rejectionStatement);
        return this;
    }

    /**
     * <p>
     * Amazon Lex uses this prompt to solicit additional activity after fulfilling an intent. For example, after the
     * <code>OrderPizza</code> intent is fulfilled, you might prompt the user to order a drink.
     * </p>
     * <p>
     * The action that Amazon Lex takes depends on the user's response, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the user says "Yes" it responds with the clarification prompt that is configured for the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * if the user says "Yes" and continues with an utterance that triggers an intent it starts a conversation for the
     * intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the user says "No" it responds with the rejection statement configured for the the follow-up prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * If it doesn't recognize the utterance it repeats the follow-up prompt again.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>followUpPrompt</code> field and the <code>conclusionStatement</code> field are mutually exclusive. You
     * can specify only one.
     * </p>
     * 
     * @param followUpPrompt
     *        Amazon Lex uses this prompt to solicit additional activity after fulfilling an intent. For example, after
     *        the <code>OrderPizza</code> intent is fulfilled, you might prompt the user to order a drink.</p>
     *        <p>
     *        The action that Amazon Lex takes depends on the user's response, as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the user says "Yes" it responds with the clarification prompt that is configured for the bot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        if the user says "Yes" and continues with an utterance that triggers an intent it starts a conversation
     *        for the intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the user says "No" it responds with the rejection statement configured for the the follow-up prompt.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If it doesn't recognize the utterance it repeats the follow-up prompt again.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The <code>followUpPrompt</code> field and the <code>conclusionStatement</code> field are mutually
     *        exclusive. You can specify only one.
     */

    public void setFollowUpPrompt(FollowUpPrompt followUpPrompt) {
        this.followUpPrompt = followUpPrompt;
    }

    /**
     * <p>
     * Amazon Lex uses this prompt to solicit additional activity after fulfilling an intent. For example, after the
     * <code>OrderPizza</code> intent is fulfilled, you might prompt the user to order a drink.
     * </p>
     * <p>
     * The action that Amazon Lex takes depends on the user's response, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the user says "Yes" it responds with the clarification prompt that is configured for the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * if the user says "Yes" and continues with an utterance that triggers an intent it starts a conversation for the
     * intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the user says "No" it responds with the rejection statement configured for the the follow-up prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * If it doesn't recognize the utterance it repeats the follow-up prompt again.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>followUpPrompt</code> field and the <code>conclusionStatement</code> field are mutually exclusive. You
     * can specify only one.
     * </p>
     * 
     * @return Amazon Lex uses this prompt to solicit additional activity after fulfilling an intent. For example, after
     *         the <code>OrderPizza</code> intent is fulfilled, you might prompt the user to order a drink.</p>
     *         <p>
     *         The action that Amazon Lex takes depends on the user's response, as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the user says "Yes" it responds with the clarification prompt that is configured for the bot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         if the user says "Yes" and continues with an utterance that triggers an intent it starts a conversation
     *         for the intent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the user says "No" it responds with the rejection statement configured for the the follow-up prompt.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If it doesn't recognize the utterance it repeats the follow-up prompt again.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The <code>followUpPrompt</code> field and the <code>conclusionStatement</code> field are mutually
     *         exclusive. You can specify only one.
     */

    public FollowUpPrompt getFollowUpPrompt() {
        return this.followUpPrompt;
    }

    /**
     * <p>
     * Amazon Lex uses this prompt to solicit additional activity after fulfilling an intent. For example, after the
     * <code>OrderPizza</code> intent is fulfilled, you might prompt the user to order a drink.
     * </p>
     * <p>
     * The action that Amazon Lex takes depends on the user's response, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the user says "Yes" it responds with the clarification prompt that is configured for the bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * if the user says "Yes" and continues with an utterance that triggers an intent it starts a conversation for the
     * intent.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the user says "No" it responds with the rejection statement configured for the the follow-up prompt.
     * </p>
     * </li>
     * <li>
     * <p>
     * If it doesn't recognize the utterance it repeats the follow-up prompt again.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>followUpPrompt</code> field and the <code>conclusionStatement</code> field are mutually exclusive. You
     * can specify only one.
     * </p>
     * 
     * @param followUpPrompt
     *        Amazon Lex uses this prompt to solicit additional activity after fulfilling an intent. For example, after
     *        the <code>OrderPizza</code> intent is fulfilled, you might prompt the user to order a drink.</p>
     *        <p>
     *        The action that Amazon Lex takes depends on the user's response, as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the user says "Yes" it responds with the clarification prompt that is configured for the bot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        if the user says "Yes" and continues with an utterance that triggers an intent it starts a conversation
     *        for the intent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the user says "No" it responds with the rejection statement configured for the the follow-up prompt.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If it doesn't recognize the utterance it repeats the follow-up prompt again.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The <code>followUpPrompt</code> field and the <code>conclusionStatement</code> field are mutually
     *        exclusive. You can specify only one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntentRequest withFollowUpPrompt(FollowUpPrompt followUpPrompt) {
        setFollowUpPrompt(followUpPrompt);
        return this;
    }

    /**
     * <p>
     * The statement that you want Amazon Lex to convey to the user after the intent is successfully fulfilled by the
     * Lambda function.
     * </p>
     * <p>
     * This element is relevant only if you provide a Lambda function in the <code>fulfillmentActivity</code>. If you
     * return the intent to the client application, you can't specify this element.
     * </p>
     * <note>
     * <p>
     * The <code>followUpPrompt</code> and <code>conclusionStatement</code> are mutually exclusive. You can specify only
     * one.
     * </p>
     * </note>
     * 
     * @param conclusionStatement
     *        The statement that you want Amazon Lex to convey to the user after the intent is successfully fulfilled by
     *        the Lambda function. </p>
     *        <p>
     *        This element is relevant only if you provide a Lambda function in the <code>fulfillmentActivity</code>. If
     *        you return the intent to the client application, you can't specify this element.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>followUpPrompt</code> and <code>conclusionStatement</code> are mutually exclusive. You can
     *        specify only one.
     *        </p>
     */

    public void setConclusionStatement(Statement conclusionStatement) {
        this.conclusionStatement = conclusionStatement;
    }

    /**
     * <p>
     * The statement that you want Amazon Lex to convey to the user after the intent is successfully fulfilled by the
     * Lambda function.
     * </p>
     * <p>
     * This element is relevant only if you provide a Lambda function in the <code>fulfillmentActivity</code>. If you
     * return the intent to the client application, you can't specify this element.
     * </p>
     * <note>
     * <p>
     * The <code>followUpPrompt</code> and <code>conclusionStatement</code> are mutually exclusive. You can specify only
     * one.
     * </p>
     * </note>
     * 
     * @return The statement that you want Amazon Lex to convey to the user after the intent is successfully fulfilled
     *         by the Lambda function. </p>
     *         <p>
     *         This element is relevant only if you provide a Lambda function in the <code>fulfillmentActivity</code>.
     *         If you return the intent to the client application, you can't specify this element.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>followUpPrompt</code> and <code>conclusionStatement</code> are mutually exclusive. You can
     *         specify only one.
     *         </p>
     */

    public Statement getConclusionStatement() {
        return this.conclusionStatement;
    }

    /**
     * <p>
     * The statement that you want Amazon Lex to convey to the user after the intent is successfully fulfilled by the
     * Lambda function.
     * </p>
     * <p>
     * This element is relevant only if you provide a Lambda function in the <code>fulfillmentActivity</code>. If you
     * return the intent to the client application, you can't specify this element.
     * </p>
     * <note>
     * <p>
     * The <code>followUpPrompt</code> and <code>conclusionStatement</code> are mutually exclusive. You can specify only
     * one.
     * </p>
     * </note>
     * 
     * @param conclusionStatement
     *        The statement that you want Amazon Lex to convey to the user after the intent is successfully fulfilled by
     *        the Lambda function. </p>
     *        <p>
     *        This element is relevant only if you provide a Lambda function in the <code>fulfillmentActivity</code>. If
     *        you return the intent to the client application, you can't specify this element.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>followUpPrompt</code> and <code>conclusionStatement</code> are mutually exclusive. You can
     *        specify only one.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntentRequest withConclusionStatement(Statement conclusionStatement) {
        setConclusionStatement(conclusionStatement);
        return this;
    }

    /**
     * <p>
     * Specifies a Lambda function to invoke for each user input. You can invoke this Lambda function to personalize
     * user interaction.
     * </p>
     * <p>
     * For example, suppose your bot determines that the user is John. Your Lambda function might retrieve John's
     * information from a backend database and prepopulate some of the values. For example, if you find that John is
     * gluten intolerant, you might set the corresponding intent slot, <code>GlutenIntolerant</code>, to true. You might
     * find John's phone number and set the corresponding session attribute.
     * </p>
     * 
     * @param dialogCodeHook
     *        Specifies a Lambda function to invoke for each user input. You can invoke this Lambda function to
     *        personalize user interaction. </p>
     *        <p>
     *        For example, suppose your bot determines that the user is John. Your Lambda function might retrieve John's
     *        information from a backend database and prepopulate some of the values. For example, if you find that John
     *        is gluten intolerant, you might set the corresponding intent slot, <code>GlutenIntolerant</code>, to true.
     *        You might find John's phone number and set the corresponding session attribute.
     */

    public void setDialogCodeHook(CodeHook dialogCodeHook) {
        this.dialogCodeHook = dialogCodeHook;
    }

    /**
     * <p>
     * Specifies a Lambda function to invoke for each user input. You can invoke this Lambda function to personalize
     * user interaction.
     * </p>
     * <p>
     * For example, suppose your bot determines that the user is John. Your Lambda function might retrieve John's
     * information from a backend database and prepopulate some of the values. For example, if you find that John is
     * gluten intolerant, you might set the corresponding intent slot, <code>GlutenIntolerant</code>, to true. You might
     * find John's phone number and set the corresponding session attribute.
     * </p>
     * 
     * @return Specifies a Lambda function to invoke for each user input. You can invoke this Lambda function to
     *         personalize user interaction. </p>
     *         <p>
     *         For example, suppose your bot determines that the user is John. Your Lambda function might retrieve
     *         John's information from a backend database and prepopulate some of the values. For example, if you find
     *         that John is gluten intolerant, you might set the corresponding intent slot,
     *         <code>GlutenIntolerant</code>, to true. You might find John's phone number and set the corresponding
     *         session attribute.
     */

    public CodeHook getDialogCodeHook() {
        return this.dialogCodeHook;
    }

    /**
     * <p>
     * Specifies a Lambda function to invoke for each user input. You can invoke this Lambda function to personalize
     * user interaction.
     * </p>
     * <p>
     * For example, suppose your bot determines that the user is John. Your Lambda function might retrieve John's
     * information from a backend database and prepopulate some of the values. For example, if you find that John is
     * gluten intolerant, you might set the corresponding intent slot, <code>GlutenIntolerant</code>, to true. You might
     * find John's phone number and set the corresponding session attribute.
     * </p>
     * 
     * @param dialogCodeHook
     *        Specifies a Lambda function to invoke for each user input. You can invoke this Lambda function to
     *        personalize user interaction. </p>
     *        <p>
     *        For example, suppose your bot determines that the user is John. Your Lambda function might retrieve John's
     *        information from a backend database and prepopulate some of the values. For example, if you find that John
     *        is gluten intolerant, you might set the corresponding intent slot, <code>GlutenIntolerant</code>, to true.
     *        You might find John's phone number and set the corresponding session attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntentRequest withDialogCodeHook(CodeHook dialogCodeHook) {
        setDialogCodeHook(dialogCodeHook);
        return this;
    }

    /**
     * <p>
     * Required. Describes how the intent is fulfilled. For example, after a user provides all of the information for a
     * pizza order, <code>fulfillmentActivity</code> defines how the bot places an order with a local pizza store.
     * </p>
     * <p>
     * You might configure Amazon Lex to return all of the intent information to the client application, or direct it to
     * invoke a Lambda function that can process the intent (for example, place an order with a pizzeria).
     * </p>
     * 
     * @param fulfillmentActivity
     *        Required. Describes how the intent is fulfilled. For example, after a user provides all of the information
     *        for a pizza order, <code>fulfillmentActivity</code> defines how the bot places an order with a local pizza
     *        store. </p>
     *        <p>
     *        You might configure Amazon Lex to return all of the intent information to the client application, or
     *        direct it to invoke a Lambda function that can process the intent (for example, place an order with a
     *        pizzeria).
     */

    public void setFulfillmentActivity(FulfillmentActivity fulfillmentActivity) {
        this.fulfillmentActivity = fulfillmentActivity;
    }

    /**
     * <p>
     * Required. Describes how the intent is fulfilled. For example, after a user provides all of the information for a
     * pizza order, <code>fulfillmentActivity</code> defines how the bot places an order with a local pizza store.
     * </p>
     * <p>
     * You might configure Amazon Lex to return all of the intent information to the client application, or direct it to
     * invoke a Lambda function that can process the intent (for example, place an order with a pizzeria).
     * </p>
     * 
     * @return Required. Describes how the intent is fulfilled. For example, after a user provides all of the
     *         information for a pizza order, <code>fulfillmentActivity</code> defines how the bot places an order with
     *         a local pizza store. </p>
     *         <p>
     *         You might configure Amazon Lex to return all of the intent information to the client application, or
     *         direct it to invoke a Lambda function that can process the intent (for example, place an order with a
     *         pizzeria).
     */

    public FulfillmentActivity getFulfillmentActivity() {
        return this.fulfillmentActivity;
    }

    /**
     * <p>
     * Required. Describes how the intent is fulfilled. For example, after a user provides all of the information for a
     * pizza order, <code>fulfillmentActivity</code> defines how the bot places an order with a local pizza store.
     * </p>
     * <p>
     * You might configure Amazon Lex to return all of the intent information to the client application, or direct it to
     * invoke a Lambda function that can process the intent (for example, place an order with a pizzeria).
     * </p>
     * 
     * @param fulfillmentActivity
     *        Required. Describes how the intent is fulfilled. For example, after a user provides all of the information
     *        for a pizza order, <code>fulfillmentActivity</code> defines how the bot places an order with a local pizza
     *        store. </p>
     *        <p>
     *        You might configure Amazon Lex to return all of the intent information to the client application, or
     *        direct it to invoke a Lambda function that can process the intent (for example, place an order with a
     *        pizzeria).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntentRequest withFulfillmentActivity(FulfillmentActivity fulfillmentActivity) {
        setFulfillmentActivity(fulfillmentActivity);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the built-in intent to base this intent on. To find the signature for an intent, see <a
     * href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @param parentIntentSignature
     *        A unique identifier for the built-in intent to base this intent on. To find the signature for an intent,
     *        see <a href=
     *        "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *        >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     */

    public void setParentIntentSignature(String parentIntentSignature) {
        this.parentIntentSignature = parentIntentSignature;
    }

    /**
     * <p>
     * A unique identifier for the built-in intent to base this intent on. To find the signature for an intent, see <a
     * href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @return A unique identifier for the built-in intent to base this intent on. To find the signature for an intent,
     *         see <a href=
     *         "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *         >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     */

    public String getParentIntentSignature() {
        return this.parentIntentSignature;
    }

    /**
     * <p>
     * A unique identifier for the built-in intent to base this intent on. To find the signature for an intent, see <a
     * href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @param parentIntentSignature
     *        A unique identifier for the built-in intent to base this intent on. To find the signature for an intent,
     *        see <a href=
     *        "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *        >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntentRequest withParentIntentSignature(String parentIntentSignature) {
        setParentIntentSignature(parentIntentSignature);
        return this;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new intent, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a intent, set the <code>checksum</code> field to the checksum of the most recent revision
     * of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the checksum
     * does not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code> exception.
     * </p>
     * 
     * @param checksum
     *        Identifies a specific revision of the <code>$LATEST</code> version.</p>
     *        <p>
     *        When you create a new intent, leave the <code>checksum</code> field blank. If you specify a checksum you
     *        get a <code>BadRequestException</code> exception.
     *        </p>
     *        <p>
     *        When you want to update a intent, set the <code>checksum</code> field to the checksum of the most recent
     *        revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if
     *        the checksum does not match the <code>$LATEST</code> version, you get a
     *        <code>PreconditionFailedException</code> exception.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new intent, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a intent, set the <code>checksum</code> field to the checksum of the most recent revision
     * of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the checksum
     * does not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code> exception.
     * </p>
     * 
     * @return Identifies a specific revision of the <code>$LATEST</code> version.</p>
     *         <p>
     *         When you create a new intent, leave the <code>checksum</code> field blank. If you specify a checksum you
     *         get a <code>BadRequestException</code> exception.
     *         </p>
     *         <p>
     *         When you want to update a intent, set the <code>checksum</code> field to the checksum of the most recent
     *         revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or
     *         if the checksum does not match the <code>$LATEST</code> version, you get a
     *         <code>PreconditionFailedException</code> exception.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new intent, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a intent, set the <code>checksum</code> field to the checksum of the most recent revision
     * of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the checksum
     * does not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code> exception.
     * </p>
     * 
     * @param checksum
     *        Identifies a specific revision of the <code>$LATEST</code> version.</p>
     *        <p>
     *        When you create a new intent, leave the <code>checksum</code> field blank. If you specify a checksum you
     *        get a <code>BadRequestException</code> exception.
     *        </p>
     *        <p>
     *        When you want to update a intent, set the <code>checksum</code> field to the checksum of the most recent
     *        revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if
     *        the checksum does not match the <code>$LATEST</code> version, you get a
     *        <code>PreconditionFailedException</code> exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntentRequest withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * @param createVersion
     */

    public void setCreateVersion(Boolean createVersion) {
        this.createVersion = createVersion;
    }

    /**
     * @return
     */

    public Boolean getCreateVersion() {
        return this.createVersion;
    }

    /**
     * @param createVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntentRequest withCreateVersion(Boolean createVersion) {
        setCreateVersion(createVersion);
        return this;
    }

    /**
     * @return
     */

    public Boolean isCreateVersion() {
        return this.createVersion;
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
        if (getSlots() != null)
            sb.append("Slots: ").append(getSlots()).append(",");
        if (getSampleUtterances() != null)
            sb.append("SampleUtterances: ").append(getSampleUtterances()).append(",");
        if (getConfirmationPrompt() != null)
            sb.append("ConfirmationPrompt: ").append(getConfirmationPrompt()).append(",");
        if (getRejectionStatement() != null)
            sb.append("RejectionStatement: ").append(getRejectionStatement()).append(",");
        if (getFollowUpPrompt() != null)
            sb.append("FollowUpPrompt: ").append(getFollowUpPrompt()).append(",");
        if (getConclusionStatement() != null)
            sb.append("ConclusionStatement: ").append(getConclusionStatement()).append(",");
        if (getDialogCodeHook() != null)
            sb.append("DialogCodeHook: ").append(getDialogCodeHook()).append(",");
        if (getFulfillmentActivity() != null)
            sb.append("FulfillmentActivity: ").append(getFulfillmentActivity()).append(",");
        if (getParentIntentSignature() != null)
            sb.append("ParentIntentSignature: ").append(getParentIntentSignature()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getCreateVersion() != null)
            sb.append("CreateVersion: ").append(getCreateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutIntentRequest == false)
            return false;
        PutIntentRequest other = (PutIntentRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getSampleUtterances() == null ^ this.getSampleUtterances() == null)
            return false;
        if (other.getSampleUtterances() != null && other.getSampleUtterances().equals(this.getSampleUtterances()) == false)
            return false;
        if (other.getConfirmationPrompt() == null ^ this.getConfirmationPrompt() == null)
            return false;
        if (other.getConfirmationPrompt() != null && other.getConfirmationPrompt().equals(this.getConfirmationPrompt()) == false)
            return false;
        if (other.getRejectionStatement() == null ^ this.getRejectionStatement() == null)
            return false;
        if (other.getRejectionStatement() != null && other.getRejectionStatement().equals(this.getRejectionStatement()) == false)
            return false;
        if (other.getFollowUpPrompt() == null ^ this.getFollowUpPrompt() == null)
            return false;
        if (other.getFollowUpPrompt() != null && other.getFollowUpPrompt().equals(this.getFollowUpPrompt()) == false)
            return false;
        if (other.getConclusionStatement() == null ^ this.getConclusionStatement() == null)
            return false;
        if (other.getConclusionStatement() != null && other.getConclusionStatement().equals(this.getConclusionStatement()) == false)
            return false;
        if (other.getDialogCodeHook() == null ^ this.getDialogCodeHook() == null)
            return false;
        if (other.getDialogCodeHook() != null && other.getDialogCodeHook().equals(this.getDialogCodeHook()) == false)
            return false;
        if (other.getFulfillmentActivity() == null ^ this.getFulfillmentActivity() == null)
            return false;
        if (other.getFulfillmentActivity() != null && other.getFulfillmentActivity().equals(this.getFulfillmentActivity()) == false)
            return false;
        if (other.getParentIntentSignature() == null ^ this.getParentIntentSignature() == null)
            return false;
        if (other.getParentIntentSignature() != null && other.getParentIntentSignature().equals(this.getParentIntentSignature()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getCreateVersion() == null ^ this.getCreateVersion() == null)
            return false;
        if (other.getCreateVersion() != null && other.getCreateVersion().equals(this.getCreateVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode + ((getSampleUtterances() == null) ? 0 : getSampleUtterances().hashCode());
        hashCode = prime * hashCode + ((getConfirmationPrompt() == null) ? 0 : getConfirmationPrompt().hashCode());
        hashCode = prime * hashCode + ((getRejectionStatement() == null) ? 0 : getRejectionStatement().hashCode());
        hashCode = prime * hashCode + ((getFollowUpPrompt() == null) ? 0 : getFollowUpPrompt().hashCode());
        hashCode = prime * hashCode + ((getConclusionStatement() == null) ? 0 : getConclusionStatement().hashCode());
        hashCode = prime * hashCode + ((getDialogCodeHook() == null) ? 0 : getDialogCodeHook().hashCode());
        hashCode = prime * hashCode + ((getFulfillmentActivity() == null) ? 0 : getFulfillmentActivity().hashCode());
        hashCode = prime * hashCode + ((getParentIntentSignature() == null) ? 0 : getParentIntentSignature().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getCreateVersion() == null) ? 0 : getCreateVersion().hashCode());
        return hashCode;
    }

    @Override
    public PutIntentRequest clone() {
        return (PutIntentRequest) super.clone();
    }

}
