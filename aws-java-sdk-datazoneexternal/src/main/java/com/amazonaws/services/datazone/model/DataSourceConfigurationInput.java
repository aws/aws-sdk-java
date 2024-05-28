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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of the data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DataSourceConfigurationInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceConfigurationInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration of the Amazon Web Services Glue data source.
     * </p>
     */
    private GlueRunConfigurationInput glueRunConfiguration;
    /**
     * <p>
     * The configuration of the Amazon Redshift data source.
     * </p>
     */
    private RedshiftRunConfigurationInput redshiftRunConfiguration;

    /**
     * <p>
     * The configuration of the Amazon Web Services Glue data source.
     * </p>
     * 
     * @param glueRunConfiguration
     *        The configuration of the Amazon Web Services Glue data source.
     */

    public void setGlueRunConfiguration(GlueRunConfigurationInput glueRunConfiguration) {
        this.glueRunConfiguration = glueRunConfiguration;
    }

    /**
     * <p>
     * The configuration of the Amazon Web Services Glue data source.
     * </p>
     * 
     * @return The configuration of the Amazon Web Services Glue data source.
     */

    public GlueRunConfigurationInput getGlueRunConfiguration() {
        return this.glueRunConfiguration;
    }

    /**
     * <p>
     * The configuration of the Amazon Web Services Glue data source.
     * </p>
     * 
     * @param glueRunConfiguration
     *        The configuration of the Amazon Web Services Glue data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfigurationInput withGlueRunConfiguration(GlueRunConfigurationInput glueRunConfiguration) {
        setGlueRunConfiguration(glueRunConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration of the Amazon Redshift data source.
     * </p>
     * 
     * @param redshiftRunConfiguration
     *        The configuration of the Amazon Redshift data source.
     */

    public void setRedshiftRunConfiguration(RedshiftRunConfigurationInput redshiftRunConfiguration) {
        this.redshiftRunConfiguration = redshiftRunConfiguration;
    }

    /**
     * <p>
     * The configuration of the Amazon Redshift data source.
     * </p>
     * 
     * @return The configuration of the Amazon Redshift data source.
     */

    public RedshiftRunConfigurationInput getRedshiftRunConfiguration() {
        return this.redshiftRunConfiguration;
    }

    /**
     * <p>
     * The configuration of the Amazon Redshift data source.
     * </p>
     * 
     * @param redshiftRunConfiguration
     *        The configuration of the Amazon Redshift data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfigurationInput withRedshiftRunConfiguration(RedshiftRunConfigurationInput redshiftRunConfiguration) {
        setRedshiftRunConfiguration(redshiftRunConfiguration);
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
        if (getGlueRunConfiguration() != null)
            sb.append("GlueRunConfiguration: ").append(getGlueRunConfiguration()).append(",");
        if (getRedshiftRunConfiguration() != null)
            sb.append("RedshiftRunConfiguration: ").append(getRedshiftRunConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceConfigurationInput == false)
            return false;
        DataSourceConfigurationInput other = (DataSourceConfigurationInput) obj;
        if (other.getGlueRunConfiguration() == null ^ this.getGlueRunConfiguration() == null)
            return false;
        if (other.getGlueRunConfiguration() != null && other.getGlueRunConfiguration().equals(this.getGlueRunConfiguration()) == false)
            return false;
        if (other.getRedshiftRunConfiguration() == null ^ this.getRedshiftRunConfiguration() == null)
            return false;
        if (other.getRedshiftRunConfiguration() != null && other.getRedshiftRunConfiguration().equals(this.getRedshiftRunConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlueRunConfiguration() == null) ? 0 : getGlueRunConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRedshiftRunConfiguration() == null) ? 0 : getRedshiftRunConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceConfigurationInput clone() {
        try {
            return (DataSourceConfigurationInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.DataSourceConfigurationInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
