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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateOutpostResolver"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOutpostResolverRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * running the operation twice.
     * </p>
     * <p>
     * <code>CreatorRequestId</code> can be any unique string, for example, a date/time stamp.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53 console.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Number of Amazon EC2 instances for the Resolver on Outpost. The default and minimal value is 4.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The Amazon EC2 instance type. If you specify this, you must also specify a value for the <code>OutpostArn</code>.
     * </p>
     */
    private String preferredInstanceType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost. If you specify this, you must also specify a value for the
     * <code>PreferredInstanceType</code>.
     * </p>
     */
    private String outpostArn;
    /**
     * <p>
     * A string that helps identify the Route 53 Resolvers on Outpost.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * running the operation twice.
     * </p>
     * <p>
     * <code>CreatorRequestId</code> can be any unique string, for example, a date/time stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed requests to be retried without the risk
     *        of running the operation twice. </p>
     *        <p>
     *        <code>CreatorRequestId</code> can be any unique string, for example, a date/time stamp.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * running the operation twice.
     * </p>
     * <p>
     * <code>CreatorRequestId</code> can be any unique string, for example, a date/time stamp.
     * </p>
     * 
     * @return A unique string that identifies the request and that allows failed requests to be retried without the
     *         risk of running the operation twice. </p>
     *         <p>
     *         <code>CreatorRequestId</code> can be any unique string, for example, a date/time stamp.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed requests to be retried without the risk of
     * running the operation twice.
     * </p>
     * <p>
     * <code>CreatorRequestId</code> can be any unique string, for example, a date/time stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed requests to be retried without the risk
     *        of running the operation twice. </p>
     *        <p>
     *        <code>CreatorRequestId</code> can be any unique string, for example, a date/time stamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutpostResolverRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53 console.
     * </p>
     * 
     * @param name
     *        A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53
     *        console.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53 console.
     * </p>
     * 
     * @return A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53
     *         console.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53 console.
     * </p>
     * 
     * @param name
     *        A friendly name that lets you easily find a configuration in the Resolver dashboard in the Route 53
     *        console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutpostResolverRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Number of Amazon EC2 instances for the Resolver on Outpost. The default and minimal value is 4.
     * </p>
     * 
     * @param instanceCount
     *        Number of Amazon EC2 instances for the Resolver on Outpost. The default and minimal value is 4.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * Number of Amazon EC2 instances for the Resolver on Outpost. The default and minimal value is 4.
     * </p>
     * 
     * @return Number of Amazon EC2 instances for the Resolver on Outpost. The default and minimal value is 4.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * Number of Amazon EC2 instances for the Resolver on Outpost. The default and minimal value is 4.
     * </p>
     * 
     * @param instanceCount
     *        Number of Amazon EC2 instances for the Resolver on Outpost. The default and minimal value is 4.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutpostResolverRequest withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance type. If you specify this, you must also specify a value for the <code>OutpostArn</code>.
     * </p>
     * 
     * @param preferredInstanceType
     *        The Amazon EC2 instance type. If you specify this, you must also specify a value for the
     *        <code>OutpostArn</code>.
     */

    public void setPreferredInstanceType(String preferredInstanceType) {
        this.preferredInstanceType = preferredInstanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type. If you specify this, you must also specify a value for the <code>OutpostArn</code>.
     * </p>
     * 
     * @return The Amazon EC2 instance type. If you specify this, you must also specify a value for the
     *         <code>OutpostArn</code>.
     */

    public String getPreferredInstanceType() {
        return this.preferredInstanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type. If you specify this, you must also specify a value for the <code>OutpostArn</code>.
     * </p>
     * 
     * @param preferredInstanceType
     *        The Amazon EC2 instance type. If you specify this, you must also specify a value for the
     *        <code>OutpostArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutpostResolverRequest withPreferredInstanceType(String preferredInstanceType) {
        setPreferredInstanceType(preferredInstanceType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost. If you specify this, you must also specify a value for the
     * <code>PreferredInstanceType</code>.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost. If you specify this, you must also specify a value for the
     *        <code>PreferredInstanceType</code>.
     */

    public void setOutpostArn(String outpostArn) {
        this.outpostArn = outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost. If you specify this, you must also specify a value for the
     * <code>PreferredInstanceType</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Outpost. If you specify this, you must also specify a value for the
     *         <code>PreferredInstanceType</code>.
     */

    public String getOutpostArn() {
        return this.outpostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Outpost. If you specify this, you must also specify a value for the
     * <code>PreferredInstanceType</code>.
     * </p>
     * 
     * @param outpostArn
     *        The Amazon Resource Name (ARN) of the Outpost. If you specify this, you must also specify a value for the
     *        <code>PreferredInstanceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutpostResolverRequest withOutpostArn(String outpostArn) {
        setOutpostArn(outpostArn);
        return this;
    }

    /**
     * <p>
     * A string that helps identify the Route 53 Resolvers on Outpost.
     * </p>
     * 
     * @return A string that helps identify the Route 53 Resolvers on Outpost.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string that helps identify the Route 53 Resolvers on Outpost.
     * </p>
     * 
     * @param tags
     *        A string that helps identify the Route 53 Resolvers on Outpost.
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
     * A string that helps identify the Route 53 Resolvers on Outpost.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A string that helps identify the Route 53 Resolvers on Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutpostResolverRequest withTags(Tag... tags) {
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
     * A string that helps identify the Route 53 Resolvers on Outpost.
     * </p>
     * 
     * @param tags
     *        A string that helps identify the Route 53 Resolvers on Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutpostResolverRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getPreferredInstanceType() != null)
            sb.append("PreferredInstanceType: ").append(getPreferredInstanceType()).append(",");
        if (getOutpostArn() != null)
            sb.append("OutpostArn: ").append(getOutpostArn()).append(",");
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

        if (obj instanceof CreateOutpostResolverRequest == false)
            return false;
        CreateOutpostResolverRequest other = (CreateOutpostResolverRequest) obj;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
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
        if (other.getOutpostArn() == null ^ this.getOutpostArn() == null)
            return false;
        if (other.getOutpostArn() != null && other.getOutpostArn().equals(this.getOutpostArn()) == false)
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
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getPreferredInstanceType() == null) ? 0 : getPreferredInstanceType().hashCode());
        hashCode = prime * hashCode + ((getOutpostArn() == null) ? 0 : getOutpostArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateOutpostResolverRequest clone() {
        return (CreateOutpostResolverRequest) super.clone();
    }

}
