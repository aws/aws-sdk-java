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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUserDefinedFunction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUserDefinedFunctionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requested function definition.
     * </p>
     */
    private UserDefinedFunction userDefinedFunction;

    /**
     * <p>
     * The requested function definition.
     * </p>
     * 
     * @param userDefinedFunction
     *        The requested function definition.
     */

    public void setUserDefinedFunction(UserDefinedFunction userDefinedFunction) {
        this.userDefinedFunction = userDefinedFunction;
    }

    /**
     * <p>
     * The requested function definition.
     * </p>
     * 
     * @return The requested function definition.
     */

    public UserDefinedFunction getUserDefinedFunction() {
        return this.userDefinedFunction;
    }

    /**
     * <p>
     * The requested function definition.
     * </p>
     * 
     * @param userDefinedFunction
     *        The requested function definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserDefinedFunctionResult withUserDefinedFunction(UserDefinedFunction userDefinedFunction) {
        setUserDefinedFunction(userDefinedFunction);
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
        if (getUserDefinedFunction() != null)
            sb.append("UserDefinedFunction: ").append(getUserDefinedFunction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserDefinedFunctionResult == false)
            return false;
        GetUserDefinedFunctionResult other = (GetUserDefinedFunctionResult) obj;
        if (other.getUserDefinedFunction() == null ^ this.getUserDefinedFunction() == null)
            return false;
        if (other.getUserDefinedFunction() != null && other.getUserDefinedFunction().equals(this.getUserDefinedFunction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserDefinedFunction() == null) ? 0 : getUserDefinedFunction().hashCode());
        return hashCode;
    }

    @Override
    public GetUserDefinedFunctionResult clone() {
        try {
            return (GetUserDefinedFunctionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
