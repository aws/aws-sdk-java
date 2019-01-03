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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an alias.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/AliasListEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AliasListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * String that contains the alias.
     * </p>
     */
    private String aliasName;
    /**
     * <p>
     * String that contains the key ARN.
     * </p>
     */
    private String aliasArn;
    /**
     * <p>
     * String that contains the key identifier referred to by the alias.
     * </p>
     */
    private String targetKeyId;

    /**
     * <p>
     * String that contains the alias.
     * </p>
     * 
     * @param aliasName
     *        String that contains the alias.
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * String that contains the alias.
     * </p>
     * 
     * @return String that contains the alias.
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * String that contains the alias.
     * </p>
     * 
     * @param aliasName
     *        String that contains the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AliasListEntry withAliasName(String aliasName) {
        setAliasName(aliasName);
        return this;
    }

    /**
     * <p>
     * String that contains the key ARN.
     * </p>
     * 
     * @param aliasArn
     *        String that contains the key ARN.
     */

    public void setAliasArn(String aliasArn) {
        this.aliasArn = aliasArn;
    }

    /**
     * <p>
     * String that contains the key ARN.
     * </p>
     * 
     * @return String that contains the key ARN.
     */

    public String getAliasArn() {
        return this.aliasArn;
    }

    /**
     * <p>
     * String that contains the key ARN.
     * </p>
     * 
     * @param aliasArn
     *        String that contains the key ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AliasListEntry withAliasArn(String aliasArn) {
        setAliasArn(aliasArn);
        return this;
    }

    /**
     * <p>
     * String that contains the key identifier referred to by the alias.
     * </p>
     * 
     * @param targetKeyId
     *        String that contains the key identifier referred to by the alias.
     */

    public void setTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
    }

    /**
     * <p>
     * String that contains the key identifier referred to by the alias.
     * </p>
     * 
     * @return String that contains the key identifier referred to by the alias.
     */

    public String getTargetKeyId() {
        return this.targetKeyId;
    }

    /**
     * <p>
     * String that contains the key identifier referred to by the alias.
     * </p>
     * 
     * @param targetKeyId
     *        String that contains the key identifier referred to by the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AliasListEntry withTargetKeyId(String targetKeyId) {
        setTargetKeyId(targetKeyId);
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
        if (getAliasName() != null)
            sb.append("AliasName: ").append(getAliasName()).append(",");
        if (getAliasArn() != null)
            sb.append("AliasArn: ").append(getAliasArn()).append(",");
        if (getTargetKeyId() != null)
            sb.append("TargetKeyId: ").append(getTargetKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AliasListEntry == false)
            return false;
        AliasListEntry other = (AliasListEntry) obj;
        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        if (other.getAliasArn() == null ^ this.getAliasArn() == null)
            return false;
        if (other.getAliasArn() != null && other.getAliasArn().equals(this.getAliasArn()) == false)
            return false;
        if (other.getTargetKeyId() == null ^ this.getTargetKeyId() == null)
            return false;
        if (other.getTargetKeyId() != null && other.getTargetKeyId().equals(this.getTargetKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        hashCode = prime * hashCode + ((getAliasArn() == null) ? 0 : getAliasArn().hashCode());
        hashCode = prime * hashCode + ((getTargetKeyId() == null) ? 0 : getTargetKeyId().hashCode());
        return hashCode;
    }

    @Override
    public AliasListEntry clone() {
        try {
            return (AliasListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kms.model.transform.AliasListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
