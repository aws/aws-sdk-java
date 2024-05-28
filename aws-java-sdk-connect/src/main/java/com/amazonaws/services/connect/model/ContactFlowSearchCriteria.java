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
 * The search criteria to be used to return contact flows.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ContactFlowSearchCriteria" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactFlowSearchCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>OR</code> condition.
     * </p>
     */
    private java.util.List<ContactFlowSearchCriteria> orConditions;
    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     */
    private java.util.List<ContactFlowSearchCriteria> andConditions;

    private StringCondition stringCondition;
    /**
     * <p>
     * The type of flow.
     * </p>
     */
    private String typeCondition;
    /**
     * <p>
     * The state of the flow.
     * </p>
     */
    private String stateCondition;
    /**
     * <p>
     * The status of the flow.
     * </p>
     */
    private String statusCondition;

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>OR</code> condition.
     * </p>
     * 
     * @return A list of conditions which would be applied together with an <code>OR</code> condition.
     */

    public java.util.List<ContactFlowSearchCriteria> getOrConditions() {
        return orConditions;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>OR</code> condition.
     * </p>
     * 
     * @param orConditions
     *        A list of conditions which would be applied together with an <code>OR</code> condition.
     */

    public void setOrConditions(java.util.Collection<ContactFlowSearchCriteria> orConditions) {
        if (orConditions == null) {
            this.orConditions = null;
            return;
        }

        this.orConditions = new java.util.ArrayList<ContactFlowSearchCriteria>(orConditions);
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>OR</code> condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrConditions(java.util.Collection)} or {@link #withOrConditions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param orConditions
     *        A list of conditions which would be applied together with an <code>OR</code> condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlowSearchCriteria withOrConditions(ContactFlowSearchCriteria... orConditions) {
        if (this.orConditions == null) {
            setOrConditions(new java.util.ArrayList<ContactFlowSearchCriteria>(orConditions.length));
        }
        for (ContactFlowSearchCriteria ele : orConditions) {
            this.orConditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>OR</code> condition.
     * </p>
     * 
     * @param orConditions
     *        A list of conditions which would be applied together with an <code>OR</code> condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlowSearchCriteria withOrConditions(java.util.Collection<ContactFlowSearchCriteria> orConditions) {
        setOrConditions(orConditions);
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     * 
     * @return A list of conditions which would be applied together with an <code>AND</code> condition.
     */

    public java.util.List<ContactFlowSearchCriteria> getAndConditions() {
        return andConditions;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     * 
     * @param andConditions
     *        A list of conditions which would be applied together with an <code>AND</code> condition.
     */

    public void setAndConditions(java.util.Collection<ContactFlowSearchCriteria> andConditions) {
        if (andConditions == null) {
            this.andConditions = null;
            return;
        }

        this.andConditions = new java.util.ArrayList<ContactFlowSearchCriteria>(andConditions);
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAndConditions(java.util.Collection)} or {@link #withAndConditions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param andConditions
     *        A list of conditions which would be applied together with an <code>AND</code> condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlowSearchCriteria withAndConditions(ContactFlowSearchCriteria... andConditions) {
        if (this.andConditions == null) {
            setAndConditions(new java.util.ArrayList<ContactFlowSearchCriteria>(andConditions.length));
        }
        for (ContactFlowSearchCriteria ele : andConditions) {
            this.andConditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     * 
     * @param andConditions
     *        A list of conditions which would be applied together with an <code>AND</code> condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlowSearchCriteria withAndConditions(java.util.Collection<ContactFlowSearchCriteria> andConditions) {
        setAndConditions(andConditions);
        return this;
    }

    /**
     * @param stringCondition
     */

    public void setStringCondition(StringCondition stringCondition) {
        this.stringCondition = stringCondition;
    }

    /**
     * @return
     */

    public StringCondition getStringCondition() {
        return this.stringCondition;
    }

    /**
     * @param stringCondition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlowSearchCriteria withStringCondition(StringCondition stringCondition) {
        setStringCondition(stringCondition);
        return this;
    }

    /**
     * <p>
     * The type of flow.
     * </p>
     * 
     * @param typeCondition
     *        The type of flow.
     * @see ContactFlowType
     */

    public void setTypeCondition(String typeCondition) {
        this.typeCondition = typeCondition;
    }

    /**
     * <p>
     * The type of flow.
     * </p>
     * 
     * @return The type of flow.
     * @see ContactFlowType
     */

    public String getTypeCondition() {
        return this.typeCondition;
    }

    /**
     * <p>
     * The type of flow.
     * </p>
     * 
     * @param typeCondition
     *        The type of flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowType
     */

    public ContactFlowSearchCriteria withTypeCondition(String typeCondition) {
        setTypeCondition(typeCondition);
        return this;
    }

    /**
     * <p>
     * The type of flow.
     * </p>
     * 
     * @param typeCondition
     *        The type of flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowType
     */

    public ContactFlowSearchCriteria withTypeCondition(ContactFlowType typeCondition) {
        this.typeCondition = typeCondition.toString();
        return this;
    }

    /**
     * <p>
     * The state of the flow.
     * </p>
     * 
     * @param stateCondition
     *        The state of the flow.
     * @see ContactFlowState
     */

    public void setStateCondition(String stateCondition) {
        this.stateCondition = stateCondition;
    }

    /**
     * <p>
     * The state of the flow.
     * </p>
     * 
     * @return The state of the flow.
     * @see ContactFlowState
     */

    public String getStateCondition() {
        return this.stateCondition;
    }

    /**
     * <p>
     * The state of the flow.
     * </p>
     * 
     * @param stateCondition
     *        The state of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowState
     */

    public ContactFlowSearchCriteria withStateCondition(String stateCondition) {
        setStateCondition(stateCondition);
        return this;
    }

    /**
     * <p>
     * The state of the flow.
     * </p>
     * 
     * @param stateCondition
     *        The state of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowState
     */

    public ContactFlowSearchCriteria withStateCondition(ContactFlowState stateCondition) {
        this.stateCondition = stateCondition.toString();
        return this;
    }

    /**
     * <p>
     * The status of the flow.
     * </p>
     * 
     * @param statusCondition
     *        The status of the flow.
     * @see ContactFlowStatus
     */

    public void setStatusCondition(String statusCondition) {
        this.statusCondition = statusCondition;
    }

    /**
     * <p>
     * The status of the flow.
     * </p>
     * 
     * @return The status of the flow.
     * @see ContactFlowStatus
     */

    public String getStatusCondition() {
        return this.statusCondition;
    }

    /**
     * <p>
     * The status of the flow.
     * </p>
     * 
     * @param statusCondition
     *        The status of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowStatus
     */

    public ContactFlowSearchCriteria withStatusCondition(String statusCondition) {
        setStatusCondition(statusCondition);
        return this;
    }

    /**
     * <p>
     * The status of the flow.
     * </p>
     * 
     * @param statusCondition
     *        The status of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowStatus
     */

    public ContactFlowSearchCriteria withStatusCondition(ContactFlowStatus statusCondition) {
        this.statusCondition = statusCondition.toString();
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
        if (getOrConditions() != null)
            sb.append("OrConditions: ").append(getOrConditions()).append(",");
        if (getAndConditions() != null)
            sb.append("AndConditions: ").append(getAndConditions()).append(",");
        if (getStringCondition() != null)
            sb.append("StringCondition: ").append(getStringCondition()).append(",");
        if (getTypeCondition() != null)
            sb.append("TypeCondition: ").append(getTypeCondition()).append(",");
        if (getStateCondition() != null)
            sb.append("StateCondition: ").append(getStateCondition()).append(",");
        if (getStatusCondition() != null)
            sb.append("StatusCondition: ").append(getStatusCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactFlowSearchCriteria == false)
            return false;
        ContactFlowSearchCriteria other = (ContactFlowSearchCriteria) obj;
        if (other.getOrConditions() == null ^ this.getOrConditions() == null)
            return false;
        if (other.getOrConditions() != null && other.getOrConditions().equals(this.getOrConditions()) == false)
            return false;
        if (other.getAndConditions() == null ^ this.getAndConditions() == null)
            return false;
        if (other.getAndConditions() != null && other.getAndConditions().equals(this.getAndConditions()) == false)
            return false;
        if (other.getStringCondition() == null ^ this.getStringCondition() == null)
            return false;
        if (other.getStringCondition() != null && other.getStringCondition().equals(this.getStringCondition()) == false)
            return false;
        if (other.getTypeCondition() == null ^ this.getTypeCondition() == null)
            return false;
        if (other.getTypeCondition() != null && other.getTypeCondition().equals(this.getTypeCondition()) == false)
            return false;
        if (other.getStateCondition() == null ^ this.getStateCondition() == null)
            return false;
        if (other.getStateCondition() != null && other.getStateCondition().equals(this.getStateCondition()) == false)
            return false;
        if (other.getStatusCondition() == null ^ this.getStatusCondition() == null)
            return false;
        if (other.getStatusCondition() != null && other.getStatusCondition().equals(this.getStatusCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrConditions() == null) ? 0 : getOrConditions().hashCode());
        hashCode = prime * hashCode + ((getAndConditions() == null) ? 0 : getAndConditions().hashCode());
        hashCode = prime * hashCode + ((getStringCondition() == null) ? 0 : getStringCondition().hashCode());
        hashCode = prime * hashCode + ((getTypeCondition() == null) ? 0 : getTypeCondition().hashCode());
        hashCode = prime * hashCode + ((getStateCondition() == null) ? 0 : getStateCondition().hashCode());
        hashCode = prime * hashCode + ((getStatusCondition() == null) ? 0 : getStatusCondition().hashCode());
        return hashCode;
    }

    @Override
    public ContactFlowSearchCriteria clone() {
        try {
            return (ContactFlowSearchCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ContactFlowSearchCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
