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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/UpdateGlobalTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGlobalTableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the details of the global table.
     * </p>
     */
    private GlobalTableDescription globalTableDescription;

    /**
     * <p>
     * Contains the details of the global table.
     * </p>
     * 
     * @param globalTableDescription
     *        Contains the details of the global table.
     */

    public void setGlobalTableDescription(GlobalTableDescription globalTableDescription) {
        this.globalTableDescription = globalTableDescription;
    }

    /**
     * <p>
     * Contains the details of the global table.
     * </p>
     * 
     * @return Contains the details of the global table.
     */

    public GlobalTableDescription getGlobalTableDescription() {
        return this.globalTableDescription;
    }

    /**
     * <p>
     * Contains the details of the global table.
     * </p>
     * 
     * @param globalTableDescription
     *        Contains the details of the global table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalTableResult withGlobalTableDescription(GlobalTableDescription globalTableDescription) {
        setGlobalTableDescription(globalTableDescription);
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
        if (getGlobalTableDescription() != null)
            sb.append("GlobalTableDescription: ").append(getGlobalTableDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGlobalTableResult == false)
            return false;
        UpdateGlobalTableResult other = (UpdateGlobalTableResult) obj;
        if (other.getGlobalTableDescription() == null ^ this.getGlobalTableDescription() == null)
            return false;
        if (other.getGlobalTableDescription() != null && other.getGlobalTableDescription().equals(this.getGlobalTableDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalTableDescription() == null) ? 0 : getGlobalTableDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGlobalTableResult clone() {
        try {
            return (UpdateGlobalTableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
