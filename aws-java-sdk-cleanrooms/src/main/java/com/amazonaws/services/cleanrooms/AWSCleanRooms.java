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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cleanrooms.model.*;

/**
 * Interface for accessing AWS Clean Rooms Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cleanrooms.AbstractAWSCleanRooms} instead.
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
public interface AWSCleanRooms {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cleanrooms";

    /**
     * <p>
     * Retrieves multiple analysis templates within a collaboration by their Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param batchGetCollaborationAnalysisTemplateRequest
     * @return Result of the BatchGetCollaborationAnalysisTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.BatchGetCollaborationAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetCollaborationAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetCollaborationAnalysisTemplateResult batchGetCollaborationAnalysisTemplate(
            BatchGetCollaborationAnalysisTemplateRequest batchGetCollaborationAnalysisTemplateRequest);

    /**
     * <p>
     * Retrieves multiple schemas by their identifiers.
     * </p>
     * 
     * @param batchGetSchemaRequest
     * @return Result of the BatchGetSchema operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.BatchGetSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetSchema" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetSchemaResult batchGetSchema(BatchGetSchemaRequest batchGetSchemaRequest);

    /**
     * <p>
     * Retrieves multiple analysis rule schemas.
     * </p>
     * 
     * @param batchGetSchemaAnalysisRuleRequest
     * @return Result of the BatchGetSchemaAnalysisRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.BatchGetSchemaAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetSchemaAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetSchemaAnalysisRuleResult batchGetSchemaAnalysisRule(BatchGetSchemaAnalysisRuleRequest batchGetSchemaAnalysisRuleRequest);

    /**
     * <p>
     * Creates a new analysis template.
     * </p>
     * 
     * @param createAnalysisTemplateRequest
     * @return Result of the CreateAnalysisTemplate operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         Request denied because service quota has been exceeded.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.CreateAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAnalysisTemplateResult createAnalysisTemplate(CreateAnalysisTemplateRequest createAnalysisTemplateRequest);

    /**
     * <p>
     * Creates a new collaboration.
     * </p>
     * 
     * @param createCollaborationRequest
     * @return Result of the CreateCollaboration operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Request denied because service quota has been exceeded.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.CreateCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    CreateCollaborationResult createCollaboration(CreateCollaborationRequest createCollaborationRequest);

    /**
     * <p>
     * Provides the details necessary to create a configured audience model association.
     * </p>
     * 
     * @param createConfiguredAudienceModelAssociationRequest
     * @return Result of the CreateConfiguredAudienceModelAssociation operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         Request denied because service quota has been exceeded.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.CreateConfiguredAudienceModelAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredAudienceModelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfiguredAudienceModelAssociationResult createConfiguredAudienceModelAssociation(
            CreateConfiguredAudienceModelAssociationRequest createConfiguredAudienceModelAssociationRequest);

    /**
     * <p>
     * Creates a new configured table resource.
     * </p>
     * 
     * @param createConfiguredTableRequest
     * @return Result of the CreateConfiguredTable operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         Request denied because service quota has been exceeded.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.CreateConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTable"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfiguredTableResult createConfiguredTable(CreateConfiguredTableRequest createConfiguredTableRequest);

    /**
     * <p>
     * Creates a new analysis rule for a configured table. Currently, only one analysis rule can be created for a given
     * configured table.
     * </p>
     * 
     * @param createConfiguredTableAnalysisRuleRequest
     * @return Result of the CreateConfiguredTableAnalysisRule operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.CreateConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfiguredTableAnalysisRuleResult createConfiguredTableAnalysisRule(CreateConfiguredTableAnalysisRuleRequest createConfiguredTableAnalysisRuleRequest);

    /**
     * <p>
     * Creates a configured table association. A configured table association links a configured table with a
     * collaboration.
     * </p>
     * 
     * @param createConfiguredTableAssociationRequest
     * @return Result of the CreateConfiguredTableAssociation operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         Request denied because service quota has been exceeded.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.CreateConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfiguredTableAssociationResult createConfiguredTableAssociation(CreateConfiguredTableAssociationRequest createConfiguredTableAssociationRequest);

    /**
     * <p>
     * Creates a membership for a specific collaboration identifier and joins the collaboration.
     * </p>
     * 
     * @param createMembershipRequest
     * @return Result of the CreateMembership operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         Request denied because service quota has been exceeded.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.CreateMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateMembership" target="_top">AWS
     *      API Documentation</a>
     */
    CreateMembershipResult createMembership(CreateMembershipRequest createMembershipRequest);

    /**
     * <p>
     * Creates a privacy budget template for a specified membership. Each membership can have only one privacy budget
     * template, but it can be deleted and recreated. If you need to change the privacy budget template for a
     * membership, use the <a>UpdatePrivacyBudgetTemplate</a> operation.
     * </p>
     * 
     * @param createPrivacyBudgetTemplateRequest
     * @return Result of the CreatePrivacyBudgetTemplate operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.CreatePrivacyBudgetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreatePrivacyBudgetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePrivacyBudgetTemplateResult createPrivacyBudgetTemplate(CreatePrivacyBudgetTemplateRequest createPrivacyBudgetTemplateRequest);

    /**
     * <p>
     * Deletes an analysis template.
     * </p>
     * 
     * @param deleteAnalysisTemplateRequest
     * @return Result of the DeleteAnalysisTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeleteAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAnalysisTemplateResult deleteAnalysisTemplate(DeleteAnalysisTemplateRequest deleteAnalysisTemplateRequest);

    /**
     * <p>
     * Deletes a collaboration. It can only be called by the collaboration owner.
     * </p>
     * 
     * @param deleteCollaborationRequest
     * @return Result of the DeleteCollaboration operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeleteCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteCollaborationResult deleteCollaboration(DeleteCollaborationRequest deleteCollaborationRequest);

    /**
     * <p>
     * Provides the information necessary to delete a configured audience model association.
     * </p>
     * 
     * @param deleteConfiguredAudienceModelAssociationRequest
     * @return Result of the DeleteConfiguredAudienceModelAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeleteConfiguredAudienceModelAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredAudienceModelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfiguredAudienceModelAssociationResult deleteConfiguredAudienceModelAssociation(
            DeleteConfiguredAudienceModelAssociationRequest deleteConfiguredAudienceModelAssociationRequest);

    /**
     * <p>
     * Deletes a configured table.
     * </p>
     * 
     * @param deleteConfiguredTableRequest
     * @return Result of the DeleteConfiguredTable operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeleteConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredTable"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfiguredTableResult deleteConfiguredTable(DeleteConfiguredTableRequest deleteConfiguredTableRequest);

    /**
     * <p>
     * Deletes a configured table analysis rule.
     * </p>
     * 
     * @param deleteConfiguredTableAnalysisRuleRequest
     * @return Result of the DeleteConfiguredTableAnalysisRule operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeleteConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfiguredTableAnalysisRuleResult deleteConfiguredTableAnalysisRule(DeleteConfiguredTableAnalysisRuleRequest deleteConfiguredTableAnalysisRuleRequest);

    /**
     * <p>
     * Deletes a configured table association.
     * </p>
     * 
     * @param deleteConfiguredTableAssociationRequest
     * @return Result of the DeleteConfiguredTableAssociation operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeleteConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfiguredTableAssociationResult deleteConfiguredTableAssociation(DeleteConfiguredTableAssociationRequest deleteConfiguredTableAssociationRequest);

    /**
     * <p>
     * Removes the specified member from a collaboration. The removed member is placed in the Removed status and can't
     * interact with the collaboration. The removed member's data is inaccessible to active members of the
     * collaboration.
     * </p>
     * 
     * @param deleteMemberRequest
     * @return Result of the DeleteMember operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeleteMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteMember" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMemberResult deleteMember(DeleteMemberRequest deleteMemberRequest);

    /**
     * <p>
     * Deletes a specified membership. All resources under a membership must be deleted.
     * </p>
     * 
     * @param deleteMembershipRequest
     * @return Result of the DeleteMembership operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeleteMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteMembership" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteMembershipResult deleteMembership(DeleteMembershipRequest deleteMembershipRequest);

    /**
     * <p>
     * Deletes a privacy budget template for a specified membership.
     * </p>
     * 
     * @param deletePrivacyBudgetTemplateRequest
     * @return Result of the DeletePrivacyBudgetTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeletePrivacyBudgetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeletePrivacyBudgetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePrivacyBudgetTemplateResult deletePrivacyBudgetTemplate(DeletePrivacyBudgetTemplateRequest deletePrivacyBudgetTemplateRequest);

    /**
     * <p>
     * Retrieves an analysis template.
     * </p>
     * 
     * @param getAnalysisTemplateRequest
     * @return Result of the GetAnalysisTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetAnalysisTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    GetAnalysisTemplateResult getAnalysisTemplate(GetAnalysisTemplateRequest getAnalysisTemplateRequest);

    /**
     * <p>
     * Returns metadata about a collaboration.
     * </p>
     * 
     * @param getCollaborationRequest
     * @return Result of the GetCollaboration operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    GetCollaborationResult getCollaboration(GetCollaborationRequest getCollaborationRequest);

    /**
     * <p>
     * Retrieves an analysis template within a collaboration.
     * </p>
     * 
     * @param getCollaborationAnalysisTemplateRequest
     * @return Result of the GetCollaborationAnalysisTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetCollaborationAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaborationAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetCollaborationAnalysisTemplateResult getCollaborationAnalysisTemplate(GetCollaborationAnalysisTemplateRequest getCollaborationAnalysisTemplateRequest);

    /**
     * <p>
     * Retrieves a configured audience model association within a collaboration.
     * </p>
     * 
     * @param getCollaborationConfiguredAudienceModelAssociationRequest
     * @return Result of the GetCollaborationConfiguredAudienceModelAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetCollaborationConfiguredAudienceModelAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaborationConfiguredAudienceModelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    GetCollaborationConfiguredAudienceModelAssociationResult getCollaborationConfiguredAudienceModelAssociation(
            GetCollaborationConfiguredAudienceModelAssociationRequest getCollaborationConfiguredAudienceModelAssociationRequest);

    /**
     * <p>
     * Returns details about a specified privacy budget template.
     * </p>
     * 
     * @param getCollaborationPrivacyBudgetTemplateRequest
     * @return Result of the GetCollaborationPrivacyBudgetTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetCollaborationPrivacyBudgetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaborationPrivacyBudgetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetCollaborationPrivacyBudgetTemplateResult getCollaborationPrivacyBudgetTemplate(
            GetCollaborationPrivacyBudgetTemplateRequest getCollaborationPrivacyBudgetTemplateRequest);

    /**
     * <p>
     * Returns information about a configured audience model association.
     * </p>
     * 
     * @param getConfiguredAudienceModelAssociationRequest
     * @return Result of the GetConfiguredAudienceModelAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetConfiguredAudienceModelAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetConfiguredAudienceModelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    GetConfiguredAudienceModelAssociationResult getConfiguredAudienceModelAssociation(
            GetConfiguredAudienceModelAssociationRequest getConfiguredAudienceModelAssociationRequest);

    /**
     * <p>
     * Retrieves a configured table.
     * </p>
     * 
     * @param getConfiguredTableRequest
     * @return Result of the GetConfiguredTable operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetConfiguredTable" target="_top">AWS
     *      API Documentation</a>
     */
    GetConfiguredTableResult getConfiguredTable(GetConfiguredTableRequest getConfiguredTableRequest);

    /**
     * <p>
     * Retrieves a configured table analysis rule.
     * </p>
     * 
     * @param getConfiguredTableAnalysisRuleRequest
     * @return Result of the GetConfiguredTableAnalysisRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    GetConfiguredTableAnalysisRuleResult getConfiguredTableAnalysisRule(GetConfiguredTableAnalysisRuleRequest getConfiguredTableAnalysisRuleRequest);

    /**
     * <p>
     * Retrieves a configured table association.
     * </p>
     * 
     * @param getConfiguredTableAssociationRequest
     * @return Result of the GetConfiguredTableAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    GetConfiguredTableAssociationResult getConfiguredTableAssociation(GetConfiguredTableAssociationRequest getConfiguredTableAssociationRequest);

    /**
     * <p>
     * Retrieves a specified membership for an identifier.
     * </p>
     * 
     * @param getMembershipRequest
     * @return Result of the GetMembership operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetMembership" target="_top">AWS API
     *      Documentation</a>
     */
    GetMembershipResult getMembership(GetMembershipRequest getMembershipRequest);

    /**
     * <p>
     * Returns details for a specified privacy budget template.
     * </p>
     * 
     * @param getPrivacyBudgetTemplateRequest
     * @return Result of the GetPrivacyBudgetTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetPrivacyBudgetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetPrivacyBudgetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetPrivacyBudgetTemplateResult getPrivacyBudgetTemplate(GetPrivacyBudgetTemplateRequest getPrivacyBudgetTemplateRequest);

    /**
     * <p>
     * Returns query processing metadata.
     * </p>
     * 
     * @param getProtectedQueryRequest
     * @return Result of the GetProtectedQuery operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetProtectedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetProtectedQuery" target="_top">AWS
     *      API Documentation</a>
     */
    GetProtectedQueryResult getProtectedQuery(GetProtectedQueryRequest getProtectedQueryRequest);

    /**
     * <p>
     * Retrieves the schema for a relation within a collaboration.
     * </p>
     * 
     * @param getSchemaRequest
     * @return Result of the GetSchema operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetSchema" target="_top">AWS API
     *      Documentation</a>
     */
    GetSchemaResult getSchema(GetSchemaRequest getSchemaRequest);

    /**
     * <p>
     * Retrieves a schema analysis rule.
     * </p>
     * 
     * @param getSchemaAnalysisRuleRequest
     * @return Result of the GetSchemaAnalysisRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetSchemaAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetSchemaAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    GetSchemaAnalysisRuleResult getSchemaAnalysisRule(GetSchemaAnalysisRuleRequest getSchemaAnalysisRuleRequest);

    /**
     * <p>
     * Lists analysis templates that the caller owns.
     * </p>
     * 
     * @param listAnalysisTemplatesRequest
     * @return Result of the ListAnalysisTemplates operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListAnalysisTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListAnalysisTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    ListAnalysisTemplatesResult listAnalysisTemplates(ListAnalysisTemplatesRequest listAnalysisTemplatesRequest);

    /**
     * <p>
     * Lists analysis templates within a collaboration.
     * </p>
     * 
     * @param listCollaborationAnalysisTemplatesRequest
     * @return Result of the ListCollaborationAnalysisTemplates operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListCollaborationAnalysisTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationAnalysisTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    ListCollaborationAnalysisTemplatesResult listCollaborationAnalysisTemplates(
            ListCollaborationAnalysisTemplatesRequest listCollaborationAnalysisTemplatesRequest);

    /**
     * <p>
     * Lists configured audience model associations within a collaboration.
     * </p>
     * 
     * @param listCollaborationConfiguredAudienceModelAssociationsRequest
     * @return Result of the ListCollaborationConfiguredAudienceModelAssociations operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListCollaborationConfiguredAudienceModelAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationConfiguredAudienceModelAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListCollaborationConfiguredAudienceModelAssociationsResult listCollaborationConfiguredAudienceModelAssociations(
            ListCollaborationConfiguredAudienceModelAssociationsRequest listCollaborationConfiguredAudienceModelAssociationsRequest);

    /**
     * <p>
     * Returns an array that summarizes each privacy budget template in a specified collaboration.
     * </p>
     * 
     * @param listCollaborationPrivacyBudgetTemplatesRequest
     * @return Result of the ListCollaborationPrivacyBudgetTemplates operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListCollaborationPrivacyBudgetTemplates
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationPrivacyBudgetTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    ListCollaborationPrivacyBudgetTemplatesResult listCollaborationPrivacyBudgetTemplates(
            ListCollaborationPrivacyBudgetTemplatesRequest listCollaborationPrivacyBudgetTemplatesRequest);

    /**
     * <p>
     * Returns an array that summarizes each privacy budget in a specified collaboration. The summary includes the
     * collaboration ARN, creation time, creating account, and privacy budget details.
     * </p>
     * 
     * @param listCollaborationPrivacyBudgetsRequest
     * @return Result of the ListCollaborationPrivacyBudgets operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListCollaborationPrivacyBudgets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationPrivacyBudgets"
     *      target="_top">AWS API Documentation</a>
     */
    ListCollaborationPrivacyBudgetsResult listCollaborationPrivacyBudgets(ListCollaborationPrivacyBudgetsRequest listCollaborationPrivacyBudgetsRequest);

    /**
     * <p>
     * Lists collaborations the caller owns, is active in, or has been invited to.
     * </p>
     * 
     * @param listCollaborationsRequest
     * @return Result of the ListCollaborations operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListCollaborations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborations" target="_top">AWS
     *      API Documentation</a>
     */
    ListCollaborationsResult listCollaborations(ListCollaborationsRequest listCollaborationsRequest);

    /**
     * <p>
     * Lists information about requested configured audience model associations.
     * </p>
     * 
     * @param listConfiguredAudienceModelAssociationsRequest
     * @return Result of the ListConfiguredAudienceModelAssociations operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListConfiguredAudienceModelAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListConfiguredAudienceModelAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListConfiguredAudienceModelAssociationsResult listConfiguredAudienceModelAssociations(
            ListConfiguredAudienceModelAssociationsRequest listConfiguredAudienceModelAssociationsRequest);

    /**
     * <p>
     * Lists configured table associations for a membership.
     * </p>
     * 
     * @param listConfiguredTableAssociationsRequest
     * @return Result of the ListConfiguredTableAssociations operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListConfiguredTableAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListConfiguredTableAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListConfiguredTableAssociationsResult listConfiguredTableAssociations(ListConfiguredTableAssociationsRequest listConfiguredTableAssociationsRequest);

    /**
     * <p>
     * Lists configured tables.
     * </p>
     * 
     * @param listConfiguredTablesRequest
     * @return Result of the ListConfiguredTables operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListConfiguredTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListConfiguredTables"
     *      target="_top">AWS API Documentation</a>
     */
    ListConfiguredTablesResult listConfiguredTables(ListConfiguredTablesRequest listConfiguredTablesRequest);

    /**
     * <p>
     * Lists all members within a collaboration.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListMembersResult listMembers(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Lists all memberships resources within the caller's account.
     * </p>
     * 
     * @param listMembershipsRequest
     * @return Result of the ListMemberships operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListMemberships" target="_top">AWS API
     *      Documentation</a>
     */
    ListMembershipsResult listMemberships(ListMembershipsRequest listMembershipsRequest);

    /**
     * <p>
     * Returns detailed information about the privacy budget templates in a specified membership.
     * </p>
     * 
     * @param listPrivacyBudgetTemplatesRequest
     * @return Result of the ListPrivacyBudgetTemplates operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListPrivacyBudgetTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListPrivacyBudgetTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    ListPrivacyBudgetTemplatesResult listPrivacyBudgetTemplates(ListPrivacyBudgetTemplatesRequest listPrivacyBudgetTemplatesRequest);

    /**
     * <p>
     * Returns detailed information about the privacy budgets in a specified membership.
     * </p>
     * 
     * @param listPrivacyBudgetsRequest
     * @return Result of the ListPrivacyBudgets operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListPrivacyBudgets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListPrivacyBudgets" target="_top">AWS
     *      API Documentation</a>
     */
    ListPrivacyBudgetsResult listPrivacyBudgets(ListPrivacyBudgetsRequest listPrivacyBudgetsRequest);

    /**
     * <p>
     * Lists protected queries, sorted by the most recent query.
     * </p>
     * 
     * @param listProtectedQueriesRequest
     * @return Result of the ListProtectedQueries operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListProtectedQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListProtectedQueries"
     *      target="_top">AWS API Documentation</a>
     */
    ListProtectedQueriesResult listProtectedQueries(ListProtectedQueriesRequest listProtectedQueriesRequest);

    /**
     * <p>
     * Lists the schemas for relations within a collaboration.
     * </p>
     * 
     * @param listSchemasRequest
     * @return Result of the ListSchemas operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    ListSchemasResult listSchemas(ListSchemasRequest listSchemasRequest);

    /**
     * <p>
     * Lists all of the tags that have been added to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @sample AWSCleanRooms.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * An estimate of the number of aggregation functions that the member who can query can run given epsilon and noise
     * parameters.
     * </p>
     * 
     * @param previewPrivacyImpactRequest
     * @return Result of the PreviewPrivacyImpact operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.PreviewPrivacyImpact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/PreviewPrivacyImpact"
     *      target="_top">AWS API Documentation</a>
     */
    PreviewPrivacyImpactResult previewPrivacyImpact(PreviewPrivacyImpactRequest previewPrivacyImpactRequest);

    /**
     * <p>
     * Creates a protected query that is started by Clean Rooms.
     * </p>
     * 
     * @param startProtectedQueryRequest
     * @return Result of the StartProtectedQuery operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Request denied because service quota has been exceeded.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.StartProtectedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/StartProtectedQuery" target="_top">AWS
     *      API Documentation</a>
     */
    StartProtectedQueryResult startProtectedQuery(StartProtectedQueryRequest startProtectedQueryRequest);

    /**
     * <p>
     * Tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @sample AWSCleanRooms.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag or list of tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @sample AWSCleanRooms.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the analysis template metadata.
     * </p>
     * 
     * @param updateAnalysisTemplateRequest
     * @return Result of the UpdateAnalysisTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdateAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAnalysisTemplateResult updateAnalysisTemplate(UpdateAnalysisTemplateRequest updateAnalysisTemplateRequest);

    /**
     * <p>
     * Updates collaboration metadata and can only be called by the collaboration owner.
     * </p>
     * 
     * @param updateCollaborationRequest
     * @return Result of the UpdateCollaboration operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdateCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateCollaborationResult updateCollaboration(UpdateCollaborationRequest updateCollaborationRequest);

    /**
     * <p>
     * Provides the details necessary to update a configured audience model association.
     * </p>
     * 
     * @param updateConfiguredAudienceModelAssociationRequest
     * @return Result of the UpdateConfiguredAudienceModelAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdateConfiguredAudienceModelAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredAudienceModelAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConfiguredAudienceModelAssociationResult updateConfiguredAudienceModelAssociation(
            UpdateConfiguredAudienceModelAssociationRequest updateConfiguredAudienceModelAssociationRequest);

    /**
     * <p>
     * Updates a configured table.
     * </p>
     * 
     * @param updateConfiguredTableRequest
     * @return Result of the UpdateConfiguredTable operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdateConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredTable"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConfiguredTableResult updateConfiguredTable(UpdateConfiguredTableRequest updateConfiguredTableRequest);

    /**
     * <p>
     * Updates a configured table analysis rule.
     * </p>
     * 
     * @param updateConfiguredTableAnalysisRuleRequest
     * @return Result of the UpdateConfiguredTableAnalysisRule operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdateConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConfiguredTableAnalysisRuleResult updateConfiguredTableAnalysisRule(UpdateConfiguredTableAnalysisRuleRequest updateConfiguredTableAnalysisRuleRequest);

    /**
     * <p>
     * Updates a configured table association.
     * </p>
     * 
     * @param updateConfiguredTableAssociationRequest
     * @return Result of the UpdateConfiguredTableAssociation operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdateConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConfiguredTableAssociationResult updateConfiguredTableAssociation(UpdateConfiguredTableAssociationRequest updateConfiguredTableAssociationRequest);

    /**
     * <p>
     * Updates a membership.
     * </p>
     * 
     * @param updateMembershipRequest
     * @return Result of the UpdateMembership operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdateMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateMembership" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateMembershipResult updateMembership(UpdateMembershipRequest updateMembershipRequest);

    /**
     * <p>
     * Updates the privacy budget template for the specified membership.
     * </p>
     * 
     * @param updatePrivacyBudgetTemplateRequest
     * @return Result of the UpdatePrivacyBudgetTemplate operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdatePrivacyBudgetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdatePrivacyBudgetTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePrivacyBudgetTemplateResult updatePrivacyBudgetTemplate(UpdatePrivacyBudgetTemplateRequest updatePrivacyBudgetTemplateRequest);

    /**
     * <p>
     * Updates the processing of a currently running query.
     * </p>
     * 
     * @param updateProtectedQueryRequest
     * @return Result of the UpdateProtectedQuery operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdateProtectedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateProtectedQuery"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateProtectedQueryResult updateProtectedQuery(UpdateProtectedQueryRequest updateProtectedQueryRequest);

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
