/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#pollForTask(PollForTaskRequest) PollForTask operation}.
 * <p>
 * Task runners call this action to receive a task to perform from AWS Data Pipeline. The task runner specifies which tasks it can perform by setting a
 * value for the workerGroup parameter of the PollForTask call. The task returned by PollForTask may come from any of the pipelines that match the
 * workerGroup value passed in by the task runner and that was launched using the IAM user credentials specified by the task runner.
 * </p>
 * <p>
 * If tasks are ready in the work queue, PollForTask returns a response immediately. If no tasks are available in the queue, PollForTask uses
 * long-polling and holds on to a poll connection for up to a 90 seconds during which time the first newly scheduled task is handed to the task runner.
 * To accomodate this, set the socket timeout in your task runner to 90 seconds. The task runner should not call PollForTask again on the same
 * <code>workerGroup</code> until it receives a response, and this may take up to 90 seconds.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#pollForTask(PollForTaskRequest)
 */
public class PollForTaskRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Indicates the type of task the task runner is configured to accept and
     * process. The worker group is set as a field on objects in the pipeline
     * when they are created. You can only specify a single value for
     * <code>workerGroup</code> in the call to <a>PollForTask</a>. There are
     * no wildcard values permitted in <code>workerGroup</code>, the string
     * must be an exact, case-sensitive, match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String workerGroup;

    /**
     * The public DNS name of the calling task runner.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String hostname;

    /**
     * Identity information for the Amazon EC2 instance that is hosting the
     * task runner. You can get this value by calling the URI,
     * <code>http://169.254.169.254/latest/meta-data/instance-id</code>, from
     * the EC2 instance. For more information, go to <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html">Instance
     * Metadata</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i>
     * Passing in this value proves that your task runner is running on an
     * EC2 instance, and ensures the proper AWS Data Pipeline service charges
     * are applied to your pipeline.
     */
    private InstanceIdentity instanceIdentity;

    /**
     * Indicates the type of task the task runner is configured to accept and
     * process. The worker group is set as a field on objects in the pipeline
     * when they are created. You can only specify a single value for
     * <code>workerGroup</code> in the call to <a>PollForTask</a>. There are
     * no wildcard values permitted in <code>workerGroup</code>, the string
     * must be an exact, case-sensitive, match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Indicates the type of task the task runner is configured to accept and
     *         process. The worker group is set as a field on objects in the pipeline
     *         when they are created. You can only specify a single value for
     *         <code>workerGroup</code> in the call to <a>PollForTask</a>. There are
     *         no wildcard values permitted in <code>workerGroup</code>, the string
     *         must be an exact, case-sensitive, match.
     */
    public String getWorkerGroup() {
        return workerGroup;
    }
    
    /**
     * Indicates the type of task the task runner is configured to accept and
     * process. The worker group is set as a field on objects in the pipeline
     * when they are created. You can only specify a single value for
     * <code>workerGroup</code> in the call to <a>PollForTask</a>. There are
     * no wildcard values permitted in <code>workerGroup</code>, the string
     * must be an exact, case-sensitive, match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param workerGroup Indicates the type of task the task runner is configured to accept and
     *         process. The worker group is set as a field on objects in the pipeline
     *         when they are created. You can only specify a single value for
     *         <code>workerGroup</code> in the call to <a>PollForTask</a>. There are
     *         no wildcard values permitted in <code>workerGroup</code>, the string
     *         must be an exact, case-sensitive, match.
     */
    public void setWorkerGroup(String workerGroup) {
        this.workerGroup = workerGroup;
    }
    
    /**
     * Indicates the type of task the task runner is configured to accept and
     * process. The worker group is set as a field on objects in the pipeline
     * when they are created. You can only specify a single value for
     * <code>workerGroup</code> in the call to <a>PollForTask</a>. There are
     * no wildcard values permitted in <code>workerGroup</code>, the string
     * must be an exact, case-sensitive, match.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param workerGroup Indicates the type of task the task runner is configured to accept and
     *         process. The worker group is set as a field on objects in the pipeline
     *         when they are created. You can only specify a single value for
     *         <code>workerGroup</code> in the call to <a>PollForTask</a>. There are
     *         no wildcard values permitted in <code>workerGroup</code>, the string
     *         must be an exact, case-sensitive, match.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PollForTaskRequest withWorkerGroup(String workerGroup) {
        this.workerGroup = workerGroup;
        return this;
    }

    /**
     * The public DNS name of the calling task runner.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The public DNS name of the calling task runner.
     */
    public String getHostname() {
        return hostname;
    }
    
    /**
     * The public DNS name of the calling task runner.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param hostname The public DNS name of the calling task runner.
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
    /**
     * The public DNS name of the calling task runner.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param hostname The public DNS name of the calling task runner.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PollForTaskRequest withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Identity information for the Amazon EC2 instance that is hosting the
     * task runner. You can get this value by calling the URI,
     * <code>http://169.254.169.254/latest/meta-data/instance-id</code>, from
     * the EC2 instance. For more information, go to <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html">Instance
     * Metadata</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i>
     * Passing in this value proves that your task runner is running on an
     * EC2 instance, and ensures the proper AWS Data Pipeline service charges
     * are applied to your pipeline.
     *
     * @return Identity information for the Amazon EC2 instance that is hosting the
     *         task runner. You can get this value by calling the URI,
     *         <code>http://169.254.169.254/latest/meta-data/instance-id</code>, from
     *         the EC2 instance. For more information, go to <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html">Instance
     *         Metadata</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i>
     *         Passing in this value proves that your task runner is running on an
     *         EC2 instance, and ensures the proper AWS Data Pipeline service charges
     *         are applied to your pipeline.
     */
    public InstanceIdentity getInstanceIdentity() {
        return instanceIdentity;
    }
    
    /**
     * Identity information for the Amazon EC2 instance that is hosting the
     * task runner. You can get this value by calling the URI,
     * <code>http://169.254.169.254/latest/meta-data/instance-id</code>, from
     * the EC2 instance. For more information, go to <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html">Instance
     * Metadata</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i>
     * Passing in this value proves that your task runner is running on an
     * EC2 instance, and ensures the proper AWS Data Pipeline service charges
     * are applied to your pipeline.
     *
     * @param instanceIdentity Identity information for the Amazon EC2 instance that is hosting the
     *         task runner. You can get this value by calling the URI,
     *         <code>http://169.254.169.254/latest/meta-data/instance-id</code>, from
     *         the EC2 instance. For more information, go to <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html">Instance
     *         Metadata</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i>
     *         Passing in this value proves that your task runner is running on an
     *         EC2 instance, and ensures the proper AWS Data Pipeline service charges
     *         are applied to your pipeline.
     */
    public void setInstanceIdentity(InstanceIdentity instanceIdentity) {
        this.instanceIdentity = instanceIdentity;
    }
    
    /**
     * Identity information for the Amazon EC2 instance that is hosting the
     * task runner. You can get this value by calling the URI,
     * <code>http://169.254.169.254/latest/meta-data/instance-id</code>, from
     * the EC2 instance. For more information, go to <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html">Instance
     * Metadata</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i>
     * Passing in this value proves that your task runner is running on an
     * EC2 instance, and ensures the proper AWS Data Pipeline service charges
     * are applied to your pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIdentity Identity information for the Amazon EC2 instance that is hosting the
     *         task runner. You can get this value by calling the URI,
     *         <code>http://169.254.169.254/latest/meta-data/instance-id</code>, from
     *         the EC2 instance. For more information, go to <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html">Instance
     *         Metadata</a> in the <i>Amazon Elastic Compute Cloud User Guide.</i>
     *         Passing in this value proves that your task runner is running on an
     *         EC2 instance, and ensures the proper AWS Data Pipeline service charges
     *         are applied to your pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PollForTaskRequest withInstanceIdentity(InstanceIdentity instanceIdentity) {
        this.instanceIdentity = instanceIdentity;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkerGroup() != null) sb.append("WorkerGroup: " + getWorkerGroup() + ",");
        if (getHostname() != null) sb.append("Hostname: " + getHostname() + ",");
        if (getInstanceIdentity() != null) sb.append("InstanceIdentity: " + getInstanceIdentity() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PollForTaskRequest == false) return false;
        PollForTaskRequest other = (PollForTaskRequest)obj;
        
        if (other.getWorkerGroup() == null ^ this.getWorkerGroup() == null) return false;
        if (other.getWorkerGroup() != null && other.getWorkerGroup().equals(this.getWorkerGroup()) == false) return false; 
        if (other.getHostname() == null ^ this.getHostname() == null) return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false) return false; 
        if (other.getInstanceIdentity() == null ^ this.getInstanceIdentity() == null) return false;
        if (other.getInstanceIdentity() != null && other.getInstanceIdentity().equals(this.getInstanceIdentity()) == false) return false; 
        return true;
    }
    
}
    