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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about one of the following actions that affects or that was taken on a resource:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A remote IP address issued an AWS API call
 * </p>
 * </li>
 * <li>
 * <p>
 * A DNS request was received
 * </p>
 * </li>
 * <li>
 * <p>
 * A remote IP address attempted to connect to an EC2 instance
 * </p>
 * </li>
 * <li>
 * <p>
 * A remote IP address attempted a port probe on an EC2 instance
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Action" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of action that was detected. The possible action types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NETWORK_CONNECTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_API_CALL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_REQUEST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PORT_PROBE</code>
     * </p>
     * </li>
     * </ul>
     */
    private String actionType;
    /**
     * <p>
     * Included if <code>ActionType</code> is <code>NETWORK_CONNECTION</code>. Provides details about the network
     * connection that was detected.
     * </p>
     */
    private NetworkConnectionAction networkConnectionAction;
    /**
     * <p>
     * Included if <code>ActionType</code> is <code>AWS_API_CALL</code>. Provides details about the API call that was
     * detected.
     * </p>
     */
    private AwsApiCallAction awsApiCallAction;
    /**
     * <p>
     * Included if <code>ActionType</code> is <code>DNS_REQUEST</code>. Provides details about the DNS request that was
     * detected.
     * </p>
     */
    private DnsRequestAction dnsRequestAction;
    /**
     * <p>
     * Included if <code>ActionType</code> is <code>PORT_PROBE</code>. Provides details about the port probe that was
     * detected.
     * </p>
     */
    private PortProbeAction portProbeAction;

    /**
     * <p>
     * The type of action that was detected. The possible action types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NETWORK_CONNECTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_API_CALL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_REQUEST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PORT_PROBE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param actionType
     *        The type of action that was detected. The possible action types are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NETWORK_CONNECTION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_API_CALL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DNS_REQUEST</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PORT_PROBE</code>
     *        </p>
     *        </li>
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of action that was detected. The possible action types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NETWORK_CONNECTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_API_CALL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_REQUEST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PORT_PROBE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of action that was detected. The possible action types are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NETWORK_CONNECTION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_API_CALL</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DNS_REQUEST</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PORT_PROBE</code>
     *         </p>
     *         </li>
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of action that was detected. The possible action types are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NETWORK_CONNECTION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_API_CALL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_REQUEST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PORT_PROBE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param actionType
     *        The type of action that was detected. The possible action types are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NETWORK_CONNECTION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_API_CALL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DNS_REQUEST</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PORT_PROBE</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * Included if <code>ActionType</code> is <code>NETWORK_CONNECTION</code>. Provides details about the network
     * connection that was detected.
     * </p>
     * 
     * @param networkConnectionAction
     *        Included if <code>ActionType</code> is <code>NETWORK_CONNECTION</code>. Provides details about the network
     *        connection that was detected.
     */

    public void setNetworkConnectionAction(NetworkConnectionAction networkConnectionAction) {
        this.networkConnectionAction = networkConnectionAction;
    }

    /**
     * <p>
     * Included if <code>ActionType</code> is <code>NETWORK_CONNECTION</code>. Provides details about the network
     * connection that was detected.
     * </p>
     * 
     * @return Included if <code>ActionType</code> is <code>NETWORK_CONNECTION</code>. Provides details about the
     *         network connection that was detected.
     */

    public NetworkConnectionAction getNetworkConnectionAction() {
        return this.networkConnectionAction;
    }

    /**
     * <p>
     * Included if <code>ActionType</code> is <code>NETWORK_CONNECTION</code>. Provides details about the network
     * connection that was detected.
     * </p>
     * 
     * @param networkConnectionAction
     *        Included if <code>ActionType</code> is <code>NETWORK_CONNECTION</code>. Provides details about the network
     *        connection that was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withNetworkConnectionAction(NetworkConnectionAction networkConnectionAction) {
        setNetworkConnectionAction(networkConnectionAction);
        return this;
    }

    /**
     * <p>
     * Included if <code>ActionType</code> is <code>AWS_API_CALL</code>. Provides details about the API call that was
     * detected.
     * </p>
     * 
     * @param awsApiCallAction
     *        Included if <code>ActionType</code> is <code>AWS_API_CALL</code>. Provides details about the API call that
     *        was detected.
     */

    public void setAwsApiCallAction(AwsApiCallAction awsApiCallAction) {
        this.awsApiCallAction = awsApiCallAction;
    }

    /**
     * <p>
     * Included if <code>ActionType</code> is <code>AWS_API_CALL</code>. Provides details about the API call that was
     * detected.
     * </p>
     * 
     * @return Included if <code>ActionType</code> is <code>AWS_API_CALL</code>. Provides details about the API call
     *         that was detected.
     */

    public AwsApiCallAction getAwsApiCallAction() {
        return this.awsApiCallAction;
    }

    /**
     * <p>
     * Included if <code>ActionType</code> is <code>AWS_API_CALL</code>. Provides details about the API call that was
     * detected.
     * </p>
     * 
     * @param awsApiCallAction
     *        Included if <code>ActionType</code> is <code>AWS_API_CALL</code>. Provides details about the API call that
     *        was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withAwsApiCallAction(AwsApiCallAction awsApiCallAction) {
        setAwsApiCallAction(awsApiCallAction);
        return this;
    }

    /**
     * <p>
     * Included if <code>ActionType</code> is <code>DNS_REQUEST</code>. Provides details about the DNS request that was
     * detected.
     * </p>
     * 
     * @param dnsRequestAction
     *        Included if <code>ActionType</code> is <code>DNS_REQUEST</code>. Provides details about the DNS request
     *        that was detected.
     */

    public void setDnsRequestAction(DnsRequestAction dnsRequestAction) {
        this.dnsRequestAction = dnsRequestAction;
    }

    /**
     * <p>
     * Included if <code>ActionType</code> is <code>DNS_REQUEST</code>. Provides details about the DNS request that was
     * detected.
     * </p>
     * 
     * @return Included if <code>ActionType</code> is <code>DNS_REQUEST</code>. Provides details about the DNS request
     *         that was detected.
     */

    public DnsRequestAction getDnsRequestAction() {
        return this.dnsRequestAction;
    }

    /**
     * <p>
     * Included if <code>ActionType</code> is <code>DNS_REQUEST</code>. Provides details about the DNS request that was
     * detected.
     * </p>
     * 
     * @param dnsRequestAction
     *        Included if <code>ActionType</code> is <code>DNS_REQUEST</code>. Provides details about the DNS request
     *        that was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withDnsRequestAction(DnsRequestAction dnsRequestAction) {
        setDnsRequestAction(dnsRequestAction);
        return this;
    }

    /**
     * <p>
     * Included if <code>ActionType</code> is <code>PORT_PROBE</code>. Provides details about the port probe that was
     * detected.
     * </p>
     * 
     * @param portProbeAction
     *        Included if <code>ActionType</code> is <code>PORT_PROBE</code>. Provides details about the port probe that
     *        was detected.
     */

    public void setPortProbeAction(PortProbeAction portProbeAction) {
        this.portProbeAction = portProbeAction;
    }

    /**
     * <p>
     * Included if <code>ActionType</code> is <code>PORT_PROBE</code>. Provides details about the port probe that was
     * detected.
     * </p>
     * 
     * @return Included if <code>ActionType</code> is <code>PORT_PROBE</code>. Provides details about the port probe
     *         that was detected.
     */

    public PortProbeAction getPortProbeAction() {
        return this.portProbeAction;
    }

    /**
     * <p>
     * Included if <code>ActionType</code> is <code>PORT_PROBE</code>. Provides details about the port probe that was
     * detected.
     * </p>
     * 
     * @param portProbeAction
     *        Included if <code>ActionType</code> is <code>PORT_PROBE</code>. Provides details about the port probe that
     *        was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withPortProbeAction(PortProbeAction portProbeAction) {
        setPortProbeAction(portProbeAction);
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
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getNetworkConnectionAction() != null)
            sb.append("NetworkConnectionAction: ").append(getNetworkConnectionAction()).append(",");
        if (getAwsApiCallAction() != null)
            sb.append("AwsApiCallAction: ").append(getAwsApiCallAction()).append(",");
        if (getDnsRequestAction() != null)
            sb.append("DnsRequestAction: ").append(getDnsRequestAction()).append(",");
        if (getPortProbeAction() != null)
            sb.append("PortProbeAction: ").append(getPortProbeAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getNetworkConnectionAction() == null ^ this.getNetworkConnectionAction() == null)
            return false;
        if (other.getNetworkConnectionAction() != null && other.getNetworkConnectionAction().equals(this.getNetworkConnectionAction()) == false)
            return false;
        if (other.getAwsApiCallAction() == null ^ this.getAwsApiCallAction() == null)
            return false;
        if (other.getAwsApiCallAction() != null && other.getAwsApiCallAction().equals(this.getAwsApiCallAction()) == false)
            return false;
        if (other.getDnsRequestAction() == null ^ this.getDnsRequestAction() == null)
            return false;
        if (other.getDnsRequestAction() != null && other.getDnsRequestAction().equals(this.getDnsRequestAction()) == false)
            return false;
        if (other.getPortProbeAction() == null ^ this.getPortProbeAction() == null)
            return false;
        if (other.getPortProbeAction() != null && other.getPortProbeAction().equals(this.getPortProbeAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getNetworkConnectionAction() == null) ? 0 : getNetworkConnectionAction().hashCode());
        hashCode = prime * hashCode + ((getAwsApiCallAction() == null) ? 0 : getAwsApiCallAction().hashCode());
        hashCode = prime * hashCode + ((getDnsRequestAction() == null) ? 0 : getDnsRequestAction().hashCode());
        hashCode = prime * hashCode + ((getPortProbeAction() == null) ? 0 : getPortProbeAction().hashCode());
        return hashCode;
    }

    @Override
    public Action clone() {
        try {
            return (Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
