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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateFeatureMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFeatureMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the feature group containing the feature that you're updating.
     * </p>
     */
    private String featureGroupName;
    /**
     * <p>
     * The name of the feature that you're updating.
     * </p>
     */
    private String featureName;
    /**
     * <p>
     * A description that you can write to better describe the feature.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of key-value pairs that you can add to better describe the feature.
     * </p>
     */
    private java.util.List<FeatureParameter> parameterAdditions;
    /**
     * <p>
     * A list of parameter keys that you can specify to remove parameters that describe your feature.
     * </p>
     */
    private java.util.List<String> parameterRemovals;

    /**
     * <p>
     * The name of the feature group containing the feature that you're updating.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group containing the feature that you're updating.
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group containing the feature that you're updating.
     * </p>
     * 
     * @return The name of the feature group containing the feature that you're updating.
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group containing the feature that you're updating.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group containing the feature that you're updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureMetadataRequest withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the feature that you're updating.
     * </p>
     * 
     * @param featureName
     *        The name of the feature that you're updating.
     */

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    /**
     * <p>
     * The name of the feature that you're updating.
     * </p>
     * 
     * @return The name of the feature that you're updating.
     */

    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * <p>
     * The name of the feature that you're updating.
     * </p>
     * 
     * @param featureName
     *        The name of the feature that you're updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureMetadataRequest withFeatureName(String featureName) {
        setFeatureName(featureName);
        return this;
    }

    /**
     * <p>
     * A description that you can write to better describe the feature.
     * </p>
     * 
     * @param description
     *        A description that you can write to better describe the feature.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description that you can write to better describe the feature.
     * </p>
     * 
     * @return A description that you can write to better describe the feature.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description that you can write to better describe the feature.
     * </p>
     * 
     * @param description
     *        A description that you can write to better describe the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureMetadataRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that you can add to better describe the feature.
     * </p>
     * 
     * @return A list of key-value pairs that you can add to better describe the feature.
     */

    public java.util.List<FeatureParameter> getParameterAdditions() {
        return parameterAdditions;
    }

    /**
     * <p>
     * A list of key-value pairs that you can add to better describe the feature.
     * </p>
     * 
     * @param parameterAdditions
     *        A list of key-value pairs that you can add to better describe the feature.
     */

    public void setParameterAdditions(java.util.Collection<FeatureParameter> parameterAdditions) {
        if (parameterAdditions == null) {
            this.parameterAdditions = null;
            return;
        }

        this.parameterAdditions = new java.util.ArrayList<FeatureParameter>(parameterAdditions);
    }

    /**
     * <p>
     * A list of key-value pairs that you can add to better describe the feature.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterAdditions(java.util.Collection)} or {@link #withParameterAdditions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param parameterAdditions
     *        A list of key-value pairs that you can add to better describe the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureMetadataRequest withParameterAdditions(FeatureParameter... parameterAdditions) {
        if (this.parameterAdditions == null) {
            setParameterAdditions(new java.util.ArrayList<FeatureParameter>(parameterAdditions.length));
        }
        for (FeatureParameter ele : parameterAdditions) {
            this.parameterAdditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that you can add to better describe the feature.
     * </p>
     * 
     * @param parameterAdditions
     *        A list of key-value pairs that you can add to better describe the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureMetadataRequest withParameterAdditions(java.util.Collection<FeatureParameter> parameterAdditions) {
        setParameterAdditions(parameterAdditions);
        return this;
    }

    /**
     * <p>
     * A list of parameter keys that you can specify to remove parameters that describe your feature.
     * </p>
     * 
     * @return A list of parameter keys that you can specify to remove parameters that describe your feature.
     */

    public java.util.List<String> getParameterRemovals() {
        return parameterRemovals;
    }

    /**
     * <p>
     * A list of parameter keys that you can specify to remove parameters that describe your feature.
     * </p>
     * 
     * @param parameterRemovals
     *        A list of parameter keys that you can specify to remove parameters that describe your feature.
     */

    public void setParameterRemovals(java.util.Collection<String> parameterRemovals) {
        if (parameterRemovals == null) {
            this.parameterRemovals = null;
            return;
        }

        this.parameterRemovals = new java.util.ArrayList<String>(parameterRemovals);
    }

    /**
     * <p>
     * A list of parameter keys that you can specify to remove parameters that describe your feature.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterRemovals(java.util.Collection)} or {@link #withParameterRemovals(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param parameterRemovals
     *        A list of parameter keys that you can specify to remove parameters that describe your feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureMetadataRequest withParameterRemovals(String... parameterRemovals) {
        if (this.parameterRemovals == null) {
            setParameterRemovals(new java.util.ArrayList<String>(parameterRemovals.length));
        }
        for (String ele : parameterRemovals) {
            this.parameterRemovals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameter keys that you can specify to remove parameters that describe your feature.
     * </p>
     * 
     * @param parameterRemovals
     *        A list of parameter keys that you can specify to remove parameters that describe your feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeatureMetadataRequest withParameterRemovals(java.util.Collection<String> parameterRemovals) {
        setParameterRemovals(parameterRemovals);
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
        if (getFeatureGroupName() != null)
            sb.append("FeatureGroupName: ").append(getFeatureGroupName()).append(",");
        if (getFeatureName() != null)
            sb.append("FeatureName: ").append(getFeatureName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParameterAdditions() != null)
            sb.append("ParameterAdditions: ").append(getParameterAdditions()).append(",");
        if (getParameterRemovals() != null)
            sb.append("ParameterRemovals: ").append(getParameterRemovals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFeatureMetadataRequest == false)
            return false;
        UpdateFeatureMetadataRequest other = (UpdateFeatureMetadataRequest) obj;
        if (other.getFeatureGroupName() == null ^ this.getFeatureGroupName() == null)
            return false;
        if (other.getFeatureGroupName() != null && other.getFeatureGroupName().equals(this.getFeatureGroupName()) == false)
            return false;
        if (other.getFeatureName() == null ^ this.getFeatureName() == null)
            return false;
        if (other.getFeatureName() != null && other.getFeatureName().equals(this.getFeatureName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameterAdditions() == null ^ this.getParameterAdditions() == null)
            return false;
        if (other.getParameterAdditions() != null && other.getParameterAdditions().equals(this.getParameterAdditions()) == false)
            return false;
        if (other.getParameterRemovals() == null ^ this.getParameterRemovals() == null)
            return false;
        if (other.getParameterRemovals() != null && other.getParameterRemovals().equals(this.getParameterRemovals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureGroupName() == null) ? 0 : getFeatureGroupName().hashCode());
        hashCode = prime * hashCode + ((getFeatureName() == null) ? 0 : getFeatureName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameterAdditions() == null) ? 0 : getParameterAdditions().hashCode());
        hashCode = prime * hashCode + ((getParameterRemovals() == null) ? 0 : getParameterRemovals().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFeatureMetadataRequest clone() {
        return (UpdateFeatureMetadataRequest) super.clone();
    }

}
