/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;


/**
 * <p>
 * A complex type that lists the AWS accounts that were included in the TrustedSigners complex type, as well as their active CloudFront key pair IDs, if
 * any.
 * </p>
 */
public class Signer implements Serializable {

    /**
     * Specifies an AWS account that can create signed URLs. Values: self,
     * which indicates that the AWS account that was used to create the
     * distribution can created signed URLs, or an AWS account number. Omit
     * the dashes in the account number.
     */
    private String awsAccountNumber;

    /**
     * A complex type that lists the active CloudFront key pairs, if any,
     * that are associated with AwsAccountNumber.
     */
    private KeyPairIds keyPairIds;

    /**
     * Default constructor for a new Signer object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Signer() {}
    
    /**
     * Specifies an AWS account that can create signed URLs. Values: self,
     * which indicates that the AWS account that was used to create the
     * distribution can created signed URLs, or an AWS account number. Omit
     * the dashes in the account number.
     *
     * @return Specifies an AWS account that can create signed URLs. Values: self,
     *         which indicates that the AWS account that was used to create the
     *         distribution can created signed URLs, or an AWS account number. Omit
     *         the dashes in the account number.
     */
    public String getAwsAccountNumber() {
        return awsAccountNumber;
    }
    
    /**
     * Specifies an AWS account that can create signed URLs. Values: self,
     * which indicates that the AWS account that was used to create the
     * distribution can created signed URLs, or an AWS account number. Omit
     * the dashes in the account number.
     *
     * @param awsAccountNumber Specifies an AWS account that can create signed URLs. Values: self,
     *         which indicates that the AWS account that was used to create the
     *         distribution can created signed URLs, or an AWS account number. Omit
     *         the dashes in the account number.
     */
    public void setAwsAccountNumber(String awsAccountNumber) {
        this.awsAccountNumber = awsAccountNumber;
    }
    
    /**
     * Specifies an AWS account that can create signed URLs. Values: self,
     * which indicates that the AWS account that was used to create the
     * distribution can created signed URLs, or an AWS account number. Omit
     * the dashes in the account number.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param awsAccountNumber Specifies an AWS account that can create signed URLs. Values: self,
     *         which indicates that the AWS account that was used to create the
     *         distribution can created signed URLs, or an AWS account number. Omit
     *         the dashes in the account number.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Signer withAwsAccountNumber(String awsAccountNumber) {
        this.awsAccountNumber = awsAccountNumber;
        return this;
    }

    /**
     * A complex type that lists the active CloudFront key pairs, if any,
     * that are associated with AwsAccountNumber.
     *
     * @return A complex type that lists the active CloudFront key pairs, if any,
     *         that are associated with AwsAccountNumber.
     */
    public KeyPairIds getKeyPairIds() {
        return keyPairIds;
    }
    
    /**
     * A complex type that lists the active CloudFront key pairs, if any,
     * that are associated with AwsAccountNumber.
     *
     * @param keyPairIds A complex type that lists the active CloudFront key pairs, if any,
     *         that are associated with AwsAccountNumber.
     */
    public void setKeyPairIds(KeyPairIds keyPairIds) {
        this.keyPairIds = keyPairIds;
    }
    
    /**
     * A complex type that lists the active CloudFront key pairs, if any,
     * that are associated with AwsAccountNumber.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyPairIds A complex type that lists the active CloudFront key pairs, if any,
     *         that are associated with AwsAccountNumber.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Signer withKeyPairIds(KeyPairIds keyPairIds) {
        this.keyPairIds = keyPairIds;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAwsAccountNumber() != null) sb.append("AwsAccountNumber: " + getAwsAccountNumber() + ",");
        if (getKeyPairIds() != null) sb.append("KeyPairIds: " + getKeyPairIds() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Signer == false) return false;
        Signer other = (Signer)obj;
        
        if (other.getAwsAccountNumber() == null ^ this.getAwsAccountNumber() == null) return false;
        if (other.getAwsAccountNumber() != null && other.getAwsAccountNumber().equals(this.getAwsAccountNumber()) == false) return false; 
        if (other.getKeyPairIds() == null ^ this.getKeyPairIds() == null) return false;
        if (other.getKeyPairIds() != null && other.getKeyPairIds().equals(this.getKeyPairIds()) == false) return false; 
        return true;
    }
    
}
    