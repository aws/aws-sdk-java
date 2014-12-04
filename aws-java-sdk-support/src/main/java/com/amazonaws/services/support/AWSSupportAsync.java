/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.support;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.support.model.*;

/**
 * Interface for accessing AWSSupport asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * AWS Support <p>
 * The AWS Support API reference is intended for programmers who need
 * detailed information about the AWS Support operations and data types.
 * This service enables you to manage your AWS Support cases
 * programmatically. It uses HTTP methods that return results in JSON
 * format.
 * </p>
 * <p>
 * The AWS Support service also exposes a set of
 * <a href="https://aws.amazon.com/premiumsupport/trustedadvisor/"> Trusted Advisor </a>
 * features. You can retrieve a list of checks and their descriptions,
 * get check results, specify checks to refresh, and get the refresh
 * status of checks.
 * </p>
 * <p>
 * The following list describes the AWS Support case management
 * operations:
 * </p>
 * 
 * <ul>
 * <li> <b>Service names, issue categories, and available severity
 * levels. </b> The DescribeServices and DescribeSeverityLevels
 * operations return AWS service names, service codes, service
 * categories, and problem severity levels. You use these values when you
 * call the CreateCase operation. </li>
 * <li> <b>Case creation, case details, and case resolution.</b> The
 * CreateCase, DescribeCases, DescribeAttachment, and ResolveCase
 * operations create AWS Support cases, retrieve information about cases,
 * and resolve cases.</li>
 * <li> <b>Case communication.</b> The DescribeCommunications,
 * AddCommunicationToCase, and AddAttachmentsToSet operations retrieve
 * and add communications and attachments to AWS Support cases. </li>
 * 
 * </ul>
 * <p>
 * The following list describes the operations available from the AWS
 * Support service for Trusted Advisor:
 * </p>
 * 
 * <ul>
 * <li> DescribeTrustedAdvisorChecks returns the list of checks that run
 * against your AWS resources.</li>
 * <li>Using the <code>CheckId</code> for a specific check returned by
 * DescribeTrustedAdvisorChecks, you can call
 * DescribeTrustedAdvisorCheckResult to obtain the results for the check
 * you specified.</li>
 * <li> DescribeTrustedAdvisorCheckSummaries returns summarized results
 * for one or more Trusted Advisor checks.</li>
 * <li> RefreshTrustedAdvisorCheck requests that Trusted Advisor rerun a
 * specified check. </li>
 * <li> DescribeTrustedAdvisorCheckRefreshStatuses reports the refresh
 * status of one or more checks. </li>
 * 
 * </ul>
 * <p>
 * For authentication of requests, AWS Support uses
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing Process </a>
 * .
 * </p>
 * <p>
 * See
 * <a href="http://docs.aws.amazon.com/awssupport/latest/user/Welcome.html"> About the AWS Support API </a>
 * in the <i>AWS Support User Guide</i> for information about how to
 * use this service to create and manage your support cases, and how to
 * call Trusted Advisor for results of checks on your resources.
 * </p>
 */
