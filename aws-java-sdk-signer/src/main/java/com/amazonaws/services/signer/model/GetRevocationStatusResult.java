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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/GetRevocationStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRevocationStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of revoked entities (including zero or more of the signing profile ARN, signing job ARN, and certificate
     * hashes) supplied as input to the API.
     * </p>
     */
    private java.util.List<String> revokedEntities;

    /**
     * <p>
     * A list of revoked entities (including zero or more of the signing profile ARN, signing job ARN, and certificate
     * hashes) supplied as input to the API.
     * </p>
     * 
     * @return A list of revoked entities (including zero or more of the signing profile ARN, signing job ARN, and
     *         certificate hashes) supplied as input to the API.
     */

    public java.util.List<String> getRevokedEntities() {
        return revokedEntities;
    }

    /**
     * <p>
     * A list of revoked entities (including zero or more of the signing profile ARN, signing job ARN, and certificate
     * hashes) supplied as input to the API.
     * </p>
     * 
     * @param revokedEntities
     *        A list of revoked entities (including zero or more of the signing profile ARN, signing job ARN, and
     *        certificate hashes) supplied as input to the API.
     */

    public void setRevokedEntities(java.util.Collection<String> revokedEntities) {
        if (revokedEntities == null) {
            this.revokedEntities = null;
            return;
        }

        this.revokedEntities = new java.util.ArrayList<String>(revokedEntities);
    }

    /**
     * <p>
     * A list of revoked entities (including zero or more of the signing profile ARN, signing job ARN, and certificate
     * hashes) supplied as input to the API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRevokedEntities(java.util.Collection)} or {@link #withRevokedEntities(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param revokedEntities
     *        A list of revoked entities (including zero or more of the signing profile ARN, signing job ARN, and
     *        certificate hashes) supplied as input to the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRevocationStatusResult withRevokedEntities(String... revokedEntities) {
        if (this.revokedEntities == null) {
            setRevokedEntities(new java.util.ArrayList<String>(revokedEntities.length));
        }
        for (String ele : revokedEntities) {
            this.revokedEntities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of revoked entities (including zero or more of the signing profile ARN, signing job ARN, and certificate
     * hashes) supplied as input to the API.
     * </p>
     * 
     * @param revokedEntities
     *        A list of revoked entities (including zero or more of the signing profile ARN, signing job ARN, and
     *        certificate hashes) supplied as input to the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRevocationStatusResult withRevokedEntities(java.util.Collection<String> revokedEntities) {
        setRevokedEntities(revokedEntities);
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
        if (getRevokedEntities() != null)
            sb.append("RevokedEntities: ").append(getRevokedEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRevocationStatusResult == false)
            return false;
        GetRevocationStatusResult other = (GetRevocationStatusResult) obj;
        if (other.getRevokedEntities() == null ^ this.getRevokedEntities() == null)
            return false;
        if (other.getRevokedEntities() != null && other.getRevokedEntities().equals(this.getRevokedEntities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevokedEntities() == null) ? 0 : getRevokedEntities().hashCode());
        return hashCode;
    }

    @Override
    public GetRevocationStatusResult clone() {
        try {
            return (GetRevocationStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
