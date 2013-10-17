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
import com.amazonaws.services.ec2.model.transform.RequestSpotInstancesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#requestSpotInstances(RequestSpotInstancesRequest) RequestSpotInstances operation}.
 * <p>
 * Creates a Spot Instance request.
 * </p>
 * <p>
 * Spot Instances are instances that Amazon EC2 starts on your behalf when the maximum price that you specify exceeds the current Spot Price. Amazon EC2
 * periodically sets the Spot Price based on available Spot Instance capacity and current spot instance requests.
 * </p>
 * <p>
 * For conceptual information about Spot Instances, refer to the Amazon Elastic Compute Cloud Developer Guide or Amazon Elastic Compute Cloud User
 * Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#requestSpotInstances(RequestSpotInstancesRequest)
 */
public class RequestSpotInstancesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<RequestSpotInstancesRequest> {

    /**
     * Specifies the maximum hourly price for any Spot Instance launched to
     * fulfill the request.
     */
    private String spotPrice;

    /**
     * Specifies the maximum number of Spot Instances to launch.
     */
    private Integer instanceCount;

    /**
     * Specifies the Spot Instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     */
    private String type;

    /**
     * Defines the start date of the request. <p> If this is a one-time
     * request, the request becomes active at this date and time and remains
     * active until all instances launch, the request expires, or the request
     * is canceled. If the request is persistent, the request becomes active
     * at this date and time and remains active until it expires or is
     * canceled.
     */
    private java.util.Date validFrom;

    /**
     * End date of the request. <p> If this is a one-time request, the
     * request remains active until all instances launch, the request is
     * canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date and time is reached.
     */
    private java.util.Date validUntil;

    /**
     * Specifies the instance launch group. Launch groups are Spot Instances
     * that launch and terminate together.
     */
    private String launchGroup;

    /**
     * Specifies the Availability Zone group. <p> When specifying the same
     * Availability Zone group for all Spot Instance requests, all Spot
     * Instances are launched in the same Availability Zone.
     */
    private String availabilityZoneGroup;

    /**
     * Specifies additional launch instance information.
     */
    private LaunchSpecification launchSpecification;

    /**
     * Default constructor for a new RequestSpotInstancesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RequestSpotInstancesRequest() {}
    
    /**
     * Constructs a new RequestSpotInstancesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param spotPrice Specifies the maximum hourly price for any Spot
     * Instance launched to fulfill the request.
     */
    public RequestSpotInstancesRequest(String spotPrice) {
        setSpotPrice(spotPrice);
    }

    /**
     * Specifies the maximum hourly price for any Spot Instance launched to
     * fulfill the request.
     *
     * @return Specifies the maximum hourly price for any Spot Instance launched to
     *         fulfill the request.
     */
    public String getSpotPrice() {
        return spotPrice;
    }
    
