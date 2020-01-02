/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The data used to train a predictor. The data includes a dataset group and any supplementary features. You specify
 * this object in the <a>CreatePredictor</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/InputDataConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * An array of supplementary features. The only supported feature is a holiday calendar.
     * </p>
     */
    private java.util.List<SupplementaryFeature> supplementaryFeatures;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset group.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDataConfig withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * An array of supplementary features. The only supported feature is a holiday calendar.
     * </p>
     * 
     * @return An array of supplementary features. The only supported feature is a holiday calendar.
     */

    public java.util.List<SupplementaryFeature> getSupplementaryFeatures() {
        return supplementaryFeatures;
    }

    /**
     * <p>
     * An array of supplementary features. The only supported feature is a holiday calendar.
     * </p>
     * 
     * @param supplementaryFeatures
     *        An array of supplementary features. The only supported feature is a holiday calendar.
     */

    public void setSupplementaryFeatures(java.util.Collection<SupplementaryFeature> supplementaryFeatures) {
        if (supplementaryFeatures == null) {
            this.supplementaryFeatures = null;
            return;
        }

        this.supplementaryFeatures = new java.util.ArrayList<SupplementaryFeature>(supplementaryFeatures);
    }

    /**
     * <p>
     * An array of supplementary features. The only supported feature is a holiday calendar.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupplementaryFeatures(java.util.Collection)} or
     * {@link #withSupplementaryFeatures(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supplementaryFeatures
     *        An array of supplementary features. The only supported feature is a holiday calendar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDataConfig withSupplementaryFeatures(SupplementaryFeature... supplementaryFeatures) {
        if (this.supplementaryFeatures == null) {
            setSupplementaryFeatures(new java.util.ArrayList<SupplementaryFeature>(supplementaryFeatures.length));
        }
        for (SupplementaryFeature ele : supplementaryFeatures) {
            this.supplementaryFeatures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of supplementary features. The only supported feature is a holiday calendar.
     * </p>
     * 
     * @param supplementaryFeatures
     *        An array of supplementary features. The only supported feature is a holiday calendar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDataConfig withSupplementaryFeatures(java.util.Collection<SupplementaryFeature> supplementaryFeatures) {
        setSupplementaryFeatures(supplementaryFeatures);
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
        if (getSupplementaryFeatures() != null)
            sb.append("SupplementaryFeatures: ").append(getSupplementaryFeatures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDataConfig == false)
            return false;
        InputDataConfig other = (InputDataConfig) obj;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getSupplementaryFeatures() == null ^ this.getSupplementaryFeatures() == null)
            return false;
        if (other.getSupplementaryFeatures() != null && other.getSupplementaryFeatures().equals(this.getSupplementaryFeatures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getSupplementaryFeatures() == null) ? 0 : getSupplementaryFeatures().hashCode());
        return hashCode;
    }

    @Override
    public InputDataConfig clone() {
        try {
            return (InputDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.InputDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
