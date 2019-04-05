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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data retrieval policy.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataRetrievalPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy
     * field and optionally a BytesPerHour field.
     * </p>
     */
    private java.util.List<DataRetrievalRule> rules;

    /**
     * <p>
     * The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy
     * field and optionally a BytesPerHour field.
     * </p>
     * 
     * @return The policy rule. Although this is a list type, currently there must be only one rule, which contains a
     *         Strategy field and optionally a BytesPerHour field.
     */

    public java.util.List<DataRetrievalRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy
     * field and optionally a BytesPerHour field.
     * </p>
     * 
     * @param rules
     *        The policy rule. Although this is a list type, currently there must be only one rule, which contains a
     *        Strategy field and optionally a BytesPerHour field.
     */

    public void setRules(java.util.Collection<DataRetrievalRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<DataRetrievalRule>(rules);
    }

    /**
     * <p>
     * The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy
     * field and optionally a BytesPerHour field.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The policy rule. Although this is a list type, currently there must be only one rule, which contains a
     *        Strategy field and optionally a BytesPerHour field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRetrievalPolicy withRules(DataRetrievalRule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<DataRetrievalRule>(rules.length));
        }
        for (DataRetrievalRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy
     * field and optionally a BytesPerHour field.
     * </p>
     * 
     * @param rules
     *        The policy rule. Although this is a list type, currently there must be only one rule, which contains a
     *        Strategy field and optionally a BytesPerHour field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRetrievalPolicy withRules(java.util.Collection<DataRetrievalRule> rules) {
        setRules(rules);
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
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataRetrievalPolicy == false)
            return false;
        DataRetrievalPolicy other = (DataRetrievalPolicy) obj;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public DataRetrievalPolicy clone() {
        try {
            return (DataRetrievalPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.DataRetrievalPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
