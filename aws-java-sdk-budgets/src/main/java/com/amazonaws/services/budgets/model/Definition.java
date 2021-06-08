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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies all of the type-specific parameters.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Definition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) action definition details.
     * </p>
     */
    private IamActionDefinition iamActionDefinition;
    /**
     * <p>
     * The service control policies (SCPs) action definition details.
     * </p>
     */
    private ScpActionDefinition scpActionDefinition;
    /**
     * <p>
     * The AWS Systems Manager (SSM) action definition details.
     * </p>
     */
    private SsmActionDefinition ssmActionDefinition;

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) action definition details.
     * </p>
     * 
     * @param iamActionDefinition
     *        The AWS Identity and Access Management (IAM) action definition details.
     */

    public void setIamActionDefinition(IamActionDefinition iamActionDefinition) {
        this.iamActionDefinition = iamActionDefinition;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) action definition details.
     * </p>
     * 
     * @return The AWS Identity and Access Management (IAM) action definition details.
     */

    public IamActionDefinition getIamActionDefinition() {
        return this.iamActionDefinition;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) action definition details.
     * </p>
     * 
     * @param iamActionDefinition
     *        The AWS Identity and Access Management (IAM) action definition details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Definition withIamActionDefinition(IamActionDefinition iamActionDefinition) {
        setIamActionDefinition(iamActionDefinition);
        return this;
    }

    /**
     * <p>
     * The service control policies (SCPs) action definition details.
     * </p>
     * 
     * @param scpActionDefinition
     *        The service control policies (SCPs) action definition details.
     */

    public void setScpActionDefinition(ScpActionDefinition scpActionDefinition) {
        this.scpActionDefinition = scpActionDefinition;
    }

    /**
     * <p>
     * The service control policies (SCPs) action definition details.
     * </p>
     * 
     * @return The service control policies (SCPs) action definition details.
     */

    public ScpActionDefinition getScpActionDefinition() {
        return this.scpActionDefinition;
    }

    /**
     * <p>
     * The service control policies (SCPs) action definition details.
     * </p>
     * 
     * @param scpActionDefinition
     *        The service control policies (SCPs) action definition details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Definition withScpActionDefinition(ScpActionDefinition scpActionDefinition) {
        setScpActionDefinition(scpActionDefinition);
        return this;
    }

    /**
     * <p>
     * The AWS Systems Manager (SSM) action definition details.
     * </p>
     * 
     * @param ssmActionDefinition
     *        The AWS Systems Manager (SSM) action definition details.
     */

    public void setSsmActionDefinition(SsmActionDefinition ssmActionDefinition) {
        this.ssmActionDefinition = ssmActionDefinition;
    }

    /**
     * <p>
     * The AWS Systems Manager (SSM) action definition details.
     * </p>
     * 
     * @return The AWS Systems Manager (SSM) action definition details.
     */

    public SsmActionDefinition getSsmActionDefinition() {
        return this.ssmActionDefinition;
    }

    /**
     * <p>
     * The AWS Systems Manager (SSM) action definition details.
     * </p>
     * 
     * @param ssmActionDefinition
     *        The AWS Systems Manager (SSM) action definition details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Definition withSsmActionDefinition(SsmActionDefinition ssmActionDefinition) {
        setSsmActionDefinition(ssmActionDefinition);
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
        if (getIamActionDefinition() != null)
            sb.append("IamActionDefinition: ").append(getIamActionDefinition()).append(",");
        if (getScpActionDefinition() != null)
            sb.append("ScpActionDefinition: ").append(getScpActionDefinition()).append(",");
        if (getSsmActionDefinition() != null)
            sb.append("SsmActionDefinition: ").append(getSsmActionDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Definition == false)
            return false;
        Definition other = (Definition) obj;
        if (other.getIamActionDefinition() == null ^ this.getIamActionDefinition() == null)
            return false;
        if (other.getIamActionDefinition() != null && other.getIamActionDefinition().equals(this.getIamActionDefinition()) == false)
            return false;
        if (other.getScpActionDefinition() == null ^ this.getScpActionDefinition() == null)
            return false;
        if (other.getScpActionDefinition() != null && other.getScpActionDefinition().equals(this.getScpActionDefinition()) == false)
            return false;
        if (other.getSsmActionDefinition() == null ^ this.getSsmActionDefinition() == null)
            return false;
        if (other.getSsmActionDefinition() != null && other.getSsmActionDefinition().equals(this.getSsmActionDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIamActionDefinition() == null) ? 0 : getIamActionDefinition().hashCode());
        hashCode = prime * hashCode + ((getScpActionDefinition() == null) ? 0 : getScpActionDefinition().hashCode());
        hashCode = prime * hashCode + ((getSsmActionDefinition() == null) ? 0 : getSsmActionDefinition().hashCode());
        return hashCode;
    }

    @Override
    public Definition clone() {
        try {
            return (Definition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.DefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
