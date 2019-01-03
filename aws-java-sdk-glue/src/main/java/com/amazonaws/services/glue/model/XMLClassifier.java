/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A classifier for <code>XML</code> content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/XMLClassifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XMLClassifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the classifier.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An identifier of the data format that the classifier matches.
     * </p>
     */
    private String classification;
    /**
     * <p>
     * The time this classifier was registered.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time this classifier was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * The version of this classifier.
     * </p>
     */
    private Long version;
    /**
     * <p>
     * The XML tag designating the element that contains each record in an XML document being parsed. Note that this
     * cannot identify a self-closing element (closed by <code>/&gt;</code>). An empty row element that contains only
     * attributes can be parsed as long as it ends with a closing tag (for example,
     * <code>&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;</code> is okay, but
     * <code>&lt;row item_a="A" item_b="B" /&gt;</code> is not).
     * </p>
     */
    private String rowTag;

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * 
     * @param name
     *        The name of the classifier.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * 
     * @return The name of the classifier.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * 
     * @param name
     *        The name of the classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XMLClassifier withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An identifier of the data format that the classifier matches.
     * </p>
     * 
     * @param classification
     *        An identifier of the data format that the classifier matches.
     */

    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * <p>
     * An identifier of the data format that the classifier matches.
     * </p>
     * 
     * @return An identifier of the data format that the classifier matches.
     */

    public String getClassification() {
        return this.classification;
    }

    /**
     * <p>
     * An identifier of the data format that the classifier matches.
     * </p>
     * 
     * @param classification
     *        An identifier of the data format that the classifier matches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XMLClassifier withClassification(String classification) {
        setClassification(classification);
        return this;
    }

    /**
     * <p>
     * The time this classifier was registered.
     * </p>
     * 
     * @param creationTime
     *        The time this classifier was registered.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time this classifier was registered.
     * </p>
     * 
     * @return The time this classifier was registered.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time this classifier was registered.
     * </p>
     * 
     * @param creationTime
     *        The time this classifier was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XMLClassifier withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time this classifier was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time this classifier was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The time this classifier was last updated.
     * </p>
     * 
     * @return The time this classifier was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The time this classifier was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The time this classifier was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XMLClassifier withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The version of this classifier.
     * </p>
     * 
     * @param version
     *        The version of this classifier.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of this classifier.
     * </p>
     * 
     * @return The version of this classifier.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of this classifier.
     * </p>
     * 
     * @param version
     *        The version of this classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XMLClassifier withVersion(Long version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The XML tag designating the element that contains each record in an XML document being parsed. Note that this
     * cannot identify a self-closing element (closed by <code>/&gt;</code>). An empty row element that contains only
     * attributes can be parsed as long as it ends with a closing tag (for example,
     * <code>&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;</code> is okay, but
     * <code>&lt;row item_a="A" item_b="B" /&gt;</code> is not).
     * </p>
     * 
     * @param rowTag
     *        The XML tag designating the element that contains each record in an XML document being parsed. Note that
     *        this cannot identify a self-closing element (closed by <code>/&gt;</code>). An empty row element that
     *        contains only attributes can be parsed as long as it ends with a closing tag (for example,
     *        <code>&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;</code> is okay, but
     *        <code>&lt;row item_a="A" item_b="B" /&gt;</code> is not).
     */

    public void setRowTag(String rowTag) {
        this.rowTag = rowTag;
    }

    /**
     * <p>
     * The XML tag designating the element that contains each record in an XML document being parsed. Note that this
     * cannot identify a self-closing element (closed by <code>/&gt;</code>). An empty row element that contains only
     * attributes can be parsed as long as it ends with a closing tag (for example,
     * <code>&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;</code> is okay, but
     * <code>&lt;row item_a="A" item_b="B" /&gt;</code> is not).
     * </p>
     * 
     * @return The XML tag designating the element that contains each record in an XML document being parsed. Note that
     *         this cannot identify a self-closing element (closed by <code>/&gt;</code>). An empty row element that
     *         contains only attributes can be parsed as long as it ends with a closing tag (for example,
     *         <code>&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;</code> is okay, but
     *         <code>&lt;row item_a="A" item_b="B" /&gt;</code> is not).
     */

    public String getRowTag() {
        return this.rowTag;
    }

    /**
     * <p>
     * The XML tag designating the element that contains each record in an XML document being parsed. Note that this
     * cannot identify a self-closing element (closed by <code>/&gt;</code>). An empty row element that contains only
     * attributes can be parsed as long as it ends with a closing tag (for example,
     * <code>&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;</code> is okay, but
     * <code>&lt;row item_a="A" item_b="B" /&gt;</code> is not).
     * </p>
     * 
     * @param rowTag
     *        The XML tag designating the element that contains each record in an XML document being parsed. Note that
     *        this cannot identify a self-closing element (closed by <code>/&gt;</code>). An empty row element that
     *        contains only attributes can be parsed as long as it ends with a closing tag (for example,
     *        <code>&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;</code> is okay, but
     *        <code>&lt;row item_a="A" item_b="B" /&gt;</code> is not).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public XMLClassifier withRowTag(String rowTag) {
        setRowTag(rowTag);
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
        if (getClassification() != null)
            sb.append("Classification: ").append(getClassification()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getRowTag() != null)
            sb.append("RowTag: ").append(getRowTag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof XMLClassifier == false)
            return false;
        XMLClassifier other = (XMLClassifier) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getClassification() == null ^ this.getClassification() == null)
            return false;
        if (other.getClassification() != null && other.getClassification().equals(this.getClassification()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getRowTag() == null ^ this.getRowTag() == null)
            return false;
        if (other.getRowTag() != null && other.getRowTag().equals(this.getRowTag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getClassification() == null) ? 0 : getClassification().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getRowTag() == null) ? 0 : getRowTag().hashCode());
        return hashCode;
    }

    @Override
    public XMLClassifier clone() {
        try {
            return (XMLClassifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.XMLClassifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
