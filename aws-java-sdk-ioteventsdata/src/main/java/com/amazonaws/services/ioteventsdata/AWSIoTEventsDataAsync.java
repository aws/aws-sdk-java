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
package com.amazonaws.services.ioteventsdata;

import javax.annotation.Generated;

import com.amazonaws.services.ioteventsdata.model.*;

/**
 * Interface for accessing AWS IoT Events Data asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ioteventsdata.AbstractAWSIoTEventsDataAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS IoT Events monitors your equipment or device fleets for failures or changes in operation, and triggers actions
 * when such events occur. You can use AWS IoT Events Data API commands to send inputs to detectors, list detectors, and
 * view or update a detector's status.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/what-is-iotevents.html">What is AWS IoT Events?</a>
 * in the <i>AWS IoT Events Developer Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTEventsDataAsync extends AWSIoTEventsData {

    /**
     * <p>
     * Acknowledges one or more alarms. The alarms change to the <code>ACKNOWLEDGED</code> state after you acknowledge
     * them.
     * </p>
     * 
     * @param batchAcknowledgeAlarmRequest
     * @return A Java Future containing the result of the BatchAcknowledgeAlarm operation returned by the service.
     * @sample AWSIoTEventsDataAsync.BatchAcknowledgeAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchAcknowledgeAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAcknowledgeAlarmResult> batchAcknowledgeAlarmAsync(BatchAcknowledgeAlarmRequest batchAcknowledgeAlarmRequest);

    /**
     * <p>
     * Acknowledges one or more alarms. The alarms change to the <code>ACKNOWLEDGED</code> state after you acknowledge
     * them.
     * </p>
     * 
     * @param batchAcknowledgeAlarmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchAcknowledgeAlarm operation returned by the service.
     * @sample AWSIoTEventsDataAsyncHandler.BatchAcknowledgeAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchAcknowledgeAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchAcknowledgeAlarmResult> batchAcknowledgeAlarmAsync(BatchAcknowledgeAlarmRequest batchAcknowledgeAlarmRequest,
            com.amazonaws.handlers.AsyncHandler<BatchAcknowledgeAlarmRequest, BatchAcknowledgeAlarmResult> asyncHandler);

    /**
     * <p>
     * Disables one or more alarms. The alarms change to the <code>DISABLED</code> state after you disable them.
     * </p>
     * 
     * @param batchDisableAlarmRequest
     * @return A Java Future containing the result of the BatchDisableAlarm operation returned by the service.
     * @sample AWSIoTEventsDataAsync.BatchDisableAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchDisableAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisableAlarmResult> batchDisableAlarmAsync(BatchDisableAlarmRequest batchDisableAlarmRequest);

    /**
     * <p>
     * Disables one or more alarms. The alarms change to the <code>DISABLED</code> state after you disable them.
     * </p>
     * 
     * @param batchDisableAlarmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDisableAlarm operation returned by the service.
     * @sample AWSIoTEventsDataAsyncHandler.BatchDisableAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchDisableAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisableAlarmResult> batchDisableAlarmAsync(BatchDisableAlarmRequest batchDisableAlarmRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDisableAlarmRequest, BatchDisableAlarmResult> asyncHandler);

    /**
     * <p>
     * Enables one or more alarms. The alarms change to the <code>NORMAL</code> state after you enable them.
     * </p>
     * 
     * @param batchEnableAlarmRequest
     * @return A Java Future containing the result of the BatchEnableAlarm operation returned by the service.
     * @sample AWSIoTEventsDataAsync.BatchEnableAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchEnableAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchEnableAlarmResult> batchEnableAlarmAsync(BatchEnableAlarmRequest batchEnableAlarmRequest);

    /**
     * <p>
     * Enables one or more alarms. The alarms change to the <code>NORMAL</code> state after you enable them.
     * </p>
     * 
     * @param batchEnableAlarmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchEnableAlarm operation returned by the service.
     * @sample AWSIoTEventsDataAsyncHandler.BatchEnableAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchEnableAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchEnableAlarmResult> batchEnableAlarmAsync(BatchEnableAlarmRequest batchEnableAlarmRequest,
            com.amazonaws.handlers.AsyncHandler<BatchEnableAlarmRequest, BatchEnableAlarmResult> asyncHandler);

    /**
     * <p>
     * Sends a set of messages to the AWS IoT Events system. Each message payload is transformed into the input you
     * specify (<code>"inputName"</code>) and ingested into any detectors that monitor that input. If multiple messages
     * are sent, the order in which the messages are processed isn't guaranteed. To guarantee ordering, you must send
     * messages one at a time and wait for a successful response.
     * </p>
     * 
     * @param batchPutMessageRequest
     * @return A Java Future containing the result of the BatchPutMessage operation returned by the service.
     * @sample AWSIoTEventsDataAsync.BatchPutMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchPutMessage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchPutMessageResult> batchPutMessageAsync(BatchPutMessageRequest batchPutMessageRequest);

    /**
     * <p>
     * Sends a set of messages to the AWS IoT Events system. Each message payload is transformed into the input you
     * specify (<code>"inputName"</code>) and ingested into any detectors that monitor that input. If multiple messages
     * are sent, the order in which the messages are processed isn't guaranteed. To guarantee ordering, you must send
     * messages one at a time and wait for a successful response.
     * </p>
     * 
     * @param batchPutMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchPutMessage operation returned by the service.
     * @sample AWSIoTEventsDataAsyncHandler.BatchPutMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchPutMessage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchPutMessageResult> batchPutMessageAsync(BatchPutMessageRequest batchPutMessageRequest,
            com.amazonaws.handlers.AsyncHandler<BatchPutMessageRequest, BatchPutMessageResult> asyncHandler);

    /**
     * <p>
     * Resets one or more alarms. The alarms return to the <code>NORMAL</code> state after you reset them.
     * </p>
     * 
     * @param batchResetAlarmRequest
     * @return A Java Future containing the result of the BatchResetAlarm operation returned by the service.
     * @sample AWSIoTEventsDataAsync.BatchResetAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchResetAlarm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchResetAlarmResult> batchResetAlarmAsync(BatchResetAlarmRequest batchResetAlarmRequest);

    /**
     * <p>
     * Resets one or more alarms. The alarms return to the <code>NORMAL</code> state after you reset them.
     * </p>
     * 
     * @param batchResetAlarmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchResetAlarm operation returned by the service.
     * @sample AWSIoTEventsDataAsyncHandler.BatchResetAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchResetAlarm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchResetAlarmResult> batchResetAlarmAsync(BatchResetAlarmRequest batchResetAlarmRequest,
            com.amazonaws.handlers.AsyncHandler<BatchResetAlarmRequest, BatchResetAlarmResult> asyncHandler);

    /**
     * <p>
     * Changes one or more alarms to the snooze mode. The alarms change to the <code>SNOOZE_DISABLED</code> state after
     * you set them to the snooze mode.
     * </p>
     * 
     * @param batchSnoozeAlarmRequest
     * @return A Java Future containing the result of the BatchSnoozeAlarm operation returned by the service.
     * @sample AWSIoTEventsDataAsync.BatchSnoozeAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchSnoozeAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchSnoozeAlarmResult> batchSnoozeAlarmAsync(BatchSnoozeAlarmRequest batchSnoozeAlarmRequest);

    /**
     * <p>
     * Changes one or more alarms to the snooze mode. The alarms change to the <code>SNOOZE_DISABLED</code> state after
     * you set them to the snooze mode.
     * </p>
     * 
     * @param batchSnoozeAlarmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchSnoozeAlarm operation returned by the service.
     * @sample AWSIoTEventsDataAsyncHandler.BatchSnoozeAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchSnoozeAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchSnoozeAlarmResult> batchSnoozeAlarmAsync(BatchSnoozeAlarmRequest batchSnoozeAlarmRequest,
            com.amazonaws.handlers.AsyncHandler<BatchSnoozeAlarmRequest, BatchSnoozeAlarmResult> asyncHandler);

    /**
     * <p>
     * Updates the state, variable values, and timer settings of one or more detectors (instances) of a specified
     * detector model.
     * </p>
     * 
     * @param batchUpdateDetectorRequest
     * @return A Java Future containing the result of the BatchUpdateDetector operation returned by the service.
     * @sample AWSIoTEventsDataAsync.BatchUpdateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchUpdateDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateDetectorResult> batchUpdateDetectorAsync(BatchUpdateDetectorRequest batchUpdateDetectorRequest);

    /**
     * <p>
     * Updates the state, variable values, and timer settings of one or more detectors (instances) of a specified
     * detector model.
     * </p>
     * 
     * @param batchUpdateDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdateDetector operation returned by the service.
     * @sample AWSIoTEventsDataAsyncHandler.BatchUpdateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchUpdateDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateDetectorResult> batchUpdateDetectorAsync(BatchUpdateDetectorRequest batchUpdateDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateDetectorRequest, BatchUpdateDetectorResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an alarm.
     * </p>
     * 
     * @param describeAlarmRequest
     * @return A Java Future containing the result of the DescribeAlarm operation returned by the service.
     * @sample AWSIoTEventsDataAsync.DescribeAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DescribeAlarm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlarmResult> describeAlarmAsync(DescribeAlarmRequest describeAlarmRequest);

    /**
     * <p>
     * Retrieves information about an alarm.
     * </p>
     * 
     * @param describeAlarmRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlarm operation returned by the service.
     * @sample AWSIoTEventsDataAsyncHandler.DescribeAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DescribeAlarm" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAlarmResult> describeAlarmAsync(DescribeAlarmRequest describeAlarmRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAlarmRequest, DescribeAlarmResult> asyncHandler);

    /**
     * <p>
     * Returns information about the specified detector (instance).
     * </p>
     * 
     * @param describeDetectorRequest
     * @return A Java Future containing the result of the DescribeDetector operation returned by the service.
     * @sample AWSIoTEventsDataAsync.DescribeDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DescribeDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDetectorResult> describeDetectorAsync(DescribeDetectorRequest describeDetectorRequest);

    /**
     * <p>
     * Returns information about the specified detector (instance).
     * </p>
     * 
     * @param describeDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDetector operation returned by the service.
     * @sample AWSIoTEventsDataAsyncHandler.DescribeDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DescribeDetector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDetectorResult> describeDetectorAsync(DescribeDetectorRequest describeDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDetectorRequest, DescribeDetectorResult> asyncHandler);

    /**
     * <p>
     * Lists one or more alarms. The operation returns only the metadata associated with each alarm.
     * </p>
     * 
     * @param listAlarmsRequest
     * @return A Java Future containing the result of the ListAlarms operation returned by the service.
     * @sample AWSIoTEventsDataAsync.ListAlarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/ListAlarms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAlarmsResult> listAlarmsAsync(ListAlarmsRequest listAlarmsRequest);

    /**
     * <p>
     * Lists one or more alarms. The operation returns only the metadata associated with each alarm.
     * </p>
     * 
     * @param listAlarmsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAlarms operation returned by the service.
     * @sample AWSIoTEventsDataAsyncHandler.ListAlarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/ListAlarms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAlarmsResult> listAlarmsAsync(ListAlarmsRequest listAlarmsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAlarmsRequest, ListAlarmsResult> asyncHandler);

    /**
     * <p>
     * Lists detectors (the instances of a detector model).
     * </p>
     * 
     * @param listDetectorsRequest
     * @return A Java Future containing the result of the ListDetectors operation returned by the service.
     * @sample AWSIoTEventsDataAsync.ListDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/ListDetectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDetectorsResult> listDetectorsAsync(ListDetectorsRequest listDetectorsRequest);

    /**
     * <p>
     * Lists detectors (the instances of a detector model).
     * </p>
     * 
     * @param listDetectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDetectors operation returned by the service.
     * @sample AWSIoTEventsDataAsyncHandler.ListDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/ListDetectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDetectorsResult> listDetectorsAsync(ListDetectorsRequest listDetectorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDetectorsRequest, ListDetectorsResult> asyncHandler);

}
