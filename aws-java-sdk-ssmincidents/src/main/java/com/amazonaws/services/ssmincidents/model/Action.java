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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The action that starts at the beginning of an incident. The response plan defines the action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/Action" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Systems Manager automation document to start as the runbook at the beginning of the incident.
     * </p>
     */
    private SsmAutomation ssmAutomation;

    /**
     * <p>
     * The Systems Manager automation document to start as the runbook at the beginning of the incident.
     * </p>
     * 
     * @param ssmAutomation
     *        The Systems Manager automation document to start as the runbook at the beginning of the incident.
     */

    public void setSsmAutomation(SsmAutomation ssmAutomation) {
        this.ssmAutomation = ssmAutomation;
    }

    /**
     * <p>
     * The Systems Manager automation document to start as the runbook at the beginning of the incident.
     * </p>
     * 
     * @return The Systems Manager automation document to start as the runbook at the beginning of the incident.
     */

    public SsmAutomation getSsmAutomation() {
        return this.ssmAutomation;
    }

    /**
     * <p>
     * The Systems Manager automation document to start as the runbook at the beginning of the incident.
     * </p>
     * 
     * @param ssmAutomation
     *        The Systems Manager automation document to start as the runbook at the beginning of the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withSsmAutomation(SsmAutomation ssmAutomation) {
        setSsmAutomation(ssmAutomation);
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
        if (getSsmAutomation() != null)
            sb.append("SsmAutomation: ").append(getSsmAutomation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;
        if (other.getSsmAutomation() == null ^ this.getSsmAutomation() == null)
            return false;
        if (other.getSsmAutomation() != null && other.getSsmAutomation().equals(this.getSsmAutomation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSsmAutomation() == null) ? 0 : getSsmAutomation().hashCode());
        return hashCode;
    }

    @Override
    public Action clone() {
        try {
            return (Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
