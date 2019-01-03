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
 * A classifier that uses <code>grok</code> patterns.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GrokClassifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrokClassifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the classifier.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, and so on.
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
     * The grok pattern applied to a data store by this classifier. For more information, see built-in patterns in <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html">Writing Custom Classifers</a>.
     * </p>
     */
    private String grokPattern;
    /**
     * <p>
     * Optional custom grok patterns defined by this classifier. For more information, see custom patterns in <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html">Writing Custom Classifers</a>.
     * </p>
     */
    private String customPatterns;

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

    public GrokClassifier withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, and so on.
     * </p>
     * 
     * @param classification
     *        An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, and so
     *        on.
     */

    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * <p>
     * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, and so on.
     * </p>
     * 
     * @return An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, and
     *         so on.
     */

    public String getClassification() {
        return this.classification;
    }

    /**
     * <p>
     * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, and so on.
     * </p>
     * 
     * @param classification
     *        An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, and so
     *        on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrokClassifier withClassification(String classification) {
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

    public GrokClassifier withCreationTime(java.util.Date creationTime) {
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

    public GrokClassifier withLastUpdated(java.util.Date lastUpdated) {
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

    public GrokClassifier withVersion(Long version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The grok pattern applied to a data store by this classifier. For more information, see built-in patterns in <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html">Writing Custom Classifers</a>.
     * </p>
     * 
     * @param grokPattern
     *        The grok pattern applied to a data store by this classifier. For more information, see built-in patterns
     *        in <a href="http://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html">Writing Custom
     *        Classifers</a>.
     */

    public void setGrokPattern(String grokPattern) {
        this.grokPattern = grokPattern;
    }

    /**
     * <p>
     * The grok pattern applied to a data store by this classifier. For more information, see built-in patterns in <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html">Writing Custom Classifers</a>.
     * </p>
     * 
     * @return The grok pattern applied to a data store by this classifier. For more information, see built-in patterns
     *         in <a href="http://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html">Writing Custom
     *         Classifers</a>.
     */

    public String getGrokPattern() {
        return this.grokPattern;
    }

    /**
     * <p>
     * The grok pattern applied to a data store by this classifier. For more information, see built-in patterns in <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html">Writing Custom Classifers</a>.
     * </p>
     * 
     * @param grokPattern
     *        The grok pattern applied to a data store by this classifier. For more information, see built-in patterns
     *        in <a href="http://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html">Writing Custom
     *        Classifers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrokClassifier withGrokPattern(String grokPattern) {
        setGrokPattern(grokPattern);
        return this;
    }

    /**
     * <p>
     * Optional custom grok patterns defined by this classifier. For more information, see custom patterns in <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html">Writing Custom Classifers</a>.
     * </p>
     * 
     * @param customPatterns
     *        Optional custom grok patterns defined by this classifier. For more information, see custom patterns in <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html">Writing Custom Classifers</a>.
     */

    public void setCustomPatterns(String customPatterns) {
        this.customPatterns = customPatterns;
    }

    /**
     * <p>
     * Optional custom grok patterns defined by this classifier. For more information, see custom patterns in <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html">Writing Custom Classifers</a>.
     * </p>
     * 
     * @return Optional custom grok patterns defined by this classifier. For more information, see custom patterns in <a
     *         href="http://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html">Writing Custom Classifers</a>.
     */

    public String getCustomPatterns() {
        return this.customPatterns;
    }

    /**
     * <p>
     * Optional custom grok patterns defined by this classifier. For more information, see custom patterns in <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html">Writing Custom Classifers</a>.
     * </p>
     * 
     * @param customPatterns
     *        Optional custom grok patterns defined by this classifier. For more information, see custom patterns in <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html">Writing Custom Classifers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrokClassifier withCustomPatterns(String customPatterns) {
        setCustomPatterns(customPatterns);
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
        if (getGrokPattern() != null)
            sb.append("GrokPattern: ").append(getGrokPattern()).append(",");
        if (getCustomPatterns() != null)
            sb.append("CustomPatterns: ").append(getCustomPatterns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrokClassifier == false)
            return false;
        GrokClassifier other = (GrokClassifier) obj;
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
        if (other.getGrokPattern() == null ^ this.getGrokPattern() == null)
            return false;
        if (other.getGrokPattern() != null && other.getGrokPattern().equals(this.getGrokPattern()) == false)
            return false;
        if (other.getCustomPatterns() == null ^ this.getCustomPatterns() == null)
            return false;
        if (other.getCustomPatterns() != null && other.getCustomPatterns().equals(this.getCustomPatterns()) == false)
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
        hashCode = prime * hashCode + ((getGrokPattern() == null) ? 0 : getGrokPattern().hashCode());
        hashCode = prime * hashCode + ((getCustomPatterns() == null) ? 0 : getCustomPatterns().hashCode());
        return hashCode;
    }

    @Override
    public GrokClassifier clone() {
        try {
            return (GrokClassifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.GrokClassifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
