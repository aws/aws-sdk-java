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
package com.amazonaws.services.cleanrooms;

import javax.annotation.Generated;

import com.amazonaws.services.cleanrooms.model.*;

/**
 * Interface for accessing AWS Clean Rooms Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cleanrooms.AbstractAWSCleanRoomsAsync} instead.
 * </p>
 * <p>
 * <p>
 * Welcome to the <i>Clean Rooms API Reference</i>.
 * </p>
 * <p>
 * Clean Rooms is an Amazon Web Services service that helps multiple parties to join their data together in a secure
 * collaboration workspace. In the collaboration, members who can query and receive results can get insights into the
 * collective datasets without either party getting access to the other party's raw data.
 * </p>
 * <p>
 * To learn more about Clean Rooms concepts, procedures, and best practices, see the <a
 * href="https://docs.aws.amazon.com/clean-rooms/latest/userguide/what-is.html">Clean Rooms User Guide</a>.
 * </p>
 * <p>
 * To learn more about SQL commands, functions, and conditions supported in Clean Rooms, see the <a
 * href="https://docs.aws.amazon.com/clean-rooms/latest/sql-reference/sql-reference.html">Clean Rooms SQL Reference</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCleanRoomsAsync extends AWSCleanRooms {

    /**
     * <p>
     * Retrieves multiple analysis templates within a collaboration by their Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param batchGetCollaborationAnalysisTemplateRequest
     * @return A Java Future containing the result of the BatchGetCollaborationAnalysisTemplate operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsync.BatchGetCollaborationAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetCollaborationAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetCollaborationAnalysisTemplateResult> batchGetCollaborationAnalysisTemplateAsync(
            BatchGetCollaborationAnalysisTemplateRequest batchGetCollaborationAnalysisTemplateRequest);

    /**
     * <p>
     * Retrieves multiple analysis templates within a collaboration by their Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param batchGetCollaborationAnalysisTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetCollaborationAnalysisTemplate operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsyncHandler.BatchGetCollaborationAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetCollaborationAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetCollaborationAnalysisTemplateResult> batchGetCollaborationAnalysisTemplateAsync(
            BatchGetCollaborationAnalysisTemplateRequest batchGetCollaborationAnalysisTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetCollaborationAnalysisTemplateRequest, BatchGetCollaborationAnalysisTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieves multiple schemas by their identifiers.
     * </p>
     * 
     * @param batchGetSchemaRequest
     * @return A Java Future containing the result of the BatchGetSchema operation returned by the service.
     * @sample AWSCleanRoomsAsync.BatchGetSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetSchemaResult> batchGetSchemaAsync(BatchGetSchemaRequest batchGetSchemaRequest);

    /**
     * <p>
     * Retrieves multiple schemas by their identifiers.
     * </p>
     * 
     * @param batchGetSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetSchema operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.BatchGetSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetSchemaResult> batchGetSchemaAsync(BatchGetSchemaRequest batchGetSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetSchemaRequest, BatchGetSchemaResult> asyncHandler);

    /**
     * <p>
     * Retrieves multiple analysis rule schemas.
     * </p>
     * 
     * @param batchGetSchemaAnalysisRuleRequest
     * @return A Java Future containing the result of the BatchGetSchemaAnalysisRule operation returned by the service.
     * @sample AWSCleanRoomsAsync.BatchGetSchemaAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetSchemaAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetSchemaAnalysisRuleResult> batchGetSchemaAnalysisRuleAsync(
            BatchGetSchemaAnalysisRuleRequest batchGetSchemaAnalysisRuleRequest);

    /**
     * <p>
     * Retrieves multiple analysis rule schemas.
     * </p>
     * 
     * @param batchGetSchemaAnalysisRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetSchemaAnalysisRule operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.BatchGetSchemaAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetSchemaAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetSchemaAnalysisRuleResult> batchGetSchemaAnalysisRuleAsync(
            BatchGetSchemaAnalysisRuleRequest batchGetSchemaAnalysisRuleRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetSchemaAnalysisRuleRequest, BatchGetSchemaAnalysisRuleResult> asyncHandler);

    /**
     * <p>
     * Creates a new analysis template.
     * </p>
     * 
     * @param createAnalysisTemplateRequest
     * @return A Java Future containing the result of the CreateAnalysisTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsync.CreateAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAnalysisTemplateResult> createAnalysisTemplateAsync(CreateAnalysisTemplateRequest createAnalysisTemplateRequest);

    /**
     * <p>
     * Creates a new analysis template.
     * </p>
     * 
     * @param createAnalysisTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAnalysisTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.CreateAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAnalysisTemplateResult> createAnalysisTemplateAsync(CreateAnalysisTemplateRequest createAnalysisTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAnalysisTemplateRequest, CreateAnalysisTemplateResult> asyncHandler);

    /**
     * <p>
     * Creates a new collaboration.
     * </p>
     * 
     * @param createCollaborationRequest
     * @return A Java Future containing the result of the CreateCollaboration operation returned by the service.
     * @sample AWSCleanRoomsAsync.CreateCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCollaborationResult> createCollaborationAsync(CreateCollaborationRequest createCollaborationRequest);

    /**
     * <p>
     * Creates a new collaboration.
     * </p>
     * 
     * @param createCollaborationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCollaboration operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.CreateCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCollaborationResult> createCollaborationAsync(CreateCollaborationRequest createCollaborationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCollaborationRequest, CreateCollaborationResult> asyncHandler);

    /**
     * <p>
     * Provides the details necessary to create a configured audience model association.
     * </p>
     * 
     * @param createConfiguredAudienceModelAssociationRequest
     * @return A Java Future containing the result of the CreateConfiguredAudienceModelAssociation operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsync.CreateConfiguredAudienceModelAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredAudienceModelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfiguredAudienceModelAssociationResult> createConfiguredAudienceModelAssociationAsync(
            CreateConfiguredAudienceModelAssociationRequest createConfiguredAudienceModelAssociationRequest);

    /**
     * <p>
     * Provides the details necessary to create a configured audience model association.
     * </p>
     * 
     * @param createConfiguredAudienceModelAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfiguredAudienceModelAssociation operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsyncHandler.CreateConfiguredAudienceModelAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredAudienceModelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfiguredAudienceModelAssociationResult> createConfiguredAudienceModelAssociationAsync(
            CreateConfiguredAudienceModelAssociationRequest createConfiguredAudienceModelAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfiguredAudienceModelAssociationRequest, CreateConfiguredAudienceModelAssociationResult> asyncHandler);

    /**
     * <p>
     * Creates a new configured table resource.
     * </p>
     * 
     * @param createConfiguredTableRequest
     * @return A Java Future containing the result of the CreateConfiguredTable operation returned by the service.
     * @sample AWSCleanRoomsAsync.CreateConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTable"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfiguredTableResult> createConfiguredTableAsync(CreateConfiguredTableRequest createConfiguredTableRequest);

    /**
     * <p>
     * Creates a new configured table resource.
     * </p>
     * 
     * @param createConfiguredTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfiguredTable operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.CreateConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTable"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfiguredTableResult> createConfiguredTableAsync(CreateConfiguredTableRequest createConfiguredTableRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfiguredTableRequest, CreateConfiguredTableResult> asyncHandler);

    /**
     * <p>
     * Creates a new analysis rule for a configured table. Currently, only one analysis rule can be created for a given
     * configured table.
     * </p>
     * 
     * @param createConfiguredTableAnalysisRuleRequest
     * @return A Java Future containing the result of the CreateConfiguredTableAnalysisRule operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsync.CreateConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfiguredTableAnalysisRuleResult> createConfiguredTableAnalysisRuleAsync(
            CreateConfiguredTableAnalysisRuleRequest createConfiguredTableAnalysisRuleRequest);

    /**
     * <p>
     * Creates a new analysis rule for a configured table. Currently, only one analysis rule can be created for a given
     * configured table.
     * </p>
     * 
     * @param createConfiguredTableAnalysisRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfiguredTableAnalysisRule operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsyncHandler.CreateConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfiguredTableAnalysisRuleResult> createConfiguredTableAnalysisRuleAsync(
            CreateConfiguredTableAnalysisRuleRequest createConfiguredTableAnalysisRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfiguredTableAnalysisRuleRequest, CreateConfiguredTableAnalysisRuleResult> asyncHandler);

    /**
     * <p>
     * Creates a configured table association. A configured table association links a configured table with a
     * collaboration.
     * </p>
     * 
     * @param createConfiguredTableAssociationRequest
     * @return A Java Future containing the result of the CreateConfiguredTableAssociation operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsync.CreateConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfiguredTableAssociationResult> createConfiguredTableAssociationAsync(
            CreateConfiguredTableAssociationRequest createConfiguredTableAssociationRequest);

    /**
     * <p>
     * Creates a configured table association. A configured table association links a configured table with a
     * collaboration.
     * </p>
     * 
     * @param createConfiguredTableAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfiguredTableAssociation operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsyncHandler.CreateConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfiguredTableAssociationResult> createConfiguredTableAssociationAsync(
            CreateConfiguredTableAssociationRequest createConfiguredTableAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfiguredTableAssociationRequest, CreateConfiguredTableAssociationResult> asyncHandler);

    /**
     * <p>
     * Creates a membership for a specific collaboration identifier and joins the collaboration.
     * </p>
     * 
     * @param createMembershipRequest
     * @return A Java Future containing the result of the CreateMembership operation returned by the service.
     * @sample AWSCleanRoomsAsync.CreateMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateMembership" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateMembershipResult> createMembershipAsync(CreateMembershipRequest createMembershipRequest);

    /**
     * <p>
     * Creates a membership for a specific collaboration identifier and joins the collaboration.
     * </p>
     * 
     * @param createMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMembership operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.CreateMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateMembership" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateMembershipResult> createMembershipAsync(CreateMembershipRequest createMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMembershipRequest, CreateMembershipResult> asyncHandler);

    /**
     * <p>
     * Creates a privacy budget template for a specified membership. Each membership can have only one privacy budget
     * template, but it can be deleted and recreated. If you need to change the privacy budget template for a
     * membership, use the <a>UpdatePrivacyBudgetTemplate</a> operation.
     * </p>
     * 
     * @param createPrivacyBudgetTemplateRequest
     * @return A Java Future containing the result of the CreatePrivacyBudgetTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsync.CreatePrivacyBudgetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreatePrivacyBudgetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePrivacyBudgetTemplateResult> createPrivacyBudgetTemplateAsync(
            CreatePrivacyBudgetTemplateRequest createPrivacyBudgetTemplateRequest);

    /**
     * <p>
     * Creates a privacy budget template for a specified membership. Each membership can have only one privacy budget
     * template, but it can be deleted and recreated. If you need to change the privacy budget template for a
     * membership, use the <a>UpdatePrivacyBudgetTemplate</a> operation.
     * </p>
     * 
     * @param createPrivacyBudgetTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePrivacyBudgetTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.CreatePrivacyBudgetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreatePrivacyBudgetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePrivacyBudgetTemplateResult> createPrivacyBudgetTemplateAsync(
            CreatePrivacyBudgetTemplateRequest createPrivacyBudgetTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePrivacyBudgetTemplateRequest, CreatePrivacyBudgetTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes an analysis template.
     * </p>
     * 
     * @param deleteAnalysisTemplateRequest
     * @return A Java Future containing the result of the DeleteAnalysisTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsync.DeleteAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnalysisTemplateResult> deleteAnalysisTemplateAsync(DeleteAnalysisTemplateRequest deleteAnalysisTemplateRequest);

    /**
     * <p>
     * Deletes an analysis template.
     * </p>
     * 
     * @param deleteAnalysisTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAnalysisTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.DeleteAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAnalysisTemplateResult> deleteAnalysisTemplateAsync(DeleteAnalysisTemplateRequest deleteAnalysisTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAnalysisTemplateRequest, DeleteAnalysisTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes a collaboration. It can only be called by the collaboration owner.
     * </p>
     * 
     * @param deleteCollaborationRequest
     * @return A Java Future containing the result of the DeleteCollaboration operation returned by the service.
     * @sample AWSCleanRoomsAsync.DeleteCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCollaborationResult> deleteCollaborationAsync(DeleteCollaborationRequest deleteCollaborationRequest);

    /**
     * <p>
     * Deletes a collaboration. It can only be called by the collaboration owner.
     * </p>
     * 
     * @param deleteCollaborationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCollaboration operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.DeleteCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCollaborationResult> deleteCollaborationAsync(DeleteCollaborationRequest deleteCollaborationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCollaborationRequest, DeleteCollaborationResult> asyncHandler);

    /**
     * <p>
     * Provides the information necessary to delete a configured audience model association.
     * </p>
     * 
     * @param deleteConfiguredAudienceModelAssociationRequest
     * @return A Java Future containing the result of the DeleteConfiguredAudienceModelAssociation operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsync.DeleteConfiguredAudienceModelAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredAudienceModelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfiguredAudienceModelAssociationResult> deleteConfiguredAudienceModelAssociationAsync(
            DeleteConfiguredAudienceModelAssociationRequest deleteConfiguredAudienceModelAssociationRequest);

    /**
     * <p>
     * Provides the information necessary to delete a configured audience model association.
     * </p>
     * 
     * @param deleteConfiguredAudienceModelAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfiguredAudienceModelAssociation operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsyncHandler.DeleteConfiguredAudienceModelAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredAudienceModelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfiguredAudienceModelAssociationResult> deleteConfiguredAudienceModelAssociationAsync(
            DeleteConfiguredAudienceModelAssociationRequest deleteConfiguredAudienceModelAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfiguredAudienceModelAssociationRequest, DeleteConfiguredAudienceModelAssociationResult> asyncHandler);

    /**
     * <p>
     * Deletes a configured table.
     * </p>
     * 
     * @param deleteConfiguredTableRequest
     * @return A Java Future containing the result of the DeleteConfiguredTable operation returned by the service.
     * @sample AWSCleanRoomsAsync.DeleteConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredTable"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfiguredTableResult> deleteConfiguredTableAsync(DeleteConfiguredTableRequest deleteConfiguredTableRequest);

    /**
     * <p>
     * Deletes a configured table.
     * </p>
     * 
     * @param deleteConfiguredTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfiguredTable operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.DeleteConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredTable"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfiguredTableResult> deleteConfiguredTableAsync(DeleteConfiguredTableRequest deleteConfiguredTableRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfiguredTableRequest, DeleteConfiguredTableResult> asyncHandler);

    /**
     * <p>
     * Deletes a configured table analysis rule.
     * </p>
     * 
     * @param deleteConfiguredTableAnalysisRuleRequest
     * @return A Java Future containing the result of the DeleteConfiguredTableAnalysisRule operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsync.DeleteConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfiguredTableAnalysisRuleResult> deleteConfiguredTableAnalysisRuleAsync(
            DeleteConfiguredTableAnalysisRuleRequest deleteConfiguredTableAnalysisRuleRequest);

    /**
     * <p>
     * Deletes a configured table analysis rule.
     * </p>
     * 
     * @param deleteConfiguredTableAnalysisRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfiguredTableAnalysisRule operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsyncHandler.DeleteConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfiguredTableAnalysisRuleResult> deleteConfiguredTableAnalysisRuleAsync(
            DeleteConfiguredTableAnalysisRuleRequest deleteConfiguredTableAnalysisRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfiguredTableAnalysisRuleRequest, DeleteConfiguredTableAnalysisRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes a configured table association.
     * </p>
     * 
     * @param deleteConfiguredTableAssociationRequest
     * @return A Java Future containing the result of the DeleteConfiguredTableAssociation operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsync.DeleteConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfiguredTableAssociationResult> deleteConfiguredTableAssociationAsync(
            DeleteConfiguredTableAssociationRequest deleteConfiguredTableAssociationRequest);

    /**
     * <p>
     * Deletes a configured table association.
     * </p>
     * 
     * @param deleteConfiguredTableAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfiguredTableAssociation operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsyncHandler.DeleteConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfiguredTableAssociationResult> deleteConfiguredTableAssociationAsync(
            DeleteConfiguredTableAssociationRequest deleteConfiguredTableAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfiguredTableAssociationRequest, DeleteConfiguredTableAssociationResult> asyncHandler);

    /**
     * <p>
     * Removes the specified member from a collaboration. The removed member is placed in the Removed status and can't
     * interact with the collaboration. The removed member's data is inaccessible to active members of the
     * collaboration.
     * </p>
     * 
     * @param deleteMemberRequest
     * @return A Java Future containing the result of the DeleteMember operation returned by the service.
     * @sample AWSCleanRoomsAsync.DeleteMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(DeleteMemberRequest deleteMemberRequest);

    /**
     * <p>
     * Removes the specified member from a collaboration. The removed member is placed in the Removed status and can't
     * interact with the collaboration. The removed member's data is inaccessible to active members of the
     * collaboration.
     * </p>
     * 
     * @param deleteMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMember operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.DeleteMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(DeleteMemberRequest deleteMemberRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMemberRequest, DeleteMemberResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified membership. All resources under a membership must be deleted.
     * </p>
     * 
     * @param deleteMembershipRequest
     * @return A Java Future containing the result of the DeleteMembership operation returned by the service.
     * @sample AWSCleanRoomsAsync.DeleteMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteMembership" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMembershipResult> deleteMembershipAsync(DeleteMembershipRequest deleteMembershipRequest);

    /**
     * <p>
     * Deletes a specified membership. All resources under a membership must be deleted.
     * </p>
     * 
     * @param deleteMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMembership operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.DeleteMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteMembership" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMembershipResult> deleteMembershipAsync(DeleteMembershipRequest deleteMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMembershipRequest, DeleteMembershipResult> asyncHandler);

    /**
     * <p>
     * Deletes a privacy budget template for a specified membership.
     * </p>
     * 
     * @param deletePrivacyBudgetTemplateRequest
     * @return A Java Future containing the result of the DeletePrivacyBudgetTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsync.DeletePrivacyBudgetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeletePrivacyBudgetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePrivacyBudgetTemplateResult> deletePrivacyBudgetTemplateAsync(
            DeletePrivacyBudgetTemplateRequest deletePrivacyBudgetTemplateRequest);

    /**
     * <p>
     * Deletes a privacy budget template for a specified membership.
     * </p>
     * 
     * @param deletePrivacyBudgetTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePrivacyBudgetTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.DeletePrivacyBudgetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeletePrivacyBudgetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePrivacyBudgetTemplateResult> deletePrivacyBudgetTemplateAsync(
            DeletePrivacyBudgetTemplateRequest deletePrivacyBudgetTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePrivacyBudgetTemplateRequest, DeletePrivacyBudgetTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieves an analysis template.
     * </p>
     * 
     * @param getAnalysisTemplateRequest
     * @return A Java Future containing the result of the GetAnalysisTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsync.GetAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetAnalysisTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAnalysisTemplateResult> getAnalysisTemplateAsync(GetAnalysisTemplateRequest getAnalysisTemplateRequest);

    /**
     * <p>
     * Retrieves an analysis template.
     * </p>
     * 
     * @param getAnalysisTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAnalysisTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.GetAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetAnalysisTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAnalysisTemplateResult> getAnalysisTemplateAsync(GetAnalysisTemplateRequest getAnalysisTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetAnalysisTemplateRequest, GetAnalysisTemplateResult> asyncHandler);

    /**
     * <p>
     * Returns metadata about a collaboration.
     * </p>
     * 
     * @param getCollaborationRequest
     * @return A Java Future containing the result of the GetCollaboration operation returned by the service.
     * @sample AWSCleanRoomsAsync.GetCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCollaborationResult> getCollaborationAsync(GetCollaborationRequest getCollaborationRequest);

    /**
     * <p>
     * Returns metadata about a collaboration.
     * </p>
     * 
     * @param getCollaborationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCollaboration operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.GetCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCollaborationResult> getCollaborationAsync(GetCollaborationRequest getCollaborationRequest,
            com.amazonaws.handlers.AsyncHandler<GetCollaborationRequest, GetCollaborationResult> asyncHandler);

    /**
     * <p>
     * Retrieves an analysis template within a collaboration.
     * </p>
     * 
     * @param getCollaborationAnalysisTemplateRequest
     * @return A Java Future containing the result of the GetCollaborationAnalysisTemplate operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsync.GetCollaborationAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaborationAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCollaborationAnalysisTemplateResult> getCollaborationAnalysisTemplateAsync(
            GetCollaborationAnalysisTemplateRequest getCollaborationAnalysisTemplateRequest);

    /**
     * <p>
     * Retrieves an analysis template within a collaboration.
     * </p>
     * 
     * @param getCollaborationAnalysisTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCollaborationAnalysisTemplate operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsyncHandler.GetCollaborationAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaborationAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCollaborationAnalysisTemplateResult> getCollaborationAnalysisTemplateAsync(
            GetCollaborationAnalysisTemplateRequest getCollaborationAnalysisTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetCollaborationAnalysisTemplateRequest, GetCollaborationAnalysisTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieves a configured audience model association within a collaboration.
     * </p>
     * 
     * @param getCollaborationConfiguredAudienceModelAssociationRequest
     * @return A Java Future containing the result of the GetCollaborationConfiguredAudienceModelAssociation operation
     *         returned by the service.
     * @sample AWSCleanRoomsAsync.GetCollaborationConfiguredAudienceModelAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaborationConfiguredAudienceModelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCollaborationConfiguredAudienceModelAssociationResult> getCollaborationConfiguredAudienceModelAssociationAsync(
            GetCollaborationConfiguredAudienceModelAssociationRequest getCollaborationConfiguredAudienceModelAssociationRequest);

    /**
     * <p>
     * Retrieves a configured audience model association within a collaboration.
     * </p>
     * 
     * @param getCollaborationConfiguredAudienceModelAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCollaborationConfiguredAudienceModelAssociation operation
     *         returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.GetCollaborationConfiguredAudienceModelAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaborationConfiguredAudienceModelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCollaborationConfiguredAudienceModelAssociationResult> getCollaborationConfiguredAudienceModelAssociationAsync(
            GetCollaborationConfiguredAudienceModelAssociationRequest getCollaborationConfiguredAudienceModelAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetCollaborationConfiguredAudienceModelAssociationRequest, GetCollaborationConfiguredAudienceModelAssociationResult> asyncHandler);

    /**
     * <p>
     * Returns details about a specified privacy budget template.
     * </p>
     * 
     * @param getCollaborationPrivacyBudgetTemplateRequest
     * @return A Java Future containing the result of the GetCollaborationPrivacyBudgetTemplate operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsync.GetCollaborationPrivacyBudgetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaborationPrivacyBudgetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCollaborationPrivacyBudgetTemplateResult> getCollaborationPrivacyBudgetTemplateAsync(
            GetCollaborationPrivacyBudgetTemplateRequest getCollaborationPrivacyBudgetTemplateRequest);

    /**
     * <p>
     * Returns details about a specified privacy budget template.
     * </p>
     * 
     * @param getCollaborationPrivacyBudgetTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCollaborationPrivacyBudgetTemplate operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsyncHandler.GetCollaborationPrivacyBudgetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaborationPrivacyBudgetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCollaborationPrivacyBudgetTemplateResult> getCollaborationPrivacyBudgetTemplateAsync(
            GetCollaborationPrivacyBudgetTemplateRequest getCollaborationPrivacyBudgetTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetCollaborationPrivacyBudgetTemplateRequest, GetCollaborationPrivacyBudgetTemplateResult> asyncHandler);

    /**
     * <p>
     * Returns information about a configured audience model association.
     * </p>
     * 
     * @param getConfiguredAudienceModelAssociationRequest
     * @return A Java Future containing the result of the GetConfiguredAudienceModelAssociation operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsync.GetConfiguredAudienceModelAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetConfiguredAudienceModelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfiguredAudienceModelAssociationResult> getConfiguredAudienceModelAssociationAsync(
            GetConfiguredAudienceModelAssociationRequest getConfiguredAudienceModelAssociationRequest);

    /**
     * <p>
     * Returns information about a configured audience model association.
     * </p>
     * 
     * @param getConfiguredAudienceModelAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfiguredAudienceModelAssociation operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsyncHandler.GetConfiguredAudienceModelAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetConfiguredAudienceModelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfiguredAudienceModelAssociationResult> getConfiguredAudienceModelAssociationAsync(
            GetConfiguredAudienceModelAssociationRequest getConfiguredAudienceModelAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfiguredAudienceModelAssociationRequest, GetConfiguredAudienceModelAssociationResult> asyncHandler);

    /**
     * <p>
     * Retrieves a configured table.
     * </p>
     * 
     * @param getConfiguredTableRequest
     * @return A Java Future containing the result of the GetConfiguredTable operation returned by the service.
     * @sample AWSCleanRoomsAsync.GetConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetConfiguredTable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetConfiguredTableResult> getConfiguredTableAsync(GetConfiguredTableRequest getConfiguredTableRequest);

    /**
     * <p>
     * Retrieves a configured table.
     * </p>
     * 
     * @param getConfiguredTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfiguredTable operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.GetConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetConfiguredTable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetConfiguredTableResult> getConfiguredTableAsync(GetConfiguredTableRequest getConfiguredTableRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfiguredTableRequest, GetConfiguredTableResult> asyncHandler);

    /**
     * <p>
     * Retrieves a configured table analysis rule.
     * </p>
     * 
     * @param getConfiguredTableAnalysisRuleRequest
     * @return A Java Future containing the result of the GetConfiguredTableAnalysisRule operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsync.GetConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfiguredTableAnalysisRuleResult> getConfiguredTableAnalysisRuleAsync(
            GetConfiguredTableAnalysisRuleRequest getConfiguredTableAnalysisRuleRequest);

    /**
     * <p>
     * Retrieves a configured table analysis rule.
     * </p>
     * 
     * @param getConfiguredTableAnalysisRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfiguredTableAnalysisRule operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsyncHandler.GetConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfiguredTableAnalysisRuleResult> getConfiguredTableAnalysisRuleAsync(
            GetConfiguredTableAnalysisRuleRequest getConfiguredTableAnalysisRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfiguredTableAnalysisRuleRequest, GetConfiguredTableAnalysisRuleResult> asyncHandler);

    /**
     * <p>
     * Retrieves a configured table association.
     * </p>
     * 
     * @param getConfiguredTableAssociationRequest
     * @return A Java Future containing the result of the GetConfiguredTableAssociation operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsync.GetConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfiguredTableAssociationResult> getConfiguredTableAssociationAsync(
            GetConfiguredTableAssociationRequest getConfiguredTableAssociationRequest);

    /**
     * <p>
     * Retrieves a configured table association.
     * </p>
     * 
     * @param getConfiguredTableAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfiguredTableAssociation operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsyncHandler.GetConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfiguredTableAssociationResult> getConfiguredTableAssociationAsync(
            GetConfiguredTableAssociationRequest getConfiguredTableAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfiguredTableAssociationRequest, GetConfiguredTableAssociationResult> asyncHandler);

    /**
     * <p>
     * Retrieves a specified membership for an identifier.
     * </p>
     * 
     * @param getMembershipRequest
     * @return A Java Future containing the result of the GetMembership operation returned by the service.
     * @sample AWSCleanRoomsAsync.GetMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetMembership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMembershipResult> getMembershipAsync(GetMembershipRequest getMembershipRequest);

    /**
     * <p>
     * Retrieves a specified membership for an identifier.
     * </p>
     * 
     * @param getMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMembership operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.GetMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetMembership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMembershipResult> getMembershipAsync(GetMembershipRequest getMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<GetMembershipRequest, GetMembershipResult> asyncHandler);

    /**
     * <p>
     * Returns details for a specified privacy budget template.
     * </p>
     * 
     * @param getPrivacyBudgetTemplateRequest
     * @return A Java Future containing the result of the GetPrivacyBudgetTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsync.GetPrivacyBudgetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetPrivacyBudgetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPrivacyBudgetTemplateResult> getPrivacyBudgetTemplateAsync(GetPrivacyBudgetTemplateRequest getPrivacyBudgetTemplateRequest);

    /**
     * <p>
     * Returns details for a specified privacy budget template.
     * </p>
     * 
     * @param getPrivacyBudgetTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPrivacyBudgetTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.GetPrivacyBudgetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetPrivacyBudgetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPrivacyBudgetTemplateResult> getPrivacyBudgetTemplateAsync(GetPrivacyBudgetTemplateRequest getPrivacyBudgetTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetPrivacyBudgetTemplateRequest, GetPrivacyBudgetTemplateResult> asyncHandler);

    /**
     * <p>
     * Returns query processing metadata.
     * </p>
     * 
     * @param getProtectedQueryRequest
     * @return A Java Future containing the result of the GetProtectedQuery operation returned by the service.
     * @sample AWSCleanRoomsAsync.GetProtectedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetProtectedQuery" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetProtectedQueryResult> getProtectedQueryAsync(GetProtectedQueryRequest getProtectedQueryRequest);

    /**
     * <p>
     * Returns query processing metadata.
     * </p>
     * 
     * @param getProtectedQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProtectedQuery operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.GetProtectedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetProtectedQuery" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetProtectedQueryResult> getProtectedQueryAsync(GetProtectedQueryRequest getProtectedQueryRequest,
            com.amazonaws.handlers.AsyncHandler<GetProtectedQueryRequest, GetProtectedQueryResult> asyncHandler);

    /**
     * <p>
     * Retrieves the schema for a relation within a collaboration.
     * </p>
     * 
     * @param getSchemaRequest
     * @return A Java Future containing the result of the GetSchema operation returned by the service.
     * @sample AWSCleanRoomsAsync.GetSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSchemaResult> getSchemaAsync(GetSchemaRequest getSchemaRequest);

    /**
     * <p>
     * Retrieves the schema for a relation within a collaboration.
     * </p>
     * 
     * @param getSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSchema operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.GetSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetSchema" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSchemaResult> getSchemaAsync(GetSchemaRequest getSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<GetSchemaRequest, GetSchemaResult> asyncHandler);

    /**
     * <p>
     * Retrieves a schema analysis rule.
     * </p>
     * 
     * @param getSchemaAnalysisRuleRequest
     * @return A Java Future containing the result of the GetSchemaAnalysisRule operation returned by the service.
     * @sample AWSCleanRoomsAsync.GetSchemaAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetSchemaAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSchemaAnalysisRuleResult> getSchemaAnalysisRuleAsync(GetSchemaAnalysisRuleRequest getSchemaAnalysisRuleRequest);

    /**
     * <p>
     * Retrieves a schema analysis rule.
     * </p>
     * 
     * @param getSchemaAnalysisRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSchemaAnalysisRule operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.GetSchemaAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetSchemaAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSchemaAnalysisRuleResult> getSchemaAnalysisRuleAsync(GetSchemaAnalysisRuleRequest getSchemaAnalysisRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetSchemaAnalysisRuleRequest, GetSchemaAnalysisRuleResult> asyncHandler);

    /**
     * <p>
     * Lists analysis templates that the caller owns.
     * </p>
     * 
     * @param listAnalysisTemplatesRequest
     * @return A Java Future containing the result of the ListAnalysisTemplates operation returned by the service.
     * @sample AWSCleanRoomsAsync.ListAnalysisTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListAnalysisTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnalysisTemplatesResult> listAnalysisTemplatesAsync(ListAnalysisTemplatesRequest listAnalysisTemplatesRequest);

    /**
     * <p>
     * Lists analysis templates that the caller owns.
     * </p>
     * 
     * @param listAnalysisTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAnalysisTemplates operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.ListAnalysisTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListAnalysisTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAnalysisTemplatesResult> listAnalysisTemplatesAsync(ListAnalysisTemplatesRequest listAnalysisTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAnalysisTemplatesRequest, ListAnalysisTemplatesResult> asyncHandler);

    /**
     * <p>
     * Lists analysis templates within a collaboration.
     * </p>
     * 
     * @param listCollaborationAnalysisTemplatesRequest
     * @return A Java Future containing the result of the ListCollaborationAnalysisTemplates operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsync.ListCollaborationAnalysisTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationAnalysisTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCollaborationAnalysisTemplatesResult> listCollaborationAnalysisTemplatesAsync(
            ListCollaborationAnalysisTemplatesRequest listCollaborationAnalysisTemplatesRequest);

    /**
     * <p>
     * Lists analysis templates within a collaboration.
     * </p>
     * 
     * @param listCollaborationAnalysisTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCollaborationAnalysisTemplates operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsyncHandler.ListCollaborationAnalysisTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationAnalysisTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCollaborationAnalysisTemplatesResult> listCollaborationAnalysisTemplatesAsync(
            ListCollaborationAnalysisTemplatesRequest listCollaborationAnalysisTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCollaborationAnalysisTemplatesRequest, ListCollaborationAnalysisTemplatesResult> asyncHandler);

    /**
     * <p>
     * Lists configured audience model associations within a collaboration.
     * </p>
     * 
     * @param listCollaborationConfiguredAudienceModelAssociationsRequest
     * @return A Java Future containing the result of the ListCollaborationConfiguredAudienceModelAssociations operation
     *         returned by the service.
     * @sample AWSCleanRoomsAsync.ListCollaborationConfiguredAudienceModelAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationConfiguredAudienceModelAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCollaborationConfiguredAudienceModelAssociationsResult> listCollaborationConfiguredAudienceModelAssociationsAsync(
            ListCollaborationConfiguredAudienceModelAssociationsRequest listCollaborationConfiguredAudienceModelAssociationsRequest);

    /**
     * <p>
     * Lists configured audience model associations within a collaboration.
     * </p>
     * 
     * @param listCollaborationConfiguredAudienceModelAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCollaborationConfiguredAudienceModelAssociations operation
     *         returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.ListCollaborationConfiguredAudienceModelAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationConfiguredAudienceModelAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCollaborationConfiguredAudienceModelAssociationsResult> listCollaborationConfiguredAudienceModelAssociationsAsync(
            ListCollaborationConfiguredAudienceModelAssociationsRequest listCollaborationConfiguredAudienceModelAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCollaborationConfiguredAudienceModelAssociationsRequest, ListCollaborationConfiguredAudienceModelAssociationsResult> asyncHandler);

    /**
     * <p>
     * Returns an array that summarizes each privacy budget template in a specified collaboration.
     * </p>
     * 
     * @param listCollaborationPrivacyBudgetTemplatesRequest
     * @return A Java Future containing the result of the ListCollaborationPrivacyBudgetTemplates operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsync.ListCollaborationPrivacyBudgetTemplates
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationPrivacyBudgetTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCollaborationPrivacyBudgetTemplatesResult> listCollaborationPrivacyBudgetTemplatesAsync(
            ListCollaborationPrivacyBudgetTemplatesRequest listCollaborationPrivacyBudgetTemplatesRequest);

    /**
     * <p>
     * Returns an array that summarizes each privacy budget template in a specified collaboration.
     * </p>
     * 
     * @param listCollaborationPrivacyBudgetTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCollaborationPrivacyBudgetTemplates operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsyncHandler.ListCollaborationPrivacyBudgetTemplates
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationPrivacyBudgetTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCollaborationPrivacyBudgetTemplatesResult> listCollaborationPrivacyBudgetTemplatesAsync(
            ListCollaborationPrivacyBudgetTemplatesRequest listCollaborationPrivacyBudgetTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCollaborationPrivacyBudgetTemplatesRequest, ListCollaborationPrivacyBudgetTemplatesResult> asyncHandler);

    /**
     * <p>
     * Returns an array that summarizes each privacy budget in a specified collaboration. The summary includes the
     * collaboration ARN, creation time, creating account, and privacy budget details.
     * </p>
     * 
     * @param listCollaborationPrivacyBudgetsRequest
     * @return A Java Future containing the result of the ListCollaborationPrivacyBudgets operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsync.ListCollaborationPrivacyBudgets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationPrivacyBudgets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCollaborationPrivacyBudgetsResult> listCollaborationPrivacyBudgetsAsync(
            ListCollaborationPrivacyBudgetsRequest listCollaborationPrivacyBudgetsRequest);

    /**
     * <p>
     * Returns an array that summarizes each privacy budget in a specified collaboration. The summary includes the
     * collaboration ARN, creation time, creating account, and privacy budget details.
     * </p>
     * 
     * @param listCollaborationPrivacyBudgetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCollaborationPrivacyBudgets operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsyncHandler.ListCollaborationPrivacyBudgets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationPrivacyBudgets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCollaborationPrivacyBudgetsResult> listCollaborationPrivacyBudgetsAsync(
            ListCollaborationPrivacyBudgetsRequest listCollaborationPrivacyBudgetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCollaborationPrivacyBudgetsRequest, ListCollaborationPrivacyBudgetsResult> asyncHandler);

    /**
     * <p>
     * Lists collaborations the caller owns, is active in, or has been invited to.
     * </p>
     * 
     * @param listCollaborationsRequest
     * @return A Java Future containing the result of the ListCollaborations operation returned by the service.
     * @sample AWSCleanRoomsAsync.ListCollaborations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCollaborationsResult> listCollaborationsAsync(ListCollaborationsRequest listCollaborationsRequest);

    /**
     * <p>
     * Lists collaborations the caller owns, is active in, or has been invited to.
     * </p>
     * 
     * @param listCollaborationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCollaborations operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.ListCollaborations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCollaborationsResult> listCollaborationsAsync(ListCollaborationsRequest listCollaborationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCollaborationsRequest, ListCollaborationsResult> asyncHandler);

    /**
     * <p>
     * Lists information about requested configured audience model associations.
     * </p>
     * 
     * @param listConfiguredAudienceModelAssociationsRequest
     * @return A Java Future containing the result of the ListConfiguredAudienceModelAssociations operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsync.ListConfiguredAudienceModelAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListConfiguredAudienceModelAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfiguredAudienceModelAssociationsResult> listConfiguredAudienceModelAssociationsAsync(
            ListConfiguredAudienceModelAssociationsRequest listConfiguredAudienceModelAssociationsRequest);

    /**
     * <p>
     * Lists information about requested configured audience model associations.
     * </p>
     * 
     * @param listConfiguredAudienceModelAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfiguredAudienceModelAssociations operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsyncHandler.ListConfiguredAudienceModelAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListConfiguredAudienceModelAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfiguredAudienceModelAssociationsResult> listConfiguredAudienceModelAssociationsAsync(
            ListConfiguredAudienceModelAssociationsRequest listConfiguredAudienceModelAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfiguredAudienceModelAssociationsRequest, ListConfiguredAudienceModelAssociationsResult> asyncHandler);

    /**
     * <p>
     * Lists configured table associations for a membership.
     * </p>
     * 
     * @param listConfiguredTableAssociationsRequest
     * @return A Java Future containing the result of the ListConfiguredTableAssociations operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsync.ListConfiguredTableAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListConfiguredTableAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfiguredTableAssociationsResult> listConfiguredTableAssociationsAsync(
            ListConfiguredTableAssociationsRequest listConfiguredTableAssociationsRequest);

    /**
     * <p>
     * Lists configured table associations for a membership.
     * </p>
     * 
     * @param listConfiguredTableAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfiguredTableAssociations operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsyncHandler.ListConfiguredTableAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListConfiguredTableAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfiguredTableAssociationsResult> listConfiguredTableAssociationsAsync(
            ListConfiguredTableAssociationsRequest listConfiguredTableAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfiguredTableAssociationsRequest, ListConfiguredTableAssociationsResult> asyncHandler);

    /**
     * <p>
     * Lists configured tables.
     * </p>
     * 
     * @param listConfiguredTablesRequest
     * @return A Java Future containing the result of the ListConfiguredTables operation returned by the service.
     * @sample AWSCleanRoomsAsync.ListConfiguredTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListConfiguredTables"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfiguredTablesResult> listConfiguredTablesAsync(ListConfiguredTablesRequest listConfiguredTablesRequest);

    /**
     * <p>
     * Lists configured tables.
     * </p>
     * 
     * @param listConfiguredTablesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfiguredTables operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.ListConfiguredTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListConfiguredTables"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfiguredTablesResult> listConfiguredTablesAsync(ListConfiguredTablesRequest listConfiguredTablesRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfiguredTablesRequest, ListConfiguredTablesResult> asyncHandler);

    /**
     * <p>
     * Lists all members within a collaboration.
     * </p>
     * 
     * @param listMembersRequest
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AWSCleanRoomsAsync.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Lists all members within a collaboration.
     * </p>
     * 
     * @param listMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler);

    /**
     * <p>
     * Lists all memberships resources within the caller's account.
     * </p>
     * 
     * @param listMembershipsRequest
     * @return A Java Future containing the result of the ListMemberships operation returned by the service.
     * @sample AWSCleanRoomsAsync.ListMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListMemberships" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembershipsResult> listMembershipsAsync(ListMembershipsRequest listMembershipsRequest);

    /**
     * <p>
     * Lists all memberships resources within the caller's account.
     * </p>
     * 
     * @param listMembershipsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMemberships operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.ListMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListMemberships" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembershipsResult> listMembershipsAsync(ListMembershipsRequest listMembershipsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMembershipsRequest, ListMembershipsResult> asyncHandler);

    /**
     * <p>
     * Returns detailed information about the privacy budget templates in a specified membership.
     * </p>
     * 
     * @param listPrivacyBudgetTemplatesRequest
     * @return A Java Future containing the result of the ListPrivacyBudgetTemplates operation returned by the service.
     * @sample AWSCleanRoomsAsync.ListPrivacyBudgetTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListPrivacyBudgetTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPrivacyBudgetTemplatesResult> listPrivacyBudgetTemplatesAsync(
            ListPrivacyBudgetTemplatesRequest listPrivacyBudgetTemplatesRequest);

    /**
     * <p>
     * Returns detailed information about the privacy budget templates in a specified membership.
     * </p>
     * 
     * @param listPrivacyBudgetTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPrivacyBudgetTemplates operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.ListPrivacyBudgetTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListPrivacyBudgetTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPrivacyBudgetTemplatesResult> listPrivacyBudgetTemplatesAsync(
            ListPrivacyBudgetTemplatesRequest listPrivacyBudgetTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPrivacyBudgetTemplatesRequest, ListPrivacyBudgetTemplatesResult> asyncHandler);

    /**
     * <p>
     * Returns detailed information about the privacy budgets in a specified membership.
     * </p>
     * 
     * @param listPrivacyBudgetsRequest
     * @return A Java Future containing the result of the ListPrivacyBudgets operation returned by the service.
     * @sample AWSCleanRoomsAsync.ListPrivacyBudgets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListPrivacyBudgets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPrivacyBudgetsResult> listPrivacyBudgetsAsync(ListPrivacyBudgetsRequest listPrivacyBudgetsRequest);

    /**
     * <p>
     * Returns detailed information about the privacy budgets in a specified membership.
     * </p>
     * 
     * @param listPrivacyBudgetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPrivacyBudgets operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.ListPrivacyBudgets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListPrivacyBudgets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPrivacyBudgetsResult> listPrivacyBudgetsAsync(ListPrivacyBudgetsRequest listPrivacyBudgetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPrivacyBudgetsRequest, ListPrivacyBudgetsResult> asyncHandler);

    /**
     * <p>
     * Lists protected queries, sorted by the most recent query.
     * </p>
     * 
     * @param listProtectedQueriesRequest
     * @return A Java Future containing the result of the ListProtectedQueries operation returned by the service.
     * @sample AWSCleanRoomsAsync.ListProtectedQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListProtectedQueries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProtectedQueriesResult> listProtectedQueriesAsync(ListProtectedQueriesRequest listProtectedQueriesRequest);

    /**
     * <p>
     * Lists protected queries, sorted by the most recent query.
     * </p>
     * 
     * @param listProtectedQueriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProtectedQueries operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.ListProtectedQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListProtectedQueries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProtectedQueriesResult> listProtectedQueriesAsync(ListProtectedQueriesRequest listProtectedQueriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListProtectedQueriesRequest, ListProtectedQueriesResult> asyncHandler);

    /**
     * <p>
     * Lists the schemas for relations within a collaboration.
     * </p>
     * 
     * @param listSchemasRequest
     * @return A Java Future containing the result of the ListSchemas operation returned by the service.
     * @sample AWSCleanRoomsAsync.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest listSchemasRequest);

    /**
     * <p>
     * Lists the schemas for relations within a collaboration.
     * </p>
     * 
     * @param listSchemasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSchemas operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest listSchemasRequest,
            com.amazonaws.handlers.AsyncHandler<ListSchemasRequest, ListSchemasResult> asyncHandler);

    /**
     * <p>
     * Lists all of the tags that have been added to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCleanRoomsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all of the tags that have been added to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * An estimate of the number of aggregation functions that the member who can query can run given epsilon and noise
     * parameters.
     * </p>
     * 
     * @param previewPrivacyImpactRequest
     * @return A Java Future containing the result of the PreviewPrivacyImpact operation returned by the service.
     * @sample AWSCleanRoomsAsync.PreviewPrivacyImpact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/PreviewPrivacyImpact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PreviewPrivacyImpactResult> previewPrivacyImpactAsync(PreviewPrivacyImpactRequest previewPrivacyImpactRequest);

    /**
     * <p>
     * An estimate of the number of aggregation functions that the member who can query can run given epsilon and noise
     * parameters.
     * </p>
     * 
     * @param previewPrivacyImpactRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PreviewPrivacyImpact operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.PreviewPrivacyImpact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/PreviewPrivacyImpact"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PreviewPrivacyImpactResult> previewPrivacyImpactAsync(PreviewPrivacyImpactRequest previewPrivacyImpactRequest,
            com.amazonaws.handlers.AsyncHandler<PreviewPrivacyImpactRequest, PreviewPrivacyImpactResult> asyncHandler);

    /**
     * <p>
     * Creates a protected query that is started by Clean Rooms.
     * </p>
     * 
     * @param startProtectedQueryRequest
     * @return A Java Future containing the result of the StartProtectedQuery operation returned by the service.
     * @sample AWSCleanRoomsAsync.StartProtectedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/StartProtectedQuery" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartProtectedQueryResult> startProtectedQueryAsync(StartProtectedQueryRequest startProtectedQueryRequest);

    /**
     * <p>
     * Creates a protected query that is started by Clean Rooms.
     * </p>
     * 
     * @param startProtectedQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartProtectedQuery operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.StartProtectedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/StartProtectedQuery" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartProtectedQueryResult> startProtectedQueryAsync(StartProtectedQueryRequest startProtectedQueryRequest,
            com.amazonaws.handlers.AsyncHandler<StartProtectedQueryRequest, StartProtectedQueryResult> asyncHandler);

    /**
     * <p>
     * Tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCleanRoomsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag or list of tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCleanRoomsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag or list of tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the analysis template metadata.
     * </p>
     * 
     * @param updateAnalysisTemplateRequest
     * @return A Java Future containing the result of the UpdateAnalysisTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsync.UpdateAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnalysisTemplateResult> updateAnalysisTemplateAsync(UpdateAnalysisTemplateRequest updateAnalysisTemplateRequest);

    /**
     * <p>
     * Updates the analysis template metadata.
     * </p>
     * 
     * @param updateAnalysisTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAnalysisTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.UpdateAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAnalysisTemplateResult> updateAnalysisTemplateAsync(UpdateAnalysisTemplateRequest updateAnalysisTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAnalysisTemplateRequest, UpdateAnalysisTemplateResult> asyncHandler);

    /**
     * <p>
     * Updates collaboration metadata and can only be called by the collaboration owner.
     * </p>
     * 
     * @param updateCollaborationRequest
     * @return A Java Future containing the result of the UpdateCollaboration operation returned by the service.
     * @sample AWSCleanRoomsAsync.UpdateCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCollaborationResult> updateCollaborationAsync(UpdateCollaborationRequest updateCollaborationRequest);

    /**
     * <p>
     * Updates collaboration metadata and can only be called by the collaboration owner.
     * </p>
     * 
     * @param updateCollaborationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCollaboration operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.UpdateCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCollaborationResult> updateCollaborationAsync(UpdateCollaborationRequest updateCollaborationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCollaborationRequest, UpdateCollaborationResult> asyncHandler);

    /**
     * <p>
     * Provides the details necessary to update a configured audience model association.
     * </p>
     * 
     * @param updateConfiguredAudienceModelAssociationRequest
     * @return A Java Future containing the result of the UpdateConfiguredAudienceModelAssociation operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsync.UpdateConfiguredAudienceModelAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredAudienceModelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfiguredAudienceModelAssociationResult> updateConfiguredAudienceModelAssociationAsync(
            UpdateConfiguredAudienceModelAssociationRequest updateConfiguredAudienceModelAssociationRequest);

    /**
     * <p>
     * Provides the details necessary to update a configured audience model association.
     * </p>
     * 
     * @param updateConfiguredAudienceModelAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfiguredAudienceModelAssociation operation returned by
     *         the service.
     * @sample AWSCleanRoomsAsyncHandler.UpdateConfiguredAudienceModelAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredAudienceModelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfiguredAudienceModelAssociationResult> updateConfiguredAudienceModelAssociationAsync(
            UpdateConfiguredAudienceModelAssociationRequest updateConfiguredAudienceModelAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfiguredAudienceModelAssociationRequest, UpdateConfiguredAudienceModelAssociationResult> asyncHandler);

    /**
     * <p>
     * Updates a configured table.
     * </p>
     * 
     * @param updateConfiguredTableRequest
     * @return A Java Future containing the result of the UpdateConfiguredTable operation returned by the service.
     * @sample AWSCleanRoomsAsync.UpdateConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredTable"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfiguredTableResult> updateConfiguredTableAsync(UpdateConfiguredTableRequest updateConfiguredTableRequest);

    /**
     * <p>
     * Updates a configured table.
     * </p>
     * 
     * @param updateConfiguredTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfiguredTable operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.UpdateConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredTable"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfiguredTableResult> updateConfiguredTableAsync(UpdateConfiguredTableRequest updateConfiguredTableRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfiguredTableRequest, UpdateConfiguredTableResult> asyncHandler);

    /**
     * <p>
     * Updates a configured table analysis rule.
     * </p>
     * 
     * @param updateConfiguredTableAnalysisRuleRequest
     * @return A Java Future containing the result of the UpdateConfiguredTableAnalysisRule operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsync.UpdateConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfiguredTableAnalysisRuleResult> updateConfiguredTableAnalysisRuleAsync(
            UpdateConfiguredTableAnalysisRuleRequest updateConfiguredTableAnalysisRuleRequest);

    /**
     * <p>
     * Updates a configured table analysis rule.
     * </p>
     * 
     * @param updateConfiguredTableAnalysisRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfiguredTableAnalysisRule operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsyncHandler.UpdateConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfiguredTableAnalysisRuleResult> updateConfiguredTableAnalysisRuleAsync(
            UpdateConfiguredTableAnalysisRuleRequest updateConfiguredTableAnalysisRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfiguredTableAnalysisRuleRequest, UpdateConfiguredTableAnalysisRuleResult> asyncHandler);

    /**
     * <p>
     * Updates a configured table association.
     * </p>
     * 
     * @param updateConfiguredTableAssociationRequest
     * @return A Java Future containing the result of the UpdateConfiguredTableAssociation operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsync.UpdateConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfiguredTableAssociationResult> updateConfiguredTableAssociationAsync(
            UpdateConfiguredTableAssociationRequest updateConfiguredTableAssociationRequest);

    /**
     * <p>
     * Updates a configured table association.
     * </p>
     * 
     * @param updateConfiguredTableAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfiguredTableAssociation operation returned by the
     *         service.
     * @sample AWSCleanRoomsAsyncHandler.UpdateConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfiguredTableAssociationResult> updateConfiguredTableAssociationAsync(
            UpdateConfiguredTableAssociationRequest updateConfiguredTableAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfiguredTableAssociationRequest, UpdateConfiguredTableAssociationResult> asyncHandler);

    /**
     * <p>
     * Updates a membership.
     * </p>
     * 
     * @param updateMembershipRequest
     * @return A Java Future containing the result of the UpdateMembership operation returned by the service.
     * @sample AWSCleanRoomsAsync.UpdateMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateMembership" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMembershipResult> updateMembershipAsync(UpdateMembershipRequest updateMembershipRequest);

    /**
     * <p>
     * Updates a membership.
     * </p>
     * 
     * @param updateMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMembership operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.UpdateMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateMembership" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMembershipResult> updateMembershipAsync(UpdateMembershipRequest updateMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMembershipRequest, UpdateMembershipResult> asyncHandler);

    /**
     * <p>
     * Updates the privacy budget template for the specified membership.
     * </p>
     * 
     * @param updatePrivacyBudgetTemplateRequest
     * @return A Java Future containing the result of the UpdatePrivacyBudgetTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsync.UpdatePrivacyBudgetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdatePrivacyBudgetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePrivacyBudgetTemplateResult> updatePrivacyBudgetTemplateAsync(
            UpdatePrivacyBudgetTemplateRequest updatePrivacyBudgetTemplateRequest);

    /**
     * <p>
     * Updates the privacy budget template for the specified membership.
     * </p>
     * 
     * @param updatePrivacyBudgetTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePrivacyBudgetTemplate operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.UpdatePrivacyBudgetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdatePrivacyBudgetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePrivacyBudgetTemplateResult> updatePrivacyBudgetTemplateAsync(
            UpdatePrivacyBudgetTemplateRequest updatePrivacyBudgetTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePrivacyBudgetTemplateRequest, UpdatePrivacyBudgetTemplateResult> asyncHandler);

    /**
     * <p>
     * Updates the processing of a currently running query.
     * </p>
     * 
     * @param updateProtectedQueryRequest
     * @return A Java Future containing the result of the UpdateProtectedQuery operation returned by the service.
     * @sample AWSCleanRoomsAsync.UpdateProtectedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateProtectedQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProtectedQueryResult> updateProtectedQueryAsync(UpdateProtectedQueryRequest updateProtectedQueryRequest);

    /**
     * <p>
     * Updates the processing of a currently running query.
     * </p>
     * 
     * @param updateProtectedQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProtectedQuery operation returned by the service.
     * @sample AWSCleanRoomsAsyncHandler.UpdateProtectedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateProtectedQuery"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProtectedQueryResult> updateProtectedQueryAsync(UpdateProtectedQueryRequest updateProtectedQueryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProtectedQueryRequest, UpdateProtectedQueryResult> asyncHandler);

}
