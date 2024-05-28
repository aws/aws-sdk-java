/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.artifact;

import javax.annotation.Generated;

import com.amazonaws.services.artifact.model.*;

/**
 * Interface for accessing AWS Artifact asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.artifact.AbstractAWSArtifactAsync} instead.
 * </p>
 * <p>
 * <p>
 * This reference provides descriptions of the low-level AWS Artifact Service API.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSArtifactAsync extends AWSArtifact {

    /**
     * <p>
     * Get the account settings for Artifact.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return A Java Future containing the result of the GetAccountSettings operation returned by the service.
     * @sample AWSArtifactAsync.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest getAccountSettingsRequest);

    /**
     * <p>
     * Get the account settings for Artifact.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountSettings operation returned by the service.
     * @sample AWSArtifactAsyncHandler.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest getAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler);

    /**
     * <p>
     * Get the content for a single report.
     * </p>
     * 
     * @param getReportRequest
     * @return A Java Future containing the result of the GetReport operation returned by the service.
     * @sample AWSArtifactAsync.GetReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetReport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReportResult> getReportAsync(GetReportRequest getReportRequest);

    /**
     * <p>
     * Get the content for a single report.
     * </p>
     * 
     * @param getReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReport operation returned by the service.
     * @sample AWSArtifactAsyncHandler.GetReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetReport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReportResult> getReportAsync(GetReportRequest getReportRequest,
            com.amazonaws.handlers.AsyncHandler<GetReportRequest, GetReportResult> asyncHandler);

    /**
     * <p>
     * Get the metadata for a single report.
     * </p>
     * 
     * @param getReportMetadataRequest
     * @return A Java Future containing the result of the GetReportMetadata operation returned by the service.
     * @sample AWSArtifactAsync.GetReportMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetReportMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReportMetadataResult> getReportMetadataAsync(GetReportMetadataRequest getReportMetadataRequest);

    /**
     * <p>
     * Get the metadata for a single report.
     * </p>
     * 
     * @param getReportMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReportMetadata operation returned by the service.
     * @sample AWSArtifactAsyncHandler.GetReportMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetReportMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetReportMetadataResult> getReportMetadataAsync(GetReportMetadataRequest getReportMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<GetReportMetadataRequest, GetReportMetadataResult> asyncHandler);

    /**
     * <p>
     * Get the Term content associated with a single report.
     * </p>
     * 
     * @param getTermForReportRequest
     * @return A Java Future containing the result of the GetTermForReport operation returned by the service.
     * @sample AWSArtifactAsync.GetTermForReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetTermForReport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTermForReportResult> getTermForReportAsync(GetTermForReportRequest getTermForReportRequest);

    /**
     * <p>
     * Get the Term content associated with a single report.
     * </p>
     * 
     * @param getTermForReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTermForReport operation returned by the service.
     * @sample AWSArtifactAsyncHandler.GetTermForReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/GetTermForReport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTermForReportResult> getTermForReportAsync(GetTermForReportRequest getTermForReportRequest,
            com.amazonaws.handlers.AsyncHandler<GetTermForReportRequest, GetTermForReportResult> asyncHandler);

    /**
     * <p>
     * List available reports.
     * </p>
     * 
     * @param listReportsRequest
     * @return A Java Future containing the result of the ListReports operation returned by the service.
     * @sample AWSArtifactAsync.ListReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/ListReports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReportsResult> listReportsAsync(ListReportsRequest listReportsRequest);

    /**
     * <p>
     * List available reports.
     * </p>
     * 
     * @param listReportsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReports operation returned by the service.
     * @sample AWSArtifactAsyncHandler.ListReports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/ListReports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListReportsResult> listReportsAsync(ListReportsRequest listReportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReportsRequest, ListReportsResult> asyncHandler);

    /**
     * <p>
     * Put the account settings for Artifact.
     * </p>
     * 
     * @param putAccountSettingsRequest
     * @return A Java Future containing the result of the PutAccountSettings operation returned by the service.
     * @sample AWSArtifactAsync.PutAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/PutAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAccountSettingsResult> putAccountSettingsAsync(PutAccountSettingsRequest putAccountSettingsRequest);

    /**
     * <p>
     * Put the account settings for Artifact.
     * </p>
     * 
     * @param putAccountSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAccountSettings operation returned by the service.
     * @sample AWSArtifactAsyncHandler.PutAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/PutAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAccountSettingsResult> putAccountSettingsAsync(PutAccountSettingsRequest putAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<PutAccountSettingsRequest, PutAccountSettingsResult> asyncHandler);

}
