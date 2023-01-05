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
 * Identifies one or more data sets you want to import with the <a>CreateDataSetImportTask</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/DataSetImportConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSetImportConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data sets.
     * </p>
     */
    private java.util.List<DataSetImportItem> dataSets;
    /**
     * <p>
     * The Amazon S3 location of the data sets.
     * </p>
     */
    private String s3Location;

    /**
     * <p>
     * The data sets.
     * </p>
     * 
     * @return The data sets.
     */

    public java.util.List<DataSetImportItem> getDataSets() {
        return dataSets;
    }

    /**
     * <p>
     * The data sets.
     * </p>
     * 
     * @param dataSets
     *        The data sets.
     */

    public void setDataSets(java.util.Collection<DataSetImportItem> dataSets) {
        if (dataSets == null) {
            this.dataSets = null;
            return;
        }

        this.dataSets = new java.util.ArrayList<DataSetImportItem>(dataSets);
    }

    /**
     * <p>
     * The data sets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSets(java.util.Collection)} or {@link #withDataSets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param dataSets
     *        The data sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetImportConfig withDataSets(DataSetImportItem... dataSets) {
        if (this.dataSets == null) {
            setDataSets(new java.util.ArrayList<DataSetImportItem>(dataSets.length));
        }
        for (DataSetImportItem ele : dataSets) {
            this.dataSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data sets.
     * </p>
     * 
     * @param dataSets
     *        The data sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetImportConfig withDataSets(java.util.Collection<DataSetImportItem> dataSets) {
        setDataSets(dataSets);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the data sets.
     * </p>
     * 
     * @param s3Location
     *        The Amazon S3 location of the data sets.
     */

    public void setS3Location(String s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * The Amazon S3 location of the data sets.
     * </p>
     * 
     * @return The Amazon S3 location of the data sets.
     */

    public String getS3Location() {
        return this.s3Location;
    }

    /**
     * <p>
     * The Amazon S3 location of the data sets.
     * </p>
     * 
     * @param s3Location
     *        The Amazon S3 location of the data sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetImportConfig withS3Location(String s3Location) {
        setS3Location(s3Location);
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
        if (getDataSets() != null)
            sb.append("DataSets: ").append(getDataSets()).append(",");
        if (getS3Location() != null)
            sb.append("S3Location: ").append(getS3Location());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSetImportConfig == false)
            return false;
        DataSetImportConfig other = (DataSetImportConfig) obj;
        if (other.getDataSets() == null ^ this.getDataSets() == null)
            return false;
        if (other.getDataSets() != null && other.getDataSets().equals(this.getDataSets()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSets() == null) ? 0 : getDataSets().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        return hashCode;
    }

    @Override
    public DataSetImportConfig clone() {
        try {
            return (DataSetImportConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.DataSetImportConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
