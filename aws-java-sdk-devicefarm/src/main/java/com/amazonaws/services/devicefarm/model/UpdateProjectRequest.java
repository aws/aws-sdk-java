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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to the update project operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project whose name you wish to update.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A string representing the new name of the project that you are updating.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The number of minutes a test run in the project will execute before it times out.
     * </p>
     */
    private Integer defaultJobTimeoutMinutes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project whose name you wish to update.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the project whose name you wish to update.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project whose name you wish to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project whose name you wish to update.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project whose name you wish to update.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the project whose name you wish to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A string representing the new name of the project that you are updating.
     * </p>
     * 
     * @param name
     *        A string representing the new name of the project that you are updating.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A string representing the new name of the project that you are updating.
     * </p>
     * 
     * @return A string representing the new name of the project that you are updating.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A string representing the new name of the project that you are updating.
     * </p>
     * 
     * @param name
     *        A string representing the new name of the project that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The number of minutes a test run in the project will execute before it times out.
     * </p>
     * 
     * @param defaultJobTimeoutMinutes
     *        The number of minutes a test run in the project will execute before it times out.
     */

    public void setDefaultJobTimeoutMinutes(Integer defaultJobTimeoutMinutes) {
        this.defaultJobTimeoutMinutes = defaultJobTimeoutMinutes;
    }

    /**
     * <p>
     * The number of minutes a test run in the project will execute before it times out.
     * </p>
     * 
     * @return The number of minutes a test run in the project will execute before it times out.
     */

    public Integer getDefaultJobTimeoutMinutes() {
        return this.defaultJobTimeoutMinutes;
    }

    /**
     * <p>
     * The number of minutes a test run in the project will execute before it times out.
     * </p>
     * 
     * @param defaultJobTimeoutMinutes
     *        The number of minutes a test run in the project will execute before it times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withDefaultJobTimeoutMinutes(Integer defaultJobTimeoutMinutes) {
        setDefaultJobTimeoutMinutes(defaultJobTimeoutMinutes);
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
            sb.append("Name: ").append(getName()).append(",");
        if (getDefaultJobTimeoutMinutes() != null)
            sb.append("DefaultJobTimeoutMinutes: ").append(getDefaultJobTimeoutMinutes());
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
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefaultJobTimeoutMinutes() == null ^ this.getDefaultJobTimeoutMinutes() == null)
            return false;
        if (other.getDefaultJobTimeoutMinutes() != null && other.getDefaultJobTimeoutMinutes().equals(this.getDefaultJobTimeoutMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefaultJobTimeoutMinutes() == null) ? 0 : getDefaultJobTimeoutMinutes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProjectRequest clone() {
        return (UpdateProjectRequest) super.clone();
    }

}
