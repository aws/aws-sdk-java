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
package com.amazonaws.services.entityresolution;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.entityresolution.model.*;

/**
 * Interface for accessing AWSEntityResolution.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.entityresolution.AbstractAWSEntityResolution} instead.
 * </p>
 * <p>
 * <p>
 * Welcome to the <i>Entity Resolution API Reference</i>.
 * </p>
 * <p>
 * Entity Resolution is an Amazon Web Services service that provides pre-configured entity resolution capabilities that
 * enable developers and analysts at advertising and marketing companies to build an accurate and complete view of their
 * consumers.
 * </p>
 * <p>
 * With Entity Resolution, you can match source records containing consumer identifiers, such as name, email address,
 * and phone number. This is true even when these records have incomplete or conflicting identifiers. For example,
 * Entity Resolution can effectively match a source record from a customer relationship management (CRM) system with a
 * source record from a marketing system containing campaign information.
 * </p>
 * <p>
 * To learn more about Entity Resolution concepts, procedures, and best practices, see the <a
 * href="https://docs.aws.amazon.com/entityresolution/latest/userguide/what-is-service.html">Entity Resolution User
 * Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSEntityResolution {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "entityresolution";

    /**
     * <p>
     * Adds a policy statement object. To retrieve a list of existing policy statements, use the <code>GetPolicy</code>
     * API.
     * </p>
     * 
     * @param addPolicyStatementRequest
     * @return Result of the AddPolicyStatement operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.AddPolicyStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/AddPolicyStatement"
     *      target="_top">AWS API Documentation</a>
     */
    AddPolicyStatementResult addPolicyStatement(AddPolicyStatementRequest addPolicyStatementRequest);

    /**
     * <p>
     * Deletes multiple unique IDs in a matching workflow.
     * </p>
     * 
     * @param batchDeleteUniqueIdRequest
     * @return Result of the BatchDeleteUniqueId operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.BatchDeleteUniqueId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/BatchDeleteUniqueId"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDeleteUniqueIdResult batchDeleteUniqueId(BatchDeleteUniqueIdRequest batchDeleteUniqueIdRequest);

    /**
     * <p>
     * Creates an <code>IdMappingWorkflow</code> object which stores the configuration of the data processing job to be
     * run. Each <code>IdMappingWorkflow</code> must have a unique workflow name. To modify an existing workflow, use
     * the <code>UpdateIdMappingWorkflow</code> API.
     * </p>
     * 
     * @param createIdMappingWorkflowRequest
     * @return Result of the CreateIdMappingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ExceedsLimitException
     *         The request was rejected because it attempted to create resources beyond the current Entity Resolution
     *         account limits. The error message describes the limit exceeded. <code>HTTP Status Code: 402</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.CreateIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/CreateIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    CreateIdMappingWorkflowResult createIdMappingWorkflow(CreateIdMappingWorkflowRequest createIdMappingWorkflowRequest);

    /**
     * <p>
     * Creates an ID namespace object which will help customers provide metadata explaining their dataset and how to use
     * it. Each ID namespace must have a unique name. To modify an existing ID namespace, use the
     * <code>UpdateIdNamespace</code> API.
     * </p>
     * 
     * @param createIdNamespaceRequest
     * @return Result of the CreateIdNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ExceedsLimitException
     *         The request was rejected because it attempted to create resources beyond the current Entity Resolution
     *         account limits. The error message describes the limit exceeded. <code>HTTP Status Code: 402</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.CreateIdNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/CreateIdNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    CreateIdNamespaceResult createIdNamespace(CreateIdNamespaceRequest createIdNamespaceRequest);

    /**
     * <p>
     * Creates a <code>MatchingWorkflow</code> object which stores the configuration of the data processing job to be
     * run. It is important to note that there should not be a pre-existing <code>MatchingWorkflow</code> with the same
     * name. To modify an existing workflow, utilize the <code>UpdateMatchingWorkflow</code> API.
     * </p>
     * 
     * @param createMatchingWorkflowRequest
     * @return Result of the CreateMatchingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ExceedsLimitException
     *         The request was rejected because it attempted to create resources beyond the current Entity Resolution
     *         account limits. The error message describes the limit exceeded. <code>HTTP Status Code: 402</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.CreateMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/CreateMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMatchingWorkflowResult createMatchingWorkflow(CreateMatchingWorkflowRequest createMatchingWorkflowRequest);

    /**
     * <p>
     * Creates a schema mapping, which defines the schema of the input customer records table. The
     * <code>SchemaMapping</code> also provides Entity Resolution with some metadata about the table, such as the
     * attribute types of the columns and which columns to match on.
     * </p>
     * 
     * @param createSchemaMappingRequest
     * @return Result of the CreateSchemaMapping operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ExceedsLimitException
     *         The request was rejected because it attempted to create resources beyond the current Entity Resolution
     *         account limits. The error message describes the limit exceeded. <code>HTTP Status Code: 402</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.CreateSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/CreateSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSchemaMappingResult createSchemaMapping(CreateSchemaMappingRequest createSchemaMappingRequest);

    /**
     * <p>
     * Deletes the <code>IdMappingWorkflow</code> with a given name. This operation will succeed even if a workflow with
     * the given name does not exist.
     * </p>
     * 
     * @param deleteIdMappingWorkflowRequest
     * @return Result of the DeleteIdMappingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.DeleteIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeleteIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteIdMappingWorkflowResult deleteIdMappingWorkflow(DeleteIdMappingWorkflowRequest deleteIdMappingWorkflowRequest);

    /**
     * <p>
     * Deletes the <code>IdNamespace</code> with a given name.
     * </p>
     * 
     * @param deleteIdNamespaceRequest
     * @return Result of the DeleteIdNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.DeleteIdNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeleteIdNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteIdNamespaceResult deleteIdNamespace(DeleteIdNamespaceRequest deleteIdNamespaceRequest);

    /**
     * <p>
     * Deletes the <code>MatchingWorkflow</code> with a given name. This operation will succeed even if a workflow with
     * the given name does not exist.
     * </p>
     * 
     * @param deleteMatchingWorkflowRequest
     * @return Result of the DeleteMatchingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.DeleteMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeleteMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMatchingWorkflowResult deleteMatchingWorkflow(DeleteMatchingWorkflowRequest deleteMatchingWorkflowRequest);

    /**
     * <p>
     * Deletes the policy statement.
     * </p>
     * 
     * @param deletePolicyStatementRequest
     * @return Result of the DeletePolicyStatement operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.DeletePolicyStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeletePolicyStatement"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePolicyStatementResult deletePolicyStatement(DeletePolicyStatementRequest deletePolicyStatementRequest);

    /**
     * <p>
     * Deletes the <code>SchemaMapping</code> with a given name. This operation will succeed even if a schema with the
     * given name does not exist. This operation will fail if there is a <code>MatchingWorkflow</code> object that
     * references the <code>SchemaMapping</code> in the workflow's <code>InputSourceConfig</code>.
     * </p>
     * 
     * @param deleteSchemaMappingRequest
     * @return Result of the DeleteSchemaMapping operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.DeleteSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeleteSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSchemaMappingResult deleteSchemaMapping(DeleteSchemaMappingRequest deleteSchemaMappingRequest);

    /**
     * <p>
     * Gets the status, metrics, and errors (if there are any) that are associated with a job.
     * </p>
     * 
     * @param getIdMappingJobRequest
     * @return Result of the GetIdMappingJob operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetIdMappingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetIdMappingJob"
     *      target="_top">AWS API Documentation</a>
     */
    GetIdMappingJobResult getIdMappingJob(GetIdMappingJobRequest getIdMappingJobRequest);

    /**
     * <p>
     * Returns the <code>IdMappingWorkflow</code> with a given name, if it exists.
     * </p>
     * 
     * @param getIdMappingWorkflowRequest
     * @return Result of the GetIdMappingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    GetIdMappingWorkflowResult getIdMappingWorkflow(GetIdMappingWorkflowRequest getIdMappingWorkflowRequest);

    /**
     * <p>
     * Returns the <code>IdNamespace</code> with a given name, if it exists.
     * </p>
     * 
     * @param getIdNamespaceRequest
     * @return Result of the GetIdNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetIdNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetIdNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    GetIdNamespaceResult getIdNamespace(GetIdNamespaceRequest getIdNamespaceRequest);

    /**
     * <p>
     * Returns the corresponding Match ID of a customer record if the record has been processed.
     * </p>
     * 
     * @param getMatchIdRequest
     * @return Result of the GetMatchId operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetMatchId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetMatchId" target="_top">AWS
     *      API Documentation</a>
     */
    GetMatchIdResult getMatchId(GetMatchIdRequest getMatchIdRequest);

    /**
     * <p>
     * Gets the status, metrics, and errors (if there are any) that are associated with a job.
     * </p>
     * 
     * @param getMatchingJobRequest
     * @return Result of the GetMatchingJob operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetMatchingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetMatchingJob"
     *      target="_top">AWS API Documentation</a>
     */
    GetMatchingJobResult getMatchingJob(GetMatchingJobRequest getMatchingJobRequest);

    /**
     * <p>
     * Returns the <code>MatchingWorkflow</code> with a given name, if it exists.
     * </p>
     * 
     * @param getMatchingWorkflowRequest
     * @return Result of the GetMatchingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    GetMatchingWorkflowResult getMatchingWorkflow(GetMatchingWorkflowRequest getMatchingWorkflowRequest);

    /**
     * <p>
     * Returns the resource-based policy.
     * </p>
     * 
     * @param getPolicyRequest
     * @return Result of the GetPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Returns the SchemaMapping of a given name.
     * </p>
     * 
     * @param getSchemaMappingRequest
     * @return Result of the GetSchemaMapping operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.GetSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    GetSchemaMappingResult getSchemaMapping(GetSchemaMappingRequest getSchemaMappingRequest);

    /**
     * <p>
     * Lists all ID mapping jobs for a given workflow.
     * </p>
     * 
     * @param listIdMappingJobsRequest
     * @return Result of the ListIdMappingJobs operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListIdMappingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListIdMappingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListIdMappingJobsResult listIdMappingJobs(ListIdMappingJobsRequest listIdMappingJobsRequest);

    /**
     * <p>
     * Returns a list of all the <code>IdMappingWorkflows</code> that have been created for an Amazon Web Services
     * account.
     * </p>
     * 
     * @param listIdMappingWorkflowsRequest
     * @return Result of the ListIdMappingWorkflows operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListIdMappingWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListIdMappingWorkflows"
     *      target="_top">AWS API Documentation</a>
     */
    ListIdMappingWorkflowsResult listIdMappingWorkflows(ListIdMappingWorkflowsRequest listIdMappingWorkflowsRequest);

    /**
     * <p>
     * Returns a list of all ID namespaces.
     * </p>
     * 
     * @param listIdNamespacesRequest
     * @return Result of the ListIdNamespaces operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListIdNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListIdNamespaces"
     *      target="_top">AWS API Documentation</a>
     */
    ListIdNamespacesResult listIdNamespaces(ListIdNamespacesRequest listIdNamespacesRequest);

    /**
     * <p>
     * Lists all jobs for a given workflow.
     * </p>
     * 
     * @param listMatchingJobsRequest
     * @return Result of the ListMatchingJobs operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListMatchingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListMatchingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListMatchingJobsResult listMatchingJobs(ListMatchingJobsRequest listMatchingJobsRequest);

    /**
     * <p>
     * Returns a list of all the <code>MatchingWorkflows</code> that have been created for an Amazon Web Services
     * account.
     * </p>
     * 
     * @param listMatchingWorkflowsRequest
     * @return Result of the ListMatchingWorkflows operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListMatchingWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListMatchingWorkflows"
     *      target="_top">AWS API Documentation</a>
     */
    ListMatchingWorkflowsResult listMatchingWorkflows(ListMatchingWorkflowsRequest listMatchingWorkflowsRequest);

    /**
     * <p>
     * Returns a list of all the <code>ProviderServices</code> that are available in this Amazon Web Services Region.
     * </p>
     * 
     * @param listProviderServicesRequest
     * @return Result of the ListProviderServices operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListProviderServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListProviderServices"
     *      target="_top">AWS API Documentation</a>
     */
    ListProviderServicesResult listProviderServices(ListProviderServicesRequest listProviderServicesRequest);

    /**
     * <p>
     * Returns a list of all the <code>SchemaMappings</code> that have been created for an Amazon Web Services account.
     * </p>
     * 
     * @param listSchemaMappingsRequest
     * @return Result of the ListSchemaMappings operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListSchemaMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListSchemaMappings"
     *      target="_top">AWS API Documentation</a>
     */
    ListSchemaMappingsResult listSchemaMappings(ListSchemaMappingsRequest listSchemaMappingsRequest);

    /**
     * <p>
     * Displays the tags associated with an Entity Resolution resource. In Entity Resolution, <code>SchemaMapping</code>
     * , and <code>MatchingWorkflow</code> can be tagged.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Updates the resource-based policy.
     * </p>
     * 
     * @param putPolicyRequest
     * @return Result of the PutPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.PutPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/PutPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    PutPolicyResult putPolicy(PutPolicyRequest putPolicyRequest);

    /**
     * <p>
     * Starts the <code>IdMappingJob</code> of a workflow. The workflow must have previously been created using the
     * <code>CreateIdMappingWorkflow</code> endpoint.
     * </p>
     * 
     * @param startIdMappingJobRequest
     * @return Result of the StartIdMappingJob operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ExceedsLimitException
     *         The request was rejected because it attempted to create resources beyond the current Entity Resolution
     *         account limits. The error message describes the limit exceeded. <code>HTTP Status Code: 402</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.StartIdMappingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/StartIdMappingJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartIdMappingJobResult startIdMappingJob(StartIdMappingJobRequest startIdMappingJobRequest);

    /**
     * <p>
     * Starts the <code>MatchingJob</code> of a workflow. The workflow must have previously been created using the
     * <code>CreateMatchingWorkflow</code> endpoint.
     * </p>
     * 
     * @param startMatchingJobRequest
     * @return Result of the StartMatchingJob operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ExceedsLimitException
     *         The request was rejected because it attempted to create resources beyond the current Entity Resolution
     *         account limits. The error message describes the limit exceeded. <code>HTTP Status Code: 402</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.StartMatchingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/StartMatchingJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartMatchingJobResult startMatchingJob(StartMatchingJobRequest startMatchingJobRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified Entity Resolution resource. Tags can help you
     * organize and categorize your resources. You can also use them to scope user permissions by granting a user
     * permission to access or change only resources with certain tag values. In Entity Resolution,
     * <code>SchemaMapping</code> and <code>MatchingWorkflow</code> can be tagged. Tags don't have any semantic meaning
     * to Amazon Web Services and are interpreted strictly as strings of characters. You can use the
     * <code>TagResource</code> action with a resource that already has tags. If you specify a new tag key, this tag is
     * appended to the list of tags associated with the resource. If you specify a tag key that is already associated
     * with the resource, the new tag value that you specify replaces the previous value for that tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified Entity Resolution resource. In Entity Resolution,
     * <code>SchemaMapping</code>, and <code>MatchingWorkflow</code> can be tagged.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @sample AWSEntityResolution.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an existing <code>IdMappingWorkflow</code>. This method is identical to
     * <code>CreateIdMappingWorkflow</code>, except it uses an HTTP <code>PUT</code> request instead of a
     * <code>POST</code> request, and the <code>IdMappingWorkflow</code> must already exist for the method to succeed.
     * </p>
     * 
     * @param updateIdMappingWorkflowRequest
     * @return Result of the UpdateIdMappingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.UpdateIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateIdMappingWorkflowResult updateIdMappingWorkflow(UpdateIdMappingWorkflowRequest updateIdMappingWorkflowRequest);

    /**
     * <p>
     * Updates an existing ID namespace.
     * </p>
     * 
     * @param updateIdNamespaceRequest
     * @return Result of the UpdateIdNamespace operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.UpdateIdNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateIdNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateIdNamespaceResult updateIdNamespace(UpdateIdNamespaceRequest updateIdNamespaceRequest);

    /**
     * <p>
     * Updates an existing <code>MatchingWorkflow</code>. This method is identical to
     * <code>CreateMatchingWorkflow</code>, except it uses an HTTP <code>PUT</code> request instead of a
     * <code>POST</code> request, and the <code>MatchingWorkflow</code> must already exist for the method to succeed.
     * </p>
     * 
     * @param updateMatchingWorkflowRequest
     * @return Result of the UpdateMatchingWorkflow operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.UpdateMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMatchingWorkflowResult updateMatchingWorkflow(UpdateMatchingWorkflowRequest updateMatchingWorkflowRequest);

    /**
     * <p>
     * Updates a schema mapping.
     * </p>
     * <note>
     * <p>
     * A schema is immutable if it is being used by a workflow. Therefore, you can't update a schema mapping if it's
     * associated with a workflow.
     * </p>
     * </note>
     * 
     * @param updateSchemaMappingRequest
     * @return Result of the UpdateSchemaMapping operation returned by the service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling. <code>HTTP Status Code: 429</code>
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Entity Resolution service.
     *         <code>HTTP Status Code: 500</code>
     * @throws ResourceNotFoundException
     *         The resource could not be found. <code>HTTP Status Code: 404</code>
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. <code>HTTP Status Code: 403</code>
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource. Example:
     *         Workflow already exists, Schema already exists, Workflow is currently running, etc.
     *         <code>HTTP Status Code: 400</code>
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Entity Resolution.
     *         <code>HTTP Status Code: 400</code>
     * @sample AWSEntityResolution.UpdateSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSchemaMappingResult updateSchemaMapping(UpdateSchemaMappingRequest updateSchemaMappingRequest);

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
