/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;


/**
 * <p>
 * A comparision that is used to determine whether a query should return this object.
 * </p>
 */
public class Selector implements Serializable {

    /**
     * The name of the field that the operator will be applied to. The field
     * name is the "key" portion of the field definition in the pipeline
     * definition syntax that is used by the AWS Data Pipeline API. If the
     * field is not set on the object, the condition fails.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String fieldName;

    /**
     * Contains a logical operation for comparing the value of a field with a
     * specified value.
     */
    private Operator operator;

    /**
     * The name of the field that the operator will be applied to. The field
     * name is the "key" portion of the field definition in the pipeline
     * definition syntax that is used by the AWS Data Pipeline API. If the
     * field is not set on the object, the condition fails.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the field that the operator will be applied to. The field
     *         name is the "key" portion of the field definition in the pipeline
     *         definition syntax that is used by the AWS Data Pipeline API. If the
     *         field is not set on the object, the condition fails.
     */
    public String getFieldName() {
        return fieldName;
    }
    
    /**
     * The name of the field that the operator will be applied to. The field
     * name is the "key" portion of the field definition in the pipeline
     * definition syntax that is used by the AWS Data Pipeline API. If the
     * field is not set on the object, the condition fails.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param fieldName The name of the field that the operator will be applied to. The field
     *         name is the "key" portion of the field definition in the pipeline
     *         definition syntax that is used by the AWS Data Pipeline API. If the
     *         field is not set on the object, the condition fails.
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
    
    /**
     * The name of the field that the operator will be applied to. The field
     * name is the "key" portion of the field definition in the pipeline
     * definition syntax that is used by the AWS Data Pipeline API. If the
     * field is not set on the object, the condition fails.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param fieldName The name of the field that the operator will be applied to. The field
     *         name is the "key" portion of the field definition in the pipeline
     *         definition syntax that is used by the AWS Data Pipeline API. If the
     *         field is not set on the object, the condition fails.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Selector withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * Contains a logical operation for comparing the value of a field with a
     * specified value.
     *
     * @return Contains a logical operation for comparing the value of a field with a
     *         specified value.
     */
    public Operator getOperator() {
        return operator;
    }
    
    /**
     * Contains a logical operation for comparing the value of a field with a
     * specified value.
     *
     * @param operator Contains a logical operation for comparing the value of a field with a
     *         specified value.
     */
    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    
    /**
     * Contains a logical operation for comparing the value of a field with a
     * specified value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operator Contains a logical operation for comparing the value of a field with a
     *         specified value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Selector withOperator(Operator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFieldName() != null) sb.append("FieldName: " + getFieldName() + ",");
        if (getOperator() != null) sb.append("Operator: " + getOperator() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Selector == false) return false;
        Selector other = (Selector)obj;
        
        if (other.getFieldName() == null ^ this.getFieldName() == null) return false;
        if (other.getFieldName() != null && other.getFieldName().equals(this.getFieldName()) == false) return false; 
        if (other.getOperator() == null ^ this.getOperator() == null) return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false) return false; 
        return true;
    }
    
}
    