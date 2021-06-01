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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/GetSMSSandboxAccountStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSMSSandboxAccountStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the calling account is in the SMS sandbox.
     * </p>
     */
    private Boolean isInSandbox;

    /**
     * <p>
     * Indicates whether the calling account is in the SMS sandbox.
     * </p>
     * 
     * @param isInSandbox
     *        Indicates whether the calling account is in the SMS sandbox.
     */

    public void setIsInSandbox(Boolean isInSandbox) {
        this.isInSandbox = isInSandbox;
    }

    /**
     * <p>
     * Indicates whether the calling account is in the SMS sandbox.
     * </p>
     * 
     * @return Indicates whether the calling account is in the SMS sandbox.
     */

    public Boolean getIsInSandbox() {
        return this.isInSandbox;
    }

    /**
     * <p>
     * Indicates whether the calling account is in the SMS sandbox.
     * </p>
     * 
     * @param isInSandbox
     *        Indicates whether the calling account is in the SMS sandbox.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSMSSandboxAccountStatusResult withIsInSandbox(Boolean isInSandbox) {
        setIsInSandbox(isInSandbox);
        return this;
    }

    /**
     * <p>
     * Indicates whether the calling account is in the SMS sandbox.
     * </p>
     * 
     * @return Indicates whether the calling account is in the SMS sandbox.
     */

    public Boolean isInSandbox() {
        return this.isInSandbox;
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
        if (getIsInSandbox() != null)
            sb.append("IsInSandbox: ").append(getIsInSandbox());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSMSSandboxAccountStatusResult == false)
            return false;
        GetSMSSandboxAccountStatusResult other = (GetSMSSandboxAccountStatusResult) obj;
        if (other.getIsInSandbox() == null ^ this.getIsInSandbox() == null)
            return false;
        if (other.getIsInSandbox() != null && other.getIsInSandbox().equals(this.getIsInSandbox()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsInSandbox() == null) ? 0 : getIsInSandbox().hashCode());
        return hashCode;
    }

    @Override
    public GetSMSSandboxAccountStatusResult clone() {
        try {
            return (GetSMSSandboxAccountStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
