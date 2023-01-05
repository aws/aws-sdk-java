/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/BatchDescribeModelPackage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDescribeModelPackageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The summaries for the model package versions
     * </p>
     */
    private java.util.Map<String, BatchDescribeModelPackageSummary> modelPackageSummaries;
    /**
     * <p>
     * A map of the resource and BatchDescribeModelPackageError objects reporting the error associated with describing
     * the model package.
     * </p>
     */
    private java.util.Map<String, BatchDescribeModelPackageError> batchDescribeModelPackageErrorMap;

    /**
     * <p>
     * The summaries for the model package versions
     * </p>
     * 
     * @return The summaries for the model package versions
     */

    public java.util.Map<String, BatchDescribeModelPackageSummary> getModelPackageSummaries() {
        return modelPackageSummaries;
    }

    /**
     * <p>
     * The summaries for the model package versions
     * </p>
     * 
     * @param modelPackageSummaries
     *        The summaries for the model package versions
     */

    public void setModelPackageSummaries(java.util.Map<String, BatchDescribeModelPackageSummary> modelPackageSummaries) {
        this.modelPackageSummaries = modelPackageSummaries;
    }

    /**
     * <p>
     * The summaries for the model package versions
     * </p>
     * 
     * @param modelPackageSummaries
     *        The summaries for the model package versions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageResult withModelPackageSummaries(java.util.Map<String, BatchDescribeModelPackageSummary> modelPackageSummaries) {
        setModelPackageSummaries(modelPackageSummaries);
        return this;
    }

    /**
     * Add a single ModelPackageSummaries entry
     *
     * @see BatchDescribeModelPackageResult#withModelPackageSummaries
     * @returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageResult addModelPackageSummariesEntry(String key, BatchDescribeModelPackageSummary value) {
        if (null == this.modelPackageSummaries) {
            this.modelPackageSummaries = new java.util.HashMap<String, BatchDescribeModelPackageSummary>();
        }
        if (this.modelPackageSummaries.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.modelPackageSummaries.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ModelPackageSummaries.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageResult clearModelPackageSummariesEntries() {
        this.modelPackageSummaries = null;
        return this;
    }

    /**
     * <p>
     * A map of the resource and BatchDescribeModelPackageError objects reporting the error associated with describing
     * the model package.
     * </p>
     * 
     * @return A map of the resource and BatchDescribeModelPackageError objects reporting the error associated with
     *         describing the model package.
     */

    public java.util.Map<String, BatchDescribeModelPackageError> getBatchDescribeModelPackageErrorMap() {
        return batchDescribeModelPackageErrorMap;
    }

    /**
     * <p>
     * A map of the resource and BatchDescribeModelPackageError objects reporting the error associated with describing
     * the model package.
     * </p>
     * 
     * @param batchDescribeModelPackageErrorMap
     *        A map of the resource and BatchDescribeModelPackageError objects reporting the error associated with
     *        describing the model package.
     */

    public void setBatchDescribeModelPackageErrorMap(java.util.Map<String, BatchDescribeModelPackageError> batchDescribeModelPackageErrorMap) {
        this.batchDescribeModelPackageErrorMap = batchDescribeModelPackageErrorMap;
    }

    /**
     * <p>
     * A map of the resource and BatchDescribeModelPackageError objects reporting the error associated with describing
     * the model package.
     * </p>
     * 
     * @param batchDescribeModelPackageErrorMap
     *        A map of the resource and BatchDescribeModelPackageError objects reporting the error associated with
     *        describing the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageResult withBatchDescribeModelPackageErrorMap(
            java.util.Map<String, BatchDescribeModelPackageError> batchDescribeModelPackageErrorMap) {
        setBatchDescribeModelPackageErrorMap(batchDescribeModelPackageErrorMap);
        return this;
    }

    /**
     * Add a single BatchDescribeModelPackageErrorMap entry
     *
     * @see BatchDescribeModelPackageResult#withBatchDescribeModelPackageErrorMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageResult addBatchDescribeModelPackageErrorMapEntry(String key, BatchDescribeModelPackageError value) {
        if (null == this.batchDescribeModelPackageErrorMap) {
            this.batchDescribeModelPackageErrorMap = new java.util.HashMap<String, BatchDescribeModelPackageError>();
        }
        if (this.batchDescribeModelPackageErrorMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.batchDescribeModelPackageErrorMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BatchDescribeModelPackageErrorMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeModelPackageResult clearBatchDescribeModelPackageErrorMapEntries() {
        this.batchDescribeModelPackageErrorMap = null;
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
        if (getModelPackageSummaries() != null)
            sb.append("ModelPackageSummaries: ").append(getModelPackageSummaries()).append(",");
        if (getBatchDescribeModelPackageErrorMap() != null)
            sb.append("BatchDescribeModelPackageErrorMap: ").append(getBatchDescribeModelPackageErrorMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDescribeModelPackageResult == false)
            return false;
        BatchDescribeModelPackageResult other = (BatchDescribeModelPackageResult) obj;
        if (other.getModelPackageSummaries() == null ^ this.getModelPackageSummaries() == null)
            return false;
        if (other.getModelPackageSummaries() != null && other.getModelPackageSummaries().equals(this.getModelPackageSummaries()) == false)
            return false;
        if (other.getBatchDescribeModelPackageErrorMap() == null ^ this.getBatchDescribeModelPackageErrorMap() == null)
            return false;
        if (other.getBatchDescribeModelPackageErrorMap() != null
                && other.getBatchDescribeModelPackageErrorMap().equals(this.getBatchDescribeModelPackageErrorMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelPackageSummaries() == null) ? 0 : getModelPackageSummaries().hashCode());
        hashCode = prime * hashCode + ((getBatchDescribeModelPackageErrorMap() == null) ? 0 : getBatchDescribeModelPackageErrorMap().hashCode());
        return hashCode;
    }

    @Override
    public BatchDescribeModelPackageResult clone() {
        try {
            return (BatchDescribeModelPackageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
