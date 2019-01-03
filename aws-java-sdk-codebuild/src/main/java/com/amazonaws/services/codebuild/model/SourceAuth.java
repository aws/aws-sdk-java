/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the authorization settings for AWS CodeBuild to access the source code to be built.
 * </p>
 * <p>
 * This information is for the AWS CodeBuild console's use only. Your code should not get or set this information
 * directly.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/SourceAuth" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceAuth implements Serializable, Cloneable, StructuredPojo {

    /**
     * <note>
     * <p>
     * This data type is deprecated and is no longer accurate or used.
     * </p>
     * </note>
     * <p>
     * The authorization type to use. The only valid value is <code>OAUTH</code>, which represents the OAuth
     * authorization type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The resource value that applies to the specified authorization type.
     * </p>
     */
    private String resource;

    /**
     * <note>
     * <p>
     * This data type is deprecated and is no longer accurate or used.
     * </p>
     * </note>
     * <p>
     * The authorization type to use. The only valid value is <code>OAUTH</code>, which represents the OAuth
     * authorization type.
     * </p>
     * 
     * @param type
     *        <p>
     *        This data type is deprecated and is no longer accurate or used.
     *        </p>
     *        </note>
     *        <p>
     *        The authorization type to use. The only valid value is <code>OAUTH</code>, which represents the OAuth
     *        authorization type.
     * @see SourceAuthType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <note>
     * <p>
     * This data type is deprecated and is no longer accurate or used.
     * </p>
     * </note>
     * <p>
     * The authorization type to use. The only valid value is <code>OAUTH</code>, which represents the OAuth
     * authorization type.
     * </p>
     * 
     * @return <p>
     *         This data type is deprecated and is no longer accurate or used.
     *         </p>
     *         </note>
     *         <p>
     *         The authorization type to use. The only valid value is <code>OAUTH</code>, which represents the OAuth
     *         authorization type.
     * @see SourceAuthType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <note>
     * <p>
     * This data type is deprecated and is no longer accurate or used.
     * </p>
     * </note>
     * <p>
     * The authorization type to use. The only valid value is <code>OAUTH</code>, which represents the OAuth
     * authorization type.
     * </p>
     * 
     * @param type
     *        <p>
     *        This data type is deprecated and is no longer accurate or used.
     *        </p>
     *        </note>
     *        <p>
     *        The authorization type to use. The only valid value is <code>OAUTH</code>, which represents the OAuth
     *        authorization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceAuthType
     */

    public SourceAuth withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <note>
     * <p>
     * This data type is deprecated and is no longer accurate or used.
     * </p>
     * </note>
     * <p>
     * The authorization type to use. The only valid value is <code>OAUTH</code>, which represents the OAuth
     * authorization type.
     * </p>
     * 
     * @param type
     *        <p>
     *        This data type is deprecated and is no longer accurate or used.
     *        </p>
     *        </note>
     *        <p>
     *        The authorization type to use. The only valid value is <code>OAUTH</code>, which represents the OAuth
     *        authorization type.
     * @see SourceAuthType
     */

    public void setType(SourceAuthType type) {
        withType(type);
    }

    /**
     * <note>
     * <p>
     * This data type is deprecated and is no longer accurate or used.
     * </p>
     * </note>
     * <p>
     * The authorization type to use. The only valid value is <code>OAUTH</code>, which represents the OAuth
     * authorization type.
     * </p>
     * 
     * @param type
     *        <p>
     *        This data type is deprecated and is no longer accurate or used.
     *        </p>
     *        </note>
     *        <p>
     *        The authorization type to use. The only valid value is <code>OAUTH</code>, which represents the OAuth
     *        authorization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceAuthType
     */

    public SourceAuth withType(SourceAuthType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The resource value that applies to the specified authorization type.
     * </p>
     * 
     * @param resource
     *        The resource value that applies to the specified authorization type.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource value that applies to the specified authorization type.
     * </p>
     * 
     * @return The resource value that applies to the specified authorization type.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource value that applies to the specified authorization type.
     * </p>
     * 
     * @param resource
     *        The resource value that applies to the specified authorization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceAuth withResource(String resource) {
        setResource(resource);
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceAuth == false)
            return false;
        SourceAuth other = (SourceAuth) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        return hashCode;
    }

    @Override
    public SourceAuth clone() {
        try {
            return (SourceAuth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.SourceAuthMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
