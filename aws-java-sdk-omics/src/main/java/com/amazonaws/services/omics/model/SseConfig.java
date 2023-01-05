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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Server-side encryption (SSE) settings for a store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/SseConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SseConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An encryption key ARN.
     * </p>
     */
    private String keyArn;
    /**
     * <p>
     * The encryption type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * An encryption key ARN.
     * </p>
     * 
     * @param keyArn
     *        An encryption key ARN.
     */

    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * <p>
     * An encryption key ARN.
     * </p>
     * 
     * @return An encryption key ARN.
     */

    public String getKeyArn() {
        return this.keyArn;
    }

    /**
     * <p>
     * An encryption key ARN.
     * </p>
     * 
     * @param keyArn
     *        An encryption key ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SseConfig withKeyArn(String keyArn) {
        setKeyArn(keyArn);
        return this;
    }

    /**
     * <p>
     * The encryption type.
     * </p>
     * 
     * @param type
     *        The encryption type.
     * @see EncryptionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The encryption type.
     * </p>
     * 
     * @return The encryption type.
     * @see EncryptionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The encryption type.
     * </p>
     * 
     * @param type
     *        The encryption type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public SseConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The encryption type.
     * </p>
     * 
     * @param type
     *        The encryption type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public SseConfig withType(EncryptionType type) {
        this.type = type.toString();
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
        if (getKeyArn() != null)
            sb.append("KeyArn: ").append(getKeyArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SseConfig == false)
            return false;
        SseConfig other = (SseConfig) obj;
        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SseConfig clone() {
        try {
            return (SseConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.SseConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
