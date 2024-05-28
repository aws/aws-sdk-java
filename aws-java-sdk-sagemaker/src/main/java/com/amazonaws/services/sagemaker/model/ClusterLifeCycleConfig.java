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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The lifecycle configuration for a SageMaker HyperPod cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ClusterLifeCycleConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterLifeCycleConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon S3 bucket path where your lifecycle scripts are stored.
     * </p>
     * <important>
     * <p>
     * Make sure that the S3 bucket path starts with <code>s3://sagemaker-</code>. The <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-hyperpod-prerequisites.html#sagemaker-hyperpod-prerequisites-iam-role-for-hyperpod"
     * >IAM role for SageMaker HyperPod</a> has the managed <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-cluster.html">
     * <code>AmazonSageMakerClusterInstanceRolePolicy</code> </a> attached, which allows access to S3 buckets with the
     * specific prefix <code>sagemaker-</code>.
     * </p>
     * </important>
     */
    private String sourceS3Uri;
    /**
     * <p>
     * The file name of the entrypoint script of lifecycle scripts under <code>SourceS3Uri</code>. This entrypoint
     * script runs during cluster creation.
     * </p>
     */
    private String onCreate;

    /**
     * <p>
     * An Amazon S3 bucket path where your lifecycle scripts are stored.
     * </p>
     * <important>
     * <p>
     * Make sure that the S3 bucket path starts with <code>s3://sagemaker-</code>. The <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-hyperpod-prerequisites.html#sagemaker-hyperpod-prerequisites-iam-role-for-hyperpod"
     * >IAM role for SageMaker HyperPod</a> has the managed <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-cluster.html">
     * <code>AmazonSageMakerClusterInstanceRolePolicy</code> </a> attached, which allows access to S3 buckets with the
     * specific prefix <code>sagemaker-</code>.
     * </p>
     * </important>
     * 
     * @param sourceS3Uri
     *        An Amazon S3 bucket path where your lifecycle scripts are stored.</p> <important>
     *        <p>
     *        Make sure that the S3 bucket path starts with <code>s3://sagemaker-</code>. The <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-hyperpod-prerequisites.html#sagemaker-hyperpod-prerequisites-iam-role-for-hyperpod"
     *        >IAM role for SageMaker HyperPod</a> has the managed <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-cluster.html">
     *        <code>AmazonSageMakerClusterInstanceRolePolicy</code> </a> attached, which allows access to S3 buckets
     *        with the specific prefix <code>sagemaker-</code>.
     *        </p>
     */

    public void setSourceS3Uri(String sourceS3Uri) {
        this.sourceS3Uri = sourceS3Uri;
    }

    /**
     * <p>
     * An Amazon S3 bucket path where your lifecycle scripts are stored.
     * </p>
     * <important>
     * <p>
     * Make sure that the S3 bucket path starts with <code>s3://sagemaker-</code>. The <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-hyperpod-prerequisites.html#sagemaker-hyperpod-prerequisites-iam-role-for-hyperpod"
     * >IAM role for SageMaker HyperPod</a> has the managed <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-cluster.html">
     * <code>AmazonSageMakerClusterInstanceRolePolicy</code> </a> attached, which allows access to S3 buckets with the
     * specific prefix <code>sagemaker-</code>.
     * </p>
     * </important>
     * 
     * @return An Amazon S3 bucket path where your lifecycle scripts are stored.</p> <important>
     *         <p>
     *         Make sure that the S3 bucket path starts with <code>s3://sagemaker-</code>. The <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-hyperpod-prerequisites.html#sagemaker-hyperpod-prerequisites-iam-role-for-hyperpod"
     *         >IAM role for SageMaker HyperPod</a> has the managed <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-cluster.html">
     *         <code>AmazonSageMakerClusterInstanceRolePolicy</code> </a> attached, which allows access to S3 buckets
     *         with the specific prefix <code>sagemaker-</code>.
     *         </p>
     */

    public String getSourceS3Uri() {
        return this.sourceS3Uri;
    }

    /**
     * <p>
     * An Amazon S3 bucket path where your lifecycle scripts are stored.
     * </p>
     * <important>
     * <p>
     * Make sure that the S3 bucket path starts with <code>s3://sagemaker-</code>. The <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-hyperpod-prerequisites.html#sagemaker-hyperpod-prerequisites-iam-role-for-hyperpod"
     * >IAM role for SageMaker HyperPod</a> has the managed <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-cluster.html">
     * <code>AmazonSageMakerClusterInstanceRolePolicy</code> </a> attached, which allows access to S3 buckets with the
     * specific prefix <code>sagemaker-</code>.
     * </p>
     * </important>
     * 
     * @param sourceS3Uri
     *        An Amazon S3 bucket path where your lifecycle scripts are stored.</p> <important>
     *        <p>
     *        Make sure that the S3 bucket path starts with <code>s3://sagemaker-</code>. The <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-hyperpod-prerequisites.html#sagemaker-hyperpod-prerequisites-iam-role-for-hyperpod"
     *        >IAM role for SageMaker HyperPod</a> has the managed <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/security-iam-awsmanpol-cluster.html">
     *        <code>AmazonSageMakerClusterInstanceRolePolicy</code> </a> attached, which allows access to S3 buckets
     *        with the specific prefix <code>sagemaker-</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterLifeCycleConfig withSourceS3Uri(String sourceS3Uri) {
        setSourceS3Uri(sourceS3Uri);
        return this;
    }

    /**
     * <p>
     * The file name of the entrypoint script of lifecycle scripts under <code>SourceS3Uri</code>. This entrypoint
     * script runs during cluster creation.
     * </p>
     * 
     * @param onCreate
     *        The file name of the entrypoint script of lifecycle scripts under <code>SourceS3Uri</code>. This
     *        entrypoint script runs during cluster creation.
     */

    public void setOnCreate(String onCreate) {
        this.onCreate = onCreate;
    }

    /**
     * <p>
     * The file name of the entrypoint script of lifecycle scripts under <code>SourceS3Uri</code>. This entrypoint
     * script runs during cluster creation.
     * </p>
     * 
     * @return The file name of the entrypoint script of lifecycle scripts under <code>SourceS3Uri</code>. This
     *         entrypoint script runs during cluster creation.
     */

    public String getOnCreate() {
        return this.onCreate;
    }

    /**
     * <p>
     * The file name of the entrypoint script of lifecycle scripts under <code>SourceS3Uri</code>. This entrypoint
     * script runs during cluster creation.
     * </p>
     * 
     * @param onCreate
     *        The file name of the entrypoint script of lifecycle scripts under <code>SourceS3Uri</code>. This
     *        entrypoint script runs during cluster creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterLifeCycleConfig withOnCreate(String onCreate) {
        setOnCreate(onCreate);
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
        if (getSourceS3Uri() != null)
            sb.append("SourceS3Uri: ").append(getSourceS3Uri()).append(",");
        if (getOnCreate() != null)
            sb.append("OnCreate: ").append(getOnCreate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterLifeCycleConfig == false)
            return false;
        ClusterLifeCycleConfig other = (ClusterLifeCycleConfig) obj;
        if (other.getSourceS3Uri() == null ^ this.getSourceS3Uri() == null)
            return false;
        if (other.getSourceS3Uri() != null && other.getSourceS3Uri().equals(this.getSourceS3Uri()) == false)
            return false;
        if (other.getOnCreate() == null ^ this.getOnCreate() == null)
            return false;
        if (other.getOnCreate() != null && other.getOnCreate().equals(this.getOnCreate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceS3Uri() == null) ? 0 : getSourceS3Uri().hashCode());
        hashCode = prime * hashCode + ((getOnCreate() == null) ? 0 : getOnCreate().hashCode());
        return hashCode;
    }

    @Override
    public ClusterLifeCycleConfig clone() {
        try {
            return (ClusterLifeCycleConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ClusterLifeCycleConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
