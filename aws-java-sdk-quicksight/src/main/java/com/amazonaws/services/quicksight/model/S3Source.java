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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A physical table type for as S3 data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/S3Source" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Source implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amazon Resource Name (ARN) for the data source.
     * </p>
     */
    private String dataSourceArn;
    /**
     * <p>
     * Information about the format for the S3 source file or files.
     * </p>
     */
    private UploadSettings uploadSettings;
    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     */
    private java.util.List<InputColumn> inputColumns;

    /**
     * <p>
     * The amazon Resource Name (ARN) for the data source.
     * </p>
     * 
     * @param dataSourceArn
     *        The amazon Resource Name (ARN) for the data source.
     */

    public void setDataSourceArn(String dataSourceArn) {
        this.dataSourceArn = dataSourceArn;
    }

    /**
     * <p>
     * The amazon Resource Name (ARN) for the data source.
     * </p>
     * 
     * @return The amazon Resource Name (ARN) for the data source.
     */

    public String getDataSourceArn() {
        return this.dataSourceArn;
    }

    /**
     * <p>
     * The amazon Resource Name (ARN) for the data source.
     * </p>
     * 
     * @param dataSourceArn
     *        The amazon Resource Name (ARN) for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Source withDataSourceArn(String dataSourceArn) {
        setDataSourceArn(dataSourceArn);
        return this;
    }

    /**
     * <p>
     * Information about the format for the S3 source file or files.
     * </p>
     * 
     * @param uploadSettings
     *        Information about the format for the S3 source file or files.
     */

    public void setUploadSettings(UploadSettings uploadSettings) {
        this.uploadSettings = uploadSettings;
    }

    /**
     * <p>
     * Information about the format for the S3 source file or files.
     * </p>
     * 
     * @return Information about the format for the S3 source file or files.
     */

    public UploadSettings getUploadSettings() {
        return this.uploadSettings;
    }

    /**
     * <p>
     * Information about the format for the S3 source file or files.
     * </p>
     * 
     * @param uploadSettings
     *        Information about the format for the S3 source file or files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Source withUploadSettings(UploadSettings uploadSettings) {
        setUploadSettings(uploadSettings);
        return this;
    }

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     * 
     * @return A physical table type for as S3 data source.
     */

    public java.util.List<InputColumn> getInputColumns() {
        return inputColumns;
    }

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     * 
     * @param inputColumns
     *        A physical table type for as S3 data source.
     */

    public void setInputColumns(java.util.Collection<InputColumn> inputColumns) {
        if (inputColumns == null) {
            this.inputColumns = null;
            return;
        }

        this.inputColumns = new java.util.ArrayList<InputColumn>(inputColumns);
    }

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputColumns(java.util.Collection)} or {@link #withInputColumns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param inputColumns
     *        A physical table type for as S3 data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Source withInputColumns(InputColumn... inputColumns) {
        if (this.inputColumns == null) {
            setInputColumns(new java.util.ArrayList<InputColumn>(inputColumns.length));
        }
        for (InputColumn ele : inputColumns) {
            this.inputColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     * 
     * @param inputColumns
     *        A physical table type for as S3 data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Source withInputColumns(java.util.Collection<InputColumn> inputColumns) {
        setInputColumns(inputColumns);
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
        if (getDataSourceArn() != null)
            sb.append("DataSourceArn: ").append(getDataSourceArn()).append(",");
        if (getUploadSettings() != null)
            sb.append("UploadSettings: ").append(getUploadSettings()).append(",");
        if (getInputColumns() != null)
            sb.append("InputColumns: ").append(getInputColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Source == false)
            return false;
        S3Source other = (S3Source) obj;
        if (other.getDataSourceArn() == null ^ this.getDataSourceArn() == null)
            return false;
        if (other.getDataSourceArn() != null && other.getDataSourceArn().equals(this.getDataSourceArn()) == false)
            return false;
        if (other.getUploadSettings() == null ^ this.getUploadSettings() == null)
            return false;
        if (other.getUploadSettings() != null && other.getUploadSettings().equals(this.getUploadSettings()) == false)
            return false;
        if (other.getInputColumns() == null ^ this.getInputColumns() == null)
            return false;
        if (other.getInputColumns() != null && other.getInputColumns().equals(this.getInputColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceArn() == null) ? 0 : getDataSourceArn().hashCode());
        hashCode = prime * hashCode + ((getUploadSettings() == null) ? 0 : getUploadSettings().hashCode());
        hashCode = prime * hashCode + ((getInputColumns() == null) ? 0 : getInputColumns().hashCode());
        return hashCode;
    }

    @Override
    public S3Source clone() {
        try {
            return (S3Source) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.S3SourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
