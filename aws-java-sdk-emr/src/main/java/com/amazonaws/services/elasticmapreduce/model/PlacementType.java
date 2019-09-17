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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon EC2 Availability Zone configuration of the cluster (job flow).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/PlacementType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlacementType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the cluster. <code>AvailabilityZone</code> is used for uniform instance
     * groups, while <code>AvailabilityZones</code> (plural) is used for instance fleets.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * When multiple Availability Zones are specified, Amazon EMR evaluates them and launches instances in the optimal
     * Availability Zone. <code>AvailabilityZones</code> is used for instance fleets, while
     * <code>AvailabilityZone</code> (singular) is used for uniform instance groups.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     * versions.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;

    /**
     * Default constructor for PlacementType object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public PlacementType() {
    }

    /**
     * Constructs a new PlacementType object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param availabilityZone
     *        The Amazon EC2 Availability Zone for the cluster. <code>AvailabilityZone</code> is used for uniform
     *        instance groups, while <code>AvailabilityZones</code> (plural) is used for instance fleets.
     */
    public PlacementType(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the cluster. <code>AvailabilityZone</code> is used for uniform instance
     * groups, while <code>AvailabilityZones</code> (plural) is used for instance fleets.
     * </p>
     * 
     * @param availabilityZone
     *        The Amazon EC2 Availability Zone for the cluster. <code>AvailabilityZone</code> is used for uniform
     *        instance groups, while <code>AvailabilityZones</code> (plural) is used for instance fleets.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the cluster. <code>AvailabilityZone</code> is used for uniform instance
     * groups, while <code>AvailabilityZones</code> (plural) is used for instance fleets.
     * </p>
     * 
     * @return The Amazon EC2 Availability Zone for the cluster. <code>AvailabilityZone</code> is used for uniform
     *         instance groups, while <code>AvailabilityZones</code> (plural) is used for instance fleets.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the cluster. <code>AvailabilityZone</code> is used for uniform instance
     * groups, while <code>AvailabilityZones</code> (plural) is used for instance fleets.
     * </p>
     * 
     * @param availabilityZone
     *        The Amazon EC2 Availability Zone for the cluster. <code>AvailabilityZone</code> is used for uniform
     *        instance groups, while <code>AvailabilityZones</code> (plural) is used for instance fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementType withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * When multiple Availability Zones are specified, Amazon EMR evaluates them and launches instances in the optimal
     * Availability Zone. <code>AvailabilityZones</code> is used for instance fleets, while
     * <code>AvailabilityZone</code> (singular) is used for uniform instance groups.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     * versions.
     * </p>
     * </note>
     * 
     * @return When multiple Availability Zones are specified, Amazon EMR evaluates them and launches instances in the
     *         optimal Availability Zone. <code>AvailabilityZones</code> is used for instance fleets, while
     *         <code>AvailabilityZone</code> (singular) is used for uniform instance groups.</p> <note>
     *         <p>
     *         The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding
     *         5.0.x versions.
     *         </p>
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * When multiple Availability Zones are specified, Amazon EMR evaluates them and launches instances in the optimal
     * Availability Zone. <code>AvailabilityZones</code> is used for instance fleets, while
     * <code>AvailabilityZone</code> (singular) is used for uniform instance groups.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     * versions.
     * </p>
     * </note>
     * 
     * @param availabilityZones
     *        When multiple Availability Zones are specified, Amazon EMR evaluates them and launches instances in the
     *        optimal Availability Zone. <code>AvailabilityZones</code> is used for instance fleets, while
     *        <code>AvailabilityZone</code> (singular) is used for uniform instance groups.</p> <note>
     *        <p>
     *        The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     *        versions.
     *        </p>
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(availabilityZones);
    }

    /**
     * <p>
     * When multiple Availability Zones are specified, Amazon EMR evaluates them and launches instances in the optimal
     * Availability Zone. <code>AvailabilityZones</code> is used for instance fleets, while
     * <code>AvailabilityZone</code> (singular) is used for uniform instance groups.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     * versions.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        When multiple Availability Zones are specified, Amazon EMR evaluates them and launches instances in the
     *        optimal Availability Zone. <code>AvailabilityZones</code> is used for instance fleets, while
     *        <code>AvailabilityZone</code> (singular) is used for uniform instance groups.</p> <note>
     *        <p>
     *        The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     *        versions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementType withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * When multiple Availability Zones are specified, Amazon EMR evaluates them and launches instances in the optimal
     * Availability Zone. <code>AvailabilityZones</code> is used for instance fleets, while
     * <code>AvailabilityZone</code> (singular) is used for uniform instance groups.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     * versions.
     * </p>
     * </note>
     * 
     * @param availabilityZones
     *        When multiple Availability Zones are specified, Amazon EMR evaluates them and launches instances in the
     *        optimal Availability Zone. <code>AvailabilityZones</code> is used for instance fleets, while
     *        <code>AvailabilityZone</code> (singular) is used for uniform instance groups.</p> <note>
     *        <p>
     *        The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x
     *        versions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementType withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlacementType == false)
            return false;
        PlacementType other = (PlacementType) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public PlacementType clone() {
        try {
            return (PlacementType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.PlacementTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
