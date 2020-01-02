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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and the
 * number of tasks that failed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/JobProgressSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobProgressSummary implements Serializable, Cloneable {

    /** <p/> */
    private Long totalNumberOfTasks;
    /** <p/> */
    private Long numberOfTasksSucceeded;
    /** <p/> */
    private Long numberOfTasksFailed;

    /**
     * <p/>
     * 
     * @param totalNumberOfTasks
     */

    public void setTotalNumberOfTasks(Long totalNumberOfTasks) {
        this.totalNumberOfTasks = totalNumberOfTasks;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Long getTotalNumberOfTasks() {
        return this.totalNumberOfTasks;
    }

    /**
     * <p/>
     * 
     * @param totalNumberOfTasks
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobProgressSummary withTotalNumberOfTasks(Long totalNumberOfTasks) {
        setTotalNumberOfTasks(totalNumberOfTasks);
        return this;
    }

    /**
     * <p/>
     * 
     * @param numberOfTasksSucceeded
     */

    public void setNumberOfTasksSucceeded(Long numberOfTasksSucceeded) {
        this.numberOfTasksSucceeded = numberOfTasksSucceeded;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Long getNumberOfTasksSucceeded() {
        return this.numberOfTasksSucceeded;
    }

    /**
     * <p/>
     * 
     * @param numberOfTasksSucceeded
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobProgressSummary withNumberOfTasksSucceeded(Long numberOfTasksSucceeded) {
        setNumberOfTasksSucceeded(numberOfTasksSucceeded);
        return this;
    }

    /**
     * <p/>
     * 
     * @param numberOfTasksFailed
     */

    public void setNumberOfTasksFailed(Long numberOfTasksFailed) {
        this.numberOfTasksFailed = numberOfTasksFailed;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Long getNumberOfTasksFailed() {
        return this.numberOfTasksFailed;
    }

    /**
     * <p/>
     * 
     * @param numberOfTasksFailed
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobProgressSummary withNumberOfTasksFailed(Long numberOfTasksFailed) {
        setNumberOfTasksFailed(numberOfTasksFailed);
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
        if (getTotalNumberOfTasks() != null)
            sb.append("TotalNumberOfTasks: ").append(getTotalNumberOfTasks()).append(",");
        if (getNumberOfTasksSucceeded() != null)
            sb.append("NumberOfTasksSucceeded: ").append(getNumberOfTasksSucceeded()).append(",");
        if (getNumberOfTasksFailed() != null)
            sb.append("NumberOfTasksFailed: ").append(getNumberOfTasksFailed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobProgressSummary == false)
            return false;
        JobProgressSummary other = (JobProgressSummary) obj;
        if (other.getTotalNumberOfTasks() == null ^ this.getTotalNumberOfTasks() == null)
            return false;
        if (other.getTotalNumberOfTasks() != null && other.getTotalNumberOfTasks().equals(this.getTotalNumberOfTasks()) == false)
            return false;
        if (other.getNumberOfTasksSucceeded() == null ^ this.getNumberOfTasksSucceeded() == null)
            return false;
        if (other.getNumberOfTasksSucceeded() != null && other.getNumberOfTasksSucceeded().equals(this.getNumberOfTasksSucceeded()) == false)
            return false;
        if (other.getNumberOfTasksFailed() == null ^ this.getNumberOfTasksFailed() == null)
            return false;
        if (other.getNumberOfTasksFailed() != null && other.getNumberOfTasksFailed().equals(this.getNumberOfTasksFailed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalNumberOfTasks() == null) ? 0 : getTotalNumberOfTasks().hashCode());
        hashCode = prime * hashCode + ((getNumberOfTasksSucceeded() == null) ? 0 : getNumberOfTasksSucceeded().hashCode());
        hashCode = prime * hashCode + ((getNumberOfTasksFailed() == null) ? 0 : getNumberOfTasksFailed().hashCode());
        return hashCode;
    }

    @Override
    public JobProgressSummary clone() {
        try {
            return (JobProgressSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
