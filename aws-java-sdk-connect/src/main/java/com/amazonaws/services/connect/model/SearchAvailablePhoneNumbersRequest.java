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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchAvailablePhoneNumbers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchAvailablePhoneNumbersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The ISO country code.
     * </p>
     */
    private String phoneNumberCountryCode;
    /**
     * <p>
     * The type of phone number.
     * </p>
     */
    private String phoneNumberType;
    /**
     * <p>
     * The prefix of the phone number. If provided, it must contain <code>+</code> as part of the country code.
     * </p>
     */
    private String phoneNumberPrefix;
    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone
     *        numbers are claimed to.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone
     *         numbers are claimed to.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone
     *        numbers are claimed to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAvailablePhoneNumbersRequest withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @param phoneNumberCountryCode
     *        The ISO country code.
     * @see PhoneNumberCountryCode
     */

    public void setPhoneNumberCountryCode(String phoneNumberCountryCode) {
        this.phoneNumberCountryCode = phoneNumberCountryCode;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @return The ISO country code.
     * @see PhoneNumberCountryCode
     */

    public String getPhoneNumberCountryCode() {
        return this.phoneNumberCountryCode;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @param phoneNumberCountryCode
     *        The ISO country code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberCountryCode
     */

    public SearchAvailablePhoneNumbersRequest withPhoneNumberCountryCode(String phoneNumberCountryCode) {
        setPhoneNumberCountryCode(phoneNumberCountryCode);
        return this;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @param phoneNumberCountryCode
     *        The ISO country code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberCountryCode
     */

    public SearchAvailablePhoneNumbersRequest withPhoneNumberCountryCode(PhoneNumberCountryCode phoneNumberCountryCode) {
        this.phoneNumberCountryCode = phoneNumberCountryCode.toString();
        return this;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @param phoneNumberType
     *        The type of phone number.
     * @see PhoneNumberType
     */

    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @return The type of phone number.
     * @see PhoneNumberType
     */

    public String getPhoneNumberType() {
        return this.phoneNumberType;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @param phoneNumberType
     *        The type of phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public SearchAvailablePhoneNumbersRequest withPhoneNumberType(String phoneNumberType) {
        setPhoneNumberType(phoneNumberType);
        return this;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @param phoneNumberType
     *        The type of phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public SearchAvailablePhoneNumbersRequest withPhoneNumberType(PhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType.toString();
        return this;
    }

    /**
     * <p>
     * The prefix of the phone number. If provided, it must contain <code>+</code> as part of the country code.
     * </p>
     * 
     * @param phoneNumberPrefix
     *        The prefix of the phone number. If provided, it must contain <code>+</code> as part of the country code.
     */

    public void setPhoneNumberPrefix(String phoneNumberPrefix) {
        this.phoneNumberPrefix = phoneNumberPrefix;
    }

    /**
     * <p>
     * The prefix of the phone number. If provided, it must contain <code>+</code> as part of the country code.
     * </p>
     * 
     * @return The prefix of the phone number. If provided, it must contain <code>+</code> as part of the country code.
     */

    public String getPhoneNumberPrefix() {
        return this.phoneNumberPrefix;
    }

    /**
     * <p>
     * The prefix of the phone number. If provided, it must contain <code>+</code> as part of the country code.
     * </p>
     * 
     * @param phoneNumberPrefix
     *        The prefix of the phone number. If provided, it must contain <code>+</code> as part of the country code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAvailablePhoneNumbersRequest withPhoneNumberPrefix(String phoneNumberPrefix) {
        setPhoneNumberPrefix(phoneNumberPrefix);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @return The maximum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAvailablePhoneNumbersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAvailablePhoneNumbersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getPhoneNumberCountryCode() != null)
            sb.append("PhoneNumberCountryCode: ").append(getPhoneNumberCountryCode()).append(",");
        if (getPhoneNumberType() != null)
            sb.append("PhoneNumberType: ").append(getPhoneNumberType()).append(",");
        if (getPhoneNumberPrefix() != null)
            sb.append("PhoneNumberPrefix: ").append(getPhoneNumberPrefix()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchAvailablePhoneNumbersRequest == false)
            return false;
        SearchAvailablePhoneNumbersRequest other = (SearchAvailablePhoneNumbersRequest) obj;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getPhoneNumberCountryCode() == null ^ this.getPhoneNumberCountryCode() == null)
            return false;
        if (other.getPhoneNumberCountryCode() != null && other.getPhoneNumberCountryCode().equals(this.getPhoneNumberCountryCode()) == false)
            return false;
        if (other.getPhoneNumberType() == null ^ this.getPhoneNumberType() == null)
            return false;
        if (other.getPhoneNumberType() != null && other.getPhoneNumberType().equals(this.getPhoneNumberType()) == false)
            return false;
        if (other.getPhoneNumberPrefix() == null ^ this.getPhoneNumberPrefix() == null)
            return false;
        if (other.getPhoneNumberPrefix() != null && other.getPhoneNumberPrefix().equals(this.getPhoneNumberPrefix()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberCountryCode() == null) ? 0 : getPhoneNumberCountryCode().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberType() == null) ? 0 : getPhoneNumberType().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberPrefix() == null) ? 0 : getPhoneNumberPrefix().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchAvailablePhoneNumbersRequest clone() {
        return (SearchAvailablePhoneNumbersRequest) super.clone();
    }

}
