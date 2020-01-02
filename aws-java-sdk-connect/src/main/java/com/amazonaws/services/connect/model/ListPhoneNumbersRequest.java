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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPhoneNumbers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPhoneNumbersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The type of phone number.
     * </p>
     */
    private java.util.List<String> phoneNumberTypes;
    /**
     * <p>
     * The ISO country code.
     * </p>
     */
    private java.util.List<String> phoneNumberCountryCodes;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximimum number of results to return per page.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumbersRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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

    public ListPhoneNumbersRequest withPhoneNumberTypes(String... phoneNumberTypes) {
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

    public ListPhoneNumbersRequest withPhoneNumberTypes(java.util.Collection<String> phoneNumberTypes) {
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

    public ListPhoneNumbersRequest withPhoneNumberTypes(PhoneNumberType... phoneNumberTypes) {
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

    public ListPhoneNumbersRequest withPhoneNumberCountryCodes(String... phoneNumberCountryCodes) {
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

    public ListPhoneNumbersRequest withPhoneNumberCountryCodes(java.util.Collection<String> phoneNumberCountryCodes) {
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

    public ListPhoneNumbersRequest withPhoneNumberCountryCodes(PhoneNumberCountryCode... phoneNumberCountryCodes) {
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

    public ListPhoneNumbersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximimum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximimum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximimum number of results to return per page.
     * </p>
     * 
     * @return The maximimum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximimum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximimum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumbersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getPhoneNumberTypes() != null)
            sb.append("PhoneNumberTypes: ").append(getPhoneNumberTypes()).append(",");
        if (getPhoneNumberCountryCodes() != null)
            sb.append("PhoneNumberCountryCodes: ").append(getPhoneNumberCountryCodes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPhoneNumbersRequest == false)
            return false;
        ListPhoneNumbersRequest other = (ListPhoneNumbersRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPhoneNumberTypes() == null ^ this.getPhoneNumberTypes() == null)
            return false;
        if (other.getPhoneNumberTypes() != null && other.getPhoneNumberTypes().equals(this.getPhoneNumberTypes()) == false)
            return false;
        if (other.getPhoneNumberCountryCodes() == null ^ this.getPhoneNumberCountryCodes() == null)
            return false;
        if (other.getPhoneNumberCountryCodes() != null && other.getPhoneNumberCountryCodes().equals(this.getPhoneNumberCountryCodes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberTypes() == null) ? 0 : getPhoneNumberTypes().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberCountryCodes() == null) ? 0 : getPhoneNumberCountryCodes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListPhoneNumbersRequest clone() {
        return (ListPhoneNumbersRequest) super.clone();
    }

}
