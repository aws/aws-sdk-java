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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/BatchAssociateUserStack" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAssociateUserStackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of UserStackAssociation objects.
     * </p>
     */
    private java.util.List<UserStackAssociation> userStackAssociations;

    /**
     * <p>
     * The list of UserStackAssociation objects.
     * </p>
     * 
     * @return The list of UserStackAssociation objects.
     */

    public java.util.List<UserStackAssociation> getUserStackAssociations() {
        return userStackAssociations;
    }

    /**
     * <p>
     * The list of UserStackAssociation objects.
     * </p>
     * 
     * @param userStackAssociations
     *        The list of UserStackAssociation objects.
     */

    public void setUserStackAssociations(java.util.Collection<UserStackAssociation> userStackAssociations) {
        if (userStackAssociations == null) {
            this.userStackAssociations = null;
            return;
        }

        this.userStackAssociations = new java.util.ArrayList<UserStackAssociation>(userStackAssociations);
    }

    /**
     * <p>
     * The list of UserStackAssociation objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserStackAssociations(java.util.Collection)} or
     * {@link #withUserStackAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param userStackAssociations
     *        The list of UserStackAssociation objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateUserStackRequest withUserStackAssociations(UserStackAssociation... userStackAssociations) {
        if (this.userStackAssociations == null) {
            setUserStackAssociations(new java.util.ArrayList<UserStackAssociation>(userStackAssociations.length));
        }
        for (UserStackAssociation ele : userStackAssociations) {
            this.userStackAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of UserStackAssociation objects.
     * </p>
     * 
     * @param userStackAssociations
     *        The list of UserStackAssociation objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAssociateUserStackRequest withUserStackAssociations(java.util.Collection<UserStackAssociation> userStackAssociations) {
        setUserStackAssociations(userStackAssociations);
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
        if (getUserStackAssociations() != null)
            sb.append("UserStackAssociations: ").append(getUserStackAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAssociateUserStackRequest == false)
            return false;
        BatchAssociateUserStackRequest other = (BatchAssociateUserStackRequest) obj;
        if (other.getUserStackAssociations() == null ^ this.getUserStackAssociations() == null)
            return false;
        if (other.getUserStackAssociations() != null && other.getUserStackAssociations().equals(this.getUserStackAssociations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserStackAssociations() == null) ? 0 : getUserStackAssociations().hashCode());
        return hashCode;
    }

    @Override
    public BatchAssociateUserStackRequest clone() {
        return (BatchAssociateUserStackRequest) super.clone();
    }

}
