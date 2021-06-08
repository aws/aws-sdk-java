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
 * An object that contains the configuration parameters for the data source of an import request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ImportDataSourceConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportDataSourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL from which source data will be downloaded for the import request.
     * </p>
     */
    private String dataSourceUrl;

    /**
     * <p>
     * The URL from which source data will be downloaded for the import request.
     * </p>
     * 
     * @param dataSourceUrl
     *        The URL from which source data will be downloaded for the import request.
     */

    public void setDataSourceUrl(String dataSourceUrl) {
        this.dataSourceUrl = dataSourceUrl;
    }

    /**
     * <p>
     * The URL from which source data will be downloaded for the import request.
     * </p>
     * 
     * @return The URL from which source data will be downloaded for the import request.
     */

    public String getDataSourceUrl() {
        return this.dataSourceUrl;
    }

    /**
     * <p>
     * The URL from which source data will be downloaded for the import request.
     * </p>
     * 
     * @param dataSourceUrl
     *        The URL from which source data will be downloaded for the import request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportDataSourceConfig withDataSourceUrl(String dataSourceUrl) {
        setDataSourceUrl(dataSourceUrl);
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
        if (getDataSourceUrl() != null)
            sb.append("DataSourceUrl: ").append(getDataSourceUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportDataSourceConfig == false)
            return false;
        ImportDataSourceConfig other = (ImportDataSourceConfig) obj;
        if (other.getDataSourceUrl() == null ^ this.getDataSourceUrl() == null)
            return false;
        if (other.getDataSourceUrl() != null && other.getDataSourceUrl().equals(this.getDataSourceUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceUrl() == null) ? 0 : getDataSourceUrl().hashCode());
        return hashCode;
    }

    @Override
    public ImportDataSourceConfig clone() {
        try {
            return (ImportDataSourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.ImportDataSourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
