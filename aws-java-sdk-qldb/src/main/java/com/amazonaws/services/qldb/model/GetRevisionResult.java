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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/GetRevision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRevisionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The proof object in Amazon Ion format returned by a <code>GetRevision</code> request. A proof contains the list
     * of hash values that are required to recalculate the specified digest using a Merkle tree, starting with the
     * specified document revision.
     * </p>
     */
    private ValueHolder proof;
    /**
     * <p>
     * The document revision data object in Amazon Ion format.
     * </p>
     */
    private ValueHolder revision;

    /**
     * <p>
     * The proof object in Amazon Ion format returned by a <code>GetRevision</code> request. A proof contains the list
     * of hash values that are required to recalculate the specified digest using a Merkle tree, starting with the
     * specified document revision.
     * </p>
     * 
     * @param proof
     *        The proof object in Amazon Ion format returned by a <code>GetRevision</code> request. A proof contains the
     *        list of hash values that are required to recalculate the specified digest using a Merkle tree, starting
     *        with the specified document revision.
     */

    public void setProof(ValueHolder proof) {
        this.proof = proof;
    }

    /**
     * <p>
     * The proof object in Amazon Ion format returned by a <code>GetRevision</code> request. A proof contains the list
     * of hash values that are required to recalculate the specified digest using a Merkle tree, starting with the
     * specified document revision.
     * </p>
     * 
     * @return The proof object in Amazon Ion format returned by a <code>GetRevision</code> request. A proof contains
     *         the list of hash values that are required to recalculate the specified digest using a Merkle tree,
     *         starting with the specified document revision.
     */

    public ValueHolder getProof() {
        return this.proof;
    }

    /**
     * <p>
     * The proof object in Amazon Ion format returned by a <code>GetRevision</code> request. A proof contains the list
     * of hash values that are required to recalculate the specified digest using a Merkle tree, starting with the
     * specified document revision.
     * </p>
     * 
     * @param proof
     *        The proof object in Amazon Ion format returned by a <code>GetRevision</code> request. A proof contains the
     *        list of hash values that are required to recalculate the specified digest using a Merkle tree, starting
     *        with the specified document revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRevisionResult withProof(ValueHolder proof) {
        setProof(proof);
        return this;
    }

    /**
     * <p>
     * The document revision data object in Amazon Ion format.
     * </p>
     * 
     * @param revision
     *        The document revision data object in Amazon Ion format.
     */

    public void setRevision(ValueHolder revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The document revision data object in Amazon Ion format.
     * </p>
     * 
     * @return The document revision data object in Amazon Ion format.
     */

    public ValueHolder getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The document revision data object in Amazon Ion format.
     * </p>
     * 
     * @param revision
     *        The document revision data object in Amazon Ion format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRevisionResult withRevision(ValueHolder revision) {
        setRevision(revision);
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
        if (getProof() != null)
            sb.append("Proof: ").append("***Sensitive Data Redacted***").append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRevisionResult == false)
            return false;
        GetRevisionResult other = (GetRevisionResult) obj;
        if (other.getProof() == null ^ this.getProof() == null)
            return false;
        if (other.getProof() != null && other.getProof().equals(this.getProof()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProof() == null) ? 0 : getProof().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public GetRevisionResult clone() {
        try {
            return (GetRevisionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
