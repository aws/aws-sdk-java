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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The training data schema.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/TrainingDataSchema" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingDataSchema implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The training data schema variables.
     * </p>
     */
    private java.util.List<String> modelVariables;

    private LabelSchema labelSchema;

    /**
     * <p>
     * The training data schema variables.
     * </p>
     * 
     * @return The training data schema variables.
     */

    public java.util.List<String> getModelVariables() {
        return modelVariables;
    }

    /**
     * <p>
     * The training data schema variables.
     * </p>
     * 
     * @param modelVariables
     *        The training data schema variables.
     */

    public void setModelVariables(java.util.Collection<String> modelVariables) {
        if (modelVariables == null) {
            this.modelVariables = null;
            return;
        }

        this.modelVariables = new java.util.ArrayList<String>(modelVariables);
    }

    /**
     * <p>
     * The training data schema variables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelVariables(java.util.Collection)} or {@link #withModelVariables(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param modelVariables
     *        The training data schema variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingDataSchema withModelVariables(String... modelVariables) {
        if (this.modelVariables == null) {
            setModelVariables(new java.util.ArrayList<String>(modelVariables.length));
        }
        for (String ele : modelVariables) {
            this.modelVariables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The training data schema variables.
     * </p>
     * 
     * @param modelVariables
     *        The training data schema variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingDataSchema withModelVariables(java.util.Collection<String> modelVariables) {
        setModelVariables(modelVariables);
        return this;
    }

    /**
     * @param labelSchema
     */

    public void setLabelSchema(LabelSchema labelSchema) {
        this.labelSchema = labelSchema;
    }

    /**
     * @return
     */

    public LabelSchema getLabelSchema() {
        return this.labelSchema;
    }

    /**
     * @param labelSchema
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingDataSchema withLabelSchema(LabelSchema labelSchema) {
        setLabelSchema(labelSchema);
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
        if (getModelVariables() != null)
            sb.append("ModelVariables: ").append(getModelVariables()).append(",");
        if (getLabelSchema() != null)
            sb.append("LabelSchema: ").append(getLabelSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingDataSchema == false)
            return false;
        TrainingDataSchema other = (TrainingDataSchema) obj;
        if (other.getModelVariables() == null ^ this.getModelVariables() == null)
            return false;
        if (other.getModelVariables() != null && other.getModelVariables().equals(this.getModelVariables()) == false)
            return false;
        if (other.getLabelSchema() == null ^ this.getLabelSchema() == null)
            return false;
        if (other.getLabelSchema() != null && other.getLabelSchema().equals(this.getLabelSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelVariables() == null) ? 0 : getModelVariables().hashCode());
        hashCode = prime * hashCode + ((getLabelSchema() == null) ? 0 : getLabelSchema().hashCode());
        return hashCode;
    }

    @Override
    public TrainingDataSchema clone() {
        try {
            return (TrainingDataSchema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.TrainingDataSchemaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
