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
import com.amazonaws.auth.SignerTypeAware;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/PostContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable, SignerTypeAware {

    /**
     * <p>
     * Name of the Amazon Lex bot.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * Alias of the Amazon Lex bot.
     * </p>
     */
    private String botAlias;
    /**
     * <p>
     * ID of the client application user. Typically, each of your application users should have a unique ID. The
     * application developer decides the user IDs. At runtime, each request must include the user ID. Note the following
     * considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start conversation on one device and continue the conversation on another device, you might
     * choose a user-specific identifier, such as the user's login, or Amazon Cognito user ID (assuming your application
     * is using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent conversations on two different devices, you might
     * choose device-specific identifier, such as device ID, or some globally unique identifier.
     * </p>
     * </li>
     * </ul>
     */
    private String userId;
    /**
     * <p>
     * You pass this value in the <code>x-amz-lex-session-attributes</code> HTTP header. The value must be map (keys and
     * values must be strings) that is JSON serialized and then base64 encoded.
     * </p>
     * <p>
     * A session represents dialog between a user and Amazon Lex. At runtime, a client application can pass contextual
     * information, in the request to Amazon Lex. For example,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You might use session attributes to track the requestID of user requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Getting Started Exercise 1, the example bot uses the price session attribute to maintain the price of flowers
     * ordered (for example, "price":25). The code hook (Lambda function) sets this attribute based on the type of
     * flowers ordered. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html">Review the Details of Information
     * Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the BookTrip bot exercise, the bot uses the <code>currentReservation</code> session attribute to maintains the
     * slot data during the in-progress conversation to book a hotel or book a car. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html">Details of Information Flow</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Lex passes these session attributes to the Lambda functions configured for the intent In the your Lambda
     * function, you can use the session attributes for initialization and customization (prompts). Some examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Initialization - In a pizza ordering bot, if you pass user location (for example,
     * <code>"Location : 111 Maple Street"</code>), then your Lambda function might use this information to determine
     * the closest pizzeria to place the order (and perhaps set the storeAddress slot value as well).
     * </p>
     * <p>
     * Personalized prompts - For example, you can configure prompts to refer to the user by name (for example,
     * "Hey [firstName], what toppings would you like?"). You can pass the user's name as a session attribute
     * ("firstName": "Joe") so that Amazon Lex can substitute the placeholder to provide a personalized prompt to the
     * user ("Hey Joe, what toppings would you like?").
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you configured a code hook for the intent, Amazon Lex passes the incoming session attributes to the Lambda
     * function. The Lambda function must return these session attributes if you want Amazon Lex to return them to the
     * client.
     * </p>
     * <p>
     * If there is no code hook configured for the intent Amazon Lex simply returns the session attributes to the client
     * application.
     * </p>
     * </note>
     */
    private String sessionAttributes;
    /**
     * <p>
     * You pass this values as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one of the following prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/l16; rate=16000; channels=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-l16; sample-rate=16000; channel-count=1
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Opus format
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=1; frame-size-milliseconds=1.1
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Text format
     * </p>
     * <ul>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String contentType;
    /**
     * <p>
     * You pass this value as the <code>Accept</code> HTTP header.
     * </p>
     * <p>
     * The message Amazon Lex returns in the response can be either text or speech based on the <code>Accept</code> HTTP
     * header value in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses Amazon
     * Polly to generate the speech (using the configuration you specified in the <code>Accept</code> header). For
     * example, if you specify <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the MPEG format.
     * </p>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/mpeg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/ogg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/pcm
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String accept;
    /**
     * <p>
     * User input in PCM or Opus audio format or text format as described in the <code>Content-Type</code> HTTP header.
     * </p>
     */
    private java.io.InputStream inputStreamValue;

    /**
     * <p>
     * Name of the Amazon Lex bot.
     * </p>
     * 
     * @param botName
     *        Name of the Amazon Lex bot.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * Name of the Amazon Lex bot.
     * </p>
     * 
     * @return Name of the Amazon Lex bot.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * Name of the Amazon Lex bot.
     * </p>
     * 
     * @param botName
     *        Name of the Amazon Lex bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentRequest withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * Alias of the Amazon Lex bot.
     * </p>
     * 
     * @param botAlias
     *        Alias of the Amazon Lex bot.
     */

    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * <p>
     * Alias of the Amazon Lex bot.
     * </p>
     * 
     * @return Alias of the Amazon Lex bot.
     */

    public String getBotAlias() {
        return this.botAlias;
    }

    /**
     * <p>
     * Alias of the Amazon Lex bot.
     * </p>
     * 
     * @param botAlias
     *        Alias of the Amazon Lex bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentRequest withBotAlias(String botAlias) {
        setBotAlias(botAlias);
        return this;
    }

    /**
     * <p>
     * ID of the client application user. Typically, each of your application users should have a unique ID. The
     * application developer decides the user IDs. At runtime, each request must include the user ID. Note the following
     * considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start conversation on one device and continue the conversation on another device, you might
     * choose a user-specific identifier, such as the user's login, or Amazon Cognito user ID (assuming your application
     * is using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent conversations on two different devices, you might
     * choose device-specific identifier, such as device ID, or some globally unique identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userId
     *        ID of the client application user. Typically, each of your application users should have a unique ID. The
     *        application developer decides the user IDs. At runtime, each request must include the user ID. Note the
     *        following considerations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you want a user to start conversation on one device and continue the conversation on another device,
     *        you might choose a user-specific identifier, such as the user's login, or Amazon Cognito user ID (assuming
     *        your application is using Amazon Cognito).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you want the same user to be able to have two independent conversations on two different devices, you
     *        might choose device-specific identifier, such as device ID, or some globally unique identifier.
     *        </p>
     *        </li>
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * ID of the client application user. Typically, each of your application users should have a unique ID. The
     * application developer decides the user IDs. At runtime, each request must include the user ID. Note the following
     * considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start conversation on one device and continue the conversation on another device, you might
     * choose a user-specific identifier, such as the user's login, or Amazon Cognito user ID (assuming your application
     * is using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent conversations on two different devices, you might
     * choose device-specific identifier, such as device ID, or some globally unique identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @return ID of the client application user. Typically, each of your application users should have a unique ID. The
     *         application developer decides the user IDs. At runtime, each request must include the user ID. Note the
     *         following considerations:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you want a user to start conversation on one device and continue the conversation on another device,
     *         you might choose a user-specific identifier, such as the user's login, or Amazon Cognito user ID
     *         (assuming your application is using Amazon Cognito).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you want the same user to be able to have two independent conversations on two different devices, you
     *         might choose device-specific identifier, such as device ID, or some globally unique identifier.
     *         </p>
     *         </li>
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * ID of the client application user. Typically, each of your application users should have a unique ID. The
     * application developer decides the user IDs. At runtime, each request must include the user ID. Note the following
     * considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you want a user to start conversation on one device and continue the conversation on another device, you might
     * choose a user-specific identifier, such as the user's login, or Amazon Cognito user ID (assuming your application
     * is using Amazon Cognito).
     * </p>
     * </li>
     * <li>
     * <p>
     * If you want the same user to be able to have two independent conversations on two different devices, you might
     * choose device-specific identifier, such as device ID, or some globally unique identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userId
     *        ID of the client application user. Typically, each of your application users should have a unique ID. The
     *        application developer decides the user IDs. At runtime, each request must include the user ID. Note the
     *        following considerations:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you want a user to start conversation on one device and continue the conversation on another device,
     *        you might choose a user-specific identifier, such as the user's login, or Amazon Cognito user ID (assuming
     *        your application is using Amazon Cognito).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you want the same user to be able to have two independent conversations on two different devices, you
     *        might choose device-specific identifier, such as device ID, or some globally unique identifier.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * You pass this value in the <code>x-amz-lex-session-attributes</code> HTTP header. The value must be map (keys and
     * values must be strings) that is JSON serialized and then base64 encoded.
     * </p>
     * <p>
     * A session represents dialog between a user and Amazon Lex. At runtime, a client application can pass contextual
     * information, in the request to Amazon Lex. For example,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You might use session attributes to track the requestID of user requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Getting Started Exercise 1, the example bot uses the price session attribute to maintain the price of flowers
     * ordered (for example, "price":25). The code hook (Lambda function) sets this attribute based on the type of
     * flowers ordered. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html">Review the Details of Information
     * Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the BookTrip bot exercise, the bot uses the <code>currentReservation</code> session attribute to maintains the
     * slot data during the in-progress conversation to book a hotel or book a car. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html">Details of Information Flow</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Lex passes these session attributes to the Lambda functions configured for the intent In the your Lambda
     * function, you can use the session attributes for initialization and customization (prompts). Some examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Initialization - In a pizza ordering bot, if you pass user location (for example,
     * <code>"Location : 111 Maple Street"</code>), then your Lambda function might use this information to determine
     * the closest pizzeria to place the order (and perhaps set the storeAddress slot value as well).
     * </p>
     * <p>
     * Personalized prompts - For example, you can configure prompts to refer to the user by name (for example,
     * "Hey [firstName], what toppings would you like?"). You can pass the user's name as a session attribute
     * ("firstName": "Joe") so that Amazon Lex can substitute the placeholder to provide a personalized prompt to the
     * user ("Hey Joe, what toppings would you like?").
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you configured a code hook for the intent, Amazon Lex passes the incoming session attributes to the Lambda
     * function. The Lambda function must return these session attributes if you want Amazon Lex to return them to the
     * client.
     * </p>
     * <p>
     * If there is no code hook configured for the intent Amazon Lex simply returns the session attributes to the client
     * application.
     * </p>
     * </note>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param sessionAttributes
     *        You pass this value in the <code>x-amz-lex-session-attributes</code> HTTP header. The value must be map
     *        (keys and values must be strings) that is JSON serialized and then base64 encoded.</p>
     *        <p>
     *        A session represents dialog between a user and Amazon Lex. At runtime, a client application can pass
     *        contextual information, in the request to Amazon Lex. For example,
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You might use session attributes to track the requestID of user requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In Getting Started Exercise 1, the example bot uses the price session attribute to maintain the price of
     *        flowers ordered (for example, "price":25). The code hook (Lambda function) sets this attribute based on
     *        the type of flowers ordered. For more information, see <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html">Review the Details of
     *        Information Flow</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the BookTrip bot exercise, the bot uses the <code>currentReservation</code> session attribute to
     *        maintains the slot data during the in-progress conversation to book a hotel or book a car. For more
     *        information, see <a href="http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html">Details of
     *        Information Flow</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Amazon Lex passes these session attributes to the Lambda functions configured for the intent In the your
     *        Lambda function, you can use the session attributes for initialization and customization (prompts). Some
     *        examples are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Initialization - In a pizza ordering bot, if you pass user location (for example,
     *        <code>"Location : 111 Maple Street"</code>), then your Lambda function might use this information to
     *        determine the closest pizzeria to place the order (and perhaps set the storeAddress slot value as well).
     *        </p>
     *        <p>
     *        Personalized prompts - For example, you can configure prompts to refer to the user by name (for example,
     *        "Hey [firstName], what toppings would you like?"). You can pass the user's name as a session attribute
     *        ("firstName": "Joe") so that Amazon Lex can substitute the placeholder to provide a personalized prompt to
     *        the user ("Hey Joe, what toppings would you like?").
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Amazon Lex does not persist session attributes.
     *        </p>
     *        <p>
     *        If you configured a code hook for the intent, Amazon Lex passes the incoming session attributes to the
     *        Lambda function. The Lambda function must return these session attributes if you want Amazon Lex to return
     *        them to the client.
     *        </p>
     *        <p>
     *        If there is no code hook configured for the intent Amazon Lex simply returns the session attributes to the
     *        client application.
     *        </p>
     */

    public void setSessionAttributes(String sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    /**
     * <p>
     * You pass this value in the <code>x-amz-lex-session-attributes</code> HTTP header. The value must be map (keys and
     * values must be strings) that is JSON serialized and then base64 encoded.
     * </p>
     * <p>
     * A session represents dialog between a user and Amazon Lex. At runtime, a client application can pass contextual
     * information, in the request to Amazon Lex. For example,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You might use session attributes to track the requestID of user requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Getting Started Exercise 1, the example bot uses the price session attribute to maintain the price of flowers
     * ordered (for example, "price":25). The code hook (Lambda function) sets this attribute based on the type of
     * flowers ordered. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html">Review the Details of Information
     * Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the BookTrip bot exercise, the bot uses the <code>currentReservation</code> session attribute to maintains the
     * slot data during the in-progress conversation to book a hotel or book a car. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html">Details of Information Flow</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Lex passes these session attributes to the Lambda functions configured for the intent In the your Lambda
     * function, you can use the session attributes for initialization and customization (prompts). Some examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Initialization - In a pizza ordering bot, if you pass user location (for example,
     * <code>"Location : 111 Maple Street"</code>), then your Lambda function might use this information to determine
     * the closest pizzeria to place the order (and perhaps set the storeAddress slot value as well).
     * </p>
     * <p>
     * Personalized prompts - For example, you can configure prompts to refer to the user by name (for example,
     * "Hey [firstName], what toppings would you like?"). You can pass the user's name as a session attribute
     * ("firstName": "Joe") so that Amazon Lex can substitute the placeholder to provide a personalized prompt to the
     * user ("Hey Joe, what toppings would you like?").
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you configured a code hook for the intent, Amazon Lex passes the incoming session attributes to the Lambda
     * function. The Lambda function must return these session attributes if you want Amazon Lex to return them to the
     * client.
     * </p>
     * <p>
     * If there is no code hook configured for the intent Amazon Lex simply returns the session attributes to the client
     * application.
     * </p>
     * </note>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return You pass this value in the <code>x-amz-lex-session-attributes</code> HTTP header. The value must be map
     *         (keys and values must be strings) that is JSON serialized and then base64 encoded.</p>
     *         <p>
     *         A session represents dialog between a user and Amazon Lex. At runtime, a client application can pass
     *         contextual information, in the request to Amazon Lex. For example,
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You might use session attributes to track the requestID of user requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In Getting Started Exercise 1, the example bot uses the price session attribute to maintain the price of
     *         flowers ordered (for example, "price":25). The code hook (Lambda function) sets this attribute based on
     *         the type of flowers ordered. For more information, see <a
     *         href="http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html">Review the Details of
     *         Information Flow</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the BookTrip bot exercise, the bot uses the <code>currentReservation</code> session attribute to
     *         maintains the slot data during the in-progress conversation to book a hotel or book a car. For more
     *         information, see <a href="http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html">Details of
     *         Information Flow</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Amazon Lex passes these session attributes to the Lambda functions configured for the intent In the your
     *         Lambda function, you can use the session attributes for initialization and customization (prompts). Some
     *         examples are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Initialization - In a pizza ordering bot, if you pass user location (for example,
     *         <code>"Location : 111 Maple Street"</code>), then your Lambda function might use this information to
     *         determine the closest pizzeria to place the order (and perhaps set the storeAddress slot value as well).
     *         </p>
     *         <p>
     *         Personalized prompts - For example, you can configure prompts to refer to the user by name (for example,
     *         "Hey [firstName], what toppings would you like?"). You can pass the user's name as a session attribute
     *         ("firstName": "Joe") so that Amazon Lex can substitute the placeholder to provide a personalized prompt
     *         to the user ("Hey Joe, what toppings would you like?").
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Amazon Lex does not persist session attributes.
     *         </p>
     *         <p>
     *         If you configured a code hook for the intent, Amazon Lex passes the incoming session attributes to the
     *         Lambda function. The Lambda function must return these session attributes if you want Amazon Lex to
     *         return them to the client.
     *         </p>
     *         <p>
     *         If there is no code hook configured for the intent Amazon Lex simply returns the session attributes to
     *         the client application.
     *         </p>
     */

    public String getSessionAttributes() {
        return this.sessionAttributes;
    }

    /**
     * <p>
     * You pass this value in the <code>x-amz-lex-session-attributes</code> HTTP header. The value must be map (keys and
     * values must be strings) that is JSON serialized and then base64 encoded.
     * </p>
     * <p>
     * A session represents dialog between a user and Amazon Lex. At runtime, a client application can pass contextual
     * information, in the request to Amazon Lex. For example,
     * </p>
     * <ul>
     * <li>
     * <p>
     * You might use session attributes to track the requestID of user requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * In Getting Started Exercise 1, the example bot uses the price session attribute to maintain the price of flowers
     * ordered (for example, "price":25). The code hook (Lambda function) sets this attribute based on the type of
     * flowers ordered. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html">Review the Details of Information
     * Flow</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the BookTrip bot exercise, the bot uses the <code>currentReservation</code> session attribute to maintains the
     * slot data during the in-progress conversation to book a hotel or book a car. For more information, see <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html">Details of Information Flow</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Lex passes these session attributes to the Lambda functions configured for the intent In the your Lambda
     * function, you can use the session attributes for initialization and customization (prompts). Some examples are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Initialization - In a pizza ordering bot, if you pass user location (for example,
     * <code>"Location : 111 Maple Street"</code>), then your Lambda function might use this information to determine
     * the closest pizzeria to place the order (and perhaps set the storeAddress slot value as well).
     * </p>
     * <p>
     * Personalized prompts - For example, you can configure prompts to refer to the user by name (for example,
     * "Hey [firstName], what toppings would you like?"). You can pass the user's name as a session attribute
     * ("firstName": "Joe") so that Amazon Lex can substitute the placeholder to provide a personalized prompt to the
     * user ("Hey Joe, what toppings would you like?").
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Amazon Lex does not persist session attributes.
     * </p>
     * <p>
     * If you configured a code hook for the intent, Amazon Lex passes the incoming session attributes to the Lambda
     * function. The Lambda function must return these session attributes if you want Amazon Lex to return them to the
     * client.
     * </p>
     * <p>
     * If there is no code hook configured for the intent Amazon Lex simply returns the session attributes to the client
     * application.
     * </p>
     * </note>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param sessionAttributes
     *        You pass this value in the <code>x-amz-lex-session-attributes</code> HTTP header. The value must be map
     *        (keys and values must be strings) that is JSON serialized and then base64 encoded.</p>
     *        <p>
     *        A session represents dialog between a user and Amazon Lex. At runtime, a client application can pass
     *        contextual information, in the request to Amazon Lex. For example,
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You might use session attributes to track the requestID of user requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In Getting Started Exercise 1, the example bot uses the price session attribute to maintain the price of
     *        flowers ordered (for example, "price":25). The code hook (Lambda function) sets this attribute based on
     *        the type of flowers ordered. For more information, see <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/gs-bp-details-after-lambda.html">Review the Details of
     *        Information Flow</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the BookTrip bot exercise, the bot uses the <code>currentReservation</code> session attribute to
     *        maintains the slot data during the in-progress conversation to book a hotel or book a car. For more
     *        information, see <a href="http://docs.aws.amazon.com/lex/latest/dg/book-trip-detail-flow.html">Details of
     *        Information Flow</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Amazon Lex passes these session attributes to the Lambda functions configured for the intent In the your
     *        Lambda function, you can use the session attributes for initialization and customization (prompts). Some
     *        examples are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Initialization - In a pizza ordering bot, if you pass user location (for example,
     *        <code>"Location : 111 Maple Street"</code>), then your Lambda function might use this information to
     *        determine the closest pizzeria to place the order (and perhaps set the storeAddress slot value as well).
     *        </p>
     *        <p>
     *        Personalized prompts - For example, you can configure prompts to refer to the user by name (for example,
     *        "Hey [firstName], what toppings would you like?"). You can pass the user's name as a session attribute
     *        ("firstName": "Joe") so that Amazon Lex can substitute the placeholder to provide a personalized prompt to
     *        the user ("Hey Joe, what toppings would you like?").
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Amazon Lex does not persist session attributes.
     *        </p>
     *        <p>
     *        If you configured a code hook for the intent, Amazon Lex passes the incoming session attributes to the
     *        Lambda function. The Lambda function must return these session attributes if you want Amazon Lex to return
     *        them to the client.
     *        </p>
     *        <p>
     *        If there is no code hook configured for the intent Amazon Lex simply returns the session attributes to the
     *        client application.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentRequest withSessionAttributes(String sessionAttributes) {
        setSessionAttributes(sessionAttributes);
        return this;
    }

    /**
     * <p>
     * You pass this values as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one of the following prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/l16; rate=16000; channels=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-l16; sample-rate=16000; channel-count=1
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Opus format
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=1; frame-size-milliseconds=1.1
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Text format
     * </p>
     * <ul>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        You pass this values as the <code>Content-Type</code> HTTP header. </p>
     *        <p>
     *        Indicates the audio format or text. The header value must start with one of the following prefixes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PCM format
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        audio/l16; rate=16000; channels=1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/x-l16; sample-rate=16000; channel-count=1
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Opus format
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=1; frame-size-milliseconds=1.1
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Text format
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        text/plain; charset=utf-8
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * You pass this values as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one of the following prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/l16; rate=16000; channels=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-l16; sample-rate=16000; channel-count=1
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Opus format
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=1; frame-size-milliseconds=1.1
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Text format
     * </p>
     * <ul>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return You pass this values as the <code>Content-Type</code> HTTP header. </p>
     *         <p>
     *         Indicates the audio format or text. The header value must start with one of the following prefixes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         PCM format
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         audio/l16; rate=16000; channels=1
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         audio/x-l16; sample-rate=16000; channel-count=1
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Opus format
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=1; frame-size-milliseconds=1.1
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Text format
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         text/plain; charset=utf-8
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * You pass this values as the <code>Content-Type</code> HTTP header.
     * </p>
     * <p>
     * Indicates the audio format or text. The header value must start with one of the following prefixes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PCM format
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/l16; rate=16000; channels=1
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/x-l16; sample-rate=16000; channel-count=1
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Opus format
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=1; frame-size-milliseconds=1.1
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Text format
     * </p>
     * <ul>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param contentType
     *        You pass this values as the <code>Content-Type</code> HTTP header. </p>
     *        <p>
     *        Indicates the audio format or text. The header value must start with one of the following prefixes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PCM format
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        audio/l16; rate=16000; channels=1
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/x-l16; sample-rate=16000; channel-count=1
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Opus format
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        audio/x-cbr-opus-with-preamble; preamble-size=0; bit-rate=1; frame-size-milliseconds=1.1
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Text format
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        text/plain; charset=utf-8
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * You pass this value as the <code>Accept</code> HTTP header.
     * </p>
     * <p>
     * The message Amazon Lex returns in the response can be either text or speech based on the <code>Accept</code> HTTP
     * header value in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses Amazon
     * Polly to generate the speech (using the configuration you specified in the <code>Accept</code> header). For
     * example, if you specify <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the MPEG format.
     * </p>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/mpeg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/ogg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/pcm
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param accept
     *        You pass this value as the <code>Accept</code> HTTP header. </p>
     *        <p>
     *        The message Amazon Lex returns in the response can be either text or speech based on the
     *        <code>Accept</code> HTTP header value in the request.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses
     *        Amazon Polly to generate the speech (using the configuration you specified in the <code>Accept</code>
     *        header). For example, if you specify <code>audio/mpeg</code> as the value, Amazon Lex returns speech in
     *        the MPEG format.
     *        </p>
     *        <p>
     *        The following are the accepted values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        audio/mpeg
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/ogg
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/pcm
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        text/plain; charset=utf-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/* (defaults to mpeg)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * <p>
     * You pass this value as the <code>Accept</code> HTTP header.
     * </p>
     * <p>
     * The message Amazon Lex returns in the response can be either text or speech based on the <code>Accept</code> HTTP
     * header value in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses Amazon
     * Polly to generate the speech (using the configuration you specified in the <code>Accept</code> header). For
     * example, if you specify <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the MPEG format.
     * </p>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/mpeg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/ogg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/pcm
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return You pass this value as the <code>Accept</code> HTTP header. </p>
     *         <p>
     *         The message Amazon Lex returns in the response can be either text or speech based on the
     *         <code>Accept</code> HTTP header value in the request.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses
     *         Amazon Polly to generate the speech (using the configuration you specified in the <code>Accept</code>
     *         header). For example, if you specify <code>audio/mpeg</code> as the value, Amazon Lex returns speech in
     *         the MPEG format.
     *         </p>
     *         <p>
     *         The following are the accepted values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         audio/mpeg
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         audio/ogg
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         audio/pcm
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         text/plain; charset=utf-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         audio/* (defaults to mpeg)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getAccept() {
        return this.accept;
    }

    /**
     * <p>
     * You pass this value as the <code>Accept</code> HTTP header.
     * </p>
     * <p>
     * The message Amazon Lex returns in the response can be either text or speech based on the <code>Accept</code> HTTP
     * header value in the request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses Amazon
     * Polly to generate the speech (using the configuration you specified in the <code>Accept</code> header). For
     * example, if you specify <code>audio/mpeg</code> as the value, Amazon Lex returns speech in the MPEG format.
     * </p>
     * <p>
     * The following are the accepted values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * audio/mpeg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/ogg
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/pcm
     * </p>
     * </li>
     * <li>
     * <p>
     * text/plain; charset=utf-8
     * </p>
     * </li>
     * <li>
     * <p>
     * audio/* (defaults to mpeg)
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param accept
     *        You pass this value as the <code>Accept</code> HTTP header. </p>
     *        <p>
     *        The message Amazon Lex returns in the response can be either text or speech based on the
     *        <code>Accept</code> HTTP header value in the request.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the value is <code>text/plain; charset=utf-8</code>, Amazon Lex returns text in the response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value begins with <code>audio/</code>, Amazon Lex returns speech in the response. Amazon Lex uses
     *        Amazon Polly to generate the speech (using the configuration you specified in the <code>Accept</code>
     *        header). For example, if you specify <code>audio/mpeg</code> as the value, Amazon Lex returns speech in
     *        the MPEG format.
     *        </p>
     *        <p>
     *        The following are the accepted values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        audio/mpeg
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/ogg
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/pcm
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        text/plain; charset=utf-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        audio/* (defaults to mpeg)
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentRequest withAccept(String accept) {
        setAccept(accept);
        return this;
    }

    /**
     * <p>
     * User input in PCM or Opus audio format or text format as described in the <code>Content-Type</code> HTTP header.
     * </p>
     * 
     * @param inputStreamValue
     *        User input in PCM or Opus audio format or text format as described in the <code>Content-Type</code> HTTP
     *        header.
     */

    public void setInputStream(java.io.InputStream inputStreamValue) {
        this.inputStreamValue = inputStreamValue;
    }

    /**
     * <p>
     * User input in PCM or Opus audio format or text format as described in the <code>Content-Type</code> HTTP header.
     * </p>
     * 
     * @return User input in PCM or Opus audio format or text format as described in the <code>Content-Type</code> HTTP
     *         header.
     */

    public java.io.InputStream getInputStream() {
        return this.inputStreamValue;
    }

    /**
     * <p>
     * User input in PCM or Opus audio format or text format as described in the <code>Content-Type</code> HTTP header.
     * </p>
     * 
     * @param inputStreamValue
     *        User input in PCM or Opus audio format or text format as described in the <code>Content-Type</code> HTTP
     *        header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostContentRequest withInputStream(java.io.InputStream inputStreamValue) {
        setInputStream(inputStreamValue);
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getAccept() != null)
            sb.append("Accept: ").append(getAccept()).append(",");
        if (getInputStream() != null)
            sb.append("InputStream: ").append(getInputStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostContentRequest == false)
            return false;
        PostContentRequest other = (PostContentRequest) obj;
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
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getAccept() == null ^ this.getAccept() == null)
            return false;
        if (other.getAccept() != null && other.getAccept().equals(this.getAccept()) == false)
            return false;
        if (other.getInputStream() == null ^ this.getInputStream() == null)
            return false;
        if (other.getInputStream() != null && other.getInputStream().equals(this.getInputStream()) == false)
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
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        hashCode = prime * hashCode + ((getInputStream() == null) ? 0 : getInputStream().hashCode());
        return hashCode;
    }

    @Override
    public PostContentRequest clone() {
        return (PostContentRequest) super.clone();
    }

    @Override
    public String getSignerType() {
        return "AWS4UnsignedPayloadSignerType";
    }

}
