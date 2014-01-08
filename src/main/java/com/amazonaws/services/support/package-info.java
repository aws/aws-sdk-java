
/**
 * Synchronous and asynchronous client classes for accessing AWSSupport.
 *
 * AWS Support <p>
 * The AWS Support API reference is intended for programmers who need detailed information about the AWS Support actions and data types. This service
 * enables you to manage your AWS Support cases programmatically. It uses HTTP methods that return results in JSON format.
 * </p>
 * <p>
 * The AWS Support service also exposes a set of <a href="https://aws.amazon.com/support/trustedadvisor"> Trusted Advisor </a> features. You can
 * retrieve a list of checks and their descriptions, get check results, specify checks to refresh, and get the refresh status of checks.
 * </p>
 * <p>
 * The following list describes the AWS Support case management actions:
 * </p>
 * 
 * <ul>
 * <li> <b>Service names, issue categories, and available severity levels. </b> The actions DescribeServices and DescribeSeverityLevels enable you to
 * obtain AWS service names, service codes, service categories, and problem severity levels. You use these values when you call the CreateCase action.
 * </li>
 * <li> <b>Case creation, case details, and case resolution.</b> The actions CreateCase, DescribeCases, and ResolveCase enable you to create AWS Support
 * cases, retrieve them, and resolve them.</li>
 * <li> <b>Case communication.</b> The actions DescribeCommunications and AddCommunicationToCase enable you to retrieve and add communication to AWS
 * Support cases. </li>
 * 
 * </ul>
 * <p>
 * The following list describes the actions available from the AWS Support service for Trusted Advisor:
 * </p>
 * 
 * <ul>
 * <li> DescribeTrustedAdvisorChecks returns the list of checks that run against your AWS resources.</li>
 * <li>Using the CheckId for a specific check returned by DescribeTrustedAdvisorChecks, you can call DescribeTrustedAdvisorCheckResult to obtain the
 * results for the check you specified.</li>
 * <li> DescribeTrustedAdvisorCheckSummaries returns summarized results for one or more Trusted Advisor checks.</li>
 * <li> RefreshTrustedAdvisorCheck requests that Trusted Advisor rerun a specified check. </li>
 * <li> DescribeTrustedAdvisorCheckRefreshStatuses reports the refresh status of one or more checks. </li>
 * 
 * </ul>
 * <p>
 * For authentication of requests, AWS Support uses <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4
 * Signing Process </a> .
 * </p>
 * <p>
 * See the AWS Support <a href="http://docs.aws.amazon.com/awssupport/latest/user/Welcome.html"> User Guide </a> for information about how to use this
 * service to create and manage your support cases, and how to call Trusted Advisor for results of checks on your resources.
 * </p>
 */
 package com.amazonaws.services.support;
        