/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <fullname>AWS AppConfig</fullname>
 * <p>
 * Use AWS AppConfig, a capability of AWS Systems Manager, to create, manage, and quickly deploy application
 * configurations. AppConfig supports controlled deployments to applications of any size and includes built-in
 * validation checks and monitoring. You can use AppConfig with applications hosted on Amazon EC2 instances, AWS Lambda,
 * containers, mobile applications, or IoT devices.
 * </p>
 * <p>
 * To prevent errors when deploying application configurations, especially for production systems where a simple typo
 * could cause an unexpected outage, AppConfig includes validators. A validator provides a syntactic or semantic check
 * to ensure that the configuration you want to deploy works as intended. To validate your application configuration
 * data, you provide a schema or a Lambda function that runs against the configuration. The configuration deployment or
 * update can only proceed when the configuration data is valid.
 * </p>
 * <p>
 * During a configuration deployment, AppConfig monitors the application to ensure that the deployment is successful. If
 * the system encounters an error, AppConfig rolls back the change to minimize impact for your application users. You
 * can configure a deployment strategy for each application or environment that includes deployment criteria, including
 * velocity, bake time, and alarms to monitor. Similar to error monitoring, if a deployment triggers an alarm, AppConfig
 * automatically rolls back to the previous version.
 * </p>
 * <p>
 * AppConfig supports multiple use cases. Here are some examples.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Application tuning</b>: Use AppConfig to carefully introduce changes to your application that can only be tested
 * with production traffic.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Feature toggle</b>: Use AppConfig to turn on new features that require a timely deployment, such as a product
 * launch or announcement.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>User membership</b>: Use AppConfig to allow premium subscribers to access paid content.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Operational issues</b>: Use AppConfig to reduce stress on your application when a dependency or other external
 * factor impacts the system.
 * </p>
 * </li>
 * </ul>
 * <p>
 * This reference is intended to be used with the <a
 * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig.html">AWS AppConfig User Guide</a>.
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
     * An application in AppConfig is a logical unit of code that provides capabilities for your customers. For example,
     * an application can be a microservice that runs on Amazon EC2 instances, a mobile application installed by your
     * users, a serverless application using Amazon API Gateway and AWS Lambda, or any system you run on behalf of
     * others.
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Information that enables AppConfig to access the configuration source. Valid configuration sources include
     * Systems Manager (SSM) documents and SSM Parameter Store parameters. A configuration profile includes the
     * following information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Uri location of the configuration data.
     * </p>
     * </li>
     * <li>
     * <p>
     * The AWS Identity and Access Management (IAM) role that provides access to the configuration data.
     * </p>
     * </li>
     * <li>
     * <p>
     * A validator for the configuration data. Available validators include either a JSON Schema or an AWS Lambda
     * function.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createConfigurationProfileRequest
     * @return Result of the CreateConfigurationProfile operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @sample AmazonAppConfig.CreateConfigurationProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateConfigurationProfile"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConfigurationProfileResult createConfigurationProfile(CreateConfigurationProfileRequest createConfigurationProfileRequest);

    /**
     * <p>
     * A deployment strategy defines important criteria for rolling out your configuration to the designated targets. A
     * deployment strategy includes: the overall duration required, a percentage of targets to receive the deployment
     * during each interval, an algorithm that defines how percentage grows, and bake time.
     * </p>
     * 
     * @param createDeploymentStrategyRequest
     * @return Result of the CreateDeploymentStrategy operation returned by the service.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.CreateDeploymentStrategy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateDeploymentStrategy"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDeploymentStrategyResult createDeploymentStrategy(CreateDeploymentStrategyRequest createDeploymentStrategyRequest);

    /**
     * <p>
     * For each application, you define one or more environments. An environment is a logical deployment group of
     * AppConfig targets, such as applications in a <code>Beta</code> or <code>Production</code> environment. You can
     * also define environments for application subcomponents such as the <code>Web</code>, <code>Mobile</code> and
     * <code>Back-end</code> components for your application. You can configure Amazon CloudWatch alarms for each
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
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Delete an application. Deleting an application does not delete a configuration from a host.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Delete a configuration profile. Deleting a configuration profile does not delete a configuration from a host.
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
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.DeleteConfigurationProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteConfigurationProfile"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfigurationProfileResult deleteConfigurationProfile(DeleteConfigurationProfileRequest deleteConfigurationProfileRequest);

    /**
     * <p>
     * Delete a deployment strategy. Deleting a deployment strategy does not delete a configuration from a host.
     * </p>
     * 
     * @param deleteDeploymentStrategyRequest
     * @return Result of the DeleteDeploymentStrategy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.DeleteDeploymentStrategy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteDeploymentStrategy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDeploymentStrategyResult deleteDeploymentStrategy(DeleteDeploymentStrategyRequest deleteDeploymentStrategyRequest);

    /**
     * <p>
     * Delete an environment. Deleting an environment does not delete a configuration from a host.
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
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Retrieve information about an application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Retrieve information about a configuration.
     * </p>
     * 
     * @param getConfigurationRequest
     * @return Result of the GetConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.GetConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    GetConfigurationResult getConfiguration(GetConfigurationRequest getConfigurationRequest);

    /**
     * <p>
     * Retrieve information about a configuration profile.
     * </p>
     * 
     * @param getConfigurationProfileRequest
     * @return Result of the GetConfigurationProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.GetConfigurationProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetConfigurationProfile"
     *      target="_top">AWS API Documentation</a>
     */
    GetConfigurationProfileResult getConfigurationProfile(GetConfigurationProfileRequest getConfigurationProfileRequest);

    /**
     * <p>
     * Retrieve information about a configuration deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return Result of the GetDeployment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    GetDeploymentResult getDeployment(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Retrieve information about a deployment strategy. A deployment strategy defines important criteria for rolling
     * out your configuration to the designated targets. A deployment strategy includes: the overall duration required,
     * a percentage of targets to receive the deployment during each interval, an algorithm that defines how percentage
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
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.GetDeploymentStrategy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetDeploymentStrategy"
     *      target="_top">AWS API Documentation</a>
     */
    GetDeploymentStrategyResult getDeploymentStrategy(GetDeploymentStrategyRequest getDeploymentStrategyRequest);

    /**
     * <p>
     * Retrieve information about an environment. An environment is a logical deployment group of AppConfig
     * applications, such as applications in a <code>Production</code> environment or in an <code>EU_Region</code>
     * environment. Each configuration deployment targets an environment. You can enable one or more Amazon CloudWatch
     * alarms for an environment. If an alarm is triggered during a deployment, AppConfig roles back the configuration.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return Result of the GetEnvironment operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    GetEnvironmentResult getEnvironment(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * List all applications in your AWS account.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
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
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.ListConfigurationProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListConfigurationProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    ListConfigurationProfilesResult listConfigurationProfiles(ListConfigurationProfilesRequest listConfigurationProfilesRequest);

    /**
     * <p>
     * List deployment strategies.
     * </p>
     * 
     * @param listDeploymentStrategiesRequest
     * @return Result of the ListDeploymentStrategies operation returned by the service.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.ListDeploymentStrategies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListDeploymentStrategies"
     *      target="_top">AWS API Documentation</a>
     */
    ListDeploymentStrategiesResult listDeploymentStrategies(ListDeploymentStrategiesRequest listDeploymentStrategiesRequest);

    /**
     * <p>
     * Lists the deployments for an environment.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @return Result of the ListDeployments operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListDeployments" target="_top">AWS API
     *      Documentation</a>
     */
    ListDeploymentsResult listDeployments(ListDeploymentsRequest listDeploymentsRequest);

    /**
     * <p>
     * List the environments for an application.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws InternalServerException
     *         There was an internal failure in the AppConfig service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest listEnvironmentsRequest);

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
     *         The input fails to satisfy the constraints specified by an AWS service.
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
     *         The input fails to satisfy the constraints specified by an AWS service.
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
     *         The input fails to satisfy the constraints specified by an AWS service.
     * @sample AmazonAppConfig.StopDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/StopDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    StopDeploymentResult stopDeployment(StopDeploymentRequest stopDeploymentRequest);

    /**
     * <p>
     * Metadata to assign to an AppConfig resource. Tags help organize and categorize your AppConfig resources. Each tag
     * consists of a key and an optional value, both of which you define. You can specify a maximum of 50 tags for a
     * resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The requested resource could not be found.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
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
     *         The input fails to satisfy the constraints specified by an AWS service.
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
     *         The input fails to satisfy the constraints specified by an AWS service.
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
     *         The input fails to satisfy the constraints specified by an AWS service.
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
     *         The input fails to satisfy the constraints specified by an AWS service.
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
     *         The input fails to satisfy the constraints specified by an AWS service.
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
     * Uses the validators in a configuration profile to validate a configuration.
     * </p>
     * 
     * @param validateConfigurationRequest
     * @return Result of the ValidateConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The input fails to satisfy the constraints specified by an AWS service.
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
