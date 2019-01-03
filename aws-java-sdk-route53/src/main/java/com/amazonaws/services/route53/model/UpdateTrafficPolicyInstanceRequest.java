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
 * A complex type that contains information about the resource record sets that you want to update based on a specified
 * traffic policy instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateTrafficPolicyInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrafficPolicyInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the traffic policy instance that you want to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The TTL that you want Amazon Route 53 to assign to all of the updated resource record sets.
     * </p>
     */
    private Long tTL;
    /**
     * <p>
     * The ID of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the
     * specified traffic policy instance.
     * </p>
     */
    private String trafficPolicyId;
    /**
     * <p>
     * The version of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the
     * specified traffic policy instance.
     * </p>
     */
    private Integer trafficPolicyVersion;

    /**
     * <p>
     * The ID of the traffic policy instance that you want to update.
     * </p>
     * 
     * @param id
     *        The ID of the traffic policy instance that you want to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the traffic policy instance that you want to update.
     * </p>
     * 
     * @return The ID of the traffic policy instance that you want to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the traffic policy instance that you want to update.
     * </p>
     * 
     * @param id
     *        The ID of the traffic policy instance that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficPolicyInstanceRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The TTL that you want Amazon Route 53 to assign to all of the updated resource record sets.
     * </p>
     * 
     * @param tTL
     *        The TTL that you want Amazon Route 53 to assign to all of the updated resource record sets.
     */

    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }

    /**
     * <p>
     * The TTL that you want Amazon Route 53 to assign to all of the updated resource record sets.
     * </p>
     * 
     * @return The TTL that you want Amazon Route 53 to assign to all of the updated resource record sets.
     */

    public Long getTTL() {
        return this.tTL;
    }

    /**
     * <p>
     * The TTL that you want Amazon Route 53 to assign to all of the updated resource record sets.
     * </p>
     * 
     * @param tTL
     *        The TTL that you want Amazon Route 53 to assign to all of the updated resource record sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficPolicyInstanceRequest withTTL(Long tTL) {
        setTTL(tTL);
        return this;
    }

    /**
     * <p>
     * The ID of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the
     * specified traffic policy instance.
     * </p>
     * 
     * @param trafficPolicyId
     *        The ID of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the
     *        specified traffic policy instance.
     */

    public void setTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
    }

    /**
     * <p>
     * The ID of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the
     * specified traffic policy instance.
     * </p>
     * 
     * @return The ID of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the
     *         specified traffic policy instance.
     */

    public String getTrafficPolicyId() {
        return this.trafficPolicyId;
    }

    /**
     * <p>
     * The ID of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the
     * specified traffic policy instance.
     * </p>
     * 
     * @param trafficPolicyId
     *        The ID of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the
     *        specified traffic policy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficPolicyInstanceRequest withTrafficPolicyId(String trafficPolicyId) {
        setTrafficPolicyId(trafficPolicyId);
        return this;
    }

    /**
     * <p>
     * The version of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the
     * specified traffic policy instance.
     * </p>
     * 
     * @param trafficPolicyVersion
     *        The version of the traffic policy that you want Amazon Route 53 to use to update resource record sets for
     *        the specified traffic policy instance.
     */

    public void setTrafficPolicyVersion(Integer trafficPolicyVersion) {
        this.trafficPolicyVersion = trafficPolicyVersion;
    }

    /**
     * <p>
     * The version of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the
     * specified traffic policy instance.
     * </p>
     * 
     * @return The version of the traffic policy that you want Amazon Route 53 to use to update resource record sets for
     *         the specified traffic policy instance.
     */

    public Integer getTrafficPolicyVersion() {
        return this.trafficPolicyVersion;
    }

    /**
     * <p>
     * The version of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the
     * specified traffic policy instance.
     * </p>
     * 
     * @param trafficPolicyVersion
     *        The version of the traffic policy that you want Amazon Route 53 to use to update resource record sets for
     *        the specified traffic policy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficPolicyInstanceRequest withTrafficPolicyVersion(Integer trafficPolicyVersion) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof UpdateTrafficPolicyInstanceRequest == false)
            return false;
        UpdateTrafficPolicyInstanceRequest other = (UpdateTrafficPolicyInstanceRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTTL() == null) ? 0 : getTTL().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyId() == null) ? 0 : getTrafficPolicyId().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyVersion() == null) ? 0 : getTrafficPolicyVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrafficPolicyInstanceRequest clone() {
        return (UpdateTrafficPolicyInstanceRequest) super.clone();
    }

}
