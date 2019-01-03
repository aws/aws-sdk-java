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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchSuspendUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchSuspendUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the <a>BatchSuspendUser</a> action fails for one or more of the user IDs in the request, a list of the user
     * IDs is returned, along with error codes and error messages.
     * </p>
     */
    private java.util.List<UserError> userErrors;

    /**
     * <p>
     * If the <a>BatchSuspendUser</a> action fails for one or more of the user IDs in the request, a list of the user
     * IDs is returned, along with error codes and error messages.
     * </p>
     * 
     * @return If the <a>BatchSuspendUser</a> action fails for one or more of the user IDs in the request, a list of the
     *         user IDs is returned, along with error codes and error messages.
     */

    public java.util.List<UserError> getUserErrors() {
        return userErrors;
    }

    /**
     * <p>
     * If the <a>BatchSuspendUser</a> action fails for one or more of the user IDs in the request, a list of the user
     * IDs is returned, along with error codes and error messages.
     * </p>
     * 
     * @param userErrors
     *        If the <a>BatchSuspendUser</a> action fails for one or more of the user IDs in the request, a list of the
     *        user IDs is returned, along with error codes and error messages.
     */

    public void setUserErrors(java.util.Collection<UserError> userErrors) {
        if (userErrors == null) {
            this.userErrors = null;
            return;
        }

        this.userErrors = new java.util.ArrayList<UserError>(userErrors);
    }

    /**
     * <p>
     * If the <a>BatchSuspendUser</a> action fails for one or more of the user IDs in the request, a list of the user
     * IDs is returned, along with error codes and error messages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserErrors(java.util.Collection)} or {@link #withUserErrors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userErrors
     *        If the <a>BatchSuspendUser</a> action fails for one or more of the user IDs in the request, a list of the
     *        user IDs is returned, along with error codes and error messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchSuspendUserResult withUserErrors(UserError... userErrors) {
        if (this.userErrors == null) {
            setUserErrors(new java.util.ArrayList<UserError>(userErrors.length));
        }
        for (UserError ele : userErrors) {
            this.userErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the <a>BatchSuspendUser</a> action fails for one or more of the user IDs in the request, a list of the user
     * IDs is returned, along with error codes and error messages.
     * </p>
     * 
     * @param userErrors
     *        If the <a>BatchSuspendUser</a> action fails for one or more of the user IDs in the request, a list of the
     *        user IDs is returned, along with error codes and error messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchSuspendUserResult withUserErrors(java.util.Collection<UserError> userErrors) {
        setUserErrors(userErrors);
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
        if (getUserErrors() != null)
            sb.append("UserErrors: ").append(getUserErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchSuspendUserResult == false)
            return false;
        BatchSuspendUserResult other = (BatchSuspendUserResult) obj;
        if (other.getUserErrors() == null ^ this.getUserErrors() == null)
            return false;
        if (other.getUserErrors() != null && other.getUserErrors().equals(this.getUserErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserErrors() == null) ? 0 : getUserErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchSuspendUserResult clone() {
        try {
            return (BatchSuspendUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
