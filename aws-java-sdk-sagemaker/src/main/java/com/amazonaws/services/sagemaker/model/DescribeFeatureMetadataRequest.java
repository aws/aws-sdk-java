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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeFeatureMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFeatureMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the feature group containing the feature.
     * </p>
     */
    private String featureGroupName;
    /**
     * <p>
     * The name of the feature.
     * </p>
     */
    private String featureName;

    /**
     * <p>
     * The name of the feature group containing the feature.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group containing the feature.
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group containing the feature.
     * </p>
     * 
     * @return The name of the feature group containing the feature.
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group containing the feature.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group containing the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureMetadataRequest withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the feature.
     * </p>
     * 
     * @param featureName
     *        The name of the feature.
     */

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    /**
     * <p>
     * The name of the feature.
     * </p>
     * 
     * @return The name of the feature.
     */

    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * <p>
     * The name of the feature.
     * </p>
     * 
     * @param featureName
     *        The name of the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureMetadataRequest withFeatureName(String featureName) {
        setFeatureName(featureName);
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
            sb.append("FeatureName: ").append(getFeatureName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFeatureMetadataRequest == false)
            return false;
        DescribeFeatureMetadataRequest other = (DescribeFeatureMetadataRequest) obj;
        if (other.getFeatureGroupName() == null ^ this.getFeatureGroupName() == null)
            return false;
        if (other.getFeatureGroupName() != null && other.getFeatureGroupName().equals(this.getFeatureGroupName()) == false)
            return false;
        if (other.getFeatureName() == null ^ this.getFeatureName() == null)
            return false;
        if (other.getFeatureName() != null && other.getFeatureName().equals(this.getFeatureName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureGroupName() == null) ? 0 : getFeatureGroupName().hashCode());
        hashCode = prime * hashCode + ((getFeatureName() == null) ? 0 : getFeatureName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFeatureMetadataRequest clone() {
        return (DescribeFeatureMetadataRequest) super.clone();
    }

}
