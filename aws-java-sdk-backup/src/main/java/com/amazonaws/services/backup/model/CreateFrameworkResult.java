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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateFramework" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFrameworkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter, and
     * consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     */
    private String frameworkName;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     */
    private String frameworkArn;

    /**
     * <p>
     * The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter, and
     * consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @param frameworkName
     *        The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter,
     *        and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     */

    public void setFrameworkName(String frameworkName) {
        this.frameworkName = frameworkName;
    }

    /**
     * <p>
     * The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter, and
     * consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @return The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter,
     *         and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     */

    public String getFrameworkName() {
        return this.frameworkName;
    }

    /**
     * <p>
     * The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter, and
     * consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * </p>
     * 
     * @param frameworkName
     *        The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter,
     *        and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFrameworkResult withFrameworkName(String frameworkName) {
        setFrameworkName(frameworkName);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @param frameworkArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *        resource type.
     */

    public void setFrameworkArn(String frameworkArn) {
        this.frameworkArn = frameworkArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *         resource type.
     */

    public String getFrameworkArn() {
        return this.frameworkArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @param frameworkArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *        resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFrameworkResult withFrameworkArn(String frameworkArn) {
        setFrameworkArn(frameworkArn);
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
        if (getFrameworkName() != null)
            sb.append("FrameworkName: ").append(getFrameworkName()).append(",");
        if (getFrameworkArn() != null)
            sb.append("FrameworkArn: ").append(getFrameworkArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFrameworkResult == false)
            return false;
        CreateFrameworkResult other = (CreateFrameworkResult) obj;
        if (other.getFrameworkName() == null ^ this.getFrameworkName() == null)
            return false;
        if (other.getFrameworkName() != null && other.getFrameworkName().equals(this.getFrameworkName()) == false)
            return false;
        if (other.getFrameworkArn() == null ^ this.getFrameworkArn() == null)
            return false;
        if (other.getFrameworkArn() != null && other.getFrameworkArn().equals(this.getFrameworkArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrameworkName() == null) ? 0 : getFrameworkName().hashCode());
        hashCode = prime * hashCode + ((getFrameworkArn() == null) ? 0 : getFrameworkArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateFrameworkResult clone() {
        try {
            return (CreateFrameworkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
