/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.config.model.*;

/**
 * Interface for accessing AmazonConfig.
 * AWS Config <p>
 * AWS Config provides a way to keep track of the configurations of all
 * the AWS resources associated with your AWS account. You can use AWS
 * Config to get the current and historical configurations of each AWS
 * resource and also to get information about the relationship between
 * the resources. An AWS resource can be an Amazon Compute Cloud (Amazon
 * EC2) instance, an Elastic Block Store (EBS) volume, an Elastic network
 * Interface (ENI), or a security group. For a complete list of resources
 * currently supported by AWS Config, see
 * <a href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"> Supported AWS Resources </a>
 * .
 * </p>
 * <p>
 * You can access and manage AWS Config through the AWS Management
 * Console, the AWS Command Line Interface (AWS CLI), the AWS Config API,
 * or the AWS SDKs for AWS Config
 * </p>
 * <p>
 * This reference guide contains documentation for the AWS Config API and
 * the AWS CLI commands that you can use to manage AWS Config.
 * </p>
 * <p>
 * The AWS Config API uses the Signature Version 4 protocol for signing
 * requests. For more information about how to sign a request with this
 * protocol, see
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing Process </a>
 * .
 * </p>
 * <p>
 * For detailed information about AWS Config features and their
 * associated actions or commands, as well as how to work with AWS
 * Management Console, see
 * <a href="http://docs.aws.amazon.com/config/latest/developerguide/WhatIsConfig.html"> What Is AWS Config? </a>
 * in the <i>AWS Config Developer Guide</i> .
 * </p>
 */
public interface AmazonConfig {

