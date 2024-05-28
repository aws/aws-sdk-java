/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ListLogSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLogSourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of Amazon Web Services accounts for which log sources are displayed.
     * </p>
     */
    private java.util.List<String> accounts;
    /**
     * <p>
     * The maximum number of accounts for which the log sources are displayed.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of Regions for which log sources are displayed.
     * </p>
     */
    private java.util.List<String> regions;
    /**
     * <p>
     * The list of sources for which log sources are displayed.
     * </p>
     */
    private java.util.List<LogSourceResource> sources;

    /**
     * <p>
     * The list of Amazon Web Services accounts for which log sources are displayed.
     * </p>
     * 
     * @return The list of Amazon Web Services accounts for which log sources are displayed.
     */

    public java.util.List<String> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * The list of Amazon Web Services accounts for which log sources are displayed.
     * </p>
     * 
     * @param accounts
     *        The list of Amazon Web Services accounts for which log sources are displayed.
     */

    public void setAccounts(java.util.Collection<String> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<String>(accounts);
    }

    /**
     * <p>
     * The list of Amazon Web Services accounts for which log sources are displayed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        The list of Amazon Web Services accounts for which log sources are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest withAccounts(String... accounts) {
        if (this.accounts == null) {
            setAccounts(new java.util.ArrayList<String>(accounts.length));
        }
        for (String ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Amazon Web Services accounts for which log sources are displayed.
     * </p>
     * 
     * @param accounts
     *        The list of Amazon Web Services accounts for which log sources are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * The maximum number of accounts for which the log sources are displayed.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of accounts for which the log sources are displayed.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of accounts for which the log sources are displayed.
     * </p>
     * 
     * @return The maximum number of accounts for which the log sources are displayed.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of accounts for which the log sources are displayed.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of accounts for which the log sources are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. You can repeat the call using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     * 
     * @return If nextToken is returned, there are more results available. You can repeat the call using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. You can repeat the call using the returned token to
     * retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned, there are more results available. You can repeat the call using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of Regions for which log sources are displayed.
     * </p>
     * 
     * @return The list of Regions for which log sources are displayed.
     */

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * The list of Regions for which log sources are displayed.
     * </p>
     * 
     * @param regions
     *        The list of Regions for which log sources are displayed.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>
     * The list of Regions for which log sources are displayed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        The list of Regions for which log sources are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Regions for which log sources are displayed.
     * </p>
     * 
     * @param regions
     *        The list of Regions for which log sources are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * The list of sources for which log sources are displayed.
     * </p>
     * 
     * @return The list of sources for which log sources are displayed.
     */

    public java.util.List<LogSourceResource> getSources() {
        return sources;
    }

    /**
     * <p>
     * The list of sources for which log sources are displayed.
     * </p>
     * 
     * @param sources
     *        The list of sources for which log sources are displayed.
     */

    public void setSources(java.util.Collection<LogSourceResource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<LogSourceResource>(sources);
    }

    /**
     * <p>
     * The list of sources for which log sources are displayed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The list of sources for which log sources are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest withSources(LogSourceResource... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<LogSourceResource>(sources.length));
        }
        for (LogSourceResource ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of sources for which log sources are displayed.
     * </p>
     * 
     * @param sources
     *        The list of sources for which log sources are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogSourcesRequest withSources(java.util.Collection<LogSourceResource> sources) {
        setSources(sources);
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
        if (getAccounts() != null)
            sb.append("Accounts: ").append(getAccounts()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLogSourcesRequest == false)
            return false;
        ListLogSourcesRequest other = (ListLogSourcesRequest) obj;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public ListLogSourcesRequest clone() {
        return (ListLogSourcesRequest) super.clone();
    }

}
