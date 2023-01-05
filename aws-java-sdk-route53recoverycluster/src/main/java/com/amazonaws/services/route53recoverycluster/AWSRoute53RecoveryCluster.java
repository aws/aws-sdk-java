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
package com.amazonaws.services.route53recoverycluster;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.route53recoverycluster.model.*;

/**
 * Interface for accessing Route53 Recovery Cluster.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53recoverycluster.AbstractAWSRoute53RecoveryCluster} instead.
 * </p>
 * <p>
 * <p>
 * Welcome to the Routing Control (Recovery Cluster) API Reference Guide for Amazon Route 53 Application Recovery
 * Controller.
 * </p>
 * <p>
 * With Route 53 ARC, you can use routing control with extreme reliability to recover applications by rerouting traffic
 * across Availability Zones or Amazon Web Services Regions. Routing controls are simple on/off switches hosted on a
 * highly available cluster in Route 53 ARC. A cluster provides a set of five redundant Regional endpoints against which
 * you can run API calls to get or update the state of routing controls. To implement failover, you set one routing
 * control On and another one Off, to reroute traffic from one Availability Zone or Amazon Web Services Region to
 * another.
 * </p>
 * <p>
 * <i>Be aware that you must specify a Regional endpoint for a cluster when you work with API cluster operations to get
 * or update routing control states in Route 53 ARC.</i> In addition, you must specify the US West (Oregon) Region for
 * Route 53 ARC API calls. For example, use the parameter <code>--region us-west-2</code> with AWS CLI commands. For
 * more information, see <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.update.api.html">
 * Get and update routing control states using the API</a> in the Amazon Route 53 Application Recovery Controller
 * Developer Guide.
 * </p>
 * <p>
 * This API guide includes information about the API operations for how to get and update routing control states in
 * Route 53 ARC. To work with routing control in Route 53 ARC, you must first create the required components (clusters,
 * control panels, and routing controls) using the recovery cluster configuration API.
 * </p>
 * <p>
 * For more information about working with routing control in Route 53 ARC, see the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Create clusters, control panels, and routing controls by using API operations. For more information, see the <a
 * href="https://docs.aws.amazon.com/recovery-cluster/latest/api/">Recovery Control Configuration API Reference Guide
 * for Amazon Route 53 Application Recovery Controller</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Learn about the components in recovery control, including clusters, routing controls, and control panels, and how to
 * work with Route 53 ARC in the Amazon Web Services console. For more information, see <a href=
 * "https://docs.aws.amazon.com/r53recovery/latest/dg/introduction-components.html#introduction-components-routing">
 * Recovery control components</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
 * </p>
 * </li>
 * <li>
 * <p>
 * Route 53 ARC also provides readiness checks that continually audit resources to help make sure that your applications
 * are scaled and ready to handle failover traffic. For more information about the related API operations, see the <a
 * href="https://docs.aws.amazon.com/recovery-readiness/latest/api/">Recovery Readiness API Reference Guide for Amazon
 * Route 53 Application Recovery Controller</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For more information about creating resilient applications and preparing for recovery readiness with Route 53 ARC,
 * see the <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/">Amazon Route 53 Application Recovery Controller
 * Developer Guide</a>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRoute53RecoveryCluster {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "route53-recovery-cluster";

    /**
     * <p>
     * Get the state for a routing control. A routing control is a simple on/off switch that you can use to route
     * traffic to cells. When a routing control state is On, traffic flows to a cell. When the state is Off, traffic
     * does not flow.
     * </p>
     * <p>
     * Before you can create a routing control, you must first create a cluster, and then host the control in a control
     * panel on the cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.create.html"> Create routing control
     * structures</a> in the Amazon Route 53 Application Recovery Controller Developer Guide. You access one of the
     * endpoints for the cluster to get or update the routing control state to redirect traffic for your application.
     * </p>
     * <p>
     * <i>You must specify Regional endpoints when you work with API cluster operations to get or update routing control
     * states in Route 53 ARC.</i>
     * </p>
     * <p>
     * To see a code example for getting a routing control state, including accessing Regional cluster endpoints in
     * sequence, see <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/service_code_examples_actions.html">API
     * examples</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <p>
     * Learn more about working with routing controls in the following topics in the Amazon Route 53 Application
     * Recovery Controller Developer Guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.update.html"> Viewing and updating
     * routing control states</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.html">Working with routing controls in
     * Route 53 ARC</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getRoutingControlStateRequest
     * @return Result of the GetRoutingControlState operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         There was an unexpected error during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a routing control or control panel that was not found.
     * @throws ValidationException
     *         There was a validation error on the request.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @throws EndpointTemporarilyUnavailableException
     *         The cluster endpoint isn't available. Try another cluster endpoint.
     * @sample AWSRoute53RecoveryCluster.GetRoutingControlState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/GetRoutingControlState"
     *      target="_top">AWS API Documentation</a>
     */
    GetRoutingControlStateResult getRoutingControlState(GetRoutingControlStateRequest getRoutingControlStateRequest);

    /**
     * <p>
     * List routing control names and Amazon Resource Names (ARNs), as well as the routing control state for each
     * routing control, along with the control panel name and control panel ARN for the routing controls. If you specify
     * a control panel ARN, this call lists the routing controls in the control panel. Otherwise, it lists all the
     * routing controls in the cluster.
     * </p>
     * <p>
     * A routing control is a simple on/off switch in Route 53 ARC that you can use to route traffic to cells. When a
     * routing control state is On, traffic flows to a cell. When the state is Off, traffic does not flow.
     * </p>
     * <p>
     * Before you can create a routing control, you must first create a cluster, and then host the control in a control
     * panel on the cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.create.html"> Create routing control
     * structures</a> in the Amazon Route 53 Application Recovery Controller Developer Guide. You access one of the
     * endpoints for the cluster to get or update the routing control state to redirect traffic for your application.
     * </p>
     * <p>
     * <i>You must specify Regional endpoints when you work with API cluster operations to use this API operation to
     * list routing controls in Route 53 ARC.</i>
     * </p>
     * <p>
     * Learn more about working with routing controls in the following topics in the Amazon Route 53 Application
     * Recovery Controller Developer Guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.update.html"> Viewing and updating
     * routing control states</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.html">Working with routing controls in
     * Route 53 ARC</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listRoutingControlsRequest
     * @return Result of the ListRoutingControls operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         There was an unexpected error during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a routing control or control panel that was not found.
     * @throws ValidationException
     *         There was a validation error on the request.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @throws EndpointTemporarilyUnavailableException
     *         The cluster endpoint isn't available. Try another cluster endpoint.
     * @sample AWSRoute53RecoveryCluster.ListRoutingControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/ListRoutingControls"
     *      target="_top">AWS API Documentation</a>
     */
    ListRoutingControlsResult listRoutingControls(ListRoutingControlsRequest listRoutingControlsRequest);

    /**
     * <p>
     * Set the state of the routing control to reroute traffic. You can set the value to be On or Off. When the state is
     * On, traffic flows to a cell. When the state is Off, traffic does not flow.
     * </p>
     * <p>
     * With Route 53 ARC, you can add safety rules for routing controls, which are safeguards for routing control state
     * updates that help prevent unexpected outcomes, like fail open traffic routing. However, there are scenarios when
     * you might want to bypass the routing control safeguards that are enforced with safety rules that you've
     * configured. For example, you might want to fail over quickly for disaster recovery, and one or more safety rules
     * might be unexpectedly preventing you from updating a routing control state to reroute traffic. In a "break glass"
     * scenario like this, you can override one or more safety rules to change a routing control state and fail over
     * your application.
     * </p>
     * <p>
     * The <code>SafetyRulesToOverride</code> property enables you override one or more safety rules and update routing
     * control states. For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html"> Override
     * safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <p>
     * <i>You must specify Regional endpoints when you work with API cluster operations to get or update routing control
     * states in Route 53 ARC.</i>
     * </p>
     * <p>
     * To see a code example for getting a routing control state, including accessing Regional cluster endpoints in
     * sequence, see <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/service_code_examples_actions.html">API
     * examples</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.update.html"> Viewing and updating
     * routing control states</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.html">Working with routing controls
     * overall</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateRoutingControlStateRequest
     * @return Result of the UpdateRoutingControlState operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         There was an unexpected error during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a routing control or control panel that was not found.
     * @throws ValidationException
     *         There was a validation error on the request.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @throws EndpointTemporarilyUnavailableException
     *         The cluster endpoint isn't available. Try another cluster endpoint.
     * @throws ConflictException
     *         There was a conflict with this request. Try again.
     * @sample AWSRoute53RecoveryCluster.UpdateRoutingControlState
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlState"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRoutingControlStateResult updateRoutingControlState(UpdateRoutingControlStateRequest updateRoutingControlStateRequest);

    /**
     * <p>
     * Set multiple routing control states. You can set the value for each state to be On or Off. When the state is On,
     * traffic flows to a cell. When it's Off, traffic does not flow.
     * </p>
     * <p>
     * With Route 53 ARC, you can add safety rules for routing controls, which are safeguards for routing control state
     * updates that help prevent unexpected outcomes, like fail open traffic routing. However, there are scenarios when
     * you might want to bypass the routing control safeguards that are enforced with safety rules that you've
     * configured. For example, you might want to fail over quickly for disaster recovery, and one or more safety rules
     * might be unexpectedly preventing you from updating a routing control state to reroute traffic. In a "break glass"
     * scenario like this, you can override one or more safety rules to change a routing control state and fail over
     * your application.
     * </p>
     * <p>
     * The <code>SafetyRulesToOverride</code> property enables you override one or more safety rules and update routing
     * control states. For more information, see <a
     * href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.override-safety-rule.html"> Override
     * safety rules to reroute traffic</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <p>
     * <i>You must specify Regional endpoints when you work with API cluster operations to get or update routing control
     * states in Route 53 ARC.</i>
     * </p>
     * <p>
     * To see a code example for getting a routing control state, including accessing Regional cluster endpoints in
     * sequence, see <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/service_code_examples_actions.html">API
     * examples</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.update.html"> Viewing and updating
     * routing control states</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/r53recovery/latest/dg/routing-control.html">Working with routing controls
     * overall</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateRoutingControlStatesRequest
     * @return Result of the UpdateRoutingControlStates operation returned by the service.
     * @throws AccessDeniedException
     *         You don't have sufficient permissions to perform this action.
     * @throws InternalServerException
     *         There was an unexpected error during processing of the request.
     * @throws ResourceNotFoundException
     *         The request references a routing control or control panel that was not found.
     * @throws ValidationException
     *         There was a validation error on the request.
     * @throws ThrottlingException
     *         The request was denied because of request throttling.
     * @throws EndpointTemporarilyUnavailableException
     *         The cluster endpoint isn't available. Try another cluster endpoint.
     * @throws ConflictException
     *         There was a conflict with this request. Try again.
     * @throws ServiceLimitExceededException
     *         The request can't update that many routing control states at the same time. Try again with fewer routing
     *         control states.
     * @sample AWSRoute53RecoveryCluster.UpdateRoutingControlStates
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-cluster-2019-12-02/UpdateRoutingControlStates"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRoutingControlStatesResult updateRoutingControlStates(UpdateRoutingControlStatesRequest updateRoutingControlStatesRequest);

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
