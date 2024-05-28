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
package com.amazonaws.services.personalizeevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/PutActionInteractions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutActionInteractionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of your action interaction event tracker. When you create an Action interactions dataset, Amazon
     * Personalize creates an action interaction event tracker for you. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/action-interaction-tracker-id.html">Action interaction
     * event tracker ID</a>.
     * </p>
     */
    private String trackingId;
    /**
     * <p>
     * A list of action interaction events from the session.
     * </p>
     */
    private java.util.List<ActionInteraction> actionInteractions;

    /**
     * <p>
     * The ID of your action interaction event tracker. When you create an Action interactions dataset, Amazon
     * Personalize creates an action interaction event tracker for you. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/action-interaction-tracker-id.html">Action interaction
     * event tracker ID</a>.
     * </p>
     * 
     * @param trackingId
     *        The ID of your action interaction event tracker. When you create an Action interactions dataset, Amazon
     *        Personalize creates an action interaction event tracker for you. For more information, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/action-interaction-tracker-id.html">Action
     *        interaction event tracker ID</a>.
     */

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    /**
     * <p>
     * The ID of your action interaction event tracker. When you create an Action interactions dataset, Amazon
     * Personalize creates an action interaction event tracker for you. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/action-interaction-tracker-id.html">Action interaction
     * event tracker ID</a>.
     * </p>
     * 
     * @return The ID of your action interaction event tracker. When you create an Action interactions dataset, Amazon
     *         Personalize creates an action interaction event tracker for you. For more information, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/action-interaction-tracker-id.html">Action
     *         interaction event tracker ID</a>.
     */

    public String getTrackingId() {
        return this.trackingId;
    }

    /**
     * <p>
     * The ID of your action interaction event tracker. When you create an Action interactions dataset, Amazon
     * Personalize creates an action interaction event tracker for you. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/action-interaction-tracker-id.html">Action interaction
     * event tracker ID</a>.
     * </p>
     * 
     * @param trackingId
     *        The ID of your action interaction event tracker. When you create an Action interactions dataset, Amazon
     *        Personalize creates an action interaction event tracker for you. For more information, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/action-interaction-tracker-id.html">Action
     *        interaction event tracker ID</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutActionInteractionsRequest withTrackingId(String trackingId) {
        setTrackingId(trackingId);
        return this;
    }

    /**
     * <p>
     * A list of action interaction events from the session.
     * </p>
     * 
     * @return A list of action interaction events from the session.
     */

    public java.util.List<ActionInteraction> getActionInteractions() {
        return actionInteractions;
    }

    /**
     * <p>
     * A list of action interaction events from the session.
     * </p>
     * 
     * @param actionInteractions
     *        A list of action interaction events from the session.
     */

    public void setActionInteractions(java.util.Collection<ActionInteraction> actionInteractions) {
        if (actionInteractions == null) {
            this.actionInteractions = null;
            return;
        }

        this.actionInteractions = new java.util.ArrayList<ActionInteraction>(actionInteractions);
    }

    /**
     * <p>
     * A list of action interaction events from the session.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionInteractions(java.util.Collection)} or {@link #withActionInteractions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param actionInteractions
     *        A list of action interaction events from the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutActionInteractionsRequest withActionInteractions(ActionInteraction... actionInteractions) {
        if (this.actionInteractions == null) {
            setActionInteractions(new java.util.ArrayList<ActionInteraction>(actionInteractions.length));
        }
        for (ActionInteraction ele : actionInteractions) {
            this.actionInteractions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of action interaction events from the session.
     * </p>
     * 
     * @param actionInteractions
     *        A list of action interaction events from the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutActionInteractionsRequest withActionInteractions(java.util.Collection<ActionInteraction> actionInteractions) {
        setActionInteractions(actionInteractions);
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
        if (getTrackingId() != null)
            sb.append("TrackingId: ").append(getTrackingId()).append(",");
        if (getActionInteractions() != null)
            sb.append("ActionInteractions: ").append(getActionInteractions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutActionInteractionsRequest == false)
            return false;
        PutActionInteractionsRequest other = (PutActionInteractionsRequest) obj;
        if (other.getTrackingId() == null ^ this.getTrackingId() == null)
            return false;
        if (other.getTrackingId() != null && other.getTrackingId().equals(this.getTrackingId()) == false)
            return false;
        if (other.getActionInteractions() == null ^ this.getActionInteractions() == null)
            return false;
        if (other.getActionInteractions() != null && other.getActionInteractions().equals(this.getActionInteractions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrackingId() == null) ? 0 : getTrackingId().hashCode());
        hashCode = prime * hashCode + ((getActionInteractions() == null) ? 0 : getActionInteractions().hashCode());
        return hashCode;
    }

    @Override
    public PutActionInteractionsRequest clone() {
        return (PutActionInteractionsRequest) super.clone();
    }

}
