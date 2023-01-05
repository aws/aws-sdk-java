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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that displays information about one destination that CloudWatch RUM sends extended metrics to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/MetricDestinationSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDestinationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the destination is <code>CloudWatch</code> or <code>Evidently</code>.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * If the destination is <code>Evidently</code>, this specifies the ARN of the Evidently experiment that receives
     * the metrics.
     * </p>
     */
    private String destinationArn;
    /**
     * <p>
     * This field appears only when the destination is <code>Evidently</code>. It specifies the ARN of the IAM role that
     * is used to write to the Evidently experiment that receives the metrics.
     * </p>
     */
    private String iamRoleArn;

    /**
     * <p>
     * Specifies whether the destination is <code>CloudWatch</code> or <code>Evidently</code>.
     * </p>
     * 
     * @param destination
     *        Specifies whether the destination is <code>CloudWatch</code> or <code>Evidently</code>.
     * @see MetricDestination
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * Specifies whether the destination is <code>CloudWatch</code> or <code>Evidently</code>.
     * </p>
     * 
     * @return Specifies whether the destination is <code>CloudWatch</code> or <code>Evidently</code>.
     * @see MetricDestination
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * Specifies whether the destination is <code>CloudWatch</code> or <code>Evidently</code>.
     * </p>
     * 
     * @param destination
     *        Specifies whether the destination is <code>CloudWatch</code> or <code>Evidently</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricDestination
     */

    public MetricDestinationSummary withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination is <code>CloudWatch</code> or <code>Evidently</code>.
     * </p>
     * 
     * @param destination
     *        Specifies whether the destination is <code>CloudWatch</code> or <code>Evidently</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricDestination
     */

    public MetricDestinationSummary withDestination(MetricDestination destination) {
        this.destination = destination.toString();
        return this;
    }

    /**
     * <p>
     * If the destination is <code>Evidently</code>, this specifies the ARN of the Evidently experiment that receives
     * the metrics.
     * </p>
     * 
     * @param destinationArn
     *        If the destination is <code>Evidently</code>, this specifies the ARN of the Evidently experiment that
     *        receives the metrics.
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * If the destination is <code>Evidently</code>, this specifies the ARN of the Evidently experiment that receives
     * the metrics.
     * </p>
     * 
     * @return If the destination is <code>Evidently</code>, this specifies the ARN of the Evidently experiment that
     *         receives the metrics.
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * If the destination is <code>Evidently</code>, this specifies the ARN of the Evidently experiment that receives
     * the metrics.
     * </p>
     * 
     * @param destinationArn
     *        If the destination is <code>Evidently</code>, this specifies the ARN of the Evidently experiment that
     *        receives the metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDestinationSummary withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * This field appears only when the destination is <code>Evidently</code>. It specifies the ARN of the IAM role that
     * is used to write to the Evidently experiment that receives the metrics.
     * </p>
     * 
     * @param iamRoleArn
     *        This field appears only when the destination is <code>Evidently</code>. It specifies the ARN of the IAM
     *        role that is used to write to the Evidently experiment that receives the metrics.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * This field appears only when the destination is <code>Evidently</code>. It specifies the ARN of the IAM role that
     * is used to write to the Evidently experiment that receives the metrics.
     * </p>
     * 
     * @return This field appears only when the destination is <code>Evidently</code>. It specifies the ARN of the IAM
     *         role that is used to write to the Evidently experiment that receives the metrics.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * This field appears only when the destination is <code>Evidently</code>. It specifies the ARN of the IAM role that
     * is used to write to the Evidently experiment that receives the metrics.
     * </p>
     * 
     * @param iamRoleArn
     *        This field appears only when the destination is <code>Evidently</code>. It specifies the ARN of the IAM
     *        role that is used to write to the Evidently experiment that receives the metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDestinationSummary withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDestinationSummary == false)
            return false;
        MetricDestinationSummary other = (MetricDestinationSummary) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public MetricDestinationSummary clone() {
        try {
            return (MetricDestinationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchrum.model.transform.MetricDestinationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
