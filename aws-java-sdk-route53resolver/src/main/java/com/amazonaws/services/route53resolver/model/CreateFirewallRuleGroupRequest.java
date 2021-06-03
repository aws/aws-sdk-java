/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateFirewallRuleGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFirewallRuleGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk
     * of running the operation twice. This can be any unique string, for example, a timestamp.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * A name that lets you identify the rule group, to manage and use it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the rule group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk
     * of running the operation twice. This can be any unique string, for example, a timestamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string defined by you to identify the request. This allows you to retry failed requests without
     *        the risk of running the operation twice. This can be any unique string, for example, a timestamp.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk
     * of running the operation twice. This can be any unique string, for example, a timestamp.
     * </p>
     * 
     * @return A unique string defined by you to identify the request. This allows you to retry failed requests without
     *         the risk of running the operation twice. This can be any unique string, for example, a timestamp.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk
     * of running the operation twice. This can be any unique string, for example, a timestamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string defined by you to identify the request. This allows you to retry failed requests without
     *        the risk of running the operation twice. This can be any unique string, for example, a timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallRuleGroupRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * A name that lets you identify the rule group, to manage and use it.
     * </p>
     * 
     * @param name
     *        A name that lets you identify the rule group, to manage and use it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name that lets you identify the rule group, to manage and use it.
     * </p>
     * 
     * @return A name that lets you identify the rule group, to manage and use it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name that lets you identify the rule group, to manage and use it.
     * </p>
     * 
     * @param name
     *        A name that lets you identify the rule group, to manage and use it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallRuleGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the rule group.
     * </p>
     * 
     * @return A list of the tag keys and values that you want to associate with the rule group.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of the tag keys and values that you want to associate with the rule group.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the rule group.
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
     * A list of the tag keys and values that you want to associate with the rule group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallRuleGroupRequest withTags(Tag... tags) {
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
     * A list of the tag keys and values that you want to associate with the rule group.
     * </p>
     * 
     * @param tags
     *        A list of the tag keys and values that you want to associate with the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFirewallRuleGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof CreateFirewallRuleGroupRequest == false)
            return false;
        CreateFirewallRuleGroupRequest other = (CreateFirewallRuleGroupRequest) obj;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFirewallRuleGroupRequest clone() {
        return (CreateFirewallRuleGroupRequest) super.clone();
    }

}
