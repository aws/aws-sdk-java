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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTable" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfiguredTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configured table.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description for the configured table.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A reference to the Glue table being configured.
     * </p>
     */
    private TableReference tableReference;
    /**
     * <p>
     * The columns of the underlying table that can be used by collaborations or analysis rules.
     * </p>
     */
    private java.util.List<String> allowedColumns;
    /**
     * <p>
     * The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     */
    private String analysisMethod;
    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the configured table.
     * </p>
     * 
     * @param name
     *        The name of the configured table.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configured table.
     * </p>
     * 
     * @return The name of the configured table.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configured table.
     * </p>
     * 
     * @param name
     *        The name of the configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description for the configured table.
     * </p>
     * 
     * @param description
     *        A description for the configured table.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the configured table.
     * </p>
     * 
     * @return A description for the configured table.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the configured table.
     * </p>
     * 
     * @param description
     *        A description for the configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A reference to the Glue table being configured.
     * </p>
     * 
     * @param tableReference
     *        A reference to the Glue table being configured.
     */

    public void setTableReference(TableReference tableReference) {
        this.tableReference = tableReference;
    }

    /**
     * <p>
     * A reference to the Glue table being configured.
     * </p>
     * 
     * @return A reference to the Glue table being configured.
     */

    public TableReference getTableReference() {
        return this.tableReference;
    }

    /**
     * <p>
     * A reference to the Glue table being configured.
     * </p>
     * 
     * @param tableReference
     *        A reference to the Glue table being configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableRequest withTableReference(TableReference tableReference) {
        setTableReference(tableReference);
        return this;
    }

    /**
     * <p>
     * The columns of the underlying table that can be used by collaborations or analysis rules.
     * </p>
     * 
     * @return The columns of the underlying table that can be used by collaborations or analysis rules.
     */

    public java.util.List<String> getAllowedColumns() {
        return allowedColumns;
    }

    /**
     * <p>
     * The columns of the underlying table that can be used by collaborations or analysis rules.
     * </p>
     * 
     * @param allowedColumns
     *        The columns of the underlying table that can be used by collaborations or analysis rules.
     */

    public void setAllowedColumns(java.util.Collection<String> allowedColumns) {
        if (allowedColumns == null) {
            this.allowedColumns = null;
            return;
        }

        this.allowedColumns = new java.util.ArrayList<String>(allowedColumns);
    }

    /**
     * <p>
     * The columns of the underlying table that can be used by collaborations or analysis rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedColumns(java.util.Collection)} or {@link #withAllowedColumns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedColumns
     *        The columns of the underlying table that can be used by collaborations or analysis rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableRequest withAllowedColumns(String... allowedColumns) {
        if (this.allowedColumns == null) {
            setAllowedColumns(new java.util.ArrayList<String>(allowedColumns.length));
        }
        for (String ele : allowedColumns) {
            this.allowedColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The columns of the underlying table that can be used by collaborations or analysis rules.
     * </p>
     * 
     * @param allowedColumns
     *        The columns of the underlying table that can be used by collaborations or analysis rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableRequest withAllowedColumns(java.util.Collection<String> allowedColumns) {
        setAllowedColumns(allowedColumns);
        return this;
    }

    /**
     * <p>
     * The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @param analysisMethod
     *        The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * @see AnalysisMethod
     */

    public void setAnalysisMethod(String analysisMethod) {
        this.analysisMethod = analysisMethod;
    }

    /**
     * <p>
     * The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @return The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * @see AnalysisMethod
     */

    public String getAnalysisMethod() {
        return this.analysisMethod;
    }

    /**
     * <p>
     * The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @param analysisMethod
     *        The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisMethod
     */

    public CreateConfiguredTableRequest withAnalysisMethod(String analysisMethod) {
        setAnalysisMethod(analysisMethod);
        return this;
    }

    /**
     * <p>
     * The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @param analysisMethod
     *        The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisMethod
     */

    public CreateConfiguredTableRequest withAnalysisMethod(AnalysisMethod analysisMethod) {
        this.analysisMethod = analysisMethod.toString();
        return this;
    }

    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     * 
     * @return An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     *         optional value, both of which you define. When you use tagging, you can also use tag-based access control
     *         in IAM policies to control access to this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     * 
     * @param tags
     *        An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     *        optional value, both of which you define. When you use tagging, you can also use tag-based access control
     *        in IAM policies to control access to this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     * 
     * @param tags
     *        An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     *        optional value, both of which you define. When you use tagging, you can also use tag-based access control
     *        in IAM policies to control access to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateConfiguredTableRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredTableRequest addTagsEntry(String key, String value) {
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

    public CreateConfiguredTableRequest clearTagsEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTableReference() != null)
            sb.append("TableReference: ").append(getTableReference()).append(",");
        if (getAllowedColumns() != null)
            sb.append("AllowedColumns: ").append(getAllowedColumns()).append(",");
        if (getAnalysisMethod() != null)
            sb.append("AnalysisMethod: ").append(getAnalysisMethod()).append(",");
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

        if (obj instanceof CreateConfiguredTableRequest == false)
            return false;
        CreateConfiguredTableRequest other = (CreateConfiguredTableRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTableReference() == null ^ this.getTableReference() == null)
            return false;
        if (other.getTableReference() != null && other.getTableReference().equals(this.getTableReference()) == false)
            return false;
        if (other.getAllowedColumns() == null ^ this.getAllowedColumns() == null)
            return false;
        if (other.getAllowedColumns() != null && other.getAllowedColumns().equals(this.getAllowedColumns()) == false)
            return false;
        if (other.getAnalysisMethod() == null ^ this.getAnalysisMethod() == null)
            return false;
        if (other.getAnalysisMethod() != null && other.getAnalysisMethod().equals(this.getAnalysisMethod()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTableReference() == null) ? 0 : getTableReference().hashCode());
        hashCode = prime * hashCode + ((getAllowedColumns() == null) ? 0 : getAllowedColumns().hashCode());
        hashCode = prime * hashCode + ((getAnalysisMethod() == null) ? 0 : getAnalysisMethod().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateConfiguredTableRequest clone() {
        return (CreateConfiguredTableRequest) super.clone();
    }

}
