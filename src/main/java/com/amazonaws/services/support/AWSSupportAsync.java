/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The AWS Support API reference is intended for programmers who need detailed information about the AWS Support actions and data types. This service
 * enables you to manage your AWS Support cases programmatically. It uses HTTP methods that return results in JSON format.
 * </p>
 * <p>
 * The AWS Support service also exposes a set of <a href="https://aws.amazon.com/support/trustedadvisor"> Trusted Advisor </a> features. You can
 * retrieve a list of checks you can run on your resources, specify checks to run and refresh, and check the status of checks you have submitted.
 * </p>
 * <p>
 * The following list describes the AWS Support case management actions:
 * </p>
 * 
 * <ul>
 * <li> <b>Service names, issue categories, and available severity levels. </b> The actions <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"> DescribeServices </a> and <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"> DescribeSeverityLevels </a> enable you to obtain
 * AWS service names, service codes, service categories, and problem severity levels. You use these values when you call the <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"> CreateCase </a> action. </li>
 * <li> <b>Case Creation, case details, and case resolution</b> . The actions <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"> CreateCase </a> , <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html"> DescribeCases </a> , and <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html"> ResolveCase </a> enable you to create AWS Support cases,
 * retrieve them, and resolve them.</li>
 * <li> <b>Case communication</b> . The actions <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCommunications.html">
 * DescribeCommunications </a> and <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_AddCommunicationToCase.html">
 * AddCommunicationToCase </a> enable you to retrieve and add communication to AWS Support cases. </li>
 * 
 * </ul>
 * <p>
 * The following list describes the actions available from the AWS Support service for Trusted Advisor:
 * </p>
 * 
 * <ul>
 * <li> <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"> DescribeTrustedAdvisorChecks </a>
 * returns the list of checks that you can run against your AWS resources.</li>
 * <li>Using the CheckId for a specific check returned by DescribeTrustedAdvisorChecks, you can call <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorCheckResult.html"> DescribeTrustedAdvisorCheckResult </a>
 * </li>
 * and obtain a new result for the check you specified. <li> Using <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorCheckSummaries.html"> DescribeTrustedAdvisorCheckSummaries
 * </a> , you can get summaries for a set of Trusted Advisor checks.</li>
 * <li> <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_RefreshTrustedAdvisorCheck.html"> RefreshTrustedAdvisorCheck </a>
 * enables you to request that Trusted Advisor run the check again. </li>
 * <li> <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorCheckRefreshStatuses.html">
 * DescribeTrustedAdvisorCheckRefreshStatuses </a> gets statuses on the checks you are running. </li>
 * 
 * </ul>
 * <p>
 * For authentication of requests, the AWS Support uses <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature
 * Version 4 Signing Process </a> .
 * </p>
 * <p>
 * See the AWS Support <a href="http://docs.aws.amazon.com/awssupport/latest/developerguide/Welcome.html"> Developer Guide </a> for information about
 * how to use this service to manage create and manage your support cases, and how to call Trusted Advisor for results of checks on your resources.
 * </p>
 */
