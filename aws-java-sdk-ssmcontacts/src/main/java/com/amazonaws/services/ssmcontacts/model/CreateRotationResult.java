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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/CreateRotation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRotationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the created rotation.
     * </p>
     */
    private String rotationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the created rotation.
     * </p>
     * 
     * @param rotationArn
     *        The Amazon Resource Name (ARN) of the created rotation.
     */

    public void setRotationArn(String rotationArn) {
        this.rotationArn = rotationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the created rotation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the created rotation.
     */

    public String getRotationArn() {
        return this.rotationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the created rotation.
     * </p>
     * 
     * @param rotationArn
     *        The Amazon Resource Name (ARN) of the created rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRotationResult withRotationArn(String rotationArn) {
        setRotationArn(rotationArn);
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
        if (getRotationArn() != null)
            sb.append("RotationArn: ").append(getRotationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRotationResult == false)
            return false;
        CreateRotationResult other = (CreateRotationResult) obj;
        if (other.getRotationArn() == null ^ this.getRotationArn() == null)
            return false;
        if (other.getRotationArn() != null && other.getRotationArn().equals(this.getRotationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRotationArn() == null) ? 0 : getRotationArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateRotationResult clone() {
        try {
            return (CreateRotationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
