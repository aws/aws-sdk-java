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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The Output data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/Output" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Output implements Serializable, Cloneable {

    /**
     * <p>
     * The key associated with the output.
     * </p>
     */
    private String outputKey;
    /**
     * <p>
     * The value associated with the output.
     * </p>
     */
    private String outputValue;
    /**
     * <p>
     * User defined description associated with the output.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the export associated with the output.
     * </p>
     */
    private String exportName;

    /**
     * <p>
     * The key associated with the output.
     * </p>
     * 
     * @param outputKey
     *        The key associated with the output.
     */

    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    /**
     * <p>
     * The key associated with the output.
     * </p>
     * 
     * @return The key associated with the output.
     */

    public String getOutputKey() {
        return this.outputKey;
    }

    /**
     * <p>
     * The key associated with the output.
     * </p>
     * 
     * @param outputKey
     *        The key associated with the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withOutputKey(String outputKey) {
        setOutputKey(outputKey);
        return this;
    }

    /**
     * <p>
     * The value associated with the output.
     * </p>
     * 
     * @param outputValue
     *        The value associated with the output.
     */

    public void setOutputValue(String outputValue) {
        this.outputValue = outputValue;
    }

    /**
     * <p>
     * The value associated with the output.
     * </p>
     * 
     * @return The value associated with the output.
     */

    public String getOutputValue() {
        return this.outputValue;
    }

    /**
     * <p>
     * The value associated with the output.
     * </p>
     * 
     * @param outputValue
     *        The value associated with the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withOutputValue(String outputValue) {
        setOutputValue(outputValue);
        return this;
    }

    /**
     * <p>
     * User defined description associated with the output.
     * </p>
     * 
     * @param description
     *        User defined description associated with the output.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * User defined description associated with the output.
     * </p>
     * 
     * @return User defined description associated with the output.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * User defined description associated with the output.
     * </p>
     * 
     * @param description
     *        User defined description associated with the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the export associated with the output.
     * </p>
     * 
     * @param exportName
     *        The name of the export associated with the output.
     */

    public void setExportName(String exportName) {
        this.exportName = exportName;
    }

    /**
     * <p>
     * The name of the export associated with the output.
     * </p>
     * 
     * @return The name of the export associated with the output.
     */

    public String getExportName() {
        return this.exportName;
    }

    /**
     * <p>
     * The name of the export associated with the output.
     * </p>
     * 
     * @param exportName
     *        The name of the export associated with the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withExportName(String exportName) {
        setExportName(exportName);
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
        if (getOutputKey() != null)
            sb.append("OutputKey: ").append(getOutputKey()).append(",");
        if (getOutputValue() != null)
            sb.append("OutputValue: ").append(getOutputValue()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExportName() != null)
            sb.append("ExportName: ").append(getExportName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Output == false)
            return false;
        Output other = (Output) obj;
        if (other.getOutputKey() == null ^ this.getOutputKey() == null)
            return false;
        if (other.getOutputKey() != null && other.getOutputKey().equals(this.getOutputKey()) == false)
            return false;
        if (other.getOutputValue() == null ^ this.getOutputValue() == null)
            return false;
        if (other.getOutputValue() != null && other.getOutputValue().equals(this.getOutputValue()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExportName() == null ^ this.getExportName() == null)
            return false;
        if (other.getExportName() != null && other.getExportName().equals(this.getExportName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputKey() == null) ? 0 : getOutputKey().hashCode());
        hashCode = prime * hashCode + ((getOutputValue() == null) ? 0 : getOutputValue().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExportName() == null) ? 0 : getExportName().hashCode());
        return hashCode;
    }

    @Override
    public Output clone() {
        try {
            return (Output) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
