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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateFaq" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFaqRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The name that should be associated with the FAQ.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the FAQ.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The S3 location of the FAQ input data.
     * </p>
     */
    private S3Path s3Path;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon
     * Kendra</a>.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that contains the FAQ.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     * 
     * @return The identifier of the index that contains the FAQ.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that contains the FAQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaqRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The name that should be associated with the FAQ.
     * </p>
     * 
     * @param name
     *        The name that should be associated with the FAQ.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that should be associated with the FAQ.
     * </p>
     * 
     * @return The name that should be associated with the FAQ.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that should be associated with the FAQ.
     * </p>
     * 
     * @param name
     *        The name that should be associated with the FAQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaqRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the FAQ.
     * </p>
     * 
     * @param description
     *        A description of the FAQ.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the FAQ.
     * </p>
     * 
     * @return A description of the FAQ.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the FAQ.
     * </p>
     * 
     * @param description
     *        A description of the FAQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaqRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The S3 location of the FAQ input data.
     * </p>
     * 
     * @param s3Path
     *        The S3 location of the FAQ input data.
     */

    public void setS3Path(S3Path s3Path) {
        this.s3Path = s3Path;
    }

    /**
     * <p>
     * The S3 location of the FAQ input data.
     * </p>
     * 
     * @return The S3 location of the FAQ input data.
     */

    public S3Path getS3Path() {
        return this.s3Path;
    }

    /**
     * <p>
     * The S3 location of the FAQ input data.
     * </p>
     * 
     * @param s3Path
     *        The S3 location of the FAQ input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaqRequest withS3Path(S3Path s3Path) {
        setS3Path(s3Path);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon
     * Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs.
     *        For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles
     *        for Amazon Kendra</a>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon
     * Kendra</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs.
     *         For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles
     *         for Amazon Kendra</a>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs. For more
     * information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles for Amazon
     * Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the FAQs.
     *        For more information, see <a href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM Roles
     *        for Amazon Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaqRequest withRoleArn(String roleArn) {
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getS3Path() != null)
            sb.append("S3Path: ").append(getS3Path()).append(",");
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

        if (obj instanceof CreateFaqRequest == false)
            return false;
        CreateFaqRequest other = (CreateFaqRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getS3Path() == null ^ this.getS3Path() == null)
            return false;
        if (other.getS3Path() != null && other.getS3Path().equals(this.getS3Path()) == false)
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

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getS3Path() == null) ? 0 : getS3Path().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateFaqRequest clone() {
        return (CreateFaqRequest) super.clone();
    }

}
