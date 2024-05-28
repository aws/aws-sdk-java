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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMonitorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that IAM Identity Center assigns to the monitor.
     * </p>
     */
    private String identityCenterApplicationArn;
    /**
     * <p>
     * The unique identifier of the monitor.
     * </p>
     */
    private String monitorId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that IAM Identity Center assigns to the monitor.
     * </p>
     * 
     * @param identityCenterApplicationArn
     *        The Amazon Resource Name (ARN) that IAM Identity Center assigns to the monitor.
     */

    public void setIdentityCenterApplicationArn(String identityCenterApplicationArn) {
        this.identityCenterApplicationArn = identityCenterApplicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that IAM Identity Center assigns to the monitor.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that IAM Identity Center assigns to the monitor.
     */

    public String getIdentityCenterApplicationArn() {
        return this.identityCenterApplicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that IAM Identity Center assigns to the monitor.
     * </p>
     * 
     * @param identityCenterApplicationArn
     *        The Amazon Resource Name (ARN) that IAM Identity Center assigns to the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorResult withIdentityCenterApplicationArn(String identityCenterApplicationArn) {
        setIdentityCenterApplicationArn(identityCenterApplicationArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the monitor.
     * </p>
     * 
     * @param monitorId
     *        The unique identifier of the monitor.
     */

    public void setMonitorId(String monitorId) {
        this.monitorId = monitorId;
    }

    /**
     * <p>
     * The unique identifier of the monitor.
     * </p>
     * 
     * @return The unique identifier of the monitor.
     */

    public String getMonitorId() {
        return this.monitorId;
    }

    /**
     * <p>
     * The unique identifier of the monitor.
     * </p>
     * 
     * @param monitorId
     *        The unique identifier of the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMonitorResult withMonitorId(String monitorId) {
        setMonitorId(monitorId);
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
        if (getIdentityCenterApplicationArn() != null)
            sb.append("IdentityCenterApplicationArn: ").append(getIdentityCenterApplicationArn()).append(",");
        if (getMonitorId() != null)
            sb.append("MonitorId: ").append(getMonitorId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMonitorResult == false)
            return false;
        CreateMonitorResult other = (CreateMonitorResult) obj;
        if (other.getIdentityCenterApplicationArn() == null ^ this.getIdentityCenterApplicationArn() == null)
            return false;
        if (other.getIdentityCenterApplicationArn() != null && other.getIdentityCenterApplicationArn().equals(this.getIdentityCenterApplicationArn()) == false)
            return false;
        if (other.getMonitorId() == null ^ this.getMonitorId() == null)
            return false;
        if (other.getMonitorId() != null && other.getMonitorId().equals(this.getMonitorId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityCenterApplicationArn() == null) ? 0 : getIdentityCenterApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getMonitorId() == null) ? 0 : getMonitorId().hashCode());
        return hashCode;
    }

    @Override
    public CreateMonitorResult clone() {
        try {
            return (CreateMonitorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
