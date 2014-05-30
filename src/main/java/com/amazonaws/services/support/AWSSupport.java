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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.support.model.*;

/**
 * Interface for accessing AWSSupport.
 * AWS Support <p>
 * The AWS Support API reference is intended for programmers who need
 * detailed information about the AWS Support actions and data types.
 * This service enables you to manage your AWS Support cases
 * programmatically. It uses HTTP methods that return results in JSON
 * format.
 * </p>
 * <p>
 * The AWS Support service also exposes a set of
 * <a href="https://aws.amazon.com/support/trustedadvisor"> Trusted Advisor </a>
 * features. You can retrieve a list of checks and their descriptions,
 * get check results, specify checks to refresh, and get the refresh
 * status of checks.
 * </p>
 * <p>
 * The following list describes the AWS Support case management actions:
 * </p>
 * 
 * <ul>
 * <li> <b>Service names, issue categories, and available severity
 * levels. </b> The actions DescribeServices and DescribeSeverityLevels
 * enable you to obtain AWS service names, service codes, service
 * categories, and problem severity levels. You use these values when you
 * call the CreateCase action. </li>
 * <li> <b>Case creation, case details, and case resolution.</b> The
 * actions CreateCase, DescribeCases, and ResolveCase enable you to
 * create AWS Support cases, retrieve them, and resolve them.</li>
 * <li> <b>Case communication.</b> The actions DescribeCommunications
 * and AddCommunicationToCase enable you to retrieve and add
 * communication to AWS Support cases. </li>
 * 
 * </ul>
 * <p>
 * The following list describes the actions available from the AWS
 * Support service for Trusted Advisor:
 * </p>
 * 
 * <ul>
 * <li> DescribeTrustedAdvisorChecks returns the list of checks that run
 * against your AWS resources.</li>
 * <li>Using the CheckId for a specific check returned by
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
 * See the AWS Support
 * <a href="http://docs.aws.amazon.com/awssupport/latest/user/Welcome.html"> User Guide </a>
 * for information about how to use this service to create and manage
 * your support cases, and how to call Trusted Advisor for results of
 * checks on your resources.
 * </p>
 */
public interface AWSSupport {

