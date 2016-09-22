/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to update the user pool client.
 * </p>
 */
public class UpdateUserPoolClientRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool where you want to update the user pool client.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The client name from the update user pool client request.
     * </p>
     */
    private String clientName;
    /**
     * <p>
     * The validity of the refresh token.
     * </p>
     */
    private Integer refreshTokenValidity;
    /**
     * <p>
     * The read-only attributes of the user pool.
     * </p>
     */
    private java.util.List<String> readAttributes;
    /**
     * <p>
     * The writeable attributes of the user pool.
     * </p>
     */
    private java.util.List<String> writeAttributes;
    /**
     * <p>
     * Explicit authentication flows.
     * </p>
     */
    private java.util.List<String> explicitAuthFlows;

    /**
     * <p>
     * The user pool ID for the user pool where you want to update the user pool client.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to update the user pool client.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to update the user pool client.
     * </p>
     * 
     * @return The user pool ID for the user pool where you want to update the user pool client.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to update the user pool client.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to update the user pool client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolClientRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * 
     * @param clientId
     *        The ID of the client associated with the user pool.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * 
     * @return The ID of the client associated with the user pool.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * 
     * @param clientId
     *        The ID of the client associated with the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolClientRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The client name from the update user pool client request.
     * </p>
     * 
     * @param clientName
     *        The client name from the update user pool client request.
     */

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * <p>
     * The client name from the update user pool client request.
     * </p>
     * 
     * @return The client name from the update user pool client request.
     */

    public String getClientName() {
        return this.clientName;
    }

    /**
     * <p>
     * The client name from the update user pool client request.
     * </p>
     * 
     * @param clientName
     *        The client name from the update user pool client request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolClientRequest withClientName(String clientName) {
        setClientName(clientName);
        return this;
    }

    /**
     * <p>
     * The validity of the refresh token.
     * </p>
     * 
     * @param refreshTokenValidity
     *        The validity of the refresh token.
     */

    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    /**
     * <p>
     * The validity of the refresh token.
     * </p>
     * 
     * @return The validity of the refresh token.
     */

    public Integer getRefreshTokenValidity() {
        return this.refreshTokenValidity;
    }

    /**
     * <p>
     * The validity of the refresh token.
     * </p>
     * 
     * @param refreshTokenValidity
     *        The validity of the refresh token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolClientRequest withRefreshTokenValidity(Integer refreshTokenValidity) {
        setRefreshTokenValidity(refreshTokenValidity);
        return this;
    }

    /**
     * <p>
     * The read-only attributes of the user pool.
     * </p>
     * 
     * @return The read-only attributes of the user pool.
     */

    public java.util.List<String> getReadAttributes() {
        return readAttributes;
    }

    /**
     * <p>
     * The read-only attributes of the user pool.
     * </p>
     * 
     * @param readAttributes
     *        The read-only attributes of the user pool.
     */

    public void setReadAttributes(java.util.Collection<String> readAttributes) {
        if (readAttributes == null) {
            this.readAttributes = null;
            return;
        }

        this.readAttributes = new java.util.ArrayList<String>(readAttributes);
    }

    /**
     * <p>
     * The read-only attributes of the user pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadAttributes(java.util.Collection)} or {@link #withReadAttributes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param readAttributes
     *        The read-only attributes of the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolClientRequest withReadAttributes(String... readAttributes) {
        if (this.readAttributes == null) {
            setReadAttributes(new java.util.ArrayList<String>(readAttributes.length));
        }
        for (String ele : readAttributes) {
            this.readAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The read-only attributes of the user pool.
     * </p>
     * 
     * @param readAttributes
     *        The read-only attributes of the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolClientRequest withReadAttributes(java.util.Collection<String> readAttributes) {
        setReadAttributes(readAttributes);
        return this;
    }

    /**
     * <p>
     * The writeable attributes of the user pool.
     * </p>
     * 
     * @return The writeable attributes of the user pool.
     */

    public java.util.List<String> getWriteAttributes() {
        return writeAttributes;
    }

    /**
     * <p>
     * The writeable attributes of the user pool.
     * </p>
     * 
     * @param writeAttributes
     *        The writeable attributes of the user pool.
     */

    public void setWriteAttributes(java.util.Collection<String> writeAttributes) {
        if (writeAttributes == null) {
            this.writeAttributes = null;
            return;
        }

        this.writeAttributes = new java.util.ArrayList<String>(writeAttributes);
    }

    /**
     * <p>
     * The writeable attributes of the user pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWriteAttributes(java.util.Collection)} or {@link #withWriteAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param writeAttributes
     *        The writeable attributes of the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolClientRequest withWriteAttributes(String... writeAttributes) {
        if (this.writeAttributes == null) {
            setWriteAttributes(new java.util.ArrayList<String>(writeAttributes.length));
        }
        for (String ele : writeAttributes) {
            this.writeAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The writeable attributes of the user pool.
     * </p>
     * 
     * @param writeAttributes
     *        The writeable attributes of the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserPoolClientRequest withWriteAttributes(java.util.Collection<String> writeAttributes) {
        setWriteAttributes(writeAttributes);
        return this;
    }

    /**
     * <p>
     * Explicit authentication flows.
     * </p>
     * 
     * @return Explicit authentication flows.
     * @see ExplicitAuthFlowsType
     */

    public java.util.List<String> getExplicitAuthFlows() {
        return explicitAuthFlows;
    }

    /**
     * <p>
     * Explicit authentication flows.
     * </p>
     * 
     * @param explicitAuthFlows
     *        Explicit authentication flows.
     * @see ExplicitAuthFlowsType
     */

    public void setExplicitAuthFlows(java.util.Collection<String> explicitAuthFlows) {
        if (explicitAuthFlows == null) {
            this.explicitAuthFlows = null;
            return;
        }

        this.explicitAuthFlows = new java.util.ArrayList<String>(explicitAuthFlows);
    }

    /**
     * <p>
     * Explicit authentication flows.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExplicitAuthFlows(java.util.Collection)} or {@link #withExplicitAuthFlows(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param explicitAuthFlows
     *        Explicit authentication flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExplicitAuthFlowsType
     */

    public UpdateUserPoolClientRequest withExplicitAuthFlows(String... explicitAuthFlows) {
        if (this.explicitAuthFlows == null) {
            setExplicitAuthFlows(new java.util.ArrayList<String>(explicitAuthFlows.length));
        }
        for (String ele : explicitAuthFlows) {
            this.explicitAuthFlows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Explicit authentication flows.
     * </p>
     * 
     * @param explicitAuthFlows
     *        Explicit authentication flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExplicitAuthFlowsType
     */

    public UpdateUserPoolClientRequest withExplicitAuthFlows(java.util.Collection<String> explicitAuthFlows) {
        setExplicitAuthFlows(explicitAuthFlows);
        return this;
    }

    /**
     * <p>
     * Explicit authentication flows.
     * </p>
     * 
     * @param explicitAuthFlows
     *        Explicit authentication flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExplicitAuthFlowsType
     */

    public UpdateUserPoolClientRequest withExplicitAuthFlows(ExplicitAuthFlowsType... explicitAuthFlows) {
        java.util.ArrayList<String> explicitAuthFlowsCopy = new java.util.ArrayList<String>(explicitAuthFlows.length);
        for (ExplicitAuthFlowsType value : explicitAuthFlows) {
            explicitAuthFlowsCopy.add(value.toString());
        }
        if (getExplicitAuthFlows() == null) {
            setExplicitAuthFlows(explicitAuthFlowsCopy);
        } else {
            getExplicitAuthFlows().addAll(explicitAuthFlowsCopy);
        }
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getClientName() != null)
            sb.append("ClientName: " + getClientName() + ",");
        if (getRefreshTokenValidity() != null)
            sb.append("RefreshTokenValidity: " + getRefreshTokenValidity() + ",");
        if (getReadAttributes() != null)
            sb.append("ReadAttributes: " + getReadAttributes() + ",");
        if (getWriteAttributes() != null)
            sb.append("WriteAttributes: " + getWriteAttributes() + ",");
        if (getExplicitAuthFlows() != null)
            sb.append("ExplicitAuthFlows: " + getExplicitAuthFlows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserPoolClientRequest == false)
            return false;
        UpdateUserPoolClientRequest other = (UpdateUserPoolClientRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientName() == null ^ this.getClientName() == null)
            return false;
        if (other.getClientName() != null && other.getClientName().equals(this.getClientName()) == false)
            return false;
        if (other.getRefreshTokenValidity() == null ^ this.getRefreshTokenValidity() == null)
            return false;
        if (other.getRefreshTokenValidity() != null && other.getRefreshTokenValidity().equals(this.getRefreshTokenValidity()) == false)
            return false;
        if (other.getReadAttributes() == null ^ this.getReadAttributes() == null)
            return false;
        if (other.getReadAttributes() != null && other.getReadAttributes().equals(this.getReadAttributes()) == false)
            return false;
        if (other.getWriteAttributes() == null ^ this.getWriteAttributes() == null)
            return false;
        if (other.getWriteAttributes() != null && other.getWriteAttributes().equals(this.getWriteAttributes()) == false)
            return false;
        if (other.getExplicitAuthFlows() == null ^ this.getExplicitAuthFlows() == null)
            return false;
        if (other.getExplicitAuthFlows() != null && other.getExplicitAuthFlows().equals(this.getExplicitAuthFlows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getClientName() == null) ? 0 : getClientName().hashCode());
        hashCode = prime * hashCode + ((getRefreshTokenValidity() == null) ? 0 : getRefreshTokenValidity().hashCode());
        hashCode = prime * hashCode + ((getReadAttributes() == null) ? 0 : getReadAttributes().hashCode());
        hashCode = prime * hashCode + ((getWriteAttributes() == null) ? 0 : getWriteAttributes().hashCode());
        hashCode = prime * hashCode + ((getExplicitAuthFlows() == null) ? 0 : getExplicitAuthFlows().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserPoolClientRequest clone() {
        return (UpdateUserPoolClientRequest) super.clone();
    }
}
