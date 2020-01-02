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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetImportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetImportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the dataset import job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     */
    private DatasetImportJob datasetImportJob;

    /**
     * <p>
     * Information about the dataset import job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param datasetImportJob
     *        Information about the dataset import job, including the status.</p>
     *        <p>
     *        The status is one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE IN_PROGRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE FAILED
     *        </p>
     *        </li>
     */

    public void setDatasetImportJob(DatasetImportJob datasetImportJob) {
        this.datasetImportJob = datasetImportJob;
    }

    /**
     * <p>
     * Information about the dataset import job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the dataset import job, including the status.</p>
     *         <p>
     *         The status is one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE IN_PROGRESS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE FAILED
     *         </p>
     *         </li>
     */

    public DatasetImportJob getDatasetImportJob() {
        return this.datasetImportJob;
    }

    /**
     * <p>
     * Information about the dataset import job, including the status.
     * </p>
     * <p>
     * The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param datasetImportJob
     *        Information about the dataset import job, including the status.</p>
     *        <p>
     *        The status is one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE IN_PROGRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE FAILED
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetImportJobResult withDatasetImportJob(DatasetImportJob datasetImportJob) {
        setDatasetImportJob(datasetImportJob);
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
        if (getDatasetImportJob() != null)
            sb.append("DatasetImportJob: ").append(getDatasetImportJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatasetImportJobResult == false)
            return false;
        DescribeDatasetImportJobResult other = (DescribeDatasetImportJobResult) obj;
        if (other.getDatasetImportJob() == null ^ this.getDatasetImportJob() == null)
            return false;
        if (other.getDatasetImportJob() != null && other.getDatasetImportJob().equals(this.getDatasetImportJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetImportJob() == null) ? 0 : getDatasetImportJob().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatasetImportJobResult clone() {
        try {
            return (DescribeDatasetImportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
