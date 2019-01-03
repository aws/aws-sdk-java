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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The compromised credentials risk configuration type.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CompromisedCredentialsRiskConfigurationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompromisedCredentialsRiskConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Perform the action for these events. The default is to perform all events if no event filter is specified.
     * </p>
     */
    private java.util.List<String> eventFilter;
    /**
     * <p>
     * The compromised credentials risk configuration actions.
     * </p>
     */
    private CompromisedCredentialsActionsType actions;

    /**
     * <p>
     * Perform the action for these events. The default is to perform all events if no event filter is specified.
     * </p>
     * 
     * @return Perform the action for these events. The default is to perform all events if no event filter is
     *         specified.
     * @see EventFilterType
     */

    public java.util.List<String> getEventFilter() {
        return eventFilter;
    }

    /**
     * <p>
     * Perform the action for these events. The default is to perform all events if no event filter is specified.
     * </p>
     * 
     * @param eventFilter
     *        Perform the action for these events. The default is to perform all events if no event filter is specified.
     * @see EventFilterType
     */

    public void setEventFilter(java.util.Collection<String> eventFilter) {
        if (eventFilter == null) {
            this.eventFilter = null;
            return;
        }

        this.eventFilter = new java.util.ArrayList<String>(eventFilter);
    }

    /**
     * <p>
     * Perform the action for these events. The default is to perform all events if no event filter is specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventFilter(java.util.Collection)} or {@link #withEventFilter(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventFilter
     *        Perform the action for these events. The default is to perform all events if no event filter is specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventFilterType
     */

    public CompromisedCredentialsRiskConfigurationType withEventFilter(String... eventFilter) {
        if (this.eventFilter == null) {
            setEventFilter(new java.util.ArrayList<String>(eventFilter.length));
        }
        for (String ele : eventFilter) {
            this.eventFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Perform the action for these events. The default is to perform all events if no event filter is specified.
     * </p>
     * 
     * @param eventFilter
     *        Perform the action for these events. The default is to perform all events if no event filter is specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventFilterType
     */

    public CompromisedCredentialsRiskConfigurationType withEventFilter(java.util.Collection<String> eventFilter) {
        setEventFilter(eventFilter);
        return this;
    }

    /**
     * <p>
     * Perform the action for these events. The default is to perform all events if no event filter is specified.
     * </p>
     * 
     * @param eventFilter
     *        Perform the action for these events. The default is to perform all events if no event filter is specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventFilterType
     */

    public CompromisedCredentialsRiskConfigurationType withEventFilter(EventFilterType... eventFilter) {
        java.util.ArrayList<String> eventFilterCopy = new java.util.ArrayList<String>(eventFilter.length);
        for (EventFilterType value : eventFilter) {
            eventFilterCopy.add(value.toString());
        }
        if (getEventFilter() == null) {
            setEventFilter(eventFilterCopy);
        } else {
            getEventFilter().addAll(eventFilterCopy);
        }
        return this;
    }

    /**
     * <p>
     * The compromised credentials risk configuration actions.
     * </p>
     * 
     * @param actions
     *        The compromised credentials risk configuration actions.
     */

    public void setActions(CompromisedCredentialsActionsType actions) {
        this.actions = actions;
    }

    /**
     * <p>
     * The compromised credentials risk configuration actions.
     * </p>
     * 
     * @return The compromised credentials risk configuration actions.
     */

    public CompromisedCredentialsActionsType getActions() {
        return this.actions;
    }

    /**
     * <p>
     * The compromised credentials risk configuration actions.
     * </p>
     * 
     * @param actions
     *        The compromised credentials risk configuration actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompromisedCredentialsRiskConfigurationType withActions(CompromisedCredentialsActionsType actions) {
        setActions(actions);
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
        if (getEventFilter() != null)
            sb.append("EventFilter: ").append(getEventFilter()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompromisedCredentialsRiskConfigurationType == false)
            return false;
        CompromisedCredentialsRiskConfigurationType other = (CompromisedCredentialsRiskConfigurationType) obj;
        if (other.getEventFilter() == null ^ this.getEventFilter() == null)
            return false;
        if (other.getEventFilter() != null && other.getEventFilter().equals(this.getEventFilter()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventFilter() == null) ? 0 : getEventFilter().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public CompromisedCredentialsRiskConfigurationType clone() {
        try {
            return (CompromisedCredentialsRiskConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.CompromisedCredentialsRiskConfigurationTypeMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
