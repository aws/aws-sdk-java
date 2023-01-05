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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the session.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The origin of the request.
     * </p>
     */
    private String requestOrigin;

    /**
     * <p>
     * The ID of the session.
     * </p>
     * 
     * @param id
     *        The ID of the session.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the session.
     * </p>
     * 
     * @return The ID of the session.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the session.
     * </p>
     * 
     * @param id
     *        The ID of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The origin of the request.
     * </p>
     * 
     * @param requestOrigin
     *        The origin of the request.
     */

    public void setRequestOrigin(String requestOrigin) {
        this.requestOrigin = requestOrigin;
    }

    /**
     * <p>
     * The origin of the request.
     * </p>
     * 
     * @return The origin of the request.
     */

    public String getRequestOrigin() {
        return this.requestOrigin;
    }

    /**
     * <p>
     * The origin of the request.
     * </p>
     * 
     * @param requestOrigin
     *        The origin of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionRequest withRequestOrigin(String requestOrigin) {
        setRequestOrigin(requestOrigin);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRequestOrigin() != null)
            sb.append("RequestOrigin: ").append(getRequestOrigin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSessionRequest == false)
            return false;
        GetSessionRequest other = (GetSessionRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRequestOrigin() == null ^ this.getRequestOrigin() == null)
            return false;
        if (other.getRequestOrigin() != null && other.getRequestOrigin().equals(this.getRequestOrigin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRequestOrigin() == null) ? 0 : getRequestOrigin().hashCode());
        return hashCode;
    }

    @Override
    public GetSessionRequest clone() {
        return (GetSessionRequest) super.clone();
    }

}
