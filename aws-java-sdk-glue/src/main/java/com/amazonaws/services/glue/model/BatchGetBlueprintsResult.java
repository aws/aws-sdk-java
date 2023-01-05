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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetBlueprints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetBlueprintsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of blueprint as a <code>Blueprints</code> object.
     * </p>
     */
    private java.util.List<Blueprint> blueprints;
    /**
     * <p>
     * Returns a list of <code>BlueprintNames</code> that were not found.
     * </p>
     */
    private java.util.List<String> missingBlueprints;

    /**
     * <p>
     * Returns a list of blueprint as a <code>Blueprints</code> object.
     * </p>
     * 
     * @return Returns a list of blueprint as a <code>Blueprints</code> object.
     */

    public java.util.List<Blueprint> getBlueprints() {
        return blueprints;
    }

    /**
     * <p>
     * Returns a list of blueprint as a <code>Blueprints</code> object.
     * </p>
     * 
     * @param blueprints
     *        Returns a list of blueprint as a <code>Blueprints</code> object.
     */

    public void setBlueprints(java.util.Collection<Blueprint> blueprints) {
        if (blueprints == null) {
            this.blueprints = null;
            return;
        }

        this.blueprints = new java.util.ArrayList<Blueprint>(blueprints);
    }

    /**
     * <p>
     * Returns a list of blueprint as a <code>Blueprints</code> object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlueprints(java.util.Collection)} or {@link #withBlueprints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param blueprints
     *        Returns a list of blueprint as a <code>Blueprints</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBlueprintsResult withBlueprints(Blueprint... blueprints) {
        if (this.blueprints == null) {
            setBlueprints(new java.util.ArrayList<Blueprint>(blueprints.length));
        }
        for (Blueprint ele : blueprints) {
            this.blueprints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of blueprint as a <code>Blueprints</code> object.
     * </p>
     * 
     * @param blueprints
     *        Returns a list of blueprint as a <code>Blueprints</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBlueprintsResult withBlueprints(java.util.Collection<Blueprint> blueprints) {
        setBlueprints(blueprints);
        return this;
    }

    /**
     * <p>
     * Returns a list of <code>BlueprintNames</code> that were not found.
     * </p>
     * 
     * @return Returns a list of <code>BlueprintNames</code> that were not found.
     */

    public java.util.List<String> getMissingBlueprints() {
        return missingBlueprints;
    }

    /**
     * <p>
     * Returns a list of <code>BlueprintNames</code> that were not found.
     * </p>
     * 
     * @param missingBlueprints
     *        Returns a list of <code>BlueprintNames</code> that were not found.
     */

    public void setMissingBlueprints(java.util.Collection<String> missingBlueprints) {
        if (missingBlueprints == null) {
            this.missingBlueprints = null;
            return;
        }

        this.missingBlueprints = new java.util.ArrayList<String>(missingBlueprints);
    }

    /**
     * <p>
     * Returns a list of <code>BlueprintNames</code> that were not found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMissingBlueprints(java.util.Collection)} or {@link #withMissingBlueprints(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param missingBlueprints
     *        Returns a list of <code>BlueprintNames</code> that were not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBlueprintsResult withMissingBlueprints(String... missingBlueprints) {
        if (this.missingBlueprints == null) {
            setMissingBlueprints(new java.util.ArrayList<String>(missingBlueprints.length));
        }
        for (String ele : missingBlueprints) {
            this.missingBlueprints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of <code>BlueprintNames</code> that were not found.
     * </p>
     * 
     * @param missingBlueprints
     *        Returns a list of <code>BlueprintNames</code> that were not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBlueprintsResult withMissingBlueprints(java.util.Collection<String> missingBlueprints) {
        setMissingBlueprints(missingBlueprints);
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
        if (getBlueprints() != null)
            sb.append("Blueprints: ").append(getBlueprints()).append(",");
        if (getMissingBlueprints() != null)
            sb.append("MissingBlueprints: ").append(getMissingBlueprints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetBlueprintsResult == false)
            return false;
        BatchGetBlueprintsResult other = (BatchGetBlueprintsResult) obj;
        if (other.getBlueprints() == null ^ this.getBlueprints() == null)
            return false;
        if (other.getBlueprints() != null && other.getBlueprints().equals(this.getBlueprints()) == false)
            return false;
        if (other.getMissingBlueprints() == null ^ this.getMissingBlueprints() == null)
            return false;
        if (other.getMissingBlueprints() != null && other.getMissingBlueprints().equals(this.getMissingBlueprints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueprints() == null) ? 0 : getBlueprints().hashCode());
        hashCode = prime * hashCode + ((getMissingBlueprints() == null) ? 0 : getMissingBlueprints().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetBlueprintsResult clone() {
        try {
            return (BatchGetBlueprintsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
