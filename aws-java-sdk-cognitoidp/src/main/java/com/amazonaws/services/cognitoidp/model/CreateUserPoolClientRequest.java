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
 * Represents the request to create a user pool client.
 * </p>
 */
public class CreateUserPoolClientRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool client.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     */
    private String clientName;
    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user pool client being created.
     * </p>
     */
    private Boolean generateSecret;
    /**
     * <p>
     * Refreshes the token validity.
     * </p>
     */
    private Integer refreshTokenValidity;
    /**
     * <p>
     * The read attributes.
     * </p>
     */
    private java.util.List<String> readAttributes;
    /**
     * <p>
     * The write attributes.
     * </p>
     */
    private java.util.List<String> writeAttributes;
    /**
     * <p>
     * The explicit authentication flows.
     * </p>
     */
    private java.util.List<String> explicitAuthFlows;

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool client.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to create a user pool client.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool client.
     * </p>
     * 
     * @return The user pool ID for the user pool where you want to create a user pool client.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool client.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to create a user pool client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * 
     * @param clientName
     *        The client name for the user pool client you would like to create.
     */

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * 
     * @return The client name for the user pool client you would like to create.
     */

    public String getClientName() {
        return this.clientName;
    }

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * 
     * @param clientName
     *        The client name for the user pool client you would like to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withClientName(String clientName) {
        setClientName(clientName);
        return this;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user pool client being created.
     * </p>
     * 
     * @param generateSecret
     *        Boolean to specify whether you want to generate a secret for the user pool client being created.
     */

    public void setGenerateSecret(Boolean generateSecret) {
        this.generateSecret = generateSecret;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user pool client being created.
     * </p>
     * 
     * @return Boolean to specify whether you want to generate a secret for the user pool client being created.
     */

    public Boolean getGenerateSecret() {
        return this.generateSecret;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user pool client being created.
     * </p>
     * 
     * @param generateSecret
     *        Boolean to specify whether you want to generate a secret for the user pool client being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withGenerateSecret(Boolean generateSecret) {
        setGenerateSecret(generateSecret);
        return this;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user pool client being created.
     * </p>
     * 
     * @return Boolean to specify whether you want to generate a secret for the user pool client being created.
     */

    public Boolean isGenerateSecret() {
        return this.generateSecret;
    }

    /**
     * <p>
     * Refreshes the token validity.
     * </p>
     * 
     * @param refreshTokenValidity
     *        Refreshes the token validity.
     */

    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    /**
     * <p>
     * Refreshes the token validity.
     * </p>
     * 
     * @return Refreshes the token validity.
     */

    public Integer getRefreshTokenValidity() {
        return this.refreshTokenValidity;
    }

    /**
     * <p>
     * Refreshes the token validity.
     * </p>
     * 
     * @param refreshTokenValidity
     *        Refreshes the token validity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withRefreshTokenValidity(Integer refreshTokenValidity) {
        setRefreshTokenValidity(refreshTokenValidity);
        return this;
    }

    /**
     * <p>
     * The read attributes.
     * </p>
     * 
     * @return The read attributes.
     */

    public java.util.List<String> getReadAttributes() {
        return readAttributes;
    }

    /**
     * <p>
     * The read attributes.
     * </p>
     * 
     * @param readAttributes
     *        The read attributes.
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
     * The read attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadAttributes(java.util.Collection)} or {@link #withReadAttributes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param readAttributes
     *        The read attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withReadAttributes(String... readAttributes) {
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
     * The read attributes.
     * </p>
     * 
     * @param readAttributes
     *        The read attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withReadAttributes(java.util.Collection<String> readAttributes) {
        setReadAttributes(readAttributes);
        return this;
    }

    /**
     * <p>
     * The write attributes.
     * </p>
     * 
     * @return The write attributes.
     */

    public java.util.List<String> getWriteAttributes() {
        return writeAttributes;
    }

    /**
     * <p>
     * The write attributes.
     * </p>
     * 
     * @param writeAttributes
     *        The write attributes.
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
     * The write attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWriteAttributes(java.util.Collection)} or {@link #withWriteAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param writeAttributes
     *        The write attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withWriteAttributes(String... writeAttributes) {
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
     * The write attributes.
     * </p>
     * 
     * @param writeAttributes
     *        The write attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withWriteAttributes(java.util.Collection<String> writeAttributes) {
        setWriteAttributes(writeAttributes);
        return this;
    }

    /**
     * <p>
     * The explicit authentication flows.
     * </p>
     * 
     * @return The explicit authentication flows.
     * @see ExplicitAuthFlowsType
     */

    public java.util.List<String> getExplicitAuthFlows() {
        return explicitAuthFlows;
    }

    /**
     * <p>
     * The explicit authentication flows.
     * </p>
     * 
     * @param explicitAuthFlows
     *        The explicit authentication flows.
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
     * The explicit authentication flows.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExplicitAuthFlows(java.util.Collection)} or {@link #withExplicitAuthFlows(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param explicitAuthFlows
     *        The explicit authentication flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExplicitAuthFlowsType
     */

    public CreateUserPoolClientRequest withExplicitAuthFlows(String... explicitAuthFlows) {
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
     * The explicit authentication flows.
     * </p>
     * 
     * @param explicitAuthFlows
     *        The explicit authentication flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExplicitAuthFlowsType
     */

    public CreateUserPoolClientRequest withExplicitAuthFlows(java.util.Collection<String> explicitAuthFlows) {
        setExplicitAuthFlows(explicitAuthFlows);
        return this;
    }

    /**
     * <p>
     * The explicit authentication flows.
     * </p>
     * 
     * @param explicitAuthFlows
     *        The explicit authentication flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExplicitAuthFlowsType
     */

    public CreateUserPoolClientRequest withExplicitAuthFlows(ExplicitAuthFlowsType... explicitAuthFlows) {
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
        if (getClientName() != null)
            sb.append("ClientName: " + getClientName() + ",");
        if (getGenerateSecret() != null)
            sb.append("GenerateSecret: " + getGenerateSecret() + ",");
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

        if (obj instanceof CreateUserPoolClientRequest == false)
            return false;
        CreateUserPoolClientRequest other = (CreateUserPoolClientRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientName() == null ^ this.getClientName() == null)
            return false;
        if (other.getClientName() != null && other.getClientName().equals(this.getClientName()) == false)
            return false;
        if (other.getGenerateSecret() == null ^ this.getGenerateSecret() == null)
            return false;
        if (other.getGenerateSecret() != null && other.getGenerateSecret().equals(this.getGenerateSecret()) == false)
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
        hashCode = prime * hashCode + ((getClientName() == null) ? 0 : getClientName().hashCode());
        hashCode = prime * hashCode + ((getGenerateSecret() == null) ? 0 : getGenerateSecret().hashCode());
        hashCode = prime * hashCode + ((getRefreshTokenValidity() == null) ? 0 : getRefreshTokenValidity().hashCode());
        hashCode = prime * hashCode + ((getReadAttributes() == null) ? 0 : getReadAttributes().hashCode());
        hashCode = prime * hashCode + ((getWriteAttributes() == null) ? 0 : getWriteAttributes().hashCode());
        hashCode = prime * hashCode + ((getExplicitAuthFlows() == null) ? 0 : getExplicitAuthFlows().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserPoolClientRequest clone() {
        return (CreateUserPoolClientRequest) super.clone();
    }
}
