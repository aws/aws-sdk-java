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
 * The additional attributes of an inventory asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AssetItemAdditionalAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetItemAdditionalAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The forms included in the additional attributes of an inventory asset.
     * </p>
     */
    private java.util.List<FormOutput> formsOutput;
    /**
     * <p>
     * The latest time series data points forms included in the additional attributes of an asset.
     * </p>
     */
    private java.util.List<TimeSeriesDataPointSummaryFormOutput> latestTimeSeriesDataPointFormsOutput;
    /**
     * <p>
     * The read-only forms included in the additional attributes of an inventory asset.
     * </p>
     */
    private java.util.List<FormOutput> readOnlyFormsOutput;

    /**
     * <p>
     * The forms included in the additional attributes of an inventory asset.
     * </p>
     * 
     * @return The forms included in the additional attributes of an inventory asset.
     */

    public java.util.List<FormOutput> getFormsOutput() {
        return formsOutput;
    }

    /**
     * <p>
     * The forms included in the additional attributes of an inventory asset.
     * </p>
     * 
     * @param formsOutput
     *        The forms included in the additional attributes of an inventory asset.
     */

    public void setFormsOutput(java.util.Collection<FormOutput> formsOutput) {
        if (formsOutput == null) {
            this.formsOutput = null;
            return;
        }

        this.formsOutput = new java.util.ArrayList<FormOutput>(formsOutput);
    }

    /**
     * <p>
     * The forms included in the additional attributes of an inventory asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFormsOutput(java.util.Collection)} or {@link #withFormsOutput(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param formsOutput
     *        The forms included in the additional attributes of an inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItemAdditionalAttributes withFormsOutput(FormOutput... formsOutput) {
        if (this.formsOutput == null) {
            setFormsOutput(new java.util.ArrayList<FormOutput>(formsOutput.length));
        }
        for (FormOutput ele : formsOutput) {
            this.formsOutput.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The forms included in the additional attributes of an inventory asset.
     * </p>
     * 
     * @param formsOutput
     *        The forms included in the additional attributes of an inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItemAdditionalAttributes withFormsOutput(java.util.Collection<FormOutput> formsOutput) {
        setFormsOutput(formsOutput);
        return this;
    }

    /**
     * <p>
     * The latest time series data points forms included in the additional attributes of an asset.
     * </p>
     * 
     * @return The latest time series data points forms included in the additional attributes of an asset.
     */

    public java.util.List<TimeSeriesDataPointSummaryFormOutput> getLatestTimeSeriesDataPointFormsOutput() {
        return latestTimeSeriesDataPointFormsOutput;
    }

    /**
     * <p>
     * The latest time series data points forms included in the additional attributes of an asset.
     * </p>
     * 
     * @param latestTimeSeriesDataPointFormsOutput
     *        The latest time series data points forms included in the additional attributes of an asset.
     */

    public void setLatestTimeSeriesDataPointFormsOutput(java.util.Collection<TimeSeriesDataPointSummaryFormOutput> latestTimeSeriesDataPointFormsOutput) {
        if (latestTimeSeriesDataPointFormsOutput == null) {
            this.latestTimeSeriesDataPointFormsOutput = null;
            return;
        }

        this.latestTimeSeriesDataPointFormsOutput = new java.util.ArrayList<TimeSeriesDataPointSummaryFormOutput>(latestTimeSeriesDataPointFormsOutput);
    }

    /**
     * <p>
     * The latest time series data points forms included in the additional attributes of an asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLatestTimeSeriesDataPointFormsOutput(java.util.Collection)} or
     * {@link #withLatestTimeSeriesDataPointFormsOutput(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param latestTimeSeriesDataPointFormsOutput
     *        The latest time series data points forms included in the additional attributes of an asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItemAdditionalAttributes withLatestTimeSeriesDataPointFormsOutput(TimeSeriesDataPointSummaryFormOutput... latestTimeSeriesDataPointFormsOutput) {
        if (this.latestTimeSeriesDataPointFormsOutput == null) {
            setLatestTimeSeriesDataPointFormsOutput(new java.util.ArrayList<TimeSeriesDataPointSummaryFormOutput>(latestTimeSeriesDataPointFormsOutput.length));
        }
        for (TimeSeriesDataPointSummaryFormOutput ele : latestTimeSeriesDataPointFormsOutput) {
            this.latestTimeSeriesDataPointFormsOutput.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The latest time series data points forms included in the additional attributes of an asset.
     * </p>
     * 
     * @param latestTimeSeriesDataPointFormsOutput
     *        The latest time series data points forms included in the additional attributes of an asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItemAdditionalAttributes withLatestTimeSeriesDataPointFormsOutput(
            java.util.Collection<TimeSeriesDataPointSummaryFormOutput> latestTimeSeriesDataPointFormsOutput) {
        setLatestTimeSeriesDataPointFormsOutput(latestTimeSeriesDataPointFormsOutput);
        return this;
    }

    /**
     * <p>
     * The read-only forms included in the additional attributes of an inventory asset.
     * </p>
     * 
     * @return The read-only forms included in the additional attributes of an inventory asset.
     */

    public java.util.List<FormOutput> getReadOnlyFormsOutput() {
        return readOnlyFormsOutput;
    }

    /**
     * <p>
     * The read-only forms included in the additional attributes of an inventory asset.
     * </p>
     * 
     * @param readOnlyFormsOutput
     *        The read-only forms included in the additional attributes of an inventory asset.
     */

    public void setReadOnlyFormsOutput(java.util.Collection<FormOutput> readOnlyFormsOutput) {
        if (readOnlyFormsOutput == null) {
            this.readOnlyFormsOutput = null;
            return;
        }

        this.readOnlyFormsOutput = new java.util.ArrayList<FormOutput>(readOnlyFormsOutput);
    }

    /**
     * <p>
     * The read-only forms included in the additional attributes of an inventory asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadOnlyFormsOutput(java.util.Collection)} or {@link #withReadOnlyFormsOutput(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param readOnlyFormsOutput
     *        The read-only forms included in the additional attributes of an inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItemAdditionalAttributes withReadOnlyFormsOutput(FormOutput... readOnlyFormsOutput) {
        if (this.readOnlyFormsOutput == null) {
            setReadOnlyFormsOutput(new java.util.ArrayList<FormOutput>(readOnlyFormsOutput.length));
        }
        for (FormOutput ele : readOnlyFormsOutput) {
            this.readOnlyFormsOutput.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The read-only forms included in the additional attributes of an inventory asset.
     * </p>
     * 
     * @param readOnlyFormsOutput
     *        The read-only forms included in the additional attributes of an inventory asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetItemAdditionalAttributes withReadOnlyFormsOutput(java.util.Collection<FormOutput> readOnlyFormsOutput) {
        setReadOnlyFormsOutput(readOnlyFormsOutput);
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
        if (getFormsOutput() != null)
            sb.append("FormsOutput: ").append(getFormsOutput()).append(",");
        if (getLatestTimeSeriesDataPointFormsOutput() != null)
            sb.append("LatestTimeSeriesDataPointFormsOutput: ").append(getLatestTimeSeriesDataPointFormsOutput()).append(",");
        if (getReadOnlyFormsOutput() != null)
            sb.append("ReadOnlyFormsOutput: ").append(getReadOnlyFormsOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetItemAdditionalAttributes == false)
            return false;
        AssetItemAdditionalAttributes other = (AssetItemAdditionalAttributes) obj;
        if (other.getFormsOutput() == null ^ this.getFormsOutput() == null)
            return false;
        if (other.getFormsOutput() != null && other.getFormsOutput().equals(this.getFormsOutput()) == false)
            return false;
        if (other.getLatestTimeSeriesDataPointFormsOutput() == null ^ this.getLatestTimeSeriesDataPointFormsOutput() == null)
            return false;
        if (other.getLatestTimeSeriesDataPointFormsOutput() != null
                && other.getLatestTimeSeriesDataPointFormsOutput().equals(this.getLatestTimeSeriesDataPointFormsOutput()) == false)
            return false;
        if (other.getReadOnlyFormsOutput() == null ^ this.getReadOnlyFormsOutput() == null)
            return false;
        if (other.getReadOnlyFormsOutput() != null && other.getReadOnlyFormsOutput().equals(this.getReadOnlyFormsOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormsOutput() == null) ? 0 : getFormsOutput().hashCode());
        hashCode = prime * hashCode + ((getLatestTimeSeriesDataPointFormsOutput() == null) ? 0 : getLatestTimeSeriesDataPointFormsOutput().hashCode());
        hashCode = prime * hashCode + ((getReadOnlyFormsOutput() == null) ? 0 : getReadOnlyFormsOutput().hashCode());
        return hashCode;
    }

    @Override
    public AssetItemAdditionalAttributes clone() {
        try {
            return (AssetItemAdditionalAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.AssetItemAdditionalAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
