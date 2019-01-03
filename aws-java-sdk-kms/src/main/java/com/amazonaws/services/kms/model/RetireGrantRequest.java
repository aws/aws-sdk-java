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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/RetireGrant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetireGrantRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Token that identifies the grant to be retired.
     * </p>
     */
    private String grantToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK associated with the grant.
     * </p>
     * <p>
     * For example: <code>arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * Unique identifier of the grant to retire. The grant ID is returned in the response to a <code>CreateGrant</code>
     * operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Grant ID Example - 0123456789012345678901234567890123456789012345678901234567890123
     * </p>
     * </li>
     * </ul>
     */
    private String grantId;

    /**
     * <p>
     * Token that identifies the grant to be retired.
     * </p>
     * 
     * @param grantToken
     *        Token that identifies the grant to be retired.
     */

    public void setGrantToken(String grantToken) {
        this.grantToken = grantToken;
    }

    /**
     * <p>
     * Token that identifies the grant to be retired.
     * </p>
     * 
     * @return Token that identifies the grant to be retired.
     */

    public String getGrantToken() {
        return this.grantToken;
    }

    /**
     * <p>
     * Token that identifies the grant to be retired.
     * </p>
     * 
     * @param grantToken
     *        Token that identifies the grant to be retired.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetireGrantRequest withGrantToken(String grantToken) {
        setGrantToken(grantToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK associated with the grant.
     * </p>
     * <p>
     * For example: <code>arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * 
     * @param keyId
     *        The Amazon Resource Name (ARN) of the CMK associated with the grant. </p>
     *        <p>
     *        For example: <code>arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK associated with the grant.
     * </p>
     * <p>
     * For example: <code>arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the CMK associated with the grant. </p>
     *         <p>
     *         For example: <code>arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK associated with the grant.
     * </p>
     * <p>
     * For example: <code>arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * 
     * @param keyId
     *        The Amazon Resource Name (ARN) of the CMK associated with the grant. </p>
     *        <p>
     *        For example: <code>arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetireGrantRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Unique identifier of the grant to retire. The grant ID is returned in the response to a <code>CreateGrant</code>
     * operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Grant ID Example - 0123456789012345678901234567890123456789012345678901234567890123
     * </p>
     * </li>
     * </ul>
     * 
     * @param grantId
     *        Unique identifier of the grant to retire. The grant ID is returned in the response to a
     *        <code>CreateGrant</code> operation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Grant ID Example - 0123456789012345678901234567890123456789012345678901234567890123
     *        </p>
     *        </li>
     */

    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }

    /**
     * <p>
     * Unique identifier of the grant to retire. The grant ID is returned in the response to a <code>CreateGrant</code>
     * operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Grant ID Example - 0123456789012345678901234567890123456789012345678901234567890123
     * </p>
     * </li>
     * </ul>
     * 
     * @return Unique identifier of the grant to retire. The grant ID is returned in the response to a
     *         <code>CreateGrant</code> operation.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Grant ID Example - 0123456789012345678901234567890123456789012345678901234567890123
     *         </p>
     *         </li>
     */

    public String getGrantId() {
        return this.grantId;
    }

    /**
     * <p>
     * Unique identifier of the grant to retire. The grant ID is returned in the response to a <code>CreateGrant</code>
     * operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Grant ID Example - 0123456789012345678901234567890123456789012345678901234567890123
     * </p>
     * </li>
     * </ul>
     * 
     * @param grantId
     *        Unique identifier of the grant to retire. The grant ID is returned in the response to a
     *        <code>CreateGrant</code> operation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Grant ID Example - 0123456789012345678901234567890123456789012345678901234567890123
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetireGrantRequest withGrantId(String grantId) {
        setGrantId(grantId);
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
        if (getGrantToken() != null)
            sb.append("GrantToken: ").append(getGrantToken()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getGrantId() != null)
            sb.append("GrantId: ").append(getGrantId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetireGrantRequest == false)
            return false;
        RetireGrantRequest other = (RetireGrantRequest) obj;
        if (other.getGrantToken() == null ^ this.getGrantToken() == null)
            return false;
        if (other.getGrantToken() != null && other.getGrantToken().equals(this.getGrantToken()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getGrantId() == null ^ this.getGrantId() == null)
            return false;
        if (other.getGrantId() != null && other.getGrantId().equals(this.getGrantId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrantToken() == null) ? 0 : getGrantToken().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getGrantId() == null) ? 0 : getGrantId().hashCode());
        return hashCode;
    }

    @Override
    public RetireGrantRequest clone() {
        return (RetireGrantRequest) super.clone();
    }

}
