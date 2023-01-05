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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateExplainabilityExport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExplainabilityExportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name for the Explainability export.
     * </p>
     */
    private String explainabilityExportName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Explainability to export.
     * </p>
     */
    private String explainabilityArn;

    private DataDestination destination;
    /**
     * <p>
     * Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an optional
     * value, both of which you define. Tag keys and values are case sensitive.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each resource, each tag key must be unique and each tag key must have one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum number of tags per resource: 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging
     * schema is used across other services and resources, the character restrictions of those services also apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>. Values
     * can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, Forecast considers
     * it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of
     * <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete tag keys with this
     * prefix.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The format of the exported data, CSV or PARQUET.
     * </p>
     */
    private String format;

    /**
     * <p>
     * A unique name for the Explainability export.
     * </p>
     * 
     * @param explainabilityExportName
     *        A unique name for the Explainability export.
     */

    public void setExplainabilityExportName(String explainabilityExportName) {
        this.explainabilityExportName = explainabilityExportName;
    }

    /**
     * <p>
     * A unique name for the Explainability export.
     * </p>
     * 
     * @return A unique name for the Explainability export.
     */

    public String getExplainabilityExportName() {
        return this.explainabilityExportName;
    }

    /**
     * <p>
     * A unique name for the Explainability export.
     * </p>
     * 
     * @param explainabilityExportName
     *        A unique name for the Explainability export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExplainabilityExportRequest withExplainabilityExportName(String explainabilityExportName) {
        setExplainabilityExportName(explainabilityExportName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Explainability to export.
     * </p>
     * 
     * @param explainabilityArn
     *        The Amazon Resource Name (ARN) of the Explainability to export.
     */

    public void setExplainabilityArn(String explainabilityArn) {
        this.explainabilityArn = explainabilityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Explainability to export.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Explainability to export.
     */

    public String getExplainabilityArn() {
        return this.explainabilityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Explainability to export.
     * </p>
     * 
     * @param explainabilityArn
     *        The Amazon Resource Name (ARN) of the Explainability to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExplainabilityExportRequest withExplainabilityArn(String explainabilityArn) {
        setExplainabilityArn(explainabilityArn);
        return this;
    }

    /**
     * @param destination
     */

    public void setDestination(DataDestination destination) {
        this.destination = destination;
    }

    /**
     * @return
     */

    public DataDestination getDestination() {
        return this.destination;
    }

    /**
     * @param destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExplainabilityExportRequest withDestination(DataDestination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an optional
     * value, both of which you define. Tag keys and values are case sensitive.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each resource, each tag key must be unique and each tag key must have one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum number of tags per resource: 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging
     * schema is used across other services and resources, the character restrictions of those services also apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>. Values
     * can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, Forecast considers
     * it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of
     * <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete tag keys with this
     * prefix.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an
     *         optional value, both of which you define. Tag keys and values are case sensitive.</p>
     *         <p>
     *         The following restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For each resource, each tag key must be unique and each tag key must have one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum number of tags per resource: 50.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length: 128 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length: 256 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your
     *         tagging schema is used across other services and resources, the character restrictions of those services
     *         also apply.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>.
     *         Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not,
     *         Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the
     *         key prefix of <code>aws</code> do not count against your tags per resource limit. You cannot edit or
     *         delete tag keys with this prefix.
     *         </p>
     *         </li>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an optional
     * value, both of which you define. Tag keys and values are case sensitive.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each resource, each tag key must be unique and each tag key must have one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum number of tags per resource: 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging
     * schema is used across other services and resources, the character restrictions of those services also apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>. Values
     * can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, Forecast considers
     * it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of
     * <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete tag keys with this
     * prefix.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an
     *        optional value, both of which you define. Tag keys and values are case sensitive.</p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique and each tag key must have one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource: 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your
     *        tagging schema is used across other services and resources, the character restrictions of those services
     *        also apply.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>.
     *        Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not,
     *        Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key
     *        prefix of <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete
     *        tag keys with this prefix.
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
     * Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an optional
     * value, both of which you define. Tag keys and values are case sensitive.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each resource, each tag key must be unique and each tag key must have one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum number of tags per resource: 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging
     * schema is used across other services and resources, the character restrictions of those services also apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>. Values
     * can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, Forecast considers
     * it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of
     * <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete tag keys with this
     * prefix.
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
     *        Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an
     *        optional value, both of which you define. Tag keys and values are case sensitive.</p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique and each tag key must have one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource: 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your
     *        tagging schema is used across other services and resources, the character restrictions of those services
     *        also apply.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>.
     *        Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not,
     *        Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key
     *        prefix of <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete
     *        tag keys with this prefix.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExplainabilityExportRequest withTags(Tag... tags) {
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
     * Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an optional
     * value, both of which you define. Tag keys and values are case sensitive.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each resource, each tag key must be unique and each tag key must have one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum number of tags per resource: 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your tagging
     * schema is used across other services and resources, the character restrictions of those services also apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>. Values
     * can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not, Forecast considers
     * it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of
     * <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete tag keys with this
     * prefix.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Optional metadata to help you categorize and organize your resources. Each tag consists of a key and an
     *        optional value, both of which you define. Tag keys and values are case sensitive.</p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique and each tag key must have one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource: 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Accepted characters: all letters and numbers, spaces representable in UTF-8, and + - = . _ : / @. If your
     *        tagging schema is used across other services and resources, the character restrictions of those services
     *        also apply.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key prefixes cannot include any upper or lowercase combination of <code>aws:</code> or <code>AWS:</code>.
     *        Values can have this prefix. If a tag value has <code>aws</code> as its prefix but the key does not,
     *        Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key
     *        prefix of <code>aws</code> do not count against your tags per resource limit. You cannot edit or delete
     *        tag keys with this prefix.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExplainabilityExportRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The format of the exported data, CSV or PARQUET.
     * </p>
     * 
     * @param format
     *        The format of the exported data, CSV or PARQUET.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the exported data, CSV or PARQUET.
     * </p>
     * 
     * @return The format of the exported data, CSV or PARQUET.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the exported data, CSV or PARQUET.
     * </p>
     * 
     * @param format
     *        The format of the exported data, CSV or PARQUET.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExplainabilityExportRequest withFormat(String format) {
        setFormat(format);
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
        if (getExplainabilityExportName() != null)
            sb.append("ExplainabilityExportName: ").append(getExplainabilityExportName()).append(",");
        if (getExplainabilityArn() != null)
            sb.append("ExplainabilityArn: ").append(getExplainabilityArn()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExplainabilityExportRequest == false)
            return false;
        CreateExplainabilityExportRequest other = (CreateExplainabilityExportRequest) obj;
        if (other.getExplainabilityExportName() == null ^ this.getExplainabilityExportName() == null)
            return false;
        if (other.getExplainabilityExportName() != null && other.getExplainabilityExportName().equals(this.getExplainabilityExportName()) == false)
            return false;
        if (other.getExplainabilityArn() == null ^ this.getExplainabilityArn() == null)
            return false;
        if (other.getExplainabilityArn() != null && other.getExplainabilityArn().equals(this.getExplainabilityArn()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExplainabilityExportName() == null) ? 0 : getExplainabilityExportName().hashCode());
        hashCode = prime * hashCode + ((getExplainabilityArn() == null) ? 0 : getExplainabilityArn().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public CreateExplainabilityExportRequest clone() {
        return (CreateExplainabilityExportRequest) super.clone();
    }

}
