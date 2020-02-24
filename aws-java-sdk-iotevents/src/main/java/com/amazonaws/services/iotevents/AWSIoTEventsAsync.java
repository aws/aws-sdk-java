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
 * when such events occur. You can use AWS IoT Events API commands to create, read, update, and delete inputs and
 * detector models, and to list their versions.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTEventsAsync extends AWSIoTEvents {

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
