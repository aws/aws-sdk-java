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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/PutRepositoryCatalogData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRepositoryCatalogDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID associated with the public registry the repository is in. If you do not specify a registry,
     * the default public registry is assumed.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The name of the repository to create or update the catalog data for.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * An object containing the catalog data for a repository. This data is publicly visible in the Amazon ECR Public
     * Gallery.
     * </p>
     */
    private RepositoryCatalogDataInput catalogData;

    /**
     * <p>
     * The AWS account ID associated with the public registry the repository is in. If you do not specify a registry,
     * the default public registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the public registry the repository is in. If you do not specify a
     *        registry, the default public registry is assumed.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the public registry the repository is in. If you do not specify a registry,
     * the default public registry is assumed.
     * </p>
     * 
     * @return The AWS account ID associated with the public registry the repository is in. If you do not specify a
     *         registry, the default public registry is assumed.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The AWS account ID associated with the public registry the repository is in. If you do not specify a registry,
     * the default public registry is assumed.
     * </p>
     * 
     * @param registryId
     *        The AWS account ID associated with the public registry the repository is in. If you do not specify a
     *        registry, the default public registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRepositoryCatalogDataRequest withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The name of the repository to create or update the catalog data for.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to create or update the catalog data for.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository to create or update the catalog data for.
     * </p>
     * 
     * @return The name of the repository to create or update the catalog data for.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository to create or update the catalog data for.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to create or update the catalog data for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRepositoryCatalogDataRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * An object containing the catalog data for a repository. This data is publicly visible in the Amazon ECR Public
     * Gallery.
     * </p>
     * 
     * @param catalogData
     *        An object containing the catalog data for a repository. This data is publicly visible in the Amazon ECR
     *        Public Gallery.
     */

    public void setCatalogData(RepositoryCatalogDataInput catalogData) {
        this.catalogData = catalogData;
    }

    /**
     * <p>
     * An object containing the catalog data for a repository. This data is publicly visible in the Amazon ECR Public
     * Gallery.
     * </p>
     * 
     * @return An object containing the catalog data for a repository. This data is publicly visible in the Amazon ECR
     *         Public Gallery.
     */

    public RepositoryCatalogDataInput getCatalogData() {
        return this.catalogData;
    }

    /**
     * <p>
     * An object containing the catalog data for a repository. This data is publicly visible in the Amazon ECR Public
     * Gallery.
     * </p>
     * 
     * @param catalogData
     *        An object containing the catalog data for a repository. This data is publicly visible in the Amazon ECR
     *        Public Gallery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRepositoryCatalogDataRequest withCatalogData(RepositoryCatalogDataInput catalogData) {
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
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
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

        if (obj instanceof PutRepositoryCatalogDataRequest == false)
            return false;
        PutRepositoryCatalogDataRequest other = (PutRepositoryCatalogDataRequest) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getCatalogData() == null) ? 0 : getCatalogData().hashCode());
        return hashCode;
    }

    @Override
    public PutRepositoryCatalogDataRequest clone() {
        return (PutRepositoryCatalogDataRequest) super.clone();
    }

}
