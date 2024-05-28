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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.appconfig.model.*;

/**
 * Interface for accessing AppConfig.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appconfig.AbstractAmazonAppConfig} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAppConfig {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "appconfig";

    /**
     * <p>
     * Creates an application. In AppConfig, an application is simply an organizational construct like a folder. This
     * organizational construct has a relationship with some unit of executable code. For example, you could create an
     * application called MyMobileApp to organize and manage configuration data for a mobile application installed by
     * your users.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ServiceQuotaExceededException
     *         The number of one more AppConfig resources exceeds the maximum allowed. Verify that your environment
     *         doesn't exceed the following service quotas:</p>
     *         <p>
     *         Applications: 100 max
     *         </p>
     *         <p>
     *         Deployment strategies: 20 max
     *         </p>
     *         <p>
     *         Configuration profiles: 100 max per application
     *         </p>
     *         <p>
     *         Environments: 20 max per application
     *         </p>
     *         <p>
     *         To resolve this issue, you can delete one or more resources and try again. Or, you can request a quota
     *         increase. For more information about quotas and to request an increase, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/appconfig.html#limits_appconfig">Service quotas for
     *         AppConfig</a> in the Amazon Web Services General Reference.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates a configuration profile, which is information that enables AppConfig to access the configuration source.
     * Valid configuration sources include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Configuration data in YAML, JSON, and other formats stored in the AppConfig hosted configuration store
     * </p>
     * </li>
     * <li>
     * <p>
     * Configuration data stored as objects in an Amazon Simple Storage Service (Amazon S3) bucket
     * </p>
     * </li>
     * <li>
     * <p>
     * Pipelines stored in CodePipeline
     * </p>
     * </li>
     * <li>
     * <p>
     * Secrets stored in Secrets Manager
     * </p>
     * </li>
     * <li>
     * <p>
     * Standard and secure string parameters stored in Amazon Web Services Systems Manager Parameter Store
     * </p>
     * </li>
     * <li>
     * <p>
     * Configuration data in SSM documents stored in the Systems Manager document store
     * </p>
     * </li>
     * </ul>
     * <p>
     * A configuration profile includes the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The URI location of the configuration data.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Identity and Access Management (IAM) role that provides access to the configuration data.
     * </p>
     * </li>
     * <li>
     * <p>
     * A validator for the configuration data. Available validators include either a JSON Schema or an Amazon Web
     * Services Lambda function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-configuration-and-profile.html"
     * >Create a Configuration and a Configuration Profile</a> in the <i>AppConfig User Guide</i>.
     * </p>
     * 
     * @param createConfigurationProfileRequest
     * @return Result of the CreateConfigurationProfile operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws ServiceQuotaExceededException
     *         The number of one more AppConfig resources exceeds the maximum allowed. Verify that your environment
     *         doesn't exceed the following service quotas:</p>
     *         <p>
     *         Applications: 100 max
     *         </p>
     *         <p>
     *         Deployment strategies: 20 max
     *         </p>
     *         <p>
     *         Configuration profiles: 100 max per application
     *         </p>
     *         <p>
     *         Environments: 20 max per application
     *         </p>
     *         <p>
     *         To resolve this issue, you can delete one or more resources and try again. Or, you can request a quota
     *         increase. For more information about quotas and to request an increase, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/appconfig.html#limits_appconfig">Service quotas for
     *         AppConfig</a> in the Amazon Web Services General Reference.
     * @sample AmazonAppConfig.CreateConfigurationProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateConfigurationProfile"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfigurationProfileResult createConfigurationProfile(CreateConfigurationProfileRequest createConfigurationProfileRequest);

    /**
     * <p>
     * Creates a deployment strategy that defines important criteria for rolling out your configuration to the
     * designated targets. A deployment strategy includes the overall duration required, a percentage of targets to
     * receive the deployment during each interval, an algorithm that defines how percentage grows, and bake time.
     * </p>
     * 
     * @param createDeploymentStrategyRequest
     * @return Result of the CreateDeploymentStrategy operation returned by the service.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws ServiceQuotaExceededException
     *         The number of one more AppConfig resources exceeds the maximum allowed. Verify that your environment
     *         doesn't exceed the following service quotas:</p>
     *         <p>
     *         Applications: 100 max
     *         </p>
     *         <p>
     *         Deployment strategies: 20 max
     *         </p>
     *         <p>
     *         Configuration profiles: 100 max per application
     *         </p>
     *         <p>
     *         Environments: 20 max per application
     *         </p>
     *         <p>
     *         To resolve this issue, you can delete one or more resources and try again. Or, you can request a quota
     *         increase. For more information about quotas and to request an increase, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/appconfig.html#limits_appconfig">Service quotas for
     *         AppConfig</a> in the Amazon Web Services General Reference.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.CreateDeploymentStrategy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateDeploymentStrategy"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDeploymentStrategyResult createDeploymentStrategy(CreateDeploymentStrategyRequest createDeploymentStrategyRequest);

    /**
     * <p>
     * Creates an environment. For each application, you define one or more environments. An environment is a deployment
     * group of AppConfig targets, such as applications in a <code>Beta</code> or <code>Production</code> environment.
     * You can also define environments for application subcomponents such as the <code>Web</code>, <code>Mobile</code>
     * and <code>Back-end</code> components for your application. You can configure Amazon CloudWatch alarms for each
     * environment. The system monitors alarms during a configuration deployment. If an alarm is triggered, the system
     * rolls back the configuration.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return Result of the CreateEnvironment operation returned by the service.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ServiceQuotaExceededException
     *         The number of one more AppConfig resources exceeds the maximum allowed. Verify that your environment
     *         doesn't exceed the following service quotas:</p>
     *         <p>
     *         Applications: 100 max
     *         </p>
     *         <p>
     *         Deployment strategies: 20 max
     *         </p>
     *         <p>
     *         Configuration profiles: 100 max per application
     *         </p>
     *         <p>
     *         Environments: 20 max per application
     *         </p>
     *         <p>
     *         To resolve this issue, you can delete one or more resources and try again. Or, you can request a quota
     *         increase. For more information about quotas and to request an increase, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/appconfig.html#limits_appconfig">Service quotas for
     *         AppConfig</a> in the Amazon Web Services General Reference.
     * @sample AmazonAppConfig.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Creates an AppConfig extension. An extension augments your ability to inject logic or behavior at different
     * points during the AppConfig workflow of creating or deploying a configuration.
     * </p>
     * <p>
     * You can create your own extensions or use the Amazon Web Services authored extensions provided by AppConfig. For
     * an AppConfig extension that uses Lambda, you must create a Lambda function to perform any computation and
     * processing defined in the extension. If you plan to create custom versions of the Amazon Web Services authored
     * notification extensions, you only need to specify an Amazon Resource Name (ARN) in the <code>Uri</code> field for
     * the new extension version.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a custom EventBridge notification extension, enter the ARN of the EventBridge default events in the
     * <code>Uri</code> field.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a custom Amazon SNS notification extension, enter the ARN of an Amazon SNS topic in the <code>Uri</code>
     * field.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a custom Amazon SQS notification extension, enter the ARN of an Amazon SQS message queue in the
     * <code>Uri</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about extensions, see <a
     * href="https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html">Extending
     * workflows</a> in the <i>AppConfig User Guide</i>.
     * </p>
     * 
     * @param createExtensionRequest
     * @return Result of the CreateExtension operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ServiceQuotaExceededException
     *         The number of one more AppConfig resources exceeds the maximum allowed. Verify that your environment
     *         doesn't exceed the following service quotas:</p>
     *         <p>
     *         Applications: 100 max
     *         </p>
     *         <p>
     *         Deployment strategies: 20 max
     *         </p>
     *         <p>
     *         Configuration profiles: 100 max per application
     *         </p>
     *         <p>
     *         Environments: 20 max per application
     *         </p>
     *         <p>
     *         To resolve this issue, you can delete one or more resources and try again. Or, you can request a quota
     *         increase. For more information about quotas and to request an increase, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/appconfig.html#limits_appconfig">Service quotas for
     *         AppConfig</a> in the Amazon Web Services General Reference.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.CreateExtension
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateExtension" target="_top">AWS API
     *      Documentation</a>
     */
    CreateExtensionResult createExtension(CreateExtensionRequest createExtensionRequest);

    /**
     * <p>
     * When you create an extension or configure an Amazon Web Services authored extension, you associate the extension
     * with an AppConfig application, environment, or configuration profile. For example, you can choose to run the
     * <code>AppConfig deployment events to Amazon SNS</code> Amazon Web Services authored extension and receive
     * notifications on an Amazon SNS topic anytime a configuration deployment is started for a specific application.
     * Defining which extension to associate with an AppConfig resource is called an <i>extension association</i>. An
     * extension association is a specified relationship between an extension and an AppConfig resource, such as an
     * application or a configuration profile. For more information about extensions and associations, see <a
     * href="https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html">Extending
     * workflows</a> in the <i>AppConfig User Guide</i>.
     * </p>
     * 
     * @param createExtensionAssociationRequest
     * @return Result of the CreateExtensionAssociation operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws ServiceQuotaExceededException
     *         The number of one more AppConfig resources exceeds the maximum allowed. Verify that your environment
     *         doesn't exceed the following service quotas:</p>
     *         <p>
     *         Applications: 100 max
     *         </p>
     *         <p>
     *         Deployment strategies: 20 max
     *         </p>
     *         <p>
     *         Configuration profiles: 100 max per application
     *         </p>
     *         <p>
     *         Environments: 20 max per application
     *         </p>
     *         <p>
     *         To resolve this issue, you can delete one or more resources and try again. Or, you can request a quota
     *         increase. For more information about quotas and to request an increase, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/appconfig.html#limits_appconfig">Service quotas for
     *         AppConfig</a> in the Amazon Web Services General Reference.
     * @sample AmazonAppConfig.CreateExtensionAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateExtensionAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateExtensionAssociationResult createExtensionAssociation(CreateExtensionAssociationRequest createExtensionAssociationRequest);

    /**
     * <p>
     * Creates a new configuration in the AppConfig hosted configuration store.
     * </p>
     * 
     * @param createHostedConfigurationVersionRequest
     * @return Result of the CreateHostedConfigurationVersion operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ServiceQuotaExceededException
     *         The number of one more AppConfig resources exceeds the maximum allowed. Verify that your environment
     *         doesn't exceed the following service quotas:</p>
     *         <p>
     *         Applications: 100 max
     *         </p>
     *         <p>
     *         Deployment strategies: 20 max
     *         </p>
     *         <p>
     *         Configuration profiles: 100 max per application
     *         </p>
     *         <p>
     *         Environments: 20 max per application
     *         </p>
     *         <p>
     *         To resolve this issue, you can delete one or more resources and try again. Or, you can request a quota
     *         increase. For more information about quotas and to request an increase, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/appconfig.html#limits_appconfig">Service quotas for
     *         AppConfig</a> in the Amazon Web Services General Reference.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws PayloadTooLargeException
     *         The configuration size is too large.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.CreateHostedConfigurationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateHostedConfigurationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateHostedConfigurationVersionResult createHostedConfigurationVersion(CreateHostedConfigurationVersionRequest createHostedConfigurationVersionRequest);

    /**
     * <p>
     * Deletes an application. Deleting an application does not delete a configuration from a host.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes a configuration profile. Deleting a configuration profile does not delete a configuration from a host.
     * </p>
     * 
     * @param deleteConfigurationProfileRequest
     * @return Result of the DeleteConfigurationProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.DeleteConfigurationProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteConfigurationProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfigurationProfileResult deleteConfigurationProfile(DeleteConfigurationProfileRequest deleteConfigurationProfileRequest);

    /**
     * <p>
     * Deletes a deployment strategy. Deleting a deployment strategy does not delete a configuration from a host.
     * </p>
     * 
     * @param deleteDeploymentStrategyRequest
     * @return Result of the DeleteDeploymentStrategy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.DeleteDeploymentStrategy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteDeploymentStrategy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDeploymentStrategyResult deleteDeploymentStrategy(DeleteDeploymentStrategyRequest deleteDeploymentStrategyRequest);

    /**
     * <p>
     * Deletes an environment. Deleting an environment does not delete a configuration from a host.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return Result of the DeleteEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Deletes an AppConfig extension. You must delete all associations to an extension before you delete the extension.
     * </p>
     * 
     * @param deleteExtensionRequest
     * @return Result of the DeleteExtension operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.DeleteExtension
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteExtension" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteExtensionResult deleteExtension(DeleteExtensionRequest deleteExtensionRequest);

    /**
     * <p>
     * Deletes an extension association. This action doesn't delete extensions defined in the association.
     * </p>
     * 
     * @param deleteExtensionAssociationRequest
     * @return Result of the DeleteExtensionAssociation operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.DeleteExtensionAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteExtensionAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteExtensionAssociationResult deleteExtensionAssociation(DeleteExtensionAssociationRequest deleteExtensionAssociationRequest);

    /**
     * <p>
     * Deletes a version of a configuration from the AppConfig hosted configuration store.
     * </p>
     * 
     * @param deleteHostedConfigurationVersionRequest
     * @return Result of the DeleteHostedConfigurationVersion operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.DeleteHostedConfigurationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteHostedConfigurationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteHostedConfigurationVersionResult deleteHostedConfigurationVersion(DeleteHostedConfigurationVersionRequest deleteHostedConfigurationVersionRequest);

    /**
     * <p>
     * Retrieves information about an application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * (Deprecated) Retrieves the latest deployed configuration.
     * </p>
     * <important>
     * <p>
     * Note the following important information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * This API action is deprecated. Calls to receive configuration data should use the <a href=
     * "https://docs.aws.amazon.com/appconfig/2019-10-09/APIReference/API_appconfigdata_StartConfigurationSession.html"
     * >StartConfigurationSession</a> and <a href=
     * "https://docs.aws.amazon.com/appconfig/2019-10-09/APIReference/API_appconfigdata_GetLatestConfiguration.html"
     * >GetLatestConfiguration</a> APIs instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetConfiguration</code> is a priced call. For more information, see <a
     * href="https://aws.amazon.com/systems-manager/pricing/">Pricing</a>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param getConfigurationRequest
     * @return Result of the GetConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.GetConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    GetConfigurationResult getConfiguration(GetConfigurationRequest getConfigurationRequest);

    /**
     * <p>
     * Retrieves information about a configuration profile.
     * </p>
     * 
     * @param getConfigurationProfileRequest
     * @return Result of the GetConfigurationProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.GetConfigurationProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetConfigurationProfile"
     *      target="_top">AWS API Documentation</a>
     */
    GetConfigurationProfileResult getConfigurationProfile(GetConfigurationProfileRequest getConfigurationProfileRequest);

    /**
     * <p>
     * Retrieves information about a configuration deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return Result of the GetDeployment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Retrieves information about a deployment strategy. A deployment strategy defines important criteria for rolling
     * out your configuration to the designated targets. A deployment strategy includes the overall duration required, a
     * percentage of targets to receive the deployment during each interval, an algorithm that defines how percentage
     * grows, and bake time.
     * </p>
     * 
     * @param getDeploymentStrategyRequest
     * @return Result of the GetDeploymentStrategy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.GetDeploymentStrategy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetDeploymentStrategy"
     *      target="_top">AWS API Documentation</a>
     */
    GetDeploymentStrategyResult getDeploymentStrategy(GetDeploymentStrategyRequest getDeploymentStrategyRequest);

    /**
     * <p>
     * Retrieves information about an environment. An environment is a deployment group of AppConfig applications, such
     * as applications in a <code>Production</code> environment or in an <code>EU_Region</code> environment. Each
     * configuration deployment targets an environment. You can enable one or more Amazon CloudWatch alarms for an
     * environment. If an alarm is triggered during a deployment, AppConfig roles back the configuration.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return Result of the GetEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    GetEnvironmentResult getEnvironment(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * Returns information about an AppConfig extension.
     * </p>
     * 
     * @param getExtensionRequest
     * @return Result of the GetExtension operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.GetExtension
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetExtension" target="_top">AWS API
     *      Documentation</a>
     */
    GetExtensionResult getExtension(GetExtensionRequest getExtensionRequest);

    /**
     * <p>
     * Returns information about an AppConfig extension association. For more information about extensions and
     * associations, see <a
     * href="https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html">Extending
     * workflows</a> in the <i>AppConfig User Guide</i>.
     * </p>
     * 
     * @param getExtensionAssociationRequest
     * @return Result of the GetExtensionAssociation operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.GetExtensionAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetExtensionAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    GetExtensionAssociationResult getExtensionAssociation(GetExtensionAssociationRequest getExtensionAssociationRequest);

    /**
     * <p>
     * Retrieves information about a specific configuration version.
     * </p>
     * 
     * @param getHostedConfigurationVersionRequest
     * @return Result of the GetHostedConfigurationVersion operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.GetHostedConfigurationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetHostedConfigurationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    GetHostedConfigurationVersionResult getHostedConfigurationVersion(GetHostedConfigurationVersionRequest getHostedConfigurationVersionRequest);

    /**
     * <p>
     * Lists all applications in your Amazon Web Services account.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists the configuration profiles for an application.
     * </p>
     * 
     * @param listConfigurationProfilesRequest
     * @return Result of the ListConfigurationProfiles operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.ListConfigurationProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListConfigurationProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    ListConfigurationProfilesResult listConfigurationProfiles(ListConfigurationProfilesRequest listConfigurationProfilesRequest);

    /**
     * <p>
     * Lists deployment strategies.
     * </p>
     * 
     * @param listDeploymentStrategiesRequest
     * @return Result of the ListDeploymentStrategies operation returned by the service.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.ListDeploymentStrategies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListDeploymentStrategies"
     *      target="_top">AWS API Documentation</a>
     */
    ListDeploymentStrategiesResult listDeploymentStrategies(ListDeploymentStrategiesRequest listDeploymentStrategiesRequest);

    /**
     * <p>
     * Lists the deployments for an environment in descending deployment number order.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @return Result of the ListDeployments operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListDeployments" target="_top">AWS API
     *      Documentation</a>
     */
    ListDeploymentsResult listDeployments(ListDeploymentsRequest listDeploymentsRequest);

    /**
     * <p>
     * Lists the environments for an application.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * Lists all AppConfig extension associations in the account. For more information about extensions and
     * associations, see <a
     * href="https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html">Extending
     * workflows</a> in the <i>AppConfig User Guide</i>.
     * </p>
     * 
     * @param listExtensionAssociationsRequest
     * @return Result of the ListExtensionAssociations operation returned by the service.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.ListExtensionAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListExtensionAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListExtensionAssociationsResult listExtensionAssociations(ListExtensionAssociationsRequest listExtensionAssociationsRequest);

    /**
     * <p>
     * Lists all custom and Amazon Web Services authored AppConfig extensions in the account. For more information about
     * extensions, see <a
     * href="https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html">Extending
     * workflows</a> in the <i>AppConfig User Guide</i>.
     * </p>
     * 
     * @param listExtensionsRequest
     * @return Result of the ListExtensions operation returned by the service.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.ListExtensions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListExtensions" target="_top">AWS API
     *      Documentation</a>
     */
    ListExtensionsResult listExtensions(ListExtensionsRequest listExtensionsRequest);

    /**
     * <p>
     * Lists configurations stored in the AppConfig hosted configuration store by version.
     * </p>
     * 
     * @param listHostedConfigurationVersionsRequest
     * @return Result of the ListHostedConfigurationVersions operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.ListHostedConfigurationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListHostedConfigurationVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListHostedConfigurationVersionsResult listHostedConfigurationVersions(ListHostedConfigurationVersionsRequest listHostedConfigurationVersionsRequest);

    /**
     * <p>
     * Retrieves the list of key-value tags assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Starts a deployment.
     * </p>
     * 
     * @param startDeploymentRequest
     * @return Result of the StartDeployment operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.StartDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/StartDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    StartDeploymentResult startDeployment(StartDeploymentRequest startDeploymentRequest);

    /**
     * <p>
     * Stops a deployment. This API action works only on deployments that have a status of <code>DEPLOYING</code>. This
     * action moves the deployment to a status of <code>ROLLED_BACK</code>.
     * </p>
     * 
     * @param stopDeploymentRequest
     * @return Result of the StopDeployment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AmazonAppConfig.StopDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/StopDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    StopDeploymentResult stopDeployment(StopDeploymentRequest stopDeploymentRequest);

    /**
     * <p>
     * Assigns metadata to an AppConfig resource. Tags help organize and categorize your AppConfig resources. Each tag
     * consists of a key and an optional value, both of which you define. You can specify a maximum of 50 tags for a
     * resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Deletes a tag key and value from an AppConfig resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates a configuration profile.
     * </p>
     * 
     * @param updateConfigurationProfileRequest
     * @return Result of the UpdateConfigurationProfile operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.UpdateConfigurationProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateConfigurationProfile"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConfigurationProfileResult updateConfigurationProfile(UpdateConfigurationProfileRequest updateConfigurationProfileRequest);

    /**
     * <p>
     * Updates a deployment strategy.
     * </p>
     * 
     * @param updateDeploymentStrategyRequest
     * @return Result of the UpdateDeploymentStrategy operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.UpdateDeploymentStrategy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateDeploymentStrategy"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDeploymentStrategyResult updateDeploymentStrategy(UpdateDeploymentStrategyRequest updateDeploymentStrategyRequest);

    /**
     * <p>
     * Updates an environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return Result of the UpdateEnvironment operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Updates an AppConfig extension. For more information about extensions, see <a
     * href="https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html">Extending
     * workflows</a> in the <i>AppConfig User Guide</i>.
     * </p>
     * 
     * @param updateExtensionRequest
     * @return Result of the UpdateExtension operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.UpdateExtension
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateExtension" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateExtensionResult updateExtension(UpdateExtensionRequest updateExtensionRequest);

    /**
     * <p>
     * Updates an association. For more information about extensions and associations, see <a
     * href="https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html">Extending
     * workflows</a> in the <i>AppConfig User Guide</i>.
     * </p>
     * 
     * @param updateExtensionAssociationRequest
     * @return Result of the UpdateExtensionAssociation operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.UpdateExtensionAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateExtensionAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateExtensionAssociationResult updateExtensionAssociation(UpdateExtensionAssociationRequest updateExtensionAssociationRequest);

    /**
     * <p>
     * Uses the validators in a configuration profile to validate a configuration.
     * </p>
     * 
     * @param validateConfigurationRequest
     * @return Result of the ValidateConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.ValidateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ValidateConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    ValidateConfigurationResult validateConfiguration(ValidateConfigurationRequest validateConfigurationRequest);

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
