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
 * A structure that defines one launch group in a launch. A launch group is a variation of the feature that you are
 * including in the launch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/LaunchGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the launch group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The feature variation for this launch group. This is a key-value pair.
     * </p>
     */
    private java.util.Map<String, String> featureVariations;
    /**
     * <p>
     * The name of the launch group.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A description of the launch group.
     * </p>
     * 
     * @param description
     *        A description of the launch group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the launch group.
     * </p>
     * 
     * @return A description of the launch group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the launch group.
     * </p>
     * 
     * @param description
     *        A description of the launch group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The feature variation for this launch group. This is a key-value pair.
     * </p>
     * 
     * @return The feature variation for this launch group. This is a key-value pair.
     */

    public java.util.Map<String, String> getFeatureVariations() {
        return featureVariations;
    }

    /**
     * <p>
     * The feature variation for this launch group. This is a key-value pair.
     * </p>
     * 
     * @param featureVariations
     *        The feature variation for this launch group. This is a key-value pair.
     */

    public void setFeatureVariations(java.util.Map<String, String> featureVariations) {
        this.featureVariations = featureVariations;
    }

    /**
     * <p>
     * The feature variation for this launch group. This is a key-value pair.
     * </p>
     * 
     * @param featureVariations
     *        The feature variation for this launch group. This is a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchGroup withFeatureVariations(java.util.Map<String, String> featureVariations) {
        setFeatureVariations(featureVariations);
        return this;
    }

    /**
     * Add a single FeatureVariations entry
     *
     * @see LaunchGroup#withFeatureVariations
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LaunchGroup addFeatureVariationsEntry(String key, String value) {
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

    public LaunchGroup clearFeatureVariationsEntries() {
        this.featureVariations = null;
        return this;
    }

    /**
     * <p>
     * The name of the launch group.
     * </p>
     * 
     * @param name
     *        The name of the launch group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the launch group.
     * </p>
     * 
     * @return The name of the launch group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the launch group.
     * </p>
     * 
     * @param name
     *        The name of the launch group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchGroup withName(String name) {
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

        if (obj instanceof LaunchGroup == false)
            return false;
        LaunchGroup other = (LaunchGroup) obj;
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
    public LaunchGroup clone() {
        try {
            return (LaunchGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.LaunchGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
