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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that defines one treatment in an experiment. A treatment is a variation of the feature that you are
 * including in the experiment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/Treatment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Treatment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the treatment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The feature variation used for this treatment. This is a key-value pair. The key is the feature name, and the
     * value is the variation name.
     * </p>
     */
    private java.util.Map<String, String> featureVariations;
    /**
     * <p>
     * The name of this treatment.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The description of the treatment.
     * </p>
     * 
     * @param description
     *        The description of the treatment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the treatment.
     * </p>
     * 
     * @return The description of the treatment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the treatment.
     * </p>
     * 
     * @param description
     *        The description of the treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Treatment withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The feature variation used for this treatment. This is a key-value pair. The key is the feature name, and the
     * value is the variation name.
     * </p>
     * 
     * @return The feature variation used for this treatment. This is a key-value pair. The key is the feature name, and
     *         the value is the variation name.
     */

    public java.util.Map<String, String> getFeatureVariations() {
        return featureVariations;
    }

    /**
     * <p>
     * The feature variation used for this treatment. This is a key-value pair. The key is the feature name, and the
     * value is the variation name.
     * </p>
     * 
     * @param featureVariations
     *        The feature variation used for this treatment. This is a key-value pair. The key is the feature name, and
     *        the value is the variation name.
     */

    public void setFeatureVariations(java.util.Map<String, String> featureVariations) {
        this.featureVariations = featureVariations;
    }

    /**
     * <p>
     * The feature variation used for this treatment. This is a key-value pair. The key is the feature name, and the
     * value is the variation name.
     * </p>
     * 
     * @param featureVariations
     *        The feature variation used for this treatment. This is a key-value pair. The key is the feature name, and
     *        the value is the variation name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Treatment withFeatureVariations(java.util.Map<String, String> featureVariations) {
        setFeatureVariations(featureVariations);
        return this;
    }

    /**
     * Add a single FeatureVariations entry
     *
     * @see Treatment#withFeatureVariations
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Treatment addFeatureVariationsEntry(String key, String value) {
        if (null == this.featureVariations) {
            this.featureVariations = new java.util.HashMap<String, String>();
        }
        if (this.featureVariations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.featureVariations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FeatureVariations.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Treatment clearFeatureVariationsEntries() {
        this.featureVariations = null;
        return this;
    }

    /**
     * <p>
     * The name of this treatment.
     * </p>
     * 
     * @param name
     *        The name of this treatment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this treatment.
     * </p>
     * 
     * @return The name of this treatment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this treatment.
     * </p>
     * 
     * @param name
     *        The name of this treatment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Treatment withName(String name) {
        setName(name);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFeatureVariations() != null)
            sb.append("FeatureVariations: ").append(getFeatureVariations()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Treatment == false)
            return false;
        Treatment other = (Treatment) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFeatureVariations() == null ^ this.getFeatureVariations() == null)
            return false;
        if (other.getFeatureVariations() != null && other.getFeatureVariations().equals(this.getFeatureVariations()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFeatureVariations() == null) ? 0 : getFeatureVariations().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public Treatment clone() {
        try {
            return (Treatment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.TreatmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
