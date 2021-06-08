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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration parameters for the default AWS Glue database. You use this database for Apache Flink SQL queries
 * and table API transforms that you write in a Kinesis Data Analytics Studio notebook.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CatalogConfigurationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CatalogConfigurationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration parameters for the default AWS Glue database. You use this database for SQL queries that you
     * write in a Kinesis Data Analytics Studio notebook.
     * </p>
     */
    private GlueDataCatalogConfigurationDescription glueDataCatalogConfigurationDescription;

    /**
     * <p>
     * The configuration parameters for the default AWS Glue database. You use this database for SQL queries that you
     * write in a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @param glueDataCatalogConfigurationDescription
     *        The configuration parameters for the default AWS Glue database. You use this database for SQL queries that
     *        you write in a Kinesis Data Analytics Studio notebook.
     */

    public void setGlueDataCatalogConfigurationDescription(GlueDataCatalogConfigurationDescription glueDataCatalogConfigurationDescription) {
        this.glueDataCatalogConfigurationDescription = glueDataCatalogConfigurationDescription;
    }

    /**
     * <p>
     * The configuration parameters for the default AWS Glue database. You use this database for SQL queries that you
     * write in a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @return The configuration parameters for the default AWS Glue database. You use this database for SQL queries
     *         that you write in a Kinesis Data Analytics Studio notebook.
     */

    public GlueDataCatalogConfigurationDescription getGlueDataCatalogConfigurationDescription() {
        return this.glueDataCatalogConfigurationDescription;
    }

    /**
     * <p>
     * The configuration parameters for the default AWS Glue database. You use this database for SQL queries that you
     * write in a Kinesis Data Analytics Studio notebook.
     * </p>
     * 
     * @param glueDataCatalogConfigurationDescription
     *        The configuration parameters for the default AWS Glue database. You use this database for SQL queries that
     *        you write in a Kinesis Data Analytics Studio notebook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogConfigurationDescription withGlueDataCatalogConfigurationDescription(
            GlueDataCatalogConfigurationDescription glueDataCatalogConfigurationDescription) {
        setGlueDataCatalogConfigurationDescription(glueDataCatalogConfigurationDescription);
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
        if (getGlueDataCatalogConfigurationDescription() != null)
            sb.append("GlueDataCatalogConfigurationDescription: ").append(getGlueDataCatalogConfigurationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CatalogConfigurationDescription == false)
            return false;
        CatalogConfigurationDescription other = (CatalogConfigurationDescription) obj;
        if (other.getGlueDataCatalogConfigurationDescription() == null ^ this.getGlueDataCatalogConfigurationDescription() == null)
            return false;
        if (other.getGlueDataCatalogConfigurationDescription() != null
                && other.getGlueDataCatalogConfigurationDescription().equals(this.getGlueDataCatalogConfigurationDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlueDataCatalogConfigurationDescription() == null) ? 0 : getGlueDataCatalogConfigurationDescription().hashCode());
        return hashCode;
    }

    @Override
    public CatalogConfigurationDescription clone() {
        try {
            return (CatalogConfigurationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.CatalogConfigurationDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
