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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing details for representations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ViewDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViewDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * You can set this flag as true to instruct the engine not to push user-provided operations into the logical plan
     * of the view during query planning. However, setting this flag does not guarantee that the engine will comply.
     * Refer to the engine's documentation to understand the guarantees provided, if any.
     * </p>
     */
    private Boolean isProtected;
    /**
     * <p>
     * The definer of a view in SQL.
     * </p>
     */
    private String definer;
    /**
     * <p>
     * A list of table Amazon Resource Names (ARNs).
     * </p>
     */
    private java.util.List<String> subObjects;
    /**
     * <p>
     * A list of representations.
     * </p>
     */
    private java.util.List<ViewRepresentation> representations;

    /**
     * <p>
     * You can set this flag as true to instruct the engine not to push user-provided operations into the logical plan
     * of the view during query planning. However, setting this flag does not guarantee that the engine will comply.
     * Refer to the engine's documentation to understand the guarantees provided, if any.
     * </p>
     * 
     * @param isProtected
     *        You can set this flag as true to instruct the engine not to push user-provided operations into the logical
     *        plan of the view during query planning. However, setting this flag does not guarantee that the engine will
     *        comply. Refer to the engine's documentation to understand the guarantees provided, if any.
     */

    public void setIsProtected(Boolean isProtected) {
        this.isProtected = isProtected;
    }

    /**
     * <p>
     * You can set this flag as true to instruct the engine not to push user-provided operations into the logical plan
     * of the view during query planning. However, setting this flag does not guarantee that the engine will comply.
     * Refer to the engine's documentation to understand the guarantees provided, if any.
     * </p>
     * 
     * @return You can set this flag as true to instruct the engine not to push user-provided operations into the
     *         logical plan of the view during query planning. However, setting this flag does not guarantee that the
     *         engine will comply. Refer to the engine's documentation to understand the guarantees provided, if any.
     */

    public Boolean getIsProtected() {
        return this.isProtected;
    }

    /**
     * <p>
     * You can set this flag as true to instruct the engine not to push user-provided operations into the logical plan
     * of the view during query planning. However, setting this flag does not guarantee that the engine will comply.
     * Refer to the engine's documentation to understand the guarantees provided, if any.
     * </p>
     * 
     * @param isProtected
     *        You can set this flag as true to instruct the engine not to push user-provided operations into the logical
     *        plan of the view during query planning. However, setting this flag does not guarantee that the engine will
     *        comply. Refer to the engine's documentation to understand the guarantees provided, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewDefinition withIsProtected(Boolean isProtected) {
        setIsProtected(isProtected);
        return this;
    }

    /**
     * <p>
     * You can set this flag as true to instruct the engine not to push user-provided operations into the logical plan
     * of the view during query planning. However, setting this flag does not guarantee that the engine will comply.
     * Refer to the engine's documentation to understand the guarantees provided, if any.
     * </p>
     * 
     * @return You can set this flag as true to instruct the engine not to push user-provided operations into the
     *         logical plan of the view during query planning. However, setting this flag does not guarantee that the
     *         engine will comply. Refer to the engine's documentation to understand the guarantees provided, if any.
     */

    public Boolean isProtected() {
        return this.isProtected;
    }

    /**
     * <p>
     * The definer of a view in SQL.
     * </p>
     * 
     * @param definer
     *        The definer of a view in SQL.
     */

    public void setDefiner(String definer) {
        this.definer = definer;
    }

    /**
     * <p>
     * The definer of a view in SQL.
     * </p>
     * 
     * @return The definer of a view in SQL.
     */

    public String getDefiner() {
        return this.definer;
    }

    /**
     * <p>
     * The definer of a view in SQL.
     * </p>
     * 
     * @param definer
     *        The definer of a view in SQL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewDefinition withDefiner(String definer) {
        setDefiner(definer);
        return this;
    }

    /**
     * <p>
     * A list of table Amazon Resource Names (ARNs).
     * </p>
     * 
     * @return A list of table Amazon Resource Names (ARNs).
     */

    public java.util.List<String> getSubObjects() {
        return subObjects;
    }

    /**
     * <p>
     * A list of table Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param subObjects
     *        A list of table Amazon Resource Names (ARNs).
     */

    public void setSubObjects(java.util.Collection<String> subObjects) {
        if (subObjects == null) {
            this.subObjects = null;
            return;
        }

        this.subObjects = new java.util.ArrayList<String>(subObjects);
    }

    /**
     * <p>
     * A list of table Amazon Resource Names (ARNs).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubObjects(java.util.Collection)} or {@link #withSubObjects(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subObjects
     *        A list of table Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewDefinition withSubObjects(String... subObjects) {
        if (this.subObjects == null) {
            setSubObjects(new java.util.ArrayList<String>(subObjects.length));
        }
        for (String ele : subObjects) {
            this.subObjects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of table Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param subObjects
     *        A list of table Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewDefinition withSubObjects(java.util.Collection<String> subObjects) {
        setSubObjects(subObjects);
        return this;
    }

    /**
     * <p>
     * A list of representations.
     * </p>
     * 
     * @return A list of representations.
     */

    public java.util.List<ViewRepresentation> getRepresentations() {
        return representations;
    }

    /**
     * <p>
     * A list of representations.
     * </p>
     * 
     * @param representations
     *        A list of representations.
     */

    public void setRepresentations(java.util.Collection<ViewRepresentation> representations) {
        if (representations == null) {
            this.representations = null;
            return;
        }

        this.representations = new java.util.ArrayList<ViewRepresentation>(representations);
    }

    /**
     * <p>
     * A list of representations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepresentations(java.util.Collection)} or {@link #withRepresentations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param representations
     *        A list of representations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewDefinition withRepresentations(ViewRepresentation... representations) {
        if (this.representations == null) {
            setRepresentations(new java.util.ArrayList<ViewRepresentation>(representations.length));
        }
        for (ViewRepresentation ele : representations) {
            this.representations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of representations.
     * </p>
     * 
     * @param representations
     *        A list of representations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewDefinition withRepresentations(java.util.Collection<ViewRepresentation> representations) {
        setRepresentations(representations);
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
        if (getIsProtected() != null)
            sb.append("IsProtected: ").append(getIsProtected()).append(",");
        if (getDefiner() != null)
            sb.append("Definer: ").append(getDefiner()).append(",");
        if (getSubObjects() != null)
            sb.append("SubObjects: ").append(getSubObjects()).append(",");
        if (getRepresentations() != null)
            sb.append("Representations: ").append(getRepresentations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewDefinition == false)
            return false;
        ViewDefinition other = (ViewDefinition) obj;
        if (other.getIsProtected() == null ^ this.getIsProtected() == null)
            return false;
        if (other.getIsProtected() != null && other.getIsProtected().equals(this.getIsProtected()) == false)
            return false;
        if (other.getDefiner() == null ^ this.getDefiner() == null)
            return false;
        if (other.getDefiner() != null && other.getDefiner().equals(this.getDefiner()) == false)
            return false;
        if (other.getSubObjects() == null ^ this.getSubObjects() == null)
            return false;
        if (other.getSubObjects() != null && other.getSubObjects().equals(this.getSubObjects()) == false)
            return false;
        if (other.getRepresentations() == null ^ this.getRepresentations() == null)
            return false;
        if (other.getRepresentations() != null && other.getRepresentations().equals(this.getRepresentations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsProtected() == null) ? 0 : getIsProtected().hashCode());
        hashCode = prime * hashCode + ((getDefiner() == null) ? 0 : getDefiner().hashCode());
        hashCode = prime * hashCode + ((getSubObjects() == null) ? 0 : getSubObjects().hashCode());
        hashCode = prime * hashCode + ((getRepresentations() == null) ? 0 : getRepresentations().hashCode());
        return hashCode;
    }

    @Override
    public ViewDefinition clone() {
        try {
            return (ViewDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ViewDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
