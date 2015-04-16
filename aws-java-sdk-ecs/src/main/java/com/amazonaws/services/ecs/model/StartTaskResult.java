/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * 
 */
public class StartTaskResult implements Serializable, Cloneable {

    /**
     * A full description of the tasks that were started. Each task that was
     * successfully placed on your container instances will be described
     * here.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Task> tasks;

    /**
     * Any failed tasks from your <code>StartTask</code> action are listed
     * here.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Failure> failures;

    /**
     * A full description of the tasks that were started. Each task that was
     * successfully placed on your container instances will be described
     * here.
     *
     * @return A full description of the tasks that were started. Each task that was
     *         successfully placed on your container instances will be described
     *         here.
     */
    public java.util.List<Task> getTasks() {
        if (tasks == null) {
              tasks = new com.amazonaws.internal.ListWithAutoConstructFlag<Task>();
              tasks.setAutoConstruct(true);
        }
        return tasks;
    }
    
    /**
     * A full description of the tasks that were started. Each task that was
     * successfully placed on your container instances will be described
     * here.
     *
     * @param tasks A full description of the tasks that were started. Each task that was
     *         successfully placed on your container instances will be described
     *         here.
     */
    public void setTasks(java.util.Collection<Task> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Task> tasksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Task>(tasks.size());
        tasksCopy.addAll(tasks);
        this.tasks = tasksCopy;
    }
    
    /**
     * A full description of the tasks that were started. Each task that was
     * successfully placed on your container instances will be described
     * here.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTasks(java.util.Collection)} or {@link
     * #withTasks(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tasks A full description of the tasks that were started. Each task that was
     *         successfully placed on your container instances will be described
     *         here.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartTaskResult withTasks(Task... tasks) {
        if (getTasks() == null) setTasks(new java.util.ArrayList<Task>(tasks.length));
        for (Task value : tasks) {
            getTasks().add(value);
        }
        return this;
    }
    
    /**
     * A full description of the tasks that were started. Each task that was
     * successfully placed on your container instances will be described
     * here.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tasks A full description of the tasks that were started. Each task that was
     *         successfully placed on your container instances will be described
     *         here.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartTaskResult withTasks(java.util.Collection<Task> tasks) {
        if (tasks == null) {
            this.tasks = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Task> tasksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Task>(tasks.size());
            tasksCopy.addAll(tasks);
            this.tasks = tasksCopy;
        }

        return this;
    }

    /**
     * Any failed tasks from your <code>StartTask</code> action are listed
     * here.
     *
     * @return Any failed tasks from your <code>StartTask</code> action are listed
     *         here.
     */
    public java.util.List<Failure> getFailures() {
        if (failures == null) {
              failures = new com.amazonaws.internal.ListWithAutoConstructFlag<Failure>();
              failures.setAutoConstruct(true);
        }
        return failures;
    }
    
    /**
     * Any failed tasks from your <code>StartTask</code> action are listed
     * here.
     *
     * @param failures Any failed tasks from your <code>StartTask</code> action are listed
     *         here.
     */
    public void setFailures(java.util.Collection<Failure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Failure> failuresCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Failure>(failures.size());
        failuresCopy.addAll(failures);
        this.failures = failuresCopy;
    }
    
    /**
     * Any failed tasks from your <code>StartTask</code> action are listed
     * here.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFailures(java.util.Collection)} or {@link
     * #withFailures(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failures Any failed tasks from your <code>StartTask</code> action are listed
     *         here.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartTaskResult withFailures(Failure... failures) {
        if (getFailures() == null) setFailures(new java.util.ArrayList<Failure>(failures.length));
        for (Failure value : failures) {
            getFailures().add(value);
        }
        return this;
    }
    
    /**
     * Any failed tasks from your <code>StartTask</code> action are listed
     * here.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failures Any failed tasks from your <code>StartTask</code> action are listed
     *         here.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartTaskResult withFailures(java.util.Collection<Failure> failures) {
        if (failures == null) {
            this.failures = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Failure> failuresCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Failure>(failures.size());
            failuresCopy.addAll(failures);
            this.failures = failuresCopy;
        }

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
        if (getTasks() != null) sb.append("Tasks: " + getTasks() + ",");
        if (getFailures() != null) sb.append("Failures: " + getFailures() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTasks() == null) ? 0 : getTasks().hashCode()); 
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StartTaskResult == false) return false;
        StartTaskResult other = (StartTaskResult)obj;
        
        if (other.getTasks() == null ^ this.getTasks() == null) return false;
        if (other.getTasks() != null && other.getTasks().equals(this.getTasks()) == false) return false; 
        if (other.getFailures() == null ^ this.getFailures() == null) return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false) return false; 
        return true;
    }
    
    @Override
    public StartTaskResult clone() {
        try {
            return (StartTaskResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    