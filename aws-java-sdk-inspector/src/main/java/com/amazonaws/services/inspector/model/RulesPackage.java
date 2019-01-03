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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an Amazon Inspector rules package. This data type is used as the response element in the
 * <a>DescribeRulesPackages</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/RulesPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RulesPackage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the rules package.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the rules package.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version ID of the rules package.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The provider of the rules package.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The description of the rules package.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ARN of the rules package.
     * </p>
     * 
     * @param arn
     *        The ARN of the rules package.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the rules package.
     * </p>
     * 
     * @return The ARN of the rules package.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the rules package.
     * </p>
     * 
     * @param arn
     *        The ARN of the rules package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesPackage withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the rules package.
     * </p>
     * 
     * @param name
     *        The name of the rules package.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rules package.
     * </p>
     * 
     * @return The name of the rules package.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rules package.
     * </p>
     * 
     * @param name
     *        The name of the rules package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesPackage withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version ID of the rules package.
     * </p>
     * 
     * @param version
     *        The version ID of the rules package.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version ID of the rules package.
     * </p>
     * 
     * @return The version ID of the rules package.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version ID of the rules package.
     * </p>
     * 
     * @param version
     *        The version ID of the rules package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesPackage withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The provider of the rules package.
     * </p>
     * 
     * @param provider
     *        The provider of the rules package.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider of the rules package.
     * </p>
     * 
     * @return The provider of the rules package.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider of the rules package.
     * </p>
     * 
     * @param provider
     *        The provider of the rules package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesPackage withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The description of the rules package.
     * </p>
     * 
     * @param description
     *        The description of the rules package.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the rules package.
     * </p>
     * 
     * @return The description of the rules package.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the rules package.
     * </p>
     * 
     * @param description
     *        The description of the rules package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesPackage withDescription(String description) {
        setDescription(description);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RulesPackage == false)
            return false;
        RulesPackage other = (RulesPackage) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public RulesPackage clone() {
        try {
            return (RulesPackage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.RulesPackageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
