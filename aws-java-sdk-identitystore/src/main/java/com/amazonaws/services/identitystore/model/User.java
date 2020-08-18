/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitystore.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A user object, which contains a specified user’s metadata and attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/User" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class User implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the user’s username value. The length limit is 128 characters. This value can consist of letters,
     * accented characters, symbols, numbers and punctuation. The characters “&lt;&gt;;:%” are excluded. This value is
     * specified at the time the user is created and stored as an attribute of the user object in the identity store.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The identifier for a user in the identity store.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * Contains the user’s username value. The length limit is 128 characters. This value can consist of letters,
     * accented characters, symbols, numbers and punctuation. The characters “&lt;&gt;;:%” are excluded. This value is
     * specified at the time the user is created and stored as an attribute of the user object in the identity store.
     * </p>
     * 
     * @param userName
     *        Contains the user’s username value. The length limit is 128 characters. This value can consist of letters,
     *        accented characters, symbols, numbers and punctuation. The characters “&lt;&gt;;:%” are excluded. This
     *        value is specified at the time the user is created and stored as an attribute of the user object in the
     *        identity store.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * Contains the user’s username value. The length limit is 128 characters. This value can consist of letters,
     * accented characters, symbols, numbers and punctuation. The characters “&lt;&gt;;:%” are excluded. This value is
     * specified at the time the user is created and stored as an attribute of the user object in the identity store.
     * </p>
     * 
     * @return Contains the user’s username value. The length limit is 128 characters. This value can consist of
     *         letters, accented characters, symbols, numbers and punctuation. The characters “&lt;&gt;;:%” are
     *         excluded. This value is specified at the time the user is created and stored as an attribute of the user
     *         object in the identity store.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * Contains the user’s username value. The length limit is 128 characters. This value can consist of letters,
     * accented characters, symbols, numbers and punctuation. The characters “&lt;&gt;;:%” are excluded. This value is
     * specified at the time the user is created and stored as an attribute of the user object in the identity store.
     * </p>
     * 
     * @param userName
     *        Contains the user’s username value. The length limit is 128 characters. This value can consist of letters,
     *        accented characters, symbols, numbers and punctuation. The characters “&lt;&gt;;:%” are excluded. This
     *        value is specified at the time the user is created and stored as an attribute of the user object in the
     *        identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The identifier for a user in the identity store.
     * </p>
     * 
     * @param userId
     *        The identifier for a user in the identity store.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier for a user in the identity store.
     * </p>
     * 
     * @return The identifier for a user in the identity store.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier for a user in the identity store.
     * </p>
     * 
     * @param userId
     *        The identifier for a user in the identity store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withUserId(String userId) {
        setUserId(userId);
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
        if (getUserName() != null)
            sb.append("UserName: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof User == false)
            return false;
        User other = (User) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.identitystore.model.transform.UserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
