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
package com.amazonaws.services.personalizeevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-events-2018-03-22/PutUsers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutUsersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Users dataset you are adding the user or users to.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * A list of user data.
     * </p>
     */
    private java.util.List<User> users;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Users dataset you are adding the user or users to.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the Users dataset you are adding the user or users to.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Users dataset you are adding the user or users to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Users dataset you are adding the user or users to.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Users dataset you are adding the user or users to.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the Users dataset you are adding the user or users to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutUsersRequest withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * A list of user data.
     * </p>
     * 
     * @return A list of user data.
     */

    public java.util.List<User> getUsers() {
        return users;
    }

    /**
     * <p>
     * A list of user data.
     * </p>
     * 
     * @param users
     *        A list of user data.
     */

    public void setUsers(java.util.Collection<User> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<User>(users);
    }

    /**
     * <p>
     * A list of user data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsers(java.util.Collection)} or {@link #withUsers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param users
     *        A list of user data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutUsersRequest withUsers(User... users) {
        if (this.users == null) {
            setUsers(new java.util.ArrayList<User>(users.length));
        }
        for (User ele : users) {
            this.users.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of user data.
     * </p>
     * 
     * @param users
     *        A list of user data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutUsersRequest withUsers(java.util.Collection<User> users) {
        setUsers(users);
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
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getUsers() != null)
            sb.append("Users: ").append(getUsers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutUsersRequest == false)
            return false;
        PutUsersRequest other = (PutUsersRequest) obj;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
        return hashCode;
    }

    @Override
    public PutUsersRequest clone() {
        return (PutUsersRequest) super.clone();
    }

}
