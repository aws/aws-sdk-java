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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the configuration information of file formats. AWS IoT Analytics data stores support JSON and <a
 * href="https://parquet.apache.org/">Parquet</a>.
 * </p>
 * <p>
 * The default file format is JSON. You can specify only one format.
 * </p>
 * <p>
 * You can't change the file format after you create the data store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/FileFormatConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileFormatConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the configuration information of the JSON format.
     * </p>
     */
    private JsonConfiguration jsonConfiguration;
    /**
     * <p>
     * Contains the configuration information of the Parquet format.
     * </p>
     */
    private ParquetConfiguration parquetConfiguration;

    /**
     * <p>
     * Contains the configuration information of the JSON format.
     * </p>
     * 
     * @param jsonConfiguration
     *        Contains the configuration information of the JSON format.
     */

    public void setJsonConfiguration(JsonConfiguration jsonConfiguration) {
        this.jsonConfiguration = jsonConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of the JSON format.
     * </p>
     * 
     * @return Contains the configuration information of the JSON format.
     */

    public JsonConfiguration getJsonConfiguration() {
        return this.jsonConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of the JSON format.
     * </p>
     * 
     * @param jsonConfiguration
     *        Contains the configuration information of the JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileFormatConfiguration withJsonConfiguration(JsonConfiguration jsonConfiguration) {
        setJsonConfiguration(jsonConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains the configuration information of the Parquet format.
     * </p>
     * 
     * @param parquetConfiguration
     *        Contains the configuration information of the Parquet format.
     */

    public void setParquetConfiguration(ParquetConfiguration parquetConfiguration) {
        this.parquetConfiguration = parquetConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of the Parquet format.
     * </p>
     * 
     * @return Contains the configuration information of the Parquet format.
     */

    public ParquetConfiguration getParquetConfiguration() {
        return this.parquetConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of the Parquet format.
     * </p>
     * 
     * @param parquetConfiguration
     *        Contains the configuration information of the Parquet format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileFormatConfiguration withParquetConfiguration(ParquetConfiguration parquetConfiguration) {
        setParquetConfiguration(parquetConfiguration);
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
        if (getJsonConfiguration() != null)
            sb.append("JsonConfiguration: ").append(getJsonConfiguration()).append(",");
        if (getParquetConfiguration() != null)
            sb.append("ParquetConfiguration: ").append(getParquetConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileFormatConfiguration == false)
            return false;
        FileFormatConfiguration other = (FileFormatConfiguration) obj;
        if (other.getJsonConfiguration() == null ^ this.getJsonConfiguration() == null)
            return false;
        if (other.getJsonConfiguration() != null && other.getJsonConfiguration().equals(this.getJsonConfiguration()) == false)
            return false;
        if (other.getParquetConfiguration() == null ^ this.getParquetConfiguration() == null)
            return false;
        if (other.getParquetConfiguration() != null && other.getParquetConfiguration().equals(this.getParquetConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJsonConfiguration() == null) ? 0 : getJsonConfiguration().hashCode());
        hashCode = prime * hashCode + ((getParquetConfiguration() == null) ? 0 : getParquetConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public FileFormatConfiguration clone() {
        try {
            return (FileFormatConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.FileFormatConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
