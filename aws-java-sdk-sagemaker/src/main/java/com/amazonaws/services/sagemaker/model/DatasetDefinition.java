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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for Dataset Definition inputs. The Dataset Definition input must specify exactly one of either
 * <code>AthenaDatasetDefinition</code> or <code>RedshiftDatasetDefinition</code> types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DatasetDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetDefinition implements Serializable, Cloneable, StructuredPojo {

    private AthenaDatasetDefinition athenaDatasetDefinition;

    private RedshiftDatasetDefinition redshiftDatasetDefinition;
    /**
     * <p>
     * The local path where you want Amazon SageMaker to download the Dataset Definition inputs to run a processing job.
     * <code>LocalPath</code> is an absolute path to the input data. This is a required parameter when
     * <code>AppManaged</code> is <code>False</code> (default).
     * </p>
     */
    private String localPath;
    /**
     * <p>
     * Whether the generated dataset is <code>FullyReplicated</code> or <code>ShardedByS3Key</code> (default).
     * </p>
     */
    private String dataDistributionType;
    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In <code>File</code> (default) mode, Amazon
     * SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon EBS) volumes
     * before starting your training algorithm. This is the most commonly used input mode. In <code>Pipe</code> mode,
     * Amazon SageMaker streams input data from the source directly to your algorithm without using the EBS volume.
     * </p>
     */
    private String inputMode;

    /**
     * @param athenaDatasetDefinition
     */

    public void setAthenaDatasetDefinition(AthenaDatasetDefinition athenaDatasetDefinition) {
        this.athenaDatasetDefinition = athenaDatasetDefinition;
    }

    /**
     * @return
     */

    public AthenaDatasetDefinition getAthenaDatasetDefinition() {
        return this.athenaDatasetDefinition;
    }

    /**
     * @param athenaDatasetDefinition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetDefinition withAthenaDatasetDefinition(AthenaDatasetDefinition athenaDatasetDefinition) {
        setAthenaDatasetDefinition(athenaDatasetDefinition);
        return this;
    }

    /**
     * @param redshiftDatasetDefinition
     */

    public void setRedshiftDatasetDefinition(RedshiftDatasetDefinition redshiftDatasetDefinition) {
        this.redshiftDatasetDefinition = redshiftDatasetDefinition;
    }

    /**
     * @return
     */

    public RedshiftDatasetDefinition getRedshiftDatasetDefinition() {
        return this.redshiftDatasetDefinition;
    }

    /**
     * @param redshiftDatasetDefinition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetDefinition withRedshiftDatasetDefinition(RedshiftDatasetDefinition redshiftDatasetDefinition) {
        setRedshiftDatasetDefinition(redshiftDatasetDefinition);
        return this;
    }

    /**
     * <p>
     * The local path where you want Amazon SageMaker to download the Dataset Definition inputs to run a processing job.
     * <code>LocalPath</code> is an absolute path to the input data. This is a required parameter when
     * <code>AppManaged</code> is <code>False</code> (default).
     * </p>
     * 
     * @param localPath
     *        The local path where you want Amazon SageMaker to download the Dataset Definition inputs to run a
     *        processing job. <code>LocalPath</code> is an absolute path to the input data. This is a required parameter
     *        when <code>AppManaged</code> is <code>False</code> (default).
     */

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * The local path where you want Amazon SageMaker to download the Dataset Definition inputs to run a processing job.
     * <code>LocalPath</code> is an absolute path to the input data. This is a required parameter when
     * <code>AppManaged</code> is <code>False</code> (default).
     * </p>
     * 
     * @return The local path where you want Amazon SageMaker to download the Dataset Definition inputs to run a
     *         processing job. <code>LocalPath</code> is an absolute path to the input data. This is a required
     *         parameter when <code>AppManaged</code> is <code>False</code> (default).
     */

    public String getLocalPath() {
        return this.localPath;
    }

    /**
     * <p>
     * The local path where you want Amazon SageMaker to download the Dataset Definition inputs to run a processing job.
     * <code>LocalPath</code> is an absolute path to the input data. This is a required parameter when
     * <code>AppManaged</code> is <code>False</code> (default).
     * </p>
     * 
     * @param localPath
     *        The local path where you want Amazon SageMaker to download the Dataset Definition inputs to run a
     *        processing job. <code>LocalPath</code> is an absolute path to the input data. This is a required parameter
     *        when <code>AppManaged</code> is <code>False</code> (default).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetDefinition withLocalPath(String localPath) {
        setLocalPath(localPath);
        return this;
    }

    /**
     * <p>
     * Whether the generated dataset is <code>FullyReplicated</code> or <code>ShardedByS3Key</code> (default).
     * </p>
     * 
     * @param dataDistributionType
     *        Whether the generated dataset is <code>FullyReplicated</code> or <code>ShardedByS3Key</code> (default).
     * @see DataDistributionType
     */

    public void setDataDistributionType(String dataDistributionType) {
        this.dataDistributionType = dataDistributionType;
    }

    /**
     * <p>
     * Whether the generated dataset is <code>FullyReplicated</code> or <code>ShardedByS3Key</code> (default).
     * </p>
     * 
     * @return Whether the generated dataset is <code>FullyReplicated</code> or <code>ShardedByS3Key</code> (default).
     * @see DataDistributionType
     */

    public String getDataDistributionType() {
        return this.dataDistributionType;
    }

    /**
     * <p>
     * Whether the generated dataset is <code>FullyReplicated</code> or <code>ShardedByS3Key</code> (default).
     * </p>
     * 
     * @param dataDistributionType
     *        Whether the generated dataset is <code>FullyReplicated</code> or <code>ShardedByS3Key</code> (default).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataDistributionType
     */

    public DatasetDefinition withDataDistributionType(String dataDistributionType) {
        setDataDistributionType(dataDistributionType);
        return this;
    }

    /**
     * <p>
     * Whether the generated dataset is <code>FullyReplicated</code> or <code>ShardedByS3Key</code> (default).
     * </p>
     * 
     * @param dataDistributionType
     *        Whether the generated dataset is <code>FullyReplicated</code> or <code>ShardedByS3Key</code> (default).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataDistributionType
     */

    public DatasetDefinition withDataDistributionType(DataDistributionType dataDistributionType) {
        this.dataDistributionType = dataDistributionType.toString();
        return this;
    }

    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In <code>File</code> (default) mode, Amazon
     * SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon EBS) volumes
     * before starting your training algorithm. This is the most commonly used input mode. In <code>Pipe</code> mode,
     * Amazon SageMaker streams input data from the source directly to your algorithm without using the EBS volume.
     * </p>
     * 
     * @param inputMode
     *        Whether to use <code>File</code> or <code>Pipe</code> input mode. In <code>File</code> (default) mode,
     *        Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon
     *        EBS) volumes before starting your training algorithm. This is the most commonly used input mode. In
     *        <code>Pipe</code> mode, Amazon SageMaker streams input data from the source directly to your algorithm
     *        without using the EBS volume.
     * @see InputMode
     */

    public void setInputMode(String inputMode) {
        this.inputMode = inputMode;
    }

    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In <code>File</code> (default) mode, Amazon
     * SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon EBS) volumes
     * before starting your training algorithm. This is the most commonly used input mode. In <code>Pipe</code> mode,
     * Amazon SageMaker streams input data from the source directly to your algorithm without using the EBS volume.
     * </p>
     * 
     * @return Whether to use <code>File</code> or <code>Pipe</code> input mode. In <code>File</code> (default) mode,
     *         Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon
     *         EBS) volumes before starting your training algorithm. This is the most commonly used input mode. In
     *         <code>Pipe</code> mode, Amazon SageMaker streams input data from the source directly to your algorithm
     *         without using the EBS volume.
     * @see InputMode
     */

    public String getInputMode() {
        return this.inputMode;
    }

    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In <code>File</code> (default) mode, Amazon
     * SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon EBS) volumes
     * before starting your training algorithm. This is the most commonly used input mode. In <code>Pipe</code> mode,
     * Amazon SageMaker streams input data from the source directly to your algorithm without using the EBS volume.
     * </p>
     * 
     * @param inputMode
     *        Whether to use <code>File</code> or <code>Pipe</code> input mode. In <code>File</code> (default) mode,
     *        Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon
     *        EBS) volumes before starting your training algorithm. This is the most commonly used input mode. In
     *        <code>Pipe</code> mode, Amazon SageMaker streams input data from the source directly to your algorithm
     *        without using the EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputMode
     */

    public DatasetDefinition withInputMode(String inputMode) {
        setInputMode(inputMode);
        return this;
    }

    /**
     * <p>
     * Whether to use <code>File</code> or <code>Pipe</code> input mode. In <code>File</code> (default) mode, Amazon
     * SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon EBS) volumes
     * before starting your training algorithm. This is the most commonly used input mode. In <code>Pipe</code> mode,
     * Amazon SageMaker streams input data from the source directly to your algorithm without using the EBS volume.
     * </p>
     * 
     * @param inputMode
     *        Whether to use <code>File</code> or <code>Pipe</code> input mode. In <code>File</code> (default) mode,
     *        Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon
     *        EBS) volumes before starting your training algorithm. This is the most commonly used input mode. In
     *        <code>Pipe</code> mode, Amazon SageMaker streams input data from the source directly to your algorithm
     *        without using the EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputMode
     */

    public DatasetDefinition withInputMode(InputMode inputMode) {
        this.inputMode = inputMode.toString();
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
        if (getAthenaDatasetDefinition() != null)
            sb.append("AthenaDatasetDefinition: ").append(getAthenaDatasetDefinition()).append(",");
        if (getRedshiftDatasetDefinition() != null)
            sb.append("RedshiftDatasetDefinition: ").append(getRedshiftDatasetDefinition()).append(",");
        if (getLocalPath() != null)
            sb.append("LocalPath: ").append(getLocalPath()).append(",");
        if (getDataDistributionType() != null)
            sb.append("DataDistributionType: ").append(getDataDistributionType()).append(",");
        if (getInputMode() != null)
            sb.append("InputMode: ").append(getInputMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetDefinition == false)
            return false;
        DatasetDefinition other = (DatasetDefinition) obj;
        if (other.getAthenaDatasetDefinition() == null ^ this.getAthenaDatasetDefinition() == null)
            return false;
        if (other.getAthenaDatasetDefinition() != null && other.getAthenaDatasetDefinition().equals(this.getAthenaDatasetDefinition()) == false)
            return false;
        if (other.getRedshiftDatasetDefinition() == null ^ this.getRedshiftDatasetDefinition() == null)
            return false;
        if (other.getRedshiftDatasetDefinition() != null && other.getRedshiftDatasetDefinition().equals(this.getRedshiftDatasetDefinition()) == false)
            return false;
        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        if (other.getDataDistributionType() == null ^ this.getDataDistributionType() == null)
            return false;
        if (other.getDataDistributionType() != null && other.getDataDistributionType().equals(this.getDataDistributionType()) == false)
            return false;
        if (other.getInputMode() == null ^ this.getInputMode() == null)
            return false;
        if (other.getInputMode() != null && other.getInputMode().equals(this.getInputMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAthenaDatasetDefinition() == null) ? 0 : getAthenaDatasetDefinition().hashCode());
        hashCode = prime * hashCode + ((getRedshiftDatasetDefinition() == null) ? 0 : getRedshiftDatasetDefinition().hashCode());
        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        hashCode = prime * hashCode + ((getDataDistributionType() == null) ? 0 : getDataDistributionType().hashCode());
        hashCode = prime * hashCode + ((getInputMode() == null) ? 0 : getInputMode().hashCode());
        return hashCode;
    }

    @Override
    public DatasetDefinition clone() {
        try {
            return (DatasetDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DatasetDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
