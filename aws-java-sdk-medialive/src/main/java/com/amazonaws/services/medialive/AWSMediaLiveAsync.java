/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;

/**
 * Interface for accessing MediaLive asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.medialive.AbstractAWSMediaLiveAsync} instead.
 * </p>
 * <p>
 * API for AWS Elemental MediaLive
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaLiveAsync extends AWSMediaLive {

    /**
     * Creates a new channel
     * 
     * @param createChannelRequest
     *        A request to create a channel
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AWSMediaLiveAsync.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest);

    /**
     * Creates a new channel
     * 
     * @param createChannelRequest
     *        A request to create a channel
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelRequest, CreateChannelResult> asyncHandler);

    /**
     * Create an input
     * 
     * @param createInputRequest
     *        The name of the input
     * @return A Java Future containing the result of the CreateInput operation returned by the service.
     * @sample AWSMediaLiveAsync.CreateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInputResult> createInputAsync(CreateInputRequest createInputRequest);

    /**
     * Create an input
     * 
     * @param createInputRequest
     *        The name of the input
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInput operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.CreateInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInputResult> createInputAsync(CreateInputRequest createInputRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInputRequest, CreateInputResult> asyncHandler);

    /**
     * Creates a Input Security Group
     * 
     * @param createInputSecurityGroupRequest
     *        The IPv4 CIDRs to whitelist for this Input Security Group
     * @return A Java Future containing the result of the CreateInputSecurityGroup operation returned by the service.
     * @sample AWSMediaLiveAsync.CreateInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInputSecurityGroupResult> createInputSecurityGroupAsync(CreateInputSecurityGroupRequest createInputSecurityGroupRequest);

    /**
     * Creates a Input Security Group
     * 
     * @param createInputSecurityGroupRequest
     *        The IPv4 CIDRs to whitelist for this Input Security Group
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInputSecurityGroup operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.CreateInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateInputSecurityGroupResult> createInputSecurityGroupAsync(CreateInputSecurityGroupRequest createInputSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInputSecurityGroupRequest, CreateInputSecurityGroupResult> asyncHandler);

    /**
     * Starts deletion of channel. The associated outputs are also deleted.
     * 
     * @param deleteChannelRequest
     *        Placeholder documentation for DeleteChannelRequest
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AWSMediaLiveAsync.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest);

    /**
     * Starts deletion of channel. The associated outputs are also deleted.
     * 
     * @param deleteChannelRequest
     *        Placeholder documentation for DeleteChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelRequest, DeleteChannelResult> asyncHandler);

    /**
     * Deletes the input end point
     * 
     * @param deleteInputRequest
     *        Placeholder documentation for DeleteInputRequest
     * @return A Java Future containing the result of the DeleteInput operation returned by the service.
     * @sample AWSMediaLiveAsync.DeleteInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInputResult> deleteInputAsync(DeleteInputRequest deleteInputRequest);

    /**
     * Deletes the input end point
     * 
     * @param deleteInputRequest
     *        Placeholder documentation for DeleteInputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInput operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DeleteInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInputResult> deleteInputAsync(DeleteInputRequest deleteInputRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInputRequest, DeleteInputResult> asyncHandler);

    /**
     * Deletes an Input Security Group
     * 
     * @param deleteInputSecurityGroupRequest
     *        Placeholder documentation for DeleteInputSecurityGroupRequest
     * @return A Java Future containing the result of the DeleteInputSecurityGroup operation returned by the service.
     * @sample AWSMediaLiveAsync.DeleteInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInputSecurityGroupResult> deleteInputSecurityGroupAsync(DeleteInputSecurityGroupRequest deleteInputSecurityGroupRequest);

    /**
     * Deletes an Input Security Group
     * 
     * @param deleteInputSecurityGroupRequest
     *        Placeholder documentation for DeleteInputSecurityGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInputSecurityGroup operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DeleteInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInputSecurityGroupResult> deleteInputSecurityGroupAsync(DeleteInputSecurityGroupRequest deleteInputSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInputSecurityGroupRequest, DeleteInputSecurityGroupResult> asyncHandler);

    /**
     * Gets details about a channel
     * 
     * @param describeChannelRequest
     *        Placeholder documentation for DescribeChannelRequest
     * @return A Java Future containing the result of the DescribeChannel operation returned by the service.
     * @sample AWSMediaLiveAsync.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest describeChannelRequest);

    /**
     * Gets details about a channel
     * 
     * @param describeChannelRequest
     *        Placeholder documentation for DescribeChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChannel operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest describeChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChannelRequest, DescribeChannelResult> asyncHandler);

    /**
     * Produces details about an input
     * 
     * @param describeInputRequest
     *        Placeholder documentation for DescribeInputRequest
     * @return A Java Future containing the result of the DescribeInput operation returned by the service.
     * @sample AWSMediaLiveAsync.DescribeInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInputResult> describeInputAsync(DescribeInputRequest describeInputRequest);

    /**
     * Produces details about an input
     * 
     * @param describeInputRequest
     *        Placeholder documentation for DescribeInputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInput operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DescribeInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInput" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInputResult> describeInputAsync(DescribeInputRequest describeInputRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInputRequest, DescribeInputResult> asyncHandler);

    /**
     * Produces a summary of an Input Security Group
     * 
     * @param describeInputSecurityGroupRequest
     *        Placeholder documentation for DescribeInputSecurityGroupRequest
     * @return A Java Future containing the result of the DescribeInputSecurityGroup operation returned by the service.
     * @sample AWSMediaLiveAsync.DescribeInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInputSecurityGroupResult> describeInputSecurityGroupAsync(
            DescribeInputSecurityGroupRequest describeInputSecurityGroupRequest);

    /**
     * Produces a summary of an Input Security Group
     * 
     * @param describeInputSecurityGroupRequest
     *        Placeholder documentation for DescribeInputSecurityGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInputSecurityGroup operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.DescribeInputSecurityGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputSecurityGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeInputSecurityGroupResult> describeInputSecurityGroupAsync(
            DescribeInputSecurityGroupRequest describeInputSecurityGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInputSecurityGroupRequest, DescribeInputSecurityGroupResult> asyncHandler);

    /**
     * Produces list of channels that have been created
     * 
     * @param listChannelsRequest
     *        Placeholder documentation for ListChannelsRequest
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AWSMediaLiveAsync.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest);

    /**
     * Produces list of channels that have been created
     * 
     * @param listChannelsRequest
     *        Placeholder documentation for ListChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler);

    /**
     * Produces a list of Input Security Groups for an account
     * 
     * @param listInputSecurityGroupsRequest
     *        Placeholder documentation for ListInputSecurityGroupsRequest
     * @return A Java Future containing the result of the ListInputSecurityGroups operation returned by the service.
     * @sample AWSMediaLiveAsync.ListInputSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInputSecurityGroupsResult> listInputSecurityGroupsAsync(ListInputSecurityGroupsRequest listInputSecurityGroupsRequest);

    /**
     * Produces a list of Input Security Groups for an account
     * 
     * @param listInputSecurityGroupsRequest
     *        Placeholder documentation for ListInputSecurityGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInputSecurityGroups operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.ListInputSecurityGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputSecurityGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListInputSecurityGroupsResult> listInputSecurityGroupsAsync(ListInputSecurityGroupsRequest listInputSecurityGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInputSecurityGroupsRequest, ListInputSecurityGroupsResult> asyncHandler);

    /**
     * Produces list of inputs that have been created
     * 
     * @param listInputsRequest
     *        Placeholder documentation for ListInputsRequest
     * @return A Java Future containing the result of the ListInputs operation returned by the service.
     * @sample AWSMediaLiveAsync.ListInputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInputsResult> listInputsAsync(ListInputsRequest listInputsRequest);

    /**
     * Produces list of inputs that have been created
     * 
     * @param listInputsRequest
     *        Placeholder documentation for ListInputsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInputs operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.ListInputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInputsResult> listInputsAsync(ListInputsRequest listInputsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInputsRequest, ListInputsResult> asyncHandler);

    /**
     * Starts an existing channel
     * 
     * @param startChannelRequest
     *        Placeholder documentation for StartChannelRequest
     * @return A Java Future containing the result of the StartChannel operation returned by the service.
     * @sample AWSMediaLiveAsync.StartChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartChannelResult> startChannelAsync(StartChannelRequest startChannelRequest);

    /**
     * Starts an existing channel
     * 
     * @param startChannelRequest
     *        Placeholder documentation for StartChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartChannel operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.StartChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartChannelResult> startChannelAsync(StartChannelRequest startChannelRequest,
            com.amazonaws.handlers.AsyncHandler<StartChannelRequest, StartChannelResult> asyncHandler);

    /**
     * Stops a running channel
     * 
     * @param stopChannelRequest
     *        Placeholder documentation for StopChannelRequest
     * @return A Java Future containing the result of the StopChannel operation returned by the service.
     * @sample AWSMediaLiveAsync.StopChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StopChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopChannelResult> stopChannelAsync(StopChannelRequest stopChannelRequest);

    /**
     * Stops a running channel
     * 
     * @param stopChannelRequest
     *        Placeholder documentation for StopChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopChannel operation returned by the service.
     * @sample AWSMediaLiveAsyncHandler.StopChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StopChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopChannelResult> stopChannelAsync(StopChannelRequest stopChannelRequest,
            com.amazonaws.handlers.AsyncHandler<StopChannelRequest, StopChannelResult> asyncHandler);

}
