/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateLifecyclePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLifecyclePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The client token that uniquely identifies the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle policy that the request created.
     * </p>
     */
    private String lifecyclePolicyArn;

    /**
     * <p>
     * The client token that uniquely identifies the request.
     * </p>
     * 
     * @param clientToken
     *        The client token that uniquely identifies the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token that uniquely identifies the request.
     * </p>
     * 
     * @return The client token that uniquely identifies the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token that uniquely identifies the request.
     * </p>
     * 
     * @param clientToken
     *        The client token that uniquely identifies the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyResult withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle policy that the request created.
     * </p>
     * 
     * @param lifecyclePolicyArn
     *        The Amazon Resource Name (ARN) of the lifecycle policy that the request created.
     */

    public void setLifecyclePolicyArn(String lifecyclePolicyArn) {
        this.lifecyclePolicyArn = lifecyclePolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle policy that the request created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the lifecycle policy that the request created.
     */

    public String getLifecyclePolicyArn() {
        return this.lifecyclePolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle policy that the request created.
     * </p>
     * 
     * @param lifecyclePolicyArn
     *        The Amazon Resource Name (ARN) of the lifecycle policy that the request created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyResult withLifecyclePolicyArn(String lifecyclePolicyArn) {
        setLifecyclePolicyArn(lifecyclePolicyArn);
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
        if (getLifecyclePolicyArn() != null)
            sb.append("LifecyclePolicyArn: ").append(getLifecyclePolicyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLifecyclePolicyResult == false)
            return false;
        CreateLifecyclePolicyResult other = (CreateLifecyclePolicyResult) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getLifecyclePolicyArn() == null ^ this.getLifecyclePolicyArn() == null)
            return false;
        if (other.getLifecyclePolicyArn() != null && other.getLifecyclePolicyArn().equals(this.getLifecyclePolicyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getLifecyclePolicyArn() == null) ? 0 : getLifecyclePolicyArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateLifecyclePolicyResult clone() {
        try {
            return (CreateLifecyclePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
