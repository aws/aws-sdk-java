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
 * A request to get information about a specified health check.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHealthCheck" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHealthCheckRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier that Amazon Route 53 assigned to the health check when you created it. When you add or update a
     * resource record set, you use this value to specify which health check to use. The value can be up to 64
     * characters long.
     * </p>
     */
    private String healthCheckId;

    /**
     * <p>
     * The identifier that Amazon Route 53 assigned to the health check when you created it. When you add or update a
     * resource record set, you use this value to specify which health check to use. The value can be up to 64
     * characters long.
     * </p>
     * 
     * @param healthCheckId
     *        The identifier that Amazon Route 53 assigned to the health check when you created it. When you add or
     *        update a resource record set, you use this value to specify which health check to use. The value can be up
     *        to 64 characters long.
     */

    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    /**
     * <p>
     * The identifier that Amazon Route 53 assigned to the health check when you created it. When you add or update a
     * resource record set, you use this value to specify which health check to use. The value can be up to 64
     * characters long.
     * </p>
     * 
     * @return The identifier that Amazon Route 53 assigned to the health check when you created it. When you add or
     *         update a resource record set, you use this value to specify which health check to use. The value can be
     *         up to 64 characters long.
     */

    public String getHealthCheckId() {
        return this.healthCheckId;
    }

    /**
     * <p>
     * The identifier that Amazon Route 53 assigned to the health check when you created it. When you add or update a
     * resource record set, you use this value to specify which health check to use. The value can be up to 64
     * characters long.
     * </p>
     * 
     * @param healthCheckId
     *        The identifier that Amazon Route 53 assigned to the health check when you created it. When you add or
     *        update a resource record set, you use this value to specify which health check to use. The value can be up
     *        to 64 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHealthCheckRequest withHealthCheckId(String healthCheckId) {
        setHealthCheckId(healthCheckId);
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
        if (getHealthCheckId() != null)
            sb.append("HealthCheckId: ").append(getHealthCheckId());
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
    public GetHealthCheckRequest clone() {
        return (GetHealthCheckRequest) super.clone();
    }

}
