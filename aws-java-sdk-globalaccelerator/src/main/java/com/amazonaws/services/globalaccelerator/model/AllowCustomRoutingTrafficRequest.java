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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AllowCustomRoutingTraffic"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllowCustomRoutingTrafficRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     */
    private String endpointGroupArn;
    /**
     * <p>
     * An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet ID.
     * </p>
     */
    private String endpointId;
    /**
     * <p>
     * A list of specific Amazon EC2 instance IP addresses (destination addresses) in a subnet that you want to allow to
     * receive traffic. The IP addresses must be a subset of the IP addresses that you specified for the endpoint group.
     * </p>
     * <p>
     * <code>DestinationAddresses</code> is required if <code>AllowAllTrafficToEndpoint</code> is <code>FALSE</code> or
     * is not specified.
     * </p>
     */
    private java.util.List<String> destinationAddresses;
    /**
     * <p>
     * A list of specific Amazon EC2 instance ports (destination ports) that you want to allow to receive traffic.
     * </p>
     */
    private java.util.List<Integer> destinationPorts;
    /**
     * <p>
     * Indicates whether all destination IP addresses and ports for a specified VPC subnet endpoint can receive traffic
     * from a custom routing accelerator. The value is TRUE or FALSE.
     * </p>
     * <p>
     * When set to TRUE, <i>all</i> destinations in the custom routing VPC subnet can receive traffic. Note that you
     * cannot specify destination IP addresses and ports when the value is set to TRUE.
     * </p>
     * <p>
     * When set to FALSE (or not specified), you <i>must</i> specify a list of destination IP addresses that are allowed
     * to receive traffic. A list of ports is optional. If you don't specify a list of ports, the ports that can accept
     * traffic is the same as the ports configured for the endpoint group.
     * </p>
     * <p>
     * The default value is FALSE.
     * </p>
     */
    private Boolean allowAllTrafficToEndpoint;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     * 
     * @param endpointGroupArn
     *        The Amazon Resource Name (ARN) of the endpoint group.
     */

    public void setEndpointGroupArn(String endpointGroupArn) {
        this.endpointGroupArn = endpointGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint group.
     */

    public String getEndpointGroupArn() {
        return this.endpointGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     * 
     * @param endpointGroupArn
     *        The Amazon Resource Name (ARN) of the endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowCustomRoutingTrafficRequest withEndpointGroupArn(String endpointGroupArn) {
        setEndpointGroupArn(endpointGroupArn);
        return this;
    }

    /**
     * <p>
     * An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet ID.
     * </p>
     * 
     * @param endpointId
     *        An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet
     *        ID.
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet ID.
     * </p>
     * 
     * @return An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet
     *         ID.
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet ID.
     * </p>
     * 
     * @param endpointId
     *        An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet
     *        ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowCustomRoutingTrafficRequest withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * <p>
     * A list of specific Amazon EC2 instance IP addresses (destination addresses) in a subnet that you want to allow to
     * receive traffic. The IP addresses must be a subset of the IP addresses that you specified for the endpoint group.
     * </p>
     * <p>
     * <code>DestinationAddresses</code> is required if <code>AllowAllTrafficToEndpoint</code> is <code>FALSE</code> or
     * is not specified.
     * </p>
     * 
     * @return A list of specific Amazon EC2 instance IP addresses (destination addresses) in a subnet that you want to
     *         allow to receive traffic. The IP addresses must be a subset of the IP addresses that you specified for
     *         the endpoint group.</p>
     *         <p>
     *         <code>DestinationAddresses</code> is required if <code>AllowAllTrafficToEndpoint</code> is
     *         <code>FALSE</code> or is not specified.
     */

    public java.util.List<String> getDestinationAddresses() {
        return destinationAddresses;
    }

    /**
     * <p>
     * A list of specific Amazon EC2 instance IP addresses (destination addresses) in a subnet that you want to allow to
     * receive traffic. The IP addresses must be a subset of the IP addresses that you specified for the endpoint group.
     * </p>
     * <p>
     * <code>DestinationAddresses</code> is required if <code>AllowAllTrafficToEndpoint</code> is <code>FALSE</code> or
     * is not specified.
     * </p>
     * 
     * @param destinationAddresses
     *        A list of specific Amazon EC2 instance IP addresses (destination addresses) in a subnet that you want to
     *        allow to receive traffic. The IP addresses must be a subset of the IP addresses that you specified for the
     *        endpoint group.</p>
     *        <p>
     *        <code>DestinationAddresses</code> is required if <code>AllowAllTrafficToEndpoint</code> is
     *        <code>FALSE</code> or is not specified.
     */

    public void setDestinationAddresses(java.util.Collection<String> destinationAddresses) {
        if (destinationAddresses == null) {
            this.destinationAddresses = null;
            return;
        }

        this.destinationAddresses = new java.util.ArrayList<String>(destinationAddresses);
    }

    /**
     * <p>
     * A list of specific Amazon EC2 instance IP addresses (destination addresses) in a subnet that you want to allow to
     * receive traffic. The IP addresses must be a subset of the IP addresses that you specified for the endpoint group.
     * </p>
     * <p>
     * <code>DestinationAddresses</code> is required if <code>AllowAllTrafficToEndpoint</code> is <code>FALSE</code> or
     * is not specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationAddresses(java.util.Collection)} or {@link #withDestinationAddresses(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param destinationAddresses
     *        A list of specific Amazon EC2 instance IP addresses (destination addresses) in a subnet that you want to
     *        allow to receive traffic. The IP addresses must be a subset of the IP addresses that you specified for the
     *        endpoint group.</p>
     *        <p>
     *        <code>DestinationAddresses</code> is required if <code>AllowAllTrafficToEndpoint</code> is
     *        <code>FALSE</code> or is not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowCustomRoutingTrafficRequest withDestinationAddresses(String... destinationAddresses) {
        if (this.destinationAddresses == null) {
            setDestinationAddresses(new java.util.ArrayList<String>(destinationAddresses.length));
        }
        for (String ele : destinationAddresses) {
            this.destinationAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of specific Amazon EC2 instance IP addresses (destination addresses) in a subnet that you want to allow to
     * receive traffic. The IP addresses must be a subset of the IP addresses that you specified for the endpoint group.
     * </p>
     * <p>
     * <code>DestinationAddresses</code> is required if <code>AllowAllTrafficToEndpoint</code> is <code>FALSE</code> or
     * is not specified.
     * </p>
     * 
     * @param destinationAddresses
     *        A list of specific Amazon EC2 instance IP addresses (destination addresses) in a subnet that you want to
     *        allow to receive traffic. The IP addresses must be a subset of the IP addresses that you specified for the
     *        endpoint group.</p>
     *        <p>
     *        <code>DestinationAddresses</code> is required if <code>AllowAllTrafficToEndpoint</code> is
     *        <code>FALSE</code> or is not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowCustomRoutingTrafficRequest withDestinationAddresses(java.util.Collection<String> destinationAddresses) {
        setDestinationAddresses(destinationAddresses);
        return this;
    }

    /**
     * <p>
     * A list of specific Amazon EC2 instance ports (destination ports) that you want to allow to receive traffic.
     * </p>
     * 
     * @return A list of specific Amazon EC2 instance ports (destination ports) that you want to allow to receive
     *         traffic.
     */

    public java.util.List<Integer> getDestinationPorts() {
        return destinationPorts;
    }

    /**
     * <p>
     * A list of specific Amazon EC2 instance ports (destination ports) that you want to allow to receive traffic.
     * </p>
     * 
     * @param destinationPorts
     *        A list of specific Amazon EC2 instance ports (destination ports) that you want to allow to receive
     *        traffic.
     */

    public void setDestinationPorts(java.util.Collection<Integer> destinationPorts) {
        if (destinationPorts == null) {
            this.destinationPorts = null;
            return;
        }

        this.destinationPorts = new java.util.ArrayList<Integer>(destinationPorts);
    }

    /**
     * <p>
     * A list of specific Amazon EC2 instance ports (destination ports) that you want to allow to receive traffic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationPorts(java.util.Collection)} or {@link #withDestinationPorts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param destinationPorts
     *        A list of specific Amazon EC2 instance ports (destination ports) that you want to allow to receive
     *        traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowCustomRoutingTrafficRequest withDestinationPorts(Integer... destinationPorts) {
        if (this.destinationPorts == null) {
            setDestinationPorts(new java.util.ArrayList<Integer>(destinationPorts.length));
        }
        for (Integer ele : destinationPorts) {
            this.destinationPorts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of specific Amazon EC2 instance ports (destination ports) that you want to allow to receive traffic.
     * </p>
     * 
     * @param destinationPorts
     *        A list of specific Amazon EC2 instance ports (destination ports) that you want to allow to receive
     *        traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowCustomRoutingTrafficRequest withDestinationPorts(java.util.Collection<Integer> destinationPorts) {
        setDestinationPorts(destinationPorts);
        return this;
    }

    /**
     * <p>
     * Indicates whether all destination IP addresses and ports for a specified VPC subnet endpoint can receive traffic
     * from a custom routing accelerator. The value is TRUE or FALSE.
     * </p>
     * <p>
     * When set to TRUE, <i>all</i> destinations in the custom routing VPC subnet can receive traffic. Note that you
     * cannot specify destination IP addresses and ports when the value is set to TRUE.
     * </p>
     * <p>
     * When set to FALSE (or not specified), you <i>must</i> specify a list of destination IP addresses that are allowed
     * to receive traffic. A list of ports is optional. If you don't specify a list of ports, the ports that can accept
     * traffic is the same as the ports configured for the endpoint group.
     * </p>
     * <p>
     * The default value is FALSE.
     * </p>
     * 
     * @param allowAllTrafficToEndpoint
     *        Indicates whether all destination IP addresses and ports for a specified VPC subnet endpoint can receive
     *        traffic from a custom routing accelerator. The value is TRUE or FALSE. </p>
     *        <p>
     *        When set to TRUE, <i>all</i> destinations in the custom routing VPC subnet can receive traffic. Note that
     *        you cannot specify destination IP addresses and ports when the value is set to TRUE.
     *        </p>
     *        <p>
     *        When set to FALSE (or not specified), you <i>must</i> specify a list of destination IP addresses that are
     *        allowed to receive traffic. A list of ports is optional. If you don't specify a list of ports, the ports
     *        that can accept traffic is the same as the ports configured for the endpoint group.
     *        </p>
     *        <p>
     *        The default value is FALSE.
     */

    public void setAllowAllTrafficToEndpoint(Boolean allowAllTrafficToEndpoint) {
        this.allowAllTrafficToEndpoint = allowAllTrafficToEndpoint;
    }

    /**
     * <p>
     * Indicates whether all destination IP addresses and ports for a specified VPC subnet endpoint can receive traffic
     * from a custom routing accelerator. The value is TRUE or FALSE.
     * </p>
     * <p>
     * When set to TRUE, <i>all</i> destinations in the custom routing VPC subnet can receive traffic. Note that you
     * cannot specify destination IP addresses and ports when the value is set to TRUE.
     * </p>
     * <p>
     * When set to FALSE (or not specified), you <i>must</i> specify a list of destination IP addresses that are allowed
     * to receive traffic. A list of ports is optional. If you don't specify a list of ports, the ports that can accept
     * traffic is the same as the ports configured for the endpoint group.
     * </p>
     * <p>
     * The default value is FALSE.
     * </p>
     * 
     * @return Indicates whether all destination IP addresses and ports for a specified VPC subnet endpoint can receive
     *         traffic from a custom routing accelerator. The value is TRUE or FALSE. </p>
     *         <p>
     *         When set to TRUE, <i>all</i> destinations in the custom routing VPC subnet can receive traffic. Note that
     *         you cannot specify destination IP addresses and ports when the value is set to TRUE.
     *         </p>
     *         <p>
     *         When set to FALSE (or not specified), you <i>must</i> specify a list of destination IP addresses that are
     *         allowed to receive traffic. A list of ports is optional. If you don't specify a list of ports, the ports
     *         that can accept traffic is the same as the ports configured for the endpoint group.
     *         </p>
     *         <p>
     *         The default value is FALSE.
     */

    public Boolean getAllowAllTrafficToEndpoint() {
        return this.allowAllTrafficToEndpoint;
    }

    /**
     * <p>
     * Indicates whether all destination IP addresses and ports for a specified VPC subnet endpoint can receive traffic
     * from a custom routing accelerator. The value is TRUE or FALSE.
     * </p>
     * <p>
     * When set to TRUE, <i>all</i> destinations in the custom routing VPC subnet can receive traffic. Note that you
     * cannot specify destination IP addresses and ports when the value is set to TRUE.
     * </p>
     * <p>
     * When set to FALSE (or not specified), you <i>must</i> specify a list of destination IP addresses that are allowed
     * to receive traffic. A list of ports is optional. If you don't specify a list of ports, the ports that can accept
     * traffic is the same as the ports configured for the endpoint group.
     * </p>
     * <p>
     * The default value is FALSE.
     * </p>
     * 
     * @param allowAllTrafficToEndpoint
     *        Indicates whether all destination IP addresses and ports for a specified VPC subnet endpoint can receive
     *        traffic from a custom routing accelerator. The value is TRUE or FALSE. </p>
     *        <p>
     *        When set to TRUE, <i>all</i> destinations in the custom routing VPC subnet can receive traffic. Note that
     *        you cannot specify destination IP addresses and ports when the value is set to TRUE.
     *        </p>
     *        <p>
     *        When set to FALSE (or not specified), you <i>must</i> specify a list of destination IP addresses that are
     *        allowed to receive traffic. A list of ports is optional. If you don't specify a list of ports, the ports
     *        that can accept traffic is the same as the ports configured for the endpoint group.
     *        </p>
     *        <p>
     *        The default value is FALSE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowCustomRoutingTrafficRequest withAllowAllTrafficToEndpoint(Boolean allowAllTrafficToEndpoint) {
        setAllowAllTrafficToEndpoint(allowAllTrafficToEndpoint);
        return this;
    }

    /**
     * <p>
     * Indicates whether all destination IP addresses and ports for a specified VPC subnet endpoint can receive traffic
     * from a custom routing accelerator. The value is TRUE or FALSE.
     * </p>
     * <p>
     * When set to TRUE, <i>all</i> destinations in the custom routing VPC subnet can receive traffic. Note that you
     * cannot specify destination IP addresses and ports when the value is set to TRUE.
     * </p>
     * <p>
     * When set to FALSE (or not specified), you <i>must</i> specify a list of destination IP addresses that are allowed
     * to receive traffic. A list of ports is optional. If you don't specify a list of ports, the ports that can accept
     * traffic is the same as the ports configured for the endpoint group.
     * </p>
     * <p>
     * The default value is FALSE.
     * </p>
     * 
     * @return Indicates whether all destination IP addresses and ports for a specified VPC subnet endpoint can receive
     *         traffic from a custom routing accelerator. The value is TRUE or FALSE. </p>
     *         <p>
     *         When set to TRUE, <i>all</i> destinations in the custom routing VPC subnet can receive traffic. Note that
     *         you cannot specify destination IP addresses and ports when the value is set to TRUE.
     *         </p>
     *         <p>
     *         When set to FALSE (or not specified), you <i>must</i> specify a list of destination IP addresses that are
     *         allowed to receive traffic. A list of ports is optional. If you don't specify a list of ports, the ports
     *         that can accept traffic is the same as the ports configured for the endpoint group.
     *         </p>
     *         <p>
     *         The default value is FALSE.
     */

    public Boolean isAllowAllTrafficToEndpoint() {
        return this.allowAllTrafficToEndpoint;
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
        if (getEndpointGroupArn() != null)
            sb.append("EndpointGroupArn: ").append(getEndpointGroupArn()).append(",");
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append(getEndpointId()).append(",");
        if (getDestinationAddresses() != null)
            sb.append("DestinationAddresses: ").append(getDestinationAddresses()).append(",");
        if (getDestinationPorts() != null)
            sb.append("DestinationPorts: ").append(getDestinationPorts()).append(",");
        if (getAllowAllTrafficToEndpoint() != null)
            sb.append("AllowAllTrafficToEndpoint: ").append(getAllowAllTrafficToEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllowCustomRoutingTrafficRequest == false)
            return false;
        AllowCustomRoutingTrafficRequest other = (AllowCustomRoutingTrafficRequest) obj;
        if (other.getEndpointGroupArn() == null ^ this.getEndpointGroupArn() == null)
            return false;
        if (other.getEndpointGroupArn() != null && other.getEndpointGroupArn().equals(this.getEndpointGroupArn()) == false)
            return false;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getDestinationAddresses() == null ^ this.getDestinationAddresses() == null)
            return false;
        if (other.getDestinationAddresses() != null && other.getDestinationAddresses().equals(this.getDestinationAddresses()) == false)
            return false;
        if (other.getDestinationPorts() == null ^ this.getDestinationPorts() == null)
            return false;
        if (other.getDestinationPorts() != null && other.getDestinationPorts().equals(this.getDestinationPorts()) == false)
            return false;
        if (other.getAllowAllTrafficToEndpoint() == null ^ this.getAllowAllTrafficToEndpoint() == null)
            return false;
        if (other.getAllowAllTrafficToEndpoint() != null && other.getAllowAllTrafficToEndpoint().equals(this.getAllowAllTrafficToEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointGroupArn() == null) ? 0 : getEndpointGroupArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getDestinationAddresses() == null) ? 0 : getDestinationAddresses().hashCode());
        hashCode = prime * hashCode + ((getDestinationPorts() == null) ? 0 : getDestinationPorts().hashCode());
        hashCode = prime * hashCode + ((getAllowAllTrafficToEndpoint() == null) ? 0 : getAllowAllTrafficToEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public AllowCustomRoutingTrafficRequest clone() {
        return (AllowCustomRoutingTrafficRequest) super.clone();
    }

}
