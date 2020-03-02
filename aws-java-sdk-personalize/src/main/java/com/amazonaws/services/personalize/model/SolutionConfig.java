/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration properties for the solution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/SolutionConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SolutionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Only events with a value greater than or equal to this threshold are used for training a model.
     * </p>
     */
    private String eventValueThreshold;
    /**
     * <p>
     * Describes the properties for hyperparameter optimization (HPO).
     * </p>
     */
    private HPOConfig hpoConfig;
    /**
     * <p>
     * Lists the hyperparameter names and ranges.
     * </p>
     */
    private java.util.Map<String, String> algorithmHyperParameters;
    /**
     * <p>
     * Lists the feature transformation parameters.
     * </p>
     */
    private java.util.Map<String, String> featureTransformationParameters;
    /**
     * <p>
     * The <a>AutoMLConfig</a> object containing a list of recipes to search when AutoML is performed.
     * </p>
     */
    private AutoMLConfig autoMLConfig;

    /**
     * <p>
     * Only events with a value greater than or equal to this threshold are used for training a model.
     * </p>
     * 
     * @param eventValueThreshold
     *        Only events with a value greater than or equal to this threshold are used for training a model.
     */

    public void setEventValueThreshold(String eventValueThreshold) {
        this.eventValueThreshold = eventValueThreshold;
    }

    /**
     * <p>
     * Only events with a value greater than or equal to this threshold are used for training a model.
     * </p>
     * 
     * @return Only events with a value greater than or equal to this threshold are used for training a model.
     */

    public String getEventValueThreshold() {
        return this.eventValueThreshold;
    }

    /**
     * <p>
     * Only events with a value greater than or equal to this threshold are used for training a model.
     * </p>
     * 
     * @param eventValueThreshold
     *        Only events with a value greater than or equal to this threshold are used for training a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionConfig withEventValueThreshold(String eventValueThreshold) {
        setEventValueThreshold(eventValueThreshold);
        return this;
    }

    /**
     * <p>
     * Describes the properties for hyperparameter optimization (HPO).
     * </p>
     * 
     * @param hpoConfig
     *        Describes the properties for hyperparameter optimization (HPO).
     */

    public void setHpoConfig(HPOConfig hpoConfig) {
        this.hpoConfig = hpoConfig;
    }

    /**
     * <p>
     * Describes the properties for hyperparameter optimization (HPO).
     * </p>
     * 
     * @return Describes the properties for hyperparameter optimization (HPO).
     */

    public HPOConfig getHpoConfig() {
        return this.hpoConfig;
    }

    /**
     * <p>
     * Describes the properties for hyperparameter optimization (HPO).
     * </p>
     * 
     * @param hpoConfig
     *        Describes the properties for hyperparameter optimization (HPO).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionConfig withHpoConfig(HPOConfig hpoConfig) {
        setHpoConfig(hpoConfig);
        return this;
    }

    /**
     * <p>
     * Lists the hyperparameter names and ranges.
     * </p>
     * 
     * @return Lists the hyperparameter names and ranges.
     */

    public java.util.Map<String, String> getAlgorithmHyperParameters() {
        return algorithmHyperParameters;
    }

    /**
     * <p>
     * Lists the hyperparameter names and ranges.
     * </p>
     * 
     * @param algorithmHyperParameters
     *        Lists the hyperparameter names and ranges.
     */

    public void setAlgorithmHyperParameters(java.util.Map<String, String> algorithmHyperParameters) {
        this.algorithmHyperParameters = algorithmHyperParameters;
    }

    /**
     * <p>
     * Lists the hyperparameter names and ranges.
     * </p>
     * 
     * @param algorithmHyperParameters
     *        Lists the hyperparameter names and ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionConfig withAlgorithmHyperParameters(java.util.Map<String, String> algorithmHyperParameters) {
        setAlgorithmHyperParameters(algorithmHyperParameters);
        return this;
    }

    /**
     * Add a single AlgorithmHyperParameters entry
     *
     * @see SolutionConfig#withAlgorithmHyperParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SolutionConfig addAlgorithmHyperParametersEntry(String key, String value) {
        if (null == this.algorithmHyperParameters) {
            this.algorithmHyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.algorithmHyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.algorithmHyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AlgorithmHyperParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionConfig clearAlgorithmHyperParametersEntries() {
        this.algorithmHyperParameters = null;
        return this;
    }

    /**
     * <p>
     * Lists the feature transformation parameters.
     * </p>
     * 
     * @return Lists the feature transformation parameters.
     */

    public java.util.Map<String, String> getFeatureTransformationParameters() {
        return featureTransformationParameters;
    }

    /**
     * <p>
     * Lists the feature transformation parameters.
     * </p>
     * 
     * @param featureTransformationParameters
     *        Lists the feature transformation parameters.
     */

    public void setFeatureTransformationParameters(java.util.Map<String, String> featureTransformationParameters) {
        this.featureTransformationParameters = featureTransformationParameters;
    }

    /**
     * <p>
     * Lists the feature transformation parameters.
     * </p>
     * 
     * @param featureTransformationParameters
     *        Lists the feature transformation parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionConfig withFeatureTransformationParameters(java.util.Map<String, String> featureTransformationParameters) {
        setFeatureTransformationParameters(featureTransformationParameters);
        return this;
    }

    /**
     * Add a single FeatureTransformationParameters entry
     *
     * @see SolutionConfig#withFeatureTransformationParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SolutionConfig addFeatureTransformationParametersEntry(String key, String value) {
        if (null == this.featureTransformationParameters) {
            this.featureTransformationParameters = new java.util.HashMap<String, String>();
        }
        if (this.featureTransformationParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.featureTransformationParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FeatureTransformationParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionConfig clearFeatureTransformationParametersEntries() {
        this.featureTransformationParameters = null;
        return this;
    }

    /**
     * <p>
     * The <a>AutoMLConfig</a> object containing a list of recipes to search when AutoML is performed.
     * </p>
     * 
     * @param autoMLConfig
     *        The <a>AutoMLConfig</a> object containing a list of recipes to search when AutoML is performed.
     */

    public void setAutoMLConfig(AutoMLConfig autoMLConfig) {
        this.autoMLConfig = autoMLConfig;
    }

    /**
     * <p>
     * The <a>AutoMLConfig</a> object containing a list of recipes to search when AutoML is performed.
     * </p>
     * 
     * @return The <a>AutoMLConfig</a> object containing a list of recipes to search when AutoML is performed.
     */

    public AutoMLConfig getAutoMLConfig() {
        return this.autoMLConfig;
    }

    /**
     * <p>
     * The <a>AutoMLConfig</a> object containing a list of recipes to search when AutoML is performed.
     * </p>
     * 
     * @param autoMLConfig
     *        The <a>AutoMLConfig</a> object containing a list of recipes to search when AutoML is performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionConfig withAutoMLConfig(AutoMLConfig autoMLConfig) {
        setAutoMLConfig(autoMLConfig);
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
        if (getEventValueThreshold() != null)
            sb.append("EventValueThreshold: ").append(getEventValueThreshold()).append(",");
        if (getHpoConfig() != null)
            sb.append("HpoConfig: ").append(getHpoConfig()).append(",");
        if (getAlgorithmHyperParameters() != null)
            sb.append("AlgorithmHyperParameters: ").append(getAlgorithmHyperParameters()).append(",");
        if (getFeatureTransformationParameters() != null)
            sb.append("FeatureTransformationParameters: ").append(getFeatureTransformationParameters()).append(",");
        if (getAutoMLConfig() != null)
            sb.append("AutoMLConfig: ").append(getAutoMLConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SolutionConfig == false)
            return false;
        SolutionConfig other = (SolutionConfig) obj;
        if (other.getEventValueThreshold() == null ^ this.getEventValueThreshold() == null)
            return false;
        if (other.getEventValueThreshold() != null && other.getEventValueThreshold().equals(this.getEventValueThreshold()) == false)
            return false;
        if (other.getHpoConfig() == null ^ this.getHpoConfig() == null)
            return false;
        if (other.getHpoConfig() != null && other.getHpoConfig().equals(this.getHpoConfig()) == false)
            return false;
        if (other.getAlgorithmHyperParameters() == null ^ this.getAlgorithmHyperParameters() == null)
            return false;
        if (other.getAlgorithmHyperParameters() != null && other.getAlgorithmHyperParameters().equals(this.getAlgorithmHyperParameters()) == false)
            return false;
        if (other.getFeatureTransformationParameters() == null ^ this.getFeatureTransformationParameters() == null)
            return false;
        if (other.getFeatureTransformationParameters() != null
                && other.getFeatureTransformationParameters().equals(this.getFeatureTransformationParameters()) == false)
            return false;
        if (other.getAutoMLConfig() == null ^ this.getAutoMLConfig() == null)
            return false;
        if (other.getAutoMLConfig() != null && other.getAutoMLConfig().equals(this.getAutoMLConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventValueThreshold() == null) ? 0 : getEventValueThreshold().hashCode());
        hashCode = prime * hashCode + ((getHpoConfig() == null) ? 0 : getHpoConfig().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmHyperParameters() == null) ? 0 : getAlgorithmHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getFeatureTransformationParameters() == null) ? 0 : getFeatureTransformationParameters().hashCode());
        hashCode = prime * hashCode + ((getAutoMLConfig() == null) ? 0 : getAutoMLConfig().hashCode());
        return hashCode;
    }

    @Override
    public SolutionConfig clone() {
        try {
            return (SolutionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.SolutionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
