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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Placeholder documentation for UpdateCloudWatchAlarmTemplateGroupRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateCloudWatchAlarmTemplateGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCloudWatchAlarmTemplateGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A resource's optional description. */
    private String description;
    /** A cloudwatch alarm template group's identifier. Can be either be its id or current name. */
    private String identifier;

    /**
     * A resource's optional description.
     * 
     * @param description
     *        A resource's optional description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A resource's optional description.
     * 
     * @return A resource's optional description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A resource's optional description.
     * 
     * @param description
     *        A resource's optional description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCloudWatchAlarmTemplateGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * A cloudwatch alarm template group's identifier. Can be either be its id or current name.
     * 
     * @param identifier
     *        A cloudwatch alarm template group's identifier. Can be either be its id or current name.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * A cloudwatch alarm template group's identifier. Can be either be its id or current name.
     * 
     * @return A cloudwatch alarm template group's identifier. Can be either be its id or current name.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * A cloudwatch alarm template group's identifier. Can be either be its id or current name.
     * 
     * @param identifier
     *        A cloudwatch alarm template group's identifier. Can be either be its id or current name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCloudWatchAlarmTemplateGroupRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCloudWatchAlarmTemplateGroupRequest == false)
            return false;
        UpdateCloudWatchAlarmTemplateGroupRequest other = (UpdateCloudWatchAlarmTemplateGroupRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCloudWatchAlarmTemplateGroupRequest clone() {
        return (UpdateCloudWatchAlarmTemplateGroupRequest) super.clone();
    }

}
