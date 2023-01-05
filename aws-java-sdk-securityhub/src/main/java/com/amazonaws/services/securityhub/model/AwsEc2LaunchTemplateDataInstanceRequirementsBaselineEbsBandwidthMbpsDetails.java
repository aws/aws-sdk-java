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
 * The minimum and maximum baseline bandwidth to Amazon Elastic Block Store (Amazon EBS), in Mbps. For more information,
 * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS–optimized instances
 * </a> in the <i>Amazon EC2 User Guide</i>.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum baseline bandwidth, in Mbps. If this parameter is omitted, there's no maximum limit.
     * </p>
     */
    private Integer max;
    /**
     * <p>
     * The minimum baseline bandwidth, in Mbps. If this parameter is omitted, there's no minimum limit.
     * </p>
     */
    private Integer min;

    /**
     * <p>
     * The maximum baseline bandwidth, in Mbps. If this parameter is omitted, there's no maximum limit.
     * </p>
     * 
     * @param max
     *        The maximum baseline bandwidth, in Mbps. If this parameter is omitted, there's no maximum limit.
     */

    public void setMax(Integer max) {
        this.max = max;
    }

    /**
     * <p>
     * The maximum baseline bandwidth, in Mbps. If this parameter is omitted, there's no maximum limit.
     * </p>
     * 
     * @return The maximum baseline bandwidth, in Mbps. If this parameter is omitted, there's no maximum limit.
     */

    public Integer getMax() {
        return this.max;
    }

    /**
     * <p>
     * The maximum baseline bandwidth, in Mbps. If this parameter is omitted, there's no maximum limit.
     * </p>
     * 
     * @param max
     *        The maximum baseline bandwidth, in Mbps. If this parameter is omitted, there's no maximum limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails withMax(Integer max) {
        setMax(max);
        return this;
    }

    /**
     * <p>
     * The minimum baseline bandwidth, in Mbps. If this parameter is omitted, there's no minimum limit.
     * </p>
     * 
     * @param min
     *        The minimum baseline bandwidth, in Mbps. If this parameter is omitted, there's no minimum limit.
     */

    public void setMin(Integer min) {
        this.min = min;
    }

    /**
     * <p>
     * The minimum baseline bandwidth, in Mbps. If this parameter is omitted, there's no minimum limit.
     * </p>
     * 
     * @return The minimum baseline bandwidth, in Mbps. If this parameter is omitted, there's no minimum limit.
     */

    public Integer getMin() {
        return this.min;
    }

    /**
     * <p>
     * The minimum baseline bandwidth, in Mbps. If this parameter is omitted, there's no minimum limit.
     * </p>
     * 
     * @param min
     *        The minimum baseline bandwidth, in Mbps. If this parameter is omitted, there's no minimum limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails withMin(Integer min) {
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

        if (obj instanceof AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails == false)
            return false;
        AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails other = (AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails) obj;
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
    public AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails clone() {
        try {
            return (AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetailsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
