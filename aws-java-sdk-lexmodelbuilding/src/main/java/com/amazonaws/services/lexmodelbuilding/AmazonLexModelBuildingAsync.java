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

import com.amazonaws.services.lexmodelbuilding.model.*;

/**
 * Interface for accessing Amazon Lex Model Building Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lexmodelbuilding.AbstractAmazonLexModelBuildingAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Lex Build-Time Actions</fullname>
 * <p>
 * Amazon Lex is an AWS service for building conversational voice and text interfaces. Use these actions to create,
 * update, and delete conversational bots for new and existing client applications.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLexModelBuildingAsync extends AmazonLexModelBuilding {

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
     * @return A Java Future containing the result of the CreateBotVersion operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.CreateBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/CreateBotVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBotVersionResult> createBotVersionAsync(CreateBotVersionRequest createBotVersionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBotVersion operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.CreateBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/CreateBotVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBotVersionResult> createBotVersionAsync(CreateBotVersionRequest createBotVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBotVersionRequest, CreateBotVersionResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateIntentVersion operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.CreateIntentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/CreateIntentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateIntentVersionResult> createIntentVersionAsync(CreateIntentVersionRequest createIntentVersionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIntentVersion operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.CreateIntentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/CreateIntentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateIntentVersionResult> createIntentVersionAsync(CreateIntentVersionRequest createIntentVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIntentVersionRequest, CreateIntentVersionResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateSlotTypeVersion operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.CreateSlotTypeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/CreateSlotTypeVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSlotTypeVersionResult> createSlotTypeVersionAsync(CreateSlotTypeVersionRequest createSlotTypeVersionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSlotTypeVersion operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.CreateSlotTypeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/CreateSlotTypeVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSlotTypeVersionResult> createSlotTypeVersionAsync(CreateSlotTypeVersionRequest createSlotTypeVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSlotTypeVersionRequest, CreateSlotTypeVersionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteBot operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.DeleteBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotResult> deleteBotAsync(DeleteBotRequest deleteBotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBot operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.DeleteBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotResult> deleteBotAsync(DeleteBotRequest deleteBotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBotRequest, DeleteBotResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteBotAlias operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.DeleteBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBotAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotAliasResult> deleteBotAliasAsync(DeleteBotAliasRequest deleteBotAliasRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBotAlias operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.DeleteBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBotAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotAliasResult> deleteBotAliasAsync(DeleteBotAliasRequest deleteBotAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBotAliasRequest, DeleteBotAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes the association between an Amazon Lex bot and a messaging platform.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:DeleteBotChannelAssociation</code> action.
     * </p>
     * 
     * @param deleteBotChannelAssociationRequest
     * @return A Java Future containing the result of the DeleteBotChannelAssociation operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.DeleteBotChannelAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBotChannelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotChannelAssociationResult> deleteBotChannelAssociationAsync(
            DeleteBotChannelAssociationRequest deleteBotChannelAssociationRequest);

    /**
     * <p>
     * Deletes the association between an Amazon Lex bot and a messaging platform.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:DeleteBotChannelAssociation</code> action.
     * </p>
     * 
     * @param deleteBotChannelAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBotChannelAssociation operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.DeleteBotChannelAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBotChannelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotChannelAssociationResult> deleteBotChannelAssociationAsync(
            DeleteBotChannelAssociationRequest deleteBotChannelAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBotChannelAssociationRequest, DeleteBotChannelAssociationResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific version of a bot. To delete all versions of a bot, use the <a>DeleteBot</a> operation.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:DeleteBotVersion</code> action.
     * </p>
     * 
     * @param deleteBotVersionRequest
     * @return A Java Future containing the result of the DeleteBotVersion operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.DeleteBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBotVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotVersionResult> deleteBotVersionAsync(DeleteBotVersionRequest deleteBotVersionRequest);

    /**
     * <p>
     * Deletes a specific version of a bot. To delete all versions of a bot, use the <a>DeleteBot</a> operation.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:DeleteBotVersion</code> action.
     * </p>
     * 
     * @param deleteBotVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBotVersion operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.DeleteBotVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteBotVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBotVersionResult> deleteBotVersionAsync(DeleteBotVersionRequest deleteBotVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBotVersionRequest, DeleteBotVersionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteIntent operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.DeleteIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteIntent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIntentResult> deleteIntentAsync(DeleteIntentRequest deleteIntentRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIntent operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.DeleteIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteIntent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIntentResult> deleteIntentAsync(DeleteIntentRequest deleteIntentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIntentRequest, DeleteIntentResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteIntentVersion operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.DeleteIntentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteIntentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIntentVersionResult> deleteIntentVersionAsync(DeleteIntentVersionRequest deleteIntentVersionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIntentVersion operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.DeleteIntentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteIntentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIntentVersionResult> deleteIntentVersionAsync(DeleteIntentVersionRequest deleteIntentVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIntentVersionRequest, DeleteIntentVersionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteSlotType operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.DeleteSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteSlotType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlotTypeResult> deleteSlotTypeAsync(DeleteSlotTypeRequest deleteSlotTypeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSlotType operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.DeleteSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteSlotType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlotTypeResult> deleteSlotTypeAsync(DeleteSlotTypeRequest deleteSlotTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSlotTypeRequest, DeleteSlotTypeResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteSlotTypeVersion operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.DeleteSlotTypeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteSlotTypeVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlotTypeVersionResult> deleteSlotTypeVersionAsync(DeleteSlotTypeVersionRequest deleteSlotTypeVersionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSlotTypeVersion operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.DeleteSlotTypeVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteSlotTypeVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSlotTypeVersionResult> deleteSlotTypeVersionAsync(DeleteSlotTypeVersionRequest deleteSlotTypeVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSlotTypeVersionRequest, DeleteSlotTypeVersionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteUtterances operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.DeleteUtterances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteUtterances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUtterancesResult> deleteUtterancesAsync(DeleteUtterancesRequest deleteUtterancesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUtterances operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.DeleteUtterances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteUtterances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUtterancesResult> deleteUtterancesAsync(DeleteUtterancesRequest deleteUtterancesRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUtterancesRequest, DeleteUtterancesResult> asyncHandler);

    /**
     * <p>
     * Returns metadata information for a specific bot. You must provide the bot name and the bot version or alias.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBot</code> action.
     * </p>
     * 
     * @param getBotRequest
     * @return A Java Future containing the result of the GetBot operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBotResult> getBotAsync(GetBotRequest getBotRequest);

    /**
     * <p>
     * Returns metadata information for a specific bot. You must provide the bot name and the bot version or alias.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBot</code> action.
     * </p>
     * 
     * @param getBotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBot operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBotResult> getBotAsync(GetBotRequest getBotRequest,
            com.amazonaws.handlers.AsyncHandler<GetBotRequest, GetBotResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetBotAlias operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBotAliasResult> getBotAliasAsync(GetBotAliasRequest getBotAliasRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBotAlias operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBotAliasResult> getBotAliasAsync(GetBotAliasRequest getBotAliasRequest,
            com.amazonaws.handlers.AsyncHandler<GetBotAliasRequest, GetBotAliasResult> asyncHandler);

    /**
     * <p>
     * Returns a list of aliases for a specified Amazon Lex bot.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBotAliases</code> action.
     * </p>
     * 
     * @param getBotAliasesRequest
     * @return A Java Future containing the result of the GetBotAliases operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetBotAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBotAliasesResult> getBotAliasesAsync(GetBotAliasesRequest getBotAliasesRequest);

    /**
     * <p>
     * Returns a list of aliases for a specified Amazon Lex bot.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBotAliases</code> action.
     * </p>
     * 
     * @param getBotAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBotAliases operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetBotAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBotAliasesResult> getBotAliasesAsync(GetBotAliasesRequest getBotAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<GetBotAliasesRequest, GetBotAliasesResult> asyncHandler);

    /**
     * <p>
     * Returns information about the association between an Amazon Lex bot and a messaging platform.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBotChannelAssociation</code> action.
     * </p>
     * 
     * @param getBotChannelAssociationRequest
     * @return A Java Future containing the result of the GetBotChannelAssociation operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetBotChannelAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotChannelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBotChannelAssociationResult> getBotChannelAssociationAsync(GetBotChannelAssociationRequest getBotChannelAssociationRequest);

    /**
     * <p>
     * Returns information about the association between an Amazon Lex bot and a messaging platform.
     * </p>
     * <p>
     * This operation requires permissions for the <code>lex:GetBotChannelAssociation</code> action.
     * </p>
     * 
     * @param getBotChannelAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBotChannelAssociation operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetBotChannelAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotChannelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBotChannelAssociationResult> getBotChannelAssociationAsync(GetBotChannelAssociationRequest getBotChannelAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetBotChannelAssociationRequest, GetBotChannelAssociationResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetBotChannelAssociations operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetBotChannelAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotChannelAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBotChannelAssociationsResult> getBotChannelAssociationsAsync(
            GetBotChannelAssociationsRequest getBotChannelAssociationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBotChannelAssociations operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetBotChannelAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotChannelAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBotChannelAssociationsResult> getBotChannelAssociationsAsync(
            GetBotChannelAssociationsRequest getBotChannelAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBotChannelAssociationsRequest, GetBotChannelAssociationsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetBotVersions operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetBotVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBotVersionsResult> getBotVersionsAsync(GetBotVersionsRequest getBotVersionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBotVersions operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetBotVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBotVersionsResult> getBotVersionsAsync(GetBotVersionsRequest getBotVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBotVersionsRequest, GetBotVersionsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetBots operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBotsResult> getBotsAsync(GetBotsRequest getBotsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBots operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBotsResult> getBotsAsync(GetBotsRequest getBotsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBotsRequest, GetBotsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a built-in intent.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:GetBuiltinIntent</code> action.
     * </p>
     * 
     * @param getBuiltinIntentRequest
     * @return A Java Future containing the result of the GetBuiltinIntent operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetBuiltinIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinIntent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBuiltinIntentResult> getBuiltinIntentAsync(GetBuiltinIntentRequest getBuiltinIntentRequest);

    /**
     * <p>
     * Returns information about a built-in intent.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:GetBuiltinIntent</code> action.
     * </p>
     * 
     * @param getBuiltinIntentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBuiltinIntent operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetBuiltinIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinIntent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBuiltinIntentResult> getBuiltinIntentAsync(GetBuiltinIntentRequest getBuiltinIntentRequest,
            com.amazonaws.handlers.AsyncHandler<GetBuiltinIntentRequest, GetBuiltinIntentResult> asyncHandler);

    /**
     * <p>
     * Gets a list of built-in intents that meet the specified criteria.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:GetBuiltinIntents</code> action.
     * </p>
     * 
     * @param getBuiltinIntentsRequest
     * @return A Java Future containing the result of the GetBuiltinIntents operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetBuiltinIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinIntents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBuiltinIntentsResult> getBuiltinIntentsAsync(GetBuiltinIntentsRequest getBuiltinIntentsRequest);

    /**
     * <p>
     * Gets a list of built-in intents that meet the specified criteria.
     * </p>
     * <p>
     * This operation requires permission for the <code>lex:GetBuiltinIntents</code> action.
     * </p>
     * 
     * @param getBuiltinIntentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBuiltinIntents operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetBuiltinIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinIntents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBuiltinIntentsResult> getBuiltinIntentsAsync(GetBuiltinIntentsRequest getBuiltinIntentsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBuiltinIntentsRequest, GetBuiltinIntentsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetBuiltinSlotTypes operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetBuiltinSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinSlotTypes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBuiltinSlotTypesResult> getBuiltinSlotTypesAsync(GetBuiltinSlotTypesRequest getBuiltinSlotTypesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBuiltinSlotTypes operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetBuiltinSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinSlotTypes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBuiltinSlotTypesResult> getBuiltinSlotTypesAsync(GetBuiltinSlotTypesRequest getBuiltinSlotTypesRequest,
            com.amazonaws.handlers.AsyncHandler<GetBuiltinSlotTypesRequest, GetBuiltinSlotTypesResult> asyncHandler);

    /**
     * <p>
     * Exports the contents of a Amazon Lex resource in a specified format.
     * </p>
     * 
     * @param getExportRequest
     * @return A Java Future containing the result of the GetExport operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetExport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExportResult> getExportAsync(GetExportRequest getExportRequest);

    /**
     * <p>
     * Exports the contents of a Amazon Lex resource in a specified format.
     * </p>
     * 
     * @param getExportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExport operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetExport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExportResult> getExportAsync(GetExportRequest getExportRequest,
            com.amazonaws.handlers.AsyncHandler<GetExportRequest, GetExportResult> asyncHandler);

    /**
     * <p>
     * Gets information about an import job started with the <code>StartImport</code> operation.
     * </p>
     * 
     * @param getImportRequest
     * @return A Java Future containing the result of the GetImport operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImportResult> getImportAsync(GetImportRequest getImportRequest);

    /**
     * <p>
     * Gets information about an import job started with the <code>StartImport</code> operation.
     * </p>
     * 
     * @param getImportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImport operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImportResult> getImportAsync(GetImportRequest getImportRequest,
            com.amazonaws.handlers.AsyncHandler<GetImportRequest, GetImportResult> asyncHandler);

    /**
     * <p>
     * Returns information about an intent. In addition to the intent name, you must specify the intent version.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lex:GetIntent</code> action.
     * </p>
     * 
     * @param getIntentRequest
     * @return A Java Future containing the result of the GetIntent operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetIntent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIntentResult> getIntentAsync(GetIntentRequest getIntentRequest);

    /**
     * <p>
     * Returns information about an intent. In addition to the intent name, you must specify the intent version.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lex:GetIntent</code> action.
     * </p>
     * 
     * @param getIntentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIntent operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetIntent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIntentResult> getIntentAsync(GetIntentRequest getIntentRequest,
            com.amazonaws.handlers.AsyncHandler<GetIntentRequest, GetIntentResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetIntentVersions operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetIntentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetIntentVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetIntentVersionsResult> getIntentVersionsAsync(GetIntentVersionsRequest getIntentVersionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIntentVersions operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetIntentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetIntentVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetIntentVersionsResult> getIntentVersionsAsync(GetIntentVersionsRequest getIntentVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetIntentVersionsRequest, GetIntentVersionsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetIntents operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetIntents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIntentsResult> getIntentsAsync(GetIntentsRequest getIntentsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIntents operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetIntents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetIntents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIntentsResult> getIntentsAsync(GetIntentsRequest getIntentsRequest,
            com.amazonaws.handlers.AsyncHandler<GetIntentsRequest, GetIntentsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSlotType operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetSlotType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSlotTypeResult> getSlotTypeAsync(GetSlotTypeRequest getSlotTypeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSlotType operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetSlotType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSlotTypeResult> getSlotTypeAsync(GetSlotTypeRequest getSlotTypeRequest,
            com.amazonaws.handlers.AsyncHandler<GetSlotTypeRequest, GetSlotTypeResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSlotTypeVersions operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetSlotTypeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetSlotTypeVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSlotTypeVersionsResult> getSlotTypeVersionsAsync(GetSlotTypeVersionsRequest getSlotTypeVersionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSlotTypeVersions operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetSlotTypeVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetSlotTypeVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSlotTypeVersionsResult> getSlotTypeVersionsAsync(GetSlotTypeVersionsRequest getSlotTypeVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSlotTypeVersionsRequest, GetSlotTypeVersionsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSlotTypes operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetSlotTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSlotTypesResult> getSlotTypesAsync(GetSlotTypesRequest getSlotTypesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSlotTypes operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetSlotTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetSlotTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSlotTypesResult> getSlotTypesAsync(GetSlotTypesRequest getSlotTypesRequest,
            com.amazonaws.handlers.AsyncHandler<GetSlotTypesRequest, GetSlotTypesResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetUtterancesView operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.GetUtterancesView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetUtterancesView" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUtterancesViewResult> getUtterancesViewAsync(GetUtterancesViewRequest getUtterancesViewRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUtterancesView operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.GetUtterancesView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetUtterancesView" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUtterancesViewResult> getUtterancesViewAsync(GetUtterancesViewRequest getUtterancesViewRequest,
            com.amazonaws.handlers.AsyncHandler<GetUtterancesViewRequest, GetUtterancesViewResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutBot operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.PutBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutBotResult> putBotAsync(PutBotRequest putBotRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutBot operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.PutBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutBotResult> putBotAsync(PutBotRequest putBotRequest,
            com.amazonaws.handlers.AsyncHandler<PutBotRequest, PutBotResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutBotAlias operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.PutBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutBotAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutBotAliasResult> putBotAliasAsync(PutBotAliasRequest putBotAliasRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutBotAlias operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.PutBotAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutBotAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutBotAliasResult> putBotAliasAsync(PutBotAliasRequest putBotAliasRequest,
            com.amazonaws.handlers.AsyncHandler<PutBotAliasRequest, PutBotAliasResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutIntent operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.PutIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutIntent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutIntentResult> putIntentAsync(PutIntentRequest putIntentRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutIntent operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.PutIntent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutIntent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutIntentResult> putIntentAsync(PutIntentRequest putIntentRequest,
            com.amazonaws.handlers.AsyncHandler<PutIntentRequest, PutIntentResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutSlotType operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.PutSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutSlotType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutSlotTypeResult> putSlotTypeAsync(PutSlotTypeRequest putSlotTypeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSlotType operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.PutSlotType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutSlotType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutSlotTypeResult> putSlotTypeAsync(PutSlotTypeRequest putSlotTypeRequest,
            com.amazonaws.handlers.AsyncHandler<PutSlotTypeRequest, PutSlotTypeResult> asyncHandler);

    /**
     * <p>
     * Starts a job to import a resource to Amazon Lex.
     * </p>
     * 
     * @param startImportRequest
     * @return A Java Future containing the result of the StartImport operation returned by the service.
     * @sample AmazonLexModelBuildingAsync.StartImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/StartImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartImportResult> startImportAsync(StartImportRequest startImportRequest);

    /**
     * <p>
     * Starts a job to import a resource to Amazon Lex.
     * </p>
     * 
     * @param startImportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartImport operation returned by the service.
     * @sample AmazonLexModelBuildingAsyncHandler.StartImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/StartImport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartImportResult> startImportAsync(StartImportRequest startImportRequest,
            com.amazonaws.handlers.AsyncHandler<StartImportRequest, StartImportResult> asyncHandler);

}
