/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the current health of a target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/TargetHealth"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetHealth implements Serializable, Cloneable {

    /**
     * <p>
     * The state of the target.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason code.
     * </p>
     * <p>
     * If the target state is <code>healthy</code>, a reason code is not provided.
     * </p>
     * <p>
     * If the target state is <code>initial</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Elb.RegistrationInProgress</code> - The target is in the process of being registered with the load
     * balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Elb.InitialHealthChecking</code> - The load balancer is still sending the target the minimum number of
     * health checks required to determine its health status.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unhealthy</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.ResponseCodeMismatch</code> - The health checks did not return an expected HTTP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.Timeout</code> - The health check requests timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.FailedHealthChecks</code> - The health checks failed because the connection to the target timed out,
     * the target response was malformed, or the target failed the health check for an unknown reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Elb.InternalError</code> - The health checks failed due to an internal error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unused</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.NotRegistered</code> - The target is not registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.NotInUse</code> - The target group is not used by any load balancer or the target is in an
     * Availability Zone that is not enabled for its load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.IpUnusable</code> - The target IP address is reserved for use by a load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.InvalidState</code> - The target is in the stopped or terminated state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>draining</code>, the reason code can be the following value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.DeregistrationInProgress</code> - The target is in the process of being deregistered and the
     * deregistration delay period has not expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unavailable</code>, the reason code can be the following value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.HealthCheckDisabled</code> - Health checks are disabled for the target group.
     * </p>
     * </li>
     * </ul>
     */
    private String reason;
    /**
     * <p>
     * A description of the target health that provides additional details. If the state is <code>healthy</code>, a
     * description is not provided.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The state of the target.
     * </p>
     * 
     * @param state
     *        The state of the target.
     * @see TargetHealthStateEnum
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the target.
     * </p>
     * 
     * @return The state of the target.
     * @see TargetHealthStateEnum
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the target.
     * </p>
     * 
     * @param state
     *        The state of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetHealthStateEnum
     */

    public TargetHealth withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the target.
     * </p>
     * 
     * @param state
     *        The state of the target.
     * @see TargetHealthStateEnum
     */

    public void setState(TargetHealthStateEnum state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the target.
     * </p>
     * 
     * @param state
     *        The state of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetHealthStateEnum
     */

    public TargetHealth withState(TargetHealthStateEnum state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason code.
     * </p>
     * <p>
     * If the target state is <code>healthy</code>, a reason code is not provided.
     * </p>
     * <p>
     * If the target state is <code>initial</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Elb.RegistrationInProgress</code> - The target is in the process of being registered with the load
     * balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Elb.InitialHealthChecking</code> - The load balancer is still sending the target the minimum number of
     * health checks required to determine its health status.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unhealthy</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.ResponseCodeMismatch</code> - The health checks did not return an expected HTTP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.Timeout</code> - The health check requests timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.FailedHealthChecks</code> - The health checks failed because the connection to the target timed out,
     * the target response was malformed, or the target failed the health check for an unknown reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Elb.InternalError</code> - The health checks failed due to an internal error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unused</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.NotRegistered</code> - The target is not registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.NotInUse</code> - The target group is not used by any load balancer or the target is in an
     * Availability Zone that is not enabled for its load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.IpUnusable</code> - The target IP address is reserved for use by a load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.InvalidState</code> - The target is in the stopped or terminated state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>draining</code>, the reason code can be the following value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.DeregistrationInProgress</code> - The target is in the process of being deregistered and the
     * deregistration delay period has not expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unavailable</code>, the reason code can be the following value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.HealthCheckDisabled</code> - Health checks are disabled for the target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reason
     *        The reason code.</p>
     *        <p>
     *        If the target state is <code>healthy</code>, a reason code is not provided.
     *        </p>
     *        <p>
     *        If the target state is <code>initial</code>, the reason code can be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Elb.RegistrationInProgress</code> - The target is in the process of being registered with the load
     *        balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Elb.InitialHealthChecking</code> - The load balancer is still sending the target the minimum number
     *        of health checks required to determine its health status.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>unhealthy</code>, the reason code can be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.ResponseCodeMismatch</code> - The health checks did not return an expected HTTP code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.Timeout</code> - The health check requests timed out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.FailedHealthChecks</code> - The health checks failed because the connection to the target
     *        timed out, the target response was malformed, or the target failed the health check for an unknown reason.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Elb.InternalError</code> - The health checks failed due to an internal error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>unused</code>, the reason code can be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.NotRegistered</code> - The target is not registered with the target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.NotInUse</code> - The target group is not used by any load balancer or the target is in an
     *        Availability Zone that is not enabled for its load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.IpUnusable</code> - The target IP address is reserved for use by a load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.InvalidState</code> - The target is in the stopped or terminated state.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>draining</code>, the reason code can be the following value:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.DeregistrationInProgress</code> - The target is in the process of being deregistered and the
     *        deregistration delay period has not expired.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>unavailable</code>, the reason code can be the following value:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.HealthCheckDisabled</code> - Health checks are disabled for the target group.
     *        </p>
     *        </li>
     * @see TargetHealthReasonEnum
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason code.
     * </p>
     * <p>
     * If the target state is <code>healthy</code>, a reason code is not provided.
     * </p>
     * <p>
     * If the target state is <code>initial</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Elb.RegistrationInProgress</code> - The target is in the process of being registered with the load
     * balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Elb.InitialHealthChecking</code> - The load balancer is still sending the target the minimum number of
     * health checks required to determine its health status.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unhealthy</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.ResponseCodeMismatch</code> - The health checks did not return an expected HTTP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.Timeout</code> - The health check requests timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.FailedHealthChecks</code> - The health checks failed because the connection to the target timed out,
     * the target response was malformed, or the target failed the health check for an unknown reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Elb.InternalError</code> - The health checks failed due to an internal error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unused</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.NotRegistered</code> - The target is not registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.NotInUse</code> - The target group is not used by any load balancer or the target is in an
     * Availability Zone that is not enabled for its load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.IpUnusable</code> - The target IP address is reserved for use by a load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.InvalidState</code> - The target is in the stopped or terminated state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>draining</code>, the reason code can be the following value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.DeregistrationInProgress</code> - The target is in the process of being deregistered and the
     * deregistration delay period has not expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unavailable</code>, the reason code can be the following value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.HealthCheckDisabled</code> - Health checks are disabled for the target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The reason code.</p>
     *         <p>
     *         If the target state is <code>healthy</code>, a reason code is not provided.
     *         </p>
     *         <p>
     *         If the target state is <code>initial</code>, the reason code can be one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Elb.RegistrationInProgress</code> - The target is in the process of being registered with the load
     *         balancer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Elb.InitialHealthChecking</code> - The load balancer is still sending the target the minimum number
     *         of health checks required to determine its health status.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the target state is <code>unhealthy</code>, the reason code can be one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Target.ResponseCodeMismatch</code> - The health checks did not return an expected HTTP code.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Target.Timeout</code> - The health check requests timed out.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Target.FailedHealthChecks</code> - The health checks failed because the connection to the target
     *         timed out, the target response was malformed, or the target failed the health check for an unknown
     *         reason.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Elb.InternalError</code> - The health checks failed due to an internal error.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the target state is <code>unused</code>, the reason code can be one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Target.NotRegistered</code> - The target is not registered with the target group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Target.NotInUse</code> - The target group is not used by any load balancer or the target is in an
     *         Availability Zone that is not enabled for its load balancer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Target.IpUnusable</code> - The target IP address is reserved for use by a load balancer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Target.InvalidState</code> - The target is in the stopped or terminated state.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the target state is <code>draining</code>, the reason code can be the following value:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Target.DeregistrationInProgress</code> - The target is in the process of being deregistered and the
     *         deregistration delay period has not expired.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the target state is <code>unavailable</code>, the reason code can be the following value:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Target.HealthCheckDisabled</code> - Health checks are disabled for the target group.
     *         </p>
     *         </li>
     * @see TargetHealthReasonEnum
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason code.
     * </p>
     * <p>
     * If the target state is <code>healthy</code>, a reason code is not provided.
     * </p>
     * <p>
     * If the target state is <code>initial</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Elb.RegistrationInProgress</code> - The target is in the process of being registered with the load
     * balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Elb.InitialHealthChecking</code> - The load balancer is still sending the target the minimum number of
     * health checks required to determine its health status.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unhealthy</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.ResponseCodeMismatch</code> - The health checks did not return an expected HTTP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.Timeout</code> - The health check requests timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.FailedHealthChecks</code> - The health checks failed because the connection to the target timed out,
     * the target response was malformed, or the target failed the health check for an unknown reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Elb.InternalError</code> - The health checks failed due to an internal error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unused</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.NotRegistered</code> - The target is not registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.NotInUse</code> - The target group is not used by any load balancer or the target is in an
     * Availability Zone that is not enabled for its load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.IpUnusable</code> - The target IP address is reserved for use by a load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.InvalidState</code> - The target is in the stopped or terminated state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>draining</code>, the reason code can be the following value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.DeregistrationInProgress</code> - The target is in the process of being deregistered and the
     * deregistration delay period has not expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unavailable</code>, the reason code can be the following value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.HealthCheckDisabled</code> - Health checks are disabled for the target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reason
     *        The reason code.</p>
     *        <p>
     *        If the target state is <code>healthy</code>, a reason code is not provided.
     *        </p>
     *        <p>
     *        If the target state is <code>initial</code>, the reason code can be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Elb.RegistrationInProgress</code> - The target is in the process of being registered with the load
     *        balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Elb.InitialHealthChecking</code> - The load balancer is still sending the target the minimum number
     *        of health checks required to determine its health status.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>unhealthy</code>, the reason code can be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.ResponseCodeMismatch</code> - The health checks did not return an expected HTTP code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.Timeout</code> - The health check requests timed out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.FailedHealthChecks</code> - The health checks failed because the connection to the target
     *        timed out, the target response was malformed, or the target failed the health check for an unknown reason.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Elb.InternalError</code> - The health checks failed due to an internal error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>unused</code>, the reason code can be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.NotRegistered</code> - The target is not registered with the target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.NotInUse</code> - The target group is not used by any load balancer or the target is in an
     *        Availability Zone that is not enabled for its load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.IpUnusable</code> - The target IP address is reserved for use by a load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.InvalidState</code> - The target is in the stopped or terminated state.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>draining</code>, the reason code can be the following value:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.DeregistrationInProgress</code> - The target is in the process of being deregistered and the
     *        deregistration delay period has not expired.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>unavailable</code>, the reason code can be the following value:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.HealthCheckDisabled</code> - Health checks are disabled for the target group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetHealthReasonEnum
     */

    public TargetHealth withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason code.
     * </p>
     * <p>
     * If the target state is <code>healthy</code>, a reason code is not provided.
     * </p>
     * <p>
     * If the target state is <code>initial</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Elb.RegistrationInProgress</code> - The target is in the process of being registered with the load
     * balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Elb.InitialHealthChecking</code> - The load balancer is still sending the target the minimum number of
     * health checks required to determine its health status.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unhealthy</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.ResponseCodeMismatch</code> - The health checks did not return an expected HTTP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.Timeout</code> - The health check requests timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.FailedHealthChecks</code> - The health checks failed because the connection to the target timed out,
     * the target response was malformed, or the target failed the health check for an unknown reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Elb.InternalError</code> - The health checks failed due to an internal error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unused</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.NotRegistered</code> - The target is not registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.NotInUse</code> - The target group is not used by any load balancer or the target is in an
     * Availability Zone that is not enabled for its load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.IpUnusable</code> - The target IP address is reserved for use by a load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.InvalidState</code> - The target is in the stopped or terminated state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>draining</code>, the reason code can be the following value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.DeregistrationInProgress</code> - The target is in the process of being deregistered and the
     * deregistration delay period has not expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unavailable</code>, the reason code can be the following value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.HealthCheckDisabled</code> - Health checks are disabled for the target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reason
     *        The reason code.</p>
     *        <p>
     *        If the target state is <code>healthy</code>, a reason code is not provided.
     *        </p>
     *        <p>
     *        If the target state is <code>initial</code>, the reason code can be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Elb.RegistrationInProgress</code> - The target is in the process of being registered with the load
     *        balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Elb.InitialHealthChecking</code> - The load balancer is still sending the target the minimum number
     *        of health checks required to determine its health status.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>unhealthy</code>, the reason code can be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.ResponseCodeMismatch</code> - The health checks did not return an expected HTTP code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.Timeout</code> - The health check requests timed out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.FailedHealthChecks</code> - The health checks failed because the connection to the target
     *        timed out, the target response was malformed, or the target failed the health check for an unknown reason.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Elb.InternalError</code> - The health checks failed due to an internal error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>unused</code>, the reason code can be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.NotRegistered</code> - The target is not registered with the target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.NotInUse</code> - The target group is not used by any load balancer or the target is in an
     *        Availability Zone that is not enabled for its load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.IpUnusable</code> - The target IP address is reserved for use by a load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.InvalidState</code> - The target is in the stopped or terminated state.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>draining</code>, the reason code can be the following value:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.DeregistrationInProgress</code> - The target is in the process of being deregistered and the
     *        deregistration delay period has not expired.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>unavailable</code>, the reason code can be the following value:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.HealthCheckDisabled</code> - Health checks are disabled for the target group.
     *        </p>
     *        </li>
     * @see TargetHealthReasonEnum
     */

    public void setReason(TargetHealthReasonEnum reason) {
        withReason(reason);
    }

    /**
     * <p>
     * The reason code.
     * </p>
     * <p>
     * If the target state is <code>healthy</code>, a reason code is not provided.
     * </p>
     * <p>
     * If the target state is <code>initial</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Elb.RegistrationInProgress</code> - The target is in the process of being registered with the load
     * balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Elb.InitialHealthChecking</code> - The load balancer is still sending the target the minimum number of
     * health checks required to determine its health status.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unhealthy</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.ResponseCodeMismatch</code> - The health checks did not return an expected HTTP code.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.Timeout</code> - The health check requests timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.FailedHealthChecks</code> - The health checks failed because the connection to the target timed out,
     * the target response was malformed, or the target failed the health check for an unknown reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Elb.InternalError</code> - The health checks failed due to an internal error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unused</code>, the reason code can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.NotRegistered</code> - The target is not registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.NotInUse</code> - The target group is not used by any load balancer or the target is in an
     * Availability Zone that is not enabled for its load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.IpUnusable</code> - The target IP address is reserved for use by a load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Target.InvalidState</code> - The target is in the stopped or terminated state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>draining</code>, the reason code can be the following value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.DeregistrationInProgress</code> - The target is in the process of being deregistered and the
     * deregistration delay period has not expired.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the target state is <code>unavailable</code>, the reason code can be the following value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Target.HealthCheckDisabled</code> - Health checks are disabled for the target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reason
     *        The reason code.</p>
     *        <p>
     *        If the target state is <code>healthy</code>, a reason code is not provided.
     *        </p>
     *        <p>
     *        If the target state is <code>initial</code>, the reason code can be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Elb.RegistrationInProgress</code> - The target is in the process of being registered with the load
     *        balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Elb.InitialHealthChecking</code> - The load balancer is still sending the target the minimum number
     *        of health checks required to determine its health status.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>unhealthy</code>, the reason code can be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.ResponseCodeMismatch</code> - The health checks did not return an expected HTTP code.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.Timeout</code> - The health check requests timed out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.FailedHealthChecks</code> - The health checks failed because the connection to the target
     *        timed out, the target response was malformed, or the target failed the health check for an unknown reason.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Elb.InternalError</code> - The health checks failed due to an internal error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>unused</code>, the reason code can be one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.NotRegistered</code> - The target is not registered with the target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.NotInUse</code> - The target group is not used by any load balancer or the target is in an
     *        Availability Zone that is not enabled for its load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.IpUnusable</code> - The target IP address is reserved for use by a load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Target.InvalidState</code> - The target is in the stopped or terminated state.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>draining</code>, the reason code can be the following value:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.DeregistrationInProgress</code> - The target is in the process of being deregistered and the
     *        deregistration delay period has not expired.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the target state is <code>unavailable</code>, the reason code can be the following value:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Target.HealthCheckDisabled</code> - Health checks are disabled for the target group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetHealthReasonEnum
     */

    public TargetHealth withReason(TargetHealthReasonEnum reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * A description of the target health that provides additional details. If the state is <code>healthy</code>, a
     * description is not provided.
     * </p>
     * 
     * @param description
     *        A description of the target health that provides additional details. If the state is <code>healthy</code>,
     *        a description is not provided.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the target health that provides additional details. If the state is <code>healthy</code>, a
     * description is not provided.
     * </p>
     * 
     * @return A description of the target health that provides additional details. If the state is <code>healthy</code>
     *         , a description is not provided.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the target health that provides additional details. If the state is <code>healthy</code>, a
     * description is not provided.
     * </p>
     * 
     * @param description
     *        A description of the target health that provides additional details. If the state is <code>healthy</code>,
     *        a description is not provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetHealth withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetHealth == false)
            return false;
        TargetHealth other = (TargetHealth) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public TargetHealth clone() {
        try {
            return (TargetHealth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
