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

/**
 * <p>
 * Contains metadata about a CloudFront function.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/FunctionMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionMetadata implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function. The ARN uniquely identifies the function.
     * </p>
     */
    private String functionARN;
    /**
     * <p>
     * The stage that the function is in, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * <p>
     * When a function is in the <code>DEVELOPMENT</code> stage, you can test the function with
     * <code>TestFunction</code>, and update it with <code>UpdateFunction</code>.
     * </p>
     * <p>
     * When a function is in the <code>LIVE</code> stage, you can attach the function to a distribution’s cache
     * behavior, using the function’s ARN.
     * </p>
     */
    private String stage;
    /**
     * <p>
     * The date and time when the function was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The date and time when the function was most recently updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function. The ARN uniquely identifies the function.
     * </p>
     * 
     * @param functionARN
     *        The Amazon Resource Name (ARN) of the function. The ARN uniquely identifies the function.
     */

    public void setFunctionARN(String functionARN) {
        this.functionARN = functionARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function. The ARN uniquely identifies the function.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the function. The ARN uniquely identifies the function.
     */

    public String getFunctionARN() {
        return this.functionARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function. The ARN uniquely identifies the function.
     * </p>
     * 
     * @param functionARN
     *        The Amazon Resource Name (ARN) of the function. The ARN uniquely identifies the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionMetadata withFunctionARN(String functionARN) {
        setFunctionARN(functionARN);
        return this;
    }

    /**
     * <p>
     * The stage that the function is in, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * <p>
     * When a function is in the <code>DEVELOPMENT</code> stage, you can test the function with
     * <code>TestFunction</code>, and update it with <code>UpdateFunction</code>.
     * </p>
     * <p>
     * When a function is in the <code>LIVE</code> stage, you can attach the function to a distribution’s cache
     * behavior, using the function’s ARN.
     * </p>
     * 
     * @param stage
     *        The stage that the function is in, either <code>DEVELOPMENT</code> or <code>LIVE</code>.</p>
     *        <p>
     *        When a function is in the <code>DEVELOPMENT</code> stage, you can test the function with
     *        <code>TestFunction</code>, and update it with <code>UpdateFunction</code>.
     *        </p>
     *        <p>
     *        When a function is in the <code>LIVE</code> stage, you can attach the function to a distribution’s cache
     *        behavior, using the function’s ARN.
     * @see FunctionStage
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The stage that the function is in, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * <p>
     * When a function is in the <code>DEVELOPMENT</code> stage, you can test the function with
     * <code>TestFunction</code>, and update it with <code>UpdateFunction</code>.
     * </p>
     * <p>
     * When a function is in the <code>LIVE</code> stage, you can attach the function to a distribution’s cache
     * behavior, using the function’s ARN.
     * </p>
     * 
     * @return The stage that the function is in, either <code>DEVELOPMENT</code> or <code>LIVE</code>.</p>
     *         <p>
     *         When a function is in the <code>DEVELOPMENT</code> stage, you can test the function with
     *         <code>TestFunction</code>, and update it with <code>UpdateFunction</code>.
     *         </p>
     *         <p>
     *         When a function is in the <code>LIVE</code> stage, you can attach the function to a distribution’s cache
     *         behavior, using the function’s ARN.
     * @see FunctionStage
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * The stage that the function is in, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * <p>
     * When a function is in the <code>DEVELOPMENT</code> stage, you can test the function with
     * <code>TestFunction</code>, and update it with <code>UpdateFunction</code>.
     * </p>
     * <p>
     * When a function is in the <code>LIVE</code> stage, you can attach the function to a distribution’s cache
     * behavior, using the function’s ARN.
     * </p>
     * 
     * @param stage
     *        The stage that the function is in, either <code>DEVELOPMENT</code> or <code>LIVE</code>.</p>
     *        <p>
     *        When a function is in the <code>DEVELOPMENT</code> stage, you can test the function with
     *        <code>TestFunction</code>, and update it with <code>UpdateFunction</code>.
     *        </p>
     *        <p>
     *        When a function is in the <code>LIVE</code> stage, you can attach the function to a distribution’s cache
     *        behavior, using the function’s ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionStage
     */

    public FunctionMetadata withStage(String stage) {
        setStage(stage);
        return this;
    }

    /**
     * <p>
     * The stage that the function is in, either <code>DEVELOPMENT</code> or <code>LIVE</code>.
     * </p>
     * <p>
     * When a function is in the <code>DEVELOPMENT</code> stage, you can test the function with
     * <code>TestFunction</code>, and update it with <code>UpdateFunction</code>.
     * </p>
     * <p>
     * When a function is in the <code>LIVE</code> stage, you can attach the function to a distribution’s cache
     * behavior, using the function’s ARN.
     * </p>
     * 
     * @param stage
     *        The stage that the function is in, either <code>DEVELOPMENT</code> or <code>LIVE</code>.</p>
     *        <p>
     *        When a function is in the <code>DEVELOPMENT</code> stage, you can test the function with
     *        <code>TestFunction</code>, and update it with <code>UpdateFunction</code>.
     *        </p>
     *        <p>
     *        When a function is in the <code>LIVE</code> stage, you can attach the function to a distribution’s cache
     *        behavior, using the function’s ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionStage
     */

    public FunctionMetadata withStage(FunctionStage stage) {
        this.stage = stage.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the function was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time when the function was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time when the function was created.
     * </p>
     * 
     * @return The date and time when the function was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time when the function was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time when the function was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionMetadata withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the function was most recently updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time when the function was most recently updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time when the function was most recently updated.
     * </p>
     * 
     * @return The date and time when the function was most recently updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time when the function was most recently updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time when the function was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionMetadata withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getFunctionARN() != null)
            sb.append("FunctionARN: ").append(getFunctionARN()).append(",");
        if (getStage() != null)
            sb.append("Stage: ").append(getStage()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FunctionMetadata == false)
            return false;
        FunctionMetadata other = (FunctionMetadata) obj;
        if (other.getFunctionARN() == null ^ this.getFunctionARN() == null)
            return false;
        if (other.getFunctionARN() != null && other.getFunctionARN().equals(this.getFunctionARN()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionARN() == null) ? 0 : getFunctionARN().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public FunctionMetadata clone() {
        try {
            return (FunctionMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
