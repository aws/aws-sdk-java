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
package com.amazonaws.services.lexmodelsv2;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.services.lexmodelsv2.waiters.AmazonLexModelsV2Waiters;

/**
 * Interface for accessing Lex Models V2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lexmodelsv2.AbstractAmazonLexModelsV2} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLexModelsV2 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "models-v2-lex";

    /**
     * <p>
     * Batch create custom vocabulary item for the specified locale in the specified bot.
     * </p>
     * 
     * @param batchCreateCustomVocabularyItemRequest
     * @return Result of the BatchCreateCustomVocabularyItem operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.BatchCreateCustomVocabularyItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BatchCreateCustomVocabularyItem"
     *      target="_top">AWS API Documentation</a>
     */
    BatchCreateCustomVocabularyItemResult batchCreateCustomVocabularyItem(BatchCreateCustomVocabularyItemRequest batchCreateCustomVocabularyItemRequest);

    /**
     * <p>
     * Batch delete custom vocabulary item for the specified locale in the specified bot.
     * </p>
     * 
     * @param batchDeleteCustomVocabularyItemRequest
     * @return Result of the BatchDeleteCustomVocabularyItem operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.BatchDeleteCustomVocabularyItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BatchDeleteCustomVocabularyItem"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDeleteCustomVocabularyItemResult batchDeleteCustomVocabularyItem(BatchDeleteCustomVocabularyItemRequest batchDeleteCustomVocabularyItemRequest);

    /**
     * <p>
     * Batch update custom vocabulary item for the specified locale in the specified bot.
     * </p>
     * 
     * @param batchUpdateCustomVocabularyItemRequest
     * @return Result of the BatchUpdateCustomVocabularyItem operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.BatchUpdateCustomVocabularyItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BatchUpdateCustomVocabularyItem"
     *      target="_top">AWS API Documentation</a>
     */
    BatchUpdateCustomVocabularyItemResult batchUpdateCustomVocabularyItem(BatchUpdateCustomVocabularyItemRequest batchUpdateCustomVocabularyItemRequest);

    /**
     * <p>
     * Builds a bot, its intents, and its slot types into a specific locale. A bot can be built into multiple locales.
     * At runtime the locale is used to choose a specific build of the bot.
     * </p>
     * 
     * @param buildBotLocaleRequest
     * @return Result of the BuildBotLocale operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.BuildBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BuildBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    BuildBotLocaleResult buildBotLocale(BuildBotLocaleRequest buildBotLocaleRequest);

    /**
     * <p>
     * Creates an Amazon Lex conversational bot.
     * </p>
     * 
     * @param createBotRequest
     * @return Result of the CreateBot operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.CreateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBot" target="_top">AWS API
     *      Documentation</a>
     */
    CreateBotResult createBot(CreateBotRequest createBotRequest);

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
     * @return Result of the CreateBotAlias operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.CreateBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotAlias" target="_top">AWS
     *      API Documentation</a>
     */
    CreateBotAliasResult createBotAlias(CreateBotAliasRequest createBotAliasRequest);

    /**
     * <p>
     * Creates a locale in the bot. The locale contains the intents and slot types that the bot uses in conversations
     * with users in the specified language and locale. You must add a locale to a bot before you can add intents and
     * slot types to the bot.
     * </p>
     * 
     * @param createBotLocaleRequest
     * @return Result of the CreateBotLocale operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.CreateBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    CreateBotLocaleResult createBotLocale(CreateBotLocaleRequest createBotLocaleRequest);

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
     * @return Result of the CreateBotVersion operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.CreateBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotVersion" target="_top">AWS
     *      API Documentation</a>
     */
    CreateBotVersionResult createBotVersion(CreateBotVersionRequest createBotVersionRequest);

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
     * @return Result of the CreateExport operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.CreateExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateExport" target="_top">AWS API
     *      Documentation</a>
     */
    CreateExportResult createExport(CreateExportRequest createExportRequest);

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
     * @return Result of the CreateIntent operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.CreateIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateIntent" target="_top">AWS API
     *      Documentation</a>
     */
    CreateIntentResult createIntent(CreateIntentRequest createIntentRequest);

    /**
     * <p>
     * Creates a new resource policy with the specified policy statements.
     * </p>
     * 
     * @param createResourcePolicyRequest
     * @return Result of the CreateResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @sample AmazonLexModelsV2.CreateResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    CreateResourcePolicyResult createResourcePolicy(CreateResourcePolicyRequest createResourcePolicyRequest);

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
     * @return Result of the CreateResourcePolicyStatement operation returned by the service.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @sample AmazonLexModelsV2.CreateResourcePolicyStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateResourcePolicyStatement"
     *      target="_top">AWS API Documentation</a>
     */
    CreateResourcePolicyStatementResult createResourcePolicyStatement(CreateResourcePolicyStatementRequest createResourcePolicyStatementRequest);

    /**
     * <p>
     * Creates a slot in an intent. A slot is a variable needed to fulfill an intent. For example, an
     * <code>OrderPizza</code> intent might need slots for size, crust, and number of pizzas. For each slot, you define
     * one or more utterances that Amazon Lex uses to elicit a response from the user.
     * </p>
     * 
     * @param createSlotRequest
     * @return Result of the CreateSlot operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.CreateSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateSlot" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSlotResult createSlot(CreateSlotRequest createSlotRequest);

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
     * @return Result of the CreateSlotType operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.CreateSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateSlotType" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSlotTypeResult createSlotType(CreateSlotTypeRequest createSlotTypeRequest);

    /**
     * <p>
     * Gets a pre-signed S3 write URL that you use to upload the zip archive when importing a bot or a bot locale.
     * </p>
     * 
     * @param createUploadUrlRequest
     * @return Result of the CreateUploadUrl operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.CreateUploadUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateUploadUrl" target="_top">AWS
     *      API Documentation</a>
     */
    CreateUploadUrlResult createUploadUrl(CreateUploadUrlRequest createUploadUrlRequest);

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
     * @return Result of the DeleteBot operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DeleteBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBot" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBotResult deleteBot(DeleteBotRequest deleteBotRequest);

    /**
     * <p>
     * Deletes the specified bot alias.
     * </p>
     * 
     * @param deleteBotAliasRequest
     * @return Result of the DeleteBotAlias operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DeleteBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotAlias" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteBotAliasResult deleteBotAlias(DeleteBotAliasRequest deleteBotAliasRequest);

    /**
     * <p>
     * Removes a locale from a bot.
     * </p>
     * <p>
     * When you delete a locale, all intents, slots, and slot types defined for the locale are also deleted.
     * </p>
     * 
     * @param deleteBotLocaleRequest
     * @return Result of the DeleteBotLocale operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DeleteBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteBotLocaleResult deleteBotLocale(DeleteBotLocaleRequest deleteBotLocaleRequest);

    /**
     * <p>
     * Deletes a specific version of a bot. To delete all version of a bot, use the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/API_DeleteBot.html">DeleteBot</a> operation.
     * </p>
     * 
     * @param deleteBotVersionRequest
     * @return Result of the DeleteBotVersion operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DeleteBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotVersion" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteBotVersionResult deleteBotVersion(DeleteBotVersionRequest deleteBotVersionRequest);

    /**
     * <p>
     * Removes a custom vocabulary from the specified locale in the specified bot.
     * </p>
     * 
     * @param deleteCustomVocabularyRequest
     * @return Result of the DeleteCustomVocabulary operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DeleteCustomVocabulary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteCustomVocabulary"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCustomVocabularyResult deleteCustomVocabulary(DeleteCustomVocabularyRequest deleteCustomVocabularyRequest);

    /**
     * <p>
     * Removes a previous export and the associated files stored in an S3 bucket.
     * </p>
     * 
     * @param deleteExportRequest
     * @return Result of the DeleteExport operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DeleteExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteExport" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteExportResult deleteExport(DeleteExportRequest deleteExportRequest);

    /**
     * <p>
     * Removes a previous import and the associated file stored in an S3 bucket.
     * </p>
     * 
     * @param deleteImportRequest
     * @return Result of the DeleteImport operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DeleteImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteImport" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteImportResult deleteImport(DeleteImportRequest deleteImportRequest);

    /**
     * <p>
     * Removes the specified intent.
     * </p>
     * <p>
     * Deleting an intent also deletes the slots associated with the intent.
     * </p>
     * 
     * @param deleteIntentRequest
     * @return Result of the DeleteIntent operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DeleteIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteIntent" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteIntentResult deleteIntent(DeleteIntentRequest deleteIntentRequest);

    /**
     * <p>
     * Removes an existing policy from a bot or bot alias. If the resource doesn't have a policy attached, Amazon Lex
     * returns an exception.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @sample AmazonLexModelsV2.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes a policy statement from a resource policy. If you delete the last statement from a policy, the policy is
     * deleted. If you specify a statement ID that doesn't exist in the policy, or if the bot or bot alias doesn't have
     * a policy attached, Amazon Lex returns an exception.
     * </p>
     * 
     * @param deleteResourcePolicyStatementRequest
     * @return Result of the DeleteResourcePolicyStatement operation returned by the service.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @sample AmazonLexModelsV2.DeleteResourcePolicyStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteResourcePolicyStatement"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourcePolicyStatementResult deleteResourcePolicyStatement(DeleteResourcePolicyStatementRequest deleteResourcePolicyStatementRequest);

    /**
     * <p>
     * Deletes the specified slot from an intent.
     * </p>
     * 
     * @param deleteSlotRequest
     * @return Result of the DeleteSlot operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DeleteSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteSlot" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSlotResult deleteSlot(DeleteSlotRequest deleteSlotRequest);

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
     * @return Result of the DeleteSlotType operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DeleteSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteSlotType" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteSlotTypeResult deleteSlotType(DeleteSlotTypeRequest deleteSlotTypeRequest);

    /**
     * <p>
     * Deletes stored utterances.
     * </p>
     * <p>
     * Amazon Lex stores the utterances that users send to your bot. Utterances are stored for 15 days for use with the
     * <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/API_ListAggregatedUtterances.html">ListAggregatedUtterances</a>
     * operation, and then stored indefinitely for use in improving the ability of your bot to respond to user input..
     * </p>
     * <p>
     * Use the <code>DeleteUtterances</code> operation to manually delete utterances for a specific session. When you
     * use the <code>DeleteUtterances</code> operation, utterances stored for improving your bot's ability to respond to
     * user input are deleted immediately. Utterances stored for use with the <code>ListAggregatedUtterances</code>
     * operation are deleted after 15 days.
     * </p>
     * 
     * @param deleteUtterancesRequest
     * @return Result of the DeleteUtterances operation returned by the service.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DeleteUtterances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteUtterances" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteUtterancesResult deleteUtterances(DeleteUtterancesRequest deleteUtterancesRequest);

    /**
     * <p>
     * Provides metadata information about a bot.
     * </p>
     * 
     * @param describeBotRequest
     * @return Result of the DescribeBot operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DescribeBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBot" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeBotResult describeBot(DescribeBotRequest describeBotRequest);

    /**
     * <p>
     * Get information about a specific bot alias.
     * </p>
     * 
     * @param describeBotAliasRequest
     * @return Result of the DescribeBotAlias operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DescribeBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotAlias" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeBotAliasResult describeBotAlias(DescribeBotAliasRequest describeBotAliasRequest);

    /**
     * <p>
     * Describes the settings that a bot has for a specific locale.
     * </p>
     * 
     * @param describeBotLocaleRequest
     * @return Result of the DescribeBotLocale operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DescribeBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotLocale"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeBotLocaleResult describeBotLocale(DescribeBotLocaleRequest describeBotLocaleRequest);

    /**
     * <p>
     * Provides metadata information about a bot recommendation. This information will enable you to get a description
     * on the request inputs, to download associated transcripts after processing is complete, and to download intents
     * and slot-types generated by the bot recommendation.
     * </p>
     * 
     * @param describeBotRecommendationRequest
     * @return Result of the DescribeBotRecommendation operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DescribeBotRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeBotRecommendationResult describeBotRecommendation(DescribeBotRecommendationRequest describeBotRecommendationRequest);

    /**
     * <p>
     * Provides metadata about a version of a bot.
     * </p>
     * 
     * @param describeBotVersionRequest
     * @return Result of the DescribeBotVersion operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DescribeBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeBotVersionResult describeBotVersion(DescribeBotVersionRequest describeBotVersionRequest);

    /**
     * <p>
     * Provides metadata information about a custom vocabulary.
     * </p>
     * 
     * @param describeCustomVocabularyMetadataRequest
     * @return Result of the DescribeCustomVocabularyMetadata operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DescribeCustomVocabularyMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeCustomVocabularyMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCustomVocabularyMetadataResult describeCustomVocabularyMetadata(DescribeCustomVocabularyMetadataRequest describeCustomVocabularyMetadataRequest);

    /**
     * <p>
     * Gets information about a specific export.
     * </p>
     * 
     * @param describeExportRequest
     * @return Result of the DescribeExport operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DescribeExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeExport" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeExportResult describeExport(DescribeExportRequest describeExportRequest);

    /**
     * <p>
     * Gets information about a specific import.
     * </p>
     * 
     * @param describeImportRequest
     * @return Result of the DescribeImport operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DescribeImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeImport" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeImportResult describeImport(DescribeImportRequest describeImportRequest);

    /**
     * <p>
     * Returns metadata about an intent.
     * </p>
     * 
     * @param describeIntentRequest
     * @return Result of the DescribeIntent operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DescribeIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeIntent" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeIntentResult describeIntent(DescribeIntentRequest describeIntentRequest);

    /**
     * <p>
     * Gets the resource policy and policy revision for a bot or bot alias.
     * </p>
     * 
     * @param describeResourcePolicyRequest
     * @return Result of the DescribeResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @sample AmazonLexModelsV2.DescribeResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeResourcePolicyResult describeResourcePolicy(DescribeResourcePolicyRequest describeResourcePolicyRequest);

    /**
     * <p>
     * Gets metadata information about a slot.
     * </p>
     * 
     * @param describeSlotRequest
     * @return Result of the DescribeSlot operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DescribeSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeSlot" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSlotResult describeSlot(DescribeSlotRequest describeSlotRequest);

    /**
     * <p>
     * Gets metadata information about a slot type.
     * </p>
     * 
     * @param describeSlotTypeRequest
     * @return Result of the DescribeSlotType operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.DescribeSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeSlotType" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeSlotTypeResult describeSlotType(DescribeSlotTypeRequest describeSlotTypeRequest);

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
     * @return Result of the ListAggregatedUtterances operation returned by the service.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.ListAggregatedUtterances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListAggregatedUtterances"
     *      target="_top">AWS API Documentation</a>
     */
    ListAggregatedUtterancesResult listAggregatedUtterances(ListAggregatedUtterancesRequest listAggregatedUtterancesRequest);

    /**
     * <p>
     * Gets a list of aliases for the specified bot.
     * </p>
     * 
     * @param listBotAliasesRequest
     * @return Result of the ListBotAliases operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.ListBotAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotAliases" target="_top">AWS
     *      API Documentation</a>
     */
    ListBotAliasesResult listBotAliases(ListBotAliasesRequest listBotAliasesRequest);

    /**
     * <p>
     * Gets a list of locales for the specified bot.
     * </p>
     * 
     * @param listBotLocalesRequest
     * @return Result of the ListBotLocales operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.ListBotLocales
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotLocales" target="_top">AWS
     *      API Documentation</a>
     */
    ListBotLocalesResult listBotLocales(ListBotLocalesRequest listBotLocalesRequest);

    /**
     * <p>
     * Get a list of bot recommendations that meet the specified criteria.
     * </p>
     * 
     * @param listBotRecommendationsRequest
     * @return Result of the ListBotRecommendations operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @sample AmazonLexModelsV2.ListBotRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ListBotRecommendationsResult listBotRecommendations(ListBotRecommendationsRequest listBotRecommendationsRequest);

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
     * @return Result of the ListBotVersions operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.ListBotVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBotVersions" target="_top">AWS
     *      API Documentation</a>
     */
    ListBotVersionsResult listBotVersions(ListBotVersionsRequest listBotVersionsRequest);

    /**
     * <p>
     * Gets a list of available bots.
     * </p>
     * 
     * @param listBotsRequest
     * @return Result of the ListBots operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.ListBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBots" target="_top">AWS API
     *      Documentation</a>
     */
    ListBotsResult listBots(ListBotsRequest listBotsRequest);

    /**
     * <p>
     * Gets a list of built-in intents provided by Amazon Lex that you can use in your bot.
     * </p>
     * <p>
     * To use a built-in intent as a the base for your own intent, include the built-in intent signature in the
     * <code>parentIntentSignature</code> parameter when you call the <code>CreateIntent</code> operation. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/API_CreateIntent.html">CreateIntent</a>.
     * </p>
     * 
     * @param listBuiltInIntentsRequest
     * @return Result of the ListBuiltInIntents operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.ListBuiltInIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBuiltInIntents"
     *      target="_top">AWS API Documentation</a>
     */
    ListBuiltInIntentsResult listBuiltInIntents(ListBuiltInIntentsRequest listBuiltInIntentsRequest);

    /**
     * <p>
     * Gets a list of built-in slot types that meet the specified criteria.
     * </p>
     * 
     * @param listBuiltInSlotTypesRequest
     * @return Result of the ListBuiltInSlotTypes operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.ListBuiltInSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBuiltInSlotTypes"
     *      target="_top">AWS API Documentation</a>
     */
    ListBuiltInSlotTypesResult listBuiltInSlotTypes(ListBuiltInSlotTypesRequest listBuiltInSlotTypesRequest);

    /**
     * <p>
     * List custom vocabulary items for the specified locale in the specified bot.
     * </p>
     * 
     * @param listCustomVocabularyItemsRequest
     * @return Result of the ListCustomVocabularyItems operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.ListCustomVocabularyItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListCustomVocabularyItems"
     *      target="_top">AWS API Documentation</a>
     */
    ListCustomVocabularyItemsResult listCustomVocabularyItems(ListCustomVocabularyItemsRequest listCustomVocabularyItemsRequest);

    /**
     * <p>
     * Lists the exports for a bot, bot locale, or custom vocabulary. Exports are kept in the list for 7 days.
     * </p>
     * 
     * @param listExportsRequest
     * @return Result of the ListExports operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.ListExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListExports" target="_top">AWS API
     *      Documentation</a>
     */
    ListExportsResult listExports(ListExportsRequest listExportsRequest);

    /**
     * <p>
     * Lists the imports for a bot, bot locale, or custom vocabulary. Imports are kept in the list for 7 days.
     * </p>
     * 
     * @param listImportsRequest
     * @return Result of the ListImports operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.ListImports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListImports" target="_top">AWS API
     *      Documentation</a>
     */
    ListImportsResult listImports(ListImportsRequest listImportsRequest);

    /**
     * <p>
     * Get a list of intents that meet the specified criteria.
     * </p>
     * 
     * @param listIntentsRequest
     * @return Result of the ListIntents operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.ListIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListIntents" target="_top">AWS API
     *      Documentation</a>
     */
    ListIntentsResult listIntents(ListIntentsRequest listIntentsRequest);

    /**
     * <p>
     * Gets a list of recommended intents provided by the bot recommendation that you can use in your bot. Intents in
     * the response are ordered by relevance.
     * </p>
     * 
     * @param listRecommendedIntentsRequest
     * @return Result of the ListRecommendedIntents operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @sample AmazonLexModelsV2.ListRecommendedIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListRecommendedIntents"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecommendedIntentsResult listRecommendedIntents(ListRecommendedIntentsRequest listRecommendedIntentsRequest);

    /**
     * <p>
     * Gets a list of slot types that match the specified criteria.
     * </p>
     * 
     * @param listSlotTypesRequest
     * @return Result of the ListSlotTypes operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.ListSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListSlotTypes" target="_top">AWS
     *      API Documentation</a>
     */
    ListSlotTypesResult listSlotTypes(ListSlotTypesRequest listSlotTypesRequest);

    /**
     * <p>
     * Gets a list of slots that match the specified criteria.
     * </p>
     * 
     * @param listSlotsRequest
     * @return Result of the ListSlots operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.ListSlots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListSlots" target="_top">AWS API
     *      Documentation</a>
     */
    ListSlotsResult listSlots(ListSlotsRequest listSlotsRequest);

    /**
     * <p>
     * Gets a list of tags associated with a resource. Only bots, bot aliases, and bot channels can have tags associated
     * with them.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @sample AmazonLexModelsV2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Search for associated transcripts that meet the specified criteria.
     * </p>
     * 
     * @param searchAssociatedTranscriptsRequest
     * @return Result of the SearchAssociatedTranscripts operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @sample AmazonLexModelsV2.SearchAssociatedTranscripts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SearchAssociatedTranscripts"
     *      target="_top">AWS API Documentation</a>
     */
    SearchAssociatedTranscriptsResult searchAssociatedTranscripts(SearchAssociatedTranscriptsRequest searchAssociatedTranscriptsRequest);

    /**
     * <p>
     * Use this to provide your transcript data, and to start the bot recommendation process.
     * </p>
     * 
     * @param startBotRecommendationRequest
     * @return Result of the StartBotRecommendation operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.StartBotRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartBotRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    StartBotRecommendationResult startBotRecommendation(StartBotRecommendationRequest startBotRecommendationRequest);

    /**
     * <p>
     * Starts importing a bot, bot locale, or custom vocabulary from a zip archive that you uploaded to an S3 bucket.
     * </p>
     * 
     * @param startImportRequest
     * @return Result of the StartImport operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.StartImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartImport" target="_top">AWS API
     *      Documentation</a>
     */
    StartImportResult startImport(StartImportRequest startImportRequest);

    /**
     * <p>
     * Stop an already running Bot Recommendation request.
     * </p>
     * 
     * @param stopBotRecommendationRequest
     * @return Result of the StopBotRecommendation operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.StopBotRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StopBotRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    StopBotRecommendationResult stopBotRecommendation(StopBotRecommendationRequest stopBotRecommendationRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource. If a tag key already exists, the existing value is replaced
     * with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @sample AmazonLexModelsV2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a bot, bot alias, or bot channel.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @sample AmazonLexModelsV2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the configuration of an existing bot.
     * </p>
     * 
     * @param updateBotRequest
     * @return Result of the UpdateBot operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.UpdateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBot" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateBotResult updateBot(UpdateBotRequest updateBotRequest);

    /**
     * <p>
     * Updates the configuration of an existing bot alias.
     * </p>
     * 
     * @param updateBotAliasRequest
     * @return Result of the UpdateBotAlias operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.UpdateBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBotAlias" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateBotAliasResult updateBotAlias(UpdateBotAliasRequest updateBotAliasRequest);

    /**
     * <p>
     * Updates the settings that a bot has for a specific locale.
     * </p>
     * 
     * @param updateBotLocaleRequest
     * @return Result of the UpdateBotLocale operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.UpdateBotLocale
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBotLocale" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateBotLocaleResult updateBotLocale(UpdateBotLocaleRequest updateBotLocaleRequest);

    /**
     * <p>
     * Updates an existing bot recommendation request.
     * </p>
     * 
     * @param updateBotRecommendationRequest
     * @return Result of the UpdateBotRecommendation operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.UpdateBotRecommendation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBotRecommendation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateBotRecommendationResult updateBotRecommendation(UpdateBotRecommendationRequest updateBotRecommendationRequest);

    /**
     * <p>
     * Updates the password used to protect an export zip archive.
     * </p>
     * <p>
     * The password is not required. If you don't supply a password, Amazon Lex generates a zip file that is not
     * protected by a password. This is the archive that is available at the pre-signed S3 URL provided by the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/API_DescribeExport.html">DescribeExport</a> operation.
     * </p>
     * 
     * @param updateExportRequest
     * @return Result of the UpdateExport operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.UpdateExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateExport" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateExportResult updateExport(UpdateExportRequest updateExportRequest);

    /**
     * <p>
     * Updates the settings for an intent.
     * </p>
     * 
     * @param updateIntentRequest
     * @return Result of the UpdateIntent operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.UpdateIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateIntent" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateIntentResult updateIntent(UpdateIntentRequest updateIntentRequest);

    /**
     * <p>
     * Replaces the existing resource policy for a bot or bot alias with a new one. If the policy doesn't exist, Amazon
     * Lex returns an exception.
     * </p>
     * 
     * @param updateResourcePolicyRequest
     * @return Result of the UpdateResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         You asked to describe a resource that doesn't exist. Check the resource that you are requesting and try
     *         again.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @sample AmazonLexModelsV2.UpdateResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateResourcePolicyResult updateResourcePolicy(UpdateResourcePolicyRequest updateResourcePolicyRequest);

    /**
     * <p>
     * Updates the settings for a slot.
     * </p>
     * 
     * @param updateSlotRequest
     * @return Result of the UpdateSlot operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.UpdateSlot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateSlot" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSlotResult updateSlot(UpdateSlotRequest updateSlotRequest);

    /**
     * <p>
     * Updates the configuration of an existing slot type.
     * </p>
     * 
     * @param updateSlotTypeRequest
     * @return Result of the UpdateSlotType operation returned by the service.
     * @throws ThrottlingException
     *         Your request rate is too high. Reduce the frequency of requests.
     * @throws ServiceQuotaExceededException
     *         You have reached a quota for your bot.
     * @throws ValidationException
     *         One of the input parameters in your request isn't valid. Check the parameters and try your request again.
     * @throws PreconditionFailedException
     *         Your request couldn't be completed because one or more request fields aren't valid. Check the fields in
     *         your request and try again.
     * @throws ConflictException
     *         The action that you tried to perform couldn't be completed because the resource is in a conflicting
     *         state. For example, deleting a bot that is in the CREATING state. Try your request again.
     * @throws InternalServerException
     *         The service encountered an unexpected condition. Try your request again.
     * @sample AmazonLexModelsV2.UpdateSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateSlotType" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateSlotTypeResult updateSlotType(UpdateSlotTypeRequest updateSlotTypeRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AmazonLexModelsV2Waiters waiters();

}
