/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ListDatasourcePackages" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDatasourcePackagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details on the data source packages active in the behavior graph.
     * </p>
     */
    private java.util.Map<String, DatasourcePackageIngestDetail> datasourcePackages;
    /**
     * <p>
     * For requests to get the next page of results, the pagination token that was returned with the previous set of
     * results. The initial request does not include a pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Details on the data source packages active in the behavior graph.
     * </p>
     * 
     * @return Details on the data source packages active in the behavior graph.
     */

    public java.util.Map<String, DatasourcePackageIngestDetail> getDatasourcePackages() {
        return datasourcePackages;
    }

    /**
     * <p>
     * Details on the data source packages active in the behavior graph.
     * </p>
     * 
     * @param datasourcePackages
     *        Details on the data source packages active in the behavior graph.
     */

    public void setDatasourcePackages(java.util.Map<String, DatasourcePackageIngestDetail> datasourcePackages) {
        this.datasourcePackages = datasourcePackages;
    }

    /**
     * <p>
     * Details on the data source packages active in the behavior graph.
     * </p>
     * 
     * @param datasourcePackages
     *        Details on the data source packages active in the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasourcePackagesResult withDatasourcePackages(java.util.Map<String, DatasourcePackageIngestDetail> datasourcePackages) {
        setDatasourcePackages(datasourcePackages);
        return this;
    }

    /**
     * Add a single DatasourcePackages entry
     *
     * @see ListDatasourcePackagesResult#withDatasourcePackages
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasourcePackagesResult addDatasourcePackagesEntry(String key, DatasourcePackageIngestDetail value) {
        if (null == this.datasourcePackages) {
            this.datasourcePackages = new java.util.HashMap<String, DatasourcePackageIngestDetail>();
        }
        if (this.datasourcePackages.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.datasourcePackages.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DatasourcePackages.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasourcePackagesResult clearDatasourcePackagesEntries() {
        this.datasourcePackages = null;
        return this;
    }

    /**
     * <p>
     * For requests to get the next page of results, the pagination token that was returned with the previous set of
     * results. The initial request does not include a pagination token.
     * </p>
     * 
     * @param nextToken
     *        For requests to get the next page of results, the pagination token that was returned with the previous set
     *        of results. The initial request does not include a pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For requests to get the next page of results, the pagination token that was returned with the previous set of
     * results. The initial request does not include a pagination token.
     * </p>
     * 
     * @return For requests to get the next page of results, the pagination token that was returned with the previous
     *         set of results. The initial request does not include a pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For requests to get the next page of results, the pagination token that was returned with the previous set of
     * results. The initial request does not include a pagination token.
     * </p>
     * 
     * @param nextToken
     *        For requests to get the next page of results, the pagination token that was returned with the previous set
     *        of results. The initial request does not include a pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDatasourcePackagesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDatasourcePackages() != null)
            sb.append("DatasourcePackages: ").append(getDatasourcePackages()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDatasourcePackagesResult == false)
            return false;
        ListDatasourcePackagesResult other = (ListDatasourcePackagesResult) obj;
        if (other.getDatasourcePackages() == null ^ this.getDatasourcePackages() == null)
            return false;
        if (other.getDatasourcePackages() != null && other.getDatasourcePackages().equals(this.getDatasourcePackages()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasourcePackages() == null) ? 0 : getDatasourcePackages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDatasourcePackagesResult clone() {
        try {
            return (ListDatasourcePackagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
