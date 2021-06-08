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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Control mapping fields that represent the source for evidence collection, along with related parameters and metadata.
 * This does not contain <code>mappingID</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateControlMappingSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateControlMappingSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the control mapping data source.
     * </p>
     */
    private String sourceName;
    /**
     * <p>
     * The description of the data source that determines from where AWS Audit Manager collects evidence for the
     * control.
     * </p>
     */
    private String sourceDescription;
    /**
     * <p>
     * The setup option for the data source, which reflects if the evidence collection is automated or manual.
     * </p>
     */
    private String sourceSetUpOption;
    /**
     * <p>
     * Specifies one of the five types of data sources for evidence collection.
     * </p>
     */
    private String sourceType;

    private SourceKeyword sourceKeyword;
    /**
     * <p>
     * The frequency of evidence collection for the specified control mapping source.
     * </p>
     */
    private String sourceFrequency;
    /**
     * <p>
     * The instructions for troubleshooting the specified control.
     * </p>
     */
    private String troubleshootingText;

    /**
     * <p>
     * The name of the control mapping data source.
     * </p>
     * 
     * @param sourceName
     *        The name of the control mapping data source.
     */

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * <p>
     * The name of the control mapping data source.
     * </p>
     * 
     * @return The name of the control mapping data source.
     */

    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * <p>
     * The name of the control mapping data source.
     * </p>
     * 
     * @param sourceName
     *        The name of the control mapping data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateControlMappingSource withSourceName(String sourceName) {
        setSourceName(sourceName);
        return this;
    }

    /**
     * <p>
     * The description of the data source that determines from where AWS Audit Manager collects evidence for the
     * control.
     * </p>
     * 
     * @param sourceDescription
     *        The description of the data source that determines from where AWS Audit Manager collects evidence for the
     *        control.
     */

    public void setSourceDescription(String sourceDescription) {
        this.sourceDescription = sourceDescription;
    }

    /**
     * <p>
     * The description of the data source that determines from where AWS Audit Manager collects evidence for the
     * control.
     * </p>
     * 
     * @return The description of the data source that determines from where AWS Audit Manager collects evidence for the
     *         control.
     */

    public String getSourceDescription() {
        return this.sourceDescription;
    }

    /**
     * <p>
     * The description of the data source that determines from where AWS Audit Manager collects evidence for the
     * control.
     * </p>
     * 
     * @param sourceDescription
     *        The description of the data source that determines from where AWS Audit Manager collects evidence for the
     *        control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateControlMappingSource withSourceDescription(String sourceDescription) {
        setSourceDescription(sourceDescription);
        return this;
    }

    /**
     * <p>
     * The setup option for the data source, which reflects if the evidence collection is automated or manual.
     * </p>
     * 
     * @param sourceSetUpOption
     *        The setup option for the data source, which reflects if the evidence collection is automated or manual.
     * @see SourceSetUpOption
     */

    public void setSourceSetUpOption(String sourceSetUpOption) {
        this.sourceSetUpOption = sourceSetUpOption;
    }

    /**
     * <p>
     * The setup option for the data source, which reflects if the evidence collection is automated or manual.
     * </p>
     * 
     * @return The setup option for the data source, which reflects if the evidence collection is automated or manual.
     * @see SourceSetUpOption
     */

    public String getSourceSetUpOption() {
        return this.sourceSetUpOption;
    }

    /**
     * <p>
     * The setup option for the data source, which reflects if the evidence collection is automated or manual.
     * </p>
     * 
     * @param sourceSetUpOption
     *        The setup option for the data source, which reflects if the evidence collection is automated or manual.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceSetUpOption
     */

    public CreateControlMappingSource withSourceSetUpOption(String sourceSetUpOption) {
        setSourceSetUpOption(sourceSetUpOption);
        return this;
    }

    /**
     * <p>
     * The setup option for the data source, which reflects if the evidence collection is automated or manual.
     * </p>
     * 
     * @param sourceSetUpOption
     *        The setup option for the data source, which reflects if the evidence collection is automated or manual.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceSetUpOption
     */

    public CreateControlMappingSource withSourceSetUpOption(SourceSetUpOption sourceSetUpOption) {
        this.sourceSetUpOption = sourceSetUpOption.toString();
        return this;
    }

    /**
     * <p>
     * Specifies one of the five types of data sources for evidence collection.
     * </p>
     * 
     * @param sourceType
     *        Specifies one of the five types of data sources for evidence collection.
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * Specifies one of the five types of data sources for evidence collection.
     * </p>
     * 
     * @return Specifies one of the five types of data sources for evidence collection.
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * Specifies one of the five types of data sources for evidence collection.
     * </p>
     * 
     * @param sourceType
     *        Specifies one of the five types of data sources for evidence collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public CreateControlMappingSource withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * Specifies one of the five types of data sources for evidence collection.
     * </p>
     * 
     * @param sourceType
     *        Specifies one of the five types of data sources for evidence collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public CreateControlMappingSource withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * @param sourceKeyword
     */

    public void setSourceKeyword(SourceKeyword sourceKeyword) {
        this.sourceKeyword = sourceKeyword;
    }

    /**
     * @return
     */

    public SourceKeyword getSourceKeyword() {
        return this.sourceKeyword;
    }

    /**
     * @param sourceKeyword
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateControlMappingSource withSourceKeyword(SourceKeyword sourceKeyword) {
        setSourceKeyword(sourceKeyword);
        return this;
    }

    /**
     * <p>
     * The frequency of evidence collection for the specified control mapping source.
     * </p>
     * 
     * @param sourceFrequency
     *        The frequency of evidence collection for the specified control mapping source.
     * @see SourceFrequency
     */

    public void setSourceFrequency(String sourceFrequency) {
        this.sourceFrequency = sourceFrequency;
    }

    /**
     * <p>
     * The frequency of evidence collection for the specified control mapping source.
     * </p>
     * 
     * @return The frequency of evidence collection for the specified control mapping source.
     * @see SourceFrequency
     */

    public String getSourceFrequency() {
        return this.sourceFrequency;
    }

    /**
     * <p>
     * The frequency of evidence collection for the specified control mapping source.
     * </p>
     * 
     * @param sourceFrequency
     *        The frequency of evidence collection for the specified control mapping source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceFrequency
     */

    public CreateControlMappingSource withSourceFrequency(String sourceFrequency) {
        setSourceFrequency(sourceFrequency);
        return this;
    }

    /**
     * <p>
     * The frequency of evidence collection for the specified control mapping source.
     * </p>
     * 
     * @param sourceFrequency
     *        The frequency of evidence collection for the specified control mapping source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceFrequency
     */

    public CreateControlMappingSource withSourceFrequency(SourceFrequency sourceFrequency) {
        this.sourceFrequency = sourceFrequency.toString();
        return this;
    }

    /**
     * <p>
     * The instructions for troubleshooting the specified control.
     * </p>
     * 
     * @param troubleshootingText
     *        The instructions for troubleshooting the specified control.
     */

    public void setTroubleshootingText(String troubleshootingText) {
        this.troubleshootingText = troubleshootingText;
    }

    /**
     * <p>
     * The instructions for troubleshooting the specified control.
     * </p>
     * 
     * @return The instructions for troubleshooting the specified control.
     */

    public String getTroubleshootingText() {
        return this.troubleshootingText;
    }

    /**
     * <p>
     * The instructions for troubleshooting the specified control.
     * </p>
     * 
     * @param troubleshootingText
     *        The instructions for troubleshooting the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateControlMappingSource withTroubleshootingText(String troubleshootingText) {
        setTroubleshootingText(troubleshootingText);
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
        if (getSourceName() != null)
            sb.append("SourceName: ").append(getSourceName()).append(",");
        if (getSourceDescription() != null)
            sb.append("SourceDescription: ").append(getSourceDescription()).append(",");
        if (getSourceSetUpOption() != null)
            sb.append("SourceSetUpOption: ").append(getSourceSetUpOption()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getSourceKeyword() != null)
            sb.append("SourceKeyword: ").append(getSourceKeyword()).append(",");
        if (getSourceFrequency() != null)
            sb.append("SourceFrequency: ").append(getSourceFrequency()).append(",");
        if (getTroubleshootingText() != null)
            sb.append("TroubleshootingText: ").append(getTroubleshootingText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateControlMappingSource == false)
            return false;
        CreateControlMappingSource other = (CreateControlMappingSource) obj;
        if (other.getSourceName() == null ^ this.getSourceName() == null)
            return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false)
            return false;
        if (other.getSourceDescription() == null ^ this.getSourceDescription() == null)
            return false;
        if (other.getSourceDescription() != null && other.getSourceDescription().equals(this.getSourceDescription()) == false)
            return false;
        if (other.getSourceSetUpOption() == null ^ this.getSourceSetUpOption() == null)
            return false;
        if (other.getSourceSetUpOption() != null && other.getSourceSetUpOption().equals(this.getSourceSetUpOption()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getSourceKeyword() == null ^ this.getSourceKeyword() == null)
            return false;
        if (other.getSourceKeyword() != null && other.getSourceKeyword().equals(this.getSourceKeyword()) == false)
            return false;
        if (other.getSourceFrequency() == null ^ this.getSourceFrequency() == null)
            return false;
        if (other.getSourceFrequency() != null && other.getSourceFrequency().equals(this.getSourceFrequency()) == false)
            return false;
        if (other.getTroubleshootingText() == null ^ this.getTroubleshootingText() == null)
            return false;
        if (other.getTroubleshootingText() != null && other.getTroubleshootingText().equals(this.getTroubleshootingText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode());
        hashCode = prime * hashCode + ((getSourceDescription() == null) ? 0 : getSourceDescription().hashCode());
        hashCode = prime * hashCode + ((getSourceSetUpOption() == null) ? 0 : getSourceSetUpOption().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getSourceKeyword() == null) ? 0 : getSourceKeyword().hashCode());
        hashCode = prime * hashCode + ((getSourceFrequency() == null) ? 0 : getSourceFrequency().hashCode());
        hashCode = prime * hashCode + ((getTroubleshootingText() == null) ? 0 : getTroubleshootingText().hashCode());
        return hashCode;
    }

    @Override
    public CreateControlMappingSource clone() {
        try {
            return (CreateControlMappingSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.CreateControlMappingSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
