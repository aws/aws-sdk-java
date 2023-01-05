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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies a specific data set to import from an external location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DataSetImportItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSetImportItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data set.
     * </p>
     */
    private DataSet dataSet;
    /**
     * <p>
     * The location of the data set.
     * </p>
     */
    private ExternalLocation externalLocation;

    /**
     * <p>
     * The data set.
     * </p>
     * 
     * @param dataSet
     *        The data set.
     */

    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    /**
     * <p>
     * The data set.
     * </p>
     * 
     * @return The data set.
     */

    public DataSet getDataSet() {
        return this.dataSet;
    }

    /**
     * <p>
     * The data set.
     * </p>
     * 
     * @param dataSet
     *        The data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetImportItem withDataSet(DataSet dataSet) {
        setDataSet(dataSet);
        return this;
    }

    /**
     * <p>
     * The location of the data set.
     * </p>
     * 
     * @param externalLocation
     *        The location of the data set.
     */

    public void setExternalLocation(ExternalLocation externalLocation) {
        this.externalLocation = externalLocation;
    }

    /**
     * <p>
     * The location of the data set.
     * </p>
     * 
     * @return The location of the data set.
     */

    public ExternalLocation getExternalLocation() {
        return this.externalLocation;
    }

    /**
     * <p>
     * The location of the data set.
     * </p>
     * 
     * @param externalLocation
     *        The location of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetImportItem withExternalLocation(ExternalLocation externalLocation) {
        setExternalLocation(externalLocation);
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
        if (getDataSet() != null)
            sb.append("DataSet: ").append(getDataSet()).append(",");
        if (getExternalLocation() != null)
            sb.append("ExternalLocation: ").append(getExternalLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSetImportItem == false)
            return false;
        DataSetImportItem other = (DataSetImportItem) obj;
        if (other.getDataSet() == null ^ this.getDataSet() == null)
            return false;
        if (other.getDataSet() != null && other.getDataSet().equals(this.getDataSet()) == false)
            return false;
        if (other.getExternalLocation() == null ^ this.getExternalLocation() == null)
            return false;
        if (other.getExternalLocation() != null && other.getExternalLocation().equals(this.getExternalLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSet() == null) ? 0 : getDataSet().hashCode());
        hashCode = prime * hashCode + ((getExternalLocation() == null) ? 0 : getExternalLocation().hashCode());
        return hashCode;
    }

    @Override
    public DataSetImportItem clone() {
        try {
            return (DataSetImportItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.DataSetImportItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
