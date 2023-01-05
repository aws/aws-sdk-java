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
package com.amazonaws.services.arczonalshift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex structure for a managed resource in an account.
 * </p>
 * <p>
 * A managed resource is a Network Load Balancer or Application Load Balancer that has been registered with Route 53 ARC
 * by Elastic Load Balancing. You can start a zonal shift in Route 53 ARC for a managed resource to temporarily move
 * traffic for the resource away from an Availability Zone in an AWS Region.
 * </p>
 * <note>
 * <p>
 * At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with
 * cross-zone load balancing turned off.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ManagedResourceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedResourceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the managed resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Availability Zones that a resource is deployed in.
     * </p>
     */
    private java.util.List<String> availabilityZones;
    /**
     * <p>
     * The name of the managed resource.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the managed resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the managed resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the managed resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the managed resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the managed resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the managed resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Availability Zones that a resource is deployed in.
     * </p>
     * 
     * @return The Availability Zones that a resource is deployed in.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones that a resource is deployed in.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones that a resource is deployed in.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zones that a resource is deployed in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones that a resource is deployed in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones that a resource is deployed in.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones that a resource is deployed in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The name of the managed resource.
     * </p>
     * 
     * @param name
     *        The name of the managed resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the managed resource.
     * </p>
     * 
     * @return The name of the managed resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the managed resource.
     * </p>
     * 
     * @param name
     *        The name of the managed resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedResourceSummary withName(String name) {
        setName(name);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedResourceSummary == false)
            return false;
        ManagedResourceSummary other = (ManagedResourceSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ManagedResourceSummary clone() {
        try {
            return (ManagedResourceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.arczonalshift.model.transform.ManagedResourceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
