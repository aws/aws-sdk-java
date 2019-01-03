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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/PublishSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishSchemaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the development schema. For more information, see
     * <a>arns</a>.
     * </p>
     */
    private String developmentSchemaArn;
    /**
     * <p>
     * The major version under which the schema will be published. Schemas have both a major and minor version
     * associated with them.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The minor version under which the schema will be published. This parameter is recommended. Schemas have both a
     * major and minor version associated with them.
     * </p>
     */
    private String minorVersion;
    /**
     * <p>
     * The new name under which the schema will be published. If this is not provided, the development schema is
     * considered.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the development schema. For more information, see
     * <a>arns</a>.
     * </p>
     * 
     * @param developmentSchemaArn
     *        The Amazon Resource Name (ARN) that is associated with the development schema. For more information, see
     *        <a>arns</a>.
     */

    public void setDevelopmentSchemaArn(String developmentSchemaArn) {
        this.developmentSchemaArn = developmentSchemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the development schema. For more information, see
     * <a>arns</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is associated with the development schema. For more information, see
     *         <a>arns</a>.
     */

    public String getDevelopmentSchemaArn() {
        return this.developmentSchemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the development schema. For more information, see
     * <a>arns</a>.
     * </p>
     * 
     * @param developmentSchemaArn
     *        The Amazon Resource Name (ARN) that is associated with the development schema. For more information, see
     *        <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishSchemaRequest withDevelopmentSchemaArn(String developmentSchemaArn) {
        setDevelopmentSchemaArn(developmentSchemaArn);
        return this;
    }

    /**
     * <p>
     * The major version under which the schema will be published. Schemas have both a major and minor version
     * associated with them.
     * </p>
     * 
     * @param version
     *        The major version under which the schema will be published. Schemas have both a major and minor version
     *        associated with them.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The major version under which the schema will be published. Schemas have both a major and minor version
     * associated with them.
     * </p>
     * 
     * @return The major version under which the schema will be published. Schemas have both a major and minor version
     *         associated with them.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The major version under which the schema will be published. Schemas have both a major and minor version
     * associated with them.
     * </p>
     * 
     * @param version
     *        The major version under which the schema will be published. Schemas have both a major and minor version
     *        associated with them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishSchemaRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The minor version under which the schema will be published. This parameter is recommended. Schemas have both a
     * major and minor version associated with them.
     * </p>
     * 
     * @param minorVersion
     *        The minor version under which the schema will be published. This parameter is recommended. Schemas have
     *        both a major and minor version associated with them.
     */

    public void setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
    }

    /**
     * <p>
     * The minor version under which the schema will be published. This parameter is recommended. Schemas have both a
     * major and minor version associated with them.
     * </p>
     * 
     * @return The minor version under which the schema will be published. This parameter is recommended. Schemas have
     *         both a major and minor version associated with them.
     */

    public String getMinorVersion() {
        return this.minorVersion;
    }

    /**
     * <p>
     * The minor version under which the schema will be published. This parameter is recommended. Schemas have both a
     * major and minor version associated with them.
     * </p>
     * 
     * @param minorVersion
     *        The minor version under which the schema will be published. This parameter is recommended. Schemas have
     *        both a major and minor version associated with them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishSchemaRequest withMinorVersion(String minorVersion) {
        setMinorVersion(minorVersion);
        return this;
    }

    /**
     * <p>
     * The new name under which the schema will be published. If this is not provided, the development schema is
     * considered.
     * </p>
     * 
     * @param name
     *        The new name under which the schema will be published. If this is not provided, the development schema is
     *        considered.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new name under which the schema will be published. If this is not provided, the development schema is
     * considered.
     * </p>
     * 
     * @return The new name under which the schema will be published. If this is not provided, the development schema is
     *         considered.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new name under which the schema will be published. If this is not provided, the development schema is
     * considered.
     * </p>
     * 
     * @param name
     *        The new name under which the schema will be published. If this is not provided, the development schema is
     *        considered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishSchemaRequest withName(String name) {
        setName(name);
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
        if (getDevelopmentSchemaArn() != null)
            sb.append("DevelopmentSchemaArn: ").append(getDevelopmentSchemaArn()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getMinorVersion() != null)
            sb.append("MinorVersion: ").append(getMinorVersion()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishSchemaRequest == false)
            return false;
        PublishSchemaRequest other = (PublishSchemaRequest) obj;
        if (other.getDevelopmentSchemaArn() == null ^ this.getDevelopmentSchemaArn() == null)
            return false;
        if (other.getDevelopmentSchemaArn() != null && other.getDevelopmentSchemaArn().equals(this.getDevelopmentSchemaArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getMinorVersion() == null ^ this.getMinorVersion() == null)
            return false;
        if (other.getMinorVersion() != null && other.getMinorVersion().equals(this.getMinorVersion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevelopmentSchemaArn() == null) ? 0 : getDevelopmentSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getMinorVersion() == null) ? 0 : getMinorVersion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public PublishSchemaRequest clone() {
        return (PublishSchemaRequest) super.clone();
    }

}
