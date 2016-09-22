/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This action gets the reason that a specified health check failed most recently.
 * </p>
 * <p>
 * To get the reason for the last failure of a health check, send a GET request to the /2013-04-01/healthcheck/health
 * check ID/lastfailurereason resource.
 * </p>
 * <p>
 * For information about viewing the last failure reason for a health check using the Amazon Route 53 console, see <a
 * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-monitor-view-status.html">Viewing Health
 * Check Status and the Reason for Health Check Failures</a> in the <i>Amazon Route 53 Developer Guide</i>.
 * </p>
 */
public class GetHealthCheckLastFailureReasonRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the health check for which you want the last failure reason. When you created the health check,
     * <code>CreateHealthCheck</code> returned the ID in the response, in the <code>HealthCheckId</code> element.
     * </p>
     */
    private String healthCheckId;

    /**
     * <p>
     * The ID for the health check for which you want the last failure reason. When you created the health check,
     * <code>CreateHealthCheck</code> returned the ID in the response, in the <code>HealthCheckId</code> element.
     * </p>
     * 
     * @param healthCheckId
     *        The ID for the health check for which you want the last failure reason. When you created the health check,
     *        <code>CreateHealthCheck</code> returned the ID in the response, in the <code>HealthCheckId</code> element.
     */

    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    /**
     * <p>
     * The ID for the health check for which you want the last failure reason. When you created the health check,
     * <code>CreateHealthCheck</code> returned the ID in the response, in the <code>HealthCheckId</code> element.
     * </p>
     * 
     * @return The ID for the health check for which you want the last failure reason. When you created the health
     *         check, <code>CreateHealthCheck</code> returned the ID in the response, in the <code>HealthCheckId</code>
     *         element.
     */

    public String getHealthCheckId() {
        return this.healthCheckId;
    }

    /**
     * <p>
     * The ID for the health check for which you want the last failure reason. When you created the health check,
     * <code>CreateHealthCheck</code> returned the ID in the response, in the <code>HealthCheckId</code> element.
     * </p>
     * 
     * @param healthCheckId
     *        The ID for the health check for which you want the last failure reason. When you created the health check,
     *        <code>CreateHealthCheck</code> returned the ID in the response, in the <code>HealthCheckId</code> element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHealthCheckLastFailureReasonRequest withHealthCheckId(String healthCheckId) {
        setHealthCheckId(healthCheckId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHealthCheckId() != null)
            sb.append("HealthCheckId: " + getHealthCheckId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHealthCheckLastFailureReasonRequest == false)
            return false;
        GetHealthCheckLastFailureReasonRequest other = (GetHealthCheckLastFailureReasonRequest) obj;
        if (other.getHealthCheckId() == null ^ this.getHealthCheckId() == null)
            return false;
        if (other.getHealthCheckId() != null && other.getHealthCheckId().equals(this.getHealthCheckId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthCheckId() == null) ? 0 : getHealthCheckId().hashCode());
        return hashCode;
    }

    @Override
    public GetHealthCheckLastFailureReasonRequest clone() {
        return (GetHealthCheckLastFailureReasonRequest) super.clone();
    }
}
