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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/PutObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutObjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Inline chunk checksum */
    private String inlineChunkChecksum;
    /** Inline chunk checksum algorithm */
    private String inlineChunkChecksumAlgorithm;
    /** object checksum */
    private String objectChecksum;
    /** object checksum algorithm */
    private String objectChecksumAlgorithm;

    /**
     * Inline chunk checksum
     * 
     * @param inlineChunkChecksum
     *        Inline chunk checksum
     */

    public void setInlineChunkChecksum(String inlineChunkChecksum) {
        this.inlineChunkChecksum = inlineChunkChecksum;
    }

    /**
     * Inline chunk checksum
     * 
     * @return Inline chunk checksum
     */

    public String getInlineChunkChecksum() {
        return this.inlineChunkChecksum;
    }

    /**
     * Inline chunk checksum
     * 
     * @param inlineChunkChecksum
     *        Inline chunk checksum
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectResult withInlineChunkChecksum(String inlineChunkChecksum) {
        setInlineChunkChecksum(inlineChunkChecksum);
        return this;
    }

    /**
     * Inline chunk checksum algorithm
     * 
     * @param inlineChunkChecksumAlgorithm
     *        Inline chunk checksum algorithm
     * @see DataChecksumAlgorithm
     */

    public void setInlineChunkChecksumAlgorithm(String inlineChunkChecksumAlgorithm) {
        this.inlineChunkChecksumAlgorithm = inlineChunkChecksumAlgorithm;
    }

    /**
     * Inline chunk checksum algorithm
     * 
     * @return Inline chunk checksum algorithm
     * @see DataChecksumAlgorithm
     */

    public String getInlineChunkChecksumAlgorithm() {
        return this.inlineChunkChecksumAlgorithm;
    }

    /**
     * Inline chunk checksum algorithm
     * 
     * @param inlineChunkChecksumAlgorithm
     *        Inline chunk checksum algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataChecksumAlgorithm
     */

    public PutObjectResult withInlineChunkChecksumAlgorithm(String inlineChunkChecksumAlgorithm) {
        setInlineChunkChecksumAlgorithm(inlineChunkChecksumAlgorithm);
        return this;
    }

    /**
     * Inline chunk checksum algorithm
     * 
     * @param inlineChunkChecksumAlgorithm
     *        Inline chunk checksum algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataChecksumAlgorithm
     */

    public PutObjectResult withInlineChunkChecksumAlgorithm(DataChecksumAlgorithm inlineChunkChecksumAlgorithm) {
        this.inlineChunkChecksumAlgorithm = inlineChunkChecksumAlgorithm.toString();
        return this;
    }

    /**
     * object checksum
     * 
     * @param objectChecksum
     *        object checksum
     */

    public void setObjectChecksum(String objectChecksum) {
        this.objectChecksum = objectChecksum;
    }

    /**
     * object checksum
     * 
     * @return object checksum
     */

    public String getObjectChecksum() {
        return this.objectChecksum;
    }

    /**
     * object checksum
     * 
     * @param objectChecksum
     *        object checksum
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectResult withObjectChecksum(String objectChecksum) {
        setObjectChecksum(objectChecksum);
        return this;
    }

    /**
     * object checksum algorithm
     * 
     * @param objectChecksumAlgorithm
     *        object checksum algorithm
     * @see SummaryChecksumAlgorithm
     */

    public void setObjectChecksumAlgorithm(String objectChecksumAlgorithm) {
        this.objectChecksumAlgorithm = objectChecksumAlgorithm;
    }

    /**
     * object checksum algorithm
     * 
     * @return object checksum algorithm
     * @see SummaryChecksumAlgorithm
     */

    public String getObjectChecksumAlgorithm() {
        return this.objectChecksumAlgorithm;
    }

    /**
     * object checksum algorithm
     * 
     * @param objectChecksumAlgorithm
     *        object checksum algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SummaryChecksumAlgorithm
     */

    public PutObjectResult withObjectChecksumAlgorithm(String objectChecksumAlgorithm) {
        setObjectChecksumAlgorithm(objectChecksumAlgorithm);
        return this;
    }

    /**
     * object checksum algorithm
     * 
     * @param objectChecksumAlgorithm
     *        object checksum algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SummaryChecksumAlgorithm
     */

    public PutObjectResult withObjectChecksumAlgorithm(SummaryChecksumAlgorithm objectChecksumAlgorithm) {
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
        if (getInlineChunkChecksum() != null)
            sb.append("InlineChunkChecksum: ").append(getInlineChunkChecksum()).append(",");
        if (getInlineChunkChecksumAlgorithm() != null)
            sb.append("InlineChunkChecksumAlgorithm: ").append(getInlineChunkChecksumAlgorithm()).append(",");
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

        if (obj instanceof PutObjectResult == false)
            return false;
        PutObjectResult other = (PutObjectResult) obj;
        if (other.getInlineChunkChecksum() == null ^ this.getInlineChunkChecksum() == null)
            return false;
        if (other.getInlineChunkChecksum() != null && other.getInlineChunkChecksum().equals(this.getInlineChunkChecksum()) == false)
            return false;
        if (other.getInlineChunkChecksumAlgorithm() == null ^ this.getInlineChunkChecksumAlgorithm() == null)
            return false;
        if (other.getInlineChunkChecksumAlgorithm() != null && other.getInlineChunkChecksumAlgorithm().equals(this.getInlineChunkChecksumAlgorithm()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getInlineChunkChecksum() == null) ? 0 : getInlineChunkChecksum().hashCode());
        hashCode = prime * hashCode + ((getInlineChunkChecksumAlgorithm() == null) ? 0 : getInlineChunkChecksumAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getObjectChecksum() == null) ? 0 : getObjectChecksum().hashCode());
        hashCode = prime * hashCode + ((getObjectChecksumAlgorithm() == null) ? 0 : getObjectChecksumAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public PutObjectResult clone() {
        try {
            return (PutObjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
