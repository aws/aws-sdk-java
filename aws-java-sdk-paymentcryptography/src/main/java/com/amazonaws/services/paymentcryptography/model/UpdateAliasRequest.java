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
package com.amazonaws.services.paymentcryptography.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/UpdateAlias" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The alias whose associated key is changing.
     * </p>
     */
    private String aliasName;
    /**
     * <p>
     * The <code>KeyARN</code> for the key that you are updating or removing from the alias.
     * </p>
     */
    private String keyArn;

    /**
     * <p>
     * The alias whose associated key is changing.
     * </p>
     * 
     * @param aliasName
     *        The alias whose associated key is changing.
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * The alias whose associated key is changing.
     * </p>
     * 
     * @return The alias whose associated key is changing.
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * The alias whose associated key is changing.
     * </p>
     * 
     * @param aliasName
     *        The alias whose associated key is changing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAliasRequest withAliasName(String aliasName) {
        setAliasName(aliasName);
        return this;
    }

    /**
     * <p>
     * The <code>KeyARN</code> for the key that you are updating or removing from the alias.
     * </p>
     * 
     * @param keyArn
     *        The <code>KeyARN</code> for the key that you are updating or removing from the alias.
     */

    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * <p>
     * The <code>KeyARN</code> for the key that you are updating or removing from the alias.
     * </p>
     * 
     * @return The <code>KeyARN</code> for the key that you are updating or removing from the alias.
     */

    public String getKeyArn() {
        return this.keyArn;
    }

    /**
     * <p>
     * The <code>KeyARN</code> for the key that you are updating or removing from the alias.
     * </p>
     * 
     * @param keyArn
     *        The <code>KeyARN</code> for the key that you are updating or removing from the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAliasRequest withKeyArn(String keyArn) {
        setKeyArn(keyArn);
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
        if (getKeyArn() != null)
            sb.append("KeyArn: ").append(getKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAliasRequest == false)
            return false;
        UpdateAliasRequest other = (UpdateAliasRequest) obj;
        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAliasRequest clone() {
        return (UpdateAliasRequest) super.clone();
    }

}
