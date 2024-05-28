/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of <code>OutputAttribute</code> objects, each of which have the fields <code>Name</code> and
 * <code>Hashed</code>. Each of these objects selects a column to be included in the output table, and whether the
 * values of the column should be hashed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/OutputSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Customer KMS ARN for encryption at rest. If not provided, system will use an Entity Resolution managed KMS key.
     * </p>
     */
    private String kMSArn;
    /**
     * <p>
     * Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     * <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format of
     * 1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     * </p>
     */
    private Boolean applyNormalization;
    /**
     * <p>
     * A list of <code>OutputAttribute</code> objects, each of which have the fields <code>Name</code> and
     * <code>Hashed</code>. Each of these objects selects a column to be included in the output table, and whether the
     * values of the column should be hashed.
     * </p>
     */
    private java.util.List<OutputAttribute> output;
    /**
     * <p>
     * The S3 path to which Entity Resolution will write the output table.
     * </p>
     */
    private String outputS3Path;

    /**
     * <p>
     * Customer KMS ARN for encryption at rest. If not provided, system will use an Entity Resolution managed KMS key.
     * </p>
     * 
     * @param kMSArn
     *        Customer KMS ARN for encryption at rest. If not provided, system will use an Entity Resolution managed KMS
     *        key.
     */

    public void setKMSArn(String kMSArn) {
        this.kMSArn = kMSArn;
    }

    /**
     * <p>
     * Customer KMS ARN for encryption at rest. If not provided, system will use an Entity Resolution managed KMS key.
     * </p>
     * 
     * @return Customer KMS ARN for encryption at rest. If not provided, system will use an Entity Resolution managed
     *         KMS key.
     */

    public String getKMSArn() {
        return this.kMSArn;
    }

    /**
     * <p>
     * Customer KMS ARN for encryption at rest. If not provided, system will use an Entity Resolution managed KMS key.
     * </p>
     * 
     * @param kMSArn
     *        Customer KMS ARN for encryption at rest. If not provided, system will use an Entity Resolution managed KMS
     *        key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSource withKMSArn(String kMSArn) {
        setKMSArn(kMSArn);
        return this;
    }

    /**
     * <p>
     * Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     * <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format of
     * 1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     * </p>
     * 
     * @param applyNormalization
     *        Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     *        <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format of
     *        1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     */

    public void setApplyNormalization(Boolean applyNormalization) {
        this.applyNormalization = applyNormalization;
    }

    /**
     * <p>
     * Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     * <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format of
     * 1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     * </p>
     * 
     * @return Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     *         <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format
     *         of 1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     */

    public Boolean getApplyNormalization() {
        return this.applyNormalization;
    }

    /**
     * <p>
     * Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     * <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format of
     * 1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     * </p>
     * 
     * @param applyNormalization
     *        Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     *        <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format of
     *        1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSource withApplyNormalization(Boolean applyNormalization) {
        setApplyNormalization(applyNormalization);
        return this;
    }

    /**
     * <p>
     * Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     * <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format of
     * 1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     * </p>
     * 
     * @return Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     *         <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format
     *         of 1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     */

    public Boolean isApplyNormalization() {
        return this.applyNormalization;
    }

    /**
     * <p>
     * A list of <code>OutputAttribute</code> objects, each of which have the fields <code>Name</code> and
     * <code>Hashed</code>. Each of these objects selects a column to be included in the output table, and whether the
     * values of the column should be hashed.
     * </p>
     * 
     * @return A list of <code>OutputAttribute</code> objects, each of which have the fields <code>Name</code> and
     *         <code>Hashed</code>. Each of these objects selects a column to be included in the output table, and
     *         whether the values of the column should be hashed.
     */

    public java.util.List<OutputAttribute> getOutput() {
        return output;
    }

    /**
     * <p>
     * A list of <code>OutputAttribute</code> objects, each of which have the fields <code>Name</code> and
     * <code>Hashed</code>. Each of these objects selects a column to be included in the output table, and whether the
     * values of the column should be hashed.
     * </p>
     * 
     * @param output
     *        A list of <code>OutputAttribute</code> objects, each of which have the fields <code>Name</code> and
     *        <code>Hashed</code>. Each of these objects selects a column to be included in the output table, and
     *        whether the values of the column should be hashed.
     */

    public void setOutput(java.util.Collection<OutputAttribute> output) {
        if (output == null) {
            this.output = null;
            return;
        }

        this.output = new java.util.ArrayList<OutputAttribute>(output);
    }

    /**
     * <p>
     * A list of <code>OutputAttribute</code> objects, each of which have the fields <code>Name</code> and
     * <code>Hashed</code>. Each of these objects selects a column to be included in the output table, and whether the
     * values of the column should be hashed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutput(java.util.Collection)} or {@link #withOutput(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param output
     *        A list of <code>OutputAttribute</code> objects, each of which have the fields <code>Name</code> and
     *        <code>Hashed</code>. Each of these objects selects a column to be included in the output table, and
     *        whether the values of the column should be hashed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSource withOutput(OutputAttribute... output) {
        if (this.output == null) {
            setOutput(new java.util.ArrayList<OutputAttribute>(output.length));
        }
        for (OutputAttribute ele : output) {
            this.output.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>OutputAttribute</code> objects, each of which have the fields <code>Name</code> and
     * <code>Hashed</code>. Each of these objects selects a column to be included in the output table, and whether the
     * values of the column should be hashed.
     * </p>
     * 
     * @param output
     *        A list of <code>OutputAttribute</code> objects, each of which have the fields <code>Name</code> and
     *        <code>Hashed</code>. Each of these objects selects a column to be included in the output table, and
     *        whether the values of the column should be hashed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSource withOutput(java.util.Collection<OutputAttribute> output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * The S3 path to which Entity Resolution will write the output table.
     * </p>
     * 
     * @param outputS3Path
     *        The S3 path to which Entity Resolution will write the output table.
     */

    public void setOutputS3Path(String outputS3Path) {
        this.outputS3Path = outputS3Path;
    }

    /**
     * <p>
     * The S3 path to which Entity Resolution will write the output table.
     * </p>
     * 
     * @return The S3 path to which Entity Resolution will write the output table.
     */

    public String getOutputS3Path() {
        return this.outputS3Path;
    }

    /**
     * <p>
     * The S3 path to which Entity Resolution will write the output table.
     * </p>
     * 
     * @param outputS3Path
     *        The S3 path to which Entity Resolution will write the output table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputSource withOutputS3Path(String outputS3Path) {
        setOutputS3Path(outputS3Path);
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
        if (getKMSArn() != null)
            sb.append("KMSArn: ").append(getKMSArn()).append(",");
        if (getApplyNormalization() != null)
            sb.append("ApplyNormalization: ").append(getApplyNormalization()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput()).append(",");
        if (getOutputS3Path() != null)
            sb.append("OutputS3Path: ").append(getOutputS3Path());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputSource == false)
            return false;
        OutputSource other = (OutputSource) obj;
        if (other.getKMSArn() == null ^ this.getKMSArn() == null)
            return false;
        if (other.getKMSArn() != null && other.getKMSArn().equals(this.getKMSArn()) == false)
            return false;
        if (other.getApplyNormalization() == null ^ this.getApplyNormalization() == null)
            return false;
        if (other.getApplyNormalization() != null && other.getApplyNormalization().equals(this.getApplyNormalization()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getOutputS3Path() == null ^ this.getOutputS3Path() == null)
            return false;
        if (other.getOutputS3Path() != null && other.getOutputS3Path().equals(this.getOutputS3Path()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKMSArn() == null) ? 0 : getKMSArn().hashCode());
        hashCode = prime * hashCode + ((getApplyNormalization() == null) ? 0 : getApplyNormalization().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getOutputS3Path() == null) ? 0 : getOutputS3Path().hashCode());
        return hashCode;
    }

    @Override
    public OutputSource clone() {
        try {
            return (OutputSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.OutputSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
