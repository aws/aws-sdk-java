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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the AWS resources in use by this environment. This data is not live data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/EnvironmentResourcesDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentResourcesDescription implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the LoadBalancer.
     * </p>
     */
    private LoadBalancerDescription loadBalancer;

    /**
     * <p>
     * Describes the LoadBalancer.
     * </p>
     * 
     * @param loadBalancer
     *        Describes the LoadBalancer.
     */

    public void setLoadBalancer(LoadBalancerDescription loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

    /**
     * <p>
     * Describes the LoadBalancer.
     * </p>
     * 
     * @return Describes the LoadBalancer.
     */

    public LoadBalancerDescription getLoadBalancer() {
        return this.loadBalancer;
    }

    /**
     * <p>
     * Describes the LoadBalancer.
     * </p>
     * 
     * @param loadBalancer
     *        Describes the LoadBalancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentResourcesDescription withLoadBalancer(LoadBalancerDescription loadBalancer) {
        setLoadBalancer(loadBalancer);
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
        if (getLoadBalancer() != null)
            sb.append("LoadBalancer: ").append(getLoadBalancer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentResourcesDescription == false)
            return false;
        EnvironmentResourcesDescription other = (EnvironmentResourcesDescription) obj;
        if (other.getLoadBalancer() == null ^ this.getLoadBalancer() == null)
            return false;
        if (other.getLoadBalancer() != null && other.getLoadBalancer().equals(this.getLoadBalancer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancer() == null) ? 0 : getLoadBalancer().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentResourcesDescription clone() {
        try {
            return (EnvironmentResourcesDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
