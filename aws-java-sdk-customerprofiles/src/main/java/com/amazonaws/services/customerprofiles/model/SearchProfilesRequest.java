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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/SearchProfiles" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchProfilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token from the previous SearchProfiles API call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A searchable identifier of a customer profile. The predefined keys you can use to search include: _account,
     * _profileId, _fullName, _phone, _email, _ctrContactId, _marketoLeadId, _salesforceAccountId, _salesforceContactId,
     * _zendeskUserId, _zendeskExternalId, _serviceNowSystemId.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * A list of key values.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The pagination token from the previous SearchProfiles API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous SearchProfiles API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous SearchProfiles API call.
     * </p>
     * 
     * @return The pagination token from the previous SearchProfiles API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous SearchProfiles API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous SearchProfiles API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProfilesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects returned per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     * 
     * @return The maximum number of objects returned per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects returned per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects returned per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProfilesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProfilesRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A searchable identifier of a customer profile. The predefined keys you can use to search include: _account,
     * _profileId, _fullName, _phone, _email, _ctrContactId, _marketoLeadId, _salesforceAccountId, _salesforceContactId,
     * _zendeskUserId, _zendeskExternalId, _serviceNowSystemId.
     * </p>
     * 
     * @param keyName
     *        A searchable identifier of a customer profile. The predefined keys you can use to search include:
     *        _account, _profileId, _fullName, _phone, _email, _ctrContactId, _marketoLeadId, _salesforceAccountId,
     *        _salesforceContactId, _zendeskUserId, _zendeskExternalId, _serviceNowSystemId.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * A searchable identifier of a customer profile. The predefined keys you can use to search include: _account,
     * _profileId, _fullName, _phone, _email, _ctrContactId, _marketoLeadId, _salesforceAccountId, _salesforceContactId,
     * _zendeskUserId, _zendeskExternalId, _serviceNowSystemId.
     * </p>
     * 
     * @return A searchable identifier of a customer profile. The predefined keys you can use to search include:
     *         _account, _profileId, _fullName, _phone, _email, _ctrContactId, _marketoLeadId, _salesforceAccountId,
     *         _salesforceContactId, _zendeskUserId, _zendeskExternalId, _serviceNowSystemId.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * A searchable identifier of a customer profile. The predefined keys you can use to search include: _account,
     * _profileId, _fullName, _phone, _email, _ctrContactId, _marketoLeadId, _salesforceAccountId, _salesforceContactId,
     * _zendeskUserId, _zendeskExternalId, _serviceNowSystemId.
     * </p>
     * 
     * @param keyName
     *        A searchable identifier of a customer profile. The predefined keys you can use to search include:
     *        _account, _profileId, _fullName, _phone, _email, _ctrContactId, _marketoLeadId, _salesforceAccountId,
     *        _salesforceContactId, _zendeskUserId, _zendeskExternalId, _serviceNowSystemId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProfilesRequest withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * A list of key values.
     * </p>
     * 
     * @return A list of key values.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * A list of key values.
     * </p>
     * 
     * @param values
     *        A list of key values.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * A list of key values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        A list of key values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProfilesRequest withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key values.
     * </p>
     * 
     * @param values
     *        A list of key values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchProfilesRequest withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchProfilesRequest == false)
            return false;
        SearchProfilesRequest other = (SearchProfilesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public SearchProfilesRequest clone() {
        return (SearchProfilesRequest) super.clone();
    }

}
