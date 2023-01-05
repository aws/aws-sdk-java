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
package com.amazonaws.services.proton;

import javax.annotation.Generated;

import com.amazonaws.services.proton.model.*;

/**
 * Interface for accessing AWS Proton asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.proton.AbstractAWSProtonAsync} instead.
 * </p>
 * <p>
 * <p>
 * This is the Proton Service API Reference. It provides descriptions, syntax and usage examples for each of the <a
 * href="https://docs.aws.amazon.com/proton/latest/APIReference/API_Operations.html">actions</a> and <a
 * href="https://docs.aws.amazon.com/proton/latest/APIReference/API_Types.html">data types</a> for the Proton service.
 * </p>
 * <p>
 * The documentation for each action shows the Query API request parameters and the XML response.
 * </p>
 * <p>
 * Alternatively, you can use the Amazon Web Services CLI to access an API. For more information, see the <a
 * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html">Amazon Web Services Command Line
 * Interface User Guide</a>.
 * </p>
 * <p>
 * The Proton service is a two-pronged automation framework. Administrators create service templates to provide
 * standardized infrastructure and deployment tooling for serverless and container based applications. Developers, in
 * turn, select from the available service templates to automate their application or service deployments.
 * </p>
 * <p>
 * Because administrators define the infrastructure and tooling that Proton deploys and manages, they need permissions
 * to use all of the listed API operations.
 * </p>
 * <p>
 * When developers select a specific infrastructure and tooling set, Proton deploys their applications. To monitor their
 * applications that are running on Proton, developers need permissions to the service <i>create</i>, <i>list</i>,
 * <i>update</i> and <i>delete</i> API operations and the service instance <i>list</i> and <i>update</i> API operations.
 * </p>
 * <p>
 * To learn more about Proton, see the <a href="https://docs.aws.amazon.com/proton/latest/userguide/Welcome.html">Proton
 * User Guide</a>.
 * </p>
 * <p>
 * <b>Ensuring Idempotency</b>
 * </p>
 * <p>
 * When you make a mutating API request, the request typically returns a result before the asynchronous workflows of the
 * operation are complete. Operations might also time out or encounter other server issues before they're complete, even
 * if the request already returned a result. This might make it difficult to determine whether the request succeeded.
 * Moreover, you might need to retry the request multiple times to ensure that the operation completes successfully.
 * However, if the original request and the subsequent retries are successful, the operation occurs multiple times. This
 * means that you might create more resources than you intended.
 * </p>
 * <p>
 * <i>Idempotency</i> ensures that an API request action completes no more than one time. With an idempotent request, if
 * the original request action completes successfully, any subsequent retries complete successfully without performing
 * any further actions. However, the result might contain updated information, such as the current creation status.
 * </p>
 * <p>
 * The following lists of APIs are grouped according to methods that ensure idempotency.
 * </p>
 * <p>
 * <b>Idempotent create APIs with a client token</b>
 * </p>
 * <p>
 * The API actions in this list support idempotency with the use of a <i>client token</i>. The corresponding Amazon Web
 * Services CLI commands also support idempotency using a client token. A client token is a unique, case-sensitive
 * string of up to 64 ASCII characters. To make an idempotent API request using one of these actions, specify a client
 * token in the request. We recommend that you <i>don't</i> reuse the same client token for other API requests. If you
 * don’t provide a client token for these APIs, a default client token is automatically provided by SDKs.
 * </p>
 * <p>
 * Given a request action that has succeeded:
 * </p>
 * <p>
 * If you retry the request using the same client token and the same parameters, the retry succeeds without performing
 * any further actions other than returning the original resource detail data in the response.
 * </p>
 * <p>
 * If you retry the request using the same client token, but one or more of the parameters are different, the retry
 * throws a <code>ValidationException</code> with an <code>IdempotentParameterMismatch</code> error.
 * </p>
 * <p>
 * Client tokens expire eight hours after a request is made. If you retry the request with the expired token, a new
 * resource is created.
 * </p>
 * <p>
 * If the original resource is deleted and you retry the request, a new resource is created.
 * </p>
 * <p>
 * Idempotent create APIs with a client token:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CreateEnvironmentTemplateVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * CreateServiceTemplateVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * CreateEnvironmentAccountConnection
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Idempotent create APIs</b>
 * </p>
 * <p>
 * Given a request action that has succeeded:
 * </p>
 * <p>
 * If you retry the request with an API from this group, and the original resource <i>hasn't</i> been modified, the
 * retry succeeds without performing any further actions other than returning the original resource detail data in the
 * response.
 * </p>
 * <p>
 * If the original resource has been modified, the retry throws a <code>ConflictException</code>.
 * </p>
 * <p>
 * If you retry with different input parameters, the retry throws a <code>ValidationException</code> with an
 * <code>IdempotentParameterMismatch</code> error.
 * </p>
 * <p>
 * Idempotent create APIs:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CreateEnvironmentTemplate
 * </p>
 * </li>
 * <li>
 * <p>
 * CreateServiceTemplate
 * </p>
 * </li>
 * <li>
 * <p>
 * CreateEnvironment
 * </p>
 * </li>
 * <li>
 * <p>
 * CreateService
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Idempotent delete APIs</b>
 * </p>
 * <p>
 * Given a request action that has succeeded:
 * </p>
 * <p>
 * When you retry the request with an API from this group and the resource was deleted, its metadata is returned in the
 * response.
 * </p>
 * <p>
 * If you retry and the resource doesn't exist, the response is empty.
 * </p>
 * <p>
 * In both cases, the retry succeeds.
 * </p>
 * <p>
 * Idempotent delete APIs:
 * </p>
 * <ul>
 * <li>
 * <p>
 * DeleteEnvironmentTemplate
 * </p>
 * </li>
 * <li>
 * <p>
 * DeleteEnvironmentTemplateVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * DeleteServiceTemplate
 * </p>
 * </li>
 * <li>
 * <p>
 * DeleteServiceTemplateVersion
 * </p>
 * </li>
 * <li>
 * <p>
 * DeleteEnvironmentAccountConnection
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Asynchronous idempotent delete APIs</b>
 * </p>
 * <p>
 * Given a request action that has succeeded:
 * </p>
 * <p>
 * If you retry the request with an API from this group, if the original request delete operation status is
 * <code>DELETE_IN_PROGRESS</code>, the retry returns the resource detail data in the response without performing any
 * further actions.
 * </p>
 * <p>
 * If the original request delete operation is complete, a retry returns an empty response.
 * </p>
 * <p>
 * Asynchronous idempotent delete APIs:
 * </p>
 * <ul>
 * <li>
 * <p>
 * DeleteEnvironment
 * </p>
 * </li>
 * <li>
 * <p>
 * DeleteService
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSProtonAsync extends AWSProton {

    /**
     * <p>
     * In a management account, an environment account connection request is accepted. When the environment account
     * connection request is accepted, Proton can use the associated IAM role to provision environment infrastructure
     * resources in the associated environment account.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * 
     * @param acceptEnvironmentAccountConnectionRequest
     * @return A Java Future containing the result of the AcceptEnvironmentAccountConnection operation returned by the
     *         service.
     * @sample AWSProtonAsync.AcceptEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/AcceptEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptEnvironmentAccountConnectionResult> acceptEnvironmentAccountConnectionAsync(
            AcceptEnvironmentAccountConnectionRequest acceptEnvironmentAccountConnectionRequest);

    /**
     * <p>
     * In a management account, an environment account connection request is accepted. When the environment account
     * connection request is accepted, Proton can use the associated IAM role to provision environment infrastructure
     * resources in the associated environment account.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * 
     * @param acceptEnvironmentAccountConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptEnvironmentAccountConnection operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.AcceptEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/AcceptEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptEnvironmentAccountConnectionResult> acceptEnvironmentAccountConnectionAsync(
            AcceptEnvironmentAccountConnectionRequest acceptEnvironmentAccountConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptEnvironmentAccountConnectionRequest, AcceptEnvironmentAccountConnectionResult> asyncHandler);

    /**
     * <p>
     * Attempts to cancel a component deployment (for a component that is in the <code>IN_PROGRESS</code> deployment
     * status).
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param cancelComponentDeploymentRequest
     * @return A Java Future containing the result of the CancelComponentDeployment operation returned by the service.
     * @sample AWSProtonAsync.CancelComponentDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CancelComponentDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelComponentDeploymentResult> cancelComponentDeploymentAsync(
            CancelComponentDeploymentRequest cancelComponentDeploymentRequest);

    /**
     * <p>
     * Attempts to cancel a component deployment (for a component that is in the <code>IN_PROGRESS</code> deployment
     * status).
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param cancelComponentDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelComponentDeployment operation returned by the service.
     * @sample AWSProtonAsyncHandler.CancelComponentDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CancelComponentDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelComponentDeploymentResult> cancelComponentDeploymentAsync(
            CancelComponentDeploymentRequest cancelComponentDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CancelComponentDeploymentRequest, CancelComponentDeploymentResult> asyncHandler);

    /**
     * <p>
     * Attempts to cancel an environment deployment on an <a>UpdateEnvironment</a> action, if the deployment is
     * <code>IN_PROGRESS</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-update.html">Update an environment</a> in the
     * <i>Proton User guide</i>.
     * </p>
     * <p>
     * The following list includes potential cancellation scenarios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the cancellation attempt succeeds, the resulting deployment state is <code>CANCELLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the cancellation attempt fails, the resulting deployment state is <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current <a>UpdateEnvironment</a> action succeeds before the cancellation attempt starts, the resulting
     * deployment state is <code>SUCCEEDED</code> and the cancellation attempt has no effect.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelEnvironmentDeploymentRequest
     * @return A Java Future containing the result of the CancelEnvironmentDeployment operation returned by the service.
     * @sample AWSProtonAsync.CancelEnvironmentDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CancelEnvironmentDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelEnvironmentDeploymentResult> cancelEnvironmentDeploymentAsync(
            CancelEnvironmentDeploymentRequest cancelEnvironmentDeploymentRequest);

    /**
     * <p>
     * Attempts to cancel an environment deployment on an <a>UpdateEnvironment</a> action, if the deployment is
     * <code>IN_PROGRESS</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-update.html">Update an environment</a> in the
     * <i>Proton User guide</i>.
     * </p>
     * <p>
     * The following list includes potential cancellation scenarios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the cancellation attempt succeeds, the resulting deployment state is <code>CANCELLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the cancellation attempt fails, the resulting deployment state is <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current <a>UpdateEnvironment</a> action succeeds before the cancellation attempt starts, the resulting
     * deployment state is <code>SUCCEEDED</code> and the cancellation attempt has no effect.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelEnvironmentDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelEnvironmentDeployment operation returned by the service.
     * @sample AWSProtonAsyncHandler.CancelEnvironmentDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CancelEnvironmentDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelEnvironmentDeploymentResult> cancelEnvironmentDeploymentAsync(
            CancelEnvironmentDeploymentRequest cancelEnvironmentDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CancelEnvironmentDeploymentRequest, CancelEnvironmentDeploymentResult> asyncHandler);

    /**
     * <p>
     * Attempts to cancel a service instance deployment on an <a>UpdateServiceInstance</a> action, if the deployment is
     * <code>IN_PROGRESS</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-svc-instance-update.html">Update a service
     * instance</a> in the <i>Proton User guide</i>.
     * </p>
     * <p>
     * The following list includes potential cancellation scenarios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the cancellation attempt succeeds, the resulting deployment state is <code>CANCELLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the cancellation attempt fails, the resulting deployment state is <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current <a>UpdateServiceInstance</a> action succeeds before the cancellation attempt starts, the resulting
     * deployment state is <code>SUCCEEDED</code> and the cancellation attempt has no effect.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelServiceInstanceDeploymentRequest
     * @return A Java Future containing the result of the CancelServiceInstanceDeployment operation returned by the
     *         service.
     * @sample AWSProtonAsync.CancelServiceInstanceDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CancelServiceInstanceDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelServiceInstanceDeploymentResult> cancelServiceInstanceDeploymentAsync(
            CancelServiceInstanceDeploymentRequest cancelServiceInstanceDeploymentRequest);

    /**
     * <p>
     * Attempts to cancel a service instance deployment on an <a>UpdateServiceInstance</a> action, if the deployment is
     * <code>IN_PROGRESS</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-svc-instance-update.html">Update a service
     * instance</a> in the <i>Proton User guide</i>.
     * </p>
     * <p>
     * The following list includes potential cancellation scenarios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the cancellation attempt succeeds, the resulting deployment state is <code>CANCELLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the cancellation attempt fails, the resulting deployment state is <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current <a>UpdateServiceInstance</a> action succeeds before the cancellation attempt starts, the resulting
     * deployment state is <code>SUCCEEDED</code> and the cancellation attempt has no effect.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelServiceInstanceDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelServiceInstanceDeployment operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.CancelServiceInstanceDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CancelServiceInstanceDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelServiceInstanceDeploymentResult> cancelServiceInstanceDeploymentAsync(
            CancelServiceInstanceDeploymentRequest cancelServiceInstanceDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CancelServiceInstanceDeploymentRequest, CancelServiceInstanceDeploymentResult> asyncHandler);

    /**
     * <p>
     * Attempts to cancel a service pipeline deployment on an <a>UpdateServicePipeline</a> action, if the deployment is
     * <code>IN_PROGRESS</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-svc-pipeline-update.html">Update a service
     * pipeline</a> in the <i>Proton User guide</i>.
     * </p>
     * <p>
     * The following list includes potential cancellation scenarios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the cancellation attempt succeeds, the resulting deployment state is <code>CANCELLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the cancellation attempt fails, the resulting deployment state is <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current <a>UpdateServicePipeline</a> action succeeds before the cancellation attempt starts, the resulting
     * deployment state is <code>SUCCEEDED</code> and the cancellation attempt has no effect.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelServicePipelineDeploymentRequest
     * @return A Java Future containing the result of the CancelServicePipelineDeployment operation returned by the
     *         service.
     * @sample AWSProtonAsync.CancelServicePipelineDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CancelServicePipelineDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelServicePipelineDeploymentResult> cancelServicePipelineDeploymentAsync(
            CancelServicePipelineDeploymentRequest cancelServicePipelineDeploymentRequest);

    /**
     * <p>
     * Attempts to cancel a service pipeline deployment on an <a>UpdateServicePipeline</a> action, if the deployment is
     * <code>IN_PROGRESS</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-svc-pipeline-update.html">Update a service
     * pipeline</a> in the <i>Proton User guide</i>.
     * </p>
     * <p>
     * The following list includes potential cancellation scenarios.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the cancellation attempt succeeds, the resulting deployment state is <code>CANCELLED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the cancellation attempt fails, the resulting deployment state is <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the current <a>UpdateServicePipeline</a> action succeeds before the cancellation attempt starts, the resulting
     * deployment state is <code>SUCCEEDED</code> and the cancellation attempt has no effect.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelServicePipelineDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelServicePipelineDeployment operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.CancelServicePipelineDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CancelServicePipelineDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelServicePipelineDeploymentResult> cancelServicePipelineDeploymentAsync(
            CancelServicePipelineDeploymentRequest cancelServicePipelineDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CancelServicePipelineDeploymentRequest, CancelServicePipelineDeploymentResult> asyncHandler);

    /**
     * <p>
     * Create an Proton component. A component is an infrastructure extension for a service instance.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param createComponentRequest
     * @return A Java Future containing the result of the CreateComponent operation returned by the service.
     * @sample AWSProtonAsync.CreateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateComponentResult> createComponentAsync(CreateComponentRequest createComponentRequest);

    /**
     * <p>
     * Create an Proton component. A component is an infrastructure extension for a service instance.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param createComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateComponent operation returned by the service.
     * @sample AWSProtonAsyncHandler.CreateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateComponentResult> createComponentAsync(CreateComponentRequest createComponentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateComponentRequest, CreateComponentResult> asyncHandler);

    /**
     * <p>
     * Deploy a new environment. An Proton environment is created from an environment template that defines
     * infrastructure and resources that can be shared across services.
     * </p>
     * <p class="title">
     * <b>You can provision environments using the following methods:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Web Services-managed provisioning: Proton makes direct calls to provision your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * Self-managed provisioning: Proton makes pull requests on your repository to provide compiled infrastructure as
     * code (IaC) files that your IaC engine uses to provision resources.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-environments.html">Environments</a> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html">Provisioning methods</a> in
     * the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AWSProtonAsync.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Deploy a new environment. An Proton environment is created from an environment template that defines
     * infrastructure and resources that can be shared across services.
     * </p>
     * <p class="title">
     * <b>You can provision environments using the following methods:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Web Services-managed provisioning: Proton makes direct calls to provision your resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * Self-managed provisioning: Proton makes pull requests on your repository to provide compiled infrastructure as
     * code (IaC) files that your IaC engine uses to provision resources.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-environments.html">Environments</a> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html">Provisioning methods</a> in
     * the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AWSProtonAsyncHandler.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Create an environment account connection in an environment account so that environment infrastructure resources
     * can be provisioned in the environment account from a management account.
     * </p>
     * <p>
     * An environment account connection is a secure bi-directional connection between a <i>management account</i> and
     * an <i>environment account</i> that maintains authorization and permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * 
     * @param createEnvironmentAccountConnectionRequest
     * @return A Java Future containing the result of the CreateEnvironmentAccountConnection operation returned by the
     *         service.
     * @sample AWSProtonAsync.CreateEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentAccountConnectionResult> createEnvironmentAccountConnectionAsync(
            CreateEnvironmentAccountConnectionRequest createEnvironmentAccountConnectionRequest);

    /**
     * <p>
     * Create an environment account connection in an environment account so that environment infrastructure resources
     * can be provisioned in the environment account from a management account.
     * </p>
     * <p>
     * An environment account connection is a secure bi-directional connection between a <i>management account</i> and
     * an <i>environment account</i> that maintains authorization and permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * 
     * @param createEnvironmentAccountConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEnvironmentAccountConnection operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.CreateEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentAccountConnectionResult> createEnvironmentAccountConnectionAsync(
            CreateEnvironmentAccountConnectionRequest createEnvironmentAccountConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentAccountConnectionRequest, CreateEnvironmentAccountConnectionResult> asyncHandler);

    /**
     * <p>
     * Create an environment template for Proton. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html">Environment Templates</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * <p>
     * You can create an environment template in one of the two following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Register and publish a <i>standard</i> environment template that instructs Proton to deploy and manage
     * environment infrastructure.
     * </p>
     * </li>
     * <li>
     * <p>
     * Register and publish a <i>customer managed</i> environment template that connects Proton to your existing
     * provisioned infrastructure that you manage. Proton <i>doesn't</i> manage your existing provisioned
     * infrastructure. To create an environment template for customer provisioned and managed infrastructure, include
     * the <code>provisioning</code> parameter and set the value to <code>CUSTOMER_MANAGED</code>. For more information,
     * see <a href="https://docs.aws.amazon.com/proton/latest/userguide/template-create.html">Register and publish an
     * environment template</a> in the <i>Proton User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createEnvironmentTemplateRequest
     * @return A Java Future containing the result of the CreateEnvironmentTemplate operation returned by the service.
     * @sample AWSProtonAsync.CreateEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironmentTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentTemplateResult> createEnvironmentTemplateAsync(
            CreateEnvironmentTemplateRequest createEnvironmentTemplateRequest);

    /**
     * <p>
     * Create an environment template for Proton. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html">Environment Templates</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * <p>
     * You can create an environment template in one of the two following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Register and publish a <i>standard</i> environment template that instructs Proton to deploy and manage
     * environment infrastructure.
     * </p>
     * </li>
     * <li>
     * <p>
     * Register and publish a <i>customer managed</i> environment template that connects Proton to your existing
     * provisioned infrastructure that you manage. Proton <i>doesn't</i> manage your existing provisioned
     * infrastructure. To create an environment template for customer provisioned and managed infrastructure, include
     * the <code>provisioning</code> parameter and set the value to <code>CUSTOMER_MANAGED</code>. For more information,
     * see <a href="https://docs.aws.amazon.com/proton/latest/userguide/template-create.html">Register and publish an
     * environment template</a> in the <i>Proton User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createEnvironmentTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEnvironmentTemplate operation returned by the service.
     * @sample AWSProtonAsyncHandler.CreateEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironmentTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentTemplateResult> createEnvironmentTemplateAsync(
            CreateEnvironmentTemplateRequest createEnvironmentTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentTemplateRequest, CreateEnvironmentTemplateResult> asyncHandler);

    /**
     * <p>
     * Create a new major or minor version of an environment template. A major version of an environment template is a
     * version that <i>isn't</i> backwards compatible. A minor version of an environment template is a version that's
     * backwards compatible within its major version.
     * </p>
     * 
     * @param createEnvironmentTemplateVersionRequest
     * @return A Java Future containing the result of the CreateEnvironmentTemplateVersion operation returned by the
     *         service.
     * @sample AWSProtonAsync.CreateEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentTemplateVersionResult> createEnvironmentTemplateVersionAsync(
            CreateEnvironmentTemplateVersionRequest createEnvironmentTemplateVersionRequest);

    /**
     * <p>
     * Create a new major or minor version of an environment template. A major version of an environment template is a
     * version that <i>isn't</i> backwards compatible. A minor version of an environment template is a version that's
     * backwards compatible within its major version.
     * </p>
     * 
     * @param createEnvironmentTemplateVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEnvironmentTemplateVersion operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.CreateEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentTemplateVersionResult> createEnvironmentTemplateVersionAsync(
            CreateEnvironmentTemplateVersionRequest createEnvironmentTemplateVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentTemplateVersionRequest, CreateEnvironmentTemplateVersionResult> asyncHandler);

    /**
     * <p>
     * Create and register a link to a repository. Proton uses the link to repeatedly access the repository, to either
     * push to it (self-managed provisioning) or pull from it (template sync). You can share a linked repository across
     * multiple resources (like environments using self-managed provisioning, or synced templates). When you create a
     * repository link, Proton creates a <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/using-service-linked-roles.html">service-linked
     * role</a> for you.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html#ag-works-prov-methods-self"
     * >Self-managed provisioning</a>, <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-template-authoring.html#ag-template-bundles"
     * >Template bundles</a>, and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-template-sync-configs.html">Template sync
     * configurations</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param createRepositoryRequest
     * @return A Java Future containing the result of the CreateRepository operation returned by the service.
     * @sample AWSProtonAsync.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateRepository" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest createRepositoryRequest);

    /**
     * <p>
     * Create and register a link to a repository. Proton uses the link to repeatedly access the repository, to either
     * push to it (self-managed provisioning) or pull from it (template sync). You can share a linked repository across
     * multiple resources (like environments using self-managed provisioning, or synced templates). When you create a
     * repository link, Proton creates a <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/using-service-linked-roles.html">service-linked
     * role</a> for you.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html#ag-works-prov-methods-self"
     * >Self-managed provisioning</a>, <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-template-authoring.html#ag-template-bundles"
     * >Template bundles</a>, and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-template-sync-configs.html">Template sync
     * configurations</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param createRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRepository operation returned by the service.
     * @sample AWSProtonAsyncHandler.CreateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateRepository" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest createRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler);

    /**
     * <p>
     * Create an Proton service. An Proton service is an instantiation of a service template and often includes several
     * service instances and pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-services.html">Services</a> in the <i>Proton User
     * Guide</i>.
     * </p>
     * 
     * @param createServiceRequest
     * @return A Java Future containing the result of the CreateService operation returned by the service.
     * @sample AWSProtonAsync.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest createServiceRequest);

    /**
     * <p>
     * Create an Proton service. An Proton service is an instantiation of a service template and often includes several
     * service instances and pipeline. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-services.html">Services</a> in the <i>Proton User
     * Guide</i>.
     * </p>
     * 
     * @param createServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateService operation returned by the service.
     * @sample AWSProtonAsyncHandler.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest createServiceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServiceRequest, CreateServiceResult> asyncHandler);

    /**
     * <p>
     * Create a service template. The administrator creates a service template to define standardized infrastructure and
     * an optional CI/CD service pipeline. Developers, in turn, select the service template from Proton. If the selected
     * service template includes a service pipeline definition, they provide a link to their source code repository.
     * Proton then deploys and manages the infrastructure defined by the selected service template. For more
     * information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html">Proton
     * templates</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param createServiceTemplateRequest
     * @return A Java Future containing the result of the CreateServiceTemplate operation returned by the service.
     * @sample AWSProtonAsync.CreateServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateServiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceTemplateResult> createServiceTemplateAsync(CreateServiceTemplateRequest createServiceTemplateRequest);

    /**
     * <p>
     * Create a service template. The administrator creates a service template to define standardized infrastructure and
     * an optional CI/CD service pipeline. Developers, in turn, select the service template from Proton. If the selected
     * service template includes a service pipeline definition, they provide a link to their source code repository.
     * Proton then deploys and manages the infrastructure defined by the selected service template. For more
     * information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/ag-templates.html">Proton
     * templates</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param createServiceTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateServiceTemplate operation returned by the service.
     * @sample AWSProtonAsyncHandler.CreateServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateServiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceTemplateResult> createServiceTemplateAsync(CreateServiceTemplateRequest createServiceTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServiceTemplateRequest, CreateServiceTemplateResult> asyncHandler);

    /**
     * <p>
     * Create a new major or minor version of a service template. A major version of a service template is a version
     * that <i>isn't</i> backward compatible. A minor version of a service template is a version that's backward
     * compatible within its major version.
     * </p>
     * 
     * @param createServiceTemplateVersionRequest
     * @return A Java Future containing the result of the CreateServiceTemplateVersion operation returned by the
     *         service.
     * @sample AWSProtonAsync.CreateServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceTemplateVersionResult> createServiceTemplateVersionAsync(
            CreateServiceTemplateVersionRequest createServiceTemplateVersionRequest);

    /**
     * <p>
     * Create a new major or minor version of a service template. A major version of a service template is a version
     * that <i>isn't</i> backward compatible. A minor version of a service template is a version that's backward
     * compatible within its major version.
     * </p>
     * 
     * @param createServiceTemplateVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateServiceTemplateVersion operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.CreateServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceTemplateVersionResult> createServiceTemplateVersionAsync(
            CreateServiceTemplateVersionRequest createServiceTemplateVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServiceTemplateVersionRequest, CreateServiceTemplateVersionResult> asyncHandler);

    /**
     * <p>
     * Set up a template to create new template versions automatically by tracking a linked repository. A linked
     * repository is a repository that has been registered with Proton. For more information, see
     * <a>CreateRepository</a>.
     * </p>
     * <p>
     * When a commit is pushed to your linked repository, Proton checks for changes to your repository template bundles.
     * If it detects a template bundle change, a new major or minor version of its template is created, if the version
     * doesn’t already exist. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-template-sync-configs.html">Template sync
     * configurations</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param createTemplateSyncConfigRequest
     * @return A Java Future containing the result of the CreateTemplateSyncConfig operation returned by the service.
     * @sample AWSProtonAsync.CreateTemplateSyncConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateTemplateSyncConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateSyncConfigResult> createTemplateSyncConfigAsync(CreateTemplateSyncConfigRequest createTemplateSyncConfigRequest);

    /**
     * <p>
     * Set up a template to create new template versions automatically by tracking a linked repository. A linked
     * repository is a repository that has been registered with Proton. For more information, see
     * <a>CreateRepository</a>.
     * </p>
     * <p>
     * When a commit is pushed to your linked repository, Proton checks for changes to your repository template bundles.
     * If it detects a template bundle change, a new major or minor version of its template is created, if the version
     * doesn’t already exist. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-template-sync-configs.html">Template sync
     * configurations</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param createTemplateSyncConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTemplateSyncConfig operation returned by the service.
     * @sample AWSProtonAsyncHandler.CreateTemplateSyncConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateTemplateSyncConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTemplateSyncConfigResult> createTemplateSyncConfigAsync(CreateTemplateSyncConfigRequest createTemplateSyncConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTemplateSyncConfigRequest, CreateTemplateSyncConfigResult> asyncHandler);

    /**
     * <p>
     * Delete an Proton component resource.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param deleteComponentRequest
     * @return A Java Future containing the result of the DeleteComponent operation returned by the service.
     * @sample AWSProtonAsync.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest deleteComponentRequest);

    /**
     * <p>
     * Delete an Proton component resource.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param deleteComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteComponent operation returned by the service.
     * @sample AWSProtonAsyncHandler.DeleteComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteComponentResult> deleteComponentAsync(DeleteComponentRequest deleteComponentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteComponentRequest, DeleteComponentResult> asyncHandler);

    /**
     * <p>
     * Delete an environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AWSProtonAsync.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Delete an environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AWSProtonAsyncHandler.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler);

    /**
     * <p>
     * In an environment account, delete an environment account connection.
     * </p>
     * <p>
     * After you delete an environment account connection that’s in use by an Proton environment, Proton <i>can’t</i>
     * manage the environment infrastructure resources until a new environment account connection is accepted for the
     * environment account and associated environment. You're responsible for cleaning up provisioned resources that
     * remain without an environment connection.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * 
     * @param deleteEnvironmentAccountConnectionRequest
     * @return A Java Future containing the result of the DeleteEnvironmentAccountConnection operation returned by the
     *         service.
     * @sample AWSProtonAsync.DeleteEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentAccountConnectionResult> deleteEnvironmentAccountConnectionAsync(
            DeleteEnvironmentAccountConnectionRequest deleteEnvironmentAccountConnectionRequest);

    /**
     * <p>
     * In an environment account, delete an environment account connection.
     * </p>
     * <p>
     * After you delete an environment account connection that’s in use by an Proton environment, Proton <i>can’t</i>
     * manage the environment infrastructure resources until a new environment account connection is accepted for the
     * environment account and associated environment. You're responsible for cleaning up provisioned resources that
     * remain without an environment connection.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * 
     * @param deleteEnvironmentAccountConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironmentAccountConnection operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.DeleteEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentAccountConnectionResult> deleteEnvironmentAccountConnectionAsync(
            DeleteEnvironmentAccountConnectionRequest deleteEnvironmentAccountConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentAccountConnectionRequest, DeleteEnvironmentAccountConnectionResult> asyncHandler);

    /**
     * <p>
     * If no other major or minor versions of an environment template exist, delete the environment template.
     * </p>
     * 
     * @param deleteEnvironmentTemplateRequest
     * @return A Java Future containing the result of the DeleteEnvironmentTemplate operation returned by the service.
     * @sample AWSProtonAsync.DeleteEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironmentTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentTemplateResult> deleteEnvironmentTemplateAsync(
            DeleteEnvironmentTemplateRequest deleteEnvironmentTemplateRequest);

    /**
     * <p>
     * If no other major or minor versions of an environment template exist, delete the environment template.
     * </p>
     * 
     * @param deleteEnvironmentTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironmentTemplate operation returned by the service.
     * @sample AWSProtonAsyncHandler.DeleteEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironmentTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentTemplateResult> deleteEnvironmentTemplateAsync(
            DeleteEnvironmentTemplateRequest deleteEnvironmentTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentTemplateRequest, DeleteEnvironmentTemplateResult> asyncHandler);

    /**
     * <p>
     * If no other minor versions of an environment template exist, delete a major version of the environment template
     * if it's not the <code>Recommended</code> version. Delete the <code>Recommended</code> version of the environment
     * template if no other major versions or minor versions of the environment template exist. A major version of an
     * environment template is a version that's not backward compatible.
     * </p>
     * <p>
     * Delete a minor version of an environment template if it <i>isn't</i> the <code>Recommended</code> version. Delete
     * a <code>Recommended</code> minor version of the environment template if no other minor versions of the
     * environment template exist. A minor version of an environment template is a version that's backward compatible.
     * </p>
     * 
     * @param deleteEnvironmentTemplateVersionRequest
     * @return A Java Future containing the result of the DeleteEnvironmentTemplateVersion operation returned by the
     *         service.
     * @sample AWSProtonAsync.DeleteEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentTemplateVersionResult> deleteEnvironmentTemplateVersionAsync(
            DeleteEnvironmentTemplateVersionRequest deleteEnvironmentTemplateVersionRequest);

    /**
     * <p>
     * If no other minor versions of an environment template exist, delete a major version of the environment template
     * if it's not the <code>Recommended</code> version. Delete the <code>Recommended</code> version of the environment
     * template if no other major versions or minor versions of the environment template exist. A major version of an
     * environment template is a version that's not backward compatible.
     * </p>
     * <p>
     * Delete a minor version of an environment template if it <i>isn't</i> the <code>Recommended</code> version. Delete
     * a <code>Recommended</code> minor version of the environment template if no other minor versions of the
     * environment template exist. A minor version of an environment template is a version that's backward compatible.
     * </p>
     * 
     * @param deleteEnvironmentTemplateVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironmentTemplateVersion operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.DeleteEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentTemplateVersionResult> deleteEnvironmentTemplateVersionAsync(
            DeleteEnvironmentTemplateVersionRequest deleteEnvironmentTemplateVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentTemplateVersionRequest, DeleteEnvironmentTemplateVersionResult> asyncHandler);

    /**
     * <p>
     * De-register and unlink your repository.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AWSProtonAsync.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteRepository" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest deleteRepositoryRequest);

    /**
     * <p>
     * De-register and unlink your repository.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRepository operation returned by the service.
     * @sample AWSProtonAsyncHandler.DeleteRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteRepository" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest deleteRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler);

    /**
     * <p>
     * Delete a service, with its instances and pipeline.
     * </p>
     * <note>
     * <p>
     * You can't delete a service if it has any service instances that have components attached to them.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deleteServiceRequest
     * @return A Java Future containing the result of the DeleteService operation returned by the service.
     * @sample AWSProtonAsync.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest deleteServiceRequest);

    /**
     * <p>
     * Delete a service, with its instances and pipeline.
     * </p>
     * <note>
     * <p>
     * You can't delete a service if it has any service instances that have components attached to them.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deleteServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteService operation returned by the service.
     * @sample AWSProtonAsyncHandler.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest deleteServiceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceRequest, DeleteServiceResult> asyncHandler);

    /**
     * <p>
     * If no other major or minor versions of the service template exist, delete the service template.
     * </p>
     * 
     * @param deleteServiceTemplateRequest
     * @return A Java Future containing the result of the DeleteServiceTemplate operation returned by the service.
     * @sample AWSProtonAsync.DeleteServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteServiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceTemplateResult> deleteServiceTemplateAsync(DeleteServiceTemplateRequest deleteServiceTemplateRequest);

    /**
     * <p>
     * If no other major or minor versions of the service template exist, delete the service template.
     * </p>
     * 
     * @param deleteServiceTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteServiceTemplate operation returned by the service.
     * @sample AWSProtonAsyncHandler.DeleteServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteServiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceTemplateResult> deleteServiceTemplateAsync(DeleteServiceTemplateRequest deleteServiceTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceTemplateRequest, DeleteServiceTemplateResult> asyncHandler);

    /**
     * <p>
     * If no other minor versions of a service template exist, delete a major version of the service template if it's
     * not the <code>Recommended</code> version. Delete the <code>Recommended</code> version of the service template if
     * no other major versions or minor versions of the service template exist. A major version of a service template is
     * a version that <i>isn't</i> backwards compatible.
     * </p>
     * <p>
     * Delete a minor version of a service template if it's not the <code>Recommended</code> version. Delete a
     * <code>Recommended</code> minor version of the service template if no other minor versions of the service template
     * exist. A minor version of a service template is a version that's backwards compatible.
     * </p>
     * 
     * @param deleteServiceTemplateVersionRequest
     * @return A Java Future containing the result of the DeleteServiceTemplateVersion operation returned by the
     *         service.
     * @sample AWSProtonAsync.DeleteServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceTemplateVersionResult> deleteServiceTemplateVersionAsync(
            DeleteServiceTemplateVersionRequest deleteServiceTemplateVersionRequest);

    /**
     * <p>
     * If no other minor versions of a service template exist, delete a major version of the service template if it's
     * not the <code>Recommended</code> version. Delete the <code>Recommended</code> version of the service template if
     * no other major versions or minor versions of the service template exist. A major version of a service template is
     * a version that <i>isn't</i> backwards compatible.
     * </p>
     * <p>
     * Delete a minor version of a service template if it's not the <code>Recommended</code> version. Delete a
     * <code>Recommended</code> minor version of the service template if no other minor versions of the service template
     * exist. A minor version of a service template is a version that's backwards compatible.
     * </p>
     * 
     * @param deleteServiceTemplateVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteServiceTemplateVersion operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.DeleteServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceTemplateVersionResult> deleteServiceTemplateVersionAsync(
            DeleteServiceTemplateVersionRequest deleteServiceTemplateVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceTemplateVersionRequest, DeleteServiceTemplateVersionResult> asyncHandler);

    /**
     * <p>
     * Delete a template sync configuration.
     * </p>
     * 
     * @param deleteTemplateSyncConfigRequest
     * @return A Java Future containing the result of the DeleteTemplateSyncConfig operation returned by the service.
     * @sample AWSProtonAsync.DeleteTemplateSyncConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteTemplateSyncConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTemplateSyncConfigResult> deleteTemplateSyncConfigAsync(DeleteTemplateSyncConfigRequest deleteTemplateSyncConfigRequest);

    /**
     * <p>
     * Delete a template sync configuration.
     * </p>
     * 
     * @param deleteTemplateSyncConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTemplateSyncConfig operation returned by the service.
     * @sample AWSProtonAsyncHandler.DeleteTemplateSyncConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteTemplateSyncConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTemplateSyncConfigResult> deleteTemplateSyncConfigAsync(DeleteTemplateSyncConfigRequest deleteTemplateSyncConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTemplateSyncConfigRequest, DeleteTemplateSyncConfigResult> asyncHandler);

    /**
     * <p>
     * Get detail data for Proton account-wide settings.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return A Java Future containing the result of the GetAccountSettings operation returned by the service.
     * @sample AWSProtonAsync.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest getAccountSettingsRequest);

    /**
     * <p>
     * Get detail data for Proton account-wide settings.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountSettings operation returned by the service.
     * @sample AWSProtonAsyncHandler.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest getAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler);

    /**
     * <p>
     * Get detailed data for a component.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param getComponentRequest
     * @return A Java Future containing the result of the GetComponent operation returned by the service.
     * @sample AWSProtonAsync.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest getComponentRequest);

    /**
     * <p>
     * Get detailed data for a component.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param getComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComponent operation returned by the service.
     * @sample AWSProtonAsyncHandler.GetComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetComponentResult> getComponentAsync(GetComponentRequest getComponentRequest,
            com.amazonaws.handlers.AsyncHandler<GetComponentRequest, GetComponentResult> asyncHandler);

    /**
     * <p>
     * Get detailed data for an environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AWSProtonAsync.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * Get detailed data for an environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AWSProtonAsyncHandler.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnvironmentRequest, GetEnvironmentResult> asyncHandler);

    /**
     * <p>
     * In an environment account, get the detailed data for an environment account connection.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * 
     * @param getEnvironmentAccountConnectionRequest
     * @return A Java Future containing the result of the GetEnvironmentAccountConnection operation returned by the
     *         service.
     * @sample AWSProtonAsync.GetEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentAccountConnectionResult> getEnvironmentAccountConnectionAsync(
            GetEnvironmentAccountConnectionRequest getEnvironmentAccountConnectionRequest);

    /**
     * <p>
     * In an environment account, get the detailed data for an environment account connection.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * 
     * @param getEnvironmentAccountConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnvironmentAccountConnection operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.GetEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentAccountConnectionResult> getEnvironmentAccountConnectionAsync(
            GetEnvironmentAccountConnectionRequest getEnvironmentAccountConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnvironmentAccountConnectionRequest, GetEnvironmentAccountConnectionResult> asyncHandler);

    /**
     * <p>
     * Get detailed data for an environment template.
     * </p>
     * 
     * @param getEnvironmentTemplateRequest
     * @return A Java Future containing the result of the GetEnvironmentTemplate operation returned by the service.
     * @sample AWSProtonAsync.GetEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironmentTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentTemplateResult> getEnvironmentTemplateAsync(GetEnvironmentTemplateRequest getEnvironmentTemplateRequest);

    /**
     * <p>
     * Get detailed data for an environment template.
     * </p>
     * 
     * @param getEnvironmentTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnvironmentTemplate operation returned by the service.
     * @sample AWSProtonAsyncHandler.GetEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironmentTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentTemplateResult> getEnvironmentTemplateAsync(GetEnvironmentTemplateRequest getEnvironmentTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnvironmentTemplateRequest, GetEnvironmentTemplateResult> asyncHandler);

    /**
     * <p>
     * Get detailed data for a major or minor version of an environment template.
     * </p>
     * 
     * @param getEnvironmentTemplateVersionRequest
     * @return A Java Future containing the result of the GetEnvironmentTemplateVersion operation returned by the
     *         service.
     * @sample AWSProtonAsync.GetEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentTemplateVersionResult> getEnvironmentTemplateVersionAsync(
            GetEnvironmentTemplateVersionRequest getEnvironmentTemplateVersionRequest);

    /**
     * <p>
     * Get detailed data for a major or minor version of an environment template.
     * </p>
     * 
     * @param getEnvironmentTemplateVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnvironmentTemplateVersion operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.GetEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentTemplateVersionResult> getEnvironmentTemplateVersionAsync(
            GetEnvironmentTemplateVersionRequest getEnvironmentTemplateVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnvironmentTemplateVersionRequest, GetEnvironmentTemplateVersionResult> asyncHandler);

    /**
     * <p>
     * Get detail data for a linked repository.
     * </p>
     * 
     * @param getRepositoryRequest
     * @return A Java Future containing the result of the GetRepository operation returned by the service.
     * @sample AWSProtonAsync.GetRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetRepository" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(GetRepositoryRequest getRepositoryRequest);

    /**
     * <p>
     * Get detail data for a linked repository.
     * </p>
     * 
     * @param getRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRepository operation returned by the service.
     * @sample AWSProtonAsyncHandler.GetRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetRepository" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRepositoryResult> getRepositoryAsync(GetRepositoryRequest getRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetRepositoryRequest, GetRepositoryResult> asyncHandler);

    /**
     * <p>
     * Get the sync status of a repository used for Proton template sync. For more information about template sync, see
     * .
     * </p>
     * <note>
     * <p>
     * A repository sync status isn't tied to the Proton Repository resource (or any other Proton resource). Therefore,
     * tags on an Proton Repository resource have no effect on this action. Specifically, you can't use these tags to
     * control access to this action using Attribute-based access control (ABAC).
     * </p>
     * <p>
     * For more information about ABAC, see <a href=
     * "https://docs.aws.amazon.com/proton/latest/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-tags"
     * >ABAC</a> in the <i>Proton User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getRepositorySyncStatusRequest
     * @return A Java Future containing the result of the GetRepositorySyncStatus operation returned by the service.
     * @sample AWSProtonAsync.GetRepositorySyncStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetRepositorySyncStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositorySyncStatusResult> getRepositorySyncStatusAsync(GetRepositorySyncStatusRequest getRepositorySyncStatusRequest);

    /**
     * <p>
     * Get the sync status of a repository used for Proton template sync. For more information about template sync, see
     * .
     * </p>
     * <note>
     * <p>
     * A repository sync status isn't tied to the Proton Repository resource (or any other Proton resource). Therefore,
     * tags on an Proton Repository resource have no effect on this action. Specifically, you can't use these tags to
     * control access to this action using Attribute-based access control (ABAC).
     * </p>
     * <p>
     * For more information about ABAC, see <a href=
     * "https://docs.aws.amazon.com/proton/latest/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-tags"
     * >ABAC</a> in the <i>Proton User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getRepositorySyncStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRepositorySyncStatus operation returned by the service.
     * @sample AWSProtonAsyncHandler.GetRepositorySyncStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetRepositorySyncStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRepositorySyncStatusResult> getRepositorySyncStatusAsync(GetRepositorySyncStatusRequest getRepositorySyncStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetRepositorySyncStatusRequest, GetRepositorySyncStatusResult> asyncHandler);

    /**
     * <p>
     * Get detailed data for a service.
     * </p>
     * 
     * @param getServiceRequest
     * @return A Java Future containing the result of the GetService operation returned by the service.
     * @sample AWSProtonAsync.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest getServiceRequest);

    /**
     * <p>
     * Get detailed data for a service.
     * </p>
     * 
     * @param getServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetService operation returned by the service.
     * @sample AWSProtonAsyncHandler.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest getServiceRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceRequest, GetServiceResult> asyncHandler);

    /**
     * <p>
     * Get detailed data for a service instance. A service instance is an instantiation of service template and it runs
     * in a specific environment.
     * </p>
     * 
     * @param getServiceInstanceRequest
     * @return A Java Future containing the result of the GetServiceInstance operation returned by the service.
     * @sample AWSProtonAsync.GetServiceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetServiceInstanceResult> getServiceInstanceAsync(GetServiceInstanceRequest getServiceInstanceRequest);

    /**
     * <p>
     * Get detailed data for a service instance. A service instance is an instantiation of service template and it runs
     * in a specific environment.
     * </p>
     * 
     * @param getServiceInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceInstance operation returned by the service.
     * @sample AWSProtonAsyncHandler.GetServiceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetServiceInstanceResult> getServiceInstanceAsync(GetServiceInstanceRequest getServiceInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceInstanceRequest, GetServiceInstanceResult> asyncHandler);

    /**
     * <p>
     * Get detailed data for a service template.
     * </p>
     * 
     * @param getServiceTemplateRequest
     * @return A Java Future containing the result of the GetServiceTemplate operation returned by the service.
     * @sample AWSProtonAsync.GetServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetServiceTemplateResult> getServiceTemplateAsync(GetServiceTemplateRequest getServiceTemplateRequest);

    /**
     * <p>
     * Get detailed data for a service template.
     * </p>
     * 
     * @param getServiceTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceTemplate operation returned by the service.
     * @sample AWSProtonAsyncHandler.GetServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetServiceTemplateResult> getServiceTemplateAsync(GetServiceTemplateRequest getServiceTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceTemplateRequest, GetServiceTemplateResult> asyncHandler);

    /**
     * <p>
     * Get detailed data for a major or minor version of a service template.
     * </p>
     * 
     * @param getServiceTemplateVersionRequest
     * @return A Java Future containing the result of the GetServiceTemplateVersion operation returned by the service.
     * @sample AWSProtonAsync.GetServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceTemplateVersionResult> getServiceTemplateVersionAsync(
            GetServiceTemplateVersionRequest getServiceTemplateVersionRequest);

    /**
     * <p>
     * Get detailed data for a major or minor version of a service template.
     * </p>
     * 
     * @param getServiceTemplateVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServiceTemplateVersion operation returned by the service.
     * @sample AWSProtonAsyncHandler.GetServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceTemplateVersionResult> getServiceTemplateVersionAsync(
            GetServiceTemplateVersionRequest getServiceTemplateVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceTemplateVersionRequest, GetServiceTemplateVersionResult> asyncHandler);

    /**
     * <p>
     * Get detail data for a template sync configuration.
     * </p>
     * 
     * @param getTemplateSyncConfigRequest
     * @return A Java Future containing the result of the GetTemplateSyncConfig operation returned by the service.
     * @sample AWSProtonAsync.GetTemplateSyncConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetTemplateSyncConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateSyncConfigResult> getTemplateSyncConfigAsync(GetTemplateSyncConfigRequest getTemplateSyncConfigRequest);

    /**
     * <p>
     * Get detail data for a template sync configuration.
     * </p>
     * 
     * @param getTemplateSyncConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTemplateSyncConfig operation returned by the service.
     * @sample AWSProtonAsyncHandler.GetTemplateSyncConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetTemplateSyncConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateSyncConfigResult> getTemplateSyncConfigAsync(GetTemplateSyncConfigRequest getTemplateSyncConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetTemplateSyncConfigRequest, GetTemplateSyncConfigResult> asyncHandler);

    /**
     * <p>
     * Get the status of a template sync.
     * </p>
     * 
     * @param getTemplateSyncStatusRequest
     * @return A Java Future containing the result of the GetTemplateSyncStatus operation returned by the service.
     * @sample AWSProtonAsync.GetTemplateSyncStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetTemplateSyncStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateSyncStatusResult> getTemplateSyncStatusAsync(GetTemplateSyncStatusRequest getTemplateSyncStatusRequest);

    /**
     * <p>
     * Get the status of a template sync.
     * </p>
     * 
     * @param getTemplateSyncStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTemplateSyncStatus operation returned by the service.
     * @sample AWSProtonAsyncHandler.GetTemplateSyncStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetTemplateSyncStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTemplateSyncStatusResult> getTemplateSyncStatusAsync(GetTemplateSyncStatusRequest getTemplateSyncStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetTemplateSyncStatusRequest, GetTemplateSyncStatusResult> asyncHandler);

    /**
     * <p>
     * Get a list of component Infrastructure as Code (IaC) outputs.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param listComponentOutputsRequest
     * @return A Java Future containing the result of the ListComponentOutputs operation returned by the service.
     * @sample AWSProtonAsync.ListComponentOutputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListComponentOutputs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentOutputsResult> listComponentOutputsAsync(ListComponentOutputsRequest listComponentOutputsRequest);

    /**
     * <p>
     * Get a list of component Infrastructure as Code (IaC) outputs.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param listComponentOutputsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListComponentOutputs operation returned by the service.
     * @sample AWSProtonAsyncHandler.ListComponentOutputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListComponentOutputs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentOutputsResult> listComponentOutputsAsync(ListComponentOutputsRequest listComponentOutputsRequest,
            com.amazonaws.handlers.AsyncHandler<ListComponentOutputsRequest, ListComponentOutputsResult> asyncHandler);

    /**
     * <p>
     * List provisioned resources for a component with details.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param listComponentProvisionedResourcesRequest
     * @return A Java Future containing the result of the ListComponentProvisionedResources operation returned by the
     *         service.
     * @sample AWSProtonAsync.ListComponentProvisionedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListComponentProvisionedResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentProvisionedResourcesResult> listComponentProvisionedResourcesAsync(
            ListComponentProvisionedResourcesRequest listComponentProvisionedResourcesRequest);

    /**
     * <p>
     * List provisioned resources for a component with details.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param listComponentProvisionedResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListComponentProvisionedResources operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.ListComponentProvisionedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListComponentProvisionedResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListComponentProvisionedResourcesResult> listComponentProvisionedResourcesAsync(
            ListComponentProvisionedResourcesRequest listComponentProvisionedResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListComponentProvisionedResourcesRequest, ListComponentProvisionedResourcesResult> asyncHandler);

    /**
     * <p>
     * List components with summary data. You can filter the result list by environment, service, or a single service
     * instance.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param listComponentsRequest
     * @return A Java Future containing the result of the ListComponents operation returned by the service.
     * @sample AWSProtonAsync.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListComponents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest listComponentsRequest);

    /**
     * <p>
     * List components with summary data. You can filter the result list by environment, service, or a single service
     * instance.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param listComponentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListComponents operation returned by the service.
     * @sample AWSProtonAsyncHandler.ListComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListComponents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListComponentsResult> listComponentsAsync(ListComponentsRequest listComponentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListComponentsRequest, ListComponentsResult> asyncHandler);

    /**
     * <p>
     * View a list of environment account connections.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * 
     * @param listEnvironmentAccountConnectionsRequest
     * @return A Java Future containing the result of the ListEnvironmentAccountConnections operation returned by the
     *         service.
     * @sample AWSProtonAsync.ListEnvironmentAccountConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentAccountConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentAccountConnectionsResult> listEnvironmentAccountConnectionsAsync(
            ListEnvironmentAccountConnectionsRequest listEnvironmentAccountConnectionsRequest);

    /**
     * <p>
     * View a list of environment account connections.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * 
     * @param listEnvironmentAccountConnectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironmentAccountConnections operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.ListEnvironmentAccountConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentAccountConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentAccountConnectionsResult> listEnvironmentAccountConnectionsAsync(
            ListEnvironmentAccountConnectionsRequest listEnvironmentAccountConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentAccountConnectionsRequest, ListEnvironmentAccountConnectionsResult> asyncHandler);

    /**
     * <p>
     * List the infrastructure as code outputs for your environment.
     * </p>
     * 
     * @param listEnvironmentOutputsRequest
     * @return A Java Future containing the result of the ListEnvironmentOutputs operation returned by the service.
     * @sample AWSProtonAsync.ListEnvironmentOutputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentOutputs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentOutputsResult> listEnvironmentOutputsAsync(ListEnvironmentOutputsRequest listEnvironmentOutputsRequest);

    /**
     * <p>
     * List the infrastructure as code outputs for your environment.
     * </p>
     * 
     * @param listEnvironmentOutputsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironmentOutputs operation returned by the service.
     * @sample AWSProtonAsyncHandler.ListEnvironmentOutputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentOutputs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentOutputsResult> listEnvironmentOutputsAsync(ListEnvironmentOutputsRequest listEnvironmentOutputsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentOutputsRequest, ListEnvironmentOutputsResult> asyncHandler);

    /**
     * <p>
     * List the provisioned resources for your environment.
     * </p>
     * 
     * @param listEnvironmentProvisionedResourcesRequest
     * @return A Java Future containing the result of the ListEnvironmentProvisionedResources operation returned by the
     *         service.
     * @sample AWSProtonAsync.ListEnvironmentProvisionedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentProvisionedResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentProvisionedResourcesResult> listEnvironmentProvisionedResourcesAsync(
            ListEnvironmentProvisionedResourcesRequest listEnvironmentProvisionedResourcesRequest);

    /**
     * <p>
     * List the provisioned resources for your environment.
     * </p>
     * 
     * @param listEnvironmentProvisionedResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironmentProvisionedResources operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.ListEnvironmentProvisionedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentProvisionedResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentProvisionedResourcesResult> listEnvironmentProvisionedResourcesAsync(
            ListEnvironmentProvisionedResourcesRequest listEnvironmentProvisionedResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentProvisionedResourcesRequest, ListEnvironmentProvisionedResourcesResult> asyncHandler);

    /**
     * <p>
     * List major or minor versions of an environment template with detail data.
     * </p>
     * 
     * @param listEnvironmentTemplateVersionsRequest
     * @return A Java Future containing the result of the ListEnvironmentTemplateVersions operation returned by the
     *         service.
     * @sample AWSProtonAsync.ListEnvironmentTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentTemplateVersionsResult> listEnvironmentTemplateVersionsAsync(
            ListEnvironmentTemplateVersionsRequest listEnvironmentTemplateVersionsRequest);

    /**
     * <p>
     * List major or minor versions of an environment template with detail data.
     * </p>
     * 
     * @param listEnvironmentTemplateVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironmentTemplateVersions operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.ListEnvironmentTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentTemplateVersionsResult> listEnvironmentTemplateVersionsAsync(
            ListEnvironmentTemplateVersionsRequest listEnvironmentTemplateVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentTemplateVersionsRequest, ListEnvironmentTemplateVersionsResult> asyncHandler);

    /**
     * <p>
     * List environment templates.
     * </p>
     * 
     * @param listEnvironmentTemplatesRequest
     * @return A Java Future containing the result of the ListEnvironmentTemplates operation returned by the service.
     * @sample AWSProtonAsync.ListEnvironmentTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentTemplatesResult> listEnvironmentTemplatesAsync(ListEnvironmentTemplatesRequest listEnvironmentTemplatesRequest);

    /**
     * <p>
     * List environment templates.
     * </p>
     * 
     * @param listEnvironmentTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironmentTemplates operation returned by the service.
     * @sample AWSProtonAsyncHandler.ListEnvironmentTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentTemplatesResult> listEnvironmentTemplatesAsync(ListEnvironmentTemplatesRequest listEnvironmentTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentTemplatesRequest, ListEnvironmentTemplatesResult> asyncHandler);

    /**
     * <p>
     * List environments with detail data summaries.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AWSProtonAsync.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * List environments with detail data summaries.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AWSProtonAsyncHandler.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * List linked repositories with detail data.
     * </p>
     * 
     * @param listRepositoriesRequest
     * @return A Java Future containing the result of the ListRepositories operation returned by the service.
     * @sample AWSProtonAsync.ListRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListRepositories" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest listRepositoriesRequest);

    /**
     * <p>
     * List linked repositories with detail data.
     * </p>
     * 
     * @param listRepositoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRepositories operation returned by the service.
     * @sample AWSProtonAsyncHandler.ListRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListRepositories" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoriesResult> listRepositoriesAsync(ListRepositoriesRequest listRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRepositoriesRequest, ListRepositoriesResult> asyncHandler);

    /**
     * <p>
     * List repository sync definitions with detail data.
     * </p>
     * 
     * @param listRepositorySyncDefinitionsRequest
     * @return A Java Future containing the result of the ListRepositorySyncDefinitions operation returned by the
     *         service.
     * @sample AWSProtonAsync.ListRepositorySyncDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListRepositorySyncDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositorySyncDefinitionsResult> listRepositorySyncDefinitionsAsync(
            ListRepositorySyncDefinitionsRequest listRepositorySyncDefinitionsRequest);

    /**
     * <p>
     * List repository sync definitions with detail data.
     * </p>
     * 
     * @param listRepositorySyncDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRepositorySyncDefinitions operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.ListRepositorySyncDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListRepositorySyncDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositorySyncDefinitionsResult> listRepositorySyncDefinitionsAsync(
            ListRepositorySyncDefinitionsRequest listRepositorySyncDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRepositorySyncDefinitionsRequest, ListRepositorySyncDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Get a list service of instance Infrastructure as Code (IaC) outputs.
     * </p>
     * 
     * @param listServiceInstanceOutputsRequest
     * @return A Java Future containing the result of the ListServiceInstanceOutputs operation returned by the service.
     * @sample AWSProtonAsync.ListServiceInstanceOutputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceInstanceOutputs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceInstanceOutputsResult> listServiceInstanceOutputsAsync(
            ListServiceInstanceOutputsRequest listServiceInstanceOutputsRequest);

    /**
     * <p>
     * Get a list service of instance Infrastructure as Code (IaC) outputs.
     * </p>
     * 
     * @param listServiceInstanceOutputsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceInstanceOutputs operation returned by the service.
     * @sample AWSProtonAsyncHandler.ListServiceInstanceOutputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceInstanceOutputs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceInstanceOutputsResult> listServiceInstanceOutputsAsync(
            ListServiceInstanceOutputsRequest listServiceInstanceOutputsRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceInstanceOutputsRequest, ListServiceInstanceOutputsResult> asyncHandler);

    /**
     * <p>
     * List provisioned resources for a service instance with details.
     * </p>
     * 
     * @param listServiceInstanceProvisionedResourcesRequest
     * @return A Java Future containing the result of the ListServiceInstanceProvisionedResources operation returned by
     *         the service.
     * @sample AWSProtonAsync.ListServiceInstanceProvisionedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceInstanceProvisionedResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceInstanceProvisionedResourcesResult> listServiceInstanceProvisionedResourcesAsync(
            ListServiceInstanceProvisionedResourcesRequest listServiceInstanceProvisionedResourcesRequest);

    /**
     * <p>
     * List provisioned resources for a service instance with details.
     * </p>
     * 
     * @param listServiceInstanceProvisionedResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceInstanceProvisionedResources operation returned by
     *         the service.
     * @sample AWSProtonAsyncHandler.ListServiceInstanceProvisionedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceInstanceProvisionedResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceInstanceProvisionedResourcesResult> listServiceInstanceProvisionedResourcesAsync(
            ListServiceInstanceProvisionedResourcesRequest listServiceInstanceProvisionedResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceInstanceProvisionedResourcesRequest, ListServiceInstanceProvisionedResourcesResult> asyncHandler);

    /**
     * <p>
     * List service instances with summary data. This action lists service instances of all services in the Amazon Web
     * Services account.
     * </p>
     * 
     * @param listServiceInstancesRequest
     * @return A Java Future containing the result of the ListServiceInstances operation returned by the service.
     * @sample AWSProtonAsync.ListServiceInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceInstancesResult> listServiceInstancesAsync(ListServiceInstancesRequest listServiceInstancesRequest);

    /**
     * <p>
     * List service instances with summary data. This action lists service instances of all services in the Amazon Web
     * Services account.
     * </p>
     * 
     * @param listServiceInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceInstances operation returned by the service.
     * @sample AWSProtonAsyncHandler.ListServiceInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceInstancesResult> listServiceInstancesAsync(ListServiceInstancesRequest listServiceInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceInstancesRequest, ListServiceInstancesResult> asyncHandler);

    /**
     * <p>
     * Get a list of service pipeline Infrastructure as Code (IaC) outputs.
     * </p>
     * 
     * @param listServicePipelineOutputsRequest
     * @return A Java Future containing the result of the ListServicePipelineOutputs operation returned by the service.
     * @sample AWSProtonAsync.ListServicePipelineOutputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServicePipelineOutputs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServicePipelineOutputsResult> listServicePipelineOutputsAsync(
            ListServicePipelineOutputsRequest listServicePipelineOutputsRequest);

    /**
     * <p>
     * Get a list of service pipeline Infrastructure as Code (IaC) outputs.
     * </p>
     * 
     * @param listServicePipelineOutputsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServicePipelineOutputs operation returned by the service.
     * @sample AWSProtonAsyncHandler.ListServicePipelineOutputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServicePipelineOutputs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServicePipelineOutputsResult> listServicePipelineOutputsAsync(
            ListServicePipelineOutputsRequest listServicePipelineOutputsRequest,
            com.amazonaws.handlers.AsyncHandler<ListServicePipelineOutputsRequest, ListServicePipelineOutputsResult> asyncHandler);

    /**
     * <p>
     * List provisioned resources for a service and pipeline with details.
     * </p>
     * 
     * @param listServicePipelineProvisionedResourcesRequest
     * @return A Java Future containing the result of the ListServicePipelineProvisionedResources operation returned by
     *         the service.
     * @sample AWSProtonAsync.ListServicePipelineProvisionedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServicePipelineProvisionedResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServicePipelineProvisionedResourcesResult> listServicePipelineProvisionedResourcesAsync(
            ListServicePipelineProvisionedResourcesRequest listServicePipelineProvisionedResourcesRequest);

    /**
     * <p>
     * List provisioned resources for a service and pipeline with details.
     * </p>
     * 
     * @param listServicePipelineProvisionedResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServicePipelineProvisionedResources operation returned by
     *         the service.
     * @sample AWSProtonAsyncHandler.ListServicePipelineProvisionedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServicePipelineProvisionedResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServicePipelineProvisionedResourcesResult> listServicePipelineProvisionedResourcesAsync(
            ListServicePipelineProvisionedResourcesRequest listServicePipelineProvisionedResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServicePipelineProvisionedResourcesRequest, ListServicePipelineProvisionedResourcesResult> asyncHandler);

    /**
     * <p>
     * List major or minor versions of a service template with detail data.
     * </p>
     * 
     * @param listServiceTemplateVersionsRequest
     * @return A Java Future containing the result of the ListServiceTemplateVersions operation returned by the service.
     * @sample AWSProtonAsync.ListServiceTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceTemplateVersionsResult> listServiceTemplateVersionsAsync(
            ListServiceTemplateVersionsRequest listServiceTemplateVersionsRequest);

    /**
     * <p>
     * List major or minor versions of a service template with detail data.
     * </p>
     * 
     * @param listServiceTemplateVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceTemplateVersions operation returned by the service.
     * @sample AWSProtonAsyncHandler.ListServiceTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceTemplateVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceTemplateVersionsResult> listServiceTemplateVersionsAsync(
            ListServiceTemplateVersionsRequest listServiceTemplateVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceTemplateVersionsRequest, ListServiceTemplateVersionsResult> asyncHandler);

    /**
     * <p>
     * List service templates with detail data.
     * </p>
     * 
     * @param listServiceTemplatesRequest
     * @return A Java Future containing the result of the ListServiceTemplates operation returned by the service.
     * @sample AWSProtonAsync.ListServiceTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceTemplatesResult> listServiceTemplatesAsync(ListServiceTemplatesRequest listServiceTemplatesRequest);

    /**
     * <p>
     * List service templates with detail data.
     * </p>
     * 
     * @param listServiceTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServiceTemplates operation returned by the service.
     * @sample AWSProtonAsyncHandler.ListServiceTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListServiceTemplatesResult> listServiceTemplatesAsync(ListServiceTemplatesRequest listServiceTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServiceTemplatesRequest, ListServiceTemplatesResult> asyncHandler);

    /**
     * <p>
     * List services with summaries of detail data.
     * </p>
     * 
     * @param listServicesRequest
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AWSProtonAsync.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest);

    /**
     * <p>
     * List services with summaries of detail data.
     * </p>
     * 
     * @param listServicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AWSProtonAsyncHandler.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler);

    /**
     * <p>
     * List tags for a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and tagging</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSProtonAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List tags for a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton resources and tagging</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSProtonAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Notify Proton of status changes to a provisioned resource when you use self-managed provisioning.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html#ag-works-prov-methods-self"
     * >Self-managed provisioning</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param notifyResourceDeploymentStatusChangeRequest
     * @return A Java Future containing the result of the NotifyResourceDeploymentStatusChange operation returned by the
     *         service.
     * @sample AWSProtonAsync.NotifyResourceDeploymentStatusChange
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/NotifyResourceDeploymentStatusChange"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<NotifyResourceDeploymentStatusChangeResult> notifyResourceDeploymentStatusChangeAsync(
            NotifyResourceDeploymentStatusChangeRequest notifyResourceDeploymentStatusChangeRequest);

    /**
     * <p>
     * Notify Proton of status changes to a provisioned resource when you use self-managed provisioning.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html#ag-works-prov-methods-self"
     * >Self-managed provisioning</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param notifyResourceDeploymentStatusChangeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the NotifyResourceDeploymentStatusChange operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.NotifyResourceDeploymentStatusChange
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/NotifyResourceDeploymentStatusChange"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<NotifyResourceDeploymentStatusChangeResult> notifyResourceDeploymentStatusChangeAsync(
            NotifyResourceDeploymentStatusChangeRequest notifyResourceDeploymentStatusChangeRequest,
            com.amazonaws.handlers.AsyncHandler<NotifyResourceDeploymentStatusChangeRequest, NotifyResourceDeploymentStatusChangeResult> asyncHandler);

    /**
     * <p>
     * In a management account, reject an environment account connection from another environment account.
     * </p>
     * <p>
     * After you reject an environment account connection request, you <i>can't</i> accept or use the rejected
     * environment account connection.
     * </p>
     * <p>
     * You <i>can’t</i> reject an environment account connection that's connected to an environment.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * 
     * @param rejectEnvironmentAccountConnectionRequest
     * @return A Java Future containing the result of the RejectEnvironmentAccountConnection operation returned by the
     *         service.
     * @sample AWSProtonAsync.RejectEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/RejectEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectEnvironmentAccountConnectionResult> rejectEnvironmentAccountConnectionAsync(
            RejectEnvironmentAccountConnectionRequest rejectEnvironmentAccountConnectionRequest);

    /**
     * <p>
     * In a management account, reject an environment account connection from another environment account.
     * </p>
     * <p>
     * After you reject an environment account connection request, you <i>can't</i> accept or use the rejected
     * environment account connection.
     * </p>
     * <p>
     * You <i>can’t</i> reject an environment account connection that's connected to an environment.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * 
     * @param rejectEnvironmentAccountConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectEnvironmentAccountConnection operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.RejectEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/RejectEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectEnvironmentAccountConnectionResult> rejectEnvironmentAccountConnectionAsync(
            RejectEnvironmentAccountConnectionRequest rejectEnvironmentAccountConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<RejectEnvironmentAccountConnectionRequest, RejectEnvironmentAccountConnectionResult> asyncHandler);

    /**
     * <p>
     * Tag a resource. A tag is a key-value pair of metadata that you associate with an Proton resource.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSProtonAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tag a resource. A tag is a key-value pair of metadata that you associate with an Proton resource.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSProtonAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Remove a customer tag from a resource. A tag is a key-value pair of metadata associated with an Proton resource.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSProtonAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Remove a customer tag from a resource. A tag is a key-value pair of metadata associated with an Proton resource.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">Proton
     * resources and tagging</a> in the <i>Proton User Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSProtonAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update Proton settings that are used for multiple services in the Amazon Web Services account.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @return A Java Future containing the result of the UpdateAccountSettings operation returned by the service.
     * @sample AWSProtonAsync.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest updateAccountSettingsRequest);

    /**
     * <p>
     * Update Proton settings that are used for multiple services in the Amazon Web Services account.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccountSettings operation returned by the service.
     * @sample AWSProtonAsyncHandler.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest updateAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountSettingsRequest, UpdateAccountSettingsResult> asyncHandler);

    /**
     * <p>
     * Update a component.
     * </p>
     * <p>
     * There are a few modes for updating a component. The <code>deploymentType</code> field defines the mode.
     * </p>
     * <note>
     * <p>
     * You can't update a component while its deployment status, or the deployment status of a service instance attached
     * to it, is <code>IN_PROGRESS</code>.
     * </p>
     * </note>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param updateComponentRequest
     * @return A Java Future containing the result of the UpdateComponent operation returned by the service.
     * @sample AWSProtonAsync.UpdateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateComponentResult> updateComponentAsync(UpdateComponentRequest updateComponentRequest);

    /**
     * <p>
     * Update a component.
     * </p>
     * <p>
     * There are a few modes for updating a component. The <code>deploymentType</code> field defines the mode.
     * </p>
     * <note>
     * <p>
     * You can't update a component while its deployment status, or the deployment status of a service instance attached
     * to it, is <code>IN_PROGRESS</code>.
     * </p>
     * </note>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * 
     * @param updateComponentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateComponent operation returned by the service.
     * @sample AWSProtonAsyncHandler.UpdateComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateComponent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateComponentResult> updateComponentAsync(UpdateComponentRequest updateComponentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateComponentRequest, UpdateComponentResult> asyncHandler);

    /**
     * <p>
     * Update an environment.
     * </p>
     * <p>
     * If the environment is associated with an environment account connection, <i>don't</i> update or include the
     * <code>protonServiceRoleArn</code> and <code>provisioningRepository</code> parameter to update or connect to an
     * environment account connection.
     * </p>
     * <p>
     * You can only update to a new environment account connection if that connection was created in the same
     * environment account that the current environment account connection was created in. The account connection must
     * also be associated with the current environment.
     * </p>
     * <p>
     * If the environment <i>isn't</i> associated with an environment account connection, <i>don't</i> update or include
     * the <code>environmentAccountConnectionId</code> parameter. You <i>can't</i> update or connect the environment to
     * an environment account connection if it <i>isn't</i> already associated with an environment connection.
     * </p>
     * <p>
     * You can update either the <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code>
     * parameter and value. You can’t update both.
     * </p>
     * <p>
     * If the environment was configured for Amazon Web Services-managed provisioning, omit the
     * <code>provisioningRepository</code> parameter.
     * </p>
     * <p>
     * If the environment was configured for self-managed provisioning, specify the <code>provisioningRepository</code>
     * parameter and omit the <code>protonServiceRoleArn</code> and <code>environmentAccountConnectionId</code>
     * parameters.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-environments.html">Environments</a> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html">Provisioning methods</a> in
     * the <i>Proton User Guide</i>.
     * </p>
     * <p>
     * There are four modes for updating an environment. The <code>deploymentType</code> field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) minor version of
     * the current major version in use, by default. You can also specify a different minor version of the current major
     * version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) major and minor
     * version of the current template, by default. You can also specify a different major version that's higher than
     * the major version in use and a minor version.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param updateEnvironmentRequest
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AWSProtonAsync.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Update an environment.
     * </p>
     * <p>
     * If the environment is associated with an environment account connection, <i>don't</i> update or include the
     * <code>protonServiceRoleArn</code> and <code>provisioningRepository</code> parameter to update or connect to an
     * environment account connection.
     * </p>
     * <p>
     * You can only update to a new environment account connection if that connection was created in the same
     * environment account that the current environment account connection was created in. The account connection must
     * also be associated with the current environment.
     * </p>
     * <p>
     * If the environment <i>isn't</i> associated with an environment account connection, <i>don't</i> update or include
     * the <code>environmentAccountConnectionId</code> parameter. You <i>can't</i> update or connect the environment to
     * an environment account connection if it <i>isn't</i> already associated with an environment connection.
     * </p>
     * <p>
     * You can update either the <code>environmentAccountConnectionId</code> or <code>protonServiceRoleArn</code>
     * parameter and value. You can’t update both.
     * </p>
     * <p>
     * If the environment was configured for Amazon Web Services-managed provisioning, omit the
     * <code>provisioningRepository</code> parameter.
     * </p>
     * <p>
     * If the environment was configured for self-managed provisioning, specify the <code>provisioningRepository</code>
     * parameter and omit the <code>protonServiceRoleArn</code> and <code>environmentAccountConnectionId</code>
     * parameters.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-environments.html">Environments</a> and <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-works-prov-methods.html">Provisioning methods</a> in
     * the <i>Proton User Guide</i>.
     * </p>
     * <p>
     * There are four modes for updating an environment. The <code>deploymentType</code> field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) minor version of
     * the current major version in use, by default. You can also specify a different minor version of the current major
     * version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) major and minor
     * version of the current template, by default. You can also specify a different major version that's higher than
     * the major version in use and a minor version.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param updateEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AWSProtonAsyncHandler.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * In an environment account, update an environment account connection to use a new IAM role.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * 
     * @param updateEnvironmentAccountConnectionRequest
     * @return A Java Future containing the result of the UpdateEnvironmentAccountConnection operation returned by the
     *         service.
     * @sample AWSProtonAsync.UpdateEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentAccountConnectionResult> updateEnvironmentAccountConnectionAsync(
            UpdateEnvironmentAccountConnectionRequest updateEnvironmentAccountConnectionRequest);

    /**
     * <p>
     * In an environment account, update an environment account connection to use a new IAM role.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-env-account-connections.html">Environment account
     * connections</a> in the <i>Proton User guide</i>.
     * </p>
     * 
     * @param updateEnvironmentAccountConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnvironmentAccountConnection operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.UpdateEnvironmentAccountConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironmentAccountConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentAccountConnectionResult> updateEnvironmentAccountConnectionAsync(
            UpdateEnvironmentAccountConnectionRequest updateEnvironmentAccountConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentAccountConnectionRequest, UpdateEnvironmentAccountConnectionResult> asyncHandler);

    /**
     * <p>
     * Update an environment template.
     * </p>
     * 
     * @param updateEnvironmentTemplateRequest
     * @return A Java Future containing the result of the UpdateEnvironmentTemplate operation returned by the service.
     * @sample AWSProtonAsync.UpdateEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironmentTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentTemplateResult> updateEnvironmentTemplateAsync(
            UpdateEnvironmentTemplateRequest updateEnvironmentTemplateRequest);

    /**
     * <p>
     * Update an environment template.
     * </p>
     * 
     * @param updateEnvironmentTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnvironmentTemplate operation returned by the service.
     * @sample AWSProtonAsyncHandler.UpdateEnvironmentTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironmentTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentTemplateResult> updateEnvironmentTemplateAsync(
            UpdateEnvironmentTemplateRequest updateEnvironmentTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentTemplateRequest, UpdateEnvironmentTemplateResult> asyncHandler);

    /**
     * <p>
     * Update a major or minor version of an environment template.
     * </p>
     * 
     * @param updateEnvironmentTemplateVersionRequest
     * @return A Java Future containing the result of the UpdateEnvironmentTemplateVersion operation returned by the
     *         service.
     * @sample AWSProtonAsync.UpdateEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentTemplateVersionResult> updateEnvironmentTemplateVersionAsync(
            UpdateEnvironmentTemplateVersionRequest updateEnvironmentTemplateVersionRequest);

    /**
     * <p>
     * Update a major or minor version of an environment template.
     * </p>
     * 
     * @param updateEnvironmentTemplateVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnvironmentTemplateVersion operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.UpdateEnvironmentTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironmentTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentTemplateVersionResult> updateEnvironmentTemplateVersionAsync(
            UpdateEnvironmentTemplateVersionRequest updateEnvironmentTemplateVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentTemplateVersionRequest, UpdateEnvironmentTemplateVersionResult> asyncHandler);

    /**
     * <p>
     * Edit a service description or use a spec to add and delete service instances.
     * </p>
     * <note>
     * <p>
     * Existing service instances and the service pipeline <i>can't</i> be edited using this API. They can only be
     * deleted.
     * </p>
     * </note>
     * <p>
     * Use the <code>description</code> parameter to modify the description.
     * </p>
     * <p>
     * Edit the <code>spec</code> parameter to add or delete instances.
     * </p>
     * <note>
     * <p>
     * You can't delete a service instance (remove it from the spec) if it has an attached component.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * </note>
     * 
     * @param updateServiceRequest
     * @return A Java Future containing the result of the UpdateService operation returned by the service.
     * @sample AWSProtonAsync.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest updateServiceRequest);

    /**
     * <p>
     * Edit a service description or use a spec to add and delete service instances.
     * </p>
     * <note>
     * <p>
     * Existing service instances and the service pipeline <i>can't</i> be edited using this API. They can only be
     * deleted.
     * </p>
     * </note>
     * <p>
     * Use the <code>description</code> parameter to modify the description.
     * </p>
     * <p>
     * Edit the <code>spec</code> parameter to add or delete instances.
     * </p>
     * <note>
     * <p>
     * You can't delete a service instance (remove it from the spec) if it has an attached component.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * </note>
     * 
     * @param updateServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateService operation returned by the service.
     * @sample AWSProtonAsyncHandler.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest updateServiceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceRequest, UpdateServiceResult> asyncHandler);

    /**
     * <p>
     * Update a service instance.
     * </p>
     * <p>
     * There are a few modes for updating a service instance. The <code>deploymentType</code> field defines the mode.
     * </p>
     * <note>
     * <p>
     * You can't update a service instance while its deployment status, or the deployment status of a component attached
     * to it, is <code>IN_PROGRESS</code>.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * </note>
     * 
     * @param updateServiceInstanceRequest
     * @return A Java Future containing the result of the UpdateServiceInstance operation returned by the service.
     * @sample AWSProtonAsync.UpdateServiceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceInstanceResult> updateServiceInstanceAsync(UpdateServiceInstanceRequest updateServiceInstanceRequest);

    /**
     * <p>
     * Update a service instance.
     * </p>
     * <p>
     * There are a few modes for updating a service instance. The <code>deploymentType</code> field defines the mode.
     * </p>
     * <note>
     * <p>
     * You can't update a service instance while its deployment status, or the deployment status of a component attached
     * to it, is <code>IN_PROGRESS</code>.
     * </p>
     * <p>
     * For more information about components, see <a
     * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the
     * <i>Proton User Guide</i>.
     * </p>
     * </note>
     * 
     * @param updateServiceInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServiceInstance operation returned by the service.
     * @sample AWSProtonAsyncHandler.UpdateServiceInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceInstanceResult> updateServiceInstanceAsync(UpdateServiceInstanceRequest updateServiceInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceInstanceRequest, UpdateServiceInstanceResult> asyncHandler);

    /**
     * <p>
     * Update the service pipeline.
     * </p>
     * <p>
     * There are four modes for updating a service pipeline. The <code>deploymentType</code> field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include major or minor version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor version
     * of the current major version in use, by default. You can specify a different minor version of the current major
     * version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template by default. You can specify a different major version that's higher than
     * the major version in use and a minor version.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param updateServicePipelineRequest
     * @return A Java Future containing the result of the UpdateServicePipeline operation returned by the service.
     * @sample AWSProtonAsync.UpdateServicePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServicePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServicePipelineResult> updateServicePipelineAsync(UpdateServicePipelineRequest updateServicePipelineRequest);

    /**
     * <p>
     * Update the service pipeline.
     * </p>
     * <p>
     * There are four modes for updating a service pipeline. The <code>deploymentType</code> field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include major or minor version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) minor version
     * of the current major version in use, by default. You can specify a different minor version of the current major
     * version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the service pipeline is deployed and updated with the published, recommended (latest) major and
     * minor version of the current template by default. You can specify a different major version that's higher than
     * the major version in use and a minor version.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param updateServicePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServicePipeline operation returned by the service.
     * @sample AWSProtonAsyncHandler.UpdateServicePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServicePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServicePipelineResult> updateServicePipelineAsync(UpdateServicePipelineRequest updateServicePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServicePipelineRequest, UpdateServicePipelineResult> asyncHandler);

    /**
     * <p>
     * Update a service template.
     * </p>
     * 
     * @param updateServiceTemplateRequest
     * @return A Java Future containing the result of the UpdateServiceTemplate operation returned by the service.
     * @sample AWSProtonAsync.UpdateServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceTemplateResult> updateServiceTemplateAsync(UpdateServiceTemplateRequest updateServiceTemplateRequest);

    /**
     * <p>
     * Update a service template.
     * </p>
     * 
     * @param updateServiceTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServiceTemplate operation returned by the service.
     * @sample AWSProtonAsyncHandler.UpdateServiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceTemplateResult> updateServiceTemplateAsync(UpdateServiceTemplateRequest updateServiceTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceTemplateRequest, UpdateServiceTemplateResult> asyncHandler);

    /**
     * <p>
     * Update a major or minor version of a service template.
     * </p>
     * 
     * @param updateServiceTemplateVersionRequest
     * @return A Java Future containing the result of the UpdateServiceTemplateVersion operation returned by the
     *         service.
     * @sample AWSProtonAsync.UpdateServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceTemplateVersionResult> updateServiceTemplateVersionAsync(
            UpdateServiceTemplateVersionRequest updateServiceTemplateVersionRequest);

    /**
     * <p>
     * Update a major or minor version of a service template.
     * </p>
     * 
     * @param updateServiceTemplateVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateServiceTemplateVersion operation returned by the
     *         service.
     * @sample AWSProtonAsyncHandler.UpdateServiceTemplateVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceTemplateVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceTemplateVersionResult> updateServiceTemplateVersionAsync(
            UpdateServiceTemplateVersionRequest updateServiceTemplateVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceTemplateVersionRequest, UpdateServiceTemplateVersionResult> asyncHandler);

    /**
     * <p>
     * Update template sync configuration parameters, except for the <code>templateName</code> and
     * <code>templateType</code>. Repository details (branch, name, and provider) should be of a linked repository. A
     * linked repository is a repository that has been registered with Proton. For more information, see
     * <a>CreateRepository</a>.
     * </p>
     * 
     * @param updateTemplateSyncConfigRequest
     * @return A Java Future containing the result of the UpdateTemplateSyncConfig operation returned by the service.
     * @sample AWSProtonAsync.UpdateTemplateSyncConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateTemplateSyncConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateSyncConfigResult> updateTemplateSyncConfigAsync(UpdateTemplateSyncConfigRequest updateTemplateSyncConfigRequest);

    /**
     * <p>
     * Update template sync configuration parameters, except for the <code>templateName</code> and
     * <code>templateType</code>. Repository details (branch, name, and provider) should be of a linked repository. A
     * linked repository is a repository that has been registered with Proton. For more information, see
     * <a>CreateRepository</a>.
     * </p>
     * 
     * @param updateTemplateSyncConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTemplateSyncConfig operation returned by the service.
     * @sample AWSProtonAsyncHandler.UpdateTemplateSyncConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateTemplateSyncConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateSyncConfigResult> updateTemplateSyncConfigAsync(UpdateTemplateSyncConfigRequest updateTemplateSyncConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTemplateSyncConfigRequest, UpdateTemplateSyncConfigResult> asyncHandler);

}
