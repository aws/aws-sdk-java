/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The instance types offered.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceTypeOffering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceTypeOffering implements Serializable, Cloneable {

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The location type.
     * </p>
     */
    private String locationType;
    /**
     * <p>
     * The identifier for the location. This depends on the location type. For example, if the location type is
     * <code>region</code>, the location is the Region code (for example, <code>us-east-2</code>.)
     * </p>
     */
    private String location;

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The instance type. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public InstanceTypeOffering withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public InstanceTypeOffering withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The location type.
     * </p>
     * 
     * @param locationType
     *        The location type.
     * @see LocationType
     */

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /**
     * <p>
     * The location type.
     * </p>
     * 
     * @return The location type.
     * @see LocationType
     */

    public String getLocationType() {
        return this.locationType;
    }

    /**
     * <p>
     * The location type.
     * </p>
     * 
     * @param locationType
     *        The location type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationType
     */

    public InstanceTypeOffering withLocationType(String locationType) {
        setLocationType(locationType);
        return this;
    }

    /**
     * <p>
     * The location type.
     * </p>
     * 
     * @param locationType
     *        The location type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationType
     */

    public InstanceTypeOffering withLocationType(LocationType locationType) {
        this.locationType = locationType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier for the location. This depends on the location type. For example, if the location type is
     * <code>region</code>, the location is the Region code (for example, <code>us-east-2</code>.)
     * </p>
     * 
     * @param location
     *        The identifier for the location. This depends on the location type. For example, if the location type is
     *        <code>region</code>, the location is the Region code (for example, <code>us-east-2</code>.)
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The identifier for the location. This depends on the location type. For example, if the location type is
     * <code>region</code>, the location is the Region code (for example, <code>us-east-2</code>.)
     * </p>
     * 
     * @return The identifier for the location. This depends on the location type. For example, if the location type is
     *         <code>region</code>, the location is the Region code (for example, <code>us-east-2</code>.)
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The identifier for the location. This depends on the location type. For example, if the location type is
     * <code>region</code>, the location is the Region code (for example, <code>us-east-2</code>.)
     * </p>
     * 
     * @param location
     *        The identifier for the location. This depends on the location type. For example, if the location type is
     *        <code>region</code>, the location is the Region code (for example, <code>us-east-2</code>.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeOffering withLocation(String location) {
        setLocation(location);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getLocationType() != null)
            sb.append("LocationType: ").append(getLocationType()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceTypeOffering == false)
            return false;
        InstanceTypeOffering other = (InstanceTypeOffering) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getLocationType() == null ^ this.getLocationType() == null)
            return false;
        if (other.getLocationType() != null && other.getLocationType().equals(this.getLocationType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getLocationType() == null) ? 0 : getLocationType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public InstanceTypeOffering clone() {
        try {
            return (InstanceTypeOffering) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
