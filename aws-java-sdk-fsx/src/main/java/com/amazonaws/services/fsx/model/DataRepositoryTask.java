/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A description of the data repository task. You use data repository tasks to perform bulk transfer operations between
 * your Amazon FSx file system and its linked data repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DataRepositoryTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataRepositoryTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The system-generated, unique 17-digit ID of the data repository task.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the task
     * failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information about task
     * failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot delete an FSx for Lustre file system if there are data repository tasks for the file system in the
     * <code>PENDING</code> or <code>EXECUTING</code> states. Please retry when the data repository task is finished
     * (with a status of <code>CANCELED</code>, <code>SUCCEEDED</code>, or <code>FAILED</code>). You can use the
     * DescribeDataRepositoryTask action to monitor the task status. Contact the FSx team if you need to delete your
     * file system immediately.
     * </p>
     * </note>
     */
    private String lifecycle;
    /**
     * <p>
     * The type of data repository task; EXPORT_TO_REPOSITORY is the only type currently supported.
     * </p>
     */
    private String type;

    private java.util.Date creationTime;
    /**
     * <p>
     * The time that Amazon FSx began processing the task.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time that Amazon FSx completed processing the task, populated after the task is complete.
     * </p>
     */
    private java.util.Date endTime;

    private String resourceARN;

    private java.util.List<Tag> tags;

    private String fileSystemId;
    /**
     * <p>
     * An array of paths on the Amazon FSx for Lustre file system that specify the data for the data repository task to
     * process. For example, in an EXPORT_TO_REPOSITORY task, the paths specify which data to export to the linked data
     * repository.
     * </p>
     * <p>
     * (Default) If <code>Paths</code> is not specified, Amazon FSx uses the file system root directory.
     * </p>
     */
    private java.util.List<String> paths;
    /**
     * <p>
     * Failure message describing why the task failed, it is populated only when <code>Lifecycle</code> is set to
     * <code>FAILED</code>.
     * </p>
     */
    private DataRepositoryTaskFailureDetails failureDetails;
    /**
     * <p>
     * Provides the status of the number of files that the task has processed successfully and failed to process.
     * </p>
     */
    private DataRepositoryTaskStatus status;

    private CompletionReport report;

    /**
     * <p>
     * The system-generated, unique 17-digit ID of the data repository task.
     * </p>
     * 
     * @param taskId
     *        The system-generated, unique 17-digit ID of the data repository task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The system-generated, unique 17-digit ID of the data repository task.
     * </p>
     * 
     * @return The system-generated, unique 17-digit ID of the data repository task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The system-generated, unique 17-digit ID of the data repository task.
     * </p>
     * 
     * @param taskId
     *        The system-generated, unique 17-digit ID of the data repository task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTask withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the task
     * failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information about task
     * failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot delete an FSx for Lustre file system if there are data repository tasks for the file system in the
     * <code>PENDING</code> or <code>EXECUTING</code> states. Please retry when the data repository task is finished
     * (with a status of <code>CANCELED</code>, <code>SUCCEEDED</code>, or <code>FAILED</code>). You can use the
     * DescribeDataRepositoryTask action to monitor the task status. Contact the FSx team if you need to delete your
     * file system immediately.
     * </p>
     * </note>
     * 
     * @param lifecycle
     *        The lifecycle status of the data repository task, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx has not started the task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXECUTING</code> - Amazon FSx is processing the task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the
     *        task failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information
     *        about task failures.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - FSx completed the task successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELING</code> - FSx is in process of canceling the task.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        You cannot delete an FSx for Lustre file system if there are data repository tasks for the file system in
     *        the <code>PENDING</code> or <code>EXECUTING</code> states. Please retry when the data repository task is
     *        finished (with a status of <code>CANCELED</code>, <code>SUCCEEDED</code>, or <code>FAILED</code>). You can
     *        use the DescribeDataRepositoryTask action to monitor the task status. Contact the FSx team if you need to
     *        delete your file system immediately.
     *        </p>
     * @see DataRepositoryTaskLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the task
     * failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information about task
     * failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot delete an FSx for Lustre file system if there are data repository tasks for the file system in the
     * <code>PENDING</code> or <code>EXECUTING</code> states. Please retry when the data repository task is finished
     * (with a status of <code>CANCELED</code>, <code>SUCCEEDED</code>, or <code>FAILED</code>). You can use the
     * DescribeDataRepositoryTask action to monitor the task status. Contact the FSx team if you need to delete your
     * file system immediately.
     * </p>
     * </note>
     * 
     * @return The lifecycle status of the data repository task, as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - Amazon FSx has not started the task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXECUTING</code> - Amazon FSx is processing the task.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the
     *         task failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information
     *         about task failures.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code> - FSx completed the task successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELING</code> - FSx is in process of canceling the task.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         You cannot delete an FSx for Lustre file system if there are data repository tasks for the file system in
     *         the <code>PENDING</code> or <code>EXECUTING</code> states. Please retry when the data repository task is
     *         finished (with a status of <code>CANCELED</code>, <code>SUCCEEDED</code>, or <code>FAILED</code>). You
     *         can use the DescribeDataRepositoryTask action to monitor the task status. Contact the FSx team if you
     *         need to delete your file system immediately.
     *         </p>
     * @see DataRepositoryTaskLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the task
     * failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information about task
     * failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot delete an FSx for Lustre file system if there are data repository tasks for the file system in the
     * <code>PENDING</code> or <code>EXECUTING</code> states. Please retry when the data repository task is finished
     * (with a status of <code>CANCELED</code>, <code>SUCCEEDED</code>, or <code>FAILED</code>). You can use the
     * DescribeDataRepositoryTask action to monitor the task status. Contact the FSx team if you need to delete your
     * file system immediately.
     * </p>
     * </note>
     * 
     * @param lifecycle
     *        The lifecycle status of the data repository task, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx has not started the task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXECUTING</code> - Amazon FSx is processing the task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the
     *        task failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information
     *        about task failures.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - FSx completed the task successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELING</code> - FSx is in process of canceling the task.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        You cannot delete an FSx for Lustre file system if there are data repository tasks for the file system in
     *        the <code>PENDING</code> or <code>EXECUTING</code> states. Please retry when the data repository task is
     *        finished (with a status of <code>CANCELED</code>, <code>SUCCEEDED</code>, or <code>FAILED</code>). You can
     *        use the DescribeDataRepositoryTask action to monitor the task status. Contact the FSx team if you need to
     *        delete your file system immediately.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataRepositoryTaskLifecycle
     */

    public DataRepositoryTask withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the data repository task, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXECUTING</code> - Amazon FSx is processing the task.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the task
     * failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information about task
     * failures.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - FSx completed the task successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELING</code> - FSx is in process of canceling the task.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * You cannot delete an FSx for Lustre file system if there are data repository tasks for the file system in the
     * <code>PENDING</code> or <code>EXECUTING</code> states. Please retry when the data repository task is finished
     * (with a status of <code>CANCELED</code>, <code>SUCCEEDED</code>, or <code>FAILED</code>). You can use the
     * DescribeDataRepositoryTask action to monitor the task status. Contact the FSx team if you need to delete your
     * file system immediately.
     * </p>
     * </note>
     * 
     * @param lifecycle
     *        The lifecycle status of the data repository task, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx has not started the task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXECUTING</code> - Amazon FSx is processing the task.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Amazon FSx was not able to complete the task. For example, there may be files the
     *        task failed to process. The <a>DataRepositoryTaskFailureDetails</a> property provides more information
     *        about task failures.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code> - FSx completed the task successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELED</code> - Amazon FSx canceled the task and it did not complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELING</code> - FSx is in process of canceling the task.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        You cannot delete an FSx for Lustre file system if there are data repository tasks for the file system in
     *        the <code>PENDING</code> or <code>EXECUTING</code> states. Please retry when the data repository task is
     *        finished (with a status of <code>CANCELED</code>, <code>SUCCEEDED</code>, or <code>FAILED</code>). You can
     *        use the DescribeDataRepositoryTask action to monitor the task status. Contact the FSx team if you need to
     *        delete your file system immediately.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataRepositoryTaskLifecycle
     */

    public DataRepositoryTask withLifecycle(DataRepositoryTaskLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * The type of data repository task; EXPORT_TO_REPOSITORY is the only type currently supported.
     * </p>
     * 
     * @param type
     *        The type of data repository task; EXPORT_TO_REPOSITORY is the only type currently supported.
     * @see DataRepositoryTaskType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of data repository task; EXPORT_TO_REPOSITORY is the only type currently supported.
     * </p>
     * 
     * @return The type of data repository task; EXPORT_TO_REPOSITORY is the only type currently supported.
     * @see DataRepositoryTaskType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of data repository task; EXPORT_TO_REPOSITORY is the only type currently supported.
     * </p>
     * 
     * @param type
     *        The type of data repository task; EXPORT_TO_REPOSITORY is the only type currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataRepositoryTaskType
     */

    public DataRepositoryTask withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of data repository task; EXPORT_TO_REPOSITORY is the only type currently supported.
     * </p>
     * 
     * @param type
     *        The type of data repository task; EXPORT_TO_REPOSITORY is the only type currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataRepositoryTaskType
     */

    public DataRepositoryTask withType(DataRepositoryTaskType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * @param creationTime
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * @return
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * @param creationTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTask withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time that Amazon FSx began processing the task.
     * </p>
     * 
     * @param startTime
     *        The time that Amazon FSx began processing the task.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time that Amazon FSx began processing the task.
     * </p>
     * 
     * @return The time that Amazon FSx began processing the task.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time that Amazon FSx began processing the task.
     * </p>
     * 
     * @param startTime
     *        The time that Amazon FSx began processing the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTask withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time that Amazon FSx completed processing the task, populated after the task is complete.
     * </p>
     * 
     * @param endTime
     *        The time that Amazon FSx completed processing the task, populated after the task is complete.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that Amazon FSx completed processing the task, populated after the task is complete.
     * </p>
     * 
     * @return The time that Amazon FSx completed processing the task, populated after the task is complete.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time that Amazon FSx completed processing the task, populated after the task is complete.
     * </p>
     * 
     * @param endTime
     *        The time that Amazon FSx completed processing the task, populated after the task is complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTask withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * @param resourceARN
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * @return
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * @param resourceARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTask withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTask withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTask withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * @param fileSystemId
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * @return
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @param fileSystemId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTask withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * An array of paths on the Amazon FSx for Lustre file system that specify the data for the data repository task to
     * process. For example, in an EXPORT_TO_REPOSITORY task, the paths specify which data to export to the linked data
     * repository.
     * </p>
     * <p>
     * (Default) If <code>Paths</code> is not specified, Amazon FSx uses the file system root directory.
     * </p>
     * 
     * @return An array of paths on the Amazon FSx for Lustre file system that specify the data for the data repository
     *         task to process. For example, in an EXPORT_TO_REPOSITORY task, the paths specify which data to export to
     *         the linked data repository.</p>
     *         <p>
     *         (Default) If <code>Paths</code> is not specified, Amazon FSx uses the file system root directory.
     */

    public java.util.List<String> getPaths() {
        return paths;
    }

    /**
     * <p>
     * An array of paths on the Amazon FSx for Lustre file system that specify the data for the data repository task to
     * process. For example, in an EXPORT_TO_REPOSITORY task, the paths specify which data to export to the linked data
     * repository.
     * </p>
     * <p>
     * (Default) If <code>Paths</code> is not specified, Amazon FSx uses the file system root directory.
     * </p>
     * 
     * @param paths
     *        An array of paths on the Amazon FSx for Lustre file system that specify the data for the data repository
     *        task to process. For example, in an EXPORT_TO_REPOSITORY task, the paths specify which data to export to
     *        the linked data repository.</p>
     *        <p>
     *        (Default) If <code>Paths</code> is not specified, Amazon FSx uses the file system root directory.
     */

    public void setPaths(java.util.Collection<String> paths) {
        if (paths == null) {
            this.paths = null;
            return;
        }

        this.paths = new java.util.ArrayList<String>(paths);
    }

    /**
     * <p>
     * An array of paths on the Amazon FSx for Lustre file system that specify the data for the data repository task to
     * process. For example, in an EXPORT_TO_REPOSITORY task, the paths specify which data to export to the linked data
     * repository.
     * </p>
     * <p>
     * (Default) If <code>Paths</code> is not specified, Amazon FSx uses the file system root directory.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPaths(java.util.Collection)} or {@link #withPaths(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param paths
     *        An array of paths on the Amazon FSx for Lustre file system that specify the data for the data repository
     *        task to process. For example, in an EXPORT_TO_REPOSITORY task, the paths specify which data to export to
     *        the linked data repository.</p>
     *        <p>
     *        (Default) If <code>Paths</code> is not specified, Amazon FSx uses the file system root directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTask withPaths(String... paths) {
        if (this.paths == null) {
            setPaths(new java.util.ArrayList<String>(paths.length));
        }
        for (String ele : paths) {
            this.paths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of paths on the Amazon FSx for Lustre file system that specify the data for the data repository task to
     * process. For example, in an EXPORT_TO_REPOSITORY task, the paths specify which data to export to the linked data
     * repository.
     * </p>
     * <p>
     * (Default) If <code>Paths</code> is not specified, Amazon FSx uses the file system root directory.
     * </p>
     * 
     * @param paths
     *        An array of paths on the Amazon FSx for Lustre file system that specify the data for the data repository
     *        task to process. For example, in an EXPORT_TO_REPOSITORY task, the paths specify which data to export to
     *        the linked data repository.</p>
     *        <p>
     *        (Default) If <code>Paths</code> is not specified, Amazon FSx uses the file system root directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTask withPaths(java.util.Collection<String> paths) {
        setPaths(paths);
        return this;
    }

    /**
     * <p>
     * Failure message describing why the task failed, it is populated only when <code>Lifecycle</code> is set to
     * <code>FAILED</code>.
     * </p>
     * 
     * @param failureDetails
     *        Failure message describing why the task failed, it is populated only when <code>Lifecycle</code> is set to
     *        <code>FAILED</code>.
     */

    public void setFailureDetails(DataRepositoryTaskFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * Failure message describing why the task failed, it is populated only when <code>Lifecycle</code> is set to
     * <code>FAILED</code>.
     * </p>
     * 
     * @return Failure message describing why the task failed, it is populated only when <code>Lifecycle</code> is set
     *         to <code>FAILED</code>.
     */

    public DataRepositoryTaskFailureDetails getFailureDetails() {
        return this.failureDetails;
    }

    /**
     * <p>
     * Failure message describing why the task failed, it is populated only when <code>Lifecycle</code> is set to
     * <code>FAILED</code>.
     * </p>
     * 
     * @param failureDetails
     *        Failure message describing why the task failed, it is populated only when <code>Lifecycle</code> is set to
     *        <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTask withFailureDetails(DataRepositoryTaskFailureDetails failureDetails) {
        setFailureDetails(failureDetails);
        return this;
    }

    /**
     * <p>
     * Provides the status of the number of files that the task has processed successfully and failed to process.
     * </p>
     * 
     * @param status
     *        Provides the status of the number of files that the task has processed successfully and failed to process.
     */

    public void setStatus(DataRepositoryTaskStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * Provides the status of the number of files that the task has processed successfully and failed to process.
     * </p>
     * 
     * @return Provides the status of the number of files that the task has processed successfully and failed to
     *         process.
     */

    public DataRepositoryTaskStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Provides the status of the number of files that the task has processed successfully and failed to process.
     * </p>
     * 
     * @param status
     *        Provides the status of the number of files that the task has processed successfully and failed to process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTask withStatus(DataRepositoryTaskStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * @param report
     */

    public void setReport(CompletionReport report) {
        this.report = report;
    }

    /**
     * @return
     */

    public CompletionReport getReport() {
        return this.report;
    }

    /**
     * @param report
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryTask withReport(CompletionReport report) {
        setReport(report);
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getPaths() != null)
            sb.append("Paths: ").append(getPaths()).append(",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: ").append(getFailureDetails()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getReport() != null)
            sb.append("Report: ").append(getReport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataRepositoryTask == false)
            return false;
        DataRepositoryTask other = (DataRepositoryTask) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getPaths() == null ^ this.getPaths() == null)
            return false;
        if (other.getPaths() != null && other.getPaths().equals(this.getPaths()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReport() == null ^ this.getReport() == null)
            return false;
        if (other.getReport() != null && other.getReport().equals(this.getReport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getPaths() == null) ? 0 : getPaths().hashCode());
        hashCode = prime * hashCode + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReport() == null) ? 0 : getReport().hashCode());
        return hashCode;
    }

    @Override
    public DataRepositoryTask clone() {
        try {
            return (DataRepositoryTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.DataRepositoryTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
