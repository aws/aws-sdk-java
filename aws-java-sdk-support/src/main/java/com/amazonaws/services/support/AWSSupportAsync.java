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
package com.amazonaws.services.support;

import javax.annotation.Generated;

import com.amazonaws.services.support.model.*;

/**
 * Interface for accessing AWS Support asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.support.AbstractAWSSupportAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Support</fullname>
 * <p>
 * The <i>AWS Support API Reference</i> is intended for programmers who need detailed information about the AWS Support
 * operations and data types. You can use the API to manage your support cases programmatically. The AWS Support API
 * uses HTTP methods that return results in JSON format.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * You must have a Business or Enterprise Support plan to use the AWS Support API.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
 * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support plan,
 * see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
 * </p>
 * </li>
 * </ul>
 * </note>
 * <p>
 * The AWS Support service also exposes a set of <a href="http://aws.amazon.com/premiumsupport/trustedadvisor/">AWS
 * Trusted Advisor</a> features. You can retrieve a list of checks and their descriptions, get check results, specify
 * checks to refresh, and get the refresh status of checks.
 * </p>
 * <p>
 * The following list describes the AWS Support case management operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Service names, issue categories, and available severity levels - The <a>DescribeServices</a> and
 * <a>DescribeSeverityLevels</a> operations return AWS service names, service codes, service categories, and problem
 * severity levels. You use these values when you call the <a>CreateCase</a> operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * Case creation, case details, and case resolution - The <a>CreateCase</a>, <a>DescribeCases</a>,
 * <a>DescribeAttachment</a>, and <a>ResolveCase</a> operations create AWS Support cases, retrieve information about
 * cases, and resolve cases.
 * </p>
 * </li>
 * <li>
 * <p>
 * Case communication - The <a>DescribeCommunications</a>, <a>AddCommunicationToCase</a>, and <a>AddAttachmentsToSet</a>
 * operations retrieve and add communications and attachments to AWS Support cases.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The following list describes the operations available from the AWS Support service for Trusted Advisor:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeTrustedAdvisorChecks</a> returns the list of checks that run against your AWS resources.
 * </p>
 * </li>
 * <li>
 * <p>
 * Using the <code>checkId</code> for a specific check returned by <a>DescribeTrustedAdvisorChecks</a>, you can call
 * <a>DescribeTrustedAdvisorCheckResult</a> to obtain the results for the check that you specified.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeTrustedAdvisorCheckSummaries</a> returns summarized results for one or more Trusted Advisor checks.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RefreshTrustedAdvisorCheck</a> requests that Trusted Advisor rerun a specified check.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeTrustedAdvisorCheckRefreshStatuses</a> reports the refresh status of one or more checks.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For authentication of requests, AWS Support uses <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a>.
 * </p>
 * <p>
 * See <a href="https://docs.aws.amazon.com/awssupport/latest/user/Welcome.html">About the AWS Support API</a> in the
 * <i>AWS Support User Guide</i> for information about how to use this service to create and manage your support cases,
 * and how to call Trusted Advisor for results of checks on your resources.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSupportAsync extends AWSSupport {

    /**
     * <p>
     * Adds one or more attachments to an attachment set.
     * </p>
     * <p>
     * An attachment set is a temporary container for attachments that you add to a case or case communication. The set
     * is available for 1 hour after it's created. The <code>expiryTime</code> returned in the response is when the set
     * expires.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param addAttachmentsToSetRequest
     * @return A Java Future containing the result of the AddAttachmentsToSet operation returned by the service.
     * @sample AWSSupportAsync.AddAttachmentsToSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/AddAttachmentsToSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddAttachmentsToSetResult> addAttachmentsToSetAsync(AddAttachmentsToSetRequest addAttachmentsToSetRequest);

    /**
     * <p>
     * Adds one or more attachments to an attachment set.
     * </p>
     * <p>
     * An attachment set is a temporary container for attachments that you add to a case or case communication. The set
     * is available for 1 hour after it's created. The <code>expiryTime</code> returned in the response is when the set
     * expires.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param addAttachmentsToSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddAttachmentsToSet operation returned by the service.
     * @sample AWSSupportAsyncHandler.AddAttachmentsToSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/AddAttachmentsToSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddAttachmentsToSetResult> addAttachmentsToSetAsync(AddAttachmentsToSetRequest addAttachmentsToSetRequest,
            com.amazonaws.handlers.AsyncHandler<AddAttachmentsToSetRequest, AddAttachmentsToSetResult> asyncHandler);

    /**
     * <p>
     * Adds additional customer communication to an AWS Support case. Use the <code>caseId</code> parameter to identify
     * the case to which to add communication. You can list a set of email addresses to copy on the communication by
     * using the <code>ccEmailAddresses</code> parameter. The <code>communicationBody</code> value contains the text of
     * the communication.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param addCommunicationToCaseRequest
     * @return A Java Future containing the result of the AddCommunicationToCase operation returned by the service.
     * @sample AWSSupportAsync.AddCommunicationToCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/AddCommunicationToCase" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddCommunicationToCaseResult> addCommunicationToCaseAsync(AddCommunicationToCaseRequest addCommunicationToCaseRequest);

    /**
     * <p>
     * Adds additional customer communication to an AWS Support case. Use the <code>caseId</code> parameter to identify
     * the case to which to add communication. You can list a set of email addresses to copy on the communication by
     * using the <code>ccEmailAddresses</code> parameter. The <code>communicationBody</code> value contains the text of
     * the communication.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param addCommunicationToCaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddCommunicationToCase operation returned by the service.
     * @sample AWSSupportAsyncHandler.AddCommunicationToCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/AddCommunicationToCase" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddCommunicationToCaseResult> addCommunicationToCaseAsync(AddCommunicationToCaseRequest addCommunicationToCaseRequest,
            com.amazonaws.handlers.AsyncHandler<AddCommunicationToCaseRequest, AddCommunicationToCaseResult> asyncHandler);

    /**
     * <p>
     * Creates a case in the AWS Support Center. This operation is similar to how you create a case in the AWS Support
     * Center <a href="https://console.aws.amazon.com/support/home#/case/create">Create Case</a> page.
     * </p>
     * <p>
     * The AWS Support API doesn't support requesting service limit increases. You can submit a service limit increase
     * in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Submit a request from the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create Case</a> page.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Service Quotas <a
     * href="https://docs.aws.amazon.com/servicequotas/2019-06-24/apireference/API_RequestServiceQuotaIncrease.html"
     * >RequestServiceQuotaIncrease</a> operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A successful <code>CreateCase</code> request returns an AWS Support case number. You can use the
     * <a>DescribeCases</a> operation and specify the case number to get existing AWS Support cases. After you create a
     * case, use the <a>AddCommunicationToCase</a> operation to add additional communication or attachments to an
     * existing case.
     * </p>
     * <p>
     * The <code>caseId</code> is separate from the <code>displayId</code> that appears in the <a
     * href="https://console.aws.amazon.com/support">AWS Support Center</a>. Use the <a>DescribeCases</a> operation to
     * get the <code>displayId</code>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createCaseRequest
     * @return A Java Future containing the result of the CreateCase operation returned by the service.
     * @sample AWSSupportAsync.CreateCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/CreateCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCaseResult> createCaseAsync(CreateCaseRequest createCaseRequest);

    /**
     * <p>
     * Creates a case in the AWS Support Center. This operation is similar to how you create a case in the AWS Support
     * Center <a href="https://console.aws.amazon.com/support/home#/case/create">Create Case</a> page.
     * </p>
     * <p>
     * The AWS Support API doesn't support requesting service limit increases. You can submit a service limit increase
     * in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Submit a request from the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create Case</a> page.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the Service Quotas <a
     * href="https://docs.aws.amazon.com/servicequotas/2019-06-24/apireference/API_RequestServiceQuotaIncrease.html"
     * >RequestServiceQuotaIncrease</a> operation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A successful <code>CreateCase</code> request returns an AWS Support case number. You can use the
     * <a>DescribeCases</a> operation and specify the case number to get existing AWS Support cases. After you create a
     * case, use the <a>AddCommunicationToCase</a> operation to add additional communication or attachments to an
     * existing case.
     * </p>
     * <p>
     * The <code>caseId</code> is separate from the <code>displayId</code> that appears in the <a
     * href="https://console.aws.amazon.com/support">AWS Support Center</a>. Use the <a>DescribeCases</a> operation to
     * get the <code>displayId</code>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param createCaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCase operation returned by the service.
     * @sample AWSSupportAsyncHandler.CreateCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/CreateCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCaseResult> createCaseAsync(CreateCaseRequest createCaseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCaseRequest, CreateCaseResult> asyncHandler);

    /**
     * <p>
     * Returns the attachment that has the specified ID. Attachments can include screenshots, error logs, or other files
     * that describe your issue. Attachment IDs are generated by the case management system when you add an attachment
     * to a case or case communication. Attachment IDs are returned in the <a>AttachmentDetails</a> objects that are
     * returned by the <a>DescribeCommunications</a> operation.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeAttachmentRequest
     * @return A Java Future containing the result of the DescribeAttachment operation returned by the service.
     * @sample AWSSupportAsync.DescribeAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeAttachment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAttachmentResult> describeAttachmentAsync(DescribeAttachmentRequest describeAttachmentRequest);

    /**
     * <p>
     * Returns the attachment that has the specified ID. Attachments can include screenshots, error logs, or other files
     * that describe your issue. Attachment IDs are generated by the case management system when you add an attachment
     * to a case or case communication. Attachment IDs are returned in the <a>AttachmentDetails</a> objects that are
     * returned by the <a>DescribeCommunications</a> operation.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAttachment operation returned by the service.
     * @sample AWSSupportAsyncHandler.DescribeAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeAttachment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAttachmentResult> describeAttachmentAsync(DescribeAttachmentRequest describeAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAttachmentRequest, DescribeAttachmentResult> asyncHandler);

    /**
     * <p>
     * Returns a list of cases that you specify by passing one or more case IDs. You can use the <code>afterTime</code>
     * and <code>beforeTime</code> parameters to filter the cases by date. You can set values for the
     * <code>includeResolvedCases</code> and <code>includeCommunications</code> parameters to specify how much
     * information to return.
     * </p>
     * <p>
     * The response returns the following in JSON format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * One or more <a
     * href="https://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html">CaseDetails</a> data
     * types.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more <code>nextToken</code> values, which specify where to paginate the returned records represented by
     * the <code>CaseDetails</code> objects.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request
     * might return an error.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeCasesRequest
     * @return A Java Future containing the result of the DescribeCases operation returned by the service.
     * @sample AWSSupportAsync.DescribeCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeCases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync(DescribeCasesRequest describeCasesRequest);

    /**
     * <p>
     * Returns a list of cases that you specify by passing one or more case IDs. You can use the <code>afterTime</code>
     * and <code>beforeTime</code> parameters to filter the cases by date. You can set values for the
     * <code>includeResolvedCases</code> and <code>includeCommunications</code> parameters to specify how much
     * information to return.
     * </p>
     * <p>
     * The response returns the following in JSON format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * One or more <a
     * href="https://docs.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html">CaseDetails</a> data
     * types.
     * </p>
     * </li>
     * <li>
     * <p>
     * One or more <code>nextToken</code> values, which specify where to paginate the returned records represented by
     * the <code>CaseDetails</code> objects.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request
     * might return an error.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeCasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCases operation returned by the service.
     * @sample AWSSupportAsyncHandler.DescribeCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeCases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync(DescribeCasesRequest describeCasesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCasesRequest, DescribeCasesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeCases operation.
     *
     * @see #describeCasesAsync(DescribeCasesRequest)
     */
    java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync();

    /**
     * Simplified method form for invoking the DescribeCases operation with an AsyncHandler.
     *
     * @see #describeCasesAsync(DescribeCasesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCasesRequest, DescribeCasesResult> asyncHandler);

    /**
     * <p>
     * Returns communications and attachments for one or more support cases. Use the <code>afterTime</code> and
     * <code>beforeTime</code> parameters to filter by date. You can use the <code>caseId</code> parameter to restrict
     * the results to a specific case.
     * </p>
     * <p>
     * Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for
     * data might cause an error.
     * </p>
     * <p>
     * You can use the <code>maxResults</code> and <code>nextToken</code> parameters to control the pagination of the
     * results. Set <code>maxResults</code> to the number of cases that you want to display on each page, and use
     * <code>nextToken</code> to specify the resumption of pagination.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeCommunicationsRequest
     * @return A Java Future containing the result of the DescribeCommunications operation returned by the service.
     * @sample AWSSupportAsync.DescribeCommunications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeCommunications" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCommunicationsResult> describeCommunicationsAsync(DescribeCommunicationsRequest describeCommunicationsRequest);

    /**
     * <p>
     * Returns communications and attachments for one or more support cases. Use the <code>afterTime</code> and
     * <code>beforeTime</code> parameters to filter by date. You can use the <code>caseId</code> parameter to restrict
     * the results to a specific case.
     * </p>
     * <p>
     * Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for
     * data might cause an error.
     * </p>
     * <p>
     * You can use the <code>maxResults</code> and <code>nextToken</code> parameters to control the pagination of the
     * results. Set <code>maxResults</code> to the number of cases that you want to display on each page, and use
     * <code>nextToken</code> to specify the resumption of pagination.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeCommunicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCommunications operation returned by the service.
     * @sample AWSSupportAsyncHandler.DescribeCommunications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeCommunications" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCommunicationsResult> describeCommunicationsAsync(DescribeCommunicationsRequest describeCommunicationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCommunicationsRequest, DescribeCommunicationsResult> asyncHandler);

    /**
     * <p>
     * Returns the current list of AWS services and a list of service categories for each service. You then use service
     * names and categories in your <a>CreateCase</a> requests. Each AWS service has its own set of categories.
     * </p>
     * <p>
     * The service codes and category codes correspond to the values that appear in the <b>Service</b> and
     * <b>Category</b> lists on the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create Case</a> page. The values in those fields
     * don't necessarily match the service codes and categories returned by the <code>DescribeServices</code> operation.
     * Always use the service codes and categories that the <code>DescribeServices</code> operation returns, so that you
     * have the most recent set of service and category codes.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeServicesRequest
     * @return A Java Future containing the result of the DescribeServices operation returned by the service.
     * @sample AWSSupportAsync.DescribeServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeServices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest describeServicesRequest);

    /**
     * <p>
     * Returns the current list of AWS services and a list of service categories for each service. You then use service
     * names and categories in your <a>CreateCase</a> requests. Each AWS service has its own set of categories.
     * </p>
     * <p>
     * The service codes and category codes correspond to the values that appear in the <b>Service</b> and
     * <b>Category</b> lists on the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create Case</a> page. The values in those fields
     * don't necessarily match the service codes and categories returned by the <code>DescribeServices</code> operation.
     * Always use the service codes and categories that the <code>DescribeServices</code> operation returns, so that you
     * have the most recent set of service and category codes.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeServicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeServices operation returned by the service.
     * @sample AWSSupportAsyncHandler.DescribeServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeServices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest describeServicesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeServices operation.
     *
     * @see #describeServicesAsync(DescribeServicesRequest)
     */
    java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync();

    /**
     * Simplified method form for invoking the DescribeServices operation with an AsyncHandler.
     *
     * @see #describeServicesAsync(DescribeServicesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler);

    /**
     * <p>
     * Returns the list of severity levels that you can assign to a support case. The severity level for a case is also
     * a field in the <a>CaseDetails</a> data type that you include for a <a>CreateCase</a> request.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeSeverityLevelsRequest
     * @return A Java Future containing the result of the DescribeSeverityLevels operation returned by the service.
     * @sample AWSSupportAsync.DescribeSeverityLevels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeSeverityLevels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(DescribeSeverityLevelsRequest describeSeverityLevelsRequest);

    /**
     * <p>
     * Returns the list of severity levels that you can assign to a support case. The severity level for a case is also
     * a field in the <a>CaseDetails</a> data type that you include for a <a>CreateCase</a> request.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeSeverityLevelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSeverityLevels operation returned by the service.
     * @sample AWSSupportAsyncHandler.DescribeSeverityLevels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeSeverityLevels" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(DescribeSeverityLevelsRequest describeSeverityLevelsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSeverityLevelsRequest, DescribeSeverityLevelsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeSeverityLevels operation.
     *
     * @see #describeSeverityLevelsAsync(DescribeSeverityLevelsRequest)
     */
    java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync();

    /**
     * Simplified method form for invoking the DescribeSeverityLevels operation with an AsyncHandler.
     *
     * @see #describeSeverityLevelsAsync(DescribeSeverityLevelsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSeverityLevelsRequest, DescribeSeverityLevelsResult> asyncHandler);

    /**
     * <p>
     * Returns the refresh status of the AWS Trusted Advisor checks that have the specified check IDs. You can get the
     * check IDs by calling the <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <p>
     * Some checks are refreshed automatically, and you can't return their refresh statuses by using the
     * <code>DescribeTrustedAdvisorCheckRefreshStatuses</code> operation. If you call this operation for these checks,
     * you might see an <code>InvalidParameterValue</code> error.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorCheckRefreshStatusesRequest
     * @return A Java Future containing the result of the DescribeTrustedAdvisorCheckRefreshStatuses operation returned
     *         by the service.
     * @sample AWSSupportAsync.DescribeTrustedAdvisorCheckRefreshStatuses
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckRefreshStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorCheckRefreshStatusesResult> describeTrustedAdvisorCheckRefreshStatusesAsync(
            DescribeTrustedAdvisorCheckRefreshStatusesRequest describeTrustedAdvisorCheckRefreshStatusesRequest);

    /**
     * <p>
     * Returns the refresh status of the AWS Trusted Advisor checks that have the specified check IDs. You can get the
     * check IDs by calling the <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <p>
     * Some checks are refreshed automatically, and you can't return their refresh statuses by using the
     * <code>DescribeTrustedAdvisorCheckRefreshStatuses</code> operation. If you call this operation for these checks,
     * you might see an <code>InvalidParameterValue</code> error.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorCheckRefreshStatusesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTrustedAdvisorCheckRefreshStatuses operation returned
     *         by the service.
     * @sample AWSSupportAsyncHandler.DescribeTrustedAdvisorCheckRefreshStatuses
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckRefreshStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorCheckRefreshStatusesResult> describeTrustedAdvisorCheckRefreshStatusesAsync(
            DescribeTrustedAdvisorCheckRefreshStatusesRequest describeTrustedAdvisorCheckRefreshStatusesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorCheckRefreshStatusesRequest, DescribeTrustedAdvisorCheckRefreshStatusesResult> asyncHandler);

    /**
     * <p>
     * Returns the results of the AWS Trusted Advisor check that has the specified check ID. You can get the check IDs
     * by calling the <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <p>
     * The response contains a <a>TrustedAdvisorCheckResult</a> object, which contains these three objects:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>TrustedAdvisorCategorySpecificSummary</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>TrustedAdvisorResourceDetail</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>TrustedAdvisorResourcesSummary</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In addition, the response contains these fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>status</b> - The alert status of the check can be <code>ok</code> (green), <code>warning</code> (yellow),
     * <code>error</code> (red), or <code>not_available</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>timestamp</b> - The time of the last refresh of the check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>checkId</b> - The unique identifier for the check.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorCheckResultRequest
     * @return A Java Future containing the result of the DescribeTrustedAdvisorCheckResult operation returned by the
     *         service.
     * @sample AWSSupportAsync.DescribeTrustedAdvisorCheckResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckResult"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorCheckResultResult> describeTrustedAdvisorCheckResultAsync(
            DescribeTrustedAdvisorCheckResultRequest describeTrustedAdvisorCheckResultRequest);

    /**
     * <p>
     * Returns the results of the AWS Trusted Advisor check that has the specified check ID. You can get the check IDs
     * by calling the <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <p>
     * The response contains a <a>TrustedAdvisorCheckResult</a> object, which contains these three objects:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>TrustedAdvisorCategorySpecificSummary</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>TrustedAdvisorResourceDetail</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>TrustedAdvisorResourcesSummary</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In addition, the response contains these fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>status</b> - The alert status of the check can be <code>ok</code> (green), <code>warning</code> (yellow),
     * <code>error</code> (red), or <code>not_available</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>timestamp</b> - The time of the last refresh of the check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>checkId</b> - The unique identifier for the check.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorCheckResultRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTrustedAdvisorCheckResult operation returned by the
     *         service.
     * @sample AWSSupportAsyncHandler.DescribeTrustedAdvisorCheckResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckResult"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorCheckResultResult> describeTrustedAdvisorCheckResultAsync(
            DescribeTrustedAdvisorCheckResultRequest describeTrustedAdvisorCheckResultRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorCheckResultRequest, DescribeTrustedAdvisorCheckResultResult> asyncHandler);

    /**
     * <p>
     * Returns the results for the AWS Trusted Advisor check summaries for the check IDs that you specified. You can get
     * the check IDs by calling the <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <p>
     * The response contains an array of <a>TrustedAdvisorCheckSummary</a> objects.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorCheckSummariesRequest
     * @return A Java Future containing the result of the DescribeTrustedAdvisorCheckSummaries operation returned by the
     *         service.
     * @sample AWSSupportAsync.DescribeTrustedAdvisorCheckSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorCheckSummariesResult> describeTrustedAdvisorCheckSummariesAsync(
            DescribeTrustedAdvisorCheckSummariesRequest describeTrustedAdvisorCheckSummariesRequest);

    /**
     * <p>
     * Returns the results for the AWS Trusted Advisor check summaries for the check IDs that you specified. You can get
     * the check IDs by calling the <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <p>
     * The response contains an array of <a>TrustedAdvisorCheckSummary</a> objects.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorCheckSummariesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTrustedAdvisorCheckSummaries operation returned by the
     *         service.
     * @sample AWSSupportAsyncHandler.DescribeTrustedAdvisorCheckSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorCheckSummariesResult> describeTrustedAdvisorCheckSummariesAsync(
            DescribeTrustedAdvisorCheckSummariesRequest describeTrustedAdvisorCheckSummariesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorCheckSummariesRequest, DescribeTrustedAdvisorCheckSummariesResult> asyncHandler);

    /**
     * <p>
     * Returns information about all available AWS Trusted Advisor checks, including the name, ID, category,
     * description, and metadata. You must specify a language code. The AWS Support API currently supports English
     * ("en") and Japanese ("ja"). The response contains a <a>TrustedAdvisorCheckDescription</a> object for each check.
     * You must set the AWS Region to us-east-1.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The names and descriptions for Trusted Advisor checks are subject to change. We recommend that you specify the
     * check ID in your code to uniquely identify a check.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorChecksRequest
     * @return A Java Future containing the result of the DescribeTrustedAdvisorChecks operation returned by the
     *         service.
     * @sample AWSSupportAsync.DescribeTrustedAdvisorChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorChecks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorChecksResult> describeTrustedAdvisorChecksAsync(
            DescribeTrustedAdvisorChecksRequest describeTrustedAdvisorChecksRequest);

    /**
     * <p>
     * Returns information about all available AWS Trusted Advisor checks, including the name, ID, category,
     * description, and metadata. You must specify a language code. The AWS Support API currently supports English
     * ("en") and Japanese ("ja"). The response contains a <a>TrustedAdvisorCheckDescription</a> object for each check.
     * You must set the AWS Region to us-east-1.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The names and descriptions for Trusted Advisor checks are subject to change. We recommend that you specify the
     * check ID in your code to uniquely identify a check.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param describeTrustedAdvisorChecksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTrustedAdvisorChecks operation returned by the
     *         service.
     * @sample AWSSupportAsyncHandler.DescribeTrustedAdvisorChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorChecks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorChecksResult> describeTrustedAdvisorChecksAsync(
            DescribeTrustedAdvisorChecksRequest describeTrustedAdvisorChecksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorChecksRequest, DescribeTrustedAdvisorChecksResult> asyncHandler);

    /**
     * <p>
     * Refreshes the AWS Trusted Advisor check that you specify using the check ID. You can get the check IDs by calling
     * the <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <note>
     * <p>
     * Some checks are refreshed automatically. If you call the <code>RefreshTrustedAdvisorCheck</code> operation to
     * refresh them, you might see the <code>InvalidParameterValue</code> error.
     * </p>
     * </note>
     * <p>
     * The response contains a <a>TrustedAdvisorCheckRefreshStatus</a> object.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param refreshTrustedAdvisorCheckRequest
     * @return A Java Future containing the result of the RefreshTrustedAdvisorCheck operation returned by the service.
     * @sample AWSSupportAsync.RefreshTrustedAdvisorCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/RefreshTrustedAdvisorCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RefreshTrustedAdvisorCheckResult> refreshTrustedAdvisorCheckAsync(
            RefreshTrustedAdvisorCheckRequest refreshTrustedAdvisorCheckRequest);

    /**
     * <p>
     * Refreshes the AWS Trusted Advisor check that you specify using the check ID. You can get the check IDs by calling
     * the <a>DescribeTrustedAdvisorChecks</a> operation.
     * </p>
     * <note>
     * <p>
     * Some checks are refreshed automatically. If you call the <code>RefreshTrustedAdvisorCheck</code> operation to
     * refresh them, you might see the <code>InvalidParameterValue</code> error.
     * </p>
     * </note>
     * <p>
     * The response contains a <a>TrustedAdvisorCheckRefreshStatus</a> object.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param refreshTrustedAdvisorCheckRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RefreshTrustedAdvisorCheck operation returned by the service.
     * @sample AWSSupportAsyncHandler.RefreshTrustedAdvisorCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/RefreshTrustedAdvisorCheck"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RefreshTrustedAdvisorCheckResult> refreshTrustedAdvisorCheckAsync(
            RefreshTrustedAdvisorCheckRequest refreshTrustedAdvisorCheckRequest,
            com.amazonaws.handlers.AsyncHandler<RefreshTrustedAdvisorCheckRequest, RefreshTrustedAdvisorCheckResult> asyncHandler);

    /**
     * <p>
     * Resolves a support case. This operation takes a <code>caseId</code> and returns the initial and final state of
     * the case.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param resolveCaseRequest
     * @return A Java Future containing the result of the ResolveCase operation returned by the service.
     * @sample AWSSupportAsync.ResolveCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/ResolveCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync(ResolveCaseRequest resolveCaseRequest);

    /**
     * <p>
     * Resolves a support case. This operation takes a <code>caseId</code> and returns the initial and final state of
     * the case.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * You must have a Business or Enterprise Support plan to use the AWS Support API.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you call the AWS Support API from an account that does not have a Business or Enterprise Support plan, the
     * <code>SubscriptionRequiredException</code> error message appears. For information about changing your support
     * plan, see <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param resolveCaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResolveCase operation returned by the service.
     * @sample AWSSupportAsyncHandler.ResolveCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/ResolveCase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync(ResolveCaseRequest resolveCaseRequest,
            com.amazonaws.handlers.AsyncHandler<ResolveCaseRequest, ResolveCaseResult> asyncHandler);

    /**
     * Simplified method form for invoking the ResolveCase operation.
     *
     * @see #resolveCaseAsync(ResolveCaseRequest)
     */
    java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync();

    /**
     * Simplified method form for invoking the ResolveCase operation with an AsyncHandler.
     *
     * @see #resolveCaseAsync(ResolveCaseRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync(com.amazonaws.handlers.AsyncHandler<ResolveCaseRequest, ResolveCaseResult> asyncHandler);

}
