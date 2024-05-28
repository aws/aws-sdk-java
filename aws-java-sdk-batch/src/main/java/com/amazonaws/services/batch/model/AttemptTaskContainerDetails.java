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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the details of a container that's part of a job attempt.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/AttemptTaskContainerDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttemptTaskContainerDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The exit code for the container’s attempt. A non-zero exit code is considered failed.
     * </p>
     */
    private Integer exitCode;
    /**
     * <p>
     * The name of a container.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A short (255 max characters) string that's easy to understand and provides additional details for a running or
     * stopped container.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log stream that's associated with the container. The log group for Batch
     * jobs is <code>/aws/batch/job</code>. Each container attempt receives a log stream name when they reach the
     * <code>RUNNING</code> status.
     * </p>
     */
    private String logStreamName;
    /**
     * <p>
     * The network interfaces that are associated with the job attempt.
     * </p>
     */
    private java.util.List<NetworkInterface> networkInterfaces;

    /**
     * <p>
     * The exit code for the container’s attempt. A non-zero exit code is considered failed.
     * </p>
     * 
     * @param exitCode
     *        The exit code for the container’s attempt. A non-zero exit code is considered failed.
     */

    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     * <p>
     * The exit code for the container’s attempt. A non-zero exit code is considered failed.
     * </p>
     * 
     * @return The exit code for the container’s attempt. A non-zero exit code is considered failed.
     */

    public Integer getExitCode() {
        return this.exitCode;
    }

    /**
     * <p>
     * The exit code for the container’s attempt. A non-zero exit code is considered failed.
     * </p>
     * 
     * @param exitCode
     *        The exit code for the container’s attempt. A non-zero exit code is considered failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttemptTaskContainerDetails withExitCode(Integer exitCode) {
        setExitCode(exitCode);
        return this;
    }

    /**
     * <p>
     * The name of a container.
     * </p>
     * 
     * @param name
     *        The name of a container.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a container.
     * </p>
     * 
     * @return The name of a container.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a container.
     * </p>
     * 
     * @param name
     *        The name of a container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttemptTaskContainerDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A short (255 max characters) string that's easy to understand and provides additional details for a running or
     * stopped container.
     * </p>
     * 
     * @param reason
     *        A short (255 max characters) string that's easy to understand and provides additional details for a
     *        running or stopped container.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A short (255 max characters) string that's easy to understand and provides additional details for a running or
     * stopped container.
     * </p>
     * 
     * @return A short (255 max characters) string that's easy to understand and provides additional details for a
     *         running or stopped container.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A short (255 max characters) string that's easy to understand and provides additional details for a running or
     * stopped container.
     * </p>
     * 
     * @param reason
     *        A short (255 max characters) string that's easy to understand and provides additional details for a
     *        running or stopped container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttemptTaskContainerDetails withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log stream that's associated with the container. The log group for Batch
     * jobs is <code>/aws/batch/job</code>. Each container attempt receives a log stream name when they reach the
     * <code>RUNNING</code> status.
     * </p>
     * 
     * @param logStreamName
     *        The name of the Amazon CloudWatch Logs log stream that's associated with the container. The log group for
     *        Batch jobs is <code>/aws/batch/job</code>. Each container attempt receives a log stream name when they
     *        reach the <code>RUNNING</code> status.
     */

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log stream that's associated with the container. The log group for Batch
     * jobs is <code>/aws/batch/job</code>. Each container attempt receives a log stream name when they reach the
     * <code>RUNNING</code> status.
     * </p>
     * 
     * @return The name of the Amazon CloudWatch Logs log stream that's associated with the container. The log group for
     *         Batch jobs is <code>/aws/batch/job</code>. Each container attempt receives a log stream name when they
     *         reach the <code>RUNNING</code> status.
     */

    public String getLogStreamName() {
        return this.logStreamName;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log stream that's associated with the container. The log group for Batch
     * jobs is <code>/aws/batch/job</code>. Each container attempt receives a log stream name when they reach the
     * <code>RUNNING</code> status.
     * </p>
     * 
     * @param logStreamName
     *        The name of the Amazon CloudWatch Logs log stream that's associated with the container. The log group for
     *        Batch jobs is <code>/aws/batch/job</code>. Each container attempt receives a log stream name when they
     *        reach the <code>RUNNING</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttemptTaskContainerDetails withLogStreamName(String logStreamName) {
        setLogStreamName(logStreamName);
        return this;
    }

    /**
     * <p>
     * The network interfaces that are associated with the job attempt.
     * </p>
     * 
     * @return The network interfaces that are associated with the job attempt.
     */

    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * <p>
     * The network interfaces that are associated with the job attempt.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interfaces that are associated with the job attempt.
     */

    public void setNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new java.util.ArrayList<NetworkInterface>(networkInterfaces);
    }

    /**
     * <p>
     * The network interfaces that are associated with the job attempt.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interfaces that are associated with the job attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttemptTaskContainerDetails withNetworkInterfaces(NetworkInterface... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new java.util.ArrayList<NetworkInterface>(networkInterfaces.length));
        }
        for (NetworkInterface ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network interfaces that are associated with the job attempt.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interfaces that are associated with the job attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttemptTaskContainerDetails withNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getLogStreamName() != null)
            sb.append("LogStreamName: ").append(getLogStreamName()).append(",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttemptTaskContainerDetails == false)
            return false;
        AttemptTaskContainerDetails other = (AttemptTaskContainerDetails) obj;
        if (other.getExitCode() == null ^ this.getExitCode() == null)
            return false;
        if (other.getExitCode() != null && other.getExitCode().equals(this.getExitCode()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExitCode() == null) ? 0 : getExitCode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        return hashCode;
    }

    @Override
    public AttemptTaskContainerDetails clone() {
        try {
            return (AttemptTaskContainerDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.AttemptTaskContainerDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
