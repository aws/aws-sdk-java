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
package com.amazonaws.services.appconfig;

import javax.annotation.Generated;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AppConfig asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * AppConfig feature flags and dynamic configurations help software builders quickly and securely adjust application
 * behavior in production environments without full code deployments. AppConfig speeds up software release frequency,
 * improves application resiliency, and helps you address emergent issues more quickly. With feature flags, you can
 * gradually release new capabilities to users and measure the impact of those changes before fully deploying the new
 * capabilities to all users. With operational flags and dynamic configurations, you can update block lists, allow
 * lists, throttling limits, logging verbosity, and perform other operational tuning to quickly respond to issues in
 * production environments.
 * </p>
 * <note>
 * <p>
 * AppConfig is a capability of Amazon Web Services Systems Manager.
 * </p>
 * </note>
 * <p>
 * Despite the fact that application configuration content can vary greatly from application to application, AppConfig
 * supports the following use cases, which cover a broad spectrum of customer needs:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Feature flags and toggles</b> - Safely release new capabilities to your customers in a controlled environment.
 * Instantly roll back changes if you experience a problem.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Application tuning</b> - Carefully introduce application changes while testing the impact of those changes with
 * users in production environments.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Allow list or block list</b> - Control access to premium features or instantly block specific users without
 * deploying new code.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Centralized configuration storage</b> - Keep your configuration data organized and consistent across all of your
 * workloads. You can use AppConfig to deploy configuration data stored in the AppConfig hosted configuration store,
 * Secrets Manager, Systems Manager, Parameter Store, or Amazon S3.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>How AppConfig works</b>
 * </p>
 * <p>
 * This section provides a high-level description of how AppConfig works and how you get started.
 * </p>
 * <dl>
 * <dt>1. Identify configuration values in code you want to manage in the cloud</dt>
 * <dd>
 * <p>
 * Before you start creating AppConfig artifacts, we recommend you identify configuration data in your code that you
 * want to dynamically manage using AppConfig. Good examples include feature flags or toggles, allow and block lists,
 * logging verbosity, service limits, and throttling rules, to name a few.
 * </p>
 * <p>
 * If your configuration data already exists in the cloud, you can take advantage of AppConfig validation, deployment,
 * and extension features to further streamline configuration data management.
 * </p>
 * </dd>
 * <dt>2. Create an application namespace</dt>
 * <dd>
 * <p>
 * To create a namespace, you create an AppConfig artifact called an application. An application is simply an
 * organizational construct like a folder.
 * </p>
 * </dd>
 * <dt>3. Create environments</dt>
 * <dd>
 * <p>
 * For each AppConfig application, you define one or more environments. An environment is a logical grouping of targets,
 * such as applications in a <code>Beta</code> or <code>Production</code> environment, Lambda functions, or containers.
 * You can also define environments for application subcomponents, such as the <code>Web</code>, <code>Mobile</code>,
 * and <code>Back-end</code>.
 * </p>
 * <p>
 * You can configure Amazon CloudWatch alarms for each environment. The system monitors alarms during a configuration
 * deployment. If an alarm is triggered, the system rolls back the configuration.
 * </p>
 * </dd>
 * <dt>4. Create a configuration profile</dt>
 * <dd>
 * <p>
 * A configuration profile includes, among other things, a URI that enables AppConfig to locate your configuration data
 * in its stored location and a profile type. AppConfig supports two configuration profile types: feature flags and
 * freeform configurations. Feature flag configuration profiles store their data in the AppConfig hosted configuration
 * store and the URI is simply <code>hosted</code>. For freeform configuration profiles, you can store your data in the
 * AppConfig hosted configuration store or any Amazon Web Services service that integrates with AppConfig, as described
 * in <a href="http://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-free-form-configurations-creating.html">
 * Creating a free form configuration profile</a> in the the <i>AppConfig User Guide</i>.
 * </p>
 * <p>
 * A configuration profile can also include optional validators to ensure your configuration data is syntactically and
 * semantically correct. AppConfig performs a check using the validators when you start a deployment. If any errors are
 * detected, the deployment rolls back to the previous configuration data.
 * </p>
 * </dd>
 * <dt>5. Deploy configuration data</dt>
 * <dd>
 * <p>
 * When you create a new deployment, you specify the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * An application ID
 * </p>
 * </li>
 * <li>
 * <p>
 * A configuration profile ID
 * </p>
 * </li>
 * <li>
 * <p>
 * A configuration version
 * </p>
 * </li>
 * <li>
 * <p>
 * An environment ID where you want to deploy the configuration data
 * </p>
 * </li>
 * <li>
 * <p>
 * A deployment strategy ID that defines how fast you want the changes to take effect
 * </p>
 * </li>
 * </ul>
 * <p>
 * When you call the <a
 * href="https://docs.aws.amazon.com/appconfig/2019-10-09/APIReference/API_StartDeployment.html">StartDeployment</a> API
 * action, AppConfig performs the following tasks:
 * </p>
 * <ol>
 * <li>
 * <p>
 * Retrieves the configuration data from the underlying data store by using the location URI in the configuration
 * profile.
 * </p>
 * </li>
 * <li>
 * <p>
 * Verifies the configuration data is syntactically and semantically correct by using the validators you specified when
 * you created your configuration profile.
 * </p>
 * </li>
 * <li>
 * <p>
 * Caches a copy of the data so it is ready to be retrieved by your application. This cached copy is called the
 * <i>deployed data</i>.
 * </p>
 * </li>
 * </ol>
 * </dd>
 * <dt>6. Retrieve the configuration</dt>
 * <dd>
 * <p>
 * You can configure AppConfig Agent as a local host and have the agent poll AppConfig for configuration updates. The
 * agent calls the <a href=
 * "https://docs.aws.amazon.com/appconfig/2019-10-09/APIReference/API_appconfigdata_StartConfigurationSession.html"
 * >StartConfigurationSession</a> and <a
 * href="https://docs.aws.amazon.com/appconfig/2019-10-09/APIReference/API_appconfigdata_GetLatestConfiguration.html"
 * >GetLatestConfiguration</a> API actions and caches your configuration data locally. To retrieve the data, your
 * application makes an HTTP call to the localhost server. AppConfig Agent supports several use cases, as described in
 * <a href="http://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-retrieving-simplified-methods.html">
 * Simplified retrieval methods</a> in the the <i>AppConfig User Guide</i>.
 * </p>
 * <p>
 * If AppConfig Agent isn't supported for your use case, you can configure your application to poll AppConfig for
 * configuration updates by directly calling the <a href=
 * "https://docs.aws.amazon.com/appconfig/2019-10-09/APIReference/API_appconfigdata_StartConfigurationSession.html"
 * >StartConfigurationSession</a> and <a
 * href="https://docs.aws.amazon.com/appconfig/2019-10-09/APIReference/API_appconfigdata_GetLatestConfiguration.html"
 * >GetLatestConfiguration</a> API actions.
 * </p>
 * </dd>
 * </dl>
 * <p>
 * This reference is intended to be used with the <a
 * href="http://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html">AppConfig User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAppConfigAsyncClient extends AmazonAppConfigClient implements AmazonAppConfigAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonAppConfigAsyncClientBuilder asyncBuilder() {
        return AmazonAppConfigAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AppConfig using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonAppConfigAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AppConfig using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonAppConfigAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest request) {

        return createApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(final CreateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler) {
        final CreateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApplicationResult>() {
            @Override
            public CreateApplicationResult call() throws Exception {
                CreateApplicationResult result = null;

                try {
                    result = executeCreateApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationProfileResult> createConfigurationProfileAsync(CreateConfigurationProfileRequest request) {

        return createConfigurationProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationProfileResult> createConfigurationProfileAsync(final CreateConfigurationProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationProfileRequest, CreateConfigurationProfileResult> asyncHandler) {
        final CreateConfigurationProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationProfileResult>() {
            @Override
            public CreateConfigurationProfileResult call() throws Exception {
                CreateConfigurationProfileResult result = null;

                try {
                    result = executeCreateConfigurationProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentStrategyResult> createDeploymentStrategyAsync(CreateDeploymentStrategyRequest request) {

        return createDeploymentStrategyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentStrategyResult> createDeploymentStrategyAsync(final CreateDeploymentStrategyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentStrategyRequest, CreateDeploymentStrategyResult> asyncHandler) {
        final CreateDeploymentStrategyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentStrategyResult>() {
            @Override
            public CreateDeploymentStrategyResult call() throws Exception {
                CreateDeploymentStrategyResult result = null;

                try {
                    result = executeCreateDeploymentStrategy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest request) {

        return createEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(final CreateEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler) {
        final CreateEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEnvironmentResult>() {
            @Override
            public CreateEnvironmentResult call() throws Exception {
                CreateEnvironmentResult result = null;

                try {
                    result = executeCreateEnvironment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateExtensionResult> createExtensionAsync(CreateExtensionRequest request) {

        return createExtensionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExtensionResult> createExtensionAsync(final CreateExtensionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateExtensionRequest, CreateExtensionResult> asyncHandler) {
        final CreateExtensionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateExtensionResult>() {
            @Override
            public CreateExtensionResult call() throws Exception {
                CreateExtensionResult result = null;

                try {
                    result = executeCreateExtension(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateExtensionAssociationResult> createExtensionAssociationAsync(CreateExtensionAssociationRequest request) {

        return createExtensionAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExtensionAssociationResult> createExtensionAssociationAsync(final CreateExtensionAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateExtensionAssociationRequest, CreateExtensionAssociationResult> asyncHandler) {
        final CreateExtensionAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateExtensionAssociationResult>() {
            @Override
            public CreateExtensionAssociationResult call() throws Exception {
                CreateExtensionAssociationResult result = null;

                try {
                    result = executeCreateExtensionAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateHostedConfigurationVersionResult> createHostedConfigurationVersionAsync(
            CreateHostedConfigurationVersionRequest request) {

        return createHostedConfigurationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHostedConfigurationVersionResult> createHostedConfigurationVersionAsync(
            final CreateHostedConfigurationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHostedConfigurationVersionRequest, CreateHostedConfigurationVersionResult> asyncHandler) {
        final CreateHostedConfigurationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateHostedConfigurationVersionResult>() {
            @Override
            public CreateHostedConfigurationVersionResult call() throws Exception {
                CreateHostedConfigurationVersionResult result = null;

                try {
                    result = executeCreateHostedConfigurationVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest request) {

        return deleteApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(final DeleteApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler) {
        final DeleteApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApplicationResult>() {
            @Override
            public DeleteApplicationResult call() throws Exception {
                DeleteApplicationResult result = null;

                try {
                    result = executeDeleteApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationProfileResult> deleteConfigurationProfileAsync(DeleteConfigurationProfileRequest request) {

        return deleteConfigurationProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationProfileResult> deleteConfigurationProfileAsync(final DeleteConfigurationProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationProfileRequest, DeleteConfigurationProfileResult> asyncHandler) {
        final DeleteConfigurationProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationProfileResult>() {
            @Override
            public DeleteConfigurationProfileResult call() throws Exception {
                DeleteConfigurationProfileResult result = null;

                try {
                    result = executeDeleteConfigurationProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentStrategyResult> deleteDeploymentStrategyAsync(DeleteDeploymentStrategyRequest request) {

        return deleteDeploymentStrategyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentStrategyResult> deleteDeploymentStrategyAsync(final DeleteDeploymentStrategyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeploymentStrategyRequest, DeleteDeploymentStrategyResult> asyncHandler) {
        final DeleteDeploymentStrategyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeploymentStrategyResult>() {
            @Override
            public DeleteDeploymentStrategyResult call() throws Exception {
                DeleteDeploymentStrategyResult result = null;

                try {
                    result = executeDeleteDeploymentStrategy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest request) {

        return deleteEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(final DeleteEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler) {
        final DeleteEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEnvironmentResult>() {
            @Override
            public DeleteEnvironmentResult call() throws Exception {
                DeleteEnvironmentResult result = null;

                try {
                    result = executeDeleteEnvironment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteExtensionResult> deleteExtensionAsync(DeleteExtensionRequest request) {

        return deleteExtensionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteExtensionResult> deleteExtensionAsync(final DeleteExtensionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteExtensionRequest, DeleteExtensionResult> asyncHandler) {
        final DeleteExtensionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteExtensionResult>() {
            @Override
            public DeleteExtensionResult call() throws Exception {
                DeleteExtensionResult result = null;

                try {
                    result = executeDeleteExtension(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteExtensionAssociationResult> deleteExtensionAssociationAsync(DeleteExtensionAssociationRequest request) {

        return deleteExtensionAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteExtensionAssociationResult> deleteExtensionAssociationAsync(final DeleteExtensionAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteExtensionAssociationRequest, DeleteExtensionAssociationResult> asyncHandler) {
        final DeleteExtensionAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteExtensionAssociationResult>() {
            @Override
            public DeleteExtensionAssociationResult call() throws Exception {
                DeleteExtensionAssociationResult result = null;

                try {
                    result = executeDeleteExtensionAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteHostedConfigurationVersionResult> deleteHostedConfigurationVersionAsync(
            DeleteHostedConfigurationVersionRequest request) {

        return deleteHostedConfigurationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHostedConfigurationVersionResult> deleteHostedConfigurationVersionAsync(
            final DeleteHostedConfigurationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHostedConfigurationVersionRequest, DeleteHostedConfigurationVersionResult> asyncHandler) {
        final DeleteHostedConfigurationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteHostedConfigurationVersionResult>() {
            @Override
            public DeleteHostedConfigurationVersionResult call() throws Exception {
                DeleteHostedConfigurationVersionResult result = null;

                try {
                    result = executeDeleteHostedConfigurationVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest request) {

        return getApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(final GetApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler) {
        final GetApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApplicationResult>() {
            @Override
            public GetApplicationResult call() throws Exception {
                GetApplicationResult result = null;

                try {
                    result = executeGetApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<GetConfigurationResult> getConfigurationAsync(GetConfigurationRequest request) {

        return getConfigurationAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<GetConfigurationResult> getConfigurationAsync(final GetConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfigurationRequest, GetConfigurationResult> asyncHandler) {
        final GetConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfigurationResult>() {
            @Override
            public GetConfigurationResult call() throws Exception {
                GetConfigurationResult result = null;

                try {
                    result = executeGetConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationProfileResult> getConfigurationProfileAsync(GetConfigurationProfileRequest request) {

        return getConfigurationProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationProfileResult> getConfigurationProfileAsync(final GetConfigurationProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfigurationProfileRequest, GetConfigurationProfileResult> asyncHandler) {
        final GetConfigurationProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfigurationProfileResult>() {
            @Override
            public GetConfigurationProfileResult call() throws Exception {
                GetConfigurationProfileResult result = null;

                try {
                    result = executeGetConfigurationProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest request) {

        return getDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(final GetDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler) {
        final GetDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentResult>() {
            @Override
            public GetDeploymentResult call() throws Exception {
                GetDeploymentResult result = null;

                try {
                    result = executeGetDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentStrategyResult> getDeploymentStrategyAsync(GetDeploymentStrategyRequest request) {

        return getDeploymentStrategyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentStrategyResult> getDeploymentStrategyAsync(final GetDeploymentStrategyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentStrategyRequest, GetDeploymentStrategyResult> asyncHandler) {
        final GetDeploymentStrategyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentStrategyResult>() {
            @Override
            public GetDeploymentStrategyResult call() throws Exception {
                GetDeploymentStrategyResult result = null;

                try {
                    result = executeGetDeploymentStrategy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest request) {

        return getEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(final GetEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnvironmentRequest, GetEnvironmentResult> asyncHandler) {
        final GetEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnvironmentResult>() {
            @Override
            public GetEnvironmentResult call() throws Exception {
                GetEnvironmentResult result = null;

                try {
                    result = executeGetEnvironment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetExtensionResult> getExtensionAsync(GetExtensionRequest request) {

        return getExtensionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExtensionResult> getExtensionAsync(final GetExtensionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExtensionRequest, GetExtensionResult> asyncHandler) {
        final GetExtensionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExtensionResult>() {
            @Override
            public GetExtensionResult call() throws Exception {
                GetExtensionResult result = null;

                try {
                    result = executeGetExtension(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetExtensionAssociationResult> getExtensionAssociationAsync(GetExtensionAssociationRequest request) {

        return getExtensionAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetExtensionAssociationResult> getExtensionAssociationAsync(final GetExtensionAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetExtensionAssociationRequest, GetExtensionAssociationResult> asyncHandler) {
        final GetExtensionAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetExtensionAssociationResult>() {
            @Override
            public GetExtensionAssociationResult call() throws Exception {
                GetExtensionAssociationResult result = null;

                try {
                    result = executeGetExtensionAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetHostedConfigurationVersionResult> getHostedConfigurationVersionAsync(GetHostedConfigurationVersionRequest request) {

        return getHostedConfigurationVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHostedConfigurationVersionResult> getHostedConfigurationVersionAsync(
            final GetHostedConfigurationVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHostedConfigurationVersionRequest, GetHostedConfigurationVersionResult> asyncHandler) {
        final GetHostedConfigurationVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHostedConfigurationVersionResult>() {
            @Override
            public GetHostedConfigurationVersionResult call() throws Exception {
                GetHostedConfigurationVersionResult result = null;

                try {
                    result = executeGetHostedConfigurationVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest request) {

        return listApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(final ListApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler) {
        final ListApplicationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApplicationsResult>() {
            @Override
            public ListApplicationsResult call() throws Exception {
                ListApplicationsResult result = null;

                try {
                    result = executeListApplications(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationProfilesResult> listConfigurationProfilesAsync(ListConfigurationProfilesRequest request) {

        return listConfigurationProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationProfilesResult> listConfigurationProfilesAsync(final ListConfigurationProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfigurationProfilesRequest, ListConfigurationProfilesResult> asyncHandler) {
        final ListConfigurationProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConfigurationProfilesResult>() {
            @Override
            public ListConfigurationProfilesResult call() throws Exception {
                ListConfigurationProfilesResult result = null;

                try {
                    result = executeListConfigurationProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentStrategiesResult> listDeploymentStrategiesAsync(ListDeploymentStrategiesRequest request) {

        return listDeploymentStrategiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentStrategiesResult> listDeploymentStrategiesAsync(final ListDeploymentStrategiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentStrategiesRequest, ListDeploymentStrategiesResult> asyncHandler) {
        final ListDeploymentStrategiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentStrategiesResult>() {
            @Override
            public ListDeploymentStrategiesResult call() throws Exception {
                ListDeploymentStrategiesResult result = null;

                try {
                    result = executeListDeploymentStrategies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest request) {

        return listDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(final ListDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler) {
        final ListDeploymentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeploymentsResult>() {
            @Override
            public ListDeploymentsResult call() throws Exception {
                ListDeploymentsResult result = null;

                try {
                    result = executeListDeployments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest request) {

        return listEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(final ListEnvironmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler) {
        final ListEnvironmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnvironmentsResult>() {
            @Override
            public ListEnvironmentsResult call() throws Exception {
                ListEnvironmentsResult result = null;

                try {
                    result = executeListEnvironments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListExtensionAssociationsResult> listExtensionAssociationsAsync(ListExtensionAssociationsRequest request) {

        return listExtensionAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExtensionAssociationsResult> listExtensionAssociationsAsync(final ListExtensionAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExtensionAssociationsRequest, ListExtensionAssociationsResult> asyncHandler) {
        final ListExtensionAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExtensionAssociationsResult>() {
            @Override
            public ListExtensionAssociationsResult call() throws Exception {
                ListExtensionAssociationsResult result = null;

                try {
                    result = executeListExtensionAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListExtensionsResult> listExtensionsAsync(ListExtensionsRequest request) {

        return listExtensionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListExtensionsResult> listExtensionsAsync(final ListExtensionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListExtensionsRequest, ListExtensionsResult> asyncHandler) {
        final ListExtensionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListExtensionsResult>() {
            @Override
            public ListExtensionsResult call() throws Exception {
                ListExtensionsResult result = null;

                try {
                    result = executeListExtensions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListHostedConfigurationVersionsResult> listHostedConfigurationVersionsAsync(
            ListHostedConfigurationVersionsRequest request) {

        return listHostedConfigurationVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHostedConfigurationVersionsResult> listHostedConfigurationVersionsAsync(
            final ListHostedConfigurationVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHostedConfigurationVersionsRequest, ListHostedConfigurationVersionsResult> asyncHandler) {
        final ListHostedConfigurationVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHostedConfigurationVersionsResult>() {
            @Override
            public ListHostedConfigurationVersionsResult call() throws Exception {
                ListHostedConfigurationVersionsResult result = null;

                try {
                    result = executeListHostedConfigurationVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartDeploymentResult> startDeploymentAsync(StartDeploymentRequest request) {

        return startDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDeploymentResult> startDeploymentAsync(final StartDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDeploymentRequest, StartDeploymentResult> asyncHandler) {
        final StartDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDeploymentResult>() {
            @Override
            public StartDeploymentResult call() throws Exception {
                StartDeploymentResult result = null;

                try {
                    result = executeStartDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopDeploymentResult> stopDeploymentAsync(StopDeploymentRequest request) {

        return stopDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopDeploymentResult> stopDeploymentAsync(final StopDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopDeploymentRequest, StopDeploymentResult> asyncHandler) {
        final StopDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopDeploymentResult>() {
            @Override
            public StopDeploymentResult call() throws Exception {
                StopDeploymentResult result = null;

                try {
                    result = executeStopDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest request) {

        return updateApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(final UpdateApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler) {
        final UpdateApplicationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApplicationResult>() {
            @Override
            public UpdateApplicationResult call() throws Exception {
                UpdateApplicationResult result = null;

                try {
                    result = executeUpdateApplication(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationProfileResult> updateConfigurationProfileAsync(UpdateConfigurationProfileRequest request) {

        return updateConfigurationProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationProfileResult> updateConfigurationProfileAsync(final UpdateConfigurationProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfigurationProfileRequest, UpdateConfigurationProfileResult> asyncHandler) {
        final UpdateConfigurationProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfigurationProfileResult>() {
            @Override
            public UpdateConfigurationProfileResult call() throws Exception {
                UpdateConfigurationProfileResult result = null;

                try {
                    result = executeUpdateConfigurationProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentStrategyResult> updateDeploymentStrategyAsync(UpdateDeploymentStrategyRequest request) {

        return updateDeploymentStrategyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentStrategyResult> updateDeploymentStrategyAsync(final UpdateDeploymentStrategyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeploymentStrategyRequest, UpdateDeploymentStrategyResult> asyncHandler) {
        final UpdateDeploymentStrategyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDeploymentStrategyResult>() {
            @Override
            public UpdateDeploymentStrategyResult call() throws Exception {
                UpdateDeploymentStrategyResult result = null;

                try {
                    result = executeUpdateDeploymentStrategy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest request) {

        return updateEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(final UpdateEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler) {
        final UpdateEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEnvironmentResult>() {
            @Override
            public UpdateEnvironmentResult call() throws Exception {
                UpdateEnvironmentResult result = null;

                try {
                    result = executeUpdateEnvironment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateExtensionResult> updateExtensionAsync(UpdateExtensionRequest request) {

        return updateExtensionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateExtensionResult> updateExtensionAsync(final UpdateExtensionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateExtensionRequest, UpdateExtensionResult> asyncHandler) {
        final UpdateExtensionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateExtensionResult>() {
            @Override
            public UpdateExtensionResult call() throws Exception {
                UpdateExtensionResult result = null;

                try {
                    result = executeUpdateExtension(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateExtensionAssociationResult> updateExtensionAssociationAsync(UpdateExtensionAssociationRequest request) {

        return updateExtensionAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateExtensionAssociationResult> updateExtensionAssociationAsync(final UpdateExtensionAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateExtensionAssociationRequest, UpdateExtensionAssociationResult> asyncHandler) {
        final UpdateExtensionAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateExtensionAssociationResult>() {
            @Override
            public UpdateExtensionAssociationResult call() throws Exception {
                UpdateExtensionAssociationResult result = null;

                try {
                    result = executeUpdateExtensionAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ValidateConfigurationResult> validateConfigurationAsync(ValidateConfigurationRequest request) {

        return validateConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidateConfigurationResult> validateConfigurationAsync(final ValidateConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ValidateConfigurationRequest, ValidateConfigurationResult> asyncHandler) {
        final ValidateConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ValidateConfigurationResult>() {
            @Override
            public ValidateConfigurationResult call() throws Exception {
                ValidateConfigurationResult result = null;

                try {
                    result = executeValidateConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
