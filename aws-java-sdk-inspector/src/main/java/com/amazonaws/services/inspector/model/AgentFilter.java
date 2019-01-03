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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an Amazon Inspector agent. This data type is used as a request parameter in the
 * <a>ListAssessmentRunAgents</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/AgentFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current health state of the agent. Values can be set to <b>HEALTHY</b> or <b>UNHEALTHY</b>.
     * </p>
     */
    private java.util.List<String> agentHealths;
    /**
     * <p>
     * The detailed health state of the agent. Values can be set to <b>IDLE</b>, <b>RUNNING</b>, <b>SHUTDOWN</b>,
     * <b>UNHEALTHY</b>, <b>THROTTLED</b>, and <b>UNKNOWN</b>.
     * </p>
     */
    private java.util.List<String> agentHealthCodes;

    /**
     * <p>
     * The current health state of the agent. Values can be set to <b>HEALTHY</b> or <b>UNHEALTHY</b>.
     * </p>
     * 
     * @return The current health state of the agent. Values can be set to <b>HEALTHY</b> or <b>UNHEALTHY</b>.
     * @see AgentHealth
     */

    public java.util.List<String> getAgentHealths() {
        return agentHealths;
    }

    /**
     * <p>
     * The current health state of the agent. Values can be set to <b>HEALTHY</b> or <b>UNHEALTHY</b>.
     * </p>
     * 
     * @param agentHealths
     *        The current health state of the agent. Values can be set to <b>HEALTHY</b> or <b>UNHEALTHY</b>.
     * @see AgentHealth
     */

    public void setAgentHealths(java.util.Collection<String> agentHealths) {
        if (agentHealths == null) {
            this.agentHealths = null;
            return;
        }

        this.agentHealths = new java.util.ArrayList<String>(agentHealths);
    }

    /**
     * <p>
     * The current health state of the agent. Values can be set to <b>HEALTHY</b> or <b>UNHEALTHY</b>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentHealths(java.util.Collection)} or {@link #withAgentHealths(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentHealths
     *        The current health state of the agent. Values can be set to <b>HEALTHY</b> or <b>UNHEALTHY</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentHealth
     */

    public AgentFilter withAgentHealths(String... agentHealths) {
        if (this.agentHealths == null) {
            setAgentHealths(new java.util.ArrayList<String>(agentHealths.length));
        }
        for (String ele : agentHealths) {
            this.agentHealths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The current health state of the agent. Values can be set to <b>HEALTHY</b> or <b>UNHEALTHY</b>.
     * </p>
     * 
     * @param agentHealths
     *        The current health state of the agent. Values can be set to <b>HEALTHY</b> or <b>UNHEALTHY</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentHealth
     */

    public AgentFilter withAgentHealths(java.util.Collection<String> agentHealths) {
        setAgentHealths(agentHealths);
        return this;
    }

    /**
     * <p>
     * The current health state of the agent. Values can be set to <b>HEALTHY</b> or <b>UNHEALTHY</b>.
     * </p>
     * 
     * @param agentHealths
     *        The current health state of the agent. Values can be set to <b>HEALTHY</b> or <b>UNHEALTHY</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentHealth
     */

    public AgentFilter withAgentHealths(AgentHealth... agentHealths) {
        java.util.ArrayList<String> agentHealthsCopy = new java.util.ArrayList<String>(agentHealths.length);
        for (AgentHealth value : agentHealths) {
            agentHealthsCopy.add(value.toString());
        }
        if (getAgentHealths() == null) {
            setAgentHealths(agentHealthsCopy);
        } else {
            getAgentHealths().addAll(agentHealthsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The detailed health state of the agent. Values can be set to <b>IDLE</b>, <b>RUNNING</b>, <b>SHUTDOWN</b>,
     * <b>UNHEALTHY</b>, <b>THROTTLED</b>, and <b>UNKNOWN</b>.
     * </p>
     * 
     * @return The detailed health state of the agent. Values can be set to <b>IDLE</b>, <b>RUNNING</b>,
     *         <b>SHUTDOWN</b>, <b>UNHEALTHY</b>, <b>THROTTLED</b>, and <b>UNKNOWN</b>.
     * @see AgentHealthCode
     */

    public java.util.List<String> getAgentHealthCodes() {
        return agentHealthCodes;
    }

    /**
     * <p>
     * The detailed health state of the agent. Values can be set to <b>IDLE</b>, <b>RUNNING</b>, <b>SHUTDOWN</b>,
     * <b>UNHEALTHY</b>, <b>THROTTLED</b>, and <b>UNKNOWN</b>.
     * </p>
     * 
     * @param agentHealthCodes
     *        The detailed health state of the agent. Values can be set to <b>IDLE</b>, <b>RUNNING</b>, <b>SHUTDOWN</b>,
     *        <b>UNHEALTHY</b>, <b>THROTTLED</b>, and <b>UNKNOWN</b>.
     * @see AgentHealthCode
     */

    public void setAgentHealthCodes(java.util.Collection<String> agentHealthCodes) {
        if (agentHealthCodes == null) {
            this.agentHealthCodes = null;
            return;
        }

        this.agentHealthCodes = new java.util.ArrayList<String>(agentHealthCodes);
    }

    /**
     * <p>
     * The detailed health state of the agent. Values can be set to <b>IDLE</b>, <b>RUNNING</b>, <b>SHUTDOWN</b>,
     * <b>UNHEALTHY</b>, <b>THROTTLED</b>, and <b>UNKNOWN</b>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentHealthCodes(java.util.Collection)} or {@link #withAgentHealthCodes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param agentHealthCodes
     *        The detailed health state of the agent. Values can be set to <b>IDLE</b>, <b>RUNNING</b>, <b>SHUTDOWN</b>,
     *        <b>UNHEALTHY</b>, <b>THROTTLED</b>, and <b>UNKNOWN</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentHealthCode
     */

    public AgentFilter withAgentHealthCodes(String... agentHealthCodes) {
        if (this.agentHealthCodes == null) {
            setAgentHealthCodes(new java.util.ArrayList<String>(agentHealthCodes.length));
        }
        for (String ele : agentHealthCodes) {
            this.agentHealthCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The detailed health state of the agent. Values can be set to <b>IDLE</b>, <b>RUNNING</b>, <b>SHUTDOWN</b>,
     * <b>UNHEALTHY</b>, <b>THROTTLED</b>, and <b>UNKNOWN</b>.
     * </p>
     * 
     * @param agentHealthCodes
     *        The detailed health state of the agent. Values can be set to <b>IDLE</b>, <b>RUNNING</b>, <b>SHUTDOWN</b>,
     *        <b>UNHEALTHY</b>, <b>THROTTLED</b>, and <b>UNKNOWN</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentHealthCode
     */

    public AgentFilter withAgentHealthCodes(java.util.Collection<String> agentHealthCodes) {
        setAgentHealthCodes(agentHealthCodes);
        return this;
    }

    /**
     * <p>
     * The detailed health state of the agent. Values can be set to <b>IDLE</b>, <b>RUNNING</b>, <b>SHUTDOWN</b>,
     * <b>UNHEALTHY</b>, <b>THROTTLED</b>, and <b>UNKNOWN</b>.
     * </p>
     * 
     * @param agentHealthCodes
     *        The detailed health state of the agent. Values can be set to <b>IDLE</b>, <b>RUNNING</b>, <b>SHUTDOWN</b>,
     *        <b>UNHEALTHY</b>, <b>THROTTLED</b>, and <b>UNKNOWN</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentHealthCode
     */

    public AgentFilter withAgentHealthCodes(AgentHealthCode... agentHealthCodes) {
        java.util.ArrayList<String> agentHealthCodesCopy = new java.util.ArrayList<String>(agentHealthCodes.length);
        for (AgentHealthCode value : agentHealthCodes) {
            agentHealthCodesCopy.add(value.toString());
        }
        if (getAgentHealthCodes() == null) {
            setAgentHealthCodes(agentHealthCodesCopy);
        } else {
            getAgentHealthCodes().addAll(agentHealthCodesCopy);
        }
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
        if (getAgentHealths() != null)
            sb.append("AgentHealths: ").append(getAgentHealths()).append(",");
        if (getAgentHealthCodes() != null)
            sb.append("AgentHealthCodes: ").append(getAgentHealthCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentFilter == false)
            return false;
        AgentFilter other = (AgentFilter) obj;
        if (other.getAgentHealths() == null ^ this.getAgentHealths() == null)
            return false;
        if (other.getAgentHealths() != null && other.getAgentHealths().equals(this.getAgentHealths()) == false)
            return false;
        if (other.getAgentHealthCodes() == null ^ this.getAgentHealthCodes() == null)
            return false;
        if (other.getAgentHealthCodes() != null && other.getAgentHealthCodes().equals(this.getAgentHealthCodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentHealths() == null) ? 0 : getAgentHealths().hashCode());
        hashCode = prime * hashCode + ((getAgentHealthCodes() == null) ? 0 : getAgentHealthCodes().hashCode());
        return hashCode;
    }

    @Override
    public AgentFilter clone() {
        try {
            return (AgentFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.AgentFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
