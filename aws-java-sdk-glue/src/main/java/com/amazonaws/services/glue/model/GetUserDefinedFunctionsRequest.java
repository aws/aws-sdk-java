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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUserDefinedFunctions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUserDefinedFunctionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog where the functions to be retrieved are located. If none is supplied, the AWS account
     * ID is used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the catalog database where the functions are located.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * An optional function-name pattern string that filters the function definitions returned.
     * </p>
     */
    private String pattern;
    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of functions to return in one response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the Data Catalog where the functions to be retrieved are located. If none is supplied, the AWS account
     * ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the functions to be retrieved are located. If none is supplied, the AWS
     *        account ID is used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the functions to be retrieved are located. If none is supplied, the AWS account
     * ID is used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog where the functions to be retrieved are located. If none is supplied, the AWS
     *         account ID is used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the functions to be retrieved are located. If none is supplied, the AWS account
     * ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the functions to be retrieved are located. If none is supplied, the AWS
     *        account ID is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserDefinedFunctionsRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the catalog database where the functions are located.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database where the functions are located.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the functions are located.
     * </p>
     * 
     * @return The name of the catalog database where the functions are located.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the functions are located.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database where the functions are located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserDefinedFunctionsRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * An optional function-name pattern string that filters the function definitions returned.
     * </p>
     * 
     * @param pattern
     *        An optional function-name pattern string that filters the function definitions returned.
     */

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * An optional function-name pattern string that filters the function definitions returned.
     * </p>
     * 
     * @return An optional function-name pattern string that filters the function definitions returned.
     */

    public String getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * An optional function-name pattern string that filters the function definitions returned.
     * </p>
     * 
     * @param pattern
     *        An optional function-name pattern string that filters the function definitions returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserDefinedFunctionsRequest withPattern(String pattern) {
        setPattern(pattern);
        return this;
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

    public GetUserDefinedFunctionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of functions to return in one response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of functions to return in one response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of functions to return in one response.
     * </p>
     * 
     * @return The maximum number of functions to return in one response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of functions to return in one response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of functions to return in one response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserDefinedFunctionsRequest withMaxResults(Integer maxResults) {
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern()).append(",");
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

        if (obj instanceof GetUserDefinedFunctionsRequest == false)
            return false;
        GetUserDefinedFunctionsRequest other = (GetUserDefinedFunctionsRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
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
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetUserDefinedFunctionsRequest clone() {
        return (GetUserDefinedFunctionsRequest) super.clone();
    }

}
