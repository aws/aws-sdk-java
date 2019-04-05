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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PutDataCatalogEncryptionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDataCatalogEncryptionSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog for which to set the security configuration. If none is provided, the AWS account ID
     * is used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The security configuration to set.
     * </p>
     */
    private DataCatalogEncryptionSettings dataCatalogEncryptionSettings;

    /**
     * <p>
     * The ID of the Data Catalog for which to set the security configuration. If none is provided, the AWS account ID
     * is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog for which to set the security configuration. If none is provided, the AWS
     *        account ID is used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog for which to set the security configuration. If none is provided, the AWS account ID
     * is used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog for which to set the security configuration. If none is provided, the AWS
     *         account ID is used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog for which to set the security configuration. If none is provided, the AWS account ID
     * is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog for which to set the security configuration. If none is provided, the AWS
     *        account ID is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDataCatalogEncryptionSettingsRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The security configuration to set.
     * </p>
     * 
     * @param dataCatalogEncryptionSettings
     *        The security configuration to set.
     */

    public void setDataCatalogEncryptionSettings(DataCatalogEncryptionSettings dataCatalogEncryptionSettings) {
        this.dataCatalogEncryptionSettings = dataCatalogEncryptionSettings;
    }

    /**
     * <p>
     * The security configuration to set.
     * </p>
     * 
     * @return The security configuration to set.
     */

    public DataCatalogEncryptionSettings getDataCatalogEncryptionSettings() {
        return this.dataCatalogEncryptionSettings;
    }

    /**
     * <p>
     * The security configuration to set.
     * </p>
     * 
     * @param dataCatalogEncryptionSettings
     *        The security configuration to set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDataCatalogEncryptionSettingsRequest withDataCatalogEncryptionSettings(DataCatalogEncryptionSettings dataCatalogEncryptionSettings) {
        setDataCatalogEncryptionSettings(dataCatalogEncryptionSettings);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDataCatalogEncryptionSettings() != null)
            sb.append("DataCatalogEncryptionSettings: ").append(getDataCatalogEncryptionSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDataCatalogEncryptionSettingsRequest == false)
            return false;
        PutDataCatalogEncryptionSettingsRequest other = (PutDataCatalogEncryptionSettingsRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDataCatalogEncryptionSettings() == null ^ this.getDataCatalogEncryptionSettings() == null)
            return false;
        if (other.getDataCatalogEncryptionSettings() != null
                && other.getDataCatalogEncryptionSettings().equals(this.getDataCatalogEncryptionSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDataCatalogEncryptionSettings() == null) ? 0 : getDataCatalogEncryptionSettings().hashCode());
        return hashCode;
    }

    @Override
    public PutDataCatalogEncryptionSettingsRequest clone() {
        return (PutDataCatalogEncryptionSettingsRequest) super.clone();
    }

}
