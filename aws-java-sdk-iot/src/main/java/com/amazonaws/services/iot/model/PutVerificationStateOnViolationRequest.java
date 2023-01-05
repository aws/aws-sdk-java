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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutVerificationStateOnViolationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The violation ID.
     * </p>
     */
    private String violationId;
    /**
     * <p>
     * The verification state of the violation.
     * </p>
     */
    private String verificationState;
    /**
     * <p>
     * The description of the verification state of the violation (detect alarm).
     * </p>
     */
    private String verificationStateDescription;

    /**
     * <p>
     * The violation ID.
     * </p>
     * 
     * @param violationId
     *        The violation ID.
     */

    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }

    /**
     * <p>
     * The violation ID.
     * </p>
     * 
     * @return The violation ID.
     */

    public String getViolationId() {
        return this.violationId;
    }

    /**
     * <p>
     * The violation ID.
     * </p>
     * 
     * @param violationId
     *        The violation ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutVerificationStateOnViolationRequest withViolationId(String violationId) {
        setViolationId(violationId);
        return this;
    }

    /**
     * <p>
     * The verification state of the violation.
     * </p>
     * 
     * @param verificationState
     *        The verification state of the violation.
     * @see VerificationState
     */

    public void setVerificationState(String verificationState) {
        this.verificationState = verificationState;
    }

    /**
     * <p>
     * The verification state of the violation.
     * </p>
     * 
     * @return The verification state of the violation.
     * @see VerificationState
     */

    public String getVerificationState() {
        return this.verificationState;
    }

    /**
     * <p>
     * The verification state of the violation.
     * </p>
     * 
     * @param verificationState
     *        The verification state of the violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerificationState
     */

    public PutVerificationStateOnViolationRequest withVerificationState(String verificationState) {
        setVerificationState(verificationState);
        return this;
    }

    /**
     * <p>
     * The verification state of the violation.
     * </p>
     * 
     * @param verificationState
     *        The verification state of the violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerificationState
     */

    public PutVerificationStateOnViolationRequest withVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
        return this;
    }

    /**
     * <p>
     * The description of the verification state of the violation (detect alarm).
     * </p>
     * 
     * @param verificationStateDescription
     *        The description of the verification state of the violation (detect alarm).
     */

    public void setVerificationStateDescription(String verificationStateDescription) {
        this.verificationStateDescription = verificationStateDescription;
    }

    /**
     * <p>
     * The description of the verification state of the violation (detect alarm).
     * </p>
     * 
     * @return The description of the verification state of the violation (detect alarm).
     */

    public String getVerificationStateDescription() {
        return this.verificationStateDescription;
    }

    /**
     * <p>
     * The description of the verification state of the violation (detect alarm).
     * </p>
     * 
     * @param verificationStateDescription
     *        The description of the verification state of the violation (detect alarm).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutVerificationStateOnViolationRequest withVerificationStateDescription(String verificationStateDescription) {
        setVerificationStateDescription(verificationStateDescription);
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
        if (getViolationId() != null)
            sb.append("ViolationId: ").append(getViolationId()).append(",");
        if (getVerificationState() != null)
            sb.append("VerificationState: ").append(getVerificationState()).append(",");
        if (getVerificationStateDescription() != null)
            sb.append("VerificationStateDescription: ").append(getVerificationStateDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutVerificationStateOnViolationRequest == false)
            return false;
        PutVerificationStateOnViolationRequest other = (PutVerificationStateOnViolationRequest) obj;
        if (other.getViolationId() == null ^ this.getViolationId() == null)
            return false;
        if (other.getViolationId() != null && other.getViolationId().equals(this.getViolationId()) == false)
            return false;
        if (other.getVerificationState() == null ^ this.getVerificationState() == null)
            return false;
        if (other.getVerificationState() != null && other.getVerificationState().equals(this.getVerificationState()) == false)
            return false;
        if (other.getVerificationStateDescription() == null ^ this.getVerificationStateDescription() == null)
            return false;
        if (other.getVerificationStateDescription() != null && other.getVerificationStateDescription().equals(this.getVerificationStateDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViolationId() == null) ? 0 : getViolationId().hashCode());
        hashCode = prime * hashCode + ((getVerificationState() == null) ? 0 : getVerificationState().hashCode());
        hashCode = prime * hashCode + ((getVerificationStateDescription() == null) ? 0 : getVerificationStateDescription().hashCode());
        return hashCode;
    }

    @Override
    public PutVerificationStateOnViolationRequest clone() {
        return (PutVerificationStateOnViolationRequest) super.clone();
    }

}
