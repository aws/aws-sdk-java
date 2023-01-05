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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFieldResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the field.
     * </p>
     */
    private String fieldArn;
    /**
     * <p>
     * The unique identifier of a field.
     * </p>
     */
    private String fieldId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the field.
     * </p>
     * 
     * @param fieldArn
     *        The Amazon Resource Name (ARN) of the field.
     */

    public void setFieldArn(String fieldArn) {
        this.fieldArn = fieldArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the field.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the field.
     */

    public String getFieldArn() {
        return this.fieldArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the field.
     * </p>
     * 
     * @param fieldArn
     *        The Amazon Resource Name (ARN) of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFieldResult withFieldArn(String fieldArn) {
        setFieldArn(fieldArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of a field.
     * </p>
     * 
     * @param fieldId
     *        The unique identifier of a field.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * The unique identifier of a field.
     * </p>
     * 
     * @return The unique identifier of a field.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * The unique identifier of a field.
     * </p>
     * 
     * @param fieldId
     *        The unique identifier of a field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFieldResult withFieldId(String fieldId) {
        setFieldId(fieldId);
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
        if (getFieldArn() != null)
            sb.append("FieldArn: ").append(getFieldArn()).append(",");
        if (getFieldId() != null)
            sb.append("FieldId: ").append(getFieldId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFieldResult == false)
            return false;
        CreateFieldResult other = (CreateFieldResult) obj;
        if (other.getFieldArn() == null ^ this.getFieldArn() == null)
            return false;
        if (other.getFieldArn() != null && other.getFieldArn().equals(this.getFieldArn()) == false)
            return false;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldArn() == null) ? 0 : getFieldArn().hashCode());
        hashCode = prime * hashCode + ((getFieldId() == null) ? 0 : getFieldId().hashCode());
        return hashCode;
    }

    @Override
    public CreateFieldResult clone() {
        try {
            return (CreateFieldResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
