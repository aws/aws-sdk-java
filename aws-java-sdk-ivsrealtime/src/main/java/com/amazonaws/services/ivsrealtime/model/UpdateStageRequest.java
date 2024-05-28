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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/UpdateStage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN of the stage to be updated.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Name of the stage to be updated.
     * </p>
     */
    private String name;

    /**
     * <p>
     * ARN of the stage to be updated.
     * </p>
     * 
     * @param arn
     *        ARN of the stage to be updated.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * ARN of the stage to be updated.
     * </p>
     * 
     * @return ARN of the stage to be updated.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * ARN of the stage to be updated.
     * </p>
     * 
     * @param arn
     *        ARN of the stage to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStageRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Name of the stage to be updated.
     * </p>
     * 
     * @param name
     *        Name of the stage to be updated.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the stage to be updated.
     * </p>
     * 
     * @return Name of the stage to be updated.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the stage to be updated.
     * </p>
     * 
     * @param name
     *        Name of the stage to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStageRequest withName(String name) {
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

        if (obj instanceof UpdateStageRequest == false)
            return false;
        UpdateStageRequest other = (UpdateStageRequest) obj;
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
    public UpdateStageRequest clone() {
        return (UpdateStageRequest) super.clone();
    }

}
