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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure to hold multiple values of an output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/WorkflowStepOutputUnion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowStepOutputUnion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The integer value.
     * </p>
     */
    private Integer integerValue;
    /**
     * <p>
     * The string value.
     * </p>
     */
    private String stringValue;
    /**
     * <p>
     * The list of string value.
     * </p>
     */
    private java.util.List<String> listOfStringValue;

    /**
     * <p>
     * The integer value.
     * </p>
     * 
     * @param integerValue
     *        The integer value.
     */

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    /**
     * <p>
     * The integer value.
     * </p>
     * 
     * @return The integer value.
     */

    public Integer getIntegerValue() {
        return this.integerValue;
    }

    /**
     * <p>
     * The integer value.
     * </p>
     * 
     * @param integerValue
     *        The integer value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepOutputUnion withIntegerValue(Integer integerValue) {
        setIntegerValue(integerValue);
        return this;
    }

    /**
     * <p>
     * The string value.
     * </p>
     * 
     * @param stringValue
     *        The string value.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * The string value.
     * </p>
     * 
     * @return The string value.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * The string value.
     * </p>
     * 
     * @param stringValue
     *        The string value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepOutputUnion withStringValue(String stringValue) {
        setStringValue(stringValue);
        return this;
    }

    /**
     * <p>
     * The list of string value.
     * </p>
     * 
     * @return The list of string value.
     */

    public java.util.List<String> getListOfStringValue() {
        return listOfStringValue;
    }

    /**
     * <p>
     * The list of string value.
     * </p>
     * 
     * @param listOfStringValue
     *        The list of string value.
     */

    public void setListOfStringValue(java.util.Collection<String> listOfStringValue) {
        if (listOfStringValue == null) {
            this.listOfStringValue = null;
            return;
        }

        this.listOfStringValue = new java.util.ArrayList<String>(listOfStringValue);
    }

    /**
     * <p>
     * The list of string value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListOfStringValue(java.util.Collection)} or {@link #withListOfStringValue(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param listOfStringValue
     *        The list of string value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepOutputUnion withListOfStringValue(String... listOfStringValue) {
        if (this.listOfStringValue == null) {
            setListOfStringValue(new java.util.ArrayList<String>(listOfStringValue.length));
        }
        for (String ele : listOfStringValue) {
            this.listOfStringValue.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of string value.
     * </p>
     * 
     * @param listOfStringValue
     *        The list of string value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepOutputUnion withListOfStringValue(java.util.Collection<String> listOfStringValue) {
        setListOfStringValue(listOfStringValue);
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
        if (getIntegerValue() != null)
            sb.append("IntegerValue: ").append(getIntegerValue()).append(",");
        if (getStringValue() != null)
            sb.append("StringValue: ").append(getStringValue()).append(",");
        if (getListOfStringValue() != null)
            sb.append("ListOfStringValue: ").append(getListOfStringValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowStepOutputUnion == false)
            return false;
        WorkflowStepOutputUnion other = (WorkflowStepOutputUnion) obj;
        if (other.getIntegerValue() == null ^ this.getIntegerValue() == null)
            return false;
        if (other.getIntegerValue() != null && other.getIntegerValue().equals(this.getIntegerValue()) == false)
            return false;
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getListOfStringValue() == null ^ this.getListOfStringValue() == null)
            return false;
        if (other.getListOfStringValue() != null && other.getListOfStringValue().equals(this.getListOfStringValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntegerValue() == null) ? 0 : getIntegerValue().hashCode());
        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode + ((getListOfStringValue() == null) ? 0 : getListOfStringValue().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowStepOutputUnion clone() {
        try {
            return (WorkflowStepOutputUnion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhuborchestrator.model.transform.WorkflowStepOutputUnionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
