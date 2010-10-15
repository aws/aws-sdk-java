/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSpotPriceHistory(DescribeSpotPriceHistoryRequest) DescribeSpotPriceHistory operation}.
 * <p>
 * Describes the Spot Price history.
 * </p>
 * <p>
 * Spot Instances are instances that Amazon EC2 starts on your behalf
 * when the maximum price that you specify exceeds the current Spot
 * Price. Amazon EC2 periodically sets the Spot Price based on available
 * Spot Instance capacity and current spot instance requests.
 * </p>
 * <p>
 * For conceptual information about Spot Instances, refer to the Amazon
 * Elastic Compute Cloud Developer Guide or Amazon Elastic Compute Cloud
 * User Guide .
 * 
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSpotPriceHistory(DescribeSpotPriceHistoryRequest)
 */
public class DescribeSpotPriceHistoryRequest extends AmazonWebServiceRequest {

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
    private java.util.List<String> instanceTypes;

    /**
     * The description of the AMI.
     */
    private java.util.List<String> productDescriptions;

    /**
     * A list of filters used to match properties for SpotPriceHistory. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

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
            instanceTypes = new java.util.ArrayList<String>();
        }
        return instanceTypes;
    }
    
    /**
     * Specifies the instance type to return.
     *
     * @param instanceTypes Specifies the instance type to return.
     */
    public void setInstanceTypes(java.util.Collection<String> instanceTypes) {
        java.util.List<String> instanceTypesCopy = new java.util.ArrayList<String>();
        if (instanceTypes != null) {
            instanceTypesCopy.addAll(instanceTypes);
        }
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
        java.util.List<String> instanceTypesCopy = new java.util.ArrayList<String>();
        if (instanceTypes != null) {
            instanceTypesCopy.addAll(instanceTypes);
        }
        this.instanceTypes = instanceTypesCopy;

        return this;
    }
    
    /**
     * The description of the AMI.
     *
     * @return The description of the AMI.
     */
    public java.util.List<String> getProductDescriptions() {
        if (productDescriptions == null) {
            productDescriptions = new java.util.ArrayList<String>();
        }
        return productDescriptions;
    }
    
    /**
     * The description of the AMI.
     *
     * @param productDescriptions The description of the AMI.
     */
    public void setProductDescriptions(java.util.Collection<String> productDescriptions) {
        java.util.List<String> productDescriptionsCopy = new java.util.ArrayList<String>();
        if (productDescriptions != null) {
            productDescriptionsCopy.addAll(productDescriptions);
        }
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
        java.util.List<String> productDescriptionsCopy = new java.util.ArrayList<String>();
        if (productDescriptions != null) {
            productDescriptionsCopy.addAll(productDescriptions);
        }
        this.productDescriptions = productDescriptionsCopy;

        return this;
    }
    
    /**
     * A list of filters used to match properties for SpotPriceHistory. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for SpotPriceHistory. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for SpotPriceHistory. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for SpotPriceHistory. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;
    }
    
    /**
     * A list of filters used to match properties for SpotPriceHistory. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for SpotPriceHistory. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSpotPriceHistoryRequest withFilters(Filter... filters) {
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for SpotPriceHistory. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for SpotPriceHistory. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSpotPriceHistoryRequest withFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;

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
        sb.append("StartTime: " + startTime + ", ");
        sb.append("EndTime: " + endTime + ", ");
        sb.append("InstanceTypes: " + instanceTypes + ", ");
        sb.append("ProductDescriptions: " + productDescriptions + ", ");
        sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    