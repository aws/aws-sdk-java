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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateDataRepositoryTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataRepositoryTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the data repository task that you just created.
     * </p>
     */
    private DataRepositoryTask dataRepositoryTask;

    /**
     * <p>
     * The description of the data repository task that you just created.
     * </p>
     * 
     * @param dataRepositoryTask
     *        The description of the data repository task that you just created.
     */

    public void setDataRepositoryTask(DataRepositoryTask dataRepositoryTask) {
        this.dataRepositoryTask = dataRepositoryTask;
    }

    /**
     * <p>
     * The description of the data repository task that you just created.
     * </p>
     * 
     * @return The description of the data repository task that you just created.
     */

    public DataRepositoryTask getDataRepositoryTask() {
        return this.dataRepositoryTask;
    }

    /**
     * <p>
     * The description of the data repository task that you just created.
     * </p>
     * 
     * @param dataRepositoryTask
     *        The description of the data repository task that you just created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataRepositoryTaskResult withDataRepositoryTask(DataRepositoryTask dataRepositoryTask) {
        setDataRepositoryTask(dataRepositoryTask);
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
        if (getDataRepositoryTask() != null)
            sb.append("DataRepositoryTask: ").append(getDataRepositoryTask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataRepositoryTaskResult == false)
            return false;
        CreateDataRepositoryTaskResult other = (CreateDataRepositoryTaskResult) obj;
        if (other.getDataRepositoryTask() == null ^ this.getDataRepositoryTask() == null)
            return false;
        if (other.getDataRepositoryTask() != null && other.getDataRepositoryTask().equals(this.getDataRepositoryTask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataRepositoryTask() == null) ? 0 : getDataRepositoryTask().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataRepositoryTaskResult clone() {
        try {
            return (CreateDataRepositoryTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
