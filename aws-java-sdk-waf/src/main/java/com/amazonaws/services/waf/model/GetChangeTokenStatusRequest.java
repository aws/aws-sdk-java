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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetChangeTokenStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChangeTokenStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The change token for which you want to get the status. This change token was previously returned in the
     * <code>GetChangeToken</code> response.
     * </p>
     */
    private String changeToken;

    /**
     * <p>
     * The change token for which you want to get the status. This change token was previously returned in the
     * <code>GetChangeToken</code> response.
     * </p>
     * 
     * @param changeToken
     *        The change token for which you want to get the status. This change token was previously returned in the
     *        <code>GetChangeToken</code> response.
     */

    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The change token for which you want to get the status. This change token was previously returned in the
     * <code>GetChangeToken</code> response.
     * </p>
     * 
     * @return The change token for which you want to get the status. This change token was previously returned in the
     *         <code>GetChangeToken</code> response.
     */

    public String getChangeToken() {
        return this.changeToken;
    }

    /**
     * <p>
     * The change token for which you want to get the status. This change token was previously returned in the
     * <code>GetChangeToken</code> response.
     * </p>
     * 
     * @param changeToken
     *        The change token for which you want to get the status. This change token was previously returned in the
     *        <code>GetChangeToken</code> response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangeTokenStatusRequest withChangeToken(String changeToken) {
        setChangeToken(changeToken);
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
        if (getChangeToken() != null)
            sb.append("ChangeToken: ").append(getChangeToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetChangeTokenStatusRequest == false)
            return false;
        GetChangeTokenStatusRequest other = (GetChangeTokenStatusRequest) obj;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        return hashCode;
    }

    @Override
    public GetChangeTokenStatusRequest clone() {
        return (GetChangeTokenStatusRequest) super.clone();
    }

}
