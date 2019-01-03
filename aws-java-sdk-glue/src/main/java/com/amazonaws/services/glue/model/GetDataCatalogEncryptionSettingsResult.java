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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDataCatalogEncryptionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataCatalogEncryptionSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The requested security configuration.
     * </p>
     */
    private DataCatalogEncryptionSettings dataCatalogEncryptionSettings;

    /**
     * <p>
     * The requested security configuration.
     * </p>
     * 
     * @param dataCatalogEncryptionSettings
     *        The requested security configuration.
     */

    public void setDataCatalogEncryptionSettings(DataCatalogEncryptionSettings dataCatalogEncryptionSettings) {
        this.dataCatalogEncryptionSettings = dataCatalogEncryptionSettings;
    }

    /**
     * <p>
     * The requested security configuration.
     * </p>
     * 
     * @return The requested security configuration.
     */

    public DataCatalogEncryptionSettings getDataCatalogEncryptionSettings() {
        return this.dataCatalogEncryptionSettings;
    }

    /**
     * <p>
     * The requested security configuration.
     * </p>
     * 
     * @param dataCatalogEncryptionSettings
     *        The requested security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataCatalogEncryptionSettingsResult withDataCatalogEncryptionSettings(DataCatalogEncryptionSettings dataCatalogEncryptionSettings) {
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

        if (obj instanceof GetDataCatalogEncryptionSettingsResult == false)
            return false;
        GetDataCatalogEncryptionSettingsResult other = (GetDataCatalogEncryptionSettingsResult) obj;
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

        hashCode = prime * hashCode + ((getDataCatalogEncryptionSettings() == null) ? 0 : getDataCatalogEncryptionSettings().hashCode());
        return hashCode;
    }

    @Override
    public GetDataCatalogEncryptionSettingsResult clone() {
        try {
            return (GetDataCatalogEncryptionSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
