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
package com.amazonaws.services.appfabric.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/BatchGetUserAccessTasks" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetUserAccessTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains a list of user access results.
     * </p>
     */
    private java.util.List<UserAccessResultItem> userAccessResultsList;

    /**
     * <p>
     * Contains a list of user access results.
     * </p>
     * 
     * @return Contains a list of user access results.
     */

    public java.util.List<UserAccessResultItem> getUserAccessResultsList() {
        return userAccessResultsList;
    }

    /**
     * <p>
     * Contains a list of user access results.
     * </p>
     * 
     * @param userAccessResultsList
     *        Contains a list of user access results.
     */

    public void setUserAccessResultsList(java.util.Collection<UserAccessResultItem> userAccessResultsList) {
        if (userAccessResultsList == null) {
            this.userAccessResultsList = null;
            return;
        }

        this.userAccessResultsList = new java.util.ArrayList<UserAccessResultItem>(userAccessResultsList);
    }

    /**
     * <p>
     * Contains a list of user access results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAccessResultsList(java.util.Collection)} or
     * {@link #withUserAccessResultsList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param userAccessResultsList
     *        Contains a list of user access results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetUserAccessTasksResult withUserAccessResultsList(UserAccessResultItem... userAccessResultsList) {
        if (this.userAccessResultsList == null) {
            setUserAccessResultsList(new java.util.ArrayList<UserAccessResultItem>(userAccessResultsList.length));
        }
        for (UserAccessResultItem ele : userAccessResultsList) {
            this.userAccessResultsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of user access results.
     * </p>
     * 
     * @param userAccessResultsList
     *        Contains a list of user access results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetUserAccessTasksResult withUserAccessResultsList(java.util.Collection<UserAccessResultItem> userAccessResultsList) {
        setUserAccessResultsList(userAccessResultsList);
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
        if (getUserAccessResultsList() != null)
            sb.append("UserAccessResultsList: ").append(getUserAccessResultsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetUserAccessTasksResult == false)
            return false;
        BatchGetUserAccessTasksResult other = (BatchGetUserAccessTasksResult) obj;
        if (other.getUserAccessResultsList() == null ^ this.getUserAccessResultsList() == null)
            return false;
        if (other.getUserAccessResultsList() != null && other.getUserAccessResultsList().equals(this.getUserAccessResultsList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserAccessResultsList() == null) ? 0 : getUserAccessResultsList().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetUserAccessTasksResult clone() {
        try {
            return (BatchGetUserAccessTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
