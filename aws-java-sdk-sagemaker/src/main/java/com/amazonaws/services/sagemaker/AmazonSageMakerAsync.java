/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.sagemaker.model.*;

/**
 * Interface for accessing SageMaker asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.sagemaker.AbstractAmazonSageMakerAsync} instead.
 * </p>
 * <p>
 * <p>
 * Provides APIs for creating and managing Amazon SageMaker resources.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSageMakerAsync extends AmazonSageMaker {

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook
     * instances, training jobs, hyperparameter tuning jobs, models, endpoint configurations, and endpoints.
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
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonSageMakerAsync.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook
     * instances, training jobs, hyperparameter tuning jobs, models, endpoint configurations, and endpoints.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTags operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.AddTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AddTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest addTagsRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler);

    /**
     * <p>
     * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
     * </p>
     * 
     * @param createAlgorithmRequest
     * @return A Java Future containing the result of the CreateAlgorithm operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAlgorithm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAlgorithmResult> createAlgorithmAsync(CreateAlgorithmRequest createAlgorithmRequest);

    /**
     * <p>
     * Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.
     * </p>
     * 
     * @param createAlgorithmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlgorithm operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAlgorithm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAlgorithmResult> createAlgorithmAsync(CreateAlgorithmRequest createAlgorithmRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAlgorithmRequest, CreateAlgorithmResult> asyncHandler);

    /**
     * <p>
     * Creates a Git repository as a resource in your Amazon SageMaker account. You can associate the repository with
     * notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a
     * resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it
     * persists independently from the lifecycle of any notebook instances it is associated with.
     * </p>
     * <p>
     * The repository can be hosted either in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository.
     * </p>
     * 
     * @param createCodeRepositoryRequest
     * @return A Java Future containing the result of the CreateCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCodeRepositoryResult> createCodeRepositoryAsync(CreateCodeRepositoryRequest createCodeRepositoryRequest);

    /**
     * <p>
     * Creates a Git repository as a resource in your Amazon SageMaker account. You can associate the repository with
     * notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a
     * resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it
     * persists independently from the lifecycle of any notebook instances it is associated with.
     * </p>
     * <p>
     * The repository can be hosted either in <a
     * href="http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html">AWS CodeCommit</a> or in any other Git
     * repository.
     * </p>
     * 
     * @param createCodeRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCodeRepositoryResult> createCodeRepositoryAsync(CreateCodeRepositoryRequest createCodeRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCodeRepositoryRequest, CreateCodeRepositoryResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateCompilationJob operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCompilationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCompilationJobResult> createCompilationJobAsync(CreateCompilationJobRequest createCompilationJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCompilationJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCompilationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateCompilationJobResult> createCompilationJobAsync(CreateCompilationJobRequest createCompilationJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCompilationJobRequest, CreateCompilationJobResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint
     * to provision resources and deploy models. You create the endpoint configuration with the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html">CreateEndpointConfig</a>
     * API.
     * </p>
     * <note>
     * <p>
     * Use this API only for hosting models using Amazon SageMaker hosting services.
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
     * For an example, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/ex1.html">Exercise 1: Using the
     * K-Means Algorithm Provided by Amazon SageMaker</a>.
     * </p>
     * <p>
     * If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS
     * Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your
     * IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS
     * for that region. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS i an AWS Region</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param createEndpointRequest
     * @return A Java Future containing the result of the CreateEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest createEndpointRequest);

    /**
     * <p>
     * Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint
     * to provision resources and deploy models. You create the endpoint configuration with the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html">CreateEndpointConfig</a>
     * API.
     * </p>
     * <note>
     * <p>
     * Use this API only for hosting models using Amazon SageMaker hosting services.
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
     * For an example, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/ex1.html">Exercise 1: Using the
     * K-Means Algorithm Provided by Amazon SageMaker</a>.
     * </p>
     * <p>
     * If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS
     * Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your
     * IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS
     * for that region. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS i an AWS Region</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param createEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest createEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEndpointRequest, CreateEndpointResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the
     * configuration, you identify one or more models, created using the <code>CreateModel</code> API, to deploy and the
     * resources that you want Amazon SageMaker to provision. Then you call the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> API.
     * </p>
     * <note>
     * <p>
     * Use this API only if you want to use Amazon SageMaker hosting services to deploy models into production.
     * </p>
     * </note>
     * <p>
     * In the request, you define one or more <code>ProductionVariant</code>s, each of which identifies a model. Each
     * <code>ProductionVariant</code> parameter also describes the resources that you want Amazon SageMaker to
     * provision. This includes the number and type of ML compute instances to deploy.
     * </p>
     * <p>
     * If you are hosting multiple models, you also assign a <code>VariantWeight</code> to specify how much traffic you
     * want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign
     * traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model
     * A, and one-third to model B.
     * </p>
     * 
     * @param createEndpointConfigRequest
     * @return A Java Future containing the result of the CreateEndpointConfig operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEndpointConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointConfigResult> createEndpointConfigAsync(CreateEndpointConfigRequest createEndpointConfigRequest);

    /**
     * <p>
     * Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the
     * configuration, you identify one or more models, created using the <code>CreateModel</code> API, to deploy and the
     * resources that you want Amazon SageMaker to provision. Then you call the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> API.
     * </p>
     * <note>
     * <p>
     * Use this API only if you want to use Amazon SageMaker hosting services to deploy models into production.
     * </p>
     * </note>
     * <p>
     * In the request, you define one or more <code>ProductionVariant</code>s, each of which identifies a model. Each
     * <code>ProductionVariant</code> parameter also describes the resources that you want Amazon SageMaker to
     * provision. This includes the number and type of ML compute instances to deploy.
     * </p>
     * <p>
     * If you are hosting multiple models, you also assign a <code>VariantWeight</code> to specify how much traffic you
     * want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign
     * traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model
     * A, and one-third to model B.
     * </p>
     * 
     * @param createEndpointConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEndpointConfig operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEndpointConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointConfigResult> createEndpointConfigAsync(CreateEndpointConfigRequest createEndpointConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEndpointConfigRequest, CreateEndpointConfigResult> asyncHandler);

    /**
     * <p>
     * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many
     * training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that
     * you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured
     * by an objective metric that you choose.
     * </p>
     * 
     * @param createHyperParameterTuningJobRequest
     * @return A Java Future containing the result of the CreateHyperParameterTuningJob operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.CreateHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateHyperParameterTuningJobResult> createHyperParameterTuningJobAsync(
            CreateHyperParameterTuningJobRequest createHyperParameterTuningJobRequest);

    /**
     * <p>
     * Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many
     * training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that
     * you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured
     * by an objective metric that you choose.
     * </p>
     * 
     * @param createHyperParameterTuningJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHyperParameterTuningJob operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.CreateHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateHyperParameterTuningJobResult> createHyperParameterTuningJobAsync(
            CreateHyperParameterTuningJobRequest createHyperParameterTuningJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHyperParameterTuningJobRequest, CreateHyperParameterTuningJobResult> asyncHandler);

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
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-automated-labeling.html">Using Automated Data
     * Labeling</a>.
     * </p>
     * <p>
     * The data objects to be labeled are contained in an Amazon S3 bucket. You create a <i>manifest file</i> that
     * describes the location of each object. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-data.html">Using Input and Output Data</a>.
     * </p>
     * <p>
     * The output can be used as the manifest file for another labeling job or as training data for your machine
     * learning models.
     * </p>
     * 
     * @param createLabelingJobRequest
     * @return A Java Future containing the result of the CreateLabelingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateLabelingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLabelingJobResult> createLabelingJobAsync(CreateLabelingJobRequest createLabelingJobRequest);

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
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-automated-labeling.html">Using Automated Data
     * Labeling</a>.
     * </p>
     * <p>
     * The data objects to be labeled are contained in an Amazon S3 bucket. You create a <i>manifest file</i> that
     * describes the location of each object. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-data.html">Using Input and Output Data</a>.
     * </p>
     * <p>
     * The output can be used as the manifest file for another labeling job or as training data for your machine
     * learning models.
     * </p>
     * 
     * @param createLabelingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLabelingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateLabelingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLabelingJobResult> createLabelingJobAsync(CreateLabelingJobRequest createLabelingJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLabelingJobRequest, CreateLabelingJobResult> asyncHandler);

    /**
     * <p>
     * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the
     * primary container, you specify the docker image containing inference code, artifacts (from prior training), and
     * custom environment map that the inference code uses when you deploy the model for predictions.
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
     * @return A Java Future containing the result of the CreateModel operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest createModelRequest);

    /**
     * <p>
     * Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the
     * primary container, you specify the docker image containing inference code, artifacts (from prior training), and
     * custom environment map that the inference code uses when you deploy the model for predictions.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModel operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest createModelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateModelPackage operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelPackageResult> createModelPackageAsync(CreateModelPackageRequest createModelPackageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModelPackage operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateModelPackageResult> createModelPackageAsync(CreateModelPackageRequest createModelPackageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelPackageRequest, CreateModelPackageResult> asyncHandler);

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
     * After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN).
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
     * @return A Java Future containing the result of the CreateNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNotebookInstanceResult> createNotebookInstanceAsync(CreateNotebookInstanceRequest createNotebookInstanceRequest);

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
     * After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN).
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNotebookInstanceResult> createNotebookInstanceAsync(CreateNotebookInstanceRequest createNotebookInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNotebookInstanceRequest, CreateNotebookInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsync.CreateNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNotebookInstanceLifecycleConfigResult> createNotebookInstanceLifecycleConfigAsync(
            CreateNotebookInstanceLifecycleConfigRequest createNotebookInstanceLifecycleConfigRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsyncHandler.CreateNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNotebookInstanceLifecycleConfigResult> createNotebookInstanceLifecycleConfigAsync(
            CreateNotebookInstanceLifecycleConfigRequest createNotebookInstanceLifecycleConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNotebookInstanceLifecycleConfigRequest, CreateNotebookInstanceLifecycleConfigResult> asyncHandler);

    /**
     * <p>
     * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker
     * console, when you choose <code>Open</code> next to a notebook instance, Amazon SageMaker opens a new tab showing
     * the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the
     * page.
     * </p>
     * <p>
     * You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. To
     * restrict access, attach an IAM policy that denies access to this API unless the call comes from an IP address in
     * the specified list to every AWS Identity and Access Management user, group, or role used to access the notebook
     * instance. Use the <code>NotIpAddress</code> condition operator and the <code>aws:SourceIP</code> condition
     * context key to specify the list of IP addresses that you want to have access to the notebook instance. For more
     * information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-ip-filter.html">Limit Access to a
     * Notebook Instance by IP Address</a>.
     * </p>
     * 
     * @param createPresignedNotebookInstanceUrlRequest
     * @return A Java Future containing the result of the CreatePresignedNotebookInstanceUrl operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.CreatePresignedNotebookInstanceUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePresignedNotebookInstanceUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePresignedNotebookInstanceUrlResult> createPresignedNotebookInstanceUrlAsync(
            CreatePresignedNotebookInstanceUrlRequest createPresignedNotebookInstanceUrlRequest);

    /**
     * <p>
     * Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker
     * console, when you choose <code>Open</code> next to a notebook instance, Amazon SageMaker opens a new tab showing
     * the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the
     * page.
     * </p>
     * <p>
     * You can restrict access to this API and to the URL that it returns to a list of IP addresses that you specify. To
     * restrict access, attach an IAM policy that denies access to this API unless the call comes from an IP address in
     * the specified list to every AWS Identity and Access Management user, group, or role used to access the notebook
     * instance. Use the <code>NotIpAddress</code> condition operator and the <code>aws:SourceIP</code> condition
     * context key to specify the list of IP addresses that you want to have access to the notebook instance. For more
     * information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/nbi-ip-filter.html">Limit Access to a
     * Notebook Instance by IP Address</a>.
     * </p>
     * 
     * @param createPresignedNotebookInstanceUrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePresignedNotebookInstanceUrl operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.CreatePresignedNotebookInstanceUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreatePresignedNotebookInstanceUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePresignedNotebookInstanceUrlResult> createPresignedNotebookInstanceUrlAsync(
            CreatePresignedNotebookInstanceUrlRequest createPresignedNotebookInstanceUrlRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePresignedNotebookInstanceUrlRequest, CreatePresignedNotebookInstanceUrlResult> asyncHandler);

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
     * <code>HyperParameters</code> - Specify these algorithm-specific parameters to influence the quality of the final
     * model. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InputDataConfig</code> - Describes the training dataset and the Amazon S3 location where it is stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutputDataConfig</code> - Identifies the Amazon S3 location where you want Amazon SageMaker to save the
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
     * <code>RoleARN</code> - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your
     * behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can
     * successfully complete model training.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StoppingCondition</code> - Sets a duration for training. Use this parameter to cap model training costs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How It Works</a>.
     * </p>
     * 
     * @param createTrainingJobRequest
     * @return A Java Future containing the result of the CreateTrainingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrainingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrainingJobResult> createTrainingJobAsync(CreateTrainingJobRequest createTrainingJobRequest);

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
     * <code>HyperParameters</code> - Specify these algorithm-specific parameters to influence the quality of the final
     * model. For a list of hyperparameters for each training algorithm provided by Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/algos.html">Algorithms</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InputDataConfig</code> - Describes the training dataset and the Amazon S3 location where it is stored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutputDataConfig</code> - Identifies the Amazon S3 location where you want Amazon SageMaker to save the
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
     * <code>RoleARN</code> - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your
     * behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can
     * successfully complete model training.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StoppingCondition</code> - Sets a duration for training. Use this parameter to cap model training costs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html">How It Works</a>.
     * </p>
     * 
     * @param createTrainingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrainingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrainingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrainingJobResult> createTrainingJobAsync(CreateTrainingJobRequest createTrainingJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrainingJobRequest, CreateTrainingJobResult> asyncHandler);

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
     * For more information about how batch transformation works Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform.html">How It Works</a>.
     * </p>
     * 
     * @param createTransformJobRequest
     * @return A Java Future containing the result of the CreateTransformJob operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTransformJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTransformJobResult> createTransformJobAsync(CreateTransformJobRequest createTransformJobRequest);

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
     * For more information about how batch transformation works Amazon SageMaker, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform.html">How It Works</a>.
     * </p>
     * 
     * @param createTransformJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTransformJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTransformJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTransformJobResult> createTransformJobAsync(CreateTransformJobRequest createTransformJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTransformJobRequest, CreateTransformJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsync.CreateWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkteamResult> createWorkteamAsync(CreateWorkteamRequest createWorkteamRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.CreateWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkteamResult> createWorkteamAsync(CreateWorkteamRequest createWorkteamRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkteamRequest, CreateWorkteamResult> asyncHandler);

    /**
     * <p>
     * Removes the specified algorithm from your account.
     * </p>
     * 
     * @param deleteAlgorithmRequest
     * @return A Java Future containing the result of the DeleteAlgorithm operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteAlgorithm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlgorithmResult> deleteAlgorithmAsync(DeleteAlgorithmRequest deleteAlgorithmRequest);

    /**
     * <p>
     * Removes the specified algorithm from your account.
     * </p>
     * 
     * @param deleteAlgorithmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlgorithm operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteAlgorithm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlgorithmResult> deleteAlgorithmAsync(DeleteAlgorithmRequest deleteAlgorithmRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAlgorithmRequest, DeleteAlgorithmResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Git repository from your account.
     * </p>
     * 
     * @param deleteCodeRepositoryRequest
     * @return A Java Future containing the result of the DeleteCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCodeRepositoryResult> deleteCodeRepositoryAsync(DeleteCodeRepositoryRequest deleteCodeRepositoryRequest);

    /**
     * <p>
     * Deletes the specified Git repository from your account.
     * </p>
     * 
     * @param deleteCodeRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCodeRepositoryResult> deleteCodeRepositoryAsync(DeleteCodeRepositoryRequest deleteCodeRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCodeRepositoryRequest, DeleteCodeRepositoryResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler);

    /**
     * <p>
     * Deletes an endpoint configuration. The <code>DeleteEndpointConfig</code> API deletes only the specified
     * configuration. It does not delete endpoints created using the configuration.
     * </p>
     * 
     * @param deleteEndpointConfigRequest
     * @return A Java Future containing the result of the DeleteEndpointConfig operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteEndpointConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointConfigResult> deleteEndpointConfigAsync(DeleteEndpointConfigRequest deleteEndpointConfigRequest);

    /**
     * <p>
     * Deletes an endpoint configuration. The <code>DeleteEndpointConfig</code> API deletes only the specified
     * configuration. It does not delete endpoints created using the configuration.
     * </p>
     * 
     * @param deleteEndpointConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEndpointConfig operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteEndpointConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointConfigResult> deleteEndpointConfigAsync(DeleteEndpointConfigRequest deleteEndpointConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEndpointConfigRequest, DeleteEndpointConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes a model. The <code>DeleteModel</code> API deletes only the model entry that was created in Amazon
     * SageMaker when you called the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateModel.html">CreateModel</a> API. It does not
     * delete model artifacts, inference code, or the IAM role that you specified when creating the model.
     * </p>
     * 
     * @param deleteModelRequest
     * @return A Java Future containing the result of the DeleteModel operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest deleteModelRequest);

    /**
     * <p>
     * Deletes a model. The <code>DeleteModel</code> API deletes only the model entry that was created in Amazon
     * SageMaker when you called the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateModel.html">CreateModel</a> API. It does not
     * delete model artifacts, inference code, or the IAM role that you specified when creating the model.
     * </p>
     * 
     * @param deleteModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModel operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest deleteModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, DeleteModelResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteModelPackage operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelPackageResult> deleteModelPackageAsync(DeleteModelPackageRequest deleteModelPackageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModelPackage operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelPackageResult> deleteModelPackageAsync(DeleteModelPackageRequest deleteModelPackageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelPackageRequest, DeleteModelPackageResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotebookInstanceResult> deleteNotebookInstanceAsync(DeleteNotebookInstanceRequest deleteNotebookInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotebookInstanceResult> deleteNotebookInstanceAsync(DeleteNotebookInstanceRequest deleteNotebookInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNotebookInstanceRequest, DeleteNotebookInstanceResult> asyncHandler);

    /**
     * <p>
     * Deletes a notebook instance lifecycle configuration.
     * </p>
     * 
     * @param deleteNotebookInstanceLifecycleConfigRequest
     * @return A Java Future containing the result of the DeleteNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsync.DeleteNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotebookInstanceLifecycleConfigResult> deleteNotebookInstanceLifecycleConfigAsync(
            DeleteNotebookInstanceLifecycleConfigRequest deleteNotebookInstanceLifecycleConfigRequest);

    /**
     * <p>
     * Deletes a notebook instance lifecycle configuration.
     * </p>
     * 
     * @param deleteNotebookInstanceLifecycleConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotebookInstanceLifecycleConfigResult> deleteNotebookInstanceLifecycleConfigAsync(
            DeleteNotebookInstanceLifecycleConfigRequest deleteNotebookInstanceLifecycleConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNotebookInstanceLifecycleConfigRequest, DeleteNotebookInstanceLifecycleConfigResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing work team. This operation can't be undone.
     * </p>
     * 
     * @param deleteWorkteamRequest
     * @return A Java Future containing the result of the DeleteWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsync.DeleteWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkteamResult> deleteWorkteamAsync(DeleteWorkteamRequest deleteWorkteamRequest);

    /**
     * <p>
     * Deletes an existing work team. This operation can't be undone.
     * </p>
     * 
     * @param deleteWorkteamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DeleteWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkteamResult> deleteWorkteamAsync(DeleteWorkteamRequest deleteWorkteamRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkteamRequest, DeleteWorkteamResult> asyncHandler);

    /**
     * <p>
     * Returns a description of the specified algorithm that is in your account.
     * </p>
     * 
     * @param describeAlgorithmRequest
     * @return A Java Future containing the result of the DescribeAlgorithm operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAlgorithm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlgorithmResult> describeAlgorithmAsync(DescribeAlgorithmRequest describeAlgorithmRequest);

    /**
     * <p>
     * Returns a description of the specified algorithm that is in your account.
     * </p>
     * 
     * @param describeAlgorithmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlgorithm operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAlgorithm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlgorithmResult> describeAlgorithmAsync(DescribeAlgorithmRequest describeAlgorithmRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAlgorithmRequest, DescribeAlgorithmResult> asyncHandler);

    /**
     * <p>
     * Gets details about the specified Git repository.
     * </p>
     * 
     * @param describeCodeRepositoryRequest
     * @return A Java Future containing the result of the DescribeCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeCodeRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCodeRepositoryResult> describeCodeRepositoryAsync(DescribeCodeRepositoryRequest describeCodeRepositoryRequest);

    /**
     * <p>
     * Gets details about the specified Git repository.
     * </p>
     * 
     * @param describeCodeRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeCodeRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCodeRepositoryResult> describeCodeRepositoryAsync(DescribeCodeRepositoryRequest describeCodeRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCodeRepositoryRequest, DescribeCodeRepositoryResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeCompilationJob operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeCompilationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCompilationJobResult> describeCompilationJobAsync(DescribeCompilationJobRequest describeCompilationJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCompilationJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeCompilationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCompilationJobResult> describeCompilationJobAsync(DescribeCompilationJobRequest describeCompilationJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCompilationJobRequest, DescribeCompilationJobResult> asyncHandler);

    /**
     * <p>
     * Returns the description of an endpoint.
     * </p>
     * 
     * @param describeEndpointRequest
     * @return A Java Future containing the result of the DescribeEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(DescribeEndpointRequest describeEndpointRequest);

    /**
     * <p>
     * Returns the description of an endpoint.
     * </p>
     * 
     * @param describeEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointResult> describeEndpointAsync(DescribeEndpointRequest describeEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointRequest, DescribeEndpointResult> asyncHandler);

    /**
     * <p>
     * Returns the description of an endpoint configuration created using the <code>CreateEndpointConfig</code> API.
     * </p>
     * 
     * @param describeEndpointConfigRequest
     * @return A Java Future containing the result of the DescribeEndpointConfig operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEndpointConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointConfigResult> describeEndpointConfigAsync(DescribeEndpointConfigRequest describeEndpointConfigRequest);

    /**
     * <p>
     * Returns the description of an endpoint configuration created using the <code>CreateEndpointConfig</code> API.
     * </p>
     * 
     * @param describeEndpointConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEndpointConfig operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeEndpointConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEndpointConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointConfigResult> describeEndpointConfigAsync(DescribeEndpointConfigRequest describeEndpointConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointConfigRequest, DescribeEndpointConfigResult> asyncHandler);

    /**
     * <p>
     * Gets a description of a hyperparameter tuning job.
     * </p>
     * 
     * @param describeHyperParameterTuningJobRequest
     * @return A Java Future containing the result of the DescribeHyperParameterTuningJob operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.DescribeHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHyperParameterTuningJobResult> describeHyperParameterTuningJobAsync(
            DescribeHyperParameterTuningJobRequest describeHyperParameterTuningJobRequest);

    /**
     * <p>
     * Gets a description of a hyperparameter tuning job.
     * </p>
     * 
     * @param describeHyperParameterTuningJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHyperParameterTuningJob operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.DescribeHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHyperParameterTuningJobResult> describeHyperParameterTuningJobAsync(
            DescribeHyperParameterTuningJobRequest describeHyperParameterTuningJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHyperParameterTuningJobRequest, DescribeHyperParameterTuningJobResult> asyncHandler);

    /**
     * <p>
     * Gets information about a labeling job.
     * </p>
     * 
     * @param describeLabelingJobRequest
     * @return A Java Future containing the result of the DescribeLabelingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeLabelingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLabelingJobResult> describeLabelingJobAsync(DescribeLabelingJobRequest describeLabelingJobRequest);

    /**
     * <p>
     * Gets information about a labeling job.
     * </p>
     * 
     * @param describeLabelingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLabelingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeLabelingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLabelingJobResult> describeLabelingJobAsync(DescribeLabelingJobRequest describeLabelingJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLabelingJobRequest, DescribeLabelingJobResult> asyncHandler);

    /**
     * <p>
     * Describes a model that you created using the <code>CreateModel</code> API.
     * </p>
     * 
     * @param describeModelRequest
     * @return A Java Future containing the result of the DescribeModel operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelResult> describeModelAsync(DescribeModelRequest describeModelRequest);

    /**
     * <p>
     * Describes a model that you created using the <code>CreateModel</code> API.
     * </p>
     * 
     * @param describeModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeModel operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelResult> describeModelAsync(DescribeModelRequest describeModelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeModelRequest, DescribeModelResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeModelPackage operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelPackageResult> describeModelPackageAsync(DescribeModelPackageRequest describeModelPackageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeModelPackage operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeModelPackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelPackage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelPackageResult> describeModelPackageAsync(DescribeModelPackageRequest describeModelPackageRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeModelPackageRequest, DescribeModelPackageResult> asyncHandler);

    /**
     * <p>
     * Returns information about a notebook instance.
     * </p>
     * 
     * @param describeNotebookInstanceRequest
     * @return A Java Future containing the result of the DescribeNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotebookInstanceResult> describeNotebookInstanceAsync(DescribeNotebookInstanceRequest describeNotebookInstanceRequest);

    /**
     * <p>
     * Returns information about a notebook instance.
     * </p>
     * 
     * @param describeNotebookInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotebookInstanceResult> describeNotebookInstanceAsync(DescribeNotebookInstanceRequest describeNotebookInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNotebookInstanceRequest, DescribeNotebookInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsync.DescribeNotebookInstanceLifecycleConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotebookInstanceLifecycleConfigResult> describeNotebookInstanceLifecycleConfigAsync(
            DescribeNotebookInstanceLifecycleConfigRequest describeNotebookInstanceLifecycleConfigRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeNotebookInstanceLifecycleConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotebookInstanceLifecycleConfigResult> describeNotebookInstanceLifecycleConfigAsync(
            DescribeNotebookInstanceLifecycleConfigRequest describeNotebookInstanceLifecycleConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNotebookInstanceLifecycleConfigRequest, DescribeNotebookInstanceLifecycleConfigResult> asyncHandler);

    /**
     * <p>
     * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor
     * in the AWS Marketplace.
     * </p>
     * 
     * @param describeSubscribedWorkteamRequest
     * @return A Java Future containing the result of the DescribeSubscribedWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeSubscribedWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeSubscribedWorkteam"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSubscribedWorkteamResult> describeSubscribedWorkteamAsync(
            DescribeSubscribedWorkteamRequest describeSubscribedWorkteamRequest);

    /**
     * <p>
     * Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor
     * in the AWS Marketplace.
     * </p>
     * 
     * @param describeSubscribedWorkteamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSubscribedWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeSubscribedWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeSubscribedWorkteam"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSubscribedWorkteamResult> describeSubscribedWorkteamAsync(
            DescribeSubscribedWorkteamRequest describeSubscribedWorkteamRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSubscribedWorkteamRequest, DescribeSubscribedWorkteamResult> asyncHandler);

    /**
     * <p>
     * Returns information about a training job.
     * </p>
     * 
     * @param describeTrainingJobRequest
     * @return A Java Future containing the result of the DescribeTrainingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrainingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrainingJobResult> describeTrainingJobAsync(DescribeTrainingJobRequest describeTrainingJobRequest);

    /**
     * <p>
     * Returns information about a training job.
     * </p>
     * 
     * @param describeTrainingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTrainingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrainingJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrainingJobResult> describeTrainingJobAsync(DescribeTrainingJobRequest describeTrainingJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrainingJobRequest, DescribeTrainingJobResult> asyncHandler);

    /**
     * <p>
     * Returns information about a transform job.
     * </p>
     * 
     * @param describeTransformJobRequest
     * @return A Java Future containing the result of the DescribeTransformJob operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTransformJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTransformJobResult> describeTransformJobAsync(DescribeTransformJobRequest describeTransformJobRequest);

    /**
     * <p>
     * Returns information about a transform job.
     * </p>
     * 
     * @param describeTransformJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTransformJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTransformJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTransformJobResult> describeTransformJobAsync(DescribeTransformJobRequest describeTransformJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTransformJobRequest, DescribeTransformJobResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specific work team. You can see information such as the create date, the last updated
     * date, membership information, and the work team's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeWorkteamRequest
     * @return A Java Future containing the result of the DescribeWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsync.DescribeWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkteamResult> describeWorkteamAsync(DescribeWorkteamRequest describeWorkteamRequest);

    /**
     * <p>
     * Gets information about a specific work team. You can see information such as the create date, the last updated
     * date, membership information, and the work team's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeWorkteamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.DescribeWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeWorkteamResult> describeWorkteamAsync(DescribeWorkteamRequest describeWorkteamRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkteamRequest, DescribeWorkteamResult> asyncHandler);

    /**
     * <p>
     * An auto-complete API for the search functionality in the Amazon SageMaker console. It returns suggestions of
     * possible matches for the property name to use in <code>Search</code> queries. Provides suggestions for
     * <code>HyperParameters</code>, <code>Tags</code>, and <code>Metrics</code>.
     * </p>
     * 
     * @param getSearchSuggestionsRequest
     * @return A Java Future containing the result of the GetSearchSuggestions operation returned by the service.
     * @sample AmazonSageMakerAsync.GetSearchSuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetSearchSuggestions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSearchSuggestionsResult> getSearchSuggestionsAsync(GetSearchSuggestionsRequest getSearchSuggestionsRequest);

    /**
     * <p>
     * An auto-complete API for the search functionality in the Amazon SageMaker console. It returns suggestions of
     * possible matches for the property name to use in <code>Search</code> queries. Provides suggestions for
     * <code>HyperParameters</code>, <code>Tags</code>, and <code>Metrics</code>.
     * </p>
     * 
     * @param getSearchSuggestionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSearchSuggestions operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.GetSearchSuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetSearchSuggestions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSearchSuggestionsResult> getSearchSuggestionsAsync(GetSearchSuggestionsRequest getSearchSuggestionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSearchSuggestionsRequest, GetSearchSuggestionsResult> asyncHandler);

    /**
     * <p>
     * Lists the machine learning algorithms that have been created.
     * </p>
     * 
     * @param listAlgorithmsRequest
     * @return A Java Future containing the result of the ListAlgorithms operation returned by the service.
     * @sample AmazonSageMakerAsync.ListAlgorithms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAlgorithms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAlgorithmsResult> listAlgorithmsAsync(ListAlgorithmsRequest listAlgorithmsRequest);

    /**
     * <p>
     * Lists the machine learning algorithms that have been created.
     * </p>
     * 
     * @param listAlgorithmsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAlgorithms operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListAlgorithms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAlgorithms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAlgorithmsResult> listAlgorithmsAsync(ListAlgorithmsRequest listAlgorithmsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAlgorithmsRequest, ListAlgorithmsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the Git repositories in your account.
     * </p>
     * 
     * @param listCodeRepositoriesRequest
     * @return A Java Future containing the result of the ListCodeRepositories operation returned by the service.
     * @sample AmazonSageMakerAsync.ListCodeRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCodeRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCodeRepositoriesResult> listCodeRepositoriesAsync(ListCodeRepositoriesRequest listCodeRepositoriesRequest);

    /**
     * <p>
     * Gets a list of the Git repositories in your account.
     * </p>
     * 
     * @param listCodeRepositoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCodeRepositories operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListCodeRepositories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCodeRepositories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCodeRepositoriesResult> listCodeRepositoriesAsync(ListCodeRepositoriesRequest listCodeRepositoriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCodeRepositoriesRequest, ListCodeRepositoriesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListCompilationJobs operation returned by the service.
     * @sample AmazonSageMakerAsync.ListCompilationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCompilationJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCompilationJobsResult> listCompilationJobsAsync(ListCompilationJobsRequest listCompilationJobsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCompilationJobs operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListCompilationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCompilationJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCompilationJobsResult> listCompilationJobsAsync(ListCompilationJobsRequest listCompilationJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCompilationJobsRequest, ListCompilationJobsResult> asyncHandler);

    /**
     * <p>
     * Lists endpoint configurations.
     * </p>
     * 
     * @param listEndpointConfigsRequest
     * @return A Java Future containing the result of the ListEndpointConfigs operation returned by the service.
     * @sample AmazonSageMakerAsync.ListEndpointConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEndpointConfigs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointConfigsResult> listEndpointConfigsAsync(ListEndpointConfigsRequest listEndpointConfigsRequest);

    /**
     * <p>
     * Lists endpoint configurations.
     * </p>
     * 
     * @param listEndpointConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEndpointConfigs operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListEndpointConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEndpointConfigs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointConfigsResult> listEndpointConfigsAsync(ListEndpointConfigsRequest listEndpointConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEndpointConfigsRequest, ListEndpointConfigsResult> asyncHandler);

    /**
     * <p>
     * Lists endpoints.
     * </p>
     * 
     * @param listEndpointsRequest
     * @return A Java Future containing the result of the ListEndpoints operation returned by the service.
     * @sample AmazonSageMakerAsync.ListEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointsResult> listEndpointsAsync(ListEndpointsRequest listEndpointsRequest);

    /**
     * <p>
     * Lists endpoints.
     * </p>
     * 
     * @param listEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEndpoints operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointsResult> listEndpointsAsync(ListEndpointsRequest listEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEndpointsRequest, ListEndpointsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of <a>HyperParameterTuningJobSummary</a> objects that describe the hyperparameter tuning jobs
     * launched in your account.
     * </p>
     * 
     * @param listHyperParameterTuningJobsRequest
     * @return A Java Future containing the result of the ListHyperParameterTuningJobs operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.ListHyperParameterTuningJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHyperParameterTuningJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListHyperParameterTuningJobsResult> listHyperParameterTuningJobsAsync(
            ListHyperParameterTuningJobsRequest listHyperParameterTuningJobsRequest);

    /**
     * <p>
     * Gets a list of <a>HyperParameterTuningJobSummary</a> objects that describe the hyperparameter tuning jobs
     * launched in your account.
     * </p>
     * 
     * @param listHyperParameterTuningJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHyperParameterTuningJobs operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.ListHyperParameterTuningJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHyperParameterTuningJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListHyperParameterTuningJobsResult> listHyperParameterTuningJobsAsync(
            ListHyperParameterTuningJobsRequest listHyperParameterTuningJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListHyperParameterTuningJobsRequest, ListHyperParameterTuningJobsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of labeling jobs.
     * </p>
     * 
     * @param listLabelingJobsRequest
     * @return A Java Future containing the result of the ListLabelingJobs operation returned by the service.
     * @sample AmazonSageMakerAsync.ListLabelingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListLabelingJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLabelingJobsResult> listLabelingJobsAsync(ListLabelingJobsRequest listLabelingJobsRequest);

    /**
     * <p>
     * Gets a list of labeling jobs.
     * </p>
     * 
     * @param listLabelingJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLabelingJobs operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListLabelingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListLabelingJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLabelingJobsResult> listLabelingJobsAsync(ListLabelingJobsRequest listLabelingJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLabelingJobsRequest, ListLabelingJobsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of labeling jobs assigned to a specified work team.
     * </p>
     * 
     * @param listLabelingJobsForWorkteamRequest
     * @return A Java Future containing the result of the ListLabelingJobsForWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsync.ListLabelingJobsForWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListLabelingJobsForWorkteam"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLabelingJobsForWorkteamResult> listLabelingJobsForWorkteamAsync(
            ListLabelingJobsForWorkteamRequest listLabelingJobsForWorkteamRequest);

    /**
     * <p>
     * Gets a list of labeling jobs assigned to a specified work team.
     * </p>
     * 
     * @param listLabelingJobsForWorkteamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLabelingJobsForWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListLabelingJobsForWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListLabelingJobsForWorkteam"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLabelingJobsForWorkteamResult> listLabelingJobsForWorkteamAsync(
            ListLabelingJobsForWorkteamRequest listLabelingJobsForWorkteamRequest,
            com.amazonaws.handlers.AsyncHandler<ListLabelingJobsForWorkteamRequest, ListLabelingJobsForWorkteamResult> asyncHandler);

    /**
     * <p>
     * Lists the model packages that have been created.
     * </p>
     * 
     * @param listModelPackagesRequest
     * @return A Java Future containing the result of the ListModelPackages operation returned by the service.
     * @sample AmazonSageMakerAsync.ListModelPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelPackages" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListModelPackagesResult> listModelPackagesAsync(ListModelPackagesRequest listModelPackagesRequest);

    /**
     * <p>
     * Lists the model packages that have been created.
     * </p>
     * 
     * @param listModelPackagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListModelPackages operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListModelPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelPackages" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListModelPackagesResult> listModelPackagesAsync(ListModelPackagesRequest listModelPackagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListModelPackagesRequest, ListModelPackagesResult> asyncHandler);

    /**
     * <p>
     * Lists models created with the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateModel.html">CreateModel</a> API.
     * </p>
     * 
     * @param listModelsRequest
     * @return A Java Future containing the result of the ListModels operation returned by the service.
     * @sample AmazonSageMakerAsync.ListModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListModelsResult> listModelsAsync(ListModelsRequest listModelsRequest);

    /**
     * <p>
     * Lists models created with the <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateModel.html">CreateModel</a> API.
     * </p>
     * 
     * @param listModelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListModels operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListModelsResult> listModelsAsync(ListModelsRequest listModelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListModelsRequest, ListModelsResult> asyncHandler);

    /**
     * <p>
     * Lists notebook instance lifestyle configurations created with the <a>CreateNotebookInstanceLifecycleConfig</a>
     * API.
     * </p>
     * 
     * @param listNotebookInstanceLifecycleConfigsRequest
     * @return A Java Future containing the result of the ListNotebookInstanceLifecycleConfigs operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.ListNotebookInstanceLifecycleConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListNotebookInstanceLifecycleConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotebookInstanceLifecycleConfigsResult> listNotebookInstanceLifecycleConfigsAsync(
            ListNotebookInstanceLifecycleConfigsRequest listNotebookInstanceLifecycleConfigsRequest);

    /**
     * <p>
     * Lists notebook instance lifestyle configurations created with the <a>CreateNotebookInstanceLifecycleConfig</a>
     * API.
     * </p>
     * 
     * @param listNotebookInstanceLifecycleConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNotebookInstanceLifecycleConfigs operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.ListNotebookInstanceLifecycleConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListNotebookInstanceLifecycleConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotebookInstanceLifecycleConfigsResult> listNotebookInstanceLifecycleConfigsAsync(
            ListNotebookInstanceLifecycleConfigsRequest listNotebookInstanceLifecycleConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListNotebookInstanceLifecycleConfigsRequest, ListNotebookInstanceLifecycleConfigsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region.
     * </p>
     * 
     * @param listNotebookInstancesRequest
     * @return A Java Future containing the result of the ListNotebookInstances operation returned by the service.
     * @sample AmazonSageMakerAsync.ListNotebookInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListNotebookInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotebookInstancesResult> listNotebookInstancesAsync(ListNotebookInstancesRequest listNotebookInstancesRequest);

    /**
     * <p>
     * Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region.
     * </p>
     * 
     * @param listNotebookInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNotebookInstances operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListNotebookInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListNotebookInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNotebookInstancesResult> listNotebookInstancesAsync(ListNotebookInstancesRequest listNotebookInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListNotebookInstancesRequest, ListNotebookInstancesResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work
     * team satisfies the filter specified in the <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listSubscribedWorkteamsRequest
     * @return A Java Future containing the result of the ListSubscribedWorkteams operation returned by the service.
     * @sample AmazonSageMakerAsync.ListSubscribedWorkteams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListSubscribedWorkteams"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscribedWorkteamsResult> listSubscribedWorkteamsAsync(ListSubscribedWorkteamsRequest listSubscribedWorkteamsRequest);

    /**
     * <p>
     * Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work
     * team satisfies the filter specified in the <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listSubscribedWorkteamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSubscribedWorkteams operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListSubscribedWorkteams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListSubscribedWorkteams"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscribedWorkteamsResult> listSubscribedWorkteamsAsync(ListSubscribedWorkteamsRequest listSubscribedWorkteamsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSubscribedWorkteamsRequest, ListSubscribedWorkteamsResult> asyncHandler);

    /**
     * <p>
     * Returns the tags for the specified Amazon SageMaker resource.
     * </p>
     * 
     * @param listTagsRequest
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonSageMakerAsync.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Returns the tags for the specified Amazon SageMaker resource.
     * </p>
     * 
     * @param listTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

    /**
     * <p>
     * Lists training jobs.
     * </p>
     * 
     * @param listTrainingJobsRequest
     * @return A Java Future containing the result of the ListTrainingJobs operation returned by the service.
     * @sample AmazonSageMakerAsync.ListTrainingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrainingJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTrainingJobsResult> listTrainingJobsAsync(ListTrainingJobsRequest listTrainingJobsRequest);

    /**
     * <p>
     * Lists training jobs.
     * </p>
     * 
     * @param listTrainingJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrainingJobs operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListTrainingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrainingJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTrainingJobsResult> listTrainingJobsAsync(ListTrainingJobsRequest listTrainingJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrainingJobsRequest, ListTrainingJobsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of <a>TrainingJobSummary</a> objects that describe the training jobs that a hyperparameter tuning job
     * launched.
     * </p>
     * 
     * @param listTrainingJobsForHyperParameterTuningJobRequest
     * @return A Java Future containing the result of the ListTrainingJobsForHyperParameterTuningJob operation returned
     *         by the service.
     * @sample AmazonSageMakerAsync.ListTrainingJobsForHyperParameterTuningJob
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrainingJobsForHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrainingJobsForHyperParameterTuningJobResult> listTrainingJobsForHyperParameterTuningJobAsync(
            ListTrainingJobsForHyperParameterTuningJobRequest listTrainingJobsForHyperParameterTuningJobRequest);

    /**
     * <p>
     * Gets a list of <a>TrainingJobSummary</a> objects that describe the training jobs that a hyperparameter tuning job
     * launched.
     * </p>
     * 
     * @param listTrainingJobsForHyperParameterTuningJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrainingJobsForHyperParameterTuningJob operation returned
     *         by the service.
     * @sample AmazonSageMakerAsyncHandler.ListTrainingJobsForHyperParameterTuningJob
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrainingJobsForHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrainingJobsForHyperParameterTuningJobResult> listTrainingJobsForHyperParameterTuningJobAsync(
            ListTrainingJobsForHyperParameterTuningJobRequest listTrainingJobsForHyperParameterTuningJobRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrainingJobsForHyperParameterTuningJobRequest, ListTrainingJobsForHyperParameterTuningJobResult> asyncHandler);

    /**
     * <p>
     * Lists transform jobs.
     * </p>
     * 
     * @param listTransformJobsRequest
     * @return A Java Future containing the result of the ListTransformJobs operation returned by the service.
     * @sample AmazonSageMakerAsync.ListTransformJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTransformJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTransformJobsResult> listTransformJobsAsync(ListTransformJobsRequest listTransformJobsRequest);

    /**
     * <p>
     * Lists transform jobs.
     * </p>
     * 
     * @param listTransformJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTransformJobs operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListTransformJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTransformJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTransformJobsResult> listTransformJobsAsync(ListTransformJobsRequest listTransformJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTransformJobsRequest, ListTransformJobsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the
     * filter specified in the <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listWorkteamsRequest
     * @return A Java Future containing the result of the ListWorkteams operation returned by the service.
     * @sample AmazonSageMakerAsync.ListWorkteams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListWorkteams" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkteamsResult> listWorkteamsAsync(ListWorkteamsRequest listWorkteamsRequest);

    /**
     * <p>
     * Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the
     * filter specified in the <code>NameContains</code> parameter.
     * </p>
     * 
     * @param listWorkteamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkteams operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.ListWorkteams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListWorkteams" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkteamsResult> listWorkteamsAsync(ListWorkteamsRequest listWorkteamsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkteamsRequest, ListWorkteamsResult> asyncHandler);

    /**
     * <p>
     * Renders the UI template so that you can preview the worker's experience.
     * </p>
     * 
     * @param renderUiTemplateRequest
     * @return A Java Future containing the result of the RenderUiTemplate operation returned by the service.
     * @sample AmazonSageMakerAsync.RenderUiTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RenderUiTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RenderUiTemplateResult> renderUiTemplateAsync(RenderUiTemplateRequest renderUiTemplateRequest);

    /**
     * <p>
     * Renders the UI template so that you can preview the worker's experience.
     * </p>
     * 
     * @param renderUiTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RenderUiTemplate operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.RenderUiTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RenderUiTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RenderUiTemplateResult> renderUiTemplateAsync(RenderUiTemplateRequest renderUiTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<RenderUiTemplateRequest, RenderUiTemplateResult> asyncHandler);

    /**
     * <p>
     * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of
     * <code>SearchResult</code> objects in the response. You can sort the search results by any resource property in a
     * ascending or descending order.
     * </p>
     * <p>
     * You can query against the following value types: numerical, text, Booleans, and timestamps.
     * </p>
     * 
     * @param searchRequest
     * @return A Java Future containing the result of the Search operation returned by the service.
     * @sample AmazonSageMakerAsync.Search
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Search" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest searchRequest);

    /**
     * <p>
     * Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of
     * <code>SearchResult</code> objects in the response. You can sort the search results by any resource property in a
     * ascending or descending order.
     * </p>
     * <p>
     * You can query against the following value types: numerical, text, Booleans, and timestamps.
     * </p>
     * 
     * @param searchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Search operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.Search
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Search" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest searchRequest,
            com.amazonaws.handlers.AsyncHandler<SearchRequest, SearchResult> asyncHandler);

    /**
     * <p>
     * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume.
     * After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to
     * <code>InService</code>. A notebook instance's status must be <code>InService</code> before you can connect to
     * your Jupyter notebook.
     * </p>
     * 
     * @param startNotebookInstanceRequest
     * @return A Java Future containing the result of the StartNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsync.StartNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StartNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartNotebookInstanceResult> startNotebookInstanceAsync(StartNotebookInstanceRequest startNotebookInstanceRequest);

    /**
     * <p>
     * Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume.
     * After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to
     * <code>InService</code>. A notebook instance's status must be <code>InService</code> before you can connect to
     * your Jupyter notebook.
     * </p>
     * 
     * @param startNotebookInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StartNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StartNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartNotebookInstanceResult> startNotebookInstanceAsync(StartNotebookInstanceRequest startNotebookInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StartNotebookInstanceRequest, StartNotebookInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the StopCompilationJob operation returned by the service.
     * @sample AmazonSageMakerAsync.StopCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopCompilationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopCompilationJobResult> stopCompilationJobAsync(StopCompilationJobRequest stopCompilationJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopCompilationJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopCompilationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopCompilationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopCompilationJobResult> stopCompilationJobAsync(StopCompilationJobRequest stopCompilationJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopCompilationJobRequest, StopCompilationJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the StopHyperParameterTuningJob operation returned by the service.
     * @sample AmazonSageMakerAsync.StopHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopHyperParameterTuningJobResult> stopHyperParameterTuningJobAsync(
            StopHyperParameterTuningJobRequest stopHyperParameterTuningJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopHyperParameterTuningJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopHyperParameterTuningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopHyperParameterTuningJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopHyperParameterTuningJobResult> stopHyperParameterTuningJobAsync(
            StopHyperParameterTuningJobRequest stopHyperParameterTuningJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopHyperParameterTuningJobRequest, StopHyperParameterTuningJobResult> asyncHandler);

    /**
     * <p>
     * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is
     * stopped are placed in the Amazon S3 output bucket.
     * </p>
     * 
     * @param stopLabelingJobRequest
     * @return A Java Future containing the result of the StopLabelingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.StopLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopLabelingJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopLabelingJobResult> stopLabelingJobAsync(StopLabelingJobRequest stopLabelingJobRequest);

    /**
     * <p>
     * Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is
     * stopped are placed in the Amazon S3 output bucket.
     * </p>
     * 
     * @param stopLabelingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopLabelingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopLabelingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopLabelingJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopLabelingJobResult> stopLabelingJobAsync(StopLabelingJobRequest stopLabelingJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopLabelingJobRequest, StopLabelingJobResult> asyncHandler);

    /**
     * <p>
     * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage
     * volume from it. Amazon SageMaker preserves the ML storage volume.
     * </p>
     * <p>
     * To access data on the ML storage volume for a notebook instance that has been terminated, call the
     * <code>StartNotebookInstance</code> API. <code>StartNotebookInstance</code> launches another ML compute instance,
     * configures it, and attaches the preserved ML storage volume so you can continue your work.
     * </p>
     * 
     * @param stopNotebookInstanceRequest
     * @return A Java Future containing the result of the StopNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsync.StopNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopNotebookInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopNotebookInstanceResult> stopNotebookInstanceAsync(StopNotebookInstanceRequest stopNotebookInstanceRequest);

    /**
     * <p>
     * Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage
     * volume from it. Amazon SageMaker preserves the ML storage volume.
     * </p>
     * <p>
     * To access data on the ML storage volume for a notebook instance that has been terminated, call the
     * <code>StartNotebookInstance</code> API. <code>StartNotebookInstance</code> launches another ML compute instance,
     * configures it, and attaches the preserved ML storage volume so you can continue your work.
     * </p>
     * 
     * @param stopNotebookInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopNotebookInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopNotebookInstanceResult> stopNotebookInstanceAsync(StopNotebookInstanceRequest stopNotebookInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StopNotebookInstanceRequest, StopNotebookInstanceResult> asyncHandler);

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
     * @return A Java Future containing the result of the StopTrainingJob operation returned by the service.
     * @sample AmazonSageMakerAsync.StopTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopTrainingJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopTrainingJobResult> stopTrainingJobAsync(StopTrainingJobRequest stopTrainingJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopTrainingJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopTrainingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopTrainingJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopTrainingJobResult> stopTrainingJobAsync(StopTrainingJobRequest stopTrainingJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopTrainingJobRequest, StopTrainingJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the StopTransformJob operation returned by the service.
     * @sample AmazonSageMakerAsync.StopTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopTransformJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopTransformJobResult> stopTransformJobAsync(StopTransformJobRequest stopTransformJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopTransformJob operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.StopTransformJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopTransformJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopTransformJobResult> stopTransformJobAsync(StopTransformJobRequest stopTransformJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopTransformJobRequest, StopTransformJobResult> asyncHandler);

    /**
     * <p>
     * Updates the specified Git repository with the specified values.
     * </p>
     * 
     * @param updateCodeRepositoryRequest
     * @return A Java Future containing the result of the UpdateCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCodeRepositoryResult> updateCodeRepositoryAsync(UpdateCodeRepositoryRequest updateCodeRepositoryRequest);

    /**
     * <p>
     * Updates the specified Git repository with the specified values.
     * </p>
     * 
     * @param updateCodeRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCodeRepository operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateCodeRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateCodeRepository" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCodeRepositoryResult> updateCodeRepositoryAsync(UpdateCodeRepositoryRequest updateCodeRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCodeRepositoryRequest, UpdateCodeRepositoryResult> asyncHandler);

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
     * You cannot update an endpoint with the current <code>EndpointConfig</code>. To update an endpoint, you must
     * create a new <code>EndpointConfig</code>.
     * </p>
     * </note>
     * 
     * @param updateEndpointRequest
     * @return A Java Future containing the result of the UpdateEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest updateEndpointRequest);

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
     * You cannot update an endpoint with the current <code>EndpointConfig</code>. To update an endpoint, you must
     * create a new <code>EndpointConfig</code>.
     * </p>
     * </note>
     * 
     * @param updateEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEndpoint operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest updateEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEndpointRequest, UpdateEndpointResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateEndpointWeightsAndCapacities operation returned by the
     *         service.
     * @sample AmazonSageMakerAsync.UpdateEndpointWeightsAndCapacities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateEndpointWeightsAndCapacities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointWeightsAndCapacitiesResult> updateEndpointWeightsAndCapacitiesAsync(
            UpdateEndpointWeightsAndCapacitiesRequest updateEndpointWeightsAndCapacitiesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEndpointWeightsAndCapacities operation returned by the
     *         service.
     * @sample AmazonSageMakerAsyncHandler.UpdateEndpointWeightsAndCapacities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateEndpointWeightsAndCapacities"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointWeightsAndCapacitiesResult> updateEndpointWeightsAndCapacitiesAsync(
            UpdateEndpointWeightsAndCapacitiesRequest updateEndpointWeightsAndCapacitiesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEndpointWeightsAndCapacitiesRequest, UpdateEndpointWeightsAndCapacitiesResult> asyncHandler);

    /**
     * <p>
     * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance
     * used for your notebook instance to accommodate changes in your workload requirements. You can also update the VPC
     * security groups.
     * </p>
     * 
     * @param updateNotebookInstanceRequest
     * @return A Java Future containing the result of the UpdateNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotebookInstanceResult> updateNotebookInstanceAsync(UpdateNotebookInstanceRequest updateNotebookInstanceRequest);

    /**
     * <p>
     * Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance
     * used for your notebook instance to accommodate changes in your workload requirements. You can also update the VPC
     * security groups.
     * </p>
     * 
     * @param updateNotebookInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNotebookInstance operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateNotebookInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateNotebookInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotebookInstanceResult> updateNotebookInstanceAsync(UpdateNotebookInstanceRequest updateNotebookInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNotebookInstanceRequest, UpdateNotebookInstanceResult> asyncHandler);

    /**
     * <p>
     * Updates a notebook instance lifecycle configuration created with the <a>CreateNotebookInstanceLifecycleConfig</a>
     * API.
     * </p>
     * 
     * @param updateNotebookInstanceLifecycleConfigRequest
     * @return A Java Future containing the result of the UpdateNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsync.UpdateNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotebookInstanceLifecycleConfigResult> updateNotebookInstanceLifecycleConfigAsync(
            UpdateNotebookInstanceLifecycleConfigRequest updateNotebookInstanceLifecycleConfigRequest);

    /**
     * <p>
     * Updates a notebook instance lifecycle configuration created with the <a>CreateNotebookInstanceLifecycleConfig</a>
     * API.
     * </p>
     * 
     * @param updateNotebookInstanceLifecycleConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNotebookInstanceLifecycleConfig operation returned by
     *         the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateNotebookInstanceLifecycleConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateNotebookInstanceLifecycleConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotebookInstanceLifecycleConfigResult> updateNotebookInstanceLifecycleConfigAsync(
            UpdateNotebookInstanceLifecycleConfigRequest updateNotebookInstanceLifecycleConfigRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNotebookInstanceLifecycleConfigRequest, UpdateNotebookInstanceLifecycleConfigResult> asyncHandler);

    /**
     * <p>
     * Updates an existing work team with new member definitions or description.
     * </p>
     * 
     * @param updateWorkteamRequest
     * @return A Java Future containing the result of the UpdateWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsync.UpdateWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkteamResult> updateWorkteamAsync(UpdateWorkteamRequest updateWorkteamRequest);

    /**
     * <p>
     * Updates an existing work team with new member definitions or description.
     * </p>
     * 
     * @param updateWorkteamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkteam operation returned by the service.
     * @sample AmazonSageMakerAsyncHandler.UpdateWorkteam
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateWorkteam" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkteamResult> updateWorkteamAsync(UpdateWorkteamRequest updateWorkteamRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkteamRequest, UpdateWorkteamResult> asyncHandler);

}
