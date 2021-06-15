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
package com.amazonaws.services.lexmodelsv2;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;

/**
 * Interface for accessing Lex Models V2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lexmodelsv2.AbstractAmazonLexModelsV2Async} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLexModelsV2Async extends AmazonLexModelsV2 {

    /**
     * <p>
     * Builds a bot, its intents, and its slot types into a specific locale. A bot can be built into multiple locales.
     * At runtime the locale is used to choose a specific build of the bot.
     * </p>
     * 
     * @param buildBotLocaleRequest
     * @return A Java Future containing the result of the BuildBotLocale operation returned by the service.
     * @sample AmazonLexModelsV2Async.BuildBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BuildBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BuildBotLocaleResult> buildBotLocaleAsync(BuildBotLocaleRequest buildBotLocaleRequest);

    /**
     * <p>
     * Builds a bot, its intents, and its slot types into a specific locale. A bot can be built into multiple locales.
     * At runtime the locale is used to choose a specific build of the bot.
     * </p>
     * 
     * @param buildBotLocaleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BuildBotLocale operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.BuildBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BuildBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BuildBotLocaleResult> buildBotLocaleAsync(BuildBotLocaleRequest buildBotLocaleRequest,
            com.amazonaws.handlers.AsyncHandler<BuildBotLocaleRequest, BuildBotLocaleResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Lex conversational bot.
     * </p>
     * 
     * @param createBotRequest
     * @return A Java Future containing the result of the CreateBot operation returned by the service.
     * @sample AmazonLexModelsV2Async.CreateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBotResult> createBotAsync(CreateBotRequest createBotRequest);

    /**
     * <p>
     * Creates an Amazon Lex conversational bot.
     * </p>
     * 
     * @param createBotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBot operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.CreateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBotResult> createBotAsync(CreateBotRequest createBotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBotRequest, CreateBotResult> asyncHandler);

    /**
     * <p>
     * Creates an alias for the specified version of a bot. Use an alias to enable you to change the version of a bot
     * without updating applications that use the bot.
     * </p>
     * <p>
     * For example, you can create an alias called "PROD" that your applications use to call the Amazon Lex bot.
     * </p>
     * 
     * @param createBotAliasRequest
     * @return A Java Future containing the result of the CreateBotAlias operation returned by the service.
     * @sample AmazonLexModelsV2Async.CreateBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBotAliasResult> createBotAliasAsync(CreateBotAliasRequest createBotAliasRequest);

    /**
     * <p>
     * Creates an alias for the specified version of a bot. Use an alias to enable you to change the version of a bot
     * without updating applications that use the bot.
     * </p>
     * <p>
     * For example, you can create an alias called "PROD" that your applications use to call the Amazon Lex bot.
     * </p>
     * 
     * @param createBotAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBotAlias operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.CreateBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBotAliasResult> createBotAliasAsync(CreateBotAliasRequest createBotAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBotAliasRequest, CreateBotAliasResult> asyncHandler);

    /**
     * <p>
     * Creates a locale in the bot. The locale contains the intents and slot types that the bot uses in conversations
     * with users in the specified language and locale. You must add a locale to a bot before you can add intents and
     * slot types to the bot.
     * </p>
     * 
     * @param createBotLocaleRequest
     * @return A Java Future containing the result of the CreateBotLocale operation returned by the service.
     * @sample AmazonLexModelsV2Async.CreateBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBotLocaleResult> createBotLocaleAsync(CreateBotLocaleRequest createBotLocaleRequest);

    /**
     * <p>
     * Creates a locale in the bot. The locale contains the intents and slot types that the bot uses in conversations
     * with users in the specified language and locale. You must add a locale to a bot before you can add intents and
     * slot types to the bot.
     * </p>
     * 
     * @param createBotLocaleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBotLocale operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.CreateBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBotLocaleResult> createBotLocaleAsync(CreateBotLocaleRequest createBotLocaleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBotLocaleRequest, CreateBotLocaleResult> asyncHandler);

    /**
     * <p>
     * Creates a new version of the bot based on the <code>DRAFT</code> version. If the <code>DRAFT</code> version of
     * this resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version, it
     * returns the last created version.
     * </p>
     * <p>
     * When you create the first version of a bot, Amazon Lex sets the version to 1. Subsequent versions increment by 1.
     * </p>
     * 
     * @param createBotVersionRequest
     * @return A Java Future containing the result of the CreateBotVersion operation returned by the service.
     * @sample AmazonLexModelsV2Async.CreateBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBotVersionResult> createBotVersionAsync(CreateBotVersionRequest createBotVersionRequest);

    /**
     * <p>
     * Creates a new version of the bot based on the <code>DRAFT</code> version. If the <code>DRAFT</code> version of
     * this resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version, it
     * returns the last created version.
     * </p>
     * <p>
     * When you create the first version of a bot, Amazon Lex sets the version to 1. Subsequent versions increment by 1.
     * </p>
     * 
     * @param createBotVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBotVersion operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.CreateBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBotVersionResult> createBotVersionAsync(CreateBotVersionRequest createBotVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBotVersionRequest, CreateBotVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a zip archive containing the contents of a bot or a bot locale. The archive contains a directory
     * structure that contains JSON files that define the bot.
     * </p>
     * <p>
     * You can create an archive that contains the complete definition of a bot, or you can specify that the archive
     * contain only the definition of a single bot locale.
     * </p>
     * <p>
     * For more information about exporting bots, and about the structure of the export archive, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/importing-exporting.html"> Importing and exporting bots </a>
     * </p>
     * 
     * @param createExportRequest
     * @return A Java Future containing the result of the CreateExport operation returned by the service.
     * @sample AmazonLexModelsV2Async.CreateExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateExport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateExportResult> createExportAsync(CreateExportRequest createExportRequest);

    /**
     * <p>
     * Creates a zip archive containing the contents of a bot or a bot locale. The archive contains a directory
     * structure that contains JSON files that define the bot.
     * </p>
     * <p>
     * You can create an archive that contains the complete definition of a bot, or you can specify that the archive
     * contain only the definition of a single bot locale.
     * </p>
     * <p>
     * For more information about exporting bots, and about the structure of the export archive, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/importing-exporting.html"> Importing and exporting bots </a>
     * </p>
     * 
     * @param createExportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateExport operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.CreateExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateExport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateExportResult> createExportAsync(CreateExportRequest createExportRequest,
            com.amazonaws.handlers.AsyncHandler<CreateExportRequest, CreateExportResult> asyncHandler);

    /**
     * <p>
     * Creates an intent.
     * </p>
     * <p>
     * To define the interaction between the user and your bot, you define one or more intents. For example, for a pizza
     * ordering bot you would create an <code>OrderPizza</code> intent.
     * </p>
     * <p>
     * When you create an intent, you must provide a name. You can optionally provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample utterances. For example, "I want to order a pizza" and "Can I order a pizza." You can't provide utterances
     * for built-in intents.
     * </p>
     * </li>
     * <li>
     * <p>
     * Information to be gathered. You specify slots for the information that you bot requests from the user. You can
     * specify standard slot types, such as date and time, or custom slot types for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * How the intent is fulfilled. You can provide a Lambda function or configure the intent to return the intent
     * information to your client application. If you use a Lambda function, Amazon Lex invokes the function when all of
     * the intent information is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * A confirmation prompt to send to the user to confirm an intent. For example, "Shall I order your pizza?"
     * </p>
     * </li>
     * <li>
     * <p>
     * A conclusion statement to send to the user after the intent is fulfilled. For example, "I ordered your pizza."
     * </p>
     * </li>
     * <li>
     * <p>
     * A follow-up prompt that asks the user for additional activity. For example,
     * "Do you want a drink with your pizza?"
     * </p>
     * </li>
     * </ul>
     * 
     * @param createIntentRequest
     * @return A Java Future containing the result of the CreateIntent operation returned by the service.
     * @sample AmazonLexModelsV2Async.CreateIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateIntent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIntentResult> createIntentAsync(CreateIntentRequest createIntentRequest);

    /**
     * <p>
     * Creates an intent.
     * </p>
     * <p>
     * To define the interaction between the user and your bot, you define one or more intents. For example, for a pizza
     * ordering bot you would create an <code>OrderPizza</code> intent.
     * </p>
     * <p>
     * When you create an intent, you must provide a name. You can optionally provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sample utterances. For example, "I want to order a pizza" and "Can I order a pizza." You can't provide utterances
     * for built-in intents.
     * </p>
     * </li>
     * <li>
     * <p>
     * Information to be gathered. You specify slots for the information that you bot requests from the user. You can
     * specify standard slot types, such as date and time, or custom slot types for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * How the intent is fulfilled. You can provide a Lambda function or configure the intent to return the intent
     * information to your client application. If you use a Lambda function, Amazon Lex invokes the function when all of
     * the intent information is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * A confirmation prompt to send to the user to confirm an intent. For example, "Shall I order your pizza?"
     * </p>
     * </li>
     * <li>
     * <p>
     * A conclusion statement to send to the user after the intent is fulfilled. For example, "I ordered your pizza."
     * </p>
     * </li>
     * <li>
     * <p>
     * A follow-up prompt that asks the user for additional activity. For example,
     * "Do you want a drink with your pizza?"
     * </p>
     * </li>
     * </ul>
     * 
     * @param createIntentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIntent operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.CreateIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateIntent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIntentResult> createIntentAsync(CreateIntentRequest createIntentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIntentRequest, CreateIntentResult> asyncHandler);

    /**
     * <p>
     * Creates a new resource policy with the specified policy statements.
     * </p>
     * 
     * @param createResourcePolicyRequest
     * @return A Java Future containing the result of the CreateResourcePolicy operation returned by the service.
     * @sample AmazonLexModelsV2Async.CreateResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourcePolicyResult> createResourcePolicyAsync(CreateResourcePolicyRequest createResourcePolicyRequest);

    /**
     * <p>
     * Creates a new resource policy with the specified policy statements.
     * </p>
     * 
     * @param createResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResourcePolicy operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.CreateResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourcePolicyResult> createResourcePolicyAsync(CreateResourcePolicyRequest createResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResourcePolicyRequest, CreateResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Adds a new resource policy statement to a bot or bot alias. If a resource policy exists, the statement is added
     * to the current resource policy. If a policy doesn't exist, a new policy is created.
     * </p>
     * <p>
     * You can't create a resource policy statement that allows cross-account access.
     * </p>
     * 
     * @param createResourcePolicyStatementRequest
     * @return A Java Future containing the result of the CreateResourcePolicyStatement operation returned by the
     *         service.
     * @sample AmazonLexModelsV2Async.CreateResourcePolicyStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateResourcePolicyStatement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourcePolicyStatementResult> createResourcePolicyStatementAsync(
            CreateResourcePolicyStatementRequest createResourcePolicyStatementRequest);

    /**
     * <p>
     * Adds a new resource policy statement to a bot or bot alias. If a resource policy exists, the statement is added
     * to the current resource policy. If a policy doesn't exist, a new policy is created.
     * </p>
     * <p>
     * You can't create a resource policy statement that allows cross-account access.
     * </p>
     * 
     * @param createResourcePolicyStatementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResourcePolicyStatement operation returned by the
     *         service.
     * @sample AmazonLexModelsV2AsyncHandler.CreateResourcePolicyStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateResourcePolicyStatement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourcePolicyStatementResult> createResourcePolicyStatementAsync(
            CreateResourcePolicyStatementRequest createResourcePolicyStatementRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResourcePolicyStatementRequest, CreateResourcePolicyStatementResult> asyncHandler);

    /**
     * <p>
     * Creates a slot in an intent. A slot is a variable needed to fulfill an intent. For example, an
     * <code>OrderPizza</code> intent might need slots for size, crust, and number of pizzas. For each slot, you define
     * one or more utterances that Amazon Lex uses to elicit a response from the user.
     * </p>
     * 
     * @param createSlotRequest
     * @return A Java Future containing the result of the CreateSlot operation returned by the service.
     * @sample AmazonLexModelsV2Async.CreateSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateSlot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSlotResult> createSlotAsync(CreateSlotRequest createSlotRequest);

    /**
     * <p>
     * Creates a slot in an intent. A slot is a variable needed to fulfill an intent. For example, an
     * <code>OrderPizza</code> intent might need slots for size, crust, and number of pizzas. For each slot, you define
     * one or more utterances that Amazon Lex uses to elicit a response from the user.
     * </p>
     * 
     * @param createSlotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSlot operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.CreateSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateSlot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSlotResult> createSlotAsync(CreateSlotRequest createSlotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSlotRequest, CreateSlotResult> asyncHandler);

    /**
     * <p>
     * Creates a custom slot type
     * </p>
     * <p>
     * To create a custom slot type, specify a name for the slot type and a set of enumeration values, the values that a
     * slot of this type can assume.
     * </p>
     * 
     * @param createSlotTypeRequest
     * @return A Java Future containing the result of the CreateSlotType operation returned by the service.
     * @sample AmazonLexModelsV2Async.CreateSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateSlotType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSlotTypeResult> createSlotTypeAsync(CreateSlotTypeRequest createSlotTypeRequest);

    /**
     * <p>
     * Creates a custom slot type
     * </p>
     * <p>
     * To create a custom slot type, specify a name for the slot type and a set of enumeration values, the values that a
     * slot of this type can assume.
     * </p>
     * 
     * @param createSlotTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSlotType operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.CreateSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateSlotType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSlotTypeResult> createSlotTypeAsync(CreateSlotTypeRequest createSlotTypeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSlotTypeRequest, CreateSlotTypeResult> asyncHandler);

    /**
     * <p>
     * Gets a pre-signed S3 write URL that you use to upload the zip archive when importing a bot or a bot locale.
     * </p>
     * 
     * @param createUploadUrlRequest
     * @return A Java Future containing the result of the CreateUploadUrl operation returned by the service.
     * @sample AmazonLexModelsV2Async.CreateUploadUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateUploadUrl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateUploadUrlResult> createUploadUrlAsync(CreateUploadUrlRequest createUploadUrlRequest);

    /**
     * <p>
     * Gets a pre-signed S3 write URL that you use to upload the zip archive when importing a bot or a bot locale.
     * </p>
     * 
     * @param createUploadUrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUploadUrl operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.CreateUploadUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateUploadUrl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateUploadUrlResult> createUploadUrlAsync(CreateUploadUrlRequest createUploadUrlRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUploadUrlRequest, CreateUploadUrlResult> asyncHandler);

    /**
     * <p>
     * Deletes all versions of a bot, including the <code>Draft</code> version. To delete a specific version, use the
     * <code>DeleteBotVersion</code> operation.
     * </p>
     * <p>
     * When you delete a bot, all of the resources contained in the bot are also deleted. Deleting a bot removes all
     * locales, intents, slot, and slot types defined for the bot.
     * </p>
     * <p>
     * If a bot has an alias, the <code>DeleteBot</code> operation returns a <code>ResourceInUseException</code>
     * exception. If you want to delete the bot and the alias, set the <code>skipResourceInUseCheck</code> parameter to
     * <code>true</code>.
     * </p>
     * 
     * @param deleteBotRequest
     * @return A Java Future containing the result of the DeleteBot operation returned by the service.
     * @sample AmazonLexModelsV2Async.DeleteBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotResult> deleteBotAsync(DeleteBotRequest deleteBotRequest);

    /**
     * <p>
     * Deletes all versions of a bot, including the <code>Draft</code> version. To delete a specific version, use the
     * <code>DeleteBotVersion</code> operation.
     * </p>
     * <p>
     * When you delete a bot, all of the resources contained in the bot are also deleted. Deleting a bot removes all
     * locales, intents, slot, and slot types defined for the bot.
     * </p>
     * <p>
     * If a bot has an alias, the <code>DeleteBot</code> operation returns a <code>ResourceInUseException</code>
     * exception. If you want to delete the bot and the alias, set the <code>skipResourceInUseCheck</code> parameter to
     * <code>true</code>.
     * </p>
     * 
     * @param deleteBotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBot operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DeleteBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotResult> deleteBotAsync(DeleteBotRequest deleteBotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBotRequest, DeleteBotResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified bot alias.
     * </p>
     * 
     * @param deleteBotAliasRequest
     * @return A Java Future containing the result of the DeleteBotAlias operation returned by the service.
     * @sample AmazonLexModelsV2Async.DeleteBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotAliasResult> deleteBotAliasAsync(DeleteBotAliasRequest deleteBotAliasRequest);

    /**
     * <p>
     * Deletes the specified bot alias.
     * </p>
     * 
     * @param deleteBotAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBotAlias operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DeleteBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotAliasResult> deleteBotAliasAsync(DeleteBotAliasRequest deleteBotAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBotAliasRequest, DeleteBotAliasResult> asyncHandler);

    /**
     * <p>
     * Removes a locale from a bot.
     * </p>
     * <p>
     * When you delete a locale, all intents, slots, and slot types defined for the locale are also deleted.
     * </p>
     * 
     * @param deleteBotLocaleRequest
     * @return A Java Future containing the result of the DeleteBotLocale operation returned by the service.
     * @sample AmazonLexModelsV2Async.DeleteBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotLocaleResult> deleteBotLocaleAsync(DeleteBotLocaleRequest deleteBotLocaleRequest);

    /**
     * <p>
     * Removes a locale from a bot.
     * </p>
     * <p>
     * When you delete a locale, all intents, slots, and slot types defined for the locale are also deleted.
     * </p>
     * 
     * @param deleteBotLocaleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBotLocale operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DeleteBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotLocaleResult> deleteBotLocaleAsync(DeleteBotLocaleRequest deleteBotLocaleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBotLocaleRequest, DeleteBotLocaleResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific version of a bot. To delete all version of a bot, use the <a>DeleteBot</a> operation.
     * </p>
     * 
     * @param deleteBotVersionRequest
     * @return A Java Future containing the result of the DeleteBotVersion operation returned by the service.
     * @sample AmazonLexModelsV2Async.DeleteBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotVersionResult> deleteBotVersionAsync(DeleteBotVersionRequest deleteBotVersionRequest);

    /**
     * <p>
     * Deletes a specific version of a bot. To delete all version of a bot, use the <a>DeleteBot</a> operation.
     * </p>
     * 
     * @param deleteBotVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBotVersion operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DeleteBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotVersionResult> deleteBotVersionAsync(DeleteBotVersionRequest deleteBotVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBotVersionRequest, DeleteBotVersionResult> asyncHandler);

    /**
     * <p>
     * Removes a previous export and the associated files stored in an S3 bucket.
     * </p>
     * 
     * @param deleteExportRequest
     * @return A Java Future containing the result of the DeleteExport operation returned by the service.
     * @sample AmazonLexModelsV2Async.DeleteExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteExport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteExportResult> deleteExportAsync(DeleteExportRequest deleteExportRequest);

    /**
     * <p>
     * Removes a previous export and the associated files stored in an S3 bucket.
     * </p>
     * 
     * @param deleteExportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteExport operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DeleteExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteExport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteExportResult> deleteExportAsync(DeleteExportRequest deleteExportRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteExportRequest, DeleteExportResult> asyncHandler);

    /**
     * <p>
     * Removes a previous import and the associated file stored in an S3 bucket.
     * </p>
     * 
     * @param deleteImportRequest
     * @return A Java Future containing the result of the DeleteImport operation returned by the service.
     * @sample AmazonLexModelsV2Async.DeleteImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteImportResult> deleteImportAsync(DeleteImportRequest deleteImportRequest);

    /**
     * <p>
     * Removes a previous import and the associated file stored in an S3 bucket.
     * </p>
     * 
     * @param deleteImportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteImport operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DeleteImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteImportResult> deleteImportAsync(DeleteImportRequest deleteImportRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteImportRequest, DeleteImportResult> asyncHandler);

    /**
     * <p>
     * Removes the specified intent.
     * </p>
     * <p>
     * Deleting an intent also deletes the slots associated with the intent.
     * </p>
     * 
     * @param deleteIntentRequest
     * @return A Java Future containing the result of the DeleteIntent operation returned by the service.
     * @sample AmazonLexModelsV2Async.DeleteIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteIntent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIntentResult> deleteIntentAsync(DeleteIntentRequest deleteIntentRequest);

    /**
     * <p>
     * Removes the specified intent.
     * </p>
     * <p>
     * Deleting an intent also deletes the slots associated with the intent.
     * </p>
     * 
     * @param deleteIntentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIntent operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DeleteIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteIntent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIntentResult> deleteIntentAsync(DeleteIntentRequest deleteIntentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIntentRequest, DeleteIntentResult> asyncHandler);

    /**
     * <p>
     * Removes an existing policy from a bot or bot alias. If the resource doesn't have a policy attached, Amazon Lex
     * returns an exception.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AmazonLexModelsV2Async.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Removes an existing policy from a bot or bot alias. If the resource doesn't have a policy attached, Amazon Lex
     * returns an exception.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes a policy statement from a resource policy. If you delete the last statement from a policy, the policy is
     * deleted. If you specify a statement ID that doesn't exist in the policy, or if the bot or bot alias doesn't have
     * a policy attached, Amazon Lex returns an exception.
     * </p>
     * 
     * @param deleteResourcePolicyStatementRequest
     * @return A Java Future containing the result of the DeleteResourcePolicyStatement operation returned by the
     *         service.
     * @sample AmazonLexModelsV2Async.DeleteResourcePolicyStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteResourcePolicyStatement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyStatementResult> deleteResourcePolicyStatementAsync(
            DeleteResourcePolicyStatementRequest deleteResourcePolicyStatementRequest);

    /**
     * <p>
     * Deletes a policy statement from a resource policy. If you delete the last statement from a policy, the policy is
     * deleted. If you specify a statement ID that doesn't exist in the policy, or if the bot or bot alias doesn't have
     * a policy attached, Amazon Lex returns an exception.
     * </p>
     * 
     * @param deleteResourcePolicyStatementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourcePolicyStatement operation returned by the
     *         service.
     * @sample AmazonLexModelsV2AsyncHandler.DeleteResourcePolicyStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteResourcePolicyStatement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyStatementResult> deleteResourcePolicyStatementAsync(
            DeleteResourcePolicyStatementRequest deleteResourcePolicyStatementRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyStatementRequest, DeleteResourcePolicyStatementResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified slot from an intent.
     * </p>
     * 
     * @param deleteSlotRequest
     * @return A Java Future containing the result of the DeleteSlot operation returned by the service.
     * @sample AmazonLexModelsV2Async.DeleteSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteSlot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlotResult> deleteSlotAsync(DeleteSlotRequest deleteSlotRequest);

    /**
     * <p>
     * Deletes the specified slot from an intent.
     * </p>
     * 
     * @param deleteSlotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSlot operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DeleteSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteSlot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlotResult> deleteSlotAsync(DeleteSlotRequest deleteSlotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSlotRequest, DeleteSlotResult> asyncHandler);

    /**
     * <p>
     * Deletes a slot type from a bot locale.
     * </p>
     * <p>
     * If a slot is using the slot type, Amazon Lex throws a <code>ResourceInUseException</code> exception. To avoid the
     * exception, set the <code>skipResourceInUseCheck</code> parameter to <code>true</code>.
     * </p>
     * 
     * @param deleteSlotTypeRequest
     * @return A Java Future containing the result of the DeleteSlotType operation returned by the service.
     * @sample AmazonLexModelsV2Async.DeleteSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteSlotType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlotTypeResult> deleteSlotTypeAsync(DeleteSlotTypeRequest deleteSlotTypeRequest);

    /**
     * <p>
     * Deletes a slot type from a bot locale.
     * </p>
     * <p>
     * If a slot is using the slot type, Amazon Lex throws a <code>ResourceInUseException</code> exception. To avoid the
     * exception, set the <code>skipResourceInUseCheck</code> parameter to <code>true</code>.
     * </p>
     * 
     * @param deleteSlotTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSlotType operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DeleteSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteSlotType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlotTypeResult> deleteSlotTypeAsync(DeleteSlotTypeRequest deleteSlotTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSlotTypeRequest, DeleteSlotTypeResult> asyncHandler);

    /**
     * <p>
     * Provides metadata information about a bot.
     * </p>
     * 
     * @param describeBotRequest
     * @return A Java Future containing the result of the DescribeBot operation returned by the service.
     * @sample AmazonLexModelsV2Async.DescribeBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBotResult> describeBotAsync(DescribeBotRequest describeBotRequest);

    /**
     * <p>
     * Provides metadata information about a bot.
     * </p>
     * 
     * @param describeBotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBot operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBotResult> describeBotAsync(DescribeBotRequest describeBotRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBotRequest, DescribeBotResult> asyncHandler);

    /**
     * <p>
     * Get information about a specific bot alias.
     * </p>
     * 
     * @param describeBotAliasRequest
     * @return A Java Future containing the result of the DescribeBotAlias operation returned by the service.
     * @sample AmazonLexModelsV2Async.DescribeBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBotAliasResult> describeBotAliasAsync(DescribeBotAliasRequest describeBotAliasRequest);

    /**
     * <p>
     * Get information about a specific bot alias.
     * </p>
     * 
     * @param describeBotAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBotAlias operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBotAliasResult> describeBotAliasAsync(DescribeBotAliasRequest describeBotAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBotAliasRequest, DescribeBotAliasResult> asyncHandler);

    /**
     * <p>
     * Describes the settings that a bot has for a specific locale.
     * </p>
     * 
     * @param describeBotLocaleRequest
     * @return A Java Future containing the result of the DescribeBotLocale operation returned by the service.
     * @sample AmazonLexModelsV2Async.DescribeBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotLocale"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBotLocaleResult> describeBotLocaleAsync(DescribeBotLocaleRequest describeBotLocaleRequest);

    /**
     * <p>
     * Describes the settings that a bot has for a specific locale.
     * </p>
     * 
     * @param describeBotLocaleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBotLocale operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotLocale"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBotLocaleResult> describeBotLocaleAsync(DescribeBotLocaleRequest describeBotLocaleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBotLocaleRequest, DescribeBotLocaleResult> asyncHandler);

    /**
     * <p>
     * Provides metadata about a version of a bot.
     * </p>
     * 
     * @param describeBotVersionRequest
     * @return A Java Future containing the result of the DescribeBotVersion operation returned by the service.
     * @sample AmazonLexModelsV2Async.DescribeBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBotVersionResult> describeBotVersionAsync(DescribeBotVersionRequest describeBotVersionRequest);

    /**
     * <p>
     * Provides metadata about a version of a bot.
     * </p>
     * 
     * @param describeBotVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBotVersion operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBotVersionResult> describeBotVersionAsync(DescribeBotVersionRequest describeBotVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBotVersionRequest, DescribeBotVersionResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specific export.
     * </p>
     * 
     * @param describeExportRequest
     * @return A Java Future containing the result of the DescribeExport operation returned by the service.
     * @sample AmazonLexModelsV2Async.DescribeExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeExport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeExportResult> describeExportAsync(DescribeExportRequest describeExportRequest);

    /**
     * <p>
     * Gets information about a specific export.
     * </p>
     * 
     * @param describeExportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExport operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeExport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeExportResult> describeExportAsync(DescribeExportRequest describeExportRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExportRequest, DescribeExportResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specific import.
     * </p>
     * 
     * @param describeImportRequest
     * @return A Java Future containing the result of the DescribeImport operation returned by the service.
     * @sample AmazonLexModelsV2Async.DescribeImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeImport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImportResult> describeImportAsync(DescribeImportRequest describeImportRequest);

    /**
     * <p>
     * Gets information about a specific import.
     * </p>
     * 
     * @param describeImportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImport operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeImport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImportResult> describeImportAsync(DescribeImportRequest describeImportRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImportRequest, DescribeImportResult> asyncHandler);

    /**
     * <p>
     * Returns metadata about an intent.
     * </p>
     * 
     * @param describeIntentRequest
     * @return A Java Future containing the result of the DescribeIntent operation returned by the service.
     * @sample AmazonLexModelsV2Async.DescribeIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeIntent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIntentResult> describeIntentAsync(DescribeIntentRequest describeIntentRequest);

    /**
     * <p>
     * Returns metadata about an intent.
     * </p>
     * 
     * @param describeIntentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIntent operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeIntent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIntentResult> describeIntentAsync(DescribeIntentRequest describeIntentRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIntentRequest, DescribeIntentResult> asyncHandler);

    /**
     * <p>
     * Gets the resource policy and policy revision for a bot or bot alias.
     * </p>
     * 
     * @param describeResourcePolicyRequest
     * @return A Java Future containing the result of the DescribeResourcePolicy operation returned by the service.
     * @sample AmazonLexModelsV2Async.DescribeResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourcePolicyResult> describeResourcePolicyAsync(DescribeResourcePolicyRequest describeResourcePolicyRequest);

    /**
     * <p>
     * Gets the resource policy and policy revision for a bot or bot alias.
     * </p>
     * 
     * @param describeResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeResourcePolicy operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourcePolicyResult> describeResourcePolicyAsync(DescribeResourcePolicyRequest describeResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeResourcePolicyRequest, DescribeResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Gets metadata information about a slot.
     * </p>
     * 
     * @param describeSlotRequest
     * @return A Java Future containing the result of the DescribeSlot operation returned by the service.
     * @sample AmazonLexModelsV2Async.DescribeSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeSlot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSlotResult> describeSlotAsync(DescribeSlotRequest describeSlotRequest);

    /**
     * <p>
     * Gets metadata information about a slot.
     * </p>
     * 
     * @param describeSlotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSlot operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeSlot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSlotResult> describeSlotAsync(DescribeSlotRequest describeSlotRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSlotRequest, DescribeSlotResult> asyncHandler);

    /**
     * <p>
     * Gets metadata information about a slot type.
     * </p>
     * 
     * @param describeSlotTypeRequest
     * @return A Java Future containing the result of the DescribeSlotType operation returned by the service.
     * @sample AmazonLexModelsV2Async.DescribeSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeSlotType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSlotTypeResult> describeSlotTypeAsync(DescribeSlotTypeRequest describeSlotTypeRequest);

    /**
     * <p>
     * Gets metadata information about a slot type.
     * </p>
     * 
     * @param describeSlotTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSlotType operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeSlotType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSlotTypeResult> describeSlotTypeAsync(DescribeSlotTypeRequest describeSlotTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSlotTypeRequest, DescribeSlotTypeResult> asyncHandler);

    /**
     * <p>
     * Gets a list of aliases for the specified bot.
     * </p>
     * 
     * @param listBotAliasesRequest
     * @return A Java Future containing the result of the ListBotAliases operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListBotAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBotAliasesResult> listBotAliasesAsync(ListBotAliasesRequest listBotAliasesRequest);

    /**
     * <p>
     * Gets a list of aliases for the specified bot.
     * </p>
     * 
     * @param listBotAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBotAliases operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListBotAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBotAliasesResult> listBotAliasesAsync(ListBotAliasesRequest listBotAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListBotAliasesRequest, ListBotAliasesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of locales for the specified bot.
     * </p>
     * 
     * @param listBotLocalesRequest
     * @return A Java Future containing the result of the ListBotLocales operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListBotLocales
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotLocales" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBotLocalesResult> listBotLocalesAsync(ListBotLocalesRequest listBotLocalesRequest);

    /**
     * <p>
     * Gets a list of locales for the specified bot.
     * </p>
     * 
     * @param listBotLocalesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBotLocales operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListBotLocales
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotLocales" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBotLocalesResult> listBotLocalesAsync(ListBotLocalesRequest listBotLocalesRequest,
            com.amazonaws.handlers.AsyncHandler<ListBotLocalesRequest, ListBotLocalesResult> asyncHandler);

    /**
     * <p>
     * Gets information about all of the versions of a bot.
     * </p>
     * <p>
     * The <code>ListBotVersions</code> operation returns a summary of each version of a bot. For example, if a bot has
     * three numbered versions, the <code>ListBotVersions</code> operation returns for summaries, one for each numbered
     * version and one for the <code>DRAFT</code> version.
     * </p>
     * <p>
     * The <code>ListBotVersions</code> operation always returns at least one version, the <code>DRAFT</code> version.
     * </p>
     * 
     * @param listBotVersionsRequest
     * @return A Java Future containing the result of the ListBotVersions operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListBotVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBotVersionsResult> listBotVersionsAsync(ListBotVersionsRequest listBotVersionsRequest);

    /**
     * <p>
     * Gets information about all of the versions of a bot.
     * </p>
     * <p>
     * The <code>ListBotVersions</code> operation returns a summary of each version of a bot. For example, if a bot has
     * three numbered versions, the <code>ListBotVersions</code> operation returns for summaries, one for each numbered
     * version and one for the <code>DRAFT</code> version.
     * </p>
     * <p>
     * The <code>ListBotVersions</code> operation always returns at least one version, the <code>DRAFT</code> version.
     * </p>
     * 
     * @param listBotVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBotVersions operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListBotVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBotVersionsResult> listBotVersionsAsync(ListBotVersionsRequest listBotVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBotVersionsRequest, ListBotVersionsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of available bots.
     * </p>
     * 
     * @param listBotsRequest
     * @return A Java Future containing the result of the ListBots operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBotsResult> listBotsAsync(ListBotsRequest listBotsRequest);

    /**
     * <p>
     * Gets a list of available bots.
     * </p>
     * 
     * @param listBotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBots operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBotsResult> listBotsAsync(ListBotsRequest listBotsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBotsRequest, ListBotsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of built-in intents provided by Amazon Lex that you can use in your bot.
     * </p>
     * <p>
     * To use a built-in intent as a the base for your own intent, include the built-in intent signature in the
     * <code>parentIntentSignature</code> parameter when you call the <code>CreateIntent</code> operation. For more
     * information, see <a>CreateIntent</a>.
     * </p>
     * 
     * @param listBuiltInIntentsRequest
     * @return A Java Future containing the result of the ListBuiltInIntents operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListBuiltInIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBuiltInIntents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBuiltInIntentsResult> listBuiltInIntentsAsync(ListBuiltInIntentsRequest listBuiltInIntentsRequest);

    /**
     * <p>
     * Gets a list of built-in intents provided by Amazon Lex that you can use in your bot.
     * </p>
     * <p>
     * To use a built-in intent as a the base for your own intent, include the built-in intent signature in the
     * <code>parentIntentSignature</code> parameter when you call the <code>CreateIntent</code> operation. For more
     * information, see <a>CreateIntent</a>.
     * </p>
     * 
     * @param listBuiltInIntentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBuiltInIntents operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListBuiltInIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBuiltInIntents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBuiltInIntentsResult> listBuiltInIntentsAsync(ListBuiltInIntentsRequest listBuiltInIntentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBuiltInIntentsRequest, ListBuiltInIntentsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of built-in slot types that meet the specified criteria.
     * </p>
     * 
     * @param listBuiltInSlotTypesRequest
     * @return A Java Future containing the result of the ListBuiltInSlotTypes operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListBuiltInSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBuiltInSlotTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBuiltInSlotTypesResult> listBuiltInSlotTypesAsync(ListBuiltInSlotTypesRequest listBuiltInSlotTypesRequest);

    /**
     * <p>
     * Gets a list of built-in slot types that meet the specified criteria.
     * </p>
     * 
     * @param listBuiltInSlotTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBuiltInSlotTypes operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListBuiltInSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBuiltInSlotTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBuiltInSlotTypesResult> listBuiltInSlotTypesAsync(ListBuiltInSlotTypesRequest listBuiltInSlotTypesRequest,
            com.amazonaws.handlers.AsyncHandler<ListBuiltInSlotTypesRequest, ListBuiltInSlotTypesResult> asyncHandler);

    /**
     * <p>
     * Lists the exports for a bot or bot locale. Exports are kept in the list for 7 days.
     * </p>
     * 
     * @param listExportsRequest
     * @return A Java Future containing the result of the ListExports operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListExports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExportsResult> listExportsAsync(ListExportsRequest listExportsRequest);

    /**
     * <p>
     * Lists the exports for a bot or bot locale. Exports are kept in the list for 7 days.
     * </p>
     * 
     * @param listExportsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExports operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListExports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExportsResult> listExportsAsync(ListExportsRequest listExportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExportsRequest, ListExportsResult> asyncHandler);

    /**
     * <p>
     * Lists the imports for a bot or bot locale. Imports are kept in the list for 7 days.
     * </p>
     * 
     * @param listImportsRequest
     * @return A Java Future containing the result of the ListImports operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListImports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListImports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListImportsResult> listImportsAsync(ListImportsRequest listImportsRequest);

    /**
     * <p>
     * Lists the imports for a bot or bot locale. Imports are kept in the list for 7 days.
     * </p>
     * 
     * @param listImportsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListImports operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListImports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListImports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListImportsResult> listImportsAsync(ListImportsRequest listImportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListImportsRequest, ListImportsResult> asyncHandler);

    /**
     * <p>
     * Get a list of intents that meet the specified criteria.
     * </p>
     * 
     * @param listIntentsRequest
     * @return A Java Future containing the result of the ListIntents operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIntentsResult> listIntentsAsync(ListIntentsRequest listIntentsRequest);

    /**
     * <p>
     * Get a list of intents that meet the specified criteria.
     * </p>
     * 
     * @param listIntentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIntents operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIntentsResult> listIntentsAsync(ListIntentsRequest listIntentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIntentsRequest, ListIntentsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of slot types that match the specified criteria.
     * </p>
     * 
     * @param listSlotTypesRequest
     * @return A Java Future containing the result of the ListSlotTypes operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListSlotTypes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSlotTypesResult> listSlotTypesAsync(ListSlotTypesRequest listSlotTypesRequest);

    /**
     * <p>
     * Gets a list of slot types that match the specified criteria.
     * </p>
     * 
     * @param listSlotTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSlotTypes operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListSlotTypes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSlotTypesResult> listSlotTypesAsync(ListSlotTypesRequest listSlotTypesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSlotTypesRequest, ListSlotTypesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of slots that match the specified criteria.
     * </p>
     * 
     * @param listSlotsRequest
     * @return A Java Future containing the result of the ListSlots operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListSlots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListSlots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSlotsResult> listSlotsAsync(ListSlotsRequest listSlotsRequest);

    /**
     * <p>
     * Gets a list of slots that match the specified criteria.
     * </p>
     * 
     * @param listSlotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSlots operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListSlots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListSlots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSlotsResult> listSlotsAsync(ListSlotsRequest listSlotsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSlotsRequest, ListSlotsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of tags associated with a resource. Only bots, bot aliases, and bot channels can have tags associated
     * with them.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets a list of tags associated with a resource. Only bots, bot aliases, and bot channels can have tags associated
     * with them.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts importing a bot or bot locale from a zip archive that you uploaded to an S3 bucket.
     * </p>
     * 
     * @param startImportRequest
     * @return A Java Future containing the result of the StartImport operation returned by the service.
     * @sample AmazonLexModelsV2Async.StartImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartImportResult> startImportAsync(StartImportRequest startImportRequest);

    /**
     * <p>
     * Starts importing a bot or bot locale from a zip archive that you uploaded to an S3 bucket.
     * </p>
     * 
     * @param startImportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartImport operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.StartImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartImportResult> startImportAsync(StartImportRequest startImportRequest,
            com.amazonaws.handlers.AsyncHandler<StartImportRequest, StartImportResult> asyncHandler);

    /**
     * <p>
     * Adds the specified tags to the specified resource. If a tag key already exists, the existing value is replaced
     * with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonLexModelsV2Async.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource. If a tag key already exists, the existing value is replaced
     * with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a bot, bot alias, or bot channel.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonLexModelsV2Async.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a bot, bot alias, or bot channel.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of an existing bot.
     * </p>
     * 
     * @param updateBotRequest
     * @return A Java Future containing the result of the UpdateBot operation returned by the service.
     * @sample AmazonLexModelsV2Async.UpdateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBotResult> updateBotAsync(UpdateBotRequest updateBotRequest);

    /**
     * <p>
     * Updates the configuration of an existing bot.
     * </p>
     * 
     * @param updateBotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBot operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.UpdateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBotResult> updateBotAsync(UpdateBotRequest updateBotRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBotRequest, UpdateBotResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of an existing bot alias.
     * </p>
     * 
     * @param updateBotAliasRequest
     * @return A Java Future containing the result of the UpdateBotAlias operation returned by the service.
     * @sample AmazonLexModelsV2Async.UpdateBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBotAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBotAliasResult> updateBotAliasAsync(UpdateBotAliasRequest updateBotAliasRequest);

    /**
     * <p>
     * Updates the configuration of an existing bot alias.
     * </p>
     * 
     * @param updateBotAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBotAlias operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.UpdateBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBotAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBotAliasResult> updateBotAliasAsync(UpdateBotAliasRequest updateBotAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBotAliasRequest, UpdateBotAliasResult> asyncHandler);

    /**
     * <p>
     * Updates the settings that a bot has for a specific locale.
     * </p>
     * 
     * @param updateBotLocaleRequest
     * @return A Java Future containing the result of the UpdateBotLocale operation returned by the service.
     * @sample AmazonLexModelsV2Async.UpdateBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBotLocaleResult> updateBotLocaleAsync(UpdateBotLocaleRequest updateBotLocaleRequest);

    /**
     * <p>
     * Updates the settings that a bot has for a specific locale.
     * </p>
     * 
     * @param updateBotLocaleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBotLocale operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.UpdateBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBotLocaleResult> updateBotLocaleAsync(UpdateBotLocaleRequest updateBotLocaleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBotLocaleRequest, UpdateBotLocaleResult> asyncHandler);

    /**
     * <p>
     * Updates the password used to protect an export zip archive.
     * </p>
     * <p>
     * The password is not required. If you don't supply a password, Amazon Lex generates a zip file that is not
     * protected by a password. This is the archive that is available at the pre-signed S3 URL provided by the
     * operation.
     * </p>
     * 
     * @param updateExportRequest
     * @return A Java Future containing the result of the UpdateExport operation returned by the service.
     * @sample AmazonLexModelsV2Async.UpdateExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateExport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateExportResult> updateExportAsync(UpdateExportRequest updateExportRequest);

    /**
     * <p>
     * Updates the password used to protect an export zip archive.
     * </p>
     * <p>
     * The password is not required. If you don't supply a password, Amazon Lex generates a zip file that is not
     * protected by a password. This is the archive that is available at the pre-signed S3 URL provided by the
     * operation.
     * </p>
     * 
     * @param updateExportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateExport operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.UpdateExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateExport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateExportResult> updateExportAsync(UpdateExportRequest updateExportRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateExportRequest, UpdateExportResult> asyncHandler);

    /**
     * <p>
     * Updates the settings for an intent.
     * </p>
     * 
     * @param updateIntentRequest
     * @return A Java Future containing the result of the UpdateIntent operation returned by the service.
     * @sample AmazonLexModelsV2Async.UpdateIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateIntent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIntentResult> updateIntentAsync(UpdateIntentRequest updateIntentRequest);

    /**
     * <p>
     * Updates the settings for an intent.
     * </p>
     * 
     * @param updateIntentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIntent operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.UpdateIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateIntent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIntentResult> updateIntentAsync(UpdateIntentRequest updateIntentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIntentRequest, UpdateIntentResult> asyncHandler);

    /**
     * <p>
     * Replaces the existing resource policy for a bot or bot alias with a new one. If the policy doesn't exist, Amazon
     * Lex returns an exception.
     * </p>
     * 
     * @param updateResourcePolicyRequest
     * @return A Java Future containing the result of the UpdateResourcePolicy operation returned by the service.
     * @sample AmazonLexModelsV2Async.UpdateResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourcePolicyResult> updateResourcePolicyAsync(UpdateResourcePolicyRequest updateResourcePolicyRequest);

    /**
     * <p>
     * Replaces the existing resource policy for a bot or bot alias with a new one. If the policy doesn't exist, Amazon
     * Lex returns an exception.
     * </p>
     * 
     * @param updateResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResourcePolicy operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.UpdateResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourcePolicyResult> updateResourcePolicyAsync(UpdateResourcePolicyRequest updateResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourcePolicyRequest, UpdateResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Updates the settings for a slot.
     * </p>
     * 
     * @param updateSlotRequest
     * @return A Java Future containing the result of the UpdateSlot operation returned by the service.
     * @sample AmazonLexModelsV2Async.UpdateSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateSlot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSlotResult> updateSlotAsync(UpdateSlotRequest updateSlotRequest);

    /**
     * <p>
     * Updates the settings for a slot.
     * </p>
     * 
     * @param updateSlotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSlot operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.UpdateSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateSlot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSlotResult> updateSlotAsync(UpdateSlotRequest updateSlotRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSlotRequest, UpdateSlotResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of an existing slot type.
     * </p>
     * 
     * @param updateSlotTypeRequest
     * @return A Java Future containing the result of the UpdateSlotType operation returned by the service.
     * @sample AmazonLexModelsV2Async.UpdateSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateSlotType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSlotTypeResult> updateSlotTypeAsync(UpdateSlotTypeRequest updateSlotTypeRequest);

    /**
     * <p>
     * Updates the configuration of an existing slot type.
     * </p>
     * 
     * @param updateSlotTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSlotType operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.UpdateSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateSlotType" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSlotTypeResult> updateSlotTypeAsync(UpdateSlotTypeRequest updateSlotTypeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSlotTypeRequest, UpdateSlotTypeResult> asyncHandler);

}
