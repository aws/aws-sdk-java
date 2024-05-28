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
 * Describes the result of the evaluation of a data quality analyzer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DataQualityAnalyzerResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualityAnalyzerResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data quality analyzer.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the data quality analyzer.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An evaluation message.
     * </p>
     */
    private String evaluationMessage;
    /**
     * <p>
     * A map of metrics associated with the evaluation of the analyzer.
     * </p>
     */
    private java.util.Map<String, Double> evaluatedMetrics;

    /**
     * <p>
     * The name of the data quality analyzer.
     * </p>
     * 
     * @param name
     *        The name of the data quality analyzer.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data quality analyzer.
     * </p>
     * 
     * @return The name of the data quality analyzer.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data quality analyzer.
     * </p>
     * 
     * @param name
     *        The name of the data quality analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityAnalyzerResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the data quality analyzer.
     * </p>
     * 
     * @param description
     *        A description of the data quality analyzer.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the data quality analyzer.
     * </p>
     * 
     * @return A description of the data quality analyzer.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the data quality analyzer.
     * </p>
     * 
     * @param description
     *        A description of the data quality analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityAnalyzerResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An evaluation message.
     * </p>
     * 
     * @param evaluationMessage
     *        An evaluation message.
     */

    public void setEvaluationMessage(String evaluationMessage) {
        this.evaluationMessage = evaluationMessage;
    }

    /**
     * <p>
     * An evaluation message.
     * </p>
     * 
     * @return An evaluation message.
     */

    public String getEvaluationMessage() {
        return this.evaluationMessage;
    }

    /**
     * <p>
     * An evaluation message.
     * </p>
     * 
     * @param evaluationMessage
     *        An evaluation message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityAnalyzerResult withEvaluationMessage(String evaluationMessage) {
        setEvaluationMessage(evaluationMessage);
        return this;
    }

    /**
     * <p>
     * A map of metrics associated with the evaluation of the analyzer.
     * </p>
     * 
     * @return A map of metrics associated with the evaluation of the analyzer.
     */

    public java.util.Map<String, Double> getEvaluatedMetrics() {
        return evaluatedMetrics;
    }

    /**
     * <p>
     * A map of metrics associated with the evaluation of the analyzer.
     * </p>
     * 
     * @param evaluatedMetrics
     *        A map of metrics associated with the evaluation of the analyzer.
     */

    public void setEvaluatedMetrics(java.util.Map<String, Double> evaluatedMetrics) {
        this.evaluatedMetrics = evaluatedMetrics;
    }

    /**
     * <p>
     * A map of metrics associated with the evaluation of the analyzer.
     * </p>
     * 
     * @param evaluatedMetrics
     *        A map of metrics associated with the evaluation of the analyzer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityAnalyzerResult withEvaluatedMetrics(java.util.Map<String, Double> evaluatedMetrics) {
        setEvaluatedMetrics(evaluatedMetrics);
        return this;
    }

    /**
     * Add a single EvaluatedMetrics entry
     *
     * @see DataQualityAnalyzerResult#withEvaluatedMetrics
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityAnalyzerResult addEvaluatedMetricsEntry(String key, Double value) {
        if (null == this.evaluatedMetrics) {
            this.evaluatedMetrics = new java.util.HashMap<String, Double>();
        }
        if (this.evaluatedMetrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.evaluatedMetrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EvaluatedMetrics.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityAnalyzerResult clearEvaluatedMetricsEntries() {
        this.evaluatedMetrics = null;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEvaluationMessage() != null)
            sb.append("EvaluationMessage: ").append(getEvaluationMessage()).append(",");
        if (getEvaluatedMetrics() != null)
            sb.append("EvaluatedMetrics: ").append(getEvaluatedMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQualityAnalyzerResult == false)
            return false;
        DataQualityAnalyzerResult other = (DataQualityAnalyzerResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEvaluationMessage() == null ^ this.getEvaluationMessage() == null)
            return false;
        if (other.getEvaluationMessage() != null && other.getEvaluationMessage().equals(this.getEvaluationMessage()) == false)
            return false;
        if (other.getEvaluatedMetrics() == null ^ this.getEvaluatedMetrics() == null)
            return false;
        if (other.getEvaluatedMetrics() != null && other.getEvaluatedMetrics().equals(this.getEvaluatedMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEvaluationMessage() == null) ? 0 : getEvaluationMessage().hashCode());
        hashCode = prime * hashCode + ((getEvaluatedMetrics() == null) ? 0 : getEvaluatedMetrics().hashCode());
        return hashCode;
    }

    @Override
    public DataQualityAnalyzerResult clone() {
        try {
            return (DataQualityAnalyzerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DataQualityAnalyzerResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
