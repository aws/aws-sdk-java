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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDiscoverySummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of servers discovered.
     * </p>
     */
    private Long servers;
    /**
     * <p>
     * The number of applications discovered.
     * </p>
     */
    private Long applications;
    /**
     * <p>
     * The number of servers mapped to applications.
     * </p>
     */
    private Long serversMappedToApplications;
    /**
     * <p>
     * The number of servers mapped to tags.
     * </p>
     */
    private Long serversMappedtoTags;
    /**
     * <p>
     * Details about discovered agents, including agent status and health.
     * </p>
     */
    private CustomerAgentInfo agentSummary;
    /**
     * <p>
     * Details about discovered connectors, including connector status and health.
     * </p>
     */
    private CustomerConnectorInfo connectorSummary;

    /**
     * <p>
     * The number of servers discovered.
     * </p>
     * 
     * @param servers
     *        The number of servers discovered.
     */

    public void setServers(Long servers) {
        this.servers = servers;
    }

    /**
     * <p>
     * The number of servers discovered.
     * </p>
     * 
     * @return The number of servers discovered.
     */

    public Long getServers() {
        return this.servers;
    }

    /**
     * <p>
     * The number of servers discovered.
     * </p>
     * 
     * @param servers
     *        The number of servers discovered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiscoverySummaryResult withServers(Long servers) {
        setServers(servers);
        return this;
    }

    /**
     * <p>
     * The number of applications discovered.
     * </p>
     * 
     * @param applications
     *        The number of applications discovered.
     */

    public void setApplications(Long applications) {
        this.applications = applications;
    }

    /**
     * <p>
     * The number of applications discovered.
     * </p>
     * 
     * @return The number of applications discovered.
     */

    public Long getApplications() {
        return this.applications;
    }

    /**
     * <p>
     * The number of applications discovered.
     * </p>
     * 
     * @param applications
     *        The number of applications discovered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiscoverySummaryResult withApplications(Long applications) {
        setApplications(applications);
        return this;
    }

    /**
     * <p>
     * The number of servers mapped to applications.
     * </p>
     * 
     * @param serversMappedToApplications
     *        The number of servers mapped to applications.
     */

    public void setServersMappedToApplications(Long serversMappedToApplications) {
        this.serversMappedToApplications = serversMappedToApplications;
    }

    /**
     * <p>
     * The number of servers mapped to applications.
     * </p>
     * 
     * @return The number of servers mapped to applications.
     */

    public Long getServersMappedToApplications() {
        return this.serversMappedToApplications;
    }

    /**
     * <p>
     * The number of servers mapped to applications.
     * </p>
     * 
     * @param serversMappedToApplications
     *        The number of servers mapped to applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiscoverySummaryResult withServersMappedToApplications(Long serversMappedToApplications) {
        setServersMappedToApplications(serversMappedToApplications);
        return this;
    }

    /**
     * <p>
     * The number of servers mapped to tags.
     * </p>
     * 
     * @param serversMappedtoTags
     *        The number of servers mapped to tags.
     */

    public void setServersMappedtoTags(Long serversMappedtoTags) {
        this.serversMappedtoTags = serversMappedtoTags;
    }

    /**
     * <p>
     * The number of servers mapped to tags.
     * </p>
     * 
     * @return The number of servers mapped to tags.
     */

    public Long getServersMappedtoTags() {
        return this.serversMappedtoTags;
    }

    /**
     * <p>
     * The number of servers mapped to tags.
     * </p>
     * 
     * @param serversMappedtoTags
     *        The number of servers mapped to tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiscoverySummaryResult withServersMappedtoTags(Long serversMappedtoTags) {
        setServersMappedtoTags(serversMappedtoTags);
        return this;
    }

    /**
     * <p>
     * Details about discovered agents, including agent status and health.
     * </p>
     * 
     * @param agentSummary
     *        Details about discovered agents, including agent status and health.
     */

    public void setAgentSummary(CustomerAgentInfo agentSummary) {
        this.agentSummary = agentSummary;
    }

    /**
     * <p>
     * Details about discovered agents, including agent status and health.
     * </p>
     * 
     * @return Details about discovered agents, including agent status and health.
     */

    public CustomerAgentInfo getAgentSummary() {
        return this.agentSummary;
    }

    /**
     * <p>
     * Details about discovered agents, including agent status and health.
     * </p>
     * 
     * @param agentSummary
     *        Details about discovered agents, including agent status and health.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiscoverySummaryResult withAgentSummary(CustomerAgentInfo agentSummary) {
        setAgentSummary(agentSummary);
        return this;
    }

    /**
     * <p>
     * Details about discovered connectors, including connector status and health.
     * </p>
     * 
     * @param connectorSummary
     *        Details about discovered connectors, including connector status and health.
     */

    public void setConnectorSummary(CustomerConnectorInfo connectorSummary) {
        this.connectorSummary = connectorSummary;
    }

    /**
     * <p>
     * Details about discovered connectors, including connector status and health.
     * </p>
     * 
     * @return Details about discovered connectors, including connector status and health.
     */

    public CustomerConnectorInfo getConnectorSummary() {
        return this.connectorSummary;
    }

    /**
     * <p>
     * Details about discovered connectors, including connector status and health.
     * </p>
     * 
     * @param connectorSummary
     *        Details about discovered connectors, including connector status and health.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiscoverySummaryResult withConnectorSummary(CustomerConnectorInfo connectorSummary) {
        setConnectorSummary(connectorSummary);
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
        if (getServers() != null)
            sb.append("Servers: ").append(getServers()).append(",");
        if (getApplications() != null)
            sb.append("Applications: ").append(getApplications()).append(",");
        if (getServersMappedToApplications() != null)
            sb.append("ServersMappedToApplications: ").append(getServersMappedToApplications()).append(",");
        if (getServersMappedtoTags() != null)
            sb.append("ServersMappedtoTags: ").append(getServersMappedtoTags()).append(",");
        if (getAgentSummary() != null)
            sb.append("AgentSummary: ").append(getAgentSummary()).append(",");
        if (getConnectorSummary() != null)
            sb.append("ConnectorSummary: ").append(getConnectorSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDiscoverySummaryResult == false)
            return false;
        GetDiscoverySummaryResult other = (GetDiscoverySummaryResult) obj;
        if (other.getServers() == null ^ this.getServers() == null)
            return false;
        if (other.getServers() != null && other.getServers().equals(this.getServers()) == false)
            return false;
        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false)
            return false;
        if (other.getServersMappedToApplications() == null ^ this.getServersMappedToApplications() == null)
            return false;
        if (other.getServersMappedToApplications() != null && other.getServersMappedToApplications().equals(this.getServersMappedToApplications()) == false)
            return false;
        if (other.getServersMappedtoTags() == null ^ this.getServersMappedtoTags() == null)
            return false;
        if (other.getServersMappedtoTags() != null && other.getServersMappedtoTags().equals(this.getServersMappedtoTags()) == false)
            return false;
        if (other.getAgentSummary() == null ^ this.getAgentSummary() == null)
            return false;
        if (other.getAgentSummary() != null && other.getAgentSummary().equals(this.getAgentSummary()) == false)
            return false;
        if (other.getConnectorSummary() == null ^ this.getConnectorSummary() == null)
            return false;
        if (other.getConnectorSummary() != null && other.getConnectorSummary().equals(this.getConnectorSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServers() == null) ? 0 : getServers().hashCode());
        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode());
        hashCode = prime * hashCode + ((getServersMappedToApplications() == null) ? 0 : getServersMappedToApplications().hashCode());
        hashCode = prime * hashCode + ((getServersMappedtoTags() == null) ? 0 : getServersMappedtoTags().hashCode());
        hashCode = prime * hashCode + ((getAgentSummary() == null) ? 0 : getAgentSummary().hashCode());
        hashCode = prime * hashCode + ((getConnectorSummary() == null) ? 0 : getConnectorSummary().hashCode());
        return hashCode;
    }

    @Override
    public GetDiscoverySummaryResult clone() {
        try {
            return (GetDiscoverySummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
