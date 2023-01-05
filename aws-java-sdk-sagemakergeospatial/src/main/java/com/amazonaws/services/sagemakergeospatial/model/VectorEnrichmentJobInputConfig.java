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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The input structure for the InputConfig in a VectorEnrichmentJob.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/VectorEnrichmentJobInputConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VectorEnrichmentJobInputConfig implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private VectorEnrichmentJobDataSourceConfigInput dataSourceConfig;
    /** <p/> */
    private String documentType;

    /**
     * <p/>
     * 
     * @param dataSourceConfig
     */

    public void setDataSourceConfig(VectorEnrichmentJobDataSourceConfigInput dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public VectorEnrichmentJobDataSourceConfigInput getDataSourceConfig() {
        return this.dataSourceConfig;
    }

    /**
     * <p/>
     * 
     * @param dataSourceConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VectorEnrichmentJobInputConfig withDataSourceConfig(VectorEnrichmentJobDataSourceConfigInput dataSourceConfig) {
        setDataSourceConfig(dataSourceConfig);
        return this;
    }

    /**
     * <p/>
     * 
     * @param documentType
     * @see VectorEnrichmentJobDocumentType
     */

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * <p/>
     * 
     * @return
     * @see VectorEnrichmentJobDocumentType
     */

    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * <p/>
     * 
     * @param documentType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VectorEnrichmentJobDocumentType
     */

    public VectorEnrichmentJobInputConfig withDocumentType(String documentType) {
        setDocumentType(documentType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param documentType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VectorEnrichmentJobDocumentType
     */

    public VectorEnrichmentJobInputConfig withDocumentType(VectorEnrichmentJobDocumentType documentType) {
        this.documentType = documentType.toString();
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
            sb.append("DataSourceConfig: ").append(getDataSourceConfig()).append(",");
        if (getDocumentType() != null)
            sb.append("DocumentType: ").append(getDocumentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VectorEnrichmentJobInputConfig == false)
            return false;
        VectorEnrichmentJobInputConfig other = (VectorEnrichmentJobInputConfig) obj;
        if (other.getDataSourceConfig() == null ^ this.getDataSourceConfig() == null)
            return false;
        if (other.getDataSourceConfig() != null && other.getDataSourceConfig().equals(this.getDataSourceConfig()) == false)
            return false;
        if (other.getDocumentType() == null ^ this.getDocumentType() == null)
            return false;
        if (other.getDocumentType() != null && other.getDocumentType().equals(this.getDocumentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceConfig() == null) ? 0 : getDataSourceConfig().hashCode());
        hashCode = prime * hashCode + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        return hashCode;
    }

    @Override
    public VectorEnrichmentJobInputConfig clone() {
        try {
            return (VectorEnrichmentJobInputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.VectorEnrichmentJobInputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
