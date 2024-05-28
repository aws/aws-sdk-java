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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * AWS Key Management Service (KMS) Key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/KmsKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KmsKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * KMS Alias Arn.
     * </p>
     */
    private String kmsAliasArn;
    /**
     * <p>
     * KMS Alias Name.
     * </p>
     */
    private String kmsAliasName;
    /**
     * <p>
     * KMS Key Arn.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * KMS Alias Arn.
     * </p>
     * 
     * @param kmsAliasArn
     *        KMS Alias Arn.
     */

    public void setKmsAliasArn(String kmsAliasArn) {
        this.kmsAliasArn = kmsAliasArn;
    }

    /**
     * <p>
     * KMS Alias Arn.
     * </p>
     * 
     * @return KMS Alias Arn.
     */

    public String getKmsAliasArn() {
        return this.kmsAliasArn;
    }

    /**
     * <p>
     * KMS Alias Arn.
     * </p>
     * 
     * @param kmsAliasArn
     *        KMS Alias Arn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsKey withKmsAliasArn(String kmsAliasArn) {
        setKmsAliasArn(kmsAliasArn);
        return this;
    }

    /**
     * <p>
     * KMS Alias Name.
     * </p>
     * 
     * @param kmsAliasName
     *        KMS Alias Name.
     */

    public void setKmsAliasName(String kmsAliasName) {
        this.kmsAliasName = kmsAliasName;
    }

    /**
     * <p>
     * KMS Alias Name.
     * </p>
     * 
     * @return KMS Alias Name.
     */

    public String getKmsAliasName() {
        return this.kmsAliasName;
    }

    /**
     * <p>
     * KMS Alias Name.
     * </p>
     * 
     * @param kmsAliasName
     *        KMS Alias Name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsKey withKmsAliasName(String kmsAliasName) {
        setKmsAliasName(kmsAliasName);
        return this;
    }

    /**
     * <p>
     * KMS Key Arn.
     * </p>
     * 
     * @param kmsKeyArn
     *        KMS Key Arn.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * KMS Key Arn.
     * </p>
     * 
     * @return KMS Key Arn.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * KMS Key Arn.
     * </p>
     * 
     * @param kmsKeyArn
     *        KMS Key Arn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsKey withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getKmsAliasArn() != null)
            sb.append("KmsAliasArn: ").append(getKmsAliasArn()).append(",");
        if (getKmsAliasName() != null)
            sb.append("KmsAliasName: ").append(getKmsAliasName()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KmsKey == false)
            return false;
        KmsKey other = (KmsKey) obj;
        if (other.getKmsAliasArn() == null ^ this.getKmsAliasArn() == null)
            return false;
        if (other.getKmsAliasArn() != null && other.getKmsAliasArn().equals(this.getKmsAliasArn()) == false)
            return false;
        if (other.getKmsAliasName() == null ^ this.getKmsAliasName() == null)
            return false;
        if (other.getKmsAliasName() != null && other.getKmsAliasName().equals(this.getKmsAliasName()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsAliasArn() == null) ? 0 : getKmsAliasArn().hashCode());
        hashCode = prime * hashCode + ((getKmsAliasName() == null) ? 0 : getKmsAliasName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public KmsKey clone() {
        try {
            return (KmsKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.KmsKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
