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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetResourceMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. To use a DB instance as a data source, specify its
     * <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The metadata for different features. For example, the metadata might indicate that a feature is turned on or off
     * on a specific DB instance.
     * </p>
     */
    private java.util.Map<String, FeatureMetadata> features;

    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. To use a DB instance as a data source, specify its
     * <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     * 
     * @param identifier
     *        An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance
     *        Insights gathers metrics from this data source. To use a DB instance as a data source, specify its
     *        <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. To use a DB instance as a data source, specify its
     * <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     * 
     * @return An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance
     *         Insights gathers metrics from this data source. To use a DB instance as a data source, specify its
     *         <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. To use a DB instance as a data source, specify its
     * <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     * 
     * @param identifier
     *        An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance
     *        Insights gathers metrics from this data source. To use a DB instance as a data source, specify its
     *        <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetadataResult withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The metadata for different features. For example, the metadata might indicate that a feature is turned on or off
     * on a specific DB instance.
     * </p>
     * 
     * @return The metadata for different features. For example, the metadata might indicate that a feature is turned on
     *         or off on a specific DB instance.
     */

    public java.util.Map<String, FeatureMetadata> getFeatures() {
        return features;
    }

    /**
     * <p>
     * The metadata for different features. For example, the metadata might indicate that a feature is turned on or off
     * on a specific DB instance.
     * </p>
     * 
     * @param features
     *        The metadata for different features. For example, the metadata might indicate that a feature is turned on
     *        or off on a specific DB instance.
     */

    public void setFeatures(java.util.Map<String, FeatureMetadata> features) {
        this.features = features;
    }

    /**
     * <p>
     * The metadata for different features. For example, the metadata might indicate that a feature is turned on or off
     * on a specific DB instance.
     * </p>
     * 
     * @param features
     *        The metadata for different features. For example, the metadata might indicate that a feature is turned on
     *        or off on a specific DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetadataResult withFeatures(java.util.Map<String, FeatureMetadata> features) {
        setFeatures(features);
        return this;
    }

    /**
     * Add a single Features entry
     *
     * @see GetResourceMetadataResult#withFeatures
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetadataResult addFeaturesEntry(String key, FeatureMetadata value) {
        if (null == this.features) {
            this.features = new java.util.HashMap<String, FeatureMetadata>();
        }
        if (this.features.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.features.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Features.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetadataResult clearFeaturesEntries() {
        this.features = null;
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getFeatures() != null)
            sb.append("Features: ").append(getFeatures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceMetadataResult == false)
            return false;
        GetResourceMetadataResult other = (GetResourceMetadataResult) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getFeatures() == null ^ this.getFeatures() == null)
            return false;
        if (other.getFeatures() != null && other.getFeatures().equals(this.getFeatures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFeatures() == null) ? 0 : getFeatures().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceMetadataResult clone() {
        try {
            return (GetResourceMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
