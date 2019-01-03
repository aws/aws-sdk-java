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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code> <a>ListElasticsearchInstanceTypes</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListElasticsearchInstanceTypesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Version of Elasticsearch for which list of supported elasticsearch instance types are needed.
     * </p>
     */
    private String elasticsearchVersion;
    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are
     * querying for list of available Elasticsearch instance types when modifying existing domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Set this value to limit the number of results returned. Value provided must be greater than 30 else it wont be
     * honored.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for
     * pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Version of Elasticsearch for which list of supported elasticsearch instance types are needed.
     * </p>
     * 
     * @param elasticsearchVersion
     *        Version of Elasticsearch for which list of supported elasticsearch instance types are needed.
     */

    public void setElasticsearchVersion(String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
    }

    /**
     * <p>
     * Version of Elasticsearch for which list of supported elasticsearch instance types are needed.
     * </p>
     * 
     * @return Version of Elasticsearch for which list of supported elasticsearch instance types are needed.
     */

    public String getElasticsearchVersion() {
        return this.elasticsearchVersion;
    }

    /**
     * <p>
     * Version of Elasticsearch for which list of supported elasticsearch instance types are needed.
     * </p>
     * 
     * @param elasticsearchVersion
     *        Version of Elasticsearch for which list of supported elasticsearch instance types are needed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListElasticsearchInstanceTypesRequest withElasticsearchVersion(String elasticsearchVersion) {
        setElasticsearchVersion(elasticsearchVersion);
        return this;
    }

    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are
     * querying for list of available Elasticsearch instance types when modifying existing domain.
     * </p>
     * 
     * @param domainName
     *        DomainName represents the name of the Domain that we are trying to modify. This should be present only if
     *        we are querying for list of available Elasticsearch instance types when modifying existing domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are
     * querying for list of available Elasticsearch instance types when modifying existing domain.
     * </p>
     * 
     * @return DomainName represents the name of the Domain that we are trying to modify. This should be present only if
     *         we are querying for list of available Elasticsearch instance types when modifying existing domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are
     * querying for list of available Elasticsearch instance types when modifying existing domain.
     * </p>
     * 
     * @param domainName
     *        DomainName represents the name of the Domain that we are trying to modify. This should be present only if
     *        we are querying for list of available Elasticsearch instance types when modifying existing domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListElasticsearchInstanceTypesRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. Value provided must be greater than 30 else it wont be
     * honored.
     * </p>
     * 
     * @param maxResults
     *        Set this value to limit the number of results returned. Value provided must be greater than 30 else it
     *        wont be honored.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. Value provided must be greater than 30 else it wont be
     * honored.
     * </p>
     * 
     * @return Set this value to limit the number of results returned. Value provided must be greater than 30 else it
     *         wont be honored.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Set this value to limit the number of results returned. Value provided must be greater than 30 else it wont be
     * honored.
     * </p>
     * 
     * @param maxResults
     *        Set this value to limit the number of results returned. Value provided must be greater than 30 else it
     *        wont be honored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListElasticsearchInstanceTypesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for
     * pagination.
     * </p>
     * 
     * @param nextToken
     *        NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for
     *        pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for
     * pagination.
     * </p>
     * 
     * @return NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for
     *         pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for
     * pagination.
     * </p>
     * 
     * @param nextToken
     *        NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for
     *        pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListElasticsearchInstanceTypesRequest withNextToken(String nextToken) {
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
        if (getElasticsearchVersion() != null)
            sb.append("ElasticsearchVersion: ").append(getElasticsearchVersion()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListElasticsearchInstanceTypesRequest == false)
            return false;
        ListElasticsearchInstanceTypesRequest other = (ListElasticsearchInstanceTypesRequest) obj;
        if (other.getElasticsearchVersion() == null ^ this.getElasticsearchVersion() == null)
            return false;
        if (other.getElasticsearchVersion() != null && other.getElasticsearchVersion().equals(this.getElasticsearchVersion()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getElasticsearchVersion() == null) ? 0 : getElasticsearchVersion().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListElasticsearchInstanceTypesRequest clone() {
        return (ListElasticsearchInstanceTypesRequest) super.clone();
    }

}
