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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on the metrics used to evalute the peformance of a given adapter version. Includes data for
 * baseline model performance and individual adapter version perfromance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AdapterVersionEvaluationMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdapterVersionEvaluationMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     */
    private EvaluationMetric baseline;
    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     */
    private EvaluationMetric adapterVersion;
    /**
     * <p>
     * Indicates the feature type being analyzed by a given adapter version.
     * </p>
     */
    private String featureType;

    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     * 
     * @param baseline
     *        The F1 score, precision, and recall metrics for the baseline model.
     */

    public void setBaseline(EvaluationMetric baseline) {
        this.baseline = baseline;
    }

    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     * 
     * @return The F1 score, precision, and recall metrics for the baseline model.
     */

    public EvaluationMetric getBaseline() {
        return this.baseline;
    }

    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     * 
     * @param baseline
     *        The F1 score, precision, and recall metrics for the baseline model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdapterVersionEvaluationMetric withBaseline(EvaluationMetric baseline) {
        setBaseline(baseline);
        return this;
    }

    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     * 
     * @param adapterVersion
     *        The F1 score, precision, and recall metrics for the baseline model.
     */

    public void setAdapterVersion(EvaluationMetric adapterVersion) {
        this.adapterVersion = adapterVersion;
    }

    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     * 
     * @return The F1 score, precision, and recall metrics for the baseline model.
     */

    public EvaluationMetric getAdapterVersion() {
        return this.adapterVersion;
    }

    /**
     * <p>
     * The F1 score, precision, and recall metrics for the baseline model.
     * </p>
     * 
     * @param adapterVersion
     *        The F1 score, precision, and recall metrics for the baseline model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdapterVersionEvaluationMetric withAdapterVersion(EvaluationMetric adapterVersion) {
        setAdapterVersion(adapterVersion);
        return this;
    }

    /**
     * <p>
     * Indicates the feature type being analyzed by a given adapter version.
     * </p>
     * 
     * @param featureType
     *        Indicates the feature type being analyzed by a given adapter version.
     * @see FeatureType
     */

    public void setFeatureType(String featureType) {
        this.featureType = featureType;
    }

    /**
     * <p>
     * Indicates the feature type being analyzed by a given adapter version.
     * </p>
     * 
     * @return Indicates the feature type being analyzed by a given adapter version.
     * @see FeatureType
     */

    public String getFeatureType() {
        return this.featureType;
    }

    /**
     * <p>
     * Indicates the feature type being analyzed by a given adapter version.
     * </p>
     * 
     * @param featureType
     *        Indicates the feature type being analyzed by a given adapter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public AdapterVersionEvaluationMetric withFeatureType(String featureType) {
        setFeatureType(featureType);
        return this;
    }

    /**
     * <p>
     * Indicates the feature type being analyzed by a given adapter version.
     * </p>
     * 
     * @param featureType
     *        Indicates the feature type being analyzed by a given adapter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public AdapterVersionEvaluationMetric withFeatureType(FeatureType featureType) {
        this.featureType = featureType.toString();
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
        if (getBaseline() != null)
            sb.append("Baseline: ").append(getBaseline()).append(",");
        if (getAdapterVersion() != null)
            sb.append("AdapterVersion: ").append(getAdapterVersion()).append(",");
        if (getFeatureType() != null)
            sb.append("FeatureType: ").append(getFeatureType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdapterVersionEvaluationMetric == false)
            return false;
        AdapterVersionEvaluationMetric other = (AdapterVersionEvaluationMetric) obj;
        if (other.getBaseline() == null ^ this.getBaseline() == null)
            return false;
        if (other.getBaseline() != null && other.getBaseline().equals(this.getBaseline()) == false)
            return false;
        if (other.getAdapterVersion() == null ^ this.getAdapterVersion() == null)
            return false;
        if (other.getAdapterVersion() != null && other.getAdapterVersion().equals(this.getAdapterVersion()) == false)
            return false;
        if (other.getFeatureType() == null ^ this.getFeatureType() == null)
            return false;
        if (other.getFeatureType() != null && other.getFeatureType().equals(this.getFeatureType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseline() == null) ? 0 : getBaseline().hashCode());
        hashCode = prime * hashCode + ((getAdapterVersion() == null) ? 0 : getAdapterVersion().hashCode());
        hashCode = prime * hashCode + ((getFeatureType() == null) ? 0 : getFeatureType().hashCode());
        return hashCode;
    }

    @Override
    public AdapterVersionEvaluationMetric clone() {
        try {
            return (AdapterVersionEvaluationMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.AdapterVersionEvaluationMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
