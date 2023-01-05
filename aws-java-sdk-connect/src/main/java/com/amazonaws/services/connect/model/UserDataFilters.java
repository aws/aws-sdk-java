/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter for the user data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UserDataFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserDataFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of up to 100 queues or ARNs.
     * </p>
     */
    private java.util.List<String> queues;
    /**
     * <p>
     * A filter for the user data based on the contact information that is associated to the user. It contains a list of
     * contact states.
     * </p>
     */
    private ContactFilter contactFilter;
    /**
     * <p>
     * A list of up to 100 routing profile IDs or ARNs.
     * </p>
     */
    private java.util.List<String> routingProfiles;
    /**
     * <p>
     * A list of up to 100 agent IDs or ARNs.
     * </p>
     */
    private java.util.List<String> agents;
    /**
     * <p>
     * A UserHierarchyGroup ID or ARN.
     * </p>
     */
    private java.util.List<String> userHierarchyGroups;

    /**
     * <p>
     * A list of up to 100 queues or ARNs.
     * </p>
     * 
     * @return A list of up to 100 queues or ARNs.
     */

    public java.util.List<String> getQueues() {
        return queues;
    }

    /**
     * <p>
     * A list of up to 100 queues or ARNs.
     * </p>
     * 
     * @param queues
     *        A list of up to 100 queues or ARNs.
     */

    public void setQueues(java.util.Collection<String> queues) {
        if (queues == null) {
            this.queues = null;
            return;
        }

        this.queues = new java.util.ArrayList<String>(queues);
    }

    /**
     * <p>
     * A list of up to 100 queues or ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueues(java.util.Collection)} or {@link #withQueues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param queues
     *        A list of up to 100 queues or ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDataFilters withQueues(String... queues) {
        if (this.queues == null) {
            setQueues(new java.util.ArrayList<String>(queues.length));
        }
        for (String ele : queues) {
            this.queues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 100 queues or ARNs.
     * </p>
     * 
     * @param queues
     *        A list of up to 100 queues or ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDataFilters withQueues(java.util.Collection<String> queues) {
        setQueues(queues);
        return this;
    }

    /**
     * <p>
     * A filter for the user data based on the contact information that is associated to the user. It contains a list of
     * contact states.
     * </p>
     * 
     * @param contactFilter
     *        A filter for the user data based on the contact information that is associated to the user. It contains a
     *        list of contact states.
     */

    public void setContactFilter(ContactFilter contactFilter) {
        this.contactFilter = contactFilter;
    }

    /**
     * <p>
     * A filter for the user data based on the contact information that is associated to the user. It contains a list of
     * contact states.
     * </p>
     * 
     * @return A filter for the user data based on the contact information that is associated to the user. It contains a
     *         list of contact states.
     */

    public ContactFilter getContactFilter() {
        return this.contactFilter;
    }

    /**
     * <p>
     * A filter for the user data based on the contact information that is associated to the user. It contains a list of
     * contact states.
     * </p>
     * 
     * @param contactFilter
     *        A filter for the user data based on the contact information that is associated to the user. It contains a
     *        list of contact states.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDataFilters withContactFilter(ContactFilter contactFilter) {
        setContactFilter(contactFilter);
        return this;
    }

    /**
     * <p>
     * A list of up to 100 routing profile IDs or ARNs.
     * </p>
     * 
     * @return A list of up to 100 routing profile IDs or ARNs.
     */

    public java.util.List<String> getRoutingProfiles() {
        return routingProfiles;
    }

    /**
     * <p>
     * A list of up to 100 routing profile IDs or ARNs.
     * </p>
     * 
     * @param routingProfiles
     *        A list of up to 100 routing profile IDs or ARNs.
     */

    public void setRoutingProfiles(java.util.Collection<String> routingProfiles) {
        if (routingProfiles == null) {
            this.routingProfiles = null;
            return;
        }

        this.routingProfiles = new java.util.ArrayList<String>(routingProfiles);
    }

    /**
     * <p>
     * A list of up to 100 routing profile IDs or ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutingProfiles(java.util.Collection)} or {@link #withRoutingProfiles(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param routingProfiles
     *        A list of up to 100 routing profile IDs or ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDataFilters withRoutingProfiles(String... routingProfiles) {
        if (this.routingProfiles == null) {
            setRoutingProfiles(new java.util.ArrayList<String>(routingProfiles.length));
        }
        for (String ele : routingProfiles) {
            this.routingProfiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 100 routing profile IDs or ARNs.
     * </p>
     * 
     * @param routingProfiles
     *        A list of up to 100 routing profile IDs or ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDataFilters withRoutingProfiles(java.util.Collection<String> routingProfiles) {
        setRoutingProfiles(routingProfiles);
        return this;
    }

    /**
     * <p>
     * A list of up to 100 agent IDs or ARNs.
     * </p>
     * 
     * @return A list of up to 100 agent IDs or ARNs.
     */

    public java.util.List<String> getAgents() {
        return agents;
    }

    /**
     * <p>
     * A list of up to 100 agent IDs or ARNs.
     * </p>
     * 
     * @param agents
     *        A list of up to 100 agent IDs or ARNs.
     */

    public void setAgents(java.util.Collection<String> agents) {
        if (agents == null) {
            this.agents = null;
            return;
        }

        this.agents = new java.util.ArrayList<String>(agents);
    }

    /**
     * <p>
     * A list of up to 100 agent IDs or ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgents(java.util.Collection)} or {@link #withAgents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param agents
     *        A list of up to 100 agent IDs or ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDataFilters withAgents(String... agents) {
        if (this.agents == null) {
            setAgents(new java.util.ArrayList<String>(agents.length));
        }
        for (String ele : agents) {
            this.agents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 100 agent IDs or ARNs.
     * </p>
     * 
     * @param agents
     *        A list of up to 100 agent IDs or ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDataFilters withAgents(java.util.Collection<String> agents) {
        setAgents(agents);
        return this;
    }

    /**
     * <p>
     * A UserHierarchyGroup ID or ARN.
     * </p>
     * 
     * @return A UserHierarchyGroup ID or ARN.
     */

    public java.util.List<String> getUserHierarchyGroups() {
        return userHierarchyGroups;
    }

    /**
     * <p>
     * A UserHierarchyGroup ID or ARN.
     * </p>
     * 
     * @param userHierarchyGroups
     *        A UserHierarchyGroup ID or ARN.
     */

    public void setUserHierarchyGroups(java.util.Collection<String> userHierarchyGroups) {
        if (userHierarchyGroups == null) {
            this.userHierarchyGroups = null;
            return;
        }

        this.userHierarchyGroups = new java.util.ArrayList<String>(userHierarchyGroups);
    }

    /**
     * <p>
     * A UserHierarchyGroup ID or ARN.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserHierarchyGroups(java.util.Collection)} or {@link #withUserHierarchyGroups(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param userHierarchyGroups
     *        A UserHierarchyGroup ID or ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDataFilters withUserHierarchyGroups(String... userHierarchyGroups) {
        if (this.userHierarchyGroups == null) {
            setUserHierarchyGroups(new java.util.ArrayList<String>(userHierarchyGroups.length));
        }
        for (String ele : userHierarchyGroups) {
            this.userHierarchyGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A UserHierarchyGroup ID or ARN.
     * </p>
     * 
     * @param userHierarchyGroups
     *        A UserHierarchyGroup ID or ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDataFilters withUserHierarchyGroups(java.util.Collection<String> userHierarchyGroups) {
        setUserHierarchyGroups(userHierarchyGroups);
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
        if (getQueues() != null)
            sb.append("Queues: ").append(getQueues()).append(",");
        if (getContactFilter() != null)
            sb.append("ContactFilter: ").append(getContactFilter()).append(",");
        if (getRoutingProfiles() != null)
            sb.append("RoutingProfiles: ").append(getRoutingProfiles()).append(",");
        if (getAgents() != null)
            sb.append("Agents: ").append(getAgents()).append(",");
        if (getUserHierarchyGroups() != null)
            sb.append("UserHierarchyGroups: ").append(getUserHierarchyGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserDataFilters == false)
            return false;
        UserDataFilters other = (UserDataFilters) obj;
        if (other.getQueues() == null ^ this.getQueues() == null)
            return false;
        if (other.getQueues() != null && other.getQueues().equals(this.getQueues()) == false)
            return false;
        if (other.getContactFilter() == null ^ this.getContactFilter() == null)
            return false;
        if (other.getContactFilter() != null && other.getContactFilter().equals(this.getContactFilter()) == false)
            return false;
        if (other.getRoutingProfiles() == null ^ this.getRoutingProfiles() == null)
            return false;
        if (other.getRoutingProfiles() != null && other.getRoutingProfiles().equals(this.getRoutingProfiles()) == false)
            return false;
        if (other.getAgents() == null ^ this.getAgents() == null)
            return false;
        if (other.getAgents() != null && other.getAgents().equals(this.getAgents()) == false)
            return false;
        if (other.getUserHierarchyGroups() == null ^ this.getUserHierarchyGroups() == null)
            return false;
        if (other.getUserHierarchyGroups() != null && other.getUserHierarchyGroups().equals(this.getUserHierarchyGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueues() == null) ? 0 : getQueues().hashCode());
        hashCode = prime * hashCode + ((getContactFilter() == null) ? 0 : getContactFilter().hashCode());
        hashCode = prime * hashCode + ((getRoutingProfiles() == null) ? 0 : getRoutingProfiles().hashCode());
        hashCode = prime * hashCode + ((getAgents() == null) ? 0 : getAgents().hashCode());
        hashCode = prime * hashCode + ((getUserHierarchyGroups() == null) ? 0 : getUserHierarchyGroups().hashCode());
        return hashCode;
    }

    @Override
    public UserDataFilters clone() {
        try {
            return (UserDataFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.UserDataFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
