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

import com.amazonaws.services.route53recoveryreadiness.model.*;

/**
 * Interface for accessing AWS Route53 Recovery Readiness asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53recoveryreadiness.AbstractAWSRoute53RecoveryReadinessAsync} instead.
 * </p>
 * <p>
 * <p>
 * Recovery readiness
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRoute53RecoveryReadinessAsync extends AWSRoute53RecoveryReadiness {

    /**
     * <p>
     * Creates a cell in an account.
     * </p>
     * 
     * @param createCellRequest
     * @return A Java Future containing the result of the CreateCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.CreateCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCellResult> createCellAsync(CreateCellRequest createCellRequest);

    /**
     * <p>
     * Creates a cell in an account.
     * </p>
     * 
     * @param createCellRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.CreateCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCellResult> createCellAsync(CreateCellRequest createCellRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCellRequest, CreateCellResult> asyncHandler);

    /**
     * <p>
     * Creates a cross-account readiness authorization. This lets you authorize another account to work with Route 53
     * Application Recovery Controller, for example, to check the readiness status of resources in a separate account.
     * </p>
     * 
     * @param createCrossAccountAuthorizationRequest
     * @return A Java Future containing the result of the CreateCrossAccountAuthorization operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsync.CreateCrossAccountAuthorization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCrossAccountAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCrossAccountAuthorizationResult> createCrossAccountAuthorizationAsync(
            CreateCrossAccountAuthorizationRequest createCrossAccountAuthorizationRequest);

    /**
     * <p>
     * Creates a cross-account readiness authorization. This lets you authorize another account to work with Route 53
     * Application Recovery Controller, for example, to check the readiness status of resources in a separate account.
     * </p>
     * 
     * @param createCrossAccountAuthorizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCrossAccountAuthorization operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.CreateCrossAccountAuthorization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCrossAccountAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCrossAccountAuthorizationResult> createCrossAccountAuthorizationAsync(
            CreateCrossAccountAuthorizationRequest createCrossAccountAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCrossAccountAuthorizationRequest, CreateCrossAccountAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Creates a readiness check in an account. A readiness check monitors a resource set in your application, such as a
     * set of Amazon Aurora instances, that Application Recovery Controller is auditing recovery readiness for. The
     * audits run once every minute on every resource that's associated with a readiness check.
     * </p>
     * 
     * @param createReadinessCheckRequest
     * @return A Java Future containing the result of the CreateReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.CreateReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReadinessCheckResult> createReadinessCheckAsync(CreateReadinessCheckRequest createReadinessCheckRequest);

    /**
     * <p>
     * Creates a readiness check in an account. A readiness check monitors a resource set in your application, such as a
     * set of Amazon Aurora instances, that Application Recovery Controller is auditing recovery readiness for. The
     * audits run once every minute on every resource that's associated with a readiness check.
     * </p>
     * 
     * @param createReadinessCheckRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.CreateReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReadinessCheckResult> createReadinessCheckAsync(CreateReadinessCheckRequest createReadinessCheckRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReadinessCheckRequest, CreateReadinessCheckResult> asyncHandler);

    /**
     * <p>
     * Creates a recovery group in an account. A recovery group corresponds to an application and includes a list of the
     * cells that make up the application.
     * </p>
     * 
     * @param createRecoveryGroupRequest
     * @return A Java Future containing the result of the CreateRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.CreateRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRecoveryGroupResult> createRecoveryGroupAsync(CreateRecoveryGroupRequest createRecoveryGroupRequest);

    /**
     * <p>
     * Creates a recovery group in an account. A recovery group corresponds to an application and includes a list of the
     * cells that make up the application.
     * </p>
     * 
     * @param createRecoveryGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.CreateRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRecoveryGroupResult> createRecoveryGroupAsync(CreateRecoveryGroupRequest createRecoveryGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRecoveryGroupRequest, CreateRecoveryGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a resource set. A resource set is a set of resources of one type that span multiple cells. You can
     * associate a resource set with a readiness check to monitor the resources for failover readiness.
     * </p>
     * 
     * @param createResourceSetRequest
     * @return A Java Future containing the result of the CreateResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.CreateResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceSetResult> createResourceSetAsync(CreateResourceSetRequest createResourceSetRequest);

    /**
     * <p>
     * Creates a resource set. A resource set is a set of resources of one type that span multiple cells. You can
     * associate a resource set with a readiness check to monitor the resources for failover readiness.
     * </p>
     * 
     * @param createResourceSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.CreateResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceSetResult> createResourceSetAsync(CreateResourceSetRequest createResourceSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResourceSetRequest, CreateResourceSetResult> asyncHandler);

    /**
     * <p>
     * Delete a cell. When successful, the response code is 204, with no response body.
     * </p>
     * 
     * @param deleteCellRequest
     * @return A Java Future containing the result of the DeleteCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.DeleteCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCellResult> deleteCellAsync(DeleteCellRequest deleteCellRequest);

    /**
     * <p>
     * Delete a cell. When successful, the response code is 204, with no response body.
     * </p>
     * 
     * @param deleteCellRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.DeleteCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCellResult> deleteCellAsync(DeleteCellRequest deleteCellRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCellRequest, DeleteCellResult> asyncHandler);

    /**
     * <p>
     * Deletes cross account readiness authorization.
     * </p>
     * 
     * @param deleteCrossAccountAuthorizationRequest
     * @return A Java Future containing the result of the DeleteCrossAccountAuthorization operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsync.DeleteCrossAccountAuthorization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteCrossAccountAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCrossAccountAuthorizationResult> deleteCrossAccountAuthorizationAsync(
            DeleteCrossAccountAuthorizationRequest deleteCrossAccountAuthorizationRequest);

    /**
     * <p>
     * Deletes cross account readiness authorization.
     * </p>
     * 
     * @param deleteCrossAccountAuthorizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCrossAccountAuthorization operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.DeleteCrossAccountAuthorization
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteCrossAccountAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCrossAccountAuthorizationResult> deleteCrossAccountAuthorizationAsync(
            DeleteCrossAccountAuthorizationRequest deleteCrossAccountAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCrossAccountAuthorizationRequest, DeleteCrossAccountAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Deletes a readiness check.
     * </p>
     * 
     * @param deleteReadinessCheckRequest
     * @return A Java Future containing the result of the DeleteReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.DeleteReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReadinessCheckResult> deleteReadinessCheckAsync(DeleteReadinessCheckRequest deleteReadinessCheckRequest);

    /**
     * <p>
     * Deletes a readiness check.
     * </p>
     * 
     * @param deleteReadinessCheckRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.DeleteReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReadinessCheckResult> deleteReadinessCheckAsync(DeleteReadinessCheckRequest deleteReadinessCheckRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReadinessCheckRequest, DeleteReadinessCheckResult> asyncHandler);

    /**
     * <p>
     * Deletes a recovery group.
     * </p>
     * 
     * @param deleteRecoveryGroupRequest
     * @return A Java Future containing the result of the DeleteRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.DeleteRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecoveryGroupResult> deleteRecoveryGroupAsync(DeleteRecoveryGroupRequest deleteRecoveryGroupRequest);

    /**
     * <p>
     * Deletes a recovery group.
     * </p>
     * 
     * @param deleteRecoveryGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.DeleteRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecoveryGroupResult> deleteRecoveryGroupAsync(DeleteRecoveryGroupRequest deleteRecoveryGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRecoveryGroupRequest, DeleteRecoveryGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a resource set.
     * </p>
     * 
     * @param deleteResourceSetRequest
     * @return A Java Future containing the result of the DeleteResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.DeleteResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceSetResult> deleteResourceSetAsync(DeleteResourceSetRequest deleteResourceSetRequest);

    /**
     * <p>
     * Deletes a resource set.
     * </p>
     * 
     * @param deleteResourceSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.DeleteResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceSetResult> deleteResourceSetAsync(DeleteResourceSetRequest deleteResourceSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceSetRequest, DeleteResourceSetResult> asyncHandler);

    /**
     * <p>
     * Gets recommendations about architecture designs for improving resiliency for an application, based on a recovery
     * group.
     * </p>
     * 
     * @param getArchitectureRecommendationsRequest
     * @return A Java Future containing the result of the GetArchitectureRecommendations operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetArchitectureRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetArchitectureRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetArchitectureRecommendationsResult> getArchitectureRecommendationsAsync(
            GetArchitectureRecommendationsRequest getArchitectureRecommendationsRequest);

    /**
     * <p>
     * Gets recommendations about architecture designs for improving resiliency for an application, based on a recovery
     * group.
     * </p>
     * 
     * @param getArchitectureRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetArchitectureRecommendations operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetArchitectureRecommendations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetArchitectureRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetArchitectureRecommendationsResult> getArchitectureRecommendationsAsync(
            GetArchitectureRecommendationsRequest getArchitectureRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetArchitectureRecommendationsRequest, GetArchitectureRecommendationsResult> asyncHandler);

    /**
     * <p>
     * Gets information about a cell including cell name, cell Amazon Resource Name (ARN), ARNs of nested cells for this
     * cell, and a list of those cell ARNs with their associated recovery group ARNs.
     * </p>
     * 
     * @param getCellRequest
     * @return A Java Future containing the result of the GetCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCellResult> getCellAsync(GetCellRequest getCellRequest);

    /**
     * <p>
     * Gets information about a cell including cell name, cell Amazon Resource Name (ARN), ARNs of nested cells for this
     * cell, and a list of those cell ARNs with their associated recovery group ARNs.
     * </p>
     * 
     * @param getCellRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCellResult> getCellAsync(GetCellRequest getCellRequest,
            com.amazonaws.handlers.AsyncHandler<GetCellRequest, GetCellResult> asyncHandler);

    /**
     * <p>
     * Gets readiness for a cell. Aggregates the readiness of all the resources that are associated with the cell into a
     * single value.
     * </p>
     * 
     * @param getCellReadinessSummaryRequest
     * @return A Java Future containing the result of the GetCellReadinessSummary operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetCellReadinessSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCellReadinessSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCellReadinessSummaryResult> getCellReadinessSummaryAsync(GetCellReadinessSummaryRequest getCellReadinessSummaryRequest);

    /**
     * <p>
     * Gets readiness for a cell. Aggregates the readiness of all the resources that are associated with the cell into a
     * single value.
     * </p>
     * 
     * @param getCellReadinessSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCellReadinessSummary operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetCellReadinessSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetCellReadinessSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCellReadinessSummaryResult> getCellReadinessSummaryAsync(GetCellReadinessSummaryRequest getCellReadinessSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetCellReadinessSummaryRequest, GetCellReadinessSummaryResult> asyncHandler);

    /**
     * <p>
     * Gets details about a readiness check.
     * </p>
     * 
     * @param getReadinessCheckRequest
     * @return A Java Future containing the result of the GetReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReadinessCheckResult> getReadinessCheckAsync(GetReadinessCheckRequest getReadinessCheckRequest);

    /**
     * <p>
     * Gets details about a readiness check.
     * </p>
     * 
     * @param getReadinessCheckRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReadinessCheckResult> getReadinessCheckAsync(GetReadinessCheckRequest getReadinessCheckRequest,
            com.amazonaws.handlers.AsyncHandler<GetReadinessCheckRequest, GetReadinessCheckResult> asyncHandler);

    /**
     * <p>
     * Gets individual readiness status for a readiness check. To see the overall readiness status for a recovery group,
     * that considers the readiness status for all the readiness checks in the recovery group, use
     * GetRecoveryGroupReadinessSummary.
     * </p>
     * 
     * @param getReadinessCheckResourceStatusRequest
     * @return A Java Future containing the result of the GetReadinessCheckResourceStatus operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetReadinessCheckResourceStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckResourceStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReadinessCheckResourceStatusResult> getReadinessCheckResourceStatusAsync(
            GetReadinessCheckResourceStatusRequest getReadinessCheckResourceStatusRequest);

    /**
     * <p>
     * Gets individual readiness status for a readiness check. To see the overall readiness status for a recovery group,
     * that considers the readiness status for all the readiness checks in the recovery group, use
     * GetRecoveryGroupReadinessSummary.
     * </p>
     * 
     * @param getReadinessCheckResourceStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReadinessCheckResourceStatus operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetReadinessCheckResourceStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckResourceStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReadinessCheckResourceStatusResult> getReadinessCheckResourceStatusAsync(
            GetReadinessCheckResourceStatusRequest getReadinessCheckResourceStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetReadinessCheckResourceStatusRequest, GetReadinessCheckResourceStatusResult> asyncHandler);

    /**
     * <p>
     * Gets the readiness status for an individual readiness check. To see the overall readiness status for a recovery
     * group, that considers the readiness status for all the readiness checks in a recovery group, use
     * GetRecoveryGroupReadinessSummary.
     * </p>
     * 
     * @param getReadinessCheckStatusRequest
     * @return A Java Future containing the result of the GetReadinessCheckStatus operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetReadinessCheckStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReadinessCheckStatusResult> getReadinessCheckStatusAsync(GetReadinessCheckStatusRequest getReadinessCheckStatusRequest);

    /**
     * <p>
     * Gets the readiness status for an individual readiness check. To see the overall readiness status for a recovery
     * group, that considers the readiness status for all the readiness checks in a recovery group, use
     * GetRecoveryGroupReadinessSummary.
     * </p>
     * 
     * @param getReadinessCheckStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReadinessCheckStatus operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetReadinessCheckStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReadinessCheckStatusResult> getReadinessCheckStatusAsync(GetReadinessCheckStatusRequest getReadinessCheckStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetReadinessCheckStatusRequest, GetReadinessCheckStatusResult> asyncHandler);

    /**
     * <p>
     * Gets details about a recovery group, including a list of the cells that are included in it.
     * </p>
     * 
     * @param getRecoveryGroupRequest
     * @return A Java Future containing the result of the GetRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecoveryGroupResult> getRecoveryGroupAsync(GetRecoveryGroupRequest getRecoveryGroupRequest);

    /**
     * <p>
     * Gets details about a recovery group, including a list of the cells that are included in it.
     * </p>
     * 
     * @param getRecoveryGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecoveryGroupResult> getRecoveryGroupAsync(GetRecoveryGroupRequest getRecoveryGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecoveryGroupRequest, GetRecoveryGroupResult> asyncHandler);

    /**
     * <p>
     * Displays a summary of information about a recovery group's readiness status. Includes the readiness checks for
     * resources in the recovery group and the readiness status of each one.
     * </p>
     * 
     * @param getRecoveryGroupReadinessSummaryRequest
     * @return A Java Future containing the result of the GetRecoveryGroupReadinessSummary operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetRecoveryGroupReadinessSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroupReadinessSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecoveryGroupReadinessSummaryResult> getRecoveryGroupReadinessSummaryAsync(
            GetRecoveryGroupReadinessSummaryRequest getRecoveryGroupReadinessSummaryRequest);

    /**
     * <p>
     * Displays a summary of information about a recovery group's readiness status. Includes the readiness checks for
     * resources in the recovery group and the readiness status of each one.
     * </p>
     * 
     * @param getRecoveryGroupReadinessSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecoveryGroupReadinessSummary operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetRecoveryGroupReadinessSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroupReadinessSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecoveryGroupReadinessSummaryResult> getRecoveryGroupReadinessSummaryAsync(
            GetRecoveryGroupReadinessSummaryRequest getRecoveryGroupReadinessSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecoveryGroupReadinessSummaryRequest, GetRecoveryGroupReadinessSummaryResult> asyncHandler);

    /**
     * <p>
     * Displays the details about a resource set, including a list of the resources in the set.
     * </p>
     * 
     * @param getResourceSetRequest
     * @return A Java Future containing the result of the GetResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.GetResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceSetResult> getResourceSetAsync(GetResourceSetRequest getResourceSetRequest);

    /**
     * <p>
     * Displays the details about a resource set, including a list of the resources in the set.
     * </p>
     * 
     * @param getResourceSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.GetResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceSetResult> getResourceSetAsync(GetResourceSetRequest getResourceSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceSetRequest, GetResourceSetResult> asyncHandler);

    /**
     * <p>
     * Lists the cells for an account.
     * </p>
     * 
     * @param listCellsRequest
     * @return A Java Future containing the result of the ListCells operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.ListCells
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListCells"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCellsResult> listCellsAsync(ListCellsRequest listCellsRequest);

    /**
     * <p>
     * Lists the cells for an account.
     * </p>
     * 
     * @param listCellsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCells operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.ListCells
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListCells"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCellsResult> listCellsAsync(ListCellsRequest listCellsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCellsRequest, ListCellsResult> asyncHandler);

    /**
     * <p>
     * Lists the cross-account readiness authorizations that are in place for an account.
     * </p>
     * 
     * @param listCrossAccountAuthorizationsRequest
     * @return A Java Future containing the result of the ListCrossAccountAuthorizations operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsync.ListCrossAccountAuthorizations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListCrossAccountAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCrossAccountAuthorizationsResult> listCrossAccountAuthorizationsAsync(
            ListCrossAccountAuthorizationsRequest listCrossAccountAuthorizationsRequest);

    /**
     * <p>
     * Lists the cross-account readiness authorizations that are in place for an account.
     * </p>
     * 
     * @param listCrossAccountAuthorizationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCrossAccountAuthorizations operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.ListCrossAccountAuthorizations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListCrossAccountAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCrossAccountAuthorizationsResult> listCrossAccountAuthorizationsAsync(
            ListCrossAccountAuthorizationsRequest listCrossAccountAuthorizationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCrossAccountAuthorizationsRequest, ListCrossAccountAuthorizationsResult> asyncHandler);

    /**
     * <p>
     * Lists the readiness checks for an account.
     * </p>
     * 
     * @param listReadinessChecksRequest
     * @return A Java Future containing the result of the ListReadinessChecks operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.ListReadinessChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListReadinessChecks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReadinessChecksResult> listReadinessChecksAsync(ListReadinessChecksRequest listReadinessChecksRequest);

    /**
     * <p>
     * Lists the readiness checks for an account.
     * </p>
     * 
     * @param listReadinessChecksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReadinessChecks operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.ListReadinessChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListReadinessChecks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReadinessChecksResult> listReadinessChecksAsync(ListReadinessChecksRequest listReadinessChecksRequest,
            com.amazonaws.handlers.AsyncHandler<ListReadinessChecksRequest, ListReadinessChecksResult> asyncHandler);

    /**
     * <p>
     * Lists the recovery groups in an account.
     * </p>
     * 
     * @param listRecoveryGroupsRequest
     * @return A Java Future containing the result of the ListRecoveryGroups operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.ListRecoveryGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRecoveryGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecoveryGroupsResult> listRecoveryGroupsAsync(ListRecoveryGroupsRequest listRecoveryGroupsRequest);

    /**
     * <p>
     * Lists the recovery groups in an account.
     * </p>
     * 
     * @param listRecoveryGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecoveryGroups operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.ListRecoveryGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRecoveryGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecoveryGroupsResult> listRecoveryGroupsAsync(ListRecoveryGroupsRequest listRecoveryGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecoveryGroupsRequest, ListRecoveryGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists the resource sets in an account.
     * </p>
     * 
     * @param listResourceSetsRequest
     * @return A Java Future containing the result of the ListResourceSets operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.ListResourceSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListResourceSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceSetsResult> listResourceSetsAsync(ListResourceSetsRequest listResourceSetsRequest);

    /**
     * <p>
     * Lists the resource sets in an account.
     * </p>
     * 
     * @param listResourceSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceSets operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.ListResourceSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListResourceSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceSetsResult> listResourceSetsAsync(ListResourceSetsRequest listResourceSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceSetsRequest, ListResourceSetsResult> asyncHandler);

    /**
     * <p>
     * Lists all readiness rules, or lists the readiness rules for a specific resource type.
     * </p>
     * 
     * @param listRulesRequest
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest);

    /**
     * <p>
     * Lists all readiness rules, or lists the readiness rules for a specific resource type.
     * </p>
     * 
     * @param listRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for a resource.
     * </p>
     * 
     * @param listTagsForResourcesRequest
     * @return A Java Future containing the result of the ListTagsForResources operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.ListTagsForResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListTagsForResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(ListTagsForResourcesRequest listTagsForResourcesRequest);

    /**
     * <p>
     * Lists the tags for a resource.
     * </p>
     * 
     * @param listTagsForResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResources operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.ListTagsForResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListTagsForResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(ListTagsForResourcesRequest listTagsForResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourcesRequest, ListTagsForResourcesResult> asyncHandler);

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a cell to replace the list of nested cells with a new list of nested cells.
     * </p>
     * 
     * @param updateCellRequest
     * @return A Java Future containing the result of the UpdateCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.UpdateCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCellResult> updateCellAsync(UpdateCellRequest updateCellRequest);

    /**
     * <p>
     * Updates a cell to replace the list of nested cells with a new list of nested cells.
     * </p>
     * 
     * @param updateCellRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCell operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.UpdateCell
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateCell"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCellResult> updateCellAsync(UpdateCellRequest updateCellRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCellRequest, UpdateCellResult> asyncHandler);

    /**
     * <p>
     * Updates a readiness check.
     * </p>
     * 
     * @param updateReadinessCheckRequest
     *        Name of a readiness check to describe.
     * @return A Java Future containing the result of the UpdateReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.UpdateReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReadinessCheckResult> updateReadinessCheckAsync(UpdateReadinessCheckRequest updateReadinessCheckRequest);

    /**
     * <p>
     * Updates a readiness check.
     * </p>
     * 
     * @param updateReadinessCheckRequest
     *        Name of a readiness check to describe.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateReadinessCheck operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.UpdateReadinessCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateReadinessCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateReadinessCheckResult> updateReadinessCheckAsync(UpdateReadinessCheckRequest updateReadinessCheckRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateReadinessCheckRequest, UpdateReadinessCheckResult> asyncHandler);

    /**
     * <p>
     * Updates a recovery group.
     * </p>
     * 
     * @param updateRecoveryGroupRequest
     *        Name of a recovery group.
     * @return A Java Future containing the result of the UpdateRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.UpdateRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecoveryGroupResult> updateRecoveryGroupAsync(UpdateRecoveryGroupRequest updateRecoveryGroupRequest);

    /**
     * <p>
     * Updates a recovery group.
     * </p>
     * 
     * @param updateRecoveryGroupRequest
     *        Name of a recovery group.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRecoveryGroup operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.UpdateRecoveryGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateRecoveryGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecoveryGroupResult> updateRecoveryGroupAsync(UpdateRecoveryGroupRequest updateRecoveryGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRecoveryGroupRequest, UpdateRecoveryGroupResult> asyncHandler);

    /**
     * <p>
     * Updates a resource set.
     * </p>
     * 
     * @param updateResourceSetRequest
     *        Name of a resource set.
     * @return A Java Future containing the result of the UpdateResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsync.UpdateResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceSetResult> updateResourceSetAsync(UpdateResourceSetRequest updateResourceSetRequest);

    /**
     * <p>
     * Updates a resource set.
     * </p>
     * 
     * @param updateResourceSetRequest
     *        Name of a resource set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResourceSet operation returned by the service.
     * @sample AWSRoute53RecoveryReadinessAsyncHandler.UpdateResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateResourceSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceSetResult> updateResourceSetAsync(UpdateResourceSetRequest updateResourceSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceSetRequest, UpdateResourceSetResult> asyncHandler);

}
