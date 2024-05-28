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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Part of the provisioning properties of the environment blueprint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CloudFormationProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudFormationProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The template URL of the cloud formation provisioning properties of the environment blueprint.
     * </p>
     */
    private String templateUrl;

    /**
     * <p>
     * The template URL of the cloud formation provisioning properties of the environment blueprint.
     * </p>
     * 
     * @param templateUrl
     *        The template URL of the cloud formation provisioning properties of the environment blueprint.
     */

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    /**
     * <p>
     * The template URL of the cloud formation provisioning properties of the environment blueprint.
     * </p>
     * 
     * @return The template URL of the cloud formation provisioning properties of the environment blueprint.
     */

    public String getTemplateUrl() {
        return this.templateUrl;
    }

    /**
     * <p>
     * The template URL of the cloud formation provisioning properties of the environment blueprint.
     * </p>
     * 
     * @param templateUrl
     *        The template URL of the cloud formation provisioning properties of the environment blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFormationProperties withTemplateUrl(String templateUrl) {
        setTemplateUrl(templateUrl);
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
        if (getTemplateUrl() != null)
            sb.append("TemplateUrl: ").append(getTemplateUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudFormationProperties == false)
            return false;
        CloudFormationProperties other = (CloudFormationProperties) obj;
        if (other.getTemplateUrl() == null ^ this.getTemplateUrl() == null)
            return false;
        if (other.getTemplateUrl() != null && other.getTemplateUrl().equals(this.getTemplateUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateUrl() == null) ? 0 : getTemplateUrl().hashCode());
        return hashCode;
    }

    @Override
    public CloudFormationProperties clone() {
        try {
            return (CloudFormationProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.CloudFormationPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
