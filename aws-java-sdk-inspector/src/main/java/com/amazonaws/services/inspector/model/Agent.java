/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an Inspector agent. This data type is used as a
 * response element in the <a>ListAssessmentAgents</a> action.
 * </p>
 */
public class Agent implements Serializable, Cloneable {

    /**
     * <p>
     * The EC2 instance ID where the agent is installed.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The ARN of the assessment that is associated with the agent.
     * </p>
     */
    private String assessmentArn;
    /**
     * <p>
     * The current health state of the agent. Values can be set to
     * <i>HEALTHY</i> or <i>UNHEALTHY</i>.
     * </p>
     */
    private String agentHealth;
    /**
     * <p>
     * The detailed health state of the agent. Values can be set to
     * <i>RUNNING</i>, <i>HEALTHY</i>, <i>UNHEALTHY</i>, <i>UNKNOWN</i>,
     * <i>BLACKLISTED</i>, <i>SHUTDOWN</i>, <i>THROTTLED</i>.
     * </p>
     */
    private String agentHealthCode;
    /**
     * <p>
     * The description for the agent health code.
     * </p>
     */
    private String agentHealthDetails;
    /**
     * <p>
     * This data type property is currently not used.
     * </p>
     */
    private String autoScalingGroup;
    /**
     * <p>
     * AWS account of the EC2 instance where the agent is installed.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Inspector application data metrics collected by the agent.
     * </p>
     */
    private java.util.List<Telemetry> telemetry;

    /**
     * <p>
     * The EC2 instance ID where the agent is installed.
     * </p>
     * 
     * @param agentId
     *        The EC2 instance ID where the agent is installed.
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The EC2 instance ID where the agent is installed.
     * </p>
     * 
     * @return The EC2 instance ID where the agent is installed.
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The EC2 instance ID where the agent is installed.
     * </p>
     * 
     * @param agentId
     *        The EC2 instance ID where the agent is installed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Agent withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The ARN of the assessment that is associated with the agent.
     * </p>
     * 
     * @param assessmentArn
     *        The ARN of the assessment that is associated with the agent.
     */
    public void setAssessmentArn(String assessmentArn) {
        this.assessmentArn = assessmentArn;
    }

    /**
     * <p>
     * The ARN of the assessment that is associated with the agent.
     * </p>
     * 
     * @return The ARN of the assessment that is associated with the agent.
     */
    public String getAssessmentArn() {
        return this.assessmentArn;
    }

    /**
     * <p>
     * The ARN of the assessment that is associated with the agent.
     * </p>
     * 
     * @param assessmentArn
     *        The ARN of the assessment that is associated with the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Agent withAssessmentArn(String assessmentArn) {
        setAssessmentArn(assessmentArn);
        return this;
    }

    /**
     * <p>
     * The current health state of the agent. Values can be set to
     * <i>HEALTHY</i> or <i>UNHEALTHY</i>.
     * </p>
     * 
     * @param agentHealth
     *        The current health state of the agent. Values can be set to
     *        <i>HEALTHY</i> or <i>UNHEALTHY</i>.
     */
    public void setAgentHealth(String agentHealth) {
        this.agentHealth = agentHealth;
    }

    /**
     * <p>
     * The current health state of the agent. Values can be set to
     * <i>HEALTHY</i> or <i>UNHEALTHY</i>.
     * </p>
     * 
     * @return The current health state of the agent. Values can be set to
     *         <i>HEALTHY</i> or <i>UNHEALTHY</i>.
     */
    public String getAgentHealth() {
        return this.agentHealth;
    }

    /**
     * <p>
     * The current health state of the agent. Values can be set to
     * <i>HEALTHY</i> or <i>UNHEALTHY</i>.
     * </p>
     * 
     * @param agentHealth
     *        The current health state of the agent. Values can be set to
     *        <i>HEALTHY</i> or <i>UNHEALTHY</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Agent withAgentHealth(String agentHealth) {
        setAgentHealth(agentHealth);
        return this;
    }

    /**
     * <p>
     * The detailed health state of the agent. Values can be set to
     * <i>RUNNING</i>, <i>HEALTHY</i>, <i>UNHEALTHY</i>, <i>UNKNOWN</i>,
     * <i>BLACKLISTED</i>, <i>SHUTDOWN</i>, <i>THROTTLED</i>.
     * </p>
     * 
     * @param agentHealthCode
     *        The detailed health state of the agent. Values can be set to
     *        <i>RUNNING</i>, <i>HEALTHY</i>, <i>UNHEALTHY</i>, <i>UNKNOWN</i>,
     *        <i>BLACKLISTED</i>, <i>SHUTDOWN</i>, <i>THROTTLED</i>.
     */
    public void setAgentHealthCode(String agentHealthCode) {
        this.agentHealthCode = agentHealthCode;
    }

