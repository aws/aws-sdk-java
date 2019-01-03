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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Automation failure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/FailureDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailureDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The stage of the Automation execution when the failure occurred. The stages include the following:
     * InputValidation, PreVerification, Invocation, PostVerification.
     * </p>
     */
    private String failureStage;
    /**
     * <p>
     * The type of Automation failure. Failure types include the following: Action, Permission, Throttling,
     * Verification, Internal.
     * </p>
     */
    private String failureType;
    /**
     * <p>
     * Detailed information about the Automation step failure.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> details;

    /**
     * <p>
     * The stage of the Automation execution when the failure occurred. The stages include the following:
     * InputValidation, PreVerification, Invocation, PostVerification.
     * </p>
     * 
     * @param failureStage
     *        The stage of the Automation execution when the failure occurred. The stages include the following:
     *        InputValidation, PreVerification, Invocation, PostVerification.
     */

    public void setFailureStage(String failureStage) {
        this.failureStage = failureStage;
    }

    /**
     * <p>
     * The stage of the Automation execution when the failure occurred. The stages include the following:
     * InputValidation, PreVerification, Invocation, PostVerification.
     * </p>
     * 
     * @return The stage of the Automation execution when the failure occurred. The stages include the following:
     *         InputValidation, PreVerification, Invocation, PostVerification.
     */

    public String getFailureStage() {
        return this.failureStage;
    }

    /**
     * <p>
     * The stage of the Automation execution when the failure occurred. The stages include the following:
     * InputValidation, PreVerification, Invocation, PostVerification.
     * </p>
     * 
     * @param failureStage
     *        The stage of the Automation execution when the failure occurred. The stages include the following:
     *        InputValidation, PreVerification, Invocation, PostVerification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureDetails withFailureStage(String failureStage) {
        setFailureStage(failureStage);
        return this;
    }

    /**
     * <p>
     * The type of Automation failure. Failure types include the following: Action, Permission, Throttling,
     * Verification, Internal.
     * </p>
     * 
     * @param failureType
     *        The type of Automation failure. Failure types include the following: Action, Permission, Throttling,
     *        Verification, Internal.
     */

    public void setFailureType(String failureType) {
        this.failureType = failureType;
    }

    /**
     * <p>
     * The type of Automation failure. Failure types include the following: Action, Permission, Throttling,
     * Verification, Internal.
     * </p>
     * 
     * @return The type of Automation failure. Failure types include the following: Action, Permission, Throttling,
     *         Verification, Internal.
     */

    public String getFailureType() {
        return this.failureType;
    }

    /**
     * <p>
     * The type of Automation failure. Failure types include the following: Action, Permission, Throttling,
     * Verification, Internal.
     * </p>
     * 
     * @param failureType
     *        The type of Automation failure. Failure types include the following: Action, Permission, Throttling,
     *        Verification, Internal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureDetails withFailureType(String failureType) {
        setFailureType(failureType);
        return this;
    }

    /**
     * <p>
     * Detailed information about the Automation step failure.
     * </p>
     * 
     * @return Detailed information about the Automation step failure.
     */

    public java.util.Map<String, java.util.List<String>> getDetails() {
        return details;
    }

    /**
     * <p>
     * Detailed information about the Automation step failure.
     * </p>
     * 
     * @param details
     *        Detailed information about the Automation step failure.
     */

    public void setDetails(java.util.Map<String, java.util.List<String>> details) {
        this.details = details;
    }

    /**
     * <p>
     * Detailed information about the Automation step failure.
     * </p>
     * 
     * @param details
     *        Detailed information about the Automation step failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureDetails withDetails(java.util.Map<String, java.util.List<String>> details) {
        setDetails(details);
        return this;
    }

    public FailureDetails addDetailsEntry(String key, java.util.List<String> value) {
        if (null == this.details) {
            this.details = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.details.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.details.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Details.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureDetails clearDetailsEntries() {
        this.details = null;
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
        if (getFailureStage() != null)
            sb.append("FailureStage: ").append(getFailureStage()).append(",");
        if (getFailureType() != null)
            sb.append("FailureType: ").append(getFailureType()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailureDetails == false)
            return false;
        FailureDetails other = (FailureDetails) obj;
        if (other.getFailureStage() == null ^ this.getFailureStage() == null)
            return false;
        if (other.getFailureStage() != null && other.getFailureStage().equals(this.getFailureStage()) == false)
            return false;
        if (other.getFailureType() == null ^ this.getFailureType() == null)
            return false;
        if (other.getFailureType() != null && other.getFailureType().equals(this.getFailureType()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailureStage() == null) ? 0 : getFailureStage().hashCode());
        hashCode = prime * hashCode + ((getFailureType() == null) ? 0 : getFailureType().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public FailureDetails clone() {
        try {
            return (FailureDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.FailureDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
