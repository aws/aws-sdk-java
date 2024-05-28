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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DataModelConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataModelConfiguration implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private DataModel dataModel;
    /** <p/> */
    private DataModelS3Configuration dataModelS3Configuration;

    /**
     * <p/>
     * 
     * @param dataModel
     */

    public void setDataModel(DataModel dataModel) {
        this.dataModel = dataModel;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public DataModel getDataModel() {
        return this.dataModel;
    }

    /**
     * <p/>
     * 
     * @param dataModel
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataModelConfiguration withDataModel(DataModel dataModel) {
        setDataModel(dataModel);
        return this;
    }

    /**
     * <p/>
     * 
     * @param dataModelS3Configuration
     */

    public void setDataModelS3Configuration(DataModelS3Configuration dataModelS3Configuration) {
        this.dataModelS3Configuration = dataModelS3Configuration;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public DataModelS3Configuration getDataModelS3Configuration() {
        return this.dataModelS3Configuration;
    }

    /**
     * <p/>
     * 
     * @param dataModelS3Configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataModelConfiguration withDataModelS3Configuration(DataModelS3Configuration dataModelS3Configuration) {
        setDataModelS3Configuration(dataModelS3Configuration);
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
        if (getDataModel() != null)
            sb.append("DataModel: ").append(getDataModel()).append(",");
        if (getDataModelS3Configuration() != null)
            sb.append("DataModelS3Configuration: ").append(getDataModelS3Configuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataModelConfiguration == false)
            return false;
        DataModelConfiguration other = (DataModelConfiguration) obj;
        if (other.getDataModel() == null ^ this.getDataModel() == null)
            return false;
        if (other.getDataModel() != null && other.getDataModel().equals(this.getDataModel()) == false)
            return false;
        if (other.getDataModelS3Configuration() == null ^ this.getDataModelS3Configuration() == null)
            return false;
        if (other.getDataModelS3Configuration() != null && other.getDataModelS3Configuration().equals(this.getDataModelS3Configuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataModel() == null) ? 0 : getDataModel().hashCode());
        hashCode = prime * hashCode + ((getDataModelS3Configuration() == null) ? 0 : getDataModelS3Configuration().hashCode());
        return hashCode;
    }

    @Override
    public DataModelConfiguration clone() {
        try {
            return (DataModelConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.DataModelConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
