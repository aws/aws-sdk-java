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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeElasticGpusRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeElasticGpusRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeElasticGpusRequest> {

    /**
     * <p>
     * One or more Elastic Graphics accelerator IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> elasticGpuIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the Elastic Graphics accelerator resides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-health</code> - The status of the Elastic Graphics accelerator (<code>OK</code> |
     * <code>IMPAIRED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-state</code> - The state of the Elastic Graphics accelerator (<code>ATTACHED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-type</code> - The type of Elastic Graphics accelerator; for example, <code>eg1.medium</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance to which the Elastic Graphics accelerator is associated.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 5 and 1000.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more Elastic Graphics accelerator IDs.
     * </p>
     * 
     * @return One or more Elastic Graphics accelerator IDs.
     */

    public java.util.List<String> getElasticGpuIds() {
        if (elasticGpuIds == null) {
            elasticGpuIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return elasticGpuIds;
    }

    /**
     * <p>
     * One or more Elastic Graphics accelerator IDs.
     * </p>
     * 
     * @param elasticGpuIds
     *        One or more Elastic Graphics accelerator IDs.
     */

    public void setElasticGpuIds(java.util.Collection<String> elasticGpuIds) {
        if (elasticGpuIds == null) {
            this.elasticGpuIds = null;
            return;
        }

        this.elasticGpuIds = new com.amazonaws.internal.SdkInternalList<String>(elasticGpuIds);
    }

    /**
     * <p>
     * One or more Elastic Graphics accelerator IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElasticGpuIds(java.util.Collection)} or {@link #withElasticGpuIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param elasticGpuIds
     *        One or more Elastic Graphics accelerator IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticGpusRequest withElasticGpuIds(String... elasticGpuIds) {
        if (this.elasticGpuIds == null) {
            setElasticGpuIds(new com.amazonaws.internal.SdkInternalList<String>(elasticGpuIds.length));
        }
        for (String ele : elasticGpuIds) {
            this.elasticGpuIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Elastic Graphics accelerator IDs.
     * </p>
     * 
     * @param elasticGpuIds
     *        One or more Elastic Graphics accelerator IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticGpusRequest withElasticGpuIds(java.util.Collection<String> elasticGpuIds) {
        setElasticGpuIds(elasticGpuIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the Elastic Graphics accelerator resides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-health</code> - The status of the Elastic Graphics accelerator (<code>OK</code> |
     * <code>IMPAIRED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-state</code> - The state of the Elastic Graphics accelerator (<code>ATTACHED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-type</code> - The type of Elastic Graphics accelerator; for example, <code>eg1.medium</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance to which the Elastic Graphics accelerator is associated.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone in which the Elastic Graphics accelerator resides.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>elastic-gpu-health</code> - The status of the Elastic Graphics accelerator (<code>OK</code> |
     *         <code>IMPAIRED</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>elastic-gpu-state</code> - The state of the Elastic Graphics accelerator (<code>ATTACHED</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>elastic-gpu-type</code> - The type of Elastic Graphics accelerator; for example,
     *         <code>eg1.medium</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-id</code> - The ID of the instance to which the Elastic Graphics accelerator is
     *         associated.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the Elastic Graphics accelerator resides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-health</code> - The status of the Elastic Graphics accelerator (<code>OK</code> |
     * <code>IMPAIRED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-state</code> - The state of the Elastic Graphics accelerator (<code>ATTACHED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-type</code> - The type of Elastic Graphics accelerator; for example, <code>eg1.medium</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance to which the Elastic Graphics accelerator is associated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone in which the Elastic Graphics accelerator resides.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elastic-gpu-health</code> - The status of the Elastic Graphics accelerator (<code>OK</code> |
     *        <code>IMPAIRED</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elastic-gpu-state</code> - The state of the Elastic Graphics accelerator (<code>ATTACHED</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elastic-gpu-type</code> - The type of Elastic Graphics accelerator; for example,
     *        <code>eg1.medium</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance to which the Elastic Graphics accelerator is associated.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the Elastic Graphics accelerator resides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-health</code> - The status of the Elastic Graphics accelerator (<code>OK</code> |
     * <code>IMPAIRED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-state</code> - The state of the Elastic Graphics accelerator (<code>ATTACHED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-type</code> - The type of Elastic Graphics accelerator; for example, <code>eg1.medium</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance to which the Elastic Graphics accelerator is associated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone in which the Elastic Graphics accelerator resides.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elastic-gpu-health</code> - The status of the Elastic Graphics accelerator (<code>OK</code> |
     *        <code>IMPAIRED</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elastic-gpu-state</code> - The state of the Elastic Graphics accelerator (<code>ATTACHED</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elastic-gpu-type</code> - The type of Elastic Graphics accelerator; for example,
     *        <code>eg1.medium</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance to which the Elastic Graphics accelerator is associated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticGpusRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the Elastic Graphics accelerator resides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-health</code> - The status of the Elastic Graphics accelerator (<code>OK</code> |
     * <code>IMPAIRED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-state</code> - The state of the Elastic Graphics accelerator (<code>ATTACHED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elastic-gpu-type</code> - The type of Elastic Graphics accelerator; for example, <code>eg1.medium</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance to which the Elastic Graphics accelerator is associated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone in which the Elastic Graphics accelerator resides.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elastic-gpu-health</code> - The status of the Elastic Graphics accelerator (<code>OK</code> |
     *        <code>IMPAIRED</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elastic-gpu-state</code> - The state of the Elastic Graphics accelerator (<code>ATTACHED</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elastic-gpu-type</code> - The type of Elastic Graphics accelerator; for example,
     *        <code>eg1.medium</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance to which the Elastic Graphics accelerator is associated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticGpusRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 5 and 1000.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>NextToken</code> value. This value can be between 5 and 1000.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 5 and 1000.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *         call with the returned <code>NextToken</code> value. This value can be between 5 and 1000.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. This value can be between 5 and 1000.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>NextToken</code> value. This value can be between 5 and 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticGpusRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @return The token to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticGpusRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeElasticGpusRequest> getDryRunRequest() {
        Request<DescribeElasticGpusRequest> request = new DescribeElasticGpusRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getElasticGpuIds() != null)
            sb.append("ElasticGpuIds: ").append(getElasticGpuIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribeElasticGpusRequest == false)
            return false;
        DescribeElasticGpusRequest other = (DescribeElasticGpusRequest) obj;
        if (other.getElasticGpuIds() == null ^ this.getElasticGpuIds() == null)
            return false;
        if (other.getElasticGpuIds() != null && other.getElasticGpuIds().equals(this.getElasticGpuIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getElasticGpuIds() == null) ? 0 : getElasticGpuIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeElasticGpusRequest clone() {
        return (DescribeElasticGpusRequest) super.clone();
    }
}
