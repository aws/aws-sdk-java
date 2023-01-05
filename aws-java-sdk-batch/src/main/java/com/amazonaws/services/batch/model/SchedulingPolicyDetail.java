/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a scheduling policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/SchedulingPolicyDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchedulingPolicyDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the scheduling policy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduling policy. An example is
     * <code>arn:<i>aws</i>:batch:<i>us-east-1</i>:<i>123456789012</i>:scheduling-policy/<i>HighPriority</i> </code>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The fair share policy for the scheduling policy.
     * </p>
     */
    private FairsharePolicy fairsharePolicy;
    /**
     * <p>
     * The tags that you apply to the scheduling policy to categorize and organize your resources. Each tag consists of
     * a key and an optional value. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the scheduling policy.
     * </p>
     * 
     * @param name
     *        The name of the scheduling policy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the scheduling policy.
     * </p>
     * 
     * @return The name of the scheduling policy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the scheduling policy.
     * </p>
     * 
     * @param name
     *        The name of the scheduling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchedulingPolicyDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduling policy. An example is
     * <code>arn:<i>aws</i>:batch:<i>us-east-1</i>:<i>123456789012</i>:scheduling-policy/<i>HighPriority</i> </code>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the scheduling policy. An example is
     *        <code>arn:<i>aws</i>:batch:<i>us-east-1</i>:<i>123456789012</i>:scheduling-policy/<i>HighPriority</i> </code>
     *        .
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduling policy. An example is
     * <code>arn:<i>aws</i>:batch:<i>us-east-1</i>:<i>123456789012</i>:scheduling-policy/<i>HighPriority</i> </code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the scheduling policy. An example is
     *         <code>arn:<i>aws</i>:batch:<i>us-east-1</i>:<i>123456789012</i>:scheduling-policy/<i>HighPriority</i> </code>
     *         .
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the scheduling policy. An example is
     * <code>arn:<i>aws</i>:batch:<i>us-east-1</i>:<i>123456789012</i>:scheduling-policy/<i>HighPriority</i> </code>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the scheduling policy. An example is
     *        <code>arn:<i>aws</i>:batch:<i>us-east-1</i>:<i>123456789012</i>:scheduling-policy/<i>HighPriority</i> </code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchedulingPolicyDetail withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The fair share policy for the scheduling policy.
     * </p>
     * 
     * @param fairsharePolicy
     *        The fair share policy for the scheduling policy.
     */

    public void setFairsharePolicy(FairsharePolicy fairsharePolicy) {
        this.fairsharePolicy = fairsharePolicy;
    }

    /**
     * <p>
     * The fair share policy for the scheduling policy.
     * </p>
     * 
     * @return The fair share policy for the scheduling policy.
     */

    public FairsharePolicy getFairsharePolicy() {
        return this.fairsharePolicy;
    }

    /**
     * <p>
     * The fair share policy for the scheduling policy.
     * </p>
     * 
     * @param fairsharePolicy
     *        The fair share policy for the scheduling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchedulingPolicyDetail withFairsharePolicy(FairsharePolicy fairsharePolicy) {
        setFairsharePolicy(fairsharePolicy);
        return this;
    }

    /**
     * <p>
     * The tags that you apply to the scheduling policy to categorize and organize your resources. Each tag consists of
     * a key and an optional value. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The tags that you apply to the scheduling policy to categorize and organize your resources. Each tag
     *         consists of a key and an optional value. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a> in <i>Amazon Web Services General Reference</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that you apply to the scheduling policy to categorize and organize your resources. Each tag consists of
     * a key and an optional value. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param tags
     *        The tags that you apply to the scheduling policy to categorize and organize your resources. Each tag
     *        consists of a key and an optional value. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in <i>Amazon Web Services General Reference</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags that you apply to the scheduling policy to categorize and organize your resources. Each tag consists of
     * a key and an optional value. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param tags
     *        The tags that you apply to the scheduling policy to categorize and organize your resources. Each tag
     *        consists of a key and an optional value. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchedulingPolicyDetail withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see SchedulingPolicyDetail#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SchedulingPolicyDetail addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchedulingPolicyDetail clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getFairsharePolicy() != null)
            sb.append("FairsharePolicy: ").append(getFairsharePolicy()).append(",");
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

        if (obj instanceof SchedulingPolicyDetail == false)
            return false;
        SchedulingPolicyDetail other = (SchedulingPolicyDetail) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getFairsharePolicy() == null ^ this.getFairsharePolicy() == null)
            return false;
        if (other.getFairsharePolicy() != null && other.getFairsharePolicy().equals(this.getFairsharePolicy()) == false)
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
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getFairsharePolicy() == null) ? 0 : getFairsharePolicy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public SchedulingPolicyDetail clone() {
        try {
            return (SchedulingPolicyDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.SchedulingPolicyDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
