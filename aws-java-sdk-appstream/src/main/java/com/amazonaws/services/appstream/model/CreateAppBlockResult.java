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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateAppBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAppBlockResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The app block.
     * </p>
     */
    private AppBlock appBlock;

    /**
     * <p>
     * The app block.
     * </p>
     * 
     * @param appBlock
     *        The app block.
     */

    public void setAppBlock(AppBlock appBlock) {
        this.appBlock = appBlock;
    }

    /**
     * <p>
     * The app block.
     * </p>
     * 
     * @return The app block.
     */

    public AppBlock getAppBlock() {
        return this.appBlock;
    }

    /**
     * <p>
     * The app block.
     * </p>
     * 
     * @param appBlock
     *        The app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppBlockResult withAppBlock(AppBlock appBlock) {
        setAppBlock(appBlock);
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
        if (getAppBlock() != null)
            sb.append("AppBlock: ").append(getAppBlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAppBlockResult == false)
            return false;
        CreateAppBlockResult other = (CreateAppBlockResult) obj;
        if (other.getAppBlock() == null ^ this.getAppBlock() == null)
            return false;
        if (other.getAppBlock() != null && other.getAppBlock().equals(this.getAppBlock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppBlock() == null) ? 0 : getAppBlock().hashCode());
        return hashCode;
    }

    @Override
    public CreateAppBlockResult clone() {
        try {
            return (CreateAppBlockResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
