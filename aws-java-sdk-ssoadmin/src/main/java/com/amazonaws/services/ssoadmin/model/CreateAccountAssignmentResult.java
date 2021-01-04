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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/CreateAccountAssignment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccountAssignmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status object for the account assignment creation operation.
     * </p>
     */
    private AccountAssignmentOperationStatus accountAssignmentCreationStatus;

    /**
     * <p>
     * The status object for the account assignment creation operation.
     * </p>
     * 
     * @param accountAssignmentCreationStatus
     *        The status object for the account assignment creation operation.
     */

    public void setAccountAssignmentCreationStatus(AccountAssignmentOperationStatus accountAssignmentCreationStatus) {
        this.accountAssignmentCreationStatus = accountAssignmentCreationStatus;
    }

    /**
     * <p>
     * The status object for the account assignment creation operation.
     * </p>
     * 
     * @return The status object for the account assignment creation operation.
     */

    public AccountAssignmentOperationStatus getAccountAssignmentCreationStatus() {
        return this.accountAssignmentCreationStatus;
    }

    /**
     * <p>
     * The status object for the account assignment creation operation.
     * </p>
     * 
     * @param accountAssignmentCreationStatus
     *        The status object for the account assignment creation operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountAssignmentResult withAccountAssignmentCreationStatus(AccountAssignmentOperationStatus accountAssignmentCreationStatus) {
        setAccountAssignmentCreationStatus(accountAssignmentCreationStatus);
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
        if (getAccountAssignmentCreationStatus() != null)
            sb.append("AccountAssignmentCreationStatus: ").append(getAccountAssignmentCreationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccountAssignmentResult == false)
            return false;
        CreateAccountAssignmentResult other = (CreateAccountAssignmentResult) obj;
        if (other.getAccountAssignmentCreationStatus() == null ^ this.getAccountAssignmentCreationStatus() == null)
            return false;
        if (other.getAccountAssignmentCreationStatus() != null
                && other.getAccountAssignmentCreationStatus().equals(this.getAccountAssignmentCreationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountAssignmentCreationStatus() == null) ? 0 : getAccountAssignmentCreationStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccountAssignmentResult clone() {
        try {
            return (CreateAccountAssignmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
