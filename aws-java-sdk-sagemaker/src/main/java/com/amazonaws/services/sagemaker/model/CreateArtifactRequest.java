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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateArtifact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateArtifactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the artifact. Must be unique to your account in an Amazon Web Services Region.
     * </p>
     */
    private String artifactName;
    /**
     * <p>
     * The ID, ID type, and URI of the source.
     * </p>
     */
    private ArtifactSource source;
    /**
     * <p>
     * The artifact type.
     * </p>
     */
    private String artifactType;
    /**
     * <p>
     * A list of properties to add to the artifact.
     * </p>
     */
    private java.util.Map<String, String> properties;

    private MetadataProperties metadataProperties;
    /**
     * <p>
     * A list of tags to apply to the artifact.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the artifact. Must be unique to your account in an Amazon Web Services Region.
     * </p>
     * 
     * @param artifactName
     *        The name of the artifact. Must be unique to your account in an Amazon Web Services Region.
     */

    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }

    /**
     * <p>
     * The name of the artifact. Must be unique to your account in an Amazon Web Services Region.
     * </p>
     * 
     * @return The name of the artifact. Must be unique to your account in an Amazon Web Services Region.
     */

    public String getArtifactName() {
        return this.artifactName;
    }

    /**
     * <p>
     * The name of the artifact. Must be unique to your account in an Amazon Web Services Region.
     * </p>
     * 
     * @param artifactName
     *        The name of the artifact. Must be unique to your account in an Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArtifactRequest withArtifactName(String artifactName) {
        setArtifactName(artifactName);
        return this;
    }

    /**
     * <p>
     * The ID, ID type, and URI of the source.
     * </p>
     * 
     * @param source
     *        The ID, ID type, and URI of the source.
     */

    public void setSource(ArtifactSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The ID, ID type, and URI of the source.
     * </p>
     * 
     * @return The ID, ID type, and URI of the source.
     */

    public ArtifactSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The ID, ID type, and URI of the source.
     * </p>
     * 
     * @param source
     *        The ID, ID type, and URI of the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArtifactRequest withSource(ArtifactSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The artifact type.
     * </p>
     * 
     * @param artifactType
     *        The artifact type.
     */

    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    /**
     * <p>
     * The artifact type.
     * </p>
     * 
     * @return The artifact type.
     */

    public String getArtifactType() {
        return this.artifactType;
    }

    /**
     * <p>
     * The artifact type.
     * </p>
     * 
     * @param artifactType
     *        The artifact type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArtifactRequest withArtifactType(String artifactType) {
        setArtifactType(artifactType);
        return this;
    }

    /**
     * <p>
     * A list of properties to add to the artifact.
     * </p>
     * 
     * @return A list of properties to add to the artifact.
     */

    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    /**
     * <p>
     * A list of properties to add to the artifact.
     * </p>
     * 
     * @param properties
     *        A list of properties to add to the artifact.
     */

    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * A list of properties to add to the artifact.
     * </p>
     * 
     * @param properties
     *        A list of properties to add to the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArtifactRequest withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see CreateArtifactRequest#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateArtifactRequest addPropertiesEntry(String key, String value) {
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

    public CreateArtifactRequest clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * @param metadataProperties
     */

    public void setMetadataProperties(MetadataProperties metadataProperties) {
        this.metadataProperties = metadataProperties;
    }

    /**
     * @return
     */

    public MetadataProperties getMetadataProperties() {
        return this.metadataProperties;
    }

    /**
     * @param metadataProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArtifactRequest withMetadataProperties(MetadataProperties metadataProperties) {
        setMetadataProperties(metadataProperties);
        return this;
    }

    /**
     * <p>
     * A list of tags to apply to the artifact.
     * </p>
     * 
     * @return A list of tags to apply to the artifact.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to apply to the artifact.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the artifact.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to apply to the artifact.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArtifactRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to apply to the artifact.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateArtifactRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getArtifactName() != null)
            sb.append("ArtifactName: ").append(getArtifactName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getArtifactType() != null)
            sb.append("ArtifactType: ").append(getArtifactType()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getMetadataProperties() != null)
            sb.append("MetadataProperties: ").append(getMetadataProperties()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateArtifactRequest == false)
            return false;
        CreateArtifactRequest other = (CreateArtifactRequest) obj;
        if (other.getArtifactName() == null ^ this.getArtifactName() == null)
            return false;
        if (other.getArtifactName() != null && other.getArtifactName().equals(this.getArtifactName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getArtifactType() == null ^ this.getArtifactType() == null)
            return false;
        if (other.getArtifactType() != null && other.getArtifactType().equals(this.getArtifactType()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getMetadataProperties() == null ^ this.getMetadataProperties() == null)
            return false;
        if (other.getMetadataProperties() != null && other.getMetadataProperties().equals(this.getMetadataProperties()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArtifactName() == null) ? 0 : getArtifactName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getArtifactType() == null) ? 0 : getArtifactType().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getMetadataProperties() == null) ? 0 : getMetadataProperties().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateArtifactRequest clone() {
        return (CreateArtifactRequest) super.clone();
    }

}
