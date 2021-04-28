/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetEula" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEulaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The EULA ID.
     * </p>
     */
    private String eulaId;

    /**
     * <p>
     * The EULA ID.
     * </p>
     * 
     * @param eulaId
     *        The EULA ID.
     */

    public void setEulaId(String eulaId) {
        this.eulaId = eulaId;
    }

    /**
     * <p>
     * The EULA ID.
     * </p>
     * 
     * @return The EULA ID.
     */

    public String getEulaId() {
        return this.eulaId;
    }

    /**
     * <p>
     * The EULA ID.
     * </p>
     * 
     * @param eulaId
     *        The EULA ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEulaRequest withEulaId(String eulaId) {
        setEulaId(eulaId);
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
        if (getEulaId() != null)
            sb.append("EulaId: ").append(getEulaId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEulaRequest == false)
            return false;
        GetEulaRequest other = (GetEulaRequest) obj;
        if (other.getEulaId() == null ^ this.getEulaId() == null)
            return false;
        if (other.getEulaId() != null && other.getEulaId().equals(this.getEulaId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEulaId() == null) ? 0 : getEulaId().hashCode());
        return hashCode;
    }

    @Override
    public GetEulaRequest clone() {
        return (GetEulaRequest) super.clone();
    }

}
