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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFunction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFunctionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the function whose code you are getting.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The function’s stage, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     */
    private String stage;

    /**
     * <p>
     * The name of the function whose code you are getting.
     * </p>
     * 
     * @param name
     *        The name of the function whose code you are getting.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the function whose code you are getting.
     * </p>
     * 
     * @return The name of the function whose code you are getting.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the function whose code you are getting.
     * </p>
     * 
     * @param name
     *        The name of the function whose code you are getting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The function’s stage, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * 
     * @param stage
     *        The function’s stage, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * @see FunctionStage
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The function’s stage, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * 
     * @return The function’s stage, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * @see FunctionStage
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * The function’s stage, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * 
     * @param stage
     *        The function’s stage, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionStage
     */

    public GetFunctionRequest withStage(String stage) {
        setStage(stage);
        return this;
    }

    /**
     * <p>
     * The function’s stage, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * 
     * @param stage
     *        The function’s stage, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionStage
     */

    public GetFunctionRequest withStage(FunctionStage stage) {
        this.stage = stage.toString();
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
        if (getStage() != null)
            sb.append("Stage: ").append(getStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFunctionRequest == false)
            return false;
        GetFunctionRequest other = (GetFunctionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        return hashCode;
    }

    @Override
    public GetFunctionRequest clone() {
        return (GetFunctionRequest) super.clone();
    }

}
