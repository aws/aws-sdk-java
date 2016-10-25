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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeServicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster that hosts the service to describe. If you do not specify a cluster, the default cluster
     * is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * A list of services to describe. You may specify up to 10 services to describe in a single operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> services;

    /**
     * <p>
     * The name of the cluster that hosts the service to describe. If you do not specify a cluster, the default cluster
     * is assumed.
     * </p>
     * 
     * @param cluster
     *        The name of the cluster that hosts the service to describe. If you do not specify a cluster, the default
     *        cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The name of the cluster that hosts the service to describe. If you do not specify a cluster, the default cluster
     * is assumed.
     * </p>
     * 
     * @return The name of the cluster that hosts the service to describe. If you do not specify a cluster, the default
     *         cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The name of the cluster that hosts the service to describe. If you do not specify a cluster, the default cluster
     * is assumed.
     * </p>
     * 
     * @param cluster
     *        The name of the cluster that hosts the service to describe. If you do not specify a cluster, the default
     *        cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServicesRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * A list of services to describe. You may specify up to 10 services to describe in a single operation.
     * </p>
     * 
     * @return A list of services to describe. You may specify up to 10 services to describe in a single operation.
     */

    public java.util.List<String> getServices() {
        if (services == null) {
            services = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return services;
    }

    /**
     * <p>
     * A list of services to describe. You may specify up to 10 services to describe in a single operation.
     * </p>
     * 
     * @param services
     *        A list of services to describe. You may specify up to 10 services to describe in a single operation.
     */

    public void setServices(java.util.Collection<String> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new com.amazonaws.internal.SdkInternalList<String>(services);
    }

    /**
     * <p>
     * A list of services to describe. You may specify up to 10 services to describe in a single operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServices(java.util.Collection)} or {@link #withServices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param services
     *        A list of services to describe. You may specify up to 10 services to describe in a single operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServicesRequest withServices(String... services) {
        if (this.services == null) {
            setServices(new com.amazonaws.internal.SdkInternalList<String>(services.length));
        }
        for (String ele : services) {
            this.services.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of services to describe. You may specify up to 10 services to describe in a single operation.
     * </p>
     * 
     * @param services
     *        A list of services to describe. You may specify up to 10 services to describe in a single operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServicesRequest withServices(java.util.Collection<String> services) {
        setServices(services);
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
        if (getCluster() != null)
            sb.append("Cluster: " + getCluster() + ",");
        if (getServices() != null)
            sb.append("Services: " + getServices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServicesRequest == false)
            return false;
        DescribeServicesRequest other = (DescribeServicesRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServicesRequest clone() {
        return (DescribeServicesRequest) super.clone();
    }
}
