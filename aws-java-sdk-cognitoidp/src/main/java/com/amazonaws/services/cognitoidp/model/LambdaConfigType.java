/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Specifies the type of configuration for AWS Lambda triggers.
 * </p>
 */
public class LambdaConfigType implements Serializable, Cloneable {

    /**
     * <p>
     * A pre-registration AWS Lambda trigger.
     * </p>
     */
    private String preSignUp;
    /**
     * <p>
     * A custom Message AWS Lambda trigger.
     * </p>
     */
    private String customMessage;
    /**
     * <p>
     * A post-confirmation AWS Lambda trigger.
     * </p>
     */
    private String postConfirmation;
    /**
     * <p>
     * A pre-authentication AWS Lambda trigger.
     * </p>
     */
    private String preAuthentication;
    /**
     * <p>
     * A post-authentication AWS Lambda trigger.
     * </p>
     */
    private String postAuthentication;
    /**
     * <p>
     * Defines the authentication challenge.
     * </p>
     */
    private String defineAuthChallenge;
    /**
     * <p>
     * Creates an authentication challenge.
     * </p>
     */
    private String createAuthChallenge;
    /**
     * <p>
     * Verifies the authentication challenge response.
     * </p>
     */
    private String verifyAuthChallengeResponse;

    /**
     * <p>
     * A pre-registration AWS Lambda trigger.
     * </p>
     * 
     * @param preSignUp
     *        A pre-registration AWS Lambda trigger.
     */

    public void setPreSignUp(String preSignUp) {
        this.preSignUp = preSignUp;
    }

    /**
     * <p>
     * A pre-registration AWS Lambda trigger.
     * </p>
     * 
     * @return A pre-registration AWS Lambda trigger.
     */

    public String getPreSignUp() {
        return this.preSignUp;
    }

