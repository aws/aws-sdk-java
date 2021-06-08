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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetDataCatalog" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataCatalogResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The data catalog returned.
     * </p>
     */
    private DataCatalog dataCatalog;

    /**
     * <p>
     * The data catalog returned.
     * </p>
     * 
     * @param dataCatalog
     *        The data catalog returned.
     */

    public void setDataCatalog(DataCatalog dataCatalog) {
        this.dataCatalog = dataCatalog;
    }

    /**
     * <p>
     * The data catalog returned.
     * </p>
     * 
     * @return The data catalog returned.
     */

    public DataCatalog getDataCatalog() {
        return this.dataCatalog;
    }

    /**
     * <p>
     * The data catalog returned.
     * </p>
     * 
     * @param dataCatalog
     *        The data catalog returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataCatalogResult withDataCatalog(DataCatalog dataCatalog) {
        setDataCatalog(dataCatalog);
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
        if (getDataCatalog() != null)
            sb.append("DataCatalog: ").append(getDataCatalog());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataCatalogResult == false)
            return false;
        GetDataCatalogResult other = (GetDataCatalogResult) obj;
        if (other.getDataCatalog() == null ^ this.getDataCatalog() == null)
            return false;
        if (other.getDataCatalog() != null && other.getDataCatalog().equals(this.getDataCatalog()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataCatalog() == null) ? 0 : getDataCatalog().hashCode());
        return hashCode;
    }

    @Override
    public GetDataCatalogResult clone() {
        try {
            return (GetDataCatalogResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
