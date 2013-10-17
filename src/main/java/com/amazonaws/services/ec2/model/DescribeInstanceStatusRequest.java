/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeInstanceStatusRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeInstanceStatus(DescribeInstanceStatusRequest) DescribeInstanceStatus operation}.
 * <p>
 * Describes the status of an Amazon Elastic Compute Cloud (Amazon EC2) instance. Instance status provides information about two types of scheduled
 * events for an instance that may require your attention:
 * </p>
 * 
 * <ul>
 * <li> Scheduled Reboot: When Amazon EC2 determines that an instance must be rebooted, the instance's status will return one of two event codes:
 * <code>system-reboot</code> or <code>instance-reboot</code> . System reboot commonly occurs if certain maintenance or upgrade operations require a
 * reboot of the underlying host that supports an instance. Instance reboot commonly occurs if the instance must be rebooted, rather than the underlying
 * host. Rebooting events include a scheduled start and end time. </li>
 * <li> Scheduled Retirement: When Amazon EC2 determines that an instance must be shut down, the instance's status will return an event code called
 * <code>instance-retirement</code> . Retirement commonly occurs when the underlying host is degraded and must be replaced. Retirement events include a
 * scheduled start and end time. You're also notified by email if one of your instances is set to retiring. The email message indicates when your
 * instance will be permanently retired. </li>
 * 
 * </ul>
 * <p>
 * If your instance is permanently retired, it will not be restarted. You can avoid retirement by manually restarting your instance when its event code
 * is <code>instance-retirement</code> . This ensures that your instance is started on a healthy host.
 * </p>
 * <p>
 * <code>DescribeInstanceStatus</code> returns information only for instances in the running state.
 * </p>
 * <p>
 * You can filter the results to return information only about instances that match criteria you specify. For example, you could get information about
 * instances in a specific Availability Zone. You can specify multiple values for a filter (e.g., more than one Availability Zone). An instance must
 * match at least one of the specified values for it to be included in the results.
 * </p>
 * <p>
 * You can specify multiple filters. An instance must match all the filters for it to be included in the results. If there's no match, no special
 * message is returned; the response is simply empty.
 * </p>
 * <p>
 * You can use wildcards with the filter values: <code>*</code> matches zero or more characters, and <code>?</code> matches exactly one character. You
 * can escape special characters using a backslash before the character. For example, a value of <code>\*amazon\?\\</code> searches for the literal
 * string <code>*amazon?\</code> .
 * 
 * </p>
 * <p>
 * The following filters are available:
 * </p>
 * 
 * <ul>
 * <li> <code>availability-zone</code> - Filter on an instance's availability zone. </li>
 * <li> <code>instance-state-name</code> - Filter on the intended state of the instance, e.g., running. </li>
 * <li> <code>instance-state-code</code> - Filter on the intended state code of the instance, e.g., 16. </li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeInstanceStatus(DescribeInstanceStatusRequest)
 */
public class DescribeInstanceStatusRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeInstanceStatusRequest> {

    /**
     * The list of instance IDs. If not specified, all instances are
     * described.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIds;

    /**
     * The list of filters to limit returned results.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * A string specifying the next paginated set of results to return.
     */
    private String nextToken;

    /**
     * The maximum number of paginated instance items per response.
     */
    private Integer maxResults;

    private Boolean includeAllInstances;

    /**
     * The list of instance IDs. If not specified, all instances are
     * described.
     *
     * @return The list of instance IDs. If not specified, all instances are
     *         described.
     */
    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
              instanceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceIds.setAutoConstruct(true);
        }
        return instanceIds;
    }
    
    /**
     * The list of instance IDs. If not specified, all instances are
     * described.
     *
     * @param instanceIds The list of instance IDs. If not specified, all instances are
     *         described.
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceIds.size());
        instanceIdsCopy.addAll(instanceIds);
        this.instanceIds = instanceIdsCopy;
    }
    
    /**
     * The list of instance IDs. If not specified, all instances are
     * described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds The list of instance IDs. If not specified, all instances are
     *         described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstanceStatusRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * The list of instance IDs. If not specified, all instances are
     * described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds The list of instance IDs. If not specified, all instances are
     *         described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstanceStatusRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceIds.size());
            instanceIdsCopy.addAll(instanceIds);
            this.instanceIds = instanceIdsCopy;
        }

        return this;
    }

    /**
     * The list of filters to limit returned results.
     *
     * @return The list of filters to limit returned results.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * The list of filters to limit returned results.
     *
     * @param filters The list of filters to limit returned results.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * The list of filters to limit returned results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The list of filters to limit returned results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstanceStatusRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * The list of filters to limit returned results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The list of filters to limit returned results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstanceStatusRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * A string specifying the next paginated set of results to return.
     *
     * @return A string specifying the next paginated set of results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string specifying the next paginated set of results to return.
     *
     * @param nextToken A string specifying the next paginated set of results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string specifying the next paginated set of results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A string specifying the next paginated set of results to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstanceStatusRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of paginated instance items per response.
     *
     * @return The maximum number of paginated instance items per response.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of paginated instance items per response.
     *
     * @param maxResults The maximum number of paginated instance items per response.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of paginated instance items per response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of paginated instance items per response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstanceStatusRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Returns the value of the IncludeAllInstances property for this object.
     *
     * @return The value of the IncludeAllInstances property for this object.
     */
    public Boolean isIncludeAllInstances() {
        return includeAllInstances;
    }
    
    /**
     * Sets the value of the IncludeAllInstances property for this object.
     *
     * @param includeAllInstances The new value for the IncludeAllInstances property for this object.
     */
    public void setIncludeAllInstances(Boolean includeAllInstances) {
        this.includeAllInstances = includeAllInstances;
    }
    
    /**
     * Sets the value of the IncludeAllInstances property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param includeAllInstances The new value for the IncludeAllInstances property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstanceStatusRequest withIncludeAllInstances(Boolean includeAllInstances) {
        this.includeAllInstances = includeAllInstances;
        return this;
    }

    /**
     * Returns the value of the IncludeAllInstances property for this object.
     *
     * @return The value of the IncludeAllInstances property for this object.
     */
    public Boolean getIncludeAllInstances() {
        return includeAllInstances;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeInstanceStatusRequest> getDryRunRequest() {
        Request<DescribeInstanceStatusRequest> request = new DescribeInstanceStatusRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getInstanceIds() != null) sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (isIncludeAllInstances() != null) sb.append("IncludeAllInstances: " + isIncludeAllInstances() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((isIncludeAllInstances() == null) ? 0 : isIncludeAllInstances().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeInstanceStatusRequest == false) return false;
        DescribeInstanceStatusRequest other = (DescribeInstanceStatusRequest)obj;
        
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null) return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.isIncludeAllInstances() == null ^ this.isIncludeAllInstances() == null) return false;
        if (other.isIncludeAllInstances() != null && other.isIncludeAllInstances().equals(this.isIncludeAllInstances()) == false) return false; 
        return true;
    }
    
}
    