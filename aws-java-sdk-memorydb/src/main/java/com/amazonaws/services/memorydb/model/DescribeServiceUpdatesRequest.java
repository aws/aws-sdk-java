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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeServiceUpdates" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServiceUpdatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the service update to describe.
     * </p>
     */
    private String serviceUpdateName;
    /**
     * <p>
     * The list of cluster names to identify service updates to apply
     * </p>
     */
    private java.util.List<String> clusterNames;
    /**
     * <p>
     * The status(es) of the service updates to filter on
     * </p>
     */
    private java.util.List<String> status;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique ID of the service update to describe.
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update to describe.
     */

    public void setServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update to describe.
     * </p>
     * 
     * @return The unique ID of the service update to describe.
     */

    public String getServiceUpdateName() {
        return this.serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update to describe.
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceUpdatesRequest withServiceUpdateName(String serviceUpdateName) {
        setServiceUpdateName(serviceUpdateName);
        return this;
    }

    /**
     * <p>
     * The list of cluster names to identify service updates to apply
     * </p>
     * 
     * @return The list of cluster names to identify service updates to apply
     */

    public java.util.List<String> getClusterNames() {
        return clusterNames;
    }

    /**
     * <p>
     * The list of cluster names to identify service updates to apply
     * </p>
     * 
     * @param clusterNames
     *        The list of cluster names to identify service updates to apply
     */

    public void setClusterNames(java.util.Collection<String> clusterNames) {
        if (clusterNames == null) {
            this.clusterNames = null;
            return;
        }

        this.clusterNames = new java.util.ArrayList<String>(clusterNames);
    }

    /**
     * <p>
     * The list of cluster names to identify service updates to apply
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterNames(java.util.Collection)} or {@link #withClusterNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param clusterNames
     *        The list of cluster names to identify service updates to apply
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceUpdatesRequest withClusterNames(String... clusterNames) {
        if (this.clusterNames == null) {
            setClusterNames(new java.util.ArrayList<String>(clusterNames.length));
        }
        for (String ele : clusterNames) {
            this.clusterNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of cluster names to identify service updates to apply
     * </p>
     * 
     * @param clusterNames
     *        The list of cluster names to identify service updates to apply
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceUpdatesRequest withClusterNames(java.util.Collection<String> clusterNames) {
        setClusterNames(clusterNames);
        return this;
    }

    /**
     * <p>
     * The status(es) of the service updates to filter on
     * </p>
     * 
     * @return The status(es) of the service updates to filter on
     * @see ServiceUpdateStatus
     */

    public java.util.List<String> getStatus() {
        return status;
    }

    /**
     * <p>
     * The status(es) of the service updates to filter on
     * </p>
     * 
     * @param status
     *        The status(es) of the service updates to filter on
     * @see ServiceUpdateStatus
     */

    public void setStatus(java.util.Collection<String> status) {
        if (status == null) {
            this.status = null;
            return;
        }

        this.status = new java.util.ArrayList<String>(status);
    }

    /**
     * <p>
     * The status(es) of the service updates to filter on
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatus(java.util.Collection)} or {@link #withStatus(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param status
     *        The status(es) of the service updates to filter on
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public DescribeServiceUpdatesRequest withStatus(String... status) {
        if (this.status == null) {
            setStatus(new java.util.ArrayList<String>(status.length));
        }
        for (String ele : status) {
            this.status.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status(es) of the service updates to filter on
     * </p>
     * 
     * @param status
     *        The status(es) of the service updates to filter on
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public DescribeServiceUpdatesRequest withStatus(java.util.Collection<String> status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status(es) of the service updates to filter on
     * </p>
     * 
     * @param status
     *        The status(es) of the service updates to filter on
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public DescribeServiceUpdatesRequest withStatus(ServiceUpdateStatus... status) {
        java.util.ArrayList<String> statusCopy = new java.util.ArrayList<String>(status.length);
        for (ServiceUpdateStatus value : status) {
            statusCopy.add(value.toString());
        }
        if (getStatus() == null) {
            setStatus(statusCopy);
        } else {
            getStatus().addAll(statusCopy);
        }
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceUpdatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        An optional argument to pass in case the total number of records exceeds the value of MaxResults. If
     *        nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @return An optional argument to pass in case the total number of records exceeds the value of MaxResults. If
     *         nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *         token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *         other arguments unchanged.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        An optional argument to pass in case the total number of records exceeds the value of MaxResults. If
     *        nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceUpdatesRequest withNextToken(String nextToken) {
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
        if (getServiceUpdateName() != null)
            sb.append("ServiceUpdateName: ").append(getServiceUpdateName()).append(",");
        if (getClusterNames() != null)
            sb.append("ClusterNames: ").append(getClusterNames()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof DescribeServiceUpdatesRequest == false)
            return false;
        DescribeServiceUpdatesRequest other = (DescribeServiceUpdatesRequest) obj;
        if (other.getServiceUpdateName() == null ^ this.getServiceUpdateName() == null)
            return false;
        if (other.getServiceUpdateName() != null && other.getServiceUpdateName().equals(this.getServiceUpdateName()) == false)
            return false;
        if (other.getClusterNames() == null ^ this.getClusterNames() == null)
            return false;
        if (other.getClusterNames() != null && other.getClusterNames().equals(this.getClusterNames()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getServiceUpdateName() == null) ? 0 : getServiceUpdateName().hashCode());
        hashCode = prime * hashCode + ((getClusterNames() == null) ? 0 : getClusterNames().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServiceUpdatesRequest clone() {
        return (DescribeServiceUpdatesRequest) super.clone();
    }

}
