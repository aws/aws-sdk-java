
/**
 * Synchronous and asynchronous client classes for accessing AWSSupport.
 *
 * AWS Support <p>
 * The AWS Support API reference is intended for programmers who need detailed information about the AWS Support actions and data types. This service
 * enables you to manage with your AWS Support cases programmatically. It is built on the AWS Query API programming model and provides HTTP methods that
 * take parameters and return results in JSON format.
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
 * <li> <b>Service names, issue categories, and available severity levels. </b> The actions DescribeServices and DescribeSeverityLevels enable you to
 * obtain AWS service names, service codes, service categories, and problem severity levels. You use these values when you call the CreateCase action.
 * </li>
 * <li> <b>Case Creation, case details, and case resolution</b> . The actions CreateCase, DescribeCases, and ResolveCase enable you to create AWS
 * Support cases, retrieve them, and resolve them.</li>
 * <li> <b>Case communication</b> . The actions DescribeCaseCommunications and AddCommunicationToCase enable you to retrieve and add communication to
 * AWS Support cases. </li>
 * 
 * </ul>
 * <p>
 * The following list describes the actions available from the AWS Support service for Trusted Advisor:
 * </p>
 * 
 * <ul>
 * <li> DescribeTrustedAdviserChecks </li>
 * returns the list of checks that you can run against your AWS resources. <li>Using the CheckId for a specific check returned by
 * DescribeTrustedAdviserChecks, you can call DescribeTrustedAdvisorCheckResult </li>
 * and obtain a new result for the check you specified. <li> Using DescribeTrustedAdvisorCheckSummaries, you can get summaries for a set of Trusted
 * Advisor checks.</li>
 * <li> RefreshTrustedAdvisorCheck enables you to request that Trusted Advisor run the check again. </li>
 * <li> gets statuses on the checks you are running. </li>
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
        