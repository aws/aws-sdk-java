/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.route53.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains information about the request to get a health
 * check.
 * </p>
 */
public class GetHealthCheckRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ID of the health check to retrieve.
     * </p>
     */
    private String healthCheckId;

    /**
     * <p>
     * The ID of the health check to retrieve.
     * </p>
     * 
     * @param healthCheckId
     *        The ID of the health check to retrieve.
     */
    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    /**
     * <p>
     * The ID of the health check to retrieve.
     * </p>
     * 
     * @return The ID of the health check to retrieve.
     */
    public String getHealthCheckId() {
        return this.healthCheckId;
    }

    /**
     * <p>
     * The ID of the health check to retrieve.
     * </p>
     * 
     * @param healthCheckId
     *        The ID of the health check to retrieve.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetHealthCheckRequest withHealthCheckId(String healthCheckId) {
        setHealthCheckId(healthCheckId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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

        if (obj instanceof GetHealthCheckRequest == false)
            return false;
        GetHealthCheckRequest other = (GetHealthCheckRequest) obj;
        if (other.getHealthCheckId() == null ^ this.getHealthCheckId() == null)
            return false;
        if (other.getHealthCheckId() != null
                && other.getHealthCheckId().equals(this.getHealthCheckId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHealthCheckId() == null) ? 0 : getHealthCheckId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public GetHealthCheckRequest clone() {
        return (GetHealthCheckRequest) super.clone();
    }
}