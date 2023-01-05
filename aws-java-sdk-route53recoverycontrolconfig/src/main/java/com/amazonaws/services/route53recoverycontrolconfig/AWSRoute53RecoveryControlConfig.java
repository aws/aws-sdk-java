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
package com.amazonaws.services.route53recoverycontrolconfig;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.route53recoverycontrolconfig.model.*;
import com.amazonaws.services.route53recoverycontrolconfig.waiters.AWSRoute53RecoveryControlConfigWaiters;

/**
 * Interface for accessing AWS Route53 Recovery Control Config.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53recoverycontrolconfig.AbstractAWSRoute53RecoveryControlConfig} instead.
 * </p>
 * <p>
 * <p>
 * Recovery Control Configuration API Reference for Amazon Route 53 Application Recovery Controller
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRoute53RecoveryControlConfig {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "route53-recovery-control-config";

    /**
     * <p>
     * Create a new cluster. A cluster is a set of redundant Regional endpoints against which you can run API calls to
     * update or get the state of one or more routing controls. Each cluster has a name, status, Amazon Resource Name
     * (ARN), and an array of the five cluster endpoints (one for each supported Amazon Web Services Region) that you
     * can use with API calls to the cluster data plane.
     * </p>
     * 
     * @param createClusterRequest
     *        Creates a cluster.
     * @return Result of the CreateCluster operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws ServiceQuotaExceededException
     *         402 response
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateCluster"
     *      target="_top">AWS API Documentation</a>
     */
    CreateClusterResult createCluster(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates a new control panel. A control panel represents a group of routing controls that can be changed together
     * in a single transaction. You can use a control panel to centrally view the operational status of applications
     * across your organization, and trigger multi-app failovers in a single transaction, for example, to fail over an
     * Availability Zone or Amazon Web Services Region.
     * </p>
     * 
     * @param createControlPanelRequest
     *        The details of the control panel that you're creating.
     * @return Result of the CreateControlPanel operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws ServiceQuotaExceededException
     *         402 response
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.CreateControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    CreateControlPanelResult createControlPanel(CreateControlPanelRequest createControlPanelRequest);

    /**
     * <p>
     * Creates a new routing control.
     * </p>
     * <p>
     * A routing control has one of two states: ON and OFF. You can map the routing control state to the state of an
     * Amazon Route 53 health check, which can be used to control traffic routing.
     * </p>
     * <p>
     * To get or update the routing control state, see the Recovery Cluster (data plane) API actions for Amazon Route 53
     * Application Recovery Controller.
     * </p>
     * 
     * @param createRoutingControlRequest
     *        The details of the routing control that you're creating.
     * @return Result of the CreateRoutingControl operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws ServiceQuotaExceededException
     *         402 response
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.CreateRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRoutingControlResult createRoutingControl(CreateRoutingControlRequest createRoutingControlRequest);

    /**
     * <p>
     * Creates a safety rule in a control panel. Safety rules let you add safeguards around changing routing control
     * states, and for enabling and disabling routing controls, to help prevent unexpected outcomes.
     * </p>
     * <p>
     * There are two types of safety rules: assertion rules and gating rules.
     * </p>
     * <p>
     * Assertion rule: An assertion rule enforces that, when you change a routing control state, that a certain criteria
     * is met. For example, the criteria might be that at least one routing control state is On after the transaction so
     * that traffic continues to flow to at least one cell for the application. This ensures that you avoid a fail-open
     * scenario.
     * </p>
     * <p>
     * Gating rule: A gating rule lets you configure a gating routing control as an overall "on/off" switch for a group
     * of routing controls. Or, you can configure more complex gating scenarios, for example by configuring multiple
     * gating routing controls.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.safety-rules.html">Safety rules</a> in
     * the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * 
     * @param createSafetyRuleRequest
     *        The request body that you include when you create a safety rule.
     * @return Result of the CreateSafetyRule operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryControlConfig.CreateSafetyRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSafetyRuleResult createSafetyRule(CreateSafetyRuleRequest createSafetyRuleRequest);

    /**
     * <p>
     * Delete a cluster.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteCluster"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteClusterResult deleteCluster(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Deletes a control panel.
     * </p>
     * 
     * @param deleteControlPanelRequest
     * @return Result of the DeleteControlPanel operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.DeleteControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteControlPanelResult deleteControlPanel(DeleteControlPanelRequest deleteControlPanelRequest);

    /**
     * <p>
     * Deletes a routing control.
     * </p>
     * 
     * @param deleteRoutingControlRequest
     * @return Result of the DeleteRoutingControl operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.DeleteRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRoutingControlResult deleteRoutingControl(DeleteRoutingControlRequest deleteRoutingControlRequest);

    /**
     * <p>
     * Deletes a safety rule.
     * </p>
     * /&gt;
     * 
     * @param deleteSafetyRuleRequest
     * @return Result of the DeleteSafetyRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryControlConfig.DeleteSafetyRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSafetyRuleResult deleteSafetyRule(DeleteSafetyRuleRequest deleteSafetyRuleRequest);

    /**
     * <p>
     * Display the details about a cluster. The response includes the cluster name, endpoints, status, and Amazon
     * Resource Name (ARN).
     * </p>
     * 
     * @param describeClusterRequest
     * @return Result of the DescribeCluster operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeCluster"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClusterResult describeCluster(DescribeClusterRequest describeClusterRequest);

    /**
     * <p>
     * Displays details about a control panel.
     * </p>
     * 
     * @param describeControlPanelRequest
     * @return Result of the DescribeControlPanel operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.DescribeControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeControlPanelResult describeControlPanel(DescribeControlPanelRequest describeControlPanelRequest);

    /**
     * <p>
     * Displays details about a routing control. A routing control has one of two states: ON and OFF. You can map the
     * routing control state to the state of an Amazon Route 53 health check, which can be used to control routing.
     * </p>
     * <p>
     * To get or update the routing control state, see the Recovery Cluster (data plane) API actions for Amazon Route 53
     * Application Recovery Controller.
     * </p>
     * 
     * @param describeRoutingControlRequest
     * @return Result of the DescribeRoutingControl operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.DescribeRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRoutingControlResult describeRoutingControl(DescribeRoutingControlRequest describeRoutingControlRequest);

    /**
     * <p>
     * Returns information about a safety rule.
     * </p>
     * 
     * @param describeSafetyRuleRequest
     * @return Result of the DescribeSafetyRule operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @sample AWSRoute53RecoveryControlConfig.DescribeSafetyRule
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSafetyRuleResult describeSafetyRule(DescribeSafetyRuleRequest describeSafetyRuleRequest);

    /**
     * <p>
     * Returns an array of all Amazon Route 53 health checks associated with a specific routing control.
     * </p>
     * 
     * @param listAssociatedRoute53HealthChecksRequest
     * @return Result of the ListAssociatedRoute53HealthChecks operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryControlConfig.ListAssociatedRoute53HealthChecks
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListAssociatedRoute53HealthChecks"
     *      target="_top">AWS API Documentation</a>
     */
    ListAssociatedRoute53HealthChecksResult listAssociatedRoute53HealthChecks(ListAssociatedRoute53HealthChecksRequest listAssociatedRoute53HealthChecksRequest);

    /**
     * <p>
     * Returns an array of all the clusters in an account.
     * </p>
     * 
     * @param listClustersRequest
     * @return Result of the ListClusters operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryControlConfig.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListClusters"
     *      target="_top">AWS API Documentation</a>
     */
    ListClustersResult listClusters(ListClustersRequest listClustersRequest);

    /**
     * <p>
     * Returns an array of control panels in an account or in a cluster.
     * </p>
     * 
     * @param listControlPanelsRequest
     * @return Result of the ListControlPanels operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryControlConfig.ListControlPanels
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListControlPanels"
     *      target="_top">AWS API Documentation</a>
     */
    ListControlPanelsResult listControlPanels(ListControlPanelsRequest listControlPanelsRequest);

    /**
     * <p>
     * Returns an array of routing controls for a control panel. A routing control is an Amazon Route 53 Application
     * Recovery Controller construct that has one of two states: ON and OFF. You can map the routing control state to
     * the state of an Amazon Route 53 health check, which can be used to control routing.
     * </p>
     * 
     * @param listRoutingControlsRequest
     * @return Result of the ListRoutingControls operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryControlConfig.ListRoutingControls
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListRoutingControls"
     *      target="_top">AWS API Documentation</a>
     */
    ListRoutingControlsResult listRoutingControls(ListRoutingControlsRequest listRoutingControlsRequest);

    /**
     * <p>
     * List the safety rules (the assertion rules and gating rules) that you've defined for the routing controls in a
     * control panel.
     * </p>
     * 
     * @param listSafetyRulesRequest
     * @return Result of the ListSafetyRules operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @sample AWSRoute53RecoveryControlConfig.ListSafetyRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListSafetyRules"
     *      target="_top">AWS API Documentation</a>
     */
    ListSafetyRulesResult listSafetyRules(ListSafetyRulesRequest listSafetyRulesRequest);

    /**
     * <p>
     * Lists the tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryControlConfig.ListTagsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        Request of adding tag to the resource
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryControlConfig.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryControlConfig.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a control panel. The only update you can make to a control panel is to change the name of the control
     * panel.
     * </p>
     * 
     * @param updateControlPanelRequest
     *        The details of the control panel that you're updating.
     * @return Result of the UpdateControlPanel operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.UpdateControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateControlPanelResult updateControlPanel(UpdateControlPanelRequest updateControlPanelRequest);

    /**
     * <p>
     * Updates a routing control. You can only update the name of the routing control. To get or update the routing
     * control state, see the Recovery Cluster (data plane) API actions for Amazon Route 53 Application Recovery
     * Controller.
     * </p>
     * 
     * @param updateRoutingControlRequest
     *        The details of the routing control that you're updating.
     * @return Result of the UpdateRoutingControl operation returned by the service.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @throws AccessDeniedException
     *         403 response - AccessDeniedException. You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ThrottlingException
     *         429 response - LimitExceededException or TooManyRequestsException.
     * @throws ConflictException
     *         409 response - ConflictException. You might be using a predefined variable.
     * @sample AWSRoute53RecoveryControlConfig.UpdateRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRoutingControlResult updateRoutingControl(UpdateRoutingControlRequest updateRoutingControlRequest);

    /**
     * <p>
     * Update a safety rule (an assertion rule or gating rule). You can only update the name and the waiting period for
     * a safety rule. To make other updates, delete the safety rule and create a new one.
     * </p>
     * 
     * @param updateSafetyRuleRequest
     *        A rule that you add to Application Recovery Controller to ensure that recovery actions don't accidentally
     *        impair your application's availability.
     * @return Result of the UpdateSafetyRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         404 response - MalformedQueryString. The query string contains a syntax error or resource not found.
     * @throws ValidationException
     *         400 response - Multiple causes. For example, you might have a malformed query string and input parameter
     *         might be out of range, or you used parameters together incorrectly.
     * @throws InternalServerException
     *         500 response - InternalServiceError. Temporary service error. Retry the request.
     * @sample AWSRoute53RecoveryControlConfig.UpdateSafetyRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSafetyRuleResult updateSafetyRule(UpdateSafetyRuleRequest updateSafetyRuleRequest);

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

    AWSRoute53RecoveryControlConfigWaiters waiters();

}
