/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/BatchUpdateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster names to apply the updates.
     * </p>
     */
    private java.util.List<String> clusterNames;
    /**
     * <p>
     * The unique ID of the service update
     * </p>
     */
    private ServiceUpdateRequest serviceUpdate;

    /**
     * <p>
     * The cluster names to apply the updates.
     * </p>
     * 
     * @return The cluster names to apply the updates.
     */

    public java.util.List<String> getClusterNames() {
        return clusterNames;
    }

    /**
     * <p>
     * The cluster names to apply the updates.
     * </p>
     * 
     * @param clusterNames
     *        The cluster names to apply the updates.
     */

    public void setClusterNames(java.util.Collection<String> clusterNames) {
        if (clusterNames == null) {
            this.clusterNames = null;
            return;
        }

        this.clusterNames = new java.util.ArrayList<String>(clusterNames);
    }

    /**
     * <p>
     * The cluster names to apply the updates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterNames(java.util.Collection)} or {@link #withClusterNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param clusterNames
     *        The cluster names to apply the updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateClusterRequest withClusterNames(String... clusterNames) {
        if (this.clusterNames == null) {
            setClusterNames(new java.util.ArrayList<String>(clusterNames.length));
        }
        for (String ele : clusterNames) {
            this.clusterNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The cluster names to apply the updates.
     * </p>
     * 
     * @param clusterNames
     *        The cluster names to apply the updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateClusterRequest withClusterNames(java.util.Collection<String> clusterNames) {
        setClusterNames(clusterNames);
        return this;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdate
     *        The unique ID of the service update
     */

    public void setServiceUpdate(ServiceUpdateRequest serviceUpdate) {
        this.serviceUpdate = serviceUpdate;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @return The unique ID of the service update
     */

    public ServiceUpdateRequest getServiceUpdate() {
        return this.serviceUpdate;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdate
     *        The unique ID of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateClusterRequest withServiceUpdate(ServiceUpdateRequest serviceUpdate) {
        setServiceUpdate(serviceUpdate);
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
        if (getClusterNames() != null)
            sb.append("ClusterNames: ").append(getClusterNames()).append(",");
        if (getServiceUpdate() != null)
            sb.append("ServiceUpdate: ").append(getServiceUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateClusterRequest == false)
            return false;
        BatchUpdateClusterRequest other = (BatchUpdateClusterRequest) obj;
        if (other.getClusterNames() == null ^ this.getClusterNames() == null)
            return false;
        if (other.getClusterNames() != null && other.getClusterNames().equals(this.getClusterNames()) == false)
            return false;
        if (other.getServiceUpdate() == null ^ this.getServiceUpdate() == null)
            return false;
        if (other.getServiceUpdate() != null && other.getServiceUpdate().equals(this.getServiceUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterNames() == null) ? 0 : getClusterNames().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdate() == null) ? 0 : getServiceUpdate().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateClusterRequest clone() {
        return (BatchUpdateClusterRequest) super.clone();
    }

}
