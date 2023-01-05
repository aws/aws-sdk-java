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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a transform that locates records in the dataset that have missing values and adds a new field with a value
 * determined by imputation. The input data set is used to train the machine learning model that determines what the
 * missing value should be.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/FillMissingValues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FillMissingValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the transform node.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * A JSON path to a variable in the data structure for the dataset that is imputed.
     * </p>
     */
    private String imputedPath;
    /**
     * <p>
     * A JSON path to a variable in the data structure for the dataset that is filled.
     * </p>
     */
    private String filledPath;

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @param name
     *        The name of the transform node.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @return The name of the transform node.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @param name
     *        The name of the transform node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FillMissingValues withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * 
     * @return The data inputs identified by their node names.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names.
     */

    public void setInputs(java.util.Collection<String> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<String>(inputs);
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FillMissingValues withInputs(String... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<String>(inputs.length));
        }
        for (String ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FillMissingValues withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * A JSON path to a variable in the data structure for the dataset that is imputed.
     * </p>
     * 
     * @param imputedPath
     *        A JSON path to a variable in the data structure for the dataset that is imputed.
     */

    public void setImputedPath(String imputedPath) {
        this.imputedPath = imputedPath;
    }

    /**
     * <p>
     * A JSON path to a variable in the data structure for the dataset that is imputed.
     * </p>
     * 
     * @return A JSON path to a variable in the data structure for the dataset that is imputed.
     */

    public String getImputedPath() {
        return this.imputedPath;
    }

    /**
     * <p>
     * A JSON path to a variable in the data structure for the dataset that is imputed.
     * </p>
     * 
     * @param imputedPath
     *        A JSON path to a variable in the data structure for the dataset that is imputed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FillMissingValues withImputedPath(String imputedPath) {
        setImputedPath(imputedPath);
        return this;
    }

    /**
     * <p>
     * A JSON path to a variable in the data structure for the dataset that is filled.
     * </p>
     * 
     * @param filledPath
     *        A JSON path to a variable in the data structure for the dataset that is filled.
     */

    public void setFilledPath(String filledPath) {
        this.filledPath = filledPath;
    }

    /**
     * <p>
     * A JSON path to a variable in the data structure for the dataset that is filled.
     * </p>
     * 
     * @return A JSON path to a variable in the data structure for the dataset that is filled.
     */

    public String getFilledPath() {
        return this.filledPath;
    }

    /**
     * <p>
     * A JSON path to a variable in the data structure for the dataset that is filled.
     * </p>
     * 
     * @param filledPath
     *        A JSON path to a variable in the data structure for the dataset that is filled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FillMissingValues withFilledPath(String filledPath) {
        setFilledPath(filledPath);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getImputedPath() != null)
            sb.append("ImputedPath: ").append(getImputedPath()).append(",");
        if (getFilledPath() != null)
            sb.append("FilledPath: ").append(getFilledPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FillMissingValues == false)
            return false;
        FillMissingValues other = (FillMissingValues) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getImputedPath() == null ^ this.getImputedPath() == null)
            return false;
        if (other.getImputedPath() != null && other.getImputedPath().equals(this.getImputedPath()) == false)
            return false;
        if (other.getFilledPath() == null ^ this.getFilledPath() == null)
            return false;
        if (other.getFilledPath() != null && other.getFilledPath().equals(this.getFilledPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getImputedPath() == null) ? 0 : getImputedPath().hashCode());
        hashCode = prime * hashCode + ((getFilledPath() == null) ? 0 : getFilledPath().hashCode());
        return hashCode;
    }

    @Override
    public FillMissingValues clone() {
        try {
            return (FillMissingValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.FillMissingValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
