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
package com.amazonaws.services.iotfleethub;

import javax.annotation.Generated;

import com.amazonaws.services.iotfleethub.model.*;

/**
 * Interface for accessing AWS IoT Fleet Hub asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotfleethub.AbstractAWSIoTFleetHubAsync} instead.
 * </p>
 * <p>
 * <p>
 * With Fleet Hub for AWS IoT Device Management you can build stand-alone web applications for monitoring the health of
 * your device fleets.
 * </p>
 * <note>
 * <p>
 * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTFleetHubAsync extends AWSIoTFleetHub {

    /**
     * <p>
     * Creates a Fleet Hub for AWS IoT Device Management web application.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param createApplicationRequest
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSIoTFleetHubAsync.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates a Fleet Hub for AWS IoT Device Management web application.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param createApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSIoTFleetHubAsyncHandler.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes a Fleet Hub for AWS IoT Device Management web application.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param deleteApplicationRequest
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSIoTFleetHubAsync.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes a Fleet Hub for AWS IoT Device Management web application.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param deleteApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSIoTFleetHubAsyncHandler.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler);

    /**
     * <p>
     * Gets information about a Fleet Hub for AWS IoT Device Management web application.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param describeApplicationRequest
     * @return A Java Future containing the result of the DescribeApplication operation returned by the service.
     * @sample AWSIoTFleetHubAsync.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/DescribeApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(DescribeApplicationRequest describeApplicationRequest);

    /**
     * <p>
     * Gets information about a Fleet Hub for AWS IoT Device Management web application.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param describeApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApplication operation returned by the service.
     * @sample AWSIoTFleetHubAsyncHandler.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/DescribeApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(DescribeApplicationRequest describeApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationRequest, DescribeApplicationResult> asyncHandler);

    /**
     * <p>
     * Gets a list of Fleet Hub for AWS IoT Device Management web applications for the current account.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param listApplicationsRequest
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSIoTFleetHubAsync.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/ListApplications" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Gets a list of Fleet Hub for AWS IoT Device Management web applications for the current account.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param listApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AWSIoTFleetHubAsyncHandler.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/ListApplications" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTFleetHubAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTFleetHubAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds to or modifies the tags of the specified resource. Tags are metadata which can be used to manage a resource.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTFleetHubAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds to or modifies the tags of the specified resource. Tags are metadata which can be used to manage a resource.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTFleetHubAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags (metadata) from the resource.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTFleetHubAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags (metadata) from the resource.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTFleetHubAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates information about a Fleet Hub for a AWS IoT Device Management web application.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param updateApplicationRequest
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSIoTFleetHubAsync.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates information about a Fleet Hub for a AWS IoT Device Management web application.
     * </p>
     * <note>
     * <p>
     * Fleet Hub for AWS IoT Device Management is in public preview and is subject to change.
     * </p>
     * </note>
     * 
     * @param updateApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSIoTFleetHubAsyncHandler.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

}
