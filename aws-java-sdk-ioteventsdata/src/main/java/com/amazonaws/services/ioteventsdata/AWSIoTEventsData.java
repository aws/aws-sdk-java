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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ioteventsdata.model.*;

/**
 * Interface for accessing AWS IoT Events Data.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ioteventsdata.AbstractAWSIoTEventsData} instead.
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
public interface AWSIoTEventsData {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "data.iotevents";

    /**
     * <p>
     * Acknowledges one or more alarms. The alarms change to the <code>ACKNOWLEDGED</code> state after you acknowledge
     * them.
     * </p>
     * 
     * @param batchAcknowledgeAlarmRequest
     * @return Result of the BatchAcknowledgeAlarm operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchAcknowledgeAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchAcknowledgeAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    BatchAcknowledgeAlarmResult batchAcknowledgeAlarm(BatchAcknowledgeAlarmRequest batchAcknowledgeAlarmRequest);

    /**
     * <p>
     * Disables one or more alarms. The alarms change to the <code>DISABLED</code> state after you disable them.
     * </p>
     * 
     * @param batchDisableAlarmRequest
     * @return Result of the BatchDisableAlarm operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchDisableAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchDisableAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDisableAlarmResult batchDisableAlarm(BatchDisableAlarmRequest batchDisableAlarmRequest);

    /**
     * <p>
     * Enables one or more alarms. The alarms change to the <code>NORMAL</code> state after you enable them.
     * </p>
     * 
     * @param batchEnableAlarmRequest
     * @return Result of the BatchEnableAlarm operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchEnableAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchEnableAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    BatchEnableAlarmResult batchEnableAlarm(BatchEnableAlarmRequest batchEnableAlarmRequest);

    /**
     * <p>
     * Sends a set of messages to the AWS IoT Events system. Each message payload is transformed into the input you
     * specify (<code>"inputName"</code>) and ingested into any detectors that monitor that input. If multiple messages
     * are sent, the order in which the messages are processed isn't guaranteed. To guarantee ordering, you must send
     * messages one at a time and wait for a successful response.
     * </p>
     * 
     * @param batchPutMessageRequest
     * @return Result of the BatchPutMessage operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchPutMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchPutMessage" target="_top">AWS
     *      API Documentation</a>
     */
    BatchPutMessageResult batchPutMessage(BatchPutMessageRequest batchPutMessageRequest);

    /**
     * <p>
     * Resets one or more alarms. The alarms return to the <code>NORMAL</code> state after you reset them.
     * </p>
     * 
     * @param batchResetAlarmRequest
     * @return Result of the BatchResetAlarm operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchResetAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchResetAlarm" target="_top">AWS
     *      API Documentation</a>
     */
    BatchResetAlarmResult batchResetAlarm(BatchResetAlarmRequest batchResetAlarmRequest);

    /**
     * <p>
     * Changes one or more alarms to the snooze mode. The alarms change to the <code>SNOOZE_DISABLED</code> state after
     * you set them to the snooze mode.
     * </p>
     * 
     * @param batchSnoozeAlarmRequest
     * @return Result of the BatchSnoozeAlarm operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchSnoozeAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchSnoozeAlarm"
     *      target="_top">AWS API Documentation</a>
     */
    BatchSnoozeAlarmResult batchSnoozeAlarm(BatchSnoozeAlarmRequest batchSnoozeAlarmRequest);

    /**
     * <p>
     * Updates the state, variable values, and timer settings of one or more detectors (instances) of a specified
     * detector model.
     * </p>
     * 
     * @param batchUpdateDetectorRequest
     * @return Result of the BatchUpdateDetector operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @sample AWSIoTEventsData.BatchUpdateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchUpdateDetector"
     *      target="_top">AWS API Documentation</a>
     */
    BatchUpdateDetectorResult batchUpdateDetector(BatchUpdateDetectorRequest batchUpdateDetectorRequest);

    /**
     * <p>
     * Retrieves information about an alarm.
     * </p>
     * 
     * @param describeAlarmRequest
     * @return Result of the DescribeAlarm operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEventsData.DescribeAlarm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DescribeAlarm" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeAlarmResult describeAlarm(DescribeAlarmRequest describeAlarmRequest);

    /**
     * <p>
     * Returns information about the specified detector (instance).
     * </p>
     * 
     * @param describeDetectorRequest
     * @return Result of the DescribeDetector operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEventsData.DescribeDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DescribeDetector"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDetectorResult describeDetector(DescribeDetectorRequest describeDetectorRequest);

    /**
     * <p>
     * Lists one or more alarms. The operation returns only the metadata associated with each alarm.
     * </p>
     * 
     * @param listAlarmsRequest
     * @return Result of the ListAlarms operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEventsData.ListAlarms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/ListAlarms" target="_top">AWS API
     *      Documentation</a>
     */
    ListAlarmsResult listAlarms(ListAlarmsRequest listAlarmsRequest);

    /**
     * <p>
     * Lists detectors (the instances of a detector model).
     * </p>
     * 
     * @param listDetectorsRequest
     * @return Result of the ListDetectors operation returned by the service.
     * @throws InvalidRequestException
     *         The request was invalid.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ThrottlingException
     *         The request could not be completed due to throttling.
     * @throws InternalFailureException
     *         An internal failure occurred.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @sample AWSIoTEventsData.ListDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/ListDetectors" target="_top">AWS
     *      API Documentation</a>
     */
    ListDetectorsResult listDetectors(ListDetectorsRequest listDetectorsRequest);

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
