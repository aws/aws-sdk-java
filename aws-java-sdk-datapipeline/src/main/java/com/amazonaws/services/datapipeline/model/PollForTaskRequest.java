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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for PollForTask.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/PollForTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PollForTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of task the task runner is configured to accept and process. The worker group is set as a field on
     * objects in the pipeline when they are created. You can only specify a single value for <code>workerGroup</code>
     * in the call to <code>PollForTask</code>. There are no wildcard values permitted in <code>workerGroup</code>; the
     * string must be an exact, case-sensitive, match.
     * </p>
     */
    private String workerGroup;
    /**
     * <p>
     * The public DNS name of the calling task runner.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * Identity information for the EC2 instance that is hosting the task runner. You can get this value from the
     * instance using <code>http://169.254.169.254/latest/meta-data/instance-id</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html">Instance Metadata</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide.</i> Passing in this value proves that your task runner is
     * running on an EC2 instance, and ensures the proper AWS Data Pipeline service charges are applied to your
     * pipeline.
     * </p>
     */
    private InstanceIdentity instanceIdentity;

    /**
     * <p>
     * The type of task the task runner is configured to accept and process. The worker group is set as a field on
     * objects in the pipeline when they are created. You can only specify a single value for <code>workerGroup</code>
     * in the call to <code>PollForTask</code>. There are no wildcard values permitted in <code>workerGroup</code>; the
     * string must be an exact, case-sensitive, match.
     * </p>
     * 
     * @param workerGroup
     *        The type of task the task runner is configured to accept and process. The worker group is set as a field
     *        on objects in the pipeline when they are created. You can only specify a single value for
     *        <code>workerGroup</code> in the call to <code>PollForTask</code>. There are no wildcard values permitted
     *        in <code>workerGroup</code>; the string must be an exact, case-sensitive, match.
     */

    public void setWorkerGroup(String workerGroup) {
        this.workerGroup = workerGroup;
    }

    /**
     * <p>
     * The type of task the task runner is configured to accept and process. The worker group is set as a field on
     * objects in the pipeline when they are created. You can only specify a single value for <code>workerGroup</code>
     * in the call to <code>PollForTask</code>. There are no wildcard values permitted in <code>workerGroup</code>; the
     * string must be an exact, case-sensitive, match.
     * </p>
     * 
     * @return The type of task the task runner is configured to accept and process. The worker group is set as a field
     *         on objects in the pipeline when they are created. You can only specify a single value for
     *         <code>workerGroup</code> in the call to <code>PollForTask</code>. There are no wildcard values permitted
     *         in <code>workerGroup</code>; the string must be an exact, case-sensitive, match.
     */

    public String getWorkerGroup() {
        return this.workerGroup;
    }

    /**
     * <p>
     * The type of task the task runner is configured to accept and process. The worker group is set as a field on
     * objects in the pipeline when they are created. You can only specify a single value for <code>workerGroup</code>
     * in the call to <code>PollForTask</code>. There are no wildcard values permitted in <code>workerGroup</code>; the
     * string must be an exact, case-sensitive, match.
     * </p>
     * 
     * @param workerGroup
     *        The type of task the task runner is configured to accept and process. The worker group is set as a field
     *        on objects in the pipeline when they are created. You can only specify a single value for
     *        <code>workerGroup</code> in the call to <code>PollForTask</code>. There are no wildcard values permitted
     *        in <code>workerGroup</code>; the string must be an exact, case-sensitive, match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PollForTaskRequest withWorkerGroup(String workerGroup) {
        setWorkerGroup(workerGroup);
        return this;
    }

    /**
     * <p>
     * The public DNS name of the calling task runner.
     * </p>
     * 
     * @param hostname
     *        The public DNS name of the calling task runner.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The public DNS name of the calling task runner.
     * </p>
     * 
     * @return The public DNS name of the calling task runner.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The public DNS name of the calling task runner.
     * </p>
     * 
     * @param hostname
     *        The public DNS name of the calling task runner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PollForTaskRequest withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * Identity information for the EC2 instance that is hosting the task runner. You can get this value from the
     * instance using <code>http://169.254.169.254/latest/meta-data/instance-id</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html">Instance Metadata</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide.</i> Passing in this value proves that your task runner is
     * running on an EC2 instance, and ensures the proper AWS Data Pipeline service charges are applied to your
     * pipeline.
     * </p>
     * 
     * @param instanceIdentity
     *        Identity information for the EC2 instance that is hosting the task runner. You can get this value from the
     *        instance using <code>http://169.254.169.254/latest/meta-data/instance-id</code>. For more information, see
     *        <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html">Instance
     *        Metadata</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i> Passing in this value proves that your
     *        task runner is running on an EC2 instance, and ensures the proper AWS Data Pipeline service charges are
     *        applied to your pipeline.
     */

    public void setInstanceIdentity(InstanceIdentity instanceIdentity) {
        this.instanceIdentity = instanceIdentity;
    }

    /**
     * <p>
     * Identity information for the EC2 instance that is hosting the task runner. You can get this value from the
     * instance using <code>http://169.254.169.254/latest/meta-data/instance-id</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html">Instance Metadata</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide.</i> Passing in this value proves that your task runner is
     * running on an EC2 instance, and ensures the proper AWS Data Pipeline service charges are applied to your
     * pipeline.
     * </p>
     * 
     * @return Identity information for the EC2 instance that is hosting the task runner. You can get this value from
     *         the instance using <code>http://169.254.169.254/latest/meta-data/instance-id</code>. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html">Instance
     *         Metadata</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i> Passing in this value proves that
     *         your task runner is running on an EC2 instance, and ensures the proper AWS Data Pipeline service charges
     *         are applied to your pipeline.
     */

    public InstanceIdentity getInstanceIdentity() {
        return this.instanceIdentity;
    }

    /**
     * <p>
     * Identity information for the EC2 instance that is hosting the task runner. You can get this value from the
     * instance using <code>http://169.254.169.254/latest/meta-data/instance-id</code>. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html">Instance Metadata</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide.</i> Passing in this value proves that your task runner is
     * running on an EC2 instance, and ensures the proper AWS Data Pipeline service charges are applied to your
     * pipeline.
     * </p>
     * 
     * @param instanceIdentity
     *        Identity information for the EC2 instance that is hosting the task runner. You can get this value from the
     *        instance using <code>http://169.254.169.254/latest/meta-data/instance-id</code>. For more information, see
     *        <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html">Instance
     *        Metadata</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i> Passing in this value proves that your
     *        task runner is running on an EC2 instance, and ensures the proper AWS Data Pipeline service charges are
     *        applied to your pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PollForTaskRequest withInstanceIdentity(InstanceIdentity instanceIdentity) {
        setInstanceIdentity(instanceIdentity);
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
        if (getWorkerGroup() != null)
            sb.append("WorkerGroup: ").append(getWorkerGroup()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getInstanceIdentity() != null)
            sb.append("InstanceIdentity: ").append(getInstanceIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PollForTaskRequest == false)
            return false;
        PollForTaskRequest other = (PollForTaskRequest) obj;
        if (other.getWorkerGroup() == null ^ this.getWorkerGroup() == null)
            return false;
        if (other.getWorkerGroup() != null && other.getWorkerGroup().equals(this.getWorkerGroup()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getInstanceIdentity() == null ^ this.getInstanceIdentity() == null)
            return false;
        if (other.getInstanceIdentity() != null && other.getInstanceIdentity().equals(this.getInstanceIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkerGroup() == null) ? 0 : getWorkerGroup().hashCode());
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getInstanceIdentity() == null) ? 0 : getInstanceIdentity().hashCode());
        return hashCode;
    }

    @Override
    public PollForTaskRequest clone() {
        return (PollForTaskRequest) super.clone();
    }

}
