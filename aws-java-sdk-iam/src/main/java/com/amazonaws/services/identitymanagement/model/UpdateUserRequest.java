/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateUserRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * Name of the user to update. If you're changing the name of the user, this
     * is the original user name.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * New path for the user. Include this parameter only if you're changing the
     * user's path.
     * </p>
     */
    private String newPath;
    /**
     * <p>
     * New name for the user. Include this parameter only if you're changing the
     * user's name.
     * </p>
     */
    private String newUserName;

    /**
     * Default constructor for UpdateUserRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public UpdateUserRequest() {
    }

    /**
     * Constructs a new UpdateUserRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param userName
     *        Name of the user to update. If you're changing the name of the
     *        user, this is the original user name.
     */
    public UpdateUserRequest(String userName) {
        setUserName(userName);
    }

    /**
     * <p>
     * Name of the user to update. If you're changing the name of the user, this
     * is the original user name.
     * </p>
     * 
     * @param userName
     *        Name of the user to update. If you're changing the name of the
     *        user, this is the original user name.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * Name of the user to update. If you're changing the name of the user, this
     * is the original user name.
     * </p>
     * 
     * @return Name of the user to update. If you're changing the name of the
     *         user, this is the original user name.
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * Name of the user to update. If you're changing the name of the user, this
     * is the original user name.
     * </p>
     * 
     * @param userName
     *        Name of the user to update. If you're changing the name of the
     *        user, this is the original user name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * New path for the user. Include this parameter only if you're changing the
     * user's path.
     * </p>
     * 
     * @param newPath
     *        New path for the user. Include this parameter only if you're
     *        changing the user's path.
     */
    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }

    /**
     * <p>
     * New path for the user. Include this parameter only if you're changing the
     * user's path.
     * </p>
     * 
     * @return New path for the user. Include this parameter only if you're
     *         changing the user's path.
     */
    public String getNewPath() {
        return this.newPath;
    }

    /**
     * <p>
     * New path for the user. Include this parameter only if you're changing the
     * user's path.
     * </p>
     * 
     * @param newPath
     *        New path for the user. Include this parameter only if you're
     *        changing the user's path.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withNewPath(String newPath) {
        setNewPath(newPath);
        return this;
    }

    /**
     * <p>
     * New name for the user. Include this parameter only if you're changing the
     * user's name.
     * </p>
     * 
     * @param newUserName
     *        New name for the user. Include this parameter only if you're
     *        changing the user's name.
     */
    public void setNewUserName(String newUserName) {
        this.newUserName = newUserName;
    }

    /**
     * <p>
     * New name for the user. Include this parameter only if you're changing the
     * user's name.
     * </p>
     * 
     * @return New name for the user. Include this parameter only if you're
     *         changing the user's name.
     */
    public String getNewUserName() {
        return this.newUserName;
    }

    /**
     * <p>
     * New name for the user. Include this parameter only if you're changing the
     * user's name.
     * </p>
     * 
     * @param newUserName
     *        New name for the user. Include this parameter only if you're
     *        changing the user's name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateUserRequest withNewUserName(String newUserName) {
        setNewUserName(newUserName);
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getNewPath() != null)
            sb.append("NewPath: " + getNewPath() + ",");
        if (getNewUserName() != null)
            sb.append("NewUserName: " + getNewUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserRequest == false)
            return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null
                && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getNewPath() == null ^ this.getNewPath() == null)
            return false;
        if (other.getNewPath() != null
                && other.getNewPath().equals(this.getNewPath()) == false)
            return false;
        if (other.getNewUserName() == null ^ this.getNewUserName() == null)
            return false;
        if (other.getNewUserName() != null
                && other.getNewUserName().equals(this.getNewUserName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode
                + ((getNewPath() == null) ? 0 : getNewPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getNewUserName() == null) ? 0 : getNewUserName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserRequest clone() {
        return (UpdateUserRequest) super.clone();
    }
}