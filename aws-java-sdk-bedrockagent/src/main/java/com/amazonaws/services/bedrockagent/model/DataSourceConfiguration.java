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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about how a data source is stored.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DataSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains details about the configuration of the S3 object containing the data source.
     * </p>
     */
    private S3DataSourceConfiguration s3Configuration;
    /**
     * <p>
     * The type of storage for the data source.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Contains details about the configuration of the S3 object containing the data source.
     * </p>
     * 
     * @param s3Configuration
     *        Contains details about the configuration of the S3 object containing the data source.
     */

    public void setS3Configuration(S3DataSourceConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * <p>
     * Contains details about the configuration of the S3 object containing the data source.
     * </p>
     * 
     * @return Contains details about the configuration of the S3 object containing the data source.
     */

    public S3DataSourceConfiguration getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * <p>
     * Contains details about the configuration of the S3 object containing the data source.
     * </p>
     * 
     * @param s3Configuration
     *        Contains details about the configuration of the S3 object containing the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withS3Configuration(S3DataSourceConfiguration s3Configuration) {
        setS3Configuration(s3Configuration);
        return this;
    }

    /**
     * <p>
     * The type of storage for the data source.
     * </p>
     * 
     * @param type
     *        The type of storage for the data source.
     * @see DataSourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of storage for the data source.
     * </p>
     * 
     * @return The type of storage for the data source.
     * @see DataSourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of storage for the data source.
     * </p>
     * 
     * @param type
     *        The type of storage for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public DataSourceConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of storage for the data source.
     * </p>
     * 
     * @param type
     *        The type of storage for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public DataSourceConfiguration withType(DataSourceType type) {
        this.type = type.toString();
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
        if (getS3Configuration() != null)
            sb.append("S3Configuration: ").append(getS3Configuration()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceConfiguration == false)
            return false;
        DataSourceConfiguration other = (DataSourceConfiguration) obj;
        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceConfiguration clone() {
        try {
            return (DataSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.DataSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
