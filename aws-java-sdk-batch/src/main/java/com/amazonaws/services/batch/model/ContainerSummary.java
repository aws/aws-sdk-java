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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing summary details of a container within a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ContainerSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The exit code to return upon completion.
     * </p>
     */
    private Integer exitCode;
    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional details about a running or stopped
     * container.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The exit code to return upon completion.
     * </p>
     * 
     * @param exitCode
     *        The exit code to return upon completion.
     */

    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     * <p>
     * The exit code to return upon completion.
     * </p>
     * 
     * @return The exit code to return upon completion.
     */

    public Integer getExitCode() {
        return this.exitCode;
    }

    /**
     * <p>
     * The exit code to return upon completion.
     * </p>
     * 
     * @param exitCode
     *        The exit code to return upon completion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerSummary withExitCode(Integer exitCode) {
        setExitCode(exitCode);
        return this;
    }

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional details about a running or stopped
     * container.
     * </p>
     * 
     * @param reason
     *        A short (255 max characters) human-readable string to provide additional details about a running or
     *        stopped container.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional details about a running or stopped
     * container.
     * </p>
     * 
     * @return A short (255 max characters) human-readable string to provide additional details about a running or
     *         stopped container.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A short (255 max characters) human-readable string to provide additional details about a running or stopped
     * container.
     * </p>
     * 
     * @param reason
     *        A short (255 max characters) human-readable string to provide additional details about a running or
     *        stopped container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerSummary withReason(String reason) {
        setReason(reason);
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
        if (getExitCode() != null)
            sb.append("ExitCode: ").append(getExitCode()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerSummary == false)
            return false;
        ContainerSummary other = (ContainerSummary) obj;
        if (other.getExitCode() == null ^ this.getExitCode() == null)
            return false;
        if (other.getExitCode() != null && other.getExitCode().equals(this.getExitCode()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExitCode() == null) ? 0 : getExitCode().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public ContainerSummary clone() {
        try {
            return (ContainerSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.ContainerSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