public interface AWSSupportAsync extends AWSSupport {
    /**
     * <p>
     * This action returns a list of cases that you specify by passing one or
     * more CaseIds. In addition, you can filter the cases by date by setting
     * values for the AfterTime and BeforeTime request parameters.
     * </p>
     * <p>
     * The response returns the following in JSON format:
     * </p>
     * <ol> <li>One or more <a
     * s.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html">
     * CaseDetails </a> data types. </li>
     * <li>One or more <i>NextToken</i> objects, strings that specifies
     * where to paginate the returned records represented by
     * <i>CaseDetails</i> .</li>
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
     * This action returns a list of cases that you specify by passing one or
     * more CaseIds. In addition, you can filter the cases by date by setting
     * values for the AfterTime and BeforeTime request parameters.
     * </p>
     * <p>
     * The response returns the following in JSON format:
     * </p>
     * <ol> <li>One or more <a
     * s.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html">
     * CaseDetails </a> data types. </li>
     * <li>One or more <i>NextToken</i> objects, strings that specifies
     * where to paginate the returned records represented by
     * <i>CaseDetails</i> .</li>
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
     * Returns the status of all refresh requests Trusted Advisor checks
     * called using <a
     * m/awssupport/latest/APIReference/API_RefreshTrustedAdvisorCheck.html">
     * RefreshTrustedAdvisorCheck </a> .
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
     * Returns the status of all refresh requests Trusted Advisor checks
     * called using <a
     * m/awssupport/latest/APIReference/API_RefreshTrustedAdvisorCheck.html">
     * RefreshTrustedAdvisorCheck </a> .
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
     * This action returns the list of severity levels that you can assign to
     * an AWS Support case. The severity level for a case is also a field in
     * the <a
     * s.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html">
     * CaseDetails </a> data type included in any <a
     * cs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html">
     * CreateCase </a> request.
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
     * This action returns the list of severity levels that you can assign to
     * an AWS Support case. The severity level for a case is also a field in
     * the <a
     * s.aws.amazon.com/awssupport/latest/APIReference/API_CaseDetails.html">
     * CaseDetails </a> data type included in any <a
     * cs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html">
     * CreateCase </a> request.
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
     * This action returns communications regarding the support case. You can
     * use the <i>AfterTime</i> and <i>BeforeTime</i> parameters to filter by
     * date. The <i>CaseId</i> parameter enables you to identify a specific
     * case by its <i>CaseId</i> number.
     * </p>
     * <p>
     * The <i>MaxResults</i> and <i>NextToken</i> parameters enable you to
     * control the pagination of the result set. Set <i>MaxResults</i> to the
     * number of cases you want displayed on each page, and use
     * <i>NextToken</i> to specify the resumption of pagination.
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
     * This action returns communications regarding the support case. You can
     * use the <i>AfterTime</i> and <i>BeforeTime</i> parameters to filter by
     * date. The <i>CaseId</i> parameter enables you to identify a specific
     * case by its <i>CaseId</i> number.
     * </p>
     * <p>
     * The <i>MaxResults</i> and <i>NextToken</i> parameters enable you to
     * control the pagination of the result set. Set <i>MaxResults</i> to the
     * number of cases you want displayed on each page, and use
     * <i>NextToken</i> to specify the resumption of pagination.
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
     * This action adds additional customer communication to an AWS Support
     * case. You use the <i>CaseId</i> value to identify the case to which
     * you want to add communication. You can list a set of email addresses
     * to copy on the communication using the <i>CcEmailAddresses</i> value.
     * The <i>CommunicationBody</i> value contains the text of the
     * communication.
     * </p>
     * <p>
     * This action's response indicates the success or failure of the
     * request.
     * </p>
     * <p>
     * This action implements a subset of the behavior on the AWS Support <a
     * href="https://aws.amazon.com/support"> Your Support Cases </a> web
     * form.
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
     * This action adds additional customer communication to an AWS Support
     * case. You use the <i>CaseId</i> value to identify the case to which
     * you want to add communication. You can list a set of email addresses
     * to copy on the communication using the <i>CcEmailAddresses</i> value.
     * The <i>CommunicationBody</i> value contains the text of the
     * communication.
     * </p>
     * <p>
     * This action's response indicates the success or failure of the
     * request.
     * </p>
     * <p>
     * This action implements a subset of the behavior on the AWS Support <a
     * href="https://aws.amazon.com/support"> Your Support Cases </a> web
     * form.
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
     * Creates a new case in the AWS Support Center. This action is modeled
     * on the behavior of the AWS Support Center <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. Its parameters require you to specify the following
     * information:
     * </p>
     * <ol> <li> <b>ServiceCode.</b> Represents a code for an AWS service.
     * You obtain the <i>ServiceCode</i> by calling <a
     * .amazon.com/awssupport/latest/APIReference/API_DescribeServices.html">
     * DescribeServices </a> . </li>
     * <li> <b>CategoryCode</b> . Represents a category for the service
     * defined for the ServiceCode value. You also obtain the cateogory code
     * for a service by calling <a
     * .amazon.com/awssupport/latest/APIReference/API_DescribeServices.html">
     * DescribeServices </a> . Each AWS service defines its own set of
     * category codes. </li>
     * <li> <b>SeverityCode</b> . Represents a value that specifies the
     * urgency of the case, and the time interval in which your service level
     * agreement specifies a response from AWS Support. You obtain the
     * SeverityCode by calling <a
     * n.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html">
     * DescribeSeverityLevels </a> .</li>
     * <li> <b>Subject</b> . Represents the <b>Subject</b> field on the AWS
     * Support Center <a href="https://aws.amazon.com/support/createCase">
     * Open a new case </a> page.</li>
     * <li> <b>CommunicationBody</b> . Represents the <b>Description</b>
     * field on the AWS Support Center <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page.</li>
     * <li> <b>Language</b> . Specifies the human language in which AWS
     * Support handles the case. The API currently supports English and
     * Japanese.</li>
     * <li> <b>CcEmailAddresses</b> . Represents the AWS Support Center
     * <b>CC</b> field on the <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. You can list email addresses to be copied on any correspondence
     * about the case. The account that opens the case is already identified
     * by passing the AWS Credentials in the HTTP POST method or in a method
     * or function call from one of the programming languages supported by an
     * <a href="http://aws.amazon.com/tools/"> AWS SDK </a> . </li>
     * <li> <b>IssueType</b> . Indicates the type of issue for the case. You
     * can specify either "customer-service" or "technical." If you do not
     * indicate a value, this parameter defaults to "technical." </li>
     * </ol> <p>
     * <b>NOTE:</b>The AWS Support API does not currently support the ability
     * to add attachments to cases. You can, however, call
     * AddCommunicationToCase to add information to an open case.
     * </p>
     * <p>
     * A successful <a
     * cs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html">
     * CreateCase </a> request returns an AWS Support case number. Case
     * numbers are used by <a
     * aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html">
     * DescribeCases </a> request to retrieve existing AWS Support support
     * cases.
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
     * Creates a new case in the AWS Support Center. This action is modeled
     * on the behavior of the AWS Support Center <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. Its parameters require you to specify the following
     * information:
     * </p>
     * <ol> <li> <b>ServiceCode.</b> Represents a code for an AWS service.
     * You obtain the <i>ServiceCode</i> by calling <a
     * .amazon.com/awssupport/latest/APIReference/API_DescribeServices.html">
     * DescribeServices </a> . </li>
     * <li> <b>CategoryCode</b> . Represents a category for the service
     * defined for the ServiceCode value. You also obtain the cateogory code
     * for a service by calling <a
     * .amazon.com/awssupport/latest/APIReference/API_DescribeServices.html">
     * DescribeServices </a> . Each AWS service defines its own set of
     * category codes. </li>
     * <li> <b>SeverityCode</b> . Represents a value that specifies the
     * urgency of the case, and the time interval in which your service level
     * agreement specifies a response from AWS Support. You obtain the
     * SeverityCode by calling <a
     * n.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html">
     * DescribeSeverityLevels </a> .</li>
     * <li> <b>Subject</b> . Represents the <b>Subject</b> field on the AWS
     * Support Center <a href="https://aws.amazon.com/support/createCase">
     * Open a new case </a> page.</li>
     * <li> <b>CommunicationBody</b> . Represents the <b>Description</b>
     * field on the AWS Support Center <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page.</li>
     * <li> <b>Language</b> . Specifies the human language in which AWS
     * Support handles the case. The API currently supports English and
     * Japanese.</li>
     * <li> <b>CcEmailAddresses</b> . Represents the AWS Support Center
     * <b>CC</b> field on the <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. You can list email addresses to be copied on any correspondence
     * about the case. The account that opens the case is already identified
     * by passing the AWS Credentials in the HTTP POST method or in a method
     * or function call from one of the programming languages supported by an
     * <a href="http://aws.amazon.com/tools/"> AWS SDK </a> . </li>
     * <li> <b>IssueType</b> . Indicates the type of issue for the case. You
     * can specify either "customer-service" or "technical." If you do not
     * indicate a value, this parameter defaults to "technical." </li>
     * </ol> <p>
     * <b>NOTE:</b>The AWS Support API does not currently support the ability
     * to add attachments to cases. You can, however, call
     * AddCommunicationToCase to add information to an open case.
     * </p>
     * <p>
     * A successful <a
     * cs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html">
     * CreateCase </a> request returns an AWS Support case number. Case
     * numbers are used by <a
     * aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html">
     * DescribeCases </a> request to retrieve existing AWS Support support
     * cases.
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
     * This action enables you to get a list of the available Trusted Advisor
     * checks. You must specify a language code. English ("en") and Japanese
     * ("jp") are currently supported. The response contains a list of <a
     * ssupport/latest/APIReference/API_TrustedAdvisorCheckDescription.html">
     * TrustedAdvisorCheckDescription </a> objects.
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
     * This action enables you to get a list of the available Trusted Advisor
     * checks. You must specify a language code. English ("en") and Japanese
     * ("jp") are currently supported. The response contains a list of <a
     * ssupport/latest/APIReference/API_TrustedAdvisorCheckDescription.html">
     * TrustedAdvisorCheckDescription </a> objects.
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
     * This action responds with the results of a Trusted Advisor check. Once
     * you have obtained the list of available Trusted Advisor checks by
     * calling <a
     * awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html">
     * DescribeTrustedAdvisorChecks </a> , you specify the <i>CheckId</i> for
     * the check you want to retrieve from AWS Support.
     * </p>
     * <p>
     * The response for this action contains a JSON-formatted <a
     * latest/APIReference/API_DescribeTrustedAdvisorCheckResultResult.html">
     * TrustedAdvisorCheckResult </a> object
     * </p>
     * <p>
     * , which is a container for the following three objects:
     * </p>
     * <p>
     * </p>
     * <ol> <li> <a
     * t/latest/APIReference/API_TrustedAdvisorCategorySpecificSummary.html">
     * TrustedAdvisorCategorySpecificSummary </a> </li>
     * <li> <a
     * awssupport/latest/APIReference/API_TrustedAdvisorResourceDetail.html">
     * TrustedAdvisorResourceDetail </a> </li>
     * <li> <a
     * ssupport/latest/APIReference/API_TrustedAdvisorResourcesSummary.html">
     * TrustedAdvisorResourcesSummary </a> </li>
     * </ol> <p>
     * In addition, the response contains the following fields:
     * </p>
     * <ol> <li> <b>Status</b> . Overall status of the check.</li>
     * <li> <b>Timestamp</b> . Time at which Trusted Advisor last ran the
     * check. </li>
     * <li> <b>CheckId</b> . Unique identifier for the specific check
     * returned by the request.</li>
     * </ol>
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
     * This action responds with the results of a Trusted Advisor check. Once
     * you have obtained the list of available Trusted Advisor checks by
     * calling <a
     * awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html">
     * DescribeTrustedAdvisorChecks </a> , you specify the <i>CheckId</i> for
     * the check you want to retrieve from AWS Support.
     * </p>
     * <p>
     * The response for this action contains a JSON-formatted <a
     * latest/APIReference/API_DescribeTrustedAdvisorCheckResultResult.html">
     * TrustedAdvisorCheckResult </a> object
     * </p>
     * <p>
     * , which is a container for the following three objects:
     * </p>
     * <p>
     * </p>
     * <ol> <li> <a
     * t/latest/APIReference/API_TrustedAdvisorCategorySpecificSummary.html">
     * TrustedAdvisorCategorySpecificSummary </a> </li>
     * <li> <a
     * awssupport/latest/APIReference/API_TrustedAdvisorResourceDetail.html">
     * TrustedAdvisorResourceDetail </a> </li>
     * <li> <a
     * ssupport/latest/APIReference/API_TrustedAdvisorResourcesSummary.html">
     * TrustedAdvisorResourcesSummary </a> </li>
     * </ol> <p>
     * In addition, the response contains the following fields:
     * </p>
     * <ol> <li> <b>Status</b> . Overall status of the check.</li>
     * <li> <b>Timestamp</b> . Time at which Trusted Advisor last ran the
     * check. </li>
     * <li> <b>CheckId</b> . Unique identifier for the specific check
     * returned by the request.</li>
     * </ol>
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
     * Takes a <i>CaseId</i> and returns the initial state of the case along
     * with the state of the case after the call to <a
     * s.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html">
     * ResolveCase </a> completed.
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
     * Takes a <i>CaseId</i> and returns the initial state of the case along
     * with the state of the case after the call to <a
     * s.aws.amazon.com/awssupport/latest/APIReference/API_ResolveCase.html">
     * ResolveCase </a> completed.
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
     * This action enables you to query the service to request a refresh for
     * a specific Trusted Advisor check. Your request body contains a
     * <i>CheckId</i> for which you are querying. The response body contains
     * a <a
     * upport/latest/APIReference/API_RefreshTrustedAdvisorCheckResult.html">
     * RefreshTrustedAdvisorCheckResult </a> object containing <i>Status</i>
     * and <i>TimeUntilNextRefresh</i> fields.
     * </p>
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
     * This action enables you to query the service to request a refresh for
     * a specific Trusted Advisor check. Your request body contains a
     * <i>CheckId</i> for which you are querying. The response body contains
     * a <a
     * upport/latest/APIReference/API_RefreshTrustedAdvisorCheckResult.html">
     * RefreshTrustedAdvisorCheckResult </a> object containing <i>Status</i>
     * and <i>TimeUntilNextRefresh</i> fields.
     * </p>
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
     * Returns the current list of AWS services and a list of service
     * categories that applies to each one. You then use service names and
     * categories in your <a
     * cs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html">
     * CreateCase </a> requests. Each AWS service has its own set of
     * categories.
     * </p>
     * <p>
     * The service codes and category codes correspond to the values that are
     * displayed in the <b>Service</b> and <b>Category</b> drop-down lists on
     * the AWS Support Center <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
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
     * categories in your <a
     * cs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html">
     * CreateCase </a> requests. Each AWS service has its own set of
     * categories.
     * </p>
     * <p>
     * The service codes and category codes correspond to the values that are
     * displayed in the <b>Service</b> and <b>Category</b> drop-down lists on
     * the AWS Support Center <a
     * href="https://aws.amazon.com/support/createCase"> Open a new case </a>
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
     * This action enables you to get the latest summaries for Trusted
     * Advisor checks that you specify in your request. You submit the list
     * of Trusted Advisor checks for which you want summaries. You obtain
     * these <i>CheckIds</i> by submitting a <a
     * awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html">
     * DescribeTrustedAdvisorChecks </a> request.
     * </p>
     * <p>
     * The response body contains an array of <a
     * m/awssupport/latest/APIReference/API_TrustedAdvisorCheckSummary.html">
     * TrustedAdvisorCheckSummary </a> objects.
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
     * This action enables you to get the latest summaries for Trusted
     * Advisor checks that you specify in your request. You submit the list
     * of Trusted Advisor checks for which you want summaries. You obtain
     * these <i>CheckIds</i> by submitting a <a
     * awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html">
     * DescribeTrustedAdvisorChecks </a> request.
     * </p>
     * <p>
     * The response body contains an array of <a
     * m/awssupport/latest/APIReference/API_TrustedAdvisorCheckSummary.html">
     * TrustedAdvisorCheckSummary </a> objects.
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
        