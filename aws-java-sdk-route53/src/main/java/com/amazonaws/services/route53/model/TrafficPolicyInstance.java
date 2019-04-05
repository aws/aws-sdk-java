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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains settings for the new traffic policy instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/TrafficPolicyInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficPolicyInstance implements Serializable, Cloneable {

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the new traffic policy instance.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the hosted zone that Amazon Route 53 created resource record sets in.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * The DNS name, such as www.example.com, for which Amazon Route 53 responds to queries by using the resource record
     * sets that are associated with this traffic policy instance.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The TTL that Amazon Route 53 assigned to all of the resource record sets that it created in the specified hosted
     * zone.
     * </p>
     */
    private Long tTL;
    /**
     * <p>
     * The value of <code>State</code> is one of the following values:
     * </p>
     * <dl>
     * <dt>Applied</dt>
     * <dd>
     * <p>
     * Amazon Route 53 has finished creating resource record sets, and changes have propagated to all Route 53 edge
     * locations.
     * </p>
     * </dd>
     * <dt>Creating</dt>
     * <dd>
     * <p>
     * Route 53 is creating the resource record sets. Use <code>GetTrafficPolicyInstance</code> to confirm that the
     * <code>CreateTrafficPolicyInstance</code> request completed successfully.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * Route 53 wasn't able to create or update the resource record sets. When the value of <code>State</code> is
     * <code>Failed</code>, see <code>Message</code> for an explanation of what caused the request to fail.
     * </p>
     * </dd>
     * </dl>
     */
    private String state;
    /**
     * <p>
     * If <code>State</code> is <code>Failed</code>, an explanation of the reason for the failure. If <code>State</code>
     * is another value, <code>Message</code> is empty.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The ID of the traffic policy that Amazon Route 53 used to create resource record sets in the specified hosted
     * zone.
     * </p>
     */
    private String trafficPolicyId;
    /**
     * <p>
     * The version of the traffic policy that Amazon Route 53 used to create resource record sets in the specified
     * hosted zone.
     * </p>
     */
    private Integer trafficPolicyVersion;
    /**
     * <p>
     * The DNS type that Amazon Route 53 assigned to all of the resource record sets that it created for this traffic
     * policy instance.
     * </p>
     */
    private String trafficPolicyType;

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the new traffic policy instance.
     * </p>
     * 
     * @param id
     *        The ID that Amazon Route 53 assigned to the new traffic policy instance.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the new traffic policy instance.
     * </p>
     * 
     * @return The ID that Amazon Route 53 assigned to the new traffic policy instance.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the new traffic policy instance.
     * </p>
     * 
     * @param id
     *        The ID that Amazon Route 53 assigned to the new traffic policy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicyInstance withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the hosted zone that Amazon Route 53 created resource record sets in.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that Amazon Route 53 created resource record sets in.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that Amazon Route 53 created resource record sets in.
     * </p>
     * 
     * @return The ID of the hosted zone that Amazon Route 53 created resource record sets in.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that Amazon Route 53 created resource record sets in.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that Amazon Route 53 created resource record sets in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicyInstance withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * The DNS name, such as www.example.com, for which Amazon Route 53 responds to queries by using the resource record
     * sets that are associated with this traffic policy instance.
     * </p>
     * 
     * @param name
     *        The DNS name, such as www.example.com, for which Amazon Route 53 responds to queries by using the resource
     *        record sets that are associated with this traffic policy instance.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The DNS name, such as www.example.com, for which Amazon Route 53 responds to queries by using the resource record
     * sets that are associated with this traffic policy instance.
     * </p>
     * 
     * @return The DNS name, such as www.example.com, for which Amazon Route 53 responds to queries by using the
     *         resource record sets that are associated with this traffic policy instance.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The DNS name, such as www.example.com, for which Amazon Route 53 responds to queries by using the resource record
     * sets that are associated with this traffic policy instance.
     * </p>
     * 
     * @param name
     *        The DNS name, such as www.example.com, for which Amazon Route 53 responds to queries by using the resource
     *        record sets that are associated with this traffic policy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicyInstance withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The TTL that Amazon Route 53 assigned to all of the resource record sets that it created in the specified hosted
     * zone.
     * </p>
     * 
     * @param tTL
     *        The TTL that Amazon Route 53 assigned to all of the resource record sets that it created in the specified
     *        hosted zone.
     */

    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }

    /**
     * <p>
     * The TTL that Amazon Route 53 assigned to all of the resource record sets that it created in the specified hosted
     * zone.
     * </p>
     * 
     * @return The TTL that Amazon Route 53 assigned to all of the resource record sets that it created in the specified
     *         hosted zone.
     */

    public Long getTTL() {
        return this.tTL;
    }

    /**
     * <p>
     * The TTL that Amazon Route 53 assigned to all of the resource record sets that it created in the specified hosted
     * zone.
     * </p>
     * 
     * @param tTL
     *        The TTL that Amazon Route 53 assigned to all of the resource record sets that it created in the specified
     *        hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicyInstance withTTL(Long tTL) {
        setTTL(tTL);
        return this;
    }

    /**
     * <p>
     * The value of <code>State</code> is one of the following values:
     * </p>
     * <dl>
     * <dt>Applied</dt>
     * <dd>
     * <p>
     * Amazon Route 53 has finished creating resource record sets, and changes have propagated to all Route 53 edge
     * locations.
     * </p>
     * </dd>
     * <dt>Creating</dt>
     * <dd>
     * <p>
     * Route 53 is creating the resource record sets. Use <code>GetTrafficPolicyInstance</code> to confirm that the
     * <code>CreateTrafficPolicyInstance</code> request completed successfully.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * Route 53 wasn't able to create or update the resource record sets. When the value of <code>State</code> is
     * <code>Failed</code>, see <code>Message</code> for an explanation of what caused the request to fail.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param state
     *        The value of <code>State</code> is one of the following values:</p>
     *        <dl>
     *        <dt>Applied</dt>
     *        <dd>
     *        <p>
     *        Amazon Route 53 has finished creating resource record sets, and changes have propagated to all Route 53
     *        edge locations.
     *        </p>
     *        </dd>
     *        <dt>Creating</dt>
     *        <dd>
     *        <p>
     *        Route 53 is creating the resource record sets. Use <code>GetTrafficPolicyInstance</code> to confirm that
     *        the <code>CreateTrafficPolicyInstance</code> request completed successfully.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        Route 53 wasn't able to create or update the resource record sets. When the value of <code>State</code> is
     *        <code>Failed</code>, see <code>Message</code> for an explanation of what caused the request to fail.
     *        </p>
     *        </dd>
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The value of <code>State</code> is one of the following values:
     * </p>
     * <dl>
     * <dt>Applied</dt>
     * <dd>
     * <p>
     * Amazon Route 53 has finished creating resource record sets, and changes have propagated to all Route 53 edge
     * locations.
     * </p>
     * </dd>
     * <dt>Creating</dt>
     * <dd>
     * <p>
     * Route 53 is creating the resource record sets. Use <code>GetTrafficPolicyInstance</code> to confirm that the
     * <code>CreateTrafficPolicyInstance</code> request completed successfully.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * Route 53 wasn't able to create or update the resource record sets. When the value of <code>State</code> is
     * <code>Failed</code>, see <code>Message</code> for an explanation of what caused the request to fail.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The value of <code>State</code> is one of the following values:</p>
     *         <dl>
     *         <dt>Applied</dt>
     *         <dd>
     *         <p>
     *         Amazon Route 53 has finished creating resource record sets, and changes have propagated to all Route 53
     *         edge locations.
     *         </p>
     *         </dd>
     *         <dt>Creating</dt>
     *         <dd>
     *         <p>
     *         Route 53 is creating the resource record sets. Use <code>GetTrafficPolicyInstance</code> to confirm that
     *         the <code>CreateTrafficPolicyInstance</code> request completed successfully.
     *         </p>
     *         </dd>
     *         <dt>Failed</dt>
     *         <dd>
     *         <p>
     *         Route 53 wasn't able to create or update the resource record sets. When the value of <code>State</code>
     *         is <code>Failed</code>, see <code>Message</code> for an explanation of what caused the request to fail.
     *         </p>
     *         </dd>
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The value of <code>State</code> is one of the following values:
     * </p>
     * <dl>
     * <dt>Applied</dt>
     * <dd>
     * <p>
     * Amazon Route 53 has finished creating resource record sets, and changes have propagated to all Route 53 edge
     * locations.
     * </p>
     * </dd>
     * <dt>Creating</dt>
     * <dd>
     * <p>
     * Route 53 is creating the resource record sets. Use <code>GetTrafficPolicyInstance</code> to confirm that the
     * <code>CreateTrafficPolicyInstance</code> request completed successfully.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * Route 53 wasn't able to create or update the resource record sets. When the value of <code>State</code> is
     * <code>Failed</code>, see <code>Message</code> for an explanation of what caused the request to fail.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param state
     *        The value of <code>State</code> is one of the following values:</p>
     *        <dl>
     *        <dt>Applied</dt>
     *        <dd>
     *        <p>
     *        Amazon Route 53 has finished creating resource record sets, and changes have propagated to all Route 53
     *        edge locations.
     *        </p>
     *        </dd>
     *        <dt>Creating</dt>
     *        <dd>
     *        <p>
     *        Route 53 is creating the resource record sets. Use <code>GetTrafficPolicyInstance</code> to confirm that
     *        the <code>CreateTrafficPolicyInstance</code> request completed successfully.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        Route 53 wasn't able to create or update the resource record sets. When the value of <code>State</code> is
     *        <code>Failed</code>, see <code>Message</code> for an explanation of what caused the request to fail.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicyInstance withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * If <code>State</code> is <code>Failed</code>, an explanation of the reason for the failure. If <code>State</code>
     * is another value, <code>Message</code> is empty.
     * </p>
     * 
     * @param message
     *        If <code>State</code> is <code>Failed</code>, an explanation of the reason for the failure. If
     *        <code>State</code> is another value, <code>Message</code> is empty.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * If <code>State</code> is <code>Failed</code>, an explanation of the reason for the failure. If <code>State</code>
     * is another value, <code>Message</code> is empty.
     * </p>
     * 
     * @return If <code>State</code> is <code>Failed</code>, an explanation of the reason for the failure. If
     *         <code>State</code> is another value, <code>Message</code> is empty.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * If <code>State</code> is <code>Failed</code>, an explanation of the reason for the failure. If <code>State</code>
     * is another value, <code>Message</code> is empty.
     * </p>
     * 
     * @param message
     *        If <code>State</code> is <code>Failed</code>, an explanation of the reason for the failure. If
     *        <code>State</code> is another value, <code>Message</code> is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicyInstance withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The ID of the traffic policy that Amazon Route 53 used to create resource record sets in the specified hosted
     * zone.
     * </p>
     * 
     * @param trafficPolicyId
     *        The ID of the traffic policy that Amazon Route 53 used to create resource record sets in the specified
     *        hosted zone.
     */

    public void setTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
    }

    /**
     * <p>
     * The ID of the traffic policy that Amazon Route 53 used to create resource record sets in the specified hosted
     * zone.
     * </p>
     * 
     * @return The ID of the traffic policy that Amazon Route 53 used to create resource record sets in the specified
     *         hosted zone.
     */

    public String getTrafficPolicyId() {
        return this.trafficPolicyId;
    }

    /**
     * <p>
     * The ID of the traffic policy that Amazon Route 53 used to create resource record sets in the specified hosted
     * zone.
     * </p>
     * 
     * @param trafficPolicyId
     *        The ID of the traffic policy that Amazon Route 53 used to create resource record sets in the specified
     *        hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicyInstance withTrafficPolicyId(String trafficPolicyId) {
        setTrafficPolicyId(trafficPolicyId);
        return this;
    }

    /**
     * <p>
     * The version of the traffic policy that Amazon Route 53 used to create resource record sets in the specified
     * hosted zone.
     * </p>
     * 
     * @param trafficPolicyVersion
     *        The version of the traffic policy that Amazon Route 53 used to create resource record sets in the
     *        specified hosted zone.
     */

    public void setTrafficPolicyVersion(Integer trafficPolicyVersion) {
        this.trafficPolicyVersion = trafficPolicyVersion;
    }

    /**
     * <p>
     * The version of the traffic policy that Amazon Route 53 used to create resource record sets in the specified
     * hosted zone.
     * </p>
     * 
     * @return The version of the traffic policy that Amazon Route 53 used to create resource record sets in the
     *         specified hosted zone.
     */

    public Integer getTrafficPolicyVersion() {
        return this.trafficPolicyVersion;
    }

    /**
     * <p>
     * The version of the traffic policy that Amazon Route 53 used to create resource record sets in the specified
     * hosted zone.
     * </p>
     * 
     * @param trafficPolicyVersion
     *        The version of the traffic policy that Amazon Route 53 used to create resource record sets in the
     *        specified hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicyInstance withTrafficPolicyVersion(Integer trafficPolicyVersion) {
        setTrafficPolicyVersion(trafficPolicyVersion);
        return this;
    }

    /**
     * <p>
     * The DNS type that Amazon Route 53 assigned to all of the resource record sets that it created for this traffic
     * policy instance.
     * </p>
     * 
     * @param trafficPolicyType
     *        The DNS type that Amazon Route 53 assigned to all of the resource record sets that it created for this
     *        traffic policy instance.
     * @see RRType
     */

    public void setTrafficPolicyType(String trafficPolicyType) {
        this.trafficPolicyType = trafficPolicyType;
    }

    /**
     * <p>
     * The DNS type that Amazon Route 53 assigned to all of the resource record sets that it created for this traffic
     * policy instance.
     * </p>
     * 
     * @return The DNS type that Amazon Route 53 assigned to all of the resource record sets that it created for this
     *         traffic policy instance.
     * @see RRType
     */

    public String getTrafficPolicyType() {
        return this.trafficPolicyType;
    }

    /**
     * <p>
     * The DNS type that Amazon Route 53 assigned to all of the resource record sets that it created for this traffic
     * policy instance.
     * </p>
     * 
     * @param trafficPolicyType
     *        The DNS type that Amazon Route 53 assigned to all of the resource record sets that it created for this
     *        traffic policy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public TrafficPolicyInstance withTrafficPolicyType(String trafficPolicyType) {
        setTrafficPolicyType(trafficPolicyType);
        return this;
    }

    /**
     * <p>
     * The DNS type that Amazon Route 53 assigned to all of the resource record sets that it created for this traffic
     * policy instance.
     * </p>
     * 
     * @param trafficPolicyType
     *        The DNS type that Amazon Route 53 assigned to all of the resource record sets that it created for this
     *        traffic policy instance.
     * @see RRType
     */

    public void setTrafficPolicyType(RRType trafficPolicyType) {
        withTrafficPolicyType(trafficPolicyType);
    }

    /**
     * <p>
     * The DNS type that Amazon Route 53 assigned to all of the resource record sets that it created for this traffic
     * policy instance.
     * </p>
     * 
     * @param trafficPolicyType
     *        The DNS type that Amazon Route 53 assigned to all of the resource record sets that it created for this
     *        traffic policy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public TrafficPolicyInstance withTrafficPolicyType(RRType trafficPolicyType) {
        this.trafficPolicyType = trafficPolicyType.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTTL() != null)
            sb.append("TTL: ").append(getTTL()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getTrafficPolicyId() != null)
            sb.append("TrafficPolicyId: ").append(getTrafficPolicyId()).append(",");
        if (getTrafficPolicyVersion() != null)
            sb.append("TrafficPolicyVersion: ").append(getTrafficPolicyVersion()).append(",");
        if (getTrafficPolicyType() != null)
            sb.append("TrafficPolicyType: ").append(getTrafficPolicyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficPolicyInstance == false)
            return false;
        TrafficPolicyInstance other = (TrafficPolicyInstance) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTTL() == null ^ this.getTTL() == null)
            return false;
        if (other.getTTL() != null && other.getTTL().equals(this.getTTL()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getTrafficPolicyId() == null ^ this.getTrafficPolicyId() == null)
            return false;
        if (other.getTrafficPolicyId() != null && other.getTrafficPolicyId().equals(this.getTrafficPolicyId()) == false)
            return false;
        if (other.getTrafficPolicyVersion() == null ^ this.getTrafficPolicyVersion() == null)
            return false;
        if (other.getTrafficPolicyVersion() != null && other.getTrafficPolicyVersion().equals(this.getTrafficPolicyVersion()) == false)
            return false;
        if (other.getTrafficPolicyType() == null ^ this.getTrafficPolicyType() == null)
            return false;
        if (other.getTrafficPolicyType() != null && other.getTrafficPolicyType().equals(this.getTrafficPolicyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTTL() == null) ? 0 : getTTL().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyId() == null) ? 0 : getTrafficPolicyId().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyVersion() == null) ? 0 : getTrafficPolicyVersion().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyType() == null) ? 0 : getTrafficPolicyType().hashCode());
        return hashCode;
    }

    @Override
    public TrafficPolicyInstance clone() {
        try {
            return (TrafficPolicyInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
