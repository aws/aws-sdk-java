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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to the <code>LookupDeveloperIdentityInput</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/LookupDeveloperIdentity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LookupDeveloperIdentityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     */
    private String identityId;
    /**
     * <p>
     * A unique ID used by your backend authentication process to identify a user. Typically, a developer identity
     * provider would issue many developer user identifiers, in keeping with the number of users.
     * </p>
     */
    private String developerUserIdentifier;
    /**
     * <p>
     * The maximum number of identities to return.
     * </p>
     */
    private Integer maxResults;
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
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @return An identity pool ID in the format REGION:GUID.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * 
     * @param identityPoolId
     *        An identity pool ID in the format REGION:GUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupDeveloperIdentityRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

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

    public LookupDeveloperIdentityRequest withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * <p>
     * A unique ID used by your backend authentication process to identify a user. Typically, a developer identity
     * provider would issue many developer user identifiers, in keeping with the number of users.
     * </p>
     * 
     * @param developerUserIdentifier
     *        A unique ID used by your backend authentication process to identify a user. Typically, a developer
     *        identity provider would issue many developer user identifiers, in keeping with the number of users.
     */

    public void setDeveloperUserIdentifier(String developerUserIdentifier) {
        this.developerUserIdentifier = developerUserIdentifier;
    }

    /**
     * <p>
     * A unique ID used by your backend authentication process to identify a user. Typically, a developer identity
     * provider would issue many developer user identifiers, in keeping with the number of users.
     * </p>
     * 
     * @return A unique ID used by your backend authentication process to identify a user. Typically, a developer
     *         identity provider would issue many developer user identifiers, in keeping with the number of users.
     */

    public String getDeveloperUserIdentifier() {
        return this.developerUserIdentifier;
    }

    /**
     * <p>
     * A unique ID used by your backend authentication process to identify a user. Typically, a developer identity
     * provider would issue many developer user identifiers, in keeping with the number of users.
     * </p>
     * 
     * @param developerUserIdentifier
     *        A unique ID used by your backend authentication process to identify a user. Typically, a developer
     *        identity provider would issue many developer user identifiers, in keeping with the number of users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupDeveloperIdentityRequest withDeveloperUserIdentifier(String developerUserIdentifier) {
        setDeveloperUserIdentifier(developerUserIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of identities to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of identities to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of identities to return.
     * </p>
     * 
     * @return The maximum number of identities to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of identities to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of identities to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupDeveloperIdentityRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public LookupDeveloperIdentityRequest withNextToken(String nextToken) {
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getIdentityId() != null)
            sb.append("IdentityId: ").append(getIdentityId()).append(",");
        if (getDeveloperUserIdentifier() != null)
            sb.append("DeveloperUserIdentifier: ").append(getDeveloperUserIdentifier()).append(",");
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

        if (obj instanceof LookupDeveloperIdentityRequest == false)
            return false;
        LookupDeveloperIdentityRequest other = (LookupDeveloperIdentityRequest) obj;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getDeveloperUserIdentifier() == null ^ this.getDeveloperUserIdentifier() == null)
            return false;
        if (other.getDeveloperUserIdentifier() != null && other.getDeveloperUserIdentifier().equals(this.getDeveloperUserIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getDeveloperUserIdentifier() == null) ? 0 : getDeveloperUserIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public LookupDeveloperIdentityRequest clone() {
        return (LookupDeveloperIdentityRequest) super.clone();
    }

}