    /**
     * Specifies the maximum hourly price for any Spot Instance launched to
     * fulfill the request.
     *
     * @param spotPrice Specifies the maximum hourly price for any Spot Instance launched to
     *         fulfill the request.
     */
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }
    
    /**
     * Specifies the maximum hourly price for any Spot Instance launched to
     * fulfill the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotPrice Specifies the maximum hourly price for any Spot Instance launched to
     *         fulfill the request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestSpotInstancesRequest withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * Specifies the maximum number of Spot Instances to launch.
     *
     * @return Specifies the maximum number of Spot Instances to launch.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * Specifies the maximum number of Spot Instances to launch.
     *
     * @param instanceCount Specifies the maximum number of Spot Instances to launch.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * Specifies the maximum number of Spot Instances to launch.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount Specifies the maximum number of Spot Instances to launch.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestSpotInstancesRequest withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Specifies the Spot Instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @return Specifies the Spot Instance type.
     *
     * @see SpotInstanceType
     */
    public String getType() {
        return type;
    }
    
    /**
     * Specifies the Spot Instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type Specifies the Spot Instance type.
     *
     * @see SpotInstanceType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Specifies the Spot Instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type Specifies the Spot Instance type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SpotInstanceType
     */
    public RequestSpotInstancesRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Specifies the Spot Instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type Specifies the Spot Instance type.
     *
     * @see SpotInstanceType
     */
    public void setType(SpotInstanceType type) {
        this.type = type.toString();
    }
    
    /**
     * Specifies the Spot Instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type Specifies the Spot Instance type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SpotInstanceType
     */
    public RequestSpotInstancesRequest withType(SpotInstanceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * Defines the start date of the request. <p> If this is a one-time
     * request, the request becomes active at this date and time and remains
     * active until all instances launch, the request expires, or the request
     * is canceled. If the request is persistent, the request becomes active
     * at this date and time and remains active until it expires or is
     * canceled.
     *
     * @return Defines the start date of the request. <p> If this is a one-time
     *         request, the request becomes active at this date and time and remains
     *         active until all instances launch, the request expires, or the request
     *         is canceled. If the request is persistent, the request becomes active
     *         at this date and time and remains active until it expires or is
     *         canceled.
     */
    public java.util.Date getValidFrom() {
        return validFrom;
    }
    
    /**
     * Defines the start date of the request. <p> If this is a one-time
     * request, the request becomes active at this date and time and remains
     * active until all instances launch, the request expires, or the request
     * is canceled. If the request is persistent, the request becomes active
     * at this date and time and remains active until it expires or is
     * canceled.
     *
     * @param validFrom Defines the start date of the request. <p> If this is a one-time
     *         request, the request becomes active at this date and time and remains
     *         active until all instances launch, the request expires, or the request
     *         is canceled. If the request is persistent, the request becomes active
     *         at this date and time and remains active until it expires or is
     *         canceled.
     */
    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }
    
    /**
     * Defines the start date of the request. <p> If this is a one-time
     * request, the request becomes active at this date and time and remains
     * active until all instances launch, the request expires, or the request
     * is canceled. If the request is persistent, the request becomes active
     * at this date and time and remains active until it expires or is
     * canceled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validFrom Defines the start date of the request. <p> If this is a one-time
     *         request, the request becomes active at this date and time and remains
     *         active until all instances launch, the request expires, or the request
     *         is canceled. If the request is persistent, the request becomes active
     *         at this date and time and remains active until it expires or is
     *         canceled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestSpotInstancesRequest withValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * End date of the request. <p> If this is a one-time request, the
     * request remains active until all instances launch, the request is
     * canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date and time is reached.
     *
     * @return End date of the request. <p> If this is a one-time request, the
     *         request remains active until all instances launch, the request is
     *         canceled, or this date is reached. If the request is persistent, it
     *         remains active until it is canceled or this date and time is reached.
     */
    public java.util.Date getValidUntil() {
        return validUntil;
    }
    
    /**
     * End date of the request. <p> If this is a one-time request, the
     * request remains active until all instances launch, the request is
     * canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date and time is reached.
     *
     * @param validUntil End date of the request. <p> If this is a one-time request, the
     *         request remains active until all instances launch, the request is
     *         canceled, or this date is reached. If the request is persistent, it
     *         remains active until it is canceled or this date and time is reached.
     */
    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }
    
    /**
     * End date of the request. <p> If this is a one-time request, the
     * request remains active until all instances launch, the request is
     * canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date and time is reached.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validUntil End date of the request. <p> If this is a one-time request, the
     *         request remains active until all instances launch, the request is
     *         canceled, or this date is reached. If the request is persistent, it
     *         remains active until it is canceled or this date and time is reached.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestSpotInstancesRequest withValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * Specifies the instance launch group. Launch groups are Spot Instances
     * that launch and terminate together.
     *
     * @return Specifies the instance launch group. Launch groups are Spot Instances
     *         that launch and terminate together.
     */
    public String getLaunchGroup() {
        return launchGroup;
    }
    
    /**
     * Specifies the instance launch group. Launch groups are Spot Instances
     * that launch and terminate together.
     *
     * @param launchGroup Specifies the instance launch group. Launch groups are Spot Instances
     *         that launch and terminate together.
     */
    public void setLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
    }
    
    /**
     * Specifies the instance launch group. Launch groups are Spot Instances
     * that launch and terminate together.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchGroup Specifies the instance launch group. Launch groups are Spot Instances
     *         that launch and terminate together.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestSpotInstancesRequest withLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
        return this;
    }

    /**
     * Specifies the Availability Zone group. <p> When specifying the same
     * Availability Zone group for all Spot Instance requests, all Spot
     * Instances are launched in the same Availability Zone.
     *
     * @return Specifies the Availability Zone group. <p> When specifying the same
     *         Availability Zone group for all Spot Instance requests, all Spot
     *         Instances are launched in the same Availability Zone.
     */
    public String getAvailabilityZoneGroup() {
        return availabilityZoneGroup;
    }
    
    /**
     * Specifies the Availability Zone group. <p> When specifying the same
     * Availability Zone group for all Spot Instance requests, all Spot
     * Instances are launched in the same Availability Zone.
     *
     * @param availabilityZoneGroup Specifies the Availability Zone group. <p> When specifying the same
     *         Availability Zone group for all Spot Instance requests, all Spot
     *         Instances are launched in the same Availability Zone.
     */
    public void setAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
    }
    
    /**
     * Specifies the Availability Zone group. <p> When specifying the same
     * Availability Zone group for all Spot Instance requests, all Spot
     * Instances are launched in the same Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZoneGroup Specifies the Availability Zone group. <p> When specifying the same
     *         Availability Zone group for all Spot Instance requests, all Spot
     *         Instances are launched in the same Availability Zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestSpotInstancesRequest withAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
        return this;
    }

    /**
     * Specifies additional launch instance information.
     *
     * @return Specifies additional launch instance information.
     */
    public LaunchSpecification getLaunchSpecification() {
        return launchSpecification;
    }
    
    /**
     * Specifies additional launch instance information.
     *
     * @param launchSpecification Specifies additional launch instance information.
     */
    public void setLaunchSpecification(LaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }
    
    /**
     * Specifies additional launch instance information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchSpecification Specifies additional launch instance information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestSpotInstancesRequest withLaunchSpecification(LaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<RequestSpotInstancesRequest> getDryRunRequest() {
        Request<RequestSpotInstancesRequest> request = new RequestSpotInstancesRequestMarshaller().marshall(this);
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
        if (getSpotPrice() != null) sb.append("SpotPrice: " + getSpotPrice() + ",");
        if (getInstanceCount() != null) sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getValidFrom() != null) sb.append("ValidFrom: " + getValidFrom() + ",");
        if (getValidUntil() != null) sb.append("ValidUntil: " + getValidUntil() + ",");
        if (getLaunchGroup() != null) sb.append("LaunchGroup: " + getLaunchGroup() + ",");
        if (getAvailabilityZoneGroup() != null) sb.append("AvailabilityZoneGroup: " + getAvailabilityZoneGroup() + ",");
        if (getLaunchSpecification() != null) sb.append("LaunchSpecification: " + getLaunchSpecification() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode()); 
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchGroup() == null) ? 0 : getLaunchGroup().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZoneGroup() == null) ? 0 : getAvailabilityZoneGroup().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchSpecification() == null) ? 0 : getLaunchSpecification().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RequestSpotInstancesRequest == false) return false;
        RequestSpotInstancesRequest other = (RequestSpotInstancesRequest)obj;
        
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null) return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false) return false; 
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null) return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getValidFrom() == null ^ this.getValidFrom() == null) return false;
        if (other.getValidFrom() != null && other.getValidFrom().equals(this.getValidFrom()) == false) return false; 
        if (other.getValidUntil() == null ^ this.getValidUntil() == null) return false;
        if (other.getValidUntil() != null && other.getValidUntil().equals(this.getValidUntil()) == false) return false; 
        if (other.getLaunchGroup() == null ^ this.getLaunchGroup() == null) return false;
        if (other.getLaunchGroup() != null && other.getLaunchGroup().equals(this.getLaunchGroup()) == false) return false; 
        if (other.getAvailabilityZoneGroup() == null ^ this.getAvailabilityZoneGroup() == null) return false;
        if (other.getAvailabilityZoneGroup() != null && other.getAvailabilityZoneGroup().equals(this.getAvailabilityZoneGroup()) == false) return false; 
        if (other.getLaunchSpecification() == null ^ this.getLaunchSpecification() == null) return false;
        if (other.getLaunchSpecification() != null && other.getLaunchSpecification().equals(this.getLaunchSpecification()) == false) return false; 
        return true;
    }
    
}
    