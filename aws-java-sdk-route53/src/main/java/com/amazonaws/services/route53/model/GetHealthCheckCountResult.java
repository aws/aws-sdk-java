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

/**
 * <p>
 * A complex type that contains the response to a <code>healthcheckcount</code> request.
 * </p>
 */
public class GetHealthCheckCountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of health checks associated with the current AWS account.
     * </p>
     */
    private Long healthCheckCount;

    /**
     * <p>
     * The number of health checks associated with the current AWS account.
     * </p>
     * 
     * @param healthCheckCount
     *        The number of health checks associated with the current AWS account.
     */

    public void setHealthCheckCount(Long healthCheckCount) {
        this.healthCheckCount = healthCheckCount;
    }

    /**
     * <p>
     * The number of health checks associated with the current AWS account.
     * </p>
     * 
     * @return The number of health checks associated with the current AWS account.
     */

    public Long getHealthCheckCount() {
        return this.healthCheckCount;
    }

    /**
     * <p>
     * The number of health checks associated with the current AWS account.
     * </p>
     * 
     * @param healthCheckCount
     *        The number of health checks associated with the current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHealthCheckCountResult withHealthCheckCount(Long healthCheckCount) {
        setHealthCheckCount(healthCheckCount);
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
        if (getHealthCheckCount() != null)
            sb.append("HealthCheckCount: " + getHealthCheckCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHealthCheckCountResult == false)
            return false;
        GetHealthCheckCountResult other = (GetHealthCheckCountResult) obj;
        if (other.getHealthCheckCount() == null ^ this.getHealthCheckCount() == null)
            return false;
        if (other.getHealthCheckCount() != null && other.getHealthCheckCount().equals(this.getHealthCheckCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthCheckCount() == null) ? 0 : getHealthCheckCount().hashCode());
        return hashCode;
    }

    @Override
    public GetHealthCheckCountResult clone() {
        try {
            return (GetHealthCheckCountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