    /**
     * Overrides the default endpoint for this client ("https://config.us-east-1.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "config.us-east-1.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://config.us-east-1.amazonaws.com/"). If the
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
     *            The endpoint (ex: "config.us-east-1.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://config.us-east-1.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonConfig#setEndpoint(String)}, sets the
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
     * Returns the evaluation results for the specified AWS resource. The
     * results indicate which AWS Config rules were used to evaluate the
     * resource, when each rule was last used, and whether the resource
     * complies with each rule.
     * </p>
     *
     * @param getComplianceDetailsByResourceRequest Container for the
     *           necessary parameters to execute the GetComplianceDetailsByResource
     *           service method on AmazonConfig.
     * 
     * @return The response from the GetComplianceDetailsByResource service
     *         method, as returned by AmazonConfig.
     * 
     * @throws InvalidParameterValueException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetComplianceDetailsByResourceResult getComplianceDetailsByResource(GetComplianceDetailsByResourceRequest getComplianceDetailsByResourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Used by an AWS Lambda function to deliver evaluation results to AWS
     * Config. This action is required in every AWS Lambda function that is
     * invoked by an AWS Config rule.
     * </p>
     *
     * @param putEvaluationsRequest Container for the necessary parameters to
     *           execute the PutEvaluations service method on AmazonConfig.
     * 
     * @return The response from the PutEvaluations service method, as
     *         returned by AmazonConfig.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidResultTokenException
     * @throws NoSuchConfigRuleException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutEvaluationsResult putEvaluations(PutEvaluationsRequest putEvaluationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the number of AWS Config rules that are compliant and
     * noncompliant, up to a maximum of 25 for each.
     * </p>
     *
     * @param getComplianceSummaryByConfigRuleRequest Container for the
     *           necessary parameters to execute the GetComplianceSummaryByConfigRule
     *           service method on AmazonConfig.
     * 
     * @return The response from the GetComplianceSummaryByConfigRule service
     *         method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetComplianceSummaryByConfigRuleResult getComplianceSummaryByConfigRule(GetComplianceSummaryByConfigRuleRequest getComplianceSummaryByConfigRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the number of resources that are compliant and the number
     * that are noncompliant. You can specify one or more resource types to
     * get these numbers for each resource type. The maximum number returned
     * is 100.
     * </p>
     *
     * @param getComplianceSummaryByResourceTypeRequest Container for the
     *           necessary parameters to execute the GetComplianceSummaryByResourceType
     *           service method on AmazonConfig.
     * 
     * @return The response from the GetComplianceSummaryByResourceType
     *         service method, as returned by AmazonConfig.
     * 
     * @throws InvalidParameterValueException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetComplianceSummaryByResourceTypeResult getComplianceSummaryByResourceType(GetComplianceSummaryByResourceTypeRequest getComplianceSummaryByResourceTypeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Indicates whether the specified AWS Config rules are compliant. If a
     * rule is noncompliant, this action returns the number of AWS resources
     * that do not comply with the rule.
     * </p>
     * <p>
     * A rule is compliant if all of the evaluated resources comply with it,
     * and it is noncompliant if any of these resources do not comply.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the rule, it
     * returns <code>InsufficientData</code> . This result might indicate one
     * of the following conditions:
     * <ul>
     * <li>AWS Config has never invoked an evaluation for the rule. To check
     * whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the
     * <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code> .</li>
     * <li>The rule's AWS Lambda function is failing to send evaluation
     * results to AWS Config. Verify that the role that you assigned to your
     * configuration recorder includes the <code>config:PutEvaluations</code>
     * permission. If the rule is a customer managed rule, verify that the
     * AWS Lambda execution role includes the
     * <code>config:PutEvaluations</code> permission.</li>
     * <li>The rule's AWS Lambda function has returned
     * <code>NOT_APPLICABLE</code> for all evaluation results. This can occur
     * if the resources were deleted or removed from the rule's scope.</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param describeComplianceByConfigRuleRequest Container for the
     *           necessary parameters to execute the DescribeComplianceByConfigRule
     *           service method on AmazonConfig.
     * 
     * @return The response from the DescribeComplianceByConfigRule service
     *         method, as returned by AmazonConfig.
     * 
     * @throws InvalidParameterValueException
     * @throws NoSuchConfigRuleException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeComplianceByConfigRuleResult describeComplianceByConfigRule(DescribeComplianceByConfigRuleRequest describeComplianceByConfigRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts recording configurations of the AWS resources you have
     * selected to record in your AWS account.
     * </p>
     * <p>
     * You must have created at least one delivery channel to successfully
     * start the configuration recorder.
     * </p>
     *
     * @param startConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the StartConfigurationRecorder service method on
     *           AmazonConfig.
     * 
     * 
     * @throws NoSuchConfigurationRecorderException
     * @throws NoAvailableDeliveryChannelException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void startConfigurationRecorder(StartConfigurationRecorderRequest startConfigurationRecorderRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new delivery channel object to deliver the configuration
     * information to an Amazon S3 bucket, and to an Amazon SNS topic.
     * </p>
     * <p>
     * You can use this action to change the Amazon S3 bucket or an Amazon
     * SNS topic of the existing delivery channel. To change the Amazon S3
     * bucket or an Amazon SNS topic, call this action and specify the
     * changed values for the S3 bucket and the SNS topic. If you specify a
     * different value for either the S3 bucket or the SNS topic, this action
     * will keep the existing value for the parameter that is not changed.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param putDeliveryChannelRequest Container for the necessary
     *           parameters to execute the PutDeliveryChannel service method on
     *           AmazonConfig.
     * 
     * 
     * @throws InvalidDeliveryChannelNameException
     * @throws InvalidS3KeyPrefixException
     * @throws NoAvailableConfigurationRecorderException
     * @throws NoSuchBucketException
     * @throws InvalidSNSTopicARNException
     * @throws InsufficientDeliveryPolicyException
     * @throws MaxNumberOfDeliveryChannelsExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putDeliveryChannel(PutDeliveryChannelRequest putDeliveryChannelRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the evaluation results for the specified AWS Config rule. The
     * results indicate which AWS resources were evaluated by the rule, when
     * each resource was last evaluated, and whether each resource complies
     * with the rule.
     * </p>
     *
     * @param getComplianceDetailsByConfigRuleRequest Container for the
     *           necessary parameters to execute the GetComplianceDetailsByConfigRule
     *           service method on AmazonConfig.
     * 
     * @return The response from the GetComplianceDetailsByConfigRule service
     *         method, as returned by AmazonConfig.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidNextTokenException
     * @throws NoSuchConfigRuleException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetComplianceDetailsByConfigRuleResult getComplianceDetailsByConfigRule(GetComplianceDetailsByConfigRuleRequest getComplianceDetailsByConfigRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns status information for each of your AWS managed Config rules.
     * The status includes information such as the last time AWS Config
     * invoked the rule, the last time AWS Config failed to invoke the rule,
     * and the related error for the last failure.
     * </p>
     *
     * @param describeConfigRuleEvaluationStatusRequest Container for the
     *           necessary parameters to execute the DescribeConfigRuleEvaluationStatus
     *           service method on AmazonConfig.
     * 
     * @return The response from the DescribeConfigRuleEvaluationStatus
     *         service method, as returned by AmazonConfig.
     * 
     * @throws NoSuchConfigRuleException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigRuleEvaluationStatusResult describeConfigRuleEvaluationStatus(DescribeConfigRuleEvaluationStatusRequest describeConfigRuleEvaluationStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns details about the specified delivery channel. If a delivery
     * channel is not specified, this action returns the details of all
     * delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param describeDeliveryChannelsRequest Container for the necessary
     *           parameters to execute the DescribeDeliveryChannels service method on
     *           AmazonConfig.
     * 
     * @return The response from the DescribeDeliveryChannels service method,
     *         as returned by AmazonConfig.
     * 
     * @throws NoSuchDeliveryChannelException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDeliveryChannelsResult describeDeliveryChannels(DescribeDeliveryChannelsRequest describeDeliveryChannelsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current status of the specified delivery channel. If a
     * delivery channel is not specified, this action returns the current
     * status of all delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one delivery channel per
     * account.
     * </p>
     *
     * @param describeDeliveryChannelStatusRequest Container for the
     *           necessary parameters to execute the DescribeDeliveryChannelStatus
     *           service method on AmazonConfig.
     * 
     * @return The response from the DescribeDeliveryChannelStatus service
     *         method, as returned by AmazonConfig.
     * 
     * @throws NoSuchDeliveryChannelException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus(DescribeDeliveryChannelStatusRequest describeDeliveryChannelStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the name of one or more specified configuration recorders. If
     * the recorder name is not specified, this action returns the names of
     * all the configuration recorders associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     *
     * @param describeConfigurationRecordersRequest Container for the
     *           necessary parameters to execute the DescribeConfigurationRecorders
     *           service method on AmazonConfig.
     * 
     * @return The response from the DescribeConfigurationRecorders service
     *         method, as returned by AmazonConfig.
     * 
     * @throws NoSuchConfigurationRecorderException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigurationRecordersResult describeConfigurationRecorders(DescribeConfigurationRecordersRequest describeConfigurationRecordersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or updates an AWS Config rule for evaluating whether your AWS
     * resources comply with your desired configurations.
     * </p>
     * <p>
     * You can use this action for customer managed Config rules and AWS
     * managed Config rules. A customer managed Config rule is a custom rule
     * that you develop and maintain. An AWS managed Config rule is a
     * customizable, predefined rule that is provided by AWS Config.
     * </p>
     * <p>
     * If you are adding a new customer managed Config rule, you must first
     * create the AWS Lambda function that the rule invokes to evaluate your
     * resources. When you use the <code>PutConfigRule</code> action to add
     * the rule to AWS Config, you must specify the Amazon Resource Name
     * (ARN) that AWS Lambda assigns to the function. Specify the ARN for the
     * <code>SourceIdentifier</code> key. This key is part of the
     * <code>Source</code> object, which is part of the
     * <code>ConfigRule</code> object.
     * </p>
     * <p>
     * If you are adding a new AWS managed Config rule, specify the rule's
     * identifier for the <code>SourceIdentifier</code> key. To reference AWS
     * managed Config rule identifiers, see
     * <a href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"> Using AWS Managed Config Rules </a>
     * .
     * </p>
     * <p>
     * For any new rule that you add, specify the
     * <code>ConfigRuleName</code> in the <code>ConfigRule</code> object. Do
     * not specify the <code>ConfigRuleArn</code> or the
     * <code>ConfigRuleId</code> . These values are generated by AWS Config
     * for new rules.
     * </p>
     * <p>
     * If you are updating a rule that you have added previously, specify
     * the rule's <code>ConfigRuleName</code> , <code>ConfigRuleId</code> ,
     * or <code>ConfigRuleArn</code> in the <code>ConfigRule</code> data type
     * that you use in this request.
     * </p>
     * <p>
     * The maximum number of rules that AWS Config supports is 25.
     * </p>
     * <p>
     * For more information about developing and using AWS Config rules, see
     * <a href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html"> Evaluating AWS Resource Configurations with AWS Config </a>
     * in the <i>AWS Config Developer Guide</i> .
     * </p>
     * <p>
     * 
     * </p>
     *
     * @param putConfigRuleRequest Container for the necessary parameters to
     *           execute the PutConfigRule service method on AmazonConfig.
     * 
     * 
     * @throws InvalidParameterValueException
     * @throws MaxNumberOfConfigRulesExceededException
     * @throws ResourceInUseException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putConfigRule(PutConfigRuleRequest putConfigRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified AWS Config rule and all of its evaluation
     * results.
     * </p>
     * <p>
     * AWS Config sets the state of a rule to <code>DELETING</code> until
     * the deletion is complete. You cannot update a rule while it is in this
     * state. If you make a <code>PutConfigRule</code> request for the rule,
     * you will receive a <code>ResourceInUseException</code> .
     * </p>
     * <p>
     * You can check the state of a rule by using the
     * <code>DescribeConfigRules</code> request.
     * </p>
     *
     * @param deleteConfigRuleRequest Container for the necessary parameters
     *           to execute the DeleteConfigRule service method on AmazonConfig.
     * 
     * 
     * @throws NoSuchConfigRuleException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteConfigRule(DeleteConfigRuleRequest deleteConfigRuleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified delivery channel.
     * </p>
     * <p>
     * The delivery channel cannot be deleted if it is the only delivery
     * channel and the configuration recorder is still running. To delete the
     * delivery channel, stop the running configuration recorder using the
     * StopConfigurationRecorder action.
     * </p>
     *
     * @param deleteDeliveryChannelRequest Container for the necessary
     *           parameters to execute the DeleteDeliveryChannel service method on
     *           AmazonConfig.
     * 
     * 
     * @throws NoSuchDeliveryChannelException
     * @throws LastDeliveryChannelDeleteFailedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDeliveryChannel(DeleteDeliveryChannelRequest deleteDeliveryChannelRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns details about your AWS Config rules.
     * </p>
     *
     * @param describeConfigRulesRequest Container for the necessary
     *           parameters to execute the DescribeConfigRules service method on
     *           AmazonConfig.
     * 
     * @return The response from the DescribeConfigRules service method, as
     *         returned by AmazonConfig.
     * 
     * @throws NoSuchConfigRuleException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigRulesResult describeConfigRules(DescribeConfigRulesRequest describeConfigRulesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops recording configurations of the AWS resources you have selected
     * to record in your AWS account.
     * </p>
     *
     * @param stopConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the StopConfigurationRecorder service method on
     *           AmazonConfig.
     * 
     * 
     * @throws NoSuchConfigurationRecorderException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void stopConfigurationRecorder(StopConfigurationRecorderRequest stopConfigurationRecorderRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Schedules delivery of a configuration snapshot to the Amazon S3
     * bucket in the specified delivery channel. After the delivery has
     * started, AWS Config sends following notifications using an Amazon SNS
     * topic that you have specified.
     * </p>
     * 
     * <ul>
     * <li>Notification of starting the delivery.</li>
     * <li>Notification of delivery completed, if the delivery was
     * successfully completed.</li>
     * <li>Notification of delivery failure, if the delivery failed to
     * complete.</li>
     * 
     * </ul>
     *
     * @param deliverConfigSnapshotRequest Container for the necessary
     *           parameters to execute the DeliverConfigSnapshot service method on
     *           AmazonConfig.
     * 
     * @return The response from the DeliverConfigSnapshot service method, as
     *         returned by AmazonConfig.
     * 
     * @throws NoSuchDeliveryChannelException
     * @throws NoAvailableConfigurationRecorderException
     * @throws NoRunningConfigurationRecorderException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeliverConfigSnapshotResult deliverConfigSnapshot(DeliverConfigSnapshotRequest deliverConfigSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new configuration recorder to record the selected resource
     * configurations.
     * </p>
     * <p>
     * You can use this action to change the role <code>roleARN</code>
     * and/or the <code>recordingGroup</code> of an existing recorder. To
     * change the role, call the action on the existing configuration
     * recorder and specify a role.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one configuration
     * recorder per account. If ConfigurationRecorder does not have the
     * recordingGroup parameter specified, the default is to record all
     * supported resource types.
     * </p>
     *
     * @param putConfigurationRecorderRequest Container for the necessary
     *           parameters to execute the PutConfigurationRecorder service method on
     *           AmazonConfig.
     * 
     * 
     * @throws InvalidRoleException
     * @throws InvalidRecordingGroupException
     * @throws InvalidConfigurationRecorderNameException
     * @throws MaxNumberOfConfigurationRecordersExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void putConfigurationRecorder(PutConfigurationRecorderRequest putConfigurationRecorderRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Indicates whether the specified AWS resources are compliant. If a
     * resource is noncompliant, this action returns the number of AWS Config
     * rules that the resource does not comply with.
     * </p>
     * <p>
     * A resource is compliant if it complies with all the AWS Config rules
     * that evaluate it. It is noncompliant if it does not comply with one or
     * more of these rules.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the resource, it
     * returns <code>InsufficientData</code> . This result might indicate one
     * of the following conditions about the rules that evaluate the
     * resource:
     * <ul>
     * <li>AWS Config has never invoked an evaluation for the rule. To check
     * whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the
     * <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code> .</li>
     * <li>The rule's AWS Lambda function is failing to send evaluation
     * results to AWS Config. Verify that the role that you assigned to your
     * configuration recorder includes the <code>config:PutEvaluations</code>
     * permission. If the rule is a customer managed rule, verify that the
     * AWS Lambda execution role includes the
     * <code>config:PutEvaluations</code> permission.</li>
     * <li>The rule's AWS Lambda function has returned
     * <code>NOT_APPLICABLE</code> for all evaluation results. This can occur
     * if the resources were deleted or removed from the rule's scope.</li>
     * 
     * </ul>
     * 
     * </p>
     *
     * @param describeComplianceByResourceRequest Container for the necessary
     *           parameters to execute the DescribeComplianceByResource service method
     *           on AmazonConfig.
     * 
     * @return The response from the DescribeComplianceByResource service
     *         method, as returned by AmazonConfig.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeComplianceByResourceResult describeComplianceByResource(DescribeComplianceByResourceRequest describeComplianceByResourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of configuration items for the specified resource. The
     * list contains details about each state of the resource during the
     * specified time interval.
     * </p>
     * <p>
     * The response is paginated, and by default, AWS Config returns a limit
     * of 10 configuration items per page. You can customize this number with
     * the <code>limit</code> parameter. The response includes a
     * <code>nextToken</code> string, and to get the next page of results,
     * run the request again and enter this string for the
     * <code>nextToken</code> parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> Each call to the API is limited to span a duration of
     * seven days. It is likely that the number of records returned is
     * smaller than the specified limit. In such cases, you can make another
     * call, using the nextToken.
     * </p>
     *
     * @param getResourceConfigHistoryRequest Container for the necessary
     *           parameters to execute the GetResourceConfigHistory service method on
     *           AmazonConfig.
     * 
     * @return The response from the GetResourceConfigHistory service method,
     *         as returned by AmazonConfig.
     * 
     * @throws InvalidNextTokenException
     * @throws NoAvailableConfigurationRecorderException
     * @throws ValidationException
     * @throws ResourceNotDiscoveredException
     * @throws InvalidTimeRangeException
     * @throws InvalidLimitException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetResourceConfigHistoryResult getResourceConfigHistory(GetResourceConfigHistoryRequest getResourceConfigHistoryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Accepts a resource type and returns a list of resource identifiers
     * for the resources of that type. A resource identifier includes the
     * resource type, ID, and (if available) the custom resource name. The
     * results consist of resources that AWS Config has discovered, including
     * those that AWS Config is not currently recording. You can narrow the
     * results to include only resources that have specific resource IDs or a
     * resource name.
     * </p>
     * <p>
     * <b>NOTE:</b>You can specify either resource IDs or a resource name
     * but not both in the same request.
     * </p>
     * <p>
     * The response is paginated, and by default AWS Config lists 100
     * resource identifiers on each page. You can customize this number with
     * the <code>limit</code> parameter. The response includes a
     * <code>nextToken</code> string, and to get the next page of results,
     * run the request again and enter this string for the
     * <code>nextToken</code> parameter.
     * </p>
     *
     * @param listDiscoveredResourcesRequest Container for the necessary
     *           parameters to execute the ListDiscoveredResources service method on
     *           AmazonConfig.
     * 
     * @return The response from the ListDiscoveredResources service method,
     *         as returned by AmazonConfig.
     * 
     * @throws InvalidNextTokenException
     * @throws NoAvailableConfigurationRecorderException
     * @throws ValidationException
     * @throws InvalidLimitException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDiscoveredResourcesResult listDiscoveredResources(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the current status of the specified configuration recorder.
     * If a configuration recorder is not specified, this action returns the
     * status of all configuration recorder associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     *
     * @param describeConfigurationRecorderStatusRequest Container for the
     *           necessary parameters to execute the
     *           DescribeConfigurationRecorderStatus service method on AmazonConfig.
     * 
     * @return The response from the DescribeConfigurationRecorderStatus
     *         service method, as returned by AmazonConfig.
     * 
     * @throws NoSuchConfigurationRecorderException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus(DescribeConfigurationRecorderStatusRequest describeConfigurationRecorderStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the number of AWS Config rules that are compliant and
     * noncompliant, up to a maximum of 25 for each.
     * </p>
     * 
     * @return The response from the GetComplianceSummaryByConfigRule service
     *         method, as returned by AmazonConfig.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetComplianceSummaryByConfigRuleResult getComplianceSummaryByConfigRule() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns the number of resources that are compliant and the number
     * that are noncompliant. You can specify one or more resource types to
     * get these numbers for each resource type. The maximum number returned
     * is 100.
     * </p>
     * 
     * @return The response from the GetComplianceSummaryByResourceType
     *         service method, as returned by AmazonConfig.
     * 
     * @throws InvalidParameterValueException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetComplianceSummaryByResourceTypeResult getComplianceSummaryByResourceType() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Indicates whether the specified AWS Config rules are compliant. If a
     * rule is noncompliant, this action returns the number of AWS resources
     * that do not comply with the rule.
     * </p>
     * <p>
     * A rule is compliant if all of the evaluated resources comply with it,
     * and it is noncompliant if any of these resources do not comply.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the rule, it
     * returns <code>InsufficientData</code> . This result might indicate one
     * of the following conditions:
     * <ul>
     * <li>AWS Config has never invoked an evaluation for the rule. To check
     * whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the
     * <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code> .</li>
     * <li>The rule's AWS Lambda function is failing to send evaluation
     * results to AWS Config. Verify that the role that you assigned to your
     * configuration recorder includes the <code>config:PutEvaluations</code>
     * permission. If the rule is a customer managed rule, verify that the
     * AWS Lambda execution role includes the
     * <code>config:PutEvaluations</code> permission.</li>
     * <li>The rule's AWS Lambda function has returned
     * <code>NOT_APPLICABLE</code> for all evaluation results. This can occur
     * if the resources were deleted or removed from the rule's scope.</li>
     * 
     * </ul>
     * 
     * </p>
     * 
     * @return The response from the DescribeComplianceByConfigRule service
     *         method, as returned by AmazonConfig.
     * 
     * @throws InvalidParameterValueException
     * @throws NoSuchConfigRuleException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeComplianceByConfigRuleResult describeComplianceByConfigRule() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns status information for each of your AWS managed Config rules.
     * The status includes information such as the last time AWS Config
     * invoked the rule, the last time AWS Config failed to invoke the rule,
     * and the related error for the last failure.
     * </p>
     * 
     * @return The response from the DescribeConfigRuleEvaluationStatus
     *         service method, as returned by AmazonConfig.
     * 
     * @throws NoSuchConfigRuleException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigRuleEvaluationStatusResult describeConfigRuleEvaluationStatus() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns details about the specified delivery channel. If a delivery
     * channel is not specified, this action returns the details of all
     * delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one delivery channel per
     * account.
     * </p>
     * 
     * @return The response from the DescribeDeliveryChannels service method,
     *         as returned by AmazonConfig.
     * 
     * @throws NoSuchDeliveryChannelException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDeliveryChannelsResult describeDeliveryChannels() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns the current status of the specified delivery channel. If a
     * delivery channel is not specified, this action returns the current
     * status of all delivery channels associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one delivery channel per
     * account.
     * </p>
     * 
     * @return The response from the DescribeDeliveryChannelStatus service
     *         method, as returned by AmazonConfig.
     * 
     * @throws NoSuchDeliveryChannelException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns the name of one or more specified configuration recorders. If
     * the recorder name is not specified, this action returns the names of
     * all the configuration recorders associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b> Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     * 
     * @return The response from the DescribeConfigurationRecorders service
     *         method, as returned by AmazonConfig.
     * 
     * @throws NoSuchConfigurationRecorderException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigurationRecordersResult describeConfigurationRecorders() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns details about your AWS Config rules.
     * </p>
     * 
     * @return The response from the DescribeConfigRules service method, as
     *         returned by AmazonConfig.
     * 
     * @throws NoSuchConfigRuleException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigRulesResult describeConfigRules() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Indicates whether the specified AWS resources are compliant. If a
     * resource is noncompliant, this action returns the number of AWS Config
     * rules that the resource does not comply with.
     * </p>
     * <p>
     * A resource is compliant if it complies with all the AWS Config rules
     * that evaluate it. It is noncompliant if it does not comply with one or
     * more of these rules.
     * </p>
     * <p>
     * If AWS Config has no current evaluation results for the resource, it
     * returns <code>InsufficientData</code> . This result might indicate one
     * of the following conditions about the rules that evaluate the
     * resource:
     * <ul>
     * <li>AWS Config has never invoked an evaluation for the rule. To check
     * whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the
     * <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code> .</li>
     * <li>The rule's AWS Lambda function is failing to send evaluation
     * results to AWS Config. Verify that the role that you assigned to your
     * configuration recorder includes the <code>config:PutEvaluations</code>
     * permission. If the rule is a customer managed rule, verify that the
     * AWS Lambda execution role includes the
     * <code>config:PutEvaluations</code> permission.</li>
     * <li>The rule's AWS Lambda function has returned
     * <code>NOT_APPLICABLE</code> for all evaluation results. This can occur
     * if the resources were deleted or removed from the rule's scope.</li>
     * 
     * </ul>
     * 
     * </p>
     * 
     * @return The response from the DescribeComplianceByResource service
     *         method, as returned by AmazonConfig.
     * 
     * @throws InvalidParameterValueException
     * @throws InvalidNextTokenException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeComplianceByResourceResult describeComplianceByResource() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Returns the current status of the specified configuration recorder.
     * If a configuration recorder is not specified, this action returns the
     * status of all configuration recorder associated with the account.
     * </p>
     * <p>
     * <b>NOTE:</b>Currently, you can specify only one configuration
     * recorder per account.
     * </p>
     * 
     * @return The response from the DescribeConfigurationRecorderStatus
     *         service method, as returned by AmazonConfig.
     * 
     * @throws NoSuchConfigurationRecorderException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonConfig indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus() throws AmazonServiceException, AmazonClientException;
    
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
        