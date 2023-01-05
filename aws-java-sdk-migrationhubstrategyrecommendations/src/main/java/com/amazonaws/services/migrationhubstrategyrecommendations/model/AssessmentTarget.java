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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the criteria of assessment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/AssessmentTarget"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Condition of an assessment.
     * </p>
     */
    private String condition;
    /**
     * <p>
     * Name of an assessment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Values of an assessment.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * Condition of an assessment.
     * </p>
     * 
     * @param condition
     *        Condition of an assessment.
     * @see Condition
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * Condition of an assessment.
     * </p>
     * 
     * @return Condition of an assessment.
     * @see Condition
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * Condition of an assessment.
     * </p>
     * 
     * @param condition
     *        Condition of an assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Condition
     */

    public AssessmentTarget withCondition(String condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * Condition of an assessment.
     * </p>
     * 
     * @param condition
     *        Condition of an assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Condition
     */

    public AssessmentTarget withCondition(Condition condition) {
        this.condition = condition.toString();
        return this;
    }

    /**
     * <p>
     * Name of an assessment.
     * </p>
     * 
     * @param name
     *        Name of an assessment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of an assessment.
     * </p>
     * 
     * @return Name of an assessment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of an assessment.
     * </p>
     * 
     * @param name
     *        Name of an assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTarget withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Values of an assessment.
     * </p>
     * 
     * @return Values of an assessment.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * Values of an assessment.
     * </p>
     * 
     * @param values
     *        Values of an assessment.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * Values of an assessment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        Values of an assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTarget withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Values of an assessment.
     * </p>
     * 
     * @param values
     *        Values of an assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentTarget withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentTarget == false)
            return false;
        AssessmentTarget other = (AssessmentTarget) obj;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentTarget clone() {
        try {
            return (AssessmentTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.AssessmentTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
