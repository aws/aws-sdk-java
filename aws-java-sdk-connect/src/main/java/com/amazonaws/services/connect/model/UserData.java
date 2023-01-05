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
 * Data for a user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UserData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the user for the data that is returned. It contains the <code>resourceId</code> and ARN of the
     * user.
     * </p>
     */
    private UserReference user;
    /**
     * <p>
     * Information about the routing profile that is assigned to the user.
     * </p>
     */
    private RoutingProfileReference routingProfile;
    /**
     * <p>
     * Contains information about the levels of a hierarchy group assigned to a user.
     * </p>
     */
    private HierarchyPathReference hierarchyPath;
    /**
     * <p>
     * The status of the agent that they manually set in their Contact Control Panel (CCP), or that the supervisor
     * manually changes in the real-time metrics report.
     * </p>
     */
    private AgentStatusReference status;
    /**
     * <p>
     * A map of available slots by channel. The key is a channel name. The value is an integer: the available number of
     * slots.
     * </p>
     */
    private java.util.Map<String, Integer> availableSlotsByChannel;
    /**
     * <p>
     * A map of maximum slots by channel. The key is a channel name. The value is an integer: the maximum number of
     * slots. This is calculated from <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_MediaConcurrency.html">MediaConcurrency</a> of
     * the <code>RoutingProfile</code> assigned to the agent.
     * </p>
     */
    private java.util.Map<String, Integer> maxSlotsByChannel;
    /**
     * <p>
     * A map of active slots by channel. The key is a channel name. The value is an integer: the number of active slots.
     * </p>
     */
    private java.util.Map<String, Integer> activeSlotsByChannel;
    /**
     * <p>
     * A list of contact reference information.
     * </p>
     */
    private java.util.List<AgentContactReference> contacts;
    /**
     * <p>
     * The Next status of the agent.
     * </p>
     */
    private String nextStatus;

    /**
     * <p>
     * Information about the user for the data that is returned. It contains the <code>resourceId</code> and ARN of the
     * user.
     * </p>
     * 
     * @param user
     *        Information about the user for the data that is returned. It contains the <code>resourceId</code> and ARN
     *        of the user.
     */

    public void setUser(UserReference user) {
        this.user = user;
    }

    /**
     * <p>
     * Information about the user for the data that is returned. It contains the <code>resourceId</code> and ARN of the
     * user.
     * </p>
     * 
     * @return Information about the user for the data that is returned. It contains the <code>resourceId</code> and ARN
     *         of the user.
     */

    public UserReference getUser() {
        return this.user;
    }

    /**
     * <p>
     * Information about the user for the data that is returned. It contains the <code>resourceId</code> and ARN of the
     * user.
     * </p>
     * 
     * @param user
     *        Information about the user for the data that is returned. It contains the <code>resourceId</code> and ARN
     *        of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData withUser(UserReference user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * Information about the routing profile that is assigned to the user.
     * </p>
     * 
     * @param routingProfile
     *        Information about the routing profile that is assigned to the user.
     */

    public void setRoutingProfile(RoutingProfileReference routingProfile) {
        this.routingProfile = routingProfile;
    }

    /**
     * <p>
     * Information about the routing profile that is assigned to the user.
     * </p>
     * 
     * @return Information about the routing profile that is assigned to the user.
     */

    public RoutingProfileReference getRoutingProfile() {
        return this.routingProfile;
    }

    /**
     * <p>
     * Information about the routing profile that is assigned to the user.
     * </p>
     * 
     * @param routingProfile
     *        Information about the routing profile that is assigned to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData withRoutingProfile(RoutingProfileReference routingProfile) {
        setRoutingProfile(routingProfile);
        return this;
    }

    /**
     * <p>
     * Contains information about the levels of a hierarchy group assigned to a user.
     * </p>
     * 
     * @param hierarchyPath
     *        Contains information about the levels of a hierarchy group assigned to a user.
     */

    public void setHierarchyPath(HierarchyPathReference hierarchyPath) {
        this.hierarchyPath = hierarchyPath;
    }

    /**
     * <p>
     * Contains information about the levels of a hierarchy group assigned to a user.
     * </p>
     * 
     * @return Contains information about the levels of a hierarchy group assigned to a user.
     */

    public HierarchyPathReference getHierarchyPath() {
        return this.hierarchyPath;
    }

    /**
     * <p>
     * Contains information about the levels of a hierarchy group assigned to a user.
     * </p>
     * 
     * @param hierarchyPath
     *        Contains information about the levels of a hierarchy group assigned to a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData withHierarchyPath(HierarchyPathReference hierarchyPath) {
        setHierarchyPath(hierarchyPath);
        return this;
    }

    /**
     * <p>
     * The status of the agent that they manually set in their Contact Control Panel (CCP), or that the supervisor
     * manually changes in the real-time metrics report.
     * </p>
     * 
     * @param status
     *        The status of the agent that they manually set in their Contact Control Panel (CCP), or that the
     *        supervisor manually changes in the real-time metrics report.
     */

    public void setStatus(AgentStatusReference status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the agent that they manually set in their Contact Control Panel (CCP), or that the supervisor
     * manually changes in the real-time metrics report.
     * </p>
     * 
     * @return The status of the agent that they manually set in their Contact Control Panel (CCP), or that the
     *         supervisor manually changes in the real-time metrics report.
     */

    public AgentStatusReference getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the agent that they manually set in their Contact Control Panel (CCP), or that the supervisor
     * manually changes in the real-time metrics report.
     * </p>
     * 
     * @param status
     *        The status of the agent that they manually set in their Contact Control Panel (CCP), or that the
     *        supervisor manually changes in the real-time metrics report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData withStatus(AgentStatusReference status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A map of available slots by channel. The key is a channel name. The value is an integer: the available number of
     * slots.
     * </p>
     * 
     * @return A map of available slots by channel. The key is a channel name. The value is an integer: the available
     *         number of slots.
     */

    public java.util.Map<String, Integer> getAvailableSlotsByChannel() {
        return availableSlotsByChannel;
    }

    /**
     * <p>
     * A map of available slots by channel. The key is a channel name. The value is an integer: the available number of
     * slots.
     * </p>
     * 
     * @param availableSlotsByChannel
     *        A map of available slots by channel. The key is a channel name. The value is an integer: the available
     *        number of slots.
     */

    public void setAvailableSlotsByChannel(java.util.Map<String, Integer> availableSlotsByChannel) {
        this.availableSlotsByChannel = availableSlotsByChannel;
    }

    /**
     * <p>
     * A map of available slots by channel. The key is a channel name. The value is an integer: the available number of
     * slots.
     * </p>
     * 
     * @param availableSlotsByChannel
     *        A map of available slots by channel. The key is a channel name. The value is an integer: the available
     *        number of slots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData withAvailableSlotsByChannel(java.util.Map<String, Integer> availableSlotsByChannel) {
        setAvailableSlotsByChannel(availableSlotsByChannel);
        return this;
    }

    /**
     * Add a single AvailableSlotsByChannel entry
     *
     * @see UserData#withAvailableSlotsByChannel
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UserData addAvailableSlotsByChannelEntry(String key, Integer value) {
        if (null == this.availableSlotsByChannel) {
            this.availableSlotsByChannel = new java.util.HashMap<String, Integer>();
        }
        if (this.availableSlotsByChannel.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.availableSlotsByChannel.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AvailableSlotsByChannel.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData clearAvailableSlotsByChannelEntries() {
        this.availableSlotsByChannel = null;
        return this;
    }

    /**
     * <p>
     * A map of maximum slots by channel. The key is a channel name. The value is an integer: the maximum number of
     * slots. This is calculated from <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_MediaConcurrency.html">MediaConcurrency</a> of
     * the <code>RoutingProfile</code> assigned to the agent.
     * </p>
     * 
     * @return A map of maximum slots by channel. The key is a channel name. The value is an integer: the maximum number
     *         of slots. This is calculated from <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_MediaConcurrency.html"
     *         >MediaConcurrency</a> of the <code>RoutingProfile</code> assigned to the agent.
     */

    public java.util.Map<String, Integer> getMaxSlotsByChannel() {
        return maxSlotsByChannel;
    }

    /**
     * <p>
     * A map of maximum slots by channel. The key is a channel name. The value is an integer: the maximum number of
     * slots. This is calculated from <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_MediaConcurrency.html">MediaConcurrency</a> of
     * the <code>RoutingProfile</code> assigned to the agent.
     * </p>
     * 
     * @param maxSlotsByChannel
     *        A map of maximum slots by channel. The key is a channel name. The value is an integer: the maximum number
     *        of slots. This is calculated from <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_MediaConcurrency.html"
     *        >MediaConcurrency</a> of the <code>RoutingProfile</code> assigned to the agent.
     */

    public void setMaxSlotsByChannel(java.util.Map<String, Integer> maxSlotsByChannel) {
        this.maxSlotsByChannel = maxSlotsByChannel;
    }

    /**
     * <p>
     * A map of maximum slots by channel. The key is a channel name. The value is an integer: the maximum number of
     * slots. This is calculated from <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_MediaConcurrency.html">MediaConcurrency</a> of
     * the <code>RoutingProfile</code> assigned to the agent.
     * </p>
     * 
     * @param maxSlotsByChannel
     *        A map of maximum slots by channel. The key is a channel name. The value is an integer: the maximum number
     *        of slots. This is calculated from <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_MediaConcurrency.html"
     *        >MediaConcurrency</a> of the <code>RoutingProfile</code> assigned to the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData withMaxSlotsByChannel(java.util.Map<String, Integer> maxSlotsByChannel) {
        setMaxSlotsByChannel(maxSlotsByChannel);
        return this;
    }

    /**
     * Add a single MaxSlotsByChannel entry
     *
     * @see UserData#withMaxSlotsByChannel
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UserData addMaxSlotsByChannelEntry(String key, Integer value) {
        if (null == this.maxSlotsByChannel) {
            this.maxSlotsByChannel = new java.util.HashMap<String, Integer>();
        }
        if (this.maxSlotsByChannel.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.maxSlotsByChannel.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MaxSlotsByChannel.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData clearMaxSlotsByChannelEntries() {
        this.maxSlotsByChannel = null;
        return this;
    }

    /**
     * <p>
     * A map of active slots by channel. The key is a channel name. The value is an integer: the number of active slots.
     * </p>
     * 
     * @return A map of active slots by channel. The key is a channel name. The value is an integer: the number of
     *         active slots.
     */

    public java.util.Map<String, Integer> getActiveSlotsByChannel() {
        return activeSlotsByChannel;
    }

    /**
     * <p>
     * A map of active slots by channel. The key is a channel name. The value is an integer: the number of active slots.
     * </p>
     * 
     * @param activeSlotsByChannel
     *        A map of active slots by channel. The key is a channel name. The value is an integer: the number of active
     *        slots.
     */

    public void setActiveSlotsByChannel(java.util.Map<String, Integer> activeSlotsByChannel) {
        this.activeSlotsByChannel = activeSlotsByChannel;
    }

    /**
     * <p>
     * A map of active slots by channel. The key is a channel name. The value is an integer: the number of active slots.
     * </p>
     * 
     * @param activeSlotsByChannel
     *        A map of active slots by channel. The key is a channel name. The value is an integer: the number of active
     *        slots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData withActiveSlotsByChannel(java.util.Map<String, Integer> activeSlotsByChannel) {
        setActiveSlotsByChannel(activeSlotsByChannel);
        return this;
    }

    /**
     * Add a single ActiveSlotsByChannel entry
     *
     * @see UserData#withActiveSlotsByChannel
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UserData addActiveSlotsByChannelEntry(String key, Integer value) {
        if (null == this.activeSlotsByChannel) {
            this.activeSlotsByChannel = new java.util.HashMap<String, Integer>();
        }
        if (this.activeSlotsByChannel.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.activeSlotsByChannel.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ActiveSlotsByChannel.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData clearActiveSlotsByChannelEntries() {
        this.activeSlotsByChannel = null;
        return this;
    }

    /**
     * <p>
     * A list of contact reference information.
     * </p>
     * 
     * @return A list of contact reference information.
     */

    public java.util.List<AgentContactReference> getContacts() {
        return contacts;
    }

    /**
     * <p>
     * A list of contact reference information.
     * </p>
     * 
     * @param contacts
     *        A list of contact reference information.
     */

    public void setContacts(java.util.Collection<AgentContactReference> contacts) {
        if (contacts == null) {
            this.contacts = null;
            return;
        }

        this.contacts = new java.util.ArrayList<AgentContactReference>(contacts);
    }

    /**
     * <p>
     * A list of contact reference information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContacts(java.util.Collection)} or {@link #withContacts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param contacts
     *        A list of contact reference information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData withContacts(AgentContactReference... contacts) {
        if (this.contacts == null) {
            setContacts(new java.util.ArrayList<AgentContactReference>(contacts.length));
        }
        for (AgentContactReference ele : contacts) {
            this.contacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of contact reference information.
     * </p>
     * 
     * @param contacts
     *        A list of contact reference information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData withContacts(java.util.Collection<AgentContactReference> contacts) {
        setContacts(contacts);
        return this;
    }

    /**
     * <p>
     * The Next status of the agent.
     * </p>
     * 
     * @param nextStatus
     *        The Next status of the agent.
     */

    public void setNextStatus(String nextStatus) {
        this.nextStatus = nextStatus;
    }

    /**
     * <p>
     * The Next status of the agent.
     * </p>
     * 
     * @return The Next status of the agent.
     */

    public String getNextStatus() {
        return this.nextStatus;
    }

    /**
     * <p>
     * The Next status of the agent.
     * </p>
     * 
     * @param nextStatus
     *        The Next status of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserData withNextStatus(String nextStatus) {
        setNextStatus(nextStatus);
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
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getRoutingProfile() != null)
            sb.append("RoutingProfile: ").append(getRoutingProfile()).append(",");
        if (getHierarchyPath() != null)
            sb.append("HierarchyPath: ").append(getHierarchyPath()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAvailableSlotsByChannel() != null)
            sb.append("AvailableSlotsByChannel: ").append(getAvailableSlotsByChannel()).append(",");
        if (getMaxSlotsByChannel() != null)
            sb.append("MaxSlotsByChannel: ").append(getMaxSlotsByChannel()).append(",");
        if (getActiveSlotsByChannel() != null)
            sb.append("ActiveSlotsByChannel: ").append(getActiveSlotsByChannel()).append(",");
        if (getContacts() != null)
            sb.append("Contacts: ").append(getContacts()).append(",");
        if (getNextStatus() != null)
            sb.append("NextStatus: ").append(getNextStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserData == false)
            return false;
        UserData other = (UserData) obj;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getRoutingProfile() == null ^ this.getRoutingProfile() == null)
            return false;
        if (other.getRoutingProfile() != null && other.getRoutingProfile().equals(this.getRoutingProfile()) == false)
            return false;
        if (other.getHierarchyPath() == null ^ this.getHierarchyPath() == null)
            return false;
        if (other.getHierarchyPath() != null && other.getHierarchyPath().equals(this.getHierarchyPath()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAvailableSlotsByChannel() == null ^ this.getAvailableSlotsByChannel() == null)
            return false;
        if (other.getAvailableSlotsByChannel() != null && other.getAvailableSlotsByChannel().equals(this.getAvailableSlotsByChannel()) == false)
            return false;
        if (other.getMaxSlotsByChannel() == null ^ this.getMaxSlotsByChannel() == null)
            return false;
        if (other.getMaxSlotsByChannel() != null && other.getMaxSlotsByChannel().equals(this.getMaxSlotsByChannel()) == false)
            return false;
        if (other.getActiveSlotsByChannel() == null ^ this.getActiveSlotsByChannel() == null)
            return false;
        if (other.getActiveSlotsByChannel() != null && other.getActiveSlotsByChannel().equals(this.getActiveSlotsByChannel()) == false)
            return false;
        if (other.getContacts() == null ^ this.getContacts() == null)
            return false;
        if (other.getContacts() != null && other.getContacts().equals(this.getContacts()) == false)
            return false;
        if (other.getNextStatus() == null ^ this.getNextStatus() == null)
            return false;
        if (other.getNextStatus() != null && other.getNextStatus().equals(this.getNextStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getRoutingProfile() == null) ? 0 : getRoutingProfile().hashCode());
        hashCode = prime * hashCode + ((getHierarchyPath() == null) ? 0 : getHierarchyPath().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAvailableSlotsByChannel() == null) ? 0 : getAvailableSlotsByChannel().hashCode());
        hashCode = prime * hashCode + ((getMaxSlotsByChannel() == null) ? 0 : getMaxSlotsByChannel().hashCode());
        hashCode = prime * hashCode + ((getActiveSlotsByChannel() == null) ? 0 : getActiveSlotsByChannel().hashCode());
        hashCode = prime * hashCode + ((getContacts() == null) ? 0 : getContacts().hashCode());
        hashCode = prime * hashCode + ((getNextStatus() == null) ? 0 : getNextStatus().hashCode());
        return hashCode;
    }

    @Override
    public UserData clone() {
        try {
            return (UserData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.UserDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
