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
package com.amazonaws.services.iotdeviceadvisor;

import javax.annotation.Generated;

import com.amazonaws.services.iotdeviceadvisor.model.*;

/**
 * Interface for accessing AWSIoTDeviceAdvisor asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotdeviceadvisor.AbstractAWSIoTDeviceAdvisorAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS IoT Core Device Advisor is a cloud-based, fully managed test capability for validating IoT devices during device
 * software development. Device Advisor provides pre-built tests that you can use to validate IoT devices for reliable
 * and secure connectivity with AWS IoT Core before deploying devices to production. By using Device Advisor, you can
 * confirm that your devices can connect to AWS IoT Core, follow security best practices and, if applicable, receive
 * software updates from IoT Device Management. You can also download signed qualification reports to submit to the AWS
 * Partner Network to get your device qualified for the AWS Partner Device Catalog without the need to send your device
 * in and wait for it to be tested.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTDeviceAdvisorAsync extends AWSIoTDeviceAdvisor {

    /**
     * <p>
     * Creates a Device Advisor test suite.
     * </p>
     * 
     * @param createSuiteDefinitionRequest
     * @return A Java Future containing the result of the CreateSuiteDefinition operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsync.CreateSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/CreateSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSuiteDefinitionResult> createSuiteDefinitionAsync(CreateSuiteDefinitionRequest createSuiteDefinitionRequest);

    /**
     * <p>
     * Creates a Device Advisor test suite.
     * </p>
     * 
     * @param createSuiteDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSuiteDefinition operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsyncHandler.CreateSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/CreateSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSuiteDefinitionResult> createSuiteDefinitionAsync(CreateSuiteDefinitionRequest createSuiteDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSuiteDefinitionRequest, CreateSuiteDefinitionResult> asyncHandler);

    /**
     * <p>
     * Deletes a Device Advisor test suite.
     * </p>
     * 
     * @param deleteSuiteDefinitionRequest
     * @return A Java Future containing the result of the DeleteSuiteDefinition operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsync.DeleteSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/DeleteSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSuiteDefinitionResult> deleteSuiteDefinitionAsync(DeleteSuiteDefinitionRequest deleteSuiteDefinitionRequest);

    /**
     * <p>
     * Deletes a Device Advisor test suite.
     * </p>
     * 
     * @param deleteSuiteDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSuiteDefinition operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsyncHandler.DeleteSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/DeleteSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSuiteDefinitionResult> deleteSuiteDefinitionAsync(DeleteSuiteDefinitionRequest deleteSuiteDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSuiteDefinitionRequest, DeleteSuiteDefinitionResult> asyncHandler);

    /**
     * <p>
     * Gets information about a Device Advisor test suite.
     * </p>
     * 
     * @param getSuiteDefinitionRequest
     * @return A Java Future containing the result of the GetSuiteDefinition operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsync.GetSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSuiteDefinitionResult> getSuiteDefinitionAsync(GetSuiteDefinitionRequest getSuiteDefinitionRequest);

    /**
     * <p>
     * Gets information about a Device Advisor test suite.
     * </p>
     * 
     * @param getSuiteDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSuiteDefinition operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsyncHandler.GetSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSuiteDefinitionResult> getSuiteDefinitionAsync(GetSuiteDefinitionRequest getSuiteDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<GetSuiteDefinitionRequest, GetSuiteDefinitionResult> asyncHandler);

    /**
     * <p>
     * Gets information about a Device Advisor test suite run.
     * </p>
     * 
     * @param getSuiteRunRequest
     * @return A Java Future containing the result of the GetSuiteRun operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsync.GetSuiteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSuiteRunResult> getSuiteRunAsync(GetSuiteRunRequest getSuiteRunRequest);

    /**
     * <p>
     * Gets information about a Device Advisor test suite run.
     * </p>
     * 
     * @param getSuiteRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSuiteRun operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsyncHandler.GetSuiteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSuiteRunResult> getSuiteRunAsync(GetSuiteRunRequest getSuiteRunRequest,
            com.amazonaws.handlers.AsyncHandler<GetSuiteRunRequest, GetSuiteRunResult> asyncHandler);

    /**
     * <p>
     * Gets a report download link for a successful Device Advisor qualifying test suite run.
     * </p>
     * 
     * @param getSuiteRunReportRequest
     * @return A Java Future containing the result of the GetSuiteRunReport operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsync.GetSuiteRunReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteRunReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSuiteRunReportResult> getSuiteRunReportAsync(GetSuiteRunReportRequest getSuiteRunReportRequest);

    /**
     * <p>
     * Gets a report download link for a successful Device Advisor qualifying test suite run.
     * </p>
     * 
     * @param getSuiteRunReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSuiteRunReport operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsyncHandler.GetSuiteRunReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/GetSuiteRunReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSuiteRunReportResult> getSuiteRunReportAsync(GetSuiteRunReportRequest getSuiteRunReportRequest,
            com.amazonaws.handlers.AsyncHandler<GetSuiteRunReportRequest, GetSuiteRunReportResult> asyncHandler);

    /**
     * <p>
     * Lists the Device Advisor test suites you have created.
     * </p>
     * 
     * @param listSuiteDefinitionsRequest
     * @return A Java Future containing the result of the ListSuiteDefinitions operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsync.ListSuiteDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListSuiteDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSuiteDefinitionsResult> listSuiteDefinitionsAsync(ListSuiteDefinitionsRequest listSuiteDefinitionsRequest);

    /**
     * <p>
     * Lists the Device Advisor test suites you have created.
     * </p>
     * 
     * @param listSuiteDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSuiteDefinitions operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsyncHandler.ListSuiteDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListSuiteDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSuiteDefinitionsResult> listSuiteDefinitionsAsync(ListSuiteDefinitionsRequest listSuiteDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSuiteDefinitionsRequest, ListSuiteDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Lists the runs of the specified Device Advisor test suite. You can list all runs of the test suite, or the runs
     * of a specific version of the test suite.
     * </p>
     * 
     * @param listSuiteRunsRequest
     * @return A Java Future containing the result of the ListSuiteRuns operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsync.ListSuiteRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListSuiteRuns" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSuiteRunsResult> listSuiteRunsAsync(ListSuiteRunsRequest listSuiteRunsRequest);

    /**
     * <p>
     * Lists the runs of the specified Device Advisor test suite. You can list all runs of the test suite, or the runs
     * of a specific version of the test suite.
     * </p>
     * 
     * @param listSuiteRunsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSuiteRuns operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsyncHandler.ListSuiteRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListSuiteRuns" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSuiteRunsResult> listSuiteRunsAsync(ListSuiteRunsRequest listSuiteRunsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSuiteRunsRequest, ListSuiteRunsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags attached to an IoT Device Advisor resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags attached to an IoT Device Advisor resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts a Device Advisor test suite run.
     * </p>
     * 
     * @param startSuiteRunRequest
     * @return A Java Future containing the result of the StartSuiteRun operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsync.StartSuiteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/StartSuiteRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartSuiteRunResult> startSuiteRunAsync(StartSuiteRunRequest startSuiteRunRequest);

    /**
     * <p>
     * Starts a Device Advisor test suite run.
     * </p>
     * 
     * @param startSuiteRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSuiteRun operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsyncHandler.StartSuiteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/StartSuiteRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartSuiteRunResult> startSuiteRunAsync(StartSuiteRunRequest startSuiteRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartSuiteRunRequest, StartSuiteRunResult> asyncHandler);

    /**
     * <p>
     * Stops a Device Advisor test suite run that is currently running.
     * </p>
     * 
     * @param stopSuiteRunRequest
     * @return A Java Future containing the result of the StopSuiteRun operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsync.StopSuiteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/StopSuiteRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopSuiteRunResult> stopSuiteRunAsync(StopSuiteRunRequest stopSuiteRunRequest);

    /**
     * <p>
     * Stops a Device Advisor test suite run that is currently running.
     * </p>
     * 
     * @param stopSuiteRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopSuiteRun operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsyncHandler.StopSuiteRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/StopSuiteRun" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopSuiteRunResult> stopSuiteRunAsync(StopSuiteRunRequest stopSuiteRunRequest,
            com.amazonaws.handlers.AsyncHandler<StopSuiteRunRequest, StopSuiteRunResult> asyncHandler);

    /**
     * <p>
     * Adds to and modifies existing tags of an IoT Device Advisor resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds to and modifies existing tags of an IoT Device Advisor resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from an IoT Device Advisor resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from an IoT Device Advisor resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a Device Advisor test suite.
     * </p>
     * 
     * @param updateSuiteDefinitionRequest
     * @return A Java Future containing the result of the UpdateSuiteDefinition operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsync.UpdateSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/UpdateSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSuiteDefinitionResult> updateSuiteDefinitionAsync(UpdateSuiteDefinitionRequest updateSuiteDefinitionRequest);

    /**
     * <p>
     * Updates a Device Advisor test suite.
     * </p>
     * 
     * @param updateSuiteDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSuiteDefinition operation returned by the service.
     * @sample AWSIoTDeviceAdvisorAsyncHandler.UpdateSuiteDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/UpdateSuiteDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSuiteDefinitionResult> updateSuiteDefinitionAsync(UpdateSuiteDefinitionRequest updateSuiteDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSuiteDefinitionRequest, UpdateSuiteDefinitionResult> asyncHandler);

}
