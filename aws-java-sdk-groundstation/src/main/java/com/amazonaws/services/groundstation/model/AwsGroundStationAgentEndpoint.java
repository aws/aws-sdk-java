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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about AwsGroundStationAgentEndpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/AwsGroundStationAgentEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsGroundStationAgentEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of AgentEndpoint.
     * </p>
     */
    private String agentStatus;
    /**
     * <p>
     * The results of the audit.
     * </p>
     */
    private String auditResults;
    /**
     * <p>
     * The egress address of AgentEndpoint.
     * </p>
     */
    private ConnectionDetails egressAddress;
    /**
     * <p>
     * The ingress address of AgentEndpoint.
     * </p>
     */
    private RangedConnectionDetails ingressAddress;
    /**
     * <p>
     * Name string associated with AgentEndpoint. Used as a human-readable identifier for AgentEndpoint.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The status of AgentEndpoint.
     * </p>
     * 
     * @param agentStatus
     *        The status of AgentEndpoint.
     * @see AgentStatus
     */

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    /**
     * <p>
     * The status of AgentEndpoint.
     * </p>
     * 
     * @return The status of AgentEndpoint.
     * @see AgentStatus
     */

    public String getAgentStatus() {
        return this.agentStatus;
    }

    /**
     * <p>
     * The status of AgentEndpoint.
     * </p>
     * 
     * @param agentStatus
     *        The status of AgentEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AwsGroundStationAgentEndpoint withAgentStatus(String agentStatus) {
        setAgentStatus(agentStatus);
        return this;
    }

    /**
     * <p>
     * The status of AgentEndpoint.
     * </p>
     * 
     * @param agentStatus
     *        The status of AgentEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatus
     */

    public AwsGroundStationAgentEndpoint withAgentStatus(AgentStatus agentStatus) {
        this.agentStatus = agentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The results of the audit.
     * </p>
     * 
     * @param auditResults
     *        The results of the audit.
     * @see AuditResults
     */

    public void setAuditResults(String auditResults) {
        this.auditResults = auditResults;
    }

    /**
     * <p>
     * The results of the audit.
     * </p>
     * 
     * @return The results of the audit.
     * @see AuditResults
     */

    public String getAuditResults() {
        return this.auditResults;
    }

    /**
     * <p>
     * The results of the audit.
     * </p>
     * 
     * @param auditResults
     *        The results of the audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditResults
     */

    public AwsGroundStationAgentEndpoint withAuditResults(String auditResults) {
        setAuditResults(auditResults);
        return this;
    }

    /**
     * <p>
     * The results of the audit.
     * </p>
     * 
     * @param auditResults
     *        The results of the audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditResults
     */

    public AwsGroundStationAgentEndpoint withAuditResults(AuditResults auditResults) {
        this.auditResults = auditResults.toString();
        return this;
    }

    /**
     * <p>
     * The egress address of AgentEndpoint.
     * </p>
     * 
     * @param egressAddress
     *        The egress address of AgentEndpoint.
     */

    public void setEgressAddress(ConnectionDetails egressAddress) {
        this.egressAddress = egressAddress;
    }

    /**
     * <p>
     * The egress address of AgentEndpoint.
     * </p>
     * 
     * @return The egress address of AgentEndpoint.
     */

    public ConnectionDetails getEgressAddress() {
        return this.egressAddress;
    }

    /**
     * <p>
     * The egress address of AgentEndpoint.
     * </p>
     * 
     * @param egressAddress
     *        The egress address of AgentEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGroundStationAgentEndpoint withEgressAddress(ConnectionDetails egressAddress) {
        setEgressAddress(egressAddress);
        return this;
    }

    /**
     * <p>
     * The ingress address of AgentEndpoint.
     * </p>
     * 
     * @param ingressAddress
     *        The ingress address of AgentEndpoint.
     */

    public void setIngressAddress(RangedConnectionDetails ingressAddress) {
        this.ingressAddress = ingressAddress;
    }

    /**
     * <p>
     * The ingress address of AgentEndpoint.
     * </p>
     * 
     * @return The ingress address of AgentEndpoint.
     */

    public RangedConnectionDetails getIngressAddress() {
        return this.ingressAddress;
    }

    /**
     * <p>
     * The ingress address of AgentEndpoint.
     * </p>
     * 
     * @param ingressAddress
     *        The ingress address of AgentEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGroundStationAgentEndpoint withIngressAddress(RangedConnectionDetails ingressAddress) {
        setIngressAddress(ingressAddress);
        return this;
    }

    /**
     * <p>
     * Name string associated with AgentEndpoint. Used as a human-readable identifier for AgentEndpoint.
     * </p>
     * 
     * @param name
     *        Name string associated with AgentEndpoint. Used as a human-readable identifier for AgentEndpoint.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name string associated with AgentEndpoint. Used as a human-readable identifier for AgentEndpoint.
     * </p>
     * 
     * @return Name string associated with AgentEndpoint. Used as a human-readable identifier for AgentEndpoint.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name string associated with AgentEndpoint. Used as a human-readable identifier for AgentEndpoint.
     * </p>
     * 
     * @param name
     *        Name string associated with AgentEndpoint. Used as a human-readable identifier for AgentEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGroundStationAgentEndpoint withName(String name) {
        setName(name);
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
        if (getAgentStatus() != null)
            sb.append("AgentStatus: ").append(getAgentStatus()).append(",");
        if (getAuditResults() != null)
            sb.append("AuditResults: ").append(getAuditResults()).append(",");
        if (getEgressAddress() != null)
            sb.append("EgressAddress: ").append(getEgressAddress()).append(",");
        if (getIngressAddress() != null)
            sb.append("IngressAddress: ").append(getIngressAddress()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsGroundStationAgentEndpoint == false)
            return false;
        AwsGroundStationAgentEndpoint other = (AwsGroundStationAgentEndpoint) obj;
        if (other.getAgentStatus() == null ^ this.getAgentStatus() == null)
            return false;
        if (other.getAgentStatus() != null && other.getAgentStatus().equals(this.getAgentStatus()) == false)
            return false;
        if (other.getAuditResults() == null ^ this.getAuditResults() == null)
            return false;
        if (other.getAuditResults() != null && other.getAuditResults().equals(this.getAuditResults()) == false)
            return false;
        if (other.getEgressAddress() == null ^ this.getEgressAddress() == null)
            return false;
        if (other.getEgressAddress() != null && other.getEgressAddress().equals(this.getEgressAddress()) == false)
            return false;
        if (other.getIngressAddress() == null ^ this.getIngressAddress() == null)
            return false;
        if (other.getIngressAddress() != null && other.getIngressAddress().equals(this.getIngressAddress()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentStatus() == null) ? 0 : getAgentStatus().hashCode());
        hashCode = prime * hashCode + ((getAuditResults() == null) ? 0 : getAuditResults().hashCode());
        hashCode = prime * hashCode + ((getEgressAddress() == null) ? 0 : getEgressAddress().hashCode());
        hashCode = prime * hashCode + ((getIngressAddress() == null) ? 0 : getIngressAddress().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public AwsGroundStationAgentEndpoint clone() {
        try {
            return (AwsGroundStationAgentEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.AwsGroundStationAgentEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
