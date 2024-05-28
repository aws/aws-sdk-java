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
package com.amazonaws.services.mediapackagev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The encryption type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/EncryptionMethod" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionMethod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The encryption method to use.
     * </p>
     */
    private String tsEncryptionMethod;
    /**
     * <p>
     * The encryption method to use.
     * </p>
     */
    private String cmafEncryptionMethod;

    /**
     * <p>
     * The encryption method to use.
     * </p>
     * 
     * @param tsEncryptionMethod
     *        The encryption method to use.
     * @see TsEncryptionMethod
     */

    public void setTsEncryptionMethod(String tsEncryptionMethod) {
        this.tsEncryptionMethod = tsEncryptionMethod;
    }

    /**
     * <p>
     * The encryption method to use.
     * </p>
     * 
     * @return The encryption method to use.
     * @see TsEncryptionMethod
     */

    public String getTsEncryptionMethod() {
        return this.tsEncryptionMethod;
    }

    /**
     * <p>
     * The encryption method to use.
     * </p>
     * 
     * @param tsEncryptionMethod
     *        The encryption method to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TsEncryptionMethod
     */

    public EncryptionMethod withTsEncryptionMethod(String tsEncryptionMethod) {
        setTsEncryptionMethod(tsEncryptionMethod);
        return this;
    }

    /**
     * <p>
     * The encryption method to use.
     * </p>
     * 
     * @param tsEncryptionMethod
     *        The encryption method to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TsEncryptionMethod
     */

    public EncryptionMethod withTsEncryptionMethod(TsEncryptionMethod tsEncryptionMethod) {
        this.tsEncryptionMethod = tsEncryptionMethod.toString();
        return this;
    }

    /**
     * <p>
     * The encryption method to use.
     * </p>
     * 
     * @param cmafEncryptionMethod
     *        The encryption method to use.
     * @see CmafEncryptionMethod
     */

    public void setCmafEncryptionMethod(String cmafEncryptionMethod) {
        this.cmafEncryptionMethod = cmafEncryptionMethod;
    }

    /**
     * <p>
     * The encryption method to use.
     * </p>
     * 
     * @return The encryption method to use.
     * @see CmafEncryptionMethod
     */

    public String getCmafEncryptionMethod() {
        return this.cmafEncryptionMethod;
    }

    /**
     * <p>
     * The encryption method to use.
     * </p>
     * 
     * @param cmafEncryptionMethod
     *        The encryption method to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafEncryptionMethod
     */

    public EncryptionMethod withCmafEncryptionMethod(String cmafEncryptionMethod) {
        setCmafEncryptionMethod(cmafEncryptionMethod);
        return this;
    }

    /**
     * <p>
     * The encryption method to use.
     * </p>
     * 
     * @param cmafEncryptionMethod
     *        The encryption method to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmafEncryptionMethod
     */

    public EncryptionMethod withCmafEncryptionMethod(CmafEncryptionMethod cmafEncryptionMethod) {
        this.cmafEncryptionMethod = cmafEncryptionMethod.toString();
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
        if (getTsEncryptionMethod() != null)
            sb.append("TsEncryptionMethod: ").append(getTsEncryptionMethod()).append(",");
        if (getCmafEncryptionMethod() != null)
            sb.append("CmafEncryptionMethod: ").append(getCmafEncryptionMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionMethod == false)
            return false;
        EncryptionMethod other = (EncryptionMethod) obj;
        if (other.getTsEncryptionMethod() == null ^ this.getTsEncryptionMethod() == null)
            return false;
        if (other.getTsEncryptionMethod() != null && other.getTsEncryptionMethod().equals(this.getTsEncryptionMethod()) == false)
            return false;
        if (other.getCmafEncryptionMethod() == null ^ this.getCmafEncryptionMethod() == null)
            return false;
        if (other.getCmafEncryptionMethod() != null && other.getCmafEncryptionMethod().equals(this.getCmafEncryptionMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTsEncryptionMethod() == null) ? 0 : getTsEncryptionMethod().hashCode());
        hashCode = prime * hashCode + ((getCmafEncryptionMethod() == null) ? 0 : getCmafEncryptionMethod().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionMethod clone() {
        try {
            return (EncryptionMethod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.EncryptionMethodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
