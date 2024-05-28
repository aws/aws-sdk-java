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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a target failure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/TargetFailure" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetFailure implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The failure code.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * The failure message.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * The ID of the target. If the target group type is <code>INSTANCE</code>, this is an instance ID. If the target
     * group type is <code>IP</code>, this is an IP address. If the target group type is <code>LAMBDA</code>, this is
     * the ARN of a Lambda function. If the target group type is <code>ALB</code>, this is the ARN of an Application
     * Load Balancer.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The port on which the target is listening. This parameter doesn't apply if the target is a Lambda function.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @param failureCode
     *        The failure code.
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @return The failure code.
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @param failureCode
     *        The failure code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetFailure withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The failure message.
     * </p>
     * 
     * @param failureMessage
     *        The failure message.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * The failure message.
     * </p>
     * 
     * @return The failure message.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * The failure message.
     * </p>
     * 
     * @param failureMessage
     *        The failure message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetFailure withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * The ID of the target. If the target group type is <code>INSTANCE</code>, this is an instance ID. If the target
     * group type is <code>IP</code>, this is an IP address. If the target group type is <code>LAMBDA</code>, this is
     * the ARN of a Lambda function. If the target group type is <code>ALB</code>, this is the ARN of an Application
     * Load Balancer.
     * </p>
     * 
     * @param id
     *        The ID of the target. If the target group type is <code>INSTANCE</code>, this is an instance ID. If the
     *        target group type is <code>IP</code>, this is an IP address. If the target group type is
     *        <code>LAMBDA</code>, this is the ARN of a Lambda function. If the target group type is <code>ALB</code>,
     *        this is the ARN of an Application Load Balancer.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the target. If the target group type is <code>INSTANCE</code>, this is an instance ID. If the target
     * group type is <code>IP</code>, this is an IP address. If the target group type is <code>LAMBDA</code>, this is
     * the ARN of a Lambda function. If the target group type is <code>ALB</code>, this is the ARN of an Application
     * Load Balancer.
     * </p>
     * 
     * @return The ID of the target. If the target group type is <code>INSTANCE</code>, this is an instance ID. If the
     *         target group type is <code>IP</code>, this is an IP address. If the target group type is
     *         <code>LAMBDA</code>, this is the ARN of a Lambda function. If the target group type is <code>ALB</code>,
     *         this is the ARN of an Application Load Balancer.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the target. If the target group type is <code>INSTANCE</code>, this is an instance ID. If the target
     * group type is <code>IP</code>, this is an IP address. If the target group type is <code>LAMBDA</code>, this is
     * the ARN of a Lambda function. If the target group type is <code>ALB</code>, this is the ARN of an Application
     * Load Balancer.
     * </p>
     * 
     * @param id
     *        The ID of the target. If the target group type is <code>INSTANCE</code>, this is an instance ID. If the
     *        target group type is <code>IP</code>, this is an IP address. If the target group type is
     *        <code>LAMBDA</code>, this is the ARN of a Lambda function. If the target group type is <code>ALB</code>,
     *        this is the ARN of an Application Load Balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetFailure withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The port on which the target is listening. This parameter doesn't apply if the target is a Lambda function.
     * </p>
     * 
     * @param port
     *        The port on which the target is listening. This parameter doesn't apply if the target is a Lambda
     *        function.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on which the target is listening. This parameter doesn't apply if the target is a Lambda function.
     * </p>
     * 
     * @return The port on which the target is listening. This parameter doesn't apply if the target is a Lambda
     *         function.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on which the target is listening. This parameter doesn't apply if the target is a Lambda function.
     * </p>
     * 
     * @param port
     *        The port on which the target is listening. This parameter doesn't apply if the target is a Lambda
     *        function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetFailure withPort(Integer port) {
        setPort(port);
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
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetFailure == false)
            return false;
        TargetFailure other = (TargetFailure) obj;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        return hashCode;
    }

    @Override
    public TargetFailure clone() {
        try {
            return (TargetFailure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.TargetFailureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
