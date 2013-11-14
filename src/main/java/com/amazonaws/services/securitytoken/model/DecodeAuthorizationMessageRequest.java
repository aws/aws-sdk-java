/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.securitytoken.AWSSecurityTokenService#decodeAuthorizationMessage(DecodeAuthorizationMessageRequest) DecodeAuthorizationMessage operation}.
 * <p>
 * Decodes additional information about the authorization status of a request from an encoded message returned in response to an AWS request.
 * </p>
 * <p>
 * For example, if a user is not authorized to perform an action that he or she has requested, the request returns a
 * <code>Client.UnauthorizedOperation</code> response (an HTTP 403 response). Some AWS actions additionally return an encoded message that can provide
 * details about this authorization failure.
 * </p>
 * <p>
 * <b>NOTE:</b> Only certain AWS actions return an encoded authorization message. The documentation for an individual action indicates whether that
 * action returns an encoded message in addition to returning an HTTP code.
 * </p>
 * <p>
 * The message is encoded because the details of the authorization status can constitute privileged information that the user who requested the action
 * should not see. To decode an authorization status message, a user must be granted permissions via an AWS IAM policy to request the
 * <code>DecodeAuthorizationMessage</code> (
 * <code>sts:DecodeAuthorizationMessage</code> ) action.
 * </p>
 * <p>
 * The decoded message includes the following type of information:
 * </p>
 * 
 * <ul>
 * <li>Whether the request was denied due to an explicit deny or due to the absence of an explicit allow. For more information, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/AccessPolicyLanguage_EvaluationLogic.html#policy-eval-denyallow"> Determining Whether a Request
 * is Allowed or Denied </a> in <i>Using AWS IAM</i> . </li>
 * <li>The principal who made the request.</li>
 * <li>The requested action.</li>
 * <li>The requested resource.</li>
 * <li>The values of condition keys in the context of the user's request.</li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.securitytoken.AWSSecurityTokenService#decodeAuthorizationMessage(DecodeAuthorizationMessageRequest)
 */
public class DecodeAuthorizationMessageRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The encoded message that was returned with the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     */
    private String encodedMessage;

    /**
     * The encoded message that was returned with the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     *
     * @return The encoded message that was returned with the response.
     */
    public String getEncodedMessage() {
        return encodedMessage;
    }
    
    /**
     * The encoded message that was returned with the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     *
     * @param encodedMessage The encoded message that was returned with the response.
     */
    public void setEncodedMessage(String encodedMessage) {
        this.encodedMessage = encodedMessage;
    }
    
    /**
     * The encoded message that was returned with the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     *
     * @param encodedMessage The encoded message that was returned with the response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DecodeAuthorizationMessageRequest withEncodedMessage(String encodedMessage) {
        this.encodedMessage = encodedMessage;
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
        if (getEncodedMessage() != null) sb.append("EncodedMessage: " + getEncodedMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEncodedMessage() == null) ? 0 : getEncodedMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DecodeAuthorizationMessageRequest == false) return false;
        DecodeAuthorizationMessageRequest other = (DecodeAuthorizationMessageRequest)obj;
        
        if (other.getEncodedMessage() == null ^ this.getEncodedMessage() == null) return false;
        if (other.getEncodedMessage() != null && other.getEncodedMessage().equals(this.getEncodedMessage()) == false) return false; 
        return true;
    }
    
}
    