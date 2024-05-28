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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the Amazon S3 bucket where the seed audience for the generating audience is stored.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/AudienceGenerationJobDataSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudienceGenerationJobDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the Amazon S3 bucket where the seed audience for the generating audience is stored. A valid data source
     * is a JSON line file in the following format:
     * </p>
     * <p>
     * <code>{"user_id": "111111"}</code>
     * </p>
     * <p>
     * <code>{"user_id": "222222"}</code>
     * </p>
     * <p>
     * <code>...</code>
     * </p>
     */
    private S3ConfigMap dataSource;
    /**
     * <p>
     * The ARN of the IAM role that can read the Amazon S3 bucket where the training data is stored.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Defines the Amazon S3 bucket where the seed audience for the generating audience is stored. A valid data source
     * is a JSON line file in the following format:
     * </p>
     * <p>
     * <code>{"user_id": "111111"}</code>
     * </p>
     * <p>
     * <code>{"user_id": "222222"}</code>
     * </p>
     * <p>
     * <code>...</code>
     * </p>
     * 
     * @param dataSource
     *        Defines the Amazon S3 bucket where the seed audience for the generating audience is stored. A valid data
     *        source is a JSON line file in the following format:</p>
     *        <p>
     *        <code>{"user_id": "111111"}</code>
     *        </p>
     *        <p>
     *        <code>{"user_id": "222222"}</code>
     *        </p>
     *        <p>
     *        <code>...</code>
     */

    public void setDataSource(S3ConfigMap dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * Defines the Amazon S3 bucket where the seed audience for the generating audience is stored. A valid data source
     * is a JSON line file in the following format:
     * </p>
     * <p>
     * <code>{"user_id": "111111"}</code>
     * </p>
     * <p>
     * <code>{"user_id": "222222"}</code>
     * </p>
     * <p>
     * <code>...</code>
     * </p>
     * 
     * @return Defines the Amazon S3 bucket where the seed audience for the generating audience is stored. A valid data
     *         source is a JSON line file in the following format:</p>
     *         <p>
     *         <code>{"user_id": "111111"}</code>
     *         </p>
     *         <p>
     *         <code>{"user_id": "222222"}</code>
     *         </p>
     *         <p>
     *         <code>...</code>
     */

    public S3ConfigMap getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * Defines the Amazon S3 bucket where the seed audience for the generating audience is stored. A valid data source
     * is a JSON line file in the following format:
     * </p>
     * <p>
     * <code>{"user_id": "111111"}</code>
     * </p>
     * <p>
     * <code>{"user_id": "222222"}</code>
     * </p>
     * <p>
     * <code>...</code>
     * </p>
     * 
     * @param dataSource
     *        Defines the Amazon S3 bucket where the seed audience for the generating audience is stored. A valid data
     *        source is a JSON line file in the following format:</p>
     *        <p>
     *        <code>{"user_id": "111111"}</code>
     *        </p>
     *        <p>
     *        <code>{"user_id": "222222"}</code>
     *        </p>
     *        <p>
     *        <code>...</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceGenerationJobDataSource withDataSource(S3ConfigMap dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that can read the Amazon S3 bucket where the training data is stored.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that can read the Amazon S3 bucket where the training data is stored.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that can read the Amazon S3 bucket where the training data is stored.
     * </p>
     * 
     * @return The ARN of the IAM role that can read the Amazon S3 bucket where the training data is stored.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that can read the Amazon S3 bucket where the training data is stored.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that can read the Amazon S3 bucket where the training data is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceGenerationJobDataSource withRoleArn(String roleArn) {
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
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

        if (obj instanceof AudienceGenerationJobDataSource == false)
            return false;
        AudienceGenerationJobDataSource other = (AudienceGenerationJobDataSource) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
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

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public AudienceGenerationJobDataSource clone() {
        try {
            return (AudienceGenerationJobDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanroomsml.model.transform.AudienceGenerationJobDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
