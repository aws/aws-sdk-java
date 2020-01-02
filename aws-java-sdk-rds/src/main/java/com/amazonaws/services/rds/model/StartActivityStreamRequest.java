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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartActivityStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartActivityStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB cluster, for example
     * <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Specifies the mode of the database activity stream. Database events such as a change or access generate an
     * activity stream event. The database session can handle these events either synchronously or asynchronously.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * The AWS KMS key identifier for encrypting messages in the database activity stream. The key identifier can be
     * either a key ID, a key ARN, or a key alias.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specifies whether or not the database activity stream is to start as soon as possible, regardless of the
     * maintenance window for the database.
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB cluster, for example
     * <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the DB cluster, for example
     *        <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB cluster, for example
     * <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the DB cluster, for example
     *         <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the DB cluster, for example
     * <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the DB cluster, for example
     *        <code>arn:aws:rds:us-east-1:12345667890:cluster:das-cluster</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartActivityStreamRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Specifies the mode of the database activity stream. Database events such as a change or access generate an
     * activity stream event. The database session can handle these events either synchronously or asynchronously.
     * </p>
     * 
     * @param mode
     *        Specifies the mode of the database activity stream. Database events such as a change or access generate an
     *        activity stream event. The database session can handle these events either synchronously or
     *        asynchronously.
     * @see ActivityStreamMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Specifies the mode of the database activity stream. Database events such as a change or access generate an
     * activity stream event. The database session can handle these events either synchronously or asynchronously.
     * </p>
     * 
     * @return Specifies the mode of the database activity stream. Database events such as a change or access generate
     *         an activity stream event. The database session can handle these events either synchronously or
     *         asynchronously.
     * @see ActivityStreamMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Specifies the mode of the database activity stream. Database events such as a change or access generate an
     * activity stream event. The database session can handle these events either synchronously or asynchronously.
     * </p>
     * 
     * @param mode
     *        Specifies the mode of the database activity stream. Database events such as a change or access generate an
     *        activity stream event. The database session can handle these events either synchronously or
     *        asynchronously.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamMode
     */

    public StartActivityStreamRequest withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Specifies the mode of the database activity stream. Database events such as a change or access generate an
     * activity stream event. The database session can handle these events either synchronously or asynchronously.
     * </p>
     * 
     * @param mode
     *        Specifies the mode of the database activity stream. Database events such as a change or access generate an
     *        activity stream event. The database session can handle these events either synchronously or
     *        asynchronously.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActivityStreamMode
     */

    public StartActivityStreamRequest withMode(ActivityStreamMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encrypting messages in the database activity stream. The key identifier can be
     * either a key ID, a key ARN, or a key alias.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier for encrypting messages in the database activity stream. The key identifier can
     *        be either a key ID, a key ARN, or a key alias.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encrypting messages in the database activity stream. The key identifier can be
     * either a key ID, a key ARN, or a key alias.
     * </p>
     * 
     * @return The AWS KMS key identifier for encrypting messages in the database activity stream. The key identifier
     *         can be either a key ID, a key ARN, or a key alias.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encrypting messages in the database activity stream. The key identifier can be
     * either a key ID, a key ARN, or a key alias.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier for encrypting messages in the database activity stream. The key identifier can
     *        be either a key ID, a key ARN, or a key alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartActivityStreamRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not the database activity stream is to start as soon as possible, regardless of the
     * maintenance window for the database.
     * </p>
     * 
     * @param applyImmediately
     *        Specifies whether or not the database activity stream is to start as soon as possible, regardless of the
     *        maintenance window for the database.
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Specifies whether or not the database activity stream is to start as soon as possible, regardless of the
     * maintenance window for the database.
     * </p>
     * 
     * @return Specifies whether or not the database activity stream is to start as soon as possible, regardless of the
     *         maintenance window for the database.
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * Specifies whether or not the database activity stream is to start as soon as possible, regardless of the
     * maintenance window for the database.
     * </p>
     * 
     * @param applyImmediately
     *        Specifies whether or not the database activity stream is to start as soon as possible, regardless of the
     *        maintenance window for the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartActivityStreamRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not the database activity stream is to start as soon as possible, regardless of the
     * maintenance window for the database.
     * </p>
     * 
     * @return Specifies whether or not the database activity stream is to start as soon as possible, regardless of the
     *         maintenance window for the database.
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: ").append(getApplyImmediately());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartActivityStreamRequest == false)
            return false;
        StartActivityStreamRequest other = (StartActivityStreamRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        return hashCode;
    }

    @Override
    public StartActivityStreamRequest clone() {
        return (StartActivityStreamRequest) super.clone();
    }

}
