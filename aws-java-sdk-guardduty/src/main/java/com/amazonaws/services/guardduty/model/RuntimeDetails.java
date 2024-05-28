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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the process and any required context values for a specific finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/RuntimeDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuntimeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the observed process.
     * </p>
     */
    private ProcessDetails process;
    /**
     * <p>
     * Additional information about the suspicious activity.
     * </p>
     */
    private RuntimeContext context;

    /**
     * <p>
     * Information about the observed process.
     * </p>
     * 
     * @param process
     *        Information about the observed process.
     */

    public void setProcess(ProcessDetails process) {
        this.process = process;
    }

    /**
     * <p>
     * Information about the observed process.
     * </p>
     * 
     * @return Information about the observed process.
     */

    public ProcessDetails getProcess() {
        return this.process;
    }

    /**
     * <p>
     * Information about the observed process.
     * </p>
     * 
     * @param process
     *        Information about the observed process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeDetails withProcess(ProcessDetails process) {
        setProcess(process);
        return this;
    }

    /**
     * <p>
     * Additional information about the suspicious activity.
     * </p>
     * 
     * @param context
     *        Additional information about the suspicious activity.
     */

    public void setContext(RuntimeContext context) {
        this.context = context;
    }

    /**
     * <p>
     * Additional information about the suspicious activity.
     * </p>
     * 
     * @return Additional information about the suspicious activity.
     */

    public RuntimeContext getContext() {
        return this.context;
    }

    /**
     * <p>
     * Additional information about the suspicious activity.
     * </p>
     * 
     * @param context
     *        Additional information about the suspicious activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeDetails withContext(RuntimeContext context) {
        setContext(context);
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
        if (getProcess() != null)
            sb.append("Process: ").append(getProcess()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuntimeDetails == false)
            return false;
        RuntimeDetails other = (RuntimeDetails) obj;
        if (other.getProcess() == null ^ this.getProcess() == null)
            return false;
        if (other.getProcess() != null && other.getProcess().equals(this.getProcess()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcess() == null) ? 0 : getProcess().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        return hashCode;
    }

    @Override
    public RuntimeDetails clone() {
        try {
            return (RuntimeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.RuntimeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
