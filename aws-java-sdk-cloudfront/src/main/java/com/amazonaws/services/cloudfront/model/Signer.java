/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that lists the AWS accounts that were included in the <code>TrustedSigners</code> complex type, as
 * well as their active CloudFront key pair IDs, if any.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/Signer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Signer implements Serializable, Cloneable {

    /**
     * <p>
     * An AWS account that is included in the <code>TrustedSigners</code> complex type for this RTMP distribution. Valid
     * values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>self</code>, which is the AWS account used to create the distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS account number.
     * </p>
     * </li>
     * </ul>
     */
    private String awsAccountNumber;
    /**
     * <p>
     * A complex type that lists the active CloudFront key pairs, if any, that are associated with
     * <code>AwsAccountNumber</code>.
     * </p>
     */
    private KeyPairIds keyPairIds;

    /**
     * <p>
     * An AWS account that is included in the <code>TrustedSigners</code> complex type for this RTMP distribution. Valid
     * values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>self</code>, which is the AWS account used to create the distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS account number.
     * </p>
     * </li>
     * </ul>
     * 
     * @param awsAccountNumber
     *        An AWS account that is included in the <code>TrustedSigners</code> complex type for this RTMP
     *        distribution. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>self</code>, which is the AWS account used to create the distribution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An AWS account number.
     *        </p>
     *        </li>
     */

    public void setAwsAccountNumber(String awsAccountNumber) {
        this.awsAccountNumber = awsAccountNumber;
    }

    /**
     * <p>
     * An AWS account that is included in the <code>TrustedSigners</code> complex type for this RTMP distribution. Valid
     * values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>self</code>, which is the AWS account used to create the distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS account number.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An AWS account that is included in the <code>TrustedSigners</code> complex type for this RTMP
     *         distribution. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>self</code>, which is the AWS account used to create the distribution.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An AWS account number.
     *         </p>
     *         </li>
     */

    public String getAwsAccountNumber() {
        return this.awsAccountNumber;
    }

    /**
     * <p>
     * An AWS account that is included in the <code>TrustedSigners</code> complex type for this RTMP distribution. Valid
     * values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>self</code>, which is the AWS account used to create the distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * An AWS account number.
     * </p>
     * </li>
     * </ul>
     * 
     * @param awsAccountNumber
     *        An AWS account that is included in the <code>TrustedSigners</code> complex type for this RTMP
     *        distribution. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>self</code>, which is the AWS account used to create the distribution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An AWS account number.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Signer withAwsAccountNumber(String awsAccountNumber) {
        setAwsAccountNumber(awsAccountNumber);
        return this;
    }

    /**
     * <p>
     * A complex type that lists the active CloudFront key pairs, if any, that are associated with
     * <code>AwsAccountNumber</code>.
     * </p>
     * 
     * @param keyPairIds
     *        A complex type that lists the active CloudFront key pairs, if any, that are associated with
     *        <code>AwsAccountNumber</code>.
     */

    public void setKeyPairIds(KeyPairIds keyPairIds) {
        this.keyPairIds = keyPairIds;
    }

    /**
     * <p>
     * A complex type that lists the active CloudFront key pairs, if any, that are associated with
     * <code>AwsAccountNumber</code>.
     * </p>
     * 
     * @return A complex type that lists the active CloudFront key pairs, if any, that are associated with
     *         <code>AwsAccountNumber</code>.
     */

    public KeyPairIds getKeyPairIds() {
        return this.keyPairIds;
    }

    /**
     * <p>
     * A complex type that lists the active CloudFront key pairs, if any, that are associated with
     * <code>AwsAccountNumber</code>.
     * </p>
     * 
     * @param keyPairIds
     *        A complex type that lists the active CloudFront key pairs, if any, that are associated with
     *        <code>AwsAccountNumber</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Signer withKeyPairIds(KeyPairIds keyPairIds) {
        setKeyPairIds(keyPairIds);
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
        if (getAwsAccountNumber() != null)
            sb.append("AwsAccountNumber: ").append(getAwsAccountNumber()).append(",");
        if (getKeyPairIds() != null)
            sb.append("KeyPairIds: ").append(getKeyPairIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Signer == false)
            return false;
        Signer other = (Signer) obj;
        if (other.getAwsAccountNumber() == null ^ this.getAwsAccountNumber() == null)
            return false;
        if (other.getAwsAccountNumber() != null && other.getAwsAccountNumber().equals(this.getAwsAccountNumber()) == false)
            return false;
        if (other.getKeyPairIds() == null ^ this.getKeyPairIds() == null)
            return false;
        if (other.getKeyPairIds() != null && other.getKeyPairIds().equals(this.getKeyPairIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountNumber() == null) ? 0 : getAwsAccountNumber().hashCode());
        hashCode = prime * hashCode + ((getKeyPairIds() == null) ? 0 : getKeyPairIds().hashCode());
        return hashCode;
    }

    @Override
    public Signer clone() {
        try {
            return (Signer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
