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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListContainerInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContainerInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to list. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * You can filter the results of a <code>ListContainerInstances</code> operation with cluster query language
     * statements. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster Query
     * Language</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String filter;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListContainerInstances</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of container instance results returned by <code>ListContainerInstances</code> in paginated
     * output. When this parameter is used, <code>ListContainerInstances</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>ListContainerInstances</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>ListContainerInstances</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Filters the container instances by status. For example, if you specify the <code>DRAINING</code> status, the
     * results include only container instances that have been set to <code>DRAINING</code> using
     * <a>UpdateContainerInstancesState</a>. If you do not specify this parameter, the default is to include container
     * instances set to <code>ACTIVE</code> and <code>DRAINING</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to list. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to
     *        list. If you do not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to list. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to
     *         list. If you do not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to list. If
     * you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to
     *        list. If you do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerInstancesRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * You can filter the results of a <code>ListContainerInstances</code> operation with cluster query language
     * statements. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster Query
     * Language</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param filter
     *        You can filter the results of a <code>ListContainerInstances</code> operation with cluster query language
     *        statements. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster
     *        Query Language</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * You can filter the results of a <code>ListContainerInstances</code> operation with cluster query language
     * statements. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster Query
     * Language</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return You can filter the results of a <code>ListContainerInstances</code> operation with cluster query language
     *         statements. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster
     *         Query Language</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * You can filter the results of a <code>ListContainerInstances</code> operation with cluster query language
     * statements. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster Query
     * Language</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param filter
     *        You can filter the results of a <code>ListContainerInstances</code> operation with cluster query language
     *        statements. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html">Cluster
     *        Query Language</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerInstancesRequest withFilter(String filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListContainerInstances</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListContainerInstances</code>
     *        request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>nextToken</code>
     *        value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListContainerInstances</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListContainerInstances</code>
     *         request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *         Pagination continues from the end of the previous results that returned the <code>nextToken</code>
     *         value.</p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListContainerInstances</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListContainerInstances</code>
     *        request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>nextToken</code>
     *        value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerInstancesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of container instance results returned by <code>ListContainerInstances</code> in paginated
     * output. When this parameter is used, <code>ListContainerInstances</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>ListContainerInstances</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>ListContainerInstances</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of container instance results returned by <code>ListContainerInstances</code> in
     *        paginated output. When this parameter is used, <code>ListContainerInstances</code> only returns
     *        <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>ListContainerInstances</code> request with the returned <code>nextToken</code> value. This value can
     *        be between 1 and 100. If this parameter is not used, then <code>ListContainerInstances</code> returns up
     *        to 100 results and a <code>nextToken</code> value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of container instance results returned by <code>ListContainerInstances</code> in paginated
     * output. When this parameter is used, <code>ListContainerInstances</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>ListContainerInstances</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>ListContainerInstances</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of container instance results returned by <code>ListContainerInstances</code> in
     *         paginated output. When this parameter is used, <code>ListContainerInstances</code> only returns
     *         <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element.
     *         The remaining results of the initial request can be seen by sending another
     *         <code>ListContainerInstances</code> request with the returned <code>nextToken</code> value. This value
     *         can be between 1 and 100. If this parameter is not used, then <code>ListContainerInstances</code> returns
     *         up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of container instance results returned by <code>ListContainerInstances</code> in paginated
     * output. When this parameter is used, <code>ListContainerInstances</code> only returns <code>maxResults</code>
     * results in a single page along with a <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>ListContainerInstances</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter is not used, then
     * <code>ListContainerInstances</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of container instance results returned by <code>ListContainerInstances</code> in
     *        paginated output. When this parameter is used, <code>ListContainerInstances</code> only returns
     *        <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>ListContainerInstances</code> request with the returned <code>nextToken</code> value. This value can
     *        be between 1 and 100. If this parameter is not used, then <code>ListContainerInstances</code> returns up
     *        to 100 results and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContainerInstancesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filters the container instances by status. For example, if you specify the <code>DRAINING</code> status, the
     * results include only container instances that have been set to <code>DRAINING</code> using
     * <a>UpdateContainerInstancesState</a>. If you do not specify this parameter, the default is to include container
     * instances set to <code>ACTIVE</code> and <code>DRAINING</code>.
     * </p>
     * 
     * @param status
     *        Filters the container instances by status. For example, if you specify the <code>DRAINING</code> status,
     *        the results include only container instances that have been set to <code>DRAINING</code> using
     *        <a>UpdateContainerInstancesState</a>. If you do not specify this parameter, the default is to include
     *        container instances set to <code>ACTIVE</code> and <code>DRAINING</code>.
     * @see ContainerInstanceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Filters the container instances by status. For example, if you specify the <code>DRAINING</code> status, the
     * results include only container instances that have been set to <code>DRAINING</code> using
     * <a>UpdateContainerInstancesState</a>. If you do not specify this parameter, the default is to include container
     * instances set to <code>ACTIVE</code> and <code>DRAINING</code>.
     * </p>
     * 
     * @return Filters the container instances by status. For example, if you specify the <code>DRAINING</code> status,
     *         the results include only container instances that have been set to <code>DRAINING</code> using
     *         <a>UpdateContainerInstancesState</a>. If you do not specify this parameter, the default is to include
     *         container instances set to <code>ACTIVE</code> and <code>DRAINING</code>.
     * @see ContainerInstanceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Filters the container instances by status. For example, if you specify the <code>DRAINING</code> status, the
     * results include only container instances that have been set to <code>DRAINING</code> using
     * <a>UpdateContainerInstancesState</a>. If you do not specify this parameter, the default is to include container
     * instances set to <code>ACTIVE</code> and <code>DRAINING</code>.
     * </p>
     * 
     * @param status
     *        Filters the container instances by status. For example, if you specify the <code>DRAINING</code> status,
     *        the results include only container instances that have been set to <code>DRAINING</code> using
     *        <a>UpdateContainerInstancesState</a>. If you do not specify this parameter, the default is to include
     *        container instances set to <code>ACTIVE</code> and <code>DRAINING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerInstanceStatus
     */

    public ListContainerInstancesRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Filters the container instances by status. For example, if you specify the <code>DRAINING</code> status, the
     * results include only container instances that have been set to <code>DRAINING</code> using
     * <a>UpdateContainerInstancesState</a>. If you do not specify this parameter, the default is to include container
     * instances set to <code>ACTIVE</code> and <code>DRAINING</code>.
     * </p>
     * 
     * @param status
     *        Filters the container instances by status. For example, if you specify the <code>DRAINING</code> status,
     *        the results include only container instances that have been set to <code>DRAINING</code> using
     *        <a>UpdateContainerInstancesState</a>. If you do not specify this parameter, the default is to include
     *        container instances set to <code>ACTIVE</code> and <code>DRAINING</code>.
     * @see ContainerInstanceStatus
     */

    public void setStatus(ContainerInstanceStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * Filters the container instances by status. For example, if you specify the <code>DRAINING</code> status, the
     * results include only container instances that have been set to <code>DRAINING</code> using
     * <a>UpdateContainerInstancesState</a>. If you do not specify this parameter, the default is to include container
     * instances set to <code>ACTIVE</code> and <code>DRAINING</code>.
     * </p>
     * 
     * @param status
     *        Filters the container instances by status. For example, if you specify the <code>DRAINING</code> status,
     *        the results include only container instances that have been set to <code>DRAINING</code> using
     *        <a>UpdateContainerInstancesState</a>. If you do not specify this parameter, the default is to include
     *        container instances set to <code>ACTIVE</code> and <code>DRAINING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerInstanceStatus
     */

    public ListContainerInstancesRequest withStatus(ContainerInstanceStatus status) {
        this.status = status.toString();
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListContainerInstancesRequest == false)
            return false;
        ListContainerInstancesRequest other = (ListContainerInstancesRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListContainerInstancesRequest clone() {
        return (ListContainerInstancesRequest) super.clone();
    }

}
