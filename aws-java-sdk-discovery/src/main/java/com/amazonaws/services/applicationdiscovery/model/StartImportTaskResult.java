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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartImportTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of information related to the import task request including status information, times, IDs, the Amazon
     * S3 Object URL for the import file, and more.
     * </p>
     */
    private ImportTask task;

    /**
     * <p>
     * An array of information related to the import task request including status information, times, IDs, the Amazon
     * S3 Object URL for the import file, and more.
     * </p>
     * 
     * @param task
     *        An array of information related to the import task request including status information, times, IDs, the
     *        Amazon S3 Object URL for the import file, and more.
     */

    public void setTask(ImportTask task) {
        this.task = task;
    }

    /**
     * <p>
     * An array of information related to the import task request including status information, times, IDs, the Amazon
     * S3 Object URL for the import file, and more.
     * </p>
     * 
     * @return An array of information related to the import task request including status information, times, IDs, the
     *         Amazon S3 Object URL for the import file, and more.
     */

    public ImportTask getTask() {
        return this.task;
    }

    /**
     * <p>
     * An array of information related to the import task request including status information, times, IDs, the Amazon
     * S3 Object URL for the import file, and more.
     * </p>
     * 
     * @param task
     *        An array of information related to the import task request including status information, times, IDs, the
     *        Amazon S3 Object URL for the import file, and more.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportTaskResult withTask(ImportTask task) {
        setTask(task);
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
        if (getTask() != null)
            sb.append("Task: ").append(getTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartImportTaskResult == false)
            return false;
        StartImportTaskResult other = (StartImportTaskResult) obj;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        return hashCode;
    }

    @Override
    public StartImportTaskResult clone() {
        try {
            return (StartImportTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
