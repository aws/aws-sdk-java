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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetConnections" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConnectionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * A filter that controls which connections will be returned.
     * </p>
     */
    private GetConnectionsFilter filter;
    /**
     * <p>
     * Allows you to retrieve the connection metadata without returning the password. For instance, the AWS Glue console
     * uses this flag to retrieve the connection, and does not display the password. Set this parameter when the caller
     * might not have permission to use the AWS KMS key to decrypt the password, but does have permission to access the
     * rest of the connection properties.
     * </p>
     */
    private Boolean hidePassword;
    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of connections to return in one response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is
     *        used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     * 
     * @return The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is
     *         used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is
     *        used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionsRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * A filter that controls which connections will be returned.
     * </p>
     * 
     * @param filter
     *        A filter that controls which connections will be returned.
     */

    public void setFilter(GetConnectionsFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A filter that controls which connections will be returned.
     * </p>
     * 
     * @return A filter that controls which connections will be returned.
     */

    public GetConnectionsFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * A filter that controls which connections will be returned.
     * </p>
     * 
     * @param filter
     *        A filter that controls which connections will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionsRequest withFilter(GetConnectionsFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Allows you to retrieve the connection metadata without returning the password. For instance, the AWS Glue console
     * uses this flag to retrieve the connection, and does not display the password. Set this parameter when the caller
     * might not have permission to use the AWS KMS key to decrypt the password, but does have permission to access the
     * rest of the connection properties.
     * </p>
     * 
     * @param hidePassword
     *        Allows you to retrieve the connection metadata without returning the password. For instance, the AWS Glue
     *        console uses this flag to retrieve the connection, and does not display the password. Set this parameter
     *        when the caller might not have permission to use the AWS KMS key to decrypt the password, but does have
     *        permission to access the rest of the connection properties.
     */

    public void setHidePassword(Boolean hidePassword) {
        this.hidePassword = hidePassword;
    }

    /**
     * <p>
     * Allows you to retrieve the connection metadata without returning the password. For instance, the AWS Glue console
     * uses this flag to retrieve the connection, and does not display the password. Set this parameter when the caller
     * might not have permission to use the AWS KMS key to decrypt the password, but does have permission to access the
     * rest of the connection properties.
     * </p>
     * 
     * @return Allows you to retrieve the connection metadata without returning the password. For instance, the AWS Glue
     *         console uses this flag to retrieve the connection, and does not display the password. Set this parameter
     *         when the caller might not have permission to use the AWS KMS key to decrypt the password, but does have
     *         permission to access the rest of the connection properties.
     */

    public Boolean getHidePassword() {
        return this.hidePassword;
    }

    /**
     * <p>
     * Allows you to retrieve the connection metadata without returning the password. For instance, the AWS Glue console
     * uses this flag to retrieve the connection, and does not display the password. Set this parameter when the caller
     * might not have permission to use the AWS KMS key to decrypt the password, but does have permission to access the
     * rest of the connection properties.
     * </p>
     * 
     * @param hidePassword
     *        Allows you to retrieve the connection metadata without returning the password. For instance, the AWS Glue
     *        console uses this flag to retrieve the connection, and does not display the password. Set this parameter
     *        when the caller might not have permission to use the AWS KMS key to decrypt the password, but does have
     *        permission to access the rest of the connection properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionsRequest withHidePassword(Boolean hidePassword) {
        setHidePassword(hidePassword);
        return this;
    }

    /**
     * <p>
     * Allows you to retrieve the connection metadata without returning the password. For instance, the AWS Glue console
     * uses this flag to retrieve the connection, and does not display the password. Set this parameter when the caller
     * might not have permission to use the AWS KMS key to decrypt the password, but does have permission to access the
     * rest of the connection properties.
     * </p>
     * 
     * @return Allows you to retrieve the connection metadata without returning the password. For instance, the AWS Glue
     *         console uses this flag to retrieve the connection, and does not display the password. Set this parameter
     *         when the caller might not have permission to use the AWS KMS key to decrypt the password, but does have
     *         permission to access the rest of the connection properties.
     */

    public Boolean isHidePassword() {
        return this.hidePassword;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @return A continuation token, if this is a continuation call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of connections to return in one response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of connections to return in one response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of connections to return in one response.
     * </p>
     * 
     * @return The maximum number of connections to return in one response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of connections to return in one response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of connections to return in one response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionsRequest withMaxResults(Integer maxResults) {
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getHidePassword() != null)
            sb.append("HidePassword: ").append(getHidePassword()).append(",");
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

        if (obj instanceof GetConnectionsRequest == false)
            return false;
        GetConnectionsRequest other = (GetConnectionsRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getHidePassword() == null ^ this.getHidePassword() == null)
            return false;
        if (other.getHidePassword() != null && other.getHidePassword().equals(this.getHidePassword()) == false)
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
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getHidePassword() == null) ? 0 : getHidePassword().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetConnectionsRequest clone() {
        return (GetConnectionsRequest) super.clone();
    }

}
