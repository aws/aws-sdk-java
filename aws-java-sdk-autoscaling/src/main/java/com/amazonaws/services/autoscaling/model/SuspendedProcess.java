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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an automatic scaling process that has been suspended. For more information, see <a>ProcessType</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/SuspendedProcess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuspendedProcess implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the suspended process.
     * </p>
     */
    private String processName;
    /**
     * <p>
     * The reason that the process was suspended.
     * </p>
     */
    private String suspensionReason;

    /**
     * <p>
     * The name of the suspended process.
     * </p>
     * 
     * @param processName
     *        The name of the suspended process.
     */

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    /**
     * <p>
     * The name of the suspended process.
     * </p>
     * 
     * @return The name of the suspended process.
     */

    public String getProcessName() {
        return this.processName;
    }

    /**
     * <p>
     * The name of the suspended process.
     * </p>
     * 
     * @param processName
     *        The name of the suspended process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuspendedProcess withProcessName(String processName) {
        setProcessName(processName);
        return this;
    }

    /**
     * <p>
     * The reason that the process was suspended.
     * </p>
     * 
     * @param suspensionReason
     *        The reason that the process was suspended.
     */

    public void setSuspensionReason(String suspensionReason) {
        this.suspensionReason = suspensionReason;
    }

    /**
     * <p>
     * The reason that the process was suspended.
     * </p>
     * 
     * @return The reason that the process was suspended.
     */

    public String getSuspensionReason() {
        return this.suspensionReason;
    }

    /**
     * <p>
     * The reason that the process was suspended.
     * </p>
     * 
     * @param suspensionReason
     *        The reason that the process was suspended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuspendedProcess withSuspensionReason(String suspensionReason) {
        setSuspensionReason(suspensionReason);
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
        if (getProcessName() != null)
            sb.append("ProcessName: ").append(getProcessName()).append(",");
        if (getSuspensionReason() != null)
            sb.append("SuspensionReason: ").append(getSuspensionReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuspendedProcess == false)
            return false;
        SuspendedProcess other = (SuspendedProcess) obj;
        if (other.getProcessName() == null ^ this.getProcessName() == null)
            return false;
        if (other.getProcessName() != null && other.getProcessName().equals(this.getProcessName()) == false)
            return false;
        if (other.getSuspensionReason() == null ^ this.getSuspensionReason() == null)
            return false;
        if (other.getSuspensionReason() != null && other.getSuspensionReason().equals(this.getSuspensionReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcessName() == null) ? 0 : getProcessName().hashCode());
        hashCode = prime * hashCode + ((getSuspensionReason() == null) ? 0 : getSuspensionReason().hashCode());
        return hashCode;
    }

    @Override
    public SuspendedProcess clone() {
        try {
            return (SuspendedProcess) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
