/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * The deployment circuit breaker can only be used for services using the rolling update (<code>ECS</code>) deployment
 * type that are not behind a Classic Load Balancer.
 * </p>
 * </note>
 * <p>
 * The <b>deployment circuit breaker</b> determines whether a service deployment will fail if the service can't reach a
 * steady state. If enabled, a service deployment will transition to a failed state and stop launching new tasks. You
 * can also enable Amazon ECS to roll back your service to the last completed deployment after a failure. For more
 * information, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-ecs.html">Rolling update</a> in the
 * <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeploymentCircuitBreaker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentCircuitBreaker implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to enable the deployment circuit breaker logic for the service.
     * </p>
     */
    private Boolean enable;
    /**
     * <p>
     * Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when
     * a service deployment fails, the service is rolled back to the last deployment that completed successfully.
     * </p>
     */
    private Boolean rollback;

    /**
     * <p>
     * Whether to enable the deployment circuit breaker logic for the service.
     * </p>
     * 
     * @param enable
     *        Whether to enable the deployment circuit breaker logic for the service.
     */

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * <p>
     * Whether to enable the deployment circuit breaker logic for the service.
     * </p>
     * 
     * @return Whether to enable the deployment circuit breaker logic for the service.
     */

    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * <p>
     * Whether to enable the deployment circuit breaker logic for the service.
     * </p>
     * 
     * @param enable
     *        Whether to enable the deployment circuit breaker logic for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentCircuitBreaker withEnable(Boolean enable) {
        setEnable(enable);
        return this;
    }

    /**
     * <p>
     * Whether to enable the deployment circuit breaker logic for the service.
     * </p>
     * 
     * @return Whether to enable the deployment circuit breaker logic for the service.
     */

    public Boolean isEnable() {
        return this.enable;
    }

    /**
     * <p>
     * Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when
     * a service deployment fails, the service is rolled back to the last deployment that completed successfully.
     * </p>
     * 
     * @param rollback
     *        Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is
     *        enabled, when a service deployment fails, the service is rolled back to the last deployment that completed
     *        successfully.
     */

    public void setRollback(Boolean rollback) {
        this.rollback = rollback;
    }

    /**
     * <p>
     * Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when
     * a service deployment fails, the service is rolled back to the last deployment that completed successfully.
     * </p>
     * 
     * @return Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is
     *         enabled, when a service deployment fails, the service is rolled back to the last deployment that
     *         completed successfully.
     */

    public Boolean getRollback() {
        return this.rollback;
    }

    /**
     * <p>
     * Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when
     * a service deployment fails, the service is rolled back to the last deployment that completed successfully.
     * </p>
     * 
     * @param rollback
     *        Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is
     *        enabled, when a service deployment fails, the service is rolled back to the last deployment that completed
     *        successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentCircuitBreaker withRollback(Boolean rollback) {
        setRollback(rollback);
        return this;
    }

    /**
     * <p>
     * Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when
     * a service deployment fails, the service is rolled back to the last deployment that completed successfully.
     * </p>
     * 
     * @return Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is
     *         enabled, when a service deployment fails, the service is rolled back to the last deployment that
     *         completed successfully.
     */

    public Boolean isRollback() {
        return this.rollback;
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
        if (getEnable() != null)
            sb.append("Enable: ").append(getEnable()).append(",");
        if (getRollback() != null)
            sb.append("Rollback: ").append(getRollback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentCircuitBreaker == false)
            return false;
        DeploymentCircuitBreaker other = (DeploymentCircuitBreaker) obj;
        if (other.getEnable() == null ^ this.getEnable() == null)
            return false;
        if (other.getEnable() != null && other.getEnable().equals(this.getEnable()) == false)
            return false;
        if (other.getRollback() == null ^ this.getRollback() == null)
            return false;
        if (other.getRollback() != null && other.getRollback().equals(this.getRollback()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnable() == null) ? 0 : getEnable().hashCode());
        hashCode = prime * hashCode + ((getRollback() == null) ? 0 : getRollback().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentCircuitBreaker clone() {
        try {
            return (DeploymentCircuitBreaker) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.DeploymentCircuitBreakerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
