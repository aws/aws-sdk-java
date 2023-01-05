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
package com.amazonaws.services.route53recoveryreadiness;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.route53recoveryreadiness.model.*;

/**
 * Interface for accessing AWS Route53 Recovery Readiness.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53recoveryreadiness.AbstractAWSRoute53RecoveryReadiness} instead.
 * </p>
 * <p>
 * <p>
 * Recovery readiness
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRoute53RecoveryReadiness {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "route53-recovery-readiness";

    /**
     * <p>
     * Creates a cell in an account.
     * </p>
     * 
     * @param createCellRequest
     * @return Result of the CreateCell operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws ConflictException
     *         409 response - Conflict exception. You might be using a predefined variable.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.CreateCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCell"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCellResult createCell(CreateCellRequest createCellRequest);

    /**
     * <p>
     * Creates a cross-account readiness authorization. This lets you authorize another account to work with Route 53
     * Application Recovery Controller, for example, to check the readiness status of resources in a separate account.
     * </p>
     * 
     * @param createCrossAccountAuthorizationRequest
     * @return Result of the CreateCrossAccountAuthorization operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws ConflictException
     *         409 response - Conflict exception. You might be using a predefined variable.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.CreateCrossAccountAuthorization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCrossAccountAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCrossAccountAuthorizationResult createCrossAccountAuthorization(CreateCrossAccountAuthorizationRequest createCrossAccountAuthorizationRequest);

    /**
     * <p>
     * Creates a readiness check in an account. A readiness check monitors a resource set in your application, such as a
     * set of Amazon Aurora instances, that Application Recovery Controller is auditing recovery readiness for. The
     * audits run once every minute on every resource that's associated with a readiness check.
     * </p>
     * 
     * @param createReadinessCheckRequest
     * @return Result of the CreateReadinessCheck operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws ConflictException
     *         409 response - Conflict exception. You might be using a predefined variable.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.CreateReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    CreateReadinessCheckResult createReadinessCheck(CreateReadinessCheckRequest createReadinessCheckRequest);

    /**
     * <p>
     * Creates a recovery group in an account. A recovery group corresponds to an application and includes a list of the
     * cells that make up the application.
     * </p>
     * 
     * @param createRecoveryGroupRequest
     * @return Result of the CreateRecoveryGroup operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws ConflictException
     *         409 response - Conflict exception. You might be using a predefined variable.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.CreateRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRecoveryGroupResult createRecoveryGroup(CreateRecoveryGroupRequest createRecoveryGroupRequest);

    /**
     * <p>
     * Creates a resource set. A resource set is a set of resources of one type that span multiple cells. You can
     * associate a resource set with a readiness check to monitor the resources for failover readiness.
     * </p>
     * 
     * @param createResourceSetRequest
     * @return Result of the CreateResourceSet operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws ConflictException
     *         409 response - Conflict exception. You might be using a predefined variable.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.CreateResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateResourceSetResult createResourceSet(CreateResourceSetRequest createResourceSetRequest);

    /**
     * <p>
     * Delete a cell. When successful, the response code is 204, with no response body.
     * </p>
     * 
     * @param deleteCellRequest
     * @return Result of the DeleteCell operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.DeleteCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteCell"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCellResult deleteCell(DeleteCellRequest deleteCellRequest);

    /**
     * <p>
     * Deletes cross account readiness authorization.
     * </p>
     * 
     * @param deleteCrossAccountAuthorizationRequest
     * @return Result of the DeleteCrossAccountAuthorization operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.DeleteCrossAccountAuthorization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteCrossAccountAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCrossAccountAuthorizationResult deleteCrossAccountAuthorization(DeleteCrossAccountAuthorizationRequest deleteCrossAccountAuthorizationRequest);

    /**
     * <p>
     * Deletes a readiness check.
     * </p>
     * 
     * @param deleteReadinessCheckRequest
     * @return Result of the DeleteReadinessCheck operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.DeleteReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteReadinessCheckResult deleteReadinessCheck(DeleteReadinessCheckRequest deleteReadinessCheckRequest);

    /**
     * <p>
     * Deletes a recovery group.
     * </p>
     * 
     * @param deleteRecoveryGroupRequest
     * @return Result of the DeleteRecoveryGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.DeleteRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRecoveryGroupResult deleteRecoveryGroup(DeleteRecoveryGroupRequest deleteRecoveryGroupRequest);

    /**
     * <p>
     * Deletes a resource set.
     * </p>
     * 
     * @param deleteResourceSetRequest
     * @return Result of the DeleteResourceSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.DeleteResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourceSetResult deleteResourceSet(DeleteResourceSetRequest deleteResourceSetRequest);

    /**
     * <p>
     * Gets recommendations about architecture designs for improving resiliency for an application, based on a recovery
     * group.
     * </p>
     * 
     * @param getArchitectureRecommendationsRequest
     * @return Result of the GetArchitectureRecommendations operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetArchitectureRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetArchitectureRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    GetArchitectureRecommendationsResult getArchitectureRecommendations(GetArchitectureRecommendationsRequest getArchitectureRecommendationsRequest);

    /**
     * <p>
     * Gets information about a cell including cell name, cell Amazon Resource Name (ARN), ARNs of nested cells for this
     * cell, and a list of those cell ARNs with their associated recovery group ARNs.
     * </p>
     * 
     * @param getCellRequest
     * @return Result of the GetCell operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCell"
     *      target="_top">AWS API Documentation</a>
     */
    GetCellResult getCell(GetCellRequest getCellRequest);

    /**
     * <p>
     * Gets readiness for a cell. Aggregates the readiness of all the resources that are associated with the cell into a
     * single value.
     * </p>
     * 
     * @param getCellReadinessSummaryRequest
     * @return Result of the GetCellReadinessSummary operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetCellReadinessSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCellReadinessSummary"
     *      target="_top">AWS API Documentation</a>
     */
    GetCellReadinessSummaryResult getCellReadinessSummary(GetCellReadinessSummaryRequest getCellReadinessSummaryRequest);

    /**
     * <p>
     * Gets details about a readiness check.
     * </p>
     * 
     * @param getReadinessCheckRequest
     * @return Result of the GetReadinessCheck operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    GetReadinessCheckResult getReadinessCheck(GetReadinessCheckRequest getReadinessCheckRequest);

    /**
     * <p>
     * Gets individual readiness status for a readiness check. To see the overall readiness status for a recovery group,
     * that considers the readiness status for all the readiness checks in the recovery group, use
     * GetRecoveryGroupReadinessSummary.
     * </p>
     * 
     * @param getReadinessCheckResourceStatusRequest
     * @return Result of the GetReadinessCheckResourceStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetReadinessCheckResourceStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckResourceStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetReadinessCheckResourceStatusResult getReadinessCheckResourceStatus(GetReadinessCheckResourceStatusRequest getReadinessCheckResourceStatusRequest);

    /**
     * <p>
     * Gets the readiness status for an individual readiness check. To see the overall readiness status for a recovery
     * group, that considers the readiness status for all the readiness checks in a recovery group, use
     * GetRecoveryGroupReadinessSummary.
     * </p>
     * 
     * @param getReadinessCheckStatusRequest
     * @return Result of the GetReadinessCheckStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetReadinessCheckStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetReadinessCheckStatusResult getReadinessCheckStatus(GetReadinessCheckStatusRequest getReadinessCheckStatusRequest);

    /**
     * <p>
     * Gets details about a recovery group, including a list of the cells that are included in it.
     * </p>
     * 
     * @param getRecoveryGroupRequest
     * @return Result of the GetRecoveryGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetRecoveryGroupResult getRecoveryGroup(GetRecoveryGroupRequest getRecoveryGroupRequest);

    /**
     * <p>
     * Displays a summary of information about a recovery group's readiness status. Includes the readiness checks for
     * resources in the recovery group and the readiness status of each one.
     * </p>
     * 
     * @param getRecoveryGroupReadinessSummaryRequest
     * @return Result of the GetRecoveryGroupReadinessSummary operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetRecoveryGroupReadinessSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroupReadinessSummary"
     *      target="_top">AWS API Documentation</a>
     */
    GetRecoveryGroupReadinessSummaryResult getRecoveryGroupReadinessSummary(GetRecoveryGroupReadinessSummaryRequest getRecoveryGroupReadinessSummaryRequest);

    /**
     * <p>
     * Displays the details about a resource set, including a list of the resources in the set.
     * </p>
     * 
     * @param getResourceSetRequest
     * @return Result of the GetResourceSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.GetResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceSetResult getResourceSet(GetResourceSetRequest getResourceSetRequest);

    /**
     * <p>
     * Lists the cells for an account.
     * </p>
     * 
     * @param listCellsRequest
     * @return Result of the ListCells operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListCells
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListCells"
     *      target="_top">AWS API Documentation</a>
     */
    ListCellsResult listCells(ListCellsRequest listCellsRequest);

    /**
     * <p>
     * Lists the cross-account readiness authorizations that are in place for an account.
     * </p>
     * 
     * @param listCrossAccountAuthorizationsRequest
     * @return Result of the ListCrossAccountAuthorizations operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListCrossAccountAuthorizations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListCrossAccountAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    ListCrossAccountAuthorizationsResult listCrossAccountAuthorizations(ListCrossAccountAuthorizationsRequest listCrossAccountAuthorizationsRequest);

    /**
     * <p>
     * Lists the readiness checks for an account.
     * </p>
     * 
     * @param listReadinessChecksRequest
     * @return Result of the ListReadinessChecks operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListReadinessChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListReadinessChecks"
     *      target="_top">AWS API Documentation</a>
     */
    ListReadinessChecksResult listReadinessChecks(ListReadinessChecksRequest listReadinessChecksRequest);

    /**
     * <p>
     * Lists the recovery groups in an account.
     * </p>
     * 
     * @param listRecoveryGroupsRequest
     * @return Result of the ListRecoveryGroups operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListRecoveryGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRecoveryGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecoveryGroupsResult listRecoveryGroups(ListRecoveryGroupsRequest listRecoveryGroupsRequest);

    /**
     * <p>
     * Lists the resource sets in an account.
     * </p>
     * 
     * @param listResourceSetsRequest
     * @return Result of the ListResourceSets operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListResourceSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListResourceSets"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourceSetsResult listResourceSets(ListResourceSetsRequest listResourceSetsRequest);

    /**
     * <p>
     * Lists all readiness rules, or lists the readiness rules for a specific resource type.
     * </p>
     * 
     * @param listRulesRequest
     * @return Result of the ListRules operation returned by the service.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRules"
     *      target="_top">AWS API Documentation</a>
     */
    ListRulesResult listRules(ListRulesRequest listRulesRequest);

    /**
     * <p>
     * Lists the tags for a resource.
     * </p>
     * 
     * @param listTagsForResourcesRequest
     * @return Result of the ListTagsForResources operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryReadiness.ListTagsForResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListTagsForResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourcesResult listTagsForResources(ListTagsForResourcesRequest listTagsForResourcesRequest);

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryReadiness.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryReadiness.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a cell to replace the list of nested cells with a new list of nested cells.
     * </p>
     * 
     * @param updateCellRequest
     * @return Result of the UpdateCell operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.UpdateCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateCell"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCellResult updateCell(UpdateCellRequest updateCellRequest);

    /**
     * <p>
     * Updates a readiness check.
     * </p>
     * 
     * @param updateReadinessCheckRequest
     *        Name of a readiness check to describe.
     * @return Result of the UpdateReadinessCheck operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.UpdateReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateReadinessCheckResult updateReadinessCheck(UpdateReadinessCheckRequest updateReadinessCheckRequest);

    /**
     * <p>
     * Updates a recovery group.
     * </p>
     * 
     * @param updateRecoveryGroupRequest
     *        Name of a recovery group.
     * @return Result of the UpdateRecoveryGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.UpdateRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRecoveryGroupResult updateRecoveryGroup(UpdateRecoveryGroupRequest updateRecoveryGroupRequest);

    /**
     * <p>
     * Updates a resource set.
     * </p>
     * 
     * @param updateResourceSetRequest
     *        Name of a resource set.
     * @return Result of the UpdateResourceSet operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - Malformed query string. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - Limit exceeded exception or too many requests exception.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string, an input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - Internal service error or temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - Access denied exception. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryReadiness.UpdateResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateResourceSetResult updateResourceSet(UpdateResourceSetRequest updateResourceSetRequest);

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
