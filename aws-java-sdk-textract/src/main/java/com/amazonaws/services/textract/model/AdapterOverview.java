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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on the adapter, including the adapter ID, Name, Creation time, and feature types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AdapterOverview" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdapterOverview implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     */
    private String adapterId;
    /**
     * <p>
     * A string naming the adapter resource.
     * </p>
     */
    private String adapterName;
    /**
     * <p>
     * The date and time that the adapter was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The feature types that the adapter is operating on.
     * </p>
     */
    private java.util.List<String> featureTypes;

    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     * 
     * @param adapterId
     *        A unique identifier for the adapter resource.
     */

    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     * 
     * @return A unique identifier for the adapter resource.
     */

    public String getAdapterId() {
        return this.adapterId;
    }

    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     * 
     * @param adapterId
     *        A unique identifier for the adapter resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdapterOverview withAdapterId(String adapterId) {
        setAdapterId(adapterId);
        return this;
    }

    /**
     * <p>
     * A string naming the adapter resource.
     * </p>
     * 
     * @param adapterName
     *        A string naming the adapter resource.
     */

    public void setAdapterName(String adapterName) {
        this.adapterName = adapterName;
    }

    /**
     * <p>
     * A string naming the adapter resource.
     * </p>
     * 
     * @return A string naming the adapter resource.
     */

    public String getAdapterName() {
        return this.adapterName;
    }

    /**
     * <p>
     * A string naming the adapter resource.
     * </p>
     * 
     * @param adapterName
     *        A string naming the adapter resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdapterOverview withAdapterName(String adapterName) {
        setAdapterName(adapterName);
        return this;
    }

    /**
     * <p>
     * The date and time that the adapter was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the adapter was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the adapter was created.
     * </p>
     * 
     * @return The date and time that the adapter was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the adapter was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the adapter was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdapterOverview withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The feature types that the adapter is operating on.
     * </p>
     * 
     * @return The feature types that the adapter is operating on.
     * @see FeatureType
     */

    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * The feature types that the adapter is operating on.
     * </p>
     * 
     * @param featureTypes
     *        The feature types that the adapter is operating on.
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
     * The feature types that the adapter is operating on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureTypes(java.util.Collection)} or {@link #withFeatureTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param featureTypes
     *        The feature types that the adapter is operating on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public AdapterOverview withFeatureTypes(String... featureTypes) {
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
     * The feature types that the adapter is operating on.
     * </p>
     * 
     * @param featureTypes
     *        The feature types that the adapter is operating on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public AdapterOverview withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * The feature types that the adapter is operating on.
     * </p>
     * 
     * @param featureTypes
     *        The feature types that the adapter is operating on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public AdapterOverview withFeatureTypes(FeatureType... featureTypes) {
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
        if (getFeatureTypes() != null)
            sb.append("FeatureTypes: ").append(getFeatureTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdapterOverview == false)
            return false;
        AdapterOverview other = (AdapterOverview) obj;
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
        if (other.getFeatureTypes() == null ^ this.getFeatureTypes() == null)
            return false;
        if (other.getFeatureTypes() != null && other.getFeatureTypes().equals(this.getFeatureTypes()) == false)
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
        hashCode = prime * hashCode + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
        return hashCode;
    }

    @Override
    public AdapterOverview clone() {
        try {
            return (AdapterOverview) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.AdapterOverviewMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
