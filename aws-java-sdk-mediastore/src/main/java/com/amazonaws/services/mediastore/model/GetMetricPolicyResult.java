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
package com.amazonaws.services.mediastore.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/GetMetricPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metric policy that is associated with the specific container.
     * </p>
     */
    private MetricPolicy metricPolicy;

    /**
     * <p>
     * The metric policy that is associated with the specific container.
     * </p>
     * 
     * @param metricPolicy
     *        The metric policy that is associated with the specific container.
     */

    public void setMetricPolicy(MetricPolicy metricPolicy) {
        this.metricPolicy = metricPolicy;
    }

    /**
     * <p>
     * The metric policy that is associated with the specific container.
     * </p>
     * 
     * @return The metric policy that is associated with the specific container.
     */

    public MetricPolicy getMetricPolicy() {
        return this.metricPolicy;
    }

    /**
     * <p>
     * The metric policy that is associated with the specific container.
     * </p>
     * 
     * @param metricPolicy
     *        The metric policy that is associated with the specific container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricPolicyResult withMetricPolicy(MetricPolicy metricPolicy) {
        setMetricPolicy(metricPolicy);
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
        if (getMetricPolicy() != null)
            sb.append("MetricPolicy: ").append(getMetricPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetricPolicyResult == false)
            return false;
        GetMetricPolicyResult other = (GetMetricPolicyResult) obj;
        if (other.getMetricPolicy() == null ^ this.getMetricPolicy() == null)
            return false;
        if (other.getMetricPolicy() != null && other.getMetricPolicy().equals(this.getMetricPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricPolicy() == null) ? 0 : getMetricPolicy().hashCode());
        return hashCode;
    }

    @Override
    public GetMetricPolicyResult clone() {
        try {
            return (GetMetricPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
