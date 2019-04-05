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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Returned in response to a successful <code>LookupDeveloperIdentity</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/LookupDeveloperIdentity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LookupDeveloperIdentityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     */
    private String identityId;
    /**
     * <p>
     * This is the list of developer user identifiers associated with an identity ID. Cognito supports the association
     * of multiple developer user identifiers with an identity ID.
     * </p>
     */
    private java.util.List<String> developerUserIdentifierList;
    /**
     * <p>
     * A pagination token. The first call you make will have <code>NextToken</code> set to null. After that the service
     * will return <code>NextToken</code> values as needed. For example, let's say you make a request with
     * <code>MaxResults</code> set to 10, and there are 20 matches in the database. The service will return a pagination
     * token as a part of the response. This token can be used to call the API again and get results starting from the
     * 11th match.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @return A unique identifier in the format REGION:GUID.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupDeveloperIdentityResult withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * <p>
     * This is the list of developer user identifiers associated with an identity ID. Cognito supports the association
     * of multiple developer user identifiers with an identity ID.
     * </p>
     * 
     * @return This is the list of developer user identifiers associated with an identity ID. Cognito supports the
     *         association of multiple developer user identifiers with an identity ID.
     */

    public java.util.List<String> getDeveloperUserIdentifierList() {
        return developerUserIdentifierList;
    }

    /**
     * <p>
     * This is the list of developer user identifiers associated with an identity ID. Cognito supports the association
     * of multiple developer user identifiers with an identity ID.
     * </p>
     * 
     * @param developerUserIdentifierList
     *        This is the list of developer user identifiers associated with an identity ID. Cognito supports the
     *        association of multiple developer user identifiers with an identity ID.
     */

    public void setDeveloperUserIdentifierList(java.util.Collection<String> developerUserIdentifierList) {
        if (developerUserIdentifierList == null) {
            this.developerUserIdentifierList = null;
            return;
        }

        this.developerUserIdentifierList = new java.util.ArrayList<String>(developerUserIdentifierList);
    }

    /**
     * <p>
     * This is the list of developer user identifiers associated with an identity ID. Cognito supports the association
     * of multiple developer user identifiers with an identity ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeveloperUserIdentifierList(java.util.Collection)} or
     * {@link #withDeveloperUserIdentifierList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param developerUserIdentifierList
     *        This is the list of developer user identifiers associated with an identity ID. Cognito supports the
     *        association of multiple developer user identifiers with an identity ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupDeveloperIdentityResult withDeveloperUserIdentifierList(String... developerUserIdentifierList) {
        if (this.developerUserIdentifierList == null) {
            setDeveloperUserIdentifierList(new java.util.ArrayList<String>(developerUserIdentifierList.length));
        }
        for (String ele : developerUserIdentifierList) {
            this.developerUserIdentifierList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This is the list of developer user identifiers associated with an identity ID. Cognito supports the association
     * of multiple developer user identifiers with an identity ID.
     * </p>
     * 
     * @param developerUserIdentifierList
     *        This is the list of developer user identifiers associated with an identity ID. Cognito supports the
     *        association of multiple developer user identifiers with an identity ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupDeveloperIdentityResult withDeveloperUserIdentifierList(java.util.Collection<String> developerUserIdentifierList) {
        setDeveloperUserIdentifierList(developerUserIdentifierList);
        return this;
    }

    /**
     * <p>
     * A pagination token. The first call you make will have <code>NextToken</code> set to null. After that the service
     * will return <code>NextToken</code> values as needed. For example, let's say you make a request with
     * <code>MaxResults</code> set to 10, and there are 20 matches in the database. The service will return a pagination
     * token as a part of the response. This token can be used to call the API again and get results starting from the
     * 11th match.
     * </p>
     * 
     * @param nextToken
     *        A pagination token. The first call you make will have <code>NextToken</code> set to null. After that the
     *        service will return <code>NextToken</code> values as needed. For example, let's say you make a request
     *        with <code>MaxResults</code> set to 10, and there are 20 matches in the database. The service will return
     *        a pagination token as a part of the response. This token can be used to call the API again and get results
     *        starting from the 11th match.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token. The first call you make will have <code>NextToken</code> set to null. After that the service
     * will return <code>NextToken</code> values as needed. For example, let's say you make a request with
     * <code>MaxResults</code> set to 10, and there are 20 matches in the database. The service will return a pagination
     * token as a part of the response. This token can be used to call the API again and get results starting from the
     * 11th match.
     * </p>
     * 
     * @return A pagination token. The first call you make will have <code>NextToken</code> set to null. After that the
     *         service will return <code>NextToken</code> values as needed. For example, let's say you make a request
     *         with <code>MaxResults</code> set to 10, and there are 20 matches in the database. The service will return
     *         a pagination token as a part of the response. This token can be used to call the API again and get
     *         results starting from the 11th match.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token. The first call you make will have <code>NextToken</code> set to null. After that the service
     * will return <code>NextToken</code> values as needed. For example, let's say you make a request with
     * <code>MaxResults</code> set to 10, and there are 20 matches in the database. The service will return a pagination
     * token as a part of the response. This token can be used to call the API again and get results starting from the
     * 11th match.
     * </p>
     * 
     * @param nextToken
     *        A pagination token. The first call you make will have <code>NextToken</code> set to null. After that the
     *        service will return <code>NextToken</code> values as needed. For example, let's say you make a request
     *        with <code>MaxResults</code> set to 10, and there are 20 matches in the database. The service will return
     *        a pagination token as a part of the response. This token can be used to call the API again and get results
     *        starting from the 11th match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupDeveloperIdentityResult withNextToken(String nextToken) {
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
        if (getIdentityId() != null)
            sb.append("IdentityId: ").append(getIdentityId()).append(",");
        if (getDeveloperUserIdentifierList() != null)
            sb.append("DeveloperUserIdentifierList: ").append(getDeveloperUserIdentifierList()).append(",");
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

        if (obj instanceof LookupDeveloperIdentityResult == false)
            return false;
        LookupDeveloperIdentityResult other = (LookupDeveloperIdentityResult) obj;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getDeveloperUserIdentifierList() == null ^ this.getDeveloperUserIdentifierList() == null)
            return false;
        if (other.getDeveloperUserIdentifierList() != null && other.getDeveloperUserIdentifierList().equals(this.getDeveloperUserIdentifierList()) == false)
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

        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getDeveloperUserIdentifierList() == null) ? 0 : getDeveloperUserIdentifierList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public LookupDeveloperIdentityResult clone() {
        try {
            return (LookupDeveloperIdentityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
