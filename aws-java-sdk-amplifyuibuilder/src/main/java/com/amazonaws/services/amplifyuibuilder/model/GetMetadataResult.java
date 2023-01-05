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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/GetMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Represents the configuration settings for the features metadata.
     * </p>
     */
    private java.util.Map<String, String> features;

    /**
     * <p>
     * Represents the configuration settings for the features metadata.
     * </p>
     * 
     * @return Represents the configuration settings for the features metadata.
     */

    public java.util.Map<String, String> getFeatures() {
        return features;
    }

    /**
     * <p>
     * Represents the configuration settings for the features metadata.
     * </p>
     * 
     * @param features
     *        Represents the configuration settings for the features metadata.
     */

    public void setFeatures(java.util.Map<String, String> features) {
        this.features = features;
    }

    /**
     * <p>
     * Represents the configuration settings for the features metadata.
     * </p>
     * 
     * @param features
     *        Represents the configuration settings for the features metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataResult withFeatures(java.util.Map<String, String> features) {
        setFeatures(features);
        return this;
    }

    /**
     * Add a single Features entry
     *
     * @see GetMetadataResult#withFeatures
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataResult addFeaturesEntry(String key, String value) {
        if (null == this.features) {
            this.features = new java.util.HashMap<String, String>();
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

    public GetMetadataResult clearFeaturesEntries() {
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

        if (obj instanceof GetMetadataResult == false)
            return false;
        GetMetadataResult other = (GetMetadataResult) obj;
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

        hashCode = prime * hashCode + ((getFeatures() == null) ? 0 : getFeatures().hashCode());
        return hashCode;
    }

    @Override
    public GetMetadataResult clone() {
        try {
            return (GetMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
