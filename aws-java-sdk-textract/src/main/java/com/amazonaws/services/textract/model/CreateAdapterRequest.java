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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/CreateAdapter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAdapterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name to be assigned to the adapter being created.
     * </p>
     */
    private String adapterName;
    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is used with multiple CreateAdapter
     * requests, the same session is returned. This token is employed to avoid unintentionally creating the same session
     * multiple times.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The description to be assigned to the adapter being created.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of feature that the adapter is being trained on. Currrenly, supported feature types are:
     * <code>QUERIES</code>
     * </p>
     */
    private java.util.List<String> featureTypes;
    /**
     * <p>
     * Controls whether or not the adapter should automatically update.
     * </p>
     */
    private String autoUpdate;
    /**
     * <p>
     * A list of tags to be added to the adapter.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name to be assigned to the adapter being created.
     * </p>
     * 
     * @param adapterName
     *        The name to be assigned to the adapter being created.
     */

    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName;
    }

    /**
     * <p>
     * The name to be assigned to the adapter being created.
     * </p>
     * 
     * @return The name to be assigned to the adapter being created.
     */

    public String getAdapterName() {
        return this.adapterName;
    }

    /**
     * <p>
     * The name to be assigned to the adapter being created.
     * </p>
     * 
     * @param adapterName
     *        The name to be assigned to the adapter being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdapterRequest withAdapterName(String adapterName) {
        setAdapterName(adapterName);
        return this;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is used with multiple CreateAdapter
     * requests, the same session is returned. This token is employed to avoid unintentionally creating the same session
     * multiple times.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token is used to recognize the request. If the same token is used with multiple CreateAdapter
     *        requests, the same session is returned. This token is employed to avoid unintentionally creating the same
     *        session multiple times.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is used with multiple CreateAdapter
     * requests, the same session is returned. This token is employed to avoid unintentionally creating the same session
     * multiple times.
     * </p>
     * 
     * @return Idempotent token is used to recognize the request. If the same token is used with multiple CreateAdapter
     *         requests, the same session is returned. This token is employed to avoid unintentionally creating the same
     *         session multiple times.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is used with multiple CreateAdapter
     * requests, the same session is returned. This token is employed to avoid unintentionally creating the same session
     * multiple times.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token is used to recognize the request. If the same token is used with multiple CreateAdapter
     *        requests, the same session is returned. This token is employed to avoid unintentionally creating the same
     *        session multiple times.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdapterRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The description to be assigned to the adapter being created.
     * </p>
     * 
     * @param description
     *        The description to be assigned to the adapter being created.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description to be assigned to the adapter being created.
     * </p>
     * 
     * @return The description to be assigned to the adapter being created.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description to be assigned to the adapter being created.
     * </p>
     * 
     * @param description
     *        The description to be assigned to the adapter being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdapterRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of feature that the adapter is being trained on. Currrenly, supported feature types are:
     * <code>QUERIES</code>
     * </p>
     * 
     * @return The type of feature that the adapter is being trained on. Currrenly, supported feature types are:
     *         <code>QUERIES</code>
     * @see FeatureType
     */

    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * The type of feature that the adapter is being trained on. Currrenly, supported feature types are:
     * <code>QUERIES</code>
     * </p>
     * 
     * @param featureTypes
     *        The type of feature that the adapter is being trained on. Currrenly, supported feature types are:
     *        <code>QUERIES</code>
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
     * The type of feature that the adapter is being trained on. Currrenly, supported feature types are:
     * <code>QUERIES</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureTypes(java.util.Collection)} or {@link #withFeatureTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param featureTypes
     *        The type of feature that the adapter is being trained on. Currrenly, supported feature types are:
     *        <code>QUERIES</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public CreateAdapterRequest withFeatureTypes(String... featureTypes) {
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
     * The type of feature that the adapter is being trained on. Currrenly, supported feature types are:
     * <code>QUERIES</code>
     * </p>
     * 
     * @param featureTypes
     *        The type of feature that the adapter is being trained on. Currrenly, supported feature types are:
     *        <code>QUERIES</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public CreateAdapterRequest withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * The type of feature that the adapter is being trained on. Currrenly, supported feature types are:
     * <code>QUERIES</code>
     * </p>
     * 
     * @param featureTypes
     *        The type of feature that the adapter is being trained on. Currrenly, supported feature types are:
     *        <code>QUERIES</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public CreateAdapterRequest withFeatureTypes(FeatureType... featureTypes) {
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
     * Controls whether or not the adapter should automatically update.
     * </p>
     * 
     * @param autoUpdate
     *        Controls whether or not the adapter should automatically update.
     * @see AutoUpdate
     */

    public void setAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * Controls whether or not the adapter should automatically update.
     * </p>
     * 
     * @return Controls whether or not the adapter should automatically update.
     * @see AutoUpdate
     */

    public String getAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * <p>
     * Controls whether or not the adapter should automatically update.
     * </p>
     * 
     * @param autoUpdate
     *        Controls whether or not the adapter should automatically update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoUpdate
     */

    public CreateAdapterRequest withAutoUpdate(String autoUpdate) {
        setAutoUpdate(autoUpdate);
        return this;
    }

    /**
     * <p>
     * Controls whether or not the adapter should automatically update.
     * </p>
     * 
     * @param autoUpdate
     *        Controls whether or not the adapter should automatically update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoUpdate
     */

    public CreateAdapterRequest withAutoUpdate(AutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate.toString();
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to the adapter.
     * </p>
     * 
     * @return A list of tags to be added to the adapter.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to be added to the adapter.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to the adapter.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags to be added to the adapter.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to the adapter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdapterRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAdapterRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdapterRequest addTagsEntry(String key, String value) {
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

    public CreateAdapterRequest clearTagsEntries() {
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
        if (getAdapterName() != null)
            sb.append("AdapterName: ").append(getAdapterName()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
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

        if (obj instanceof CreateAdapterRequest == false)
            return false;
        CreateAdapterRequest other = (CreateAdapterRequest) obj;
        if (other.getAdapterName() == null ^ this.getAdapterName() == null)
            return false;
        if (other.getAdapterName() != null && other.getAdapterName().equals(this.getAdapterName()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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

        hashCode = prime * hashCode + ((getAdapterName() == null) ? 0 : getAdapterName().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
        hashCode = prime * hashCode + ((getAutoUpdate() == null) ? 0 : getAutoUpdate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAdapterRequest clone() {
        return (CreateAdapterRequest) super.clone();
    }

}
