/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Contains information about actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Action" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The GuardDuty finding activity type.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * Information about the AWS_API_CALL action described in this finding.
     * </p>
     */
    private AwsApiCallAction awsApiCallAction;
    /**
     * <p>
     * Information about the DNS_REQUEST action described in this finding.
     * </p>
     */
    private DnsRequestAction dnsRequestAction;
    /**
     * <p>
     * Information about the NETWORK_CONNECTION action described in this finding.
     * </p>
     */
    private NetworkConnectionAction networkConnectionAction;
    /**
     * <p>
     * Information about the PORT_PROBE action described in this finding.
     * </p>
     */
    private PortProbeAction portProbeAction;
    /**
     * <p>
     * Information about the Kubernetes API call action described in this finding.
     * </p>
     */
    private KubernetesApiCallAction kubernetesApiCallAction;
    /**
     * <p>
     * Information about <code>RDS_LOGIN_ATTEMPT</code> action described in this finding.
     * </p>
     */
    private RdsLoginAttemptAction rdsLoginAttemptAction;
    /**
     * <p>
     * Information whether the user has the permission to use a specific Kubernetes API.
     * </p>
     */
    private KubernetesPermissionCheckedDetails kubernetesPermissionCheckedDetails;
    /**
     * <p>
     * Information about the role binding that grants the permission defined in a Kubernetes role.
     * </p>
     */
    private KubernetesRoleBindingDetails kubernetesRoleBindingDetails;
    /**
     * <p>
     * Information about the Kubernetes role name and role type.
     * </p>
     */
    private KubernetesRoleDetails kubernetesRoleDetails;

    /**
     * <p>
     * The GuardDuty finding activity type.
     * </p>
     * 
     * @param actionType
     *        The GuardDuty finding activity type.
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The GuardDuty finding activity type.
     * </p>
     * 
     * @return The GuardDuty finding activity type.
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The GuardDuty finding activity type.
     * </p>
     * 
     * @param actionType
     *        The GuardDuty finding activity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * Information about the AWS_API_CALL action described in this finding.
     * </p>
     * 
     * @param awsApiCallAction
     *        Information about the AWS_API_CALL action described in this finding.
     */

    public void setAwsApiCallAction(AwsApiCallAction awsApiCallAction) {
        this.awsApiCallAction = awsApiCallAction;
    }

    /**
     * <p>
     * Information about the AWS_API_CALL action described in this finding.
     * </p>
     * 
     * @return Information about the AWS_API_CALL action described in this finding.
     */

    public AwsApiCallAction getAwsApiCallAction() {
        return this.awsApiCallAction;
    }

    /**
     * <p>
     * Information about the AWS_API_CALL action described in this finding.
     * </p>
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
     * <p>
     * Information about the DNS_REQUEST action described in this finding.
     * </p>
     * 
     * @param dnsRequestAction
     *        Information about the DNS_REQUEST action described in this finding.
     */

    public void setDnsRequestAction(DnsRequestAction dnsRequestAction) {
        this.dnsRequestAction = dnsRequestAction;
    }

    /**
     * <p>
     * Information about the DNS_REQUEST action described in this finding.
     * </p>
     * 
     * @return Information about the DNS_REQUEST action described in this finding.
     */

    public DnsRequestAction getDnsRequestAction() {
        return this.dnsRequestAction;
    }

    /**
     * <p>
     * Information about the DNS_REQUEST action described in this finding.
     * </p>
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
     * <p>
     * Information about the NETWORK_CONNECTION action described in this finding.
     * </p>
     * 
     * @param networkConnectionAction
     *        Information about the NETWORK_CONNECTION action described in this finding.
     */

    public void setNetworkConnectionAction(NetworkConnectionAction networkConnectionAction) {
        this.networkConnectionAction = networkConnectionAction;
    }

    /**
     * <p>
     * Information about the NETWORK_CONNECTION action described in this finding.
     * </p>
     * 
     * @return Information about the NETWORK_CONNECTION action described in this finding.
     */

    public NetworkConnectionAction getNetworkConnectionAction() {
        return this.networkConnectionAction;
    }

    /**
     * <p>
     * Information about the NETWORK_CONNECTION action described in this finding.
     * </p>
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
     * <p>
     * Information about the PORT_PROBE action described in this finding.
     * </p>
     * 
     * @param portProbeAction
     *        Information about the PORT_PROBE action described in this finding.
     */

    public void setPortProbeAction(PortProbeAction portProbeAction) {
        this.portProbeAction = portProbeAction;
    }

    /**
     * <p>
     * Information about the PORT_PROBE action described in this finding.
     * </p>
     * 
     * @return Information about the PORT_PROBE action described in this finding.
     */

    public PortProbeAction getPortProbeAction() {
        return this.portProbeAction;
    }

    /**
     * <p>
     * Information about the PORT_PROBE action described in this finding.
     * </p>
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
     * <p>
     * Information about the Kubernetes API call action described in this finding.
     * </p>
     * 
     * @param kubernetesApiCallAction
     *        Information about the Kubernetes API call action described in this finding.
     */

    public void setKubernetesApiCallAction(KubernetesApiCallAction kubernetesApiCallAction) {
        this.kubernetesApiCallAction = kubernetesApiCallAction;
    }

    /**
     * <p>
     * Information about the Kubernetes API call action described in this finding.
     * </p>
     * 
     * @return Information about the Kubernetes API call action described in this finding.
     */

    public KubernetesApiCallAction getKubernetesApiCallAction() {
        return this.kubernetesApiCallAction;
    }

    /**
     * <p>
     * Information about the Kubernetes API call action described in this finding.
     * </p>
     * 
     * @param kubernetesApiCallAction
     *        Information about the Kubernetes API call action described in this finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withKubernetesApiCallAction(KubernetesApiCallAction kubernetesApiCallAction) {
        setKubernetesApiCallAction(kubernetesApiCallAction);
        return this;
    }

    /**
     * <p>
     * Information about <code>RDS_LOGIN_ATTEMPT</code> action described in this finding.
     * </p>
     * 
     * @param rdsLoginAttemptAction
     *        Information about <code>RDS_LOGIN_ATTEMPT</code> action described in this finding.
     */

    public void setRdsLoginAttemptAction(RdsLoginAttemptAction rdsLoginAttemptAction) {
        this.rdsLoginAttemptAction = rdsLoginAttemptAction;
    }

    /**
     * <p>
     * Information about <code>RDS_LOGIN_ATTEMPT</code> action described in this finding.
     * </p>
     * 
     * @return Information about <code>RDS_LOGIN_ATTEMPT</code> action described in this finding.
     */

    public RdsLoginAttemptAction getRdsLoginAttemptAction() {
        return this.rdsLoginAttemptAction;
    }

    /**
     * <p>
     * Information about <code>RDS_LOGIN_ATTEMPT</code> action described in this finding.
     * </p>
     * 
     * @param rdsLoginAttemptAction
     *        Information about <code>RDS_LOGIN_ATTEMPT</code> action described in this finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withRdsLoginAttemptAction(RdsLoginAttemptAction rdsLoginAttemptAction) {
        setRdsLoginAttemptAction(rdsLoginAttemptAction);
        return this;
    }

    /**
     * <p>
     * Information whether the user has the permission to use a specific Kubernetes API.
     * </p>
     * 
     * @param kubernetesPermissionCheckedDetails
     *        Information whether the user has the permission to use a specific Kubernetes API.
     */

    public void setKubernetesPermissionCheckedDetails(KubernetesPermissionCheckedDetails kubernetesPermissionCheckedDetails) {
        this.kubernetesPermissionCheckedDetails = kubernetesPermissionCheckedDetails;
    }

    /**
     * <p>
     * Information whether the user has the permission to use a specific Kubernetes API.
     * </p>
     * 
     * @return Information whether the user has the permission to use a specific Kubernetes API.
     */

    public KubernetesPermissionCheckedDetails getKubernetesPermissionCheckedDetails() {
        return this.kubernetesPermissionCheckedDetails;
    }

    /**
     * <p>
     * Information whether the user has the permission to use a specific Kubernetes API.
     * </p>
     * 
     * @param kubernetesPermissionCheckedDetails
     *        Information whether the user has the permission to use a specific Kubernetes API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withKubernetesPermissionCheckedDetails(KubernetesPermissionCheckedDetails kubernetesPermissionCheckedDetails) {
        setKubernetesPermissionCheckedDetails(kubernetesPermissionCheckedDetails);
        return this;
    }

    /**
     * <p>
     * Information about the role binding that grants the permission defined in a Kubernetes role.
     * </p>
     * 
     * @param kubernetesRoleBindingDetails
     *        Information about the role binding that grants the permission defined in a Kubernetes role.
     */

    public void setKubernetesRoleBindingDetails(KubernetesRoleBindingDetails kubernetesRoleBindingDetails) {
        this.kubernetesRoleBindingDetails = kubernetesRoleBindingDetails;
    }

    /**
     * <p>
     * Information about the role binding that grants the permission defined in a Kubernetes role.
     * </p>
     * 
     * @return Information about the role binding that grants the permission defined in a Kubernetes role.
     */

    public KubernetesRoleBindingDetails getKubernetesRoleBindingDetails() {
        return this.kubernetesRoleBindingDetails;
    }

    /**
     * <p>
     * Information about the role binding that grants the permission defined in a Kubernetes role.
     * </p>
     * 
     * @param kubernetesRoleBindingDetails
     *        Information about the role binding that grants the permission defined in a Kubernetes role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withKubernetesRoleBindingDetails(KubernetesRoleBindingDetails kubernetesRoleBindingDetails) {
        setKubernetesRoleBindingDetails(kubernetesRoleBindingDetails);
        return this;
    }

    /**
     * <p>
     * Information about the Kubernetes role name and role type.
     * </p>
     * 
     * @param kubernetesRoleDetails
     *        Information about the Kubernetes role name and role type.
     */

    public void setKubernetesRoleDetails(KubernetesRoleDetails kubernetesRoleDetails) {
        this.kubernetesRoleDetails = kubernetesRoleDetails;
    }

    /**
     * <p>
     * Information about the Kubernetes role name and role type.
     * </p>
     * 
     * @return Information about the Kubernetes role name and role type.
     */

    public KubernetesRoleDetails getKubernetesRoleDetails() {
        return this.kubernetesRoleDetails;
    }

    /**
     * <p>
     * Information about the Kubernetes role name and role type.
     * </p>
     * 
     * @param kubernetesRoleDetails
     *        Information about the Kubernetes role name and role type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withKubernetesRoleDetails(KubernetesRoleDetails kubernetesRoleDetails) {
        setKubernetesRoleDetails(kubernetesRoleDetails);
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
            sb.append("PortProbeAction: ").append(getPortProbeAction()).append(",");
        if (getKubernetesApiCallAction() != null)
            sb.append("KubernetesApiCallAction: ").append(getKubernetesApiCallAction()).append(",");
        if (getRdsLoginAttemptAction() != null)
            sb.append("RdsLoginAttemptAction: ").append(getRdsLoginAttemptAction()).append(",");
        if (getKubernetesPermissionCheckedDetails() != null)
            sb.append("KubernetesPermissionCheckedDetails: ").append(getKubernetesPermissionCheckedDetails()).append(",");
        if (getKubernetesRoleBindingDetails() != null)
            sb.append("KubernetesRoleBindingDetails: ").append(getKubernetesRoleBindingDetails()).append(",");
        if (getKubernetesRoleDetails() != null)
            sb.append("KubernetesRoleDetails: ").append(getKubernetesRoleDetails());
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
        if (other.getKubernetesApiCallAction() == null ^ this.getKubernetesApiCallAction() == null)
            return false;
        if (other.getKubernetesApiCallAction() != null && other.getKubernetesApiCallAction().equals(this.getKubernetesApiCallAction()) == false)
            return false;
        if (other.getRdsLoginAttemptAction() == null ^ this.getRdsLoginAttemptAction() == null)
            return false;
        if (other.getRdsLoginAttemptAction() != null && other.getRdsLoginAttemptAction().equals(this.getRdsLoginAttemptAction()) == false)
            return false;
        if (other.getKubernetesPermissionCheckedDetails() == null ^ this.getKubernetesPermissionCheckedDetails() == null)
            return false;
        if (other.getKubernetesPermissionCheckedDetails() != null
                && other.getKubernetesPermissionCheckedDetails().equals(this.getKubernetesPermissionCheckedDetails()) == false)
            return false;
        if (other.getKubernetesRoleBindingDetails() == null ^ this.getKubernetesRoleBindingDetails() == null)
            return false;
        if (other.getKubernetesRoleBindingDetails() != null && other.getKubernetesRoleBindingDetails().equals(this.getKubernetesRoleBindingDetails()) == false)
            return false;
        if (other.getKubernetesRoleDetails() == null ^ this.getKubernetesRoleDetails() == null)
            return false;
        if (other.getKubernetesRoleDetails() != null && other.getKubernetesRoleDetails().equals(this.getKubernetesRoleDetails()) == false)
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
        hashCode = prime * hashCode + ((getKubernetesApiCallAction() == null) ? 0 : getKubernetesApiCallAction().hashCode());
        hashCode = prime * hashCode + ((getRdsLoginAttemptAction() == null) ? 0 : getRdsLoginAttemptAction().hashCode());
        hashCode = prime * hashCode + ((getKubernetesPermissionCheckedDetails() == null) ? 0 : getKubernetesPermissionCheckedDetails().hashCode());
        hashCode = prime * hashCode + ((getKubernetesRoleBindingDetails() == null) ? 0 : getKubernetesRoleBindingDetails().hashCode());
        hashCode = prime * hashCode + ((getKubernetesRoleDetails() == null) ? 0 : getKubernetesRoleDetails().hashCode());
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
