/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configuration information for maintaining Data Catalog security.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DataCatalogEncryptionSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataCatalogEncryptionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies encryption-at-rest configuration for the Data Catalog.
     * </p>
     */
    private EncryptionAtRest encryptionAtRest;

    /**
     * <p>
     * Specifies encryption-at-rest configuration for the Data Catalog.
     * </p>
     * 
     * @param encryptionAtRest
     *        Specifies encryption-at-rest configuration for the Data Catalog.
     */

    public void setEncryptionAtRest(EncryptionAtRest encryptionAtRest) {
        this.encryptionAtRest = encryptionAtRest;
    }

    /**
     * <p>
     * Specifies encryption-at-rest configuration for the Data Catalog.
     * </p>
     * 
     * @return Specifies encryption-at-rest configuration for the Data Catalog.
     */

    public EncryptionAtRest getEncryptionAtRest() {
        return this.encryptionAtRest;
    }

    /**
     * <p>
     * Specifies encryption-at-rest configuration for the Data Catalog.
     * </p>
     * 
     * @param encryptionAtRest
     *        Specifies encryption-at-rest configuration for the Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCatalogEncryptionSettings withEncryptionAtRest(EncryptionAtRest encryptionAtRest) {
        setEncryptionAtRest(encryptionAtRest);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEncryptionAtRest() != null)
            sb.append("EncryptionAtRest: ").append(getEncryptionAtRest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataCatalogEncryptionSettings == false)
            return false;
        DataCatalogEncryptionSettings other = (DataCatalogEncryptionSettings) obj;
        if (other.getEncryptionAtRest() == null ^ this.getEncryptionAtRest() == null)
            return false;
        if (other.getEncryptionAtRest() != null && other.getEncryptionAtRest().equals(this.getEncryptionAtRest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionAtRest() == null) ? 0 : getEncryptionAtRest().hashCode());
        return hashCode;
    }

    @Override
    public DataCatalogEncryptionSettings clone() {
        try {
            return (DataCatalogEncryptionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DataCatalogEncryptionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