    /**
     * <p>
     * A pre-registration AWS Lambda trigger.
     * </p>
     * 
     * @param preSignUp
     *        A pre-registration AWS Lambda trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaConfigType withPreSignUp(String preSignUp) {
        setPreSignUp(preSignUp);
        return this;
    }

    /**
     * <p>
     * A custom Message AWS Lambda trigger.
     * </p>
     * 
     * @param customMessage
     *        A custom Message AWS Lambda trigger.
     */

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }

    /**
     * <p>
     * A custom Message AWS Lambda trigger.
     * </p>
     * 
     * @return A custom Message AWS Lambda trigger.
     */

    public String getCustomMessage() {
        return this.customMessage;
    }

    /**
     * <p>
     * A custom Message AWS Lambda trigger.
     * </p>
     * 
     * @param customMessage
     *        A custom Message AWS Lambda trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaConfigType withCustomMessage(String customMessage) {
        setCustomMessage(customMessage);
        return this;
    }

    /**
     * <p>
     * A post-confirmation AWS Lambda trigger.
     * </p>
     * 
     * @param postConfirmation
     *        A post-confirmation AWS Lambda trigger.
     */

    public void setPostConfirmation(String postConfirmation) {
        this.postConfirmation = postConfirmation;
    }

    /**
     * <p>
     * A post-confirmation AWS Lambda trigger.
     * </p>
     * 
     * @return A post-confirmation AWS Lambda trigger.
     */

    public String getPostConfirmation() {
        return this.postConfirmation;
    }

    /**
     * <p>
     * A post-confirmation AWS Lambda trigger.
     * </p>
     * 
     * @param postConfirmation
     *        A post-confirmation AWS Lambda trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaConfigType withPostConfirmation(String postConfirmation) {
        setPostConfirmation(postConfirmation);
        return this;
    }

    /**
     * <p>
     * A pre-authentication AWS Lambda trigger.
     * </p>
     * 
     * @param preAuthentication
     *        A pre-authentication AWS Lambda trigger.
     */

    public void setPreAuthentication(String preAuthentication) {
        this.preAuthentication = preAuthentication;
    }

    /**
     * <p>
     * A pre-authentication AWS Lambda trigger.
     * </p>
     * 
     * @return A pre-authentication AWS Lambda trigger.
     */

    public String getPreAuthentication() {
        return this.preAuthentication;
    }

    /**
     * <p>
     * A pre-authentication AWS Lambda trigger.
     * </p>
     * 
     * @param preAuthentication
     *        A pre-authentication AWS Lambda trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaConfigType withPreAuthentication(String preAuthentication) {
        setPreAuthentication(preAuthentication);
        return this;
    }

    /**
     * <p>
     * A post-authentication AWS Lambda trigger.
     * </p>
     * 
     * @param postAuthentication
     *        A post-authentication AWS Lambda trigger.
     */

    public void setPostAuthentication(String postAuthentication) {
        this.postAuthentication = postAuthentication;
    }

    /**
     * <p>
     * A post-authentication AWS Lambda trigger.
     * </p>
     * 
     * @return A post-authentication AWS Lambda trigger.
     */

    public String getPostAuthentication() {
        return this.postAuthentication;
    }

    /**
     * <p>
     * A post-authentication AWS Lambda trigger.
     * </p>
     * 
     * @param postAuthentication
     *        A post-authentication AWS Lambda trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaConfigType withPostAuthentication(String postAuthentication) {
        setPostAuthentication(postAuthentication);
        return this;
    }

    /**
     * <p>
     * Defines the authentication challenge.
     * </p>
     * 
     * @param defineAuthChallenge
     *        Defines the authentication challenge.
     */

    public void setDefineAuthChallenge(String defineAuthChallenge) {
        this.defineAuthChallenge = defineAuthChallenge;
    }

    /**
     * <p>
     * Defines the authentication challenge.
     * </p>
     * 
     * @return Defines the authentication challenge.
     */

    public String getDefineAuthChallenge() {
        return this.defineAuthChallenge;
    }

    /**
     * <p>
     * Defines the authentication challenge.
     * </p>
     * 
     * @param defineAuthChallenge
     *        Defines the authentication challenge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaConfigType withDefineAuthChallenge(String defineAuthChallenge) {
        setDefineAuthChallenge(defineAuthChallenge);
        return this;
    }

    /**
     * <p>
     * Creates an authentication challenge.
     * </p>
     * 
     * @param createAuthChallenge
     *        Creates an authentication challenge.
     */

    public void setCreateAuthChallenge(String createAuthChallenge) {
        this.createAuthChallenge = createAuthChallenge;
    }

    /**
     * <p>
     * Creates an authentication challenge.
     * </p>
     * 
     * @return Creates an authentication challenge.
     */

    public String getCreateAuthChallenge() {
        return this.createAuthChallenge;
    }

    /**
     * <p>
     * Creates an authentication challenge.
     * </p>
     * 
     * @param createAuthChallenge
     *        Creates an authentication challenge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaConfigType withCreateAuthChallenge(String createAuthChallenge) {
        setCreateAuthChallenge(createAuthChallenge);
        return this;
    }

    /**
     * <p>
     * Verifies the authentication challenge response.
     * </p>
     * 
     * @param verifyAuthChallengeResponse
     *        Verifies the authentication challenge response.
     */

    public void setVerifyAuthChallengeResponse(String verifyAuthChallengeResponse) {
        this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
    }

    /**
     * <p>
     * Verifies the authentication challenge response.
     * </p>
     * 
     * @return Verifies the authentication challenge response.
     */

    public String getVerifyAuthChallengeResponse() {
        return this.verifyAuthChallengeResponse;
    }

    /**
     * <p>
     * Verifies the authentication challenge response.
     * </p>
     * 
     * @param verifyAuthChallengeResponse
     *        Verifies the authentication challenge response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaConfigType withVerifyAuthChallengeResponse(String verifyAuthChallengeResponse) {
        setVerifyAuthChallengeResponse(verifyAuthChallengeResponse);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPreSignUp() != null)
            sb.append("PreSignUp: " + getPreSignUp() + ",");
        if (getCustomMessage() != null)
            sb.append("CustomMessage: " + getCustomMessage() + ",");
        if (getPostConfirmation() != null)
            sb.append("PostConfirmation: " + getPostConfirmation() + ",");
        if (getPreAuthentication() != null)
            sb.append("PreAuthentication: " + getPreAuthentication() + ",");
        if (getPostAuthentication() != null)
            sb.append("PostAuthentication: " + getPostAuthentication() + ",");
        if (getDefineAuthChallenge() != null)
            sb.append("DefineAuthChallenge: " + getDefineAuthChallenge() + ",");
        if (getCreateAuthChallenge() != null)
            sb.append("CreateAuthChallenge: " + getCreateAuthChallenge() + ",");
        if (getVerifyAuthChallengeResponse() != null)
            sb.append("VerifyAuthChallengeResponse: " + getVerifyAuthChallengeResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaConfigType == false)
            return false;
        LambdaConfigType other = (LambdaConfigType) obj;
        if (other.getPreSignUp() == null ^ this.getPreSignUp() == null)
            return false;
        if (other.getPreSignUp() != null && other.getPreSignUp().equals(this.getPreSignUp()) == false)
            return false;
        if (other.getCustomMessage() == null ^ this.getCustomMessage() == null)
            return false;
        if (other.getCustomMessage() != null && other.getCustomMessage().equals(this.getCustomMessage()) == false)
            return false;
        if (other.getPostConfirmation() == null ^ this.getPostConfirmation() == null)
            return false;
        if (other.getPostConfirmation() != null && other.getPostConfirmation().equals(this.getPostConfirmation()) == false)
            return false;
        if (other.getPreAuthentication() == null ^ this.getPreAuthentication() == null)
            return false;
        if (other.getPreAuthentication() != null && other.getPreAuthentication().equals(this.getPreAuthentication()) == false)
            return false;
        if (other.getPostAuthentication() == null ^ this.getPostAuthentication() == null)
            return false;
        if (other.getPostAuthentication() != null && other.getPostAuthentication().equals(this.getPostAuthentication()) == false)
            return false;
        if (other.getDefineAuthChallenge() == null ^ this.getDefineAuthChallenge() == null)
            return false;
        if (other.getDefineAuthChallenge() != null && other.getDefineAuthChallenge().equals(this.getDefineAuthChallenge()) == false)
            return false;
        if (other.getCreateAuthChallenge() == null ^ this.getCreateAuthChallenge() == null)
            return false;
        if (other.getCreateAuthChallenge() != null && other.getCreateAuthChallenge().equals(this.getCreateAuthChallenge()) == false)
            return false;
        if (other.getVerifyAuthChallengeResponse() == null ^ this.getVerifyAuthChallengeResponse() == null)
            return false;
        if (other.getVerifyAuthChallengeResponse() != null && other.getVerifyAuthChallengeResponse().equals(this.getVerifyAuthChallengeResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreSignUp() == null) ? 0 : getPreSignUp().hashCode());
        hashCode = prime * hashCode + ((getCustomMessage() == null) ? 0 : getCustomMessage().hashCode());
        hashCode = prime * hashCode + ((getPostConfirmation() == null) ? 0 : getPostConfirmation().hashCode());
        hashCode = prime * hashCode + ((getPreAuthentication() == null) ? 0 : getPreAuthentication().hashCode());
        hashCode = prime * hashCode + ((getPostAuthentication() == null) ? 0 : getPostAuthentication().hashCode());
        hashCode = prime * hashCode + ((getDefineAuthChallenge() == null) ? 0 : getDefineAuthChallenge().hashCode());
        hashCode = prime * hashCode + ((getCreateAuthChallenge() == null) ? 0 : getCreateAuthChallenge().hashCode());
        hashCode = prime * hashCode + ((getVerifyAuthChallengeResponse() == null) ? 0 : getVerifyAuthChallengeResponse().hashCode());
        return hashCode;
    }

    @Override
    public LambdaConfigType clone() {
        try {
            return (LambdaConfigType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