    /**
     * Overrides the default endpoint for this client ("support.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "support.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "support.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "support.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "support.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSSupport#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Returns a list of cases that you specify by passing one or more case
     * IDs. In addition, you can filter the cases by date by setting values
     * for the <code>AfterTime</code> and <code>BeforeTime</code> request
     * parameters.
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
     *           execute the DescribeCases service method on AWSSupport.
     * 
     * @return The response from the DescribeCases service method, as
     *         returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCasesResult describeCases(DescribeCasesRequest describeCasesRequest) 
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
     *           DescribeTrustedAdvisorCheckRefreshStatuses service method on
     *           AWSSupport.
     * 
     * @return The response from the
     *         DescribeTrustedAdvisorCheckRefreshStatuses service method, as returned
     *         by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTrustedAdvisorCheckRefreshStatusesResult describeTrustedAdvisorCheckRefreshStatuses(DescribeTrustedAdvisorCheckRefreshStatusesRequest describeTrustedAdvisorCheckRefreshStatusesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the list of severity levels that you can assign to an AWS
     * Support case. The severity level for a case is also a field in the
     * CaseDetails data type included in any CreateCase request.
     * </p>
     *
     * @param describeSeverityLevelsRequest Container for the necessary
     *           parameters to execute the DescribeSeverityLevels service method on
     *           AWSSupport.
     * 
     * @return The response from the DescribeSeverityLevels service method,
     *         as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSeverityLevelsResult describeSeverityLevels(DescribeSeverityLevelsRequest describeSeverityLevelsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns communications regarding the support case. You can use the
     * <code>AfterTime</code> and <code>BeforeTime</code> parameters to
     * filter by date. The <code>CaseId</code> parameter enables you to
     * identify a specific case by its <code>CaseId</code> value.
     * </p>
     * <p>
     * The <code>MaxResults</code> and <code>NextToken</code> parameters
     * enable you to control the pagination of the result set. Set
     * <code>MaxResults</code> to the number of cases you want displayed on
     * each page, and use <code>NextToken</code> to specify the resumption of
     * pagination.
     * </p>
     *
     * @param describeCommunicationsRequest Container for the necessary
     *           parameters to execute the DescribeCommunications service method on
     *           AWSSupport.
     * 
     * @return The response from the DescribeCommunications service method,
     *         as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCommunicationsResult describeCommunications(DescribeCommunicationsRequest describeCommunicationsRequest) 
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
     * This operation implements a subset of the behavior on the AWS Support
     * <a href="https://aws.amazon.com/support"> Your Support Cases </a>
     * web form.
     * </p>
     *
     * @param addCommunicationToCaseRequest Container for the necessary
     *           parameters to execute the AddCommunicationToCase service method on
     *           AWSSupport.
     * 
     * @return The response from the AddCommunicationToCase service method,
     *         as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AddCommunicationToCaseResult addCommunicationToCase(AddCommunicationToCaseRequest addCommunicationToCaseRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new case in the AWS Support Center. This operation is
     * modeled on the behavior of the AWS Support Center
     * <a href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. Its parameters require you to specify the following
     * information:
     * </p>
     * <ol> <li> <b>ServiceCode.</b> The code for an AWS service. You obtain
     * the <code>ServiceCode</code> by calling DescribeServices. </li>
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
     * <a href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page.</li>
     * <li> <b>CommunicationBody.</b> The <b>Description</b> field on the
     * AWS Support Center
     * <a href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page.</li>
     * <li> <b>Language.</b> The human language in which AWS Support handles
     * the case. English and Japanese are currently supported.</li>
     * <li> <b>CcEmailAddresses.</b> The AWS Support Center <b>CC</b> field
     * on the
     * <a href="https://aws.amazon.com/support/createCase"> Open a new case </a> page. You can list email addresses to be copied on any correspondence about the case. The account that opens the case is already identified by passing the AWS Credentials in the HTTP POST method or in a method or function call from one of the programming languages supported by an <a href="http://aws.amazon.com/tools/"> AWS SDK </a>
     * . </li>
     * <li> <b>IssueType.</b> The type of issue for the case. You can
     * specify either "customer-service" or "technical." If you do not
     * indicate a value, the default is "technical." </li>
     * </ol> <p>
     * <b>NOTE:</b> The AWS Support API does not currently support the
     * ability to add attachments to cases. You can, however, call
     * AddCommunicationToCase to add information to an open case.
     * </p>
     * <p>
     * A successful CreateCase request returns an AWS Support case number.
     * Case numbers are used by the DescribeCases action to retrieve existing
     * AWS Support cases.
     * </p>
     *
     * @param createCaseRequest Container for the necessary parameters to
     *           execute the CreateCase service method on AWSSupport.
     * 
     * @return The response from the CreateCase service method, as returned
     *         by AWSSupport.
     * 
     * @throws InternalServerErrorException
     * @throws CaseCreationLimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateCaseResult createCase(CreateCaseRequest createCaseRequest) 
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
     *           parameters to execute the DescribeTrustedAdvisorChecks service method
     *           on AWSSupport.
     * 
     * @return The response from the DescribeTrustedAdvisorChecks service
     *         method, as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTrustedAdvisorChecksResult describeTrustedAdvisorChecks(DescribeTrustedAdvisorChecksRequest describeTrustedAdvisorChecksRequest) 
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
     *           service method on AWSSupport.
     * 
     * @return The response from the DescribeTrustedAdvisorCheckResult
     *         service method, as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTrustedAdvisorCheckResultResult describeTrustedAdvisorCheckResult(DescribeTrustedAdvisorCheckResultRequest describeTrustedAdvisorCheckResultRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Takes a <code>CaseId</code> and returns the initial state of the case
     * along with the state of the case after the call to ResolveCase
     * completed.
     * </p>
     *
     * @param resolveCaseRequest Container for the necessary parameters to
     *           execute the ResolveCase service method on AWSSupport.
     * 
     * @return The response from the ResolveCase service method, as returned
     *         by AWSSupport.
     * 
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ResolveCaseResult resolveCase(ResolveCaseRequest resolveCaseRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a refresh of the Trusted Advisor check that has the
     * specified check ID. Check IDs can be obtained by calling
     * DescribeTrustedAdvisorChecks.
     * </p>
     * <p>
     * The response contains a RefreshTrustedAdvisorCheckResult object,
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
     *           parameters to execute the RefreshTrustedAdvisorCheck service method on
     *           AWSSupport.
     * 
     * @return The response from the RefreshTrustedAdvisorCheck service
     *         method, as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RefreshTrustedAdvisorCheckResult refreshTrustedAdvisorCheck(RefreshTrustedAdvisorCheckRequest refreshTrustedAdvisorCheckRequest) 
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
     * <a href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. The values in those fields, however, do not necessarily match
     * the service codes and categories returned by the
     * <code>DescribeServices</code> request. Always use the service codes
     * and categories obtained programmatically. This practice ensures that
     * you always have the most recent set of service and category codes.
     * </p>
     *
     * @param describeServicesRequest Container for the necessary parameters
     *           to execute the DescribeServices service method on AWSSupport.
     * 
     * @return The response from the DescribeServices service method, as
     *         returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeServicesResult describeServices(DescribeServicesRequest describeServicesRequest) 
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
     *           DescribeTrustedAdvisorCheckSummaries service method on AWSSupport.
     * 
     * @return The response from the DescribeTrustedAdvisorCheckSummaries
     *         service method, as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTrustedAdvisorCheckSummariesResult describeTrustedAdvisorCheckSummaries(DescribeTrustedAdvisorCheckSummariesRequest describeTrustedAdvisorCheckSummariesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of cases that you specify by passing one or more case
     * IDs. In addition, you can filter the cases by date by setting values
     * for the <code>AfterTime</code> and <code>BeforeTime</code> request
     * parameters.
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
     * @return The response from the DescribeCases service method, as
     *         returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCasesResult describeCases() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns the list of severity levels that you can assign to an AWS
     * Support case. The severity level for a case is also a field in the
     * CaseDetails data type included in any CreateCase request.
     * </p>
     * 
     * @return The response from the DescribeSeverityLevels service method,
     *         as returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSeverityLevelsResult describeSeverityLevels() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Takes a <code>CaseId</code> and returns the initial state of the case
     * along with the state of the case after the call to ResolveCase
     * completed.
     * </p>
     * 
     * @return The response from the ResolveCase service method, as returned
     *         by AWSSupport.
     * 
     * @throws InternalServerErrorException
     * @throws CaseIdNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ResolveCaseResult resolveCase() throws AmazonServiceException, AmazonClientException;
    
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
     * <a href="https://aws.amazon.com/support/createCase"> Open a new case </a>
     * page. The values in those fields, however, do not necessarily match
     * the service codes and categories returned by the
     * <code>DescribeServices</code> request. Always use the service codes
     * and categories obtained programmatically. This practice ensures that
     * you always have the most recent set of service and category codes.
     * </p>
     * 
     * @return The response from the DescribeServices service method, as
     *         returned by AWSSupport.
     * 
     * @throws InternalServerErrorException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSSupport indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeServicesResult describeServices() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        