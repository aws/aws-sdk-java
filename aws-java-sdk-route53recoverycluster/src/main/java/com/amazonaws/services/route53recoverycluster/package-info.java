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

/**
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
package com.amazonaws.services.route53recoverycluster;

