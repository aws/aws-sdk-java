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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetLegalHold" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLegalHoldRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is the ID required to use <code>GetLegalHold</code>. This unique ID is associated with a specific legal
     * hold.
     * </p>
     */
    private String legalHoldId;

    /**
     * <p>
     * This is the ID required to use <code>GetLegalHold</code>. This unique ID is associated with a specific legal
     * hold.
     * </p>
     * 
     * @param legalHoldId
     *        This is the ID required to use <code>GetLegalHold</code>. This unique ID is associated with a specific
     *        legal hold.
     */

    public void setLegalHoldId(String legalHoldId) {
        this.legalHoldId = legalHoldId;
    }

    /**
     * <p>
     * This is the ID required to use <code>GetLegalHold</code>. This unique ID is associated with a specific legal
     * hold.
     * </p>
     * 
     * @return This is the ID required to use <code>GetLegalHold</code>. This unique ID is associated with a specific
     *         legal hold.
     */

    public String getLegalHoldId() {
        return this.legalHoldId;
    }

    /**
     * <p>
     * This is the ID required to use <code>GetLegalHold</code>. This unique ID is associated with a specific legal
     * hold.
     * </p>
     * 
     * @param legalHoldId
     *        This is the ID required to use <code>GetLegalHold</code>. This unique ID is associated with a specific
     *        legal hold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLegalHoldRequest withLegalHoldId(String legalHoldId) {
        setLegalHoldId(legalHoldId);
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
        if (getLegalHoldId() != null)
            sb.append("LegalHoldId: ").append(getLegalHoldId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLegalHoldRequest == false)
            return false;
        GetLegalHoldRequest other = (GetLegalHoldRequest) obj;
        if (other.getLegalHoldId() == null ^ this.getLegalHoldId() == null)
            return false;
        if (other.getLegalHoldId() != null && other.getLegalHoldId().equals(this.getLegalHoldId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLegalHoldId() == null) ? 0 : getLegalHoldId().hashCode());
        return hashCode;
    }

    @Override
    public GetLegalHoldRequest clone() {
        return (GetLegalHoldRequest) super.clone();
    }

}