public interface AWSSupportAsync extends AWSSupport {
    /**
     * <p>
     * Returns the refresh status of the Trusted Advisor checks that have
     * the specified check IDs. Check IDs can be obtained by calling
     * DescribeTrustedAdvisorChecks.
     * </p>
     *
     * @param describeTrustedAdvisorCheckRefreshStatusesRequest Container for
     *           the necessary parameters to execute the
     *           DescribeTrustedAdvisorCheckRefreshStatuses operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorCheckRefreshStatuses service method, as returned
     *         by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorCheckRefreshStatusesResult> describeTrustedAdvisorCheckRefreshStatusesAsync(DescribeTrustedAdvisorCheckRefreshStatusesRequest describeTrustedAdvisorCheckRefreshStatusesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the refresh status of the Trusted Advisor checks that have
     * the specified check IDs. Check IDs can be obtained by calling
     * DescribeTrustedAdvisorChecks.
     * </p>
     *
     * @param describeTrustedAdvisorCheckRefreshStatusesRequest Container for
     *           the necessary parameters to execute the
     *           DescribeTrustedAdvisorCheckRefreshStatuses operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorCheckRefreshStatuses service method, as returned
     *         by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorCheckRefreshStatusesResult> describeTrustedAdvisorCheckRefreshStatusesAsync(DescribeTrustedAdvisorCheckRefreshStatusesRequest describeTrustedAdvisorCheckRefreshStatusesRequest,
            AsyncHandler<DescribeTrustedAdvisorCheckRefreshStatusesRequest, DescribeTrustedAdvisorCheckRefreshStatusesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of cases that you specify by passing one or more case
     * IDs. In addition, you can filter the cases by date by setting values
     * for the <code>AfterTime</code> and <code>BeforeTime</code> request
     * parameters. You can set values for the
     * <code>IncludeResolvedCases</code> and
     * <code>IncludeCommunications</code> request parameters to control how
     * much information is returned.
     * </p>
     * <p>
     * Case data is available for 12 months after creation. If a case was
     * created more than 12 months ago, a request for data might cause an
     * error.
     * </p>
     * <p>
     * The response returns the following in JSON format:
     * </p>
     * <ol> <li>One or more CaseDetails data types. </li>
     * <li>One or more <code>NextToken</code> values, which specify where to
     * paginate the returned records represented by the
     * <code>CaseDetails</code> objects.</li>
     * </ol>
     *
     * @param describeCasesRequest Container for the necessary parameters to
     *           execute the DescribeCases operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCases service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCasesResult> describeCasesAsync(DescribeCasesRequest describeCasesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of cases that you specify by passing one or more case
     * IDs. In addition, you can filter the cases by date by setting values
     * for the <code>AfterTime</code> and <code>BeforeTime</code> request
     * parameters. You can set values for the
     * <code>IncludeResolvedCases</code> and
     * <code>IncludeCommunications</code> request parameters to control how
     * much information is returned.
     * </p>
     * <p>
     * Case data is available for 12 months after creation. If a case was
     * created more than 12 months ago, a request for data might cause an
     * error.
     * </p>
     * <p>
     * The response returns the following in JSON format:
     * </p>
     * <ol> <li>One or more CaseDetails data types. </li>
     * <li>One or more <code>NextToken</code> values, which specify where to
     * paginate the returned records represented by the
     * <code>CaseDetails</code> objects.</li>
     * </ol>
     *
     * @param describeCasesRequest Container for the necessary parameters to
     *           execute the DescribeCases operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCases service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCasesResult> describeCasesAsync(DescribeCasesRequest describeCasesRequest,
            AsyncHandler<DescribeCasesRequest, DescribeCasesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more attachments to an attachment set. If an
     * <code>AttachmentSetId</code> is not specified, a new attachment set is
     * created, and the ID of the set is returned in the response. If an
     * <code>AttachmentSetId</code> is specified, the attachments are added
     * to the specified set, if it exists.
     * </p>
     * <p>
     * An attachment set is a temporary container for attachments that are
     * to be added to a case or case communication. The set is available for
     * one hour after it is created; the <code>ExpiryTime</code> returned in
     * the response indicates when the set expires. The maximum number of
     * attachments in a set is 3, and the maximum size of any attachment in
     * the set is 5 MB.
     * </p>
     *
     * @param addAttachmentsToSetRequest Container for the necessary
     *           parameters to execute the AddAttachmentsToSet operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         AddAttachmentsToSet service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddAttachmentsToSetResult> addAttachmentsToSetAsync(AddAttachmentsToSetRequest addAttachmentsToSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more attachments to an attachment set. If an
     * <code>AttachmentSetId</code> is not specified, a new attachment set is
     * created, and the ID of the set is returned in the response. If an
     * <code>AttachmentSetId</code> is specified, the attachments are added
     * to the specified set, if it exists.
     * </p>
     * <p>
     * An attachment set is a temporary container for attachments that are
     * to be added to a case or case communication. The set is available for
     * one hour after it is created; the <code>ExpiryTime</code> returned in
     * the response indicates when the set expires. The maximum number of
     * attachments in a set is 3, and the maximum size of any attachment in
     * the set is 5 MB.
     * </p>
     *
     * @param addAttachmentsToSetRequest Container for the necessary
     *           parameters to execute the AddAttachmentsToSet operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddAttachmentsToSet service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddAttachmentsToSetResult> addAttachmentsToSetAsync(AddAttachmentsToSetRequest addAttachmentsToSetRequest,
            AsyncHandler<AddAttachmentsToSetRequest, AddAttachmentsToSetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the list of severity levels that you can assign to an AWS
     * Support case. The severity level for a case is also a field in the
     * CaseDetails data type included in any CreateCase request.
     * </p>
     *
     * @param describeSeverityLevelsRequest Container for the necessary
     *           parameters to execute the DescribeSeverityLevels operation on
     *           AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSeverityLevels service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(DescribeSeverityLevelsRequest describeSeverityLevelsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the list of severity levels that you can assign to an AWS
     * Support case. The severity level for a case is also a field in the
     * CaseDetails data type included in any CreateCase request.
     * </p>
     *
     * @param describeSeverityLevelsRequest Container for the necessary
     *           parameters to execute the DescribeSeverityLevels operation on
     *           AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSeverityLevels service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(DescribeSeverityLevelsRequest describeSeverityLevelsRequest,
            AsyncHandler<DescribeSeverityLevelsRequest, DescribeSeverityLevelsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns communications (and attachments) for one or more support
     * cases. You can use the <code>AfterTime</code> and
     * <code>BeforeTime</code> parameters to filter by date. You can use the
     * <code>CaseId</code> parameter to restrict the results to a particular
     * case.
     * </p>
     * <p>
     * Case data is available for 12 months after creation. If a case was
     * created more than 12 months ago, a request for data might cause an
     * error.
     * </p>
     * <p>
     * You can use the <code>MaxResults</code> and <code>NextToken</code>
     * parameters to control the pagination of the result set. Set
     * <code>MaxResults</code> to the number of cases you want displayed on
     * each page, and use <code>NextToken</code> to specify the resumption of
     * pagination.
     * </p>
     *
     * @param describeCommunicationsRequest Container for the necessary
     *           parameters to execute the DescribeCommunications operation on
     *           AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCommunications service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCommunicationsResult> describeCommunicationsAsync(DescribeCommunicationsRequest describeCommunicationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns communications (and attachments) for one or more support
     * cases. You can use the <code>AfterTime</code> and
     * <code>BeforeTime</code> parameters to filter by date. You can use the
     * <code>CaseId</code> parameter to restrict the results to a particular
     * case.
     * </p>
     * <p>
     * Case data is available for 12 months after creation. If a case was
     * created more than 12 months ago, a request for data might cause an
     * error.
     * </p>
     * <p>
     * You can use the <code>MaxResults</code> and <code>NextToken</code>
     * parameters to control the pagination of the result set. Set
     * <code>MaxResults</code> to the number of cases you want displayed on
     * each page, and use <code>NextToken</code> to specify the resumption of
     * pagination.
     * </p>
     *
     * @param describeCommunicationsRequest Container for the necessary
     *           parameters to execute the DescribeCommunications operation on
     *           AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCommunications service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCommunicationsResult> describeCommunicationsAsync(DescribeCommunicationsRequest describeCommunicationsRequest,
            AsyncHandler<DescribeCommunicationsRequest, DescribeCommunicationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the attachment that has the specified ID. Attachment IDs are
     * generated by the case management system when you add an attachment to
     * a case or case communication. Attachment IDs are returned in the
     * AttachmentDetails objects that are returned by the
     * DescribeCommunications operation.
     * </p>
     *
     * @param describeAttachmentRequest Container for the necessary
     *           parameters to execute the DescribeAttachment operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAttachment service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAttachmentResult> describeAttachmentAsync(DescribeAttachmentRequest describeAttachmentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the attachment that has the specified ID. Attachment IDs are
     * generated by the case management system when you add an attachment to
     * a case or case communication. Attachment IDs are returned in the
     * AttachmentDetails objects that are returned by the
     * DescribeCommunications operation.
     * </p>
     *
     * @param describeAttachmentRequest Container for the necessary
     *           parameters to execute the DescribeAttachment operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAttachment service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAttachmentResult> describeAttachmentAsync(DescribeAttachmentRequest describeAttachmentRequest,
            AsyncHandler<DescribeAttachmentRequest, DescribeAttachmentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Takes a <code>CaseId</code> and returns the initial state of the case
     * along with the state of the case after the call to ResolveCase
     * completed.
     * </p>
     *
     * @param resolveCaseRequest Container for the necessary parameters to
     *           execute the ResolveCase operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         ResolveCase service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ResolveCaseResult> resolveCaseAsync(ResolveCaseRequest resolveCaseRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Takes a <code>CaseId</code> and returns the initial state of the case
     * along with the state of the case after the call to ResolveCase
     * completed.
     * </p>
     *
     * @param resolveCaseRequest Container for the necessary parameters to
     *           execute the ResolveCase operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ResolveCase service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ResolveCaseResult> resolveCaseAsync(ResolveCaseRequest resolveCaseRequest,
            AsyncHandler<ResolveCaseRequest, ResolveCaseResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current list of AWS services and a list of service
     * categories that applies to each one. You then use service names and
     * categories in your CreateCase requests. Each AWS service has its own
     * set of categories.
     * </p>
     * <p>
     * The service codes and category codes correspond to the values that
     * are displayed in the <b>Service</b> and <b>Category</b> drop-down
     * lists on the AWS Support Center
     * <a href="https://console.aws.amazon.com/support/home#/case/create"> Create Case </a>
     * page. The values in those fields, however, do not necessarily match
     * the service codes and categories returned by the
     * <code>DescribeServices</code> request. Always use the service codes
     * and categories obtained programmatically. This practice ensures that
     * you always have the most recent set of service and category codes.
     * </p>
     *
     * @param describeServicesRequest Container for the necessary parameters
     *           to execute the DescribeServices operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServices service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest describeServicesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current list of AWS services and a list of service
     * categories that applies to each one. You then use service names and
     * categories in your CreateCase requests. Each AWS service has its own
     * set of categories.
     * </p>
     * <p>
     * The service codes and category codes correspond to the values that
     * are displayed in the <b>Service</b> and <b>Category</b> drop-down
     * lists on the AWS Support Center
     * <a href="https://console.aws.amazon.com/support/home#/case/create"> Create Case </a>
     * page. The values in those fields, however, do not necessarily match
     * the service codes and categories returned by the
     * <code>DescribeServices</code> request. Always use the service codes
     * and categories obtained programmatically. This practice ensures that
     * you always have the most recent set of service and category codes.
     * </p>
     *
     * @param describeServicesRequest Container for the necessary parameters
     *           to execute the DescribeServices operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeServices service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest describeServicesRequest,
            AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds additional customer communication to an AWS Support case. You
     * use the <code>CaseId</code> value to identify the case to add
     * communication to. You can list a set of email addresses to copy on the
     * communication using the <code>CcEmailAddresses</code> value. The
     * <code>CommunicationBody</code> value contains the text of the
     * communication.
     * </p>
     * <p>
     * The response indicates the success or failure of the request.
     * </p>
     * <p>
     * This operation implements a subset of the features of the AWS Support
     * Center.
     * </p>
     *
     * @param addCommunicationToCaseRequest Container for the necessary
     *           parameters to execute the AddCommunicationToCase operation on
     *           AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         AddCommunicationToCase service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddCommunicationToCaseResult> addCommunicationToCaseAsync(AddCommunicationToCaseRequest addCommunicationToCaseRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds additional customer communication to an AWS Support case. You
     * use the <code>CaseId</code> value to identify the case to add
     * communication to. You can list a set of email addresses to copy on the
     * communication using the <code>CcEmailAddresses</code> value. The
     * <code>CommunicationBody</code> value contains the text of the
     * communication.
     * </p>
     * <p>
     * The response indicates the success or failure of the request.
     * </p>
     * <p>
     * This operation implements a subset of the features of the AWS Support
     * Center.
     * </p>
     *
     * @param addCommunicationToCaseRequest Container for the necessary
     *           parameters to execute the AddCommunicationToCase operation on
     *           AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddCommunicationToCase service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddCommunicationToCaseResult> addCommunicationToCaseAsync(AddCommunicationToCaseRequest addCommunicationToCaseRequest,
            AsyncHandler<AddCommunicationToCaseRequest, AddCommunicationToCaseResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new case in the AWS Support Center. This operation is
     * modeled on the behavior of the AWS Support Center
     * <a href="https://console.aws.amazon.com/support/home#/case/create"> Create Case </a>
     * page. Its parameters require you to specify the following
     * information:
     * </p>
     * <ol> <li> <b>IssueType.</b> The type of issue for the case. You can
     * specify either "customer-service" or "technical." If you do not
     * indicate a value, the default is "technical." </li>
     * <li> <b>ServiceCode.</b> The code for an AWS service. You obtain the
     * <code>ServiceCode</code> by calling DescribeServices. </li>
     * <li> <b>CategoryCode.</b> The category for the service defined for
     * the <code>ServiceCode</code> value. You also obtain the category code
     * for a service by calling DescribeServices. Each AWS service defines
     * its own set of category codes. </li>
     * <li> <b>SeverityCode.</b> A value that indicates the urgency of the
     * case, which in turn determines the response time according to your
     * service level agreement with AWS Support. You obtain the SeverityCode
     * by calling DescribeSeverityLevels.</li>
     * <li> <b>Subject.</b> The <b>Subject</b> field on the AWS Support
     * Center
     * <a href="https://console.aws.amazon.com/support/home#/case/create"> Create Case </a>
     * page.</li>
     * <li> <b>CommunicationBody.</b> The <b>Description</b> field on the
     * AWS Support Center
     * <a href="https://console.aws.amazon.com/support/home#/case/create"> Create Case </a>
     * page.</li>
     * <li> <b>AttachmentSetId.</b> The ID of a set of attachments that has
     * been created by using AddAttachmentsToSet.</li>
     * <li> <b>Language.</b> The human language in which AWS Support handles
     * the case. English and Japanese are currently supported.</li>
     * <li> <b>CcEmailAddresses.</b> The AWS Support Center <b>CC</b> field
     * on the
     * <a href="https://console.aws.amazon.com/support/home#/case/create"> Create Case </a> page. You can list email addresses to be copied on any correspondence about the case. The account that opens the case is already identified by passing the AWS Credentials in the HTTP POST method or in a method or function call from one of the programming languages supported by an <a href="http://aws.amazon.com/tools/"> AWS SDK </a>
     * . </li>
     * </ol> <p>
     * <b>NOTE:</b> To add additional communication or attachments to an
     * existing case, use AddCommunicationToCase.
     * </p>
     * <p>
     * A successful CreateCase request returns an AWS Support case number.
     * Case numbers are used by the DescribeCases operation to retrieve
     * existing AWS Support cases.
     * </p>
     *
     * @param createCaseRequest Container for the necessary parameters to
     *           execute the CreateCase operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCase service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateCaseResult> createCaseAsync(CreateCaseRequest createCaseRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new case in the AWS Support Center. This operation is
     * modeled on the behavior of the AWS Support Center
     * <a href="https://console.aws.amazon.com/support/home#/case/create"> Create Case </a>
     * page. Its parameters require you to specify the following
     * information:
     * </p>
     * <ol> <li> <b>IssueType.</b> The type of issue for the case. You can
     * specify either "customer-service" or "technical." If you do not
     * indicate a value, the default is "technical." </li>
     * <li> <b>ServiceCode.</b> The code for an AWS service. You obtain the
     * <code>ServiceCode</code> by calling DescribeServices. </li>
     * <li> <b>CategoryCode.</b> The category for the service defined for
     * the <code>ServiceCode</code> value. You also obtain the category code
     * for a service by calling DescribeServices. Each AWS service defines
     * its own set of category codes. </li>
     * <li> <b>SeverityCode.</b> A value that indicates the urgency of the
     * case, which in turn determines the response time according to your
     * service level agreement with AWS Support. You obtain the SeverityCode
     * by calling DescribeSeverityLevels.</li>
     * <li> <b>Subject.</b> The <b>Subject</b> field on the AWS Support
     * Center
     * <a href="https://console.aws.amazon.com/support/home#/case/create"> Create Case </a>
     * page.</li>
     * <li> <b>CommunicationBody.</b> The <b>Description</b> field on the
     * AWS Support Center
     * <a href="https://console.aws.amazon.com/support/home#/case/create"> Create Case </a>
     * page.</li>
     * <li> <b>AttachmentSetId.</b> The ID of a set of attachments that has
     * been created by using AddAttachmentsToSet.</li>
     * <li> <b>Language.</b> The human language in which AWS Support handles
     * the case. English and Japanese are currently supported.</li>
     * <li> <b>CcEmailAddresses.</b> The AWS Support Center <b>CC</b> field
     * on the
     * <a href="https://console.aws.amazon.com/support/home#/case/create"> Create Case </a> page. You can list email addresses to be copied on any correspondence about the case. The account that opens the case is already identified by passing the AWS Credentials in the HTTP POST method or in a method or function call from one of the programming languages supported by an <a href="http://aws.amazon.com/tools/"> AWS SDK </a>
     * . </li>
     * </ol> <p>
     * <b>NOTE:</b> To add additional communication or attachments to an
     * existing case, use AddCommunicationToCase.
     * </p>
     * <p>
     * A successful CreateCase request returns an AWS Support case number.
     * Case numbers are used by the DescribeCases operation to retrieve
     * existing AWS Support cases.
     * </p>
     *
     * @param createCaseRequest Container for the necessary parameters to
     *           execute the CreateCase operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCase service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateCaseResult> createCaseAsync(CreateCaseRequest createCaseRequest,
            AsyncHandler<CreateCaseRequest, CreateCaseResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about all available Trusted Advisor checks,
     * including name, ID, category, description, and metadata. You must
     * specify a language code; English ("en") and Japanese ("ja") are
     * currently supported. The response contains a
     * TrustedAdvisorCheckDescription for each check.
     * </p>
     *
     * @param describeTrustedAdvisorChecksRequest Container for the necessary
     *           parameters to execute the DescribeTrustedAdvisorChecks operation on
     *           AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorChecks service method, as returned by
     *         AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorChecksResult> describeTrustedAdvisorChecksAsync(DescribeTrustedAdvisorChecksRequest describeTrustedAdvisorChecksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about all available Trusted Advisor checks,
     * including name, ID, category, description, and metadata. You must
     * specify a language code; English ("en") and Japanese ("ja") are
     * currently supported. The response contains a
     * TrustedAdvisorCheckDescription for each check.
     * </p>
     *
     * @param describeTrustedAdvisorChecksRequest Container for the necessary
     *           parameters to execute the DescribeTrustedAdvisorChecks operation on
     *           AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorChecks service method, as returned by
     *         AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorChecksResult> describeTrustedAdvisorChecksAsync(DescribeTrustedAdvisorChecksRequest describeTrustedAdvisorChecksRequest,
            AsyncHandler<DescribeTrustedAdvisorChecksRequest, DescribeTrustedAdvisorChecksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the results of the Trusted Advisor check that has the
     * specified check ID. Check IDs can be obtained by calling
     * DescribeTrustedAdvisorChecks.
     * </p>
     * <p>
     * The response contains a TrustedAdvisorCheckResult object, which
     * contains these three objects:
     * </p>
     * 
     * <ul>
     * <li> TrustedAdvisorCategorySpecificSummary </li>
     * <li> TrustedAdvisorResourceDetail </li>
     * <li> TrustedAdvisorResourcesSummary </li>
     * 
     * </ul>
     * <p>
     * In addition, the response contains these fields:
     * </p>
     * 
     * <ul>
     * <li> <b>Status.</b> The alert status of the check: "ok" (green),
     * "warning" (yellow), "error" (red), or "not_available".</li>
     * <li> <b>Timestamp.</b> The time of the last refresh of the
     * check.</li>
     * <li> <b>CheckId.</b> The unique identifier for the check.</li>
     * 
     * </ul>
     *
     * @param describeTrustedAdvisorCheckResultRequest Container for the
     *           necessary parameters to execute the DescribeTrustedAdvisorCheckResult
     *           operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorCheckResult service method, as returned by
     *         AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorCheckResultResult> describeTrustedAdvisorCheckResultAsync(DescribeTrustedAdvisorCheckResultRequest describeTrustedAdvisorCheckResultRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the results of the Trusted Advisor check that has the
     * specified check ID. Check IDs can be obtained by calling
     * DescribeTrustedAdvisorChecks.
     * </p>
     * <p>
     * The response contains a TrustedAdvisorCheckResult object, which
     * contains these three objects:
     * </p>
     * 
     * <ul>
     * <li> TrustedAdvisorCategorySpecificSummary </li>
     * <li> TrustedAdvisorResourceDetail </li>
     * <li> TrustedAdvisorResourcesSummary </li>
     * 
     * </ul>
     * <p>
     * In addition, the response contains these fields:
     * </p>
     * 
     * <ul>
     * <li> <b>Status.</b> The alert status of the check: "ok" (green),
     * "warning" (yellow), "error" (red), or "not_available".</li>
     * <li> <b>Timestamp.</b> The time of the last refresh of the
     * check.</li>
     * <li> <b>CheckId.</b> The unique identifier for the check.</li>
     * 
     * </ul>
     *
     * @param describeTrustedAdvisorCheckResultRequest Container for the
     *           necessary parameters to execute the DescribeTrustedAdvisorCheckResult
     *           operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorCheckResult service method, as returned by
     *         AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorCheckResultResult> describeTrustedAdvisorCheckResultAsync(DescribeTrustedAdvisorCheckResultRequest describeTrustedAdvisorCheckResultRequest,
            AsyncHandler<DescribeTrustedAdvisorCheckResultRequest, DescribeTrustedAdvisorCheckResultResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a refresh of the Trusted Advisor check that has the
     * specified check ID. Check IDs can be obtained by calling
     * DescribeTrustedAdvisorChecks.
     * </p>
     * <p>
     * The response contains a TrustedAdvisorCheckRefreshStatus object,
     * which contains these fields:
     * </p>
     * 
     * <ul>
     * <li> <b>Status.</b> The refresh status of the check: "none",
     * "enqueued", "processing", "success", or "abandoned".</li>
     * <li> <b>MillisUntilNextRefreshable.</b> The amount of time, in
     * milliseconds, until the check is eligible for refresh.</li>
     * <li> <b>CheckId.</b> The unique identifier for the check.</li>
     * 
     * </ul>
     *
     * @param refreshTrustedAdvisorCheckRequest Container for the necessary
     *           parameters to execute the RefreshTrustedAdvisorCheck operation on
     *           AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         RefreshTrustedAdvisorCheck service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RefreshTrustedAdvisorCheckResult> refreshTrustedAdvisorCheckAsync(RefreshTrustedAdvisorCheckRequest refreshTrustedAdvisorCheckRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a refresh of the Trusted Advisor check that has the
     * specified check ID. Check IDs can be obtained by calling
     * DescribeTrustedAdvisorChecks.
     * </p>
     * <p>
     * The response contains a TrustedAdvisorCheckRefreshStatus object,
     * which contains these fields:
     * </p>
     * 
     * <ul>
     * <li> <b>Status.</b> The refresh status of the check: "none",
     * "enqueued", "processing", "success", or "abandoned".</li>
     * <li> <b>MillisUntilNextRefreshable.</b> The amount of time, in
     * milliseconds, until the check is eligible for refresh.</li>
     * <li> <b>CheckId.</b> The unique identifier for the check.</li>
     * 
     * </ul>
     *
     * @param refreshTrustedAdvisorCheckRequest Container for the necessary
     *           parameters to execute the RefreshTrustedAdvisorCheck operation on
     *           AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RefreshTrustedAdvisorCheck service method, as returned by AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RefreshTrustedAdvisorCheckResult> refreshTrustedAdvisorCheckAsync(RefreshTrustedAdvisorCheckRequest refreshTrustedAdvisorCheckRequest,
            AsyncHandler<RefreshTrustedAdvisorCheckRequest, RefreshTrustedAdvisorCheckResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the summaries of the results of the Trusted Advisor checks
     * that have the specified check IDs. Check IDs can be obtained by
     * calling DescribeTrustedAdvisorChecks.
     * </p>
     * <p>
     * The response contains an array of TrustedAdvisorCheckSummary objects.
     * </p>
     *
     * @param describeTrustedAdvisorCheckSummariesRequest Container for the
     *           necessary parameters to execute the
     *           DescribeTrustedAdvisorCheckSummaries operation on AWSSupport.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorCheckSummaries service method, as returned by
     *         AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorCheckSummariesResult> describeTrustedAdvisorCheckSummariesAsync(DescribeTrustedAdvisorCheckSummariesRequest describeTrustedAdvisorCheckSummariesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the summaries of the results of the Trusted Advisor checks
     * that have the specified check IDs. Check IDs can be obtained by
     * calling DescribeTrustedAdvisorChecks.
     * </p>
     * <p>
     * The response contains an array of TrustedAdvisorCheckSummary objects.
     * </p>
     *
     * @param describeTrustedAdvisorCheckSummariesRequest Container for the
     *           necessary parameters to execute the
     *           DescribeTrustedAdvisorCheckSummaries operation on AWSSupport.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTrustedAdvisorCheckSummaries service method, as returned by
     *         AWSSupport.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTrustedAdvisorCheckSummariesResult> describeTrustedAdvisorCheckSummariesAsync(DescribeTrustedAdvisorCheckSummariesRequest describeTrustedAdvisorCheckSummariesRequest,
            AsyncHandler<DescribeTrustedAdvisorCheckSummariesRequest, DescribeTrustedAdvisorCheckSummariesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        