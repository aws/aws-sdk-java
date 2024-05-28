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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/UpdateAdapter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAdapterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A string containing a unique ID for the adapter that has been updated.
     * </p>
     */
    private String adapterId;
    /**
     * <p>
     * A string containing the name of the adapter that has been updated.
     * </p>
     */
    private String adapterName;
    /**
     * <p>
     * An object specifying the creation time of the the adapter that has been updated.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A string containing the description of the adapter that has been updated.
     * </p>
     */
    private String description;
    /**
     * <p>
     * List of the targeted feature types for the updated adapter.
     * </p>
     */
    private java.util.List<String> featureTypes;
    /**
     * <p>
     * The auto-update status of the adapter that has been updated.
     * </p>
     */
    private String autoUpdate;

    /**
     * <p>
     * A string containing a unique ID for the adapter that has been updated.
     * </p>
     * 
     * @param adapterId
     *        A string containing a unique ID for the adapter that has been updated.
     */

    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A string containing a unique ID for the adapter that has been updated.
     * </p>
     * 
     * @return A string containing a unique ID for the adapter that has been updated.
     */

    public String getAdapterId() {
        return this.adapterId;
    }

    /**
     * <p>
     * A string containing a unique ID for the adapter that has been updated.
     * </p>
     * 
     * @param adapterId
     *        A string containing a unique ID for the adapter that has been updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAdapterResult withAdapterId(String adapterId) {
        setAdapterId(adapterId);
        return this;
    }

    /**
     * <p>
     * A string containing the name of the adapter that has been updated.
     * </p>
     * 
     * @param adapterName
     *        A string containing the name of the adapter that has been updated.
     */

    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName;
    }

    /**
     * <p>
     * A string containing the name of the adapter that has been updated.
     * </p>
     * 
     * @return A string containing the name of the adapter that has been updated.
     */

    public String getAdapterName() {
        return this.adapterName;
    }

    /**
     * <p>
     * A string containing the name of the adapter that has been updated.
     * </p>
     * 
     * @param adapterName
     *        A string containing the name of the adapter that has been updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAdapterResult withAdapterName(String adapterName) {
        setAdapterName(adapterName);
        return this;
    }

    /**
     * <p>
     * An object specifying the creation time of the the adapter that has been updated.
     * </p>
     * 
     * @param creationTime
     *        An object specifying the creation time of the the adapter that has been updated.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * An object specifying the creation time of the the adapter that has been updated.
     * </p>
     * 
     * @return An object specifying the creation time of the the adapter that has been updated.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * An object specifying the creation time of the the adapter that has been updated.
     * </p>
     * 
     * @param creationTime
     *        An object specifying the creation time of the the adapter that has been updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAdapterResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A string containing the description of the adapter that has been updated.
     * </p>
     * 
     * @param description
     *        A string containing the description of the adapter that has been updated.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A string containing the description of the adapter that has been updated.
     * </p>
     * 
     * @return A string containing the description of the adapter that has been updated.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A string containing the description of the adapter that has been updated.
     * </p>
     * 
     * @param description
     *        A string containing the description of the adapter that has been updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAdapterResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * List of the targeted feature types for the updated adapter.
     * </p>
     * 
     * @return List of the targeted feature types for the updated adapter.
     * @see FeatureType
     */

    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * List of the targeted feature types for the updated adapter.
     * </p>
     * 
     * @param featureTypes
     *        List of the targeted feature types for the updated adapter.
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
     * List of the targeted feature types for the updated adapter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureTypes(java.util.Collection)} or {@link #withFeatureTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param featureTypes
     *        List of the targeted feature types for the updated adapter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public UpdateAdapterResult withFeatureTypes(String... featureTypes) {
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
     * List of the targeted feature types for the updated adapter.
     * </p>
     * 
     * @param featureTypes
     *        List of the targeted feature types for the updated adapter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public UpdateAdapterResult withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * List of the targeted feature types for the updated adapter.
     * </p>
     * 
     * @param featureTypes
     *        List of the targeted feature types for the updated adapter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public UpdateAdapterResult withFeatureTypes(FeatureType... featureTypes) {
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
     * The auto-update status of the adapter that has been updated.
     * </p>
     * 
     * @param autoUpdate
     *        The auto-update status of the adapter that has been updated.
     * @see AutoUpdate
     */

    public void setAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * The auto-update status of the adapter that has been updated.
     * </p>
     * 
     * @return The auto-update status of the adapter that has been updated.
     * @see AutoUpdate
     */

    public String getAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * <p>
     * The auto-update status of the adapter that has been updated.
     * </p>
     * 
     * @param autoUpdate
     *        The auto-update status of the adapter that has been updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoUpdate
     */

    public UpdateAdapterResult withAutoUpdate(String autoUpdate) {
        setAutoUpdate(autoUpdate);
        return this;
    }

    /**
     * <p>
     * The auto-update status of the adapter that has been updated.
     * </p>
     * 
     * @param autoUpdate
     *        The auto-update status of the adapter that has been updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoUpdate
     */

    public UpdateAdapterResult withAutoUpdate(AutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate.toString();
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
            sb.append("AutoUpdate: ").append(getAutoUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAdapterResult == false)
            return false;
        UpdateAdapterResult other = (UpdateAdapterResult) obj;
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
        return hashCode;
    }

    @Override
    public UpdateAdapterResult clone() {
        try {
            return (UpdateAdapterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
