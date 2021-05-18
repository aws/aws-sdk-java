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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.support.model.*;

/**
 * Interface for accessing AWS Support.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.support.AbstractAWSSupport} instead.
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
public interface AWSSupport {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "support";

    /**
     * Overrides the default endpoint for this client ("https://support.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "support.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://support.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "support.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://support.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSSupport#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

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
     * @return Result of the AddAttachmentsToSet operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @throws AttachmentSetIdNotFoundException
     *         An attachment set with the specified ID could not be found.
     * @throws AttachmentSetExpiredException
     *         The expiration time of the attachment set has passed. The set expires 1 hour after it is created.
     * @throws AttachmentSetSizeLimitExceededException
     *         A limit for the size of an attachment set has been exceeded. The limits are three attachments and 5 MB
     *         per attachment.
     * @throws AttachmentLimitExceededException
     *         The limit for the number of attachment sets created in a short period of time has been exceeded.
     * @sample AWSSupport.AddAttachmentsToSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/AddAttachmentsToSet" target="_top">AWS
     *      API Documentation</a>
     */
    AddAttachmentsToSetResult addAttachmentsToSet(AddAttachmentsToSetRequest addAttachmentsToSetRequest);

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
     * @return Result of the AddCommunicationToCase operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @throws CaseIdNotFoundException
     *         The requested <code>caseId</code> couldn't be located.
     * @throws AttachmentSetIdNotFoundException
     *         An attachment set with the specified ID could not be found.
     * @throws AttachmentSetExpiredException
     *         The expiration time of the attachment set has passed. The set expires 1 hour after it is created.
     * @sample AWSSupport.AddCommunicationToCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/AddCommunicationToCase" target="_top">AWS
     *      API Documentation</a>
     */
    AddCommunicationToCaseResult addCommunicationToCase(AddCommunicationToCaseRequest addCommunicationToCaseRequest);

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
     * @return Result of the CreateCase operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @throws CaseCreationLimitExceededException
     *         The case creation limit for the account has been exceeded.
     * @throws AttachmentSetIdNotFoundException
     *         An attachment set with the specified ID could not be found.
     * @throws AttachmentSetExpiredException
     *         The expiration time of the attachment set has passed. The set expires 1 hour after it is created.
     * @sample AWSSupport.CreateCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/CreateCase" target="_top">AWS API
     *      Documentation</a>
     */
    CreateCaseResult createCase(CreateCaseRequest createCaseRequest);

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
     * @return Result of the DescribeAttachment operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @throws DescribeAttachmentLimitExceededException
     *         The limit for the number of <a>DescribeAttachment</a> requests in a short period of time has been
     *         exceeded.
     * @throws AttachmentIdNotFoundException
     *         An attachment with the specified ID could not be found.
     * @sample AWSSupport.DescribeAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeAttachment" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAttachmentResult describeAttachment(DescribeAttachmentRequest describeAttachmentRequest);

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
     * @return Result of the DescribeCases operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @throws CaseIdNotFoundException
     *         The requested <code>caseId</code> couldn't be located.
     * @sample AWSSupport.DescribeCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeCases" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeCasesResult describeCases(DescribeCasesRequest describeCasesRequest);

    /**
     * Simplified method form for invoking the DescribeCases operation.
     *
     * @see #describeCases(DescribeCasesRequest)
     */
    DescribeCasesResult describeCases();

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
     * @return Result of the DescribeCommunications operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @throws CaseIdNotFoundException
     *         The requested <code>caseId</code> couldn't be located.
     * @sample AWSSupport.DescribeCommunications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeCommunications" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeCommunicationsResult describeCommunications(DescribeCommunicationsRequest describeCommunicationsRequest);

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
     * @return Result of the DescribeServices operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSSupport.DescribeServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeServices" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeServicesResult describeServices(DescribeServicesRequest describeServicesRequest);

    /**
     * Simplified method form for invoking the DescribeServices operation.
     *
     * @see #describeServices(DescribeServicesRequest)
     */
    DescribeServicesResult describeServices();

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
     * @return Result of the DescribeSeverityLevels operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSSupport.DescribeSeverityLevels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeSeverityLevels" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeSeverityLevelsResult describeSeverityLevels(DescribeSeverityLevelsRequest describeSeverityLevelsRequest);

    /**
     * Simplified method form for invoking the DescribeSeverityLevels operation.
     *
     * @see #describeSeverityLevels(DescribeSeverityLevelsRequest)
     */
    DescribeSeverityLevelsResult describeSeverityLevels();

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
     * @return Result of the DescribeTrustedAdvisorCheckRefreshStatuses operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSSupport.DescribeTrustedAdvisorCheckRefreshStatuses
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckRefreshStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTrustedAdvisorCheckRefreshStatusesResult describeTrustedAdvisorCheckRefreshStatuses(
            DescribeTrustedAdvisorCheckRefreshStatusesRequest describeTrustedAdvisorCheckRefreshStatusesRequest);

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
     * @return Result of the DescribeTrustedAdvisorCheckResult operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSSupport.DescribeTrustedAdvisorCheckResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckResult"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTrustedAdvisorCheckResultResult describeTrustedAdvisorCheckResult(DescribeTrustedAdvisorCheckResultRequest describeTrustedAdvisorCheckResultRequest);

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
     * @return Result of the DescribeTrustedAdvisorCheckSummaries operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSSupport.DescribeTrustedAdvisorCheckSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTrustedAdvisorCheckSummariesResult describeTrustedAdvisorCheckSummaries(
            DescribeTrustedAdvisorCheckSummariesRequest describeTrustedAdvisorCheckSummariesRequest);

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
     * @return Result of the DescribeTrustedAdvisorChecks operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSSupport.DescribeTrustedAdvisorChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorChecks"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTrustedAdvisorChecksResult describeTrustedAdvisorChecks(DescribeTrustedAdvisorChecksRequest describeTrustedAdvisorChecksRequest);

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
     * @return Result of the RefreshTrustedAdvisorCheck operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @sample AWSSupport.RefreshTrustedAdvisorCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/RefreshTrustedAdvisorCheck"
     *      target="_top">AWS API Documentation</a>
     */
    RefreshTrustedAdvisorCheckResult refreshTrustedAdvisorCheck(RefreshTrustedAdvisorCheckRequest refreshTrustedAdvisorCheckRequest);

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
     * @return Result of the ResolveCase operation returned by the service.
     * @throws InternalServerErrorException
     *         An internal server error occurred.
     * @throws CaseIdNotFoundException
     *         The requested <code>caseId</code> couldn't be located.
     * @sample AWSSupport.ResolveCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/ResolveCase" target="_top">AWS API
     *      Documentation</a>
     */
    ResolveCaseResult resolveCase(ResolveCaseRequest resolveCaseRequest);

    /**
     * Simplified method form for invoking the ResolveCase operation.
     *
     * @see #resolveCase(ResolveCaseRequest)
     */
    ResolveCaseResult resolveCase();

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
