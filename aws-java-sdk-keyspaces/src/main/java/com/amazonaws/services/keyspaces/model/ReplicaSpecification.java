/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Web Services Region specific settings of a multi-Region table.
 * </p>
 * <p>
 * For a multi-Region table, you can configure the table's read capacity differently per Amazon Web Services Region. You
 * can do this by configuring the following parameters.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>region</code>: The Region where these settings are applied. (Required)
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>readCapacityUnits</code>: The provisioned read capacity units. (Optional)
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>readCapacityAutoScaling</code>: The read capacity auto scaling settings for the table. (Optional)
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ReplicaSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The provisioned read capacity units for the multi-Region table in the specified Amazon Web Services Region.
     * </p>
     */
    private Long readCapacityUnits;
    /**
     * <p>
     * The read capacity auto scaling settings for the multi-Region table in the specified Amazon Web Services Region.
     * </p>
     */
    private AutoScalingSettings readCapacityAutoScaling;

    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     * 
     * @return The Amazon Web Services Region.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSpecification withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The provisioned read capacity units for the multi-Region table in the specified Amazon Web Services Region.
     * </p>
     * 
     * @param readCapacityUnits
     *        The provisioned read capacity units for the multi-Region table in the specified Amazon Web Services
     *        Region.
     */

    public void setReadCapacityUnits(Long readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
    }

    /**
     * <p>
     * The provisioned read capacity units for the multi-Region table in the specified Amazon Web Services Region.
     * </p>
     * 
     * @return The provisioned read capacity units for the multi-Region table in the specified Amazon Web Services
     *         Region.
     */

    public Long getReadCapacityUnits() {
        return this.readCapacityUnits;
    }

    /**
     * <p>
     * The provisioned read capacity units for the multi-Region table in the specified Amazon Web Services Region.
     * </p>
     * 
     * @param readCapacityUnits
     *        The provisioned read capacity units for the multi-Region table in the specified Amazon Web Services
     *        Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSpecification withReadCapacityUnits(Long readCapacityUnits) {
        setReadCapacityUnits(readCapacityUnits);
        return this;
    }

    /**
     * <p>
     * The read capacity auto scaling settings for the multi-Region table in the specified Amazon Web Services Region.
     * </p>
     * 
     * @param readCapacityAutoScaling
     *        The read capacity auto scaling settings for the multi-Region table in the specified Amazon Web Services
     *        Region.
     */

    public void setReadCapacityAutoScaling(AutoScalingSettings readCapacityAutoScaling) {
        this.readCapacityAutoScaling = readCapacityAutoScaling;
    }

    /**
     * <p>
     * The read capacity auto scaling settings for the multi-Region table in the specified Amazon Web Services Region.
     * </p>
     * 
     * @return The read capacity auto scaling settings for the multi-Region table in the specified Amazon Web Services
     *         Region.
     */

    public AutoScalingSettings getReadCapacityAutoScaling() {
        return this.readCapacityAutoScaling;
    }

    /**
     * <p>
     * The read capacity auto scaling settings for the multi-Region table in the specified Amazon Web Services Region.
     * </p>
     * 
     * @param readCapacityAutoScaling
     *        The read capacity auto scaling settings for the multi-Region table in the specified Amazon Web Services
     *        Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaSpecification withReadCapacityAutoScaling(AutoScalingSettings readCapacityAutoScaling) {
        setReadCapacityAutoScaling(readCapacityAutoScaling);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getReadCapacityUnits() != null)
            sb.append("ReadCapacityUnits: ").append(getReadCapacityUnits()).append(",");
        if (getReadCapacityAutoScaling() != null)
            sb.append("ReadCapacityAutoScaling: ").append(getReadCapacityAutoScaling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaSpecification == false)
            return false;
        ReplicaSpecification other = (ReplicaSpecification) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getReadCapacityUnits() == null ^ this.getReadCapacityUnits() == null)
            return false;
        if (other.getReadCapacityUnits() != null && other.getReadCapacityUnits().equals(this.getReadCapacityUnits()) == false)
            return false;
        if (other.getReadCapacityAutoScaling() == null ^ this.getReadCapacityAutoScaling() == null)
            return false;
        if (other.getReadCapacityAutoScaling() != null && other.getReadCapacityAutoScaling().equals(this.getReadCapacityAutoScaling()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getReadCapacityUnits() == null) ? 0 : getReadCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getReadCapacityAutoScaling() == null) ? 0 : getReadCapacityAutoScaling().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaSpecification clone() {
        try {
            return (ReplicaSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.keyspaces.model.transform.ReplicaSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
