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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/CreateSegment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSegmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional description for this segment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A name for the segment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The pattern to use for the segment. For more information about pattern syntax, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax.html"
     * > Segment rule pattern syntax</a>.
     * </p>
     */
    private String pattern;
    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the segment.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;You can associate as many as 50 tags with a segment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * An optional description for this segment.
     * </p>
     * 
     * @param description
     *        An optional description for this segment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for this segment.
     * </p>
     * 
     * @return An optional description for this segment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for this segment.
     * </p>
     * 
     * @param description
     *        An optional description for this segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSegmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A name for the segment.
     * </p>
     * 
     * @param name
     *        A name for the segment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the segment.
     * </p>
     * 
     * @return A name for the segment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the segment.
     * </p>
     * 
     * @param name
     *        A name for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSegmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The pattern to use for the segment. For more information about pattern syntax, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax.html"
     * > Segment rule pattern syntax</a>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param pattern
     *        The pattern to use for the segment. For more information about pattern syntax, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax.html"
     *        > Segment rule pattern syntax</a>.
     */

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * The pattern to use for the segment. For more information about pattern syntax, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax.html"
     * > Segment rule pattern syntax</a>.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return The pattern to use for the segment. For more information about pattern syntax, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax.html"
     *         > Segment rule pattern syntax</a>.
     */

    public String getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * The pattern to use for the segment. For more information about pattern syntax, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax.html"
     * > Segment rule pattern syntax</a>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param pattern
     *        The pattern to use for the segment. For more information about pattern syntax, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Evidently-segments.html#CloudWatch-Evidently-segments-syntax.html"
     *        > Segment rule pattern syntax</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSegmentRequest withPattern(String pattern) {
        setPattern(pattern);
        return this;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the segment.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;You can associate as many as 50 tags with a segment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @return Assigns one or more tags (key-value pairs) to the segment.</p>
     *         <p>
     *         Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *         by granting a user permission to access or change only resources with certain tag values.
     *         </p>
     *         <p>
     *         Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     *         characters.
     *         </p>
     * 
     * <pre><code> &lt;p&gt;You can associate as many as 50 tags with a segment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the segment.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;You can associate as many as 50 tags with a segment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param tags
     *        Assigns one or more tags (key-value pairs) to the segment.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     *        </p>
     *        <p>
     *        Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     *        characters.
     *        </p>
     * 
     * <pre><code> &lt;p&gt;You can associate as many as 50 tags with a segment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the segment.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;You can associate as many as 50 tags with a segment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param tags
     *        Assigns one or more tags (key-value pairs) to the segment.</p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     *        </p>
     *        <p>
     *        Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     *        characters.
     *        </p>
     * 
     *        <pre>
     * <code> &lt;p&gt;You can associate as many as 50 tags with a segment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSegmentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSegmentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSegmentRequest addTagsEntry(String key, String value) {
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

    public CreateSegmentRequest clearTagsEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern()).append(",");
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

        if (obj instanceof CreateSegmentRequest == false)
            return false;
        CreateSegmentRequest other = (CreateSegmentRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSegmentRequest clone() {
        return (CreateSegmentRequest) super.clone();
    }

}
