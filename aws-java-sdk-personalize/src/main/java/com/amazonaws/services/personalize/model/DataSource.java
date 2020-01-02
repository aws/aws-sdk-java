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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the data source that contains the data to upload to a dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path to the Amazon S3 bucket where the data that you want to upload to your dataset is stored. For example:
     * </p>
     * <p>
     * <code>s3://bucket-name/training-data.csv</code>
     * </p>
     */
    private String dataLocation;

    /**
     * <p>
     * The path to the Amazon S3 bucket where the data that you want to upload to your dataset is stored. For example:
     * </p>
     * <p>
     * <code>s3://bucket-name/training-data.csv</code>
     * </p>
     * 
     * @param dataLocation
     *        The path to the Amazon S3 bucket where the data that you want to upload to your dataset is stored. For
     *        example: </p>
     *        <p>
     *        <code>s3://bucket-name/training-data.csv</code>
     */

    public void setDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the data that you want to upload to your dataset is stored. For example:
     * </p>
     * <p>
     * <code>s3://bucket-name/training-data.csv</code>
     * </p>
     * 
     * @return The path to the Amazon S3 bucket where the data that you want to upload to your dataset is stored. For
     *         example: </p>
     *         <p>
     *         <code>s3://bucket-name/training-data.csv</code>
     */

    public String getDataLocation() {
        return this.dataLocation;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the data that you want to upload to your dataset is stored. For example:
     * </p>
     * <p>
     * <code>s3://bucket-name/training-data.csv</code>
     * </p>
     * 
     * @param dataLocation
     *        The path to the Amazon S3 bucket where the data that you want to upload to your dataset is stored. For
     *        example: </p>
     *        <p>
     *        <code>s3://bucket-name/training-data.csv</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withDataLocation(String dataLocation) {
        setDataLocation(dataLocation);
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
        if (getDataLocation() != null)
            sb.append("DataLocation: ").append(getDataLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSource == false)
            return false;
        DataSource other = (DataSource) obj;
        if (other.getDataLocation() == null ^ this.getDataLocation() == null)
            return false;
        if (other.getDataLocation() != null && other.getDataLocation().equals(this.getDataLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataLocation() == null) ? 0 : getDataLocation().hashCode());
        return hashCode;
    }

    @Override
    public DataSource clone() {
        try {
            return (DataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.DataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
