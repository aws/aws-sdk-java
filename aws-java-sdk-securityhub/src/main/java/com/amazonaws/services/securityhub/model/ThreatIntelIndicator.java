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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Threat intel details related to a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ThreatIntelIndicator" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThreatIntelIndicator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of a threat intel indicator.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The value of a threat intel indicator.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The category of a threat intel indicator.
     * </p>
     */
    private String category;
    /**
     * <p>
     * The date/time of the last observation of a threat intel indicator.
     * </p>
     */
    private String lastObservedAt;
    /**
     * <p>
     * The source of the threat intel.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The URL for more details from the source of the threat intel.
     * </p>
     */
    private String sourceUrl;

    /**
     * <p>
     * The type of a threat intel indicator.
     * </p>
     * 
     * @param type
     *        The type of a threat intel indicator.
     * @see ThreatIntelIndicatorType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of a threat intel indicator.
     * </p>
     * 
     * @return The type of a threat intel indicator.
     * @see ThreatIntelIndicatorType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of a threat intel indicator.
     * </p>
     * 
     * @param type
     *        The type of a threat intel indicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThreatIntelIndicatorType
     */

    public ThreatIntelIndicator withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of a threat intel indicator.
     * </p>
     * 
     * @param type
     *        The type of a threat intel indicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThreatIntelIndicatorType
     */

    public ThreatIntelIndicator withType(ThreatIntelIndicatorType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The value of a threat intel indicator.
     * </p>
     * 
     * @param value
     *        The value of a threat intel indicator.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of a threat intel indicator.
     * </p>
     * 
     * @return The value of a threat intel indicator.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of a threat intel indicator.
     * </p>
     * 
     * @param value
     *        The value of a threat intel indicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThreatIntelIndicator withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The category of a threat intel indicator.
     * </p>
     * 
     * @param category
     *        The category of a threat intel indicator.
     * @see ThreatIntelIndicatorCategory
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of a threat intel indicator.
     * </p>
     * 
     * @return The category of a threat intel indicator.
     * @see ThreatIntelIndicatorCategory
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of a threat intel indicator.
     * </p>
     * 
     * @param category
     *        The category of a threat intel indicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThreatIntelIndicatorCategory
     */

    public ThreatIntelIndicator withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The category of a threat intel indicator.
     * </p>
     * 
     * @param category
     *        The category of a threat intel indicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThreatIntelIndicatorCategory
     */

    public ThreatIntelIndicator withCategory(ThreatIntelIndicatorCategory category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * The date/time of the last observation of a threat intel indicator.
     * </p>
     * 
     * @param lastObservedAt
     *        The date/time of the last observation of a threat intel indicator.
     */

    public void setLastObservedAt(String lastObservedAt) {
        this.lastObservedAt = lastObservedAt;
    }

    /**
     * <p>
     * The date/time of the last observation of a threat intel indicator.
     * </p>
     * 
     * @return The date/time of the last observation of a threat intel indicator.
     */

    public String getLastObservedAt() {
        return this.lastObservedAt;
    }

    /**
     * <p>
     * The date/time of the last observation of a threat intel indicator.
     * </p>
     * 
     * @param lastObservedAt
     *        The date/time of the last observation of a threat intel indicator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThreatIntelIndicator withLastObservedAt(String lastObservedAt) {
        setLastObservedAt(lastObservedAt);
        return this;
    }

    /**
     * <p>
     * The source of the threat intel.
     * </p>
     * 
     * @param source
     *        The source of the threat intel.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the threat intel.
     * </p>
     * 
     * @return The source of the threat intel.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the threat intel.
     * </p>
     * 
     * @param source
     *        The source of the threat intel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThreatIntelIndicator withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The URL for more details from the source of the threat intel.
     * </p>
     * 
     * @param sourceUrl
     *        The URL for more details from the source of the threat intel.
     */

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    /**
     * <p>
     * The URL for more details from the source of the threat intel.
     * </p>
     * 
     * @return The URL for more details from the source of the threat intel.
     */

    public String getSourceUrl() {
        return this.sourceUrl;
    }

    /**
     * <p>
     * The URL for more details from the source of the threat intel.
     * </p>
     * 
     * @param sourceUrl
     *        The URL for more details from the source of the threat intel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThreatIntelIndicator withSourceUrl(String sourceUrl) {
        setSourceUrl(sourceUrl);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getLastObservedAt() != null)
            sb.append("LastObservedAt: ").append(getLastObservedAt()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSourceUrl() != null)
            sb.append("SourceUrl: ").append(getSourceUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThreatIntelIndicator == false)
            return false;
        ThreatIntelIndicator other = (ThreatIntelIndicator) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getLastObservedAt() == null ^ this.getLastObservedAt() == null)
            return false;
        if (other.getLastObservedAt() != null && other.getLastObservedAt().equals(this.getLastObservedAt()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSourceUrl() == null ^ this.getSourceUrl() == null)
            return false;
        if (other.getSourceUrl() != null && other.getSourceUrl().equals(this.getSourceUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getLastObservedAt() == null) ? 0 : getLastObservedAt().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSourceUrl() == null) ? 0 : getSourceUrl().hashCode());
        return hashCode;
    }

    @Override
    public ThreatIntelIndicator clone() {
        try {
            return (ThreatIntelIndicator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ThreatIntelIndicatorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
