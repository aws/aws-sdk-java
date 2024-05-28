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
 * Summary info for an adapter version. Contains information on the AdapterId, AdapterVersion, CreationTime,
 * FeatureTypes, and Status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AdapterVersionOverview" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdapterVersionOverview implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the adapter associated with a given adapter version.
     * </p>
     */
    private String adapterId;
    /**
     * <p>
     * An identified for a given adapter version.
     * </p>
     */
    private String adapterVersion;
    /**
     * <p>
     * The date and time that a given adapter version was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The feature types that the adapter version is operating on.
     * </p>
     */
    private java.util.List<String> featureTypes;
    /**
     * <p>
     * Contains information on the status of a given adapter version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A message explaining the status of a given adapter vesion.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * A unique identifier for the adapter associated with a given adapter version.
     * </p>
     * 
     * @param adapterId
     *        A unique identifier for the adapter associated with a given adapter version.
     */

    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A unique identifier for the adapter associated with a given adapter version.
     * </p>
     * 
     * @return A unique identifier for the adapter associated with a given adapter version.
     */

    public String getAdapterId() {
        return this.adapterId;
    }

    /**
     * <p>
     * A unique identifier for the adapter associated with a given adapter version.
     * </p>
     * 
     * @param adapterId
     *        A unique identifier for the adapter associated with a given adapter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdapterVersionOverview withAdapterId(String adapterId) {
        setAdapterId(adapterId);
        return this;
    }

    /**
     * <p>
     * An identified for a given adapter version.
     * </p>
     * 
     * @param adapterVersion
     *        An identified for a given adapter version.
     */

    public void setAdapterVersion(String adapterVersion) {
        this.adapterVersion = adapterVersion;
    }

    /**
     * <p>
     * An identified for a given adapter version.
     * </p>
     * 
     * @return An identified for a given adapter version.
     */

    public String getAdapterVersion() {
        return this.adapterVersion;
    }

    /**
     * <p>
     * An identified for a given adapter version.
     * </p>
     * 
     * @param adapterVersion
     *        An identified for a given adapter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdapterVersionOverview withAdapterVersion(String adapterVersion) {
        setAdapterVersion(adapterVersion);
        return this;
    }

    /**
     * <p>
     * The date and time that a given adapter version was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that a given adapter version was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that a given adapter version was created.
     * </p>
     * 
     * @return The date and time that a given adapter version was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that a given adapter version was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that a given adapter version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdapterVersionOverview withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The feature types that the adapter version is operating on.
     * </p>
     * 
     * @return The feature types that the adapter version is operating on.
     * @see FeatureType
     */

    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * The feature types that the adapter version is operating on.
     * </p>
     * 
     * @param featureTypes
     *        The feature types that the adapter version is operating on.
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
     * The feature types that the adapter version is operating on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureTypes(java.util.Collection)} or {@link #withFeatureTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param featureTypes
     *        The feature types that the adapter version is operating on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public AdapterVersionOverview withFeatureTypes(String... featureTypes) {
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
     * The feature types that the adapter version is operating on.
     * </p>
     * 
     * @param featureTypes
     *        The feature types that the adapter version is operating on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public AdapterVersionOverview withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * The feature types that the adapter version is operating on.
     * </p>
     * 
     * @param featureTypes
     *        The feature types that the adapter version is operating on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public AdapterVersionOverview withFeatureTypes(FeatureType... featureTypes) {
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
     * Contains information on the status of a given adapter version.
     * </p>
     * 
     * @param status
     *        Contains information on the status of a given adapter version.
     * @see AdapterVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Contains information on the status of a given adapter version.
     * </p>
     * 
     * @return Contains information on the status of a given adapter version.
     * @see AdapterVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Contains information on the status of a given adapter version.
     * </p>
     * 
     * @param status
     *        Contains information on the status of a given adapter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdapterVersionStatus
     */

    public AdapterVersionOverview withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Contains information on the status of a given adapter version.
     * </p>
     * 
     * @param status
     *        Contains information on the status of a given adapter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdapterVersionStatus
     */

    public AdapterVersionOverview withStatus(AdapterVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message explaining the status of a given adapter vesion.
     * </p>
     * 
     * @param statusMessage
     *        A message explaining the status of a given adapter vesion.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message explaining the status of a given adapter vesion.
     * </p>
     * 
     * @return A message explaining the status of a given adapter vesion.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A message explaining the status of a given adapter vesion.
     * </p>
     * 
     * @param statusMessage
     *        A message explaining the status of a given adapter vesion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdapterVersionOverview withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getAdapterVersion() != null)
            sb.append("AdapterVersion: ").append(getAdapterVersion()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFeatureTypes() != null)
            sb.append("FeatureTypes: ").append(getFeatureTypes()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdapterVersionOverview == false)
            return false;
        AdapterVersionOverview other = (AdapterVersionOverview) obj;
        if (other.getAdapterId() == null ^ this.getAdapterId() == null)
            return false;
        if (other.getAdapterId() != null && other.getAdapterId().equals(this.getAdapterId()) == false)
            return false;
        if (other.getAdapterVersion() == null ^ this.getAdapterVersion() == null)
            return false;
        if (other.getAdapterVersion() != null && other.getAdapterVersion().equals(this.getAdapterVersion()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFeatureTypes() == null ^ this.getFeatureTypes() == null)
            return false;
        if (other.getFeatureTypes() != null && other.getFeatureTypes().equals(this.getFeatureTypes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdapterId() == null) ? 0 : getAdapterId().hashCode());
        hashCode = prime * hashCode + ((getAdapterVersion() == null) ? 0 : getAdapterVersion().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public AdapterVersionOverview clone() {
        try {
            return (AdapterVersionOverview) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.AdapterVersionOverviewMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
