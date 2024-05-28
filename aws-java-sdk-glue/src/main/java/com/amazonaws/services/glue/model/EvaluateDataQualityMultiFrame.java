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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/EvaluateDataQualityMultiFrame" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluateDataQualityMultiFrame implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data quality evaluation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The inputs of your data quality evaluation. The first input in this list is the primary data source.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * The aliases of all data sources except primary.
     * </p>
     */
    private java.util.Map<String, String> additionalDataSources;
    /**
     * <p>
     * The ruleset for your data quality evaluation.
     * </p>
     */
    private String ruleset;
    /**
     * <p>
     * Options to configure how your results are published.
     * </p>
     */
    private DQResultsPublishingOptions publishingOptions;
    /**
     * <p>
     * Options to configure runtime behavior of the transform.
     * </p>
     */
    private java.util.Map<String, String> additionalOptions;
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

    public EvaluateDataQualityMultiFrame withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The inputs of your data quality evaluation. The first input in this list is the primary data source.
     * </p>
     * 
     * @return The inputs of your data quality evaluation. The first input in this list is the primary data source.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The inputs of your data quality evaluation. The first input in this list is the primary data source.
     * </p>
     * 
     * @param inputs
     *        The inputs of your data quality evaluation. The first input in this list is the primary data source.
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
     * The inputs of your data quality evaluation. The first input in this list is the primary data source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The inputs of your data quality evaluation. The first input in this list is the primary data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateDataQualityMultiFrame withInputs(String... inputs) {
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
     * The inputs of your data quality evaluation. The first input in this list is the primary data source.
     * </p>
     * 
     * @param inputs
     *        The inputs of your data quality evaluation. The first input in this list is the primary data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateDataQualityMultiFrame withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * The aliases of all data sources except primary.
     * </p>
     * 
     * @return The aliases of all data sources except primary.
     */

    public java.util.Map<String, String> getAdditionalDataSources() {
        return additionalDataSources;
    }

    /**
     * <p>
     * The aliases of all data sources except primary.
     * </p>
     * 
     * @param additionalDataSources
     *        The aliases of all data sources except primary.
     */

    public void setAdditionalDataSources(java.util.Map<String, String> additionalDataSources) {
        this.additionalDataSources = additionalDataSources;
    }

    /**
     * <p>
     * The aliases of all data sources except primary.
     * </p>
     * 
     * @param additionalDataSources
     *        The aliases of all data sources except primary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateDataQualityMultiFrame withAdditionalDataSources(java.util.Map<String, String> additionalDataSources) {
        setAdditionalDataSources(additionalDataSources);
        return this;
    }

    /**
     * Add a single AdditionalDataSources entry
     *
     * @see EvaluateDataQualityMultiFrame#withAdditionalDataSources
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateDataQualityMultiFrame addAdditionalDataSourcesEntry(String key, String value) {
        if (null == this.additionalDataSources) {
            this.additionalDataSources = new java.util.HashMap<String, String>();
        }
        if (this.additionalDataSources.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalDataSources.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalDataSources.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateDataQualityMultiFrame clearAdditionalDataSourcesEntries() {
        this.additionalDataSources = null;
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

    public EvaluateDataQualityMultiFrame withRuleset(String ruleset) {
        setRuleset(ruleset);
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

    public EvaluateDataQualityMultiFrame withPublishingOptions(DQResultsPublishingOptions publishingOptions) {
        setPublishingOptions(publishingOptions);
        return this;
    }

    /**
     * <p>
     * Options to configure runtime behavior of the transform.
     * </p>
     * 
     * @return Options to configure runtime behavior of the transform.
     */

    public java.util.Map<String, String> getAdditionalOptions() {
        return additionalOptions;
    }

    /**
     * <p>
     * Options to configure runtime behavior of the transform.
     * </p>
     * 
     * @param additionalOptions
     *        Options to configure runtime behavior of the transform.
     */

    public void setAdditionalOptions(java.util.Map<String, String> additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    /**
     * <p>
     * Options to configure runtime behavior of the transform.
     * </p>
     * 
     * @param additionalOptions
     *        Options to configure runtime behavior of the transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateDataQualityMultiFrame withAdditionalOptions(java.util.Map<String, String> additionalOptions) {
        setAdditionalOptions(additionalOptions);
        return this;
    }

    /**
     * Add a single AdditionalOptions entry
     *
     * @see EvaluateDataQualityMultiFrame#withAdditionalOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateDataQualityMultiFrame addAdditionalOptionsEntry(String key, String value) {
        if (null == this.additionalOptions) {
            this.additionalOptions = new java.util.HashMap<String, String>();
        }
        if (this.additionalOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateDataQualityMultiFrame clearAdditionalOptionsEntries() {
        this.additionalOptions = null;
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

    public EvaluateDataQualityMultiFrame withStopJobOnFailureOptions(DQStopJobOnFailureOptions stopJobOnFailureOptions) {
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
        if (getAdditionalDataSources() != null)
            sb.append("AdditionalDataSources: ").append(getAdditionalDataSources()).append(",");
        if (getRuleset() != null)
            sb.append("Ruleset: ").append(getRuleset()).append(",");
        if (getPublishingOptions() != null)
            sb.append("PublishingOptions: ").append(getPublishingOptions()).append(",");
        if (getAdditionalOptions() != null)
            sb.append("AdditionalOptions: ").append(getAdditionalOptions()).append(",");
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

        if (obj instanceof EvaluateDataQualityMultiFrame == false)
            return false;
        EvaluateDataQualityMultiFrame other = (EvaluateDataQualityMultiFrame) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getAdditionalDataSources() == null ^ this.getAdditionalDataSources() == null)
            return false;
        if (other.getAdditionalDataSources() != null && other.getAdditionalDataSources().equals(this.getAdditionalDataSources()) == false)
            return false;
        if (other.getRuleset() == null ^ this.getRuleset() == null)
            return false;
        if (other.getRuleset() != null && other.getRuleset().equals(this.getRuleset()) == false)
            return false;
        if (other.getPublishingOptions() == null ^ this.getPublishingOptions() == null)
            return false;
        if (other.getPublishingOptions() != null && other.getPublishingOptions().equals(this.getPublishingOptions()) == false)
            return false;
        if (other.getAdditionalOptions() == null ^ this.getAdditionalOptions() == null)
            return false;
        if (other.getAdditionalOptions() != null && other.getAdditionalOptions().equals(this.getAdditionalOptions()) == false)
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
        hashCode = prime * hashCode + ((getAdditionalDataSources() == null) ? 0 : getAdditionalDataSources().hashCode());
        hashCode = prime * hashCode + ((getRuleset() == null) ? 0 : getRuleset().hashCode());
        hashCode = prime * hashCode + ((getPublishingOptions() == null) ? 0 : getPublishingOptions().hashCode());
        hashCode = prime * hashCode + ((getAdditionalOptions() == null) ? 0 : getAdditionalOptions().hashCode());
        hashCode = prime * hashCode + ((getStopJobOnFailureOptions() == null) ? 0 : getStopJobOnFailureOptions().hashCode());
        return hashCode;
    }

    @Override
    public EvaluateDataQualityMultiFrame clone() {
        try {
            return (EvaluateDataQualityMultiFrame) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.EvaluateDataQualityMultiFrameMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
