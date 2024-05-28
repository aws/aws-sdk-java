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
package com.amazonaws.services.launchwizard;

import javax.annotation.Generated;

import com.amazonaws.services.launchwizard.model.*;

/**
 * Interface for accessing AWS Launch Wizard asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.launchwizard.AbstractAWSLaunchWizardAsync} instead.
 * </p>
 * <p>
 * <p>
 * Launch Wizard offers a guided way of sizing, configuring, and deploying Amazon Web Services resources for third party
 * applications, such as Microsoft SQL Server Always On and HANA based SAP systems, without the need to manually
 * identify and provision individual Amazon Web Services resources.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLaunchWizardAsync extends AWSLaunchWizard {

    /**
     * <p>
     * Creates a deployment for the given workload. Deployments created by this operation are not available in the
     * Launch Wizard console to use the <code>Clone deployment</code> action on.
     * </p>
     * 
     * @param createDeploymentRequest
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AWSLaunchWizardAsync.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/CreateDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Creates a deployment for the given workload. Deployments created by this operation are not available in the
     * Launch Wizard console to use the <code>Clone deployment</code> action on.
     * </p>
     * 
     * @param createDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AWSLaunchWizardAsyncHandler.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/CreateDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler);

    /**
     * <p>
     * Deletes a deployment.
     * </p>
     * 
     * @param deleteDeploymentRequest
     * @return A Java Future containing the result of the DeleteDeployment operation returned by the service.
     * @sample AWSLaunchWizardAsync.DeleteDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/DeleteDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeploymentResult> deleteDeploymentAsync(DeleteDeploymentRequest deleteDeploymentRequest);

    /**
     * <p>
     * Deletes a deployment.
     * </p>
     * 
     * @param deleteDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDeployment operation returned by the service.
     * @sample AWSLaunchWizardAsyncHandler.DeleteDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/DeleteDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeploymentResult> deleteDeploymentAsync(DeleteDeploymentRequest deleteDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeploymentRequest, DeleteDeploymentResult> asyncHandler);

    /**
     * <p>
     * Returns information about the deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return A Java Future containing the result of the GetDeployment operation returned by the service.
     * @sample AWSLaunchWizardAsync.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/GetDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Returns information about the deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeployment operation returned by the service.
     * @sample AWSLaunchWizardAsyncHandler.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/GetDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler);

    /**
     * <p>
     * Returns information about a workload.
     * </p>
     * 
     * @param getWorkloadRequest
     * @return A Java Future containing the result of the GetWorkload operation returned by the service.
     * @sample AWSLaunchWizardAsync.GetWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/GetWorkload" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkloadResult> getWorkloadAsync(GetWorkloadRequest getWorkloadRequest);

    /**
     * <p>
     * Returns information about a workload.
     * </p>
     * 
     * @param getWorkloadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkload operation returned by the service.
     * @sample AWSLaunchWizardAsyncHandler.GetWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/GetWorkload" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkloadResult> getWorkloadAsync(GetWorkloadRequest getWorkloadRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkloadRequest, GetWorkloadResult> asyncHandler);

    /**
     * <p>
     * Lists the events of a deployment.
     * </p>
     * 
     * @param listDeploymentEventsRequest
     * @return A Java Future containing the result of the ListDeploymentEvents operation returned by the service.
     * @sample AWSLaunchWizardAsync.ListDeploymentEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListDeploymentEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentEventsResult> listDeploymentEventsAsync(ListDeploymentEventsRequest listDeploymentEventsRequest);

    /**
     * <p>
     * Lists the events of a deployment.
     * </p>
     * 
     * @param listDeploymentEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeploymentEvents operation returned by the service.
     * @sample AWSLaunchWizardAsyncHandler.ListDeploymentEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListDeploymentEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentEventsResult> listDeploymentEventsAsync(ListDeploymentEventsRequest listDeploymentEventsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentEventsRequest, ListDeploymentEventsResult> asyncHandler);

    /**
     * <p>
     * Lists the deployments that have been created.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @return A Java Future containing the result of the ListDeployments operation returned by the service.
     * @sample AWSLaunchWizardAsync.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListDeployments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest listDeploymentsRequest);

    /**
     * <p>
     * Lists the deployments that have been created.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeployments operation returned by the service.
     * @sample AWSLaunchWizardAsyncHandler.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListDeployments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest listDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler);

    /**
     * <p>
     * Lists the workload deployment patterns.
     * </p>
     * 
     * @param listWorkloadDeploymentPatternsRequest
     * @return A Java Future containing the result of the ListWorkloadDeploymentPatterns operation returned by the
     *         service.
     * @sample AWSLaunchWizardAsync.ListWorkloadDeploymentPatterns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListWorkloadDeploymentPatterns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkloadDeploymentPatternsResult> listWorkloadDeploymentPatternsAsync(
            ListWorkloadDeploymentPatternsRequest listWorkloadDeploymentPatternsRequest);

    /**
     * <p>
     * Lists the workload deployment patterns.
     * </p>
     * 
     * @param listWorkloadDeploymentPatternsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkloadDeploymentPatterns operation returned by the
     *         service.
     * @sample AWSLaunchWizardAsyncHandler.ListWorkloadDeploymentPatterns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListWorkloadDeploymentPatterns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkloadDeploymentPatternsResult> listWorkloadDeploymentPatternsAsync(
            ListWorkloadDeploymentPatternsRequest listWorkloadDeploymentPatternsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkloadDeploymentPatternsRequest, ListWorkloadDeploymentPatternsResult> asyncHandler);

    /**
     * <p>
     * Lists the workloads.
     * </p>
     * 
     * @param listWorkloadsRequest
     * @return A Java Future containing the result of the ListWorkloads operation returned by the service.
     * @sample AWSLaunchWizardAsync.ListWorkloads
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListWorkloads" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkloadsResult> listWorkloadsAsync(ListWorkloadsRequest listWorkloadsRequest);

    /**
     * <p>
     * Lists the workloads.
     * </p>
     * 
     * @param listWorkloadsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkloads operation returned by the service.
     * @sample AWSLaunchWizardAsyncHandler.ListWorkloads
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListWorkloads" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListWorkloadsResult> listWorkloadsAsync(ListWorkloadsRequest listWorkloadsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkloadsRequest, ListWorkloadsResult> asyncHandler);

}
