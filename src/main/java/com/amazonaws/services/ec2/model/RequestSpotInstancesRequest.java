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
import com.amazonaws.services.ec2.model.transform.RequestSpotInstancesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#requestSpotInstances(RequestSpotInstancesRequest) RequestSpotInstances operation}.
 * <p>
 * Creates a Spot Instance request. Spot Instances are instances that
 * Amazon EC2 starts on your behalf when the maximum price that you
 * specify exceeds the current Spot Price. Amazon EC2 periodically sets
 * the Spot Price based on available Spot Instance capacity and current
 * Spot Instance requests. For more information about Spot Instances, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#requestSpotInstances(RequestSpotInstancesRequest)
 */
public class RequestSpotInstancesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<RequestSpotInstancesRequest> {

    /**
     * The maximum hourly price for any Spot Instance launched to fulfill the
     * request.
     */
    private String spotPrice;

    /**
     * The maximum number of Spot Instances to launch. <p>Default: 1
     */
    private Integer instanceCount;

    /**
     * The Spot Instance request type. <p>Default: <code>one-time</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     */
    private String type;

    /**
     * The start date of the request. If this is a one-time request, the
     * request becomes active at this date and time and remains active until
     * all instances launch, the request expires, or the request is canceled.
     * If the request is persistent, the request becomes active at this date
     * and time and remains active until it expires or is canceled.
     * <p>Default: The request is effective indefinitely.
     */
    private java.util.Date validFrom;

    /**
     * The end date of the request. If this is a one-time request, the
     * request remains active until all instances launch, the request is
     * canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date and time is reached.
     * <p>Default: The request is effective indefinitely.
     */
    private java.util.Date validUntil;

    /**
     * The instance launch group. Launch groups are Spot Instances that
     * launch together and terminate together. <p>Default: Instances are
     * launched and terminated individually
     */
    private String launchGroup;

    /**
     * The user-specified name for a logical grouping of bids. <p>When you
     * specify an Availability Zone group in a Spot Instance request, all
     * Spot Instances in the request are launched in the same Availability
     * Zone. Instance proximity is maintained with this parameter, but the
     * choice of Availability Zone is not. The group applies only to bids for
     * Spot Instances of the same instance type. Any additional Spot Instance
     * requests that are specified with the same Availability Zone group name
     * are launched in that same Availability Zone, as long as at least one
     * instance from the group is still active. <p>If there is no active
     * instance running in the Availability Zone group that you specify for a
     * new Spot Instance request (all instances are terminated, the bid is
     * expired, or the bid falls below current market), then Amazon EC2
     * launches the instance in any Availability Zone where the constraint
     * can be met. Consequently, the subsequent set of Spot Instances could
     * be placed in a different zone from the original request, even if you
     * specified the same Availability Zone group. <p>Default: Instances are
     * launched in any available Availability Zone.
     */
    private String availabilityZoneGroup;

    /**
     * The launch specification.
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
     * @param spotPrice The maximum hourly price for any Spot Instance
     * launched to fulfill the request.
     */
    public RequestSpotInstancesRequest(String spotPrice) {
        setSpotPrice(spotPrice);
    }

    /**
     * The maximum hourly price for any Spot Instance launched to fulfill the
     * request.
     *
     * @return The maximum hourly price for any Spot Instance launched to fulfill the
     *         request.
     */
    public String getSpotPrice() {
        return spotPrice;
    }
    
