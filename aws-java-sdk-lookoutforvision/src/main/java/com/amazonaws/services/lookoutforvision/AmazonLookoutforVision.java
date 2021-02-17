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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.lookoutforvision.model.*;

/**
 * Interface for accessing Amazon Lookout for Vision.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lookoutforvision.AbstractAmazonLookoutforVision} instead.
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
public interface AmazonLookoutforVision {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "lookoutvision";

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
     * @return Result of the CreateDataset operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @throws ServiceQuotaExceededException
     *         A service quota was exceeded the allowed limit. For more information, see Limits in Amazon Lookout for
     *         Vision in the Amazon Lookout for Vision Developer Guide.
     * @sample AmazonLookoutforVision.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateDataset" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDatasetResult createDataset(CreateDatasetRequest createDatasetRequest);

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
     * @return Result of the CreateModel operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @throws ServiceQuotaExceededException
     *         A service quota was exceeded the allowed limit. For more information, see Limits in Amazon Lookout for
     *         Vision in the Amazon Lookout for Vision Developer Guide.
     * @sample AmazonLookoutforVision.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateModel" target="_top">AWS API
     *      Documentation</a>
     */
    CreateModelResult createModel(CreateModelRequest createModelRequest);

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
     * @return Result of the CreateProject operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @throws ServiceQuotaExceededException
     *         A service quota was exceeded the allowed limit. For more information, see Limits in Amazon Lookout for
     *         Vision in the Amazon Lookout for Vision Developer Guide.
     * @sample AmazonLookoutforVision.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateProject" target="_top">AWS
     *      API Documentation</a>
     */
    CreateProjectResult createProject(CreateProjectRequest createProjectRequest);

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
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DeleteDataset" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest);

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
     * @return Result of the DeleteModel operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.DeleteModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DeleteModel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteModelResult deleteModel(DeleteModelRequest deleteModelRequest);

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
     * @return Result of the DeleteProject operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DeleteProject" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Describe an Amazon Lookout for Vision dataset.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DescribeDataset</code> operation.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return Result of the DescribeDataset operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest);

    /**
     * <p>
     * Describes a version of an Amazon Lookout for Vision model.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DescribeModel</code> operation.
     * </p>
     * 
     * @param describeModelRequest
     * @return Result of the DescribeModel operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.DescribeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeModel" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeModelResult describeModel(DescribeModelRequest describeModelRequest);

    /**
     * <p>
     * Describes an Amazon Lookout for Vision project.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:DescribeProject</code> operation.
     * </p>
     * 
     * @param describeProjectRequest
     * @return Result of the DescribeProject operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeProject" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeProjectResult describeProject(DescribeProjectRequest describeProjectRequest);

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
     * @return Result of the DetectAnomalies operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.DetectAnomalies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DetectAnomalies" target="_top">AWS
     *      API Documentation</a>
     */
    DetectAnomaliesResult detectAnomalies(DetectAnomaliesRequest detectAnomaliesRequest);

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
     * @return Result of the ListDatasetEntries operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.ListDatasetEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListDatasetEntries"
     *      target="_top">AWS API Documentation</a>
     */
    ListDatasetEntriesResult listDatasetEntries(ListDatasetEntriesRequest listDatasetEntriesRequest);

    /**
     * <p>
     * Lists the versions of a model in an Amazon Lookout for Vision project.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:ListModels</code> operation.
     * </p>
     * 
     * @param listModelsRequest
     * @return Result of the ListModels operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.ListModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListModels" target="_top">AWS API
     *      Documentation</a>
     */
    ListModelsResult listModels(ListModelsRequest listModelsRequest);

    /**
     * <p>
     * Lists the Amazon Lookout for Vision projects in your AWS account.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:ListProjects</code> operation.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Returns a list of tags attached to the specified Amazon Lookout for Vision model.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>lookoutvision:ListTagsForResource</code> operation.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the StartModel operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @throws ServiceQuotaExceededException
     *         A service quota was exceeded the allowed limit. For more information, see Limits in Amazon Lookout for
     *         Vision in the Amazon Lookout for Vision Developer Guide.
     * @sample AmazonLookoutforVision.StartModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/StartModel" target="_top">AWS API
     *      Documentation</a>
     */
    StartModelResult startModel(StartModelRequest startModelRequest);

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
     * @return Result of the StopModel operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.StopModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/StopModel" target="_top">AWS API
     *      Documentation</a>
     */
    StopModelResult stopModel(StopModelRequest stopModelRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @throws ServiceQuotaExceededException
     *         A service quota was exceeded the allowed limit. For more information, see Limits in Amazon Lookout for
     *         Vision in the Amazon Lookout for Vision Developer Guide.
     * @sample AmazonLookoutforVision.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

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
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
     * @return Result of the UpdateDatasetEntries operation returned by the service.
     * @throws AccessDeniedException
     *         You are not authorized to perform the action.
     * @throws InternalServerException
     *         Amazon Lookout for Vision experienced a service issue. Try your call again.
     * @throws ValidationException
     *         An input validation error occured. For example, invalid characters in a project name, or if a pagination
     *         token is invalid.
     * @throws ConflictException
     *         The update or deletion of a resource caused an inconsistent state.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ThrottlingException
     *         Amazon Lookout for Vision is temporarily unable to process the request. Try your call again.
     * @sample AmazonLookoutforVision.UpdateDatasetEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/UpdateDatasetEntries"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDatasetEntriesResult updateDatasetEntries(UpdateDatasetEntriesRequest updateDatasetEntriesRequest);

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
