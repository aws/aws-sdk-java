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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about the activity described in a finding.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Action" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable, StructuredPojo {

    /** GuardDuty Finding activity type. */
    private String actionType;
    /** Information about the AWS_API_CALL action described in this finding. */
    private AwsApiCallAction awsApiCallAction;
    /** Information about the DNS_REQUEST action described in this finding. */
    private DnsRequestAction dnsRequestAction;
    /** Information about the NETWORK_CONNECTION action described in this finding. */
    private NetworkConnectionAction networkConnectionAction;
    /** Information about the PORT_PROBE action described in this finding. */
    private PortProbeAction portProbeAction;

    /**
     * GuardDuty Finding activity type.
     * 
     * @param actionType
     *        GuardDuty Finding activity type.
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * GuardDuty Finding activity type.
     * 
     * @return GuardDuty Finding activity type.
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * GuardDuty Finding activity type.
     * 
     * @param actionType
     *        GuardDuty Finding activity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * Information about the AWS_API_CALL action described in this finding.
     * 
     * @param awsApiCallAction
     *        Information about the AWS_API_CALL action described in this finding.
     */

    public void setAwsApiCallAction(AwsApiCallAction awsApiCallAction) {
        this.awsApiCallAction = awsApiCallAction;
    }

    /**
     * Information about the AWS_API_CALL action described in this finding.
     * 
     * @return Information about the AWS_API_CALL action described in this finding.
     */

    public AwsApiCallAction getAwsApiCallAction() {
        return this.awsApiCallAction;
    }

    /**
     * Information about the AWS_API_CALL action described in this finding.
     * 
     * @param awsApiCallAction
     *        Information about the AWS_API_CALL action described in this finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withAwsApiCallAction(AwsApiCallAction awsApiCallAction) {
        setAwsApiCallAction(awsApiCallAction);
        return this;
    }

    /**
     * Information about the DNS_REQUEST action described in this finding.
     * 
     * @param dnsRequestAction
     *        Information about the DNS_REQUEST action described in this finding.
     */

    public void setDnsRequestAction(DnsRequestAction dnsRequestAction) {
        this.dnsRequestAction = dnsRequestAction;
    }

    /**
     * Information about the DNS_REQUEST action described in this finding.
     * 
     * @return Information about the DNS_REQUEST action described in this finding.
     */

    public DnsRequestAction getDnsRequestAction() {
        return this.dnsRequestAction;
    }

    /**
     * Information about the DNS_REQUEST action described in this finding.
     * 
     * @param dnsRequestAction
     *        Information about the DNS_REQUEST action described in this finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withDnsRequestAction(DnsRequestAction dnsRequestAction) {
        setDnsRequestAction(dnsRequestAction);
        return this;
    }

    /**
     * Information about the NETWORK_CONNECTION action described in this finding.
     * 
     * @param networkConnectionAction
     *        Information about the NETWORK_CONNECTION action described in this finding.
     */

    public void setNetworkConnectionAction(NetworkConnectionAction networkConnectionAction) {
        this.networkConnectionAction = networkConnectionAction;
    }

    /**
     * Information about the NETWORK_CONNECTION action described in this finding.
     * 
     * @return Information about the NETWORK_CONNECTION action described in this finding.
     */

    public NetworkConnectionAction getNetworkConnectionAction() {
        return this.networkConnectionAction;
    }

    /**
     * Information about the NETWORK_CONNECTION action described in this finding.
     * 
     * @param networkConnectionAction
     *        Information about the NETWORK_CONNECTION action described in this finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withNetworkConnectionAction(NetworkConnectionAction networkConnectionAction) {
        setNetworkConnectionAction(networkConnectionAction);
        return this;
    }

    /**
     * Information about the PORT_PROBE action described in this finding.
     * 
     * @param portProbeAction
     *        Information about the PORT_PROBE action described in this finding.
     */

    public void setPortProbeAction(PortProbeAction portProbeAction) {
        this.portProbeAction = portProbeAction;
    }

    /**
     * Information about the PORT_PROBE action described in this finding.
     * 
     * @return Information about the PORT_PROBE action described in this finding.
     */

    public PortProbeAction getPortProbeAction() {
        return this.portProbeAction;
    }

    /**
     * Information about the PORT_PROBE action described in this finding.
     * 
     * @param portProbeAction
     *        Information about the PORT_PROBE action described in this finding.
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
        if (getAwsApiCallAction() != null)
            sb.append("AwsApiCallAction: ").append(getAwsApiCallAction()).append(",");
        if (getDnsRequestAction() != null)
            sb.append("DnsRequestAction: ").append(getDnsRequestAction()).append(",");
        if (getNetworkConnectionAction() != null)
            sb.append("NetworkConnectionAction: ").append(getNetworkConnectionAction()).append(",");
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
        if (other.getAwsApiCallAction() == null ^ this.getAwsApiCallAction() == null)
            return false;
        if (other.getAwsApiCallAction() != null && other.getAwsApiCallAction().equals(this.getAwsApiCallAction()) == false)
            return false;
        if (other.getDnsRequestAction() == null ^ this.getDnsRequestAction() == null)
            return false;
        if (other.getDnsRequestAction() != null && other.getDnsRequestAction().equals(this.getDnsRequestAction()) == false)
            return false;
        if (other.getNetworkConnectionAction() == null ^ this.getNetworkConnectionAction() == null)
            return false;
        if (other.getNetworkConnectionAction() != null && other.getNetworkConnectionAction().equals(this.getNetworkConnectionAction()) == false)
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
        hashCode = prime * hashCode + ((getAwsApiCallAction() == null) ? 0 : getAwsApiCallAction().hashCode());
        hashCode = prime * hashCode + ((getDnsRequestAction() == null) ? 0 : getDnsRequestAction().hashCode());
        hashCode = prime * hashCode + ((getNetworkConnectionAction() == null) ? 0 : getNetworkConnectionAction().hashCode());
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
        com.amazonaws.services.guardduty.model.transform.ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
