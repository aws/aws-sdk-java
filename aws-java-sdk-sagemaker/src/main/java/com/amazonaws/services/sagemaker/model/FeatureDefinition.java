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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of features. You must include <code>FeatureName</code> and <code>FeatureType</code>. Valid feature
 * <code>FeatureType</code>s are <code>Integral</code>, <code>Fractional</code> and <code>String</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/FeatureDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeatureDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a feature. The type must be a string. <code>FeatureName</code> cannot be any of the following:
     * <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.
     * </p>
     * <p>
     * The name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must start with an alphanumeric character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can only include alphanumeric characters, underscores, and hyphens. Spaces are not allowed.
     * </p>
     * </li>
     * </ul>
     */
    private String featureName;
    /**
     * <p>
     * The value type of a feature. Valid values are Integral, Fractional, or String.
     * </p>
     */
    private String featureType;
    /**
     * <p>
     * A grouping of elements where each element within the collection must have the same feature type (
     * <code>String</code>, <code>Integral</code>, or <code>Fractional</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>List</code>: An ordered collection of elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Set</code>: An unordered collection of unique elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Vector</code>: A specialized list that represents a fixed-size array of elements. The vector dimension is
     * determined by you. Must have elements with fractional feature types.
     * </p>
     * </li>
     * </ul>
     */
    private String collectionType;
    /**
     * <p>
     * Configuration for your collection.
     * </p>
     */
    private CollectionConfig collectionConfig;

    /**
     * <p>
     * The name of a feature. The type must be a string. <code>FeatureName</code> cannot be any of the following:
     * <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.
     * </p>
     * <p>
     * The name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must start with an alphanumeric character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can only include alphanumeric characters, underscores, and hyphens. Spaces are not allowed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param featureName
     *        The name of a feature. The type must be a string. <code>FeatureName</code> cannot be any of the following:
     *        <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.</p>
     *        <p>
     *        The name:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must start with an alphanumeric character.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can only include alphanumeric characters, underscores, and hyphens. Spaces are not allowed.
     *        </p>
     *        </li>
     */

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    /**
     * <p>
     * The name of a feature. The type must be a string. <code>FeatureName</code> cannot be any of the following:
     * <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.
     * </p>
     * <p>
     * The name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must start with an alphanumeric character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can only include alphanumeric characters, underscores, and hyphens. Spaces are not allowed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of a feature. The type must be a string. <code>FeatureName</code> cannot be any of the
     *         following: <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.</p>
     *         <p>
     *         The name:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must start with an alphanumeric character.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can only include alphanumeric characters, underscores, and hyphens. Spaces are not allowed.
     *         </p>
     *         </li>
     */

    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * <p>
     * The name of a feature. The type must be a string. <code>FeatureName</code> cannot be any of the following:
     * <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.
     * </p>
     * <p>
     * The name:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must start with an alphanumeric character.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can only include alphanumeric characters, underscores, and hyphens. Spaces are not allowed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param featureName
     *        The name of a feature. The type must be a string. <code>FeatureName</code> cannot be any of the following:
     *        <code>is_deleted</code>, <code>write_time</code>, <code>api_invocation_time</code>.</p>
     *        <p>
     *        The name:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must start with an alphanumeric character.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can only include alphanumeric characters, underscores, and hyphens. Spaces are not allowed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureDefinition withFeatureName(String featureName) {
        setFeatureName(featureName);
        return this;
    }

    /**
     * <p>
     * The value type of a feature. Valid values are Integral, Fractional, or String.
     * </p>
     * 
     * @param featureType
     *        The value type of a feature. Valid values are Integral, Fractional, or String.
     * @see FeatureType
     */

    public void setFeatureType(String featureType) {
        this.featureType = featureType;
    }

    /**
     * <p>
     * The value type of a feature. Valid values are Integral, Fractional, or String.
     * </p>
     * 
     * @return The value type of a feature. Valid values are Integral, Fractional, or String.
     * @see FeatureType
     */

    public String getFeatureType() {
        return this.featureType;
    }

    /**
     * <p>
     * The value type of a feature. Valid values are Integral, Fractional, or String.
     * </p>
     * 
     * @param featureType
     *        The value type of a feature. Valid values are Integral, Fractional, or String.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public FeatureDefinition withFeatureType(String featureType) {
        setFeatureType(featureType);
        return this;
    }

    /**
     * <p>
     * The value type of a feature. Valid values are Integral, Fractional, or String.
     * </p>
     * 
     * @param featureType
     *        The value type of a feature. Valid values are Integral, Fractional, or String.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public FeatureDefinition withFeatureType(FeatureType featureType) {
        this.featureType = featureType.toString();
        return this;
    }

    /**
     * <p>
     * A grouping of elements where each element within the collection must have the same feature type (
     * <code>String</code>, <code>Integral</code>, or <code>Fractional</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>List</code>: An ordered collection of elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Set</code>: An unordered collection of unique elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Vector</code>: A specialized list that represents a fixed-size array of elements. The vector dimension is
     * determined by you. Must have elements with fractional feature types.
     * </p>
     * </li>
     * </ul>
     * 
     * @param collectionType
     *        A grouping of elements where each element within the collection must have the same feature type (
     *        <code>String</code>, <code>Integral</code>, or <code>Fractional</code>).</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>List</code>: An ordered collection of elements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Set</code>: An unordered collection of unique elements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Vector</code>: A specialized list that represents a fixed-size array of elements. The vector
     *        dimension is determined by you. Must have elements with fractional feature types.
     *        </p>
     *        </li>
     * @see CollectionType
     */

    public void setCollectionType(String collectionType) {
        this.collectionType = collectionType;
    }

    /**
     * <p>
     * A grouping of elements where each element within the collection must have the same feature type (
     * <code>String</code>, <code>Integral</code>, or <code>Fractional</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>List</code>: An ordered collection of elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Set</code>: An unordered collection of unique elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Vector</code>: A specialized list that represents a fixed-size array of elements. The vector dimension is
     * determined by you. Must have elements with fractional feature types.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A grouping of elements where each element within the collection must have the same feature type (
     *         <code>String</code>, <code>Integral</code>, or <code>Fractional</code>).</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>List</code>: An ordered collection of elements.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Set</code>: An unordered collection of unique elements.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Vector</code>: A specialized list that represents a fixed-size array of elements. The vector
     *         dimension is determined by you. Must have elements with fractional feature types.
     *         </p>
     *         </li>
     * @see CollectionType
     */

    public String getCollectionType() {
        return this.collectionType;
    }

    /**
     * <p>
     * A grouping of elements where each element within the collection must have the same feature type (
     * <code>String</code>, <code>Integral</code>, or <code>Fractional</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>List</code>: An ordered collection of elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Set</code>: An unordered collection of unique elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Vector</code>: A specialized list that represents a fixed-size array of elements. The vector dimension is
     * determined by you. Must have elements with fractional feature types.
     * </p>
     * </li>
     * </ul>
     * 
     * @param collectionType
     *        A grouping of elements where each element within the collection must have the same feature type (
     *        <code>String</code>, <code>Integral</code>, or <code>Fractional</code>).</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>List</code>: An ordered collection of elements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Set</code>: An unordered collection of unique elements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Vector</code>: A specialized list that represents a fixed-size array of elements. The vector
     *        dimension is determined by you. Must have elements with fractional feature types.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollectionType
     */

    public FeatureDefinition withCollectionType(String collectionType) {
        setCollectionType(collectionType);
        return this;
    }

    /**
     * <p>
     * A grouping of elements where each element within the collection must have the same feature type (
     * <code>String</code>, <code>Integral</code>, or <code>Fractional</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>List</code>: An ordered collection of elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Set</code>: An unordered collection of unique elements.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Vector</code>: A specialized list that represents a fixed-size array of elements. The vector dimension is
     * determined by you. Must have elements with fractional feature types.
     * </p>
     * </li>
     * </ul>
     * 
     * @param collectionType
     *        A grouping of elements where each element within the collection must have the same feature type (
     *        <code>String</code>, <code>Integral</code>, or <code>Fractional</code>).</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>List</code>: An ordered collection of elements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Set</code>: An unordered collection of unique elements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Vector</code>: A specialized list that represents a fixed-size array of elements. The vector
     *        dimension is determined by you. Must have elements with fractional feature types.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CollectionType
     */

    public FeatureDefinition withCollectionType(CollectionType collectionType) {
        this.collectionType = collectionType.toString();
        return this;
    }

    /**
     * <p>
     * Configuration for your collection.
     * </p>
     * 
     * @param collectionConfig
     *        Configuration for your collection.
     */

    public void setCollectionConfig(CollectionConfig collectionConfig) {
        this.collectionConfig = collectionConfig;
    }

    /**
     * <p>
     * Configuration for your collection.
     * </p>
     * 
     * @return Configuration for your collection.
     */

    public CollectionConfig getCollectionConfig() {
        return this.collectionConfig;
    }

    /**
     * <p>
     * Configuration for your collection.
     * </p>
     * 
     * @param collectionConfig
     *        Configuration for your collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeatureDefinition withCollectionConfig(CollectionConfig collectionConfig) {
        setCollectionConfig(collectionConfig);
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
        if (getFeatureName() != null)
            sb.append("FeatureName: ").append(getFeatureName()).append(",");
        if (getFeatureType() != null)
            sb.append("FeatureType: ").append(getFeatureType()).append(",");
        if (getCollectionType() != null)
            sb.append("CollectionType: ").append(getCollectionType()).append(",");
        if (getCollectionConfig() != null)
            sb.append("CollectionConfig: ").append(getCollectionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FeatureDefinition == false)
            return false;
        FeatureDefinition other = (FeatureDefinition) obj;
        if (other.getFeatureName() == null ^ this.getFeatureName() == null)
            return false;
        if (other.getFeatureName() != null && other.getFeatureName().equals(this.getFeatureName()) == false)
            return false;
        if (other.getFeatureType() == null ^ this.getFeatureType() == null)
            return false;
        if (other.getFeatureType() != null && other.getFeatureType().equals(this.getFeatureType()) == false)
            return false;
        if (other.getCollectionType() == null ^ this.getCollectionType() == null)
            return false;
        if (other.getCollectionType() != null && other.getCollectionType().equals(this.getCollectionType()) == false)
            return false;
        if (other.getCollectionConfig() == null ^ this.getCollectionConfig() == null)
            return false;
        if (other.getCollectionConfig() != null && other.getCollectionConfig().equals(this.getCollectionConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureName() == null) ? 0 : getFeatureName().hashCode());
        hashCode = prime * hashCode + ((getFeatureType() == null) ? 0 : getFeatureType().hashCode());
        hashCode = prime * hashCode + ((getCollectionType() == null) ? 0 : getCollectionType().hashCode());
        hashCode = prime * hashCode + ((getCollectionConfig() == null) ? 0 : getCollectionConfig().hashCode());
        return hashCode;
    }

    @Override
    public FeatureDefinition clone() {
        try {
            return (FeatureDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.FeatureDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
