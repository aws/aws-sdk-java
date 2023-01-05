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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/LaunchGroupConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchGroupConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the launch group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The feature that this launch is using.
     * </p>
     */
    private String feature;
    /**
     * <p>
     * A name for this launch group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The feature variation to use for this launch group.
     * </p>
     */
    private String variation;

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

    public LaunchGroupConfig withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The feature that this launch is using.
     * </p>
     * 
     * @param feature
     *        The feature that this launch is using.
     */

    public void setFeature(String feature) {
        this.feature = feature;
    }

    /**
     * <p>
     * The feature that this launch is using.
     * </p>
     * 
     * @return The feature that this launch is using.
     */

    public String getFeature() {
        return this.feature;
    }

    /**
     * <p>
     * The feature that this launch is using.
     * </p>
     * 
     * @param feature
     *        The feature that this launch is using.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchGroupConfig withFeature(String feature) {
        setFeature(feature);
        return this;
    }

    /**
     * <p>
     * A name for this launch group.
     * </p>
     * 
     * @param name
     *        A name for this launch group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for this launch group.
     * </p>
     * 
     * @return A name for this launch group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for this launch group.
     * </p>
     * 
     * @param name
     *        A name for this launch group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchGroupConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The feature variation to use for this launch group.
     * </p>
     * 
     * @param variation
     *        The feature variation to use for this launch group.
     */

    public void setVariation(String variation) {
        this.variation = variation;
    }

    /**
     * <p>
     * The feature variation to use for this launch group.
     * </p>
     * 
     * @return The feature variation to use for this launch group.
     */

    public String getVariation() {
        return this.variation;
    }

    /**
     * <p>
     * The feature variation to use for this launch group.
     * </p>
     * 
     * @param variation
     *        The feature variation to use for this launch group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchGroupConfig withVariation(String variation) {
        setVariation(variation);
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
        if (getFeature() != null)
            sb.append("Feature: ").append(getFeature()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVariation() != null)
            sb.append("Variation: ").append(getVariation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchGroupConfig == false)
            return false;
        LaunchGroupConfig other = (LaunchGroupConfig) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFeature() == null ^ this.getFeature() == null)
            return false;
        if (other.getFeature() != null && other.getFeature().equals(this.getFeature()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVariation() == null ^ this.getVariation() == null)
            return false;
        if (other.getVariation() != null && other.getVariation().equals(this.getVariation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFeature() == null) ? 0 : getFeature().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVariation() == null) ? 0 : getVariation().hashCode());
        return hashCode;
    }

    @Override
    public LaunchGroupConfig clone() {
        try {
            return (LaunchGroupConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.LaunchGroupConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
