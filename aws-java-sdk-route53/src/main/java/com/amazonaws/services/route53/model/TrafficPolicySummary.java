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
 * A complex type that contains information about the latest version of one traffic policy that is associated with the
 * current AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/TrafficPolicySummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficPolicySummary implements Serializable, Cloneable {

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the traffic policy when you created it.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name that you specified for the traffic policy when you created it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a
     * traffic policy instance.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The version number of the latest version of the traffic policy.
     * </p>
     */
    private Integer latestVersion;
    /**
     * <p>
     * The number of traffic policies that are associated with the current AWS account.
     * </p>
     */
    private Integer trafficPolicyCount;

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the traffic policy when you created it.
     * </p>
     * 
     * @param id
     *        The ID that Amazon Route 53 assigned to the traffic policy when you created it.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the traffic policy when you created it.
     * </p>
     * 
     * @return The ID that Amazon Route 53 assigned to the traffic policy when you created it.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the traffic policy when you created it.
     * </p>
     * 
     * @param id
     *        The ID that Amazon Route 53 assigned to the traffic policy when you created it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicySummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name that you specified for the traffic policy when you created it.
     * </p>
     * 
     * @param name
     *        The name that you specified for the traffic policy when you created it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you specified for the traffic policy when you created it.
     * </p>
     * 
     * @return The name that you specified for the traffic policy when you created it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that you specified for the traffic policy when you created it.
     * </p>
     * 
     * @param name
     *        The name that you specified for the traffic policy when you created it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicySummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a
     * traffic policy instance.
     * </p>
     * 
     * @param type
     *        The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to
     *        create a traffic policy instance.
     * @see RRType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a
     * traffic policy instance.
     * </p>
     * 
     * @return The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to
     *         create a traffic policy instance.
     * @see RRType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a
     * traffic policy instance.
     * </p>
     * 
     * @param type
     *        The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to
     *        create a traffic policy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public TrafficPolicySummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a
     * traffic policy instance.
     * </p>
     * 
     * @param type
     *        The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to
     *        create a traffic policy instance.
     * @see RRType
     */

    public void setType(RRType type) {
        withType(type);
    }

    /**
     * <p>
     * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a
     * traffic policy instance.
     * </p>
     * 
     * @param type
     *        The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to
     *        create a traffic policy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public TrafficPolicySummary withType(RRType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The version number of the latest version of the traffic policy.
     * </p>
     * 
     * @param latestVersion
     *        The version number of the latest version of the traffic policy.
     */

    public void setLatestVersion(Integer latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * <p>
     * The version number of the latest version of the traffic policy.
     * </p>
     * 
     * @return The version number of the latest version of the traffic policy.
     */

    public Integer getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * <p>
     * The version number of the latest version of the traffic policy.
     * </p>
     * 
     * @param latestVersion
     *        The version number of the latest version of the traffic policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicySummary withLatestVersion(Integer latestVersion) {
        setLatestVersion(latestVersion);
        return this;
    }

    /**
     * <p>
     * The number of traffic policies that are associated with the current AWS account.
     * </p>
     * 
     * @param trafficPolicyCount
     *        The number of traffic policies that are associated with the current AWS account.
     */

    public void setTrafficPolicyCount(Integer trafficPolicyCount) {
        this.trafficPolicyCount = trafficPolicyCount;
    }

    /**
     * <p>
     * The number of traffic policies that are associated with the current AWS account.
     * </p>
     * 
     * @return The number of traffic policies that are associated with the current AWS account.
     */

    public Integer getTrafficPolicyCount() {
        return this.trafficPolicyCount;
    }

    /**
     * <p>
     * The number of traffic policies that are associated with the current AWS account.
     * </p>
     * 
     * @param trafficPolicyCount
     *        The number of traffic policies that are associated with the current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficPolicySummary withTrafficPolicyCount(Integer trafficPolicyCount) {
        setTrafficPolicyCount(trafficPolicyCount);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLatestVersion() != null)
            sb.append("LatestVersion: ").append(getLatestVersion()).append(",");
        if (getTrafficPolicyCount() != null)
            sb.append("TrafficPolicyCount: ").append(getTrafficPolicyCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficPolicySummary == false)
            return false;
        TrafficPolicySummary other = (TrafficPolicySummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null)
            return false;
        if (other.getLatestVersion() != null && other.getLatestVersion().equals(this.getLatestVersion()) == false)
            return false;
        if (other.getTrafficPolicyCount() == null ^ this.getTrafficPolicyCount() == null)
            return false;
        if (other.getTrafficPolicyCount() != null && other.getTrafficPolicyCount().equals(this.getTrafficPolicyCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyCount() == null) ? 0 : getTrafficPolicyCount().hashCode());
        return hashCode;
    }

    @Override
    public TrafficPolicySummary clone() {
        try {
            return (TrafficPolicySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
