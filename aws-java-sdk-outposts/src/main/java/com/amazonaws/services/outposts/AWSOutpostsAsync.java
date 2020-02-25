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
package com.amazonaws.services.outposts;

import javax.annotation.Generated;

import com.amazonaws.services.outposts.model.*;

/**
 * Interface for accessing Outposts asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.outposts.AbstractAWSOutpostsAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Outposts is a fully-managed service that extends AWS infrastructure, APIs, and tools to customer premises. By
 * providing local access to AWS-managed infrastructure, AWS Outposts enables customers to build and run applications on
 * premises using the same programming interfaces as in AWS Regions, while using local compute and storage resources for
 * lower latency and local data processing needs.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSOutpostsAsync extends AWSOutposts {

    /**
     * <p>
     * Creates an Outpost.
     * </p>
     * 
     * @param createOutpostRequest
     * @return A Java Future containing the result of the CreateOutpost operation returned by the service.
     * @sample AWSOutpostsAsync.CreateOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateOutpostResult> createOutpostAsync(CreateOutpostRequest createOutpostRequest);

    /**
     * <p>
     * Creates an Outpost.
     * </p>
     * 
     * @param createOutpostRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOutpost operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.CreateOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateOutpostResult> createOutpostAsync(CreateOutpostRequest createOutpostRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOutpostRequest, CreateOutpostResult> asyncHandler);

    /**
     * <p>
     * Deletes the Outpost.
     * </p>
     * 
     * @param deleteOutpostRequest
     * @return A Java Future containing the result of the DeleteOutpost operation returned by the service.
     * @sample AWSOutpostsAsync.DeleteOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/DeleteOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteOutpostResult> deleteOutpostAsync(DeleteOutpostRequest deleteOutpostRequest);

    /**
     * <p>
     * Deletes the Outpost.
     * </p>
     * 
     * @param deleteOutpostRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOutpost operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.DeleteOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/DeleteOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteOutpostResult> deleteOutpostAsync(DeleteOutpostRequest deleteOutpostRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOutpostRequest, DeleteOutpostResult> asyncHandler);

    /**
     * <p>
     * Deletes the site.
     * </p>
     * 
     * @param deleteSiteRequest
     * @return A Java Future containing the result of the DeleteSite operation returned by the service.
     * @sample AWSOutpostsAsync.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/DeleteSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(DeleteSiteRequest deleteSiteRequest);

    /**
     * <p>
     * Deletes the site.
     * </p>
     * 
     * @param deleteSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSite operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/DeleteSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(DeleteSiteRequest deleteSiteRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSiteRequest, DeleteSiteResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified Outpost.
     * </p>
     * 
     * @param getOutpostRequest
     * @return A Java Future containing the result of the GetOutpost operation returned by the service.
     * @sample AWSOutpostsAsync.GetOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOutpostResult> getOutpostAsync(GetOutpostRequest getOutpostRequest);

    /**
     * <p>
     * Gets information about the specified Outpost.
     * </p>
     * 
     * @param getOutpostRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOutpost operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.GetOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOutpostResult> getOutpostAsync(GetOutpostRequest getOutpostRequest,
            com.amazonaws.handlers.AsyncHandler<GetOutpostRequest, GetOutpostResult> asyncHandler);

    /**
     * <p>
     * Lists the instance types for the specified Outpost.
     * </p>
     * 
     * @param getOutpostInstanceTypesRequest
     * @return A Java Future containing the result of the GetOutpostInstanceTypes operation returned by the service.
     * @sample AWSOutpostsAsync.GetOutpostInstanceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpostInstanceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOutpostInstanceTypesResult> getOutpostInstanceTypesAsync(GetOutpostInstanceTypesRequest getOutpostInstanceTypesRequest);

    /**
     * <p>
     * Lists the instance types for the specified Outpost.
     * </p>
     * 
     * @param getOutpostInstanceTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOutpostInstanceTypes operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.GetOutpostInstanceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpostInstanceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOutpostInstanceTypesResult> getOutpostInstanceTypesAsync(GetOutpostInstanceTypesRequest getOutpostInstanceTypesRequest,
            com.amazonaws.handlers.AsyncHandler<GetOutpostInstanceTypesRequest, GetOutpostInstanceTypesResult> asyncHandler);

    /**
     * <p>
     * List the Outposts for your AWS account.
     * </p>
     * 
     * @param listOutpostsRequest
     * @return A Java Future containing the result of the ListOutposts operation returned by the service.
     * @sample AWSOutpostsAsync.ListOutposts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListOutposts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOutpostsResult> listOutpostsAsync(ListOutpostsRequest listOutpostsRequest);

    /**
     * <p>
     * List the Outposts for your AWS account.
     * </p>
     * 
     * @param listOutpostsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOutposts operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.ListOutposts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListOutposts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOutpostsResult> listOutpostsAsync(ListOutpostsRequest listOutpostsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOutpostsRequest, ListOutpostsResult> asyncHandler);

    /**
     * <p>
     * Lists the sites for the specified AWS account.
     * </p>
     * 
     * @param listSitesRequest
     * @return A Java Future containing the result of the ListSites operation returned by the service.
     * @sample AWSOutpostsAsync.ListSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListSites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSitesResult> listSitesAsync(ListSitesRequest listSitesRequest);

    /**
     * <p>
     * Lists the sites for the specified AWS account.
     * </p>
     * 
     * @param listSitesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSites operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.ListSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListSites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSitesResult> listSitesAsync(ListSitesRequest listSitesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSitesRequest, ListSitesResult> asyncHandler);

}
