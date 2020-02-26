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
package com.amazonaws.services.sagemaker;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.services.sagemaker.waiters.AmazonSageMakerWaiters;

/**
 * Interface for accessing SageMaker.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sagemaker.AbstractAmazonSageMaker} instead.
 * </p>
 * <p>
 * <p>
 * Provides APIs for creating and managing Amazon SageMaker resources.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSageMaker {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "api.sagemaker";

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook
     * instances, training jobs, hyperparameter tuning jobs, batch transform jobs, models, labeling jobs, work teams,
     * endpoint configurations, and endpoints.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information
     * about tags, see For more information, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">AWS Tagging Strategies</a>.
     * </p>
     * <note>
     * <p>
     * Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the
     * hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter
     * tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter
     * tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you
     * first create the tuning job by specifying them in the <code>Tags</code> parameter of
     * <a>CreateHyperParameterTuningJob</a>
     * </p>
     * </note>
     * 
     * @param addTagsRequest
     * @return Result of the AddTags operation returned by the service.
     * @sample AmazonSageMaker.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    AddTagsResult addTags(AddTagsRequest addTagsRequest);

    /**
     * <p>
     * Associates a trial component with a trial. A trial component can be associated with multiple trials. To
     * disassociate a trial component from a trial, call the <a>DisassociateTrialComponent</a> API.
     * </p>
     * 
     * @param associateTrialComponentRequest
     * @return Result of the AssociateTrialComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.AssociateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AssociateTrialComponent"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateTrialComponentResult associateTrialComponent(AssociateTrialComponentRequest associateTrialComponentRequest);

    /**
     * <p>
     * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
     * </p>
     * 
     * @param createAlgorithmRequest
     * @return Result of the CreateAlgorithm operation returned by the service.
     * @sample AmazonSageMaker.CreateAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAlgorithm" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAlgorithmResult createAlgorithm(CreateAlgorithmRequest createAlgorithmRequest);

    /**
     * <p>
     * Creates a running App for the specified UserProfile. Supported Apps are JupyterServer and KernelGateway. This
     * operation is automatically invoked by Amazon SageMaker Amazon SageMaker Studio (Studio) upon access to the
     * associated Studio Domain, and when new kernel configurations are selected by the user. A user may have multiple
     * Apps active simultaneously. Apps will automatically terminate and be deleted when stopped from within Studio, or
     * when the DeleteApp API is manually called. UserProfiles are limited to 5 concurrently running Apps at a time.
     * </p>
     * 
     * @param createAppRequest
     * @return Result of the CreateApp operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @sample AmazonSageMaker.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAppResult createApp(CreateAppRequest createAppRequest);

    /**
     * <p>
     * Creates an AutoPilot job.
     * </p>
     * 
     * @param createAutoMLJobRequest
     * @return Result of the CreateAutoMLJob operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAutoMLJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAutoMLJobResult createAutoMLJob(CreateAutoMLJobRequest createAutoMLJobRequest);

    /**
     * <p>
     * Creates a Git repository as a resource in your Amazon SageMaker account. You can associate the repository with
     * notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a
     * resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it
     * persists independently from the lifecycle of any notebook instances it is associated with.
     * </p>
     * <p>
     * The repository can be hosted either in <a
     * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other
     * Git repository.
     * </p>
     * 
     * @param createCodeRepositoryRequest
     * @return Result of the CreateCodeRepository operation returned by the service.
     * @sample AmazonSageMaker.CreateCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    CreateCodeRepositoryResult createCodeRepository(CreateCodeRepositoryRequest createCodeRepositoryRequest);

    /**
     * <p>
     * Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model
     * artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.
     * </p>
     * <p>
     * If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model
     * artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them
     * as an ML resource.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A name for the compilation job
     * </p>
     * </li>
     * <li>
     * <p>
     * Information about the input model artifacts
     * </p>
     * </li>
     * <li>
     * <p>
     * The output location for the compiled model and the device (target) that the model runs on
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also provide a <code>Tag</code> to track the model compilation job's resource use and costs. The response
     * body contains the <code>CompilationJobArn</code> for the compiled job.
     * </p>
     * <p>
     * To stop a model compilation job, use <a>StopCompilationJob</a>. To get information about a particular model
     * compilation job, use <a>DescribeCompilationJob</a>. To get information about multiple model compilation jobs, use
     * <a>ListCompilationJobs</a>.
     * </p>
     * 
     * @param createCompilationJobRequest
     * @return Result of the CreateCompilationJob operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCompilationJob" target="_top">AWS
     *      API Documentation</a>
     */
    CreateCompilationJobResult createCompilationJob(CreateCompilationJobRequest createCompilationJobRequest);

    /**
     * <p>
     * Creates a Domain for Amazon SageMaker Amazon SageMaker Studio (Studio), which can be accessed by end-users in a
     * web browser. A Domain has an associated directory, list of authorized users, and a variety of security,
     * application, policies, and Amazon Virtual Private Cloud configurations. An AWS account is limited to one Domain,
     * per region. Users within a domain can share notebook files and other artifacts with each other. When a Domain is
     * created, an Amazon Elastic File System (EFS) is also created for use by all of the users within the Domain. Each
     * user receives a private home directory within the EFS for notebooks, Git repositories, and data files.
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @sample AmazonSageMaker.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDomainResult createDomain(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint
     * to provision resources and deploy models. You create the endpoint configuration with the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html">CreateEndpointConfig</a>
     * API.
     * </p>
     * <p>
     * Use this API to deploy models using Amazon SageMaker hosting services.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto">Deploy the
     * Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).</a>
     * </p>
     * <note>
     * <p>
     * You must not delete an <code>EndpointConfig</code> that is in use by an endpoint that is live or while the
     * <code>UpdateEndpoint</code> or <code>CreateEndpoint</code> operations are being performed on the endpoint. To
     * update an endpoint, you must create a new <code>EndpointConfig</code>.
     * </p>
     * </note>
     * <p>
     * The endpoint name must be unique within an AWS Region in your AWS account.
     * </p>
     * <p>
     * When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute
     * instances), and deploys the model(s) on them.
     * </p>
     * <p>
     * When Amazon SageMaker receives the request, it sets the endpoint status to <code>Creating</code>. After it
     * creates the endpoint, it sets the status to <code>InService</code>. Amazon SageMaker can then process incoming
     * requests for inferences. To check the status of an endpoint, use the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_DescribeEndpoint.html">DescribeEndpoint</a> API.
     * </p>
     * <p>
     * If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS
     * Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your
     * IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS
     * for that region. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param createEndpointRequest
     * @return Result of the CreateEndpoint operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    CreateEndpointResult createEndpoint(CreateEndpointRequest createEndpointRequest);

    /**
     * <p>
     * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the
     * configuration, you identify one or more models, created using the <code>CreateModel</code> API, to deploy and the
     * resources that you want Amazon SageMaker to provision. Then you call the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> API.
     * </p>
     * <note>
     * <p>
     * Use this API if you want to use Amazon SageMaker hosting services to deploy models into production.
     * </p>
     * </note>
     * <p>
     * In the request, you define a <code>ProductionVariant</code>, for each model that you want to deploy. Each
     * <code>ProductionVariant</code> parameter also describes the resources that you want Amazon SageMaker to
     * provision. This includes the number and type of ML compute instances to deploy.
     * </p>
     * <p>
     * If you are hosting multiple models, you also assign a <code>VariantWeight</code> to specify how much traffic you
     * want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign
     * traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model
     * A, and one-third to model B.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto">Deploy the
     * Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).</a>
     * </p>
     * 
     * @param createEndpointConfigRequest
     * @return Result of the CreateEndpointConfig operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEndpointConfig" target="_top">AWS
     *      API Documentation</a>
     */
    CreateEndpointConfigResult createEndpointConfig(CreateEndpointConfigRequest createEndpointConfigRequest);

    /**
     * <p>
     * Creates an Amazon SageMaker <i>experiment</i>. An experiment is a collection of <i>trials</i> that are observed,
     * compared and evaluated as a group. A trial is a set of steps, called <i>trial components</i>, that produce a
     * machine learning model.
     * </p>
     * <p>
     * The goal of an experiment is to determine the components that produce the best model. Multiple trials are
     * performed, each one isolating and measuring the impact of a change to one or more inputs, while keeping the
     * remaining inputs constant.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial
     * components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to experiments, trials, trial components and then use the <a>Search</a> API to search for the
     * tags.
     * </p>
     * <p>
     * To add a description to an experiment, specify the optional <code>Description</code> parameter. To add a
     * description later, or to change the description, call the <a>UpdateExperiment</a> API.
     * </p>
     * <p>
     * To get a list of all your experiments, call the <a>ListExperiments</a> API. To view an experiment's properties,
     * call the <a>DescribeExperiment</a> API. To get a list of all the trials associated with an experiment, call the
     * <a>ListTrials</a> API. To create a trial call the <a>CreateTrial</a> API.
     * </p>
     * 
     * @param createExperimentRequest
     * @return Result of the CreateExperiment operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    CreateExperimentResult createExperiment(CreateExperimentRequest createExperimentRequest);

    /**
     * <p>
     * Creates a flow definition.
     * </p>
     * 
     * @param createFlowDefinitionRequest
     * @return Result of the CreateFlowDefinition operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @sample AmazonSageMaker.CreateFlowDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateFlowDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    CreateFlowDefinitionResult createFlowDefinition(CreateFlowDefinitionRequest createFlowDefinitionRequest);

    /**
     * <p>
     * Defines the settings you will use for the human review workflow user interface. Reviewers will see a three-panel
     * interface with an instruction area, the item to review, and an input area.
     * </p>
     * 
     * @param createHumanTaskUiRequest
     * @return Result of the CreateHumanTaskUi operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @sample AmazonSageMaker.CreateHumanTaskUi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateHumanTaskUi" target="_top">AWS
     *      API Documentation</a>
     */
    CreateHumanTaskUiResult createHumanTaskUi(CreateHumanTaskUiRequest createHumanTaskUiRequest);

    /**
     * <p>
     * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many
     * training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that
     * you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured
     * by an objective metric that you choose.
     * </p>
     * 
     * @param createHyperParameterTuningJobRequest
     * @return Result of the CreateHyperParameterTuningJob operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    CreateHyperParameterTuningJobResult createHyperParameterTuningJob(CreateHyperParameterTuningJobRequest createHyperParameterTuningJobRequest);

    /**
     * <p>
     * Creates a job that uses workers to label the data objects in your input dataset. You can use the labeled data to
     * train machine learning models.
     * </p>
     * <p>
     * You can select your workforce from one of three providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A private workforce that you create. It can include employees, contractors, and outside experts. Use a private
     * workforce when want the data to stay within your organization or when a specific set of skills is required.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more vendors that you select from the AWS Marketplace. Vendors provide expertise in specific areas.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data
     * or data that has been stripped of any personally identifiable information.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can also use <i>automated data labeling</i> to reduce the number of data objects that need to be labeled by a
     * human. Automated data labeling uses <i>active learning</i> to determine if a data object can be labeled by
     * machine or if it needs to be sent to a human worker. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-automated-labeling.html">Using Automated Data
     * Labeling</a>.
     * </p>
     * <p>
     * The data objects to be labeled are contained in an Amazon S3 bucket. You create a <i>manifest file</i> that
     * describes the location of each object. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sms-data.html">Using Input and Output Data</a>.
     * </p>
     * <p>
     * The output can be used as the manifest file for another labeling job or as training data for your machine
     * learning models.
     * </p>
     * 
     * @param createLabelingJobRequest
     * @return Result of the CreateLabelingJob operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateLabelingJob" target="_top">AWS
     *      API Documentation</a>
     */
    CreateLabelingJobResult createLabelingJob(CreateLabelingJobRequest createLabelingJobRequest);

    /**
     * <p>
     * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the
     * primary container, you specify the Docker image that contains inference code, artifacts (from prior training),
     * and a custom environment map that the inference code uses when you deploy the model for predictions.
     * </p>
     * <p>
     * Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job.
     * </p>
     * <p>
     * To host your model, you create an endpoint configuration with the <code>CreateEndpointConfig</code> API, and then
     * create an endpoint with the <code>CreateEndpoint</code> API. Amazon SageMaker then deploys all of the containers
     * that you defined for the model in the hosting environment.
     * </p>
     * <p>
     * For an example that calls this method when deploying a model to Amazon SageMaker hosting services, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/ex1-deploy-model.html#ex1-deploy-model-boto">Deploy the
     * Model to Amazon SageMaker Hosting Services (AWS SDK for Python (Boto 3)).</a>
     * </p>
     * <p>
     * To run a batch transform using your model, you start a job with the <code>CreateTransformJob</code> API. Amazon
     * SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location.
     * </p>
     * <p>
     * In the <code>CreateModel</code> request, you must define a container with the <code>PrimaryContainer</code>
     * parameter.
     * </p>
     * <p>
     * In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and
     * docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also
     * use the IAM role to manage permissions the inference code needs. For example, if the inference code access any
     * other AWS resources, you grant necessary permissions via this role.
     * </p>
     * 
     * @param createModelRequest
     * @return Result of the CreateModel operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModel" target="_top">AWS API
     *      Documentation</a>
     */
    CreateModelResult createModel(CreateModelRequest createModelRequest);

    /**
     * <p>
     * Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can
     * subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     * </p>
     * <p>
     * To create a model package by specifying a Docker container that contains your inference code and the Amazon S3
     * location of your model artifacts, provide values for <code>InferenceSpecification</code>. To create a model from
     * an algorithm resource that you created or subscribed to in AWS Marketplace, provide a value for
     * <code>SourceAlgorithmSpecification</code>.
     * </p>
     * 
     * @param createModelPackageRequest
     * @return Result of the CreateModelPackage operation returned by the service.
     * @sample AmazonSageMaker.CreateModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    CreateModelPackageResult createModelPackage(CreateModelPackageRequest createModelPackageRequest);

    /**
     * <p>
     * Creates a schedule that regularly starts Amazon SageMaker Processing Jobs to monitor the data captured for an
     * Amazon SageMaker Endoint.
     * </p>
     * 
     * @param createMonitoringScheduleRequest
     * @return Result of the CreateMonitoringSchedule operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @sample AmazonSageMaker.CreateMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMonitoringScheduleResult createMonitoringSchedule(CreateMonitoringScheduleRequest createMonitoringScheduleRequest);

    /**
     * <p>
     * Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance
     * running on a Jupyter notebook.
     * </p>
     * <p>
     * In a <code>CreateNotebookInstance</code> request, specify the type of ML compute instance that you want to run.
     * Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model
     * training, and attaches an ML storage volume to the notebook instance.
     * </p>
     * <p>
     * Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker
     * with a specific algorithm or with a machine learning framework.
     * </p>
     * <p>
     * After receiving the request, Amazon SageMaker does the following:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Creates a network interface in the Amazon SageMaker VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Option) If you specified <code>SubnetId</code>, Amazon SageMaker creates a network interface in your own VPC,
     * which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon
     * SageMaker attaches the security group that you specified in the request to the network interface that it creates
     * in your VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified
     * <code>SubnetId</code> of your VPC, Amazon SageMaker specifies both network interfaces when launching this
     * instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security
     * groups allow it.
     * </p>
     * </li>
     * </ol>
     * <p>
     * After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN). You can't change
     * the name of a notebook instance after you create it.
     * </p>
     * <p>
     * After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter
     * notebooks. For example, you can write code to explore a dataset that you can use for model training, train a
     * model, host models by creating Amazon SageMaker endpoints, and validate hosted models.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How It
     * Works</a>.
     * </p>
     * 
     * @param createNotebookInstanceRequest
     * @return Result of the CreateNotebookInstance operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    CreateNotebookInstanceResult createNotebookInstance(CreateNotebookInstanceRequest createNotebookInstanceRequest);

    /**
     * <p>
     * Creates a lifecycle configuration that you can associate with a notebook instance. A <i>lifecycle
     * configuration</i> is a collection of shell scripts that run when you create or start a notebook instance.
     * </p>
     * <p>
     * Each lifecycle configuration script has a limit of 16384 characters.
     * </p>
     * <p>
     * The value of the <code>$PATH</code> environment variable that is available to both scripts is
     * <code>/sbin:bin:/usr/sbin:/usr/bin</code>.
     * </p>
     * <p>
     * View CloudWatch Logs for notebook instance lifecycle configurations in log group
     * <code>/aws/sagemaker/NotebookInstances</code> in log stream
     * <code>[notebook-instance-name]/[LifecycleConfigHook]</code>.
     * </p>
     * <p>
     * Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes,
     * it fails and the notebook instance is not created or started.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     * Customize a Notebook Instance</a>.
     * </p>
     * 
     * @param createNotebookInstanceLifecycleConfigRequest
     * @return Result of the CreateNotebookInstanceLifecycleConfig operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    CreateNotebookInstanceLifecycleConfigResult createNotebookInstanceLifecycleConfig(
            CreateNotebookInstanceLifecycleConfigRequest createNotebookInstanceLifecycleConfigRequest);

    /**
     * <p>
     * Creates a URL for a specified UserProfile in a Domain. When accessed in a web browser, the user will be
     * automatically signed in to Amazon SageMaker Amazon SageMaker Studio (Studio), and granted access to all of the
     * Apps and files associated with that Amazon Elastic File System (EFS). This operation can only be called when
     * AuthMode equals IAM.
     * </p>
     * 
     * @param createPresignedDomainUrlRequest
     * @return Result of the CreatePresignedDomainUrl operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.CreatePresignedDomainUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePresignedDomainUrl"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePresignedDomainUrlResult createPresignedDomainUrl(CreatePresignedDomainUrlRequest createPresignedDomainUrlRequest);

    /**
     * <p>
     * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker
     * console, when you choose <code>Open</code> next to a notebook instance, Amazon SageMaker opens a new tab showing
     * the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the
     * page.
     * </p>
     * <p>
     * IAM authorization policies for this API are also enforced for every HTTP request and WebSocket frame that
     * attempts to connect to the notebook instance.For example, you can restrict access to this API and to the URL that
     * it returns to a list of IP addresses that you specify. Use the <code>NotIpAddress</code> condition operator and
     * the <code>aws:SourceIP</code> condition context key to specify the list of IP addresses that you want to have
     * access to the notebook instance. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/security_iam_id-based-policy-examples.html#nbi-ip-filter"
     * >Limit Access to a Notebook Instance by IP Address</a>.
     * </p>
     * <note>
     * <p>
     * The URL that you get from a call to is valid only for 5 minutes. If you try to use the URL after the 5-minute
     * limit expires, you are directed to the AWS console sign-in page.
     * </p>
     * </note>
     * 
     * @param createPresignedNotebookInstanceUrlRequest
     * @return Result of the CreatePresignedNotebookInstanceUrl operation returned by the service.
     * @sample AmazonSageMaker.CreatePresignedNotebookInstanceUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePresignedNotebookInstanceUrl"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePresignedNotebookInstanceUrlResult createPresignedNotebookInstanceUrl(
            CreatePresignedNotebookInstanceUrlRequest createPresignedNotebookInstanceUrlRequest);

    /**
     * <p>
     * Creates a processing job.
     * </p>
     * 
     * @param createProcessingJobRequest
     * @return Result of the CreateProcessingJob operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.CreateProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateProcessingJob" target="_top">AWS
     *      API Documentation</a>
     */
    CreateProcessingJobResult createProcessingJob(CreateProcessingJobRequest createProcessingJobRequest);

    /**
     * <p>
     * Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an
     * Amazon S3 location that you specify.
     * </p>
     * <p>
     * If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model
     * artifacts as part of the model. You can also use the artifacts in a machine learning service other than Amazon
     * SageMaker, provided that you know how to use them for inferences.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmSpecification</code> - Identifies the training algorithm to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HyperParameters</code> - Specify these algorithm-specific parameters to enable the estimation of model
     * parameters during training. Hyperparameters can be tuned to optimize this learning process. For a list of
     * hyperparameters for each training algorithm provided by Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InputDataConfig</code> - Describes the training dataset and the Amazon S3, EFS, or FSx location where it is
     * stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutputDataConfig</code> - Identifies the Amazon S3 bucket where you want Amazon SageMaker to save the
     * results of model training.
     * </p>
     * <p/></li>
     * <li>
     * <p>
     * <code>ResourceConfig</code> - Identifies the resources, ML compute instances, and ML storage volumes to deploy
     * for model training. In distributed training, you specify more than one instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EnableManagedSpotTraining</code> - Optimize the cost of training machine learning models by up to 80% by
     * using Amazon EC2 Spot instances. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-managed-spot-training.html">Managed Spot
     * Training</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RoleARN</code> - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your
     * behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can
     * successfully complete model training.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StoppingCondition</code> - To help cap training costs, use <code>MaxRuntimeInSeconds</code> to set a time
     * limit for training. Use <code>MaxWaitTimeInSeconds</code> to specify how long you are willing to wait for a
     * managed spot training job to complete.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How It Works</a>.
     * </p>
     * 
     * @param createTrainingJobRequest
     * @return Result of the CreateTrainingJob operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.CreateTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrainingJob" target="_top">AWS
     *      API Documentation</a>
     */
    CreateTrainingJobResult createTrainingJob(CreateTrainingJobRequest createTrainingJobRequest);

    /**
     * <p>
     * Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these
     * results to an Amazon S3 location that you specify.
     * </p>
     * <p>
     * To perform batch transformations, you create a transform job and use the data that you have readily available.
     * </p>
     * <p>
     * In the request body, you provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TransformJobName</code> - Identifies the transform job. The name must be unique within an AWS Region in an
     * AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ModelName</code> - Identifies the model to use. <code>ModelName</code> must be the name of an existing
     * Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see
     * <a>CreateModel</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformInput</code> - Describes the dataset to be transformed and the Amazon S3 location where it is
     * stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformOutput</code> - Identifies the Amazon S3 location where you want Amazon SageMaker to save the
     * results from the transform job.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransformResources</code> - Identifies the ML compute instances for the transform job.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how batch transformation works, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform.html">Batch Transform</a>.
     * </p>
     * 
     * @param createTransformJobRequest
     * @return Result of the CreateTransformJob operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.CreateTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTransformJob" target="_top">AWS
     *      API Documentation</a>
     */
    CreateTransformJobResult createTransformJob(CreateTransformJobRequest createTransformJobRequest);

    /**
     * <p>
     * Creates an Amazon SageMaker <i>trial</i>. A trial is a set of steps called <i>trial components</i> that produce a
     * machine learning model. A trial is part of a single Amazon SageMaker <i>experiment</i>.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial
     * components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to a trial and then use the <a>Search</a> API to search for the tags.
     * </p>
     * <p>
     * To get a list of all your trials, call the <a>ListTrials</a> API. To view a trial's properties, call the
     * <a>DescribeTrial</a> API. To create a trial component, call the <a>CreateTrialComponent</a> API.
     * </p>
     * 
     * @param createTrialRequest
     * @return Result of the CreateTrial operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrial" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTrialResult createTrial(CreateTrialRequest createTrialRequest);

    /**
     * <p>
     * Creates a <i>trial component</i>, which is a stage of a machine learning <i>trial</i>. A trial is composed of one
     * or more trial components. A trial component can be used in multiple trials.
     * </p>
     * <p>
     * Trial components include pre-processing jobs, training jobs, and batch transform jobs.
     * </p>
     * <p>
     * When you use Amazon SageMaker Studio or the Amazon SageMaker Python SDK, all experiments, trials, and trial
     * components are automatically tracked, logged, and indexed. When you use the AWS SDK for Python (Boto), you must
     * use the logging APIs provided by the SDK.
     * </p>
     * <p>
     * You can add tags to a trial component and then use the <a>Search</a> API to search for the tags.
     * </p>
     * <note>
     * <p>
     * <code>CreateTrialComponent</code> can only be invoked from within an Amazon SageMaker managed environment. This
     * includes Amazon SageMaker training jobs, processing jobs, transform jobs, and Amazon SageMaker notebooks. A call
     * to <code>CreateTrialComponent</code> from outside one of these environments results in an error.
     * </p>
     * </note>
     * 
     * @param createTrialComponentRequest
     * @return Result of the CreateTrialComponent operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrialComponent" target="_top">AWS
     *      API Documentation</a>
     */
    CreateTrialComponentResult createTrialComponent(CreateTrialComponentRequest createTrialComponentRequest);

    /**
     * <p>
     * Creates a new user profile. A user profile represents a single user within a Domain, and is the main way to
     * reference a "person" for the purposes of sharing, reporting and other user-oriented features. This entity is
     * created during on-boarding. If an administrator invites a person by email or imports them from SSO, a new
     * UserProfile is automatically created. This entity is the primary holder of settings for an individual user and
     * has a reference to the user's private Amazon Elastic File System (EFS) home directory.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return Result of the CreateUserProfile operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @sample AmazonSageMaker.CreateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    CreateUserProfileResult createUserProfile(CreateUserProfileRequest createUserProfileRequest);

    /**
     * <p>
     * Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools.
     * You must first create the user pools before you can create a work team.
     * </p>
     * <p>
     * You cannot create more than 25 work teams in an account and region.
     * </p>
     * 
     * @param createWorkteamRequest
     * @return Result of the CreateWorkteam operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.CreateWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    CreateWorkteamResult createWorkteam(CreateWorkteamRequest createWorkteamRequest);

    /**
     * <p>
     * Removes the specified algorithm from your account.
     * </p>
     * 
     * @param deleteAlgorithmRequest
     * @return Result of the DeleteAlgorithm operation returned by the service.
     * @sample AmazonSageMaker.DeleteAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteAlgorithm" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAlgorithmResult deleteAlgorithm(DeleteAlgorithmRequest deleteAlgorithmRequest);

    /**
     * <p>
     * Used to stop and delete an app.
     * </p>
     * 
     * @param deleteAppRequest
     * @return Result of the DeleteApp operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAppResult deleteApp(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Deletes the specified Git repository from your account.
     * </p>
     * 
     * @param deleteCodeRepositoryRequest
     * @return Result of the DeleteCodeRepository operation returned by the service.
     * @sample AmazonSageMaker.DeleteCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteCodeRepositoryResult deleteCodeRepository(DeleteCodeRepositoryRequest deleteCodeRepositoryRequest);

    /**
     * <p>
     * Used to delete a domain. If you on-boarded with IAM mode, you will need to delete your domain to on-board again
     * using SSO. Use with caution. All of the members of the domain will lose access to their EFS volume, including
     * data, notebooks, and other artifacts.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was
     * created.
     * </p>
     * <p>
     * Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use
     * the <a href="http://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html">RevokeGrant</a> API call.
     * </p>
     * 
     * @param deleteEndpointRequest
     * @return Result of the DeleteEndpoint operation returned by the service.
     * @sample AmazonSageMaker.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEndpointResult deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest);

    /**
     * <p>
     * Deletes an endpoint configuration. The <code>DeleteEndpointConfig</code> API deletes only the specified
     * configuration. It does not delete endpoints created using the configuration.
     * </p>
     * 
     * @param deleteEndpointConfigRequest
     * @return Result of the DeleteEndpointConfig operation returned by the service.
     * @sample AmazonSageMaker.DeleteEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteEndpointConfig" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteEndpointConfigResult deleteEndpointConfig(DeleteEndpointConfigRequest deleteEndpointConfigRequest);

    /**
     * <p>
     * Deletes an Amazon SageMaker experiment. All trials associated with the experiment must be deleted first. Use the
     * <a>ListTrials</a> API to get a list of the trials associated with the experiment.
     * </p>
     * 
     * @param deleteExperimentRequest
     * @return Result of the DeleteExperiment operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteExperimentResult deleteExperiment(DeleteExperimentRequest deleteExperimentRequest);

    /**
     * <p>
     * Deletes the specified flow definition.
     * </p>
     * 
     * @param deleteFlowDefinitionRequest
     * @return Result of the DeleteFlowDefinition operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteFlowDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteFlowDefinition" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteFlowDefinitionResult deleteFlowDefinition(DeleteFlowDefinitionRequest deleteFlowDefinitionRequest);

    /**
     * <p>
     * Deletes a model. The <code>DeleteModel</code> API deletes only the model entry that was created in Amazon
     * SageMaker when you called the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateModel.html">CreateModel</a> API. It does not
     * delete model artifacts, inference code, or the IAM role that you specified when creating the model.
     * </p>
     * 
     * @param deleteModelRequest
     * @return Result of the DeleteModel operation returned by the service.
     * @sample AmazonSageMaker.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteModelResult deleteModel(DeleteModelRequest deleteModelRequest);

    /**
     * <p>
     * Deletes a model package.
     * </p>
     * <p>
     * A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to
     * model packages listed on AWS Marketplace to create models in Amazon SageMaker.
     * </p>
     * 
     * @param deleteModelPackageRequest
     * @return Result of the DeleteModelPackage operation returned by the service.
     * @sample AmazonSageMaker.DeleteModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteModelPackageResult deleteModelPackage(DeleteModelPackageRequest deleteModelPackageRequest);

    /**
     * <p>
     * Deletes a monitoring schedule. Also stops the schedule had not already been stopped. This does not delete the job
     * execution history of the monitoring schedule.
     * </p>
     * 
     * @param deleteMonitoringScheduleRequest
     * @return Result of the DeleteMonitoringSchedule operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMonitoringScheduleResult deleteMonitoringSchedule(DeleteMonitoringScheduleRequest deleteMonitoringScheduleRequest);

    /**
     * <p>
     * Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the
     * <code>StopNotebookInstance</code> API.
     * </p>
     * <important>
     * <p>
     * When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance,
     * and deletes the ML storage volume and the network interface associated with the notebook instance.
     * </p>
     * </important>
     * 
     * @param deleteNotebookInstanceRequest
     * @return Result of the DeleteNotebookInstance operation returned by the service.
     * @sample AmazonSageMaker.DeleteNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteNotebookInstanceResult deleteNotebookInstance(DeleteNotebookInstanceRequest deleteNotebookInstanceRequest);

    /**
     * <p>
     * Deletes a notebook instance lifecycle configuration.
     * </p>
     * 
     * @param deleteNotebookInstanceLifecycleConfigRequest
     * @return Result of the DeleteNotebookInstanceLifecycleConfig operation returned by the service.
     * @sample AmazonSageMaker.DeleteNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteNotebookInstanceLifecycleConfigResult deleteNotebookInstanceLifecycleConfig(
            DeleteNotebookInstanceLifecycleConfigRequest deleteNotebookInstanceLifecycleConfigRequest);

    /**
     * <p>
     * Deletes the specified tags from an Amazon SageMaker resource.
     * </p>
     * <p>
     * To list a resource's tags, use the <code>ListTags</code> API.
     * </p>
     * <note>
     * <p>
     * When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from
     * training jobs that the hyperparameter tuning job launched before you called this API.
     * </p>
     * </note>
     * 
     * @param deleteTagsRequest
     * @return Result of the DeleteTags operation returned by the service.
     * @sample AmazonSageMaker.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTagsResult deleteTags(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the specified trial. All trial components that make up the trial must be deleted first. Use the
     * <a>DescribeTrialComponent</a> API to get the list of trial components.
     * </p>
     * 
     * @param deleteTrialRequest
     * @return Result of the DeleteTrial operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteTrial" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTrialResult deleteTrial(DeleteTrialRequest deleteTrialRequest);

    /**
     * <p>
     * Deletes the specified trial component. A trial component must be disassociated from all trials before the trial
     * component can be deleted. To disassociate a trial component from a trial, call the
     * <a>DisassociateTrialComponent</a> API.
     * </p>
     * 
     * @param deleteTrialComponentRequest
     * @return Result of the DeleteTrialComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteTrialComponent" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteTrialComponentResult deleteTrialComponent(DeleteTrialComponentRequest deleteTrialComponentRequest);

    /**
     * <p>
     * Deletes a user profile.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @return Result of the DeleteUserProfile operation returned by the service.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DeleteUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteUserProfileResult deleteUserProfile(DeleteUserProfileRequest deleteUserProfileRequest);

    /**
     * <p>
     * Deletes an existing work team. This operation can't be undone.
     * </p>
     * 
     * @param deleteWorkteamRequest
     * @return Result of the DeleteWorkteam operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.DeleteWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWorkteamResult deleteWorkteam(DeleteWorkteamRequest deleteWorkteamRequest);

    /**
     * <p>
     * Returns a description of the specified algorithm that is in your account.
     * </p>
     * 
     * @param describeAlgorithmRequest
     * @return Result of the DescribeAlgorithm operation returned by the service.
     * @sample AmazonSageMaker.DescribeAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAlgorithm" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAlgorithmResult describeAlgorithm(DescribeAlgorithmRequest describeAlgorithmRequest);

    /**
     * <p>
     * Describes the app.
     * </p>
     * 
     * @param describeAppRequest
     * @return Result of the DescribeApp operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeApp" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAppResult describeApp(DescribeAppRequest describeAppRequest);

    /**
     * <p>
     * Returns information about an Amazon SageMaker job.
     * </p>
     * 
     * @param describeAutoMLJobRequest
     * @return Result of the DescribeAutoMLJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAutoMLJob" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAutoMLJobResult describeAutoMLJob(DescribeAutoMLJobRequest describeAutoMLJobRequest);

    /**
     * <p>
     * Gets details about the specified Git repository.
     * </p>
     * 
     * @param describeCodeRepositoryRequest
     * @return Result of the DescribeCodeRepository operation returned by the service.
     * @sample AmazonSageMaker.DescribeCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeCodeRepository"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCodeRepositoryResult describeCodeRepository(DescribeCodeRepositoryRequest describeCodeRepositoryRequest);

    /**
     * <p>
     * Returns information about a model compilation job.
     * </p>
     * <p>
     * To create a model compilation job, use <a>CreateCompilationJob</a>. To get information about multiple model
     * compilation jobs, use <a>ListCompilationJobs</a>.
     * </p>
     * 
     * @param describeCompilationJobRequest
     * @return Result of the DescribeCompilationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeCompilationJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCompilationJobResult describeCompilationJob(DescribeCompilationJobRequest describeCompilationJobRequest);

    /**
     * <p>
     * The desciption of the domain.
     * </p>
     * 
     * @param describeDomainRequest
     * @return Result of the DescribeDomain operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDomain" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDomainResult describeDomain(DescribeDomainRequest describeDomainRequest);

    /**
     * <p>
     * Returns the description of an endpoint.
     * </p>
     * 
     * @param describeEndpointRequest
     * @return Result of the DescribeEndpoint operation returned by the service.
     * @sample AmazonSageMaker.DescribeEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeEndpointResult describeEndpoint(DescribeEndpointRequest describeEndpointRequest);

    /**
     * <p>
     * Returns the description of an endpoint configuration created using the <code>CreateEndpointConfig</code> API.
     * </p>
     * 
     * @param describeEndpointConfigRequest
     * @return Result of the DescribeEndpointConfig operation returned by the service.
     * @sample AmazonSageMaker.DescribeEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEndpointConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEndpointConfigResult describeEndpointConfig(DescribeEndpointConfigRequest describeEndpointConfigRequest);

    /**
     * <p>
     * Provides a list of an experiment's properties.
     * </p>
     * 
     * @param describeExperimentRequest
     * @return Result of the DescribeExperiment operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeExperiment" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeExperimentResult describeExperiment(DescribeExperimentRequest describeExperimentRequest);

    /**
     * <p>
     * Returns information about the specified flow definition.
     * </p>
     * 
     * @param describeFlowDefinitionRequest
     * @return Result of the DescribeFlowDefinition operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeFlowDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeFlowDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFlowDefinitionResult describeFlowDefinition(DescribeFlowDefinitionRequest describeFlowDefinitionRequest);

    /**
     * <p>
     * Returns information about the requested human task user interface.
     * </p>
     * 
     * @param describeHumanTaskUiRequest
     * @return Result of the DescribeHumanTaskUi operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeHumanTaskUi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeHumanTaskUi" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeHumanTaskUiResult describeHumanTaskUi(DescribeHumanTaskUiRequest describeHumanTaskUiRequest);

    /**
     * <p>
     * Gets a description of a hyperparameter tuning job.
     * </p>
     * 
     * @param describeHyperParameterTuningJobRequest
     * @return Result of the DescribeHyperParameterTuningJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeHyperParameterTuningJobResult describeHyperParameterTuningJob(DescribeHyperParameterTuningJobRequest describeHyperParameterTuningJobRequest);

    /**
     * <p>
     * Gets information about a labeling job.
     * </p>
     * 
     * @param describeLabelingJobRequest
     * @return Result of the DescribeLabelingJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeLabelingJob" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeLabelingJobResult describeLabelingJob(DescribeLabelingJobRequest describeLabelingJobRequest);

    /**
     * <p>
     * Describes a model that you created using the <code>CreateModel</code> API.
     * </p>
     * 
     * @param describeModelRequest
     * @return Result of the DescribeModel operation returned by the service.
     * @sample AmazonSageMaker.DescribeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModel" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeModelResult describeModel(DescribeModelRequest describeModelRequest);

    /**
     * <p>
     * Returns a description of the specified model package, which is used to create Amazon SageMaker models or list
     * them on AWS Marketplace.
     * </p>
     * <p>
     * To create models in Amazon SageMaker, buyers can subscribe to model packages listed on AWS Marketplace.
     * </p>
     * 
     * @param describeModelPackageRequest
     * @return Result of the DescribeModelPackage operation returned by the service.
     * @sample AmazonSageMaker.DescribeModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeModelPackageResult describeModelPackage(DescribeModelPackageRequest describeModelPackageRequest);

    /**
     * <p>
     * Describes the schedule for a monitoring job.
     * </p>
     * 
     * @param describeMonitoringScheduleRequest
     * @return Result of the DescribeMonitoringSchedule operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMonitoringScheduleResult describeMonitoringSchedule(DescribeMonitoringScheduleRequest describeMonitoringScheduleRequest);

    /**
     * <p>
     * Returns information about a notebook instance.
     * </p>
     * 
     * @param describeNotebookInstanceRequest
     * @return Result of the DescribeNotebookInstance operation returned by the service.
     * @sample AmazonSageMaker.DescribeNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeNotebookInstanceResult describeNotebookInstance(DescribeNotebookInstanceRequest describeNotebookInstanceRequest);

    /**
     * <p>
     * Returns a description of a notebook instance lifecycle configuration.
     * </p>
     * <p>
     * For information about notebook instance lifestyle configurations, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html">Step 2.1: (Optional)
     * Customize a Notebook Instance</a>.
     * </p>
     * 
     * @param describeNotebookInstanceLifecycleConfigRequest
     * @return Result of the DescribeNotebookInstanceLifecycleConfig operation returned by the service.
     * @sample AmazonSageMaker.DescribeNotebookInstanceLifecycleConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeNotebookInstanceLifecycleConfigResult describeNotebookInstanceLifecycleConfig(
            DescribeNotebookInstanceLifecycleConfigRequest describeNotebookInstanceLifecycleConfigRequest);

    /**
     * <p>
     * Returns a description of a processing job.
     * </p>
     * 
     * @param describeProcessingJobRequest
     * @return Result of the DescribeProcessingJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeProcessingJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeProcessingJobResult describeProcessingJob(DescribeProcessingJobRequest describeProcessingJobRequest);

    /**
     * <p>
     * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor
     * in the AWS Marketplace.
     * </p>
     * 
     * @param describeSubscribedWorkteamRequest
     * @return Result of the DescribeSubscribedWorkteam operation returned by the service.
     * @sample AmazonSageMaker.DescribeSubscribedWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeSubscribedWorkteam"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSubscribedWorkteamResult describeSubscribedWorkteam(DescribeSubscribedWorkteamRequest describeSubscribedWorkteamRequest);

    /**
     * <p>
     * Returns information about a training job.
     * </p>
     * 
     * @param describeTrainingJobRequest
     * @return Result of the DescribeTrainingJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrainingJob" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeTrainingJobResult describeTrainingJob(DescribeTrainingJobRequest describeTrainingJobRequest);

    /**
     * <p>
     * Returns information about a transform job.
     * </p>
     * 
     * @param describeTransformJobRequest
     * @return Result of the DescribeTransformJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTransformJob" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeTransformJobResult describeTransformJob(DescribeTransformJobRequest describeTransformJobRequest);

    /**
     * <p>
     * Provides a list of a trial's properties.
     * </p>
     * 
     * @param describeTrialRequest
     * @return Result of the DescribeTrial operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrial" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeTrialResult describeTrial(DescribeTrialRequest describeTrialRequest);

    /**
     * <p>
     * Provides a list of a trials component's properties.
     * </p>
     * 
     * @param describeTrialComponentRequest
     * @return Result of the DescribeTrialComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrialComponent"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTrialComponentResult describeTrialComponent(DescribeTrialComponentRequest describeTrialComponentRequest);

    /**
     * <p>
     * Describes the user profile.
     * </p>
     * 
     * @param describeUserProfileRequest
     * @return Result of the DescribeUserProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DescribeUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeUserProfileResult describeUserProfile(DescribeUserProfileRequest describeUserProfileRequest);

    /**
     * <p>
     * Lists private workforce information, including workforce name, Amazon Resource Name (ARN), and, if applicable,
     * allowed IP address ranges (<a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>). Allowable IP address ranges
     * are the IP addresses that workers can use to access tasks.
     * </p>
     * <important>
     * <p>
     * This operation applies only to private workforces.
     * </p>
     * </important>
     * 
     * @param describeWorkforceRequest
     * @return Result of the DescribeWorkforce operation returned by the service.
     * @sample AmazonSageMaker.DescribeWorkforce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeWorkforce" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeWorkforceResult describeWorkforce(DescribeWorkforceRequest describeWorkforceRequest);

    /**
     * <p>
     * Gets information about a specific work team. You can see information such as the create date, the last updated
     * date, membership information, and the work team's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeWorkteamRequest
     * @return Result of the DescribeWorkteam operation returned by the service.
     * @sample AmazonSageMaker.DescribeWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeWorkteamResult describeWorkteam(DescribeWorkteamRequest describeWorkteamRequest);

    /**
     * <p>
     * Disassociates a trial component from a trial. This doesn't effect other trials the component is associated with.
     * Before you can delete a component, you must disassociate the component from all trials it is associated with. To
     * associate a trial component with a trial, call the <a>AssociateTrialComponent</a> API.
     * </p>
     * <p>
     * To get a list of the trials a component is associated with, use the <a>Search</a> API. Specify
     * <code>ExperimentTrialComponent</code> for the <code>Resource</code> parameter. The list appears in the response
     * under <code>Results.TrialComponent.Parents</code>.
     * </p>
     * 
     * @param disassociateTrialComponentRequest
     * @return Result of the DisassociateTrialComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.DisassociateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DisassociateTrialComponent"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateTrialComponentResult disassociateTrialComponent(DisassociateTrialComponentRequest disassociateTrialComponentRequest);

    /**
     * <p>
     * An auto-complete API for the search functionality in the Amazon SageMaker console. It returns suggestions of
     * possible matches for the property name to use in <code>Search</code> queries. Provides suggestions for
     * <code>HyperParameters</code>, <code>Tags</code>, and <code>Metrics</code>.
     * </p>
     * 
     * @param getSearchSuggestionsRequest
     * @return Result of the GetSearchSuggestions operation returned by the service.
     * @sample AmazonSageMaker.GetSearchSuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetSearchSuggestions" target="_top">AWS
     *      API Documentation</a>
     */
    GetSearchSuggestionsResult getSearchSuggestions(GetSearchSuggestionsRequest getSearchSuggestionsRequest);

    /**
     * <p>
     * Lists the machine learning algorithms that have been created.
     * </p>
     * 
     * @param listAlgorithmsRequest
     * @return Result of the ListAlgorithms operation returned by the service.
     * @sample AmazonSageMaker.ListAlgorithms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAlgorithms" target="_top">AWS API
     *      Documentation</a>
     */
    ListAlgorithmsResult listAlgorithms(ListAlgorithmsRequest listAlgorithmsRequest);

    /**
     * <p>
     * Lists apps.
     * </p>
     * 
     * @param listAppsRequest
     * @return Result of the ListApps operation returned by the service.
     * @sample AmazonSageMaker.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    ListAppsResult listApps(ListAppsRequest listAppsRequest);

    /**
     * <p>
     * Request a list of jobs.
     * </p>
     * 
     * @param listAutoMLJobsRequest
     * @return Result of the ListAutoMLJobs operation returned by the service.
     * @sample AmazonSageMaker.ListAutoMLJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAutoMLJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListAutoMLJobsResult listAutoMLJobs(ListAutoMLJobsRequest listAutoMLJobsRequest);

    /**
     * <p>
     * List the Candidates created for the job.
     * </p>
     * 
     * @param listCandidatesForAutoMLJobRequest
     * @return Result of the ListCandidatesForAutoMLJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.ListCandidatesForAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCandidatesForAutoMLJob"
     *      target="_top">AWS API Documentation</a>
     */
    ListCandidatesForAutoMLJobResult listCandidatesForAutoMLJob(ListCandidatesForAutoMLJobRequest listCandidatesForAutoMLJobRequest);

    /**
     * <p>
     * Gets a list of the Git repositories in your account.
     * </p>
     * 
     * @param listCodeRepositoriesRequest
     * @return Result of the ListCodeRepositories operation returned by the service.
     * @sample AmazonSageMaker.ListCodeRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCodeRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    ListCodeRepositoriesResult listCodeRepositories(ListCodeRepositoriesRequest listCodeRepositoriesRequest);

    /**
     * <p>
     * Lists model compilation jobs that satisfy various filters.
     * </p>
     * <p>
     * To create a model compilation job, use <a>CreateCompilationJob</a>. To get information about a particular model
     * compilation job you have created, use <a>DescribeCompilationJob</a>.
     * </p>
     * 
     * @param listCompilationJobsRequest
     * @return Result of the ListCompilationJobs operation returned by the service.
     * @sample AmazonSageMaker.ListCompilationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCompilationJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListCompilationJobsResult listCompilationJobs(ListCompilationJobsRequest listCompilationJobsRequest);

    /**
     * <p>
     * Lists the domains.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @sample AmazonSageMaker.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Lists endpoint configurations.
     * </p>
     * 
     * @param listEndpointConfigsRequest
     * @return Result of the ListEndpointConfigs operation returned by the service.
     * @sample AmazonSageMaker.ListEndpointConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEndpointConfigs" target="_top">AWS
     *      API Documentation</a>
     */
    ListEndpointConfigsResult listEndpointConfigs(ListEndpointConfigsRequest listEndpointConfigsRequest);

    /**
     * <p>
     * Lists endpoints.
     * </p>
     * 
     * @param listEndpointsRequest
     * @return Result of the ListEndpoints operation returned by the service.
     * @sample AmazonSageMaker.ListEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    ListEndpointsResult listEndpoints(ListEndpointsRequest listEndpointsRequest);

    /**
     * <p>
     * Lists all the experiments in your account. The list can be filtered to show only experiments that were created in
     * a specific time range. The list can be sorted by experiment name or creation time.
     * </p>
     * 
     * @param listExperimentsRequest
     * @return Result of the ListExperiments operation returned by the service.
     * @sample AmazonSageMaker.ListExperiments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListExperiments" target="_top">AWS API
     *      Documentation</a>
     */
    ListExperimentsResult listExperiments(ListExperimentsRequest listExperimentsRequest);

    /**
     * <p>
     * Returns information about the flow definitions in your account.
     * </p>
     * 
     * @param listFlowDefinitionsRequest
     * @return Result of the ListFlowDefinitions operation returned by the service.
     * @sample AmazonSageMaker.ListFlowDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListFlowDefinitions" target="_top">AWS
     *      API Documentation</a>
     */
    ListFlowDefinitionsResult listFlowDefinitions(ListFlowDefinitionsRequest listFlowDefinitionsRequest);

    /**
     * <p>
     * Returns information about the human task user interfaces in your account.
     * </p>
     * 
     * @param listHumanTaskUisRequest
     * @return Result of the ListHumanTaskUis operation returned by the service.
     * @sample AmazonSageMaker.ListHumanTaskUis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHumanTaskUis" target="_top">AWS API
     *      Documentation</a>
     */
    ListHumanTaskUisResult listHumanTaskUis(ListHumanTaskUisRequest listHumanTaskUisRequest);

    /**
     * <p>
     * Gets a list of <a>HyperParameterTuningJobSummary</a> objects that describe the hyperparameter tuning jobs
     * launched in your account.
     * </p>
     * 
     * @param listHyperParameterTuningJobsRequest
     * @return Result of the ListHyperParameterTuningJobs operation returned by the service.
     * @sample AmazonSageMaker.ListHyperParameterTuningJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHyperParameterTuningJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListHyperParameterTuningJobsResult listHyperParameterTuningJobs(ListHyperParameterTuningJobsRequest listHyperParameterTuningJobsRequest);

    /**
     * <p>
     * Gets a list of labeling jobs.
     * </p>
     * 
     * @param listLabelingJobsRequest
     * @return Result of the ListLabelingJobs operation returned by the service.
     * @sample AmazonSageMaker.ListLabelingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListLabelingJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListLabelingJobsResult listLabelingJobs(ListLabelingJobsRequest listLabelingJobsRequest);

    /**
     * <p>
     * Gets a list of labeling jobs assigned to a specified work team.
     * </p>
     * 
     * @param listLabelingJobsForWorkteamRequest
     * @return Result of the ListLabelingJobsForWorkteam operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.ListLabelingJobsForWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListLabelingJobsForWorkteam"
     *      target="_top">AWS API Documentation</a>
     */
    ListLabelingJobsForWorkteamResult listLabelingJobsForWorkteam(ListLabelingJobsForWorkteamRequest listLabelingJobsForWorkteamRequest);

    /**
     * <p>
     * Lists the model packages that have been created.
     * </p>
     * 
     * @param listModelPackagesRequest
     * @return Result of the ListModelPackages operation returned by the service.
     * @sample AmazonSageMaker.ListModelPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelPackages" target="_top">AWS
     *      API Documentation</a>
     */
    ListModelPackagesResult listModelPackages(ListModelPackagesRequest listModelPackagesRequest);

    /**
     * <p>
     * Lists models created with the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateModel.html">CreateModel</a> API.
     * </p>
     * 
     * @param listModelsRequest
     * @return Result of the ListModels operation returned by the service.
     * @sample AmazonSageMaker.ListModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModels" target="_top">AWS API
     *      Documentation</a>
     */
    ListModelsResult listModels(ListModelsRequest listModelsRequest);

    /**
     * <p>
     * Returns list of all monitoring job executions.
     * </p>
     * 
     * @param listMonitoringExecutionsRequest
     * @return Result of the ListMonitoringExecutions operation returned by the service.
     * @sample AmazonSageMaker.ListMonitoringExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListMonitoringExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    ListMonitoringExecutionsResult listMonitoringExecutions(ListMonitoringExecutionsRequest listMonitoringExecutionsRequest);

    /**
     * <p>
     * Returns list of all monitoring schedules.
     * </p>
     * 
     * @param listMonitoringSchedulesRequest
     * @return Result of the ListMonitoringSchedules operation returned by the service.
     * @sample AmazonSageMaker.ListMonitoringSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListMonitoringSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    ListMonitoringSchedulesResult listMonitoringSchedules(ListMonitoringSchedulesRequest listMonitoringSchedulesRequest);

    /**
     * <p>
     * Lists notebook instance lifestyle configurations created with the <a>CreateNotebookInstanceLifecycleConfig</a>
     * API.
     * </p>
     * 
     * @param listNotebookInstanceLifecycleConfigsRequest
     * @return Result of the ListNotebookInstanceLifecycleConfigs operation returned by the service.
     * @sample AmazonSageMaker.ListNotebookInstanceLifecycleConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListNotebookInstanceLifecycleConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    ListNotebookInstanceLifecycleConfigsResult listNotebookInstanceLifecycleConfigs(
            ListNotebookInstanceLifecycleConfigsRequest listNotebookInstanceLifecycleConfigsRequest);

    /**
     * <p>
     * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region.
     * </p>
     * 
     * @param listNotebookInstancesRequest
     * @return Result of the ListNotebookInstances operation returned by the service.
     * @sample AmazonSageMaker.ListNotebookInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListNotebookInstances"
     *      target="_top">AWS API Documentation</a>
     */
    ListNotebookInstancesResult listNotebookInstances(ListNotebookInstancesRequest listNotebookInstancesRequest);

    /**
     * <p>
     * Lists processing jobs that satisfy various filters.
     * </p>
     * 
     * @param listProcessingJobsRequest
     * @return Result of the ListProcessingJobs operation returned by the service.
     * @sample AmazonSageMaker.ListProcessingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListProcessingJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListProcessingJobsResult listProcessingJobs(ListProcessingJobsRequest listProcessingJobsRequest);

    /**
     * <p>
     * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work
     * team satisfies the filter specified in the <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listSubscribedWorkteamsRequest
     * @return Result of the ListSubscribedWorkteams operation returned by the service.
     * @sample AmazonSageMaker.ListSubscribedWorkteams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListSubscribedWorkteams"
     *      target="_top">AWS API Documentation</a>
     */
    ListSubscribedWorkteamsResult listSubscribedWorkteams(ListSubscribedWorkteamsRequest listSubscribedWorkteamsRequest);

    /**
     * <p>
     * Returns the tags for the specified Amazon SageMaker resource.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @sample AmazonSageMaker.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Lists training jobs.
     * </p>
     * 
     * @param listTrainingJobsRequest
     * @return Result of the ListTrainingJobs operation returned by the service.
     * @sample AmazonSageMaker.ListTrainingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrainingJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListTrainingJobsResult listTrainingJobs(ListTrainingJobsRequest listTrainingJobsRequest);

    /**
     * <p>
     * Gets a list of <a>TrainingJobSummary</a> objects that describe the training jobs that a hyperparameter tuning job
     * launched.
     * </p>
     * 
     * @param listTrainingJobsForHyperParameterTuningJobRequest
     * @return Result of the ListTrainingJobsForHyperParameterTuningJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.ListTrainingJobsForHyperParameterTuningJob
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrainingJobsForHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    ListTrainingJobsForHyperParameterTuningJobResult listTrainingJobsForHyperParameterTuningJob(
            ListTrainingJobsForHyperParameterTuningJobRequest listTrainingJobsForHyperParameterTuningJobRequest);

    /**
     * <p>
     * Lists transform jobs.
     * </p>
     * 
     * @param listTransformJobsRequest
     * @return Result of the ListTransformJobs operation returned by the service.
     * @sample AmazonSageMaker.ListTransformJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTransformJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListTransformJobsResult listTransformJobs(ListTransformJobsRequest listTransformJobsRequest);

    /**
     * <p>
     * Lists the trial components in your account. You can sort the list by trial component name or creation time. You
     * can filter the list to show only components that were created in a specific time range. You can also filter on
     * one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ExperimentName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TrialName</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrialComponentsRequest
     * @return Result of the ListTrialComponents operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.ListTrialComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrialComponents" target="_top">AWS
     *      API Documentation</a>
     */
    ListTrialComponentsResult listTrialComponents(ListTrialComponentsRequest listTrialComponentsRequest);

    /**
     * <p>
     * Lists the trials in your account. Specify an experiment name to limit the list to the trials that are part of
     * that experiment. Specify a trial component name to limit the list to the trials that associated with that trial
     * component. The list can be filtered to show only trials that were created in a specific time range. The list can
     * be sorted by trial name or creation time.
     * </p>
     * 
     * @param listTrialsRequest
     * @return Result of the ListTrials operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.ListTrials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrials" target="_top">AWS API
     *      Documentation</a>
     */
    ListTrialsResult listTrials(ListTrialsRequest listTrialsRequest);

    /**
     * <p>
     * Lists user profiles.
     * </p>
     * 
     * @param listUserProfilesRequest
     * @return Result of the ListUserProfiles operation returned by the service.
     * @sample AmazonSageMaker.ListUserProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListUserProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    ListUserProfilesResult listUserProfiles(ListUserProfilesRequest listUserProfilesRequest);

    /**
     * <p>
     * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the
     * filter specified in the <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listWorkteamsRequest
     * @return Result of the ListWorkteams operation returned by the service.
     * @sample AmazonSageMaker.ListWorkteams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListWorkteams" target="_top">AWS API
     *      Documentation</a>
     */
    ListWorkteamsResult listWorkteams(ListWorkteamsRequest listWorkteamsRequest);

    /**
     * <p>
     * Renders the UI template so that you can preview the worker's experience.
     * </p>
     * 
     * @param renderUiTemplateRequest
     * @return Result of the RenderUiTemplate operation returned by the service.
     * @sample AmazonSageMaker.RenderUiTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RenderUiTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    RenderUiTemplateResult renderUiTemplate(RenderUiTemplateRequest renderUiTemplateRequest);

    /**
     * <p>
     * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of
     * <code>SearchResult</code> objects in the response. You can sort the search results by any resource property in a
     * ascending or descending order.
     * </p>
     * <p>
     * You can query against the following value types: numeric, text, Boolean, and timestamp.
     * </p>
     * 
     * @param searchRequest
     * @return Result of the Search operation returned by the service.
     * @sample AmazonSageMaker.Search
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Search" target="_top">AWS API
     *      Documentation</a>
     */
    SearchResult search(SearchRequest searchRequest);

    /**
     * <p>
     * Starts a previously stopped monitoring schedule.
     * </p>
     * <note>
     * <p>
     * New monitoring schedules are immediately started after creation.
     * </p>
     * </note>
     * 
     * @param startMonitoringScheduleRequest
     * @return Result of the StartMonitoringSchedule operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StartMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StartMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    StartMonitoringScheduleResult startMonitoringSchedule(StartMonitoringScheduleRequest startMonitoringScheduleRequest);

    /**
     * <p>
     * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume.
     * After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to
     * <code>InService</code>. A notebook instance's status must be <code>InService</code> before you can connect to
     * your Jupyter notebook.
     * </p>
     * 
     * @param startNotebookInstanceRequest
     * @return Result of the StartNotebookInstance operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.StartNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StartNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    StartNotebookInstanceResult startNotebookInstance(StartNotebookInstanceRequest startNotebookInstanceRequest);

    /**
     * <p>
     * A method for forcing the termination of a running job.
     * </p>
     * 
     * @param stopAutoMLJobRequest
     * @return Result of the StopAutoMLJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopAutoMLJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopAutoMLJob" target="_top">AWS API
     *      Documentation</a>
     */
    StopAutoMLJobResult stopAutoMLJob(StopAutoMLJobRequest stopAutoMLJobRequest);

    /**
     * <p>
     * Stops a model compilation job.
     * </p>
     * <p>
     * To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If
     * the job hasn't stopped, it sends the SIGKILL signal.
     * </p>
     * <p>
     * When it receives a <code>StopCompilationJob</code> request, Amazon SageMaker changes the
     * <a>CompilationJobSummary$CompilationJobStatus</a> of the job to <code>Stopping</code>. After Amazon SageMaker
     * stops the job, it sets the <a>CompilationJobSummary$CompilationJobStatus</a> to <code>Stopped</code>.
     * </p>
     * 
     * @param stopCompilationJobRequest
     * @return Result of the StopCompilationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopCompilationJob" target="_top">AWS
     *      API Documentation</a>
     */
    StopCompilationJobResult stopCompilationJob(StopCompilationJobRequest stopCompilationJobRequest);

    /**
     * <p>
     * Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched.
     * </p>
     * <p>
     * All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All
     * data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning
     * job moves to the <code>Stopped</code> state, it releases all reserved resources for the tuning job.
     * </p>
     * 
     * @param stopHyperParameterTuningJobRequest
     * @return Result of the StopHyperParameterTuningJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    StopHyperParameterTuningJobResult stopHyperParameterTuningJob(StopHyperParameterTuningJobRequest stopHyperParameterTuningJobRequest);

    /**
     * <p>
     * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is
     * stopped are placed in the Amazon S3 output bucket.
     * </p>
     * 
     * @param stopLabelingJobRequest
     * @return Result of the StopLabelingJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopLabelingJob" target="_top">AWS API
     *      Documentation</a>
     */
    StopLabelingJobResult stopLabelingJob(StopLabelingJobRequest stopLabelingJobRequest);

    /**
     * <p>
     * Stops a previously started monitoring schedule.
     * </p>
     * 
     * @param stopMonitoringScheduleRequest
     * @return Result of the StopMonitoringSchedule operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    StopMonitoringScheduleResult stopMonitoringSchedule(StopMonitoringScheduleRequest stopMonitoringScheduleRequest);

    /**
     * <p>
     * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage
     * volume from it. Amazon SageMaker preserves the ML storage volume. Amazon SageMaker stops charging you for the ML
     * compute instance when you call <code>StopNotebookInstance</code>.
     * </p>
     * <p>
     * To access data on the ML storage volume for a notebook instance that has been terminated, call the
     * <code>StartNotebookInstance</code> API. <code>StartNotebookInstance</code> launches another ML compute instance,
     * configures it, and attaches the preserved ML storage volume so you can continue your work.
     * </p>
     * 
     * @param stopNotebookInstanceRequest
     * @return Result of the StopNotebookInstance operation returned by the service.
     * @sample AmazonSageMaker.StopNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopNotebookInstance" target="_top">AWS
     *      API Documentation</a>
     */
    StopNotebookInstanceResult stopNotebookInstance(StopNotebookInstanceRequest stopNotebookInstanceRequest);

    /**
     * <p>
     * Stops a processing job.
     * </p>
     * 
     * @param stopProcessingJobRequest
     * @return Result of the StopProcessingJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopProcessingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopProcessingJob" target="_top">AWS
     *      API Documentation</a>
     */
    StopProcessingJobResult stopProcessingJob(StopProcessingJobRequest stopProcessingJobRequest);

    /**
     * <p>
     * Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the <code>SIGTERM</code> signal, which
     * delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts,
     * so the results of the training is not lost.
     * </p>
     * <p>
     * When it receives a <code>StopTrainingJob</code> request, Amazon SageMaker changes the status of the job to
     * <code>Stopping</code>. After Amazon SageMaker stops the job, it sets the status to <code>Stopped</code>.
     * </p>
     * 
     * @param stopTrainingJobRequest
     * @return Result of the StopTrainingJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopTrainingJob" target="_top">AWS API
     *      Documentation</a>
     */
    StopTrainingJobResult stopTrainingJob(StopTrainingJobRequest stopTrainingJobRequest);

    /**
     * <p>
     * Stops a transform job.
     * </p>
     * <p>
     * When Amazon SageMaker receives a <code>StopTransformJob</code> request, the status of the job changes to
     * <code>Stopping</code>. After Amazon SageMaker stops the job, the status is set to <code>Stopped</code>. When you
     * stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.
     * </p>
     * 
     * @param stopTransformJobRequest
     * @return Result of the StopTransformJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.StopTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopTransformJob" target="_top">AWS API
     *      Documentation</a>
     */
    StopTransformJobResult stopTransformJob(StopTransformJobRequest stopTransformJobRequest);

    /**
     * <p>
     * Updates the specified Git repository with the specified values.
     * </p>
     * 
     * @param updateCodeRepositoryRequest
     * @return Result of the UpdateCodeRepository operation returned by the service.
     * @sample AmazonSageMaker.UpdateCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateCodeRepositoryResult updateCodeRepository(UpdateCodeRepositoryRequest updateCodeRepositoryRequest);

    /**
     * <p>
     * Updates a domain. Changes will impact all of the people in the domain.
     * </p>
     * 
     * @param updateDomainRequest
     * @return Result of the UpdateDomain operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.UpdateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDomainResult updateDomain(UpdateDomainRequest updateDomainRequest);

    /**
     * <p>
     * Deploys the new <code>EndpointConfig</code> specified in the request, switches to using newly created endpoint,
     * and then deletes resources provisioned for the endpoint using the previous <code>EndpointConfig</code> (there is
     * no availability loss).
     * </p>
     * <p>
     * When Amazon SageMaker receives the request, it sets the endpoint status to <code>Updating</code>. After updating
     * the endpoint, it sets the status to <code>InService</code>. To check the status of an endpoint, use the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_DescribeEndpoint.html">DescribeEndpoint</a> API.
     * </p>
     * <note>
     * <p>
     * You must not delete an <code>EndpointConfig</code> in use by an endpoint that is live or while the
     * <code>UpdateEndpoint</code> or <code>CreateEndpoint</code> operations are being performed on the endpoint. To
     * update an endpoint, you must create a new <code>EndpointConfig</code>.
     * </p>
     * </note>
     * 
     * @param updateEndpointRequest
     * @return Result of the UpdateEndpoint operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.UpdateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateEndpointResult updateEndpoint(UpdateEndpointRequest updateEndpointRequest);

    /**
     * <p>
     * Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant
     * associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to
     * <code>Updating</code>. After updating the endpoint, it sets the status to <code>InService</code>. To check the
     * status of an endpoint, use the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_DescribeEndpoint.html">DescribeEndpoint</a> API.
     * </p>
     * 
     * @param updateEndpointWeightsAndCapacitiesRequest
     * @return Result of the UpdateEndpointWeightsAndCapacities operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.UpdateEndpointWeightsAndCapacities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateEndpointWeightsAndCapacities"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEndpointWeightsAndCapacitiesResult updateEndpointWeightsAndCapacities(
            UpdateEndpointWeightsAndCapacitiesRequest updateEndpointWeightsAndCapacitiesRequest);

    /**
     * <p>
     * Adds, updates, or removes the description of an experiment. Updates the display name of an experiment.
     * </p>
     * 
     * @param updateExperimentRequest
     * @return Result of the UpdateExperiment operation returned by the service.
     * @throws ConflictException
     *         There was a conflict when you attempted to modify an experiment, trial, or trial component.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.UpdateExperiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateExperiment" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateExperimentResult updateExperiment(UpdateExperimentRequest updateExperimentRequest);

    /**
     * <p>
     * Updates a previously created schedule.
     * </p>
     * 
     * @param updateMonitoringScheduleRequest
     * @return Result of the UpdateMonitoringSchedule operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.UpdateMonitoringSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateMonitoringSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMonitoringScheduleResult updateMonitoringSchedule(UpdateMonitoringScheduleRequest updateMonitoringScheduleRequest);

    /**
     * <p>
     * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance
     * used for your notebook instance to accommodate changes in your workload requirements.
     * </p>
     * 
     * @param updateNotebookInstanceRequest
     * @return Result of the UpdateNotebookInstance operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.UpdateNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateNotebookInstanceResult updateNotebookInstance(UpdateNotebookInstanceRequest updateNotebookInstanceRequest);

    /**
     * <p>
     * Updates a notebook instance lifecycle configuration created with the <a>CreateNotebookInstanceLifecycleConfig</a>
     * API.
     * </p>
     * 
     * @param updateNotebookInstanceLifecycleConfigRequest
     * @return Result of the UpdateNotebookInstanceLifecycleConfig operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.UpdateNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateNotebookInstanceLifecycleConfigResult updateNotebookInstanceLifecycleConfig(
            UpdateNotebookInstanceLifecycleConfigRequest updateNotebookInstanceLifecycleConfigRequest);

    /**
     * <p>
     * Updates the display name of a trial.
     * </p>
     * 
     * @param updateTrialRequest
     * @return Result of the UpdateTrial operation returned by the service.
     * @throws ConflictException
     *         There was a conflict when you attempted to modify an experiment, trial, or trial component.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.UpdateTrial
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateTrial" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTrialResult updateTrial(UpdateTrialRequest updateTrialRequest);

    /**
     * <p>
     * Updates one or more properties of a trial component.
     * </p>
     * 
     * @param updateTrialComponentRequest
     * @return Result of the UpdateTrialComponent operation returned by the service.
     * @throws ConflictException
     *         There was a conflict when you attempted to modify an experiment, trial, or trial component.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.UpdateTrialComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateTrialComponent" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateTrialComponentResult updateTrialComponent(UpdateTrialComponentRequest updateTrialComponentRequest);

    /**
     * <p>
     * Updates a user profile.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @return Result of the UpdateUserProfile operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @throws ResourceInUseException
     *         Resource being accessed is in use.
     * @throws ResourceNotFoundException
     *         Resource being access is not found.
     * @sample AmazonSageMaker.UpdateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateUserProfileResult updateUserProfile(UpdateUserProfileRequest updateUserProfileRequest);

    /**
     * <p>
     * Restricts access to tasks assigned to workers in the specified workforce to those within specific ranges of IP
     * addresses. You specify allowed IP addresses by creating a list of up to four <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>.
     * </p>
     * <p>
     * By default, a workforce isn't restricted to specific IP addresses. If you specify a range of IP addresses,
     * workers who attempt to access tasks using any IP address outside the specified range are denied access and get a
     * <code>Not Found</code> error message on the worker portal. After restricting access with this operation, you can
     * see the allowed IP values for a private workforce with the operation.
     * </p>
     * <important>
     * <p>
     * This operation applies only to private workforces.
     * </p>
     * </important>
     * 
     * @param updateWorkforceRequest
     * @return Result of the UpdateWorkforce operation returned by the service.
     * @sample AmazonSageMaker.UpdateWorkforce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateWorkforce" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateWorkforceResult updateWorkforce(UpdateWorkforceRequest updateWorkforceRequest);

    /**
     * <p>
     * Updates an existing work team with new member definitions or description.
     * </p>
     * 
     * @param updateWorkteamRequest
     * @return Result of the UpdateWorkteam operation returned by the service.
     * @throws ResourceLimitExceededException
     *         You have exceeded an Amazon SageMaker resource limit. For example, you might have too many training jobs
     *         created.
     * @sample AmazonSageMaker.UpdateWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateWorkteamResult updateWorkteam(UpdateWorkteamRequest updateWorkteamRequest);

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

    AmazonSageMakerWaiters waiters();

}
