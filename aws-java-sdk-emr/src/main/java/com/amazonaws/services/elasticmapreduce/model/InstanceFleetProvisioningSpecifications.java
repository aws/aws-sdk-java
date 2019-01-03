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
 * The launch specification for Spot instances in the fleet, which determines the defined duration and provisioning
 * timeout behavior.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/InstanceFleetProvisioningSpecifications"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceFleetProvisioningSpecifications implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The launch specification for Spot instances in the fleet, which determines the defined duration and provisioning
     * timeout behavior.
     * </p>
     */
    private SpotProvisioningSpecification spotSpecification;

    /**
     * <p>
     * The launch specification for Spot instances in the fleet, which determines the defined duration and provisioning
     * timeout behavior.
     * </p>
     * 
     * @param spotSpecification
     *        The launch specification for Spot instances in the fleet, which determines the defined duration and
     *        provisioning timeout behavior.
     */

    public void setSpotSpecification(SpotProvisioningSpecification spotSpecification) {
        this.spotSpecification = spotSpecification;
    }

    /**
     * <p>
     * The launch specification for Spot instances in the fleet, which determines the defined duration and provisioning
     * timeout behavior.
     * </p>
     * 
     * @return The launch specification for Spot instances in the fleet, which determines the defined duration and
     *         provisioning timeout behavior.
     */

    public SpotProvisioningSpecification getSpotSpecification() {
        return this.spotSpecification;
    }

    /**
     * <p>
     * The launch specification for Spot instances in the fleet, which determines the defined duration and provisioning
     * timeout behavior.
     * </p>
     * 
     * @param spotSpecification
     *        The launch specification for Spot instances in the fleet, which determines the defined duration and
     *        provisioning timeout behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetProvisioningSpecifications withSpotSpecification(SpotProvisioningSpecification spotSpecification) {
        setSpotSpecification(spotSpecification);
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
        if (getSpotSpecification() != null)
            sb.append("SpotSpecification: ").append(getSpotSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceFleetProvisioningSpecifications == false)
            return false;
        InstanceFleetProvisioningSpecifications other = (InstanceFleetProvisioningSpecifications) obj;
        if (other.getSpotSpecification() == null ^ this.getSpotSpecification() == null)
            return false;
        if (other.getSpotSpecification() != null && other.getSpotSpecification().equals(this.getSpotSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpotSpecification() == null) ? 0 : getSpotSpecification().hashCode());
        return hashCode;
    }

    @Override
    public InstanceFleetProvisioningSpecifications clone() {
        try {
            return (InstanceFleetProvisioningSpecifications) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceFleetProvisioningSpecificationsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
