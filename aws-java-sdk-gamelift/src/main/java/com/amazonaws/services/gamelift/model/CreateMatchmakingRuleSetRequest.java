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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateMatchmakingRuleSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMatchmakingRuleSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for a matchmaking rule set. A matchmaking configuration identifies the rule set it uses by
     * this name value. Note that the rule set name is different from the optional <code>name</code> field in the rule
     * set body.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A collection of matchmaking rules, formatted as a JSON string. Comments are not allowed in JSON, but most
     * elements support a description field.
     * </p>
     */
    private String ruleSetBody;
    /**
     * <p>
     * A list of labels to assign to the new matchmaking rule set resource. Tags are developer-defined key-value pairs.
     * Tagging AWS resources are useful for resource management, access management and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     * Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>,
     * <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be
     * lower than stated. See the AWS General Reference for actual tagging limits.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique identifier for a matchmaking rule set. A matchmaking configuration identifies the rule set it uses by
     * this name value. Note that the rule set name is different from the optional <code>name</code> field in the rule
     * set body.
     * </p>
     * 
     * @param name
     *        A unique identifier for a matchmaking rule set. A matchmaking configuration identifies the rule set it
     *        uses by this name value. Note that the rule set name is different from the optional <code>name</code>
     *        field in the rule set body.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique identifier for a matchmaking rule set. A matchmaking configuration identifies the rule set it uses by
     * this name value. Note that the rule set name is different from the optional <code>name</code> field in the rule
     * set body.
     * </p>
     * 
     * @return A unique identifier for a matchmaking rule set. A matchmaking configuration identifies the rule set it
     *         uses by this name value. Note that the rule set name is different from the optional <code>name</code>
     *         field in the rule set body.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique identifier for a matchmaking rule set. A matchmaking configuration identifies the rule set it uses by
     * this name value. Note that the rule set name is different from the optional <code>name</code> field in the rule
     * set body.
     * </p>
     * 
     * @param name
     *        A unique identifier for a matchmaking rule set. A matchmaking configuration identifies the rule set it
     *        uses by this name value. Note that the rule set name is different from the optional <code>name</code>
     *        field in the rule set body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMatchmakingRuleSetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A collection of matchmaking rules, formatted as a JSON string. Comments are not allowed in JSON, but most
     * elements support a description field.
     * </p>
     * 
     * @param ruleSetBody
     *        A collection of matchmaking rules, formatted as a JSON string. Comments are not allowed in JSON, but most
     *        elements support a description field.
     */

    public void setRuleSetBody(String ruleSetBody) {
        this.ruleSetBody = ruleSetBody;
    }

    /**
     * <p>
     * A collection of matchmaking rules, formatted as a JSON string. Comments are not allowed in JSON, but most
     * elements support a description field.
     * </p>
     * 
     * @return A collection of matchmaking rules, formatted as a JSON string. Comments are not allowed in JSON, but most
     *         elements support a description field.
     */

    public String getRuleSetBody() {
        return this.ruleSetBody;
    }

    /**
     * <p>
     * A collection of matchmaking rules, formatted as a JSON string. Comments are not allowed in JSON, but most
     * elements support a description field.
     * </p>
     * 
     * @param ruleSetBody
     *        A collection of matchmaking rules, formatted as a JSON string. Comments are not allowed in JSON, but most
     *        elements support a description field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMatchmakingRuleSetRequest withRuleSetBody(String ruleSetBody) {
        setRuleSetBody(ruleSetBody);
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new matchmaking rule set resource. Tags are developer-defined key-value pairs.
     * Tagging AWS resources are useful for resource management, access management and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     * Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>,
     * <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be
     * lower than stated. See the AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @return A list of labels to assign to the new matchmaking rule set resource. Tags are developer-defined key-value
     *         pairs. Tagging AWS resources are useful for resource management, access management and cost allocation.
     *         For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *         Tagging AWS Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *         <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *         The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of labels to assign to the new matchmaking rule set resource. Tags are developer-defined key-value pairs.
     * Tagging AWS resources are useful for resource management, access management and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     * Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>,
     * <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be
     * lower than stated. See the AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new matchmaking rule set resource. Tags are developer-defined key-value
     *        pairs. Tagging AWS resources are useful for resource management, access management and cost allocation.
     *        For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *        Tagging AWS Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
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
     * A list of labels to assign to the new matchmaking rule set resource. Tags are developer-defined key-value pairs.
     * Tagging AWS resources are useful for resource management, access management and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     * Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>,
     * <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be
     * lower than stated. See the AWS General Reference for actual tagging limits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new matchmaking rule set resource. Tags are developer-defined key-value
     *        pairs. Tagging AWS resources are useful for resource management, access management and cost allocation.
     *        For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *        Tagging AWS Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMatchmakingRuleSetRequest withTags(Tag... tags) {
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
     * A list of labels to assign to the new matchmaking rule set resource. Tags are developer-defined key-value pairs.
     * Tagging AWS resources are useful for resource management, access management and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     * Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>,
     * <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be
     * lower than stated. See the AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new matchmaking rule set resource. Tags are developer-defined key-value
     *        pairs. Tagging AWS resources are useful for resource management, access management and cost allocation.
     *        For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *        Tagging AWS Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMatchmakingRuleSetRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getRuleSetBody() != null)
            sb.append("RuleSetBody: ").append(getRuleSetBody()).append(",");
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

        if (obj instanceof CreateMatchmakingRuleSetRequest == false)
            return false;
        CreateMatchmakingRuleSetRequest other = (CreateMatchmakingRuleSetRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRuleSetBody() == null ^ this.getRuleSetBody() == null)
            return false;
        if (other.getRuleSetBody() != null && other.getRuleSetBody().equals(this.getRuleSetBody()) == false)
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
        hashCode = prime * hashCode + ((getRuleSetBody() == null) ? 0 : getRuleSetBody().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMatchmakingRuleSetRequest clone() {
        return (CreateMatchmakingRuleSetRequest) super.clone();
    }

}
