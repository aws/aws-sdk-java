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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an IAM instance profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchTemplateIamInstanceProfileSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateIamInstanceProfileSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance profile.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the instance profile.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance profile.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the instance profile.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance profile.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the instance profile.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance profile.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateIamInstanceProfileSpecification withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the instance profile.
     * </p>
     * 
     * @param name
     *        The name of the instance profile.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the instance profile.
     * </p>
     * 
     * @return The name of the instance profile.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the instance profile.
     * </p>
     * 
     * @param name
     *        The name of the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateIamInstanceProfileSpecification withName(String name) {
        setName(name);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateIamInstanceProfileSpecification == false)
            return false;
        LaunchTemplateIamInstanceProfileSpecification other = (LaunchTemplateIamInstanceProfileSpecification) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplateIamInstanceProfileSpecification clone() {
        try {
            return (LaunchTemplateIamInstanceProfileSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
