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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An instance of a variable to be passed to the "containerAction" execution. Each variable must have a name and a value
 * given by one of "stringValue", "datasetContentVersionValue", or "outputFileUriValue".
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/Variable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Variable implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the variable.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the variable as a string.
     * </p>
     */
    private String stringValue;
    /**
     * <p>
     * The value of the variable as a double (numeric).
     * </p>
     */
    private Double doubleValue;
    /**
     * <p>
     * The value of the variable as a structure that specifies a data set content version.
     * </p>
     */
    private DatasetContentVersionValue datasetContentVersionValue;
    /**
     * <p>
     * The value of the variable as a structure that specifies an output file URI.
     * </p>
     */
    private OutputFileUriValue outputFileUriValue;

    /**
     * <p>
     * The name of the variable.
     * </p>
     * 
     * @param name
     *        The name of the variable.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the variable.
     * </p>
     * 
     * @return The name of the variable.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the variable.
     * </p>
     * 
     * @param name
     *        The name of the variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Variable withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of the variable as a string.
     * </p>
     * 
     * @param stringValue
     *        The value of the variable as a string.
     */

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * The value of the variable as a string.
     * </p>
     * 
     * @return The value of the variable as a string.
     */

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * <p>
     * The value of the variable as a string.
     * </p>
     * 
     * @param stringValue
     *        The value of the variable as a string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Variable withStringValue(String stringValue) {
        setStringValue(stringValue);
        return this;
    }

    /**
     * <p>
     * The value of the variable as a double (numeric).
     * </p>
     * 
     * @param doubleValue
     *        The value of the variable as a double (numeric).
     */

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /**
     * <p>
     * The value of the variable as a double (numeric).
     * </p>
     * 
     * @return The value of the variable as a double (numeric).
     */

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * <p>
     * The value of the variable as a double (numeric).
     * </p>
     * 
     * @param doubleValue
     *        The value of the variable as a double (numeric).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Variable withDoubleValue(Double doubleValue) {
        setDoubleValue(doubleValue);
        return this;
    }

    /**
     * <p>
     * The value of the variable as a structure that specifies a data set content version.
     * </p>
     * 
     * @param datasetContentVersionValue
     *        The value of the variable as a structure that specifies a data set content version.
     */

    public void setDatasetContentVersionValue(DatasetContentVersionValue datasetContentVersionValue) {
        this.datasetContentVersionValue = datasetContentVersionValue;
    }

    /**
     * <p>
     * The value of the variable as a structure that specifies a data set content version.
     * </p>
     * 
     * @return The value of the variable as a structure that specifies a data set content version.
     */

    public DatasetContentVersionValue getDatasetContentVersionValue() {
        return this.datasetContentVersionValue;
    }

    /**
     * <p>
     * The value of the variable as a structure that specifies a data set content version.
     * </p>
     * 
     * @param datasetContentVersionValue
     *        The value of the variable as a structure that specifies a data set content version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Variable withDatasetContentVersionValue(DatasetContentVersionValue datasetContentVersionValue) {
        setDatasetContentVersionValue(datasetContentVersionValue);
        return this;
    }

    /**
     * <p>
     * The value of the variable as a structure that specifies an output file URI.
     * </p>
     * 
     * @param outputFileUriValue
     *        The value of the variable as a structure that specifies an output file URI.
     */

    public void setOutputFileUriValue(OutputFileUriValue outputFileUriValue) {
        this.outputFileUriValue = outputFileUriValue;
    }

    /**
     * <p>
     * The value of the variable as a structure that specifies an output file URI.
     * </p>
     * 
     * @return The value of the variable as a structure that specifies an output file URI.
     */

    public OutputFileUriValue getOutputFileUriValue() {
        return this.outputFileUriValue;
    }

    /**
     * <p>
     * The value of the variable as a structure that specifies an output file URI.
     * </p>
     * 
     * @param outputFileUriValue
     *        The value of the variable as a structure that specifies an output file URI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Variable withOutputFileUriValue(OutputFileUriValue outputFileUriValue) {
        setOutputFileUriValue(outputFileUriValue);
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
        if (getStringValue() != null)
            sb.append("StringValue: ").append(getStringValue()).append(",");
        if (getDoubleValue() != null)
            sb.append("DoubleValue: ").append(getDoubleValue()).append(",");
        if (getDatasetContentVersionValue() != null)
            sb.append("DatasetContentVersionValue: ").append(getDatasetContentVersionValue()).append(",");
        if (getOutputFileUriValue() != null)
            sb.append("OutputFileUriValue: ").append(getOutputFileUriValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Variable == false)
            return false;
        Variable other = (Variable) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getDoubleValue() == null ^ this.getDoubleValue() == null)
            return false;
        if (other.getDoubleValue() != null && other.getDoubleValue().equals(this.getDoubleValue()) == false)
            return false;
        if (other.getDatasetContentVersionValue() == null ^ this.getDatasetContentVersionValue() == null)
            return false;
        if (other.getDatasetContentVersionValue() != null && other.getDatasetContentVersionValue().equals(this.getDatasetContentVersionValue()) == false)
            return false;
        if (other.getOutputFileUriValue() == null ^ this.getOutputFileUriValue() == null)
            return false;
        if (other.getOutputFileUriValue() != null && other.getOutputFileUriValue().equals(this.getOutputFileUriValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode + ((getDoubleValue() == null) ? 0 : getDoubleValue().hashCode());
        hashCode = prime * hashCode + ((getDatasetContentVersionValue() == null) ? 0 : getDatasetContentVersionValue().hashCode());
        hashCode = prime * hashCode + ((getOutputFileUriValue() == null) ? 0 : getOutputFileUriValue().hashCode());
        return hashCode;
    }

    @Override
    public Variable clone() {
        try {
            return (Variable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.VariableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
