/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The connection endpoint for connecting an Amazon Redshift cluster through the proxy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/SpartaProxyVpcEndpoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpartaProxyVpcEndpoint implements Serializable, Cloneable {

    /**
     * <p>
     * The connection endpoint ID for connecting an Amazon Redshift cluster through the proxy.
     * </p>
     */
    private String vpcEndpointId;

    /**
     * <p>
     * The connection endpoint ID for connecting an Amazon Redshift cluster through the proxy.
     * </p>
     * 
     * @param vpcEndpointId
     *        The connection endpoint ID for connecting an Amazon Redshift cluster through the proxy.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The connection endpoint ID for connecting an Amazon Redshift cluster through the proxy.
     * </p>
     * 
     * @return The connection endpoint ID for connecting an Amazon Redshift cluster through the proxy.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * The connection endpoint ID for connecting an Amazon Redshift cluster through the proxy.
     * </p>
     * 
     * @param vpcEndpointId
     *        The connection endpoint ID for connecting an Amazon Redshift cluster through the proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpartaProxyVpcEndpoint withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
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
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpartaProxyVpcEndpoint == false)
            return false;
        SpartaProxyVpcEndpoint other = (SpartaProxyVpcEndpoint) obj;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        return hashCode;
    }

    @Override
    public SpartaProxyVpcEndpoint clone() {
        try {
            return (SpartaProxyVpcEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
