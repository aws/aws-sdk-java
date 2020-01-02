/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The response elements represent the results of an update.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/UpdateResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Values for fields generated during the request.
     * </p>
     */
    private java.util.List<Field> generatedFields;

    /**
     * <p>
     * Values for fields generated during the request.
     * </p>
     * 
     * @return Values for fields generated during the request.
     */

    public java.util.List<Field> getGeneratedFields() {
        return generatedFields;
    }

    /**
     * <p>
     * Values for fields generated during the request.
     * </p>
     * 
     * @param generatedFields
     *        Values for fields generated during the request.
     */

    public void setGeneratedFields(java.util.Collection<Field> generatedFields) {
        if (generatedFields == null) {
            this.generatedFields = null;
            return;
        }

        this.generatedFields = new java.util.ArrayList<Field>(generatedFields);
    }

    /**
     * <p>
     * Values for fields generated during the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGeneratedFields(java.util.Collection)} or {@link #withGeneratedFields(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param generatedFields
     *        Values for fields generated during the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResult withGeneratedFields(Field... generatedFields) {
        if (this.generatedFields == null) {
            setGeneratedFields(new java.util.ArrayList<Field>(generatedFields.length));
        }
        for (Field ele : generatedFields) {
            this.generatedFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Values for fields generated during the request.
     * </p>
     * 
     * @param generatedFields
     *        Values for fields generated during the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResult withGeneratedFields(java.util.Collection<Field> generatedFields) {
        setGeneratedFields(generatedFields);
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
        if (getGeneratedFields() != null)
            sb.append("GeneratedFields: ").append(getGeneratedFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResult == false)
            return false;
        UpdateResult other = (UpdateResult) obj;
        if (other.getGeneratedFields() == null ^ this.getGeneratedFields() == null)
            return false;
        if (other.getGeneratedFields() != null && other.getGeneratedFields().equals(this.getGeneratedFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeneratedFields() == null) ? 0 : getGeneratedFields().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResult clone() {
        try {
            return (UpdateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rdsdata.model.transform.UpdateResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
