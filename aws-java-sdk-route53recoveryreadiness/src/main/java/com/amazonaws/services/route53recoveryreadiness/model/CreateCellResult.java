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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCell"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCellResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the cell.
     * </p>
     */
    private String cellArn;
    /**
     * <p>
     * The name of the cell.
     * </p>
     */
    private String cellName;
    /**
     * <p>
     * A list of cell ARNs.
     * </p>
     */
    private java.util.List<String> cells;
    /**
     * <p>
     * The readiness scope for the cell, which can be a cell Amazon Resource Name (ARN) or a recovery group ARN. This is
     * a list but currently can have only one element.
     * </p>
     */
    private java.util.List<String> parentReadinessScopes;
    /**
     * <p>
     * Tags on the resources.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the cell.
     * </p>
     * 
     * @param cellArn
     *        The Amazon Resource Name (ARN) for the cell.
     */

    public void setCellArn(String cellArn) {
        this.cellArn = cellArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the cell.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the cell.
     */

    public String getCellArn() {
        return this.cellArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the cell.
     * </p>
     * 
     * @param cellArn
     *        The Amazon Resource Name (ARN) for the cell.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCellResult withCellArn(String cellArn) {
        setCellArn(cellArn);
        return this;
    }

    /**
     * <p>
     * The name of the cell.
     * </p>
     * 
     * @param cellName
     *        The name of the cell.
     */

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    /**
     * <p>
     * The name of the cell.
     * </p>
     * 
     * @return The name of the cell.
     */

    public String getCellName() {
        return this.cellName;
    }

    /**
     * <p>
     * The name of the cell.
     * </p>
     * 
     * @param cellName
     *        The name of the cell.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCellResult withCellName(String cellName) {
        setCellName(cellName);
        return this;
    }

    /**
     * <p>
     * A list of cell ARNs.
     * </p>
     * 
     * @return A list of cell ARNs.
     */

    public java.util.List<String> getCells() {
        return cells;
    }

    /**
     * <p>
     * A list of cell ARNs.
     * </p>
     * 
     * @param cells
     *        A list of cell ARNs.
     */

    public void setCells(java.util.Collection<String> cells) {
        if (cells == null) {
            this.cells = null;
            return;
        }

        this.cells = new java.util.ArrayList<String>(cells);
    }

    /**
     * <p>
     * A list of cell ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCells(java.util.Collection)} or {@link #withCells(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cells
     *        A list of cell ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCellResult withCells(String... cells) {
        if (this.cells == null) {
            setCells(new java.util.ArrayList<String>(cells.length));
        }
        for (String ele : cells) {
            this.cells.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cell ARNs.
     * </p>
     * 
     * @param cells
     *        A list of cell ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCellResult withCells(java.util.Collection<String> cells) {
        setCells(cells);
        return this;
    }

    /**
     * <p>
     * The readiness scope for the cell, which can be a cell Amazon Resource Name (ARN) or a recovery group ARN. This is
     * a list but currently can have only one element.
     * </p>
     * 
     * @return The readiness scope for the cell, which can be a cell Amazon Resource Name (ARN) or a recovery group ARN.
     *         This is a list but currently can have only one element.
     */

    public java.util.List<String> getParentReadinessScopes() {
        return parentReadinessScopes;
    }

    /**
     * <p>
     * The readiness scope for the cell, which can be a cell Amazon Resource Name (ARN) or a recovery group ARN. This is
     * a list but currently can have only one element.
     * </p>
     * 
     * @param parentReadinessScopes
     *        The readiness scope for the cell, which can be a cell Amazon Resource Name (ARN) or a recovery group ARN.
     *        This is a list but currently can have only one element.
     */

    public void setParentReadinessScopes(java.util.Collection<String> parentReadinessScopes) {
        if (parentReadinessScopes == null) {
            this.parentReadinessScopes = null;
            return;
        }

        this.parentReadinessScopes = new java.util.ArrayList<String>(parentReadinessScopes);
    }

    /**
     * <p>
     * The readiness scope for the cell, which can be a cell Amazon Resource Name (ARN) or a recovery group ARN. This is
     * a list but currently can have only one element.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParentReadinessScopes(java.util.Collection)} or
     * {@link #withParentReadinessScopes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param parentReadinessScopes
     *        The readiness scope for the cell, which can be a cell Amazon Resource Name (ARN) or a recovery group ARN.
     *        This is a list but currently can have only one element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCellResult withParentReadinessScopes(String... parentReadinessScopes) {
        if (this.parentReadinessScopes == null) {
            setParentReadinessScopes(new java.util.ArrayList<String>(parentReadinessScopes.length));
        }
        for (String ele : parentReadinessScopes) {
            this.parentReadinessScopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The readiness scope for the cell, which can be a cell Amazon Resource Name (ARN) or a recovery group ARN. This is
     * a list but currently can have only one element.
     * </p>
     * 
     * @param parentReadinessScopes
     *        The readiness scope for the cell, which can be a cell Amazon Resource Name (ARN) or a recovery group ARN.
     *        This is a list but currently can have only one element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCellResult withParentReadinessScopes(java.util.Collection<String> parentReadinessScopes) {
        setParentReadinessScopes(parentReadinessScopes);
        return this;
    }

    /**
     * <p>
     * Tags on the resources.
     * </p>
     * 
     * @return Tags on the resources.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags on the resources.
     * </p>
     * 
     * @param tags
     *        Tags on the resources.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags on the resources.
     * </p>
     * 
     * @param tags
     *        Tags on the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCellResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateCellResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateCellResult addTagsEntry(String key, String value) {
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

    public CreateCellResult clearTagsEntries() {
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
        if (getCellArn() != null)
            sb.append("CellArn: ").append(getCellArn()).append(",");
        if (getCellName() != null)
            sb.append("CellName: ").append(getCellName()).append(",");
        if (getCells() != null)
            sb.append("Cells: ").append(getCells()).append(",");
        if (getParentReadinessScopes() != null)
            sb.append("ParentReadinessScopes: ").append(getParentReadinessScopes()).append(",");
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

        if (obj instanceof CreateCellResult == false)
            return false;
        CreateCellResult other = (CreateCellResult) obj;
        if (other.getCellArn() == null ^ this.getCellArn() == null)
            return false;
        if (other.getCellArn() != null && other.getCellArn().equals(this.getCellArn()) == false)
            return false;
        if (other.getCellName() == null ^ this.getCellName() == null)
            return false;
        if (other.getCellName() != null && other.getCellName().equals(this.getCellName()) == false)
            return false;
        if (other.getCells() == null ^ this.getCells() == null)
            return false;
        if (other.getCells() != null && other.getCells().equals(this.getCells()) == false)
            return false;
        if (other.getParentReadinessScopes() == null ^ this.getParentReadinessScopes() == null)
            return false;
        if (other.getParentReadinessScopes() != null && other.getParentReadinessScopes().equals(this.getParentReadinessScopes()) == false)
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

        hashCode = prime * hashCode + ((getCellArn() == null) ? 0 : getCellArn().hashCode());
        hashCode = prime * hashCode + ((getCellName() == null) ? 0 : getCellName().hashCode());
        hashCode = prime * hashCode + ((getCells() == null) ? 0 : getCells().hashCode());
        hashCode = prime * hashCode + ((getParentReadinessScopes() == null) ? 0 : getParentReadinessScopes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCellResult clone() {
        try {
            return (CreateCellResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
