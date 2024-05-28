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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies a property value used in an expression.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/VariableValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VariableValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the property to use as the variable. You can use the property <code>name</code> if it's from the same
     * asset model. If the property has an external ID, you can specify <code>externalId:</code> followed by the
     * external ID. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String propertyId;
    /**
     * <p>
     * The ID of the hierarchy to query for the property ID. You can use the hierarchy's name instead of the hierarchy's
     * ID. If the hierarchy has an external ID, you can specify <code>externalId:</code> followed by the external ID.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You use a hierarchy ID instead of a model ID because you can have several hierarchies using the same model and
     * therefore the same <code>propertyId</code>. For example, you might have separately grouped assets that come from
     * the same asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String hierarchyId;
    /**
     * <p>
     * The path of the property.
     * </p>
     */
    private java.util.List<AssetModelPropertyPathSegment> propertyPath;

    /**
     * <p>
     * The ID of the property to use as the variable. You can use the property <code>name</code> if it's from the same
     * asset model. If the property has an external ID, you can specify <code>externalId:</code> followed by the
     * external ID. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param propertyId
     *        The ID of the property to use as the variable. You can use the property <code>name</code> if it's from the
     *        same asset model. If the property has an external ID, you can specify <code>externalId:</code> followed by
     *        the external ID. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <p>
     * The ID of the property to use as the variable. You can use the property <code>name</code> if it's from the same
     * asset model. If the property has an external ID, you can specify <code>externalId:</code> followed by the
     * external ID. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The ID of the property to use as the variable. You can use the property <code>name</code> if it's from
     *         the same asset model. If the property has an external ID, you can specify <code>externalId:</code>
     *         followed by the external ID. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *         external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getPropertyId() {
        return this.propertyId;
    }

    /**
     * <p>
     * The ID of the property to use as the variable. You can use the property <code>name</code> if it's from the same
     * asset model. If the property has an external ID, you can specify <code>externalId:</code> followed by the
     * external ID. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param propertyId
     *        The ID of the property to use as the variable. You can use the property <code>name</code> if it's from the
     *        same asset model. If the property has an external ID, you can specify <code>externalId:</code> followed by
     *        the external ID. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VariableValue withPropertyId(String propertyId) {
        setPropertyId(propertyId);
        return this;
    }

    /**
     * <p>
     * The ID of the hierarchy to query for the property ID. You can use the hierarchy's name instead of the hierarchy's
     * ID. If the hierarchy has an external ID, you can specify <code>externalId:</code> followed by the external ID.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You use a hierarchy ID instead of a model ID because you can have several hierarchies using the same model and
     * therefore the same <code>propertyId</code>. For example, you might have separately grouped assets that come from
     * the same asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param hierarchyId
     *        The ID of the hierarchy to query for the property ID. You can use the hierarchy's name instead of the
     *        hierarchy's ID. If the hierarchy has an external ID, you can specify <code>externalId:</code> followed by
     *        the external ID. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        You use a hierarchy ID instead of a model ID because you can have several hierarchies using the same model
     *        and therefore the same <code>propertyId</code>. For example, you might have separately grouped assets that
     *        come from the same asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *        hierarchies</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setHierarchyId(String hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    /**
     * <p>
     * The ID of the hierarchy to query for the property ID. You can use the hierarchy's name instead of the hierarchy's
     * ID. If the hierarchy has an external ID, you can specify <code>externalId:</code> followed by the external ID.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You use a hierarchy ID instead of a model ID because you can have several hierarchies using the same model and
     * therefore the same <code>propertyId</code>. For example, you might have separately grouped assets that come from
     * the same asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The ID of the hierarchy to query for the property ID. You can use the hierarchy's name instead of the
     *         hierarchy's ID. If the hierarchy has an external ID, you can specify <code>externalId:</code> followed by
     *         the external ID. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *         external IDs</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *         <p>
     *         You use a hierarchy ID instead of a model ID because you can have several hierarchies using the same
     *         model and therefore the same <code>propertyId</code>. For example, you might have separately grouped
     *         assets that come from the same asset model. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *         hierarchies</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getHierarchyId() {
        return this.hierarchyId;
    }

    /**
     * <p>
     * The ID of the hierarchy to query for the property ID. You can use the hierarchy's name instead of the hierarchy's
     * ID. If the hierarchy has an external ID, you can specify <code>externalId:</code> followed by the external ID.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using external
     * IDs</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * You use a hierarchy ID instead of a model ID because you can have several hierarchies using the same model and
     * therefore the same <code>propertyId</code>. For example, you might have separately grouped assets that come from
     * the same asset model. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param hierarchyId
     *        The ID of the hierarchy to query for the property ID. You can use the hierarchy's name instead of the
     *        hierarchy's ID. If the hierarchy has an external ID, you can specify <code>externalId:</code> followed by
     *        the external ID. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/object-ids.html#external-ids">Using
     *        external IDs</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        You use a hierarchy ID instead of a model ID because you can have several hierarchies using the same model
     *        and therefore the same <code>propertyId</code>. For example, you might have separately grouped assets that
     *        come from the same asset model. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *        hierarchies</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VariableValue withHierarchyId(String hierarchyId) {
        setHierarchyId(hierarchyId);
        return this;
    }

    /**
     * <p>
     * The path of the property.
     * </p>
     * 
     * @return The path of the property.
     */

    public java.util.List<AssetModelPropertyPathSegment> getPropertyPath() {
        return propertyPath;
    }

    /**
     * <p>
     * The path of the property.
     * </p>
     * 
     * @param propertyPath
     *        The path of the property.
     */

    public void setPropertyPath(java.util.Collection<AssetModelPropertyPathSegment> propertyPath) {
        if (propertyPath == null) {
            this.propertyPath = null;
            return;
        }

        this.propertyPath = new java.util.ArrayList<AssetModelPropertyPathSegment>(propertyPath);
    }

    /**
     * <p>
     * The path of the property.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertyPath(java.util.Collection)} or {@link #withPropertyPath(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param propertyPath
     *        The path of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VariableValue withPropertyPath(AssetModelPropertyPathSegment... propertyPath) {
        if (this.propertyPath == null) {
            setPropertyPath(new java.util.ArrayList<AssetModelPropertyPathSegment>(propertyPath.length));
        }
        for (AssetModelPropertyPathSegment ele : propertyPath) {
            this.propertyPath.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The path of the property.
     * </p>
     * 
     * @param propertyPath
     *        The path of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VariableValue withPropertyPath(java.util.Collection<AssetModelPropertyPathSegment> propertyPath) {
        setPropertyPath(propertyPath);
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
        if (getPropertyId() != null)
            sb.append("PropertyId: ").append(getPropertyId()).append(",");
        if (getHierarchyId() != null)
            sb.append("HierarchyId: ").append(getHierarchyId()).append(",");
        if (getPropertyPath() != null)
            sb.append("PropertyPath: ").append(getPropertyPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VariableValue == false)
            return false;
        VariableValue other = (VariableValue) obj;
        if (other.getPropertyId() == null ^ this.getPropertyId() == null)
            return false;
        if (other.getPropertyId() != null && other.getPropertyId().equals(this.getPropertyId()) == false)
            return false;
        if (other.getHierarchyId() == null ^ this.getHierarchyId() == null)
            return false;
        if (other.getHierarchyId() != null && other.getHierarchyId().equals(this.getHierarchyId()) == false)
            return false;
        if (other.getPropertyPath() == null ^ this.getPropertyPath() == null)
            return false;
        if (other.getPropertyPath() != null && other.getPropertyPath().equals(this.getPropertyPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        hashCode = prime * hashCode + ((getHierarchyId() == null) ? 0 : getHierarchyId().hashCode());
        hashCode = prime * hashCode + ((getPropertyPath() == null) ? 0 : getPropertyPath().hashCode());
        return hashCode;
    }

    @Override
    public VariableValue clone() {
        try {
            return (VariableValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.VariableValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
