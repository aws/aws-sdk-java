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
package com.amazonaws.services.qldb;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.qldb.model.*;

/**
 * Interface for accessing QLDB.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.qldb.AbstractAmazonQLDB} instead.
 * </p>
 * <p>
 * <p>
 * The control plane for Amazon QLDB
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonQLDB {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "qldb";

    /**
     * <p>
     * Creates a new ledger in your AWS account.
     * </p>
     * 
     * @param createLedgerRequest
     * @return Result of the CreateLedger operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         You have reached the limit on the maximum number of resources allowed.
     * @throws ResourceInUseException
     *         The specified resource can't be modified at this time.
     * @sample AmazonQLDB.CreateLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/CreateLedger" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLedgerResult createLedger(CreateLedgerRequest createLedgerRequest);

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
     * @return Result of the DeleteLedger operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourceInUseException
     *         The specified resource can't be modified at this time.
     * @throws ResourcePreconditionNotMetException
     *         The operation failed because a condition wasn't satisfied in advance.
     * @sample AmazonQLDB.DeleteLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/DeleteLedger" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLedgerResult deleteLedger(DeleteLedgerRequest deleteLedgerRequest);

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
     * @return Result of the DescribeJournalS3Export operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AmazonQLDB.DescribeJournalS3Export
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/DescribeJournalS3Export" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeJournalS3ExportResult describeJournalS3Export(DescribeJournalS3ExportRequest describeJournalS3ExportRequest);

    /**
     * <p>
     * Returns information about a ledger, including its state and when it was created.
     * </p>
     * 
     * @param describeLedgerRequest
     * @return Result of the DescribeLedger operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AmazonQLDB.DescribeLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/DescribeLedger" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeLedgerResult describeLedger(DescribeLedgerRequest describeLedgerRequest);

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
     * @return Result of the ExportJournalToS3 operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourcePreconditionNotMetException
     *         The operation failed because a condition wasn't satisfied in advance.
     * @sample AmazonQLDB.ExportJournalToS3
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ExportJournalToS3" target="_top">AWS API
     *      Documentation</a>
     */
    ExportJournalToS3Result exportJournalToS3(ExportJournalToS3Request exportJournalToS3Request);

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
     * @return Result of the GetBlock operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourcePreconditionNotMetException
     *         The operation failed because a condition wasn't satisfied in advance.
     * @sample AmazonQLDB.GetBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetBlock" target="_top">AWS API
     *      Documentation</a>
     */
    GetBlockResult getBlock(GetBlockRequest getBlockRequest);

    /**
     * <p>
     * Returns the digest of a ledger at the latest committed block in the journal. The response includes a 256-bit hash
     * value and a block address.
     * </p>
     * 
     * @param getDigestRequest
     * @return Result of the GetDigest operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourcePreconditionNotMetException
     *         The operation failed because a condition wasn't satisfied in advance.
     * @sample AmazonQLDB.GetDigest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetDigest" target="_top">AWS API
     *      Documentation</a>
     */
    GetDigestResult getDigest(GetDigestRequest getDigestRequest);

    /**
     * <p>
     * Returns a revision data object for a specified document ID and block address. Also returns a proof of the
     * specified revision for verification if <code>DigestTipAddress</code> is provided.
     * </p>
     * 
     * @param getRevisionRequest
     * @return Result of the GetRevision operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourcePreconditionNotMetException
     *         The operation failed because a condition wasn't satisfied in advance.
     * @sample AmazonQLDB.GetRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetRevision" target="_top">AWS API
     *      Documentation</a>
     */
    GetRevisionResult getRevision(GetRevisionRequest getRevisionRequest);

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
     * @return Result of the ListJournalS3Exports operation returned by the service.
     * @sample AmazonQLDB.ListJournalS3Exports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListJournalS3Exports" target="_top">AWS API
     *      Documentation</a>
     */
    ListJournalS3ExportsResult listJournalS3Exports(ListJournalS3ExportsRequest listJournalS3ExportsRequest);

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
     * @return Result of the ListJournalS3ExportsForLedger operation returned by the service.
     * @sample AmazonQLDB.ListJournalS3ExportsForLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListJournalS3ExportsForLedger"
     *      target="_top">AWS API Documentation</a>
     */
    ListJournalS3ExportsForLedgerResult listJournalS3ExportsForLedger(ListJournalS3ExportsForLedgerRequest listJournalS3ExportsForLedgerRequest);

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
     * @return Result of the ListLedgers operation returned by the service.
     * @sample AmazonQLDB.ListLedgers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListLedgers" target="_top">AWS API
     *      Documentation</a>
     */
    ListLedgersResult listLedgers(ListLedgersRequest listLedgersRequest);

    /**
     * <p>
     * Returns all tags for a specified Amazon QLDB resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AmazonQLDB.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AmazonQLDB.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a specified Amazon QLDB resource. You can specify up to 50 tag keys to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AmazonQLDB.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates properties on a ledger.
     * </p>
     * 
     * @param updateLedgerRequest
     * @return Result of the UpdateLedger operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in the request aren't valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AmazonQLDB.UpdateLedger
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/UpdateLedger" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateLedgerResult updateLedger(UpdateLedgerRequest updateLedgerRequest);

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
