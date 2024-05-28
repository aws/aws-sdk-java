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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The file format of the data in S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/FileFormat" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileFormat implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file is in .CSV format.
     * </p>
     */
    private Csv csv;
    /**
     * <p>
     * The file is in parquet format.
     * </p>
     */
    private Parquet parquet;

    /**
     * <p>
     * The file is in .CSV format.
     * </p>
     * 
     * @param csv
     *        The file is in .CSV format.
     */

    public void setCsv(Csv csv) {
        this.csv = csv;
    }

    /**
     * <p>
     * The file is in .CSV format.
     * </p>
     * 
     * @return The file is in .CSV format.
     */

    public Csv getCsv() {
        return this.csv;
    }

    /**
     * <p>
     * The file is in .CSV format.
     * </p>
     * 
     * @param csv
     *        The file is in .CSV format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileFormat withCsv(Csv csv) {
        setCsv(csv);
        return this;
    }

    /**
     * <p>
     * The file is in parquet format.
     * </p>
     * 
     * @param parquet
     *        The file is in parquet format.
     */

    public void setParquet(Parquet parquet) {
        this.parquet = parquet;
    }

    /**
     * <p>
     * The file is in parquet format.
     * </p>
     * 
     * @return The file is in parquet format.
     */

    public Parquet getParquet() {
        return this.parquet;
    }

    /**
     * <p>
     * The file is in parquet format.
     * </p>
     * 
     * @param parquet
     *        The file is in parquet format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileFormat withParquet(Parquet parquet) {
        setParquet(parquet);
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
        if (getCsv() != null)
            sb.append("Csv: ").append(getCsv()).append(",");
        if (getParquet() != null)
            sb.append("Parquet: ").append(getParquet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileFormat == false)
            return false;
        FileFormat other = (FileFormat) obj;
        if (other.getCsv() == null ^ this.getCsv() == null)
            return false;
        if (other.getCsv() != null && other.getCsv().equals(this.getCsv()) == false)
            return false;
        if (other.getParquet() == null ^ this.getParquet() == null)
            return false;
        if (other.getParquet() != null && other.getParquet().equals(this.getParquet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCsv() == null) ? 0 : getCsv().hashCode());
        hashCode = prime * hashCode + ((getParquet() == null) ? 0 : getParquet().hashCode());
        return hashCode;
    }

    @Override
    public FileFormat clone() {
        try {
            return (FileFormat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.FileFormatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
