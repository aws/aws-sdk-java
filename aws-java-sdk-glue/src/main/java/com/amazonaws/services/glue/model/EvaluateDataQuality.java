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
 * Specifies your data quality evaluation criteria.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/EvaluateDataQuality" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluateDataQuality implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data quality evaluation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The inputs of your data quality evaluation.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * The ruleset for your data quality evaluation.
     * </p>
     */
    private String ruleset;
    /**
     * <p>
     * The output of your data quality evaluation.
     * </p>
     */
    private String output;
    /**
     * <p>
     * Options to configure how your results are published.
     * </p>
     */
    private DQResultsPublishingOptions publishingOptions;
    /**
     * <p>
     * Options to configure how your job will stop if your data quality evaluation fails.
     * </p>
     */
    private DQStopJobOnFailureOptions stopJobOnFailureOptions;

    /**
     * <p>
     * The name of the data quality evaluation.
     * </p>
     * 
     * @param name
     *        The name of the data quality evaluation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data quality evaluation.
     * </p>
     * 
     * @return The name of the data quality evaluation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data quality evaluation.
     * </p>
     * 
     * @param name
     *        The name of the data quality evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateDataQuality withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The inputs of your data quality evaluation.
     * </p>
     * 
     * @return The inputs of your data quality evaluation.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The inputs of your data quality evaluation.
     * </p>
     * 
     * @param inputs
     *        The inputs of your data quality evaluation.
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
     * The inputs of your data quality evaluation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The inputs of your data quality evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateDataQuality withInputs(String... inputs) {
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
     * The inputs of your data quality evaluation.
     * </p>
     * 
     * @param inputs
     *        The inputs of your data quality evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateDataQuality withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * The ruleset for your data quality evaluation.
     * </p>
     * 
     * @param ruleset
     *        The ruleset for your data quality evaluation.
     */

    public void setRuleset(String ruleset) {
        this.ruleset = ruleset;
    }

    /**
     * <p>
     * The ruleset for your data quality evaluation.
     * </p>
     * 
     * @return The ruleset for your data quality evaluation.
     */

    public String getRuleset() {
        return this.ruleset;
    }

    /**
     * <p>
     * The ruleset for your data quality evaluation.
     * </p>
     * 
     * @param ruleset
     *        The ruleset for your data quality evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateDataQuality withRuleset(String ruleset) {
        setRuleset(ruleset);
        return this;
    }

    /**
     * <p>
     * The output of your data quality evaluation.
     * </p>
     * 
     * @param output
     *        The output of your data quality evaluation.
     * @see DQTransformOutput
     */

    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * <p>
     * The output of your data quality evaluation.
     * </p>
     * 
     * @return The output of your data quality evaluation.
     * @see DQTransformOutput
     */

    public String getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The output of your data quality evaluation.
     * </p>
     * 
     * @param output
     *        The output of your data quality evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DQTransformOutput
     */

    public EvaluateDataQuality withOutput(String output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * The output of your data quality evaluation.
     * </p>
     * 
     * @param output
     *        The output of your data quality evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DQTransformOutput
     */

    public EvaluateDataQuality withOutput(DQTransformOutput output) {
        this.output = output.toString();
        return this;
    }

    /**
     * <p>
     * Options to configure how your results are published.
     * </p>
     * 
     * @param publishingOptions
     *        Options to configure how your results are published.
     */

    public void setPublishingOptions(DQResultsPublishingOptions publishingOptions) {
        this.publishingOptions = publishingOptions;
    }

    /**
     * <p>
     * Options to configure how your results are published.
     * </p>
     * 
     * @return Options to configure how your results are published.
     */

    public DQResultsPublishingOptions getPublishingOptions() {
        return this.publishingOptions;
    }

    /**
     * <p>
     * Options to configure how your results are published.
     * </p>
     * 
     * @param publishingOptions
     *        Options to configure how your results are published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateDataQuality withPublishingOptions(DQResultsPublishingOptions publishingOptions) {
        setPublishingOptions(publishingOptions);
        return this;
    }

    /**
     * <p>
     * Options to configure how your job will stop if your data quality evaluation fails.
     * </p>
     * 
     * @param stopJobOnFailureOptions
     *        Options to configure how your job will stop if your data quality evaluation fails.
     */

    public void setStopJobOnFailureOptions(DQStopJobOnFailureOptions stopJobOnFailureOptions) {
        this.stopJobOnFailureOptions = stopJobOnFailureOptions;
    }

    /**
     * <p>
     * Options to configure how your job will stop if your data quality evaluation fails.
     * </p>
     * 
     * @return Options to configure how your job will stop if your data quality evaluation fails.
     */

    public DQStopJobOnFailureOptions getStopJobOnFailureOptions() {
        return this.stopJobOnFailureOptions;
    }

    /**
     * <p>
     * Options to configure how your job will stop if your data quality evaluation fails.
     * </p>
     * 
     * @param stopJobOnFailureOptions
     *        Options to configure how your job will stop if your data quality evaluation fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateDataQuality withStopJobOnFailureOptions(DQStopJobOnFailureOptions stopJobOnFailureOptions) {
        setStopJobOnFailureOptions(stopJobOnFailureOptions);
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
        if (getRuleset() != null)
            sb.append("Ruleset: ").append(getRuleset()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput()).append(",");
        if (getPublishingOptions() != null)
            sb.append("PublishingOptions: ").append(getPublishingOptions()).append(",");
        if (getStopJobOnFailureOptions() != null)
            sb.append("StopJobOnFailureOptions: ").append(getStopJobOnFailureOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluateDataQuality == false)
            return false;
        EvaluateDataQuality other = (EvaluateDataQuality) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getRuleset() == null ^ this.getRuleset() == null)
            return false;
        if (other.getRuleset() != null && other.getRuleset().equals(this.getRuleset()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getPublishingOptions() == null ^ this.getPublishingOptions() == null)
            return false;
        if (other.getPublishingOptions() != null && other.getPublishingOptions().equals(this.getPublishingOptions()) == false)
            return false;
        if (other.getStopJobOnFailureOptions() == null ^ this.getStopJobOnFailureOptions() == null)
            return false;
        if (other.getStopJobOnFailureOptions() != null && other.getStopJobOnFailureOptions().equals(this.getStopJobOnFailureOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getRuleset() == null) ? 0 : getRuleset().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getPublishingOptions() == null) ? 0 : getPublishingOptions().hashCode());
        hashCode = prime * hashCode + ((getStopJobOnFailureOptions() == null) ? 0 : getStopJobOnFailureOptions().hashCode());
        return hashCode;
    }

    @Override
    public EvaluateDataQuality clone() {
        try {
            return (EvaluateDataQuality) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.EvaluateDataQualityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
