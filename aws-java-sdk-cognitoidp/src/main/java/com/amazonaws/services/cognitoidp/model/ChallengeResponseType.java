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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The challenge response type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ChallengeResponseType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChallengeResponseType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The challenge name
     * </p>
     */
    private String challengeName;
    /**
     * <p>
     * The challenge response.
     * </p>
     */
    private String challengeResponse;

    /**
     * <p>
     * The challenge name
     * </p>
     * 
     * @param challengeName
     *        The challenge name
     * @see ChallengeName
     */

    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    /**
     * <p>
     * The challenge name
     * </p>
     * 
     * @return The challenge name
     * @see ChallengeName
     */

    public String getChallengeName() {
        return this.challengeName;
    }

    /**
     * <p>
     * The challenge name
     * </p>
     * 
     * @param challengeName
     *        The challenge name
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeName
     */

    public ChallengeResponseType withChallengeName(String challengeName) {
        setChallengeName(challengeName);
        return this;
    }

    /**
     * <p>
     * The challenge name
     * </p>
     * 
     * @param challengeName
     *        The challenge name
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeName
     */

    public ChallengeResponseType withChallengeName(ChallengeName challengeName) {
        this.challengeName = challengeName.toString();
        return this;
    }

    /**
     * <p>
     * The challenge response.
     * </p>
     * 
     * @param challengeResponse
     *        The challenge response.
     * @see ChallengeResponse
     */

    public void setChallengeResponse(String challengeResponse) {
        this.challengeResponse = challengeResponse;
    }

    /**
     * <p>
     * The challenge response.
     * </p>
     * 
     * @return The challenge response.
     * @see ChallengeResponse
     */

    public String getChallengeResponse() {
        return this.challengeResponse;
    }

    /**
     * <p>
     * The challenge response.
     * </p>
     * 
     * @param challengeResponse
     *        The challenge response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeResponse
     */

    public ChallengeResponseType withChallengeResponse(String challengeResponse) {
        setChallengeResponse(challengeResponse);
        return this;
    }

    /**
     * <p>
     * The challenge response.
     * </p>
     * 
     * @param challengeResponse
     *        The challenge response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChallengeResponse
     */

    public ChallengeResponseType withChallengeResponse(ChallengeResponse challengeResponse) {
        this.challengeResponse = challengeResponse.toString();
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
        if (getChallengeName() != null)
            sb.append("ChallengeName: ").append(getChallengeName()).append(",");
        if (getChallengeResponse() != null)
            sb.append("ChallengeResponse: ").append(getChallengeResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChallengeResponseType == false)
            return false;
        ChallengeResponseType other = (ChallengeResponseType) obj;
        if (other.getChallengeName() == null ^ this.getChallengeName() == null)
            return false;
        if (other.getChallengeName() != null && other.getChallengeName().equals(this.getChallengeName()) == false)
            return false;
        if (other.getChallengeResponse() == null ^ this.getChallengeResponse() == null)
            return false;
        if (other.getChallengeResponse() != null && other.getChallengeResponse().equals(this.getChallengeResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChallengeName() == null) ? 0 : getChallengeName().hashCode());
        hashCode = prime * hashCode + ((getChallengeResponse() == null) ? 0 : getChallengeResponse().hashCode());
        return hashCode;
    }

    @Override
    public ChallengeResponseType clone() {
        try {
            return (ChallengeResponseType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.ChallengeResponseTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
