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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDataDeletionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataDeletionJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the data deletion job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED
     * </p>
     * </li>
     * </ul>
     */
    private DataDeletionJob dataDeletionJob;

    /**
     * <p>
     * Information about the data deletion job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataDeletionJob
     *        Information about the data deletion job, including the status.</p>
     *        <p>
     *        The status is one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN_PROGRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED
     *        </p>
     *        </li>
     */

    public void setDataDeletionJob(DataDeletionJob dataDeletionJob) {
        this.dataDeletionJob = dataDeletionJob;
    }

    /**
     * <p>
     * Information about the data deletion job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the data deletion job, including the status.</p>
     *         <p>
     *         The status is one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         PENDING
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IN_PROGRESS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         COMPLETED
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FAILED
     *         </p>
     *         </li>
     */

    public DataDeletionJob getDataDeletionJob() {
        return this.dataDeletionJob;
    }

    /**
     * <p>
     * Information about the data deletion job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataDeletionJob
     *        Information about the data deletion job, including the status.</p>
     *        <p>
     *        The status is one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IN_PROGRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataDeletionJobResult withDataDeletionJob(DataDeletionJob dataDeletionJob) {
        setDataDeletionJob(dataDeletionJob);
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
        if (getDataDeletionJob() != null)
            sb.append("DataDeletionJob: ").append(getDataDeletionJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDataDeletionJobResult == false)
            return false;
        DescribeDataDeletionJobResult other = (DescribeDataDeletionJobResult) obj;
        if (other.getDataDeletionJob() == null ^ this.getDataDeletionJob() == null)
            return false;
        if (other.getDataDeletionJob() != null && other.getDataDeletionJob().equals(this.getDataDeletionJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataDeletionJob() == null) ? 0 : getDataDeletionJob().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDataDeletionJobResult clone() {
        try {
            return (DescribeDataDeletionJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
