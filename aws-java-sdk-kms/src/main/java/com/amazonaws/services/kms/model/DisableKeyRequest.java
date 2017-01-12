/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DisableKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the CMK.
     * </p>
     * <p>
     * Use the CMK's unique identifier or its Amazon Resource Name (ARN). For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * </ul>
     */
    private String keyId;

    /**
     * <p>
     * A unique identifier for the CMK.
     * </p>
     * <p>
     * Use the CMK's unique identifier or its Amazon Resource Name (ARN). For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyId
     *        A unique identifier for the CMK.</p>
     *        <p>
     *        Use the CMK's unique identifier or its Amazon Resource Name (ARN). For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Unique ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
     *        </p>
     *        </li>
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * A unique identifier for the CMK.
     * </p>
     * <p>
     * Use the CMK's unique identifier or its Amazon Resource Name (ARN). For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * </ul>
     * 
     * @return A unique identifier for the CMK.</p>
     *         <p>
     *         Use the CMK's unique identifier or its Amazon Resource Name (ARN). For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Unique ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
     *         </p>
     *         </li>
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * A unique identifier for the CMK.
     * </p>
     * <p>
     * Use the CMK's unique identifier or its Amazon Resource Name (ARN). For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Unique ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyId
     *        A unique identifier for the CMK.</p>
     *        <p>
     *        Use the CMK's unique identifier or its Amazon Resource Name (ARN). For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Unique ID: 1234abcd-12ab-34cd-56ef-1234567890ab
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableKeyRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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

        if (obj instanceof DisableKeyRequest == false)
            return false;
        DisableKeyRequest other = (DisableKeyRequest) obj;
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
    public DisableKeyRequest clone() {
        return (DisableKeyRequest) super.clone();
    }

}
