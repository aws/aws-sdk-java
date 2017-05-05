/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/PostText" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostTextRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * The alias of the Amazon Lex bot.
     * </p>
     */
    private String botAlias;
    /**
     * <p>
     * The ID of the client application user. The application developer decides the user IDs. At runtime, each request
     * must include the user ID. Typically, each of your application users should have a unique ID. Note the following
     * considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue the conversation on another device, you
     * might choose a user-specific identifier, such as a login or Amazon Cognito user ID (assuming your application is
     * using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent conversations on two different devices, you might
     * choose a device-specific identifier, such as device ID, or some globally unique identifier.
     * </p>
     * </li>
     * </ul>
     */
    private String userId;
    /**
     * <p>
     * By using session attributes, a client application can pass contextual information in the request to Amazon Lex
     * For example,
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Getting Started Exercise 1, the example bot uses the <code>price</code> session attribute to maintain the
     * price of the flowers ordered (for example, "Price":25). The code hook (the Lambda function) sets this attribute
     * based on the type of flowers ordered. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html">Review the Details of Information
     * Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the BookTrip bot exercise, the bot uses the <code>currentReservation</code> session attribute to maintain slot
     * data during the in-progress conversation to book a hotel or book a car. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html">Details of Information Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might use the session attributes (key, value pairs) to track the requestID of user requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Lex simply passes these session attributes to the Lambda functions configured for the intent.
     * </p>
     * <p>
     * In your Lambda function, you can also use the session attributes for initialization and customization (prompts
     * and response cards). Some examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Initialization - In a pizza ordering bot, if you can pass the user location as a session attribute (for example,
     * <code>"Location" : "111 Maple street"</code>), then your Lambda function might use this information to determine
     * the closest pizzeria to place the order (perhaps to set the storeAddress slot value).
     * </p>
     * </li>
     * <li>
     * <p>
     * Personalize prompts - For example, you can configure prompts to refer to the user name. (For example,
     * "Hey [FirstName], what toppings would you like?"). You can pass the user name as a session attribute (
     * <code>"FirstName" : "Joe"</code>) so that Amazon Lex can substitute the placeholder to provide a personalize
     * prompt to the user ("Hey Joe, what toppings would you like?").
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you configure a code hook for the intent, Amazon Lex passes the incoming session attributes to the Lambda
     * function. If you want Amazon Lex to return these session attributes back to the client, the Lambda function must
     * return them.
     * </p>
     * <p>
     * If there is no code hook configured for the intent, Amazon Lex simply returns the session attributes back to the
     * client application.
     * </p>
     * </note>
     */
    private java.util.Map<String, String> sessionAttributes;
    /**
     * <p>
     * The text that the user entered (Amazon Lex interprets this text).
     * </p>
     */
    private String inputText;

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * 
     * @param botName
     *        The name of the Amazon Lex bot.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * 
     * @return The name of the Amazon Lex bot.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * 
     * @param botName
     *        The name of the Amazon Lex bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextRequest withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * The alias of the Amazon Lex bot.
     * </p>
     * 
     * @param botAlias
     *        The alias of the Amazon Lex bot.
     */

    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * <p>
     * The alias of the Amazon Lex bot.
     * </p>
     * 
     * @return The alias of the Amazon Lex bot.
     */

    public String getBotAlias() {
        return this.botAlias;
    }

    /**
     * <p>
     * The alias of the Amazon Lex bot.
     * </p>
     * 
     * @param botAlias
     *        The alias of the Amazon Lex bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextRequest withBotAlias(String botAlias) {
        setBotAlias(botAlias);
        return this;
    }

    /**
     * <p>
     * The ID of the client application user. The application developer decides the user IDs. At runtime, each request
     * must include the user ID. Typically, each of your application users should have a unique ID. Note the following
     * considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue the conversation on another device, you
     * might choose a user-specific identifier, such as a login or Amazon Cognito user ID (assuming your application is
     * using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent conversations on two different devices, you might
     * choose a device-specific identifier, such as device ID, or some globally unique identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userId
     *        The ID of the client application user. The application developer decides the user IDs. At runtime, each
     *        request must include the user ID. Typically, each of your application users should have a unique ID. Note
     *        the following considerations: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you want a user to start a conversation on one device and continue the conversation on another device,
     *        you might choose a user-specific identifier, such as a login or Amazon Cognito user ID (assuming your
     *        application is using Amazon Cognito).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you want the same user to be able to have two independent conversations on two different devices, you
     *        might choose a device-specific identifier, such as device ID, or some globally unique identifier.
     *        </p>
     *        </li>
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of the client application user. The application developer decides the user IDs. At runtime, each request
     * must include the user ID. Typically, each of your application users should have a unique ID. Note the following
     * considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue the conversation on another device, you
     * might choose a user-specific identifier, such as a login or Amazon Cognito user ID (assuming your application is
     * using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent conversations on two different devices, you might
     * choose a device-specific identifier, such as device ID, or some globally unique identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ID of the client application user. The application developer decides the user IDs. At runtime, each
     *         request must include the user ID. Typically, each of your application users should have a unique ID. Note
     *         the following considerations: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you want a user to start a conversation on one device and continue the conversation on another device,
     *         you might choose a user-specific identifier, such as a login or Amazon Cognito user ID (assuming your
     *         application is using Amazon Cognito).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you want the same user to be able to have two independent conversations on two different devices, you
     *         might choose a device-specific identifier, such as device ID, or some globally unique identifier.
     *         </p>
     *         </li>
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The ID of the client application user. The application developer decides the user IDs. At runtime, each request
     * must include the user ID. Typically, each of your application users should have a unique ID. Note the following
     * considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start a conversation on one device and continue the conversation on another device, you
     * might choose a user-specific identifier, such as a login or Amazon Cognito user ID (assuming your application is
     * using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent conversations on two different devices, you might
     * choose a device-specific identifier, such as device ID, or some globally unique identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userId
     *        The ID of the client application user. The application developer decides the user IDs. At runtime, each
     *        request must include the user ID. Typically, each of your application users should have a unique ID. Note
     *        the following considerations: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you want a user to start a conversation on one device and continue the conversation on another device,
     *        you might choose a user-specific identifier, such as a login or Amazon Cognito user ID (assuming your
     *        application is using Amazon Cognito).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you want the same user to be able to have two independent conversations on two different devices, you
     *        might choose a device-specific identifier, such as device ID, or some globally unique identifier.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * By using session attributes, a client application can pass contextual information in the request to Amazon Lex
     * For example,
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Getting Started Exercise 1, the example bot uses the <code>price</code> session attribute to maintain the
     * price of the flowers ordered (for example, "Price":25). The code hook (the Lambda function) sets this attribute
     * based on the type of flowers ordered. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html">Review the Details of Information
     * Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the BookTrip bot exercise, the bot uses the <code>currentReservation</code> session attribute to maintain slot
     * data during the in-progress conversation to book a hotel or book a car. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html">Details of Information Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might use the session attributes (key, value pairs) to track the requestID of user requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Lex simply passes these session attributes to the Lambda functions configured for the intent.
     * </p>
     * <p>
     * In your Lambda function, you can also use the session attributes for initialization and customization (prompts
     * and response cards). Some examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Initialization - In a pizza ordering bot, if you can pass the user location as a session attribute (for example,
     * <code>"Location" : "111 Maple street"</code>), then your Lambda function might use this information to determine
     * the closest pizzeria to place the order (perhaps to set the storeAddress slot value).
     * </p>
     * </li>
     * <li>
     * <p>
     * Personalize prompts - For example, you can configure prompts to refer to the user name. (For example,
     * "Hey [FirstName], what toppings would you like?"). You can pass the user name as a session attribute (
     * <code>"FirstName" : "Joe"</code>) so that Amazon Lex can substitute the placeholder to provide a personalize
     * prompt to the user ("Hey Joe, what toppings would you like?").
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you configure a code hook for the intent, Amazon Lex passes the incoming session attributes to the Lambda
     * function. If you want Amazon Lex to return these session attributes back to the client, the Lambda function must
     * return them.
     * </p>
     * <p>
     * If there is no code hook configured for the intent, Amazon Lex simply returns the session attributes back to the
     * client application.
     * </p>
     * </note>
     * 
     * @return By using session attributes, a client application can pass contextual information in the request to
     *         Amazon Lex For example, </p>
     *         <ul>
     *         <li>
     *         <p>
     *         In Getting Started Exercise 1, the example bot uses the <code>price</code> session attribute to maintain
     *         the price of the flowers ordered (for example, "Price":25). The code hook (the Lambda function) sets this
     *         attribute based on the type of flowers ordered. For more information, see <a
     *         href="http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html">Review the Details of
     *         Information Flow</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the BookTrip bot exercise, the bot uses the <code>currentReservation</code> session attribute to
     *         maintain slot data during the in-progress conversation to book a hotel or book a car. For more
     *         information, see <a href="http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html">Details of
     *         Information Flow</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You might use the session attributes (key, value pairs) to track the requestID of user requests.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Amazon Lex simply passes these session attributes to the Lambda functions configured for the intent.
     *         </p>
     *         <p>
     *         In your Lambda function, you can also use the session attributes for initialization and customization
     *         (prompts and response cards). Some examples are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Initialization - In a pizza ordering bot, if you can pass the user location as a session attribute (for
     *         example, <code>"Location" : "111 Maple street"</code>), then your Lambda function might use this
     *         information to determine the closest pizzeria to place the order (perhaps to set the storeAddress slot
     *         value).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Personalize prompts - For example, you can configure prompts to refer to the user name. (For example,
     *         "Hey [FirstName], what toppings would you like?"). You can pass the user name as a session attribute (
     *         <code>"FirstName" : "Joe"</code>) so that Amazon Lex can substitute the placeholder to provide a
     *         personalize prompt to the user ("Hey Joe, what toppings would you like?").
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Amazon Lex does not persist session attributes.
     *         </p>
     *         <p>
     *         If you configure a code hook for the intent, Amazon Lex passes the incoming session attributes to the
     *         Lambda function. If you want Amazon Lex to return these session attributes back to the client, the Lambda
     *         function must return them.
     *         </p>
     *         <p>
     *         If there is no code hook configured for the intent, Amazon Lex simply returns the session attributes back
     *         to the client application.
     *         </p>
     */

    public java.util.Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    /**
     * <p>
     * By using session attributes, a client application can pass contextual information in the request to Amazon Lex
     * For example,
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Getting Started Exercise 1, the example bot uses the <code>price</code> session attribute to maintain the
     * price of the flowers ordered (for example, "Price":25). The code hook (the Lambda function) sets this attribute
     * based on the type of flowers ordered. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html">Review the Details of Information
     * Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the BookTrip bot exercise, the bot uses the <code>currentReservation</code> session attribute to maintain slot
     * data during the in-progress conversation to book a hotel or book a car. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html">Details of Information Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might use the session attributes (key, value pairs) to track the requestID of user requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Lex simply passes these session attributes to the Lambda functions configured for the intent.
     * </p>
     * <p>
     * In your Lambda function, you can also use the session attributes for initialization and customization (prompts
     * and response cards). Some examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Initialization - In a pizza ordering bot, if you can pass the user location as a session attribute (for example,
     * <code>"Location" : "111 Maple street"</code>), then your Lambda function might use this information to determine
     * the closest pizzeria to place the order (perhaps to set the storeAddress slot value).
     * </p>
     * </li>
     * <li>
     * <p>
     * Personalize prompts - For example, you can configure prompts to refer to the user name. (For example,
     * "Hey [FirstName], what toppings would you like?"). You can pass the user name as a session attribute (
     * <code>"FirstName" : "Joe"</code>) so that Amazon Lex can substitute the placeholder to provide a personalize
     * prompt to the user ("Hey Joe, what toppings would you like?").
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you configure a code hook for the intent, Amazon Lex passes the incoming session attributes to the Lambda
     * function. If you want Amazon Lex to return these session attributes back to the client, the Lambda function must
     * return them.
     * </p>
     * <p>
     * If there is no code hook configured for the intent, Amazon Lex simply returns the session attributes back to the
     * client application.
     * </p>
     * </note>
     * 
     * @param sessionAttributes
     *        By using session attributes, a client application can pass contextual information in the request to Amazon
     *        Lex For example, </p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Getting Started Exercise 1, the example bot uses the <code>price</code> session attribute to maintain
     *        the price of the flowers ordered (for example, "Price":25). The code hook (the Lambda function) sets this
     *        attribute based on the type of flowers ordered. For more information, see <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html">Review the Details of
     *        Information Flow</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the BookTrip bot exercise, the bot uses the <code>currentReservation</code> session attribute to
     *        maintain slot data during the in-progress conversation to book a hotel or book a car. For more
     *        information, see <a href="http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html">Details of
     *        Information Flow</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You might use the session attributes (key, value pairs) to track the requestID of user requests.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Amazon Lex simply passes these session attributes to the Lambda functions configured for the intent.
     *        </p>
     *        <p>
     *        In your Lambda function, you can also use the session attributes for initialization and customization
     *        (prompts and response cards). Some examples are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Initialization - In a pizza ordering bot, if you can pass the user location as a session attribute (for
     *        example, <code>"Location" : "111 Maple street"</code>), then your Lambda function might use this
     *        information to determine the closest pizzeria to place the order (perhaps to set the storeAddress slot
     *        value).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Personalize prompts - For example, you can configure prompts to refer to the user name. (For example,
     *        "Hey [FirstName], what toppings would you like?"). You can pass the user name as a session attribute (
     *        <code>"FirstName" : "Joe"</code>) so that Amazon Lex can substitute the placeholder to provide a
     *        personalize prompt to the user ("Hey Joe, what toppings would you like?").
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Amazon Lex does not persist session attributes.
     *        </p>
     *        <p>
     *        If you configure a code hook for the intent, Amazon Lex passes the incoming session attributes to the
     *        Lambda function. If you want Amazon Lex to return these session attributes back to the client, the Lambda
     *        function must return them.
     *        </p>
     *        <p>
     *        If there is no code hook configured for the intent, Amazon Lex simply returns the session attributes back
     *        to the client application.
     *        </p>
     */

    public void setSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * By using session attributes, a client application can pass contextual information in the request to Amazon Lex
     * For example,
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Getting Started Exercise 1, the example bot uses the <code>price</code> session attribute to maintain the
     * price of the flowers ordered (for example, "Price":25). The code hook (the Lambda function) sets this attribute
     * based on the type of flowers ordered. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html">Review the Details of Information
     * Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the BookTrip bot exercise, the bot uses the <code>currentReservation</code> session attribute to maintain slot
     * data during the in-progress conversation to book a hotel or book a car. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html">Details of Information Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might use the session attributes (key, value pairs) to track the requestID of user requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Lex simply passes these session attributes to the Lambda functions configured for the intent.
     * </p>
     * <p>
     * In your Lambda function, you can also use the session attributes for initialization and customization (prompts
     * and response cards). Some examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Initialization - In a pizza ordering bot, if you can pass the user location as a session attribute (for example,
     * <code>"Location" : "111 Maple street"</code>), then your Lambda function might use this information to determine
     * the closest pizzeria to place the order (perhaps to set the storeAddress slot value).
     * </p>
     * </li>
     * <li>
     * <p>
     * Personalize prompts - For example, you can configure prompts to refer to the user name. (For example,
     * "Hey [FirstName], what toppings would you like?"). You can pass the user name as a session attribute (
     * <code>"FirstName" : "Joe"</code>) so that Amazon Lex can substitute the placeholder to provide a personalize
     * prompt to the user ("Hey Joe, what toppings would you like?").
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you configure a code hook for the intent, Amazon Lex passes the incoming session attributes to the Lambda
     * function. If you want Amazon Lex to return these session attributes back to the client, the Lambda function must
     * return them.
     * </p>
     * <p>
     * If there is no code hook configured for the intent, Amazon Lex simply returns the session attributes back to the
     * client application.
     * </p>
     * </note>
     * 
     * @param sessionAttributes
     *        By using session attributes, a client application can pass contextual information in the request to Amazon
     *        Lex For example, </p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Getting Started Exercise 1, the example bot uses the <code>price</code> session attribute to maintain
     *        the price of the flowers ordered (for example, "Price":25). The code hook (the Lambda function) sets this
     *        attribute based on the type of flowers ordered. For more information, see <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html">Review the Details of
     *        Information Flow</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the BookTrip bot exercise, the bot uses the <code>currentReservation</code> session attribute to
     *        maintain slot data during the in-progress conversation to book a hotel or book a car. For more
     *        information, see <a href="http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html">Details of
     *        Information Flow</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You might use the session attributes (key, value pairs) to track the requestID of user requests.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Amazon Lex simply passes these session attributes to the Lambda functions configured for the intent.
     *        </p>
     *        <p>
     *        In your Lambda function, you can also use the session attributes for initialization and customization
     *        (prompts and response cards). Some examples are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Initialization - In a pizza ordering bot, if you can pass the user location as a session attribute (for
     *        example, <code>"Location" : "111 Maple street"</code>), then your Lambda function might use this
     *        information to determine the closest pizzeria to place the order (perhaps to set the storeAddress slot
     *        value).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Personalize prompts - For example, you can configure prompts to refer to the user name. (For example,
     *        "Hey [FirstName], what toppings would you like?"). You can pass the user name as a session attribute (
     *        <code>"FirstName" : "Joe"</code>) so that Amazon Lex can substitute the placeholder to provide a
     *        personalize prompt to the user ("Hey Joe, what toppings would you like?").
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Amazon Lex does not persist session attributes.
     *        </p>
     *        <p>
     *        If you configure a code hook for the intent, Amazon Lex passes the incoming session attributes to the
     *        Lambda function. If you want Amazon Lex to return these session attributes back to the client, the Lambda
     *        function must return them.
     *        </p>
     *        <p>
     *        If there is no code hook configured for the intent, Amazon Lex simply returns the session attributes back
     *        to the client application.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextRequest withSessionAttributes(java.util.Map<String, String> sessionAttributes) {
        setSessionAttributes(sessionAttributes);
        return this;
    }

    public PostTextRequest addSessionAttributesEntry(String key, String value) {
        if (null == this.sessionAttributes) {
            this.sessionAttributes = new java.util.HashMap<String, String>();
        }
        if (this.sessionAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sessionAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SessionAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextRequest clearSessionAttributesEntries() {
        this.sessionAttributes = null;
        return this;
    }

    /**
     * <p>
     * The text that the user entered (Amazon Lex interprets this text).
     * </p>
     * 
     * @param inputText
     *        The text that the user entered (Amazon Lex interprets this text).
     */

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    /**
     * <p>
     * The text that the user entered (Amazon Lex interprets this text).
     * </p>
     * 
     * @return The text that the user entered (Amazon Lex interprets this text).
     */

    public String getInputText() {
        return this.inputText;
    }

    /**
     * <p>
     * The text that the user entered (Amazon Lex interprets this text).
     * </p>
     * 
     * @param inputText
     *        The text that the user entered (Amazon Lex interprets this text).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostTextRequest withInputText(String inputText) {
        setInputText(inputText);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName()).append(",");
        if (getBotAlias() != null)
            sb.append("BotAlias: ").append(getBotAlias()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getSessionAttributes() != null)
            sb.append("SessionAttributes: ").append(getSessionAttributes()).append(",");
        if (getInputText() != null)
            sb.append("InputText: ").append(getInputText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostTextRequest == false)
            return false;
        PostTextRequest other = (PostTextRequest) obj;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getBotAlias() == null ^ this.getBotAlias() == null)
            return false;
        if (other.getBotAlias() != null && other.getBotAlias().equals(this.getBotAlias()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getSessionAttributes() == null ^ this.getSessionAttributes() == null)
            return false;
        if (other.getSessionAttributes() != null && other.getSessionAttributes().equals(this.getSessionAttributes()) == false)
            return false;
        if (other.getInputText() == null ^ this.getInputText() == null)
            return false;
        if (other.getInputText() != null && other.getInputText().equals(this.getInputText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getBotAlias() == null) ? 0 : getBotAlias().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getSessionAttributes() == null) ? 0 : getSessionAttributes().hashCode());
        hashCode = prime * hashCode + ((getInputText() == null) ? 0 : getInputText().hashCode());
        return hashCode;
    }

    @Override
    public PostTextRequest clone() {
        return (PostTextRequest) super.clone();
    }

}
