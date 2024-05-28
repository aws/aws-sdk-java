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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateAppBlockBuilder" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAppBlockBuilderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private AppBlockBuilder appBlockBuilder;

    /**
     * @param appBlockBuilder
     */

    public void setAppBlockBuilder(AppBlockBuilder appBlockBuilder) {
        this.appBlockBuilder = appBlockBuilder;
    }

    /**
     * @return
     */

    public AppBlockBuilder getAppBlockBuilder() {
        return this.appBlockBuilder;
    }

    /**
     * @param appBlockBuilder
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppBlockBuilderResult withAppBlockBuilder(AppBlockBuilder appBlockBuilder) {
        setAppBlockBuilder(appBlockBuilder);
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
        if (getAppBlockBuilder() != null)
            sb.append("AppBlockBuilder: ").append(getAppBlockBuilder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAppBlockBuilderResult == false)
            return false;
        CreateAppBlockBuilderResult other = (CreateAppBlockBuilderResult) obj;
        if (other.getAppBlockBuilder() == null ^ this.getAppBlockBuilder() == null)
            return false;
        if (other.getAppBlockBuilder() != null && other.getAppBlockBuilder().equals(this.getAppBlockBuilder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppBlockBuilder() == null) ? 0 : getAppBlockBuilder().hashCode());
        return hashCode;
    }

    @Override
    public CreateAppBlockBuilderResult clone() {
        try {
            return (CreateAppBlockBuilderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
