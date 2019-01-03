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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains information about the resource record sets that you want to create based on a specified
 * traffic policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateTrafficPolicyInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrafficPolicyInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the hosted zone that you want Amazon Route 53 to create resource record sets in by using the
     * configuration in a traffic policy.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * The domain name (such as example.com) or subdomain name (such as www.example.com) for which Amazon Route 53
     * responds to DNS queries by using the resource record sets that Route 53 creates for this traffic policy instance.
     * </p>
     */
    private String name;
    /**
     * <p>
     * (Optional) The TTL that you want Amazon Route 53 to assign to all of the resource record sets that it creates in
     * the specified hosted zone.
     * </p>
     */
    private Long tTL;
    /**
     * <p>
     * The ID of the traffic policy that you want to use to create resource record sets in the specified hosted zone.
     * </p>
     */
    private String trafficPolicyId;
    /**
     * <p>
     * The version of the traffic policy that you want to use to create resource record sets in the specified hosted
     * zone.
     * </p>
     */
    private Integer trafficPolicyVersion;

    /**
     * <p>
     * The ID of the hosted zone that you want Amazon Route 53 to create resource record sets in by using the
     * configuration in a traffic policy.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that you want Amazon Route 53 to create resource record sets in by using the
     *        configuration in a traffic policy.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want Amazon Route 53 to create resource record sets in by using the
     * configuration in a traffic policy.
     * </p>
     * 
     * @return The ID of the hosted zone that you want Amazon Route 53 to create resource record sets in by using the
     *         configuration in a traffic policy.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want Amazon Route 53 to create resource record sets in by using the
     * configuration in a traffic policy.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that you want Amazon Route 53 to create resource record sets in by using the
     *        configuration in a traffic policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyInstanceRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * The domain name (such as example.com) or subdomain name (such as www.example.com) for which Amazon Route 53
     * responds to DNS queries by using the resource record sets that Route 53 creates for this traffic policy instance.
     * </p>
     * 
     * @param name
     *        The domain name (such as example.com) or subdomain name (such as www.example.com) for which Amazon Route
     *        53 responds to DNS queries by using the resource record sets that Route 53 creates for this traffic policy
     *        instance.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The domain name (such as example.com) or subdomain name (such as www.example.com) for which Amazon Route 53
     * responds to DNS queries by using the resource record sets that Route 53 creates for this traffic policy instance.
     * </p>
     * 
     * @return The domain name (such as example.com) or subdomain name (such as www.example.com) for which Amazon Route
     *         53 responds to DNS queries by using the resource record sets that Route 53 creates for this traffic
     *         policy instance.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The domain name (such as example.com) or subdomain name (such as www.example.com) for which Amazon Route 53
     * responds to DNS queries by using the resource record sets that Route 53 creates for this traffic policy instance.
     * </p>
     * 
     * @param name
     *        The domain name (such as example.com) or subdomain name (such as www.example.com) for which Amazon Route
     *        53 responds to DNS queries by using the resource record sets that Route 53 creates for this traffic policy
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyInstanceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * (Optional) The TTL that you want Amazon Route 53 to assign to all of the resource record sets that it creates in
     * the specified hosted zone.
     * </p>
     * 
     * @param tTL
     *        (Optional) The TTL that you want Amazon Route 53 to assign to all of the resource record sets that it
     *        creates in the specified hosted zone.
     */

    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }

    /**
     * <p>
     * (Optional) The TTL that you want Amazon Route 53 to assign to all of the resource record sets that it creates in
     * the specified hosted zone.
     * </p>
     * 
     * @return (Optional) The TTL that you want Amazon Route 53 to assign to all of the resource record sets that it
     *         creates in the specified hosted zone.
     */

    public Long getTTL() {
        return this.tTL;
    }

    /**
     * <p>
     * (Optional) The TTL that you want Amazon Route 53 to assign to all of the resource record sets that it creates in
     * the specified hosted zone.
     * </p>
     * 
     * @param tTL
     *        (Optional) The TTL that you want Amazon Route 53 to assign to all of the resource record sets that it
     *        creates in the specified hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyInstanceRequest withTTL(Long tTL) {
        setTTL(tTL);
        return this;
    }

    /**
     * <p>
     * The ID of the traffic policy that you want to use to create resource record sets in the specified hosted zone.
     * </p>
     * 
     * @param trafficPolicyId
     *        The ID of the traffic policy that you want to use to create resource record sets in the specified hosted
     *        zone.
     */

    public void setTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
    }

    /**
     * <p>
     * The ID of the traffic policy that you want to use to create resource record sets in the specified hosted zone.
     * </p>
     * 
     * @return The ID of the traffic policy that you want to use to create resource record sets in the specified hosted
     *         zone.
     */

    public String getTrafficPolicyId() {
        return this.trafficPolicyId;
    }

    /**
     * <p>
     * The ID of the traffic policy that you want to use to create resource record sets in the specified hosted zone.
     * </p>
     * 
     * @param trafficPolicyId
     *        The ID of the traffic policy that you want to use to create resource record sets in the specified hosted
     *        zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyInstanceRequest withTrafficPolicyId(String trafficPolicyId) {
        setTrafficPolicyId(trafficPolicyId);
        return this;
    }

    /**
     * <p>
     * The version of the traffic policy that you want to use to create resource record sets in the specified hosted
     * zone.
     * </p>
     * 
     * @param trafficPolicyVersion
     *        The version of the traffic policy that you want to use to create resource record sets in the specified
     *        hosted zone.
     */

    public void setTrafficPolicyVersion(Integer trafficPolicyVersion) {
        this.trafficPolicyVersion = trafficPolicyVersion;
    }

    /**
     * <p>
     * The version of the traffic policy that you want to use to create resource record sets in the specified hosted
     * zone.
     * </p>
     * 
     * @return The version of the traffic policy that you want to use to create resource record sets in the specified
     *         hosted zone.
     */

    public Integer getTrafficPolicyVersion() {
        return this.trafficPolicyVersion;
    }

    /**
     * <p>
     * The version of the traffic policy that you want to use to create resource record sets in the specified hosted
     * zone.
     * </p>
     * 
     * @param trafficPolicyVersion
     *        The version of the traffic policy that you want to use to create resource record sets in the specified
     *        hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyInstanceRequest withTrafficPolicyVersion(Integer trafficPolicyVersion) {
        setTrafficPolicyVersion(trafficPolicyVersion);
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTTL() != null)
            sb.append("TTL: ").append(getTTL()).append(",");
        if (getTrafficPolicyId() != null)
            sb.append("TrafficPolicyId: ").append(getTrafficPolicyId()).append(",");
        if (getTrafficPolicyVersion() != null)
            sb.append("TrafficPolicyVersion: ").append(getTrafficPolicyVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrafficPolicyInstanceRequest == false)
            return false;
        CreateTrafficPolicyInstanceRequest other = (CreateTrafficPolicyInstanceRequest) obj;
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
        if (other.getTrafficPolicyId() == null ^ this.getTrafficPolicyId() == null)
            return false;
        if (other.getTrafficPolicyId() != null && other.getTrafficPolicyId().equals(this.getTrafficPolicyId()) == false)
            return false;
        if (other.getTrafficPolicyVersion() == null ^ this.getTrafficPolicyVersion() == null)
            return false;
        if (other.getTrafficPolicyVersion() != null && other.getTrafficPolicyVersion().equals(this.getTrafficPolicyVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTTL() == null) ? 0 : getTTL().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyId() == null) ? 0 : getTrafficPolicyId().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyVersion() == null) ? 0 : getTrafficPolicyVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrafficPolicyInstanceRequest clone() {
        return (CreateTrafficPolicyInstanceRequest) super.clone();
    }

}
