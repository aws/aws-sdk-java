/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitytoken.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.securitytoken.AWSSecurityTokenService#getSessionToken(GetSessionTokenRequest) GetSessionToken operation}.
 * <p>
 * The GetSessionToken action returns a set of temporary credentials for an AWS account or IAM user. The credentials consist of an Access Key ID, a
 * Secret Access Key, and a security token. These credentials are valid for the specified duration only. The session duration for IAM users can be
 * between one and 36 hours, with a default of 12 hours. The session duration for AWS account owners is restricted to one hour.
 * </p>
 * <p>
 * For more information about using GetSessionToken to create temporary credentials, go to <a
 * href="http://docs.amazonwebservices.com/IAM/latest/UserGuide/CreatingSessionTokens.html"> Creating Temporary Credentials to Enable Access for IAM
 * Users </a> in <i>Using IAM</i> .
 * </p>
 *
 * @see com.amazonaws.services.securitytoken.AWSSecurityTokenService#getSessionToken(GetSessionTokenRequest)
 */
public class GetSessionTokenRequest extends AmazonWebServiceRequest {

    /**
     * The duration, in seconds, that the credentials should remain valid.
     * Acceptable durations for IAM user sessions range from 3600s (one hour)
     * to 129600s (36 hours), with 43200s (12 hours) as the default. Sessions
     * for AWS account owners are restricted to a maximum of 3600s (one
     * hour).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 129600<br/>
     */
    private Integer durationSeconds;

    /**
     * Default constructor for a new GetSessionTokenRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetSessionTokenRequest() {}
    
    /**
     * The duration, in seconds, that the credentials should remain valid.
     * Acceptable durations for IAM user sessions range from 3600s (one hour)
     * to 129600s (36 hours), with 43200s (12 hours) as the default. Sessions
     * for AWS account owners are restricted to a maximum of 3600s (one
     * hour).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 129600<br/>
     *
     * @return The duration, in seconds, that the credentials should remain valid.
     *         Acceptable durations for IAM user sessions range from 3600s (one hour)
     *         to 129600s (36 hours), with 43200s (12 hours) as the default. Sessions
     *         for AWS account owners are restricted to a maximum of 3600s (one
     *         hour).
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }
    
    /**
     * The duration, in seconds, that the credentials should remain valid.
     * Acceptable durations for IAM user sessions range from 3600s (one hour)
     * to 129600s (36 hours), with 43200s (12 hours) as the default. Sessions
     * for AWS account owners are restricted to a maximum of 3600s (one
     * hour).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 129600<br/>
     *
     * @param durationSeconds The duration, in seconds, that the credentials should remain valid.
     *         Acceptable durations for IAM user sessions range from 3600s (one hour)
     *         to 129600s (36 hours), with 43200s (12 hours) as the default. Sessions
     *         for AWS account owners are restricted to a maximum of 3600s (one
     *         hour).
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }
    
    /**
     * The duration, in seconds, that the credentials should remain valid.
     * Acceptable durations for IAM user sessions range from 3600s (one hour)
     * to 129600s (36 hours), with 43200s (12 hours) as the default. Sessions
     * for AWS account owners are restricted to a maximum of 3600s (one
     * hour).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3600 - 129600<br/>
     *
     * @param durationSeconds The duration, in seconds, that the credentials should remain valid.
     *         Acceptable durations for IAM user sessions range from 3600s (one hour)
     *         to 129600s (36 hours), with 43200s (12 hours) as the default. Sessions
     *         for AWS account owners are restricted to a maximum of 3600s (one
     *         hour).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetSessionTokenRequest withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
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
        if (durationSeconds != null) sb.append("DurationSeconds: " + durationSeconds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof GetSessionTokenRequest == false) return false;
        GetSessionTokenRequest other = (GetSessionTokenRequest)obj;
        
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null) return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false) return false; 
        return true;
    }
    
}
    