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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateConnectClientAddIn"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectClientAddInResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The client add-in identifier.
     * </p>
     */
    private String addInId;

    /**
     * <p>
     * The client add-in identifier.
     * </p>
     * 
     * @param addInId
     *        The client add-in identifier.
     */

    public void setAddInId(String addInId) {
        this.addInId = addInId;
    }

    /**
     * <p>
     * The client add-in identifier.
     * </p>
     * 
     * @return The client add-in identifier.
     */

    public String getAddInId() {
        return this.addInId;
    }

    /**
     * <p>
     * The client add-in identifier.
     * </p>
     * 
     * @param addInId
     *        The client add-in identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectClientAddInResult withAddInId(String addInId) {
        setAddInId(addInId);
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
        if (getAddInId() != null)
            sb.append("AddInId: ").append(getAddInId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConnectClientAddInResult == false)
            return false;
        CreateConnectClientAddInResult other = (CreateConnectClientAddInResult) obj;
        if (other.getAddInId() == null ^ this.getAddInId() == null)
            return false;
        if (other.getAddInId() != null && other.getAddInId().equals(this.getAddInId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddInId() == null) ? 0 : getAddInId().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectClientAddInResult clone() {
        try {
            return (CreateConnectClientAddInResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
