
/**
 * Synchronous and asynchronous client classes for accessing AWSSupport.
 *
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
 package com.amazonaws.services.support;
        