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
 * The auto scaling settings of a multi-Region table in the specified Amazon Web Services Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ReplicaAutoScalingSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaAutoScalingSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services Region.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The auto scaling settings for a multi-Region table in the specified Amazon Web Services Region.
     * </p>
     */
    private AutoScalingSpecification autoScalingSpecification;

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

    public ReplicaAutoScalingSpecification withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The auto scaling settings for a multi-Region table in the specified Amazon Web Services Region.
     * </p>
     * 
     * @param autoScalingSpecification
     *        The auto scaling settings for a multi-Region table in the specified Amazon Web Services Region.
     */

    public void setAutoScalingSpecification(AutoScalingSpecification autoScalingSpecification) {
        this.autoScalingSpecification = autoScalingSpecification;
    }

    /**
     * <p>
     * The auto scaling settings for a multi-Region table in the specified Amazon Web Services Region.
     * </p>
     * 
     * @return The auto scaling settings for a multi-Region table in the specified Amazon Web Services Region.
     */

    public AutoScalingSpecification getAutoScalingSpecification() {
        return this.autoScalingSpecification;
    }

    /**
     * <p>
     * The auto scaling settings for a multi-Region table in the specified Amazon Web Services Region.
     * </p>
     * 
     * @param autoScalingSpecification
     *        The auto scaling settings for a multi-Region table in the specified Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaAutoScalingSpecification withAutoScalingSpecification(AutoScalingSpecification autoScalingSpecification) {
        setAutoScalingSpecification(autoScalingSpecification);
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
        if (getAutoScalingSpecification() != null)
            sb.append("AutoScalingSpecification: ").append(getAutoScalingSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicaAutoScalingSpecification == false)
            return false;
        ReplicaAutoScalingSpecification other = (ReplicaAutoScalingSpecification) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAutoScalingSpecification() == null ^ this.getAutoScalingSpecification() == null)
            return false;
        if (other.getAutoScalingSpecification() != null && other.getAutoScalingSpecification().equals(this.getAutoScalingSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingSpecification() == null) ? 0 : getAutoScalingSpecification().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaAutoScalingSpecification clone() {
        try {
            return (ReplicaAutoScalingSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.keyspaces.model.transform.ReplicaAutoScalingSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
