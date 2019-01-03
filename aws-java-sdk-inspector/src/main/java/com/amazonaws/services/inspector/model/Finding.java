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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an Amazon Inspector finding. This data type is used as the response element in the
 * <a>DescribeFindings</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/Finding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Finding implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN that specifies the finding.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The schema version of this data type.
     * </p>
     */
    private Integer schemaVersion;
    /**
     * <p>
     * The data element is set to "Inspector".
     * </p>
     */
    private String service;
    /**
     * <p>
     * This data type is used in the <a>Finding</a> data type.
     * </p>
     */
    private InspectorServiceAttributes serviceAttributes;
    /**
     * <p>
     * The type of the host from which the finding is generated.
     * </p>
     */
    private String assetType;
    /**
     * <p>
     * A collection of attributes of the host from which the finding is generated.
     * </p>
     */
    private AssetAttributes assetAttributes;
    /**
     * <p>
     * The ID of the finding.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the finding.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The description of the finding.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The recommendation for the finding.
     * </p>
     */
    private String recommendation;
    /**
     * <p>
     * The finding severity. Values can be set to High, Medium, Low, and Informational.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The numeric value of the finding severity.
     * </p>
     */
    private Double numericSeverity;
    /**
     * <p>
     * This data element is currently not used.
     * </p>
     */
    private Integer confidence;
    /**
     * <p>
     * This data element is currently not used.
     * </p>
     */
    private Boolean indicatorOfCompromise;
    /**
     * <p>
     * The system-defined attributes for the finding.
     * </p>
     */
    private java.util.List<Attribute> attributes;
    /**
     * <p>
     * The user-defined attributes that are assigned to the finding.
     * </p>
     */
    private java.util.List<Attribute> userAttributes;
    /**
     * <p>
     * The time when the finding was generated.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time when <a>AddAttributesToFindings</a> is called.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ARN that specifies the finding.
     * </p>
     * 
     * @param arn
     *        The ARN that specifies the finding.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN that specifies the finding.
     * </p>
     * 
     * @return The ARN that specifies the finding.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN that specifies the finding.
     * </p>
     * 
     * @param arn
     *        The ARN that specifies the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The schema version of this data type.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version of this data type.
     */

    public void setSchemaVersion(Integer schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The schema version of this data type.
     * </p>
     * 
     * @return The schema version of this data type.
     */

    public Integer getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * <p>
     * The schema version of this data type.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version of this data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withSchemaVersion(Integer schemaVersion) {
        setSchemaVersion(schemaVersion);
        return this;
    }

    /**
     * <p>
     * The data element is set to "Inspector".
     * </p>
     * 
     * @param service
     *        The data element is set to "Inspector".
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The data element is set to "Inspector".
     * </p>
     * 
     * @return The data element is set to "Inspector".
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The data element is set to "Inspector".
     * </p>
     * 
     * @param service
     *        The data element is set to "Inspector".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * This data type is used in the <a>Finding</a> data type.
     * </p>
     * 
     * @param serviceAttributes
     *        This data type is used in the <a>Finding</a> data type.
     */

    public void setServiceAttributes(InspectorServiceAttributes serviceAttributes) {
        this.serviceAttributes = serviceAttributes;
    }

    /**
     * <p>
     * This data type is used in the <a>Finding</a> data type.
     * </p>
     * 
     * @return This data type is used in the <a>Finding</a> data type.
     */

    public InspectorServiceAttributes getServiceAttributes() {
        return this.serviceAttributes;
    }

    /**
     * <p>
     * This data type is used in the <a>Finding</a> data type.
     * </p>
     * 
     * @param serviceAttributes
     *        This data type is used in the <a>Finding</a> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withServiceAttributes(InspectorServiceAttributes serviceAttributes) {
        setServiceAttributes(serviceAttributes);
        return this;
    }

    /**
     * <p>
     * The type of the host from which the finding is generated.
     * </p>
     * 
     * @param assetType
     *        The type of the host from which the finding is generated.
     * @see AssetType
     */

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    /**
     * <p>
     * The type of the host from which the finding is generated.
     * </p>
     * 
     * @return The type of the host from which the finding is generated.
     * @see AssetType
     */

    public String getAssetType() {
        return this.assetType;
    }

    /**
     * <p>
     * The type of the host from which the finding is generated.
     * </p>
     * 
     * @param assetType
     *        The type of the host from which the finding is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetType
     */

    public Finding withAssetType(String assetType) {
        setAssetType(assetType);
        return this;
    }

    /**
     * <p>
     * The type of the host from which the finding is generated.
     * </p>
     * 
     * @param assetType
     *        The type of the host from which the finding is generated.
     * @see AssetType
     */

    public void setAssetType(AssetType assetType) {
        withAssetType(assetType);
    }

    /**
     * <p>
     * The type of the host from which the finding is generated.
     * </p>
     * 
     * @param assetType
     *        The type of the host from which the finding is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetType
     */

    public Finding withAssetType(AssetType assetType) {
        this.assetType = assetType.toString();
        return this;
    }

    /**
     * <p>
     * A collection of attributes of the host from which the finding is generated.
     * </p>
     * 
     * @param assetAttributes
     *        A collection of attributes of the host from which the finding is generated.
     */

    public void setAssetAttributes(AssetAttributes assetAttributes) {
        this.assetAttributes = assetAttributes;
    }

    /**
     * <p>
     * A collection of attributes of the host from which the finding is generated.
     * </p>
     * 
     * @return A collection of attributes of the host from which the finding is generated.
     */

    public AssetAttributes getAssetAttributes() {
        return this.assetAttributes;
    }

    /**
     * <p>
     * A collection of attributes of the host from which the finding is generated.
     * </p>
     * 
     * @param assetAttributes
     *        A collection of attributes of the host from which the finding is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withAssetAttributes(AssetAttributes assetAttributes) {
        setAssetAttributes(assetAttributes);
        return this;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     * 
     * @param id
     *        The ID of the finding.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     * 
     * @return The ID of the finding.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     * 
     * @param id
     *        The ID of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the finding.
     * </p>
     * 
     * @param title
     *        The name of the finding.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The name of the finding.
     * </p>
     * 
     * @return The name of the finding.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The name of the finding.
     * </p>
     * 
     * @param title
     *        The name of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @param description
     *        The description of the finding.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @return The description of the finding.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @param description
     *        The description of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The recommendation for the finding.
     * </p>
     * 
     * @param recommendation
     *        The recommendation for the finding.
     */

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * <p>
     * The recommendation for the finding.
     * </p>
     * 
     * @return The recommendation for the finding.
     */

    public String getRecommendation() {
        return this.recommendation;
    }

    /**
     * <p>
     * The recommendation for the finding.
     * </p>
     * 
     * @param recommendation
     *        The recommendation for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withRecommendation(String recommendation) {
        setRecommendation(recommendation);
        return this;
    }

    /**
     * <p>
     * The finding severity. Values can be set to High, Medium, Low, and Informational.
     * </p>
     * 
     * @param severity
     *        The finding severity. Values can be set to High, Medium, Low, and Informational.
     * @see Severity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The finding severity. Values can be set to High, Medium, Low, and Informational.
     * </p>
     * 
     * @return The finding severity. Values can be set to High, Medium, Low, and Informational.
     * @see Severity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The finding severity. Values can be set to High, Medium, Low, and Informational.
     * </p>
     * 
     * @param severity
     *        The finding severity. Values can be set to High, Medium, Low, and Informational.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Severity
     */

    public Finding withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The finding severity. Values can be set to High, Medium, Low, and Informational.
     * </p>
     * 
     * @param severity
     *        The finding severity. Values can be set to High, Medium, Low, and Informational.
     * @see Severity
     */

    public void setSeverity(Severity severity) {
        withSeverity(severity);
    }

    /**
     * <p>
     * The finding severity. Values can be set to High, Medium, Low, and Informational.
     * </p>
     * 
     * @param severity
     *        The finding severity. Values can be set to High, Medium, Low, and Informational.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Severity
     */

    public Finding withSeverity(Severity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * The numeric value of the finding severity.
     * </p>
     * 
     * @param numericSeverity
     *        The numeric value of the finding severity.
     */

    public void setNumericSeverity(Double numericSeverity) {
        this.numericSeverity = numericSeverity;
    }

    /**
     * <p>
     * The numeric value of the finding severity.
     * </p>
     * 
     * @return The numeric value of the finding severity.
     */

    public Double getNumericSeverity() {
        return this.numericSeverity;
    }

    /**
     * <p>
     * The numeric value of the finding severity.
     * </p>
     * 
     * @param numericSeverity
     *        The numeric value of the finding severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withNumericSeverity(Double numericSeverity) {
        setNumericSeverity(numericSeverity);
        return this;
    }

    /**
     * <p>
     * This data element is currently not used.
     * </p>
     * 
     * @param confidence
     *        This data element is currently not used.
     */

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * This data element is currently not used.
     * </p>
     * 
     * @return This data element is currently not used.
     */

    public Integer getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * This data element is currently not used.
     * </p>
     * 
     * @param confidence
     *        This data element is currently not used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withConfidence(Integer confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * This data element is currently not used.
     * </p>
     * 
     * @param indicatorOfCompromise
     *        This data element is currently not used.
     */

    public void setIndicatorOfCompromise(Boolean indicatorOfCompromise) {
        this.indicatorOfCompromise = indicatorOfCompromise;
    }

    /**
     * <p>
     * This data element is currently not used.
     * </p>
     * 
     * @return This data element is currently not used.
     */

    public Boolean getIndicatorOfCompromise() {
        return this.indicatorOfCompromise;
    }

    /**
     * <p>
     * This data element is currently not used.
     * </p>
     * 
     * @param indicatorOfCompromise
     *        This data element is currently not used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withIndicatorOfCompromise(Boolean indicatorOfCompromise) {
        setIndicatorOfCompromise(indicatorOfCompromise);
        return this;
    }

    /**
     * <p>
     * This data element is currently not used.
     * </p>
     * 
     * @return This data element is currently not used.
     */

    public Boolean isIndicatorOfCompromise() {
        return this.indicatorOfCompromise;
    }

    /**
     * <p>
     * The system-defined attributes for the finding.
     * </p>
     * 
     * @return The system-defined attributes for the finding.
     */

    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The system-defined attributes for the finding.
     * </p>
     * 
     * @param attributes
     *        The system-defined attributes for the finding.
     */

    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<Attribute>(attributes);
    }

    /**
     * <p>
     * The system-defined attributes for the finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The system-defined attributes for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withAttributes(Attribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<Attribute>(attributes.length));
        }
        for (Attribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The system-defined attributes for the finding.
     * </p>
     * 
     * @param attributes
     *        The system-defined attributes for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to the finding.
     * </p>
     * 
     * @return The user-defined attributes that are assigned to the finding.
     */

    public java.util.List<Attribute> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to the finding.
     * </p>
     * 
     * @param userAttributes
     *        The user-defined attributes that are assigned to the finding.
     */

    public void setUserAttributes(java.util.Collection<Attribute> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }

        this.userAttributes = new java.util.ArrayList<Attribute>(userAttributes);
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to the finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAttributes(java.util.Collection)} or {@link #withUserAttributes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userAttributes
     *        The user-defined attributes that are assigned to the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withUserAttributes(Attribute... userAttributes) {
        if (this.userAttributes == null) {
            setUserAttributes(new java.util.ArrayList<Attribute>(userAttributes.length));
        }
        for (Attribute ele : userAttributes) {
            this.userAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to the finding.
     * </p>
     * 
     * @param userAttributes
     *        The user-defined attributes that are assigned to the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withUserAttributes(java.util.Collection<Attribute> userAttributes) {
        setUserAttributes(userAttributes);
        return this;
    }

    /**
     * <p>
     * The time when the finding was generated.
     * </p>
     * 
     * @param createdAt
     *        The time when the finding was generated.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the finding was generated.
     * </p>
     * 
     * @return The time when the finding was generated.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the finding was generated.
     * </p>
     * 
     * @param createdAt
     *        The time when the finding was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time when <a>AddAttributesToFindings</a> is called.
     * </p>
     * 
     * @param updatedAt
     *        The time when <a>AddAttributesToFindings</a> is called.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time when <a>AddAttributesToFindings</a> is called.
     * </p>
     * 
     * @return The time when <a>AddAttributesToFindings</a> is called.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time when <a>AddAttributesToFindings</a> is called.
     * </p>
     * 
     * @param updatedAt
     *        The time when <a>AddAttributesToFindings</a> is called.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: ").append(getSchemaVersion()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getServiceAttributes() != null)
            sb.append("ServiceAttributes: ").append(getServiceAttributes()).append(",");
        if (getAssetType() != null)
            sb.append("AssetType: ").append(getAssetType()).append(",");
        if (getAssetAttributes() != null)
            sb.append("AssetAttributes: ").append(getAssetAttributes()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRecommendation() != null)
            sb.append("Recommendation: ").append(getRecommendation()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getNumericSeverity() != null)
            sb.append("NumericSeverity: ").append(getNumericSeverity()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getIndicatorOfCompromise() != null)
            sb.append("IndicatorOfCompromise: ").append(getIndicatorOfCompromise()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getUserAttributes() != null)
            sb.append("UserAttributes: ").append(getUserAttributes()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Finding == false)
            return false;
        Finding other = (Finding) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getServiceAttributes() == null ^ this.getServiceAttributes() == null)
            return false;
        if (other.getServiceAttributes() != null && other.getServiceAttributes().equals(this.getServiceAttributes()) == false)
            return false;
        if (other.getAssetType() == null ^ this.getAssetType() == null)
            return false;
        if (other.getAssetType() != null && other.getAssetType().equals(this.getAssetType()) == false)
            return false;
        if (other.getAssetAttributes() == null ^ this.getAssetAttributes() == null)
            return false;
        if (other.getAssetAttributes() != null && other.getAssetAttributes().equals(this.getAssetAttributes()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRecommendation() == null ^ this.getRecommendation() == null)
            return false;
        if (other.getRecommendation() != null && other.getRecommendation().equals(this.getRecommendation()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getNumericSeverity() == null ^ this.getNumericSeverity() == null)
            return false;
        if (other.getNumericSeverity() != null && other.getNumericSeverity().equals(this.getNumericSeverity()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getIndicatorOfCompromise() == null ^ this.getIndicatorOfCompromise() == null)
            return false;
        if (other.getIndicatorOfCompromise() != null && other.getIndicatorOfCompromise().equals(this.getIndicatorOfCompromise()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getServiceAttributes() == null) ? 0 : getServiceAttributes().hashCode());
        hashCode = prime * hashCode + ((getAssetType() == null) ? 0 : getAssetType().hashCode());
        hashCode = prime * hashCode + ((getAssetAttributes() == null) ? 0 : getAssetAttributes().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRecommendation() == null) ? 0 : getRecommendation().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getNumericSeverity() == null) ? 0 : getNumericSeverity().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getIndicatorOfCompromise() == null) ? 0 : getIndicatorOfCompromise().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Finding clone() {
        try {
            return (Finding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.FindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
