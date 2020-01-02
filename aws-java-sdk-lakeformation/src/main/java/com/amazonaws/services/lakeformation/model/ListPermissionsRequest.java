/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListPermissions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * Specifies a principal to filter the permissions returned.
     * </p>
     */
    private DataLakePrincipal principal;
    /**
     * <p>
     * Specifies a resource type to filter the permissions returned.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * A resource where you will get a list of the principal permissions.
     * </p>
     * <p>
     * This operation does not support getting privileges on a table with columns. Instead, call this operation on the
     * table, and the operation returns the table and the table w columns.
     * </p>
     */
    private Resource resource;
    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your AWS Lake Formation environment.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @return The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *         metadata store. It contains database definitions, table definitions, and other control information to
     *         manage your AWS Lake Formation environment.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your AWS Lake Formation environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * Specifies a principal to filter the permissions returned.
     * </p>
     * 
     * @param principal
     *        Specifies a principal to filter the permissions returned.
     */

    public void setPrincipal(DataLakePrincipal principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * Specifies a principal to filter the permissions returned.
     * </p>
     * 
     * @return Specifies a principal to filter the permissions returned.
     */

    public DataLakePrincipal getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * Specifies a principal to filter the permissions returned.
     * </p>
     * 
     * @param principal
     *        Specifies a principal to filter the permissions returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsRequest withPrincipal(DataLakePrincipal principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * Specifies a resource type to filter the permissions returned.
     * </p>
     * 
     * @param resourceType
     *        Specifies a resource type to filter the permissions returned.
     * @see DataLakeResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Specifies a resource type to filter the permissions returned.
     * </p>
     * 
     * @return Specifies a resource type to filter the permissions returned.
     * @see DataLakeResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Specifies a resource type to filter the permissions returned.
     * </p>
     * 
     * @param resourceType
     *        Specifies a resource type to filter the permissions returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLakeResourceType
     */

    public ListPermissionsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Specifies a resource type to filter the permissions returned.
     * </p>
     * 
     * @param resourceType
     *        Specifies a resource type to filter the permissions returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLakeResourceType
     */

    public ListPermissionsRequest withResourceType(DataLakeResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * A resource where you will get a list of the principal permissions.
     * </p>
     * <p>
     * This operation does not support getting privileges on a table with columns. Instead, call this operation on the
     * table, and the operation returns the table and the table w columns.
     * </p>
     * 
     * @param resource
     *        A resource where you will get a list of the principal permissions.</p>
     *        <p>
     *        This operation does not support getting privileges on a table with columns. Instead, call this operation
     *        on the table, and the operation returns the table and the table w columns.
     */

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * A resource where you will get a list of the principal permissions.
     * </p>
     * <p>
     * This operation does not support getting privileges on a table with columns. Instead, call this operation on the
     * table, and the operation returns the table and the table w columns.
     * </p>
     * 
     * @return A resource where you will get a list of the principal permissions.</p>
     *         <p>
     *         This operation does not support getting privileges on a table with columns. Instead, call this operation
     *         on the table, and the operation returns the table and the table w columns.
     */

    public Resource getResource() {
        return this.resource;
    }

    /**
     * <p>
     * A resource where you will get a list of the principal permissions.
     * </p>
     * <p>
     * This operation does not support getting privileges on a table with columns. Instead, call this operation on the
     * table, and the operation returns the table and the table w columns.
     * </p>
     * 
     * @param resource
     *        A resource where you will get a list of the principal permissions.</p>
     *        <p>
     *        This operation does not support getting privileges on a table with columns. Instead, call this operation
     *        on the table, and the operation returns the table and the table w columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsRequest withResource(Resource resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve this list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @return A continuation token, if this is not the first call to retrieve this list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPermissionsRequest == false)
            return false;
        ListPermissionsRequest other = (ListPermissionsRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListPermissionsRequest clone() {
        return (ListPermissionsRequest) super.clone();
    }

}
