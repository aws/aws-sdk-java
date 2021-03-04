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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/CreateConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the connection to create.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description for the connection to create.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of authorization to use for the connection.
     * </p>
     */
    private String authorizationType;
    /**
     * <p>
     * A <code>CreateConnectionAuthRequestParameters</code> object that contains the authorization parameters to use to
     * authorize with the endpoint.
     * </p>
     */
    private CreateConnectionAuthRequestParameters authParameters;

    /**
     * <p>
     * The name for the connection to create.
     * </p>
     * 
     * @param name
     *        The name for the connection to create.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the connection to create.
     * </p>
     * 
     * @return The name for the connection to create.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the connection to create.
     * </p>
     * 
     * @param name
     *        The name for the connection to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description for the connection to create.
     * </p>
     * 
     * @param description
     *        A description for the connection to create.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the connection to create.
     * </p>
     * 
     * @return A description for the connection to create.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the connection to create.
     * </p>
     * 
     * @param description
     *        A description for the connection to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of authorization to use for the connection.
     * </p>
     * 
     * @param authorizationType
     *        The type of authorization to use for the connection.
     * @see ConnectionAuthorizationType
     */

    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    /**
     * <p>
     * The type of authorization to use for the connection.
     * </p>
     * 
     * @return The type of authorization to use for the connection.
     * @see ConnectionAuthorizationType
     */

    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * <p>
     * The type of authorization to use for the connection.
     * </p>
     * 
     * @param authorizationType
     *        The type of authorization to use for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionAuthorizationType
     */

    public CreateConnectionRequest withAuthorizationType(String authorizationType) {
        setAuthorizationType(authorizationType);
        return this;
    }

    /**
     * <p>
     * The type of authorization to use for the connection.
     * </p>
     * 
     * @param authorizationType
     *        The type of authorization to use for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionAuthorizationType
     */

    public CreateConnectionRequest withAuthorizationType(ConnectionAuthorizationType authorizationType) {
        this.authorizationType = authorizationType.toString();
        return this;
    }

    /**
     * <p>
     * A <code>CreateConnectionAuthRequestParameters</code> object that contains the authorization parameters to use to
     * authorize with the endpoint.
     * </p>
     * 
     * @param authParameters
     *        A <code>CreateConnectionAuthRequestParameters</code> object that contains the authorization parameters to
     *        use to authorize with the endpoint.
     */

    public void setAuthParameters(CreateConnectionAuthRequestParameters authParameters) {
        this.authParameters = authParameters;
    }

    /**
     * <p>
     * A <code>CreateConnectionAuthRequestParameters</code> object that contains the authorization parameters to use to
     * authorize with the endpoint.
     * </p>
     * 
     * @return A <code>CreateConnectionAuthRequestParameters</code> object that contains the authorization parameters to
     *         use to authorize with the endpoint.
     */

    public CreateConnectionAuthRequestParameters getAuthParameters() {
        return this.authParameters;
    }

    /**
     * <p>
     * A <code>CreateConnectionAuthRequestParameters</code> object that contains the authorization parameters to use to
     * authorize with the endpoint.
     * </p>
     * 
     * @param authParameters
     *        A <code>CreateConnectionAuthRequestParameters</code> object that contains the authorization parameters to
     *        use to authorize with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withAuthParameters(CreateConnectionAuthRequestParameters authParameters) {
        setAuthParameters(authParameters);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAuthorizationType() != null)
            sb.append("AuthorizationType: ").append(getAuthorizationType()).append(",");
        if (getAuthParameters() != null)
            sb.append("AuthParameters: ").append(getAuthParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConnectionRequest == false)
            return false;
        CreateConnectionRequest other = (CreateConnectionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAuthorizationType() == null ^ this.getAuthorizationType() == null)
            return false;
        if (other.getAuthorizationType() != null && other.getAuthorizationType().equals(this.getAuthorizationType()) == false)
            return false;
        if (other.getAuthParameters() == null ^ this.getAuthParameters() == null)
            return false;
        if (other.getAuthParameters() != null && other.getAuthParameters().equals(this.getAuthParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationType() == null) ? 0 : getAuthorizationType().hashCode());
        hashCode = prime * hashCode + ((getAuthParameters() == null) ? 0 : getAuthParameters().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectionRequest clone() {
        return (CreateConnectionRequest) super.clone();
    }

}
