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
package com.amazonaws.services.ecrpublic.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/GetRepositoryCatalogData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRepositoryCatalogDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The catalog metadata for the repository.
     * </p>
     */
    private RepositoryCatalogData catalogData;

    /**
     * <p>
     * The catalog metadata for the repository.
     * </p>
     * 
     * @param catalogData
     *        The catalog metadata for the repository.
     */

    public void setCatalogData(RepositoryCatalogData catalogData) {
        this.catalogData = catalogData;
    }

    /**
     * <p>
     * The catalog metadata for the repository.
     * </p>
     * 
     * @return The catalog metadata for the repository.
     */

    public RepositoryCatalogData getCatalogData() {
        return this.catalogData;
    }

    /**
     * <p>
     * The catalog metadata for the repository.
     * </p>
     * 
     * @param catalogData
     *        The catalog metadata for the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRepositoryCatalogDataResult withCatalogData(RepositoryCatalogData catalogData) {
        setCatalogData(catalogData);
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
        if (getCatalogData() != null)
            sb.append("CatalogData: ").append(getCatalogData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRepositoryCatalogDataResult == false)
            return false;
        GetRepositoryCatalogDataResult other = (GetRepositoryCatalogDataResult) obj;
        if (other.getCatalogData() == null ^ this.getCatalogData() == null)
            return false;
        if (other.getCatalogData() != null && other.getCatalogData().equals(this.getCatalogData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogData() == null) ? 0 : getCatalogData().hashCode());
        return hashCode;
    }

    @Override
    public GetRepositoryCatalogDataResult clone() {
        try {
            return (GetRepositoryCatalogDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
