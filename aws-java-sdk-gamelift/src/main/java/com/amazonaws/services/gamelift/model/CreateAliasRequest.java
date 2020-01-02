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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A descriptive label that is associated with an alias. Alias names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A human-readable description of the alias.
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
     * A list of labels to assign to the new alias resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public CreateAliasRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A human-readable description of the alias.
     * </p>
     * 
     * @param description
     *        A human-readable description of the alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A human-readable description of the alias.
     * </p>
     * 
     * @return A human-readable description of the alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A human-readable description of the alias.
     * </p>
     * 
     * @param description
     *        A human-readable description of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withDescription(String description) {
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

    public CreateAliasRequest withRoutingStrategy(RoutingStrategy routingStrategy) {
        setRoutingStrategy(routingStrategy);
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new alias resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @return A list of labels to assign to the new alias resource. Tags are developer-defined key-value pairs. Tagging
     *         AWS resources are useful for resource management, access management and cost allocation. For more
     *         information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *         Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *         <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *         The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of labels to assign to the new alias resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new alias resource. Tags are developer-defined key-value pairs. Tagging
     *        AWS resources are useful for resource management, access management and cost allocation. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *        Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of labels to assign to the new alias resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new alias resource. Tags are developer-defined key-value pairs. Tagging
     *        AWS resources are useful for resource management, access management and cost allocation. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *        Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new alias resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new alias resource. Tags are developer-defined key-value pairs. Tagging
     *        AWS resources are useful for resource management, access management and cost allocation. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *        Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoutingStrategy() != null)
            sb.append("RoutingStrategy: ").append(getRoutingStrategy()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAliasRequest == false)
            return false;
        CreateAliasRequest other = (CreateAliasRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoutingStrategy() == null ^ this.getRoutingStrategy() == null)
            return false;
        if (other.getRoutingStrategy() != null && other.getRoutingStrategy().equals(this.getRoutingStrategy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoutingStrategy() == null) ? 0 : getRoutingStrategy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAliasRequest clone() {
        return (CreateAliasRequest) super.clone();
    }

}
