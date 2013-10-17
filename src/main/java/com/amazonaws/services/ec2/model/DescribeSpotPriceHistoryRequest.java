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
import com.amazonaws.services.ec2.model.transform.DescribeSpotPriceHistoryRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSpotPriceHistory(DescribeSpotPriceHistoryRequest) DescribeSpotPriceHistory operation}.
 * <p>
 * Describes the Spot Price history.
 * </p>
 * <p>
 * Spot Instances are instances that Amazon EC2 starts on your behalf when the maximum price that you specify exceeds the current Spot Price. Amazon EC2
 * periodically sets the Spot Price based on available Spot Instance capacity and current spot instance requests.
 * </p>
 * <p>
 * For conceptual information about Spot Instances, refer to the Amazon Elastic Compute Cloud Developer Guide or Amazon Elastic Compute Cloud User Guide
 * .
 * 
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSpotPriceHistory(DescribeSpotPriceHistoryRequest)
 */
public class DescribeSpotPriceHistoryRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeSpotPriceHistoryRequest> {

    /**
     * The start date and time of the Spot Instance price history data.
     */
    private java.util.Date startTime;

    /**
     * The end date and time of the Spot Instance price history data.
     */
    private java.util.Date endTime;

    /**
     * Specifies the instance type to return.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceTypes;

    /**
     * The description of the AMI.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> productDescriptions;

    /**
     * A list of filters used to match properties for SpotPriceHistory. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * Filters the results by availability zone (ex: 'us-east-1a').
     */
    private String availabilityZone;

    /**
     * Specifies the number of rows to return.
     */
    private Integer maxResults;

    /**
     * Specifies the next set of rows to return.
     */
    private String nextToken;

    /**
     * The start date and time of the Spot Instance price history data.
     *
     * @return The start date and time of the Spot Instance price history data.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The start date and time of the Spot Instance price history data.
     *
     * @param startTime The start date and time of the Spot Instance price history data.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The start date and time of the Spot Instance price history data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The start date and time of the Spot Instance price history data.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The end date and time of the Spot Instance price history data.
     *
     * @return The end date and time of the Spot Instance price history data.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * The end date and time of the Spot Instance price history data.
     *
     * @param endTime The end date and time of the Spot Instance price history data.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * The end date and time of the Spot Instance price history data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime The end date and time of the Spot Instance price history data.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Specifies the instance type to return.
     *
     * @return Specifies the instance type to return.
     */
    public java.util.List<String> getInstanceTypes() {
        if (instanceTypes == null) {
              instanceTypes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceTypes.setAutoConstruct(true);
        }
        return instanceTypes;
    }
    
    /**
     * Specifies the instance type to return.
     *
     * @param instanceTypes Specifies the instance type to return.
     */
    public void setInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceTypes.size());
        instanceTypesCopy.addAll(instanceTypes);
        this.instanceTypes = instanceTypesCopy;
    }
    
    /**
     * Specifies the instance type to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceTypes Specifies the instance type to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withInstanceTypes(String... instanceTypes) {
        if (getInstanceTypes() == null) setInstanceTypes(new java.util.ArrayList<String>(instanceTypes.length));
        for (String value : instanceTypes) {
            getInstanceTypes().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the instance type to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceTypes Specifies the instance type to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceTypes.size());
            instanceTypesCopy.addAll(instanceTypes);
            this.instanceTypes = instanceTypesCopy;
        }

        return this;
    }

    /**
     * Specifies the instance type to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceTypes Specifies the instance type to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withInstanceTypes(InstanceType... instanceTypes) {
        java.util.ArrayList<String> instanceTypesCopy = new java.util.ArrayList<String>(instanceTypes.length);
        for (InstanceType member : instanceTypes) {
            instanceTypesCopy.add(member.toString());
        }
        if (getInstanceTypes() == null) {
            setInstanceTypes(instanceTypesCopy);
        } else {
            getInstanceTypes().addAll(instanceTypesCopy);
        }
        return this;
    }

    /**
     * The description of the AMI.
     *
     * @return The description of the AMI.
     */
    public java.util.List<String> getProductDescriptions() {
        if (productDescriptions == null) {
              productDescriptions = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              productDescriptions.setAutoConstruct(true);
        }
        return productDescriptions;
    }
    
    /**
     * The description of the AMI.
     *
     * @param productDescriptions The description of the AMI.
     */
    public void setProductDescriptions(java.util.Collection<String> productDescriptions) {
        if (productDescriptions == null) {
            this.productDescriptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> productDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(productDescriptions.size());
        productDescriptionsCopy.addAll(productDescriptions);
        this.productDescriptions = productDescriptionsCopy;
    }
    
    /**
     * The description of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescriptions The description of the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withProductDescriptions(String... productDescriptions) {
        if (getProductDescriptions() == null) setProductDescriptions(new java.util.ArrayList<String>(productDescriptions.length));
        for (String value : productDescriptions) {
            getProductDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * The description of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescriptions The description of the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withProductDescriptions(java.util.Collection<String> productDescriptions) {
        if (productDescriptions == null) {
            this.productDescriptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> productDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(productDescriptions.size());
            productDescriptionsCopy.addAll(productDescriptions);
            this.productDescriptions = productDescriptionsCopy;
        }

        return this;
    }

    /**
     * A list of filters used to match properties for SpotPriceHistory. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for SpotPriceHistory. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for SpotPriceHistory. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for SpotPriceHistory. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
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
     * A list of filters used to match properties for SpotPriceHistory. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for SpotPriceHistory. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for SpotPriceHistory. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for SpotPriceHistory. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withFilters(java.util.Collection<Filter> filters) {
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
     * Filters the results by availability zone (ex: 'us-east-1a').
     *
     * @return Filters the results by availability zone (ex: 'us-east-1a').
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * Filters the results by availability zone (ex: 'us-east-1a').
     *
     * @param availabilityZone Filters the results by availability zone (ex: 'us-east-1a').
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * Filters the results by availability zone (ex: 'us-east-1a').
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone Filters the results by availability zone (ex: 'us-east-1a').
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Specifies the number of rows to return.
     *
     * @return Specifies the number of rows to return.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * Specifies the number of rows to return.
     *
     * @param maxResults Specifies the number of rows to return.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * Specifies the number of rows to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults Specifies the number of rows to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Specifies the next set of rows to return.
     *
     * @return Specifies the next set of rows to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Specifies the next set of rows to return.
     *
     * @param nextToken Specifies the next set of rows to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Specifies the next set of rows to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken Specifies the next set of rows to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotPriceHistoryRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeSpotPriceHistoryRequest> getDryRunRequest() {
        Request<DescribeSpotPriceHistoryRequest> request = new DescribeSpotPriceHistoryRequestMarshaller().marshall(this);
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
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getInstanceTypes() != null) sb.append("InstanceTypes: " + getInstanceTypes() + ",");
        if (getProductDescriptions() != null) sb.append("ProductDescriptions: " + getProductDescriptions() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode()); 
        hashCode = prime * hashCode + ((getProductDescriptions() == null) ? 0 : getProductDescriptions().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSpotPriceHistoryRequest == false) return false;
        DescribeSpotPriceHistoryRequest other = (DescribeSpotPriceHistoryRequest)obj;
        
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null) return false;
        if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false) return false; 
        if (other.getProductDescriptions() == null ^ this.getProductDescriptions() == null) return false;
        if (other.getProductDescriptions() != null && other.getProductDescriptions().equals(this.getProductDescriptions()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    