/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateTargetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTargetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The health check configuration.
     * </p>
     */
    private HealthCheckConfig healthCheck;
    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the target group.
     * </p>
     */
    private String targetGroupIdentifier;

    /**
     * <p>
     * The health check configuration.
     * </p>
     * 
     * @param healthCheck
     *        The health check configuration.
     */

    public void setHealthCheck(HealthCheckConfig healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * The health check configuration.
     * </p>
     * 
     * @return The health check configuration.
     */

    public HealthCheckConfig getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * <p>
     * The health check configuration.
     * </p>
     * 
     * @param healthCheck
     *        The health check configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTargetGroupRequest withHealthCheck(HealthCheckConfig healthCheck) {
        setHealthCheck(healthCheck);
        return this;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param targetGroupIdentifier
     *        The ID or Amazon Resource Name (ARN) of the target group.
     */

    public void setTargetGroupIdentifier(String targetGroupIdentifier) {
        this.targetGroupIdentifier = targetGroupIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the target group.
     */

    public String getTargetGroupIdentifier() {
        return this.targetGroupIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param targetGroupIdentifier
     *        The ID or Amazon Resource Name (ARN) of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTargetGroupRequest withTargetGroupIdentifier(String targetGroupIdentifier) {
        setTargetGroupIdentifier(targetGroupIdentifier);
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
        if (getHealthCheck() != null)
            sb.append("HealthCheck: ").append(getHealthCheck()).append(",");
        if (getTargetGroupIdentifier() != null)
            sb.append("TargetGroupIdentifier: ").append(getTargetGroupIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTargetGroupRequest == false)
            return false;
        UpdateTargetGroupRequest other = (UpdateTargetGroupRequest) obj;
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        if (other.getTargetGroupIdentifier() == null ^ this.getTargetGroupIdentifier() == null)
            return false;
        if (other.getTargetGroupIdentifier() != null && other.getTargetGroupIdentifier().equals(this.getTargetGroupIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupIdentifier() == null) ? 0 : getTargetGroupIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTargetGroupRequest clone() {
        return (UpdateTargetGroupRequest) super.clone();
    }

}
