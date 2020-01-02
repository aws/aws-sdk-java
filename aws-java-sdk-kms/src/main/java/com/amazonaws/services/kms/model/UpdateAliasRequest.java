/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/UpdateAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies the alias that is changing its CMK. This value must begin with <code>alias/</code> followed by the
     * alias name, such as <code>alias/ExampleAlias</code>. You cannot use UpdateAlias to change the alias name.
     * </p>
     */
    private String aliasName;
    /**
     * <p>
     * Identifies the CMK to associate with the alias. When the update operation completes, the alias will point to this
     * CMK.
     * </p>
     * <p>
     * The CMK must be in the same AWS account and Region as the alias. Also, the new target CMK must be the same type
     * as the current target CMK (both symmetric or both asymmetric) and they must have the same key usage.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * <p>
     * To verify that the alias is mapped to the correct CMK, use <a>ListAliases</a>.
     * </p>
     */
    private String targetKeyId;

    /**
     * <p>
     * Identifies the alias that is changing its CMK. This value must begin with <code>alias/</code> followed by the
     * alias name, such as <code>alias/ExampleAlias</code>. You cannot use UpdateAlias to change the alias name.
     * </p>
     * 
     * @param aliasName
     *        Identifies the alias that is changing its CMK. This value must begin with <code>alias/</code> followed by
     *        the alias name, such as <code>alias/ExampleAlias</code>. You cannot use UpdateAlias to change the alias
     *        name.
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * Identifies the alias that is changing its CMK. This value must begin with <code>alias/</code> followed by the
     * alias name, such as <code>alias/ExampleAlias</code>. You cannot use UpdateAlias to change the alias name.
     * </p>
     * 
     * @return Identifies the alias that is changing its CMK. This value must begin with <code>alias/</code> followed by
     *         the alias name, such as <code>alias/ExampleAlias</code>. You cannot use UpdateAlias to change the alias
     *         name.
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * Identifies the alias that is changing its CMK. This value must begin with <code>alias/</code> followed by the
     * alias name, such as <code>alias/ExampleAlias</code>. You cannot use UpdateAlias to change the alias name.
     * </p>
     * 
     * @param aliasName
     *        Identifies the alias that is changing its CMK. This value must begin with <code>alias/</code> followed by
     *        the alias name, such as <code>alias/ExampleAlias</code>. You cannot use UpdateAlias to change the alias
     *        name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAliasRequest withAliasName(String aliasName) {
        setAliasName(aliasName);
        return this;
    }

    /**
     * <p>
     * Identifies the CMK to associate with the alias. When the update operation completes, the alias will point to this
     * CMK.
     * </p>
     * <p>
     * The CMK must be in the same AWS account and Region as the alias. Also, the new target CMK must be the same type
     * as the current target CMK (both symmetric or both asymmetric) and they must have the same key usage.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * <p>
     * To verify that the alias is mapped to the correct CMK, use <a>ListAliases</a>.
     * </p>
     * 
     * @param targetKeyId
     *        Identifies the CMK to associate with the alias. When the update operation completes, the alias will point
     *        to this CMK. </p>
     *        <p>
     *        The CMK must be in the same AWS account and Region as the alias. Also, the new target CMK must be the same
     *        type as the current target CMK (both symmetric or both asymmetric) and they must have the same key usage.
     *        </p>
     *        <p>
     *        Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     *        </p>
     *        <p>
     *        To verify that the alias is mapped to the correct CMK, use <a>ListAliases</a>.
     */

    public void setTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
    }

    /**
     * <p>
     * Identifies the CMK to associate with the alias. When the update operation completes, the alias will point to this
     * CMK.
     * </p>
     * <p>
     * The CMK must be in the same AWS account and Region as the alias. Also, the new target CMK must be the same type
     * as the current target CMK (both symmetric or both asymmetric) and they must have the same key usage.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * <p>
     * To verify that the alias is mapped to the correct CMK, use <a>ListAliases</a>.
     * </p>
     * 
     * @return Identifies the CMK to associate with the alias. When the update operation completes, the alias will point
     *         to this CMK. </p>
     *         <p>
     *         The CMK must be in the same AWS account and Region as the alias. Also, the new target CMK must be the
     *         same type as the current target CMK (both symmetric or both asymmetric) and they must have the same key
     *         usage.
     *         </p>
     *         <p>
     *         Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     *         </p>
     *         <p>
     *         To verify that the alias is mapped to the correct CMK, use <a>ListAliases</a>.
     */

    public String getTargetKeyId() {
        return this.targetKeyId;
    }

    /**
     * <p>
     * Identifies the CMK to associate with the alias. When the update operation completes, the alias will point to this
     * CMK.
     * </p>
     * <p>
     * The CMK must be in the same AWS account and Region as the alias. Also, the new target CMK must be the same type
     * as the current target CMK (both symmetric or both asymmetric) and they must have the same key usage.
     * </p>
     * <p>
     * Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * <p>
     * To verify that the alias is mapped to the correct CMK, use <a>ListAliases</a>.
     * </p>
     * 
     * @param targetKeyId
     *        Identifies the CMK to associate with the alias. When the update operation completes, the alias will point
     *        to this CMK. </p>
     *        <p>
     *        The CMK must be in the same AWS account and Region as the alias. Also, the new target CMK must be the same
     *        type as the current target CMK (both symmetric or both asymmetric) and they must have the same key usage.
     *        </p>
     *        <p>
     *        Specify the key ID or the Amazon Resource Name (ARN) of the CMK.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     *        </p>
     *        <p>
     *        To verify that the alias is mapped to the correct CMK, use <a>ListAliases</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAliasRequest withTargetKeyId(String targetKeyId) {
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

        if (obj instanceof UpdateAliasRequest == false)
            return false;
        UpdateAliasRequest other = (UpdateAliasRequest) obj;
        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null && other.getAliasName().equals(this.getAliasName()) == false)
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
        hashCode = prime * hashCode + ((getTargetKeyId() == null) ? 0 : getTargetKeyId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAliasRequest clone() {
        return (UpdateAliasRequest) super.clone();
    }

}
