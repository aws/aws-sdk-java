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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateOutpostResolver"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOutpostResolverRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique string that identifies Resolver on an Outpost.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Name of the Resolver on the Outpost.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon EC2 instance count for a Resolver on the Outpost.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * Amazon EC2 instance type.
     * </p>
     */
    private String preferredInstanceType;

    /**
     * <p>
     * A unique string that identifies Resolver on an Outpost.
     * </p>
     * 
     * @param id
     *        A unique string that identifies Resolver on an Outpost.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique string that identifies Resolver on an Outpost.
     * </p>
     * 
     * @return A unique string that identifies Resolver on an Outpost.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique string that identifies Resolver on an Outpost.
     * </p>
     * 
     * @param id
     *        A unique string that identifies Resolver on an Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOutpostResolverRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Name of the Resolver on the Outpost.
     * </p>
     * 
     * @param name
     *        Name of the Resolver on the Outpost.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the Resolver on the Outpost.
     * </p>
     * 
     * @return Name of the Resolver on the Outpost.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the Resolver on the Outpost.
     * </p>
     * 
     * @param name
     *        Name of the Resolver on the Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOutpostResolverRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance count for a Resolver on the Outpost.
     * </p>
     * 
     * @param instanceCount
     *        The Amazon EC2 instance count for a Resolver on the Outpost.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The Amazon EC2 instance count for a Resolver on the Outpost.
     * </p>
     * 
     * @return The Amazon EC2 instance count for a Resolver on the Outpost.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The Amazon EC2 instance count for a Resolver on the Outpost.
     * </p>
     * 
     * @param instanceCount
     *        The Amazon EC2 instance count for a Resolver on the Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOutpostResolverRequest withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * Amazon EC2 instance type.
     * </p>
     * 
     * @param preferredInstanceType
     *        Amazon EC2 instance type.
     */

    public void setPreferredInstanceType(String preferredInstanceType) {
        this.preferredInstanceType = preferredInstanceType;
    }

    /**
     * <p>
     * Amazon EC2 instance type.
     * </p>
     * 
     * @return Amazon EC2 instance type.
     */

    public String getPreferredInstanceType() {
        return this.preferredInstanceType;
    }

    /**
     * <p>
     * Amazon EC2 instance type.
     * </p>
     * 
     * @param preferredInstanceType
     *        Amazon EC2 instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOutpostResolverRequest withPreferredInstanceType(String preferredInstanceType) {
        setPreferredInstanceType(preferredInstanceType);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getPreferredInstanceType() != null)
            sb.append("PreferredInstanceType: ").append(getPreferredInstanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOutpostResolverRequest == false)
            return false;
        UpdateOutpostResolverRequest other = (UpdateOutpostResolverRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getPreferredInstanceType() == null ^ this.getPreferredInstanceType() == null)
            return false;
        if (other.getPreferredInstanceType() != null && other.getPreferredInstanceType().equals(this.getPreferredInstanceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getPreferredInstanceType() == null) ? 0 : getPreferredInstanceType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateOutpostResolverRequest clone() {
        return (UpdateOutpostResolverRequest) super.clone();
    }

}
