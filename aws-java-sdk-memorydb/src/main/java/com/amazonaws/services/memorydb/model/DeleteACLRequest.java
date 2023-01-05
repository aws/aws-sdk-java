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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DeleteACL" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteACLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Access Control List to delete
     * </p>
     */
    private String aCLName;

    /**
     * <p>
     * The name of the Access Control List to delete
     * </p>
     * 
     * @param aCLName
     *        The name of the Access Control List to delete
     */

    public void setACLName(String aCLName) {
        this.aCLName = aCLName;
    }

    /**
     * <p>
     * The name of the Access Control List to delete
     * </p>
     * 
     * @return The name of the Access Control List to delete
     */

    public String getACLName() {
        return this.aCLName;
    }

    /**
     * <p>
     * The name of the Access Control List to delete
     * </p>
     * 
     * @param aCLName
     *        The name of the Access Control List to delete
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteACLRequest withACLName(String aCLName) {
        setACLName(aCLName);
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
            sb.append("ACLName: ").append(getACLName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteACLRequest == false)
            return false;
        DeleteACLRequest other = (DeleteACLRequest) obj;
        if (other.getACLName() == null ^ this.getACLName() == null)
            return false;
        if (other.getACLName() != null && other.getACLName().equals(this.getACLName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getACLName() == null) ? 0 : getACLName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteACLRequest clone() {
        return (DeleteACLRequest) super.clone();
    }

}
