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
 * Information about the health of a target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/TargetHealthDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetHealthDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the target.
     * </p>
     */
    private TargetDescription target;
    /**
     * <p>
     * The port to use to connect with the target.
     * </p>
     */
    private String healthCheckPort;
    /**
     * <p>
     * The health information for the target.
     * </p>
     */
    private TargetHealth targetHealth;

    /**
     * <p>
     * The description of the target.
     * </p>
     * 
     * @param target
     *        The description of the target.
     */

    public void setTarget(TargetDescription target) {
        this.target = target;
    }

    /**
     * <p>
     * The description of the target.
     * </p>
     * 
     * @return The description of the target.
     */

    public TargetDescription getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The description of the target.
     * </p>
     * 
     * @param target
     *        The description of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetHealthDescription withTarget(TargetDescription target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The port to use to connect with the target.
     * </p>
     * 
     * @param healthCheckPort
     *        The port to use to connect with the target.
     */

    public void setHealthCheckPort(String healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
    }

    /**
     * <p>
     * The port to use to connect with the target.
     * </p>
     * 
     * @return The port to use to connect with the target.
     */

    public String getHealthCheckPort() {
        return this.healthCheckPort;
    }

    /**
     * <p>
     * The port to use to connect with the target.
     * </p>
     * 
     * @param healthCheckPort
     *        The port to use to connect with the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetHealthDescription withHealthCheckPort(String healthCheckPort) {
        setHealthCheckPort(healthCheckPort);
        return this;
    }

    /**
     * <p>
     * The health information for the target.
     * </p>
     * 
     * @param targetHealth
     *        The health information for the target.
     */

    public void setTargetHealth(TargetHealth targetHealth) {
        this.targetHealth = targetHealth;
    }

    /**
     * <p>
     * The health information for the target.
     * </p>
     * 
     * @return The health information for the target.
     */

    public TargetHealth getTargetHealth() {
        return this.targetHealth;
    }

    /**
     * <p>
     * The health information for the target.
     * </p>
     * 
     * @param targetHealth
     *        The health information for the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetHealthDescription withTargetHealth(TargetHealth targetHealth) {
        setTargetHealth(targetHealth);
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
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getHealthCheckPort() != null)
            sb.append("HealthCheckPort: ").append(getHealthCheckPort()).append(",");
        if (getTargetHealth() != null)
            sb.append("TargetHealth: ").append(getTargetHealth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetHealthDescription == false)
            return false;
        TargetHealthDescription other = (TargetHealthDescription) obj;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getHealthCheckPort() == null ^ this.getHealthCheckPort() == null)
            return false;
        if (other.getHealthCheckPort() != null && other.getHealthCheckPort().equals(this.getHealthCheckPort()) == false)
            return false;
        if (other.getTargetHealth() == null ^ this.getTargetHealth() == null)
            return false;
        if (other.getTargetHealth() != null && other.getTargetHealth().equals(this.getTargetHealth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckPort() == null) ? 0 : getHealthCheckPort().hashCode());
        hashCode = prime * hashCode + ((getTargetHealth() == null) ? 0 : getTargetHealth().hashCode());
        return hashCode;
    }

    @Override
    public TargetHealthDescription clone() {
        try {
            return (TargetHealthDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
