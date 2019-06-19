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
package com.amazonaws.services.iotanalytics;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iotanalytics.model.*;

/**
 * Interface for accessing AWS IoT Analytics.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotanalytics.AbstractAWSIoTAnalytics} instead.
 * </p>
 * <p>
 * <p>
 * AWS IoT Analytics allows you to collect large amounts of device data, process messages, and store them. You can then
 * query the data and run sophisticated analytics on it. AWS IoT Analytics enables advanced data exploration through
 * integration with Jupyter Notebooks and data visualization through integration with Amazon QuickSight.
 * </p>
 * <p>
 * Traditional analytics and business intelligence tools are designed to process structured data. IoT data often comes
 * from devices that record noisy processes (such as temperature, motion, or sound). As a result the data from these
 * devices can have significant gaps, corrupted messages, and false readings that must be cleaned up before analysis can
 * occur. Also, IoT data is often only meaningful in the context of other data from external sources.
 * </p>
 * <p>
 * AWS IoT Analytics automates the steps required to analyze data from IoT devices. AWS IoT Analytics filters,
 * transforms, and enriches IoT data before storing it in a time-series data store for analysis. You can set up the
 * service to collect only the data you need from your devices, apply mathematical transforms to process the data, and
 * enrich the data with device-specific metadata such as device type and location before storing it. Then, you can
 * analyze your data by running queries using the built-in SQL query engine, or perform more complex analytics and
 * machine learning inference. AWS IoT Analytics includes pre-built models for common IoT use cases so you can answer
 * questions like which devices are about to fail or which customers are at risk of abandoning their wearable devices.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTAnalytics {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "iotanalytics";

    /**
     * <p>
     * Sends messages to a channel.
     * </p>
     * 
     * @param batchPutMessageRequest
     * @return Result of the BatchPutMessage operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.BatchPutMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/BatchPutMessage" target="_top">AWS
     *      API Documentation</a>
     */
    BatchPutMessageResult batchPutMessage(BatchPutMessageRequest batchPutMessageRequest);

    /**
     * <p>
     * Cancels the reprocessing of data through the pipeline.
     * </p>
     * 
     * @param cancelPipelineReprocessingRequest
     * @return Result of the CancelPipelineReprocessing operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.CancelPipelineReprocessing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CancelPipelineReprocessing"
     *      target="_top">AWS API Documentation</a>
     */
    CancelPipelineReprocessingResult cancelPipelineReprocessing(CancelPipelineReprocessingRequest cancelPipelineReprocessingRequest);

    /**
     * <p>
     * Creates a channel. A channel collects data from an MQTT topic and archives the raw, unprocessed messages before
     * publishing the data to a pipeline.
     * </p>
     * 
     * @param createChannelRequest
     * @return Result of the CreateChannel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceAlreadyExistsException
     *         A resource with the same name already exists.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @sample AWSIoTAnalytics.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    CreateChannelResult createChannel(CreateChannelRequest createChannelRequest);

    /**
     * <p>
     * Creates a data set. A data set stores data retrieved from a data store by applying a "queryAction" (a SQL query)
     * or a "containerAction" (executing a containerized application). This operation creates the skeleton of a data
     * set. The data set can be populated manually by calling "CreateDatasetContent" or automatically according to a
     * "trigger" you specify.
     * </p>
     * 
     * @param createDatasetRequest
     * @return Result of the CreateDataset operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceAlreadyExistsException
     *         A resource with the same name already exists.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @sample AWSIoTAnalytics.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDatasetResult createDataset(CreateDatasetRequest createDatasetRequest);

    /**
     * <p>
     * Creates the content of a data set by applying a "queryAction" (a SQL query) or a "containerAction" (executing a
     * containerized application).
     * </p>
     * 
     * @param createDatasetContentRequest
     * @return Result of the CreateDatasetContent operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.CreateDatasetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDatasetContent"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDatasetContentResult createDatasetContent(CreateDatasetContentRequest createDatasetContentRequest);

    /**
     * <p>
     * Creates a data store, which is a repository for messages.
     * </p>
     * 
     * @param createDatastoreRequest
     * @return Result of the CreateDatastore operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceAlreadyExistsException
     *         A resource with the same name already exists.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @sample AWSIoTAnalytics.CreateDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDatastoreResult createDatastore(CreateDatastoreRequest createDatastoreRequest);

    /**
     * <p>
     * Creates a pipeline. A pipeline consumes messages from one or more channels and allows you to process the messages
     * before storing them in a data store. You must specify both a <code>channel</code> and a <code>datastore</code>
     * activity and, optionally, as many as 23 additional activities in the <code>pipelineActivities</code> array.
     * </p>
     * 
     * @param createPipelineRequest
     * @return Result of the CreatePipeline operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceAlreadyExistsException
     *         A resource with the same name already exists.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @sample AWSIoTAnalytics.CreatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePipelineResult createPipeline(CreatePipelineRequest createPipelineRequest);

    /**
     * <p>
     * Deletes the specified channel.
     * </p>
     * 
     * @param deleteChannelRequest
     * @return Result of the DeleteChannel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteChannelResult deleteChannel(DeleteChannelRequest deleteChannelRequest);

    /**
     * <p>
     * Deletes the specified data set.
     * </p>
     * <p>
     * You do not have to delete the content of the data set before you perform this operation.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes the content of the specified data set.
     * </p>
     * 
     * @param deleteDatasetContentRequest
     * @return Result of the DeleteDatasetContent operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DeleteDatasetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteDatasetContent"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDatasetContentResult deleteDatasetContent(DeleteDatasetContentRequest deleteDatasetContentRequest);

    /**
     * <p>
     * Deletes the specified data store.
     * </p>
     * 
     * @param deleteDatastoreRequest
     * @return Result of the DeleteDatastore operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DeleteDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeleteDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDatastoreResult deleteDatastore(DeleteDatastoreRequest deleteDatastoreRequest);

    /**
     * <p>
     * Deletes the specified pipeline.
     * </p>
     * 
     * @param deletePipelineRequest
     * @return Result of the DeletePipeline operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DeletePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeletePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    DeletePipelineResult deletePipeline(DeletePipelineRequest deletePipelineRequest);

    /**
     * <p>
     * Retrieves information about a channel.
     * </p>
     * 
     * @param describeChannelRequest
     * @return Result of the DescribeChannel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeChannel" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeChannelResult describeChannel(DescribeChannelRequest describeChannelRequest);

    /**
     * <p>
     * Retrieves information about a data set.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return Result of the DescribeDataset operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest);

    /**
     * <p>
     * Retrieves information about a data store.
     * </p>
     * 
     * @param describeDatastoreRequest
     * @return Result of the DescribeDatastore operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DescribeDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDatastoreResult describeDatastore(DescribeDatastoreRequest describeDatastoreRequest);

    /**
     * <p>
     * Retrieves the current settings of the AWS IoT Analytics logging options.
     * </p>
     * 
     * @param describeLoggingOptionsRequest
     * @return Result of the DescribeLoggingOptions operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DescribeLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeLoggingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLoggingOptionsResult describeLoggingOptions(DescribeLoggingOptionsRequest describeLoggingOptionsRequest);

    /**
     * <p>
     * Retrieves information about a pipeline.
     * </p>
     * 
     * @param describePipelineRequest
     * @return Result of the DescribePipeline operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.DescribePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    DescribePipelineResult describePipeline(DescribePipelineRequest describePipelineRequest);

    /**
     * <p>
     * Retrieves the contents of a data set as pre-signed URIs.
     * </p>
     * 
     * @param getDatasetContentRequest
     * @return Result of the GetDatasetContent operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.GetDatasetContent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/GetDatasetContent" target="_top">AWS
     *      API Documentation</a>
     */
    GetDatasetContentResult getDatasetContent(GetDatasetContentRequest getDatasetContentRequest);

    /**
     * <p>
     * Retrieves a list of channels.
     * </p>
     * 
     * @param listChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    ListChannelsResult listChannels(ListChannelsRequest listChannelsRequest);

    /**
     * <p>
     * Lists information about data set contents that have been created.
     * </p>
     * 
     * @param listDatasetContentsRequest
     * @return Result of the ListDatasetContents operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @sample AWSIoTAnalytics.ListDatasetContents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListDatasetContents"
     *      target="_top">AWS API Documentation</a>
     */
    ListDatasetContentsResult listDatasetContents(ListDatasetContentsRequest listDatasetContentsRequest);

    /**
     * <p>
     * Retrieves information about data sets.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return Result of the ListDatasets operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest);

    /**
     * <p>
     * Retrieves a list of data stores.
     * </p>
     * 
     * @param listDatastoresRequest
     * @return Result of the ListDatastores operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.ListDatastores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListDatastores" target="_top">AWS
     *      API Documentation</a>
     */
    ListDatastoresResult listDatastores(ListDatastoresRequest listDatastoresRequest);

    /**
     * <p>
     * Retrieves a list of pipelines.
     * </p>
     * 
     * @param listPipelinesRequest
     * @return Result of the ListPipelines operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.ListPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListPipelines" target="_top">AWS API
     *      Documentation</a>
     */
    ListPipelinesResult listPipelines(ListPipelinesRequest listPipelinesRequest);

    /**
     * <p>
     * Lists the tags (metadata) which you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @sample AWSIoTAnalytics.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Sets or updates the AWS IoT Analytics logging options.
     * </p>
     * <p>
     * Note that if you update the value of any <code>loggingOptions</code> field, it takes up to one minute for the
     * change to take effect. Also, if you change the policy attached to the role you specified in the roleArn field
     * (for example, to correct an invalid policy) it takes up to 5 minutes for that change to take effect.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @return Result of the PutLoggingOptions operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/PutLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    PutLoggingOptionsResult putLoggingOptions(PutLoggingOptionsRequest putLoggingOptionsRequest);

    /**
     * <p>
     * Simulates the results of running a pipeline activity on a message payload.
     * </p>
     * 
     * @param runPipelineActivityRequest
     * @return Result of the RunPipelineActivity operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.RunPipelineActivity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/RunPipelineActivity"
     *      target="_top">AWS API Documentation</a>
     */
    RunPipelineActivityResult runPipelineActivity(RunPipelineActivityRequest runPipelineActivityRequest);

    /**
     * <p>
     * Retrieves a sample of messages from the specified channel ingested during the specified timeframe. Up to 10
     * messages can be retrieved.
     * </p>
     * 
     * @param sampleChannelDataRequest
     * @return Result of the SampleChannelData operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.SampleChannelData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/SampleChannelData" target="_top">AWS
     *      API Documentation</a>
     */
    SampleChannelDataResult sampleChannelData(SampleChannelDataRequest sampleChannelDataRequest);

    /**
     * <p>
     * Starts the reprocessing of raw message data through the pipeline.
     * </p>
     * 
     * @param startPipelineReprocessingRequest
     * @return Result of the StartPipelineReprocessing operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws ResourceAlreadyExistsException
     *         A resource with the same name already exists.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.StartPipelineReprocessing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/StartPipelineReprocessing"
     *      target="_top">AWS API Documentation</a>
     */
    StartPipelineReprocessingResult startPipelineReprocessing(StartPipelineReprocessingRequest startPipelineReprocessingRequest);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @sample AWSIoTAnalytics.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the given tags (metadata) from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @sample AWSIoTAnalytics.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the settings of a channel.
     * </p>
     * 
     * @param updateChannelRequest
     * @return Result of the UpdateChannel operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateChannelResult updateChannel(UpdateChannelRequest updateChannelRequest);

    /**
     * <p>
     * Updates the settings of a data set.
     * </p>
     * 
     * @param updateDatasetRequest
     * @return Result of the UpdateDataset operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.UpdateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDatasetResult updateDataset(UpdateDatasetRequest updateDatasetRequest);

    /**
     * <p>
     * Updates the settings of a data store.
     * </p>
     * 
     * @param updateDatastoreRequest
     * @return Result of the UpdateDatastore operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSIoTAnalytics.UpdateDatastore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdateDatastore" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDatastoreResult updateDatastore(UpdateDatastoreRequest updateDatastoreRequest);

    /**
     * <p>
     * Updates the settings of a pipeline. You must specify both a <code>channel</code> and a <code>datastore</code>
     * activity and, optionally, as many as 23 additional activities in the <code>pipelineActivities</code> array.
     * </p>
     * 
     * @param updatePipelineRequest
     * @return Result of the UpdatePipeline operation returned by the service.
     * @throws InvalidRequestException
     *         The request was not valid.
     * @throws ResourceNotFoundException
     *         A resource with the specified name could not be found.
     * @throws InternalFailureException
     *         There was an internal failure.
     * @throws ServiceUnavailableException
     *         The service is temporarily unavailable.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws LimitExceededException
     *         The command caused an internal limit to be exceeded.
     * @sample AWSIoTAnalytics.UpdatePipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdatePipeline" target="_top">AWS
     *      API Documentation</a>
     */
    UpdatePipelineResult updatePipeline(UpdatePipelineRequest updatePipelineRequest);

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
