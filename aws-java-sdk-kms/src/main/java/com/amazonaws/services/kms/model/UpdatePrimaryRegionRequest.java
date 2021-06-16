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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/UpdatePrimaryRegion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePrimaryRegionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifies the current primary key. When the operation completes, this CMK will be a replica key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The AWS Region of the new primary key. Enter the Region ID, such as <code>us-east-1</code> or
     * <code>ap-southeast-2</code>. There must be an existing replica key in this Region.
     * </p>
     * <p>
     * When the operation completes, the multi-Region key in this Region will be the primary key.
     * </p>
     */
    private String primaryRegion;

    /**
     * <p>
     * Identifies the current primary key. When the operation completes, this CMK will be a replica key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @param keyId
     *        Identifies the current primary key. When the operation completes, this CMK will be a replica key.</p>
     *        <p>
     *        Specify the key ID or key ARN of a multi-Region primary key.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Identifies the current primary key. When the operation completes, this CMK will be a replica key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @return Identifies the current primary key. When the operation completes, this CMK will be a replica key.</p>
     *         <p>
     *         Specify the key ID or key ARN of a multi-Region primary key.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * Identifies the current primary key. When the operation completes, this CMK will be a replica key.
     * </p>
     * <p>
     * Specify the key ID or key ARN of a multi-Region primary key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @param keyId
     *        Identifies the current primary key. When the operation completes, this CMK will be a replica key.</p>
     *        <p>
     *        Specify the key ID or key ARN of a multi-Region primary key.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the key ID and key ARN for a CMK, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePrimaryRegionRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The AWS Region of the new primary key. Enter the Region ID, such as <code>us-east-1</code> or
     * <code>ap-southeast-2</code>. There must be an existing replica key in this Region.
     * </p>
     * <p>
     * When the operation completes, the multi-Region key in this Region will be the primary key.
     * </p>
     * 
     * @param primaryRegion
     *        The AWS Region of the new primary key. Enter the Region ID, such as <code>us-east-1</code> or
     *        <code>ap-southeast-2</code>. There must be an existing replica key in this Region. </p>
     *        <p>
     *        When the operation completes, the multi-Region key in this Region will be the primary key.
     */

    public void setPrimaryRegion(String primaryRegion) {
        this.primaryRegion = primaryRegion;
    }

    /**
     * <p>
     * The AWS Region of the new primary key. Enter the Region ID, such as <code>us-east-1</code> or
     * <code>ap-southeast-2</code>. There must be an existing replica key in this Region.
     * </p>
     * <p>
     * When the operation completes, the multi-Region key in this Region will be the primary key.
     * </p>
     * 
     * @return The AWS Region of the new primary key. Enter the Region ID, such as <code>us-east-1</code> or
     *         <code>ap-southeast-2</code>. There must be an existing replica key in this Region. </p>
     *         <p>
     *         When the operation completes, the multi-Region key in this Region will be the primary key.
     */

    public String getPrimaryRegion() {
        return this.primaryRegion;
    }

    /**
     * <p>
     * The AWS Region of the new primary key. Enter the Region ID, such as <code>us-east-1</code> or
     * <code>ap-southeast-2</code>. There must be an existing replica key in this Region.
     * </p>
     * <p>
     * When the operation completes, the multi-Region key in this Region will be the primary key.
     * </p>
     * 
     * @param primaryRegion
     *        The AWS Region of the new primary key. Enter the Region ID, such as <code>us-east-1</code> or
     *        <code>ap-southeast-2</code>. There must be an existing replica key in this Region. </p>
     *        <p>
     *        When the operation completes, the multi-Region key in this Region will be the primary key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePrimaryRegionRequest withPrimaryRegion(String primaryRegion) {
        setPrimaryRegion(primaryRegion);
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
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getPrimaryRegion() != null)
            sb.append("PrimaryRegion: ").append(getPrimaryRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePrimaryRegionRequest == false)
            return false;
        UpdatePrimaryRegionRequest other = (UpdatePrimaryRegionRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getPrimaryRegion() == null ^ this.getPrimaryRegion() == null)
            return false;
        if (other.getPrimaryRegion() != null && other.getPrimaryRegion().equals(this.getPrimaryRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getPrimaryRegion() == null) ? 0 : getPrimaryRegion().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePrimaryRegionRequest clone() {
        return (UpdatePrimaryRegionRequest) super.clone();
    }

}