    /**
     * The maximum hourly price for any Spot Instance launched to fulfill the
     * request.
     *
     * @param spotPrice The maximum hourly price for any Spot Instance launched to fulfill the
     *         request.
     */
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }
    
    /**
     * The maximum hourly price for any Spot Instance launched to fulfill the
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotPrice The maximum hourly price for any Spot Instance launched to fulfill the
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestSpotInstancesRequest withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * The maximum number of Spot Instances to launch. <p>Default: 1
     *
     * @return The maximum number of Spot Instances to launch. <p>Default: 1
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * The maximum number of Spot Instances to launch. <p>Default: 1
     *
     * @param instanceCount The maximum number of Spot Instances to launch. <p>Default: 1
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * The maximum number of Spot Instances to launch. <p>Default: 1
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The maximum number of Spot Instances to launch. <p>Default: 1
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestSpotInstancesRequest withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * The Spot Instance request type. <p>Default: <code>one-time</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @return The Spot Instance request type. <p>Default: <code>one-time</code>
     *
     * @see SpotInstanceType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The Spot Instance request type. <p>Default: <code>one-time</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type The Spot Instance request type. <p>Default: <code>one-time</code>
     *
     * @see SpotInstanceType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The Spot Instance request type. <p>Default: <code>one-time</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type The Spot Instance request type. <p>Default: <code>one-time</code>
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
     * The Spot Instance request type. <p>Default: <code>one-time</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type The Spot Instance request type. <p>Default: <code>one-time</code>
     *
     * @see SpotInstanceType
     */
    public void setType(SpotInstanceType type) {
        this.type = type.toString();
    }
    
    /**
     * The Spot Instance request type. <p>Default: <code>one-time</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type The Spot Instance request type. <p>Default: <code>one-time</code>
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
     * The start date of the request. If this is a one-time request, the
     * request becomes active at this date and time and remains active until
     * all instances launch, the request expires, or the request is canceled.
     * If the request is persistent, the request becomes active at this date
     * and time and remains active until it expires or is canceled.
     * <p>Default: The request is effective indefinitely.
     *
     * @return The start date of the request. If this is a one-time request, the
     *         request becomes active at this date and time and remains active until
     *         all instances launch, the request expires, or the request is canceled.
     *         If the request is persistent, the request becomes active at this date
     *         and time and remains active until it expires or is canceled.
     *         <p>Default: The request is effective indefinitely.
     */
    public java.util.Date getValidFrom() {
        return validFrom;
    }
    
    /**
     * The start date of the request. If this is a one-time request, the
     * request becomes active at this date and time and remains active until
     * all instances launch, the request expires, or the request is canceled.
     * If the request is persistent, the request becomes active at this date
     * and time and remains active until it expires or is canceled.
     * <p>Default: The request is effective indefinitely.
     *
     * @param validFrom The start date of the request. If this is a one-time request, the
     *         request becomes active at this date and time and remains active until
     *         all instances launch, the request expires, or the request is canceled.
     *         If the request is persistent, the request becomes active at this date
     *         and time and remains active until it expires or is canceled.
     *         <p>Default: The request is effective indefinitely.
     */
    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }
    
    /**
     * The start date of the request. If this is a one-time request, the
     * request becomes active at this date and time and remains active until
     * all instances launch, the request expires, or the request is canceled.
     * If the request is persistent, the request becomes active at this date
     * and time and remains active until it expires or is canceled.
     * <p>Default: The request is effective indefinitely.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validFrom The start date of the request. If this is a one-time request, the
     *         request becomes active at this date and time and remains active until
     *         all instances launch, the request expires, or the request is canceled.
     *         If the request is persistent, the request becomes active at this date
     *         and time and remains active until it expires or is canceled.
     *         <p>Default: The request is effective indefinitely.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestSpotInstancesRequest withValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * The end date of the request. If this is a one-time request, the
     * request remains active until all instances launch, the request is
     * canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date and time is reached.
     * <p>Default: The request is effective indefinitely.
     *
     * @return The end date of the request. If this is a one-time request, the
     *         request remains active until all instances launch, the request is
     *         canceled, or this date is reached. If the request is persistent, it
     *         remains active until it is canceled or this date and time is reached.
     *         <p>Default: The request is effective indefinitely.
     */
    public java.util.Date getValidUntil() {
        return validUntil;
    }
    
    /**
     * The end date of the request. If this is a one-time request, the
     * request remains active until all instances launch, the request is
     * canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date and time is reached.
     * <p>Default: The request is effective indefinitely.
     *
     * @param validUntil The end date of the request. If this is a one-time request, the
     *         request remains active until all instances launch, the request is
     *         canceled, or this date is reached. If the request is persistent, it
     *         remains active until it is canceled or this date and time is reached.
     *         <p>Default: The request is effective indefinitely.
     */
    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }
    
    /**
     * The end date of the request. If this is a one-time request, the
     * request remains active until all instances launch, the request is
     * canceled, or this date is reached. If the request is persistent, it
     * remains active until it is canceled or this date and time is reached.
     * <p>Default: The request is effective indefinitely.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validUntil The end date of the request. If this is a one-time request, the
     *         request remains active until all instances launch, the request is
     *         canceled, or this date is reached. If the request is persistent, it
     *         remains active until it is canceled or this date and time is reached.
     *         <p>Default: The request is effective indefinitely.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestSpotInstancesRequest withValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * The instance launch group. Launch groups are Spot Instances that
     * launch together and terminate together. <p>Default: Instances are
     * launched and terminated individually
     *
     * @return The instance launch group. Launch groups are Spot Instances that
     *         launch together and terminate together. <p>Default: Instances are
     *         launched and terminated individually
     */
    public String getLaunchGroup() {
        return launchGroup;
    }
    
    /**
     * The instance launch group. Launch groups are Spot Instances that
     * launch together and terminate together. <p>Default: Instances are
     * launched and terminated individually
     *
     * @param launchGroup The instance launch group. Launch groups are Spot Instances that
     *         launch together and terminate together. <p>Default: Instances are
     *         launched and terminated individually
     */
    public void setLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
    }
    
    /**
     * The instance launch group. Launch groups are Spot Instances that
     * launch together and terminate together. <p>Default: Instances are
     * launched and terminated individually
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchGroup The instance launch group. Launch groups are Spot Instances that
     *         launch together and terminate together. <p>Default: Instances are
     *         launched and terminated individually
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestSpotInstancesRequest withLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
        return this;
    }

    /**
     * The user-specified name for a logical grouping of bids. <p>When you
     * specify an Availability Zone group in a Spot Instance request, all
     * Spot Instances in the request are launched in the same Availability
     * Zone. Instance proximity is maintained with this parameter, but the
     * choice of Availability Zone is not. The group applies only to bids for
     * Spot Instances of the same instance type. Any additional Spot Instance
     * requests that are specified with the same Availability Zone group name
     * are launched in that same Availability Zone, as long as at least one
     * instance from the group is still active. <p>If there is no active
     * instance running in the Availability Zone group that you specify for a
     * new Spot Instance request (all instances are terminated, the bid is
     * expired, or the bid falls below current market), then Amazon EC2
     * launches the instance in any Availability Zone where the constraint
     * can be met. Consequently, the subsequent set of Spot Instances could
     * be placed in a different zone from the original request, even if you
     * specified the same Availability Zone group. <p>Default: Instances are
     * launched in any available Availability Zone.
     *
     * @return The user-specified name for a logical grouping of bids. <p>When you
     *         specify an Availability Zone group in a Spot Instance request, all
     *         Spot Instances in the request are launched in the same Availability
     *         Zone. Instance proximity is maintained with this parameter, but the
     *         choice of Availability Zone is not. The group applies only to bids for
     *         Spot Instances of the same instance type. Any additional Spot Instance
     *         requests that are specified with the same Availability Zone group name
     *         are launched in that same Availability Zone, as long as at least one
     *         instance from the group is still active. <p>If there is no active
     *         instance running in the Availability Zone group that you specify for a
     *         new Spot Instance request (all instances are terminated, the bid is
     *         expired, or the bid falls below current market), then Amazon EC2
     *         launches the instance in any Availability Zone where the constraint
     *         can be met. Consequently, the subsequent set of Spot Instances could
     *         be placed in a different zone from the original request, even if you
     *         specified the same Availability Zone group. <p>Default: Instances are
     *         launched in any available Availability Zone.
     */
    public String getAvailabilityZoneGroup() {
        return availabilityZoneGroup;
    }
    
    /**
     * The user-specified name for a logical grouping of bids. <p>When you
     * specify an Availability Zone group in a Spot Instance request, all
     * Spot Instances in the request are launched in the same Availability
     * Zone. Instance proximity is maintained with this parameter, but the
     * choice of Availability Zone is not. The group applies only to bids for
     * Spot Instances of the same instance type. Any additional Spot Instance
     * requests that are specified with the same Availability Zone group name
     * are launched in that same Availability Zone, as long as at least one
     * instance from the group is still active. <p>If there is no active
     * instance running in the Availability Zone group that you specify for a
     * new Spot Instance request (all instances are terminated, the bid is
     * expired, or the bid falls below current market), then Amazon EC2
     * launches the instance in any Availability Zone where the constraint
     * can be met. Consequently, the subsequent set of Spot Instances could
     * be placed in a different zone from the original request, even if you
     * specified the same Availability Zone group. <p>Default: Instances are
     * launched in any available Availability Zone.
     *
     * @param availabilityZoneGroup The user-specified name for a logical grouping of bids. <p>When you
     *         specify an Availability Zone group in a Spot Instance request, all
     *         Spot Instances in the request are launched in the same Availability
     *         Zone. Instance proximity is maintained with this parameter, but the
     *         choice of Availability Zone is not. The group applies only to bids for
     *         Spot Instances of the same instance type. Any additional Spot Instance
     *         requests that are specified with the same Availability Zone group name
     *         are launched in that same Availability Zone, as long as at least one
     *         instance from the group is still active. <p>If there is no active
     *         instance running in the Availability Zone group that you specify for a
     *         new Spot Instance request (all instances are terminated, the bid is
     *         expired, or the bid falls below current market), then Amazon EC2
     *         launches the instance in any Availability Zone where the constraint
     *         can be met. Consequently, the subsequent set of Spot Instances could
     *         be placed in a different zone from the original request, even if you
     *         specified the same Availability Zone group. <p>Default: Instances are
     *         launched in any available Availability Zone.
     */
    public void setAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
    }
    
    /**
     * The user-specified name for a logical grouping of bids. <p>When you
     * specify an Availability Zone group in a Spot Instance request, all
     * Spot Instances in the request are launched in the same Availability
     * Zone. Instance proximity is maintained with this parameter, but the
     * choice of Availability Zone is not. The group applies only to bids for
     * Spot Instances of the same instance type. Any additional Spot Instance
     * requests that are specified with the same Availability Zone group name
     * are launched in that same Availability Zone, as long as at least one
     * instance from the group is still active. <p>If there is no active
     * instance running in the Availability Zone group that you specify for a
     * new Spot Instance request (all instances are terminated, the bid is
     * expired, or the bid falls below current market), then Amazon EC2
     * launches the instance in any Availability Zone where the constraint
     * can be met. Consequently, the subsequent set of Spot Instances could
     * be placed in a different zone from the original request, even if you
     * specified the same Availability Zone group. <p>Default: Instances are
     * launched in any available Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZoneGroup The user-specified name for a logical grouping of bids. <p>When you
     *         specify an Availability Zone group in a Spot Instance request, all
     *         Spot Instances in the request are launched in the same Availability
     *         Zone. Instance proximity is maintained with this parameter, but the
     *         choice of Availability Zone is not. The group applies only to bids for
     *         Spot Instances of the same instance type. Any additional Spot Instance
     *         requests that are specified with the same Availability Zone group name
     *         are launched in that same Availability Zone, as long as at least one
     *         instance from the group is still active. <p>If there is no active
     *         instance running in the Availability Zone group that you specify for a
     *         new Spot Instance request (all instances are terminated, the bid is
     *         expired, or the bid falls below current market), then Amazon EC2
     *         launches the instance in any Availability Zone where the constraint
     *         can be met. Consequently, the subsequent set of Spot Instances could
     *         be placed in a different zone from the original request, even if you
     *         specified the same Availability Zone group. <p>Default: Instances are
     *         launched in any available Availability Zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RequestSpotInstancesRequest withAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
        return this;
    }

    /**
     * The launch specification.
     *
     * @return The launch specification.
     */
    public LaunchSpecification getLaunchSpecification() {
        return launchSpecification;
    }
    
    /**
     * The launch specification.
     *
     * @param launchSpecification The launch specification.
     */
    public void setLaunchSpecification(LaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }
    
    /**
     * The launch specification.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchSpecification The launch specification.
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
    