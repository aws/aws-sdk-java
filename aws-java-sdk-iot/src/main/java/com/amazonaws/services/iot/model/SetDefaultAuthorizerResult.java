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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetDefaultAuthorizerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The authorizer name.
     * </p>
     */
    private String authorizerName;
    /**
     * <p>
     * The authorizer ARN.
     * </p>
     */
    private String authorizerArn;

    /**
     * <p>
     * The authorizer name.
     * </p>
     * 
     * @param authorizerName
     *        The authorizer name.
     */

    public void setAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
    }

    /**
     * <p>
     * The authorizer name.
     * </p>
     * 
     * @return The authorizer name.
     */

    public String getAuthorizerName() {
        return this.authorizerName;
    }

    /**
     * <p>
     * The authorizer name.
     * </p>
     * 
     * @param authorizerName
     *        The authorizer name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetDefaultAuthorizerResult withAuthorizerName(String authorizerName) {
        setAuthorizerName(authorizerName);
        return this;
    }

    /**
     * <p>
     * The authorizer ARN.
     * </p>
     * 
     * @param authorizerArn
     *        The authorizer ARN.
     */

    public void setAuthorizerArn(String authorizerArn) {
        this.authorizerArn = authorizerArn;
    }

    /**
     * <p>
     * The authorizer ARN.
     * </p>
     * 
     * @return The authorizer ARN.
     */

    public String getAuthorizerArn() {
        return this.authorizerArn;
    }

    /**
     * <p>
     * The authorizer ARN.
     * </p>
     * 
     * @param authorizerArn
     *        The authorizer ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetDefaultAuthorizerResult withAuthorizerArn(String authorizerArn) {
        setAuthorizerArn(authorizerArn);
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
        if (getAuthorizerName() != null)
            sb.append("AuthorizerName: ").append(getAuthorizerName()).append(",");
        if (getAuthorizerArn() != null)
            sb.append("AuthorizerArn: ").append(getAuthorizerArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetDefaultAuthorizerResult == false)
            return false;
        SetDefaultAuthorizerResult other = (SetDefaultAuthorizerResult) obj;
        if (other.getAuthorizerName() == null ^ this.getAuthorizerName() == null)
            return false;
        if (other.getAuthorizerName() != null && other.getAuthorizerName().equals(this.getAuthorizerName()) == false)
            return false;
        if (other.getAuthorizerArn() == null ^ this.getAuthorizerArn() == null)
            return false;
        if (other.getAuthorizerArn() != null && other.getAuthorizerArn().equals(this.getAuthorizerArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizerName() == null) ? 0 : getAuthorizerName().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerArn() == null) ? 0 : getAuthorizerArn().hashCode());
        return hashCode;
    }

    @Override
    public SetDefaultAuthorizerResult clone() {
        try {
            return (SetDefaultAuthorizerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
