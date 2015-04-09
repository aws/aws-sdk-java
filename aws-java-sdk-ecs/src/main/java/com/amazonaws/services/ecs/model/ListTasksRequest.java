/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#listTasks(ListTasksRequest) ListTasks operation}.
 * <p>
 * Returns a list of tasks for a specified cluster. You can filter the
 * results by family name or by a particular container instance with the
 * <code>family</code> and <code>containerInstance</code> parameters.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#listTasks(ListTasksRequest)
 */
public class ListTasksRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the tasks you want to list. If you do not specify a cluster, the
     * default cluster is assumed..
     */
    private String cluster;

    /**
     * The container instance UUID or full Amazon Resource Name (ARN) of the
     * container instance that you want to filter the <code>ListTasks</code>
     * results with. Specifying a <code>containerInstance</code> will limit
     * the results to tasks that belong to that container instance.
     */
    private String containerInstance;

    /**
     * The name of the family that you want to filter the
     * <code>ListTasks</code> results with. Specifying a <code>family</code>
     * will limit the results to tasks that belong to that family.
     */
    private String family;

    /**
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListTasks</code> request where <code>maxResults</code> was used
     * and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>nextToken</code> value. This value is <code>null</code> when
     * there are no more results to return.
     */
    private String nextToken;

    /**
     * The maximum number of task results returned by <code>ListTasks</code>
     * in paginated output. When this parameter is used,
     * <code>ListTasks</code> only returns <code>maxResults</code> results in
     * a single page along with a <code>nextToken</code> response element.
     * The remaining results of the initial request can be seen by sending
     * another <code>ListTasks</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTasks</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
     */
    private Integer maxResults;

    /**
     * 
     */
    private String startedBy;

    /**
     * The name of the service that you want to filter the
     * <code>ListTasks</code> results with. Specifying a
     * <code>serviceName</code> will limit the results to tasks that belong
     * to that service.
     */
    private String serviceName;

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the tasks you want to list. If you do not specify a cluster, the
     * default cluster is assumed..
     *
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that
     *         hosts the tasks you want to list. If you do not specify a cluster, the
     *         default cluster is assumed..
     */
    public String getCluster() {
        return cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the tasks you want to list. If you do not specify a cluster, the
     * default cluster is assumed..
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         hosts the tasks you want to list. If you do not specify a cluster, the
     *         default cluster is assumed..
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * hosts the tasks you want to list. If you do not specify a cluster, the
     * default cluster is assumed..
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         hosts the tasks you want to list. If you do not specify a cluster, the
     *         default cluster is assumed..
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTasksRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * The container instance UUID or full Amazon Resource Name (ARN) of the
     * container instance that you want to filter the <code>ListTasks</code>
     * results with. Specifying a <code>containerInstance</code> will limit
     * the results to tasks that belong to that container instance.
     *
     * @return The container instance UUID or full Amazon Resource Name (ARN) of the
     *         container instance that you want to filter the <code>ListTasks</code>
     *         results with. Specifying a <code>containerInstance</code> will limit
     *         the results to tasks that belong to that container instance.
     */
    public String getContainerInstance() {
        return containerInstance;
    }
    
    /**
     * The container instance UUID or full Amazon Resource Name (ARN) of the
     * container instance that you want to filter the <code>ListTasks</code>
     * results with. Specifying a <code>containerInstance</code> will limit
     * the results to tasks that belong to that container instance.
     *
     * @param containerInstance The container instance UUID or full Amazon Resource Name (ARN) of the
     *         container instance that you want to filter the <code>ListTasks</code>
     *         results with. Specifying a <code>containerInstance</code> will limit
     *         the results to tasks that belong to that container instance.
     */
    public void setContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
    }
    
    /**
     * The container instance UUID or full Amazon Resource Name (ARN) of the
     * container instance that you want to filter the <code>ListTasks</code>
     * results with. Specifying a <code>containerInstance</code> will limit
     * the results to tasks that belong to that container instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerInstance The container instance UUID or full Amazon Resource Name (ARN) of the
     *         container instance that you want to filter the <code>ListTasks</code>
     *         results with. Specifying a <code>containerInstance</code> will limit
     *         the results to tasks that belong to that container instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTasksRequest withContainerInstance(String containerInstance) {
        this.containerInstance = containerInstance;
        return this;
    }

    /**
     * The name of the family that you want to filter the
     * <code>ListTasks</code> results with. Specifying a <code>family</code>
     * will limit the results to tasks that belong to that family.
     *
     * @return The name of the family that you want to filter the
     *         <code>ListTasks</code> results with. Specifying a <code>family</code>
     *         will limit the results to tasks that belong to that family.
     */
    public String getFamily() {
        return family;
    }
    
    /**
     * The name of the family that you want to filter the
     * <code>ListTasks</code> results with. Specifying a <code>family</code>
     * will limit the results to tasks that belong to that family.
     *
     * @param family The name of the family that you want to filter the
     *         <code>ListTasks</code> results with. Specifying a <code>family</code>
     *         will limit the results to tasks that belong to that family.
     */
    public void setFamily(String family) {
        this.family = family;
    }
    
    /**
     * The name of the family that you want to filter the
     * <code>ListTasks</code> results with. Specifying a <code>family</code>
     * will limit the results to tasks that belong to that family.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param family The name of the family that you want to filter the
     *         <code>ListTasks</code> results with. Specifying a <code>family</code>
     *         will limit the results to tasks that belong to that family.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTasksRequest withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListTasks</code> request where <code>maxResults</code> was used
     * and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>nextToken</code> value. This value is <code>null</code> when
     * there are no more results to return.
     *
     * @return The <code>nextToken</code> value returned from a previous paginated
     *         <code>ListTasks</code> request where <code>maxResults</code> was used
     *         and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the
     *         <code>nextToken</code> value. This value is <code>null</code> when
     *         there are no more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListTasks</code> request where <code>maxResults</code> was used
     * and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>nextToken</code> value. This value is <code>null</code> when
     * there are no more results to return.
     *
     * @param nextToken The <code>nextToken</code> value returned from a previous paginated
     *         <code>ListTasks</code> request where <code>maxResults</code> was used
     *         and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the
     *         <code>nextToken</code> value. This value is <code>null</code> when
     *         there are no more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The <code>nextToken</code> value returned from a previous paginated
     * <code>ListTasks</code> request where <code>maxResults</code> was used
     * and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>nextToken</code> value. This value is <code>null</code> when
     * there are no more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The <code>nextToken</code> value returned from a previous paginated
     *         <code>ListTasks</code> request where <code>maxResults</code> was used
     *         and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the
     *         <code>nextToken</code> value. This value is <code>null</code> when
     *         there are no more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTasksRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of task results returned by <code>ListTasks</code>
     * in paginated output. When this parameter is used,
     * <code>ListTasks</code> only returns <code>maxResults</code> results in
     * a single page along with a <code>nextToken</code> response element.
     * The remaining results of the initial request can be seen by sending
     * another <code>ListTasks</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTasks</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
     *
     * @return The maximum number of task results returned by <code>ListTasks</code>
     *         in paginated output. When this parameter is used,
     *         <code>ListTasks</code> only returns <code>maxResults</code> results in
     *         a single page along with a <code>nextToken</code> response element.
     *         The remaining results of the initial request can be seen by sending
     *         another <code>ListTasks</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If
     *         this parameter is not used, then <code>ListTasks</code> returns up to
     *         100 results and a <code>nextToken</code> value if applicable.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of task results returned by <code>ListTasks</code>
     * in paginated output. When this parameter is used,
     * <code>ListTasks</code> only returns <code>maxResults</code> results in
     * a single page along with a <code>nextToken</code> response element.
     * The remaining results of the initial request can be seen by sending
     * another <code>ListTasks</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTasks</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
     *
     * @param maxResults The maximum number of task results returned by <code>ListTasks</code>
     *         in paginated output. When this parameter is used,
     *         <code>ListTasks</code> only returns <code>maxResults</code> results in
     *         a single page along with a <code>nextToken</code> response element.
     *         The remaining results of the initial request can be seen by sending
     *         another <code>ListTasks</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If
     *         this parameter is not used, then <code>ListTasks</code> returns up to
     *         100 results and a <code>nextToken</code> value if applicable.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of task results returned by <code>ListTasks</code>
     * in paginated output. When this parameter is used,
     * <code>ListTasks</code> only returns <code>maxResults</code> results in
     * a single page along with a <code>nextToken</code> response element.
     * The remaining results of the initial request can be seen by sending
     * another <code>ListTasks</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTasks</code> returns up to
     * 100 results and a <code>nextToken</code> value if applicable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of task results returned by <code>ListTasks</code>
     *         in paginated output. When this parameter is used,
     *         <code>ListTasks</code> only returns <code>maxResults</code> results in
     *         a single page along with a <code>nextToken</code> response element.
     *         The remaining results of the initial request can be seen by sending
     *         another <code>ListTasks</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If
     *         this parameter is not used, then <code>ListTasks</code> returns up to
     *         100 results and a <code>nextToken</code> value if applicable.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTasksRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * 
     *
     * @return 
     */
    public String getStartedBy() {
        return startedBy;
    }
    
    /**
     * 
     *
     * @param startedBy 
     */
    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startedBy 
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTasksRequest withStartedBy(String startedBy) {
        this.startedBy = startedBy;
        return this;
    }

    /**
     * The name of the service that you want to filter the
     * <code>ListTasks</code> results with. Specifying a
     * <code>serviceName</code> will limit the results to tasks that belong
     * to that service.
     *
     * @return The name of the service that you want to filter the
     *         <code>ListTasks</code> results with. Specifying a
     *         <code>serviceName</code> will limit the results to tasks that belong
     *         to that service.
     */
    public String getServiceName() {
        return serviceName;
    }
    
    /**
     * The name of the service that you want to filter the
     * <code>ListTasks</code> results with. Specifying a
     * <code>serviceName</code> will limit the results to tasks that belong
     * to that service.
     *
     * @param serviceName The name of the service that you want to filter the
     *         <code>ListTasks</code> results with. Specifying a
     *         <code>serviceName</code> will limit the results to tasks that belong
     *         to that service.
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    
    /**
     * The name of the service that you want to filter the
     * <code>ListTasks</code> results with. Specifying a
     * <code>serviceName</code> will limit the results to tasks that belong
     * to that service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceName The name of the service that you want to filter the
     *         <code>ListTasks</code> results with. Specifying a
     *         <code>serviceName</code> will limit the results to tasks that belong
     *         to that service.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTasksRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCluster() != null) sb.append("Cluster: " + getCluster() + ",");
        if (getContainerInstance() != null) sb.append("ContainerInstance: " + getContainerInstance() + ",");
        if (getFamily() != null) sb.append("Family: " + getFamily() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getStartedBy() != null) sb.append("StartedBy: " + getStartedBy() + ",");
        if (getServiceName() != null) sb.append("ServiceName: " + getServiceName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode()); 
        hashCode = prime * hashCode + ((getContainerInstance() == null) ? 0 : getContainerInstance().hashCode()); 
        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode()); 
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTasksRequest == false) return false;
        ListTasksRequest other = (ListTasksRequest)obj;
        
        if (other.getCluster() == null ^ this.getCluster() == null) return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false) return false; 
        if (other.getContainerInstance() == null ^ this.getContainerInstance() == null) return false;
        if (other.getContainerInstance() != null && other.getContainerInstance().equals(this.getContainerInstance()) == false) return false; 
        if (other.getFamily() == null ^ this.getFamily() == null) return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getStartedBy() == null ^ this.getStartedBy() == null) return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false) return false; 
        if (other.getServiceName() == null ^ this.getServiceName() == null) return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false) return false; 
        return true;
    }
    
    @Override
    public ListTasksRequest clone() {
        
            return (ListTasksRequest) super.clone();
    }

}
    