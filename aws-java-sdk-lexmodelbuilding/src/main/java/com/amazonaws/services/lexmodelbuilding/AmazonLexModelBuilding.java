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
package com.amazonaws.services.lexmodelbuilding;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.lexmodelbuilding.model.*;

/**
 * Interface for accessing Amazon Lex Model Building Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lexmodelbuilding.AbstractAmazonLexModelBuilding} instead.
 * </p>
 * <p>
 * <fullname>Amazon Lex Build-Time Actions</fullname>
 * <p>
 * Amazon Lex is an AWS service for building conversational voice and text interfaces. Use these actions to create,
 * update, and delete conversational bots for new and existing client applications.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLexModelBuilding {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "models.lex";

    /**
     * <p>
     * Creates a new version of the bot based on the <code>$LATEST</code> version. If the <code>$LATEST</code> version
     * of this resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version. It
     * returns the last created version.
     * </p>
     * <note>
     * <p>
     * You can update only the <code>$LATEST</code> version of the bot. You can't update the numbered versions that you
     * create with the <code>CreateBotVersion</code> operation.
     * </p>
     * </note>
     * <p>
     * When you create the first version of a bot, Amazon Lex sets the version to 1. Subsequent versions increment by 1.
     * For more information, see <a>versioning-intro</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:CreateBotVersion</code> action.
     * </p>
     * 
     * @param createBotVersionRequest
     * @return Result of the CreateBotVersion operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws PreconditionFailedException
     *         The checksum of the resource that you are trying to change does not match the checksum in the request.
     *         Check the resource's checksum and try again.
     * @sample AmazonLexModelBuilding.CreateBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/CreateBotVersion" target="_top">AWS
     *      API Documentation</a>
     */
    CreateBotVersionResult createBotVersion(CreateBotVersionRequest createBotVersionRequest);

    /**
     * <p>
     * Creates a new version of an intent based on the <code>$LATEST</code> version of the intent. If the
     * <code>$LATEST</code> version of this intent hasn't changed since you last updated it, Amazon Lex doesn't create a
     * new version. It returns the last version you created.
     * </p>
     * <note>
     * <p>
     * You can update only the <code>$LATEST</code> version of the intent. You can't update the numbered versions that
     * you create with the <code>CreateIntentVersion</code> operation.
     * </p>
     * </note>
     * <p>
     * When you create a version of an intent, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For
     * more information, see <a>versioning-intro</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lex:CreateIntentVersion</code> action.
     * </p>
     * 
     * @param createIntentVersionRequest
     * @return Result of the CreateIntentVersion operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws PreconditionFailedException
     *         The checksum of the resource that you are trying to change does not match the checksum in the request.
     *         Check the resource's checksum and try again.
     * @sample AmazonLexModelBuilding.CreateIntentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/CreateIntentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    CreateIntentVersionResult createIntentVersion(CreateIntentVersionRequest createIntentVersionRequest);

    /**
     * <p>
     * Creates a new version of a slot type based on the <code>$LATEST</code> version of the specified slot type. If the
     * <code>$LATEST</code> version of this resource has not changed since the last version that you created, Amazon Lex
     * doesn't create a new version. It returns the last version that you created.
     * </p>
     * <note>
     * <p>
     * You can update only the <code>$LATEST</code> version of a slot type. You can't update the numbered versions that
     * you create with the <code>CreateSlotTypeVersion</code> operation.
     * </p>
     * </note>
     * <p>
     * When you create a version of a slot type, Amazon Lex sets the version to 1. Subsequent versions increment by 1.
     * For more information, see <a>versioning-intro</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:CreateSlotTypeVersion</code> action.
     * </p>
     * 
     * @param createSlotTypeVersionRequest
     * @return Result of the CreateSlotTypeVersion operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws PreconditionFailedException
     *         The checksum of the resource that you are trying to change does not match the checksum in the request.
     *         Check the resource's checksum and try again.
     * @sample AmazonLexModelBuilding.CreateSlotTypeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/CreateSlotTypeVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSlotTypeVersionResult createSlotTypeVersion(CreateSlotTypeVersionRequest createSlotTypeVersionRequest);

    /**
     * <p>
     * Deletes all versions of the bot, including the <code>$LATEST</code> version. To delete a specific version of the
     * bot, use the <a>DeleteBotVersion</a> operation.
     * </p>
     * <p>
     * If a bot has an alias, you can't delete it. Instead, the <code>DeleteBot</code> operation returns a
     * <code>ResourceInUseException</code> exception that includes a reference to the alias that refers to the bot. To
     * remove the reference to the bot, delete the alias. If you get the same exception again, delete the referring
     * alias until the <code>DeleteBot</code> operation is successful.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:DeleteBot</code> action.
     * </p>
     * 
     * @param deleteBotRequest
     * @return Result of the DeleteBot operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws ResourceInUseException
     *         The resource that you are attempting to delete is referred to by another resource. Use this information
     *         to remove references to the resource that you are trying to delete.</p>
     *         <p>
     *         The body of the exception contains a JSON object that describes the resource.
     *         </p>
     *         <p>
     *         <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
     *         </p>
     *         <p>
     *         <code>"resourceReference": {</code>
     *         </p>
     *         <p>
     *         <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
     * @sample AmazonLexModelBuilding.DeleteBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBot" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBotResult deleteBot(DeleteBotRequest deleteBotRequest);

    /**
     * <p>
     * Deletes an alias for the specified bot.
     * </p>
     * <p>
     * You can't delete an alias that is used in the association between a bot and a messaging channel. If an alias is
     * used in a channel association, the <code>DeleteBot</code> operation returns a <code>ResourceInUseException</code>
     * exception that includes a reference to the channel association that refers to the bot. You can remove the
     * reference to the alias by deleting the channel association. If you get the same exception again, delete the
     * referring association until the <code>DeleteBotAlias</code> operation is successful.
     * </p>
     * 
     * @param deleteBotAliasRequest
     * @return Result of the DeleteBotAlias operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws ResourceInUseException
     *         The resource that you are attempting to delete is referred to by another resource. Use this information
     *         to remove references to the resource that you are trying to delete.</p>
     *         <p>
     *         The body of the exception contains a JSON object that describes the resource.
     *         </p>
     *         <p>
     *         <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
     *         </p>
     *         <p>
     *         <code>"resourceReference": {</code>
     *         </p>
     *         <p>
     *         <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
     * @sample AmazonLexModelBuilding.DeleteBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBotAlias" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBotAliasResult deleteBotAlias(DeleteBotAliasRequest deleteBotAliasRequest);

    /**
     * <p>
     * Deletes the association between an Amazon Lex bot and a messaging platform.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:DeleteBotChannelAssociation</code> action.
     * </p>
     * 
     * @param deleteBotChannelAssociationRequest
     * @return Result of the DeleteBotChannelAssociation operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.DeleteBotChannelAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBotChannelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteBotChannelAssociationResult deleteBotChannelAssociation(DeleteBotChannelAssociationRequest deleteBotChannelAssociationRequest);

    /**
     * <p>
     * Deletes a specific version of a bot. To delete all versions of a bot, use the <a>DeleteBot</a> operation.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:DeleteBotVersion</code> action.
     * </p>
     * 
     * @param deleteBotVersionRequest
     * @return Result of the DeleteBotVersion operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws ResourceInUseException
     *         The resource that you are attempting to delete is referred to by another resource. Use this information
     *         to remove references to the resource that you are trying to delete.</p>
     *         <p>
     *         The body of the exception contains a JSON object that describes the resource.
     *         </p>
     *         <p>
     *         <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
     *         </p>
     *         <p>
     *         <code>"resourceReference": {</code>
     *         </p>
     *         <p>
     *         <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
     * @sample AmazonLexModelBuilding.DeleteBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBotVersion" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteBotVersionResult deleteBotVersion(DeleteBotVersionRequest deleteBotVersionRequest);

    /**
     * <p>
     * Deletes all versions of the intent, including the <code>$LATEST</code> version. To delete a specific version of
     * the intent, use the <a>DeleteIntentVersion</a> operation.
     * </p>
     * <p>
     * You can delete a version of an intent only if it is not referenced. To delete an intent that is referred to in
     * one or more bots (see <a>how-it-works</a>), you must remove those references first.
     * </p>
     * <note>
     * <p>
     * If you get the <code>ResourceInUseException</code> exception, it provides an example reference that shows where
     * the intent is referenced. To remove the reference to the intent, either update the bot or delete it. If you get
     * the same exception when you attempt to delete the intent again, repeat until the intent has no references and the
     * call to <code>DeleteIntent</code> is successful.
     * </p>
     * </note>
     * <p>
     * This operation requires permission for the <code>lex:DeleteIntent</code> action.
     * </p>
     * 
     * @param deleteIntentRequest
     * @return Result of the DeleteIntent operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws ResourceInUseException
     *         The resource that you are attempting to delete is referred to by another resource. Use this information
     *         to remove references to the resource that you are trying to delete.</p>
     *         <p>
     *         The body of the exception contains a JSON object that describes the resource.
     *         </p>
     *         <p>
     *         <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
     *         </p>
     *         <p>
     *         <code>"resourceReference": {</code>
     *         </p>
     *         <p>
     *         <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
     * @sample AmazonLexModelBuilding.DeleteIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteIntent" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteIntentResult deleteIntent(DeleteIntentRequest deleteIntentRequest);

    /**
     * <p>
     * Deletes a specific version of an intent. To delete all versions of a intent, use the <a>DeleteIntent</a>
     * operation.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:DeleteIntentVersion</code> action.
     * </p>
     * 
     * @param deleteIntentVersionRequest
     * @return Result of the DeleteIntentVersion operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws ResourceInUseException
     *         The resource that you are attempting to delete is referred to by another resource. Use this information
     *         to remove references to the resource that you are trying to delete.</p>
     *         <p>
     *         The body of the exception contains a JSON object that describes the resource.
     *         </p>
     *         <p>
     *         <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
     *         </p>
     *         <p>
     *         <code>"resourceReference": {</code>
     *         </p>
     *         <p>
     *         <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
     * @sample AmazonLexModelBuilding.DeleteIntentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteIntentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteIntentVersionResult deleteIntentVersion(DeleteIntentVersionRequest deleteIntentVersionRequest);

    /**
     * <p>
     * Deletes all versions of the slot type, including the <code>$LATEST</code> version. To delete a specific version
     * of the slot type, use the <a>DeleteSlotTypeVersion</a> operation.
     * </p>
     * <p>
     * You can delete a version of a slot type only if it is not referenced. To delete a slot type that is referred to
     * in one or more intents, you must remove those references first.
     * </p>
     * <note>
     * <p>
     * If you get the <code>ResourceInUseException</code> exception, the exception provides an example reference that
     * shows the intent where the slot type is referenced. To remove the reference to the slot type, either update the
     * intent or delete it. If you get the same exception when you attempt to delete the slot type again, repeat until
     * the slot type has no references and the <code>DeleteSlotType</code> call is successful.
     * </p>
     * </note>
     * <p>
     * This operation requires permission for the <code>lex:DeleteSlotType</code> action.
     * </p>
     * 
     * @param deleteSlotTypeRequest
     * @return Result of the DeleteSlotType operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws ResourceInUseException
     *         The resource that you are attempting to delete is referred to by another resource. Use this information
     *         to remove references to the resource that you are trying to delete.</p>
     *         <p>
     *         The body of the exception contains a JSON object that describes the resource.
     *         </p>
     *         <p>
     *         <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
     *         </p>
     *         <p>
     *         <code>"resourceReference": {</code>
     *         </p>
     *         <p>
     *         <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
     * @sample AmazonLexModelBuilding.DeleteSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteSlotType" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSlotTypeResult deleteSlotType(DeleteSlotTypeRequest deleteSlotTypeRequest);

    /**
     * <p>
     * Deletes a specific version of a slot type. To delete all versions of a slot type, use the <a>DeleteSlotType</a>
     * operation.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:DeleteSlotTypeVersion</code> action.
     * </p>
     * 
     * @param deleteSlotTypeVersionRequest
     * @return Result of the DeleteSlotTypeVersion operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws ResourceInUseException
     *         The resource that you are attempting to delete is referred to by another resource. Use this information
     *         to remove references to the resource that you are trying to delete.</p>
     *         <p>
     *         The body of the exception contains a JSON object that describes the resource.
     *         </p>
     *         <p>
     *         <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
     *         </p>
     *         <p>
     *         <code>"resourceReference": {</code>
     *         </p>
     *         <p>
     *         <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
     * @sample AmazonLexModelBuilding.DeleteSlotTypeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteSlotTypeVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSlotTypeVersionResult deleteSlotTypeVersion(DeleteSlotTypeVersionRequest deleteSlotTypeVersionRequest);

    /**
     * <p>
     * Deletes stored utterances.
     * </p>
     * <p>
     * Amazon Lex stores the utterances that users send to your bot. Utterances are stored for 15 days for use with the
     * <a>GetUtterancesView</a> operation, and then stored indefinitely for use in improving the ability of your bot to
     * respond to user input.
     * </p>
     * <p>
     * Use the <code>DeleteStoredUtterances</code> operation to manually delete stored utterances for a specific user.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:DeleteUtterances</code> action.
     * </p>
     * 
     * @param deleteUtterancesRequest
     * @return Result of the DeleteUtterances operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.DeleteUtterances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteUtterances" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteUtterancesResult deleteUtterances(DeleteUtterancesRequest deleteUtterancesRequest);

    /**
     * <p>
     * Returns metadata information for a specific bot. You must provide the bot name and the bot version or alias.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBot</code> action.
     * </p>
     * 
     * @param getBotRequest
     * @return Result of the GetBot operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBot" target="_top">AWS API
     *      Documentation</a>
     */
    GetBotResult getBot(GetBotRequest getBotRequest);

    /**
     * <p>
     * Returns information about an Amazon Lex bot alias. For more information about aliases, see
     * <a>versioning-aliases</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBotAlias</code> action.
     * </p>
     * 
     * @param getBotAliasRequest
     * @return Result of the GetBotAlias operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotAlias" target="_top">AWS API
     *      Documentation</a>
     */
    GetBotAliasResult getBotAlias(GetBotAliasRequest getBotAliasRequest);

    /**
     * <p>
     * Returns a list of aliases for a specified Amazon Lex bot.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBotAliases</code> action.
     * </p>
     * 
     * @param getBotAliasesRequest
     * @return Result of the GetBotAliases operation returned by the service.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBotAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotAliases" target="_top">AWS API
     *      Documentation</a>
     */
    GetBotAliasesResult getBotAliases(GetBotAliasesRequest getBotAliasesRequest);

    /**
     * <p>
     * Returns information about the association between an Amazon Lex bot and a messaging platform.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBotChannelAssociation</code> action.
     * </p>
     * 
     * @param getBotChannelAssociationRequest
     * @return Result of the GetBotChannelAssociation operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBotChannelAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotChannelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    GetBotChannelAssociationResult getBotChannelAssociation(GetBotChannelAssociationRequest getBotChannelAssociationRequest);

    /**
     * <p>
     * Returns a list of all of the channels associated with the specified bot.
     * </p>
     * <p>
     * The <code>GetBotChannelAssociations</code> operation requires permissions for the
     * <code>lex:GetBotChannelAssociations</code> action.
     * </p>
     * 
     * @param getBotChannelAssociationsRequest
     * @return Result of the GetBotChannelAssociations operation returned by the service.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBotChannelAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotChannelAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    GetBotChannelAssociationsResult getBotChannelAssociations(GetBotChannelAssociationsRequest getBotChannelAssociationsRequest);

    /**
     * <p>
     * Gets information about all of the versions of a bot.
     * </p>
     * <p>
     * The <code>GetBotVersions</code> operation returns a <code>BotMetadata</code> object for each version of a bot.
     * For example, if a bot has three numbered versions, the <code>GetBotVersions</code> operation returns four
     * <code>BotMetadata</code> objects in the response, one for each numbered version and one for the
     * <code>$LATEST</code> version.
     * </p>
     * <p>
     * The <code>GetBotVersions</code> operation always returns at least one version, the <code>$LATEST</code> version.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBotVersions</code> action.
     * </p>
     * 
     * @param getBotVersionsRequest
     * @return Result of the GetBotVersions operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBotVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotVersions" target="_top">AWS API
     *      Documentation</a>
     */
    GetBotVersionsResult getBotVersions(GetBotVersionsRequest getBotVersionsRequest);

    /**
     * <p>
     * Returns bot information as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you provide the <code>nameContains</code> field, the response includes information for the
     * <code>$LATEST</code> version of all bots whose name contains the specified string.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify the <code>nameContains</code> field, the operation returns information about the
     * <code>$LATEST</code> version of all of your bots.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires permission for the <code>lex:GetBots</code> action.
     * </p>
     * 
     * @param getBotsRequest
     * @return Result of the GetBots operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBots" target="_top">AWS API
     *      Documentation</a>
     */
    GetBotsResult getBots(GetBotsRequest getBotsRequest);

    /**
     * <p>
     * Returns information about a built-in intent.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:GetBuiltinIntent</code> action.
     * </p>
     * 
     * @param getBuiltinIntentRequest
     * @return Result of the GetBuiltinIntent operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBuiltinIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinIntent" target="_top">AWS
     *      API Documentation</a>
     */
    GetBuiltinIntentResult getBuiltinIntent(GetBuiltinIntentRequest getBuiltinIntentRequest);

    /**
     * <p>
     * Gets a list of built-in intents that meet the specified criteria.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:GetBuiltinIntents</code> action.
     * </p>
     * 
     * @param getBuiltinIntentsRequest
     * @return Result of the GetBuiltinIntents operation returned by the service.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBuiltinIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinIntents" target="_top">AWS
     *      API Documentation</a>
     */
    GetBuiltinIntentsResult getBuiltinIntents(GetBuiltinIntentsRequest getBuiltinIntentsRequest);

    /**
     * <p>
     * Gets a list of built-in slot types that meet the specified criteria.
     * </p>
     * <p>
     * For a list of built-in slot types, see <a href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/slot-type-reference"
     * >Slot Type Reference</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:GetBuiltInSlotTypes</code> action.
     * </p>
     * 
     * @param getBuiltinSlotTypesRequest
     * @return Result of the GetBuiltinSlotTypes operation returned by the service.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetBuiltinSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinSlotTypes" target="_top">AWS
     *      API Documentation</a>
     */
    GetBuiltinSlotTypesResult getBuiltinSlotTypes(GetBuiltinSlotTypesRequest getBuiltinSlotTypesRequest);

    /**
     * <p>
     * Exports the contents of a Amazon Lex resource in a specified format.
     * </p>
     * 
     * @param getExportRequest
     * @return Result of the GetExport operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetExport" target="_top">AWS API
     *      Documentation</a>
     */
    GetExportResult getExport(GetExportRequest getExportRequest);

    /**
     * <p>
     * Gets information about an import job started with the <code>StartImport</code> operation.
     * </p>
     * 
     * @param getImportRequest
     * @return Result of the GetImport operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetImport" target="_top">AWS API
     *      Documentation</a>
     */
    GetImportResult getImport(GetImportRequest getImportRequest);

    /**
     * <p>
     * Returns information about an intent. In addition to the intent name, you must specify the intent version.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lex:GetIntent</code> action.
     * </p>
     * 
     * @param getIntentRequest
     * @return Result of the GetIntent operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetIntent" target="_top">AWS API
     *      Documentation</a>
     */
    GetIntentResult getIntent(GetIntentRequest getIntentRequest);

    /**
     * <p>
     * Gets information about all of the versions of an intent.
     * </p>
     * <p>
     * The <code>GetIntentVersions</code> operation returns an <code>IntentMetadata</code> object for each version of an
     * intent. For example, if an intent has three numbered versions, the <code>GetIntentVersions</code> operation
     * returns four <code>IntentMetadata</code> objects in the response, one for each numbered version and one for the
     * <code>$LATEST</code> version.
     * </p>
     * <p>
     * The <code>GetIntentVersions</code> operation always returns at least one version, the <code>$LATEST</code>
     * version.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetIntentVersions</code> action.
     * </p>
     * 
     * @param getIntentVersionsRequest
     * @return Result of the GetIntentVersions operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetIntentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetIntentVersions" target="_top">AWS
     *      API Documentation</a>
     */
    GetIntentVersionsResult getIntentVersions(GetIntentVersionsRequest getIntentVersionsRequest);

    /**
     * <p>
     * Returns intent information as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify the <code>nameContains</code> field, returns the <code>$LATEST</code> version of all intents that
     * contain the specified string.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify the <code>nameContains</code> field, returns information about the <code>$LATEST</code>
     * version of all intents.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The operation requires permission for the <code>lex:GetIntents</code> action.
     * </p>
     * 
     * @param getIntentsRequest
     * @return Result of the GetIntents operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetIntents" target="_top">AWS API
     *      Documentation</a>
     */
    GetIntentsResult getIntents(GetIntentsRequest getIntentsRequest);

    /**
     * <p>
     * Returns information about a specific version of a slot type. In addition to specifying the slot type name, you
     * must specify the slot type version.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetSlotType</code> action.
     * </p>
     * 
     * @param getSlotTypeRequest
     * @return Result of the GetSlotType operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetSlotType" target="_top">AWS API
     *      Documentation</a>
     */
    GetSlotTypeResult getSlotType(GetSlotTypeRequest getSlotTypeRequest);

    /**
     * <p>
     * Gets information about all versions of a slot type.
     * </p>
     * <p>
     * The <code>GetSlotTypeVersions</code> operation returns a <code>SlotTypeMetadata</code> object for each version of
     * a slot type. For example, if a slot type has three numbered versions, the <code>GetSlotTypeVersions</code>
     * operation returns four <code>SlotTypeMetadata</code> objects in the response, one for each numbered version and
     * one for the <code>$LATEST</code> version.
     * </p>
     * <p>
     * The <code>GetSlotTypeVersions</code> operation always returns at least one version, the <code>$LATEST</code>
     * version.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetSlotTypeVersions</code> action.
     * </p>
     * 
     * @param getSlotTypeVersionsRequest
     * @return Result of the GetSlotTypeVersions operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetSlotTypeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetSlotTypeVersions" target="_top">AWS
     *      API Documentation</a>
     */
    GetSlotTypeVersionsResult getSlotTypeVersions(GetSlotTypeVersionsRequest getSlotTypeVersionsRequest);

    /**
     * <p>
     * Returns slot type information as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify the <code>nameContains</code> field, returns the <code>$LATEST</code> version of all slot types
     * that contain the specified string.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify the <code>nameContains</code> field, returns information about the <code>$LATEST</code>
     * version of all slot types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The operation requires permission for the <code>lex:GetSlotTypes</code> action.
     * </p>
     * 
     * @param getSlotTypesRequest
     * @return Result of the GetSlotTypes operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found. Check the resource and try again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetSlotTypes" target="_top">AWS API
     *      Documentation</a>
     */
    GetSlotTypesResult getSlotTypes(GetSlotTypesRequest getSlotTypesRequest);

    /**
     * <p>
     * Use the <code>GetUtterancesView</code> operation to get information about the utterances that your users have
     * made to your bot. You can use this list to tune the utterances that your bot responds to.
     * </p>
     * <p>
     * For example, say that you have created a bot to order flowers. After your users have used your bot for a while,
     * use the <code>GetUtterancesView</code> operation to see the requests that they have made and whether they have
     * been successful. You might find that the utterance "I want flowers" is not being recognized. You could add this
     * utterance to the <code>OrderFlowers</code> intent so that your bot recognizes that utterance.
     * </p>
     * <p>
     * After you publish a new version of a bot, you can get information about the old version and the new so that you
     * can compare the performance across the two versions.
     * </p>
     * <note>
     * <p>
     * Utterance statistics are generated once a day. Data is available for the last 15 days. You can request
     * information for up to 5 versions in each request. The response contains information about a maximum of 100
     * utterances for each version.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions for the <code>lex:GetUtterancesView</code> action.
     * </p>
     * 
     * @param getUtterancesViewRequest
     * @return Result of the GetUtterancesView operation returned by the service.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.GetUtterancesView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetUtterancesView" target="_top">AWS
     *      API Documentation</a>
     */
    GetUtterancesViewResult getUtterancesView(GetUtterancesViewRequest getUtterancesViewRequest);

    /**
     * <p>
     * Creates an Amazon Lex conversational bot or replaces an existing bot. When you create or update a bot you are
     * only required to specify a name, a locale, and whether the bot is directed toward children under age 13. You can
     * use this to add intents later, or to remove intents from an existing bot. When you create a bot with the minimum
     * information, the bot is created or updated but Amazon Lex returns the <code/> response <code>FAILED</code>. You
     * can build the bot after you add one or more intents. For more information about Amazon Lex bots, see
     * <a>how-it-works</a>.
     * </p>
     * <p>
     * If you specify the name of an existing bot, the fields in the request replace the existing values in the
     * <code>$LATEST</code> version of the bot. Amazon Lex removes any fields that you don't provide values for in the
     * request, except for the <code>idleTTLInSeconds</code> and <code>privacySettings</code> fields, which are set to
     * their default values. If you don't specify values for required fields, Amazon Lex throws an exception.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:PutBot</code> action. For more information, see
     * <a>auth-and-access-control</a>.
     * </p>
     * 
     * @param putBotRequest
     * @return Result of the PutBot operation returned by the service.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws PreconditionFailedException
     *         The checksum of the resource that you are trying to change does not match the checksum in the request.
     *         Check the resource's checksum and try again.
     * @sample AmazonLexModelBuilding.PutBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutBot" target="_top">AWS API
     *      Documentation</a>
     */
    PutBotResult putBot(PutBotRequest putBotRequest);

    /**
     * <p>
     * Creates an alias for the specified version of the bot or replaces an alias for the specified bot. To change the
     * version of the bot that the alias points to, replace the alias. For more information about aliases, see
     * <a>versioning-aliases</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:PutBotAlias</code> action.
     * </p>
     * 
     * @param putBotAliasRequest
     * @return Result of the PutBotAlias operation returned by the service.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws PreconditionFailedException
     *         The checksum of the resource that you are trying to change does not match the checksum in the request.
     *         Check the resource's checksum and try again.
     * @sample AmazonLexModelBuilding.PutBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutBotAlias" target="_top">AWS API
     *      Documentation</a>
     */
    PutBotAliasResult putBotAlias(PutBotAliasRequest putBotAliasRequest);

    /**
     * <p>
     * Creates an intent or replaces an existing intent.
     * </p>
     * <p>
     * To define the interaction between the user and your bot, you use one or more intents. For a pizza ordering bot,
     * for example, you would create an <code>OrderPizza</code> intent.
     * </p>
     * <p>
     * To create an intent or replace an existing intent, you must provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Intent name. For example, <code>OrderPizza</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sample utterances. For example, "Can I order a pizza, please." and "I want to order a pizza."
     * </p>
     * </li>
     * <li>
     * <p>
     * Information to be gathered. You specify slot types for the information that your bot will request from the user.
     * You can specify standard slot types, such as a date or a time, or custom slot types such as the size and crust of
     * a pizza.
     * </p>
     * </li>
     * <li>
     * <p>
     * How the intent will be fulfilled. You can provide a Lambda function or configure the intent to return the intent
     * information to the client application. If you use a Lambda function, when all of the intent information is
     * available, Amazon Lex invokes your Lambda function. If you configure your intent to return the intent information
     * to the client application.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify other optional information in the request, such as:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A confirmation prompt to ask the user to confirm an intent. For example, "Shall I order your pizza?"
     * </p>
     * </li>
     * <li>
     * <p>
     * A conclusion statement to send to the user after the intent has been fulfilled. For example,
     * "I placed your pizza order."
     * </p>
     * </li>
     * <li>
     * <p>
     * A follow-up prompt that asks the user for additional activity. For example, asking
     * "Do you want to order a drink with your pizza?"
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify an existing intent name to update the intent, Amazon Lex replaces the values in the
     * <code>$LATEST</code> version of the intent with the values in the request. Amazon Lex removes fields that you
     * don't provide in the request. If you don't specify the required fields, Amazon Lex throws an exception. When you
     * update the <code>$LATEST</code> version of an intent, the <code>status</code> field of any bot that uses the
     * <code>$LATEST</code> version of the intent is set to <code>NOT_BUILT</code>.
     * </p>
     * <p>
     * For more information, see <a>how-it-works</a>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:PutIntent</code> action.
     * </p>
     * 
     * @param putIntentRequest
     * @return Result of the PutIntent operation returned by the service.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws PreconditionFailedException
     *         The checksum of the resource that you are trying to change does not match the checksum in the request.
     *         Check the resource's checksum and try again.
     * @sample AmazonLexModelBuilding.PutIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutIntent" target="_top">AWS API
     *      Documentation</a>
     */
    PutIntentResult putIntent(PutIntentRequest putIntentRequest);

    /**
     * <p>
     * Creates a custom slot type or replaces an existing custom slot type.
     * </p>
     * <p>
     * To create a custom slot type, specify a name for the slot type and a set of enumeration values, which are the
     * values that a slot of this type can assume. For more information, see <a>how-it-works</a>.
     * </p>
     * <p>
     * If you specify the name of an existing slot type, the fields in the request replace the existing values in the
     * <code>$LATEST</code> version of the slot type. Amazon Lex removes the fields that you don't provide in the
     * request. If you don't specify required fields, Amazon Lex throws an exception. When you update the
     * <code>$LATEST</code> version of a slot type, if a bot uses the <code>$LATEST</code> version of an intent that
     * contains the slot type, the bot's <code>status</code> field is set to <code>NOT_BUILT</code>.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:PutSlotType</code> action.
     * </p>
     * 
     * @param putSlotTypeRequest
     * @return Result of the PutSlotType operation returned by the service.
     * @throws ConflictException
     *         There was a conflict processing the request. Try your request again.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @throws PreconditionFailedException
     *         The checksum of the resource that you are trying to change does not match the checksum in the request.
     *         Check the resource's checksum and try again.
     * @sample AmazonLexModelBuilding.PutSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutSlotType" target="_top">AWS API
     *      Documentation</a>
     */
    PutSlotTypeResult putSlotType(PutSlotTypeRequest putSlotTypeRequest);

    /**
     * <p>
     * Starts a job to import a resource to Amazon Lex.
     * </p>
     * 
     * @param startImportRequest
     * @return Result of the StartImport operation returned by the service.
     * @throws LimitExceededException
     *         The request exceeded a limit. Try your request again.
     * @throws InternalFailureException
     *         An internal Amazon Lex error occurred. Try your request again.
     * @throws BadRequestException
     *         The request is not well formed. For example, a value is invalid or a required field is missing. Check the
     *         field values, and try again.
     * @sample AmazonLexModelBuilding.StartImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/StartImport" target="_top">AWS API
     *      Documentation</a>
     */
    StartImportResult startImport(StartImportRequest startImportRequest);

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

}