    /**
     * <p>
     * The detailed health state of the agent. Values can be set to
     * <i>RUNNING</i>, <i>HEALTHY</i>, <i>UNHEALTHY</i>, <i>UNKNOWN</i>,
     * <i>BLACKLISTED</i>, <i>SHUTDOWN</i>, <i>THROTTLED</i>.
     * </p>
     * 
     * @return The detailed health state of the agent. Values can be set to
     *         <i>RUNNING</i>, <i>HEALTHY</i>, <i>UNHEALTHY</i>, <i>UNKNOWN</i>,
     *         <i>BLACKLISTED</i>, <i>SHUTDOWN</i>, <i>THROTTLED</i>.
     */
    public String getAgentHealthCode() {
        return this.agentHealthCode;
    }

    /**
     * <p>
     * The detailed health state of the agent. Values can be set to
     * <i>RUNNING</i>, <i>HEALTHY</i>, <i>UNHEALTHY</i>, <i>UNKNOWN</i>,
     * <i>BLACKLISTED</i>, <i>SHUTDOWN</i>, <i>THROTTLED</i>.
     * </p>
     * 
     * @param agentHealthCode
     *        The detailed health state of the agent. Values can be set to
     *        <i>RUNNING</i>, <i>HEALTHY</i>, <i>UNHEALTHY</i>, <i>UNKNOWN</i>,
     *        <i>BLACKLISTED</i>, <i>SHUTDOWN</i>, <i>THROTTLED</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Agent withAgentHealthCode(String agentHealthCode) {
        setAgentHealthCode(agentHealthCode);
        return this;
    }

    /**
     * <p>
     * The description for the agent health code.
     * </p>
     * 
     * @param agentHealthDetails
     *        The description for the agent health code.
     */
    public void setAgentHealthDetails(String agentHealthDetails) {
        this.agentHealthDetails = agentHealthDetails;
    }

    /**
     * <p>
     * The description for the agent health code.
     * </p>
     * 
     * @return The description for the agent health code.
     */
    public String getAgentHealthDetails() {
        return this.agentHealthDetails;
    }

    /**
     * <p>
     * The description for the agent health code.
     * </p>
     * 
     * @param agentHealthDetails
     *        The description for the agent health code.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Agent withAgentHealthDetails(String agentHealthDetails) {
        setAgentHealthDetails(agentHealthDetails);
        return this;
    }

    /**
     * <p>
     * This data type property is currently not used.
     * </p>
     * 
     * @param autoScalingGroup
     *        This data type property is currently not used.
     */
    public void setAutoScalingGroup(String autoScalingGroup) {
        this.autoScalingGroup = autoScalingGroup;
    }

    /**
     * <p>
     * This data type property is currently not used.
     * </p>
     * 
     * @return This data type property is currently not used.
     */
    public String getAutoScalingGroup() {
        return this.autoScalingGroup;
    }

    /**
     * <p>
     * This data type property is currently not used.
     * </p>
     * 
     * @param autoScalingGroup
     *        This data type property is currently not used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Agent withAutoScalingGroup(String autoScalingGroup) {
        setAutoScalingGroup(autoScalingGroup);
        return this;
    }

    /**
     * <p>
     * AWS account of the EC2 instance where the agent is installed.
     * </p>
     * 
     * @param accountId
     *        AWS account of the EC2 instance where the agent is installed.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * AWS account of the EC2 instance where the agent is installed.
     * </p>
     * 
     * @return AWS account of the EC2 instance where the agent is installed.
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * AWS account of the EC2 instance where the agent is installed.
     * </p>
     * 
     * @param accountId
     *        AWS account of the EC2 instance where the agent is installed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Agent withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Inspector application data metrics collected by the agent.
     * </p>
     * 
     * @return The Inspector application data metrics collected by the agent.
     */
    public java.util.List<Telemetry> getTelemetry() {
        return telemetry;
    }

