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
package com.amazonaws.services.iotevents;

import javax.annotation.Generated;

import com.amazonaws.services.iotevents.model.*;

/**
 * Interface for accessing AWS IoT Events asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotevents.AbstractAWSIoTEventsAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS IoT Events monitors your equipment or device fleets for failures or changes in operation, and triggers actions
 * when such events occur. You can use AWS IoT Events API operations to create, read, update, and delete inputs and
 * detector models, and to list their versions.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTEventsAsync extends AWSIoTEvents {

    /**
     * <p>
     * Creates an alarm model to monitor an AWS IoT Events input attribute. You can use the alarm to get notified when
     * the value is outside a specified range. For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/create-alarms.html">Create an alarm model</a>
     * in the <i>AWS IoT Events Developer Guide</i>.
     * </p>
     * 
     * @param createAlarmModelRequest
     * @return A Java Future containing the result of the CreateAlarmModel operation returned by the service.
     * @sample AWSIoTEventsAsync.CreateAlarmModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/CreateAlarmModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAlarmModelResult> createAlarmModelAsync(CreateAlarmModelRequest createAlarmModelRequest);

    /**
     * <p>
     * Creates an alarm model to monitor an AWS IoT Events input attribute. You can use the alarm to get notified when
     * the value is outside a specified range. For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/create-alarms.html">Create an alarm model</a>
     * in the <i>AWS IoT Events Developer Guide</i>.
     * </p>
     * 
     * @param createAlarmModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlarmModel operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.CreateAlarmModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/CreateAlarmModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAlarmModelResult> createAlarmModelAsync(CreateAlarmModelRequest createAlarmModelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAlarmModelRequest, CreateAlarmModelResult> asyncHandler);

    /**
     * <p>
     * Creates a detector model.
     * </p>
     * 
     * @param createDetectorModelRequest
     * @return A Java Future containing the result of the CreateDetectorModel operation returned by the service.
     * @sample AWSIoTEventsAsync.CreateDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/CreateDetectorModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDetectorModelResult> createDetectorModelAsync(CreateDetectorModelRequest createDetectorModelRequest);

    /**
     * <p>
     * Creates a detector model.
     * </p>
     * 
     * @param createDetectorModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDetectorModel operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.CreateDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/CreateDetectorModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDetectorModelResult> createDetectorModelAsync(CreateDetectorModelRequest createDetectorModelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDetectorModelRequest, CreateDetectorModelResult> asyncHandler);

    /**
     * <p>
     * Creates an input.
     * </p>
     * 
     * @param createInputRequest
     * @return A Java Future containing the result of the CreateInput operation returned by the service.
     * @sample AWSIoTEventsAsync.CreateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/CreateInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInputResult> createInputAsync(CreateInputRequest createInputRequest);

    /**
     * <p>
     * Creates an input.
     * </p>
     * 
     * @param createInputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInput operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.CreateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/CreateInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInputResult> createInputAsync(CreateInputRequest createInputRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInputRequest, CreateInputResult> asyncHandler);

    /**
     * <p>
     * Deletes an alarm model. Any alarm instances that were created based on this alarm model are also deleted. This
     * action can't be undone.
     * </p>
     * 
     * @param deleteAlarmModelRequest
     * @return A Java Future containing the result of the DeleteAlarmModel operation returned by the service.
     * @sample AWSIoTEventsAsync.DeleteAlarmModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DeleteAlarmModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlarmModelResult> deleteAlarmModelAsync(DeleteAlarmModelRequest deleteAlarmModelRequest);

    /**
     * <p>
     * Deletes an alarm model. Any alarm instances that were created based on this alarm model are also deleted. This
     * action can't be undone.
     * </p>
     * 
     * @param deleteAlarmModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlarmModel operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.DeleteAlarmModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DeleteAlarmModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAlarmModelResult> deleteAlarmModelAsync(DeleteAlarmModelRequest deleteAlarmModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAlarmModelRequest, DeleteAlarmModelResult> asyncHandler);

    /**
     * <p>
     * Deletes a detector model. Any active instances of the detector model are also deleted.
     * </p>
     * 
     * @param deleteDetectorModelRequest
     * @return A Java Future containing the result of the DeleteDetectorModel operation returned by the service.
     * @sample AWSIoTEventsAsync.DeleteDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DeleteDetectorModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDetectorModelResult> deleteDetectorModelAsync(DeleteDetectorModelRequest deleteDetectorModelRequest);

    /**
     * <p>
     * Deletes a detector model. Any active instances of the detector model are also deleted.
     * </p>
     * 
     * @param deleteDetectorModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDetectorModel operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.DeleteDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DeleteDetectorModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDetectorModelResult> deleteDetectorModelAsync(DeleteDetectorModelRequest deleteDetectorModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDetectorModelRequest, DeleteDetectorModelResult> asyncHandler);

    /**
     * <p>
     * Deletes an input.
     * </p>
     * 
     * @param deleteInputRequest
     * @return A Java Future containing the result of the DeleteInput operation returned by the service.
     * @sample AWSIoTEventsAsync.DeleteInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DeleteInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInputResult> deleteInputAsync(DeleteInputRequest deleteInputRequest);

    /**
     * <p>
     * Deletes an input.
     * </p>
     * 
     * @param deleteInputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInput operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.DeleteInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DeleteInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInputResult> deleteInputAsync(DeleteInputRequest deleteInputRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInputRequest, DeleteInputResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an alarm model. If you don't specify a value for the <code>alarmModelVersion</code>
     * parameter, the latest version is returned.
     * </p>
     * 
     * @param describeAlarmModelRequest
     * @return A Java Future containing the result of the DescribeAlarmModel operation returned by the service.
     * @sample AWSIoTEventsAsync.DescribeAlarmModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeAlarmModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlarmModelResult> describeAlarmModelAsync(DescribeAlarmModelRequest describeAlarmModelRequest);

    /**
     * <p>
     * Retrieves information about an alarm model. If you don't specify a value for the <code>alarmModelVersion</code>
     * parameter, the latest version is returned.
     * </p>
     * 
     * @param describeAlarmModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlarmModel operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.DescribeAlarmModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeAlarmModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlarmModelResult> describeAlarmModelAsync(DescribeAlarmModelRequest describeAlarmModelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmModelRequest, DescribeAlarmModelResult> asyncHandler);

    /**
     * <p>
     * Describes a detector model. If the <code>version</code> parameter is not specified, information about the latest
     * version is returned.
     * </p>
     * 
     * @param describeDetectorModelRequest
     * @return A Java Future containing the result of the DescribeDetectorModel operation returned by the service.
     * @sample AWSIoTEventsAsync.DescribeDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeDetectorModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDetectorModelResult> describeDetectorModelAsync(DescribeDetectorModelRequest describeDetectorModelRequest);

    /**
     * <p>
     * Describes a detector model. If the <code>version</code> parameter is not specified, information about the latest
     * version is returned.
     * </p>
     * 
     * @param describeDetectorModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDetectorModel operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.DescribeDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeDetectorModel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDetectorModelResult> describeDetectorModelAsync(DescribeDetectorModelRequest describeDetectorModelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDetectorModelRequest, DescribeDetectorModelResult> asyncHandler);

    /**
     * <p>
     * Retrieves runtime information about a detector model analysis.
     * </p>
     * <note>
     * <p>
     * After AWS IoT Events starts analyzing your detector model, you have up to 24 hours to retrieve the analysis
     * results.
     * </p>
     * </note>
     * 
     * @param describeDetectorModelAnalysisRequest
     * @return A Java Future containing the result of the DescribeDetectorModelAnalysis operation returned by the
     *         service.
     * @sample AWSIoTEventsAsync.DescribeDetectorModelAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeDetectorModelAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDetectorModelAnalysisResult> describeDetectorModelAnalysisAsync(
            DescribeDetectorModelAnalysisRequest describeDetectorModelAnalysisRequest);

    /**
     * <p>
     * Retrieves runtime information about a detector model analysis.
     * </p>
     * <note>
     * <p>
     * After AWS IoT Events starts analyzing your detector model, you have up to 24 hours to retrieve the analysis
     * results.
     * </p>
     * </note>
     * 
     * @param describeDetectorModelAnalysisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDetectorModelAnalysis operation returned by the
     *         service.
     * @sample AWSIoTEventsAsyncHandler.DescribeDetectorModelAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeDetectorModelAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDetectorModelAnalysisResult> describeDetectorModelAnalysisAsync(
            DescribeDetectorModelAnalysisRequest describeDetectorModelAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDetectorModelAnalysisRequest, DescribeDetectorModelAnalysisResult> asyncHandler);

    /**
     * <p>
     * Describes an input.
     * </p>
     * 
     * @param describeInputRequest
     * @return A Java Future containing the result of the DescribeInput operation returned by the service.
     * @sample AWSIoTEventsAsync.DescribeInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInputResult> describeInputAsync(DescribeInputRequest describeInputRequest);

    /**
     * <p>
     * Describes an input.
     * </p>
     * 
     * @param describeInputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInput operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.DescribeInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInputResult> describeInputAsync(DescribeInputRequest describeInputRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInputRequest, DescribeInputResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current settings of the AWS IoT Events logging options.
     * </p>
     * 
     * @param describeLoggingOptionsRequest
     * @return A Java Future containing the result of the DescribeLoggingOptions operation returned by the service.
     * @sample AWSIoTEventsAsync.DescribeLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeLoggingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoggingOptionsResult> describeLoggingOptionsAsync(DescribeLoggingOptionsRequest describeLoggingOptionsRequest);

    /**
     * <p>
     * Retrieves the current settings of the AWS IoT Events logging options.
     * </p>
     * 
     * @param describeLoggingOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoggingOptions operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.DescribeLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DescribeLoggingOptions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoggingOptionsResult> describeLoggingOptionsAsync(DescribeLoggingOptionsRequest describeLoggingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoggingOptionsRequest, DescribeLoggingOptionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves one or more analysis results of the detector model.
     * </p>
     * <note>
     * <p>
     * After AWS IoT Events starts analyzing your detector model, you have up to 24 hours to retrieve the analysis
     * results.
     * </p>
     * </note>
     * 
     * @param getDetectorModelAnalysisResultsRequest
     * @return A Java Future containing the result of the GetDetectorModelAnalysisResults operation returned by the
     *         service.
     * @sample AWSIoTEventsAsync.GetDetectorModelAnalysisResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/GetDetectorModelAnalysisResults"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDetectorModelAnalysisResultsResult> getDetectorModelAnalysisResultsAsync(
            GetDetectorModelAnalysisResultsRequest getDetectorModelAnalysisResultsRequest);

    /**
     * <p>
     * Retrieves one or more analysis results of the detector model.
     * </p>
     * <note>
     * <p>
     * After AWS IoT Events starts analyzing your detector model, you have up to 24 hours to retrieve the analysis
     * results.
     * </p>
     * </note>
     * 
     * @param getDetectorModelAnalysisResultsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDetectorModelAnalysisResults operation returned by the
     *         service.
     * @sample AWSIoTEventsAsyncHandler.GetDetectorModelAnalysisResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/GetDetectorModelAnalysisResults"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDetectorModelAnalysisResultsResult> getDetectorModelAnalysisResultsAsync(
            GetDetectorModelAnalysisResultsRequest getDetectorModelAnalysisResultsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDetectorModelAnalysisResultsRequest, GetDetectorModelAnalysisResultsResult> asyncHandler);

    /**
     * <p>
     * Lists all the versions of an alarm model. The operation returns only the metadata associated with each alarm
     * model version.
     * </p>
     * 
     * @param listAlarmModelVersionsRequest
     * @return A Java Future containing the result of the ListAlarmModelVersions operation returned by the service.
     * @sample AWSIoTEventsAsync.ListAlarmModelVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListAlarmModelVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAlarmModelVersionsResult> listAlarmModelVersionsAsync(ListAlarmModelVersionsRequest listAlarmModelVersionsRequest);

    /**
     * <p>
     * Lists all the versions of an alarm model. The operation returns only the metadata associated with each alarm
     * model version.
     * </p>
     * 
     * @param listAlarmModelVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAlarmModelVersions operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.ListAlarmModelVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListAlarmModelVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAlarmModelVersionsResult> listAlarmModelVersionsAsync(ListAlarmModelVersionsRequest listAlarmModelVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAlarmModelVersionsRequest, ListAlarmModelVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists the alarm models that you created. The operation returns only the metadata associated with each alarm
     * model.
     * </p>
     * 
     * @param listAlarmModelsRequest
     * @return A Java Future containing the result of the ListAlarmModels operation returned by the service.
     * @sample AWSIoTEventsAsync.ListAlarmModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListAlarmModels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAlarmModelsResult> listAlarmModelsAsync(ListAlarmModelsRequest listAlarmModelsRequest);

    /**
     * <p>
     * Lists the alarm models that you created. The operation returns only the metadata associated with each alarm
     * model.
     * </p>
     * 
     * @param listAlarmModelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAlarmModels operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.ListAlarmModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListAlarmModels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAlarmModelsResult> listAlarmModelsAsync(ListAlarmModelsRequest listAlarmModelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAlarmModelsRequest, ListAlarmModelsResult> asyncHandler);

    /**
     * <p>
     * Lists all the versions of a detector model. Only the metadata associated with each detector model version is
     * returned.
     * </p>
     * 
     * @param listDetectorModelVersionsRequest
     * @return A Java Future containing the result of the ListDetectorModelVersions operation returned by the service.
     * @sample AWSIoTEventsAsync.ListDetectorModelVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListDetectorModelVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDetectorModelVersionsResult> listDetectorModelVersionsAsync(
            ListDetectorModelVersionsRequest listDetectorModelVersionsRequest);

    /**
     * <p>
     * Lists all the versions of a detector model. Only the metadata associated with each detector model version is
     * returned.
     * </p>
     * 
     * @param listDetectorModelVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDetectorModelVersions operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.ListDetectorModelVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListDetectorModelVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDetectorModelVersionsResult> listDetectorModelVersionsAsync(
            ListDetectorModelVersionsRequest listDetectorModelVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDetectorModelVersionsRequest, ListDetectorModelVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists the detector models you have created. Only the metadata associated with each detector model is returned.
     * </p>
     * 
     * @param listDetectorModelsRequest
     * @return A Java Future containing the result of the ListDetectorModels operation returned by the service.
     * @sample AWSIoTEventsAsync.ListDetectorModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListDetectorModels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDetectorModelsResult> listDetectorModelsAsync(ListDetectorModelsRequest listDetectorModelsRequest);

    /**
     * <p>
     * Lists the detector models you have created. Only the metadata associated with each detector model is returned.
     * </p>
     * 
     * @param listDetectorModelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDetectorModels operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.ListDetectorModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListDetectorModels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDetectorModelsResult> listDetectorModelsAsync(ListDetectorModelsRequest listDetectorModelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDetectorModelsRequest, ListDetectorModelsResult> asyncHandler);

    /**
     * <p>
     * Lists one or more input routings.
     * </p>
     * 
     * @param listInputRoutingsRequest
     * @return A Java Future containing the result of the ListInputRoutings operation returned by the service.
     * @sample AWSIoTEventsAsync.ListInputRoutings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListInputRoutings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListInputRoutingsResult> listInputRoutingsAsync(ListInputRoutingsRequest listInputRoutingsRequest);

    /**
     * <p>
     * Lists one or more input routings.
     * </p>
     * 
     * @param listInputRoutingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInputRoutings operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.ListInputRoutings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListInputRoutings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListInputRoutingsResult> listInputRoutingsAsync(ListInputRoutingsRequest listInputRoutingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInputRoutingsRequest, ListInputRoutingsResult> asyncHandler);

    /**
     * <p>
     * Lists the inputs you have created.
     * </p>
     * 
     * @param listInputsRequest
     * @return A Java Future containing the result of the ListInputs operation returned by the service.
     * @sample AWSIoTEventsAsync.ListInputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListInputs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInputsResult> listInputsAsync(ListInputsRequest listInputsRequest);

    /**
     * <p>
     * Lists the inputs you have created.
     * </p>
     * 
     * @param listInputsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInputs operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.ListInputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListInputs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInputsResult> listInputsAsync(ListInputsRequest listInputsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInputsRequest, ListInputsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags (metadata) you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTEventsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags (metadata) you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Sets or updates the AWS IoT Events logging options.
     * </p>
     * <p>
     * If you update the value of any <code>loggingOptions</code> field, it takes up to one minute for the change to
     * take effect. If you change the policy attached to the role you specified in the <code>roleArn</code> field (for
     * example, to correct an invalid policy), it takes up to five minutes for that change to take effect.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @return A Java Future containing the result of the PutLoggingOptions operation returned by the service.
     * @sample AWSIoTEventsAsync.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/PutLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(PutLoggingOptionsRequest putLoggingOptionsRequest);

    /**
     * <p>
     * Sets or updates the AWS IoT Events logging options.
     * </p>
     * <p>
     * If you update the value of any <code>loggingOptions</code> field, it takes up to one minute for the change to
     * take effect. If you change the policy attached to the role you specified in the <code>roleArn</code> field (for
     * example, to correct an invalid policy), it takes up to five minutes for that change to take effect.
     * </p>
     * 
     * @param putLoggingOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLoggingOptions operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.PutLoggingOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/PutLoggingOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLoggingOptionsResult> putLoggingOptionsAsync(PutLoggingOptionsRequest putLoggingOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<PutLoggingOptionsRequest, PutLoggingOptionsResult> asyncHandler);

    /**
     * <p>
     * Performs an analysis of your detector model. For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-analyze-api.html">Troubleshooting a
     * detector model</a> in the <i>AWS IoT Events Developer Guide</i>.
     * </p>
     * 
     * @param startDetectorModelAnalysisRequest
     * @return A Java Future containing the result of the StartDetectorModelAnalysis operation returned by the service.
     * @sample AWSIoTEventsAsync.StartDetectorModelAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/StartDetectorModelAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDetectorModelAnalysisResult> startDetectorModelAnalysisAsync(
            StartDetectorModelAnalysisRequest startDetectorModelAnalysisRequest);

    /**
     * <p>
     * Performs an analysis of your detector model. For more information, see <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-analyze-api.html">Troubleshooting a
     * detector model</a> in the <i>AWS IoT Events Developer Guide</i>.
     * </p>
     * 
     * @param startDetectorModelAnalysisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDetectorModelAnalysis operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.StartDetectorModelAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/StartDetectorModelAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartDetectorModelAnalysisResult> startDetectorModelAnalysisAsync(
            StartDetectorModelAnalysisRequest startDetectorModelAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<StartDetectorModelAnalysisRequest, StartDetectorModelAnalysisResult> asyncHandler);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTEventsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the given tags (metadata) from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTEventsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the given tags (metadata) from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an alarm model. Any alarms that were created based on the previous version are deleted and then created
     * again as new data arrives.
     * </p>
     * 
     * @param updateAlarmModelRequest
     * @return A Java Future containing the result of the UpdateAlarmModel operation returned by the service.
     * @sample AWSIoTEventsAsync.UpdateAlarmModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UpdateAlarmModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAlarmModelResult> updateAlarmModelAsync(UpdateAlarmModelRequest updateAlarmModelRequest);

    /**
     * <p>
     * Updates an alarm model. Any alarms that were created based on the previous version are deleted and then created
     * again as new data arrives.
     * </p>
     * 
     * @param updateAlarmModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAlarmModel operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.UpdateAlarmModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UpdateAlarmModel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAlarmModelResult> updateAlarmModelAsync(UpdateAlarmModelRequest updateAlarmModelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAlarmModelRequest, UpdateAlarmModelResult> asyncHandler);

    /**
     * <p>
     * Updates a detector model. Detectors (instances) spawned by the previous version are deleted and then re-created
     * as new inputs arrive.
     * </p>
     * 
     * @param updateDetectorModelRequest
     * @return A Java Future containing the result of the UpdateDetectorModel operation returned by the service.
     * @sample AWSIoTEventsAsync.UpdateDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UpdateDetectorModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDetectorModelResult> updateDetectorModelAsync(UpdateDetectorModelRequest updateDetectorModelRequest);

    /**
     * <p>
     * Updates a detector model. Detectors (instances) spawned by the previous version are deleted and then re-created
     * as new inputs arrive.
     * </p>
     * 
     * @param updateDetectorModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDetectorModel operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.UpdateDetectorModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UpdateDetectorModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDetectorModelResult> updateDetectorModelAsync(UpdateDetectorModelRequest updateDetectorModelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDetectorModelRequest, UpdateDetectorModelResult> asyncHandler);

    /**
     * <p>
     * Updates an input.
     * </p>
     * 
     * @param updateInputRequest
     * @return A Java Future containing the result of the UpdateInput operation returned by the service.
     * @sample AWSIoTEventsAsync.UpdateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UpdateInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateInputResult> updateInputAsync(UpdateInputRequest updateInputRequest);

    /**
     * <p>
     * Updates an input.
     * </p>
     * 
     * @param updateInputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInput operation returned by the service.
     * @sample AWSIoTEventsAsyncHandler.UpdateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/UpdateInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateInputResult> updateInputAsync(UpdateInputRequest updateInputRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInputRequest, UpdateInputResult> asyncHandler);

}
