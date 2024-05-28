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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIndexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the index.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the Amazon Q Business index.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The name of the Amazon Q Business index.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The description of the Amazon Q Business index.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The storage capacity units you want to provision for your Amazon Q Business index. You can add and remove
     * capacity to fit your usage needs.
     * </p>
     */
    private IndexCapacityConfiguration capacityConfiguration;
    /**
     * <p>
     * Configuration information for document metadata or fields. Document metadata are fields or attributes associated
     * with your documents. For example, the company department name associated with each document. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes"
     * >Understanding document attributes</a>.
     * </p>
     */
    private java.util.List<DocumentAttributeConfiguration> documentAttributeConfigurations;

    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the index.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application connected to the index.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the index.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application connected to the index.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the index.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application connected to the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business index.
     * </p>
     * 
     * @param indexId
     *        The identifier of the Amazon Q Business index.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business index.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business index.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business index.
     * </p>
     * 
     * @param indexId
     *        The identifier of the Amazon Q Business index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Q Business index.
     * </p>
     * 
     * @param displayName
     *        The name of the Amazon Q Business index.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the Amazon Q Business index.
     * </p>
     * 
     * @return The name of the Amazon Q Business index.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the Amazon Q Business index.
     * </p>
     * 
     * @param displayName
     *        The name of the Amazon Q Business index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The description of the Amazon Q Business index.
     * </p>
     * 
     * @param description
     *        The description of the Amazon Q Business index.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Amazon Q Business index.
     * </p>
     * 
     * @return The description of the Amazon Q Business index.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the Amazon Q Business index.
     * </p>
     * 
     * @param description
     *        The description of the Amazon Q Business index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The storage capacity units you want to provision for your Amazon Q Business index. You can add and remove
     * capacity to fit your usage needs.
     * </p>
     * 
     * @param capacityConfiguration
     *        The storage capacity units you want to provision for your Amazon Q Business index. You can add and remove
     *        capacity to fit your usage needs.
     */

    public void setCapacityConfiguration(IndexCapacityConfiguration capacityConfiguration) {
        this.capacityConfiguration = capacityConfiguration;
    }

    /**
     * <p>
     * The storage capacity units you want to provision for your Amazon Q Business index. You can add and remove
     * capacity to fit your usage needs.
     * </p>
     * 
     * @return The storage capacity units you want to provision for your Amazon Q Business index. You can add and remove
     *         capacity to fit your usage needs.
     */

    public IndexCapacityConfiguration getCapacityConfiguration() {
        return this.capacityConfiguration;
    }

    /**
     * <p>
     * The storage capacity units you want to provision for your Amazon Q Business index. You can add and remove
     * capacity to fit your usage needs.
     * </p>
     * 
     * @param capacityConfiguration
     *        The storage capacity units you want to provision for your Amazon Q Business index. You can add and remove
     *        capacity to fit your usage needs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexRequest withCapacityConfiguration(IndexCapacityConfiguration capacityConfiguration) {
        setCapacityConfiguration(capacityConfiguration);
        return this;
    }

    /**
     * <p>
     * Configuration information for document metadata or fields. Document metadata are fields or attributes associated
     * with your documents. For example, the company department name associated with each document. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes"
     * >Understanding document attributes</a>.
     * </p>
     * 
     * @return Configuration information for document metadata or fields. Document metadata are fields or attributes
     *         associated with your documents. For example, the company department name associated with each document.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes"
     *         >Understanding document attributes</a>.
     */

    public java.util.List<DocumentAttributeConfiguration> getDocumentAttributeConfigurations() {
        return documentAttributeConfigurations;
    }

    /**
     * <p>
     * Configuration information for document metadata or fields. Document metadata are fields or attributes associated
     * with your documents. For example, the company department name associated with each document. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes"
     * >Understanding document attributes</a>.
     * </p>
     * 
     * @param documentAttributeConfigurations
     *        Configuration information for document metadata or fields. Document metadata are fields or attributes
     *        associated with your documents. For example, the company department name associated with each document.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes"
     *        >Understanding document attributes</a>.
     */

    public void setDocumentAttributeConfigurations(java.util.Collection<DocumentAttributeConfiguration> documentAttributeConfigurations) {
        if (documentAttributeConfigurations == null) {
            this.documentAttributeConfigurations = null;
            return;
        }

        this.documentAttributeConfigurations = new java.util.ArrayList<DocumentAttributeConfiguration>(documentAttributeConfigurations);
    }

    /**
     * <p>
     * Configuration information for document metadata or fields. Document metadata are fields or attributes associated
     * with your documents. For example, the company department name associated with each document. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes"
     * >Understanding document attributes</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentAttributeConfigurations(java.util.Collection)} or
     * {@link #withDocumentAttributeConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param documentAttributeConfigurations
     *        Configuration information for document metadata or fields. Document metadata are fields or attributes
     *        associated with your documents. For example, the company department name associated with each document.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes"
     *        >Understanding document attributes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexRequest withDocumentAttributeConfigurations(DocumentAttributeConfiguration... documentAttributeConfigurations) {
        if (this.documentAttributeConfigurations == null) {
            setDocumentAttributeConfigurations(new java.util.ArrayList<DocumentAttributeConfiguration>(documentAttributeConfigurations.length));
        }
        for (DocumentAttributeConfiguration ele : documentAttributeConfigurations) {
            this.documentAttributeConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configuration information for document metadata or fields. Document metadata are fields or attributes associated
     * with your documents. For example, the company department name associated with each document. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes"
     * >Understanding document attributes</a>.
     * </p>
     * 
     * @param documentAttributeConfigurations
     *        Configuration information for document metadata or fields. Document metadata are fields or attributes
     *        associated with your documents. For example, the company department name associated with each document.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes"
     *        >Understanding document attributes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexRequest withDocumentAttributeConfigurations(java.util.Collection<DocumentAttributeConfiguration> documentAttributeConfigurations) {
        setDocumentAttributeConfigurations(documentAttributeConfigurations);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCapacityConfiguration() != null)
            sb.append("CapacityConfiguration: ").append(getCapacityConfiguration()).append(",");
        if (getDocumentAttributeConfigurations() != null)
            sb.append("DocumentAttributeConfigurations: ").append(getDocumentAttributeConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIndexRequest == false)
            return false;
        UpdateIndexRequest other = (UpdateIndexRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCapacityConfiguration() == null ^ this.getCapacityConfiguration() == null)
            return false;
        if (other.getCapacityConfiguration() != null && other.getCapacityConfiguration().equals(this.getCapacityConfiguration()) == false)
            return false;
        if (other.getDocumentAttributeConfigurations() == null ^ this.getDocumentAttributeConfigurations() == null)
            return false;
        if (other.getDocumentAttributeConfigurations() != null
                && other.getDocumentAttributeConfigurations().equals(this.getDocumentAttributeConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCapacityConfiguration() == null) ? 0 : getCapacityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDocumentAttributeConfigurations() == null) ? 0 : getDocumentAttributeConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIndexRequest clone() {
        return (UpdateIndexRequest) super.clone();
    }

}
