/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/PublishSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishSchemaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN associated with the development schema. For more information, see <a>arns</a>.
     * </p>
     */
    private String developmentSchemaArn;
    /**
     * <p>
     * Version under which the schema will be published.
     * </p>
     */
    private String version;
    /**
     * <p>
     * New name under which the schema will be published. If this is not provided, the development schema is considered.
     * </p>
     */
    private String name;

    /**
     * <p>
     * ARN associated with the development schema. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param developmentSchemaArn
     *        ARN associated with the development schema. For more information, see <a>arns</a>.
     */

    public void setDevelopmentSchemaArn(String developmentSchemaArn) {
        this.developmentSchemaArn = developmentSchemaArn;
    }

    /**
     * <p>
     * ARN associated with the development schema. For more information, see <a>arns</a>.
     * </p>
     * 
     * @return ARN associated with the development schema. For more information, see <a>arns</a>.
     */

    public String getDevelopmentSchemaArn() {
        return this.developmentSchemaArn;
    }

    /**
     * <p>
     * ARN associated with the development schema. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param developmentSchemaArn
     *        ARN associated with the development schema. For more information, see <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishSchemaRequest withDevelopmentSchemaArn(String developmentSchemaArn) {
        setDevelopmentSchemaArn(developmentSchemaArn);
        return this;
    }

    /**
     * <p>
     * Version under which the schema will be published.
     * </p>
     * 
     * @param version
     *        Version under which the schema will be published.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Version under which the schema will be published.
     * </p>
     * 
     * @return Version under which the schema will be published.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version under which the schema will be published.
     * </p>
     * 
     * @param version
     *        Version under which the schema will be published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishSchemaRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * New name under which the schema will be published. If this is not provided, the development schema is considered.
     * </p>
     * 
     * @param name
     *        New name under which the schema will be published. If this is not provided, the development schema is
     *        considered.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * New name under which the schema will be published. If this is not provided, the development schema is considered.
     * </p>
     * 
     * @return New name under which the schema will be published. If this is not provided, the development schema is
     *         considered.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * New name under which the schema will be published. If this is not provided, the development schema is considered.
     * </p>
     * 
     * @param name
     *        New name under which the schema will be published. If this is not provided, the development schema is
     *        considered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishSchemaRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public PublishSchemaRequest clone() {
        return (PublishSchemaRequest) super.clone();
    }

}
