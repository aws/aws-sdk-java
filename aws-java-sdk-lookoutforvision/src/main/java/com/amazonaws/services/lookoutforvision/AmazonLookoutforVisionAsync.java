/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutforvision;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutforvision.model.*;

/**
 * Interface for accessing Amazon Lookout for Vision asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lookoutforvision.AbstractAmazonLookoutforVisionAsync} instead.
 * </p>
 * <p>
 * <p>
 * This is the Amazon Lookout for Vision API Reference. It provides descriptions of actions, data types, common
 * parameters, and common errors.
 * </p>
 * <p>
 * Amazon Lookout for Vision enables you to find visual defects in industrial products, accurately and at scale. It uses
 * computer vision to identify missing components in an industrial product, damage to vehicles or structures,
 * irregularities in production lines, and even minuscule defects in silicon wafers — or any other physical item where
 * quality is important such as a missing capacitor on printed circuit boards.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonLookoutforVisionAsync extends AmazonLookoutforVision {

    /**
     * <p>
     * Creates a new dataset in an Amazon Lookout for Vision project. <code>CreateDataset</code> can create a training
     * or a test dataset from a valid dataset source (<code>DatasetSource</code>).
     * </p>
     * <p>
     * If you want a single dataset project, specify <code>train</code> for the value of <code>DatasetType</code>.
     * </p>
     * <p>
     * To have a project with separate training and test datasets, call <code>CreateDataset</code> twice. On the first
     * call, specify <code>train</code> for the value of <code>DatasetType</code>. On the second call, specify
     * <code>test</code> for the value of <code>DatasetType</code>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:CreateDataset</code> operation.
     * </p>
     * 
     * @param createDatasetRequest
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest);

    /**
     * <p>
     * Creates a new dataset in an Amazon Lookout for Vision project. <code>CreateDataset</code> can create a training
     * or a test dataset from a valid dataset source (<code>DatasetSource</code>).
     * </p>
     * <p>
     * If you want a single dataset project, specify <code>train</code> for the value of <code>DatasetType</code>.
     * </p>
     * <p>
     * To have a project with separate training and test datasets, call <code>CreateDataset</code> twice. On the first
     * call, specify <code>train</code> for the value of <code>DatasetType</code>. On the second call, specify
     * <code>test</code> for the value of <code>DatasetType</code>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:CreateDataset</code> operation.
     * </p>
     * 
     * @param createDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetRequest, CreateDatasetResult> asyncHandler);

    /**
     * <p>
     * Creates a new version of a model within an an Amazon Lookout for Vision project. <code>CreateModel</code> is an
     * asynchronous operation in which Amazon Lookout for Vision trains, tests, and evaluates a new version of a model.
     * </p>
     * <p>
     * To get the current status, check the <code>Status</code> field returned in the response from
     * <a>DescribeModel</a>.
     * </p>
     * <p>
     * If the project has a single dataset, Amazon Lookout for Vision internally splits the dataset to create a training
     * and a test dataset. If the project has a training and a test dataset, Lookout for Vision uses the respective
     * datasets to train and test the model.
     * </p>
     * <p>
     * After training completes, the evaluation metrics are stored at the location specified in
     * <code>OutputConfig</code>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:CreateModel</code> operation. If you want
     * to tag your model, you also require permission to the <code>lookoutvision:TagResource</code> operation.
     * </p>
     * 
     * @param createModelRequest
     * @return A Java Future containing the result of the CreateModel operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest createModelRequest);

    /**
     * <p>
     * Creates a new version of a model within an an Amazon Lookout for Vision project. <code>CreateModel</code> is an
     * asynchronous operation in which Amazon Lookout for Vision trains, tests, and evaluates a new version of a model.
     * </p>
     * <p>
     * To get the current status, check the <code>Status</code> field returned in the response from
     * <a>DescribeModel</a>.
     * </p>
     * <p>
     * If the project has a single dataset, Amazon Lookout for Vision internally splits the dataset to create a training
     * and a test dataset. If the project has a training and a test dataset, Lookout for Vision uses the respective
     * datasets to train and test the model.
     * </p>
     * <p>
     * After training completes, the evaluation metrics are stored at the location specified in
     * <code>OutputConfig</code>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:CreateModel</code> operation. If you want
     * to tag your model, you also require permission to the <code>lookoutvision:TagResource</code> operation.
     * </p>
     * 
     * @param createModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateModel operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest createModelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler);

    /**
     * <p>
     * Creates an empty Amazon Lookout for Vision project. After you create the project, add a dataset by calling
     * <a>CreateDataset</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:CreateProject</code> operation.
     * </p>
     * 
     * @param createProjectRequest
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateProject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates an empty Amazon Lookout for Vision project. After you create the project, add a dataset by calling
     * <a>CreateDataset</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:CreateProject</code> operation.
     * </p>
     * 
     * @param createProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateProject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing Amazon Lookout for Vision <code>dataset</code>.
     * </p>
     * <p>
     * If your the project has a single dataset, you must create a new dataset before you can create a model.
     * </p>
     * <p>
     * If you project has a training dataset and a test dataset consider the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you delete the test dataset, your project reverts to a single dataset project. If you then train the model,
     * Amazon Lookout for Vision internally splits the remaining dataset into a training and test dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you delete the training dataset, you must create a training dataset before you can create a model.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DeleteDataset</code> operation.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DeleteDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes an existing Amazon Lookout for Vision <code>dataset</code>.
     * </p>
     * <p>
     * If your the project has a single dataset, you must create a new dataset before you can create a model.
     * </p>
     * <p>
     * If you project has a training dataset and a test dataset consider the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you delete the test dataset, your project reverts to a single dataset project. If you then train the model,
     * Amazon Lookout for Vision internally splits the remaining dataset into a training and test dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you delete the training dataset, you must create a training dataset before you can create a model.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DeleteDataset</code> operation.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DeleteDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Lookout for Vision model. You can't delete a running model. To stop a running model, use the
     * <a>StopModel</a> operation.
     * </p>
     * <p>
     * It might take a few seconds to delete a model. To determine if a model has been deleted, call <a>ListProjects</a>
     * and check if the version of the model (<code>ModelVersion</code>) is in the <code>Models</code> array.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DeleteModel</code> operation.
     * </p>
     * 
     * @param deleteModelRequest
     * @return A Java Future containing the result of the DeleteModel operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DeleteModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest deleteModelRequest);

    /**
     * <p>
     * Deletes an Amazon Lookout for Vision model. You can't delete a running model. To stop a running model, use the
     * <a>StopModel</a> operation.
     * </p>
     * <p>
     * It might take a few seconds to delete a model. To determine if a model has been deleted, call <a>ListProjects</a>
     * and check if the version of the model (<code>ModelVersion</code>) is in the <code>Models</code> array.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DeleteModel</code> operation.
     * </p>
     * 
     * @param deleteModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteModel operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DeleteModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest deleteModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, DeleteModelResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Lookout for Vision project.
     * </p>
     * <p>
     * To delete a project, you must first delete each version of the model associated with the project. To delete a
     * model use the <a>DeleteModel</a> operation.
     * </p>
     * <p>
     * You also have to delete the dataset(s) associated with the model. For more information, see <a>DeleteDataset</a>.
     * The images referenced by the training and test datasets aren't deleted.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DeleteProject</code> operation.
     * </p>
     * 
     * @param deleteProjectRequest
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DeleteProject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes an Amazon Lookout for Vision project.
     * </p>
     * <p>
     * To delete a project, you must first delete each version of the model associated with the project. To delete a
     * model use the <a>DeleteModel</a> operation.
     * </p>
     * <p>
     * You also have to delete the dataset(s) associated with the model. For more information, see <a>DeleteDataset</a>.
     * The images referenced by the training and test datasets aren't deleted.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DeleteProject</code> operation.
     * </p>
     * 
     * @param deleteProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DeleteProject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler);

    /**
     * <p>
     * Describe an Amazon Lookout for Vision dataset.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DescribeDataset</code> operation.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest);

    /**
     * <p>
     * Describe an Amazon Lookout for Vision dataset.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DescribeDataset</code> operation.
     * </p>
     * 
     * @param describeDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler);

    /**
     * <p>
     * Describes a version of an Amazon Lookout for Vision model.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DescribeModel</code> operation.
     * </p>
     * 
     * @param describeModelRequest
     * @return A Java Future containing the result of the DescribeModel operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.DescribeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelResult> describeModelAsync(DescribeModelRequest describeModelRequest);

    /**
     * <p>
     * Describes a version of an Amazon Lookout for Vision model.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DescribeModel</code> operation.
     * </p>
     * 
     * @param describeModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeModel operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.DescribeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeModelResult> describeModelAsync(DescribeModelRequest describeModelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeModelRequest, DescribeModelResult> asyncHandler);

    /**
     * <p>
     * Describes an Amazon Lookout for Vision project.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DescribeProject</code> operation.
     * </p>
     * 
     * @param describeProjectRequest
     * @return A Java Future containing the result of the DescribeProject operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeProject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest describeProjectRequest);

    /**
     * <p>
     * Describes an Amazon Lookout for Vision project.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DescribeProject</code> operation.
     * </p>
     * 
     * @param describeProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProject operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeProject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest describeProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProjectRequest, DescribeProjectResult> asyncHandler);

    /**
     * <p>
     * Detects anomalies in an image that you supply.
     * </p>
     * <p>
     * The response from <code>DetectAnomalies</code> includes a boolean prediction that the image contains one or more
     * anomalies and a confidence value for the prediction.
     * </p>
     * <note>
     * <p>
     * Before calling <code>DetectAnomalies</code>, you must first start your model with the <a>StartModel</a>
     * operation. You are charged for the amount of time, in minutes, that a model runs and for the number of anomaly
     * detection units that your model uses. If you are not using a model, use the <a>StopModel</a> operation to stop
     * your model.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DetectAnomalies</code> operation.
     * </p>
     * 
     * @param detectAnomaliesRequest
     * @return A Java Future containing the result of the DetectAnomalies operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.DetectAnomalies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DetectAnomalies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetectAnomaliesResult> detectAnomaliesAsync(DetectAnomaliesRequest detectAnomaliesRequest);

    /**
     * <p>
     * Detects anomalies in an image that you supply.
     * </p>
     * <p>
     * The response from <code>DetectAnomalies</code> includes a boolean prediction that the image contains one or more
     * anomalies and a confidence value for the prediction.
     * </p>
     * <note>
     * <p>
     * Before calling <code>DetectAnomalies</code>, you must first start your model with the <a>StartModel</a>
     * operation. You are charged for the amount of time, in minutes, that a model runs and for the number of anomaly
     * detection units that your model uses. If you are not using a model, use the <a>StopModel</a> operation to stop
     * your model.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DetectAnomalies</code> operation.
     * </p>
     * 
     * @param detectAnomaliesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetectAnomalies operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.DetectAnomalies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DetectAnomalies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DetectAnomaliesResult> detectAnomaliesAsync(DetectAnomaliesRequest detectAnomaliesRequest,
            com.amazonaws.handlers.AsyncHandler<DetectAnomaliesRequest, DetectAnomaliesResult> asyncHandler);

    /**
     * <p>
     * Lists the JSON Lines within a dataset. An Amazon Lookout for Vision JSON Line contains the anomaly information
     * for a single image, including the image location and the assigned label.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:ListDatasetEntries</code> operation.
     * </p>
     * 
     * @param listDatasetEntriesRequest
     * @return A Java Future containing the result of the ListDatasetEntries operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.ListDatasetEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListDatasetEntries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetEntriesResult> listDatasetEntriesAsync(ListDatasetEntriesRequest listDatasetEntriesRequest);

    /**
     * <p>
     * Lists the JSON Lines within a dataset. An Amazon Lookout for Vision JSON Line contains the anomaly information
     * for a single image, including the image location and the assigned label.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:ListDatasetEntries</code> operation.
     * </p>
     * 
     * @param listDatasetEntriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasetEntries operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.ListDatasetEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListDatasetEntries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetEntriesResult> listDatasetEntriesAsync(ListDatasetEntriesRequest listDatasetEntriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetEntriesRequest, ListDatasetEntriesResult> asyncHandler);

    /**
     * <p>
     * Lists the versions of a model in an Amazon Lookout for Vision project.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:ListModels</code> operation.
     * </p>
     * 
     * @param listModelsRequest
     * @return A Java Future containing the result of the ListModels operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.ListModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListModels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListModelsResult> listModelsAsync(ListModelsRequest listModelsRequest);

    /**
     * <p>
     * Lists the versions of a model in an Amazon Lookout for Vision project.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:ListModels</code> operation.
     * </p>
     * 
     * @param listModelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListModels operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.ListModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListModels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListModelsResult> listModelsAsync(ListModelsRequest listModelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListModelsRequest, ListModelsResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon Lookout for Vision projects in your AWS account.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:ListProjects</code> operation.
     * </p>
     * 
     * @param listProjectsRequest
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Lists the Amazon Lookout for Vision projects in your AWS account.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:ListProjects</code> operation.
     * </p>
     * 
     * @param listProjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags attached to the specified Amazon Lookout for Vision model.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:ListTagsForResource</code> operation.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tags attached to the specified Amazon Lookout for Vision model.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:ListTagsForResource</code> operation.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts the running of the version of an Amazon Lookout for Vision model. Starting a model takes a while to
     * complete. To check the current state of the model, use <a>DescribeModel</a>.
     * </p>
     * <p>
     * A model is ready to use when its status is <code>HOSTED</code>.
     * </p>
     * <p>
     * Once the model is running, you can detect custom labels in new images by calling <a>DetectAnomalies</a>.
     * </p>
     * <note>
     * <p>
     * You are charged for the amount of time that the model is running. To stop a running model, call <a>StopModel</a>.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:StartModel</code> operation.
     * </p>
     * 
     * @param startModelRequest
     * @return A Java Future containing the result of the StartModel operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.StartModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/StartModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartModelResult> startModelAsync(StartModelRequest startModelRequest);

    /**
     * <p>
     * Starts the running of the version of an Amazon Lookout for Vision model. Starting a model takes a while to
     * complete. To check the current state of the model, use <a>DescribeModel</a>.
     * </p>
     * <p>
     * A model is ready to use when its status is <code>HOSTED</code>.
     * </p>
     * <p>
     * Once the model is running, you can detect custom labels in new images by calling <a>DetectAnomalies</a>.
     * </p>
     * <note>
     * <p>
     * You are charged for the amount of time that the model is running. To stop a running model, call <a>StopModel</a>.
     * </p>
     * </note>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:StartModel</code> operation.
     * </p>
     * 
     * @param startModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartModel operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.StartModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/StartModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartModelResult> startModelAsync(StartModelRequest startModelRequest,
            com.amazonaws.handlers.AsyncHandler<StartModelRequest, StartModelResult> asyncHandler);

    /**
     * <p>
     * Stops the hosting of a running model. The operation might take a while to complete. To check the current status,
     * call <a>DescribeModel</a>.
     * </p>
     * <p>
     * After the model hosting stops, the <code>Status</code> of the model is <code>TRAINED</code>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:StopModel</code> operation.
     * </p>
     * 
     * @param stopModelRequest
     * @return A Java Future containing the result of the StopModel operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.StopModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/StopModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopModelResult> stopModelAsync(StopModelRequest stopModelRequest);

    /**
     * <p>
     * Stops the hosting of a running model. The operation might take a while to complete. To check the current status,
     * call <a>DescribeModel</a>.
     * </p>
     * <p>
     * After the model hosting stops, the <code>Status</code> of the model is <code>TRAINED</code>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:StopModel</code> operation.
     * </p>
     * 
     * @param stopModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopModel operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.StopModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/StopModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopModelResult> stopModelAsync(StopModelRequest stopModelRequest,
            com.amazonaws.handlers.AsyncHandler<StopModelRequest, StopModelResult> asyncHandler);

    /**
     * <p>
     * Adds one or more key-value tags to an Amazon Lookout for Vision model. For more information, see <i>Tagging a
     * model</i> in the <i>Amazon Lookout for Vision Developer Guide</i>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:TagResource</code> operation.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more key-value tags to an Amazon Lookout for Vision model. For more information, see <i>Tagging a
     * model</i> in the <i>Amazon Lookout for Vision Developer Guide</i>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:TagResource</code> operation.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from an Amazon Lookout for Vision model. For more information, see <i>Tagging a
     * model</i> in the <i>Amazon Lookout for Vision Developer Guide</i>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:UntagResource</code> operation.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from an Amazon Lookout for Vision model. For more information, see <i>Tagging a
     * model</i> in the <i>Amazon Lookout for Vision Developer Guide</i>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:UntagResource</code> operation.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Adds one or more JSON Line entries to a dataset. A JSON Line includes information about an image used for
     * training or testing an Amazon Lookout for Vision model. The following is an example JSON Line.
     * </p>
     * <p>
     * Updating a dataset might take a while to complete. To check the current status, call <a>DescribeDataset</a> and
     * check the <code>Status</code> field in the response.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:UpdateDatasetEntries</code> operation.
     * </p>
     * 
     * @param updateDatasetEntriesRequest
     * @return A Java Future containing the result of the UpdateDatasetEntries operation returned by the service.
     * @sample AmazonLookoutforVisionAsync.UpdateDatasetEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/UpdateDatasetEntries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasetEntriesResult> updateDatasetEntriesAsync(UpdateDatasetEntriesRequest updateDatasetEntriesRequest);

    /**
     * <p>
     * Adds one or more JSON Line entries to a dataset. A JSON Line includes information about an image used for
     * training or testing an Amazon Lookout for Vision model. The following is an example JSON Line.
     * </p>
     * <p>
     * Updating a dataset might take a while to complete. To check the current status, call <a>DescribeDataset</a> and
     * check the <code>Status</code> field in the response.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:UpdateDatasetEntries</code> operation.
     * </p>
     * 
     * @param updateDatasetEntriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDatasetEntries operation returned by the service.
     * @sample AmazonLookoutforVisionAsyncHandler.UpdateDatasetEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/UpdateDatasetEntries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasetEntriesResult> updateDatasetEntriesAsync(UpdateDatasetEntriesRequest updateDatasetEntriesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDatasetEntriesRequest, UpdateDatasetEntriesResult> asyncHandler);

}
