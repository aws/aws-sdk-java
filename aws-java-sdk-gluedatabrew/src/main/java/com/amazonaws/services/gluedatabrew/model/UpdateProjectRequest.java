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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private Sample sample;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed for this request.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The name of the project to be updated.
     * </p>
     */
    private String name;

    /**
     * @param sample
     */

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    /**
     * @return
     */

    public Sample getSample() {
        return this.sample;
    }

    /**
     * @param sample
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withSample(Sample sample) {
        setSample(sample);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed for this request.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to be assumed for this request.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed for this request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to be assumed for this request.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be assumed for this request.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to be assumed for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The name of the project to be updated.
     * </p>
     * 
     * @param name
     *        The name of the project to be updated.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the project to be updated.
     * </p>
     * 
     * @return The name of the project to be updated.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the project to be updated.
     * </p>
     * 
     * @param name
     *        The name of the project to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withName(String name) {
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
        if (getSample() != null)
            sb.append("Sample: ").append(getSample()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof UpdateProjectRequest == false)
            return false;
        UpdateProjectRequest other = (UpdateProjectRequest) obj;
        if (other.getSample() == null ^ this.getSample() == null)
            return false;
        if (other.getSample() != null && other.getSample().equals(this.getSample()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getSample() == null) ? 0 : getSample().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProjectRequest clone() {
        return (UpdateProjectRequest) super.clone();
    }

}
