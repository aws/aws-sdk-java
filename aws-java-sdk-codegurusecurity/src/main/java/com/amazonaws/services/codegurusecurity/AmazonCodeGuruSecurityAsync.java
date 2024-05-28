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
package com.amazonaws.services.codegurusecurity;

import javax.annotation.Generated;

import com.amazonaws.services.codegurusecurity.model.*;

/**
 * Interface for accessing Amazon CodeGuru Security asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codegurusecurity.AbstractAmazonCodeGuruSecurityAsync} instead.
 * </p>
 * <p>
 * <note>
 * <p>
 * Amazon CodeGuru Security is in preview release and is subject to change.
 * </p>
 * </note>
 * <p>
 * This section provides documentation for the Amazon CodeGuru Security API operations. CodeGuru Security is a service
 * that uses program analysis and machine learning to detect security policy violations and vulnerabilities, and
 * recommends ways to address these security risks.
 * </p>
 * <p>
 * By proactively detecting and providing recommendations for addressing security risks, CodeGuru Security improves the
 * overall security of your application code. For more information about CodeGuru Security, see the <a
 * href="https://docs.aws.amazon.com/codeguru/latest/security-ug/what-is-codeguru-security.html">Amazon CodeGuru
 * Security User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCodeGuruSecurityAsync extends AmazonCodeGuruSecurity {

    /**
     * <p>
     * Returns a list of all requested findings.
     * </p>
     * 
     * @param batchGetFindingsRequest
     * @return A Java Future containing the result of the BatchGetFindings operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsync.BatchGetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/BatchGetFindings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetFindingsResult> batchGetFindingsAsync(BatchGetFindingsRequest batchGetFindingsRequest);

    /**
     * <p>
     * Returns a list of all requested findings.
     * </p>
     * 
     * @param batchGetFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetFindings operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsyncHandler.BatchGetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/BatchGetFindings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetFindingsResult> batchGetFindingsAsync(BatchGetFindingsRequest batchGetFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetFindingsRequest, BatchGetFindingsResult> asyncHandler);

    /**
     * <p>
     * Use to create a scan using code uploaded to an S3 bucket.
     * </p>
     * 
     * @param createScanRequest
     * @return A Java Future containing the result of the CreateScan operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsync.CreateScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/CreateScan" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateScanResult> createScanAsync(CreateScanRequest createScanRequest);

    /**
     * <p>
     * Use to create a scan using code uploaded to an S3 bucket.
     * </p>
     * 
     * @param createScanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateScan operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsyncHandler.CreateScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/CreateScan" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateScanResult> createScanAsync(CreateScanRequest createScanRequest,
            com.amazonaws.handlers.AsyncHandler<CreateScanRequest, CreateScanResult> asyncHandler);

    /**
     * <p>
     * Generates a pre-signed URL and request headers used to upload a code resource.
     * </p>
     * <p>
     * You can upload your code resource to the URL and add the request headers using any HTTP client.
     * </p>
     * 
     * @param createUploadUrlRequest
     * @return A Java Future containing the result of the CreateUploadUrl operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsync.CreateUploadUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/CreateUploadUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUploadUrlResult> createUploadUrlAsync(CreateUploadUrlRequest createUploadUrlRequest);

    /**
     * <p>
     * Generates a pre-signed URL and request headers used to upload a code resource.
     * </p>
     * <p>
     * You can upload your code resource to the URL and add the request headers using any HTTP client.
     * </p>
     * 
     * @param createUploadUrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUploadUrl operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsyncHandler.CreateUploadUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/CreateUploadUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUploadUrlResult> createUploadUrlAsync(CreateUploadUrlRequest createUploadUrlRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUploadUrlRequest, CreateUploadUrlResult> asyncHandler);

    /**
     * <p>
     * Use to get account level configuration.
     * </p>
     * 
     * @param getAccountConfigurationRequest
     * @return A Java Future containing the result of the GetAccountConfiguration operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsync.GetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountConfigurationResult> getAccountConfigurationAsync(GetAccountConfigurationRequest getAccountConfigurationRequest);

    /**
     * <p>
     * Use to get account level configuration.
     * </p>
     * 
     * @param getAccountConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountConfiguration operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsyncHandler.GetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountConfigurationResult> getAccountConfigurationAsync(GetAccountConfigurationRequest getAccountConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountConfigurationRequest, GetAccountConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all findings generated by a particular scan.
     * </p>
     * 
     * @param getFindingsRequest
     * @return A Java Future containing the result of the GetFindings operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsync.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest getFindingsRequest);

    /**
     * <p>
     * Returns a list of all findings generated by a particular scan.
     * </p>
     * 
     * @param getFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindings operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsyncHandler.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest getFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingsRequest, GetFindingsResult> asyncHandler);

    /**
     * <p>
     * Returns top level metrics about an account from a specified date, including number of open findings, the
     * categories with most findings, the scans with most open findings, and scans with most open critical findings.
     * </p>
     * 
     * @param getMetricsSummaryRequest
     * @return A Java Future containing the result of the GetMetricsSummary operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsync.GetMetricsSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetMetricsSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMetricsSummaryResult> getMetricsSummaryAsync(GetMetricsSummaryRequest getMetricsSummaryRequest);

    /**
     * <p>
     * Returns top level metrics about an account from a specified date, including number of open findings, the
     * categories with most findings, the scans with most open findings, and scans with most open critical findings.
     * </p>
     * 
     * @param getMetricsSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMetricsSummary operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsyncHandler.GetMetricsSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetMetricsSummary"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMetricsSummaryResult> getMetricsSummaryAsync(GetMetricsSummaryRequest getMetricsSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetMetricsSummaryRequest, GetMetricsSummaryResult> asyncHandler);

    /**
     * <p>
     * Returns details about a scan, including whether or not a scan has completed.
     * </p>
     * 
     * @param getScanRequest
     * @return A Java Future containing the result of the GetScan operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsync.GetScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetScan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetScanResult> getScanAsync(GetScanRequest getScanRequest);

    /**
     * <p>
     * Returns details about a scan, including whether or not a scan has completed.
     * </p>
     * 
     * @param getScanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetScan operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsyncHandler.GetScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetScan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetScanResult> getScanAsync(GetScanRequest getScanRequest,
            com.amazonaws.handlers.AsyncHandler<GetScanRequest, GetScanResult> asyncHandler);

    /**
     * <p>
     * Returns metrics about all findings in an account within a specified time range.
     * </p>
     * 
     * @param listFindingsMetricsRequest
     * @return A Java Future containing the result of the ListFindingsMetrics operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsync.ListFindingsMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/ListFindingsMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsMetricsResult> listFindingsMetricsAsync(ListFindingsMetricsRequest listFindingsMetricsRequest);

    /**
     * <p>
     * Returns metrics about all findings in an account within a specified time range.
     * </p>
     * 
     * @param listFindingsMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFindingsMetrics operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsyncHandler.ListFindingsMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/ListFindingsMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsMetricsResult> listFindingsMetricsAsync(ListFindingsMetricsRequest listFindingsMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFindingsMetricsRequest, ListFindingsMetricsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the standard scans in an account. Does not return express scans.
     * </p>
     * 
     * @param listScansRequest
     * @return A Java Future containing the result of the ListScans operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsync.ListScans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/ListScans" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListScansResult> listScansAsync(ListScansRequest listScansRequest);

    /**
     * <p>
     * Returns a list of all the standard scans in an account. Does not return express scans.
     * </p>
     * 
     * @param listScansRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListScans operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsyncHandler.ListScans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/ListScans" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListScansResult> listScansAsync(ListScansRequest listScansRequest,
            com.amazonaws.handlers.AsyncHandler<ListScansRequest, ListScansResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all tags associated with a scan.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of all tags associated with a scan.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Use to add one or more tags to an existing scan.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Use to add one or more tags to an existing scan.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Use to remove one or more tags from an existing scan.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Use to remove one or more tags from an existing scan.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Use to update account-level configuration with an encryption key.
     * </p>
     * 
     * @param updateAccountConfigurationRequest
     * @return A Java Future containing the result of the UpdateAccountConfiguration operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsync.UpdateAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/UpdateAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountConfigurationResult> updateAccountConfigurationAsync(
            UpdateAccountConfigurationRequest updateAccountConfigurationRequest);

    /**
     * <p>
     * Use to update account-level configuration with an encryption key.
     * </p>
     * 
     * @param updateAccountConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccountConfiguration operation returned by the service.
     * @sample AmazonCodeGuruSecurityAsyncHandler.UpdateAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/UpdateAccountConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountConfigurationResult> updateAccountConfigurationAsync(
            UpdateAccountConfigurationRequest updateAccountConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountConfigurationRequest, UpdateAccountConfigurationResult> asyncHandler);

}
