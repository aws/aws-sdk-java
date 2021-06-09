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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateAccountSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Proton pipeline service role.
     * </p>
     */
    private String pipelineServiceRoleArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Proton pipeline service role.
     * </p>
     * 
     * @param pipelineServiceRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Proton pipeline service role.
     */

    public void setPipelineServiceRoleArn(String pipelineServiceRoleArn) {
        this.pipelineServiceRoleArn = pipelineServiceRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Proton pipeline service role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Proton pipeline service role.
     */

    public String getPipelineServiceRoleArn() {
        return this.pipelineServiceRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Proton pipeline service role.
     * </p>
     * 
     * @param pipelineServiceRoleArn
     *        The Amazon Resource Name (ARN) of the AWS Proton pipeline service role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountSettingsRequest withPipelineServiceRoleArn(String pipelineServiceRoleArn) {
        setPipelineServiceRoleArn(pipelineServiceRoleArn);
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
        if (getPipelineServiceRoleArn() != null)
            sb.append("PipelineServiceRoleArn: ").append(getPipelineServiceRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountSettingsRequest == false)
            return false;
        UpdateAccountSettingsRequest other = (UpdateAccountSettingsRequest) obj;
        if (other.getPipelineServiceRoleArn() == null ^ this.getPipelineServiceRoleArn() == null)
            return false;
        if (other.getPipelineServiceRoleArn() != null && other.getPipelineServiceRoleArn().equals(this.getPipelineServiceRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineServiceRoleArn() == null) ? 0 : getPipelineServiceRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountSettingsRequest clone() {
        return (UpdateAccountSettingsRequest) super.clone();
    }

}
