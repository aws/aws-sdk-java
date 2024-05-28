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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an Image Builder recipe that the lifecycle policy uses for resource selection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/LifecyclePolicyResourceSelectionRecipe"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicyResourceSelectionRecipe implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an Image Builder recipe that the lifecycle policy uses for resource selection.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the Image Builder recipe specified by the <code>name</code> field.
     * </p>
     */
    private String semanticVersion;

    /**
     * <p>
     * The name of an Image Builder recipe that the lifecycle policy uses for resource selection.
     * </p>
     * 
     * @param name
     *        The name of an Image Builder recipe that the lifecycle policy uses for resource selection.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an Image Builder recipe that the lifecycle policy uses for resource selection.
     * </p>
     * 
     * @return The name of an Image Builder recipe that the lifecycle policy uses for resource selection.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of an Image Builder recipe that the lifecycle policy uses for resource selection.
     * </p>
     * 
     * @param name
     *        The name of an Image Builder recipe that the lifecycle policy uses for resource selection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyResourceSelectionRecipe withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the Image Builder recipe specified by the <code>name</code> field.
     * </p>
     * 
     * @param semanticVersion
     *        The version of the Image Builder recipe specified by the <code>name</code> field.
     */

    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * <p>
     * The version of the Image Builder recipe specified by the <code>name</code> field.
     * </p>
     * 
     * @return The version of the Image Builder recipe specified by the <code>name</code> field.
     */

    public String getSemanticVersion() {
        return this.semanticVersion;
    }

    /**
     * <p>
     * The version of the Image Builder recipe specified by the <code>name</code> field.
     * </p>
     * 
     * @param semanticVersion
     *        The version of the Image Builder recipe specified by the <code>name</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyResourceSelectionRecipe withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSemanticVersion() != null)
            sb.append("SemanticVersion: ").append(getSemanticVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicyResourceSelectionRecipe == false)
            return false;
        LifecyclePolicyResourceSelectionRecipe other = (LifecyclePolicyResourceSelectionRecipe) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicyResourceSelectionRecipe clone() {
        try {
            return (LifecyclePolicyResourceSelectionRecipe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LifecyclePolicyResourceSelectionRecipeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
