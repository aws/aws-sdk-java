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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeServices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN)the cluster that hosts the service to describe. If you do not
     * specify a cluster, the default cluster is assumed.
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
     * Specifies whether you want to see the resource tags for the service. If <code>TAGS</code> is specified, the tags
     * are included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> include;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN)the cluster that hosts the service to describe. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN)the cluster that hosts the service to describe. If you do
     *        not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN)the cluster that hosts the service to describe. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN)the cluster that hosts the service to describe. If you
     *         do not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN)the cluster that hosts the service to describe. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN)the cluster that hosts the service to describe. If you do
     *        not specify a cluster, the default cluster is assumed.
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
     * <p>
     * Specifies whether you want to see the resource tags for the service. If <code>TAGS</code> is specified, the tags
     * are included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     * 
     * @return Specifies whether you want to see the resource tags for the service. If <code>TAGS</code> is specified,
     *         the tags are included in the response. If this field is omitted, tags are not included in the response.
     * @see ServiceField
     */

    public java.util.List<String> getInclude() {
        if (include == null) {
            include = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return include;
    }

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the service. If <code>TAGS</code> is specified, the tags
     * are included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     * 
     * @param include
     *        Specifies whether you want to see the resource tags for the service. If <code>TAGS</code> is specified,
     *        the tags are included in the response. If this field is omitted, tags are not included in the response.
     * @see ServiceField
     */

    public void setInclude(java.util.Collection<String> include) {
        if (include == null) {
            this.include = null;
            return;
        }

        this.include = new com.amazonaws.internal.SdkInternalList<String>(include);
    }

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the service. If <code>TAGS</code> is specified, the tags
     * are included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclude(java.util.Collection)} or {@link #withInclude(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param include
     *        Specifies whether you want to see the resource tags for the service. If <code>TAGS</code> is specified,
     *        the tags are included in the response. If this field is omitted, tags are not included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceField
     */

    public DescribeServicesRequest withInclude(String... include) {
        if (this.include == null) {
            setInclude(new com.amazonaws.internal.SdkInternalList<String>(include.length));
        }
        for (String ele : include) {
            this.include.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the service. If <code>TAGS</code> is specified, the tags
     * are included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     * 
     * @param include
     *        Specifies whether you want to see the resource tags for the service. If <code>TAGS</code> is specified,
     *        the tags are included in the response. If this field is omitted, tags are not included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceField
     */

    public DescribeServicesRequest withInclude(java.util.Collection<String> include) {
        setInclude(include);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want to see the resource tags for the service. If <code>TAGS</code> is specified, the tags
     * are included in the response. If this field is omitted, tags are not included in the response.
     * </p>
     * 
     * @param include
     *        Specifies whether you want to see the resource tags for the service. If <code>TAGS</code> is specified,
     *        the tags are included in the response. If this field is omitted, tags are not included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceField
     */

    public DescribeServicesRequest withInclude(ServiceField... include) {
        com.amazonaws.internal.SdkInternalList<String> includeCopy = new com.amazonaws.internal.SdkInternalList<String>(include.length);
        for (ServiceField value : include) {
            includeCopy.add(value.toString());
        }
        if (getInclude() == null) {
            setInclude(includeCopy);
        } else {
            getInclude().addAll(includeCopy);
        }
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
        if (getServices() != null)
            sb.append("Services: ").append(getServices()).append(",");
        if (getInclude() != null)
            sb.append("Include: ").append(getInclude());
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
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServicesRequest clone() {
        return (DescribeServicesRequest) super.clone();
    }

}
