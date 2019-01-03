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
 * The compromised credentials actions type
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CompromisedCredentialsActionsType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompromisedCredentialsActionsType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The event action.
     * </p>
     */
    private String eventAction;

    /**
     * <p>
     * The event action.
     * </p>
     * 
     * @param eventAction
     *        The event action.
     * @see CompromisedCredentialsEventActionType
     */

    public void setEventAction(String eventAction) {
        this.eventAction = eventAction;
    }

    /**
     * <p>
     * The event action.
     * </p>
     * 
     * @return The event action.
     * @see CompromisedCredentialsEventActionType
     */

    public String getEventAction() {
        return this.eventAction;
    }

    /**
     * <p>
     * The event action.
     * </p>
     * 
     * @param eventAction
     *        The event action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompromisedCredentialsEventActionType
     */

    public CompromisedCredentialsActionsType withEventAction(String eventAction) {
        setEventAction(eventAction);
        return this;
    }

    /**
     * <p>
     * The event action.
     * </p>
     * 
     * @param eventAction
     *        The event action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompromisedCredentialsEventActionType
     */

    public CompromisedCredentialsActionsType withEventAction(CompromisedCredentialsEventActionType eventAction) {
        this.eventAction = eventAction.toString();
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
        if (getEventAction() != null)
            sb.append("EventAction: ").append(getEventAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompromisedCredentialsActionsType == false)
            return false;
        CompromisedCredentialsActionsType other = (CompromisedCredentialsActionsType) obj;
        if (other.getEventAction() == null ^ this.getEventAction() == null)
            return false;
        if (other.getEventAction() != null && other.getEventAction().equals(this.getEventAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventAction() == null) ? 0 : getEventAction().hashCode());
        return hashCode;
    }

    @Override
    public CompromisedCredentialsActionsType clone() {
        try {
            return (CompromisedCredentialsActionsType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.CompromisedCredentialsActionsTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
