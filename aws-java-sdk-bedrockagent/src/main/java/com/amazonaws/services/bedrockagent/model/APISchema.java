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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the OpenAPI schema for the action group. For more information, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI schemas</a>.
 * You can either include the schema directly in the <code>payload</code> field or you can upload it to an S3 bucket and
 * specify the S3 bucket location in the <code>s3</code> field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/APISchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class APISchema implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The JSON or YAML-formatted payload defining the OpenAPI schema for the action group. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     * schemas</a>.
     * </p>
     */
    private String payload;
    /**
     * <p>
     * Contains details about the S3 object containing the OpenAPI schema for the action group. For more information,
     * see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     * schemas</a>.
     * </p>
     */
    private S3Identifier s3;

    /**
     * <p>
     * The JSON or YAML-formatted payload defining the OpenAPI schema for the action group. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     * schemas</a>.
     * </p>
     * 
     * @param payload
     *        The JSON or YAML-formatted payload defining the OpenAPI schema for the action group. For more information,
     *        see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group
     *        OpenAPI schemas</a>.
     */

    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The JSON or YAML-formatted payload defining the OpenAPI schema for the action group. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     * schemas</a>.
     * </p>
     * 
     * @return The JSON or YAML-formatted payload defining the OpenAPI schema for the action group. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     *         schemas</a>.
     */

    public String getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * The JSON or YAML-formatted payload defining the OpenAPI schema for the action group. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     * schemas</a>.
     * </p>
     * 
     * @param payload
     *        The JSON or YAML-formatted payload defining the OpenAPI schema for the action group. For more information,
     *        see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group
     *        OpenAPI schemas</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APISchema withPayload(String payload) {
        setPayload(payload);
        return this;
    }

    /**
     * <p>
     * Contains details about the S3 object containing the OpenAPI schema for the action group. For more information,
     * see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     * schemas</a>.
     * </p>
     * 
     * @param s3
     *        Contains details about the S3 object containing the OpenAPI schema for the action group. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     *        schemas</a>.
     */

    public void setS3(S3Identifier s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * Contains details about the S3 object containing the OpenAPI schema for the action group. For more information,
     * see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     * schemas</a>.
     * </p>
     * 
     * @return Contains details about the S3 object containing the OpenAPI schema for the action group. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     *         schemas</a>.
     */

    public S3Identifier getS3() {
        return this.s3;
    }

    /**
     * <p>
     * Contains details about the S3 object containing the OpenAPI schema for the action group. For more information,
     * see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     * schemas</a>.
     * </p>
     * 
     * @param s3
     *        Contains details about the S3 object containing the OpenAPI schema for the action group. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/agents-api-schema.html">Action group OpenAPI
     *        schemas</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APISchema withS3(S3Identifier s3) {
        setS3(s3);
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
        if (getPayload() != null)
            sb.append("Payload: ").append("***Sensitive Data Redacted***").append(",");
        if (getS3() != null)
            sb.append("S3: ").append(getS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof APISchema == false)
            return false;
        APISchema other = (APISchema) obj;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        return hashCode;
    }

    @Override
    public APISchema clone() {
        try {
            return (APISchema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.APISchemaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
