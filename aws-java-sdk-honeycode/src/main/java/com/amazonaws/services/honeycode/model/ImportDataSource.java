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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that has details about the source of the data that was submitted for import.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ImportDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration parameters for the data source of the import
     * </p>
     */
    private ImportDataSourceConfig dataSourceConfig;

    /**
     * <p>
     * The configuration parameters for the data source of the import
     * </p>
     * 
     * @param dataSourceConfig
     *        The configuration parameters for the data source of the import
     */

    public void setDataSourceConfig(ImportDataSourceConfig dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
    }

    /**
     * <p>
     * The configuration parameters for the data source of the import
     * </p>
     * 
     * @return The configuration parameters for the data source of the import
     */

    public ImportDataSourceConfig getDataSourceConfig() {
        return this.dataSourceConfig;
    }

    /**
     * <p>
     * The configuration parameters for the data source of the import
     * </p>
     * 
     * @param dataSourceConfig
     *        The configuration parameters for the data source of the import
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDataSource withDataSourceConfig(ImportDataSourceConfig dataSourceConfig) {
        setDataSourceConfig(dataSourceConfig);
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
        if (getDataSourceConfig() != null)
            sb.append("DataSourceConfig: ").append(getDataSourceConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportDataSource == false)
            return false;
        ImportDataSource other = (ImportDataSource) obj;
        if (other.getDataSourceConfig() == null ^ this.getDataSourceConfig() == null)
            return false;
        if (other.getDataSourceConfig() != null && other.getDataSourceConfig().equals(this.getDataSourceConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceConfig() == null) ? 0 : getDataSourceConfig().hashCode());
        return hashCode;
    }

    @Override
    public ImportDataSource clone() {
        try {
            return (ImportDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.ImportDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
