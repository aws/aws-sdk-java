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
package com.amazonaws.services.mobile;

import javax.annotation.Generated;

import com.amazonaws.services.mobile.model.*;

/**
 * Interface for accessing AWS Mobile asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mobile.AbstractAWSMobileAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Mobile Service provides mobile app and website developers with capabilities required to configure AWS resources
 * and bootstrap their developer desktop projects with the necessary SDKs, constants, tools and samples to make use of
 * those resources.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMobileAsync extends AWSMobile {

    /**
     * <p>
     * Creates an AWS Mobile Hub project.
     * </p>
     * 
     * @param createProjectRequest
     *        Request structure used to request a project be created.
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AWSMobileAsync.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates an AWS Mobile Hub project.
     * </p>
     * 
     * @param createProjectRequest
     *        Request structure used to request a project be created.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AWSMobileAsyncHandler.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/CreateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler);

    /**
     * <p>
     * Delets a project in AWS Mobile Hub.
     * </p>
     * 
     * @param deleteProjectRequest
     *        Request structure used to request a project be deleted.
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AWSMobileAsync.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Delets a project in AWS Mobile Hub.
     * </p>
     * 
     * @param deleteProjectRequest
     *        Request structure used to request a project be deleted.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AWSMobileAsyncHandler.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/DeleteProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler);

    /**
     * <p>
     * Get the bundle details for the requested bundle id.
     * </p>
     * 
     * @param describeBundleRequest
     *        Request structure to request the details of a specific bundle.
     * @return A Java Future containing the result of the DescribeBundle operation returned by the service.
     * @sample AWSMobileAsync.DescribeBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/DescribeBundle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBundleResult> describeBundleAsync(DescribeBundleRequest describeBundleRequest);

    /**
     * <p>
     * Get the bundle details for the requested bundle id.
     * </p>
     * 
     * @param describeBundleRequest
     *        Request structure to request the details of a specific bundle.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBundle operation returned by the service.
     * @sample AWSMobileAsyncHandler.DescribeBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/DescribeBundle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBundleResult> describeBundleAsync(DescribeBundleRequest describeBundleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBundleRequest, DescribeBundleResult> asyncHandler);

    /**
     * <p>
     * Gets details about a project in AWS Mobile Hub.
     * </p>
     * 
     * @param describeProjectRequest
     *        Request structure used to request details about a project.
     * @return A Java Future containing the result of the DescribeProject operation returned by the service.
     * @sample AWSMobileAsync.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/DescribeProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest describeProjectRequest);

    /**
     * <p>
     * Gets details about a project in AWS Mobile Hub.
     * </p>
     * 
     * @param describeProjectRequest
     *        Request structure used to request details about a project.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProject operation returned by the service.
     * @sample AWSMobileAsyncHandler.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/DescribeProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest describeProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProjectRequest, DescribeProjectResult> asyncHandler);

    /**
     * <p>
     * Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile
     * app clients with backend AWS resources.
     * </p>
     * 
     * @param exportBundleRequest
     *        Request structure used to request generation of custom SDK and tool packages required to integrate mobile
     *        web or app clients with backed AWS resources.
     * @return A Java Future containing the result of the ExportBundle operation returned by the service.
     * @sample AWSMobileAsync.ExportBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ExportBundle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportBundleResult> exportBundleAsync(ExportBundleRequest exportBundleRequest);

    /**
     * <p>
     * Generates customized software development kit (SDK) and or tool packages used to integrate mobile web or mobile
     * app clients with backend AWS resources.
     * </p>
     * 
     * @param exportBundleRequest
     *        Request structure used to request generation of custom SDK and tool packages required to integrate mobile
     *        web or app clients with backed AWS resources.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportBundle operation returned by the service.
     * @sample AWSMobileAsyncHandler.ExportBundle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ExportBundle" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportBundleResult> exportBundleAsync(ExportBundleRequest exportBundleRequest,
            com.amazonaws.handlers.AsyncHandler<ExportBundleRequest, ExportBundleResult> asyncHandler);

    /**
     * <p>
     * Exports project configuration to a snapshot which can be downloaded and shared. Note that mobile app push
     * credentials are encrypted in exported projects, so they can only be shared successfully within the same AWS
     * account.
     * </p>
     * 
     * @param exportProjectRequest
     *        Request structure used in requests to export project configuration details.
     * @return A Java Future containing the result of the ExportProject operation returned by the service.
     * @sample AWSMobileAsync.ExportProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ExportProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportProjectResult> exportProjectAsync(ExportProjectRequest exportProjectRequest);

    /**
     * <p>
     * Exports project configuration to a snapshot which can be downloaded and shared. Note that mobile app push
     * credentials are encrypted in exported projects, so they can only be shared successfully within the same AWS
     * account.
     * </p>
     * 
     * @param exportProjectRequest
     *        Request structure used in requests to export project configuration details.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportProject operation returned by the service.
     * @sample AWSMobileAsyncHandler.ExportProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ExportProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportProjectResult> exportProjectAsync(ExportProjectRequest exportProjectRequest,
            com.amazonaws.handlers.AsyncHandler<ExportProjectRequest, ExportProjectResult> asyncHandler);

    /**
     * <p>
     * List all available bundles.
     * </p>
     * 
     * @param listBundlesRequest
     *        Request structure to request all available bundles.
     * @return A Java Future containing the result of the ListBundles operation returned by the service.
     * @sample AWSMobileAsync.ListBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ListBundles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBundlesResult> listBundlesAsync(ListBundlesRequest listBundlesRequest);

    /**
     * <p>
     * List all available bundles.
     * </p>
     * 
     * @param listBundlesRequest
     *        Request structure to request all available bundles.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBundles operation returned by the service.
     * @sample AWSMobileAsyncHandler.ListBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ListBundles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBundlesResult> listBundlesAsync(ListBundlesRequest listBundlesRequest,
            com.amazonaws.handlers.AsyncHandler<ListBundlesRequest, ListBundlesResult> asyncHandler);

    /**
     * <p>
     * Lists projects in AWS Mobile Hub.
     * </p>
     * 
     * @param listProjectsRequest
     *        Request structure used to request projects list in AWS Mobile Hub.
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AWSMobileAsync.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Lists projects in AWS Mobile Hub.
     * </p>
     * 
     * @param listProjectsRequest
     *        Request structure used to request projects list in AWS Mobile Hub.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AWSMobileAsyncHandler.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ListProjects" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler);

    /**
     * <p>
     * Update an existing project.
     * </p>
     * 
     * @param updateProjectRequest
     *        Request structure used for requests to update project configuration.
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AWSMobileAsync.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest);

    /**
     * <p>
     * Update an existing project.
     * </p>
     * 
     * @param updateProjectRequest
     *        Request structure used for requests to update project configuration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AWSMobileAsyncHandler.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/UpdateProject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler);

}
