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

import com.amazonaws.services.route53recoverycontrolconfig.model.*;

/**
 * Interface for accessing AWS Route53 Recovery Control Config asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53recoverycontrolconfig.AbstractAWSRoute53RecoveryControlConfigAsync} instead.
 * </p>
 * <p>
 * <p>
 * Recovery Control Configuration API Reference for Amazon Route 53 Application Recovery Controller
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRoute53RecoveryControlConfigAsync extends AWSRoute53RecoveryControlConfig {

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
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateCluster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCluster operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateCluster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest createClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateControlPanel operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.CreateControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateControlPanelResult> createControlPanelAsync(CreateControlPanelRequest createControlPanelRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateControlPanel operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.CreateControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateControlPanelResult> createControlPanelAsync(CreateControlPanelRequest createControlPanelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateControlPanelRequest, CreateControlPanelResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateRoutingControl operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.CreateRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRoutingControlResult> createRoutingControlAsync(CreateRoutingControlRequest createRoutingControlRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRoutingControl operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.CreateRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRoutingControlResult> createRoutingControlAsync(CreateRoutingControlRequest createRoutingControlRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRoutingControlRequest, CreateRoutingControlResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateSafetyRule operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.CreateSafetyRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSafetyRuleResult> createSafetyRuleAsync(CreateSafetyRuleRequest createSafetyRuleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSafetyRule operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.CreateSafetyRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSafetyRuleResult> createSafetyRuleAsync(CreateSafetyRuleRequest createSafetyRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSafetyRuleRequest, CreateSafetyRuleResult> asyncHandler);

    /**
     * <p>
     * Delete a cluster.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteCluster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Delete a cluster.
     * </p>
     * 
     * @param deleteClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCluster operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteCluster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest deleteClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler);

    /**
     * <p>
     * Deletes a control panel.
     * </p>
     * 
     * @param deleteControlPanelRequest
     * @return A Java Future containing the result of the DeleteControlPanel operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.DeleteControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteControlPanelResult> deleteControlPanelAsync(DeleteControlPanelRequest deleteControlPanelRequest);

    /**
     * <p>
     * Deletes a control panel.
     * </p>
     * 
     * @param deleteControlPanelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteControlPanel operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.DeleteControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteControlPanelResult> deleteControlPanelAsync(DeleteControlPanelRequest deleteControlPanelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteControlPanelRequest, DeleteControlPanelResult> asyncHandler);

    /**
     * <p>
     * Deletes a routing control.
     * </p>
     * 
     * @param deleteRoutingControlRequest
     * @return A Java Future containing the result of the DeleteRoutingControl operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.DeleteRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoutingControlResult> deleteRoutingControlAsync(DeleteRoutingControlRequest deleteRoutingControlRequest);

    /**
     * <p>
     * Deletes a routing control.
     * </p>
     * 
     * @param deleteRoutingControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRoutingControl operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.DeleteRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoutingControlResult> deleteRoutingControlAsync(DeleteRoutingControlRequest deleteRoutingControlRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRoutingControlRequest, DeleteRoutingControlResult> asyncHandler);

    /**
     * <p>
     * Deletes a safety rule.
     * </p>
     * /&gt;
     * 
     * @param deleteSafetyRuleRequest
     * @return A Java Future containing the result of the DeleteSafetyRule operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.DeleteSafetyRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSafetyRuleResult> deleteSafetyRuleAsync(DeleteSafetyRuleRequest deleteSafetyRuleRequest);

    /**
     * <p>
     * Deletes a safety rule.
     * </p>
     * /&gt;
     * 
     * @param deleteSafetyRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSafetyRule operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.DeleteSafetyRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DeleteSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSafetyRuleResult> deleteSafetyRuleAsync(DeleteSafetyRuleRequest deleteSafetyRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSafetyRuleRequest, DeleteSafetyRuleResult> asyncHandler);

    /**
     * <p>
     * Display the details about a cluster. The response includes the cluster name, endpoints, status, and Amazon
     * Resource Name (ARN).
     * </p>
     * 
     * @param describeClusterRequest
     * @return A Java Future containing the result of the DescribeCluster operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeCluster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest describeClusterRequest);

    /**
     * <p>
     * Display the details about a cluster. The response includes the cluster name, endpoints, status, and Amazon
     * Resource Name (ARN).
     * </p>
     * 
     * @param describeClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCluster operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.DescribeCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeCluster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest describeClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterRequest, DescribeClusterResult> asyncHandler);

    /**
     * <p>
     * Displays details about a control panel.
     * </p>
     * 
     * @param describeControlPanelRequest
     * @return A Java Future containing the result of the DescribeControlPanel operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.DescribeControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeControlPanelResult> describeControlPanelAsync(DescribeControlPanelRequest describeControlPanelRequest);

    /**
     * <p>
     * Displays details about a control panel.
     * </p>
     * 
     * @param describeControlPanelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeControlPanel operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.DescribeControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeControlPanelResult> describeControlPanelAsync(DescribeControlPanelRequest describeControlPanelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeControlPanelRequest, DescribeControlPanelResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeRoutingControl operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.DescribeRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRoutingControlResult> describeRoutingControlAsync(DescribeRoutingControlRequest describeRoutingControlRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRoutingControl operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.DescribeRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRoutingControlResult> describeRoutingControlAsync(DescribeRoutingControlRequest describeRoutingControlRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRoutingControlRequest, DescribeRoutingControlResult> asyncHandler);

    /**
     * <p>
     * Returns information about a safety rule.
     * </p>
     * 
     * @param describeSafetyRuleRequest
     * @return A Java Future containing the result of the DescribeSafetyRule operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.DescribeSafetyRule
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSafetyRuleResult> describeSafetyRuleAsync(DescribeSafetyRuleRequest describeSafetyRuleRequest);

    /**
     * <p>
     * Returns information about a safety rule.
     * </p>
     * 
     * @param describeSafetyRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSafetyRule operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.DescribeSafetyRule
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/DescribeSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSafetyRuleResult> describeSafetyRuleAsync(DescribeSafetyRuleRequest describeSafetyRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSafetyRuleRequest, DescribeSafetyRuleResult> asyncHandler);

    /**
     * <p>
     * Returns an array of all Amazon Route 53 health checks associated with a specific routing control.
     * </p>
     * 
     * @param listAssociatedRoute53HealthChecksRequest
     * @return A Java Future containing the result of the ListAssociatedRoute53HealthChecks operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryControlConfigAsync.ListAssociatedRoute53HealthChecks
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListAssociatedRoute53HealthChecks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedRoute53HealthChecksResult> listAssociatedRoute53HealthChecksAsync(
            ListAssociatedRoute53HealthChecksRequest listAssociatedRoute53HealthChecksRequest);

    /**
     * <p>
     * Returns an array of all Amazon Route 53 health checks associated with a specific routing control.
     * </p>
     * 
     * @param listAssociatedRoute53HealthChecksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociatedRoute53HealthChecks operation returned by the
     *         service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.ListAssociatedRoute53HealthChecks
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListAssociatedRoute53HealthChecks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedRoute53HealthChecksResult> listAssociatedRoute53HealthChecksAsync(
            ListAssociatedRoute53HealthChecksRequest listAssociatedRoute53HealthChecksRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociatedRoute53HealthChecksRequest, ListAssociatedRoute53HealthChecksResult> asyncHandler);

    /**
     * <p>
     * Returns an array of all the clusters in an account.
     * </p>
     * 
     * @param listClustersRequest
     * @return A Java Future containing the result of the ListClusters operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListClusters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest);

    /**
     * <p>
     * Returns an array of all the clusters in an account.
     * </p>
     * 
     * @param listClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListClusters operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.ListClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListClusters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest listClustersRequest,
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler);

    /**
     * <p>
     * Returns an array of control panels in an account or in a cluster.
     * </p>
     * 
     * @param listControlPanelsRequest
     * @return A Java Future containing the result of the ListControlPanels operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.ListControlPanels
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListControlPanels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListControlPanelsResult> listControlPanelsAsync(ListControlPanelsRequest listControlPanelsRequest);

    /**
     * <p>
     * Returns an array of control panels in an account or in a cluster.
     * </p>
     * 
     * @param listControlPanelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListControlPanels operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.ListControlPanels
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListControlPanels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListControlPanelsResult> listControlPanelsAsync(ListControlPanelsRequest listControlPanelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListControlPanelsRequest, ListControlPanelsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of routing controls for a control panel. A routing control is an Amazon Route 53 Application
     * Recovery Controller construct that has one of two states: ON and OFF. You can map the routing control state to
     * the state of an Amazon Route 53 health check, which can be used to control routing.
     * </p>
     * 
     * @param listRoutingControlsRequest
     * @return A Java Future containing the result of the ListRoutingControls operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.ListRoutingControls
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListRoutingControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRoutingControlsResult> listRoutingControlsAsync(ListRoutingControlsRequest listRoutingControlsRequest);

    /**
     * <p>
     * Returns an array of routing controls for a control panel. A routing control is an Amazon Route 53 Application
     * Recovery Controller construct that has one of two states: ON and OFF. You can map the routing control state to
     * the state of an Amazon Route 53 health check, which can be used to control routing.
     * </p>
     * 
     * @param listRoutingControlsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRoutingControls operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.ListRoutingControls
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListRoutingControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRoutingControlsResult> listRoutingControlsAsync(ListRoutingControlsRequest listRoutingControlsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRoutingControlsRequest, ListRoutingControlsResult> asyncHandler);

    /**
     * <p>
     * List the safety rules (the assertion rules and gating rules) that you've defined for the routing controls in a
     * control panel.
     * </p>
     * 
     * @param listSafetyRulesRequest
     * @return A Java Future containing the result of the ListSafetyRules operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.ListSafetyRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListSafetyRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSafetyRulesResult> listSafetyRulesAsync(ListSafetyRulesRequest listSafetyRulesRequest);

    /**
     * <p>
     * List the safety rules (the assertion rules and gating rules) that you've defined for the routing controls in a
     * control panel.
     * </p>
     * 
     * @param listSafetyRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSafetyRules operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.ListSafetyRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListSafetyRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSafetyRulesResult> listSafetyRulesAsync(ListSafetyRulesRequest listSafetyRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSafetyRulesRequest, ListSafetyRulesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.ListTagsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.ListTagsForResource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        Request of adding tag to the resource
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds a tag to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        Request of adding tag to the resource
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a control panel. The only update you can make to a control panel is to change the name of the control
     * panel.
     * </p>
     * 
     * @param updateControlPanelRequest
     *        The details of the control panel that you're updating.
     * @return A Java Future containing the result of the UpdateControlPanel operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.UpdateControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateControlPanelResult> updateControlPanelAsync(UpdateControlPanelRequest updateControlPanelRequest);

    /**
     * <p>
     * Updates a control panel. The only update you can make to a control panel is to change the name of the control
     * panel.
     * </p>
     * 
     * @param updateControlPanelRequest
     *        The details of the control panel that you're updating.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateControlPanel operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.UpdateControlPanel
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateControlPanel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateControlPanelResult> updateControlPanelAsync(UpdateControlPanelRequest updateControlPanelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateControlPanelRequest, UpdateControlPanelResult> asyncHandler);

    /**
     * <p>
     * Updates a routing control. You can only update the name of the routing control. To get or update the routing
     * control state, see the Recovery Cluster (data plane) API actions for Amazon Route 53 Application Recovery
     * Controller.
     * </p>
     * 
     * @param updateRoutingControlRequest
     *        The details of the routing control that you're updating.
     * @return A Java Future containing the result of the UpdateRoutingControl operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.UpdateRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingControlResult> updateRoutingControlAsync(UpdateRoutingControlRequest updateRoutingControlRequest);

    /**
     * <p>
     * Updates a routing control. You can only update the name of the routing control. To get or update the routing
     * control state, see the Recovery Cluster (data plane) API actions for Amazon Route 53 Application Recovery
     * Controller.
     * </p>
     * 
     * @param updateRoutingControlRequest
     *        The details of the routing control that you're updating.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoutingControl operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.UpdateRoutingControl
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateRoutingControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoutingControlResult> updateRoutingControlAsync(UpdateRoutingControlRequest updateRoutingControlRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoutingControlRequest, UpdateRoutingControlResult> asyncHandler);

    /**
     * <p>
     * Update a safety rule (an assertion rule or gating rule). You can only update the name and the waiting period for
     * a safety rule. To make other updates, delete the safety rule and create a new one.
     * </p>
     * 
     * @param updateSafetyRuleRequest
     *        A rule that you add to Application Recovery Controller to ensure that recovery actions don't accidentally
     *        impair your application's availability.
     * @return A Java Future containing the result of the UpdateSafetyRule operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsync.UpdateSafetyRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSafetyRuleResult> updateSafetyRuleAsync(UpdateSafetyRuleRequest updateSafetyRuleRequest);

    /**
     * <p>
     * Update a safety rule (an assertion rule or gating rule). You can only update the name and the waiting period for
     * a safety rule. To make other updates, delete the safety rule and create a new one.
     * </p>
     * 
     * @param updateSafetyRuleRequest
     *        A rule that you add to Application Recovery Controller to ensure that recovery actions don't accidentally
     *        impair your application's availability.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSafetyRule operation returned by the service.
     * @sample AWSRoute53RecoveryControlConfigAsyncHandler.UpdateSafetyRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/UpdateSafetyRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSafetyRuleResult> updateSafetyRuleAsync(UpdateSafetyRuleRequest updateSafetyRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSafetyRuleRequest, UpdateSafetyRuleResult> asyncHandler);

}
