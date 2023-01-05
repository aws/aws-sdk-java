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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data configuration for your dataset group and any additional datasets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DataConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the dataset group used to train the predictor.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * Aggregation and filling options for attributes in your dataset group.
     * </p>
     */
    private java.util.List<AttributeConfig> attributeConfigs;
    /**
     * <p>
     * Additional built-in datasets like Holidays and the Weather Index.
     * </p>
     */
    private java.util.List<AdditionalDataset> additionalDatasets;

    /**
     * <p>
     * The ARN of the dataset group used to train the predictor.
     * </p>
     * 
     * @param datasetGroupArn
     *        The ARN of the dataset group used to train the predictor.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group used to train the predictor.
     * </p>
     * 
     * @return The ARN of the dataset group used to train the predictor.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group used to train the predictor.
     * </p>
     * 
     * @param datasetGroupArn
     *        The ARN of the dataset group used to train the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataConfig withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * Aggregation and filling options for attributes in your dataset group.
     * </p>
     * 
     * @return Aggregation and filling options for attributes in your dataset group.
     */

    public java.util.List<AttributeConfig> getAttributeConfigs() {
        return attributeConfigs;
    }

    /**
     * <p>
     * Aggregation and filling options for attributes in your dataset group.
     * </p>
     * 
     * @param attributeConfigs
     *        Aggregation and filling options for attributes in your dataset group.
     */

    public void setAttributeConfigs(java.util.Collection<AttributeConfig> attributeConfigs) {
        if (attributeConfigs == null) {
            this.attributeConfigs = null;
            return;
        }

        this.attributeConfigs = new java.util.ArrayList<AttributeConfig>(attributeConfigs);
    }

    /**
     * <p>
     * Aggregation and filling options for attributes in your dataset group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeConfigs(java.util.Collection)} or {@link #withAttributeConfigs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributeConfigs
     *        Aggregation and filling options for attributes in your dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataConfig withAttributeConfigs(AttributeConfig... attributeConfigs) {
        if (this.attributeConfigs == null) {
            setAttributeConfigs(new java.util.ArrayList<AttributeConfig>(attributeConfigs.length));
        }
        for (AttributeConfig ele : attributeConfigs) {
            this.attributeConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Aggregation and filling options for attributes in your dataset group.
     * </p>
     * 
     * @param attributeConfigs
     *        Aggregation and filling options for attributes in your dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataConfig withAttributeConfigs(java.util.Collection<AttributeConfig> attributeConfigs) {
        setAttributeConfigs(attributeConfigs);
        return this;
    }

    /**
     * <p>
     * Additional built-in datasets like Holidays and the Weather Index.
     * </p>
     * 
     * @return Additional built-in datasets like Holidays and the Weather Index.
     */

    public java.util.List<AdditionalDataset> getAdditionalDatasets() {
        return additionalDatasets;
    }

    /**
     * <p>
     * Additional built-in datasets like Holidays and the Weather Index.
     * </p>
     * 
     * @param additionalDatasets
     *        Additional built-in datasets like Holidays and the Weather Index.
     */

    public void setAdditionalDatasets(java.util.Collection<AdditionalDataset> additionalDatasets) {
        if (additionalDatasets == null) {
            this.additionalDatasets = null;
            return;
        }

        this.additionalDatasets = new java.util.ArrayList<AdditionalDataset>(additionalDatasets);
    }

    /**
     * <p>
     * Additional built-in datasets like Holidays and the Weather Index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalDatasets(java.util.Collection)} or {@link #withAdditionalDatasets(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param additionalDatasets
     *        Additional built-in datasets like Holidays and the Weather Index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataConfig withAdditionalDatasets(AdditionalDataset... additionalDatasets) {
        if (this.additionalDatasets == null) {
            setAdditionalDatasets(new java.util.ArrayList<AdditionalDataset>(additionalDatasets.length));
        }
        for (AdditionalDataset ele : additionalDatasets) {
            this.additionalDatasets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional built-in datasets like Holidays and the Weather Index.
     * </p>
     * 
     * @param additionalDatasets
     *        Additional built-in datasets like Holidays and the Weather Index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataConfig withAdditionalDatasets(java.util.Collection<AdditionalDataset> additionalDatasets) {
        setAdditionalDatasets(additionalDatasets);
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
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getAttributeConfigs() != null)
            sb.append("AttributeConfigs: ").append(getAttributeConfigs()).append(",");
        if (getAdditionalDatasets() != null)
            sb.append("AdditionalDatasets: ").append(getAdditionalDatasets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataConfig == false)
            return false;
        DataConfig other = (DataConfig) obj;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getAttributeConfigs() == null ^ this.getAttributeConfigs() == null)
            return false;
        if (other.getAttributeConfigs() != null && other.getAttributeConfigs().equals(this.getAttributeConfigs()) == false)
            return false;
        if (other.getAdditionalDatasets() == null ^ this.getAdditionalDatasets() == null)
            return false;
        if (other.getAdditionalDatasets() != null && other.getAdditionalDatasets().equals(this.getAdditionalDatasets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getAttributeConfigs() == null) ? 0 : getAttributeConfigs().hashCode());
        hashCode = prime * hashCode + ((getAdditionalDatasets() == null) ? 0 : getAdditionalDatasets().hashCode());
        return hashCode;
    }

    @Override
    public DataConfig clone() {
        try {
            return (DataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.DataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
