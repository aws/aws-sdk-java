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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A cluster endpoint. Specify an endpoint when you want to set or retrieve a routing control state in the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ClusterEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A cluster endpoint. Specify an endpoint and Amazon Web Services Region when you want to set or retrieve a routing
     * control state in the cluster.
     * </p>
     * <p>
     * To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller Routing
     * Control Actions.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The Amazon Web Services Region for a cluster endpoint.
     * </p>
     */
    private String region;

    /**
     * <p>
     * A cluster endpoint. Specify an endpoint and Amazon Web Services Region when you want to set or retrieve a routing
     * control state in the cluster.
     * </p>
     * <p>
     * To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller Routing
     * Control Actions.
     * </p>
     * 
     * @param endpoint
     *        A cluster endpoint. Specify an endpoint and Amazon Web Services Region when you want to set or retrieve a
     *        routing control state in the cluster.</p>
     *        <p>
     *        To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller
     *        Routing Control Actions.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * A cluster endpoint. Specify an endpoint and Amazon Web Services Region when you want to set or retrieve a routing
     * control state in the cluster.
     * </p>
     * <p>
     * To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller Routing
     * Control Actions.
     * </p>
     * 
     * @return A cluster endpoint. Specify an endpoint and Amazon Web Services Region when you want to set or retrieve a
     *         routing control state in the cluster.</p>
     *         <p>
     *         To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller
     *         Routing Control Actions.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * A cluster endpoint. Specify an endpoint and Amazon Web Services Region when you want to set or retrieve a routing
     * control state in the cluster.
     * </p>
     * <p>
     * To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller Routing
     * Control Actions.
     * </p>
     * 
     * @param endpoint
     *        A cluster endpoint. Specify an endpoint and Amazon Web Services Region when you want to set or retrieve a
     *        routing control state in the cluster.</p>
     *        <p>
     *        To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller
     *        Routing Control Actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterEndpoint withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region for a cluster endpoint.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region for a cluster endpoint.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region for a cluster endpoint.
     * </p>
     * 
     * @return The Amazon Web Services Region for a cluster endpoint.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region for a cluster endpoint.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region for a cluster endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterEndpoint withRegion(String region) {
        setRegion(region);
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
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterEndpoint == false)
            return false;
        ClusterEndpoint other = (ClusterEndpoint) obj;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public ClusterEndpoint clone() {
        try {
            return (ClusterEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoverycontrolconfig.model.transform.ClusterEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
