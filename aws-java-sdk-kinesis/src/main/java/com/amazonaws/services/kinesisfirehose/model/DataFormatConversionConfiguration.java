/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies that you want Kinesis Data Firehose to convert data from the JSON format to the Parquet or ORC format
 * before writing it to Amazon S3. Kinesis Data Firehose uses the serializer and deserializer that you specify, in
 * addition to the column information from the AWS Glue table, to deserialize your input data from JSON and then
 * serialize it to the Parquet or ORC format. For more information, see <a
 * href="https://docs.aws.amazon.com/firehose/latest/dev/record-format-conversion.html">Kinesis Data Firehose Record
 * Format Conversion</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/DataFormatConversionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataFormatConversionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the AWS Glue Data Catalog table that contains the column information.
     * </p>
     */
    private SchemaConfiguration schemaConfiguration;
    /**
     * <p>
     * Specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from
     * JSON.
     * </p>
     */
    private InputFormatConfiguration inputFormatConfiguration;
    /**
     * <p>
     * Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the
     * Parquet or ORC format.
     * </p>
     */
    private OutputFormatConfiguration outputFormatConfiguration;
    /**
     * <p>
     * Defaults to <code>true</code>. Set it to <code>false</code> if you want to disable format conversion while
     * preserving the configuration details.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Specifies the AWS Glue Data Catalog table that contains the column information.
     * </p>
     * 
     * @param schemaConfiguration
     *        Specifies the AWS Glue Data Catalog table that contains the column information.
     */

    public void setSchemaConfiguration(SchemaConfiguration schemaConfiguration) {
        this.schemaConfiguration = schemaConfiguration;
    }

    /**
     * <p>
     * Specifies the AWS Glue Data Catalog table that contains the column information.
     * </p>
     * 
     * @return Specifies the AWS Glue Data Catalog table that contains the column information.
     */

    public SchemaConfiguration getSchemaConfiguration() {
        return this.schemaConfiguration;
    }

    /**
     * <p>
     * Specifies the AWS Glue Data Catalog table that contains the column information.
     * </p>
     * 
     * @param schemaConfiguration
     *        Specifies the AWS Glue Data Catalog table that contains the column information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataFormatConversionConfiguration withSchemaConfiguration(SchemaConfiguration schemaConfiguration) {
        setSchemaConfiguration(schemaConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from
     * JSON.
     * </p>
     * 
     * @param inputFormatConfiguration
     *        Specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data
     *        from JSON.
     */

    public void setInputFormatConfiguration(InputFormatConfiguration inputFormatConfiguration) {
        this.inputFormatConfiguration = inputFormatConfiguration;
    }

    /**
     * <p>
     * Specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from
     * JSON.
     * </p>
     * 
     * @return Specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data
     *         from JSON.
     */

    public InputFormatConfiguration getInputFormatConfiguration() {
        return this.inputFormatConfiguration;
    }

    /**
     * <p>
     * Specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from
     * JSON.
     * </p>
     * 
     * @param inputFormatConfiguration
     *        Specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data
     *        from JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataFormatConversionConfiguration withInputFormatConfiguration(InputFormatConfiguration inputFormatConfiguration) {
        setInputFormatConfiguration(inputFormatConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the
     * Parquet or ORC format.
     * </p>
     * 
     * @param outputFormatConfiguration
     *        Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to
     *        the Parquet or ORC format.
     */

    public void setOutputFormatConfiguration(OutputFormatConfiguration outputFormatConfiguration) {
        this.outputFormatConfiguration = outputFormatConfiguration;
    }

    /**
     * <p>
     * Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the
     * Parquet or ORC format.
     * </p>
     * 
     * @return Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to
     *         the Parquet or ORC format.
     */

    public OutputFormatConfiguration getOutputFormatConfiguration() {
        return this.outputFormatConfiguration;
    }

    /**
     * <p>
     * Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the
     * Parquet or ORC format.
     * </p>
     * 
     * @param outputFormatConfiguration
     *        Specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to
     *        the Parquet or ORC format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataFormatConversionConfiguration withOutputFormatConfiguration(OutputFormatConfiguration outputFormatConfiguration) {
        setOutputFormatConfiguration(outputFormatConfiguration);
        return this;
    }

    /**
     * <p>
     * Defaults to <code>true</code>. Set it to <code>false</code> if you want to disable format conversion while
     * preserving the configuration details.
     * </p>
     * 
     * @param enabled
     *        Defaults to <code>true</code>. Set it to <code>false</code> if you want to disable format conversion while
     *        preserving the configuration details.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Defaults to <code>true</code>. Set it to <code>false</code> if you want to disable format conversion while
     * preserving the configuration details.
     * </p>
     * 
     * @return Defaults to <code>true</code>. Set it to <code>false</code> if you want to disable format conversion
     *         while preserving the configuration details.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Defaults to <code>true</code>. Set it to <code>false</code> if you want to disable format conversion while
     * preserving the configuration details.
     * </p>
     * 
     * @param enabled
     *        Defaults to <code>true</code>. Set it to <code>false</code> if you want to disable format conversion while
     *        preserving the configuration details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataFormatConversionConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Defaults to <code>true</code>. Set it to <code>false</code> if you want to disable format conversion while
     * preserving the configuration details.
     * </p>
     * 
     * @return Defaults to <code>true</code>. Set it to <code>false</code> if you want to disable format conversion
     *         while preserving the configuration details.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getSchemaConfiguration() != null)
            sb.append("SchemaConfiguration: ").append(getSchemaConfiguration()).append(",");
        if (getInputFormatConfiguration() != null)
            sb.append("InputFormatConfiguration: ").append(getInputFormatConfiguration()).append(",");
        if (getOutputFormatConfiguration() != null)
            sb.append("OutputFormatConfiguration: ").append(getOutputFormatConfiguration()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataFormatConversionConfiguration == false)
            return false;
        DataFormatConversionConfiguration other = (DataFormatConversionConfiguration) obj;
        if (other.getSchemaConfiguration() == null ^ this.getSchemaConfiguration() == null)
            return false;
        if (other.getSchemaConfiguration() != null && other.getSchemaConfiguration().equals(this.getSchemaConfiguration()) == false)
            return false;
        if (other.getInputFormatConfiguration() == null ^ this.getInputFormatConfiguration() == null)
            return false;
        if (other.getInputFormatConfiguration() != null && other.getInputFormatConfiguration().equals(this.getInputFormatConfiguration()) == false)
            return false;
        if (other.getOutputFormatConfiguration() == null ^ this.getOutputFormatConfiguration() == null)
            return false;
        if (other.getOutputFormatConfiguration() != null && other.getOutputFormatConfiguration().equals(this.getOutputFormatConfiguration()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaConfiguration() == null) ? 0 : getSchemaConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInputFormatConfiguration() == null) ? 0 : getInputFormatConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOutputFormatConfiguration() == null) ? 0 : getOutputFormatConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public DataFormatConversionConfiguration clone() {
        try {
            return (DataFormatConversionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.DataFormatConversionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
