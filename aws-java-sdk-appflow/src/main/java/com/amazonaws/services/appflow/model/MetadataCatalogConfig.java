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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration that Amazon AppFlow uses when it catalogs your data. When Amazon AppFlow catalogs your
 * data, it stores metadata in a data catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/MetadataCatalogConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetadataCatalogConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the configuration that Amazon AppFlow uses when it catalogs your data with the Glue Data Catalog.
     * </p>
     */
    private GlueDataCatalogConfig glueDataCatalog;

    /**
     * <p>
     * Specifies the configuration that Amazon AppFlow uses when it catalogs your data with the Glue Data Catalog.
     * </p>
     * 
     * @param glueDataCatalog
     *        Specifies the configuration that Amazon AppFlow uses when it catalogs your data with the Glue Data
     *        Catalog.
     */

    public void setGlueDataCatalog(GlueDataCatalogConfig glueDataCatalog) {
        this.glueDataCatalog = glueDataCatalog;
    }

    /**
     * <p>
     * Specifies the configuration that Amazon AppFlow uses when it catalogs your data with the Glue Data Catalog.
     * </p>
     * 
     * @return Specifies the configuration that Amazon AppFlow uses when it catalogs your data with the Glue Data
     *         Catalog.
     */

    public GlueDataCatalogConfig getGlueDataCatalog() {
        return this.glueDataCatalog;
    }

    /**
     * <p>
     * Specifies the configuration that Amazon AppFlow uses when it catalogs your data with the Glue Data Catalog.
     * </p>
     * 
     * @param glueDataCatalog
     *        Specifies the configuration that Amazon AppFlow uses when it catalogs your data with the Glue Data
     *        Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataCatalogConfig withGlueDataCatalog(GlueDataCatalogConfig glueDataCatalog) {
        setGlueDataCatalog(glueDataCatalog);
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
        if (getGlueDataCatalog() != null)
            sb.append("GlueDataCatalog: ").append(getGlueDataCatalog());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetadataCatalogConfig == false)
            return false;
        MetadataCatalogConfig other = (MetadataCatalogConfig) obj;
        if (other.getGlueDataCatalog() == null ^ this.getGlueDataCatalog() == null)
            return false;
        if (other.getGlueDataCatalog() != null && other.getGlueDataCatalog().equals(this.getGlueDataCatalog()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlueDataCatalog() == null) ? 0 : getGlueDataCatalog().hashCode());
        return hashCode;
    }

    @Override
    public MetadataCatalogConfig clone() {
        try {
            return (MetadataCatalogConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.MetadataCatalogConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
