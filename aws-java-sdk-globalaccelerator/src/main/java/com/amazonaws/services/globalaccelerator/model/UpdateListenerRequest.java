/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateListener" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateListenerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener to update.
     * </p>
     */
    private String listenerArn;
    /**
     * <p>
     * The updated list of port ranges for the connections from clients to the accelerator.
     * </p>
     */
    private java.util.List<PortRange> portRanges;
    /**
     * <p>
     * The updated protocol for the connections from clients to the accelerator.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications,
     * regardless of the source port and protocol of the user request. This gives you control over whether and how to
     * maintain client affinity to a given endpoint.
     * </p>
     * <p>
     * The default value is <code>NONE</code>.
     * </p>
     */
    private String clientAffinity;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener to update.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener to update.
     */

    public void setListenerArn(String listenerArn) {
        this.listenerArn = listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the listener to update.
     */

    public String getListenerArn() {
        return this.listenerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener to update.
     * </p>
     * 
     * @param listenerArn
     *        The Amazon Resource Name (ARN) of the listener to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateListenerRequest withListenerArn(String listenerArn) {
        setListenerArn(listenerArn);
        return this;
    }

    /**
     * <p>
     * The updated list of port ranges for the connections from clients to the accelerator.
     * </p>
     * 
     * @return The updated list of port ranges for the connections from clients to the accelerator.
     */

    public java.util.List<PortRange> getPortRanges() {
        return portRanges;
    }

    /**
     * <p>
     * The updated list of port ranges for the connections from clients to the accelerator.
     * </p>
     * 
     * @param portRanges
     *        The updated list of port ranges for the connections from clients to the accelerator.
     */

    public void setPortRanges(java.util.Collection<PortRange> portRanges) {
        if (portRanges == null) {
            this.portRanges = null;
            return;
        }

        this.portRanges = new java.util.ArrayList<PortRange>(portRanges);
    }

    /**
     * <p>
     * The updated list of port ranges for the connections from clients to the accelerator.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPortRanges(java.util.Collection)} or {@link #withPortRanges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param portRanges
     *        The updated list of port ranges for the connections from clients to the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateListenerRequest withPortRanges(PortRange... portRanges) {
        if (this.portRanges == null) {
            setPortRanges(new java.util.ArrayList<PortRange>(portRanges.length));
        }
        for (PortRange ele : portRanges) {
            this.portRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The updated list of port ranges for the connections from clients to the accelerator.
     * </p>
     * 
     * @param portRanges
     *        The updated list of port ranges for the connections from clients to the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateListenerRequest withPortRanges(java.util.Collection<PortRange> portRanges) {
        setPortRanges(portRanges);
        return this;
    }

    /**
     * <p>
     * The updated protocol for the connections from clients to the accelerator.
     * </p>
     * 
     * @param protocol
     *        The updated protocol for the connections from clients to the accelerator.
     * @see Protocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The updated protocol for the connections from clients to the accelerator.
     * </p>
     * 
     * @return The updated protocol for the connections from clients to the accelerator.
     * @see Protocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The updated protocol for the connections from clients to the accelerator.
     * </p>
     * 
     * @param protocol
     *        The updated protocol for the connections from clients to the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public UpdateListenerRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The updated protocol for the connections from clients to the accelerator.
     * </p>
     * 
     * @param protocol
     *        The updated protocol for the connections from clients to the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public UpdateListenerRequest withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications,
     * regardless of the source port and protocol of the user request. This gives you control over whether and how to
     * maintain client affinity to a given endpoint.
     * </p>
     * <p>
     * The default value is <code>NONE</code>.
     * </p>
     * 
     * @param clientAffinity
     *        Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful
     *        applications, regardless of the source port and protocol of the user request. This gives you control over
     *        whether and how to maintain client affinity to a given endpoint.</p>
     *        <p>
     *        The default value is <code>NONE</code>.
     * @see ClientAffinity
     */

    public void setClientAffinity(String clientAffinity) {
        this.clientAffinity = clientAffinity;
    }

    /**
     * <p>
     * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications,
     * regardless of the source port and protocol of the user request. This gives you control over whether and how to
     * maintain client affinity to a given endpoint.
     * </p>
     * <p>
     * The default value is <code>NONE</code>.
     * </p>
     * 
     * @return Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful
     *         applications, regardless of the source port and protocol of the user request. This gives you control over
     *         whether and how to maintain client affinity to a given endpoint.</p>
     *         <p>
     *         The default value is <code>NONE</code>.
     * @see ClientAffinity
     */

    public String getClientAffinity() {
        return this.clientAffinity;
    }

    /**
     * <p>
     * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications,
     * regardless of the source port and protocol of the user request. This gives you control over whether and how to
     * maintain client affinity to a given endpoint.
     * </p>
     * <p>
     * The default value is <code>NONE</code>.
     * </p>
     * 
     * @param clientAffinity
     *        Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful
     *        applications, regardless of the source port and protocol of the user request. This gives you control over
     *        whether and how to maintain client affinity to a given endpoint.</p>
     *        <p>
     *        The default value is <code>NONE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientAffinity
     */

    public UpdateListenerRequest withClientAffinity(String clientAffinity) {
        setClientAffinity(clientAffinity);
        return this;
    }

    /**
     * <p>
     * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications,
     * regardless of the source port and protocol of the user request. This gives you control over whether and how to
     * maintain client affinity to a given endpoint.
     * </p>
     * <p>
     * The default value is <code>NONE</code>.
     * </p>
     * 
     * @param clientAffinity
     *        Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful
     *        applications, regardless of the source port and protocol of the user request. This gives you control over
     *        whether and how to maintain client affinity to a given endpoint.</p>
     *        <p>
     *        The default value is <code>NONE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientAffinity
     */

    public UpdateListenerRequest withClientAffinity(ClientAffinity clientAffinity) {
        this.clientAffinity = clientAffinity.toString();
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
        if (getListenerArn() != null)
            sb.append("ListenerArn: ").append(getListenerArn()).append(",");
        if (getPortRanges() != null)
            sb.append("PortRanges: ").append(getPortRanges()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getClientAffinity() != null)
            sb.append("ClientAffinity: ").append(getClientAffinity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateListenerRequest == false)
            return false;
        UpdateListenerRequest other = (UpdateListenerRequest) obj;
        if (other.getListenerArn() == null ^ this.getListenerArn() == null)
            return false;
        if (other.getListenerArn() != null && other.getListenerArn().equals(this.getListenerArn()) == false)
            return false;
        if (other.getPortRanges() == null ^ this.getPortRanges() == null)
            return false;
        if (other.getPortRanges() != null && other.getPortRanges().equals(this.getPortRanges()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getClientAffinity() == null ^ this.getClientAffinity() == null)
            return false;
        if (other.getClientAffinity() != null && other.getClientAffinity().equals(this.getClientAffinity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListenerArn() == null) ? 0 : getListenerArn().hashCode());
        hashCode = prime * hashCode + ((getPortRanges() == null) ? 0 : getPortRanges().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getClientAffinity() == null) ? 0 : getClientAffinity().hashCode());
        return hashCode;
    }

    @Override
    public UpdateListenerRequest clone() {
        return (UpdateListenerRequest) super.clone();
    }

}
