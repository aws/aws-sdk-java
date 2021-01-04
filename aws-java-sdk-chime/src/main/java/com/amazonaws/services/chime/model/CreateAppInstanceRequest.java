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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAppInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAppInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the app instance.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The metadata of the app instance. Limited to a 1KB string in UTF-8.
     * </p>
     */
    private String metadata;
    /**
     * <p>
     * The <code>ClientRequestToken</code> of the app instance.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name of the app instance.
     * </p>
     * 
     * @param name
     *        The name of the app instance.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the app instance.
     * </p>
     * 
     * @return The name of the app instance.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the app instance.
     * </p>
     * 
     * @param name
     *        The name of the app instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppInstanceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The metadata of the app instance. Limited to a 1KB string in UTF-8.
     * </p>
     * 
     * @param metadata
     *        The metadata of the app instance. Limited to a 1KB string in UTF-8.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata of the app instance. Limited to a 1KB string in UTF-8.
     * </p>
     * 
     * @return The metadata of the app instance. Limited to a 1KB string in UTF-8.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The metadata of the app instance. Limited to a 1KB string in UTF-8.
     * </p>
     * 
     * @param metadata
     *        The metadata of the app instance. Limited to a 1KB string in UTF-8.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppInstanceRequest withMetadata(String metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The <code>ClientRequestToken</code> of the app instance.
     * </p>
     * 
     * @param clientRequestToken
     *        The <code>ClientRequestToken</code> of the app instance.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The <code>ClientRequestToken</code> of the app instance.
     * </p>
     * 
     * @return The <code>ClientRequestToken</code> of the app instance.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The <code>ClientRequestToken</code> of the app instance.
     * </p>
     * 
     * @param clientRequestToken
     *        The <code>ClientRequestToken</code> of the app instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppInstanceRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAppInstanceRequest == false)
            return false;
        CreateAppInstanceRequest other = (CreateAppInstanceRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateAppInstanceRequest clone() {
        return (CreateAppInstanceRequest) super.clone();
    }

}
