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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/SqlApplicationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqlApplicationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The array of <a>Input</a> objects describing the input streams used by the application.
     * </p>
     */
    private java.util.List<Input> inputs;
    /**
     * <p>
     * The array of <a>Output</a> objects describing the destination streams used by the application.
     * </p>
     */
    private java.util.List<Output> outputs;
    /**
     * <p>
     * The array of <a>ReferenceDataSource</a> objects describing the reference data sources used by the application.
     * </p>
     */
    private java.util.List<ReferenceDataSource> referenceDataSources;

    /**
     * <p>
     * The array of <a>Input</a> objects describing the input streams used by the application.
     * </p>
     * 
     * @return The array of <a>Input</a> objects describing the input streams used by the application.
     */

    public java.util.List<Input> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The array of <a>Input</a> objects describing the input streams used by the application.
     * </p>
     * 
     * @param inputs
     *        The array of <a>Input</a> objects describing the input streams used by the application.
     */

    public void setInputs(java.util.Collection<Input> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<Input>(inputs);
    }

    /**
     * <p>
     * The array of <a>Input</a> objects describing the input streams used by the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The array of <a>Input</a> objects describing the input streams used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfiguration withInputs(Input... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<Input>(inputs.length));
        }
        for (Input ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of <a>Input</a> objects describing the input streams used by the application.
     * </p>
     * 
     * @param inputs
     *        The array of <a>Input</a> objects describing the input streams used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfiguration withInputs(java.util.Collection<Input> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * The array of <a>Output</a> objects describing the destination streams used by the application.
     * </p>
     * 
     * @return The array of <a>Output</a> objects describing the destination streams used by the application.
     */

    public java.util.List<Output> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The array of <a>Output</a> objects describing the destination streams used by the application.
     * </p>
     * 
     * @param outputs
     *        The array of <a>Output</a> objects describing the destination streams used by the application.
     */

    public void setOutputs(java.util.Collection<Output> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<Output>(outputs);
    }

    /**
     * <p>
     * The array of <a>Output</a> objects describing the destination streams used by the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The array of <a>Output</a> objects describing the destination streams used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfiguration withOutputs(Output... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<Output>(outputs.length));
        }
        for (Output ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of <a>Output</a> objects describing the destination streams used by the application.
     * </p>
     * 
     * @param outputs
     *        The array of <a>Output</a> objects describing the destination streams used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfiguration withOutputs(java.util.Collection<Output> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The array of <a>ReferenceDataSource</a> objects describing the reference data sources used by the application.
     * </p>
     * 
     * @return The array of <a>ReferenceDataSource</a> objects describing the reference data sources used by the
     *         application.
     */

    public java.util.List<ReferenceDataSource> getReferenceDataSources() {
        return referenceDataSources;
    }

    /**
     * <p>
     * The array of <a>ReferenceDataSource</a> objects describing the reference data sources used by the application.
     * </p>
     * 
     * @param referenceDataSources
     *        The array of <a>ReferenceDataSource</a> objects describing the reference data sources used by the
     *        application.
     */

    public void setReferenceDataSources(java.util.Collection<ReferenceDataSource> referenceDataSources) {
        if (referenceDataSources == null) {
            this.referenceDataSources = null;
            return;
        }

        this.referenceDataSources = new java.util.ArrayList<ReferenceDataSource>(referenceDataSources);
    }

    /**
     * <p>
     * The array of <a>ReferenceDataSource</a> objects describing the reference data sources used by the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferenceDataSources(java.util.Collection)} or {@link #withReferenceDataSources(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param referenceDataSources
     *        The array of <a>ReferenceDataSource</a> objects describing the reference data sources used by the
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfiguration withReferenceDataSources(ReferenceDataSource... referenceDataSources) {
        if (this.referenceDataSources == null) {
            setReferenceDataSources(new java.util.ArrayList<ReferenceDataSource>(referenceDataSources.length));
        }
        for (ReferenceDataSource ele : referenceDataSources) {
            this.referenceDataSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of <a>ReferenceDataSource</a> objects describing the reference data sources used by the application.
     * </p>
     * 
     * @param referenceDataSources
     *        The array of <a>ReferenceDataSource</a> objects describing the reference data sources used by the
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfiguration withReferenceDataSources(java.util.Collection<ReferenceDataSource> referenceDataSources) {
        setReferenceDataSources(referenceDataSources);
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
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getReferenceDataSources() != null)
            sb.append("ReferenceDataSources: ").append(getReferenceDataSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqlApplicationConfiguration == false)
            return false;
        SqlApplicationConfiguration other = (SqlApplicationConfiguration) obj;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getReferenceDataSources() == null ^ this.getReferenceDataSources() == null)
            return false;
        if (other.getReferenceDataSources() != null && other.getReferenceDataSources().equals(this.getReferenceDataSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getReferenceDataSources() == null) ? 0 : getReferenceDataSources().hashCode());
        return hashCode;
    }

    @Override
    public SqlApplicationConfiguration clone() {
        try {
            return (SqlApplicationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.SqlApplicationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
