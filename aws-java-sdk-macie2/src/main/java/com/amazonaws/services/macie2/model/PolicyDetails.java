/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the details of a policy finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/PolicyDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action that produced the finding.
     * </p>
     */
    private FindingAction action;
    /**
     * <p>
     * The entity that performed the action that produced the finding.
     * </p>
     */
    private FindingActor actor;

    /**
     * <p>
     * The action that produced the finding.
     * </p>
     * 
     * @param action
     *        The action that produced the finding.
     */

    public void setAction(FindingAction action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that produced the finding.
     * </p>
     * 
     * @return The action that produced the finding.
     */

    public FindingAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action that produced the finding.
     * </p>
     * 
     * @param action
     *        The action that produced the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withAction(FindingAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The entity that performed the action that produced the finding.
     * </p>
     * 
     * @param actor
     *        The entity that performed the action that produced the finding.
     */

    public void setActor(FindingActor actor) {
        this.actor = actor;
    }

    /**
     * <p>
     * The entity that performed the action that produced the finding.
     * </p>
     * 
     * @return The entity that performed the action that produced the finding.
     */

    public FindingActor getActor() {
        return this.actor;
    }

    /**
     * <p>
     * The entity that performed the action that produced the finding.
     * </p>
     * 
     * @param actor
     *        The entity that performed the action that produced the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withActor(FindingActor actor) {
        setActor(actor);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getActor() != null)
            sb.append("Actor: ").append(getActor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyDetails == false)
            return false;
        PolicyDetails other = (PolicyDetails) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getActor() == null ^ this.getActor() == null)
            return false;
        if (other.getActor() != null && other.getActor().equals(this.getActor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getActor() == null) ? 0 : getActor().hashCode());
        return hashCode;
    }

    @Override
    public PolicyDetails clone() {
        try {
            return (PolicyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.PolicyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
