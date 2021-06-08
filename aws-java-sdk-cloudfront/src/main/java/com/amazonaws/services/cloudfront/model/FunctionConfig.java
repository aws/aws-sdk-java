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
 * Contains configuration information about a CloudFront function.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/FunctionConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionConfig implements Serializable, Cloneable {

    /**
     * <p>
     * A comment to describe the function.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The function’s runtime environment. The only valid value is <code>cloudfront-js-1.0</code>.
     * </p>
     */
    private String runtime;

    /**
     * <p>
     * A comment to describe the function.
     * </p>
     * 
     * @param comment
     *        A comment to describe the function.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A comment to describe the function.
     * </p>
     * 
     * @return A comment to describe the function.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A comment to describe the function.
     * </p>
     * 
     * @param comment
     *        A comment to describe the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfig withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The function’s runtime environment. The only valid value is <code>cloudfront-js-1.0</code>.
     * </p>
     * 
     * @param runtime
     *        The function’s runtime environment. The only valid value is <code>cloudfront-js-1.0</code>.
     * @see FunctionRuntime
     */

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * <p>
     * The function’s runtime environment. The only valid value is <code>cloudfront-js-1.0</code>.
     * </p>
     * 
     * @return The function’s runtime environment. The only valid value is <code>cloudfront-js-1.0</code>.
     * @see FunctionRuntime
     */

    public String getRuntime() {
        return this.runtime;
    }

    /**
     * <p>
     * The function’s runtime environment. The only valid value is <code>cloudfront-js-1.0</code>.
     * </p>
     * 
     * @param runtime
     *        The function’s runtime environment. The only valid value is <code>cloudfront-js-1.0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionRuntime
     */

    public FunctionConfig withRuntime(String runtime) {
        setRuntime(runtime);
        return this;
    }

    /**
     * <p>
     * The function’s runtime environment. The only valid value is <code>cloudfront-js-1.0</code>.
     * </p>
     * 
     * @param runtime
     *        The function’s runtime environment. The only valid value is <code>cloudfront-js-1.0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionRuntime
     */

    public FunctionConfig withRuntime(FunctionRuntime runtime) {
        this.runtime = runtime.toString();
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
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getRuntime() != null)
            sb.append("Runtime: ").append(getRuntime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FunctionConfig == false)
            return false;
        FunctionConfig other = (FunctionConfig) obj;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getRuntime() == null ^ this.getRuntime() == null)
            return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode());
        return hashCode;
    }

    @Override
    public FunctionConfig clone() {
        try {
            return (FunctionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
