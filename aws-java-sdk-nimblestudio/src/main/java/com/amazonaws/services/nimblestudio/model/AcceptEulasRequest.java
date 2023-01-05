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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/AcceptEulas" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptEulasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to
     * ensure idempotency.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The EULA ID.
     * </p>
     */
    private java.util.List<String> eulaIds;
    /**
     * <p>
     * The studio ID.
     * </p>
     */
    private String studioId;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to
     * ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     *        specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it for
     *        the request to ensure idempotency.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to
     * ensure idempotency.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     *         specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it
     *         for the request to ensure idempotency.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to
     * ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     *        specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it for
     *        the request to ensure idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptEulasRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The EULA ID.
     * </p>
     * 
     * @return The EULA ID.
     */

    public java.util.List<String> getEulaIds() {
        return eulaIds;
    }

    /**
     * <p>
     * The EULA ID.
     * </p>
     * 
     * @param eulaIds
     *        The EULA ID.
     */

    public void setEulaIds(java.util.Collection<String> eulaIds) {
        if (eulaIds == null) {
            this.eulaIds = null;
            return;
        }

        this.eulaIds = new java.util.ArrayList<String>(eulaIds);
    }

    /**
     * <p>
     * The EULA ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEulaIds(java.util.Collection)} or {@link #withEulaIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param eulaIds
     *        The EULA ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptEulasRequest withEulaIds(String... eulaIds) {
        if (this.eulaIds == null) {
            setEulaIds(new java.util.ArrayList<String>(eulaIds.length));
        }
        for (String ele : eulaIds) {
            this.eulaIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EULA ID.
     * </p>
     * 
     * @param eulaIds
     *        The EULA ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptEulasRequest withEulaIds(java.util.Collection<String> eulaIds) {
        setEulaIds(eulaIds);
        return this;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @return The studio ID.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptEulasRequest withStudioId(String studioId) {
        setStudioId(studioId);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getEulaIds() != null)
            sb.append("EulaIds: ").append(getEulaIds()).append(",");
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptEulasRequest == false)
            return false;
        AcceptEulasRequest other = (AcceptEulasRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getEulaIds() == null ^ this.getEulaIds() == null)
            return false;
        if (other.getEulaIds() != null && other.getEulaIds().equals(this.getEulaIds()) == false)
            return false;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getEulaIds() == null) ? 0 : getEulaIds().hashCode());
        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        return hashCode;
    }

    @Override
    public AcceptEulasRequest clone() {
        return (AcceptEulasRequest) super.clone();
    }

}
