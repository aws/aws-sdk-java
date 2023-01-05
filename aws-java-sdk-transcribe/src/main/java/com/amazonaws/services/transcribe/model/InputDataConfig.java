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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the Amazon S3 location of the training data you want to use to create a new custom language model, and
 * permissions to access this location.
 * </p>
 * <p>
 * When using <code>InputDataConfig</code>, you must include these sub-parameters: <code>S3Uri</code> and
 * <code>DataAccessRoleArn</code>. You can optionally include <code>TuningDataS3Uri</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/InputDataConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location (URI) of the text files you want to use to train your custom language model.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-model-training-data/</code>
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * The Amazon S3 location (URI) of the text files you want to use to tune your custom language model.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-model-tuning-data/</code>
     * </p>
     */
    private String tuningDataS3Uri;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files. If the role that you specify doesn’t have the appropriate permissions to access the specified
     * Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * The Amazon S3 location (URI) of the text files you want to use to train your custom language model.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-model-training-data/</code>
     * </p>
     * 
     * @param s3Uri
     *        The Amazon S3 location (URI) of the text files you want to use to train your custom language model.</p>
     *        <p>
     *        Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-model-training-data/</code>
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location (URI) of the text files you want to use to train your custom language model.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-model-training-data/</code>
     * </p>
     * 
     * @return The Amazon S3 location (URI) of the text files you want to use to train your custom language model.</p>
     *         <p>
     *         Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-model-training-data/</code>
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location (URI) of the text files you want to use to train your custom language model.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-model-training-data/</code>
     * </p>
     * 
     * @param s3Uri
     *        The Amazon S3 location (URI) of the text files you want to use to train your custom language model.</p>
     *        <p>
     *        Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-model-training-data/</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDataConfig withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location (URI) of the text files you want to use to tune your custom language model.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-model-tuning-data/</code>
     * </p>
     * 
     * @param tuningDataS3Uri
     *        The Amazon S3 location (URI) of the text files you want to use to tune your custom language model.</p>
     *        <p>
     *        Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-model-tuning-data/</code>
     */

    public void setTuningDataS3Uri(String tuningDataS3Uri) {
        this.tuningDataS3Uri = tuningDataS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location (URI) of the text files you want to use to tune your custom language model.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-model-tuning-data/</code>
     * </p>
     * 
     * @return The Amazon S3 location (URI) of the text files you want to use to tune your custom language model.</p>
     *         <p>
     *         Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-model-tuning-data/</code>
     */

    public String getTuningDataS3Uri() {
        return this.tuningDataS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location (URI) of the text files you want to use to tune your custom language model.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-model-tuning-data/</code>
     * </p>
     * 
     * @param tuningDataS3Uri
     *        The Amazon S3 location (URI) of the text files you want to use to tune your custom language model.</p>
     *        <p>
     *        Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-model-tuning-data/</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDataConfig withTuningDataS3Uri(String tuningDataS3Uri) {
        setTuningDataS3Uri(tuningDataS3Uri);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files. If the role that you specify doesn’t have the appropriate permissions to access the specified
     * Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that
     *        contains your input files. If the role that you specify doesn’t have the appropriate permissions to access
     *        the specified Amazon S3 location, your request fails.</p>
     *        <p>
     *        IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     *        example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM
     *        ARNs</a>.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files. If the role that you specify doesn’t have the appropriate permissions to access the specified
     * Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that
     *         contains your input files. If the role that you specify doesn’t have the appropriate permissions to
     *         access the specified Amazon S3 location, your request fails.</p>
     *         <p>
     *         IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     *         example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM
     *         ARNs</a>.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains
     * your input files. If the role that you specify doesn’t have the appropriate permissions to access the specified
     * Amazon S3 location, your request fails.
     * </p>
     * <p>
     * IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For example:
     * <code>arn:aws:iam::111122223333:role/Admin</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM ARNs</a>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that
     *        contains your input files. If the role that you specify doesn’t have the appropriate permissions to access
     *        the specified Amazon S3 location, your request fails.</p>
     *        <p>
     *        IAM role ARNs have the format <code>arn:partition:iam::account:role/role-name-with-path</code>. For
     *        example: <code>arn:aws:iam::111122223333:role/Admin</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns">IAM
     *        ARNs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDataConfig withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
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
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri()).append(",");
        if (getTuningDataS3Uri() != null)
            sb.append("TuningDataS3Uri: ").append(getTuningDataS3Uri()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDataConfig == false)
            return false;
        InputDataConfig other = (InputDataConfig) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getTuningDataS3Uri() == null ^ this.getTuningDataS3Uri() == null)
            return false;
        if (other.getTuningDataS3Uri() != null && other.getTuningDataS3Uri().equals(this.getTuningDataS3Uri()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getTuningDataS3Uri() == null) ? 0 : getTuningDataS3Uri().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public InputDataConfig clone() {
        try {
            return (InputDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.InputDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
