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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/DeleteAudienceModel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAudienceModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model that you want to delete.
     * </p>
     */
    private String audienceModelArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model that you want to delete.
     * </p>
     * 
     * @param audienceModelArn
     *        The Amazon Resource Name (ARN) of the audience model that you want to delete.
     */

    public void setAudienceModelArn(String audienceModelArn) {
        this.audienceModelArn = audienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model that you want to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the audience model that you want to delete.
     */

    public String getAudienceModelArn() {
        return this.audienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model that you want to delete.
     * </p>
     * 
     * @param audienceModelArn
     *        The Amazon Resource Name (ARN) of the audience model that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAudienceModelRequest withAudienceModelArn(String audienceModelArn) {
        setAudienceModelArn(audienceModelArn);
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
        if (getAudienceModelArn() != null)
            sb.append("AudienceModelArn: ").append(getAudienceModelArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAudienceModelRequest == false)
            return false;
        DeleteAudienceModelRequest other = (DeleteAudienceModelRequest) obj;
        if (other.getAudienceModelArn() == null ^ this.getAudienceModelArn() == null)
            return false;
        if (other.getAudienceModelArn() != null && other.getAudienceModelArn().equals(this.getAudienceModelArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudienceModelArn() == null) ? 0 : getAudienceModelArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAudienceModelRequest clone() {
        return (DeleteAudienceModelRequest) super.clone();
    }

}
