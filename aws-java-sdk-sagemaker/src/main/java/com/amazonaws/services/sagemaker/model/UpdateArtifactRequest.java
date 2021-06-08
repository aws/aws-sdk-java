/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateArtifact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateArtifactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact to update.
     * </p>
     */
    private String artifactArn;
    /**
     * <p>
     * The new name for the artifact.
     * </p>
     */
    private String artifactName;
    /**
     * <p>
     * The new list of properties. Overwrites the current property list.
     * </p>
     */
    private java.util.Map<String, String> properties;
    /**
     * <p>
     * A list of properties to remove.
     * </p>
     */
    private java.util.List<String> propertiesToRemove;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact to update.
     * </p>
     * 
     * @param artifactArn
     *        The Amazon Resource Name (ARN) of the artifact to update.
     */

    public void setArtifactArn(String artifactArn) {
        this.artifactArn = artifactArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the artifact to update.
     */

    public String getArtifactArn() {
        return this.artifactArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact to update.
     * </p>
     * 
     * @param artifactArn
     *        The Amazon Resource Name (ARN) of the artifact to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArtifactRequest withArtifactArn(String artifactArn) {
        setArtifactArn(artifactArn);
        return this;
    }

    /**
     * <p>
     * The new name for the artifact.
     * </p>
     * 
     * @param artifactName
     *        The new name for the artifact.
     */

    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }

    /**
     * <p>
     * The new name for the artifact.
     * </p>
     * 
     * @return The new name for the artifact.
     */

    public String getArtifactName() {
        return this.artifactName;
    }

    /**
     * <p>
     * The new name for the artifact.
     * </p>
     * 
     * @param artifactName
     *        The new name for the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArtifactRequest withArtifactName(String artifactName) {
        setArtifactName(artifactName);
        return this;
    }

    /**
     * <p>
     * The new list of properties. Overwrites the current property list.
     * </p>
     * 
     * @return The new list of properties. Overwrites the current property list.
     */

    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    /**
     * <p>
     * The new list of properties. Overwrites the current property list.
     * </p>
     * 
     * @param properties
     *        The new list of properties. Overwrites the current property list.
     */

    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * The new list of properties. Overwrites the current property list.
     * </p>
     * 
     * @param properties
     *        The new list of properties. Overwrites the current property list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArtifactRequest withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see UpdateArtifactRequest#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArtifactRequest addPropertiesEntry(String key, String value) {
        if (null == this.properties) {
            this.properties = new java.util.HashMap<String, String>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArtifactRequest clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * <p>
     * A list of properties to remove.
     * </p>
     * 
     * @return A list of properties to remove.
     */

    public java.util.List<String> getPropertiesToRemove() {
        return propertiesToRemove;
    }

    /**
     * <p>
     * A list of properties to remove.
     * </p>
     * 
     * @param propertiesToRemove
     *        A list of properties to remove.
     */

    public void setPropertiesToRemove(java.util.Collection<String> propertiesToRemove) {
        if (propertiesToRemove == null) {
            this.propertiesToRemove = null;
            return;
        }

        this.propertiesToRemove = new java.util.ArrayList<String>(propertiesToRemove);
    }

    /**
     * <p>
     * A list of properties to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertiesToRemove(java.util.Collection)} or {@link #withPropertiesToRemove(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param propertiesToRemove
     *        A list of properties to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArtifactRequest withPropertiesToRemove(String... propertiesToRemove) {
        if (this.propertiesToRemove == null) {
            setPropertiesToRemove(new java.util.ArrayList<String>(propertiesToRemove.length));
        }
        for (String ele : propertiesToRemove) {
            this.propertiesToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of properties to remove.
     * </p>
     * 
     * @param propertiesToRemove
     *        A list of properties to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArtifactRequest withPropertiesToRemove(java.util.Collection<String> propertiesToRemove) {
        setPropertiesToRemove(propertiesToRemove);
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
        if (getArtifactArn() != null)
            sb.append("ArtifactArn: ").append(getArtifactArn()).append(",");
        if (getArtifactName() != null)
            sb.append("ArtifactName: ").append(getArtifactName()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getPropertiesToRemove() != null)
            sb.append("PropertiesToRemove: ").append(getPropertiesToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateArtifactRequest == false)
            return false;
        UpdateArtifactRequest other = (UpdateArtifactRequest) obj;
        if (other.getArtifactArn() == null ^ this.getArtifactArn() == null)
            return false;
        if (other.getArtifactArn() != null && other.getArtifactArn().equals(this.getArtifactArn()) == false)
            return false;
        if (other.getArtifactName() == null ^ this.getArtifactName() == null)
            return false;
        if (other.getArtifactName() != null && other.getArtifactName().equals(this.getArtifactName()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getPropertiesToRemove() == null ^ this.getPropertiesToRemove() == null)
            return false;
        if (other.getPropertiesToRemove() != null && other.getPropertiesToRemove().equals(this.getPropertiesToRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArtifactArn() == null) ? 0 : getArtifactArn().hashCode());
        hashCode = prime * hashCode + ((getArtifactName() == null) ? 0 : getArtifactName().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getPropertiesToRemove() == null) ? 0 : getPropertiesToRemove().hashCode());
        return hashCode;
    }

    @Override
    public UpdateArtifactRequest clone() {
        return (UpdateArtifactRequest) super.clone();
    }

}
