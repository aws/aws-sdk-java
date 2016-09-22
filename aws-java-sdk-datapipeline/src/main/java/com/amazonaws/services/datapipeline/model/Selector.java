/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;

/**
 * <p>
 * A comparision that is used to determine whether a query should return this object.
 * </p>
 */
public class Selector implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the field that the operator will be applied to. The field name is the "key" portion of the field
     * definition in the pipeline definition syntax that is used by the AWS Data Pipeline API. If the field is not set
     * on the object, the condition fails.
     * </p>
     */
    private String fieldName;

    private Operator operator;

    /**
     * <p>
     * The name of the field that the operator will be applied to. The field name is the "key" portion of the field
     * definition in the pipeline definition syntax that is used by the AWS Data Pipeline API. If the field is not set
     * on the object, the condition fails.
     * </p>
     * 
     * @param fieldName
     *        The name of the field that the operator will be applied to. The field name is the "key" portion of the
     *        field definition in the pipeline definition syntax that is used by the AWS Data Pipeline API. If the field
     *        is not set on the object, the condition fails.
     */

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * <p>
     * The name of the field that the operator will be applied to. The field name is the "key" portion of the field
     * definition in the pipeline definition syntax that is used by the AWS Data Pipeline API. If the field is not set
     * on the object, the condition fails.
     * </p>
     * 
     * @return The name of the field that the operator will be applied to. The field name is the "key" portion of the
     *         field definition in the pipeline definition syntax that is used by the AWS Data Pipeline API. If the
     *         field is not set on the object, the condition fails.
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * <p>
     * The name of the field that the operator will be applied to. The field name is the "key" portion of the field
     * definition in the pipeline definition syntax that is used by the AWS Data Pipeline API. If the field is not set
     * on the object, the condition fails.
     * </p>
     * 
     * @param fieldName
     *        The name of the field that the operator will be applied to. The field name is the "key" portion of the
     *        field definition in the pipeline definition syntax that is used by the AWS Data Pipeline API. If the field
     *        is not set on the object, the condition fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Selector withFieldName(String fieldName) {
        setFieldName(fieldName);
        return this;
    }

    /**
     * @param operator
     */

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    /**
     * @return
     */

    public Operator getOperator() {
        return this.operator;
    }

    /**
     * @param operator
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Selector withOperator(Operator operator) {
        setOperator(operator);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFieldName() != null)
            sb.append("FieldName: " + getFieldName() + ",");
        if (getOperator() != null)
            sb.append("Operator: " + getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Selector == false)
            return false;
        Selector other = (Selector) obj;
        if (other.getFieldName() == null ^ this.getFieldName() == null)
            return false;
        if (other.getFieldName() != null && other.getFieldName().equals(this.getFieldName()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public Selector clone() {
        try {
            return (Selector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
