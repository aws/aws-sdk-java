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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUserDefinedFunctions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUserDefinedFunctionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of requested function definitions.
     * </p>
     */
    private java.util.List<UserDefinedFunction> userDefinedFunctions;
    /**
     * <p>
     * A continuation token, if the list of functions returned does not include the last requested function.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of requested function definitions.
     * </p>
     * 
     * @return A list of requested function definitions.
     */

    public java.util.List<UserDefinedFunction> getUserDefinedFunctions() {
        return userDefinedFunctions;
    }

    /**
     * <p>
     * A list of requested function definitions.
     * </p>
     * 
     * @param userDefinedFunctions
     *        A list of requested function definitions.
     */

    public void setUserDefinedFunctions(java.util.Collection<UserDefinedFunction> userDefinedFunctions) {
        if (userDefinedFunctions == null) {
            this.userDefinedFunctions = null;
            return;
        }

        this.userDefinedFunctions = new java.util.ArrayList<UserDefinedFunction>(userDefinedFunctions);
    }

    /**
     * <p>
     * A list of requested function definitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserDefinedFunctions(java.util.Collection)} or {@link #withUserDefinedFunctions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param userDefinedFunctions
     *        A list of requested function definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserDefinedFunctionsResult withUserDefinedFunctions(UserDefinedFunction... userDefinedFunctions) {
        if (this.userDefinedFunctions == null) {
            setUserDefinedFunctions(new java.util.ArrayList<UserDefinedFunction>(userDefinedFunctions.length));
        }
        for (UserDefinedFunction ele : userDefinedFunctions) {
            this.userDefinedFunctions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of requested function definitions.
     * </p>
     * 
     * @param userDefinedFunctions
     *        A list of requested function definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserDefinedFunctionsResult withUserDefinedFunctions(java.util.Collection<UserDefinedFunction> userDefinedFunctions) {
        setUserDefinedFunctions(userDefinedFunctions);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the list of functions returned does not include the last requested function.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the list of functions returned does not include the last requested function.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the list of functions returned does not include the last requested function.
     * </p>
     * 
     * @return A continuation token, if the list of functions returned does not include the last requested function.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if the list of functions returned does not include the last requested function.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the list of functions returned does not include the last requested function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserDefinedFunctionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getUserDefinedFunctions() != null)
            sb.append("UserDefinedFunctions: ").append(getUserDefinedFunctions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserDefinedFunctionsResult == false)
            return false;
        GetUserDefinedFunctionsResult other = (GetUserDefinedFunctionsResult) obj;
        if (other.getUserDefinedFunctions() == null ^ this.getUserDefinedFunctions() == null)
            return false;
        if (other.getUserDefinedFunctions() != null && other.getUserDefinedFunctions().equals(this.getUserDefinedFunctions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserDefinedFunctions() == null) ? 0 : getUserDefinedFunctions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetUserDefinedFunctionsResult clone() {
        try {
            return (GetUserDefinedFunctionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
