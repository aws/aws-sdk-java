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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the data type configuration for the data source associated with a form.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/FormDataTypeConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormDataTypeConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data source type, either an Amplify DataStore model or a custom data type.
     * </p>
     */
    private String dataSourceType;
    /**
     * <p>
     * The unique name of the data type you are using as the data source for the form.
     * </p>
     */
    private String dataTypeName;

    /**
     * <p>
     * The data source type, either an Amplify DataStore model or a custom data type.
     * </p>
     * 
     * @param dataSourceType
     *        The data source type, either an Amplify DataStore model or a custom data type.
     * @see FormDataSourceType
     */

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    /**
     * <p>
     * The data source type, either an Amplify DataStore model or a custom data type.
     * </p>
     * 
     * @return The data source type, either an Amplify DataStore model or a custom data type.
     * @see FormDataSourceType
     */

    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * <p>
     * The data source type, either an Amplify DataStore model or a custom data type.
     * </p>
     * 
     * @param dataSourceType
     *        The data source type, either an Amplify DataStore model or a custom data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormDataSourceType
     */

    public FormDataTypeConfig withDataSourceType(String dataSourceType) {
        setDataSourceType(dataSourceType);
        return this;
    }

    /**
     * <p>
     * The data source type, either an Amplify DataStore model or a custom data type.
     * </p>
     * 
     * @param dataSourceType
     *        The data source type, either an Amplify DataStore model or a custom data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormDataSourceType
     */

    public FormDataTypeConfig withDataSourceType(FormDataSourceType dataSourceType) {
        this.dataSourceType = dataSourceType.toString();
        return this;
    }

    /**
     * <p>
     * The unique name of the data type you are using as the data source for the form.
     * </p>
     * 
     * @param dataTypeName
     *        The unique name of the data type you are using as the data source for the form.
     */

    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }

    /**
     * <p>
     * The unique name of the data type you are using as the data source for the form.
     * </p>
     * 
     * @return The unique name of the data type you are using as the data source for the form.
     */

    public String getDataTypeName() {
        return this.dataTypeName;
    }

    /**
     * <p>
     * The unique name of the data type you are using as the data source for the form.
     * </p>
     * 
     * @param dataTypeName
     *        The unique name of the data type you are using as the data source for the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormDataTypeConfig withDataTypeName(String dataTypeName) {
        setDataTypeName(dataTypeName);
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
        if (getDataSourceType() != null)
            sb.append("DataSourceType: ").append(getDataSourceType()).append(",");
        if (getDataTypeName() != null)
            sb.append("DataTypeName: ").append(getDataTypeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FormDataTypeConfig == false)
            return false;
        FormDataTypeConfig other = (FormDataTypeConfig) obj;
        if (other.getDataSourceType() == null ^ this.getDataSourceType() == null)
            return false;
        if (other.getDataSourceType() != null && other.getDataSourceType().equals(this.getDataSourceType()) == false)
            return false;
        if (other.getDataTypeName() == null ^ this.getDataTypeName() == null)
            return false;
        if (other.getDataTypeName() != null && other.getDataTypeName().equals(this.getDataTypeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceType() == null) ? 0 : getDataSourceType().hashCode());
        hashCode = prime * hashCode + ((getDataTypeName() == null) ? 0 : getDataTypeName().hashCode());
        return hashCode;
    }

    @Override
    public FormDataTypeConfig clone() {
        try {
            return (FormDataTypeConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.FormDataTypeConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
