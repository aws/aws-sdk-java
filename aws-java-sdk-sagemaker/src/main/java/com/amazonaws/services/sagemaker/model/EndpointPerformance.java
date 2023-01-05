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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The performance results from running an Inference Recommender job on an existing endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EndpointPerformance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointPerformance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metrics for an existing endpoint.
     * </p>
     */
    private InferenceMetrics metrics;

    private EndpointInfo endpointInfo;

    /**
     * <p>
     * The metrics for an existing endpoint.
     * </p>
     * 
     * @param metrics
     *        The metrics for an existing endpoint.
     */

    public void setMetrics(InferenceMetrics metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * The metrics for an existing endpoint.
     * </p>
     * 
     * @return The metrics for an existing endpoint.
     */

    public InferenceMetrics getMetrics() {
        return this.metrics;
    }

    /**
     * <p>
     * The metrics for an existing endpoint.
     * </p>
     * 
     * @param metrics
     *        The metrics for an existing endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointPerformance withMetrics(InferenceMetrics metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * @param endpointInfo
     */

    public void setEndpointInfo(EndpointInfo endpointInfo) {
        this.endpointInfo = endpointInfo;
    }

    /**
     * @return
     */

    public EndpointInfo getEndpointInfo() {
        return this.endpointInfo;
    }

    /**
     * @param endpointInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointPerformance withEndpointInfo(EndpointInfo endpointInfo) {
        setEndpointInfo(endpointInfo);
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
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getEndpointInfo() != null)
            sb.append("EndpointInfo: ").append(getEndpointInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointPerformance == false)
            return false;
        EndpointPerformance other = (EndpointPerformance) obj;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getEndpointInfo() == null ^ this.getEndpointInfo() == null)
            return false;
        if (other.getEndpointInfo() != null && other.getEndpointInfo().equals(this.getEndpointInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getEndpointInfo() == null) ? 0 : getEndpointInfo().hashCode());
        return hashCode;
    }

    @Override
    public EndpointPerformance clone() {
        try {
            return (EndpointPerformance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EndpointPerformanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
