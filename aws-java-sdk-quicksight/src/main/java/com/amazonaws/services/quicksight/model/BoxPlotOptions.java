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
 * The options of a box plot visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/BoxPlotOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BoxPlotOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The style options of the box plot.
     * </p>
     */
    private BoxPlotStyleOptions styleOptions;
    /**
     * <p>
     * Determines the visibility of the outlier in a box plot.
     * </p>
     */
    private String outlierVisibility;
    /**
     * <p>
     * Determines the visibility of all data points of the box plot.
     * </p>
     */
    private String allDataPointsVisibility;

    /**
     * <p>
     * The style options of the box plot.
     * </p>
     * 
     * @param styleOptions
     *        The style options of the box plot.
     */

    public void setStyleOptions(BoxPlotStyleOptions styleOptions) {
        this.styleOptions = styleOptions;
    }

    /**
     * <p>
     * The style options of the box plot.
     * </p>
     * 
     * @return The style options of the box plot.
     */

    public BoxPlotStyleOptions getStyleOptions() {
        return this.styleOptions;
    }

    /**
     * <p>
     * The style options of the box plot.
     * </p>
     * 
     * @param styleOptions
     *        The style options of the box plot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BoxPlotOptions withStyleOptions(BoxPlotStyleOptions styleOptions) {
        setStyleOptions(styleOptions);
        return this;
    }

    /**
     * <p>
     * Determines the visibility of the outlier in a box plot.
     * </p>
     * 
     * @param outlierVisibility
     *        Determines the visibility of the outlier in a box plot.
     * @see Visibility
     */

    public void setOutlierVisibility(String outlierVisibility) {
        this.outlierVisibility = outlierVisibility;
    }

    /**
     * <p>
     * Determines the visibility of the outlier in a box plot.
     * </p>
     * 
     * @return Determines the visibility of the outlier in a box plot.
     * @see Visibility
     */

    public String getOutlierVisibility() {
        return this.outlierVisibility;
    }

    /**
     * <p>
     * Determines the visibility of the outlier in a box plot.
     * </p>
     * 
     * @param outlierVisibility
     *        Determines the visibility of the outlier in a box plot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public BoxPlotOptions withOutlierVisibility(String outlierVisibility) {
        setOutlierVisibility(outlierVisibility);
        return this;
    }

    /**
     * <p>
     * Determines the visibility of the outlier in a box plot.
     * </p>
     * 
     * @param outlierVisibility
     *        Determines the visibility of the outlier in a box plot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public BoxPlotOptions withOutlierVisibility(Visibility outlierVisibility) {
        this.outlierVisibility = outlierVisibility.toString();
        return this;
    }

    /**
     * <p>
     * Determines the visibility of all data points of the box plot.
     * </p>
     * 
     * @param allDataPointsVisibility
     *        Determines the visibility of all data points of the box plot.
     * @see Visibility
     */

    public void setAllDataPointsVisibility(String allDataPointsVisibility) {
        this.allDataPointsVisibility = allDataPointsVisibility;
    }

    /**
     * <p>
     * Determines the visibility of all data points of the box plot.
     * </p>
     * 
     * @return Determines the visibility of all data points of the box plot.
     * @see Visibility
     */

    public String getAllDataPointsVisibility() {
        return this.allDataPointsVisibility;
    }

    /**
     * <p>
     * Determines the visibility of all data points of the box plot.
     * </p>
     * 
     * @param allDataPointsVisibility
     *        Determines the visibility of all data points of the box plot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public BoxPlotOptions withAllDataPointsVisibility(String allDataPointsVisibility) {
        setAllDataPointsVisibility(allDataPointsVisibility);
        return this;
    }

    /**
     * <p>
     * Determines the visibility of all data points of the box plot.
     * </p>
     * 
     * @param allDataPointsVisibility
     *        Determines the visibility of all data points of the box plot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public BoxPlotOptions withAllDataPointsVisibility(Visibility allDataPointsVisibility) {
        this.allDataPointsVisibility = allDataPointsVisibility.toString();
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
        if (getStyleOptions() != null)
            sb.append("StyleOptions: ").append(getStyleOptions()).append(",");
        if (getOutlierVisibility() != null)
            sb.append("OutlierVisibility: ").append(getOutlierVisibility()).append(",");
        if (getAllDataPointsVisibility() != null)
            sb.append("AllDataPointsVisibility: ").append(getAllDataPointsVisibility());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BoxPlotOptions == false)
            return false;
        BoxPlotOptions other = (BoxPlotOptions) obj;
        if (other.getStyleOptions() == null ^ this.getStyleOptions() == null)
            return false;
        if (other.getStyleOptions() != null && other.getStyleOptions().equals(this.getStyleOptions()) == false)
            return false;
        if (other.getOutlierVisibility() == null ^ this.getOutlierVisibility() == null)
            return false;
        if (other.getOutlierVisibility() != null && other.getOutlierVisibility().equals(this.getOutlierVisibility()) == false)
            return false;
        if (other.getAllDataPointsVisibility() == null ^ this.getAllDataPointsVisibility() == null)
            return false;
        if (other.getAllDataPointsVisibility() != null && other.getAllDataPointsVisibility().equals(this.getAllDataPointsVisibility()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStyleOptions() == null) ? 0 : getStyleOptions().hashCode());
        hashCode = prime * hashCode + ((getOutlierVisibility() == null) ? 0 : getOutlierVisibility().hashCode());
        hashCode = prime * hashCode + ((getAllDataPointsVisibility() == null) ? 0 : getAllDataPointsVisibility().hashCode());
        return hashCode;
    }

    @Override
    public BoxPlotOptions clone() {
        try {
            return (BoxPlotOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.BoxPlotOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
