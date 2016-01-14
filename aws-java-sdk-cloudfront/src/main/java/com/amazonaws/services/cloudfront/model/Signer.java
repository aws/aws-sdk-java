/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * 
 */
public class Signer implements Serializable, Cloneable {

    private String awsAccountNumber;

    private KeyPairIds keyPairIds;

    /**
     * @param awsAccountNumber
     */
    public void setAwsAccountNumber(String awsAccountNumber) {
        this.awsAccountNumber = awsAccountNumber;
    }

    /**
     * @return
     */
    public String getAwsAccountNumber() {
        return this.awsAccountNumber;
    }

    /**
     * @param awsAccountNumber
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Signer withAwsAccountNumber(String awsAccountNumber) {
        setAwsAccountNumber(awsAccountNumber);
        return this;
    }

    /**
     * @param keyPairIds
     */
    public void setKeyPairIds(KeyPairIds keyPairIds) {
        this.keyPairIds = keyPairIds;
    }

    /**
     * @return
     */
    public KeyPairIds getKeyPairIds() {
        return this.keyPairIds;
    }

    /**
     * @param keyPairIds
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Signer withKeyPairIds(KeyPairIds keyPairIds) {
        setKeyPairIds(keyPairIds);
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
        if (getAwsAccountNumber() != null)
            sb.append("AwsAccountNumber: " + getAwsAccountNumber() + ",");
        if (getKeyPairIds() != null)
            sb.append("KeyPairIds: " + getKeyPairIds());
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
        if (other.getAwsAccountNumber() == null
                ^ this.getAwsAccountNumber() == null)
            return false;
        if (other.getAwsAccountNumber() != null
                && other.getAwsAccountNumber().equals(
                        this.getAwsAccountNumber()) == false)
            return false;
        if (other.getKeyPairIds() == null ^ this.getKeyPairIds() == null)
            return false;
        if (other.getKeyPairIds() != null
                && other.getKeyPairIds().equals(this.getKeyPairIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAwsAccountNumber() == null) ? 0 : getAwsAccountNumber()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getKeyPairIds() == null) ? 0 : getKeyPairIds().hashCode());
        return hashCode;
    }

    @Override
    public Signer clone() {
        try {
            return (Signer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}