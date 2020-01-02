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
package com.amazonaws.services.qldb;

import javax.annotation.Generated;

import com.amazonaws.services.qldb.model.*;

/**
 * Interface for accessing QLDB asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.qldb.AbstractAmazonQLDBAsync} instead.
 * </p>
 * <p>
 * <p>
 * The control plane for Amazon QLDB
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonQLDBAsync extends AmazonQLDB {

    /**
     * <p>
     * Creates a new ledger in your AWS account.
     * </p>
     * 
     * @param createLedgerRequest
     * @return A Java Future containing the result of the CreateLedger operation returned by the service.
     * @sample AmazonQLDBAsync.CreateLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/CreateLedger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLedgerResult> createLedgerAsync(CreateLedgerRequest createLedgerRequest);

    /**
     * <p>
     * Creates a new ledger in your AWS account.
     * </p>
     * 
     * @param createLedgerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLedger operation returned by the service.
     * @sample AmazonQLDBAsyncHandler.CreateLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/CreateLedger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLedgerResult> createLedgerAsync(CreateLedgerRequest createLedgerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLedgerRequest, CreateLedgerResult> asyncHandler);

    /**
     * <p>
     * Deletes a ledger and all of its contents. This action is irreversible.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API
     * or the AWS Command Line Interface (AWS CLI). You can disable it by calling the <code>UpdateLedger</code>
     * operation to set the flag to <code>false</code>. The QLDB console disables deletion protection for you when you
     * use it to delete a ledger.
     * </p>
     * 
     * @param deleteLedgerRequest
     * @return A Java Future containing the result of the DeleteLedger operation returned by the service.
     * @sample AmazonQLDBAsync.DeleteLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/DeleteLedger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLedgerResult> deleteLedgerAsync(DeleteLedgerRequest deleteLedgerRequest);

    /**
     * <p>
     * Deletes a ledger and all of its contents. This action is irreversible.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API
     * or the AWS Command Line Interface (AWS CLI). You can disable it by calling the <code>UpdateLedger</code>
     * operation to set the flag to <code>false</code>. The QLDB console disables deletion protection for you when you
     * use it to delete a ledger.
     * </p>
     * 
     * @param deleteLedgerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLedger operation returned by the service.
     * @sample AmazonQLDBAsyncHandler.DeleteLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/DeleteLedger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLedgerResult> deleteLedgerAsync(DeleteLedgerRequest deleteLedgerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLedgerRequest, DeleteLedgerResult> asyncHandler);

    /**
     * <p>
     * Returns information about a journal export job, including the ledger name, export ID, when it was created,
     * current status, and its start and end time export parameters.
     * </p>
     * <p>
     * If the export job with the given <code>ExportId</code> doesn't exist, then throws
     * <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the ledger with the given <code>Name</code> doesn't exist, then throws <code>ResourceNotFoundException</code>.
     * </p>
     * 
     * @param describeJournalS3ExportRequest
     * @return A Java Future containing the result of the DescribeJournalS3Export operation returned by the service.
     * @sample AmazonQLDBAsync.DescribeJournalS3Export
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/DescribeJournalS3Export" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeJournalS3ExportResult> describeJournalS3ExportAsync(DescribeJournalS3ExportRequest describeJournalS3ExportRequest);

    /**
     * <p>
     * Returns information about a journal export job, including the ledger name, export ID, when it was created,
     * current status, and its start and end time export parameters.
     * </p>
     * <p>
     * If the export job with the given <code>ExportId</code> doesn't exist, then throws
     * <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the ledger with the given <code>Name</code> doesn't exist, then throws <code>ResourceNotFoundException</code>.
     * </p>
     * 
     * @param describeJournalS3ExportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJournalS3Export operation returned by the service.
     * @sample AmazonQLDBAsyncHandler.DescribeJournalS3Export
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/DescribeJournalS3Export" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeJournalS3ExportResult> describeJournalS3ExportAsync(DescribeJournalS3ExportRequest describeJournalS3ExportRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJournalS3ExportRequest, DescribeJournalS3ExportResult> asyncHandler);

    /**
     * <p>
     * Returns information about a ledger, including its state and when it was created.
     * </p>
     * 
     * @param describeLedgerRequest
     * @return A Java Future containing the result of the DescribeLedger operation returned by the service.
     * @sample AmazonQLDBAsync.DescribeLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/DescribeLedger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeLedgerResult> describeLedgerAsync(DescribeLedgerRequest describeLedgerRequest);

    /**
     * <p>
     * Returns information about a ledger, including its state and when it was created.
     * </p>
     * 
     * @param describeLedgerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLedger operation returned by the service.
     * @sample AmazonQLDBAsyncHandler.DescribeLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/DescribeLedger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeLedgerResult> describeLedgerAsync(DescribeLedgerRequest describeLedgerRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLedgerRequest, DescribeLedgerResult> asyncHandler);

    /**
     * <p>
     * Exports journal contents within a date and time range from a ledger into a specified Amazon Simple Storage
     * Service (Amazon S3) bucket. The data is written as files in Amazon Ion format.
     * </p>
     * <p>
     * If the ledger with the given <code>Name</code> doesn't exist, then throws <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the ledger with the given <code>Name</code> is in <code>CREATING</code> status, then throws
     * <code>ResourcePreconditionNotMetException</code>.
     * </p>
     * <p>
     * You can initiate up to two concurrent journal export requests for each ledger. Beyond this limit, journal export
     * requests throw <code>LimitExceededException</code>.
     * </p>
     * 
     * @param exportJournalToS3Request
     * @return A Java Future containing the result of the ExportJournalToS3 operation returned by the service.
     * @sample AmazonQLDBAsync.ExportJournalToS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ExportJournalToS3" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportJournalToS3Result> exportJournalToS3Async(ExportJournalToS3Request exportJournalToS3Request);

    /**
     * <p>
     * Exports journal contents within a date and time range from a ledger into a specified Amazon Simple Storage
     * Service (Amazon S3) bucket. The data is written as files in Amazon Ion format.
     * </p>
     * <p>
     * If the ledger with the given <code>Name</code> doesn't exist, then throws <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the ledger with the given <code>Name</code> is in <code>CREATING</code> status, then throws
     * <code>ResourcePreconditionNotMetException</code>.
     * </p>
     * <p>
     * You can initiate up to two concurrent journal export requests for each ledger. Beyond this limit, journal export
     * requests throw <code>LimitExceededException</code>.
     * </p>
     * 
     * @param exportJournalToS3Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportJournalToS3 operation returned by the service.
     * @sample AmazonQLDBAsyncHandler.ExportJournalToS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ExportJournalToS3" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportJournalToS3Result> exportJournalToS3Async(ExportJournalToS3Request exportJournalToS3Request,
            com.amazonaws.handlers.AsyncHandler<ExportJournalToS3Request, ExportJournalToS3Result> asyncHandler);

    /**
     * <p>
     * Returns a journal block object at a specified address in a ledger. Also returns a proof of the specified block
     * for verification if <code>DigestTipAddress</code> is provided.
     * </p>
     * <p>
     * If the specified ledger doesn't exist or is in <code>DELETING</code> status, then throws
     * <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the specified ledger is in <code>CREATING</code> status, then throws
     * <code>ResourcePreconditionNotMetException</code>.
     * </p>
     * <p>
     * If no block exists with the specified address, then throws <code>InvalidParameterException</code>.
     * </p>
     * 
     * @param getBlockRequest
     * @return A Java Future containing the result of the GetBlock operation returned by the service.
     * @sample AmazonQLDBAsync.GetBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetBlock" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBlockResult> getBlockAsync(GetBlockRequest getBlockRequest);

    /**
     * <p>
     * Returns a journal block object at a specified address in a ledger. Also returns a proof of the specified block
     * for verification if <code>DigestTipAddress</code> is provided.
     * </p>
     * <p>
     * If the specified ledger doesn't exist or is in <code>DELETING</code> status, then throws
     * <code>ResourceNotFoundException</code>.
     * </p>
     * <p>
     * If the specified ledger is in <code>CREATING</code> status, then throws
     * <code>ResourcePreconditionNotMetException</code>.
     * </p>
     * <p>
     * If no block exists with the specified address, then throws <code>InvalidParameterException</code>.
     * </p>
     * 
     * @param getBlockRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBlock operation returned by the service.
     * @sample AmazonQLDBAsyncHandler.GetBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetBlock" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBlockResult> getBlockAsync(GetBlockRequest getBlockRequest,
            com.amazonaws.handlers.AsyncHandler<GetBlockRequest, GetBlockResult> asyncHandler);

    /**
     * <p>
     * Returns the digest of a ledger at the latest committed block in the journal. The response includes a 256-bit hash
     * value and a block address.
     * </p>
     * 
     * @param getDigestRequest
     * @return A Java Future containing the result of the GetDigest operation returned by the service.
     * @sample AmazonQLDBAsync.GetDigest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetDigest" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDigestResult> getDigestAsync(GetDigestRequest getDigestRequest);

    /**
     * <p>
     * Returns the digest of a ledger at the latest committed block in the journal. The response includes a 256-bit hash
     * value and a block address.
     * </p>
     * 
     * @param getDigestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDigest operation returned by the service.
     * @sample AmazonQLDBAsyncHandler.GetDigest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetDigest" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDigestResult> getDigestAsync(GetDigestRequest getDigestRequest,
            com.amazonaws.handlers.AsyncHandler<GetDigestRequest, GetDigestResult> asyncHandler);

    /**
     * <p>
     * Returns a revision data object for a specified document ID and block address. Also returns a proof of the
     * specified revision for verification if <code>DigestTipAddress</code> is provided.
     * </p>
     * 
     * @param getRevisionRequest
     * @return A Java Future containing the result of the GetRevision operation returned by the service.
     * @sample AmazonQLDBAsync.GetRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetRevision" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRevisionResult> getRevisionAsync(GetRevisionRequest getRevisionRequest);

    /**
     * <p>
     * Returns a revision data object for a specified document ID and block address. Also returns a proof of the
     * specified revision for verification if <code>DigestTipAddress</code> is provided.
     * </p>
     * 
     * @param getRevisionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRevision operation returned by the service.
     * @sample AmazonQLDBAsyncHandler.GetRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetRevision" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRevisionResult> getRevisionAsync(GetRevisionRequest getRevisionRequest,
            com.amazonaws.handlers.AsyncHandler<GetRevisionRequest, GetRevisionResult> asyncHandler);

    /**
     * <p>
     * Returns an array of journal export job descriptions for all ledgers that are associated with the current AWS
     * account and Region.
     * </p>
     * <p>
     * This action returns a maximum of <code>MaxResults</code> items, and is paginated so that you can retrieve all the
     * items by calling <code>ListJournalS3Exports</code> multiple times.
     * </p>
     * 
     * @param listJournalS3ExportsRequest
     * @return A Java Future containing the result of the ListJournalS3Exports operation returned by the service.
     * @sample AmazonQLDBAsync.ListJournalS3Exports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListJournalS3Exports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJournalS3ExportsResult> listJournalS3ExportsAsync(ListJournalS3ExportsRequest listJournalS3ExportsRequest);

    /**
     * <p>
     * Returns an array of journal export job descriptions for all ledgers that are associated with the current AWS
     * account and Region.
     * </p>
     * <p>
     * This action returns a maximum of <code>MaxResults</code> items, and is paginated so that you can retrieve all the
     * items by calling <code>ListJournalS3Exports</code> multiple times.
     * </p>
     * 
     * @param listJournalS3ExportsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJournalS3Exports operation returned by the service.
     * @sample AmazonQLDBAsyncHandler.ListJournalS3Exports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListJournalS3Exports" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJournalS3ExportsResult> listJournalS3ExportsAsync(ListJournalS3ExportsRequest listJournalS3ExportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJournalS3ExportsRequest, ListJournalS3ExportsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of journal export job descriptions for a specified ledger.
     * </p>
     * <p>
     * This action returns a maximum of <code>MaxResults</code> items, and is paginated so that you can retrieve all the
     * items by calling <code>ListJournalS3ExportsForLedger</code> multiple times.
     * </p>
     * 
     * @param listJournalS3ExportsForLedgerRequest
     * @return A Java Future containing the result of the ListJournalS3ExportsForLedger operation returned by the
     *         service.
     * @sample AmazonQLDBAsync.ListJournalS3ExportsForLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListJournalS3ExportsForLedger"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListJournalS3ExportsForLedgerResult> listJournalS3ExportsForLedgerAsync(
            ListJournalS3ExportsForLedgerRequest listJournalS3ExportsForLedgerRequest);

    /**
     * <p>
     * Returns an array of journal export job descriptions for a specified ledger.
     * </p>
     * <p>
     * This action returns a maximum of <code>MaxResults</code> items, and is paginated so that you can retrieve all the
     * items by calling <code>ListJournalS3ExportsForLedger</code> multiple times.
     * </p>
     * 
     * @param listJournalS3ExportsForLedgerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJournalS3ExportsForLedger operation returned by the
     *         service.
     * @sample AmazonQLDBAsyncHandler.ListJournalS3ExportsForLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListJournalS3ExportsForLedger"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListJournalS3ExportsForLedgerResult> listJournalS3ExportsForLedgerAsync(
            ListJournalS3ExportsForLedgerRequest listJournalS3ExportsForLedgerRequest,
            com.amazonaws.handlers.AsyncHandler<ListJournalS3ExportsForLedgerRequest, ListJournalS3ExportsForLedgerResult> asyncHandler);

    /**
     * <p>
     * Returns an array of ledger summaries that are associated with the current AWS account and Region.
     * </p>
     * <p>
     * This action returns a maximum of 100 items and is paginated so that you can retrieve all the items by calling
     * <code>ListLedgers</code> multiple times.
     * </p>
     * 
     * @param listLedgersRequest
     * @return A Java Future containing the result of the ListLedgers operation returned by the service.
     * @sample AmazonQLDBAsync.ListLedgers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListLedgers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLedgersResult> listLedgersAsync(ListLedgersRequest listLedgersRequest);

    /**
     * <p>
     * Returns an array of ledger summaries that are associated with the current AWS account and Region.
     * </p>
     * <p>
     * This action returns a maximum of 100 items and is paginated so that you can retrieve all the items by calling
     * <code>ListLedgers</code> multiple times.
     * </p>
     * 
     * @param listLedgersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLedgers operation returned by the service.
     * @sample AmazonQLDBAsyncHandler.ListLedgers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListLedgers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLedgersResult> listLedgersAsync(ListLedgersRequest listLedgersRequest,
            com.amazonaws.handlers.AsyncHandler<ListLedgersRequest, ListLedgersResult> asyncHandler);

    /**
     * <p>
     * Returns all tags for a specified Amazon QLDB resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonQLDBAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns all tags for a specified Amazon QLDB resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonQLDBAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags to a specified Amazon QLDB resource.
     * </p>
     * <p>
     * A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, your request fails and
     * returns an error.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonQLDBAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags to a specified Amazon QLDB resource.
     * </p>
     * <p>
     * A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, your request fails and
     * returns an error.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonQLDBAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from a specified Amazon QLDB resource. You can specify up to 50 tag keys to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonQLDBAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a specified Amazon QLDB resource. You can specify up to 50 tag keys to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonQLDBAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates properties on a ledger.
     * </p>
     * 
     * @param updateLedgerRequest
     * @return A Java Future containing the result of the UpdateLedger operation returned by the service.
     * @sample AmazonQLDBAsync.UpdateLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/UpdateLedger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLedgerResult> updateLedgerAsync(UpdateLedgerRequest updateLedgerRequest);

    /**
     * <p>
     * Updates properties on a ledger.
     * </p>
     * 
     * @param updateLedgerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLedger operation returned by the service.
     * @sample AmazonQLDBAsyncHandler.UpdateLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/UpdateLedger" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLedgerResult> updateLedgerAsync(UpdateLedgerRequest updateLedgerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLedgerRequest, UpdateLedgerResult> asyncHandler);

}
