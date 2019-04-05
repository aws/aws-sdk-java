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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateServicePrimaryTaskSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServicePrimaryTaskSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists
     * in.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task set in the
     * deployment.
     * </p>
     */
    private String primaryTaskSet;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists
     * in.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set
     *        exists in.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists
     * in.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set
     *         exists in.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists
     * in.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set
     *        exists in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServicePrimaryTaskSetRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
     * </p>
     * 
     * @param service
     *        The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
     * </p>
     * 
     * @param service
     *        The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServicePrimaryTaskSetRequest withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task set in the
     * deployment.
     * </p>
     * 
     * @param primaryTaskSet
     *        The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task set in the
     *        deployment.
     */

    public void setPrimaryTaskSet(String primaryTaskSet) {
        this.primaryTaskSet = primaryTaskSet;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task set in the
     * deployment.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task set in the
     *         deployment.
     */

    public String getPrimaryTaskSet() {
        return this.primaryTaskSet;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task set in the
     * deployment.
     * </p>
     * 
     * @param primaryTaskSet
     *        The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task set in the
     *        deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServicePrimaryTaskSetRequest withPrimaryTaskSet(String primaryTaskSet) {
        setPrimaryTaskSet(primaryTaskSet);
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getPrimaryTaskSet() != null)
            sb.append("PrimaryTaskSet: ").append(getPrimaryTaskSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServicePrimaryTaskSetRequest == false)
            return false;
        UpdateServicePrimaryTaskSetRequest other = (UpdateServicePrimaryTaskSetRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getPrimaryTaskSet() == null ^ this.getPrimaryTaskSet() == null)
            return false;
        if (other.getPrimaryTaskSet() != null && other.getPrimaryTaskSet().equals(this.getPrimaryTaskSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getPrimaryTaskSet() == null) ? 0 : getPrimaryTaskSet().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServicePrimaryTaskSetRequest clone() {
        return (UpdateServicePrimaryTaskSetRequest) super.clone();
    }

}
