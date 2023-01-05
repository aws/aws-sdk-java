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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The options that determine the presentation of histogram bins.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/HistogramBinOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HistogramBinOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The options that determine the selected bin type.
     * </p>
     */
    private String selectedBinType;
    /**
     * <p>
     * The options that determine the bin count of a histogram.
     * </p>
     */
    private BinCountOptions binCount;
    /**
     * <p>
     * The options that determine the bin width of a histogram.
     * </p>
     */
    private BinWidthOptions binWidth;
    /**
     * <p>
     * The options that determine the bin start value.
     * </p>
     */
    private Double startValue;

    /**
     * <p>
     * The options that determine the selected bin type.
     * </p>
     * 
     * @param selectedBinType
     *        The options that determine the selected bin type.
     * @see HistogramBinType
     */

    public void setSelectedBinType(String selectedBinType) {
        this.selectedBinType = selectedBinType;
    }

    /**
     * <p>
     * The options that determine the selected bin type.
     * </p>
     * 
     * @return The options that determine the selected bin type.
     * @see HistogramBinType
     */

    public String getSelectedBinType() {
        return this.selectedBinType;
    }

    /**
     * <p>
     * The options that determine the selected bin type.
     * </p>
     * 
     * @param selectedBinType
     *        The options that determine the selected bin type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HistogramBinType
     */

    public HistogramBinOptions withSelectedBinType(String selectedBinType) {
        setSelectedBinType(selectedBinType);
        return this;
    }

    /**
     * <p>
     * The options that determine the selected bin type.
     * </p>
     * 
     * @param selectedBinType
     *        The options that determine the selected bin type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HistogramBinType
     */

    public HistogramBinOptions withSelectedBinType(HistogramBinType selectedBinType) {
        this.selectedBinType = selectedBinType.toString();
        return this;
    }

    /**
     * <p>
     * The options that determine the bin count of a histogram.
     * </p>
     * 
     * @param binCount
     *        The options that determine the bin count of a histogram.
     */

    public void setBinCount(BinCountOptions binCount) {
        this.binCount = binCount;
    }

    /**
     * <p>
     * The options that determine the bin count of a histogram.
     * </p>
     * 
     * @return The options that determine the bin count of a histogram.
     */

    public BinCountOptions getBinCount() {
        return this.binCount;
    }

    /**
     * <p>
     * The options that determine the bin count of a histogram.
     * </p>
     * 
     * @param binCount
     *        The options that determine the bin count of a histogram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramBinOptions withBinCount(BinCountOptions binCount) {
        setBinCount(binCount);
        return this;
    }

    /**
     * <p>
     * The options that determine the bin width of a histogram.
     * </p>
     * 
     * @param binWidth
     *        The options that determine the bin width of a histogram.
     */

    public void setBinWidth(BinWidthOptions binWidth) {
        this.binWidth = binWidth;
    }

    /**
     * <p>
     * The options that determine the bin width of a histogram.
     * </p>
     * 
     * @return The options that determine the bin width of a histogram.
     */

    public BinWidthOptions getBinWidth() {
        return this.binWidth;
    }

    /**
     * <p>
     * The options that determine the bin width of a histogram.
     * </p>
     * 
     * @param binWidth
     *        The options that determine the bin width of a histogram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramBinOptions withBinWidth(BinWidthOptions binWidth) {
        setBinWidth(binWidth);
        return this;
    }

    /**
     * <p>
     * The options that determine the bin start value.
     * </p>
     * 
     * @param startValue
     *        The options that determine the bin start value.
     */

    public void setStartValue(Double startValue) {
        this.startValue = startValue;
    }

    /**
     * <p>
     * The options that determine the bin start value.
     * </p>
     * 
     * @return The options that determine the bin start value.
     */

    public Double getStartValue() {
        return this.startValue;
    }

    /**
     * <p>
     * The options that determine the bin start value.
     * </p>
     * 
     * @param startValue
     *        The options that determine the bin start value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramBinOptions withStartValue(Double startValue) {
        setStartValue(startValue);
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
        if (getSelectedBinType() != null)
            sb.append("SelectedBinType: ").append(getSelectedBinType()).append(",");
        if (getBinCount() != null)
            sb.append("BinCount: ").append(getBinCount()).append(",");
        if (getBinWidth() != null)
            sb.append("BinWidth: ").append(getBinWidth()).append(",");
        if (getStartValue() != null)
            sb.append("StartValue: ").append(getStartValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HistogramBinOptions == false)
            return false;
        HistogramBinOptions other = (HistogramBinOptions) obj;
        if (other.getSelectedBinType() == null ^ this.getSelectedBinType() == null)
            return false;
        if (other.getSelectedBinType() != null && other.getSelectedBinType().equals(this.getSelectedBinType()) == false)
            return false;
        if (other.getBinCount() == null ^ this.getBinCount() == null)
            return false;
        if (other.getBinCount() != null && other.getBinCount().equals(this.getBinCount()) == false)
            return false;
        if (other.getBinWidth() == null ^ this.getBinWidth() == null)
            return false;
        if (other.getBinWidth() != null && other.getBinWidth().equals(this.getBinWidth()) == false)
            return false;
        if (other.getStartValue() == null ^ this.getStartValue() == null)
            return false;
        if (other.getStartValue() != null && other.getStartValue().equals(this.getStartValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectedBinType() == null) ? 0 : getSelectedBinType().hashCode());
        hashCode = prime * hashCode + ((getBinCount() == null) ? 0 : getBinCount().hashCode());
        hashCode = prime * hashCode + ((getBinWidth() == null) ? 0 : getBinWidth().hashCode());
        hashCode = prime * hashCode + ((getStartValue() == null) ? 0 : getStartValue().hashCode());
        return hashCode;
    }

    @Override
    public HistogramBinOptions clone() {
        try {
            return (HistogramBinOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.HistogramBinOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
