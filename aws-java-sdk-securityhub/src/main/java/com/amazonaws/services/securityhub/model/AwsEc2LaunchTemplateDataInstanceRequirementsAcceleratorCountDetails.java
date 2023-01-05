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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on an Amazon
 * EC2 instance.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of accelerators. If this parameter isn't specified, there's no maximum limit. To exclude
     * accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     * </p>
     */
    private Integer max;
    /**
     * <p>
     * The minimum number of accelerators. If this parameter isn't specified, there's no minimum limit.
     * </p>
     */
    private Integer min;

    /**
     * <p>
     * The maximum number of accelerators. If this parameter isn't specified, there's no maximum limit. To exclude
     * accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     * </p>
     * 
     * @param max
     *        The maximum number of accelerators. If this parameter isn't specified, there's no maximum limit. To
     *        exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     */

    public void setMax(Integer max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum number of accelerators. If this parameter isn't specified, there's no maximum limit. To exclude
     * accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     * </p>
     * 
     * @return The maximum number of accelerators. If this parameter isn't specified, there's no maximum limit. To
     *         exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     */

    public Integer getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum number of accelerators. If this parameter isn't specified, there's no maximum limit. To exclude
     * accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     * </p>
     * 
     * @param max
     *        The maximum number of accelerators. If this parameter isn't specified, there's no maximum limit. To
     *        exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails withMax(Integer max) {
        setMax(max);
        return this;
    }

    /**
     * <p>
     * The minimum number of accelerators. If this parameter isn't specified, there's no minimum limit.
     * </p>
     * 
     * @param min
     *        The minimum number of accelerators. If this parameter isn't specified, there's no minimum limit.
     */

    public void setMin(Integer min) {
        this.min = min;
    }

    /**
     * <p>
     * The minimum number of accelerators. If this parameter isn't specified, there's no minimum limit.
     * </p>
     * 
     * @return The minimum number of accelerators. If this parameter isn't specified, there's no minimum limit.
     */

    public Integer getMin() {
        return this.min;
    }

    /**
     * <p>
     * The minimum number of accelerators. If this parameter isn't specified, there's no minimum limit.
     * </p>
     * 
     * @param min
     *        The minimum number of accelerators. If this parameter isn't specified, there's no minimum limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails withMin(Integer min) {
        setMin(min);
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
        if (getMax() != null)
            sb.append("Max: ").append(getMax()).append(",");
        if (getMin() != null)
            sb.append("Min: ").append(getMin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails == false)
            return false;
        AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails other = (AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails) obj;
        if (other.getMax() == null ^ this.getMax() == null)
            return false;
        if (other.getMax() != null && other.getMax().equals(this.getMax()) == false)
            return false;
        if (other.getMin() == null ^ this.getMin() == null)
            return false;
        if (other.getMin() != null && other.getMin().equals(this.getMin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMax() == null) ? 0 : getMax().hashCode());
        hashCode = prime * hashCode + ((getMin() == null) ? 0 : getMin().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails clone() {
        try {
            return (AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetailsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
