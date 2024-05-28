/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of user aliases attached to a user.
     * </p>
     */
    private java.util.List<UserAlias> userAliases;

    /**
     * <p>
     * A list of user aliases attached to a user.
     * </p>
     * 
     * @return A list of user aliases attached to a user.
     */

    public java.util.List<UserAlias> getUserAliases() {
        return userAliases;
    }

    /**
     * <p>
     * A list of user aliases attached to a user.
     * </p>
     * 
     * @param userAliases
     *        A list of user aliases attached to a user.
     */

    public void setUserAliases(java.util.Collection<UserAlias> userAliases) {
        if (userAliases == null) {
            this.userAliases = null;
            return;
        }

        this.userAliases = new java.util.ArrayList<UserAlias>(userAliases);
    }

    /**
     * <p>
     * A list of user aliases attached to a user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAliases(java.util.Collection)} or {@link #withUserAliases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userAliases
     *        A list of user aliases attached to a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withUserAliases(UserAlias... userAliases) {
        if (this.userAliases == null) {
            setUserAliases(new java.util.ArrayList<UserAlias>(userAliases.length));
        }
        for (UserAlias ele : userAliases) {
            this.userAliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of user aliases attached to a user.
     * </p>
     * 
     * @param userAliases
     *        A list of user aliases attached to a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withUserAliases(java.util.Collection<UserAlias> userAliases) {
        setUserAliases(userAliases);
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
        if (getUserAliases() != null)
            sb.append("UserAliases: ").append(getUserAliases());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserResult == false)
            return false;
        GetUserResult other = (GetUserResult) obj;
        if (other.getUserAliases() == null ^ this.getUserAliases() == null)
            return false;
        if (other.getUserAliases() != null && other.getUserAliases().equals(this.getUserAliases()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserAliases() == null) ? 0 : getUserAliases().hashCode());
        return hashCode;
    }

    @Override
    public GetUserResult clone() {
        try {
            return (GetUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
