/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#lookupDeveloperIdentity(LookupDeveloperIdentityRequest) LookupDeveloperIdentity operation}.
 * <p>
 * Retrieves the <code>IdentityID</code> associated with a
 * <code>DeveloperUserIdentifier</code> or the list of
 * <code>DeveloperUserIdentifier</code> s associated with an
 * <code>IdentityId</code> for an existing identity. Either
 * <code>IdentityID</code> or <code>DeveloperUserIdentifier</code> must
 * not be null. If you supply only one of these values, the other value
 * will be searched in the database and returned as a part of the
 * response. If you supply both, <code>DeveloperUserIdentifier</code>
 * will be matched against <code>IdentityID</code> . If the values are
 * verified against the database, the response returns both values and is
 * the same as the request. Otherwise a
 * <code>ResourceConflictException</code> is thrown.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#lookupDeveloperIdentity(LookupDeveloperIdentityRequest)
 */
public class LookupDeveloperIdentityRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityId;

    /**
     * A unique ID used by your backend authentication process to identify a
     * user. Typically, a developer identity provider would issue many
     * developer user identifiers, in keeping with the number of users.
     */
    private String developerUserIdentifier;

    /**
     * The maximum number of identities to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     */
    private Integer maxResults;

    /**
     * A pagination token. The first call you make will have
     * <code>NextToken</code> set to null. After that the service will return
     * <code>NextToken</code> values as needed. For example, let's say you
     * make a request with <code>MaxResults</code> set to 10, and there are
     * 20 matches in the database. The service will return a pagination token
     * as a part of the response. This token can be used to call the API
     * again and get results starting from the 11th match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String nextToken;

    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return An identity pool ID in the format REGION:GUID.
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }
    
    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId An identity pool ID in the format REGION:GUID.
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }
    
    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId An identity pool ID in the format REGION:GUID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupDeveloperIdentityRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A unique identifier in the format REGION:GUID.
     */
    public String getIdentityId() {
        return identityId;
    }
    
    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A unique identifier in the format REGION:GUID.
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }
    
    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A unique identifier in the format REGION:GUID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupDeveloperIdentityRequest withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * A unique ID used by your backend authentication process to identify a
     * user. Typically, a developer identity provider would issue many
     * developer user identifiers, in keeping with the number of users.
     *
     * @return A unique ID used by your backend authentication process to identify a
     *         user. Typically, a developer identity provider would issue many
     *         developer user identifiers, in keeping with the number of users.
     */
    public String getDeveloperUserIdentifier() {
        return developerUserIdentifier;
    }
    
    /**
     * A unique ID used by your backend authentication process to identify a
     * user. Typically, a developer identity provider would issue many
     * developer user identifiers, in keeping with the number of users.
     *
     * @param developerUserIdentifier A unique ID used by your backend authentication process to identify a
     *         user. Typically, a developer identity provider would issue many
     *         developer user identifiers, in keeping with the number of users.
     */
    public void setDeveloperUserIdentifier(String developerUserIdentifier) {
        this.developerUserIdentifier = developerUserIdentifier;
    }
    
    /**
     * A unique ID used by your backend authentication process to identify a
     * user. Typically, a developer identity provider would issue many
     * developer user identifiers, in keeping with the number of users.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param developerUserIdentifier A unique ID used by your backend authentication process to identify a
     *         user. Typically, a developer identity provider would issue many
     *         developer user identifiers, in keeping with the number of users.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupDeveloperIdentityRequest withDeveloperUserIdentifier(String developerUserIdentifier) {
        this.developerUserIdentifier = developerUserIdentifier;
        return this;
    }

    /**
     * The maximum number of identities to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     *
     * @return The maximum number of identities to return.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of identities to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     *
     * @param maxResults The maximum number of identities to return.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of identities to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 60<br/>
     *
     * @param maxResults The maximum number of identities to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupDeveloperIdentityRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * A pagination token. The first call you make will have
     * <code>NextToken</code> set to null. After that the service will return
     * <code>NextToken</code> values as needed. For example, let's say you
     * make a request with <code>MaxResults</code> set to 10, and there are
     * 20 matches in the database. The service will return a pagination token
     * as a part of the response. This token can be used to call the API
     * again and get results starting from the 11th match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return A pagination token. The first call you make will have
     *         <code>NextToken</code> set to null. After that the service will return
     *         <code>NextToken</code> values as needed. For example, let's say you
     *         make a request with <code>MaxResults</code> set to 10, and there are
     *         20 matches in the database. The service will return a pagination token
     *         as a part of the response. This token can be used to call the API
     *         again and get results starting from the 11th match.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A pagination token. The first call you make will have
     * <code>NextToken</code> set to null. After that the service will return
     * <code>NextToken</code> values as needed. For example, let's say you
     * make a request with <code>MaxResults</code> set to 10, and there are
     * 20 matches in the database. The service will return a pagination token
     * as a part of the response. This token can be used to call the API
     * again and get results starting from the 11th match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken A pagination token. The first call you make will have
     *         <code>NextToken</code> set to null. After that the service will return
     *         <code>NextToken</code> values as needed. For example, let's say you
     *         make a request with <code>MaxResults</code> set to 10, and there are
     *         20 matches in the database. The service will return a pagination token
     *         as a part of the response. This token can be used to call the API
     *         again and get results starting from the 11th match.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A pagination token. The first call you make will have
     * <code>NextToken</code> set to null. After that the service will return
     * <code>NextToken</code> values as needed. For example, let's say you
     * make a request with <code>MaxResults</code> set to 10, and there are
     * 20 matches in the database. The service will return a pagination token
     * as a part of the response. This token can be used to call the API
     * again and get results starting from the 11th match.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken A pagination token. The first call you make will have
     *         <code>NextToken</code> set to null. After that the service will return
     *         <code>NextToken</code> values as needed. For example, let's say you
     *         make a request with <code>MaxResults</code> set to 10, and there are
     *         20 matches in the database. The service will return a pagination token
     *         as a part of the response. This token can be used to call the API
     *         again and get results starting from the 11th match.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LookupDeveloperIdentityRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getIdentityId() != null) sb.append("IdentityId: " + getIdentityId() + ",");
        if (getDeveloperUserIdentifier() != null) sb.append("DeveloperUserIdentifier: " + getDeveloperUserIdentifier() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LookupDeveloperIdentityRequest == false) return false;
        LookupDeveloperIdentityRequest other = (LookupDeveloperIdentityRequest)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getDeveloperUserIdentifier() == null ^ this.getDeveloperUserIdentifier() == null) return false;
        if (other.getDeveloperUserIdentifier() != null && other.getDeveloperUserIdentifier().equals(this.getDeveloperUserIdentifier()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    