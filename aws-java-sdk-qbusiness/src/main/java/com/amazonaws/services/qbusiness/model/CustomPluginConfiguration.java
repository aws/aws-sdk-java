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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information required to create a custom plugin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CustomPluginConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomPluginConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description for your custom plugin configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of OpenAPI schema to use.
     * </p>
     */
    private String apiSchemaType;
    /**
     * <p>
     * Contains either details about the S3 object containing the OpenAPI schema for the action group or the JSON or
     * YAML-formatted payload defining the schema.
     * </p>
     */
    private APISchema apiSchema;

    /**
     * <p>
     * A description for your custom plugin configuration.
     * </p>
     * 
     * @param description
     *        A description for your custom plugin configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for your custom plugin configuration.
     * </p>
     * 
     * @return A description for your custom plugin configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for your custom plugin configuration.
     * </p>
     * 
     * @param description
     *        A description for your custom plugin configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPluginConfiguration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of OpenAPI schema to use.
     * </p>
     * 
     * @param apiSchemaType
     *        The type of OpenAPI schema to use.
     * @see APISchemaType
     */

    public void setApiSchemaType(String apiSchemaType) {
        this.apiSchemaType = apiSchemaType;
    }

    /**
     * <p>
     * The type of OpenAPI schema to use.
     * </p>
     * 
     * @return The type of OpenAPI schema to use.
     * @see APISchemaType
     */

    public String getApiSchemaType() {
        return this.apiSchemaType;
    }

    /**
     * <p>
     * The type of OpenAPI schema to use.
     * </p>
     * 
     * @param apiSchemaType
     *        The type of OpenAPI schema to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see APISchemaType
     */

    public CustomPluginConfiguration withApiSchemaType(String apiSchemaType) {
        setApiSchemaType(apiSchemaType);
        return this;
    }

    /**
     * <p>
     * The type of OpenAPI schema to use.
     * </p>
     * 
     * @param apiSchemaType
     *        The type of OpenAPI schema to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see APISchemaType
     */

    public CustomPluginConfiguration withApiSchemaType(APISchemaType apiSchemaType) {
        this.apiSchemaType = apiSchemaType.toString();
        return this;
    }

    /**
     * <p>
     * Contains either details about the S3 object containing the OpenAPI schema for the action group or the JSON or
     * YAML-formatted payload defining the schema.
     * </p>
     * 
     * @param apiSchema
     *        Contains either details about the S3 object containing the OpenAPI schema for the action group or the JSON
     *        or YAML-formatted payload defining the schema.
     */

    public void setApiSchema(APISchema apiSchema) {
        this.apiSchema = apiSchema;
    }

    /**
     * <p>
     * Contains either details about the S3 object containing the OpenAPI schema for the action group or the JSON or
     * YAML-formatted payload defining the schema.
     * </p>
     * 
     * @return Contains either details about the S3 object containing the OpenAPI schema for the action group or the
     *         JSON or YAML-formatted payload defining the schema.
     */

    public APISchema getApiSchema() {
        return this.apiSchema;
    }

    /**
     * <p>
     * Contains either details about the S3 object containing the OpenAPI schema for the action group or the JSON or
     * YAML-formatted payload defining the schema.
     * </p>
     * 
     * @param apiSchema
     *        Contains either details about the S3 object containing the OpenAPI schema for the action group or the JSON
     *        or YAML-formatted payload defining the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomPluginConfiguration withApiSchema(APISchema apiSchema) {
        setApiSchema(apiSchema);
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
        if (getApiSchemaType() != null)
            sb.append("ApiSchemaType: ").append(getApiSchemaType()).append(",");
        if (getApiSchema() != null)
            sb.append("ApiSchema: ").append(getApiSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomPluginConfiguration == false)
            return false;
        CustomPluginConfiguration other = (CustomPluginConfiguration) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getApiSchemaType() == null ^ this.getApiSchemaType() == null)
            return false;
        if (other.getApiSchemaType() != null && other.getApiSchemaType().equals(this.getApiSchemaType()) == false)
            return false;
        if (other.getApiSchema() == null ^ this.getApiSchema() == null)
            return false;
        if (other.getApiSchema() != null && other.getApiSchema().equals(this.getApiSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getApiSchemaType() == null) ? 0 : getApiSchemaType().hashCode());
        hashCode = prime * hashCode + ((getApiSchema() == null) ? 0 : getApiSchema().hashCode());
        return hashCode;
    }

    @Override
    public CustomPluginConfiguration clone() {
        try {
            return (CustomPluginConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.CustomPluginConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
