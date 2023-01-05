/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The application definition for a particular application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/Definition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Definition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The content of the application definition. This is a JSON object that contains the resource
     * configuration/definitions that identify an application.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The S3 bucket that contains the application definition.
     * </p>
     */
    private String s3Location;

    /**
     * <p>
     * The content of the application definition. This is a JSON object that contains the resource
     * configuration/definitions that identify an application.
     * </p>
     * 
     * @param content
     *        The content of the application definition. This is a JSON object that contains the resource
     *        configuration/definitions that identify an application.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the application definition. This is a JSON object that contains the resource
     * configuration/definitions that identify an application.
     * </p>
     * 
     * @return The content of the application definition. This is a JSON object that contains the resource
     *         configuration/definitions that identify an application.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the application definition. This is a JSON object that contains the resource
     * configuration/definitions that identify an application.
     * </p>
     * 
     * @param content
     *        The content of the application definition. This is a JSON object that contains the resource
     *        configuration/definitions that identify an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Definition withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The S3 bucket that contains the application definition.
     * </p>
     * 
     * @param s3Location
     *        The S3 bucket that contains the application definition.
     */

    public void setS3Location(String s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * The S3 bucket that contains the application definition.
     * </p>
     * 
     * @return The S3 bucket that contains the application definition.
     */

    public String getS3Location() {
        return this.s3Location;
    }

    /**
     * <p>
     * The S3 bucket that contains the application definition.
     * </p>
     * 
     * @param s3Location
     *        The S3 bucket that contains the application definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Definition withS3Location(String s3Location) {
        setS3Location(s3Location);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getS3Location() != null)
            sb.append("S3Location: ").append(getS3Location());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Definition == false)
            return false;
        Definition other = (Definition) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        return hashCode;
    }

    @Override
    public Definition clone() {
        try {
            return (Definition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.DefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
