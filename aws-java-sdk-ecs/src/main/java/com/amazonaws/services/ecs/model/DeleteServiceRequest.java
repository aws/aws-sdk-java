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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeleteService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to delete. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The name of the service to delete.
     * </p>
     */
    private String service;
    /**
     * <p>
     * If <code>true</code>, allows you to delete a service even if it has not been scaled down to zero tasks. It is
     * only necessary to use this if the service is using the <code>REPLICA</code> scheduling strategy.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to delete. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to delete. If you
     *        do not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to delete. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to delete. If you
     *         do not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to delete. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to delete. If you
     *        do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServiceRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The name of the service to delete.
     * </p>
     * 
     * @param service
     *        The name of the service to delete.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The name of the service to delete.
     * </p>
     * 
     * @return The name of the service to delete.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The name of the service to delete.
     * </p>
     * 
     * @param service
     *        The name of the service to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServiceRequest withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, allows you to delete a service even if it has not been scaled down to zero tasks. It is
     * only necessary to use this if the service is using the <code>REPLICA</code> scheduling strategy.
     * </p>
     * 
     * @param force
     *        If <code>true</code>, allows you to delete a service even if it has not been scaled down to zero tasks. It
     *        is only necessary to use this if the service is using the <code>REPLICA</code> scheduling strategy.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * If <code>true</code>, allows you to delete a service even if it has not been scaled down to zero tasks. It is
     * only necessary to use this if the service is using the <code>REPLICA</code> scheduling strategy.
     * </p>
     * 
     * @return If <code>true</code>, allows you to delete a service even if it has not been scaled down to zero tasks.
     *         It is only necessary to use this if the service is using the <code>REPLICA</code> scheduling strategy.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * If <code>true</code>, allows you to delete a service even if it has not been scaled down to zero tasks. It is
     * only necessary to use this if the service is using the <code>REPLICA</code> scheduling strategy.
     * </p>
     * 
     * @param force
     *        If <code>true</code>, allows you to delete a service even if it has not been scaled down to zero tasks. It
     *        is only necessary to use this if the service is using the <code>REPLICA</code> scheduling strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServiceRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, allows you to delete a service even if it has not been scaled down to zero tasks. It is
     * only necessary to use this if the service is using the <code>REPLICA</code> scheduling strategy.
     * </p>
     * 
     * @return If <code>true</code>, allows you to delete a service even if it has not been scaled down to zero tasks.
     *         It is only necessary to use this if the service is using the <code>REPLICA</code> scheduling strategy.
     */

    public Boolean isForce() {
        return this.force;
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteServiceRequest == false)
            return false;
        DeleteServiceRequest other = (DeleteServiceRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public DeleteServiceRequest clone() {
        return (DeleteServiceRequest) super.clone();
    }

}
