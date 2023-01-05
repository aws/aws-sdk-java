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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateModelManifest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelManifestResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the created vehicle model.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the created vehicle model.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The name of the created vehicle model.
     * </p>
     * 
     * @param name
     *        The name of the created vehicle model.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the created vehicle model.
     * </p>
     * 
     * @return The name of the created vehicle model.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the created vehicle model.
     * </p>
     * 
     * @param name
     *        The name of the created vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelManifestResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the created vehicle model.
     * </p>
     * 
     * @param arn
     *        The ARN of the created vehicle model.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the created vehicle model.
     * </p>
     * 
     * @return The ARN of the created vehicle model.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the created vehicle model.
     * </p>
     * 
     * @param arn
     *        The ARN of the created vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelManifestResult withArn(String arn) {
        setArn(arn);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateModelManifestResult == false)
            return false;
        CreateModelManifestResult other = (CreateModelManifestResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelManifestResult clone() {
        try {
            return (CreateModelManifestResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
