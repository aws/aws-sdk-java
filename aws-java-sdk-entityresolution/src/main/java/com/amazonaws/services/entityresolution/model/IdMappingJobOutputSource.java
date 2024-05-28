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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing <code>KMSArn</code>, <code>OutputS3Path</code>, and <code>RoleARN</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/IdMappingJobOutputSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdMappingJobOutputSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Customer KMS ARN for encryption at rest. If not provided, system will use an Entity Resolution managed KMS key.
     * </p>
     */
    private String kMSArn;
    /**
     * <p>
     * The S3 path to which Entity Resolution will write the output table.
     * </p>
     */
    private String outputS3Path;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web Services
     * resources on your behalf as part of workflow execution.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Customer KMS ARN for encryption at rest. If not provided, system will use an Entity Resolution managed KMS key.
     * </p>
     * 
     * @param kMSArn
     *        Customer KMS ARN for encryption at rest. If not provided, system will use an Entity Resolution managed KMS
     *        key.
     */

    public void setKMSArn(String kMSArn) {
        this.kMSArn = kMSArn;
    }

    /**
     * <p>
     * Customer KMS ARN for encryption at rest. If not provided, system will use an Entity Resolution managed KMS key.
     * </p>
     * 
     * @return Customer KMS ARN for encryption at rest. If not provided, system will use an Entity Resolution managed
     *         KMS key.
     */

    public String getKMSArn() {
        return this.kMSArn;
    }

    /**
     * <p>
     * Customer KMS ARN for encryption at rest. If not provided, system will use an Entity Resolution managed KMS key.
     * </p>
     * 
     * @param kMSArn
     *        Customer KMS ARN for encryption at rest. If not provided, system will use an Entity Resolution managed KMS
     *        key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdMappingJobOutputSource withKMSArn(String kMSArn) {
        setKMSArn(kMSArn);
        return this;
    }

    /**
     * <p>
     * The S3 path to which Entity Resolution will write the output table.
     * </p>
     * 
     * @param outputS3Path
     *        The S3 path to which Entity Resolution will write the output table.
     */

    public void setOutputS3Path(String outputS3Path) {
        this.outputS3Path = outputS3Path;
    }

    /**
     * <p>
     * The S3 path to which Entity Resolution will write the output table.
     * </p>
     * 
     * @return The S3 path to which Entity Resolution will write the output table.
     */

    public String getOutputS3Path() {
        return this.outputS3Path;
    }

    /**
     * <p>
     * The S3 path to which Entity Resolution will write the output table.
     * </p>
     * 
     * @param outputS3Path
     *        The S3 path to which Entity Resolution will write the output table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdMappingJobOutputSource withOutputS3Path(String outputS3Path) {
        setOutputS3Path(outputS3Path);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web Services
     * resources on your behalf as part of workflow execution.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web
     *        Services resources on your behalf as part of workflow execution.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web Services
     * resources on your behalf as part of workflow execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web
     *         Services resources on your behalf as part of workflow execution.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web Services
     * resources on your behalf as part of workflow execution.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role. Entity Resolution assumes this role to access Amazon Web
     *        Services resources on your behalf as part of workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdMappingJobOutputSource withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getKMSArn() != null)
            sb.append("KMSArn: ").append(getKMSArn()).append(",");
        if (getOutputS3Path() != null)
            sb.append("OutputS3Path: ").append(getOutputS3Path()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdMappingJobOutputSource == false)
            return false;
        IdMappingJobOutputSource other = (IdMappingJobOutputSource) obj;
        if (other.getKMSArn() == null ^ this.getKMSArn() == null)
            return false;
        if (other.getKMSArn() != null && other.getKMSArn().equals(this.getKMSArn()) == false)
            return false;
        if (other.getOutputS3Path() == null ^ this.getOutputS3Path() == null)
            return false;
        if (other.getOutputS3Path() != null && other.getOutputS3Path().equals(this.getOutputS3Path()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKMSArn() == null) ? 0 : getKMSArn().hashCode());
        hashCode = prime * hashCode + ((getOutputS3Path() == null) ? 0 : getOutputS3Path().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public IdMappingJobOutputSource clone() {
        try {
            return (IdMappingJobOutputSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.IdMappingJobOutputSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
