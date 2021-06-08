/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/SSEKMS" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SSEKMS implements Serializable, Cloneable {

    /**
     * <p>
     * A container for the ARN of the SSE-KMS encryption. This property is read-only and follows the following format:
     * <code> arn:aws:kms:<i>us-east-1</i>:<i>example-account-id</i>:key/<i>example-9a73-4afc-8d29-8f5900cef44e</i> </code>
     * </p>
     */
    private String keyId;

    /**
     * <p>
     * A container for the ARN of the SSE-KMS encryption. This property is read-only and follows the following format:
     * <code> arn:aws:kms:<i>us-east-1</i>:<i>example-account-id</i>:key/<i>example-9a73-4afc-8d29-8f5900cef44e</i> </code>
     * </p>
     * 
     * @param keyId
     *        A container for the ARN of the SSE-KMS encryption. This property is read-only and follows the following
     *        format:
     *        <code> arn:aws:kms:<i>us-east-1</i>:<i>example-account-id</i>:key/<i>example-9a73-4afc-8d29-8f5900cef44e</i> </code>
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * A container for the ARN of the SSE-KMS encryption. This property is read-only and follows the following format:
     * <code> arn:aws:kms:<i>us-east-1</i>:<i>example-account-id</i>:key/<i>example-9a73-4afc-8d29-8f5900cef44e</i> </code>
     * </p>
     * 
     * @return A container for the ARN of the SSE-KMS encryption. This property is read-only and follows the following
     *         format:
     *         <code> arn:aws:kms:<i>us-east-1</i>:<i>example-account-id</i>:key/<i>example-9a73-4afc-8d29-8f5900cef44e</i> </code>
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * A container for the ARN of the SSE-KMS encryption. This property is read-only and follows the following format:
     * <code> arn:aws:kms:<i>us-east-1</i>:<i>example-account-id</i>:key/<i>example-9a73-4afc-8d29-8f5900cef44e</i> </code>
     * </p>
     * 
     * @param keyId
     *        A container for the ARN of the SSE-KMS encryption. This property is read-only and follows the following
     *        format:
     *        <code> arn:aws:kms:<i>us-east-1</i>:<i>example-account-id</i>:key/<i>example-9a73-4afc-8d29-8f5900cef44e</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSEKMS withKeyId(String keyId) {
        setKeyId(keyId);
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
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SSEKMS == false)
            return false;
        SSEKMS other = (SSEKMS) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public SSEKMS clone() {
        try {
            return (SSEKMS) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
