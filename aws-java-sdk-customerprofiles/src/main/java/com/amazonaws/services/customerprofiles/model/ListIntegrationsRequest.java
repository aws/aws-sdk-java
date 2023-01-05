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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListIntegrations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIntegrationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The pagination token from the previous ListIntegrations API call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Boolean to indicate if hidden integration should be returned. Defaults to <code>False</code>.
     * </p>
     */
    private Boolean includeHidden;

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationsRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The pagination token from the previous ListIntegrations API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous ListIntegrations API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous ListIntegrations API call.
     * </p>
     * 
     * @return The pagination token from the previous ListIntegrations API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous ListIntegrations API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous ListIntegrations API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects returned per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     * 
     * @return The maximum number of objects returned per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects returned per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Boolean to indicate if hidden integration should be returned. Defaults to <code>False</code>.
     * </p>
     * 
     * @param includeHidden
     *        Boolean to indicate if hidden integration should be returned. Defaults to <code>False</code>.
     */

    public void setIncludeHidden(Boolean includeHidden) {
        this.includeHidden = includeHidden;
    }

    /**
     * <p>
     * Boolean to indicate if hidden integration should be returned. Defaults to <code>False</code>.
     * </p>
     * 
     * @return Boolean to indicate if hidden integration should be returned. Defaults to <code>False</code>.
     */

    public Boolean getIncludeHidden() {
        return this.includeHidden;
    }

    /**
     * <p>
     * Boolean to indicate if hidden integration should be returned. Defaults to <code>False</code>.
     * </p>
     * 
     * @param includeHidden
     *        Boolean to indicate if hidden integration should be returned. Defaults to <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIntegrationsRequest withIncludeHidden(Boolean includeHidden) {
        setIncludeHidden(includeHidden);
        return this;
    }

    /**
     * <p>
     * Boolean to indicate if hidden integration should be returned. Defaults to <code>False</code>.
     * </p>
     * 
     * @return Boolean to indicate if hidden integration should be returned. Defaults to <code>False</code>.
     */

    public Boolean isIncludeHidden() {
        return this.includeHidden;
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getIncludeHidden() != null)
            sb.append("IncludeHidden: ").append(getIncludeHidden());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIntegrationsRequest == false)
            return false;
        ListIntegrationsRequest other = (ListIntegrationsRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getIncludeHidden() == null ^ this.getIncludeHidden() == null)
            return false;
        if (other.getIncludeHidden() != null && other.getIncludeHidden().equals(this.getIncludeHidden()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getIncludeHidden() == null) ? 0 : getIncludeHidden().hashCode());
        return hashCode;
    }

    @Override
    public ListIntegrationsRequest clone() {
        return (ListIntegrationsRequest) super.clone();
    }

}
