/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Create a batch of custom vocabulary items for a given bot locale's custom vocabulary.
     * </p>
     * 
     * @param batchCreateCustomVocabularyItemRequest
     * @return A Java Future containing the result of the BatchCreateCustomVocabularyItem operation returned by the
     *         service.
     * @sample AmazonLexModelsV2Async.BatchCreateCustomVocabularyItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BatchCreateCustomVocabularyItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateCustomVocabularyItemResult> batchCreateCustomVocabularyItemAsync(
            BatchCreateCustomVocabularyItemRequest batchCreateCustomVocabularyItemRequest);

    /**
     * <p>
     * Create a batch of custom vocabulary items for a given bot locale's custom vocabulary.
     * </p>
     * 
     * @param batchCreateCustomVocabularyItemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchCreateCustomVocabularyItem operation returned by the
     *         service.
     * @sample AmazonLexModelsV2AsyncHandler.BatchCreateCustomVocabularyItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BatchCreateCustomVocabularyItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateCustomVocabularyItemResult> batchCreateCustomVocabularyItemAsync(
            BatchCreateCustomVocabularyItemRequest batchCreateCustomVocabularyItemRequest,
            com.amazonaws.handlers.AsyncHandler<BatchCreateCustomVocabularyItemRequest, BatchCreateCustomVocabularyItemResult> asyncHandler);

    /**
     * <p>
     * Delete a batch of custom vocabulary items for a given bot locale's custom vocabulary.
     * </p>
     * 
     * @param batchDeleteCustomVocabularyItemRequest
     * @return A Java Future containing the result of the BatchDeleteCustomVocabularyItem operation returned by the
     *         service.
     * @sample AmazonLexModelsV2Async.BatchDeleteCustomVocabularyItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BatchDeleteCustomVocabularyItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteCustomVocabularyItemResult> batchDeleteCustomVocabularyItemAsync(
            BatchDeleteCustomVocabularyItemRequest batchDeleteCustomVocabularyItemRequest);

    /**
     * <p>
     * Delete a batch of custom vocabulary items for a given bot locale's custom vocabulary.
     * </p>
     * 
     * @param batchDeleteCustomVocabularyItemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteCustomVocabularyItem operation returned by the
     *         service.
     * @sample AmazonLexModelsV2AsyncHandler.BatchDeleteCustomVocabularyItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BatchDeleteCustomVocabularyItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteCustomVocabularyItemResult> batchDeleteCustomVocabularyItemAsync(
            BatchDeleteCustomVocabularyItemRequest batchDeleteCustomVocabularyItemRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteCustomVocabularyItemRequest, BatchDeleteCustomVocabularyItemResult> asyncHandler);

    /**
     * <p>
     * Update a batch of custom vocabulary items for a given bot locale's custom vocabulary.
     * </p>
     * 
     * @param batchUpdateCustomVocabularyItemRequest
     * @return A Java Future containing the result of the BatchUpdateCustomVocabularyItem operation returned by the
     *         service.
     * @sample AmazonLexModelsV2Async.BatchUpdateCustomVocabularyItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BatchUpdateCustomVocabularyItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateCustomVocabularyItemResult> batchUpdateCustomVocabularyItemAsync(
            BatchUpdateCustomVocabularyItemRequest batchUpdateCustomVocabularyItemRequest);

    /**
     * <p>
     * Update a batch of custom vocabulary items for a given bot locale's custom vocabulary.
     * </p>
     * 
     * @param batchUpdateCustomVocabularyItemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdateCustomVocabularyItem operation returned by the
     *         service.
     * @sample AmazonLexModelsV2AsyncHandler.BatchUpdateCustomVocabularyItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BatchUpdateCustomVocabularyItem"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateCustomVocabularyItemResult> batchUpdateCustomVocabularyItemAsync(
            BatchUpdateCustomVocabularyItemRequest batchUpdateCustomVocabularyItemRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateCustomVocabularyItemRequest, BatchUpdateCustomVocabularyItemResult> asyncHandler);

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
     * Action to create a replication of the source bot in the secondary region.
     * </p>
     * 
     * @param createBotReplicaRequest
     * @return A Java Future containing the result of the CreateBotReplica operation returned by the service.
     * @sample AmazonLexModelsV2Async.CreateBotReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotReplica" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBotReplicaResult> createBotReplicaAsync(CreateBotReplicaRequest createBotReplicaRequest);

    /**
     * <p>
     * Action to create a replication of the source bot in the secondary region.
     * </p>
     * 
     * @param createBotReplicaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBotReplica operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.CreateBotReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotReplica" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBotReplicaResult> createBotReplicaAsync(CreateBotReplicaRequest createBotReplicaRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBotReplicaRequest, CreateBotReplicaResult> asyncHandler);

    /**
     * <p>
     * Creates an immutable version of the bot. When you create the first version of a bot, Amazon Lex sets the version
     * number to 1. Subsequent bot versions increase in an increment of 1. The version number will always represent the
     * total number of versions created of the bot, not the current number of versions. If a bot version is deleted,
     * that bot version number will not be reused.
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
     * Creates an immutable version of the bot. When you create the first version of a bot, Amazon Lex sets the version
     * number to 1. Subsequent bot versions increase in an increment of 1. The version number will always represent the
     * total number of versions created of the bot, not the current number of versions. If a bot version is deleted,
     * that bot version number will not be reused.
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
     * Create a report that describes the differences between the bot and the test set.
     * </p>
     * 
     * @param createTestSetDiscrepancyReportRequest
     * @return A Java Future containing the result of the CreateTestSetDiscrepancyReport operation returned by the
     *         service.
     * @sample AmazonLexModelsV2Async.CreateTestSetDiscrepancyReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateTestSetDiscrepancyReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTestSetDiscrepancyReportResult> createTestSetDiscrepancyReportAsync(
            CreateTestSetDiscrepancyReportRequest createTestSetDiscrepancyReportRequest);

    /**
     * <p>
     * Create a report that describes the differences between the bot and the test set.
     * </p>
     * 
     * @param createTestSetDiscrepancyReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTestSetDiscrepancyReport operation returned by the
     *         service.
     * @sample AmazonLexModelsV2AsyncHandler.CreateTestSetDiscrepancyReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateTestSetDiscrepancyReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTestSetDiscrepancyReportResult> createTestSetDiscrepancyReportAsync(
            CreateTestSetDiscrepancyReportRequest createTestSetDiscrepancyReportRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTestSetDiscrepancyReportRequest, CreateTestSetDiscrepancyReportResult> asyncHandler);

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
     * The action to delete the replicated bot in the secondary region.
     * </p>
     * 
     * @param deleteBotReplicaRequest
     * @return A Java Future containing the result of the DeleteBotReplica operation returned by the service.
     * @sample AmazonLexModelsV2Async.DeleteBotReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotReplica" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotReplicaResult> deleteBotReplicaAsync(DeleteBotReplicaRequest deleteBotReplicaRequest);

    /**
     * <p>
     * The action to delete the replicated bot in the secondary region.
     * </p>
     * 
     * @param deleteBotReplicaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBotReplica operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DeleteBotReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotReplica" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotReplicaResult> deleteBotReplicaAsync(DeleteBotReplicaRequest deleteBotReplicaRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBotReplicaRequest, DeleteBotReplicaResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific version of a bot. To delete all versions of a bot, use the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_DeleteBot.html">DeleteBot</a> operation.
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
     * Deletes a specific version of a bot. To delete all versions of a bot, use the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_DeleteBot.html">DeleteBot</a> operation.
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
     * Removes a custom vocabulary from the specified locale in the specified bot.
     * </p>
     * 
     * @param deleteCustomVocabularyRequest
     * @return A Java Future containing the result of the DeleteCustomVocabulary operation returned by the service.
     * @sample AmazonLexModelsV2Async.DeleteCustomVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteCustomVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomVocabularyResult> deleteCustomVocabularyAsync(DeleteCustomVocabularyRequest deleteCustomVocabularyRequest);

    /**
     * <p>
     * Removes a custom vocabulary from the specified locale in the specified bot.
     * </p>
     * 
     * @param deleteCustomVocabularyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCustomVocabulary operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DeleteCustomVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteCustomVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomVocabularyResult> deleteCustomVocabularyAsync(DeleteCustomVocabularyRequest deleteCustomVocabularyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomVocabularyRequest, DeleteCustomVocabularyResult> asyncHandler);

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
     * The action to delete the selected test set.
     * </p>
     * 
     * @param deleteTestSetRequest
     * @return A Java Future containing the result of the DeleteTestSet operation returned by the service.
     * @sample AmazonLexModelsV2Async.DeleteTestSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteTestSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTestSetResult> deleteTestSetAsync(DeleteTestSetRequest deleteTestSetRequest);

    /**
     * <p>
     * The action to delete the selected test set.
     * </p>
     * 
     * @param deleteTestSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTestSet operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DeleteTestSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteTestSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTestSetResult> deleteTestSetAsync(DeleteTestSetRequest deleteTestSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTestSetRequest, DeleteTestSetResult> asyncHandler);

    /**
     * <p>
     * Deletes stored utterances.
     * </p>
     * <p>
     * Amazon Lex stores the utterances that users send to your bot. Utterances are stored for 15 days for use with the
     * <a href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_ListAggregatedUtterances.html">
     * ListAggregatedUtterances</a> operation, and then stored indefinitely for use in improving the ability of your bot
     * to respond to user input..
     * </p>
     * <p>
     * Use the <code>DeleteUtterances</code> operation to manually delete utterances for a specific session. When you
     * use the <code>DeleteUtterances</code> operation, utterances stored for improving your bot's ability to respond to
     * user input are deleted immediately. Utterances stored for use with the <code>ListAggregatedUtterances</code>
     * operation are deleted after 15 days.
     * </p>
     * 
     * @param deleteUtterancesRequest
     * @return A Java Future containing the result of the DeleteUtterances operation returned by the service.
     * @sample AmazonLexModelsV2Async.DeleteUtterances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteUtterances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUtterancesResult> deleteUtterancesAsync(DeleteUtterancesRequest deleteUtterancesRequest);

    /**
     * <p>
     * Deletes stored utterances.
     * </p>
     * <p>
     * Amazon Lex stores the utterances that users send to your bot. Utterances are stored for 15 days for use with the
     * <a href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_ListAggregatedUtterances.html">
     * ListAggregatedUtterances</a> operation, and then stored indefinitely for use in improving the ability of your bot
     * to respond to user input..
     * </p>
     * <p>
     * Use the <code>DeleteUtterances</code> operation to manually delete utterances for a specific session. When you
     * use the <code>DeleteUtterances</code> operation, utterances stored for improving your bot's ability to respond to
     * user input are deleted immediately. Utterances stored for use with the <code>ListAggregatedUtterances</code>
     * operation are deleted after 15 days.
     * </p>
     * 
     * @param deleteUtterancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUtterances operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DeleteUtterances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteUtterances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUtterancesResult> deleteUtterancesAsync(DeleteUtterancesRequest deleteUtterancesRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUtterancesRequest, DeleteUtterancesResult> asyncHandler);

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
     * Provides metadata information about a bot recommendation. This information will enable you to get a description
     * on the request inputs, to download associated transcripts after processing is complete, and to download intents
     * and slot-types generated by the bot recommendation.
     * </p>
     * 
     * @param describeBotRecommendationRequest
     * @return A Java Future containing the result of the DescribeBotRecommendation operation returned by the service.
     * @sample AmazonLexModelsV2Async.DescribeBotRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBotRecommendationResult> describeBotRecommendationAsync(
            DescribeBotRecommendationRequest describeBotRecommendationRequest);

    /**
     * <p>
     * Provides metadata information about a bot recommendation. This information will enable you to get a description
     * on the request inputs, to download associated transcripts after processing is complete, and to download intents
     * and slot-types generated by the bot recommendation.
     * </p>
     * 
     * @param describeBotRecommendationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBotRecommendation operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeBotRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBotRecommendationResult> describeBotRecommendationAsync(
            DescribeBotRecommendationRequest describeBotRecommendationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBotRecommendationRequest, DescribeBotRecommendationResult> asyncHandler);

    /**
     * <p>
     * Monitors the bot replication status through the UI console.
     * </p>
     * 
     * @param describeBotReplicaRequest
     * @return A Java Future containing the result of the DescribeBotReplica operation returned by the service.
     * @sample AmazonLexModelsV2Async.DescribeBotReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotReplica"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBotReplicaResult> describeBotReplicaAsync(DescribeBotReplicaRequest describeBotReplicaRequest);

    /**
     * <p>
     * Monitors the bot replication status through the UI console.
     * </p>
     * 
     * @param describeBotReplicaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBotReplica operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeBotReplica
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotReplica"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBotReplicaResult> describeBotReplicaAsync(DescribeBotReplicaRequest describeBotReplicaRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBotReplicaRequest, DescribeBotReplicaResult> asyncHandler);

    /**
     * <p>
     * Returns information about a request to generate a bot through natural language description, made through the
     * <code>StartBotResource</code> API. Use the <code>generatedBotLocaleUrl</code> to retrieve the Amazon S3 object
     * containing the bot locale configuration. You can then modify and import this configuration.
     * </p>
     * 
     * @param describeBotResourceGenerationRequest
     * @return A Java Future containing the result of the DescribeBotResourceGeneration operation returned by the
     *         service.
     * @sample AmazonLexModelsV2Async.DescribeBotResourceGeneration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotResourceGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBotResourceGenerationResult> describeBotResourceGenerationAsync(
            DescribeBotResourceGenerationRequest describeBotResourceGenerationRequest);

    /**
     * <p>
     * Returns information about a request to generate a bot through natural language description, made through the
     * <code>StartBotResource</code> API. Use the <code>generatedBotLocaleUrl</code> to retrieve the Amazon S3 object
     * containing the bot locale configuration. You can then modify and import this configuration.
     * </p>
     * 
     * @param describeBotResourceGenerationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBotResourceGeneration operation returned by the
     *         service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeBotResourceGeneration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotResourceGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBotResourceGenerationResult> describeBotResourceGenerationAsync(
            DescribeBotResourceGenerationRequest describeBotResourceGenerationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBotResourceGenerationRequest, DescribeBotResourceGenerationResult> asyncHandler);

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
     * Provides metadata information about a custom vocabulary.
     * </p>
     * 
     * @param describeCustomVocabularyMetadataRequest
     * @return A Java Future containing the result of the DescribeCustomVocabularyMetadata operation returned by the
     *         service.
     * @sample AmazonLexModelsV2Async.DescribeCustomVocabularyMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeCustomVocabularyMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomVocabularyMetadataResult> describeCustomVocabularyMetadataAsync(
            DescribeCustomVocabularyMetadataRequest describeCustomVocabularyMetadataRequest);

    /**
     * <p>
     * Provides metadata information about a custom vocabulary.
     * </p>
     * 
     * @param describeCustomVocabularyMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCustomVocabularyMetadata operation returned by the
     *         service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeCustomVocabularyMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeCustomVocabularyMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomVocabularyMetadataResult> describeCustomVocabularyMetadataAsync(
            DescribeCustomVocabularyMetadataRequest describeCustomVocabularyMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCustomVocabularyMetadataRequest, DescribeCustomVocabularyMetadataResult> asyncHandler);

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
     * Gets metadata information about the test execution.
     * </p>
     * 
     * @param describeTestExecutionRequest
     * @return A Java Future containing the result of the DescribeTestExecution operation returned by the service.
     * @sample AmazonLexModelsV2Async.DescribeTestExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeTestExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTestExecutionResult> describeTestExecutionAsync(DescribeTestExecutionRequest describeTestExecutionRequest);

    /**
     * <p>
     * Gets metadata information about the test execution.
     * </p>
     * 
     * @param describeTestExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTestExecution operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeTestExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeTestExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTestExecutionResult> describeTestExecutionAsync(DescribeTestExecutionRequest describeTestExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTestExecutionRequest, DescribeTestExecutionResult> asyncHandler);

    /**
     * <p>
     * Gets metadata information about the test set.
     * </p>
     * 
     * @param describeTestSetRequest
     * @return A Java Future containing the result of the DescribeTestSet operation returned by the service.
     * @sample AmazonLexModelsV2Async.DescribeTestSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeTestSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTestSetResult> describeTestSetAsync(DescribeTestSetRequest describeTestSetRequest);

    /**
     * <p>
     * Gets metadata information about the test set.
     * </p>
     * 
     * @param describeTestSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTestSet operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeTestSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeTestSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTestSetResult> describeTestSetAsync(DescribeTestSetRequest describeTestSetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTestSetRequest, DescribeTestSetResult> asyncHandler);

    /**
     * <p>
     * Gets metadata information about the test set discrepancy report.
     * </p>
     * 
     * @param describeTestSetDiscrepancyReportRequest
     * @return A Java Future containing the result of the DescribeTestSetDiscrepancyReport operation returned by the
     *         service.
     * @sample AmazonLexModelsV2Async.DescribeTestSetDiscrepancyReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeTestSetDiscrepancyReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTestSetDiscrepancyReportResult> describeTestSetDiscrepancyReportAsync(
            DescribeTestSetDiscrepancyReportRequest describeTestSetDiscrepancyReportRequest);

    /**
     * <p>
     * Gets metadata information about the test set discrepancy report.
     * </p>
     * 
     * @param describeTestSetDiscrepancyReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTestSetDiscrepancyReport operation returned by the
     *         service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeTestSetDiscrepancyReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeTestSetDiscrepancyReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTestSetDiscrepancyReportResult> describeTestSetDiscrepancyReportAsync(
            DescribeTestSetDiscrepancyReportRequest describeTestSetDiscrepancyReportRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTestSetDiscrepancyReportRequest, DescribeTestSetDiscrepancyReportResult> asyncHandler);

    /**
     * <p>
     * Gets metadata information about the test set generation.
     * </p>
     * 
     * @param describeTestSetGenerationRequest
     * @return A Java Future containing the result of the DescribeTestSetGeneration operation returned by the service.
     * @sample AmazonLexModelsV2Async.DescribeTestSetGeneration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeTestSetGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTestSetGenerationResult> describeTestSetGenerationAsync(
            DescribeTestSetGenerationRequest describeTestSetGenerationRequest);

    /**
     * <p>
     * Gets metadata information about the test set generation.
     * </p>
     * 
     * @param describeTestSetGenerationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTestSetGeneration operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.DescribeTestSetGeneration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeTestSetGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTestSetGenerationResult> describeTestSetGenerationAsync(
            DescribeTestSetGenerationRequest describeTestSetGenerationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTestSetGenerationRequest, DescribeTestSetGenerationResult> asyncHandler);

    /**
     * <p>
     * Generates sample utterances for an intent.
     * </p>
     * 
     * @param generateBotElementRequest
     * @return A Java Future containing the result of the GenerateBotElement operation returned by the service.
     * @sample AmazonLexModelsV2Async.GenerateBotElement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/GenerateBotElement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GenerateBotElementResult> generateBotElementAsync(GenerateBotElementRequest generateBotElementRequest);

    /**
     * <p>
     * Generates sample utterances for an intent.
     * </p>
     * 
     * @param generateBotElementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GenerateBotElement operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.GenerateBotElement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/GenerateBotElement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GenerateBotElementResult> generateBotElementAsync(GenerateBotElementRequest generateBotElementRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateBotElementRequest, GenerateBotElementResult> asyncHandler);

    /**
     * <p>
     * The pre-signed Amazon S3 URL to download the test execution result artifacts.
     * </p>
     * 
     * @param getTestExecutionArtifactsUrlRequest
     * @return A Java Future containing the result of the GetTestExecutionArtifactsUrl operation returned by the
     *         service.
     * @sample AmazonLexModelsV2Async.GetTestExecutionArtifactsUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/GetTestExecutionArtifactsUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTestExecutionArtifactsUrlResult> getTestExecutionArtifactsUrlAsync(
            GetTestExecutionArtifactsUrlRequest getTestExecutionArtifactsUrlRequest);

    /**
     * <p>
     * The pre-signed Amazon S3 URL to download the test execution result artifacts.
     * </p>
     * 
     * @param getTestExecutionArtifactsUrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTestExecutionArtifactsUrl operation returned by the
     *         service.
     * @sample AmazonLexModelsV2AsyncHandler.GetTestExecutionArtifactsUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/GetTestExecutionArtifactsUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTestExecutionArtifactsUrlResult> getTestExecutionArtifactsUrlAsync(
            GetTestExecutionArtifactsUrlRequest getTestExecutionArtifactsUrlRequest,
            com.amazonaws.handlers.AsyncHandler<GetTestExecutionArtifactsUrlRequest, GetTestExecutionArtifactsUrlResult> asyncHandler);

    /**
     * <p>
     * Provides a list of utterances that users have sent to the bot.
     * </p>
     * <p>
     * Utterances are aggregated by the text of the utterance. For example, all instances where customers used the
     * phrase "I want to order pizza" are aggregated into the same line in the response.
     * </p>
     * <p>
     * You can see both detected utterances and missed utterances. A detected utterance is where the bot properly
     * recognized the utterance and activated the associated intent. A missed utterance was not recognized by the bot
     * and didn't activate an intent.
     * </p>
     * <p>
     * Utterances can be aggregated for a bot alias or for a bot version, but not both at the same time.
     * </p>
     * <p>
     * Utterances statistics are not generated under the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>childDirected</code> field was set to true when the bot was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * You are using slot obfuscation with one or more slots.
     * </p>
     * </li>
     * <li>
     * <p>
     * You opted out of participating in improving Amazon Lex.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAggregatedUtterancesRequest
     * @return A Java Future containing the result of the ListAggregatedUtterances operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListAggregatedUtterances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListAggregatedUtterances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAggregatedUtterancesResult> listAggregatedUtterancesAsync(ListAggregatedUtterancesRequest listAggregatedUtterancesRequest);

    /**
     * <p>
     * Provides a list of utterances that users have sent to the bot.
     * </p>
     * <p>
     * Utterances are aggregated by the text of the utterance. For example, all instances where customers used the
     * phrase "I want to order pizza" are aggregated into the same line in the response.
     * </p>
     * <p>
     * You can see both detected utterances and missed utterances. A detected utterance is where the bot properly
     * recognized the utterance and activated the associated intent. A missed utterance was not recognized by the bot
     * and didn't activate an intent.
     * </p>
     * <p>
     * Utterances can be aggregated for a bot alias or for a bot version, but not both at the same time.
     * </p>
     * <p>
     * Utterances statistics are not generated under the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>childDirected</code> field was set to true when the bot was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * You are using slot obfuscation with one or more slots.
     * </p>
     * </li>
     * <li>
     * <p>
     * You opted out of participating in improving Amazon Lex.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAggregatedUtterancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAggregatedUtterances operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListAggregatedUtterances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListAggregatedUtterances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAggregatedUtterancesResult> listAggregatedUtterancesAsync(ListAggregatedUtterancesRequest listAggregatedUtterancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAggregatedUtterancesRequest, ListAggregatedUtterancesResult> asyncHandler);

    /**
     * <p>
     * The action to list the replicated bots created from the source bot alias.
     * </p>
     * 
     * @param listBotAliasReplicasRequest
     * @return A Java Future containing the result of the ListBotAliasReplicas operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListBotAliasReplicas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotAliasReplicas"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBotAliasReplicasResult> listBotAliasReplicasAsync(ListBotAliasReplicasRequest listBotAliasReplicasRequest);

    /**
     * <p>
     * The action to list the replicated bots created from the source bot alias.
     * </p>
     * 
     * @param listBotAliasReplicasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBotAliasReplicas operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListBotAliasReplicas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotAliasReplicas"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBotAliasReplicasResult> listBotAliasReplicasAsync(ListBotAliasReplicasRequest listBotAliasReplicasRequest,
            com.amazonaws.handlers.AsyncHandler<ListBotAliasReplicasRequest, ListBotAliasReplicasResult> asyncHandler);

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
     * Get a list of bot recommendations that meet the specified criteria.
     * </p>
     * 
     * @param listBotRecommendationsRequest
     * @return A Java Future containing the result of the ListBotRecommendations operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListBotRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBotRecommendationsResult> listBotRecommendationsAsync(ListBotRecommendationsRequest listBotRecommendationsRequest);

    /**
     * <p>
     * Get a list of bot recommendations that meet the specified criteria.
     * </p>
     * 
     * @param listBotRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBotRecommendations operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListBotRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBotRecommendationsResult> listBotRecommendationsAsync(ListBotRecommendationsRequest listBotRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBotRecommendationsRequest, ListBotRecommendationsResult> asyncHandler);

    /**
     * <p>
     * The action to list the replicated bots.
     * </p>
     * 
     * @param listBotReplicasRequest
     * @return A Java Future containing the result of the ListBotReplicas operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListBotReplicas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotReplicas" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBotReplicasResult> listBotReplicasAsync(ListBotReplicasRequest listBotReplicasRequest);

    /**
     * <p>
     * The action to list the replicated bots.
     * </p>
     * 
     * @param listBotReplicasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBotReplicas operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListBotReplicas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotReplicas" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBotReplicasResult> listBotReplicasAsync(ListBotReplicasRequest listBotReplicasRequest,
            com.amazonaws.handlers.AsyncHandler<ListBotReplicasRequest, ListBotReplicasResult> asyncHandler);

    /**
     * <p>
     * Lists the generation requests made for a bot locale.
     * </p>
     * 
     * @param listBotResourceGenerationsRequest
     * @return A Java Future containing the result of the ListBotResourceGenerations operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListBotResourceGenerations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotResourceGenerations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBotResourceGenerationsResult> listBotResourceGenerationsAsync(
            ListBotResourceGenerationsRequest listBotResourceGenerationsRequest);

    /**
     * <p>
     * Lists the generation requests made for a bot locale.
     * </p>
     * 
     * @param listBotResourceGenerationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBotResourceGenerations operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListBotResourceGenerations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotResourceGenerations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBotResourceGenerationsResult> listBotResourceGenerationsAsync(
            ListBotResourceGenerationsRequest listBotResourceGenerationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBotResourceGenerationsRequest, ListBotResourceGenerationsResult> asyncHandler);

    /**
     * <p>
     * Contains information about all the versions replication statuses applicable for Global Resiliency.
     * </p>
     * 
     * @param listBotVersionReplicasRequest
     * @return A Java Future containing the result of the ListBotVersionReplicas operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListBotVersionReplicas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotVersionReplicas"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBotVersionReplicasResult> listBotVersionReplicasAsync(ListBotVersionReplicasRequest listBotVersionReplicasRequest);

    /**
     * <p>
     * Contains information about all the versions replication statuses applicable for Global Resiliency.
     * </p>
     * 
     * @param listBotVersionReplicasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBotVersionReplicas operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListBotVersionReplicas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotVersionReplicas"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBotVersionReplicasResult> listBotVersionReplicasAsync(ListBotVersionReplicasRequest listBotVersionReplicasRequest,
            com.amazonaws.handlers.AsyncHandler<ListBotVersionReplicasRequest, ListBotVersionReplicasResult> asyncHandler);

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
     * information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_CreateIntent.html">CreateIntent</a>.
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
     * information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_CreateIntent.html">CreateIntent</a>.
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
     * Paginated list of custom vocabulary items for a given bot locale's custom vocabulary.
     * </p>
     * 
     * @param listCustomVocabularyItemsRequest
     * @return A Java Future containing the result of the ListCustomVocabularyItems operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListCustomVocabularyItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListCustomVocabularyItems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomVocabularyItemsResult> listCustomVocabularyItemsAsync(
            ListCustomVocabularyItemsRequest listCustomVocabularyItemsRequest);

    /**
     * <p>
     * Paginated list of custom vocabulary items for a given bot locale's custom vocabulary.
     * </p>
     * 
     * @param listCustomVocabularyItemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCustomVocabularyItems operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListCustomVocabularyItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListCustomVocabularyItems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomVocabularyItemsResult> listCustomVocabularyItemsAsync(
            ListCustomVocabularyItemsRequest listCustomVocabularyItemsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCustomVocabularyItemsRequest, ListCustomVocabularyItemsResult> asyncHandler);

    /**
     * <p>
     * Lists the exports for a bot, bot locale, or custom vocabulary. Exports are kept in the list for 7 days.
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
     * Lists the exports for a bot, bot locale, or custom vocabulary. Exports are kept in the list for 7 days.
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
     * Lists the imports for a bot, bot locale, or custom vocabulary. Imports are kept in the list for 7 days.
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
     * Lists the imports for a bot, bot locale, or custom vocabulary. Imports are kept in the list for 7 days.
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
     * Retrieves summary metrics for the intents in your bot. The following fields are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>metrics</code> – A list of <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_AnalyticsIntentMetric.html"
     * >AnalyticsIntentMetric</a> objects. In each object, use the <code>name</code> field to specify the metric to
     * calculate, the <code>statistic</code> field to specify whether to calculate the <code>Sum</code>,
     * <code>Average</code>, or <code>Max</code> number, and the <code>order</code> field to specify whether to sort the
     * results in <code>Ascending</code> or <code>Descending</code> order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>startDateTime</code> and <code>endDateTime</code> – Define a time range for which you want to retrieve
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Of the optional fields, you can organize the results in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>filters</code> field to filter the results, the <code>groupBy</code> field to specify categories by
     * which to group the results, and the <code>binBy</code> field to specify time intervals by which to group the
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>maxResults</code> field to limit the number of results to return in a single response and the
     * <code>nextToken</code> field to return the next batch of results if the response does not return the full set of
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that an <code>order</code> field exists in both <code>binBy</code> and <code>metrics</code>. You can specify
     * only one <code>order</code> in a given request.
     * </p>
     * 
     * @param listIntentMetricsRequest
     * @return A Java Future containing the result of the ListIntentMetrics operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListIntentMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntentMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIntentMetricsResult> listIntentMetricsAsync(ListIntentMetricsRequest listIntentMetricsRequest);

    /**
     * <p>
     * Retrieves summary metrics for the intents in your bot. The following fields are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>metrics</code> – A list of <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_AnalyticsIntentMetric.html"
     * >AnalyticsIntentMetric</a> objects. In each object, use the <code>name</code> field to specify the metric to
     * calculate, the <code>statistic</code> field to specify whether to calculate the <code>Sum</code>,
     * <code>Average</code>, or <code>Max</code> number, and the <code>order</code> field to specify whether to sort the
     * results in <code>Ascending</code> or <code>Descending</code> order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>startDateTime</code> and <code>endDateTime</code> – Define a time range for which you want to retrieve
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Of the optional fields, you can organize the results in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>filters</code> field to filter the results, the <code>groupBy</code> field to specify categories by
     * which to group the results, and the <code>binBy</code> field to specify time intervals by which to group the
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>maxResults</code> field to limit the number of results to return in a single response and the
     * <code>nextToken</code> field to return the next batch of results if the response does not return the full set of
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that an <code>order</code> field exists in both <code>binBy</code> and <code>metrics</code>. You can specify
     * only one <code>order</code> in a given request.
     * </p>
     * 
     * @param listIntentMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIntentMetrics operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListIntentMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntentMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIntentMetricsResult> listIntentMetricsAsync(ListIntentMetricsRequest listIntentMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIntentMetricsRequest, ListIntentMetricsResult> asyncHandler);

    /**
     * <p>
     * Retrieves summary statistics for a path of intents that users take over sessions with your bot. The following
     * fields are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>startDateTime</code> and <code>endDateTime</code> – Define a time range for which you want to retrieve
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>intentPath</code> – Define an order of intents for which you want to retrieve metrics. Separate intents in
     * the path with a forward slash. For example, populate the <code>intentPath</code> field with
     * <code>/BookCar/BookHotel</code> to see details about how many times users invoked the <code>BookCar</code> and
     * <code>BookHotel</code> intents in that order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the optional <code>filters</code> field to filter the results.
     * </p>
     * 
     * @param listIntentPathsRequest
     * @return A Java Future containing the result of the ListIntentPaths operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListIntentPaths
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntentPaths" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListIntentPathsResult> listIntentPathsAsync(ListIntentPathsRequest listIntentPathsRequest);

    /**
     * <p>
     * Retrieves summary statistics for a path of intents that users take over sessions with your bot. The following
     * fields are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>startDateTime</code> and <code>endDateTime</code> – Define a time range for which you want to retrieve
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>intentPath</code> – Define an order of intents for which you want to retrieve metrics. Separate intents in
     * the path with a forward slash. For example, populate the <code>intentPath</code> field with
     * <code>/BookCar/BookHotel</code> to see details about how many times users invoked the <code>BookCar</code> and
     * <code>BookHotel</code> intents in that order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the optional <code>filters</code> field to filter the results.
     * </p>
     * 
     * @param listIntentPathsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIntentPaths operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListIntentPaths
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntentPaths" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListIntentPathsResult> listIntentPathsAsync(ListIntentPathsRequest listIntentPathsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIntentPathsRequest, ListIntentPathsResult> asyncHandler);

    /**
     * <p>
     * Retrieves summary metrics for the stages within intents in your bot. The following fields are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>metrics</code> – A list of <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_AnalyticsIntentStageMetric.html"
     * >AnalyticsIntentStageMetric</a> objects. In each object, use the <code>name</code> field to specify the metric to
     * calculate, the <code>statistic</code> field to specify whether to calculate the <code>Sum</code>,
     * <code>Average</code>, or <code>Max</code> number, and the <code>order</code> field to specify whether to sort the
     * results in <code>Ascending</code> or <code>Descending</code> order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>startDateTime</code> and <code>endDateTime</code> – Define a time range for which you want to retrieve
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Of the optional fields, you can organize the results in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>filters</code> field to filter the results, the <code>groupBy</code> field to specify categories by
     * which to group the results, and the <code>binBy</code> field to specify time intervals by which to group the
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>maxResults</code> field to limit the number of results to return in a single response and the
     * <code>nextToken</code> field to return the next batch of results if the response does not return the full set of
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that an <code>order</code> field exists in both <code>binBy</code> and <code>metrics</code>. You can only
     * specify one <code>order</code> in a given request.
     * </p>
     * 
     * @param listIntentStageMetricsRequest
     * @return A Java Future containing the result of the ListIntentStageMetrics operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListIntentStageMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntentStageMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIntentStageMetricsResult> listIntentStageMetricsAsync(ListIntentStageMetricsRequest listIntentStageMetricsRequest);

    /**
     * <p>
     * Retrieves summary metrics for the stages within intents in your bot. The following fields are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>metrics</code> – A list of <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_AnalyticsIntentStageMetric.html"
     * >AnalyticsIntentStageMetric</a> objects. In each object, use the <code>name</code> field to specify the metric to
     * calculate, the <code>statistic</code> field to specify whether to calculate the <code>Sum</code>,
     * <code>Average</code>, or <code>Max</code> number, and the <code>order</code> field to specify whether to sort the
     * results in <code>Ascending</code> or <code>Descending</code> order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>startDateTime</code> and <code>endDateTime</code> – Define a time range for which you want to retrieve
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Of the optional fields, you can organize the results in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>filters</code> field to filter the results, the <code>groupBy</code> field to specify categories by
     * which to group the results, and the <code>binBy</code> field to specify time intervals by which to group the
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>maxResults</code> field to limit the number of results to return in a single response and the
     * <code>nextToken</code> field to return the next batch of results if the response does not return the full set of
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that an <code>order</code> field exists in both <code>binBy</code> and <code>metrics</code>. You can only
     * specify one <code>order</code> in a given request.
     * </p>
     * 
     * @param listIntentStageMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIntentStageMetrics operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListIntentStageMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntentStageMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIntentStageMetricsResult> listIntentStageMetricsAsync(ListIntentStageMetricsRequest listIntentStageMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIntentStageMetricsRequest, ListIntentStageMetricsResult> asyncHandler);

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
     * Gets a list of recommended intents provided by the bot recommendation that you can use in your bot. Intents in
     * the response are ordered by relevance.
     * </p>
     * 
     * @param listRecommendedIntentsRequest
     * @return A Java Future containing the result of the ListRecommendedIntents operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListRecommendedIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListRecommendedIntents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendedIntentsResult> listRecommendedIntentsAsync(ListRecommendedIntentsRequest listRecommendedIntentsRequest);

    /**
     * <p>
     * Gets a list of recommended intents provided by the bot recommendation that you can use in your bot. Intents in
     * the response are ordered by relevance.
     * </p>
     * 
     * @param listRecommendedIntentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecommendedIntents operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListRecommendedIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListRecommendedIntents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendedIntentsResult> listRecommendedIntentsAsync(ListRecommendedIntentsRequest listRecommendedIntentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecommendedIntentsRequest, ListRecommendedIntentsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of metadata for individual user sessions with your bot. The <code>startDateTime</code> and
     * <code>endDateTime</code> fields are required. These fields define a time range for which you want to retrieve
     * results. Of the optional fields, you can organize the results in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>filters</code> field to filter the results and the <code>sortBy</code> field to specify the values
     * by which to sort the results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>maxResults</code> field to limit the number of results to return in a single response and the
     * <code>nextToken</code> field to return the next batch of results if the response does not return the full set of
     * results.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listSessionAnalyticsDataRequest
     * @return A Java Future containing the result of the ListSessionAnalyticsData operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListSessionAnalyticsData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListSessionAnalyticsData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSessionAnalyticsDataResult> listSessionAnalyticsDataAsync(ListSessionAnalyticsDataRequest listSessionAnalyticsDataRequest);

    /**
     * <p>
     * Retrieves a list of metadata for individual user sessions with your bot. The <code>startDateTime</code> and
     * <code>endDateTime</code> fields are required. These fields define a time range for which you want to retrieve
     * results. Of the optional fields, you can organize the results in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>filters</code> field to filter the results and the <code>sortBy</code> field to specify the values
     * by which to sort the results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>maxResults</code> field to limit the number of results to return in a single response and the
     * <code>nextToken</code> field to return the next batch of results if the response does not return the full set of
     * results.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listSessionAnalyticsDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSessionAnalyticsData operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListSessionAnalyticsData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListSessionAnalyticsData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSessionAnalyticsDataResult> listSessionAnalyticsDataAsync(ListSessionAnalyticsDataRequest listSessionAnalyticsDataRequest,
            com.amazonaws.handlers.AsyncHandler<ListSessionAnalyticsDataRequest, ListSessionAnalyticsDataResult> asyncHandler);

    /**
     * <p>
     * Retrieves summary metrics for the user sessions with your bot. The following fields are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>metrics</code> – A list of <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_AnalyticsSessionMetric.html"
     * >AnalyticsSessionMetric</a> objects. In each object, use the <code>name</code> field to specify the metric to
     * calculate, the <code>statistic</code> field to specify whether to calculate the <code>Sum</code>,
     * <code>Average</code>, or <code>Max</code> number, and the <code>order</code> field to specify whether to sort the
     * results in <code>Ascending</code> or <code>Descending</code> order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>startDateTime</code> and <code>endDateTime</code> – Define a time range for which you want to retrieve
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Of the optional fields, you can organize the results in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>filters</code> field to filter the results, the <code>groupBy</code> field to specify categories by
     * which to group the results, and the <code>binBy</code> field to specify time intervals by which to group the
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>maxResults</code> field to limit the number of results to return in a single response and the
     * <code>nextToken</code> field to return the next batch of results if the response does not return the full set of
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that an <code>order</code> field exists in both <code>binBy</code> and <code>metrics</code>. Currently, you
     * can specify it in either field, but not in both.
     * </p>
     * 
     * @param listSessionMetricsRequest
     * @return A Java Future containing the result of the ListSessionMetrics operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListSessionMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListSessionMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSessionMetricsResult> listSessionMetricsAsync(ListSessionMetricsRequest listSessionMetricsRequest);

    /**
     * <p>
     * Retrieves summary metrics for the user sessions with your bot. The following fields are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>metrics</code> – A list of <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_AnalyticsSessionMetric.html"
     * >AnalyticsSessionMetric</a> objects. In each object, use the <code>name</code> field to specify the metric to
     * calculate, the <code>statistic</code> field to specify whether to calculate the <code>Sum</code>,
     * <code>Average</code>, or <code>Max</code> number, and the <code>order</code> field to specify whether to sort the
     * results in <code>Ascending</code> or <code>Descending</code> order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>startDateTime</code> and <code>endDateTime</code> – Define a time range for which you want to retrieve
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Of the optional fields, you can organize the results in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>filters</code> field to filter the results, the <code>groupBy</code> field to specify categories by
     * which to group the results, and the <code>binBy</code> field to specify time intervals by which to group the
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>maxResults</code> field to limit the number of results to return in a single response and the
     * <code>nextToken</code> field to return the next batch of results if the response does not return the full set of
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that an <code>order</code> field exists in both <code>binBy</code> and <code>metrics</code>. Currently, you
     * can specify it in either field, but not in both.
     * </p>
     * 
     * @param listSessionMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSessionMetrics operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListSessionMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListSessionMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSessionMetricsResult> listSessionMetricsAsync(ListSessionMetricsRequest listSessionMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSessionMetricsRequest, ListSessionMetricsResult> asyncHandler);

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
     * Gets a list of test execution result items.
     * </p>
     * 
     * @param listTestExecutionResultItemsRequest
     * @return A Java Future containing the result of the ListTestExecutionResultItems operation returned by the
     *         service.
     * @sample AmazonLexModelsV2Async.ListTestExecutionResultItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTestExecutionResultItems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTestExecutionResultItemsResult> listTestExecutionResultItemsAsync(
            ListTestExecutionResultItemsRequest listTestExecutionResultItemsRequest);

    /**
     * <p>
     * Gets a list of test execution result items.
     * </p>
     * 
     * @param listTestExecutionResultItemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTestExecutionResultItems operation returned by the
     *         service.
     * @sample AmazonLexModelsV2AsyncHandler.ListTestExecutionResultItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTestExecutionResultItems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTestExecutionResultItemsResult> listTestExecutionResultItemsAsync(
            ListTestExecutionResultItemsRequest listTestExecutionResultItemsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTestExecutionResultItemsRequest, ListTestExecutionResultItemsResult> asyncHandler);

    /**
     * <p>
     * The list of test set executions.
     * </p>
     * 
     * @param listTestExecutionsRequest
     * @return A Java Future containing the result of the ListTestExecutions operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListTestExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTestExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTestExecutionsResult> listTestExecutionsAsync(ListTestExecutionsRequest listTestExecutionsRequest);

    /**
     * <p>
     * The list of test set executions.
     * </p>
     * 
     * @param listTestExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTestExecutions operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListTestExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTestExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTestExecutionsResult> listTestExecutionsAsync(ListTestExecutionsRequest listTestExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTestExecutionsRequest, ListTestExecutionsResult> asyncHandler);

    /**
     * <p>
     * The list of test set records.
     * </p>
     * 
     * @param listTestSetRecordsRequest
     * @return A Java Future containing the result of the ListTestSetRecords operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListTestSetRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTestSetRecords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTestSetRecordsResult> listTestSetRecordsAsync(ListTestSetRecordsRequest listTestSetRecordsRequest);

    /**
     * <p>
     * The list of test set records.
     * </p>
     * 
     * @param listTestSetRecordsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTestSetRecords operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListTestSetRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTestSetRecords"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTestSetRecordsResult> listTestSetRecordsAsync(ListTestSetRecordsRequest listTestSetRecordsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTestSetRecordsRequest, ListTestSetRecordsResult> asyncHandler);

    /**
     * <p>
     * The list of the test sets
     * </p>
     * 
     * @param listTestSetsRequest
     * @return A Java Future containing the result of the ListTestSets operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListTestSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTestSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTestSetsResult> listTestSetsAsync(ListTestSetsRequest listTestSetsRequest);

    /**
     * <p>
     * The list of the test sets
     * </p>
     * 
     * @param listTestSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTestSets operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListTestSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTestSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTestSetsResult> listTestSetsAsync(ListTestSetsRequest listTestSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTestSetsRequest, ListTestSetsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * To use this API operation, your IAM role must have permissions to perform the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_ListAggregatedUtterances.html"
     * >ListAggregatedUtterances</a> operation, which provides access to utterance-related analytics. See <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/monitoring-utterances.html">Viewing utterance statistics</a>
     * for the IAM policy to apply to the IAM role.
     * </p>
     * </note>
     * <p>
     * Retrieves a list of metadata for individual user utterances to your bot. The following fields are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>startDateTime</code> and <code>endDateTime</code> – Define a time range for which you want to retrieve
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Of the optional fields, you can organize the results in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>filters</code> field to filter the results and the <code>sortBy</code> field to specify the values
     * by which to sort the results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>maxResults</code> field to limit the number of results to return in a single response and the
     * <code>nextToken</code> field to return the next batch of results if the response does not return the full set of
     * results.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listUtteranceAnalyticsDataRequest
     * @return A Java Future containing the result of the ListUtteranceAnalyticsData operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListUtteranceAnalyticsData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListUtteranceAnalyticsData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUtteranceAnalyticsDataResult> listUtteranceAnalyticsDataAsync(
            ListUtteranceAnalyticsDataRequest listUtteranceAnalyticsDataRequest);

    /**
     * <note>
     * <p>
     * To use this API operation, your IAM role must have permissions to perform the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_ListAggregatedUtterances.html"
     * >ListAggregatedUtterances</a> operation, which provides access to utterance-related analytics. See <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/monitoring-utterances.html">Viewing utterance statistics</a>
     * for the IAM policy to apply to the IAM role.
     * </p>
     * </note>
     * <p>
     * Retrieves a list of metadata for individual user utterances to your bot. The following fields are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>startDateTime</code> and <code>endDateTime</code> – Define a time range for which you want to retrieve
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Of the optional fields, you can organize the results in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>filters</code> field to filter the results and the <code>sortBy</code> field to specify the values
     * by which to sort the results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>maxResults</code> field to limit the number of results to return in a single response and the
     * <code>nextToken</code> field to return the next batch of results if the response does not return the full set of
     * results.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listUtteranceAnalyticsDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUtteranceAnalyticsData operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListUtteranceAnalyticsData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListUtteranceAnalyticsData"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUtteranceAnalyticsDataResult> listUtteranceAnalyticsDataAsync(
            ListUtteranceAnalyticsDataRequest listUtteranceAnalyticsDataRequest,
            com.amazonaws.handlers.AsyncHandler<ListUtteranceAnalyticsDataRequest, ListUtteranceAnalyticsDataResult> asyncHandler);

    /**
     * <note>
     * <p>
     * To use this API operation, your IAM role must have permissions to perform the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_ListAggregatedUtterances.html"
     * >ListAggregatedUtterances</a> operation, which provides access to utterance-related analytics. See <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/monitoring-utterances.html">Viewing utterance statistics</a>
     * for the IAM policy to apply to the IAM role.
     * </p>
     * </note>
     * <p>
     * Retrieves summary metrics for the utterances in your bot. The following fields are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>metrics</code> – A list of <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_AnalyticsUtteranceMetric.html"
     * >AnalyticsUtteranceMetric</a> objects. In each object, use the <code>name</code> field to specify the metric to
     * calculate, the <code>statistic</code> field to specify whether to calculate the <code>Sum</code>,
     * <code>Average</code>, or <code>Max</code> number, and the <code>order</code> field to specify whether to sort the
     * results in <code>Ascending</code> or <code>Descending</code> order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>startDateTime</code> and <code>endDateTime</code> – Define a time range for which you want to retrieve
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Of the optional fields, you can organize the results in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>filters</code> field to filter the results, the <code>groupBy</code> field to specify categories by
     * which to group the results, and the <code>binBy</code> field to specify time intervals by which to group the
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>maxResults</code> field to limit the number of results to return in a single response and the
     * <code>nextToken</code> field to return the next batch of results if the response does not return the full set of
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that an <code>order</code> field exists in both <code>binBy</code> and <code>metrics</code>. Currently, you
     * can specify it in either field, but not in both.
     * </p>
     * 
     * @param listUtteranceMetricsRequest
     * @return A Java Future containing the result of the ListUtteranceMetrics operation returned by the service.
     * @sample AmazonLexModelsV2Async.ListUtteranceMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListUtteranceMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUtteranceMetricsResult> listUtteranceMetricsAsync(ListUtteranceMetricsRequest listUtteranceMetricsRequest);

    /**
     * <note>
     * <p>
     * To use this API operation, your IAM role must have permissions to perform the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_ListAggregatedUtterances.html"
     * >ListAggregatedUtterances</a> operation, which provides access to utterance-related analytics. See <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/monitoring-utterances.html">Viewing utterance statistics</a>
     * for the IAM policy to apply to the IAM role.
     * </p>
     * </note>
     * <p>
     * Retrieves summary metrics for the utterances in your bot. The following fields are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>metrics</code> – A list of <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_AnalyticsUtteranceMetric.html"
     * >AnalyticsUtteranceMetric</a> objects. In each object, use the <code>name</code> field to specify the metric to
     * calculate, the <code>statistic</code> field to specify whether to calculate the <code>Sum</code>,
     * <code>Average</code>, or <code>Max</code> number, and the <code>order</code> field to specify whether to sort the
     * results in <code>Ascending</code> or <code>Descending</code> order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>startDateTime</code> and <code>endDateTime</code> – Define a time range for which you want to retrieve
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Of the optional fields, you can organize the results in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>filters</code> field to filter the results, the <code>groupBy</code> field to specify categories by
     * which to group the results, and the <code>binBy</code> field to specify time intervals by which to group the
     * results.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>maxResults</code> field to limit the number of results to return in a single response and the
     * <code>nextToken</code> field to return the next batch of results if the response does not return the full set of
     * results.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that an <code>order</code> field exists in both <code>binBy</code> and <code>metrics</code>. Currently, you
     * can specify it in either field, but not in both.
     * </p>
     * 
     * @param listUtteranceMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUtteranceMetrics operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.ListUtteranceMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListUtteranceMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUtteranceMetricsResult> listUtteranceMetricsAsync(ListUtteranceMetricsRequest listUtteranceMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUtteranceMetricsRequest, ListUtteranceMetricsResult> asyncHandler);

    /**
     * <p>
     * Search for associated transcripts that meet the specified criteria.
     * </p>
     * 
     * @param searchAssociatedTranscriptsRequest
     * @return A Java Future containing the result of the SearchAssociatedTranscripts operation returned by the service.
     * @sample AmazonLexModelsV2Async.SearchAssociatedTranscripts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SearchAssociatedTranscripts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchAssociatedTranscriptsResult> searchAssociatedTranscriptsAsync(
            SearchAssociatedTranscriptsRequest searchAssociatedTranscriptsRequest);

    /**
     * <p>
     * Search for associated transcripts that meet the specified criteria.
     * </p>
     * 
     * @param searchAssociatedTranscriptsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchAssociatedTranscripts operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.SearchAssociatedTranscripts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SearchAssociatedTranscripts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchAssociatedTranscriptsResult> searchAssociatedTranscriptsAsync(
            SearchAssociatedTranscriptsRequest searchAssociatedTranscriptsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchAssociatedTranscriptsRequest, SearchAssociatedTranscriptsResult> asyncHandler);

    /**
     * <p>
     * Use this to provide your transcript data, and to start the bot recommendation process.
     * </p>
     * 
     * @param startBotRecommendationRequest
     * @return A Java Future containing the result of the StartBotRecommendation operation returned by the service.
     * @sample AmazonLexModelsV2Async.StartBotRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartBotRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartBotRecommendationResult> startBotRecommendationAsync(StartBotRecommendationRequest startBotRecommendationRequest);

    /**
     * <p>
     * Use this to provide your transcript data, and to start the bot recommendation process.
     * </p>
     * 
     * @param startBotRecommendationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartBotRecommendation operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.StartBotRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartBotRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartBotRecommendationResult> startBotRecommendationAsync(StartBotRecommendationRequest startBotRecommendationRequest,
            com.amazonaws.handlers.AsyncHandler<StartBotRecommendationRequest, StartBotRecommendationResult> asyncHandler);

    /**
     * <p>
     * Starts a request for the descriptive bot builder to generate a bot locale configuration based on the prompt you
     * provide it. After you make this call, use the <code>DescribeBotResourceGeneration</code> operation to check on
     * the status of the generation and for the <code>generatedBotLocaleUrl</code> when the generation is complete. Use
     * that value to retrieve the Amazon S3 object containing the bot locale configuration. You can then modify and
     * import this configuration.
     * </p>
     * 
     * @param startBotResourceGenerationRequest
     * @return A Java Future containing the result of the StartBotResourceGeneration operation returned by the service.
     * @sample AmazonLexModelsV2Async.StartBotResourceGeneration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartBotResourceGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartBotResourceGenerationResult> startBotResourceGenerationAsync(
            StartBotResourceGenerationRequest startBotResourceGenerationRequest);

    /**
     * <p>
     * Starts a request for the descriptive bot builder to generate a bot locale configuration based on the prompt you
     * provide it. After you make this call, use the <code>DescribeBotResourceGeneration</code> operation to check on
     * the status of the generation and for the <code>generatedBotLocaleUrl</code> when the generation is complete. Use
     * that value to retrieve the Amazon S3 object containing the bot locale configuration. You can then modify and
     * import this configuration.
     * </p>
     * 
     * @param startBotResourceGenerationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartBotResourceGeneration operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.StartBotResourceGeneration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartBotResourceGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartBotResourceGenerationResult> startBotResourceGenerationAsync(
            StartBotResourceGenerationRequest startBotResourceGenerationRequest,
            com.amazonaws.handlers.AsyncHandler<StartBotResourceGenerationRequest, StartBotResourceGenerationResult> asyncHandler);

    /**
     * <p>
     * Starts importing a bot, bot locale, or custom vocabulary from a zip archive that you uploaded to an S3 bucket.
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
     * Starts importing a bot, bot locale, or custom vocabulary from a zip archive that you uploaded to an S3 bucket.
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
     * The action to start test set execution.
     * </p>
     * 
     * @param startTestExecutionRequest
     * @return A Java Future containing the result of the StartTestExecution operation returned by the service.
     * @sample AmazonLexModelsV2Async.StartTestExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartTestExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartTestExecutionResult> startTestExecutionAsync(StartTestExecutionRequest startTestExecutionRequest);

    /**
     * <p>
     * The action to start test set execution.
     * </p>
     * 
     * @param startTestExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTestExecution operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.StartTestExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartTestExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartTestExecutionResult> startTestExecutionAsync(StartTestExecutionRequest startTestExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StartTestExecutionRequest, StartTestExecutionResult> asyncHandler);

    /**
     * <p>
     * The action to start the generation of test set.
     * </p>
     * 
     * @param startTestSetGenerationRequest
     * @return A Java Future containing the result of the StartTestSetGeneration operation returned by the service.
     * @sample AmazonLexModelsV2Async.StartTestSetGeneration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartTestSetGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartTestSetGenerationResult> startTestSetGenerationAsync(StartTestSetGenerationRequest startTestSetGenerationRequest);

    /**
     * <p>
     * The action to start the generation of test set.
     * </p>
     * 
     * @param startTestSetGenerationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTestSetGeneration operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.StartTestSetGeneration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartTestSetGeneration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartTestSetGenerationResult> startTestSetGenerationAsync(StartTestSetGenerationRequest startTestSetGenerationRequest,
            com.amazonaws.handlers.AsyncHandler<StartTestSetGenerationRequest, StartTestSetGenerationResult> asyncHandler);

    /**
     * <p>
     * Stop an already running Bot Recommendation request.
     * </p>
     * 
     * @param stopBotRecommendationRequest
     * @return A Java Future containing the result of the StopBotRecommendation operation returned by the service.
     * @sample AmazonLexModelsV2Async.StopBotRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StopBotRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopBotRecommendationResult> stopBotRecommendationAsync(StopBotRecommendationRequest stopBotRecommendationRequest);

    /**
     * <p>
     * Stop an already running Bot Recommendation request.
     * </p>
     * 
     * @param stopBotRecommendationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopBotRecommendation operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.StopBotRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StopBotRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopBotRecommendationResult> stopBotRecommendationAsync(StopBotRecommendationRequest stopBotRecommendationRequest,
            com.amazonaws.handlers.AsyncHandler<StopBotRecommendationRequest, StopBotRecommendationResult> asyncHandler);

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
     * Updates an existing bot recommendation request.
     * </p>
     * 
     * @param updateBotRecommendationRequest
     * @return A Java Future containing the result of the UpdateBotRecommendation operation returned by the service.
     * @sample AmazonLexModelsV2Async.UpdateBotRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBotRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBotRecommendationResult> updateBotRecommendationAsync(UpdateBotRecommendationRequest updateBotRecommendationRequest);

    /**
     * <p>
     * Updates an existing bot recommendation request.
     * </p>
     * 
     * @param updateBotRecommendationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBotRecommendation operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.UpdateBotRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBotRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBotRecommendationResult> updateBotRecommendationAsync(UpdateBotRecommendationRequest updateBotRecommendationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBotRecommendationRequest, UpdateBotRecommendationResult> asyncHandler);

    /**
     * <p>
     * Updates the password used to protect an export zip archive.
     * </p>
     * <p>
     * The password is not required. If you don't supply a password, Amazon Lex generates a zip file that is not
     * protected by a password. This is the archive that is available at the pre-signed S3 URL provided by the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_DescribeExport.html">DescribeExport</a>
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
     * protected by a password. This is the archive that is available at the pre-signed S3 URL provided by the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_DescribeExport.html">DescribeExport</a>
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

    /**
     * <p>
     * The action to update the test set.
     * </p>
     * 
     * @param updateTestSetRequest
     * @return A Java Future containing the result of the UpdateTestSet operation returned by the service.
     * @sample AmazonLexModelsV2Async.UpdateTestSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateTestSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTestSetResult> updateTestSetAsync(UpdateTestSetRequest updateTestSetRequest);

    /**
     * <p>
     * The action to update the test set.
     * </p>
     * 
     * @param updateTestSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTestSet operation returned by the service.
     * @sample AmazonLexModelsV2AsyncHandler.UpdateTestSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateTestSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTestSetResult> updateTestSetAsync(UpdateTestSetRequest updateTestSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTestSetRequest, UpdateTestSetResult> asyncHandler);

}
