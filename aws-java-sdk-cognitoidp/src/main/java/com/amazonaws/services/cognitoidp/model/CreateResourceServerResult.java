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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateResourceServer" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResourceServerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The newly created resource server.
     * </p>
     */
    private ResourceServerType resourceServer;

    /**
     * <p>
     * The newly created resource server.
     * </p>
     * 
     * @param resourceServer
     *        The newly created resource server.
     */

    public void setResourceServer(ResourceServerType resourceServer) {
        this.resourceServer = resourceServer;
    }

    /**
     * <p>
     * The newly created resource server.
     * </p>
     * 
     * @return The newly created resource server.
     */

    public ResourceServerType getResourceServer() {
        return this.resourceServer;
    }

    /**
     * <p>
     * The newly created resource server.
     * </p>
     * 
     * @param resourceServer
     *        The newly created resource server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceServerResult withResourceServer(ResourceServerType resourceServer) {
        setResourceServer(resourceServer);
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
        if (getResourceServer() != null)
            sb.append("ResourceServer: ").append(getResourceServer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourceServerResult == false)
            return false;
        CreateResourceServerResult other = (CreateResourceServerResult) obj;
        if (other.getResourceServer() == null ^ this.getResourceServer() == null)
            return false;
        if (other.getResourceServer() != null && other.getResourceServer().equals(this.getResourceServer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceServer() == null) ? 0 : getResourceServer().hashCode());
        return hashCode;
    }

    @Override
    public CreateResourceServerResult clone() {
        try {
            return (CreateResourceServerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
