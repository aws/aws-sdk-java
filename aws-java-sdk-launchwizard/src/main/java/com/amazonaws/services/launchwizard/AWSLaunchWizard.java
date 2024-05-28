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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.launchwizard.model.*;

/**
 * Interface for accessing AWS Launch Wizard.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.launchwizard.AbstractAWSLaunchWizard} instead.
 * </p>
 * <p>
 * <p>
 * Launch Wizard offers a guided way of sizing, configuring, and deploying Amazon Web Services resources for third party
 * applications, such as Microsoft SQL Server Always On and HANA based SAP systems, without the need to manually
 * identify and provision individual Amazon Web Services resources.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLaunchWizard {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "launchwizard";

    /**
     * <p>
     * Creates a deployment for the given workload. Deployments created by this operation are not available in the
     * Launch Wizard console to use the <code>Clone deployment</code> action on.
     * </p>
     * 
     * @param createDeploymentRequest
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws ResourceLimitException
     *         You have exceeded an Launch Wizard resource limit. For example, you might have too many deployments in
     *         progress.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The specified workload or deployment resource can't be found.
     * @sample AWSLaunchWizard.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/CreateDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Deletes a deployment.
     * </p>
     * 
     * @param deleteDeploymentRequest
     * @return Result of the DeleteDeployment operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The specified workload or deployment resource can't be found.
     * @sample AWSLaunchWizard.DeleteDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/DeleteDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDeploymentResult deleteDeployment(DeleteDeploymentRequest deleteDeploymentRequest);

    /**
     * <p>
     * Returns information about the deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return Result of the GetDeployment operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The specified workload or deployment resource can't be found.
     * @sample AWSLaunchWizard.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/GetDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Returns information about a workload.
     * </p>
     * 
     * @param getWorkloadRequest
     * @return Result of the GetWorkload operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The specified workload or deployment resource can't be found.
     * @sample AWSLaunchWizard.GetWorkload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/GetWorkload" target="_top">AWS API
     *      Documentation</a>
     */
    GetWorkloadResult getWorkload(GetWorkloadRequest getWorkloadRequest);

    /**
     * <p>
     * Lists the events of a deployment.
     * </p>
     * 
     * @param listDeploymentEventsRequest
     * @return Result of the ListDeploymentEvents operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The specified workload or deployment resource can't be found.
     * @sample AWSLaunchWizard.ListDeploymentEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListDeploymentEvents"
     *      target="_top">AWS API Documentation</a>
     */
    ListDeploymentEventsResult listDeploymentEvents(ListDeploymentEventsRequest listDeploymentEventsRequest);

    /**
     * <p>
     * Lists the deployments that have been created.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @return Result of the ListDeployments operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSLaunchWizard.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListDeployments" target="_top">AWS
     *      API Documentation</a>
     */
    ListDeploymentsResult listDeployments(ListDeploymentsRequest listDeploymentsRequest);

    /**
     * <p>
     * Lists the workload deployment patterns.
     * </p>
     * 
     * @param listWorkloadDeploymentPatternsRequest
     * @return Result of the ListWorkloadDeploymentPatterns operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The specified workload or deployment resource can't be found.
     * @sample AWSLaunchWizard.ListWorkloadDeploymentPatterns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListWorkloadDeploymentPatterns"
     *      target="_top">AWS API Documentation</a>
     */
    ListWorkloadDeploymentPatternsResult listWorkloadDeploymentPatterns(ListWorkloadDeploymentPatternsRequest listWorkloadDeploymentPatternsRequest);

    /**
     * <p>
     * Lists the workloads.
     * </p>
     * 
     * @param listWorkloadsRequest
     * @return Result of the ListWorkloads operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details
     *         by posting a question on <a href="https://repost.aws/">re:Post</a>.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSLaunchWizard.ListWorkloads
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListWorkloads" target="_top">AWS
     *      API Documentation</a>
     */
    ListWorkloadsResult listWorkloads(ListWorkloadsRequest listWorkloadsRequest);

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
