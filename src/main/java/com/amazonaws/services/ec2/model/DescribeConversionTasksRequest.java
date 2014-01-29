/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeConversionTasksRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeConversionTasks(DescribeConversionTasksRequest) DescribeConversionTasks operation}.
 * <p>
 * Describes one or more of your conversion tasks. For more information, see <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UploadingYourInstancesandVolumes.html"> Using the Command Line Tools to Import Your Virtual
 * Machine to Amazon EC2 </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeConversionTasks(DescribeConversionTasksRequest)
 */
public class DescribeConversionTasksRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeConversionTasksRequest> {

    /**
     * 
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more conversion task IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> conversionTaskIds;

    /**
     * 
     *
     * @return 
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * 
     *
     * @param filters 
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
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeConversionTasksRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeConversionTasksRequest withFilters(java.util.Collection<Filter> filters) {
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
     * One or more conversion task IDs.
     *
     * @return One or more conversion task IDs.
     */
    public java.util.List<String> getConversionTaskIds() {
        if (conversionTaskIds == null) {
              conversionTaskIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              conversionTaskIds.setAutoConstruct(true);
        }
        return conversionTaskIds;
    }
    
    /**
     * One or more conversion task IDs.
     *
     * @param conversionTaskIds One or more conversion task IDs.
     */
    public void setConversionTaskIds(java.util.Collection<String> conversionTaskIds) {
        if (conversionTaskIds == null) {
            this.conversionTaskIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> conversionTaskIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(conversionTaskIds.size());
        conversionTaskIdsCopy.addAll(conversionTaskIds);
        this.conversionTaskIds = conversionTaskIdsCopy;
    }
    
    /**
     * One or more conversion task IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param conversionTaskIds One or more conversion task IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeConversionTasksRequest withConversionTaskIds(String... conversionTaskIds) {
        if (getConversionTaskIds() == null) setConversionTaskIds(new java.util.ArrayList<String>(conversionTaskIds.length));
        for (String value : conversionTaskIds) {
            getConversionTaskIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more conversion task IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param conversionTaskIds One or more conversion task IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeConversionTasksRequest withConversionTaskIds(java.util.Collection<String> conversionTaskIds) {
        if (conversionTaskIds == null) {
            this.conversionTaskIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> conversionTaskIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(conversionTaskIds.size());
            conversionTaskIdsCopy.addAll(conversionTaskIds);
            this.conversionTaskIds = conversionTaskIdsCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeConversionTasksRequest> getDryRunRequest() {
        Request<DescribeConversionTasksRequest> request = new DescribeConversionTasksRequestMarshaller().marshall(this);
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
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getConversionTaskIds() != null) sb.append("ConversionTaskIds: " + getConversionTaskIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getConversionTaskIds() == null) ? 0 : getConversionTaskIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeConversionTasksRequest == false) return false;
        DescribeConversionTasksRequest other = (DescribeConversionTasksRequest)obj;
        
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getConversionTaskIds() == null ^ this.getConversionTaskIds() == null) return false;
        if (other.getConversionTaskIds() != null && other.getConversionTaskIds().equals(this.getConversionTaskIds()) == false) return false; 
        return true;
    }
    
}
    