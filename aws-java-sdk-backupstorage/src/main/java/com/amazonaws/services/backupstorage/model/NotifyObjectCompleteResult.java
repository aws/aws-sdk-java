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
package com.amazonaws.services.backupstorage.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/NotifyObjectComplete" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotifyObjectCompleteResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Object checksum */
    private String objectChecksum;
    /** Checksum algorithm */
    private String objectChecksumAlgorithm;

    /**
     * Object checksum
     * 
     * @param objectChecksum
     *        Object checksum
     */

    public void setObjectChecksum(String objectChecksum) {
        this.objectChecksum = objectChecksum;
    }

    /**
     * Object checksum
     * 
     * @return Object checksum
     */

    public String getObjectChecksum() {
        return this.objectChecksum;
    }

    /**
     * Object checksum
     * 
     * @param objectChecksum
     *        Object checksum
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyObjectCompleteResult withObjectChecksum(String objectChecksum) {
        setObjectChecksum(objectChecksum);
        return this;
    }

    /**
     * Checksum algorithm
     * 
     * @param objectChecksumAlgorithm
     *        Checksum algorithm
     * @see SummaryChecksumAlgorithm
     */

    public void setObjectChecksumAlgorithm(String objectChecksumAlgorithm) {
        this.objectChecksumAlgorithm = objectChecksumAlgorithm;
    }

    /**
     * Checksum algorithm
     * 
     * @return Checksum algorithm
     * @see SummaryChecksumAlgorithm
     */

    public String getObjectChecksumAlgorithm() {
        return this.objectChecksumAlgorithm;
    }

    /**
     * Checksum algorithm
     * 
     * @param objectChecksumAlgorithm
     *        Checksum algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SummaryChecksumAlgorithm
     */

    public NotifyObjectCompleteResult withObjectChecksumAlgorithm(String objectChecksumAlgorithm) {
        setObjectChecksumAlgorithm(objectChecksumAlgorithm);
        return this;
    }

    /**
     * Checksum algorithm
     * 
     * @param objectChecksumAlgorithm
     *        Checksum algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SummaryChecksumAlgorithm
     */

    public NotifyObjectCompleteResult withObjectChecksumAlgorithm(SummaryChecksumAlgorithm objectChecksumAlgorithm) {
        this.objectChecksumAlgorithm = objectChecksumAlgorithm.toString();
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
        if (getObjectChecksum() != null)
            sb.append("ObjectChecksum: ").append(getObjectChecksum()).append(",");
        if (getObjectChecksumAlgorithm() != null)
            sb.append("ObjectChecksumAlgorithm: ").append(getObjectChecksumAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotifyObjectCompleteResult == false)
            return false;
        NotifyObjectCompleteResult other = (NotifyObjectCompleteResult) obj;
        if (other.getObjectChecksum() == null ^ this.getObjectChecksum() == null)
            return false;
        if (other.getObjectChecksum() != null && other.getObjectChecksum().equals(this.getObjectChecksum()) == false)
            return false;
        if (other.getObjectChecksumAlgorithm() == null ^ this.getObjectChecksumAlgorithm() == null)
            return false;
        if (other.getObjectChecksumAlgorithm() != null && other.getObjectChecksumAlgorithm().equals(this.getObjectChecksumAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectChecksum() == null) ? 0 : getObjectChecksum().hashCode());
        hashCode = prime * hashCode + ((getObjectChecksumAlgorithm() == null) ? 0 : getObjectChecksumAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public NotifyObjectCompleteResult clone() {
        try {
            return (NotifyObjectCompleteResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
