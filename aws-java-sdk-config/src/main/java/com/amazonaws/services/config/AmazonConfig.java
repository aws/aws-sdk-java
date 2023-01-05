/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.config.model.*;

/**
 * Interface for accessing Config Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.config.AbstractAmazonConfig} instead.
 * </p>
 * <p>
 * <fullname>Config</fullname>
 * <p>
 * Config provides a way to keep track of the configurations of all the Amazon Web Services resources associated with
 * your Amazon Web Services account. You can use Config to get the current and historical configurations of each Amazon
 * Web Services resource and also to get information about the relationship between the resources. An Amazon Web
 * Services resource can be an Amazon Compute Cloud (Amazon EC2) instance, an Elastic Block Store (EBS) volume, an
 * elastic network Interface (ENI), or a security group. For a complete list of resources currently supported by Config,
 * see <a
 * href="https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
 * >Supported Amazon Web Services resources</a>.
 * </p>
 * <p>
 * You can access and manage Config through the Amazon Web Services Management Console, the Amazon Web Services Command
 * Line Interface (Amazon Web Services CLI), the Config API, or the Amazon Web Services SDKs for Config. This reference
 * guide contains documentation for the Config API and the Amazon Web Services CLI commands that you can use to manage
 * Config. The Config API uses the Signature Version 4 protocol for signing requests. For more information about how to
 * sign a request with this protocol, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
 * Process</a>. For detailed information about Config features and their associated actions or commands, as well as how
 * to work with Amazon Web Services Management Console, see <a
 * href="https://docs.aws.amazon.com/config/latest/developerguide/WhatIsConfig.html">What Is Config</a> in the <i>Config
 * Developer Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonConfig {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "config";

    /**
     * Overrides the default endpoint for this client ("config.us-east-1.amazonaws.com/"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "config.us-east-1.amazonaws.com/") or a full URL, including the
     * protocol (ex: "config.us-east-1.amazonaws.com/"). If the protocol is not specified here, the default protocol
     * from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "config.us-east-1.amazonaws.com/") or a full URL, including the protocol (ex:
     *        "config.us-east-1.amazonaws.com/") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonConfig#setEndpoint(String)}, sets the regional endpoint for this client's service
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
     * Returns the current configuration items for resources that are present in your Config aggregator. The operation
     * also returns a list of resources that are not processed in the current request. If there are no unprocessed
     * resources, the operation returns an empty <code>unprocessedResourceIdentifiers</code> list.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The API does not return results for deleted resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * The API does not return tags and relationships.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param batchGetAggregateResourceConfigRequest
     * @return Result of the BatchGetAggregateResourceConfig operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.BatchGetAggregateResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/BatchGetAggregateResourceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetAggregateResourceConfigResult batchGetAggregateResourceConfig(BatchGetAggregateResourceConfigRequest batchGetAggregateResourceConfigRequest);

    /**
     * <p>
     * Returns the <code>BaseConfigurationItem</code> for one or more requested resources. The operation also returns a
     * list of resources that are not processed in the current request. If there are no unprocessed resources, the
     * operation returns an empty unprocessedResourceKeys list.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * The API does not return results for deleted resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * The API does not return any tags for the requested resources. This information is filtered out of the
     * supplementaryConfiguration section of the API response.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param batchGetResourceConfigRequest
     * @return Result of the BatchGetResourceConfig operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the role needed to describe your resources.
     *         Create a configuration recorder.
     * @sample AmazonConfig.BatchGetResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/BatchGetResourceConfig" target="_top">AWS
     *      API Documentation</a>
     */
    BatchGetResourceConfigResult batchGetResourceConfig(BatchGetResourceConfigRequest batchGetResourceConfigRequest);

    /**
     * <p>
     * Deletes the authorization granted to the specified configuration aggregator account in a specified region.
     * </p>
     * 
     * @param deleteAggregationAuthorizationRequest
     * @return Result of the DeleteAggregationAuthorization operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.DeleteAggregationAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteAggregationAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAggregationAuthorizationResult deleteAggregationAuthorization(DeleteAggregationAuthorizationRequest deleteAggregationAuthorizationRequest);

    /**
     * <p>
     * Deletes the specified Config rule and all of its evaluation results.
     * </p>
     * <p>
     * Config sets the state of a rule to <code>DELETING</code> until the deletion is complete. You cannot update a rule
     * while it is in this state. If you make a <code>PutConfigRule</code> or <code>DeleteConfigRule</code> request for
     * the rule, you will receive a <code>ResourceInUseException</code>.
     * </p>
     * <p>
     * You can check the state of a rule by using the <code>DescribeConfigRules</code> request.
     * </p>
     * 
     * @param deleteConfigRuleRequest
     * @return Result of the DeleteConfigRule operation returned by the service.
     * @throws NoSuchConfigRuleException
     *         The Config rule in the request is invalid. Verify that the rule is an Config Custom Policy rule, that the
     *         rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying again.
     * @throws ResourceInUseException
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization Config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization Config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @sample AmazonConfig.DeleteConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConfigRule" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteConfigRuleResult deleteConfigRule(DeleteConfigRuleRequest deleteConfigRuleRequest);

    /**
     * <p>
     * Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.
     * </p>
     * 
     * @param deleteConfigurationAggregatorRequest
     * @return Result of the DeleteConfigurationAggregator operation returned by the service.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.DeleteConfigurationAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConfigurationAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfigurationAggregatorResult deleteConfigurationAggregator(DeleteConfigurationAggregatorRequest deleteConfigurationAggregatorRequest);

    /**
     * <p>
     * Deletes the configuration recorder.
     * </p>
     * <p>
     * After the configuration recorder is deleted, Config will not record resource configuration changes until you
     * create a new configuration recorder.
     * </p>
     * <p>
     * This action does not delete the configuration information that was previously recorded. You will be able to
     * access the previously recorded information by using the <code>GetResourceConfigHistory</code> action, but you
     * will not be able to access this information in the Config console until you create a new configuration recorder.
     * </p>
     * 
     * @param deleteConfigurationRecorderRequest
     *        The request object for the <code>DeleteConfigurationRecorder</code> action.
     * @return Result of the DeleteConfigurationRecorder operation returned by the service.
     * @throws NoSuchConfigurationRecorderException
     *         You have specified a configuration recorder that does not exist.
     * @sample AmazonConfig.DeleteConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConfigurationRecorderResult deleteConfigurationRecorder(DeleteConfigurationRecorderRequest deleteConfigurationRecorderRequest);

    /**
     * <p>
     * Deletes the specified conformance pack and all the Config rules, remediation actions, and all evaluation results
     * within that conformance pack.
     * </p>
     * <p>
     * Config sets the conformance pack to <code>DELETE_IN_PROGRESS</code> until the deletion is complete. You cannot
     * update a conformance pack while it is in this state.
     * </p>
     * 
     * @param deleteConformancePackRequest
     * @return Result of the DeleteConformancePack operation returned by the service.
     * @throws NoSuchConformancePackException
     *         You specified one or more conformance packs that do not exist.
     * @throws ResourceInUseException
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization Config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization Config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @sample AmazonConfig.DeleteConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteConformancePack" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteConformancePackResult deleteConformancePack(DeleteConformancePackRequest deleteConformancePackRequest);

    /**
     * <p>
     * Deletes the delivery channel.
     * </p>
     * <p>
     * Before you can delete the delivery channel, you must stop the configuration recorder by using the
     * <a>StopConfigurationRecorder</a> action.
     * </p>
     * 
     * @param deleteDeliveryChannelRequest
     *        The input for the <a>DeleteDeliveryChannel</a> action. The action accepts the following data, in JSON
     *        format.
     * @return Result of the DeleteDeliveryChannel operation returned by the service.
     * @throws NoSuchDeliveryChannelException
     *         You have specified a delivery channel that does not exist.
     * @throws LastDeliveryChannelDeleteFailedException
     *         You cannot delete the delivery channel you specified because the configuration recorder is running.
     * @sample AmazonConfig.DeleteDeliveryChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteDeliveryChannel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDeliveryChannelResult deleteDeliveryChannel(DeleteDeliveryChannelRequest deleteDeliveryChannelRequest);

    /**
     * <p>
     * Deletes the evaluation results for the specified Config rule. You can specify one Config rule per request. After
     * you delete the evaluation results, you can call the <a>StartConfigRulesEvaluation</a> API to start evaluating
     * your Amazon Web Services resources against the rule.
     * </p>
     * 
     * @param deleteEvaluationResultsRequest
     * @return Result of the DeleteEvaluationResults operation returned by the service.
     * @throws NoSuchConfigRuleException
     *         The Config rule in the request is invalid. Verify that the rule is an Config Custom Policy rule, that the
     *         rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying again.
     * @throws ResourceInUseException
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization Config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization Config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @sample AmazonConfig.DeleteEvaluationResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteEvaluationResults" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteEvaluationResultsResult deleteEvaluationResults(DeleteEvaluationResultsRequest deleteEvaluationResultsRequest);

    /**
     * <p>
     * Deletes the specified organization Config rule and all of its evaluation results from all member accounts in that
     * organization.
     * </p>
     * <p>
     * Only a management account and a delegated administrator account can delete an organization Config rule. When
     * calling this API with a delegated administrator, you must ensure Organizations
     * <code>ListDelegatedAdministrator</code> permissions are added.
     * </p>
     * <p>
     * Config sets the state of a rule to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a rule
     * while it is in this state.
     * </p>
     * 
     * @param deleteOrganizationConfigRuleRequest
     * @return Result of the DeleteOrganizationConfigRule operation returned by the service.
     * @throws NoSuchOrganizationConfigRuleException
     *         The Config rule in the request is invalid. Verify that the rule is an organization Config Custom Policy
     *         rule, that the rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying
     *         again.
     * @throws ResourceInUseException
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization Config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization Config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @throws OrganizationAccessDeniedException
     *         For <code>PutConfigurationAggregator</code> API, you can see this exception for the following
     *         reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         No permission to call <code>EnableAWSServiceAccess</code> API
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator cannot be updated because your Amazon Web Services Organization management
     *         account or the delegated administrator role changed. Delete this aggregator and create a new one with the
     *         current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator is associated with a previous Amazon Web Services Organization and Config
     *         cannot aggregate data with current Amazon Web Services Organization. Delete this aggregator and create a
     *         new one with the current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You are not a registered delegated administrator for Config with permissions to call
     *         <code>ListDelegatedAdministrators</code> API. Ensure that the management account registers delagated
     *         administrator for Config service principle name before the delegated administrator creates an aggregator.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all <code>OrganizationConfigRule</code> and <code>OrganizationConformancePack</code> APIs, Config
     *         throws an exception if APIs are called from member accounts. All APIs must be called from organization
     *         management account.
     * @sample AmazonConfig.DeleteOrganizationConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteOrganizationConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteOrganizationConfigRuleResult deleteOrganizationConfigRule(DeleteOrganizationConfigRuleRequest deleteOrganizationConfigRuleRequest);

    /**
     * <p>
     * Deletes the specified organization conformance pack and all of the Config rules and remediation actions from all
     * member accounts in that organization.
     * </p>
     * <p>
     * Only a management account or a delegated administrator account can delete an organization conformance pack. When
     * calling this API with a delegated administrator, you must ensure Organizations
     * <code>ListDelegatedAdministrator</code> permissions are added.
     * </p>
     * <p>
     * Config sets the state of a conformance pack to DELETE_IN_PROGRESS until the deletion is complete. You cannot
     * update a conformance pack while it is in this state.
     * </p>
     * 
     * @param deleteOrganizationConformancePackRequest
     * @return Result of the DeleteOrganizationConformancePack operation returned by the service.
     * @throws NoSuchOrganizationConformancePackException
     *         Config organization conformance pack that you passed in the filter does not exist.</p>
     *         <p>
     *         For DeleteOrganizationConformancePack, you tried to delete an organization conformance pack that does not
     *         exist.
     * @throws ResourceInUseException
     *         You see this exception in the following cases:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization Config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization Config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @throws OrganizationAccessDeniedException
     *         For <code>PutConfigurationAggregator</code> API, you can see this exception for the following
     *         reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         No permission to call <code>EnableAWSServiceAccess</code> API
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator cannot be updated because your Amazon Web Services Organization management
     *         account or the delegated administrator role changed. Delete this aggregator and create a new one with the
     *         current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator is associated with a previous Amazon Web Services Organization and Config
     *         cannot aggregate data with current Amazon Web Services Organization. Delete this aggregator and create a
     *         new one with the current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You are not a registered delegated administrator for Config with permissions to call
     *         <code>ListDelegatedAdministrators</code> API. Ensure that the management account registers delagated
     *         administrator for Config service principle name before the delegated administrator creates an aggregator.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all <code>OrganizationConfigRule</code> and <code>OrganizationConformancePack</code> APIs, Config
     *         throws an exception if APIs are called from member accounts. All APIs must be called from organization
     *         management account.
     * @sample AmazonConfig.DeleteOrganizationConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteOrganizationConformancePack"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteOrganizationConformancePackResult deleteOrganizationConformancePack(DeleteOrganizationConformancePackRequest deleteOrganizationConformancePackRequest);

    /**
     * <p>
     * Deletes pending authorization requests for a specified aggregator account in a specified region.
     * </p>
     * 
     * @param deletePendingAggregationRequestRequest
     * @return Result of the DeletePendingAggregationRequest operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.DeletePendingAggregationRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeletePendingAggregationRequest"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePendingAggregationRequestResult deletePendingAggregationRequest(DeletePendingAggregationRequestRequest deletePendingAggregationRequestRequest);

    /**
     * <p>
     * Deletes the remediation configuration.
     * </p>
     * 
     * @param deleteRemediationConfigurationRequest
     * @return Result of the DeleteRemediationConfiguration operation returned by the service.
     * @throws NoSuchRemediationConfigurationException
     *         You specified an Config rule without a remediation configuration.
     * @throws RemediationInProgressException
     *         Remediation action is in progress. You can either cancel execution in Amazon Web Services Systems Manager
     *         or wait and try again later.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to Config lacks permissions
     *         to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization Config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have the following permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You do not have permission to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You do not have permission to read Amazon S3 bucket or call SSM:GetDocument.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.DeleteRemediationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteRemediationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRemediationConfigurationResult deleteRemediationConfiguration(DeleteRemediationConfigurationRequest deleteRemediationConfigurationRequest);

    /**
     * <p>
     * Deletes one or more remediation exceptions mentioned in the resource keys.
     * </p>
     * <note>
     * <p>
     * Config generates a remediation exception when a problem occurs executing a remediation action to a specific
     * resource. Remediation exceptions blocks auto-remediation until the exception is cleared.
     * </p>
     * </note>
     * 
     * @param deleteRemediationExceptionsRequest
     * @return Result of the DeleteRemediationExceptions operation returned by the service.
     * @throws NoSuchRemediationExceptionException
     *         You tried to delete a remediation exception that does not exist.
     * @sample AmazonConfig.DeleteRemediationExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteRemediationExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRemediationExceptionsResult deleteRemediationExceptions(DeleteRemediationExceptionsRequest deleteRemediationExceptionsRequest);

    /**
     * <p>
     * Records the configuration state for a custom resource that has been deleted. This API records a new
     * ConfigurationItem with a ResourceDeleted status. You can retrieve the ConfigurationItems recorded for this
     * resource in your Config History.
     * </p>
     * 
     * @param deleteResourceConfigRequest
     * @return Result of the DeleteResourceConfig operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws NoRunningConfigurationRecorderException
     *         There is no configuration recorder running.
     * @sample AmazonConfig.DeleteResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteResourceConfig" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteResourceConfigResult deleteResourceConfig(DeleteResourceConfigRequest deleteResourceConfigRequest);

    /**
     * <p>
     * Deletes the retention configuration.
     * </p>
     * 
     * @param deleteRetentionConfigurationRequest
     * @return Result of the DeleteRetentionConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws NoSuchRetentionConfigurationException
     *         You have specified a retention configuration that does not exist.
     * @sample AmazonConfig.DeleteRetentionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteRetentionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRetentionConfigurationResult deleteRetentionConfiguration(DeleteRetentionConfigurationRequest deleteRetentionConfigurationRequest);

    /**
     * <p>
     * Deletes the stored query for a single Amazon Web Services account and a single Amazon Web Services Region.
     * </p>
     * 
     * @param deleteStoredQueryRequest
     * @return Result of the DeleteStoredQuery operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws ResourceNotFoundException
     *         You have specified a resource that does not exist.
     * @sample AmazonConfig.DeleteStoredQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteStoredQuery" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteStoredQueryResult deleteStoredQuery(DeleteStoredQueryRequest deleteStoredQueryRequest);

    /**
     * <p>
     * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After
     * the delivery has started, Config sends the following notifications using an Amazon SNS topic that you have
     * specified.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Notification of the start of the delivery.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notification of the completion of the delivery, if the delivery was successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Notification of delivery failure, if the delivery failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliverConfigSnapshotRequest
     *        The input for the <a>DeliverConfigSnapshot</a> action.
     * @return Result of the DeliverConfigSnapshot operation returned by the service.
     * @throws NoSuchDeliveryChannelException
     *         You have specified a delivery channel that does not exist.
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the role needed to describe your resources.
     *         Create a configuration recorder.
     * @throws NoRunningConfigurationRecorderException
     *         There is no configuration recorder running.
     * @sample AmazonConfig.DeliverConfigSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeliverConfigSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    DeliverConfigSnapshotResult deliverConfigSnapshot(DeliverConfigSnapshotRequest deliverConfigSnapshotRequest);

    /**
     * <p>
     * Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant
     * rules. Does not display rules that do not have compliance results.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page, but if you have a <code>nextToken</code>, the results are displayed
     * on the next page.
     * </p>
     * </note>
     * 
     * @param describeAggregateComplianceByConfigRulesRequest
     * @return Result of the DescribeAggregateComplianceByConfigRules operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.DescribeAggregateComplianceByConfigRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeAggregateComplianceByConfigRules"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAggregateComplianceByConfigRulesResult describeAggregateComplianceByConfigRules(
            DescribeAggregateComplianceByConfigRulesRequest describeAggregateComplianceByConfigRulesRequest);

    /**
     * <p>
     * Returns a list of the conformance packs and their associated compliance status with the count of compliant and
     * noncompliant Config rules within each conformance pack. Also returns the total rule count which includes
     * compliant rules, noncompliant rules, and rules that cannot be evaluated due to insufficient data.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page, but if you have a <code>nextToken</code>, the results are displayed
     * on the next page.
     * </p>
     * </note>
     * 
     * @param describeAggregateComplianceByConformancePacksRequest
     * @return Result of the DescribeAggregateComplianceByConformancePacks operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.DescribeAggregateComplianceByConformancePacks
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeAggregateComplianceByConformancePacks"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAggregateComplianceByConformancePacksResult describeAggregateComplianceByConformancePacks(
            DescribeAggregateComplianceByConformancePacksRequest describeAggregateComplianceByConformancePacksRequest);

    /**
     * <p>
     * Returns a list of authorizations granted to various aggregator accounts and regions.
     * </p>
     * 
     * @param describeAggregationAuthorizationsRequest
     * @return Result of the DescribeAggregationAuthorizations operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @sample AmazonConfig.DescribeAggregationAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeAggregationAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAggregationAuthorizationsResult describeAggregationAuthorizations(DescribeAggregationAuthorizationsRequest describeAggregationAuthorizationsRequest);

    /**
     * <p>
     * Indicates whether the specified Config rules are compliant. If a rule is noncompliant, this action returns the
     * number of Amazon Web Services resources that do not comply with the rule.
     * </p>
     * <p>
     * A rule is compliant if all of the evaluated resources comply with it. It is noncompliant if any of these
     * resources do not comply.
     * </p>
     * <p>
     * If Config has no current evaluation results for the rule, it returns <code>INSUFFICIENT_DATA</code>. This result
     * might indicate one of the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Config has never invoked an evaluation for the rule. To check whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's Lambda function is failing to send evaluation results to Config. Verify that the role you assigned to
     * your configuration recorder includes the <code>config:PutEvaluations</code> permission. If the rule is a custom
     * rule, verify that the Lambda execution role includes the <code>config:PutEvaluations</code> permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's Lambda function has returned <code>NOT_APPLICABLE</code> for all evaluation results. This can occur if
     * the resources were deleted or removed from the rule's scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeComplianceByConfigRuleRequest
     * @return Result of the DescribeComplianceByConfigRule operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws NoSuchConfigRuleException
     *         The Config rule in the request is invalid. Verify that the rule is an Config Custom Policy rule, that the
     *         rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.DescribeComplianceByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeComplianceByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeComplianceByConfigRuleResult describeComplianceByConfigRule(DescribeComplianceByConfigRuleRequest describeComplianceByConfigRuleRequest);

    /**
     * Simplified method form for invoking the DescribeComplianceByConfigRule operation.
     *
     * @see #describeComplianceByConfigRule(DescribeComplianceByConfigRuleRequest)
     */
    DescribeComplianceByConfigRuleResult describeComplianceByConfigRule();

    /**
     * <p>
     * Indicates whether the specified Amazon Web Services resources are compliant. If a resource is noncompliant, this
     * action returns the number of Config rules that the resource does not comply with.
     * </p>
     * <p>
     * A resource is compliant if it complies with all the Config rules that evaluate it. It is noncompliant if it does
     * not comply with one or more of these rules.
     * </p>
     * <p>
     * If Config has no current evaluation results for the resource, it returns <code>INSUFFICIENT_DATA</code>. This
     * result might indicate one of the following conditions about the rules that evaluate the resource:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Config has never invoked an evaluation for the rule. To check whether it has, use the
     * <code>DescribeConfigRuleEvaluationStatus</code> action to get the <code>LastSuccessfulInvocationTime</code> and
     * <code>LastFailedInvocationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's Lambda function is failing to send evaluation results to Config. Verify that the role that you
     * assigned to your configuration recorder includes the <code>config:PutEvaluations</code> permission. If the rule
     * is a custom rule, verify that the Lambda execution role includes the <code>config:PutEvaluations</code>
     * permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * The rule's Lambda function has returned <code>NOT_APPLICABLE</code> for all evaluation results. This can occur if
     * the resources were deleted or removed from the rule's scope.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeComplianceByResourceRequest
     * @return Result of the DescribeComplianceByResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.DescribeComplianceByResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeComplianceByResource"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeComplianceByResourceResult describeComplianceByResource(DescribeComplianceByResourceRequest describeComplianceByResourceRequest);

    /**
     * Simplified method form for invoking the DescribeComplianceByResource operation.
     *
     * @see #describeComplianceByResource(DescribeComplianceByResourceRequest)
     */
    DescribeComplianceByResourceResult describeComplianceByResource();

    /**
     * <p>
     * Returns status information for each of your Config managed rules. The status includes information such as the
     * last time Config invoked the rule, the last time Config failed to invoke the rule, and the related error for the
     * last failure.
     * </p>
     * 
     * @param describeConfigRuleEvaluationStatusRequest
     * @return Result of the DescribeConfigRuleEvaluationStatus operation returned by the service.
     * @throws NoSuchConfigRuleException
     *         The Config rule in the request is invalid. Verify that the rule is an Config Custom Policy rule, that the
     *         rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying again.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.DescribeConfigRuleEvaluationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigRuleEvaluationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConfigRuleEvaluationStatusResult describeConfigRuleEvaluationStatus(
            DescribeConfigRuleEvaluationStatusRequest describeConfigRuleEvaluationStatusRequest);

    /**
     * Simplified method form for invoking the DescribeConfigRuleEvaluationStatus operation.
     *
     * @see #describeConfigRuleEvaluationStatus(DescribeConfigRuleEvaluationStatusRequest)
     */
    DescribeConfigRuleEvaluationStatusResult describeConfigRuleEvaluationStatus();

    /**
     * <p>
     * Returns details about your Config rules.
     * </p>
     * 
     * @param describeConfigRulesRequest
     * @return Result of the DescribeConfigRules operation returned by the service.
     * @throws NoSuchConfigRuleException
     *         The Config rule in the request is invalid. Verify that the rule is an Config Custom Policy rule, that the
     *         rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.DescribeConfigRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigRules" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeConfigRulesResult describeConfigRules(DescribeConfigRulesRequest describeConfigRulesRequest);

    /**
     * Simplified method form for invoking the DescribeConfigRules operation.
     *
     * @see #describeConfigRules(DescribeConfigRulesRequest)
     */
    DescribeConfigRulesResult describeConfigRules();

    /**
     * <p>
     * Returns status information for sources within an aggregator. The status includes information about the last time
     * Config verified authorization between the source account and an aggregator account. In case of a failure, the
     * status contains the related error code or message.
     * </p>
     * 
     * @param describeConfigurationAggregatorSourcesStatusRequest
     * @return Result of the DescribeConfigurationAggregatorSourcesStatus operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @sample AmazonConfig.DescribeConfigurationAggregatorSourcesStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationAggregatorSourcesStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConfigurationAggregatorSourcesStatusResult describeConfigurationAggregatorSourcesStatus(
            DescribeConfigurationAggregatorSourcesStatusRequest describeConfigurationAggregatorSourcesStatusRequest);

    /**
     * <p>
     * Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified,
     * this action returns the details for all the configuration aggregators associated with the account.
     * </p>
     * 
     * @param describeConfigurationAggregatorsRequest
     * @return Result of the DescribeConfigurationAggregators operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @sample AmazonConfig.DescribeConfigurationAggregators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationAggregators"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConfigurationAggregatorsResult describeConfigurationAggregators(DescribeConfigurationAggregatorsRequest describeConfigurationAggregatorsRequest);

    /**
     * <p>
     * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified,
     * this action returns the status of all configuration recorders associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * </note>
     * 
     * @param describeConfigurationRecorderStatusRequest
     *        The input for the <a>DescribeConfigurationRecorderStatus</a> action.
     * @return Result of the DescribeConfigurationRecorderStatus operation returned by the service.
     * @throws NoSuchConfigurationRecorderException
     *         You have specified a configuration recorder that does not exist.
     * @sample AmazonConfig.DescribeConfigurationRecorderStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationRecorderStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus(
            DescribeConfigurationRecorderStatusRequest describeConfigurationRecorderStatusRequest);

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorderStatus operation.
     *
     * @see #describeConfigurationRecorderStatus(DescribeConfigurationRecorderStatusRequest)
     */
    DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus();

    /**
     * <p>
     * Returns the details for the specified configuration recorders. If the configuration recorder is not specified,
     * this action returns the details for all configuration recorders associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * </note>
     * 
     * @param describeConfigurationRecordersRequest
     *        The input for the <a>DescribeConfigurationRecorders</a> action.
     * @return Result of the DescribeConfigurationRecorders operation returned by the service.
     * @throws NoSuchConfigurationRecorderException
     *         You have specified a configuration recorder that does not exist.
     * @sample AmazonConfig.DescribeConfigurationRecorders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConfigurationRecorders"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConfigurationRecordersResult describeConfigurationRecorders(DescribeConfigurationRecordersRequest describeConfigurationRecordersRequest);

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorders operation.
     *
     * @see #describeConfigurationRecorders(DescribeConfigurationRecordersRequest)
     */
    DescribeConfigurationRecordersResult describeConfigurationRecorders();

    /**
     * <p>
     * Returns compliance details for each rule in that conformance pack.
     * </p>
     * <note>
     * <p>
     * You must provide exact rule names.
     * </p>
     * </note>
     * 
     * @param describeConformancePackComplianceRequest
     * @return Result of the DescribeConformancePackCompliance operation returned by the service.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws NoSuchConfigRuleInConformancePackException
     *         Config rule that you passed in the filter does not exist.
     * @throws NoSuchConformancePackException
     *         You specified one or more conformance packs that do not exist.
     * @sample AmazonConfig.DescribeConformancePackCompliance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePackCompliance"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConformancePackComplianceResult describeConformancePackCompliance(DescribeConformancePackComplianceRequest describeConformancePackComplianceRequest);

    /**
     * <p>
     * Provides one or more conformance packs deployment status.
     * </p>
     * <note>
     * <p>
     * If there are no conformance packs then you will see an empty result.
     * </p>
     * </note>
     * 
     * @param describeConformancePackStatusRequest
     * @return Result of the DescribeConformancePackStatus operation returned by the service.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.DescribeConformancePackStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePackStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConformancePackStatusResult describeConformancePackStatus(DescribeConformancePackStatusRequest describeConformancePackStatusRequest);

    /**
     * <p>
     * Returns a list of one or more conformance packs.
     * </p>
     * 
     * @param describeConformancePacksRequest
     * @return Result of the DescribeConformancePacks operation returned by the service.
     * @throws NoSuchConformancePackException
     *         You specified one or more conformance packs that do not exist.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.DescribeConformancePacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePacks"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConformancePacksResult describeConformancePacks(DescribeConformancePacksRequest describeConformancePacksRequest);

    /**
     * <p>
     * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action
     * returns the current status of all delivery channels associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param describeDeliveryChannelStatusRequest
     *        The input for the <a>DeliveryChannelStatus</a> action.
     * @return Result of the DescribeDeliveryChannelStatus operation returned by the service.
     * @throws NoSuchDeliveryChannelException
     *         You have specified a delivery channel that does not exist.
     * @sample AmazonConfig.DescribeDeliveryChannelStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeDeliveryChannelStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus(DescribeDeliveryChannelStatusRequest describeDeliveryChannelStatusRequest);

    /**
     * Simplified method form for invoking the DescribeDeliveryChannelStatus operation.
     *
     * @see #describeDeliveryChannelStatus(DescribeDeliveryChannelStatusRequest)
     */
    DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus();

    /**
     * <p>
     * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns
     * the details of all delivery channels associated with the account.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param describeDeliveryChannelsRequest
     *        The input for the <a>DescribeDeliveryChannels</a> action.
     * @return Result of the DescribeDeliveryChannels operation returned by the service.
     * @throws NoSuchDeliveryChannelException
     *         You have specified a delivery channel that does not exist.
     * @sample AmazonConfig.DescribeDeliveryChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeDeliveryChannels"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDeliveryChannelsResult describeDeliveryChannels(DescribeDeliveryChannelsRequest describeDeliveryChannelsRequest);

    /**
     * Simplified method form for invoking the DescribeDeliveryChannels operation.
     *
     * @see #describeDeliveryChannels(DescribeDeliveryChannelsRequest)
     */
    DescribeDeliveryChannelsResult describeDeliveryChannels();

    /**
     * <p>
     * Provides organization Config rule deployment status for an organization.
     * </p>
     * <note>
     * <p>
     * The status is not considered successful until organization Config rule is successfully deployed in all the member
     * accounts with an exception of excluded accounts.
     * </p>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response. Limit and next token are not
     * applicable if you specify organization Config rule names. It is only applicable, when you request all the
     * organization Config rules.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConfigRuleStatusesRequest
     * @return Result of the DescribeOrganizationConfigRuleStatuses operation returned by the service.
     * @throws NoSuchOrganizationConfigRuleException
     *         The Config rule in the request is invalid. Verify that the rule is an organization Config Custom Policy
     *         rule, that the rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying
     *         again.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws OrganizationAccessDeniedException
     *         For <code>PutConfigurationAggregator</code> API, you can see this exception for the following
     *         reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         No permission to call <code>EnableAWSServiceAccess</code> API
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator cannot be updated because your Amazon Web Services Organization management
     *         account or the delegated administrator role changed. Delete this aggregator and create a new one with the
     *         current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator is associated with a previous Amazon Web Services Organization and Config
     *         cannot aggregate data with current Amazon Web Services Organization. Delete this aggregator and create a
     *         new one with the current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You are not a registered delegated administrator for Config with permissions to call
     *         <code>ListDelegatedAdministrators</code> API. Ensure that the management account registers delagated
     *         administrator for Config service principle name before the delegated administrator creates an aggregator.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all <code>OrganizationConfigRule</code> and <code>OrganizationConformancePack</code> APIs, Config
     *         throws an exception if APIs are called from member accounts. All APIs must be called from organization
     *         management account.
     * @sample AmazonConfig.DescribeOrganizationConfigRuleStatuses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConfigRuleStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrganizationConfigRuleStatusesResult describeOrganizationConfigRuleStatuses(
            DescribeOrganizationConfigRuleStatusesRequest describeOrganizationConfigRuleStatusesRequest);

    /**
     * <p>
     * Returns a list of organization Config rules.
     * </p>
     * <note>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response.
     * </p>
     * <p>
     * Limit and next token are not applicable if you specify organization Config rule names. It is only applicable,
     * when you request all the organization Config rules.
     * </p>
     * <p>
     * <i>For accounts within an organzation</i>
     * </p>
     * <p>
     * If you deploy an organizational rule or conformance pack in an organization administrator account, and then
     * establish a delegated administrator and deploy an organizational rule or conformance pack in the delegated
     * administrator account, you won't be able to see the organizational rule or conformance pack in the organization
     * administrator account from the delegated administrator account or see the organizational rule or conformance pack
     * in the delegated administrator account from organization administrator account. The
     * <code>DescribeOrganizationConfigRules</code> and <code>DescribeOrganizationConformancePacks</code> APIs can only
     * see and interact with the organization-related resource that were deployed from within the account calling those
     * APIs.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConfigRulesRequest
     * @return Result of the DescribeOrganizationConfigRules operation returned by the service.
     * @throws NoSuchOrganizationConfigRuleException
     *         The Config rule in the request is invalid. Verify that the rule is an organization Config Custom Policy
     *         rule, that the rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying
     *         again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws OrganizationAccessDeniedException
     *         For <code>PutConfigurationAggregator</code> API, you can see this exception for the following
     *         reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         No permission to call <code>EnableAWSServiceAccess</code> API
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator cannot be updated because your Amazon Web Services Organization management
     *         account or the delegated administrator role changed. Delete this aggregator and create a new one with the
     *         current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator is associated with a previous Amazon Web Services Organization and Config
     *         cannot aggregate data with current Amazon Web Services Organization. Delete this aggregator and create a
     *         new one with the current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You are not a registered delegated administrator for Config with permissions to call
     *         <code>ListDelegatedAdministrators</code> API. Ensure that the management account registers delagated
     *         administrator for Config service principle name before the delegated administrator creates an aggregator.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all <code>OrganizationConfigRule</code> and <code>OrganizationConformancePack</code> APIs, Config
     *         throws an exception if APIs are called from member accounts. All APIs must be called from organization
     *         management account.
     * @sample AmazonConfig.DescribeOrganizationConfigRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConfigRules"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrganizationConfigRulesResult describeOrganizationConfigRules(DescribeOrganizationConfigRulesRequest describeOrganizationConfigRulesRequest);

    /**
     * <p>
     * Provides organization conformance pack deployment status for an organization.
     * </p>
     * <note>
     * <p>
     * The status is not considered successful until organization conformance pack is successfully deployed in all the
     * member accounts with an exception of excluded accounts.
     * </p>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response. Limit and next token are not
     * applicable if you specify organization conformance pack names. They are only applicable, when you request all the
     * organization conformance packs.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConformancePackStatusesRequest
     * @return Result of the DescribeOrganizationConformancePackStatuses operation returned by the service.
     * @throws NoSuchOrganizationConformancePackException
     *         Config organization conformance pack that you passed in the filter does not exist.</p>
     *         <p>
     *         For DeleteOrganizationConformancePack, you tried to delete an organization conformance pack that does not
     *         exist.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws OrganizationAccessDeniedException
     *         For <code>PutConfigurationAggregator</code> API, you can see this exception for the following reasons:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         No permission to call <code>EnableAWSServiceAccess</code> API
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator cannot be updated because your Amazon Web Services Organization management
     *         account or the delegated administrator role changed. Delete this aggregator and create a new one with the
     *         current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator is associated with a previous Amazon Web Services Organization and Config
     *         cannot aggregate data with current Amazon Web Services Organization. Delete this aggregator and create a
     *         new one with the current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You are not a registered delegated administrator for Config with permissions to call
     *         <code>ListDelegatedAdministrators</code> API. Ensure that the management account registers delagated
     *         administrator for Config service principle name before the delegated administrator creates an aggregator.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all <code>OrganizationConfigRule</code> and <code>OrganizationConformancePack</code> APIs, Config
     *         throws an exception if APIs are called from member accounts. All APIs must be called from organization
     *         management account.
     * @sample AmazonConfig.DescribeOrganizationConformancePackStatuses
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConformancePackStatuses"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrganizationConformancePackStatusesResult describeOrganizationConformancePackStatuses(
            DescribeOrganizationConformancePackStatusesRequest describeOrganizationConformancePackStatusesRequest);

    /**
     * <p>
     * Returns a list of organization conformance packs.
     * </p>
     * <note>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response.
     * </p>
     * <p>
     * Limit and next token are not applicable if you specify organization conformance packs names. They are only
     * applicable, when you request all the organization conformance packs.
     * </p>
     * <p>
     * <i>For accounts within an organzation</i>
     * </p>
     * <p>
     * If you deploy an organizational rule or conformance pack in an organization administrator account, and then
     * establish a delegated administrator and deploy an organizational rule or conformance pack in the delegated
     * administrator account, you won't be able to see the organizational rule or conformance pack in the organization
     * administrator account from the delegated administrator account or see the organizational rule or conformance pack
     * in the delegated administrator account from organization administrator account. The
     * <code>DescribeOrganizationConfigRules</code> and <code>DescribeOrganizationConformancePacks</code> APIs can only
     * see and interact with the organization-related resource that were deployed from within the account calling those
     * APIs.
     * </p>
     * </note>
     * 
     * @param describeOrganizationConformancePacksRequest
     * @return Result of the DescribeOrganizationConformancePacks operation returned by the service.
     * @throws NoSuchOrganizationConformancePackException
     *         Config organization conformance pack that you passed in the filter does not exist.</p>
     *         <p>
     *         For DeleteOrganizationConformancePack, you tried to delete an organization conformance pack that does not
     *         exist.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws OrganizationAccessDeniedException
     *         For <code>PutConfigurationAggregator</code> API, you can see this exception for the following reasons:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         No permission to call <code>EnableAWSServiceAccess</code> API
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator cannot be updated because your Amazon Web Services Organization management
     *         account or the delegated administrator role changed. Delete this aggregator and create a new one with the
     *         current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator is associated with a previous Amazon Web Services Organization and Config
     *         cannot aggregate data with current Amazon Web Services Organization. Delete this aggregator and create a
     *         new one with the current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You are not a registered delegated administrator for Config with permissions to call
     *         <code>ListDelegatedAdministrators</code> API. Ensure that the management account registers delagated
     *         administrator for Config service principle name before the delegated administrator creates an aggregator.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all <code>OrganizationConfigRule</code> and <code>OrganizationConformancePack</code> APIs, Config
     *         throws an exception if APIs are called from member accounts. All APIs must be called from organization
     *         management account.
     * @sample AmazonConfig.DescribeOrganizationConformancePacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConformancePacks"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrganizationConformancePacksResult describeOrganizationConformancePacks(
            DescribeOrganizationConformancePacksRequest describeOrganizationConformancePacksRequest);

    /**
     * <p>
     * Returns a list of all pending aggregation requests.
     * </p>
     * 
     * @param describePendingAggregationRequestsRequest
     * @return Result of the DescribePendingAggregationRequests operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @sample AmazonConfig.DescribePendingAggregationRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribePendingAggregationRequests"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePendingAggregationRequestsResult describePendingAggregationRequests(
            DescribePendingAggregationRequestsRequest describePendingAggregationRequestsRequest);

    /**
     * <p>
     * Returns the details of one or more remediation configurations.
     * </p>
     * 
     * @param describeRemediationConfigurationsRequest
     * @return Result of the DescribeRemediationConfigurations operation returned by the service.
     * @sample AmazonConfig.DescribeRemediationConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRemediationConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRemediationConfigurationsResult describeRemediationConfigurations(DescribeRemediationConfigurationsRequest describeRemediationConfigurationsRequest);

    /**
     * <p>
     * Returns the details of one or more remediation exceptions. A detailed view of a remediation exception for a set
     * of resources that includes an explanation of an exception and the time when the exception will be deleted. When
     * you specify the limit and the next token, you receive a paginated response.
     * </p>
     * <note>
     * <p>
     * Config generates a remediation exception when a problem occurs executing a remediation action to a specific
     * resource. Remediation exceptions blocks auto-remediation until the exception is cleared.
     * </p>
     * <p>
     * When you specify the limit and the next token, you receive a paginated response.
     * </p>
     * <p>
     * Limit and next token are not applicable if you request resources in batch. It is only applicable, when you
     * request all resources.
     * </p>
     * </note>
     * 
     * @param describeRemediationExceptionsRequest
     * @return Result of the DescribeRemediationExceptions operation returned by the service.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.DescribeRemediationExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRemediationExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRemediationExceptionsResult describeRemediationExceptions(DescribeRemediationExceptionsRequest describeRemediationExceptionsRequest);

    /**
     * <p>
     * Provides a detailed view of a Remediation Execution for a set of resources including state, timestamps for when
     * steps for the remediation execution occur, and any error messages for steps that have failed. When you specify
     * the limit and the next token, you receive a paginated response.
     * </p>
     * 
     * @param describeRemediationExecutionStatusRequest
     * @return Result of the DescribeRemediationExecutionStatus operation returned by the service.
     * @throws NoSuchRemediationConfigurationException
     *         You specified an Config rule without a remediation configuration.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.DescribeRemediationExecutionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRemediationExecutionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRemediationExecutionStatusResult describeRemediationExecutionStatus(
            DescribeRemediationExecutionStatusRequest describeRemediationExecutionStatusRequest);

    /**
     * <p>
     * Returns the details of one or more retention configurations. If the retention configuration name is not
     * specified, this action returns the details for all the retention configurations for that account.
     * </p>
     * <note>
     * <p>
     * Currently, Config supports only one retention configuration per region in your account.
     * </p>
     * </note>
     * 
     * @param describeRetentionConfigurationsRequest
     * @return Result of the DescribeRetentionConfigurations operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws NoSuchRetentionConfigurationException
     *         You have specified a retention configuration that does not exist.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.DescribeRetentionConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeRetentionConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRetentionConfigurationsResult describeRetentionConfigurations(DescribeRetentionConfigurationsRequest describeRetentionConfigurationsRequest);

    /**
     * <p>
     * Returns the evaluation results for the specified Config rule for a specific resource in a rule. The results
     * indicate which Amazon Web Services resources were evaluated by the rule, when each resource was last evaluated,
     * and whether each resource complies with the rule.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page. But if you have a <code>nextToken</code>, the results are displayed
     * on the next page.
     * </p>
     * </note>
     * 
     * @param getAggregateComplianceDetailsByConfigRuleRequest
     * @return Result of the GetAggregateComplianceDetailsByConfigRule operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.GetAggregateComplianceDetailsByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateComplianceDetailsByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    GetAggregateComplianceDetailsByConfigRuleResult getAggregateComplianceDetailsByConfigRule(
            GetAggregateComplianceDetailsByConfigRuleRequest getAggregateComplianceDetailsByConfigRuleRequest);

    /**
     * <p>
     * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page, but if you have a nextToken, the results are displayed on the next
     * page.
     * </p>
     * </note>
     * 
     * @param getAggregateConfigRuleComplianceSummaryRequest
     * @return Result of the GetAggregateConfigRuleComplianceSummary operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.GetAggregateConfigRuleComplianceSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateConfigRuleComplianceSummary"
     *      target="_top">AWS API Documentation</a>
     */
    GetAggregateConfigRuleComplianceSummaryResult getAggregateConfigRuleComplianceSummary(
            GetAggregateConfigRuleComplianceSummaryRequest getAggregateConfigRuleComplianceSummaryRequest);

    /**
     * <p>
     * Returns the count of compliant and noncompliant conformance packs across all Amazon Web Services accounts and
     * Amazon Web Services Regions in an aggregator. You can filter based on Amazon Web Services account ID or Amazon
     * Web Services Region.
     * </p>
     * <note>
     * <p>
     * The results can return an empty result page, but if you have a nextToken, the results are displayed on the next
     * page.
     * </p>
     * </note>
     * 
     * @param getAggregateConformancePackComplianceSummaryRequest
     * @return Result of the GetAggregateConformancePackComplianceSummary operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.GetAggregateConformancePackComplianceSummary
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateConformancePackComplianceSummary"
     *      target="_top">AWS API Documentation</a>
     */
    GetAggregateConformancePackComplianceSummaryResult getAggregateConformancePackComplianceSummary(
            GetAggregateConformancePackComplianceSummaryRequest getAggregateConformancePackComplianceSummaryRequest);

    /**
     * <p>
     * Returns the resource counts across accounts and regions that are present in your Config aggregator. You can
     * request the resource counts by providing filters and GroupByKey.
     * </p>
     * <p>
     * For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the
     * count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a
     * GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.
     * </p>
     * 
     * @param getAggregateDiscoveredResourceCountsRequest
     * @return Result of the GetAggregateDiscoveredResourceCounts operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.GetAggregateDiscoveredResourceCounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateDiscoveredResourceCounts"
     *      target="_top">AWS API Documentation</a>
     */
    GetAggregateDiscoveredResourceCountsResult getAggregateDiscoveredResourceCounts(
            GetAggregateDiscoveredResourceCountsRequest getAggregateDiscoveredResourceCountsRequest);

    /**
     * <p>
     * Returns configuration item that is aggregated for your specific resource in a specific source account and region.
     * </p>
     * 
     * @param getAggregateResourceConfigRequest
     * @return Result of the GetAggregateResourceConfig operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @throws OversizedConfigurationItemException
     *         The configuration item size is outside the allowable range.
     * @throws ResourceNotDiscoveredException
     *         You have specified a resource that is either unknown or has not been discovered.
     * @sample AmazonConfig.GetAggregateResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateResourceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetAggregateResourceConfigResult getAggregateResourceConfig(GetAggregateResourceConfigRequest getAggregateResourceConfigRequest);

    /**
     * <p>
     * Returns the evaluation results for the specified Config rule. The results indicate which Amazon Web Services
     * resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies
     * with the rule.
     * </p>
     * 
     * @param getComplianceDetailsByConfigRuleRequest
     * @return Result of the GetComplianceDetailsByConfigRule operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConfigRuleException
     *         The Config rule in the request is invalid. Verify that the rule is an Config Custom Policy rule, that the
     *         rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying again.
     * @sample AmazonConfig.GetComplianceDetailsByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceDetailsByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    GetComplianceDetailsByConfigRuleResult getComplianceDetailsByConfigRule(GetComplianceDetailsByConfigRuleRequest getComplianceDetailsByConfigRuleRequest);

    /**
     * <p>
     * Returns the evaluation results for the specified Amazon Web Services resource. The results indicate which Config
     * rules were used to evaluate the resource, when each rule was last invoked, and whether the resource complies with
     * each rule.
     * </p>
     * 
     * @param getComplianceDetailsByResourceRequest
     * @return Result of the GetComplianceDetailsByResource operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.GetComplianceDetailsByResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceDetailsByResource"
     *      target="_top">AWS API Documentation</a>
     */
    GetComplianceDetailsByResourceResult getComplianceDetailsByResource(GetComplianceDetailsByResourceRequest getComplianceDetailsByResourceRequest);

    /**
     * <p>
     * Returns the number of Config rules that are compliant and noncompliant, up to a maximum of 25 for each.
     * </p>
     * 
     * @param getComplianceSummaryByConfigRuleRequest
     * @return Result of the GetComplianceSummaryByConfigRule operation returned by the service.
     * @sample AmazonConfig.GetComplianceSummaryByConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceSummaryByConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    GetComplianceSummaryByConfigRuleResult getComplianceSummaryByConfigRule(GetComplianceSummaryByConfigRuleRequest getComplianceSummaryByConfigRuleRequest);

    /**
     * Simplified method form for invoking the GetComplianceSummaryByConfigRule operation.
     *
     * @see #getComplianceSummaryByConfigRule(GetComplianceSummaryByConfigRuleRequest)
     */
    GetComplianceSummaryByConfigRuleResult getComplianceSummaryByConfigRule();

    /**
     * <p>
     * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or
     * more resource types to get these numbers for each resource type. The maximum number returned is 100.
     * </p>
     * 
     * @param getComplianceSummaryByResourceTypeRequest
     * @return Result of the GetComplianceSummaryByResourceType operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.GetComplianceSummaryByResourceType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceSummaryByResourceType"
     *      target="_top">AWS API Documentation</a>
     */
    GetComplianceSummaryByResourceTypeResult getComplianceSummaryByResourceType(
            GetComplianceSummaryByResourceTypeRequest getComplianceSummaryByResourceTypeRequest);

    /**
     * Simplified method form for invoking the GetComplianceSummaryByResourceType operation.
     *
     * @see #getComplianceSummaryByResourceType(GetComplianceSummaryByResourceTypeRequest)
     */
    GetComplianceSummaryByResourceTypeResult getComplianceSummaryByResourceType();

    /**
     * <p>
     * Returns compliance details of a conformance pack for all Amazon Web Services resources that are monitered by
     * conformance pack.
     * </p>
     * 
     * @param getConformancePackComplianceDetailsRequest
     * @return Result of the GetConformancePackComplianceDetails operation returned by the service.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConformancePackException
     *         You specified one or more conformance packs that do not exist.
     * @throws NoSuchConfigRuleInConformancePackException
     *         Config rule that you passed in the filter does not exist.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.GetConformancePackComplianceDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetConformancePackComplianceDetails"
     *      target="_top">AWS API Documentation</a>
     */
    GetConformancePackComplianceDetailsResult getConformancePackComplianceDetails(
            GetConformancePackComplianceDetailsRequest getConformancePackComplianceDetailsRequest);

    /**
     * <p>
     * Returns compliance details for the conformance pack based on the cumulative compliance results of all the rules
     * in that conformance pack.
     * </p>
     * 
     * @param getConformancePackComplianceSummaryRequest
     * @return Result of the GetConformancePackComplianceSummary operation returned by the service.
     * @throws NoSuchConformancePackException
     *         You specified one or more conformance packs that do not exist.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.GetConformancePackComplianceSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetConformancePackComplianceSummary"
     *      target="_top">AWS API Documentation</a>
     */
    GetConformancePackComplianceSummaryResult getConformancePackComplianceSummary(
            GetConformancePackComplianceSummaryRequest getConformancePackComplianceSummaryRequest);

    /**
     * <p>
     * Returns the policy definition containing the logic for your Config Custom Policy rule.
     * </p>
     * 
     * @param getCustomRulePolicyRequest
     * @return Result of the GetCustomRulePolicy operation returned by the service.
     * @throws NoSuchConfigRuleException
     *         The Config rule in the request is invalid. Verify that the rule is an Config Custom Policy rule, that the
     *         rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying again.
     * @sample AmazonConfig.GetCustomRulePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetCustomRulePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetCustomRulePolicyResult getCustomRulePolicy(GetCustomRulePolicyRequest getCustomRulePolicyRequest);

    /**
     * <p>
     * Returns the resource types, the number of each resource type, and the total number of resources that Config is
     * recording in this region for your Amazon Web Services account.
     * </p>
     * <p class="title">
     * <b>Example</b>
     * </p>
     * <ol>
     * <li>
     * <p>
     * Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20 IAM
     * users, and 15 S3 buckets.
     * </p>
     * </li>
     * <li>
     * <p>
     * You make a call to the <code>GetDiscoveredResourceCounts</code> action and specify that you want all resource
     * types.
     * </p>
     * </li>
     * <li>
     * <p>
     * Config returns the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource types (EC2 instances, IAM users, and S3 buckets).
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of each resource type (25, 20, and 15).
     * </p>
     * </li>
     * <li>
     * <p>
     * The total number of all resources (60).
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ol>
     * <p>
     * The response is paginated. By default, Config lists 100 <a>ResourceCount</a> objects on each page. You can
     * customize this number with the <code>limit</code> parameter. The response includes a <code>nextToken</code>
     * string. To get the next page of results, run the request again and specify the string for the
     * <code>nextToken</code> parameter.
     * </p>
     * <note>
     * <p>
     * If you make a call to the <a>GetDiscoveredResourceCounts</a> action, you might not immediately receive resource
     * counts in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You are a new Config customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * You just enabled resource recording.
     * </p>
     * </li>
     * </ul>
     * <p>
     * It might take a few minutes for Config to record and count your resources. Wait a few minutes and then retry the
     * <a>GetDiscoveredResourceCounts</a> action.
     * </p>
     * </note>
     * 
     * @param getDiscoveredResourceCountsRequest
     * @return Result of the GetDiscoveredResourceCounts operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.GetDiscoveredResourceCounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetDiscoveredResourceCounts"
     *      target="_top">AWS API Documentation</a>
     */
    GetDiscoveredResourceCountsResult getDiscoveredResourceCounts(GetDiscoveredResourceCountsRequest getDiscoveredResourceCountsRequest);

    /**
     * <p>
     * Returns detailed status for each member account within an organization for a given organization Config rule.
     * </p>
     * 
     * @param getOrganizationConfigRuleDetailedStatusRequest
     * @return Result of the GetOrganizationConfigRuleDetailedStatus operation returned by the service.
     * @throws NoSuchOrganizationConfigRuleException
     *         The Config rule in the request is invalid. Verify that the rule is an organization Config Custom Policy
     *         rule, that the rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying
     *         again.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws OrganizationAccessDeniedException
     *         For <code>PutConfigurationAggregator</code> API, you can see this exception for the following
     *         reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         No permission to call <code>EnableAWSServiceAccess</code> API
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator cannot be updated because your Amazon Web Services Organization management
     *         account or the delegated administrator role changed. Delete this aggregator and create a new one with the
     *         current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator is associated with a previous Amazon Web Services Organization and Config
     *         cannot aggregate data with current Amazon Web Services Organization. Delete this aggregator and create a
     *         new one with the current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You are not a registered delegated administrator for Config with permissions to call
     *         <code>ListDelegatedAdministrators</code> API. Ensure that the management account registers delagated
     *         administrator for Config service principle name before the delegated administrator creates an aggregator.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all <code>OrganizationConfigRule</code> and <code>OrganizationConformancePack</code> APIs, Config
     *         throws an exception if APIs are called from member accounts. All APIs must be called from organization
     *         management account.
     * @sample AmazonConfig.GetOrganizationConfigRuleDetailedStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetOrganizationConfigRuleDetailedStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetOrganizationConfigRuleDetailedStatusResult getOrganizationConfigRuleDetailedStatus(
            GetOrganizationConfigRuleDetailedStatusRequest getOrganizationConfigRuleDetailedStatusRequest);

    /**
     * <p>
     * Returns detailed status for each member account within an organization for a given organization conformance pack.
     * </p>
     * 
     * @param getOrganizationConformancePackDetailedStatusRequest
     * @return Result of the GetOrganizationConformancePackDetailedStatus operation returned by the service.
     * @throws NoSuchOrganizationConformancePackException
     *         Config organization conformance pack that you passed in the filter does not exist.</p>
     *         <p>
     *         For DeleteOrganizationConformancePack, you tried to delete an organization conformance pack that does not
     *         exist.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws OrganizationAccessDeniedException
     *         For <code>PutConfigurationAggregator</code> API, you can see this exception for the following reasons:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         No permission to call <code>EnableAWSServiceAccess</code> API
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator cannot be updated because your Amazon Web Services Organization management
     *         account or the delegated administrator role changed. Delete this aggregator and create a new one with the
     *         current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator is associated with a previous Amazon Web Services Organization and Config
     *         cannot aggregate data with current Amazon Web Services Organization. Delete this aggregator and create a
     *         new one with the current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You are not a registered delegated administrator for Config with permissions to call
     *         <code>ListDelegatedAdministrators</code> API. Ensure that the management account registers delagated
     *         administrator for Config service principle name before the delegated administrator creates an aggregator.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all <code>OrganizationConfigRule</code> and <code>OrganizationConformancePack</code> APIs, Config
     *         throws an exception if APIs are called from member accounts. All APIs must be called from organization
     *         management account.
     * @sample AmazonConfig.GetOrganizationConformancePackDetailedStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetOrganizationConformancePackDetailedStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetOrganizationConformancePackDetailedStatusResult getOrganizationConformancePackDetailedStatus(
            GetOrganizationConformancePackDetailedStatusRequest getOrganizationConformancePackDetailedStatusRequest);

    /**
     * <p>
     * Returns the policy definition containing the logic for your organization Config Custom Policy rule.
     * </p>
     * 
     * @param getOrganizationCustomRulePolicyRequest
     * @return Result of the GetOrganizationCustomRulePolicy operation returned by the service.
     * @throws NoSuchOrganizationConfigRuleException
     *         The Config rule in the request is invalid. Verify that the rule is an organization Config Custom Policy
     *         rule, that the rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying
     *         again.
     * @throws OrganizationAccessDeniedException
     *         For <code>PutConfigurationAggregator</code> API, you can see this exception for the following
     *         reasons:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         No permission to call <code>EnableAWSServiceAccess</code> API
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator cannot be updated because your Amazon Web Services Organization management
     *         account or the delegated administrator role changed. Delete this aggregator and create a new one with the
     *         current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator is associated with a previous Amazon Web Services Organization and Config
     *         cannot aggregate data with current Amazon Web Services Organization. Delete this aggregator and create a
     *         new one with the current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You are not a registered delegated administrator for Config with permissions to call
     *         <code>ListDelegatedAdministrators</code> API. Ensure that the management account registers delagated
     *         administrator for Config service principle name before the delegated administrator creates an aggregator.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all <code>OrganizationConfigRule</code> and <code>OrganizationConformancePack</code> APIs, Config
     *         throws an exception if APIs are called from member accounts. All APIs must be called from organization
     *         management account.
     * @sample AmazonConfig.GetOrganizationCustomRulePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetOrganizationCustomRulePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetOrganizationCustomRulePolicyResult getOrganizationCustomRulePolicy(GetOrganizationCustomRulePolicyRequest getOrganizationCustomRulePolicyRequest);

    /**
     * <p>
     * Returns a list of <code>ConfigurationItems</code> for the specified resource. The list contains details about
     * each state of the resource during the specified time interval. If you specified a retention period to retain your
     * <code>ConfigurationItems</code> between a minimum of 30 days and a maximum of 7 years (2557 days), Config returns
     * the <code>ConfigurationItems</code> for the specified retention period.
     * </p>
     * <p>
     * The response is paginated. By default, Config returns a limit of 10 configuration items per page. You can
     * customize this number with the <code>limit</code> parameter. The response includes a <code>nextToken</code>
     * string. To get the next page of results, run the request again and specify the string for the
     * <code>nextToken</code> parameter.
     * </p>
     * <note>
     * <p>
     * Each call to the API is limited to span a duration of seven days. It is likely that the number of records
     * returned is smaller than the specified <code>limit</code>. In such cases, you can make another call, using the
     * <code>nextToken</code>.
     * </p>
     * </note>
     * 
     * @param getResourceConfigHistoryRequest
     *        The input for the <a>GetResourceConfigHistory</a> action.
     * @return Result of the GetResourceConfigHistory operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws InvalidTimeRangeException
     *         The specified time range is invalid. The earlier time is not chronologically before the later time.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the role needed to describe your resources.
     *         Create a configuration recorder.
     * @throws ResourceNotDiscoveredException
     *         You have specified a resource that is either unknown or has not been discovered.
     * @sample AmazonConfig.GetResourceConfigHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetResourceConfigHistory"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceConfigHistoryResult getResourceConfigHistory(GetResourceConfigHistoryRequest getResourceConfigHistoryRequest);

    /**
     * <p>
     * Returns a summary of resource evaluation for the specified resource evaluation ID from the proactive rules that
     * were run. The results indicate which evaluation context was used to evaluate the rules, which resource details
     * were evaluated, the evaluation mode that was run, and whether the resource details comply with the configuration
     * of the proactive rules.
     * </p>
     * 
     * @param getResourceEvaluationSummaryRequest
     * @return Result of the GetResourceEvaluationSummary operation returned by the service.
     * @throws ResourceNotFoundException
     *         You have specified a resource that does not exist.
     * @sample AmazonConfig.GetResourceEvaluationSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetResourceEvaluationSummary"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceEvaluationSummaryResult getResourceEvaluationSummary(GetResourceEvaluationSummaryRequest getResourceEvaluationSummaryRequest);

    /**
     * <p>
     * Returns the details of a specific stored query.
     * </p>
     * 
     * @param getStoredQueryRequest
     * @return Result of the GetStoredQuery operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws ResourceNotFoundException
     *         You have specified a resource that does not exist.
     * @sample AmazonConfig.GetStoredQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetStoredQuery" target="_top">AWS API
     *      Documentation</a>
     */
    GetStoredQueryResult getStoredQuery(GetStoredQueryRequest getStoredQueryRequest);

    /**
     * <p>
     * Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource
     * type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom
     * resource name, source account, and source region. You can narrow the results to include only resources that have
     * specific resource IDs, or a resource name, or source account ID, or source region.
     * </p>
     * <p>
     * For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type
     * <code>AWS::EC2::Instance</code> then the API returns all the EC2 instance identifiers of accountID 12345678910
     * and region us-east-1.
     * </p>
     * 
     * @param listAggregateDiscoveredResourcesRequest
     * @return Result of the ListAggregateDiscoveredResources operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @sample AmazonConfig.ListAggregateDiscoveredResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListAggregateDiscoveredResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListAggregateDiscoveredResourcesResult listAggregateDiscoveredResources(ListAggregateDiscoveredResourcesRequest listAggregateDiscoveredResourcesRequest);

    /**
     * <p>
     * Returns a list of conformance pack compliance scores. A compliance score is the percentage of the number of
     * compliant rule-resource combinations in a conformance pack compared to the number of total possible rule-resource
     * combinations in the conformance pack. This metric provides you with a high-level view of the compliance state of
     * your conformance packs. You can use it to identify, investigate, and understand the level of compliance in your
     * conformance packs.
     * </p>
     * <note>
     * <p>
     * Conformance packs with no evaluation results will have a compliance score of <code>INSUFFICIENT_DATA</code>.
     * </p>
     * </note>
     * 
     * @param listConformancePackComplianceScoresRequest
     * @return Result of the ListConformancePackComplianceScores operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.ListConformancePackComplianceScores
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListConformancePackComplianceScores"
     *      target="_top">AWS API Documentation</a>
     */
    ListConformancePackComplianceScoresResult listConformancePackComplianceScores(
            ListConformancePackComplianceScoresRequest listConformancePackComplianceScoresRequest);

    /**
     * <p>
     * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource
     * identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of
     * resources that Config has discovered, including those that Config is not currently recording. You can narrow the
     * results to include only resources that have specific resource IDs or a resource name.
     * </p>
     * <note>
     * <p>
     * You can specify either resource IDs or a resource name, but not both, in the same request.
     * </p>
     * </note>
     * <p>
     * The response is paginated. By default, Config lists 100 resource identifiers on each page. You can customize this
     * number with the <code>limit</code> parameter. The response includes a <code>nextToken</code> string. To get the
     * next page of results, run the request again and specify the string for the <code>nextToken</code> parameter.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @return Result of the ListDiscoveredResources operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the role needed to describe your resources.
     *         Create a configuration recorder.
     * @sample AmazonConfig.ListDiscoveredResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListDiscoveredResources" target="_top">AWS
     *      API Documentation</a>
     */
    ListDiscoveredResourcesResult listDiscoveredResources(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest);

    /**
     * <p>
     * Returns a list of proactive resource evaluations.
     * </p>
     * 
     * @param listResourceEvaluationsRequest
     * @return Result of the ListResourceEvaluations operation returned by the service.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InvalidTimeRangeException
     *         The specified time range is invalid. The earlier time is not chronologically before the later time.
     * @sample AmazonConfig.ListResourceEvaluations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListResourceEvaluations" target="_top">AWS
     *      API Documentation</a>
     */
    ListResourceEvaluationsResult listResourceEvaluations(ListResourceEvaluationsRequest listResourceEvaluationsRequest);

    /**
     * <p>
     * Lists the stored queries for a single Amazon Web Services account and a single Amazon Web Services Region. The
     * default is 100.
     * </p>
     * 
     * @param listStoredQueriesRequest
     * @return Result of the ListStoredQueries operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.ListStoredQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListStoredQueries" target="_top">AWS API
     *      Documentation</a>
     */
    ListStoredQueriesResult listStoredQueries(ListStoredQueriesRequest listStoredQueriesRequest);

    /**
     * <p>
     * List the tags for Config resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         You have specified a resource that does not exist.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Authorizes the aggregator account and region to collect data from the source account and region.
     * </p>
     * 
     * @param putAggregationAuthorizationRequest
     * @return Result of the PutAggregationAuthorization operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.PutAggregationAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutAggregationAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    PutAggregationAuthorizationResult putAggregationAuthorization(PutAggregationAuthorizationRequest putAggregationAuthorizationRequest);

    /**
     * <p>
     * Adds or updates an Config rule to evaluate if your Amazon Web Services resources comply with your desired
     * configurations. For information on how many Config rules you can have per account, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/configlimits.html"> <b>Service Limits</b> </a> in
     * the <i>Config Developer Guide</i>.
     * </p>
     * <p>
     * There are two types of rules: Config Custom Rules and Config Managed Rules. You can use
     * <code>PutConfigRule</code> to create both Config custom rules and Config managed rules.
     * </p>
     * <p>
     * Custom rules are rules that you can create using either Guard or Lambda functions. Guard (<a
     * href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub Repository</a>) is a
     * policy-as-code language that allows you to write policies that are enforced by Config Custom Policy rules. Lambda
     * uses custom code that you upload to evaluate a custom rule. If you are adding a new Custom Lambda rule, you first
     * need to create an Lambda function that the rule invokes to evaluate your resources. When you use
     * <code>PutConfigRule</code> to add a Custom Lambda rule to Config, you must specify the Amazon Resource Name (ARN)
     * that Lambda assigns to the function. You specify the ARN in the <code>SourceIdentifier</code> key. This key is
     * part of the <code>Source</code> object, which is part of the <code>ConfigRule</code> object.
     * </p>
     * <p>
     * Managed rules are predefined, customizable rules created by Config. For a list of managed rules, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">List of Config
     * Managed Rules</a>. If you are adding an Config managed rule, you must specify the rule's identifier for the
     * <code>SourceIdentifier</code> key.
     * </p>
     * <p>
     * For any new rule that you add, specify the <code>ConfigRuleName</code> in the <code>ConfigRule</code> object. Do
     * not specify the <code>ConfigRuleArn</code> or the <code>ConfigRuleId</code>. These values are generated by Config
     * for new rules.
     * </p>
     * <p>
     * If you are updating a rule that you added previously, you can specify the rule by <code>ConfigRuleName</code>,
     * <code>ConfigRuleId</code>, or <code>ConfigRuleArn</code> in the <code>ConfigRule</code> data type that you use in
     * this request.
     * </p>
     * <p>
     * For more information about developing and using Config rules, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html">Evaluating Amazon Web
     * Services resource Configurations with Config</a> in the <i>Config Developer Guide</i>.
     * </p>
     * 
     * @param putConfigRuleRequest
     * @return Result of the PutConfigRule operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws MaxNumberOfConfigRulesExceededException
     *         Failed to add the Config rule because the account already contains the maximum number of 150 rules.
     *         Consider deleting any deactivated rules before you add new rules.
     * @throws ResourceInUseException
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization Config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization Config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to Config lacks permissions
     *         to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization Config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have the following permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You do not have permission to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You do not have permission to read Amazon S3 bucket or call SSM:GetDocument.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the role needed to describe your resources.
     *         Create a configuration recorder.
     * @sample AmazonConfig.PutConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigRule" target="_top">AWS API
     *      Documentation</a>
     */
    PutConfigRuleResult putConfigRule(PutConfigRuleRequest putConfigRuleRequest);

    /**
     * <p>
     * Creates and updates the configuration aggregator with the selected source accounts and regions. The source
     * account can be individual account(s) or an organization.
     * </p>
     * <p>
     * <code>accountIds</code> that are passed will be replaced with existing accounts. If you want to add additional
     * accounts into the aggregator, call <code>DescribeConfigurationAggregators</code> to get the previous accounts and
     * then append new ones.
     * </p>
     * <note>
     * <p>
     * Config should be enabled in source accounts and regions you want to aggregate.
     * </p>
     * <p>
     * If your source type is an organization, you must be signed in to the management account or a registered delegated
     * administrator and all the features must be enabled in your organization. If the caller is a management account,
     * Config calls <code>EnableAwsServiceAccess</code> API to enable integration between Config and Organizations. If
     * the caller is a registered delegated administrator, Config calls <code>ListDelegatedAdministrators</code> API to
     * verify whether the caller is a valid delegated administrator.
     * </p>
     * <p>
     * To register a delegated administrator, see <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/set-up-aggregator-cli.html#register-a-delegated-administrator-cli"
     * >Register a Delegated Administrator</a> in the <i>Config developer guide</i>.
     * </p>
     * </note>
     * 
     * @param putConfigurationAggregatorRequest
     * @return Result of the PutConfigurationAggregator operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws LimitExceededException
     *         For <code>StartConfigRulesEvaluation</code> API, this exception is thrown if an evaluation is in progress
     *         or if you call the <a>StartConfigRulesEvaluation</a> API more than once per minute.</p>
     *         <p>
     *         For <code>PutConfigurationAggregator</code> API, this exception is thrown if the number of accounts and
     *         aggregators exceeds the limit.
     * @throws InvalidRoleException
     *         You have provided a null or empty role ARN.
     * @throws OrganizationAccessDeniedException
     *         For <code>PutConfigurationAggregator</code> API, you can see this exception for the following reasons:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         No permission to call <code>EnableAWSServiceAccess</code> API
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator cannot be updated because your Amazon Web Services Organization management
     *         account or the delegated administrator role changed. Delete this aggregator and create a new one with the
     *         current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator is associated with a previous Amazon Web Services Organization and Config
     *         cannot aggregate data with current Amazon Web Services Organization. Delete this aggregator and create a
     *         new one with the current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You are not a registered delegated administrator for Config with permissions to call
     *         <code>ListDelegatedAdministrators</code> API. Ensure that the management account registers delagated
     *         administrator for Config service principle name before the delegated administrator creates an aggregator.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all <code>OrganizationConfigRule</code> and <code>OrganizationConformancePack</code> APIs, Config
     *         throws an exception if APIs are called from member accounts. All APIs must be called from organization
     *         management account.
     * @throws NoAvailableOrganizationException
     *         Organization is no longer available.
     * @throws OrganizationAllFeaturesNotEnabledException
     *         Config resource cannot be created because your organization does not have all features enabled.
     * @sample AmazonConfig.PutConfigurationAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigurationAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    PutConfigurationAggregatorResult putConfigurationAggregator(PutConfigurationAggregatorRequest putConfigurationAggregatorRequest);

    /**
     * <p>
     * Creates a new configuration recorder to record the selected resource configurations.
     * </p>
     * <p>
     * You can use this action to change the role <code>roleARN</code> or the <code>recordingGroup</code> of an existing
     * recorder. To change the role, call the action on the existing configuration recorder and specify a role.
     * </p>
     * <note>
     * <p>
     * Currently, you can specify only one configuration recorder per region in your account.
     * </p>
     * <p>
     * If <code>ConfigurationRecorder</code> does not have the <b>recordingGroup</b> parameter specified, the default is
     * to record all supported resource types.
     * </p>
     * </note>
     * 
     * @param putConfigurationRecorderRequest
     *        The input for the <a>PutConfigurationRecorder</a> action.
     * @return Result of the PutConfigurationRecorder operation returned by the service.
     * @throws MaxNumberOfConfigurationRecordersExceededException
     *         You have reached the limit of the number of recorders you can create.
     * @throws InvalidConfigurationRecorderNameException
     *         You have provided a configuration recorder name that is not valid.
     * @throws InvalidRoleException
     *         You have provided a null or empty role ARN.
     * @throws InvalidRecordingGroupException
     *         Config throws an exception if the recording group does not contain a valid list of resource types.
     *         Invalid values might also be incorrectly formatted.
     * @sample AmazonConfig.PutConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    PutConfigurationRecorderResult putConfigurationRecorder(PutConfigurationRecorderRequest putConfigurationRecorderRequest);

    /**
     * <p>
     * Creates or updates a conformance pack. A conformance pack is a collection of Config rules that can be easily
     * deployed in an account and a region and across an organization. For information on how many conformance packs you
     * can have per account, see <a href="https://docs.aws.amazon.com/config/latest/developerguide/configlimits.html">
     * <b>Service Limits</b> </a> in the Config Developer Guide.
     * </p>
     * <p>
     * This API creates a service-linked role <code>AWSServiceRoleForConfigConforms</code> in your account. The
     * service-linked role is created only when the role does not exist in your account.
     * </p>
     * <note>
     * <p>
     * You must specify only one of the follow parameters: <code>TemplateS3Uri</code>, <code>TemplateBody</code> or
     * <code>TemplateSSMDocumentDetails</code>.
     * </p>
     * </note>
     * 
     * @param putConformancePackRequest
     * @return Result of the PutConformancePack operation returned by the service.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to Config lacks permissions
     *         to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization Config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have the following permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You do not have permission to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You do not have permission to read Amazon S3 bucket or call SSM:GetDocument.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @throws ConformancePackTemplateValidationException
     *         You have specified a template that is invalid or supported.
     * @throws ResourceInUseException
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization Config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization Config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws MaxNumberOfConformancePacksExceededException
     *         You have reached the limit of the number of conformance packs you can create in an account. For more
     *         information, see <a href="https://docs.aws.amazon.com/config/latest/developerguide/configlimits.html">
     *         <b>Service Limits</b> </a> in the Config Developer Guide.
     * @sample AmazonConfig.PutConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConformancePack" target="_top">AWS API
     *      Documentation</a>
     */
    PutConformancePackResult putConformancePack(PutConformancePackRequest putConformancePackRequest);

    /**
     * <p>
     * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS
     * topic.
     * </p>
     * <p>
     * Before you can create a delivery channel, you must create a configuration recorder.
     * </p>
     * <p>
     * You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel.
     * To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3
     * bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action
     * will keep the existing value for the parameter that is not changed.
     * </p>
     * <note>
     * <p>
     * You can have only one delivery channel per region in your account.
     * </p>
     * </note>
     * 
     * @param putDeliveryChannelRequest
     *        The input for the <a>PutDeliveryChannel</a> action.
     * @return Result of the PutDeliveryChannel operation returned by the service.
     * @throws MaxNumberOfDeliveryChannelsExceededException
     *         You have reached the limit of the number of delivery channels you can create.
     * @throws NoAvailableConfigurationRecorderException
     *         There are no configuration recorders available to provide the role needed to describe your resources.
     *         Create a configuration recorder.
     * @throws InvalidDeliveryChannelNameException
     *         The specified delivery channel name is invalid.
     * @throws NoSuchBucketException
     *         The specified Amazon S3 bucket does not exist.
     * @throws InvalidS3KeyPrefixException
     *         The specified Amazon S3 key prefix is invalid.
     * @throws InvalidS3KmsKeyArnException
     *         The specified Amazon KMS Key ARN is invalid.
     * @throws InvalidSNSTopicARNException
     *         The specified Amazon SNS topic does not exist.
     * @throws InsufficientDeliveryPolicyException
     *         Your Amazon S3 bucket policy does not permit Config to write to it.
     * @sample AmazonConfig.PutDeliveryChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutDeliveryChannel" target="_top">AWS API
     *      Documentation</a>
     */
    PutDeliveryChannelResult putDeliveryChannel(PutDeliveryChannelRequest putDeliveryChannelRequest);

    /**
     * <p>
     * Used by an Lambda function to deliver evaluation results to Config. This action is required in every Lambda
     * function that is invoked by an Config rule.
     * </p>
     * 
     * @param putEvaluationsRequest
     * @return Result of the PutEvaluations operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InvalidResultTokenException
     *         The specified <code>ResultToken</code> is invalid.
     * @throws NoSuchConfigRuleException
     *         The Config rule in the request is invalid. Verify that the rule is an Config Custom Policy rule, that the
     *         rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying again.
     * @sample AmazonConfig.PutEvaluations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutEvaluations" target="_top">AWS API
     *      Documentation</a>
     */
    PutEvaluationsResult putEvaluations(PutEvaluationsRequest putEvaluationsRequest);

    /**
     * <p>
     * Add or updates the evaluations for process checks. This API checks if the rule is a process check when the name
     * of the Config rule is provided.
     * </p>
     * 
     * @param putExternalEvaluationRequest
     * @return Result of the PutExternalEvaluation operation returned by the service.
     * @throws NoSuchConfigRuleException
     *         The Config rule in the request is invalid. Verify that the rule is an Config Custom Policy rule, that the
     *         rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying again.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.PutExternalEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutExternalEvaluation" target="_top">AWS
     *      API Documentation</a>
     */
    PutExternalEvaluationResult putExternalEvaluation(PutExternalEvaluationRequest putExternalEvaluationRequest);

    /**
     * <p>
     * Adds or updates an Config rule for your entire organization to evaluate if your Amazon Web Services resources
     * comply with your desired configurations. For information on how many organization Config rules you can have per
     * account, see <a href="https://docs.aws.amazon.com/config/latest/developerguide/configlimits.html"> <b>Service
     * Limits</b> </a> in the <i>Config Developer Guide</i>.
     * </p>
     * <p>
     * Only a management account and a delegated administrator can create or update an organization Config rule. When
     * calling this API with a delegated administrator, you must ensure Organizations
     * <code>ListDelegatedAdministrator</code> permissions are added. An organization can have up to 3 delegated
     * administrators.
     * </p>
     * <p>
     * This API enables organization service access through the <code>EnableAWSServiceAccess</code> action and creates a
     * service-linked role <code>AWSServiceRoleForConfigMultiAccountSetup</code> in the management or delegated
     * administrator account of your organization. The service-linked role is created only when the role does not exist
     * in the caller account. Config verifies the existence of role with <code>GetRole</code> action.
     * </p>
     * <p>
     * To use this API with delegated administrator, register a delegated administrator by calling Amazon Web Services
     * Organization <code>register-delegated-administrator</code> for
     * <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <p>
     * There are two types of rules: Config Custom Rules and Config Managed Rules. You can use
     * <code>PutOrganizationConfigRule</code> to create both Config custom rules and Config managed rules.
     * </p>
     * <p>
     * Custom rules are rules that you can create using either Guard or Lambda functions. Guard (<a
     * href="https://github.com/aws-cloudformation/cloudformation-guard">Guard GitHub Repository</a>) is a
     * policy-as-code language that allows you to write policies that are enforced by Config Custom Policy rules. Lambda
     * uses custom code that you upload to evaluate a custom rule. If you are adding a new Custom Lambda rule, you first
     * need to create an Lambda function in the management account or a delegated administrator that the rule invokes to
     * evaluate your resources. You also need to create an IAM role in the managed account that can be assumed by the
     * Lambda function. When you use <code>PutOrganizationConfigRule</code> to add a Custom Lambda rule to Config, you
     * must specify the Amazon Resource Name (ARN) that Lambda assigns to the function.
     * </p>
     * <p>
     * Managed rules are predefined, customizable rules created by Config. For a list of managed rules, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html">List of Config
     * Managed Rules</a>. If you are adding an Config managed rule, you must specify the rule's identifier for the
     * <code>RuleIdentifier</code> key.
     * </p>
     * <note>
     * <p>
     * Prerequisite: Ensure you call <code>EnableAllFeatures</code> API to enable all features in an organization.
     * </p>
     * <p>
     * Make sure to specify one of either <code>OrganizationCustomPolicyRuleMetadata</code> for Custom Policy rules,
     * <code>OrganizationCustomRuleMetadata</code> for Custom Lambda rules, or
     * <code>OrganizationManagedRuleMetadata</code> for managed rules.
     * </p>
     * </note>
     * 
     * @param putOrganizationConfigRuleRequest
     * @return Result of the PutOrganizationConfigRule operation returned by the service.
     * @throws MaxNumberOfOrganizationConfigRulesExceededException
     *         You have reached the limit of the number of organization Config rules you can create. For more
     *         information, see see <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/configlimits.html"> <b>Service Limits</b>
     *         </a> in the Config Developer Guide.
     * @throws ResourceInUseException
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization Config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization Config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws OrganizationAccessDeniedException
     *         For <code>PutConfigurationAggregator</code> API, you can see this exception for the following reasons:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         No permission to call <code>EnableAWSServiceAccess</code> API
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator cannot be updated because your Amazon Web Services Organization management
     *         account or the delegated administrator role changed. Delete this aggregator and create a new one with the
     *         current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator is associated with a previous Amazon Web Services Organization and Config
     *         cannot aggregate data with current Amazon Web Services Organization. Delete this aggregator and create a
     *         new one with the current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You are not a registered delegated administrator for Config with permissions to call
     *         <code>ListDelegatedAdministrators</code> API. Ensure that the management account registers delagated
     *         administrator for Config service principle name before the delegated administrator creates an aggregator.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all <code>OrganizationConfigRule</code> and <code>OrganizationConformancePack</code> APIs, Config
     *         throws an exception if APIs are called from member accounts. All APIs must be called from organization
     *         management account.
     * @throws NoAvailableOrganizationException
     *         Organization is no longer available.
     * @throws OrganizationAllFeaturesNotEnabledException
     *         Config resource cannot be created because your organization does not have all features enabled.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to Config lacks permissions
     *         to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization Config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have the following permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You do not have permission to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You do not have permission to read Amazon S3 bucket or call SSM:GetDocument.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @sample AmazonConfig.PutOrganizationConfigRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutOrganizationConfigRule"
     *      target="_top">AWS API Documentation</a>
     */
    PutOrganizationConfigRuleResult putOrganizationConfigRule(PutOrganizationConfigRuleRequest putOrganizationConfigRuleRequest);

    /**
     * <p>
     * Deploys conformance packs across member accounts in an Amazon Web Services Organization. For information on how
     * many organization conformance packs and how many Config rules you can have per account, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/configlimits.html"> <b>Service Limits</b> </a> in
     * the Config Developer Guide.
     * </p>
     * <p>
     * Only a management account and a delegated administrator can call this API. When calling this API with a delegated
     * administrator, you must ensure Organizations <code>ListDelegatedAdministrator</code> permissions are added. An
     * organization can have up to 3 delegated administrators.
     * </p>
     * <p>
     * This API enables organization service access for <code>config-multiaccountsetup.amazonaws.com</code> through the
     * <code>EnableAWSServiceAccess</code> action and creates a service-linked role
     * <code>AWSServiceRoleForConfigMultiAccountSetup</code> in the management or delegated administrator account of
     * your organization. The service-linked role is created only when the role does not exist in the caller account. To
     * use this API with delegated administrator, register a delegated administrator by calling Amazon Web Services
     * Organization <code>register-delegate-admin</code> for <code>config-multiaccountsetup.amazonaws.com</code>.
     * </p>
     * <note>
     * <p>
     * Prerequisite: Ensure you call <code>EnableAllFeatures</code> API to enable all features in an organization.
     * </p>
     * <p>
     * You must specify either the <code>TemplateS3Uri</code> or the <code>TemplateBody</code> parameter, but not both.
     * If you provide both Config uses the <code>TemplateS3Uri</code> parameter and ignores the
     * <code>TemplateBody</code> parameter.
     * </p>
     * <p>
     * Config sets the state of a conformance pack to CREATE_IN_PROGRESS and UPDATE_IN_PROGRESS until the conformance
     * pack is created or updated. You cannot update a conformance pack while it is in this state.
     * </p>
     * </note>
     * 
     * @param putOrganizationConformancePackRequest
     * @return Result of the PutOrganizationConformancePack operation returned by the service.
     * @throws MaxNumberOfOrganizationConformancePacksExceededException
     *         You have reached the limit of the number of organization conformance packs you can create in an account.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/configlimits.html"> <b>Service Limits</b>
     *         </a> in the Config Developer Guide.
     * @throws ResourceInUseException
     *         You see this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization Config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization Config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws OrganizationAccessDeniedException
     *         For <code>PutConfigurationAggregator</code> API, you can see this exception for the following reasons:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         No permission to call <code>EnableAWSServiceAccess</code> API
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator cannot be updated because your Amazon Web Services Organization management
     *         account or the delegated administrator role changed. Delete this aggregator and create a new one with the
     *         current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The configuration aggregator is associated with a previous Amazon Web Services Organization and Config
     *         cannot aggregate data with current Amazon Web Services Organization. Delete this aggregator and create a
     *         new one with the current Amazon Web Services Organization.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You are not a registered delegated administrator for Config with permissions to call
     *         <code>ListDelegatedAdministrators</code> API. Ensure that the management account registers delagated
     *         administrator for Config service principle name before the delegated administrator creates an aggregator.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all <code>OrganizationConfigRule</code> and <code>OrganizationConformancePack</code> APIs, Config
     *         throws an exception if APIs are called from member accounts. All APIs must be called from organization
     *         management account.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to Config lacks permissions
     *         to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization Config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have the following permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You do not have permission to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You do not have permission to read Amazon S3 bucket or call SSM:GetDocument.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @throws OrganizationConformancePackTemplateValidationException
     *         You have specified a template that is invalid or supported.
     * @throws OrganizationAllFeaturesNotEnabledException
     *         Config resource cannot be created because your organization does not have all features enabled.
     * @throws NoAvailableOrganizationException
     *         Organization is no longer available.
     * @sample AmazonConfig.PutOrganizationConformancePack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutOrganizationConformancePack"
     *      target="_top">AWS API Documentation</a>
     */
    PutOrganizationConformancePackResult putOrganizationConformancePack(PutOrganizationConformancePackRequest putOrganizationConformancePackRequest);

    /**
     * <p>
     * Adds or updates the remediation configuration with a specific Config rule with the selected target or action. The
     * API creates the <code>RemediationConfiguration</code> object for the Config rule. The Config rule must already
     * exist for you to add a remediation configuration. The target (SSM document) must exist and have permissions to
     * use the target.
     * </p>
     * <note>
     * <p>
     * If you make backward incompatible changes to the SSM document, you must call this again to ensure the
     * remediations can run.
     * </p>
     * <p>
     * This API does not support adding remediation configurations for service-linked Config Rules such as Organization
     * Config rules, the rules deployed by conformance packs, and rules deployed by Amazon Web Services Security Hub.
     * </p>
     * </note> <note>
     * <p>
     * For manual remediation configuration, you need to provide a value for <code>automationAssumeRole</code> or use a
     * value in the <code>assumeRole</code>field to remediate your resources. The SSM automation document can use either
     * as long as it maps to a valid parameter.
     * </p>
     * <p>
     * However, for automatic remediation configuration, the only valid <code>assumeRole</code> field value is
     * <code>AutomationAssumeRole</code> and you need to provide a value for <code>AutomationAssumeRole</code> to
     * remediate your resources.
     * </p>
     * </note>
     * 
     * @param putRemediationConfigurationsRequest
     * @return Result of the PutRemediationConfigurations operation returned by the service.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to Config lacks permissions
     *         to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization Config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have the following permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You do not have permission to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You do not have permission to read Amazon S3 bucket or call SSM:GetDocument.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.PutRemediationConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutRemediationConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    PutRemediationConfigurationsResult putRemediationConfigurations(PutRemediationConfigurationsRequest putRemediationConfigurationsRequest);

    /**
     * <p>
     * A remediation exception is when a specific resource is no longer considered for auto-remediation. This API adds a
     * new exception or updates an existing exception for a specific resource with a specific Config rule.
     * </p>
     * <note>
     * <p>
     * Config generates a remediation exception when a problem occurs executing a remediation action to a specific
     * resource. Remediation exceptions blocks auto-remediation until the exception is cleared.
     * </p>
     * </note> <note>
     * <p>
     * To place an exception on an Amazon Web Services resource, ensure remediation is set as manual remediation.
     * </p>
     * </note>
     * 
     * @param putRemediationExceptionsRequest
     * @return Result of the PutRemediationExceptions operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to Config lacks permissions
     *         to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization Config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have the following permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You do not have permission to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You do not have permission to read Amazon S3 bucket or call SSM:GetDocument.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @sample AmazonConfig.PutRemediationExceptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutRemediationExceptions"
     *      target="_top">AWS API Documentation</a>
     */
    PutRemediationExceptionsResult putRemediationExceptions(PutRemediationExceptionsRequest putRemediationExceptionsRequest);

    /**
     * <p>
     * Records the configuration state for the resource provided in the request. The configuration state of a resource
     * is represented in Config as Configuration Items. Once this API records the configuration item, you can retrieve
     * the list of configuration items for the custom resource type using existing Config APIs.
     * </p>
     * <note>
     * <p>
     * The custom resource type must be registered with CloudFormation. This API accepts the configuration item
     * registered with CloudFormation.
     * </p>
     * <p>
     * When you call this API, Config only stores configuration state of the resource provided in the request. This API
     * does not change or remediate the configuration of the resource.
     * </p>
     * <p>
     * Write-only schema properites are not recorded as part of the published configuration item.
     * </p>
     * </note>
     * 
     * @param putResourceConfigRequest
     * @return Result of the PutResourceConfig operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to Config lacks permissions
     *         to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization Config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have the following permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You do not have permission to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You do not have permission to read Amazon S3 bucket or call SSM:GetDocument.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @throws NoRunningConfigurationRecorderException
     *         There is no configuration recorder running.
     * @throws MaxActiveResourcesExceededException
     *         You have reached the limit of active custom resource types in your account. There is a limit of 100,000.
     *         Delete unused resources using <a
     *         href="https://docs.aws.amazon.com/config/latest/APIReference/API_DeleteResourceConfig.html"
     *         >DeleteResourceConfig</a> <code/>.
     * @sample AmazonConfig.PutResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutResourceConfig" target="_top">AWS API
     *      Documentation</a>
     */
    PutResourceConfigResult putResourceConfig(PutResourceConfigRequest putResourceConfigRequest);

    /**
     * <p>
     * Creates and updates the retention configuration with details about retention period (number of days) that Config
     * stores your historical information. The API creates the <code>RetentionConfiguration</code> object and names the
     * object as <b>default</b>. When you have a <code>RetentionConfiguration</code> object named <b>default</b>,
     * calling the API modifies the default object.
     * </p>
     * <note>
     * <p>
     * Currently, Config supports only one retention configuration per region in your account.
     * </p>
     * </note>
     * 
     * @param putRetentionConfigurationRequest
     * @return Result of the PutRetentionConfiguration operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws MaxNumberOfRetentionConfigurationsExceededException
     *         Failed to add the retention configuration because a retention configuration with that name already
     *         exists.
     * @sample AmazonConfig.PutRetentionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutRetentionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutRetentionConfigurationResult putRetentionConfiguration(PutRetentionConfigurationRequest putRetentionConfigurationRequest);

    /**
     * <p>
     * Saves a new query or updates an existing saved query. The <code>QueryName</code> must be unique for a single
     * Amazon Web Services account and a single Amazon Web Services Region. You can create upto 300 queries in a single
     * Amazon Web Services account and a single Amazon Web Services Region.
     * </p>
     * 
     * @param putStoredQueryRequest
     * @return Result of the PutStoredQuery operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws TooManyTagsException
     *         You have reached the limit of the number of tags you can use. For more information, see <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/configlimits.html"> <b>Service Limits</b>
     *         </a> in the Config Developer Guide.
     * @throws ResourceConcurrentModificationException
     *         Two users are trying to modify the same query at the same time. Wait for a moment and try again.
     * @sample AmazonConfig.PutStoredQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutStoredQuery" target="_top">AWS API
     *      Documentation</a>
     */
    PutStoredQueryResult putStoredQuery(PutStoredQueryRequest putStoredQueryRequest);

    /**
     * <p>
     * Accepts a structured query language (SQL) SELECT command and an aggregator to query configuration state of Amazon
     * Web Services resources across multiple accounts and regions, performs the corresponding search, and returns
     * resource configurations matching the properties.
     * </p>
     * <p>
     * For more information about query components, see the <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/query-components.html"> <b>Query Components</b>
     * </a> section in the Config Developer Guide.
     * </p>
     * <note>
     * <p>
     * If you run an aggregation query (i.e., using <code>GROUP BY</code> or using aggregate functions such as
     * <code>COUNT</code>; e.g.,
     * <code>SELECT resourceId, COUNT(*) WHERE resourceType = 'AWS::IAM::Role' GROUP BY resourceId</code>) and do not
     * specify the <code>MaxResults</code> or the <code>Limit</code> query parameters, the default page size is set to
     * 500.
     * </p>
     * <p>
     * If you run a non-aggregation query (i.e., not using <code>GROUP BY</code> or aggregate function; e.g.,
     * <code>SELECT * WHERE resourceType = 'AWS::IAM::Role'</code>) and do not specify the <code>MaxResults</code> or
     * the <code>Limit</code> query parameters, the default page size is set to 25.
     * </p>
     * </note>
     * 
     * @param selectAggregateResourceConfigRequest
     * @return Result of the SelectAggregateResourceConfig operation returned by the service.
     * @throws InvalidExpressionException
     *         The syntax of the query is incorrect.
     * @throws NoSuchConfigurationAggregatorException
     *         You have specified a configuration aggregator that does not exist.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.SelectAggregateResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/SelectAggregateResourceConfig"
     *      target="_top">AWS API Documentation</a>
     */
    SelectAggregateResourceConfigResult selectAggregateResourceConfig(SelectAggregateResourceConfigRequest selectAggregateResourceConfigRequest);

    /**
     * <p>
     * Accepts a structured query language (SQL) <code>SELECT</code> command, performs the corresponding search, and
     * returns resource configurations matching the properties.
     * </p>
     * <p>
     * For more information about query components, see the <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/query-components.html"> <b>Query Components</b>
     * </a> section in the <i>Config Developer Guide</i>.
     * </p>
     * 
     * @param selectResourceConfigRequest
     * @return Result of the SelectResourceConfig operation returned by the service.
     * @throws InvalidExpressionException
     *         The syntax of the query is incorrect.
     * @throws InvalidLimitException
     *         The specified limit is outside the allowable range.
     * @throws InvalidNextTokenException
     *         The specified next token is invalid. Specify the <code>nextToken</code> string that was returned in the
     *         previous response to get the next page of results.
     * @sample AmazonConfig.SelectResourceConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/SelectResourceConfig" target="_top">AWS
     *      API Documentation</a>
     */
    SelectResourceConfigResult selectResourceConfig(SelectResourceConfigRequest selectResourceConfigRequest);

    /**
     * <p>
     * Runs an on-demand evaluation for the specified Config rules against the last known configuration state of the
     * resources. Use <code>StartConfigRulesEvaluation</code> when you want to test that a rule you updated is working
     * as expected. <code>StartConfigRulesEvaluation</code> does not re-record the latest configuration state for your
     * resources. It re-runs an evaluation against the last known state of your resources.
     * </p>
     * <p>
     * You can specify up to 25 Config rules per request.
     * </p>
     * <p>
     * An existing <code>StartConfigRulesEvaluation</code> call for the specified rules must complete before you can
     * call the API again. If you chose to have Config stream to an Amazon SNS topic, you will receive a
     * <code>ConfigRuleEvaluationStarted</code> notification when the evaluation starts.
     * </p>
     * <note>
     * <p>
     * You don't need to call the <code>StartConfigRulesEvaluation</code> API to run an evaluation for a new rule. When
     * you create a rule, Config evaluates your resources against the rule automatically.
     * </p>
     * </note>
     * <p>
     * The <code>StartConfigRulesEvaluation</code> API is useful if you want to run on-demand evaluations, such as the
     * following example:
     * </p>
     * <ol>
     * <li>
     * <p>
     * You have a custom rule that evaluates your IAM resources every 24 hours.
     * </p>
     * </li>
     * <li>
     * <p>
     * You update your Lambda function to add additional conditions to your rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * Instead of waiting for the next periodic evaluation, you call the <code>StartConfigRulesEvaluation</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * Config invokes your Lambda function and evaluates your IAM resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your custom rule will still run periodic evaluations every 24 hours.
     * </p>
     * </li>
     * </ol>
     * 
     * @param startConfigRulesEvaluationRequest
     * @return Result of the StartConfigRulesEvaluation operation returned by the service.
     * @throws NoSuchConfigRuleException
     *         The Config rule in the request is invalid. Verify that the rule is an Config Custom Policy rule, that the
     *         rule name is correct, and that valid Amazon Resouce Names (ARNs) are used before trying again.
     * @throws LimitExceededException
     *         For <code>StartConfigRulesEvaluation</code> API, this exception is thrown if an evaluation is in progress
     *         or if you call the <a>StartConfigRulesEvaluation</a> API more than once per minute.</p>
     *         <p>
     *         For <code>PutConfigurationAggregator</code> API, this exception is thrown if the number of accounts and
     *         aggregators exceeds the limit.
     * @throws ResourceInUseException
     *         You see this exception in the following cases:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, Config is deleting this rule. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, the rule is deleting your evaluation results. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConfigRule, a remediation action is associated with the rule and Config cannot delete this
     *         rule. Delete the remediation action associated with the rule before deleting the rule and try your
     *         request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigOrganizationRule, organization Config rule deletion is in progress. Try your request again
     *         later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteOrganizationConfigRule, organization Config rule creation is in progress. Try your request
     *         again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack creation, update, and
     *         deletion is in progress. Try your request again later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For DeleteConformancePack, a conformance pack creation, update, and deletion is in progress. Try your
     *         request again later.
     *         </p>
     *         </li>
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @sample AmazonConfig.StartConfigRulesEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartConfigRulesEvaluation"
     *      target="_top">AWS API Documentation</a>
     */
    StartConfigRulesEvaluationResult startConfigRulesEvaluation(StartConfigRulesEvaluationRequest startConfigRulesEvaluationRequest);

    /**
     * <p>
     * Starts recording configurations of the Amazon Web Services resources you have selected to record in your Amazon
     * Web Services account.
     * </p>
     * <p>
     * You must have created at least one delivery channel to successfully start the configuration recorder.
     * </p>
     * 
     * @param startConfigurationRecorderRequest
     *        The input for the <a>StartConfigurationRecorder</a> action.
     * @return Result of the StartConfigurationRecorder operation returned by the service.
     * @throws NoSuchConfigurationRecorderException
     *         You have specified a configuration recorder that does not exist.
     * @throws NoAvailableDeliveryChannelException
     *         There is no delivery channel available to record configurations.
     * @sample AmazonConfig.StartConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    StartConfigurationRecorderResult startConfigurationRecorder(StartConfigurationRecorderRequest startConfigurationRecorderRequest);

    /**
     * <p>
     * Runs an on-demand remediation for the specified Config rules against the last known remediation configuration. It
     * runs an execution against the current state of your resources. Remediation execution is asynchronous.
     * </p>
     * <p>
     * You can specify up to 100 resource keys per request. An existing StartRemediationExecution call for the specified
     * resource keys must complete before you can call the API again.
     * </p>
     * 
     * @param startRemediationExecutionRequest
     * @return Result of the StartRemediationExecution operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws InsufficientPermissionsException
     *         Indicates one of the following errors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PutConfigRule, the rule cannot be created because the IAM role assigned to Config lacks permissions
     *         to perform the config:Put* action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConfigRule, the Lambda function cannot be invoked. Check the function ARN, and check the
     *         function's permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutOrganizationConfigRule, organization Config rule cannot be created because you do not have
     *         permissions to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PutConformancePack and PutOrganizationConformancePack, a conformance pack cannot be created because
     *         you do not have the following permissions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You do not have permission to call IAM <code>GetRole</code> action or create a service-linked role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You do not have permission to read Amazon S3 bucket or call SSM:GetDocument.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @throws NoSuchRemediationConfigurationException
     *         You specified an Config rule without a remediation configuration.
     * @sample AmazonConfig.StartRemediationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartRemediationExecution"
     *      target="_top">AWS API Documentation</a>
     */
    StartRemediationExecutionResult startRemediationExecution(StartRemediationExecutionRequest startRemediationExecutionRequest);

    /**
     * <p>
     * Runs an on-demand evaluation for the specified resource to determine whether the resource details will comply
     * with configured Config rules. You can also use it for evaluation purposes. Config recommends using an evaluation
     * context. It runs an execution against the resource details with all of the Config rules in your account that
     * match with the specified proactive mode and resource type.
     * </p>
     * <note>
     * <p>
     * Ensure you have the <code>cloudformation:DescribeType</code> role setup to validate the resource type schema.
     * </p>
     * </note>
     * 
     * @param startResourceEvaluationRequest
     * @return Result of the StartResourceEvaluation operation returned by the service.
     * @throws InvalidParameterValueException
     *         One or more of the specified parameters are invalid. Verify that your parameters are valid and try again.
     * @throws IdempotentParameterMismatchException
     *         Using the same client token with one or more different parameters. Specify a new client token with the
     *         parameter changes and try again.
     * @sample AmazonConfig.StartResourceEvaluation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StartResourceEvaluation" target="_top">AWS
     *      API Documentation</a>
     */
    StartResourceEvaluationResult startResourceEvaluation(StartResourceEvaluationRequest startResourceEvaluationRequest);

    /**
     * <p>
     * Stops recording configurations of the Amazon Web Services resources you have selected to record in your Amazon
     * Web Services account.
     * </p>
     * 
     * @param stopConfigurationRecorderRequest
     *        The input for the <a>StopConfigurationRecorder</a> action.
     * @return Result of the StopConfigurationRecorder operation returned by the service.
     * @throws NoSuchConfigurationRecorderException
     *         You have specified a configuration recorder that does not exist.
     * @sample AmazonConfig.StopConfigurationRecorder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/StopConfigurationRecorder"
     *      target="_top">AWS API Documentation</a>
     */
    StopConfigurationRecorderResult stopConfigurationRecorder(StopConfigurationRecorderRequest stopConfigurationRecorderRequest);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are
     * not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated
     * with that resource are deleted as well.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws ResourceNotFoundException
     *         You have specified a resource that does not exist.
     * @throws TooManyTagsException
     *         You have reached the limit of the number of tags you can use. For more information, see <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/configlimits.html"> <b>Service Limits</b>
     *         </a> in the Config Developer Guide.
     * @sample AmazonConfig.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The requested action is invalid.</p>
     *         <p>
     *         For PutStoredQuery, you will see this exception if there are missing required fields or if the input
     *         value fails the validation, or if you are trying to create more than 300 queries.
     *         </p>
     *         <p>
     *         For GetStoredQuery, ListStoredQuery, and DeleteStoredQuery you will see this exception if there are
     *         missing required fields or if the input value fails the validation.
     * @throws ResourceNotFoundException
     *         You have specified a resource that does not exist.
     * @sample AmazonConfig.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
