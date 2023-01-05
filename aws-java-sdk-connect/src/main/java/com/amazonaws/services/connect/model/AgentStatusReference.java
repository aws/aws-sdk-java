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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the agent's status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AgentStatusReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentStatusReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start timestamp of the agent's status.
     * </p>
     */
    private java.util.Date statusStartTimestamp;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent's status.
     * </p>
     */
    private String statusArn;
    /**
     * <p>
     * The name of the agent status.
     * </p>
     */
    private String statusName;

    /**
     * <p>
     * The start timestamp of the agent's status.
     * </p>
     * 
     * @param statusStartTimestamp
     *        The start timestamp of the agent's status.
     */

    public void setStatusStartTimestamp(java.util.Date statusStartTimestamp) {
        this.statusStartTimestamp = statusStartTimestamp;
    }

    /**
     * <p>
     * The start timestamp of the agent's status.
     * </p>
     * 
     * @return The start timestamp of the agent's status.
     */

    public java.util.Date getStatusStartTimestamp() {
        return this.statusStartTimestamp;
    }

    /**
     * <p>
     * The start timestamp of the agent's status.
     * </p>
     * 
     * @param statusStartTimestamp
     *        The start timestamp of the agent's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentStatusReference withStatusStartTimestamp(java.util.Date statusStartTimestamp) {
        setStatusStartTimestamp(statusStartTimestamp);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent's status.
     * </p>
     * 
     * @param statusArn
     *        The Amazon Resource Name (ARN) of the agent's status.
     */

    public void setStatusArn(String statusArn) {
        this.statusArn = statusArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent's status.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the agent's status.
     */

    public String getStatusArn() {
        return this.statusArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agent's status.
     * </p>
     * 
     * @param statusArn
     *        The Amazon Resource Name (ARN) of the agent's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentStatusReference withStatusArn(String statusArn) {
        setStatusArn(statusArn);
        return this;
    }

    /**
     * <p>
     * The name of the agent status.
     * </p>
     * 
     * @param statusName
     *        The name of the agent status.
     */

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    /**
     * <p>
     * The name of the agent status.
     * </p>
     * 
     * @return The name of the agent status.
     */

    public String getStatusName() {
        return this.statusName;
    }

    /**
     * <p>
     * The name of the agent status.
     * </p>
     * 
     * @param statusName
     *        The name of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentStatusReference withStatusName(String statusName) {
        setStatusName(statusName);
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
        if (getStatusStartTimestamp() != null)
            sb.append("StatusStartTimestamp: ").append(getStatusStartTimestamp()).append(",");
        if (getStatusArn() != null)
            sb.append("StatusArn: ").append(getStatusArn()).append(",");
        if (getStatusName() != null)
            sb.append("StatusName: ").append(getStatusName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentStatusReference == false)
            return false;
        AgentStatusReference other = (AgentStatusReference) obj;
        if (other.getStatusStartTimestamp() == null ^ this.getStatusStartTimestamp() == null)
            return false;
        if (other.getStatusStartTimestamp() != null && other.getStatusStartTimestamp().equals(this.getStatusStartTimestamp()) == false)
            return false;
        if (other.getStatusArn() == null ^ this.getStatusArn() == null)
            return false;
        if (other.getStatusArn() != null && other.getStatusArn().equals(this.getStatusArn()) == false)
            return false;
        if (other.getStatusName() == null ^ this.getStatusName() == null)
            return false;
        if (other.getStatusName() != null && other.getStatusName().equals(this.getStatusName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusStartTimestamp() == null) ? 0 : getStatusStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatusArn() == null) ? 0 : getStatusArn().hashCode());
        hashCode = prime * hashCode + ((getStatusName() == null) ? 0 : getStatusName().hashCode());
        return hashCode;
    }

    @Override
    public AgentStatusReference clone() {
        try {
            return (AgentStatusReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AgentStatusReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
