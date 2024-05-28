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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetAdapter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAdapterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A string identifying the adapter that information has been retrieved for.
     * </p>
     */
    private String adapterId;
    /**
     * <p>
     * The name of the requested adapter.
     * </p>
     */
    private String adapterName;
    /**
     * <p>
     * The date and time the requested adapter was created at.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The description for the requested adapter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * List of the targeted feature types for the requested adapter.
     * </p>
     */
    private java.util.List<String> featureTypes;
    /**
     * <p>
     * Binary value indicating if the adapter is being automatically updated or not.
     * </p>
     */
    private String autoUpdate;
    /**
     * <p>
     * A set of tags (key-value pairs) associated with the adapter that has been retrieved.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A string identifying the adapter that information has been retrieved for.
     * </p>
     * 
     * @param adapterId
     *        A string identifying the adapter that information has been retrieved for.
     */

    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A string identifying the adapter that information has been retrieved for.
     * </p>
     * 
     * @return A string identifying the adapter that information has been retrieved for.
     */

    public String getAdapterId() {
        return this.adapterId;
    }

    /**
     * <p>
     * A string identifying the adapter that information has been retrieved for.
     * </p>
     * 
     * @param adapterId
     *        A string identifying the adapter that information has been retrieved for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterResult withAdapterId(String adapterId) {
        setAdapterId(adapterId);
        return this;
    }

    /**
     * <p>
     * The name of the requested adapter.
     * </p>
     * 
     * @param adapterName
     *        The name of the requested adapter.
     */

    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName;
    }

    /**
     * <p>
     * The name of the requested adapter.
     * </p>
     * 
     * @return The name of the requested adapter.
     */

    public String getAdapterName() {
        return this.adapterName;
    }

    /**
     * <p>
     * The name of the requested adapter.
     * </p>
     * 
     * @param adapterName
     *        The name of the requested adapter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterResult withAdapterName(String adapterName) {
        setAdapterName(adapterName);
        return this;
    }

    /**
     * <p>
     * The date and time the requested adapter was created at.
     * </p>
     * 
     * @param creationTime
     *        The date and time the requested adapter was created at.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the requested adapter was created at.
     * </p>
     * 
     * @return The date and time the requested adapter was created at.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time the requested adapter was created at.
     * </p>
     * 
     * @param creationTime
     *        The date and time the requested adapter was created at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The description for the requested adapter.
     * </p>
     * 
     * @param description
     *        The description for the requested adapter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the requested adapter.
     * </p>
     * 
     * @return The description for the requested adapter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the requested adapter.
     * </p>
     * 
     * @param description
     *        The description for the requested adapter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * List of the targeted feature types for the requested adapter.
     * </p>
     * 
     * @return List of the targeted feature types for the requested adapter.
     * @see FeatureType
     */

    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * List of the targeted feature types for the requested adapter.
     * </p>
     * 
     * @param featureTypes
     *        List of the targeted feature types for the requested adapter.
     * @see FeatureType
     */

    public void setFeatureTypes(java.util.Collection<String> featureTypes) {
        if (featureTypes == null) {
            this.featureTypes = null;
            return;
        }

        this.featureTypes = new java.util.ArrayList<String>(featureTypes);
    }

    /**
     * <p>
     * List of the targeted feature types for the requested adapter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureTypes(java.util.Collection)} or {@link #withFeatureTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param featureTypes
     *        List of the targeted feature types for the requested adapter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public GetAdapterResult withFeatureTypes(String... featureTypes) {
        if (this.featureTypes == null) {
            setFeatureTypes(new java.util.ArrayList<String>(featureTypes.length));
        }
        for (String ele : featureTypes) {
            this.featureTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the targeted feature types for the requested adapter.
     * </p>
     * 
     * @param featureTypes
     *        List of the targeted feature types for the requested adapter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public GetAdapterResult withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * List of the targeted feature types for the requested adapter.
     * </p>
     * 
     * @param featureTypes
     *        List of the targeted feature types for the requested adapter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public GetAdapterResult withFeatureTypes(FeatureType... featureTypes) {
        java.util.ArrayList<String> featureTypesCopy = new java.util.ArrayList<String>(featureTypes.length);
        for (FeatureType value : featureTypes) {
            featureTypesCopy.add(value.toString());
        }
        if (getFeatureTypes() == null) {
            setFeatureTypes(featureTypesCopy);
        } else {
            getFeatureTypes().addAll(featureTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Binary value indicating if the adapter is being automatically updated or not.
     * </p>
     * 
     * @param autoUpdate
     *        Binary value indicating if the adapter is being automatically updated or not.
     * @see AutoUpdate
     */

    public void setAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * Binary value indicating if the adapter is being automatically updated or not.
     * </p>
     * 
     * @return Binary value indicating if the adapter is being automatically updated or not.
     * @see AutoUpdate
     */

    public String getAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * <p>
     * Binary value indicating if the adapter is being automatically updated or not.
     * </p>
     * 
     * @param autoUpdate
     *        Binary value indicating if the adapter is being automatically updated or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoUpdate
     */

    public GetAdapterResult withAutoUpdate(String autoUpdate) {
        setAutoUpdate(autoUpdate);
        return this;
    }

    /**
     * <p>
     * Binary value indicating if the adapter is being automatically updated or not.
     * </p>
     * 
     * @param autoUpdate
     *        Binary value indicating if the adapter is being automatically updated or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoUpdate
     */

    public GetAdapterResult withAutoUpdate(AutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate.toString();
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) associated with the adapter that has been retrieved.
     * </p>
     * 
     * @return A set of tags (key-value pairs) associated with the adapter that has been retrieved.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) associated with the adapter that has been retrieved.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) associated with the adapter that has been retrieved.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) associated with the adapter that has been retrieved.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) associated with the adapter that has been retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetAdapterResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterResult clearTagsEntries() {
        this.tags = null;
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
        if (getAdapterId() != null)
            sb.append("AdapterId: ").append(getAdapterId()).append(",");
        if (getAdapterName() != null)
            sb.append("AdapterName: ").append(getAdapterName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFeatureTypes() != null)
            sb.append("FeatureTypes: ").append(getFeatureTypes()).append(",");
        if (getAutoUpdate() != null)
            sb.append("AutoUpdate: ").append(getAutoUpdate()).append(",");
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

        if (obj instanceof GetAdapterResult == false)
            return false;
        GetAdapterResult other = (GetAdapterResult) obj;
        if (other.getAdapterId() == null ^ this.getAdapterId() == null)
            return false;
        if (other.getAdapterId() != null && other.getAdapterId().equals(this.getAdapterId()) == false)
            return false;
        if (other.getAdapterName() == null ^ this.getAdapterName() == null)
            return false;
        if (other.getAdapterName() != null && other.getAdapterName().equals(this.getAdapterName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFeatureTypes() == null ^ this.getFeatureTypes() == null)
            return false;
        if (other.getFeatureTypes() != null && other.getFeatureTypes().equals(this.getFeatureTypes()) == false)
            return false;
        if (other.getAutoUpdate() == null ^ this.getAutoUpdate() == null)
            return false;
        if (other.getAutoUpdate() != null && other.getAutoUpdate().equals(this.getAutoUpdate()) == false)
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

        hashCode = prime * hashCode + ((getAdapterId() == null) ? 0 : getAdapterId().hashCode());
        hashCode = prime * hashCode + ((getAdapterName() == null) ? 0 : getAdapterName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
        hashCode = prime * hashCode + ((getAutoUpdate() == null) ? 0 : getAutoUpdate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetAdapterResult clone() {
        try {
            return (GetAdapterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
