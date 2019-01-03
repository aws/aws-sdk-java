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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The list of AWS services returned by the <a>DescribeServices</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeServices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A JSON-formatted list of AWS services.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Service> services;

    /**
     * <p>
     * A JSON-formatted list of AWS services.
     * </p>
     * 
     * @return A JSON-formatted list of AWS services.
     */

    public java.util.List<Service> getServices() {
        if (services == null) {
            services = new com.amazonaws.internal.SdkInternalList<Service>();
        }
        return services;
    }

    /**
     * <p>
     * A JSON-formatted list of AWS services.
     * </p>
     * 
     * @param services
     *        A JSON-formatted list of AWS services.
     */

    public void setServices(java.util.Collection<Service> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new com.amazonaws.internal.SdkInternalList<Service>(services);
    }

    /**
     * <p>
     * A JSON-formatted list of AWS services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServices(java.util.Collection)} or {@link #withServices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param services
     *        A JSON-formatted list of AWS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServicesResult withServices(Service... services) {
        if (this.services == null) {
            setServices(new com.amazonaws.internal.SdkInternalList<Service>(services.length));
        }
        for (Service ele : services) {
            this.services.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON-formatted list of AWS services.
     * </p>
     * 
     * @param services
     *        A JSON-formatted list of AWS services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServicesResult withServices(java.util.Collection<Service> services) {
        setServices(services);
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
        if (getServices() != null)
            sb.append("Services: ").append(getServices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServicesResult == false)
            return false;
        DescribeServicesResult other = (DescribeServicesResult) obj;
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

        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServicesResult clone() {
        try {
            return (DescribeServicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
