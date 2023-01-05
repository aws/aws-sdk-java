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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteKeyword"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteKeywordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, PoolId or PoolArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn and <a>DescribePools</a> to
     * find the values of PoolId and PoolArn.
     * </p>
     */
    private String originationIdentity;
    /**
     * <p>
     * The keyword to delete.
     * </p>
     */
    private String keyword;

    /**
     * <p>
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, PoolId or PoolArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn and <a>DescribePools</a> to
     * find the values of PoolId and PoolArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity to use such as a PhoneNumberId, PhoneNumberArn, PoolId or PoolArn. You can use
     *        <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn and
     *        <a>DescribePools</a> to find the values of PoolId and PoolArn.
     */

    public void setOriginationIdentity(String originationIdentity) {
        this.originationIdentity = originationIdentity;
    }

    /**
     * <p>
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, PoolId or PoolArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn and <a>DescribePools</a> to
     * find the values of PoolId and PoolArn.
     * </p>
     * 
     * @return The origination identity to use such as a PhoneNumberId, PhoneNumberArn, PoolId or PoolArn. You can use
     *         <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn and
     *         <a>DescribePools</a> to find the values of PoolId and PoolArn.
     */

    public String getOriginationIdentity() {
        return this.originationIdentity;
    }

    /**
     * <p>
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, PoolId or PoolArn. You can use
     * <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn and <a>DescribePools</a> to
     * find the values of PoolId and PoolArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity to use such as a PhoneNumberId, PhoneNumberArn, PoolId or PoolArn. You can use
     *        <a>DescribePhoneNumbers</a> to find the values for PhoneNumberId and PhoneNumberArn and
     *        <a>DescribePools</a> to find the values of PoolId and PoolArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteKeywordRequest withOriginationIdentity(String originationIdentity) {
        setOriginationIdentity(originationIdentity);
        return this;
    }

    /**
     * <p>
     * The keyword to delete.
     * </p>
     * 
     * @param keyword
     *        The keyword to delete.
     */

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * <p>
     * The keyword to delete.
     * </p>
     * 
     * @return The keyword to delete.
     */

    public String getKeyword() {
        return this.keyword;
    }

    /**
     * <p>
     * The keyword to delete.
     * </p>
     * 
     * @param keyword
     *        The keyword to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteKeywordRequest withKeyword(String keyword) {
        setKeyword(keyword);
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
        if (getOriginationIdentity() != null)
            sb.append("OriginationIdentity: ").append(getOriginationIdentity()).append(",");
        if (getKeyword() != null)
            sb.append("Keyword: ").append(getKeyword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteKeywordRequest == false)
            return false;
        DeleteKeywordRequest other = (DeleteKeywordRequest) obj;
        if (other.getOriginationIdentity() == null ^ this.getOriginationIdentity() == null)
            return false;
        if (other.getOriginationIdentity() != null && other.getOriginationIdentity().equals(this.getOriginationIdentity()) == false)
            return false;
        if (other.getKeyword() == null ^ this.getKeyword() == null)
            return false;
        if (other.getKeyword() != null && other.getKeyword().equals(this.getKeyword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginationIdentity() == null) ? 0 : getOriginationIdentity().hashCode());
        hashCode = prime * hashCode + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        return hashCode;
    }

    @Override
    public DeleteKeywordRequest clone() {
        return (DeleteKeywordRequest) super.clone();
    }

}
