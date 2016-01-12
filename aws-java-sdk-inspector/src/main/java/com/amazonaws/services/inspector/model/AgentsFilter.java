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
 * This data type is used as a response element in the
 * <a>ListAssessmentAgents</a> action.
 * </p>
 */
public class AgentsFilter implements Serializable, Cloneable {

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>agentHealth</b>
     * property of the <a>Agent</a> data type.
     * </p>
     */
    private java.util.List<String> agentHealthList;

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>agentHealth</b>
     * property of the <a>Agent</a> data type.
     * </p>
     * 
     * @return For a record to match a filter, the value specified for this data
     *         type property must be the exact match of the value of the
     *         <b>agentHealth</b> property of the <a>Agent</a> data type.
     */
    public java.util.List<String> getAgentHealthList() {
        return agentHealthList;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>agentHealth</b>
     * property of the <a>Agent</a> data type.
     * </p>
     * 
     * @param agentHealthList
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>agentHealth</b> property of the <a>Agent</a> data type.
     */
    public void setAgentHealthList(java.util.Collection<String> agentHealthList) {
        if (agentHealthList == null) {
            this.agentHealthList = null;
            return;
        }

        this.agentHealthList = new java.util.ArrayList<String>(agentHealthList);
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>agentHealth</b>
     * property of the <a>Agent</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAgentHealthList(java.util.Collection)} or
     * {@link #withAgentHealthList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentHealthList
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>agentHealth</b> property of the <a>Agent</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AgentsFilter withAgentHealthList(String... agentHealthList) {
        if (this.agentHealthList == null) {
            setAgentHealthList(new java.util.ArrayList<String>(
                    agentHealthList.length));
        }
        for (String ele : agentHealthList) {
            this.agentHealthList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For a record to match a filter, the value specified for this data type
     * property must be the exact match of the value of the <b>agentHealth</b>
     * property of the <a>Agent</a> data type.
     * </p>
     * 
     * @param agentHealthList
     *        For a record to match a filter, the value specified for this data
     *        type property must be the exact match of the value of the
     *        <b>agentHealth</b> property of the <a>Agent</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AgentsFilter withAgentHealthList(
            java.util.Collection<String> agentHealthList) {
        setAgentHealthList(agentHealthList);
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
        if (getAgentHealthList() != null)
            sb.append("AgentHealthList: " + getAgentHealthList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentsFilter == false)
            return false;
        AgentsFilter other = (AgentsFilter) obj;
        if (other.getAgentHealthList() == null
                ^ this.getAgentHealthList() == null)
            return false;
        if (other.getAgentHealthList() != null
                && other.getAgentHealthList().equals(this.getAgentHealthList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAgentHealthList() == null) ? 0 : getAgentHealthList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public AgentsFilter clone() {
        try {
            return (AgentsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}