    /**
     * <p>
     * The Inspector application data metrics collected by the agent.
     * </p>
     * 
     * @param telemetry
     *        The Inspector application data metrics collected by the agent.
     */
    public void setTelemetry(java.util.Collection<Telemetry> telemetry) {
        if (telemetry == null) {
            this.telemetry = null;
            return;
        }

        this.telemetry = new java.util.ArrayList<Telemetry>(telemetry);
    }

    /**
     * <p>
     * The Inspector application data metrics collected by the agent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTelemetry(java.util.Collection)} or
     * {@link #withTelemetry(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param telemetry
     *        The Inspector application data metrics collected by the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Agent withTelemetry(Telemetry... telemetry) {
        if (this.telemetry == null) {
            setTelemetry(new java.util.ArrayList<Telemetry>(telemetry.length));
        }
        for (Telemetry ele : telemetry) {
            this.telemetry.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Inspector application data metrics collected by the agent.
     * </p>
     * 
     * @param telemetry
     *        The Inspector application data metrics collected by the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Agent withTelemetry(java.util.Collection<Telemetry> telemetry) {
        setTelemetry(telemetry);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAgentId() != null)
            sb.append("AgentId: " + getAgentId() + ",");
        if (getAssessmentArn() != null)
            sb.append("AssessmentArn: " + getAssessmentArn() + ",");
        if (getAgentHealth() != null)
            sb.append("AgentHealth: " + getAgentHealth() + ",");
        if (getAgentHealthCode() != null)
            sb.append("AgentHealthCode: " + getAgentHealthCode() + ",");
        if (getAgentHealthDetails() != null)
            sb.append("AgentHealthDetails: " + getAgentHealthDetails() + ",");
        if (getAutoScalingGroup() != null)
            sb.append("AutoScalingGroup: " + getAutoScalingGroup() + ",");
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getTelemetry() != null)
            sb.append("Telemetry: " + getTelemetry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Agent == false)
            return false;
        Agent other = (Agent) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null
                && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAssessmentArn() == null ^ this.getAssessmentArn() == null)
            return false;
        if (other.getAssessmentArn() != null
                && other.getAssessmentArn().equals(this.getAssessmentArn()) == false)
            return false;
        if (other.getAgentHealth() == null ^ this.getAgentHealth() == null)
            return false;
        if (other.getAgentHealth() != null
                && other.getAgentHealth().equals(this.getAgentHealth()) == false)
            return false;
        if (other.getAgentHealthCode() == null
                ^ this.getAgentHealthCode() == null)
            return false;
        if (other.getAgentHealthCode() != null
                && other.getAgentHealthCode().equals(this.getAgentHealthCode()) == false)
            return false;
        if (other.getAgentHealthDetails() == null
                ^ this.getAgentHealthDetails() == null)
            return false;
        if (other.getAgentHealthDetails() != null
                && other.getAgentHealthDetails().equals(
                        this.getAgentHealthDetails()) == false)
            return false;
        if (other.getAutoScalingGroup() == null
                ^ this.getAutoScalingGroup() == null)
            return false;
        if (other.getAutoScalingGroup() != null
                && other.getAutoScalingGroup().equals(
                        this.getAutoScalingGroup()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getTelemetry() == null ^ this.getTelemetry() == null)
            return false;
        if (other.getTelemetry() != null
                && other.getTelemetry().equals(this.getTelemetry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssessmentArn() == null) ? 0 : getAssessmentArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAgentHealth() == null) ? 0 : getAgentHealth().hashCode());
        hashCode = prime
                * hashCode
                + ((getAgentHealthCode() == null) ? 0 : getAgentHealthCode()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAgentHealthDetails() == null) ? 0
                        : getAgentHealthDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoScalingGroup() == null) ? 0 : getAutoScalingGroup()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getTelemetry() == null) ? 0 : getTelemetry().hashCode());
        return hashCode;
    }

    @Override
    public Agent clone() {
        try {
            return (Agent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}