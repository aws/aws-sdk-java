/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The network configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not specify this
 * parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/NetworkConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the job should have a public IP address. For a job running on Fargate resources in a private
     * subnet to send outbound traffic to the internet (for example, in order to pull container images), the private
     * subnet requires a NAT gateway be attached to route requests to the internet. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Amazon ECS task
     * networking</a>. The default value is "DISABLED".
     * </p>
     */
    private String assignPublicIp;

    /**
     * <p>
     * Indicates whether the job should have a public IP address. For a job running on Fargate resources in a private
     * subnet to send outbound traffic to the internet (for example, in order to pull container images), the private
     * subnet requires a NAT gateway be attached to route requests to the internet. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Amazon ECS task
     * networking</a>. The default value is "DISABLED".
     * </p>
     * 
     * @param assignPublicIp
     *        Indicates whether the job should have a public IP address. For a job running on Fargate resources in a
     *        private subnet to send outbound traffic to the internet (for example, in order to pull container images),
     *        the private subnet requires a NAT gateway be attached to route requests to the internet. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Amazon ECS task
     *        networking</a>. The default value is "DISABLED".
     * @see AssignPublicIp
     */

    public void setAssignPublicIp(String assignPublicIp) {
        this.assignPublicIp = assignPublicIp;
    }

    /**
     * <p>
     * Indicates whether the job should have a public IP address. For a job running on Fargate resources in a private
     * subnet to send outbound traffic to the internet (for example, in order to pull container images), the private
     * subnet requires a NAT gateway be attached to route requests to the internet. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Amazon ECS task
     * networking</a>. The default value is "DISABLED".
     * </p>
     * 
     * @return Indicates whether the job should have a public IP address. For a job running on Fargate resources in a
     *         private subnet to send outbound traffic to the internet (for example, in order to pull container images),
     *         the private subnet requires a NAT gateway be attached to route requests to the internet. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Amazon ECS task
     *         networking</a>. The default value is "DISABLED".
     * @see AssignPublicIp
     */

    public String getAssignPublicIp() {
        return this.assignPublicIp;
    }

    /**
     * <p>
     * Indicates whether the job should have a public IP address. For a job running on Fargate resources in a private
     * subnet to send outbound traffic to the internet (for example, in order to pull container images), the private
     * subnet requires a NAT gateway be attached to route requests to the internet. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Amazon ECS task
     * networking</a>. The default value is "DISABLED".
     * </p>
     * 
     * @param assignPublicIp
     *        Indicates whether the job should have a public IP address. For a job running on Fargate resources in a
     *        private subnet to send outbound traffic to the internet (for example, in order to pull container images),
     *        the private subnet requires a NAT gateway be attached to route requests to the internet. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Amazon ECS task
     *        networking</a>. The default value is "DISABLED".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignPublicIp
     */

    public NetworkConfiguration withAssignPublicIp(String assignPublicIp) {
        setAssignPublicIp(assignPublicIp);
        return this;
    }

    /**
     * <p>
     * Indicates whether the job should have a public IP address. For a job running on Fargate resources in a private
     * subnet to send outbound traffic to the internet (for example, in order to pull container images), the private
     * subnet requires a NAT gateway be attached to route requests to the internet. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Amazon ECS task
     * networking</a>. The default value is "DISABLED".
     * </p>
     * 
     * @param assignPublicIp
     *        Indicates whether the job should have a public IP address. For a job running on Fargate resources in a
     *        private subnet to send outbound traffic to the internet (for example, in order to pull container images),
     *        the private subnet requires a NAT gateway be attached to route requests to the internet. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Amazon ECS task
     *        networking</a>. The default value is "DISABLED".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignPublicIp
     */

    public NetworkConfiguration withAssignPublicIp(AssignPublicIp assignPublicIp) {
        this.assignPublicIp = assignPublicIp.toString();
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
        if (getAssignPublicIp() != null)
            sb.append("AssignPublicIp: ").append(getAssignPublicIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkConfiguration == false)
            return false;
        NetworkConfiguration other = (NetworkConfiguration) obj;
        if (other.getAssignPublicIp() == null ^ this.getAssignPublicIp() == null)
            return false;
        if (other.getAssignPublicIp() != null && other.getAssignPublicIp().equals(this.getAssignPublicIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssignPublicIp() == null) ? 0 : getAssignPublicIp().hashCode());
        return hashCode;
    }

    @Override
    public NetworkConfiguration clone() {
        try {
            return (NetworkConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.NetworkConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
