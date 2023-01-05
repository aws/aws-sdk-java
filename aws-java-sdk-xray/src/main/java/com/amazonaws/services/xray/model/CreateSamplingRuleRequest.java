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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/CreateSamplingRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSamplingRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The rule definition.
     * </p>
     */
    private SamplingRule samplingRule;
    /**
     * <p>
     * A map that contains one or more tag keys and tag values to attach to an X-Ray sampling rule. For more information
     * about ways to use tags, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging
     * Amazon Web Services resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of user-applied tags per resource: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag key length: 128 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag value length: 256 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The rule definition.
     * </p>
     * 
     * @param samplingRule
     *        The rule definition.
     */

    public void setSamplingRule(SamplingRule samplingRule) {
        this.samplingRule = samplingRule;
    }

    /**
     * <p>
     * The rule definition.
     * </p>
     * 
     * @return The rule definition.
     */

    public SamplingRule getSamplingRule() {
        return this.samplingRule;
    }

    /**
     * <p>
     * The rule definition.
     * </p>
     * 
     * @param samplingRule
     *        The rule definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSamplingRuleRequest withSamplingRule(SamplingRule samplingRule) {
        setSamplingRule(samplingRule);
        return this;
    }

    /**
     * <p>
     * A map that contains one or more tag keys and tag values to attach to an X-Ray sampling rule. For more information
     * about ways to use tags, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging
     * Amazon Web Services resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of user-applied tags per resource: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag key length: 128 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag value length: 256 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A map that contains one or more tag keys and tag values to attach to an X-Ray sampling rule. For more
     *         information about ways to use tags, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a> in the <i>Amazon Web Services General Reference</i>.</p>
     *         <p>
     *         The following restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum number of user-applied tags per resource: 50
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum tag key length: 128 Unicode characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum tag value length: 256 Unicode characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys and values are case sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     *         </p>
     *         </li>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains one or more tag keys and tag values to attach to an X-Ray sampling rule. For more information
     * about ways to use tags, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging
     * Amazon Web Services resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of user-applied tags per resource: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag key length: 128 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag value length: 256 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        A map that contains one or more tag keys and tag values to attach to an X-Ray sampling rule. For more
     *        information about ways to use tags, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference</i>.</p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of user-applied tags per resource: 50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum tag key length: 128 Unicode characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum tag value length: 256 Unicode characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     *        </p>
     *        </li>
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
     * A map that contains one or more tag keys and tag values to attach to an X-Ray sampling rule. For more information
     * about ways to use tags, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging
     * Amazon Web Services resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of user-applied tags per resource: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag key length: 128 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag value length: 256 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A map that contains one or more tag keys and tag values to attach to an X-Ray sampling rule. For more
     *        information about ways to use tags, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference</i>.</p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of user-applied tags per resource: 50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum tag key length: 128 Unicode characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum tag value length: 256 Unicode characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSamplingRuleRequest withTags(Tag... tags) {
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
     * A map that contains one or more tag keys and tag values to attach to an X-Ray sampling rule. For more information
     * about ways to use tags, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging
     * Amazon Web Services resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of user-applied tags per resource: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag key length: 128 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag value length: 256 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        A map that contains one or more tag keys and tag values to attach to an X-Ray sampling rule. For more
     *        information about ways to use tags, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference</i>.</p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of user-applied tags per resource: 50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum tag key length: 128 Unicode characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum tag value length: 256 Unicode characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSamplingRuleRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getSamplingRule() != null)
            sb.append("SamplingRule: ").append(getSamplingRule()).append(",");
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

        if (obj instanceof CreateSamplingRuleRequest == false)
            return false;
        CreateSamplingRuleRequest other = (CreateSamplingRuleRequest) obj;
        if (other.getSamplingRule() == null ^ this.getSamplingRule() == null)
            return false;
        if (other.getSamplingRule() != null && other.getSamplingRule().equals(this.getSamplingRule()) == false)
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

        hashCode = prime * hashCode + ((getSamplingRule() == null) ? 0 : getSamplingRule().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSamplingRuleRequest clone() {
        return (CreateSamplingRuleRequest) super.clone();
    }

}
