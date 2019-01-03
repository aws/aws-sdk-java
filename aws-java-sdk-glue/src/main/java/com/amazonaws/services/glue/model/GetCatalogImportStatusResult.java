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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCatalogImportStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCatalogImportStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the specified catalog migration.
     * </p>
     */
    private CatalogImportStatus importStatus;

    /**
     * <p>
     * The status of the specified catalog migration.
     * </p>
     * 
     * @param importStatus
     *        The status of the specified catalog migration.
     */

    public void setImportStatus(CatalogImportStatus importStatus) {
        this.importStatus = importStatus;
    }

    /**
     * <p>
     * The status of the specified catalog migration.
     * </p>
     * 
     * @return The status of the specified catalog migration.
     */

    public CatalogImportStatus getImportStatus() {
        return this.importStatus;
    }

    /**
     * <p>
     * The status of the specified catalog migration.
     * </p>
     * 
     * @param importStatus
     *        The status of the specified catalog migration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCatalogImportStatusResult withImportStatus(CatalogImportStatus importStatus) {
        setImportStatus(importStatus);
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
        if (getImportStatus() != null)
            sb.append("ImportStatus: ").append(getImportStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCatalogImportStatusResult == false)
            return false;
        GetCatalogImportStatusResult other = (GetCatalogImportStatusResult) obj;
        if (other.getImportStatus() == null ^ this.getImportStatus() == null)
            return false;
        if (other.getImportStatus() != null && other.getImportStatus().equals(this.getImportStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportStatus() == null) ? 0 : getImportStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetCatalogImportStatusResult clone() {
        try {
            return (GetCatalogImportStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
