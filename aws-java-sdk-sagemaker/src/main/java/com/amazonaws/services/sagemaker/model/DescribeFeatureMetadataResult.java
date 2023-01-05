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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeFeatureMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFeatureMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the feature group that contains the feature.
     * </p>
     */
    private String featureGroupArn;
    /**
     * <p>
     * The name of the feature group that you've specified.
     * </p>
     */
    private String featureGroupName;
    /**
     * <p>
     * The name of the feature that you've specified.
     * </p>
     */
    private String featureName;
    /**
     * <p>
     * The data type of the feature.
     * </p>
     */
    private String featureType;
    /**
     * <p>
     * A timestamp indicating when the feature was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp indicating when the metadata for the feature group was modified. For example, if you add a parameter
     * describing the feature, the timestamp changes to reflect the last time you
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The description you added to describe the feature.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The key-value pairs that you added to describe the feature.
     * </p>
     */
    private java.util.List<FeatureParameter> parameters;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the feature group that contains the feature.
     * </p>
     * 
     * @param featureGroupArn
     *        The Amazon Resource Number (ARN) of the feature group that contains the feature.
     */

    public void setFeatureGroupArn(String featureGroupArn) {
        this.featureGroupArn = featureGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the feature group that contains the feature.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the feature group that contains the feature.
     */

    public String getFeatureGroupArn() {
        return this.featureGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the feature group that contains the feature.
     * </p>
     * 
     * @param featureGroupArn
     *        The Amazon Resource Number (ARN) of the feature group that contains the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureMetadataResult withFeatureGroupArn(String featureGroupArn) {
        setFeatureGroupArn(featureGroupArn);
        return this;
    }

    /**
     * <p>
     * The name of the feature group that you've specified.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group that you've specified.
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group that you've specified.
     * </p>
     * 
     * @return The name of the feature group that you've specified.
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group that you've specified.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group that you've specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureMetadataResult withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the feature that you've specified.
     * </p>
     * 
     * @param featureName
     *        The name of the feature that you've specified.
     */

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    /**
     * <p>
     * The name of the feature that you've specified.
     * </p>
     * 
     * @return The name of the feature that you've specified.
     */

    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * <p>
     * The name of the feature that you've specified.
     * </p>
     * 
     * @param featureName
     *        The name of the feature that you've specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureMetadataResult withFeatureName(String featureName) {
        setFeatureName(featureName);
        return this;
    }

    /**
     * <p>
     * The data type of the feature.
     * </p>
     * 
     * @param featureType
     *        The data type of the feature.
     * @see FeatureType
     */

    public void setFeatureType(String featureType) {
        this.featureType = featureType;
    }

    /**
     * <p>
     * The data type of the feature.
     * </p>
     * 
     * @return The data type of the feature.
     * @see FeatureType
     */

    public String getFeatureType() {
        return this.featureType;
    }

    /**
     * <p>
     * The data type of the feature.
     * </p>
     * 
     * @param featureType
     *        The data type of the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public DescribeFeatureMetadataResult withFeatureType(String featureType) {
        setFeatureType(featureType);
        return this;
    }

    /**
     * <p>
     * The data type of the feature.
     * </p>
     * 
     * @param featureType
     *        The data type of the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public DescribeFeatureMetadataResult withFeatureType(FeatureType featureType) {
        this.featureType = featureType.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp indicating when the feature was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp indicating when the feature was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp indicating when the feature was created.
     * </p>
     * 
     * @return A timestamp indicating when the feature was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp indicating when the feature was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp indicating when the feature was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureMetadataResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp indicating when the metadata for the feature group was modified. For example, if you add a parameter
     * describing the feature, the timestamp changes to reflect the last time you
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp indicating when the metadata for the feature group was modified. For example, if you add a
     *        parameter describing the feature, the timestamp changes to reflect the last time you
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp indicating when the metadata for the feature group was modified. For example, if you add a parameter
     * describing the feature, the timestamp changes to reflect the last time you
     * </p>
     * 
     * @return A timestamp indicating when the metadata for the feature group was modified. For example, if you add a
     *         parameter describing the feature, the timestamp changes to reflect the last time you
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp indicating when the metadata for the feature group was modified. For example, if you add a parameter
     * describing the feature, the timestamp changes to reflect the last time you
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp indicating when the metadata for the feature group was modified. For example, if you add a
     *        parameter describing the feature, the timestamp changes to reflect the last time you
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureMetadataResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The description you added to describe the feature.
     * </p>
     * 
     * @param description
     *        The description you added to describe the feature.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description you added to describe the feature.
     * </p>
     * 
     * @return The description you added to describe the feature.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description you added to describe the feature.
     * </p>
     * 
     * @param description
     *        The description you added to describe the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureMetadataResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The key-value pairs that you added to describe the feature.
     * </p>
     * 
     * @return The key-value pairs that you added to describe the feature.
     */

    public java.util.List<FeatureParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The key-value pairs that you added to describe the feature.
     * </p>
     * 
     * @param parameters
     *        The key-value pairs that you added to describe the feature.
     */

    public void setParameters(java.util.Collection<FeatureParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<FeatureParameter>(parameters);
    }

    /**
     * <p>
     * The key-value pairs that you added to describe the feature.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        The key-value pairs that you added to describe the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureMetadataResult withParameters(FeatureParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<FeatureParameter>(parameters.length));
        }
        for (FeatureParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key-value pairs that you added to describe the feature.
     * </p>
     * 
     * @param parameters
     *        The key-value pairs that you added to describe the feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeatureMetadataResult withParameters(java.util.Collection<FeatureParameter> parameters) {
        setParameters(parameters);
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
        if (getFeatureGroupArn() != null)
            sb.append("FeatureGroupArn: ").append(getFeatureGroupArn()).append(",");
        if (getFeatureGroupName() != null)
            sb.append("FeatureGroupName: ").append(getFeatureGroupName()).append(",");
        if (getFeatureName() != null)
            sb.append("FeatureName: ").append(getFeatureName()).append(",");
        if (getFeatureType() != null)
            sb.append("FeatureType: ").append(getFeatureType()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFeatureMetadataResult == false)
            return false;
        DescribeFeatureMetadataResult other = (DescribeFeatureMetadataResult) obj;
        if (other.getFeatureGroupArn() == null ^ this.getFeatureGroupArn() == null)
            return false;
        if (other.getFeatureGroupArn() != null && other.getFeatureGroupArn().equals(this.getFeatureGroupArn()) == false)
            return false;
        if (other.getFeatureGroupName() == null ^ this.getFeatureGroupName() == null)
            return false;
        if (other.getFeatureGroupName() != null && other.getFeatureGroupName().equals(this.getFeatureGroupName()) == false)
            return false;
        if (other.getFeatureName() == null ^ this.getFeatureName() == null)
            return false;
        if (other.getFeatureName() != null && other.getFeatureName().equals(this.getFeatureName()) == false)
            return false;
        if (other.getFeatureType() == null ^ this.getFeatureType() == null)
            return false;
        if (other.getFeatureType() != null && other.getFeatureType().equals(this.getFeatureType()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureGroupArn() == null) ? 0 : getFeatureGroupArn().hashCode());
        hashCode = prime * hashCode + ((getFeatureGroupName() == null) ? 0 : getFeatureGroupName().hashCode());
        hashCode = prime * hashCode + ((getFeatureName() == null) ? 0 : getFeatureName().hashCode());
        hashCode = prime * hashCode + ((getFeatureType() == null) ? 0 : getFeatureType().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFeatureMetadataResult clone() {
        try {
            return (DescribeFeatureMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
