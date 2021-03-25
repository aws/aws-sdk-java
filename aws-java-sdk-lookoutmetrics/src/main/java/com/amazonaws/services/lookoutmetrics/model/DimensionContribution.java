/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a dimension that contributed to an anomaly.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DimensionContribution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DimensionContribution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the dimension.
     * </p>
     */
    private String dimensionName;
    /**
     * <p>
     * A list of dimension values that contributed to the anomaly.
     * </p>
     */
    private java.util.List<DimensionValueContribution> dimensionValueContributionList;

    /**
     * <p>
     * The name of the dimension.
     * </p>
     * 
     * @param dimensionName
     *        The name of the dimension.
     */

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    /**
     * <p>
     * The name of the dimension.
     * </p>
     * 
     * @return The name of the dimension.
     */

    public String getDimensionName() {
        return this.dimensionName;
    }

    /**
     * <p>
     * The name of the dimension.
     * </p>
     * 
     * @param dimensionName
     *        The name of the dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionContribution withDimensionName(String dimensionName) {
        setDimensionName(dimensionName);
        return this;
    }

    /**
     * <p>
     * A list of dimension values that contributed to the anomaly.
     * </p>
     * 
     * @return A list of dimension values that contributed to the anomaly.
     */

    public java.util.List<DimensionValueContribution> getDimensionValueContributionList() {
        return dimensionValueContributionList;
    }

    /**
     * <p>
     * A list of dimension values that contributed to the anomaly.
     * </p>
     * 
     * @param dimensionValueContributionList
     *        A list of dimension values that contributed to the anomaly.
     */

    public void setDimensionValueContributionList(java.util.Collection<DimensionValueContribution> dimensionValueContributionList) {
        if (dimensionValueContributionList == null) {
            this.dimensionValueContributionList = null;
            return;
        }

        this.dimensionValueContributionList = new java.util.ArrayList<DimensionValueContribution>(dimensionValueContributionList);
    }

    /**
     * <p>
     * A list of dimension values that contributed to the anomaly.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensionValueContributionList(java.util.Collection)} or
     * {@link #withDimensionValueContributionList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dimensionValueContributionList
     *        A list of dimension values that contributed to the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionContribution withDimensionValueContributionList(DimensionValueContribution... dimensionValueContributionList) {
        if (this.dimensionValueContributionList == null) {
            setDimensionValueContributionList(new java.util.ArrayList<DimensionValueContribution>(dimensionValueContributionList.length));
        }
        for (DimensionValueContribution ele : dimensionValueContributionList) {
            this.dimensionValueContributionList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of dimension values that contributed to the anomaly.
     * </p>
     * 
     * @param dimensionValueContributionList
     *        A list of dimension values that contributed to the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionContribution withDimensionValueContributionList(java.util.Collection<DimensionValueContribution> dimensionValueContributionList) {
        setDimensionValueContributionList(dimensionValueContributionList);
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
        if (getDimensionName() != null)
            sb.append("DimensionName: ").append(getDimensionName()).append(",");
        if (getDimensionValueContributionList() != null)
            sb.append("DimensionValueContributionList: ").append(getDimensionValueContributionList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DimensionContribution == false)
            return false;
        DimensionContribution other = (DimensionContribution) obj;
        if (other.getDimensionName() == null ^ this.getDimensionName() == null)
            return false;
        if (other.getDimensionName() != null && other.getDimensionName().equals(this.getDimensionName()) == false)
            return false;
        if (other.getDimensionValueContributionList() == null ^ this.getDimensionValueContributionList() == null)
            return false;
        if (other.getDimensionValueContributionList() != null
                && other.getDimensionValueContributionList().equals(this.getDimensionValueContributionList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensionName() == null) ? 0 : getDimensionName().hashCode());
        hashCode = prime * hashCode + ((getDimensionValueContributionList() == null) ? 0 : getDimensionValueContributionList().hashCode());
        return hashCode;
    }

    @Override
    public DimensionContribution clone() {
        try {
            return (DimensionContribution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.DimensionContributionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
