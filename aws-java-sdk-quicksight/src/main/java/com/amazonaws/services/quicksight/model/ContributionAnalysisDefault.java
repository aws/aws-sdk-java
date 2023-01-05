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
 * The contribution analysis visual display for a line, pie, or bar chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ContributionAnalysisDefault"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContributionAnalysisDefault implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The measure field that is used in the contribution analysis.
     * </p>
     */
    private String measureFieldId;
    /**
     * <p>
     * The dimensions columns that are used in the contribution analysis, usually a list of
     * <code>ColumnIdentifiers</code>.
     * </p>
     */
    private java.util.List<ColumnIdentifier> contributorDimensions;

    /**
     * <p>
     * The measure field that is used in the contribution analysis.
     * </p>
     * 
     * @param measureFieldId
     *        The measure field that is used in the contribution analysis.
     */

    public void setMeasureFieldId(String measureFieldId) {
        this.measureFieldId = measureFieldId;
    }

    /**
     * <p>
     * The measure field that is used in the contribution analysis.
     * </p>
     * 
     * @return The measure field that is used in the contribution analysis.
     */

    public String getMeasureFieldId() {
        return this.measureFieldId;
    }

    /**
     * <p>
     * The measure field that is used in the contribution analysis.
     * </p>
     * 
     * @param measureFieldId
     *        The measure field that is used in the contribution analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContributionAnalysisDefault withMeasureFieldId(String measureFieldId) {
        setMeasureFieldId(measureFieldId);
        return this;
    }

    /**
     * <p>
     * The dimensions columns that are used in the contribution analysis, usually a list of
     * <code>ColumnIdentifiers</code>.
     * </p>
     * 
     * @return The dimensions columns that are used in the contribution analysis, usually a list of
     *         <code>ColumnIdentifiers</code>.
     */

    public java.util.List<ColumnIdentifier> getContributorDimensions() {
        return contributorDimensions;
    }

    /**
     * <p>
     * The dimensions columns that are used in the contribution analysis, usually a list of
     * <code>ColumnIdentifiers</code>.
     * </p>
     * 
     * @param contributorDimensions
     *        The dimensions columns that are used in the contribution analysis, usually a list of
     *        <code>ColumnIdentifiers</code>.
     */

    public void setContributorDimensions(java.util.Collection<ColumnIdentifier> contributorDimensions) {
        if (contributorDimensions == null) {
            this.contributorDimensions = null;
            return;
        }

        this.contributorDimensions = new java.util.ArrayList<ColumnIdentifier>(contributorDimensions);
    }

    /**
     * <p>
     * The dimensions columns that are used in the contribution analysis, usually a list of
     * <code>ColumnIdentifiers</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContributorDimensions(java.util.Collection)} or
     * {@link #withContributorDimensions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param contributorDimensions
     *        The dimensions columns that are used in the contribution analysis, usually a list of
     *        <code>ColumnIdentifiers</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContributionAnalysisDefault withContributorDimensions(ColumnIdentifier... contributorDimensions) {
        if (this.contributorDimensions == null) {
            setContributorDimensions(new java.util.ArrayList<ColumnIdentifier>(contributorDimensions.length));
        }
        for (ColumnIdentifier ele : contributorDimensions) {
            this.contributorDimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dimensions columns that are used in the contribution analysis, usually a list of
     * <code>ColumnIdentifiers</code>.
     * </p>
     * 
     * @param contributorDimensions
     *        The dimensions columns that are used in the contribution analysis, usually a list of
     *        <code>ColumnIdentifiers</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContributionAnalysisDefault withContributorDimensions(java.util.Collection<ColumnIdentifier> contributorDimensions) {
        setContributorDimensions(contributorDimensions);
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
        if (getMeasureFieldId() != null)
            sb.append("MeasureFieldId: ").append(getMeasureFieldId()).append(",");
        if (getContributorDimensions() != null)
            sb.append("ContributorDimensions: ").append(getContributorDimensions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContributionAnalysisDefault == false)
            return false;
        ContributionAnalysisDefault other = (ContributionAnalysisDefault) obj;
        if (other.getMeasureFieldId() == null ^ this.getMeasureFieldId() == null)
            return false;
        if (other.getMeasureFieldId() != null && other.getMeasureFieldId().equals(this.getMeasureFieldId()) == false)
            return false;
        if (other.getContributorDimensions() == null ^ this.getContributorDimensions() == null)
            return false;
        if (other.getContributorDimensions() != null && other.getContributorDimensions().equals(this.getContributorDimensions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeasureFieldId() == null) ? 0 : getMeasureFieldId().hashCode());
        hashCode = prime * hashCode + ((getContributorDimensions() == null) ? 0 : getContributorDimensions().hashCode());
        return hashCode;
    }

    @Override
    public ContributionAnalysisDefault clone() {
        try {
            return (ContributionAnalysisDefault) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ContributionAnalysisDefaultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
