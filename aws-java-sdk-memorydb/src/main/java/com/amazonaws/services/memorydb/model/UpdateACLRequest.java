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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateACL" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateACLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Access Control List
     * </p>
     */
    private String aCLName;
    /**
     * <p>
     * The list of users to add to the Access Control List
     * </p>
     */
    private java.util.List<String> userNamesToAdd;
    /**
     * <p>
     * The list of users to remove from the Access Control List
     * </p>
     */
    private java.util.List<String> userNamesToRemove;

    /**
     * <p>
     * The name of the Access Control List
     * </p>
     * 
     * @param aCLName
     *        The name of the Access Control List
     */

    public void setACLName(String aCLName) {
        this.aCLName = aCLName;
    }

    /**
     * <p>
     * The name of the Access Control List
     * </p>
     * 
     * @return The name of the Access Control List
     */

    public String getACLName() {
        return this.aCLName;
    }

    /**
     * <p>
     * The name of the Access Control List
     * </p>
     * 
     * @param aCLName
     *        The name of the Access Control List
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateACLRequest withACLName(String aCLName) {
        setACLName(aCLName);
        return this;
    }

    /**
     * <p>
     * The list of users to add to the Access Control List
     * </p>
     * 
     * @return The list of users to add to the Access Control List
     */

    public java.util.List<String> getUserNamesToAdd() {
        return userNamesToAdd;
    }

    /**
     * <p>
     * The list of users to add to the Access Control List
     * </p>
     * 
     * @param userNamesToAdd
     *        The list of users to add to the Access Control List
     */

    public void setUserNamesToAdd(java.util.Collection<String> userNamesToAdd) {
        if (userNamesToAdd == null) {
            this.userNamesToAdd = null;
            return;
        }

        this.userNamesToAdd = new java.util.ArrayList<String>(userNamesToAdd);
    }

    /**
     * <p>
     * The list of users to add to the Access Control List
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserNamesToAdd(java.util.Collection)} or {@link #withUserNamesToAdd(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userNamesToAdd
     *        The list of users to add to the Access Control List
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateACLRequest withUserNamesToAdd(String... userNamesToAdd) {
        if (this.userNamesToAdd == null) {
            setUserNamesToAdd(new java.util.ArrayList<String>(userNamesToAdd.length));
        }
        for (String ele : userNamesToAdd) {
            this.userNamesToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of users to add to the Access Control List
     * </p>
     * 
     * @param userNamesToAdd
     *        The list of users to add to the Access Control List
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateACLRequest withUserNamesToAdd(java.util.Collection<String> userNamesToAdd) {
        setUserNamesToAdd(userNamesToAdd);
        return this;
    }

    /**
     * <p>
     * The list of users to remove from the Access Control List
     * </p>
     * 
     * @return The list of users to remove from the Access Control List
     */

    public java.util.List<String> getUserNamesToRemove() {
        return userNamesToRemove;
    }

    /**
     * <p>
     * The list of users to remove from the Access Control List
     * </p>
     * 
     * @param userNamesToRemove
     *        The list of users to remove from the Access Control List
     */

    public void setUserNamesToRemove(java.util.Collection<String> userNamesToRemove) {
        if (userNamesToRemove == null) {
            this.userNamesToRemove = null;
            return;
        }

        this.userNamesToRemove = new java.util.ArrayList<String>(userNamesToRemove);
    }

    /**
     * <p>
     * The list of users to remove from the Access Control List
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserNamesToRemove(java.util.Collection)} or {@link #withUserNamesToRemove(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param userNamesToRemove
     *        The list of users to remove from the Access Control List
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateACLRequest withUserNamesToRemove(String... userNamesToRemove) {
        if (this.userNamesToRemove == null) {
            setUserNamesToRemove(new java.util.ArrayList<String>(userNamesToRemove.length));
        }
        for (String ele : userNamesToRemove) {
            this.userNamesToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of users to remove from the Access Control List
     * </p>
     * 
     * @param userNamesToRemove
     *        The list of users to remove from the Access Control List
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateACLRequest withUserNamesToRemove(java.util.Collection<String> userNamesToRemove) {
        setUserNamesToRemove(userNamesToRemove);
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
        if (getACLName() != null)
            sb.append("ACLName: ").append(getACLName()).append(",");
        if (getUserNamesToAdd() != null)
            sb.append("UserNamesToAdd: ").append(getUserNamesToAdd()).append(",");
        if (getUserNamesToRemove() != null)
            sb.append("UserNamesToRemove: ").append(getUserNamesToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateACLRequest == false)
            return false;
        UpdateACLRequest other = (UpdateACLRequest) obj;
        if (other.getACLName() == null ^ this.getACLName() == null)
            return false;
        if (other.getACLName() != null && other.getACLName().equals(this.getACLName()) == false)
            return false;
        if (other.getUserNamesToAdd() == null ^ this.getUserNamesToAdd() == null)
            return false;
        if (other.getUserNamesToAdd() != null && other.getUserNamesToAdd().equals(this.getUserNamesToAdd()) == false)
            return false;
        if (other.getUserNamesToRemove() == null ^ this.getUserNamesToRemove() == null)
            return false;
        if (other.getUserNamesToRemove() != null && other.getUserNamesToRemove().equals(this.getUserNamesToRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getACLName() == null) ? 0 : getACLName().hashCode());
        hashCode = prime * hashCode + ((getUserNamesToAdd() == null) ? 0 : getUserNamesToAdd().hashCode());
        hashCode = prime * hashCode + ((getUserNamesToRemove() == null) ? 0 : getUserNamesToRemove().hashCode());
        return hashCode;
    }

    @Override
    public UpdateACLRequest clone() {
        return (UpdateACLRequest) super.clone();
    }

}
