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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The connection endpoint for connecting to an Amazon Redshift cluster through the proxy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/VpcEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcEndpoint implements Serializable, Cloneable {

    /**
     * <p>
     * The connection endpoint ID for connecting an Amazon Redshift cluster through the proxy.
     * </p>
     */
    private String vpcEndpointId;
    /**
     * <p>
     * The VPC identifier that the endpoint is associated.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * One or more network interfaces of the endpoint. Also known as an interface endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NetworkInterface> networkInterfaces;

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

    public VpcEndpoint withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * The VPC identifier that the endpoint is associated.
     * </p>
     * 
     * @param vpcId
     *        The VPC identifier that the endpoint is associated.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC identifier that the endpoint is associated.
     * </p>
     * 
     * @return The VPC identifier that the endpoint is associated.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC identifier that the endpoint is associated.
     * </p>
     * 
     * @param vpcId
     *        The VPC identifier that the endpoint is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * One or more network interfaces of the endpoint. Also known as an interface endpoint.
     * </p>
     * 
     * @return One or more network interfaces of the endpoint. Also known as an interface endpoint.
     */

    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        if (networkInterfaces == null) {
            networkInterfaces = new com.amazonaws.internal.SdkInternalList<NetworkInterface>();
        }
        return networkInterfaces;
    }

    /**
     * <p>
     * One or more network interfaces of the endpoint. Also known as an interface endpoint.
     * </p>
     * 
     * @param networkInterfaces
     *        One or more network interfaces of the endpoint. Also known as an interface endpoint.
     */

    public void setNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new com.amazonaws.internal.SdkInternalList<NetworkInterface>(networkInterfaces);
    }

    /**
     * <p>
     * One or more network interfaces of the endpoint. Also known as an interface endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        One or more network interfaces of the endpoint. Also known as an interface endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withNetworkInterfaces(NetworkInterface... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new com.amazonaws.internal.SdkInternalList<NetworkInterface>(networkInterfaces.length));
        }
        for (NetworkInterface ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more network interfaces of the endpoint. Also known as an interface endpoint.
     * </p>
     * 
     * @param networkInterfaces
     *        One or more network interfaces of the endpoint. Also known as an interface endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcEndpoint withNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
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
            sb.append("VpcEndpointId: ").append(getVpcEndpointId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcEndpoint == false)
            return false;
        VpcEndpoint other = (VpcEndpoint) obj;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        return hashCode;
    }

    @Override
    public VpcEndpoint clone() {
        try {
            return (VpcEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
