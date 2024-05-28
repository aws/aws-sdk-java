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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Verified Access provides server side encryption by default to data at rest using Amazon Web Services-owned KMS keys.
 * You also have the option of using customer managed KMS keys, which can be specified using the options below.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VerifiedAccessSseSpecificationRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessSseSpecificationRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Enable or disable the use of customer managed KMS keys for server side encryption.
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     */
    private Boolean customerManagedKeyEnabled;
    /**
     * <p>
     * The ARN of the KMS key.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * Enable or disable the use of customer managed KMS keys for server side encryption.
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @param customerManagedKeyEnabled
     *        Enable or disable the use of customer managed KMS keys for server side encryption. </p>
     *        <p>
     *        Valid values: <code>True</code> | <code>False</code>
     */

    public void setCustomerManagedKeyEnabled(Boolean customerManagedKeyEnabled) {
        this.customerManagedKeyEnabled = customerManagedKeyEnabled;
    }

    /**
     * <p>
     * Enable or disable the use of customer managed KMS keys for server side encryption.
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @return Enable or disable the use of customer managed KMS keys for server side encryption. </p>
     *         <p>
     *         Valid values: <code>True</code> | <code>False</code>
     */

    public Boolean getCustomerManagedKeyEnabled() {
        return this.customerManagedKeyEnabled;
    }

    /**
     * <p>
     * Enable or disable the use of customer managed KMS keys for server side encryption.
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @param customerManagedKeyEnabled
     *        Enable or disable the use of customer managed KMS keys for server side encryption. </p>
     *        <p>
     *        Valid values: <code>True</code> | <code>False</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessSseSpecificationRequest withCustomerManagedKeyEnabled(Boolean customerManagedKeyEnabled) {
        setCustomerManagedKeyEnabled(customerManagedKeyEnabled);
        return this;
    }

    /**
     * <p>
     * Enable or disable the use of customer managed KMS keys for server side encryption.
     * </p>
     * <p>
     * Valid values: <code>True</code> | <code>False</code>
     * </p>
     * 
     * @return Enable or disable the use of customer managed KMS keys for server side encryption. </p>
     *         <p>
     *         Valid values: <code>True</code> | <code>False</code>
     */

    public Boolean isCustomerManagedKeyEnabled() {
        return this.customerManagedKeyEnabled;
    }

    /**
     * <p>
     * The ARN of the KMS key.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the KMS key.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key.
     * </p>
     * 
     * @return The ARN of the KMS key.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessSseSpecificationRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getCustomerManagedKeyEnabled() != null)
            sb.append("CustomerManagedKeyEnabled: ").append(getCustomerManagedKeyEnabled()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifiedAccessSseSpecificationRequest == false)
            return false;
        VerifiedAccessSseSpecificationRequest other = (VerifiedAccessSseSpecificationRequest) obj;
        if (other.getCustomerManagedKeyEnabled() == null ^ this.getCustomerManagedKeyEnabled() == null)
            return false;
        if (other.getCustomerManagedKeyEnabled() != null && other.getCustomerManagedKeyEnabled().equals(this.getCustomerManagedKeyEnabled()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerManagedKeyEnabled() == null) ? 0 : getCustomerManagedKeyEnabled().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public VerifiedAccessSseSpecificationRequest clone() {
        try {
            return (VerifiedAccessSseSpecificationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
