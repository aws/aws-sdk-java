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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure of search criteria to be used to return contacts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifiers of agents who handled the contacts.
     * </p>
     */
    private java.util.List<String> agentIds;
    /**
     * <p>
     * The agent hierarchy groups of the agent at the time of handling the contact.
     * </p>
     */
    private AgentHierarchyGroups agentHierarchyGroups;
    /**
     * <p>
     * The list of channels associated with contacts.
     * </p>
     */
    private java.util.List<String> channels;
    /**
     * <p>
     * Search criteria based on analysis outputs from Amazon Connect Contact Lens.
     * </p>
     */
    private ContactAnalysis contactAnalysis;
    /**
     * <p>
     * The list of initiation methods associated with contacts.
     * </p>
     */
    private java.util.List<String> initiationMethods;
    /**
     * <p>
     * The list of queue IDs associated with contacts.
     * </p>
     */
    private java.util.List<String> queueIds;
    /**
     * <p>
     * The search criteria based on user-defined contact attributes that have been configured for contact search. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/search-custom-attributes.html">Search by customer
     * contact attributes</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * To use <code>SearchableContactAttributes</code> in a search request, the <code>GetContactAttributes</code> action
     * is required to perform an API request. For more information, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions-as-permissions"
     * >https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions
     * -as-permissions</a>Actions defined by Amazon Connect.
     * </p>
     * </important>
     */
    private SearchableContactAttributes searchableContactAttributes;

    /**
     * <p>
     * The identifiers of agents who handled the contacts.
     * </p>
     * 
     * @return The identifiers of agents who handled the contacts.
     */

    public java.util.List<String> getAgentIds() {
        return agentIds;
    }

    /**
     * <p>
     * The identifiers of agents who handled the contacts.
     * </p>
     * 
     * @param agentIds
     *        The identifiers of agents who handled the contacts.
     */

    public void setAgentIds(java.util.Collection<String> agentIds) {
        if (agentIds == null) {
            this.agentIds = null;
            return;
        }

        this.agentIds = new java.util.ArrayList<String>(agentIds);
    }

    /**
     * <p>
     * The identifiers of agents who handled the contacts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentIds(java.util.Collection)} or {@link #withAgentIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param agentIds
     *        The identifiers of agents who handled the contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCriteria withAgentIds(String... agentIds) {
        if (this.agentIds == null) {
            setAgentIds(new java.util.ArrayList<String>(agentIds.length));
        }
        for (String ele : agentIds) {
            this.agentIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of agents who handled the contacts.
     * </p>
     * 
     * @param agentIds
     *        The identifiers of agents who handled the contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCriteria withAgentIds(java.util.Collection<String> agentIds) {
        setAgentIds(agentIds);
        return this;
    }

    /**
     * <p>
     * The agent hierarchy groups of the agent at the time of handling the contact.
     * </p>
     * 
     * @param agentHierarchyGroups
     *        The agent hierarchy groups of the agent at the time of handling the contact.
     */

    public void setAgentHierarchyGroups(AgentHierarchyGroups agentHierarchyGroups) {
        this.agentHierarchyGroups = agentHierarchyGroups;
    }

    /**
     * <p>
     * The agent hierarchy groups of the agent at the time of handling the contact.
     * </p>
     * 
     * @return The agent hierarchy groups of the agent at the time of handling the contact.
     */

    public AgentHierarchyGroups getAgentHierarchyGroups() {
        return this.agentHierarchyGroups;
    }

    /**
     * <p>
     * The agent hierarchy groups of the agent at the time of handling the contact.
     * </p>
     * 
     * @param agentHierarchyGroups
     *        The agent hierarchy groups of the agent at the time of handling the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCriteria withAgentHierarchyGroups(AgentHierarchyGroups agentHierarchyGroups) {
        setAgentHierarchyGroups(agentHierarchyGroups);
        return this;
    }

    /**
     * <p>
     * The list of channels associated with contacts.
     * </p>
     * 
     * @return The list of channels associated with contacts.
     * @see Channel
     */

    public java.util.List<String> getChannels() {
        return channels;
    }

    /**
     * <p>
     * The list of channels associated with contacts.
     * </p>
     * 
     * @param channels
     *        The list of channels associated with contacts.
     * @see Channel
     */

    public void setChannels(java.util.Collection<String> channels) {
        if (channels == null) {
            this.channels = null;
            return;
        }

        this.channels = new java.util.ArrayList<String>(channels);
    }

    /**
     * <p>
     * The list of channels associated with contacts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannels(java.util.Collection)} or {@link #withChannels(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param channels
     *        The list of channels associated with contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public SearchCriteria withChannels(String... channels) {
        if (this.channels == null) {
            setChannels(new java.util.ArrayList<String>(channels.length));
        }
        for (String ele : channels) {
            this.channels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of channels associated with contacts.
     * </p>
     * 
     * @param channels
     *        The list of channels associated with contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public SearchCriteria withChannels(java.util.Collection<String> channels) {
        setChannels(channels);
        return this;
    }

    /**
     * <p>
     * The list of channels associated with contacts.
     * </p>
     * 
     * @param channels
     *        The list of channels associated with contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Channel
     */

    public SearchCriteria withChannels(Channel... channels) {
        java.util.ArrayList<String> channelsCopy = new java.util.ArrayList<String>(channels.length);
        for (Channel value : channels) {
            channelsCopy.add(value.toString());
        }
        if (getChannels() == null) {
            setChannels(channelsCopy);
        } else {
            getChannels().addAll(channelsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Search criteria based on analysis outputs from Amazon Connect Contact Lens.
     * </p>
     * 
     * @param contactAnalysis
     *        Search criteria based on analysis outputs from Amazon Connect Contact Lens.
     */

    public void setContactAnalysis(ContactAnalysis contactAnalysis) {
        this.contactAnalysis = contactAnalysis;
    }

    /**
     * <p>
     * Search criteria based on analysis outputs from Amazon Connect Contact Lens.
     * </p>
     * 
     * @return Search criteria based on analysis outputs from Amazon Connect Contact Lens.
     */

    public ContactAnalysis getContactAnalysis() {
        return this.contactAnalysis;
    }

    /**
     * <p>
     * Search criteria based on analysis outputs from Amazon Connect Contact Lens.
     * </p>
     * 
     * @param contactAnalysis
     *        Search criteria based on analysis outputs from Amazon Connect Contact Lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCriteria withContactAnalysis(ContactAnalysis contactAnalysis) {
        setContactAnalysis(contactAnalysis);
        return this;
    }

    /**
     * <p>
     * The list of initiation methods associated with contacts.
     * </p>
     * 
     * @return The list of initiation methods associated with contacts.
     * @see ContactInitiationMethod
     */

    public java.util.List<String> getInitiationMethods() {
        return initiationMethods;
    }

    /**
     * <p>
     * The list of initiation methods associated with contacts.
     * </p>
     * 
     * @param initiationMethods
     *        The list of initiation methods associated with contacts.
     * @see ContactInitiationMethod
     */

    public void setInitiationMethods(java.util.Collection<String> initiationMethods) {
        if (initiationMethods == null) {
            this.initiationMethods = null;
            return;
        }

        this.initiationMethods = new java.util.ArrayList<String>(initiationMethods);
    }

    /**
     * <p>
     * The list of initiation methods associated with contacts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInitiationMethods(java.util.Collection)} or {@link #withInitiationMethods(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param initiationMethods
     *        The list of initiation methods associated with contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactInitiationMethod
     */

    public SearchCriteria withInitiationMethods(String... initiationMethods) {
        if (this.initiationMethods == null) {
            setInitiationMethods(new java.util.ArrayList<String>(initiationMethods.length));
        }
        for (String ele : initiationMethods) {
            this.initiationMethods.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of initiation methods associated with contacts.
     * </p>
     * 
     * @param initiationMethods
     *        The list of initiation methods associated with contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactInitiationMethod
     */

    public SearchCriteria withInitiationMethods(java.util.Collection<String> initiationMethods) {
        setInitiationMethods(initiationMethods);
        return this;
    }

    /**
     * <p>
     * The list of initiation methods associated with contacts.
     * </p>
     * 
     * @param initiationMethods
     *        The list of initiation methods associated with contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactInitiationMethod
     */

    public SearchCriteria withInitiationMethods(ContactInitiationMethod... initiationMethods) {
        java.util.ArrayList<String> initiationMethodsCopy = new java.util.ArrayList<String>(initiationMethods.length);
        for (ContactInitiationMethod value : initiationMethods) {
            initiationMethodsCopy.add(value.toString());
        }
        if (getInitiationMethods() == null) {
            setInitiationMethods(initiationMethodsCopy);
        } else {
            getInitiationMethods().addAll(initiationMethodsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The list of queue IDs associated with contacts.
     * </p>
     * 
     * @return The list of queue IDs associated with contacts.
     */

    public java.util.List<String> getQueueIds() {
        return queueIds;
    }

    /**
     * <p>
     * The list of queue IDs associated with contacts.
     * </p>
     * 
     * @param queueIds
     *        The list of queue IDs associated with contacts.
     */

    public void setQueueIds(java.util.Collection<String> queueIds) {
        if (queueIds == null) {
            this.queueIds = null;
            return;
        }

        this.queueIds = new java.util.ArrayList<String>(queueIds);
    }

    /**
     * <p>
     * The list of queue IDs associated with contacts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueueIds(java.util.Collection)} or {@link #withQueueIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param queueIds
     *        The list of queue IDs associated with contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCriteria withQueueIds(String... queueIds) {
        if (this.queueIds == null) {
            setQueueIds(new java.util.ArrayList<String>(queueIds.length));
        }
        for (String ele : queueIds) {
            this.queueIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of queue IDs associated with contacts.
     * </p>
     * 
     * @param queueIds
     *        The list of queue IDs associated with contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCriteria withQueueIds(java.util.Collection<String> queueIds) {
        setQueueIds(queueIds);
        return this;
    }

    /**
     * <p>
     * The search criteria based on user-defined contact attributes that have been configured for contact search. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/search-custom-attributes.html">Search by customer
     * contact attributes</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * To use <code>SearchableContactAttributes</code> in a search request, the <code>GetContactAttributes</code> action
     * is required to perform an API request. For more information, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions-as-permissions"
     * >https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions
     * -as-permissions</a>Actions defined by Amazon Connect.
     * </p>
     * </important>
     * 
     * @param searchableContactAttributes
     *        The search criteria based on user-defined contact attributes that have been configured for contact search.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/search-custom-attributes.html">Search by
     *        customer contact attributes</a> in the <i>Amazon Connect Administrator Guide</i>.</p> <important>
     *        <p>
     *        To use <code>SearchableContactAttributes</code> in a search request, the <code>GetContactAttributes</code>
     *        action is required to perform an API request. For more information, see <a href=
     *        "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions-as-permissions"
     *        >https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-
     *        actions-as-permissions</a>Actions defined by Amazon Connect.
     *        </p>
     */

    public void setSearchableContactAttributes(SearchableContactAttributes searchableContactAttributes) {
        this.searchableContactAttributes = searchableContactAttributes;
    }

    /**
     * <p>
     * The search criteria based on user-defined contact attributes that have been configured for contact search. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/search-custom-attributes.html">Search by customer
     * contact attributes</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * To use <code>SearchableContactAttributes</code> in a search request, the <code>GetContactAttributes</code> action
     * is required to perform an API request. For more information, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions-as-permissions"
     * >https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions
     * -as-permissions</a>Actions defined by Amazon Connect.
     * </p>
     * </important>
     * 
     * @return The search criteria based on user-defined contact attributes that have been configured for contact
     *         search. For more information, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/search-custom-attributes.html">Search by
     *         customer contact attributes</a> in the <i>Amazon Connect Administrator Guide</i>.</p> <important>
     *         <p>
     *         To use <code>SearchableContactAttributes</code> in a search request, the
     *         <code>GetContactAttributes</code> action is required to perform an API request. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions-as-permissions"
     *         >https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect
     *         -actions-as-permissions</a>Actions defined by Amazon Connect.
     *         </p>
     */

    public SearchableContactAttributes getSearchableContactAttributes() {
        return this.searchableContactAttributes;
    }

    /**
     * <p>
     * The search criteria based on user-defined contact attributes that have been configured for contact search. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/search-custom-attributes.html">Search by customer
     * contact attributes</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <important>
     * <p>
     * To use <code>SearchableContactAttributes</code> in a search request, the <code>GetContactAttributes</code> action
     * is required to perform an API request. For more information, see <a href=
     * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions-as-permissions"
     * >https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions
     * -as-permissions</a>Actions defined by Amazon Connect.
     * </p>
     * </important>
     * 
     * @param searchableContactAttributes
     *        The search criteria based on user-defined contact attributes that have been configured for contact search.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/search-custom-attributes.html">Search by
     *        customer contact attributes</a> in the <i>Amazon Connect Administrator Guide</i>.</p> <important>
     *        <p>
     *        To use <code>SearchableContactAttributes</code> in a search request, the <code>GetContactAttributes</code>
     *        action is required to perform an API request. For more information, see <a href=
     *        "https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-actions-as-permissions"
     *        >https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonconnect.html#amazonconnect-
     *        actions-as-permissions</a>Actions defined by Amazon Connect.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchCriteria withSearchableContactAttributes(SearchableContactAttributes searchableContactAttributes) {
        setSearchableContactAttributes(searchableContactAttributes);
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
        if (getAgentIds() != null)
            sb.append("AgentIds: ").append(getAgentIds()).append(",");
        if (getAgentHierarchyGroups() != null)
            sb.append("AgentHierarchyGroups: ").append(getAgentHierarchyGroups()).append(",");
        if (getChannels() != null)
            sb.append("Channels: ").append(getChannels()).append(",");
        if (getContactAnalysis() != null)
            sb.append("ContactAnalysis: ").append(getContactAnalysis()).append(",");
        if (getInitiationMethods() != null)
            sb.append("InitiationMethods: ").append(getInitiationMethods()).append(",");
        if (getQueueIds() != null)
            sb.append("QueueIds: ").append(getQueueIds()).append(",");
        if (getSearchableContactAttributes() != null)
            sb.append("SearchableContactAttributes: ").append(getSearchableContactAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchCriteria == false)
            return false;
        SearchCriteria other = (SearchCriteria) obj;
        if (other.getAgentIds() == null ^ this.getAgentIds() == null)
            return false;
        if (other.getAgentIds() != null && other.getAgentIds().equals(this.getAgentIds()) == false)
            return false;
        if (other.getAgentHierarchyGroups() == null ^ this.getAgentHierarchyGroups() == null)
            return false;
        if (other.getAgentHierarchyGroups() != null && other.getAgentHierarchyGroups().equals(this.getAgentHierarchyGroups()) == false)
            return false;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        if (other.getContactAnalysis() == null ^ this.getContactAnalysis() == null)
            return false;
        if (other.getContactAnalysis() != null && other.getContactAnalysis().equals(this.getContactAnalysis()) == false)
            return false;
        if (other.getInitiationMethods() == null ^ this.getInitiationMethods() == null)
            return false;
        if (other.getInitiationMethods() != null && other.getInitiationMethods().equals(this.getInitiationMethods()) == false)
            return false;
        if (other.getQueueIds() == null ^ this.getQueueIds() == null)
            return false;
        if (other.getQueueIds() != null && other.getQueueIds().equals(this.getQueueIds()) == false)
            return false;
        if (other.getSearchableContactAttributes() == null ^ this.getSearchableContactAttributes() == null)
            return false;
        if (other.getSearchableContactAttributes() != null && other.getSearchableContactAttributes().equals(this.getSearchableContactAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentIds() == null) ? 0 : getAgentIds().hashCode());
        hashCode = prime * hashCode + ((getAgentHierarchyGroups() == null) ? 0 : getAgentHierarchyGroups().hashCode());
        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getContactAnalysis() == null) ? 0 : getContactAnalysis().hashCode());
        hashCode = prime * hashCode + ((getInitiationMethods() == null) ? 0 : getInitiationMethods().hashCode());
        hashCode = prime * hashCode + ((getQueueIds() == null) ? 0 : getQueueIds().hashCode());
        hashCode = prime * hashCode + ((getSearchableContactAttributes() == null) ? 0 : getSearchableContactAttributes().hashCode());
        return hashCode;
    }

    @Override
    public SearchCriteria clone() {
        try {
            return (SearchCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.SearchCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
