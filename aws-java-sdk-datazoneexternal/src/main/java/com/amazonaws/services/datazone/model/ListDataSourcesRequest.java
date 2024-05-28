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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListDataSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataSourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to list the data sources.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The identifier of the environment in which to list the data sources.
     * </p>
     */
    private String environmentIdentifier;
    /**
     * <p>
     * The maximum number of data sources to return in a single call to <code>ListDataSources</code>. When the number of
     * data sources to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListDataSources</code> to list the
     * next set of data sources.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The name of the data source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * When the number of data sources is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of data sources, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListDataSources</code> to list the next set of data sources.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The identifier of the project in which to list data sources.
     * </p>
     */
    private String projectIdentifier;
    /**
     * <p>
     * The status of the data source.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of the data source.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to list the data sources.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which to list the data sources.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to list the data sources.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which to list the data sources.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which to list the data sources.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which to list the data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the environment in which to list the data sources.
     * </p>
     * 
     * @param environmentIdentifier
     *        The identifier of the environment in which to list the data sources.
     */

    public void setEnvironmentIdentifier(String environmentIdentifier) {
        this.environmentIdentifier = environmentIdentifier;
    }

    /**
     * <p>
     * The identifier of the environment in which to list the data sources.
     * </p>
     * 
     * @return The identifier of the environment in which to list the data sources.
     */

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    /**
     * <p>
     * The identifier of the environment in which to list the data sources.
     * </p>
     * 
     * @param environmentIdentifier
     *        The identifier of the environment in which to list the data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesRequest withEnvironmentIdentifier(String environmentIdentifier) {
        setEnvironmentIdentifier(environmentIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of data sources to return in a single call to <code>ListDataSources</code>. When the number of
     * data sources to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListDataSources</code> to list the
     * next set of data sources.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of data sources to return in a single call to <code>ListDataSources</code>. When the
     *        number of data sources to be listed is greater than the value of <code>MaxResults</code>, the response
     *        contains a <code>NextToken</code> value that you can use in a subsequent call to
     *        <code>ListDataSources</code> to list the next set of data sources.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of data sources to return in a single call to <code>ListDataSources</code>. When the number of
     * data sources to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListDataSources</code> to list the
     * next set of data sources.
     * </p>
     * 
     * @return The maximum number of data sources to return in a single call to <code>ListDataSources</code>. When the
     *         number of data sources to be listed is greater than the value of <code>MaxResults</code>, the response
     *         contains a <code>NextToken</code> value that you can use in a subsequent call to
     *         <code>ListDataSources</code> to list the next set of data sources.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of data sources to return in a single call to <code>ListDataSources</code>. When the number of
     * data sources to be listed is greater than the value of <code>MaxResults</code>, the response contains a
     * <code>NextToken</code> value that you can use in a subsequent call to <code>ListDataSources</code> to list the
     * next set of data sources.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of data sources to return in a single call to <code>ListDataSources</code>. When the
     *        number of data sources to be listed is greater than the value of <code>MaxResults</code>, the response
     *        contains a <code>NextToken</code> value that you can use in a subsequent call to
     *        <code>ListDataSources</code> to list the next set of data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @return The name of the data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * When the number of data sources is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of data sources, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListDataSources</code> to list the next set of data sources.
     * </p>
     * 
     * @param nextToken
     *        When the number of data sources is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of data sources, the response includes a pagination token named <code>NextToken</code>. You can specify
     *        this <code>NextToken</code> value in a subsequent call to <code>ListDataSources</code> to list the next
     *        set of data sources.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of data sources is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of data sources, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListDataSources</code> to list the next set of data sources.
     * </p>
     * 
     * @return When the number of data sources is greater than the default value for the <code>MaxResults</code>
     *         parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *         of data sources, the response includes a pagination token named <code>NextToken</code>. You can specify
     *         this <code>NextToken</code> value in a subsequent call to <code>ListDataSources</code> to list the next
     *         set of data sources.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of data sources is greater than the default value for the <code>MaxResults</code> parameter, or
     * if you explicitly specify a value for <code>MaxResults</code> that is less than the number of data sources, the
     * response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code>
     * value in a subsequent call to <code>ListDataSources</code> to list the next set of data sources.
     * </p>
     * 
     * @param nextToken
     *        When the number of data sources is greater than the default value for the <code>MaxResults</code>
     *        parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number
     *        of data sources, the response includes a pagination token named <code>NextToken</code>. You can specify
     *        this <code>NextToken</code> value in a subsequent call to <code>ListDataSources</code> to list the next
     *        set of data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the project in which to list data sources.
     * </p>
     * 
     * @param projectIdentifier
     *        The identifier of the project in which to list data sources.
     */

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    /**
     * <p>
     * The identifier of the project in which to list data sources.
     * </p>
     * 
     * @return The identifier of the project in which to list data sources.
     */

    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * <p>
     * The identifier of the project in which to list data sources.
     * </p>
     * 
     * @param projectIdentifier
     *        The identifier of the project in which to list data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesRequest withProjectIdentifier(String projectIdentifier) {
        setProjectIdentifier(projectIdentifier);
        return this;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @param status
     *        The status of the data source.
     * @see DataSourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @return The status of the data source.
     * @see DataSourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @param status
     *        The status of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public ListDataSourcesRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @param status
     *        The status of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public ListDataSourcesRequest withStatus(DataSourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @param type
     *        The type of the data source.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @return The type of the data source.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @param type
     *        The type of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataSourcesRequest withType(String type) {
        setType(type);
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEnvironmentIdentifier() != null)
            sb.append("EnvironmentIdentifier: ").append(getEnvironmentIdentifier()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getProjectIdentifier() != null)
            sb.append("ProjectIdentifier: ").append(getProjectIdentifier()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDataSourcesRequest == false)
            return false;
        ListDataSourcesRequest other = (ListDataSourcesRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getEnvironmentIdentifier() == null ^ this.getEnvironmentIdentifier() == null)
            return false;
        if (other.getEnvironmentIdentifier() != null && other.getEnvironmentIdentifier().equals(this.getEnvironmentIdentifier()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProjectIdentifier() == null ^ this.getProjectIdentifier() == null)
            return false;
        if (other.getProjectIdentifier() != null && other.getProjectIdentifier().equals(this.getProjectIdentifier()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentIdentifier() == null) ? 0 : getEnvironmentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProjectIdentifier() == null) ? 0 : getProjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ListDataSourcesRequest clone() {
        return (ListDataSourcesRequest) super.clone();
    }

}
