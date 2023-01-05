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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPhoneNumbersV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPhoneNumbersV2Request extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to. If <code>TargetArn</code> input is not provided, this API lists numbers claimed to all the Amazon
     * Connect instances belonging to your account in the same Amazon Web Services Region as the request.
     * </p>
     */
    private String targetArn;
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
     * The ISO country code.
     * </p>
     */
    private java.util.List<String> phoneNumberCountryCodes;
    /**
     * <p>
     * The type of phone number.
     * </p>
     */
    private java.util.List<String> phoneNumberTypes;
    /**
     * <p>
     * The prefix of the phone number. If provided, it must contain <code>+</code> as part of the country code.
     * </p>
     */
    private String phoneNumberPrefix;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to. If <code>TargetArn</code> input is not provided, this API lists numbers claimed to all the Amazon
     * Connect instances belonging to your account in the same Amazon Web Services Region as the request.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone
     *        numbers are claimed to. If <code>TargetArn</code> input is not provided, this API lists numbers claimed to
     *        all the Amazon Connect instances belonging to your account in the same Amazon Web Services Region as the
     *        request.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to. If <code>TargetArn</code> input is not provided, this API lists numbers claimed to all the Amazon
     * Connect instances belonging to your account in the same Amazon Web Services Region as the request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone
     *         numbers are claimed to. If <code>TargetArn</code> input is not provided, this API lists numbers claimed
     *         to all the Amazon Connect instances belonging to your account in the same Amazon Web Services Region as
     *         the request.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to. If <code>TargetArn</code> input is not provided, this API lists numbers claimed to all the Amazon
     * Connect instances belonging to your account in the same Amazon Web Services Region as the request.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone
     *        numbers are claimed to. If <code>TargetArn</code> input is not provided, this API lists numbers claimed to
     *        all the Amazon Connect instances belonging to your account in the same Amazon Web Services Region as the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumbersV2Request withTargetArn(String targetArn) {
        setTargetArn(targetArn);
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

    public ListPhoneNumbersV2Request withMaxResults(Integer maxResults) {
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

    public ListPhoneNumbersV2Request withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @return The ISO country code.
     * @see PhoneNumberCountryCode
     */

    public java.util.List<String> getPhoneNumberCountryCodes() {
        return phoneNumberCountryCodes;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @param phoneNumberCountryCodes
     *        The ISO country code.
     * @see PhoneNumberCountryCode
     */

    public void setPhoneNumberCountryCodes(java.util.Collection<String> phoneNumberCountryCodes) {
        if (phoneNumberCountryCodes == null) {
            this.phoneNumberCountryCodes = null;
            return;
        }

        this.phoneNumberCountryCodes = new java.util.ArrayList<String>(phoneNumberCountryCodes);
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumberCountryCodes(java.util.Collection)} or
     * {@link #withPhoneNumberCountryCodes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param phoneNumberCountryCodes
     *        The ISO country code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberCountryCode
     */

    public ListPhoneNumbersV2Request withPhoneNumberCountryCodes(String... phoneNumberCountryCodes) {
        if (this.phoneNumberCountryCodes == null) {
            setPhoneNumberCountryCodes(new java.util.ArrayList<String>(phoneNumberCountryCodes.length));
        }
        for (String ele : phoneNumberCountryCodes) {
            this.phoneNumberCountryCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @param phoneNumberCountryCodes
     *        The ISO country code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberCountryCode
     */

    public ListPhoneNumbersV2Request withPhoneNumberCountryCodes(java.util.Collection<String> phoneNumberCountryCodes) {
        setPhoneNumberCountryCodes(phoneNumberCountryCodes);
        return this;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @param phoneNumberCountryCodes
     *        The ISO country code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberCountryCode
     */

    public ListPhoneNumbersV2Request withPhoneNumberCountryCodes(PhoneNumberCountryCode... phoneNumberCountryCodes) {
        java.util.ArrayList<String> phoneNumberCountryCodesCopy = new java.util.ArrayList<String>(phoneNumberCountryCodes.length);
        for (PhoneNumberCountryCode value : phoneNumberCountryCodes) {
            phoneNumberCountryCodesCopy.add(value.toString());
        }
        if (getPhoneNumberCountryCodes() == null) {
            setPhoneNumberCountryCodes(phoneNumberCountryCodesCopy);
        } else {
            getPhoneNumberCountryCodes().addAll(phoneNumberCountryCodesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @return The type of phone number.
     * @see PhoneNumberType
     */

    public java.util.List<String> getPhoneNumberTypes() {
        return phoneNumberTypes;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @param phoneNumberTypes
     *        The type of phone number.
     * @see PhoneNumberType
     */

    public void setPhoneNumberTypes(java.util.Collection<String> phoneNumberTypes) {
        if (phoneNumberTypes == null) {
            this.phoneNumberTypes = null;
            return;
        }

        this.phoneNumberTypes = new java.util.ArrayList<String>(phoneNumberTypes);
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumberTypes(java.util.Collection)} or {@link #withPhoneNumberTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param phoneNumberTypes
     *        The type of phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public ListPhoneNumbersV2Request withPhoneNumberTypes(String... phoneNumberTypes) {
        if (this.phoneNumberTypes == null) {
            setPhoneNumberTypes(new java.util.ArrayList<String>(phoneNumberTypes.length));
        }
        for (String ele : phoneNumberTypes) {
            this.phoneNumberTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @param phoneNumberTypes
     *        The type of phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public ListPhoneNumbersV2Request withPhoneNumberTypes(java.util.Collection<String> phoneNumberTypes) {
        setPhoneNumberTypes(phoneNumberTypes);
        return this;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @param phoneNumberTypes
     *        The type of phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public ListPhoneNumbersV2Request withPhoneNumberTypes(PhoneNumberType... phoneNumberTypes) {
        java.util.ArrayList<String> phoneNumberTypesCopy = new java.util.ArrayList<String>(phoneNumberTypes.length);
        for (PhoneNumberType value : phoneNumberTypes) {
            phoneNumberTypesCopy.add(value.toString());
        }
        if (getPhoneNumberTypes() == null) {
            setPhoneNumberTypes(phoneNumberTypesCopy);
        } else {
            getPhoneNumberTypes().addAll(phoneNumberTypesCopy);
        }
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

    public ListPhoneNumbersV2Request withPhoneNumberPrefix(String phoneNumberPrefix) {
        setPhoneNumberPrefix(phoneNumberPrefix);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPhoneNumberCountryCodes() != null)
            sb.append("PhoneNumberCountryCodes: ").append(getPhoneNumberCountryCodes()).append(",");
        if (getPhoneNumberTypes() != null)
            sb.append("PhoneNumberTypes: ").append(getPhoneNumberTypes()).append(",");
        if (getPhoneNumberPrefix() != null)
            sb.append("PhoneNumberPrefix: ").append(getPhoneNumberPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPhoneNumbersV2Request == false)
            return false;
        ListPhoneNumbersV2Request other = (ListPhoneNumbersV2Request) obj;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPhoneNumberCountryCodes() == null ^ this.getPhoneNumberCountryCodes() == null)
            return false;
        if (other.getPhoneNumberCountryCodes() != null && other.getPhoneNumberCountryCodes().equals(this.getPhoneNumberCountryCodes()) == false)
            return false;
        if (other.getPhoneNumberTypes() == null ^ this.getPhoneNumberTypes() == null)
            return false;
        if (other.getPhoneNumberTypes() != null && other.getPhoneNumberTypes().equals(this.getPhoneNumberTypes()) == false)
            return false;
        if (other.getPhoneNumberPrefix() == null ^ this.getPhoneNumberPrefix() == null)
            return false;
        if (other.getPhoneNumberPrefix() != null && other.getPhoneNumberPrefix().equals(this.getPhoneNumberPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberCountryCodes() == null) ? 0 : getPhoneNumberCountryCodes().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberTypes() == null) ? 0 : getPhoneNumberTypes().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberPrefix() == null) ? 0 : getPhoneNumberPrefix().hashCode());
        return hashCode;
    }

    @Override
    public ListPhoneNumbersV2Request clone() {
        return (ListPhoneNumbersV2Request) super.clone();
    }

}
