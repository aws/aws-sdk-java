/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/DeleteParallelData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteParallelDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the parallel data resource that is being deleted.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the parallel data deletion.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the parallel data resource that is being deleted.
     * </p>
     * 
     * @param name
     *        The name of the parallel data resource that is being deleted.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parallel data resource that is being deleted.
     * </p>
     * 
     * @return The name of the parallel data resource that is being deleted.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parallel data resource that is being deleted.
     * </p>
     * 
     * @param name
     *        The name of the parallel data resource that is being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteParallelDataResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the parallel data deletion.
     * </p>
     * 
     * @param status
     *        The status of the parallel data deletion.
     * @see ParallelDataStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the parallel data deletion.
     * </p>
     * 
     * @return The status of the parallel data deletion.
     * @see ParallelDataStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the parallel data deletion.
     * </p>
     * 
     * @param status
     *        The status of the parallel data deletion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParallelDataStatus
     */

    public DeleteParallelDataResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the parallel data deletion.
     * </p>
     * 
     * @param status
     *        The status of the parallel data deletion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParallelDataStatus
     */

    public DeleteParallelDataResult withStatus(ParallelDataStatus status) {
        this.status = status.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteParallelDataResult == false)
            return false;
        DeleteParallelDataResult other = (DeleteParallelDataResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteParallelDataResult clone() {
        try {
            return (DeleteParallelDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
