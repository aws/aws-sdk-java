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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional attributes of an inventory asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AssetListingItemAdditionalAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetListingItemAdditionalAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metadata forms that form additional attributes of the metadata asset.
     * </p>
     */
    private String forms;
    /**
     * <p>
     * The latest time series data points forms included in the additional attributes of an asset.
     * </p>
     */
    private java.util.List<TimeSeriesDataPointSummaryFormOutput> latestTimeSeriesDataPointForms;

    /**
     * <p>
     * The metadata forms that form additional attributes of the metadata asset.
     * </p>
     * 
     * @param forms
     *        The metadata forms that form additional attributes of the metadata asset.
     */

    public void setForms(String forms) {
        this.forms = forms;
    }

    /**
     * <p>
     * The metadata forms that form additional attributes of the metadata asset.
     * </p>
     * 
     * @return The metadata forms that form additional attributes of the metadata asset.
     */

    public String getForms() {
        return this.forms;
    }

    /**
     * <p>
     * The metadata forms that form additional attributes of the metadata asset.
     * </p>
     * 
     * @param forms
     *        The metadata forms that form additional attributes of the metadata asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItemAdditionalAttributes withForms(String forms) {
        setForms(forms);
        return this;
    }

    /**
     * <p>
     * The latest time series data points forms included in the additional attributes of an asset.
     * </p>
     * 
     * @return The latest time series data points forms included in the additional attributes of an asset.
     */

    public java.util.List<TimeSeriesDataPointSummaryFormOutput> getLatestTimeSeriesDataPointForms() {
        return latestTimeSeriesDataPointForms;
    }

    /**
     * <p>
     * The latest time series data points forms included in the additional attributes of an asset.
     * </p>
     * 
     * @param latestTimeSeriesDataPointForms
     *        The latest time series data points forms included in the additional attributes of an asset.
     */

    public void setLatestTimeSeriesDataPointForms(java.util.Collection<TimeSeriesDataPointSummaryFormOutput> latestTimeSeriesDataPointForms) {
        if (latestTimeSeriesDataPointForms == null) {
            this.latestTimeSeriesDataPointForms = null;
            return;
        }

        this.latestTimeSeriesDataPointForms = new java.util.ArrayList<TimeSeriesDataPointSummaryFormOutput>(latestTimeSeriesDataPointForms);
    }

    /**
     * <p>
     * The latest time series data points forms included in the additional attributes of an asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLatestTimeSeriesDataPointForms(java.util.Collection)} or
     * {@link #withLatestTimeSeriesDataPointForms(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param latestTimeSeriesDataPointForms
     *        The latest time series data points forms included in the additional attributes of an asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItemAdditionalAttributes withLatestTimeSeriesDataPointForms(TimeSeriesDataPointSummaryFormOutput... latestTimeSeriesDataPointForms) {
        if (this.latestTimeSeriesDataPointForms == null) {
            setLatestTimeSeriesDataPointForms(new java.util.ArrayList<TimeSeriesDataPointSummaryFormOutput>(latestTimeSeriesDataPointForms.length));
        }
        for (TimeSeriesDataPointSummaryFormOutput ele : latestTimeSeriesDataPointForms) {
            this.latestTimeSeriesDataPointForms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The latest time series data points forms included in the additional attributes of an asset.
     * </p>
     * 
     * @param latestTimeSeriesDataPointForms
     *        The latest time series data points forms included in the additional attributes of an asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListingItemAdditionalAttributes withLatestTimeSeriesDataPointForms(
            java.util.Collection<TimeSeriesDataPointSummaryFormOutput> latestTimeSeriesDataPointForms) {
        setLatestTimeSeriesDataPointForms(latestTimeSeriesDataPointForms);
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
        if (getForms() != null)
            sb.append("Forms: ").append(getForms()).append(",");
        if (getLatestTimeSeriesDataPointForms() != null)
            sb.append("LatestTimeSeriesDataPointForms: ").append(getLatestTimeSeriesDataPointForms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetListingItemAdditionalAttributes == false)
            return false;
        AssetListingItemAdditionalAttributes other = (AssetListingItemAdditionalAttributes) obj;
        if (other.getForms() == null ^ this.getForms() == null)
            return false;
        if (other.getForms() != null && other.getForms().equals(this.getForms()) == false)
            return false;
        if (other.getLatestTimeSeriesDataPointForms() == null ^ this.getLatestTimeSeriesDataPointForms() == null)
            return false;
        if (other.getLatestTimeSeriesDataPointForms() != null
                && other.getLatestTimeSeriesDataPointForms().equals(this.getLatestTimeSeriesDataPointForms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForms() == null) ? 0 : getForms().hashCode());
        hashCode = prime * hashCode + ((getLatestTimeSeriesDataPointForms() == null) ? 0 : getLatestTimeSeriesDataPointForms().hashCode());
        return hashCode;
    }

    @Override
    public AssetListingItemAdditionalAttributes clone() {
        try {
            return (AssetListingItemAdditionalAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.AssetListingItemAdditionalAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
