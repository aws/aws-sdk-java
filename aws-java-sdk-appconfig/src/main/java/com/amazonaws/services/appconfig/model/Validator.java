/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A validator provides a syntactic or semantic check to ensure the configuration you want to deploy functions as
 * intended. To validate your application configuration data, you provide a schema or a Lambda function that runs
 * against the configuration. The configuration deployment or update can only proceed when the configuration data is
 * valid.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/Validator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Validator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * AppConfig supports validators of type <code>JSON_SCHEMA</code> and <code>LAMBDA</code>
     * </p>
     */
    private String type;
    /**
     * <p>
     * Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
     * </p>
     */
    private String content;

    /**
     * <p>
     * AppConfig supports validators of type <code>JSON_SCHEMA</code> and <code>LAMBDA</code>
     * </p>
     * 
     * @param type
     *        AppConfig supports validators of type <code>JSON_SCHEMA</code> and <code>LAMBDA</code>
     * @see ValidatorType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * AppConfig supports validators of type <code>JSON_SCHEMA</code> and <code>LAMBDA</code>
     * </p>
     * 
     * @return AppConfig supports validators of type <code>JSON_SCHEMA</code> and <code>LAMBDA</code>
     * @see ValidatorType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * AppConfig supports validators of type <code>JSON_SCHEMA</code> and <code>LAMBDA</code>
     * </p>
     * 
     * @param type
     *        AppConfig supports validators of type <code>JSON_SCHEMA</code> and <code>LAMBDA</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidatorType
     */

    public Validator withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * AppConfig supports validators of type <code>JSON_SCHEMA</code> and <code>LAMBDA</code>
     * </p>
     * 
     * @param type
     *        AppConfig supports validators of type <code>JSON_SCHEMA</code> and <code>LAMBDA</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidatorType
     */

    public Validator withType(ValidatorType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
     * </p>
     * 
     * @param content
     *        Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
     * </p>
     * 
     * @return Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
     * </p>
     * 
     * @param content
     *        Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Validator withContent(String content) {
        setContent(content);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Validator == false)
            return false;
        Validator other = (Validator) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public Validator clone() {
        try {
            return (Validator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appconfig.model.transform.ValidatorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
