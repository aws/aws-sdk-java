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
package com.amazonaws.services.lookoutequipment;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.lookoutequipment.model.*;

/**
 * Interface for accessing LookoutEquipment.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lookoutequipment.AbstractAmazonLookoutEquipment} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Lookout for Equipment is a machine learning service that uses advanced analytics to identify anomalies in
 * machines from sensor data for use in predictive maintenance.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLookoutEquipment {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "lookoutequipment";

    /**
     * <p>
     * Creates a container for a collection of data being ingested for analysis. The dataset contains the metadata
     * describing where the data is and what the data actually looks like. For example, it contains the location of the
     * data source, the data schema, and other information. A dataset also contains any tags associated with the
     * ingested data.
     * </p>
     * 
     * @param createDatasetRequest
     * @return Result of the CreateDataset operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateDataset" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDatasetResult createDataset(CreateDatasetRequest createDatasetRequest);

    /**
     * <p>
     * Creates a scheduled inference. Scheduling an inference is setting up a continuous real-time inference plan to
     * analyze new measurement data. When setting up the schedule, you provide an S3 bucket location for the input data,
     * assign it a delimiter between separate entries in the data, set an offset delay if desired, and set the frequency
     * of inferencing. You must also provide an S3 bucket location for the output data.
     * </p>
     * 
     * @param createInferenceSchedulerRequest
     * @return Result of the CreateInferenceScheduler operation returned by the service.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.CreateInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    CreateInferenceSchedulerResult createInferenceScheduler(CreateInferenceSchedulerRequest createInferenceSchedulerRequest);

    /**
     * <p>
     * Creates a label for an event.
     * </p>
     * 
     * @param createLabelRequest
     * @return Result of the CreateLabel operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.CreateLabel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateLabel" target="_top">AWS
     *      API Documentation</a>
     */
    CreateLabelResult createLabel(CreateLabelRequest createLabelRequest);

    /**
     * <p>
     * Creates a group of labels.
     * </p>
     * 
     * @param createLabelGroupRequest
     * @return Result of the CreateLabelGroup operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.CreateLabelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateLabelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateLabelGroupResult createLabelGroup(CreateLabelGroupRequest createLabelGroupRequest);

    /**
     * <p>
     * Creates a machine learning model for data inference.
     * </p>
     * <p>
     * A machine-learning (ML) model is a mathematical model that finds patterns in your data. In Amazon Lookout for
     * Equipment, the model learns the patterns of normal behavior and detects abnormal behavior that could be potential
     * equipment failure (or maintenance events). The models are made by analyzing normal data and abnormalities in
     * machine behavior that have already occurred.
     * </p>
     * <p>
     * Your model is trained using a portion of the data from your dataset and uses that data to learn patterns of
     * normal behavior and abnormal patterns that lead to equipment failure. Another portion of the data is used to
     * evaluate the model's accuracy.
     * </p>
     * 
     * @param createModelRequest
     * @return Result of the CreateModel operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @sample AmazonLookoutEquipment.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateModel" target="_top">AWS
     *      API Documentation</a>
     */
    CreateModelResult createModel(CreateModelRequest createModelRequest);

    /**
     * <p>
     * Creates a retraining scheduler on the specified model.
     * </p>
     * 
     * @param createRetrainingSchedulerRequest
     * @return Result of the CreateRetrainingScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.CreateRetrainingScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/CreateRetrainingScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRetrainingSchedulerResult createRetrainingScheduler(CreateRetrainingSchedulerRequest createRetrainingSchedulerRequest);

    /**
     * <p>
     * Deletes a dataset and associated artifacts. The operation will check to see if any inference scheduler or data
     * ingestion job is currently using the dataset, and if there isn't, the dataset, its metadata, and any associated
     * data stored in S3 will be deleted. This does not affect any models that used this dataset for training and
     * evaluation, but does prevent it from being used in the future.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @sample AmazonLookoutEquipment.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteDataset" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes an inference scheduler that has been set up. Prior inference results will not be deleted.
     * </p>
     * 
     * @param deleteInferenceSchedulerRequest
     * @return Result of the DeleteInferenceScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DeleteInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteInferenceSchedulerResult deleteInferenceScheduler(DeleteInferenceSchedulerRequest deleteInferenceSchedulerRequest);

    /**
     * <p>
     * Deletes a label.
     * </p>
     * 
     * @param deleteLabelRequest
     * @return Result of the DeleteLabel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @sample AmazonLookoutEquipment.DeleteLabel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteLabel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteLabelResult deleteLabel(DeleteLabelRequest deleteLabelRequest);

    /**
     * <p>
     * Deletes a group of labels.
     * </p>
     * 
     * @param deleteLabelGroupRequest
     * @return Result of the DeleteLabelGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @sample AmazonLookoutEquipment.DeleteLabelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteLabelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLabelGroupResult deleteLabelGroup(DeleteLabelGroupRequest deleteLabelGroupRequest);

    /**
     * <p>
     * Deletes a machine learning model currently available for Amazon Lookout for Equipment. This will prevent it from
     * being used with an inference scheduler, even one that is already set up.
     * </p>
     * 
     * @param deleteModelRequest
     * @return Result of the DeleteModel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @sample AmazonLookoutEquipment.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteModel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteModelResult deleteModel(DeleteModelRequest deleteModelRequest);

    /**
     * <p>
     * Deletes the resource policy attached to the resource.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @sample AmazonLookoutEquipment.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes a retraining scheduler from a model. The retraining scheduler must be in the <code>STOPPED</code> status.
     * </p>
     * 
     * @param deleteRetrainingSchedulerRequest
     * @return Result of the DeleteRetrainingScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DeleteRetrainingScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DeleteRetrainingScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRetrainingSchedulerResult deleteRetrainingScheduler(DeleteRetrainingSchedulerRequest deleteRetrainingSchedulerRequest);

    /**
     * <p>
     * Provides information on a specific data ingestion job such as creation time, dataset ARN, and status.
     * </p>
     * 
     * @param describeDataIngestionJobRequest
     * @return Result of the DescribeDataIngestionJob operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeDataIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeDataIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDataIngestionJobResult describeDataIngestionJob(DescribeDataIngestionJobRequest describeDataIngestionJobRequest);

    /**
     * <p>
     * Provides a JSON description of the data in each time series dataset, including names, column names, and data
     * types.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return Result of the DescribeDataset operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeDataset"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest);

    /**
     * <p>
     * Specifies information about the inference scheduler being used, including name, model, status, and associated
     * metadata
     * </p>
     * 
     * @param describeInferenceSchedulerRequest
     * @return Result of the DescribeInferenceScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInferenceSchedulerResult describeInferenceScheduler(DescribeInferenceSchedulerRequest describeInferenceSchedulerRequest);

    /**
     * <p>
     * Returns the name of the label.
     * </p>
     * 
     * @param describeLabelRequest
     * @return Result of the DescribeLabel operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeLabel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeLabel" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeLabelResult describeLabel(DescribeLabelRequest describeLabelRequest);

    /**
     * <p>
     * Returns information about the label group.
     * </p>
     * 
     * @param describeLabelGroupRequest
     * @return Result of the DescribeLabelGroup operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeLabelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeLabelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLabelGroupResult describeLabelGroup(DescribeLabelGroupRequest describeLabelGroupRequest);

    /**
     * <p>
     * Provides a JSON containing the overall information about a specific machine learning model, including model name
     * and ARN, dataset, training and evaluation information, status, and so on.
     * </p>
     * 
     * @param describeModelRequest
     * @return Result of the DescribeModel operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeModel" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeModelResult describeModel(DescribeModelRequest describeModelRequest);

    /**
     * <p>
     * Retrieves information about a specific machine learning model version.
     * </p>
     * 
     * @param describeModelVersionRequest
     * @return Result of the DescribeModelVersion operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeModelVersionResult describeModelVersion(DescribeModelVersionRequest describeModelVersionRequest);

    /**
     * <p>
     * Provides the details of a resource policy attached to a resource.
     * </p>
     * 
     * @param describeResourcePolicyRequest
     * @return Result of the DescribeResourcePolicy operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeResourcePolicyResult describeResourcePolicy(DescribeResourcePolicyRequest describeResourcePolicyRequest);

    /**
     * <p>
     * Provides a description of the retraining scheduler, including information such as the model name and retraining
     * parameters.
     * </p>
     * 
     * @param describeRetrainingSchedulerRequest
     * @return Result of the DescribeRetrainingScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.DescribeRetrainingScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeRetrainingScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRetrainingSchedulerResult describeRetrainingScheduler(DescribeRetrainingSchedulerRequest describeRetrainingSchedulerRequest);

    /**
     * <p>
     * Imports a dataset.
     * </p>
     * 
     * @param importDatasetRequest
     * @return Result of the ImportDataset operation returned by the service.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ImportDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ImportDataset" target="_top">AWS
     *      API Documentation</a>
     */
    ImportDatasetResult importDataset(ImportDatasetRequest importDatasetRequest);

    /**
     * <p>
     * Imports a model that has been trained successfully.
     * </p>
     * 
     * @param importModelVersionRequest
     * @return Result of the ImportModelVersion operation returned by the service.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ImportModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ImportModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    ImportModelVersionResult importModelVersion(ImportModelVersionRequest importModelVersionRequest);

    /**
     * <p>
     * Provides a list of all data ingestion jobs, including dataset name and ARN, S3 location of the input data,
     * status, and so on.
     * </p>
     * 
     * @param listDataIngestionJobsRequest
     * @return Result of the ListDataIngestionJobs operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListDataIngestionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListDataIngestionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListDataIngestionJobsResult listDataIngestionJobs(ListDataIngestionJobsRequest listDataIngestionJobsRequest);

    /**
     * <p>
     * Lists all datasets currently available in your account, filtering on the dataset name.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return Result of the ListDatasets operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListDatasets" target="_top">AWS
     *      API Documentation</a>
     */
    ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest);

    /**
     * <p>
     * Lists all inference events that have been found for the specified inference scheduler.
     * </p>
     * 
     * @param listInferenceEventsRequest
     * @return Result of the ListInferenceEvents operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListInferenceEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceEvents"
     *      target="_top">AWS API Documentation</a>
     */
    ListInferenceEventsResult listInferenceEvents(ListInferenceEventsRequest listInferenceEventsRequest);

    /**
     * <p>
     * Lists all inference executions that have been performed by the specified inference scheduler.
     * </p>
     * 
     * @param listInferenceExecutionsRequest
     * @return Result of the ListInferenceExecutions operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListInferenceExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    ListInferenceExecutionsResult listInferenceExecutions(ListInferenceExecutionsRequest listInferenceExecutionsRequest);

    /**
     * <p>
     * Retrieves a list of all inference schedulers currently available for your account.
     * </p>
     * 
     * @param listInferenceSchedulersRequest
     * @return Result of the ListInferenceSchedulers operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListInferenceSchedulers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceSchedulers"
     *      target="_top">AWS API Documentation</a>
     */
    ListInferenceSchedulersResult listInferenceSchedulers(ListInferenceSchedulersRequest listInferenceSchedulersRequest);

    /**
     * <p>
     * Returns a list of the label groups.
     * </p>
     * 
     * @param listLabelGroupsRequest
     * @return Result of the ListLabelGroups operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListLabelGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListLabelGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListLabelGroupsResult listLabelGroups(ListLabelGroupsRequest listLabelGroupsRequest);

    /**
     * <p>
     * Provides a list of labels.
     * </p>
     * 
     * @param listLabelsRequest
     * @return Result of the ListLabels operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListLabels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListLabels" target="_top">AWS
     *      API Documentation</a>
     */
    ListLabelsResult listLabels(ListLabelsRequest listLabelsRequest);

    /**
     * <p>
     * Generates a list of all model versions for a given model, including the model version, model version ARN, and
     * status. To list a subset of versions, use the <code>MaxModelVersion</code> and <code>MinModelVersion</code>
     * fields.
     * </p>
     * 
     * @param listModelVersionsRequest
     * @return Result of the ListModelVersions operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListModelVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListModelVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListModelVersionsResult listModelVersions(ListModelVersionsRequest listModelVersionsRequest);

    /**
     * <p>
     * Generates a list of all models in the account, including model name and ARN, dataset, and status.
     * </p>
     * 
     * @param listModelsRequest
     * @return Result of the ListModels operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListModels" target="_top">AWS
     *      API Documentation</a>
     */
    ListModelsResult listModels(ListModelsRequest listModelsRequest);

    /**
     * <p>
     * Lists all retraining schedulers in your account, filtering by model name prefix and status.
     * </p>
     * 
     * @param listRetrainingSchedulersRequest
     * @return Result of the ListRetrainingSchedulers operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListRetrainingSchedulers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListRetrainingSchedulers"
     *      target="_top">AWS API Documentation</a>
     */
    ListRetrainingSchedulersResult listRetrainingSchedulers(ListRetrainingSchedulersRequest listRetrainingSchedulersRequest);

    /**
     * <p>
     * Lists statistics about the data collected for each of the sensors that have been successfully ingested in the
     * particular dataset. Can also be used to retreive Sensor Statistics for a previous ingestion job.
     * </p>
     * 
     * @param listSensorStatisticsRequest
     * @return Result of the ListSensorStatistics operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListSensorStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListSensorStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    ListSensorStatisticsResult listSensorStatistics(ListSensorStatisticsRequest listSensorStatisticsRequest);

    /**
     * <p>
     * Lists all the tags for a specified resource, including key and value.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Creates a resource control policy for a given resource.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Starts a data ingestion job. Amazon Lookout for Equipment returns the job status.
     * </p>
     * 
     * @param startDataIngestionJobRequest
     * @return Result of the StartDataIngestionJob operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.StartDataIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StartDataIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartDataIngestionJobResult startDataIngestionJob(StartDataIngestionJobRequest startDataIngestionJobRequest);

    /**
     * <p>
     * Starts an inference scheduler.
     * </p>
     * 
     * @param startInferenceSchedulerRequest
     * @return Result of the StartInferenceScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.StartInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StartInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    StartInferenceSchedulerResult startInferenceScheduler(StartInferenceSchedulerRequest startInferenceSchedulerRequest);

    /**
     * <p>
     * Starts a retraining scheduler.
     * </p>
     * 
     * @param startRetrainingSchedulerRequest
     * @return Result of the StartRetrainingScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.StartRetrainingScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StartRetrainingScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    StartRetrainingSchedulerResult startRetrainingScheduler(StartRetrainingSchedulerRequest startRetrainingSchedulerRequest);

    /**
     * <p>
     * Stops an inference scheduler.
     * </p>
     * 
     * @param stopInferenceSchedulerRequest
     * @return Result of the StopInferenceScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.StopInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StopInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    StopInferenceSchedulerResult stopInferenceScheduler(StopInferenceSchedulerRequest stopInferenceSchedulerRequest);

    /**
     * <p>
     * Stops a retraining scheduler.
     * </p>
     * 
     * @param stopRetrainingSchedulerRequest
     * @return Result of the StopRetrainingScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.StopRetrainingScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/StopRetrainingScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    StopRetrainingSchedulerResult stopRetrainingScheduler(StopRetrainingSchedulerRequest stopRetrainingSchedulerRequest);

    /**
     * <p>
     * Associates a given tag to a resource in your account. A tag is a key-value pair which can be added to an Amazon
     * Lookout for Equipment resource as metadata. Tags can be used for organizing your resources as well as helping you
     * to search and filter by tag. Multiple tags can be added to a resource, either when you create it, or later. Up to
     * 50 tags can be associated with each resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ServiceQuotaExceededException
     *         Resource limitations have been exceeded.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a specific tag from a given resource. The tag is specified by its key.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Sets the active model version for a given machine learning model.
     * </p>
     * 
     * @param updateActiveModelVersionRequest
     * @return Result of the UpdateActiveModelVersion operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @sample AmazonLookoutEquipment.UpdateActiveModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UpdateActiveModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateActiveModelVersionResult updateActiveModelVersion(UpdateActiveModelVersionRequest updateActiveModelVersionRequest);

    /**
     * <p>
     * Updates an inference scheduler.
     * </p>
     * 
     * @param updateInferenceSchedulerRequest
     * @return Result of the UpdateInferenceScheduler operation returned by the service.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.UpdateInferenceScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UpdateInferenceScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateInferenceSchedulerResult updateInferenceScheduler(UpdateInferenceSchedulerRequest updateInferenceSchedulerRequest);

    /**
     * <p>
     * Updates the label group.
     * </p>
     * 
     * @param updateLabelGroupRequest
     * @return Result of the UpdateLabelGroup operation returned by the service.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.UpdateLabelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UpdateLabelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateLabelGroupResult updateLabelGroup(UpdateLabelGroupRequest updateLabelGroupRequest);

    /**
     * <p>
     * Updates a model in the account.
     * </p>
     * 
     * @param updateModelRequest
     * @return Result of the UpdateModel operation returned by the service.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.UpdateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UpdateModel" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateModelResult updateModel(UpdateModelRequest updateModelRequest);

    /**
     * <p>
     * Updates a retraining scheduler.
     * </p>
     * 
     * @param updateRetrainingSchedulerRequest
     * @return Result of the UpdateRetrainingScheduler operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy constraints specified by Amazon Lookout for Equipment or a related Amazon Web
     *         Services service that's being utilized.
     * @throws ResourceNotFoundException
     *         The resource requested could not be found. Verify the resource ID and retry your request.
     * @throws ConflictException
     *         The request could not be completed due to a conflict with the current state of the target resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         The request could not be completed because you do not have access to the resource.
     * @throws InternalServerException
     *         Processing of the request has failed because of an unknown error, exception or failure.
     * @sample AmazonLookoutEquipment.UpdateRetrainingScheduler
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/UpdateRetrainingScheduler"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRetrainingSchedulerResult updateRetrainingScheduler(UpdateRetrainingSchedulerRequest updateRetrainingSchedulerRequest);

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
