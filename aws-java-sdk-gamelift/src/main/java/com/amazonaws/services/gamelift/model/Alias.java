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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties that describe an alias resource.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateAlias</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListAliases</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeAlias</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateAlias</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteAlias</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ResolveAlias</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/Alias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Alias implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for an alias. Alias IDs are unique within a Region.
     * </p>
     */
    private String aliasId;
    /**
     * <p>
     * A descriptive label that is associated with an alias. Alias names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a>) that is assigned to a
     * GameLift alias resource and uniquely identifies it. ARNs are unique across all Regions.. In a GameLift alias ARN,
     * the resource ID matches the alias ID value.
     * </p>
     */
    private String aliasArn;
    /**
     * <p>
     * A human-readable description of an alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The routing configuration, including routing type and fleet target, for the alias.
     * </p>
     */
    private RoutingStrategy routingStrategy;
    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time that this data object was last modified. Format is a number expressed in Unix time as milliseconds (for
     * example "1469498468.057").
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * A unique identifier for an alias. Alias IDs are unique within a Region.
     * </p>
     * 
     * @param aliasId
     *        A unique identifier for an alias. Alias IDs are unique within a Region.
     */

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * <p>
     * A unique identifier for an alias. Alias IDs are unique within a Region.
     * </p>
     * 
     * @return A unique identifier for an alias. Alias IDs are unique within a Region.
     */

    public String getAliasId() {
        return this.aliasId;
    }

    /**
     * <p>
     * A unique identifier for an alias. Alias IDs are unique within a Region.
     * </p>
     * 
     * @param aliasId
     *        A unique identifier for an alias. Alias IDs are unique within a Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alias withAliasId(String aliasId) {
        setAliasId(aliasId);
        return this;
    }

    /**
     * <p>
     * A descriptive label that is associated with an alias. Alias names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with an alias. Alias names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive label that is associated with an alias. Alias names do not need to be unique.
     * </p>
     * 
     * @return A descriptive label that is associated with an alias. Alias names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive label that is associated with an alias. Alias names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with an alias. Alias names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alias withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a>) that is assigned to a
     * GameLift alias resource and uniquely identifies it. ARNs are unique across all Regions.. In a GameLift alias ARN,
     * the resource ID matches the alias ID value.
     * </p>
     * 
     * @param aliasArn
     *        Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a>) that is
     *        assigned to a GameLift alias resource and uniquely identifies it. ARNs are unique across all Regions.. In
     *        a GameLift alias ARN, the resource ID matches the alias ID value.
     */

    public void setAliasArn(String aliasArn) {
        this.aliasArn = aliasArn;
    }

    /**
     * <p>
     * Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a>) that is assigned to a
     * GameLift alias resource and uniquely identifies it. ARNs are unique across all Regions.. In a GameLift alias ARN,
     * the resource ID matches the alias ID value.
     * </p>
     * 
     * @return Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a>) that is
     *         assigned to a GameLift alias resource and uniquely identifies it. ARNs are unique across all Regions.. In
     *         a GameLift alias ARN, the resource ID matches the alias ID value.
     */

    public String getAliasArn() {
        return this.aliasArn;
    }

    /**
     * <p>
     * Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a>) that is assigned to a
     * GameLift alias resource and uniquely identifies it. ARNs are unique across all Regions.. In a GameLift alias ARN,
     * the resource ID matches the alias ID value.
     * </p>
     * 
     * @param aliasArn
     *        Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a>) that is
     *        assigned to a GameLift alias resource and uniquely identifies it. ARNs are unique across all Regions.. In
     *        a GameLift alias ARN, the resource ID matches the alias ID value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alias withAliasArn(String aliasArn) {
        setAliasArn(aliasArn);
        return this;
    }

    /**
     * <p>
     * A human-readable description of an alias.
     * </p>
     * 
     * @param description
     *        A human-readable description of an alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A human-readable description of an alias.
     * </p>
     * 
     * @return A human-readable description of an alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A human-readable description of an alias.
     * </p>
     * 
     * @param description
     *        A human-readable description of an alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alias withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The routing configuration, including routing type and fleet target, for the alias.
     * </p>
     * 
     * @param routingStrategy
     *        The routing configuration, including routing type and fleet target, for the alias.
     */

    public void setRoutingStrategy(RoutingStrategy routingStrategy) {
        this.routingStrategy = routingStrategy;
    }

    /**
     * <p>
     * The routing configuration, including routing type and fleet target, for the alias.
     * </p>
     * 
     * @return The routing configuration, including routing type and fleet target, for the alias.
     */

    public RoutingStrategy getRoutingStrategy() {
        return this.routingStrategy;
    }

    /**
     * <p>
     * The routing configuration, including routing type and fleet target, for the alias.
     * </p>
     * 
     * @param routingStrategy
     *        The routing configuration, including routing type and fleet target, for the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alias withRoutingStrategy(RoutingStrategy routingStrategy) {
        setRoutingStrategy(routingStrategy);
        return this;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param creationTime
     *        A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @return A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *         milliseconds (for example "1469498468.057").
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param creationTime
     *        A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alias withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time that this data object was last modified. Format is a number expressed in Unix time as milliseconds (for
     * example "1469498468.057").
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that this data object was last modified. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time that this data object was last modified. Format is a number expressed in Unix time as milliseconds (for
     * example "1469498468.057").
     * </p>
     * 
     * @return The time that this data object was last modified. Format is a number expressed in Unix time as
     *         milliseconds (for example "1469498468.057").
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time that this data object was last modified. Format is a number expressed in Unix time as milliseconds (for
     * example "1469498468.057").
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that this data object was last modified. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alias withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getAliasId() != null)
            sb.append("AliasId: ").append(getAliasId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAliasArn() != null)
            sb.append("AliasArn: ").append(getAliasArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoutingStrategy() != null)
            sb.append("RoutingStrategy: ").append(getRoutingStrategy()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Alias == false)
            return false;
        Alias other = (Alias) obj;
        if (other.getAliasId() == null ^ this.getAliasId() == null)
            return false;
        if (other.getAliasId() != null && other.getAliasId().equals(this.getAliasId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAliasArn() == null ^ this.getAliasArn() == null)
            return false;
        if (other.getAliasArn() != null && other.getAliasArn().equals(this.getAliasArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoutingStrategy() == null ^ this.getRoutingStrategy() == null)
            return false;
        if (other.getRoutingStrategy() != null && other.getRoutingStrategy().equals(this.getRoutingStrategy()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasId() == null) ? 0 : getAliasId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAliasArn() == null) ? 0 : getAliasArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoutingStrategy() == null) ? 0 : getRoutingStrategy().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public Alias clone() {
        try {
            return (Alias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.AliasMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
