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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/UpdateConfiguredAudienceModel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfiguredAudienceModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that was updated.
     * </p>
     */
    private String configuredAudienceModelArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that was updated.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model that was updated.
     */

    public void setConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        this.configuredAudienceModelArn = configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that was updated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the configured audience model that was updated.
     */

    public String getConfiguredAudienceModelArn() {
        return this.configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that was updated.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredAudienceModelResult withConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        setConfiguredAudienceModelArn(configuredAudienceModelArn);
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
        if (getConfiguredAudienceModelArn() != null)
            sb.append("ConfiguredAudienceModelArn: ").append(getConfiguredAudienceModelArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfiguredAudienceModelResult == false)
            return false;
        UpdateConfiguredAudienceModelResult other = (UpdateConfiguredAudienceModelResult) obj;
        if (other.getConfiguredAudienceModelArn() == null ^ this.getConfiguredAudienceModelArn() == null)
            return false;
        if (other.getConfiguredAudienceModelArn() != null && other.getConfiguredAudienceModelArn().equals(this.getConfiguredAudienceModelArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguredAudienceModelArn() == null) ? 0 : getConfiguredAudienceModelArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConfiguredAudienceModelResult clone() {
        try {
            return (UpdateConfiguredAudienceModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
