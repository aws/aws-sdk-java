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
 * The configuration of the Glue Data Catalog that you use for Apache Flink SQL queries and table API transforms that
 * you write in an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/GlueDataCatalogConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlueDataCatalogConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     */
    private String databaseARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     * 
     * @param databaseARN
     *        The Amazon Resource Name (ARN) of the database.
     */

    public void setDatabaseARN(String databaseARN) {
        this.databaseARN = databaseARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the database.
     */

    public String getDatabaseARN() {
        return this.databaseARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database.
     * </p>
     * 
     * @param databaseARN
     *        The Amazon Resource Name (ARN) of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlueDataCatalogConfiguration withDatabaseARN(String databaseARN) {
        setDatabaseARN(databaseARN);
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
        if (getDatabaseARN() != null)
            sb.append("DatabaseARN: ").append(getDatabaseARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlueDataCatalogConfiguration == false)
            return false;
        GlueDataCatalogConfiguration other = (GlueDataCatalogConfiguration) obj;
        if (other.getDatabaseARN() == null ^ this.getDatabaseARN() == null)
            return false;
        if (other.getDatabaseARN() != null && other.getDatabaseARN().equals(this.getDatabaseARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseARN() == null) ? 0 : getDatabaseARN().hashCode());
        return hashCode;
    }

    @Override
    public GlueDataCatalogConfiguration clone() {
        try {
            return (GlueDataCatalogConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.GlueDataCatalogConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
