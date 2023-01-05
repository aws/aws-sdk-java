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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the mapping of data property keys.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Mapping" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Mapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * After the apply mapping, what the name of the column should be. Can be the same as <code>FromPath</code>.
     * </p>
     */
    private String toKey;
    /**
     * <p>
     * The table or column to be modified.
     * </p>
     */
    private java.util.List<String> fromPath;
    /**
     * <p>
     * The type of the data to be modified.
     * </p>
     */
    private String fromType;
    /**
     * <p>
     * The data type that the data is to be modified to.
     * </p>
     */
    private String toType;
    /**
     * <p>
     * If true, then the column is removed.
     * </p>
     */
    private Boolean dropped;
    /**
     * <p>
     * Only applicable to nested data structures. If you want to change the parent structure, but also one of its
     * children, you can fill out this data strucutre. It is also <code>Mapping</code>, but its <code>FromPath</code>
     * will be the parent's <code>FromPath</code> plus the <code>FromPath</code> from this structure.
     * </p>
     * <p>
     * For the children part, suppose you have the structure:
     * </p>
     * <p>
     * <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     * </p>
     * <p>
     * You can specify a <code>Mapping</code> that looks like:
     * </p>
     * <p>
     * <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     * </p>
     */
    private java.util.List<Mapping> children;

    /**
     * <p>
     * After the apply mapping, what the name of the column should be. Can be the same as <code>FromPath</code>.
     * </p>
     * 
     * @param toKey
     *        After the apply mapping, what the name of the column should be. Can be the same as <code>FromPath</code>.
     */

    public void setToKey(String toKey) {
        this.toKey = toKey;
    }

    /**
     * <p>
     * After the apply mapping, what the name of the column should be. Can be the same as <code>FromPath</code>.
     * </p>
     * 
     * @return After the apply mapping, what the name of the column should be. Can be the same as <code>FromPath</code>.
     */

    public String getToKey() {
        return this.toKey;
    }

    /**
     * <p>
     * After the apply mapping, what the name of the column should be. Can be the same as <code>FromPath</code>.
     * </p>
     * 
     * @param toKey
     *        After the apply mapping, what the name of the column should be. Can be the same as <code>FromPath</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mapping withToKey(String toKey) {
        setToKey(toKey);
        return this;
    }

    /**
     * <p>
     * The table or column to be modified.
     * </p>
     * 
     * @return The table or column to be modified.
     */

    public java.util.List<String> getFromPath() {
        return fromPath;
    }

    /**
     * <p>
     * The table or column to be modified.
     * </p>
     * 
     * @param fromPath
     *        The table or column to be modified.
     */

    public void setFromPath(java.util.Collection<String> fromPath) {
        if (fromPath == null) {
            this.fromPath = null;
            return;
        }

        this.fromPath = new java.util.ArrayList<String>(fromPath);
    }

    /**
     * <p>
     * The table or column to be modified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFromPath(java.util.Collection)} or {@link #withFromPath(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param fromPath
     *        The table or column to be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mapping withFromPath(String... fromPath) {
        if (this.fromPath == null) {
            setFromPath(new java.util.ArrayList<String>(fromPath.length));
        }
        for (String ele : fromPath) {
            this.fromPath.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The table or column to be modified.
     * </p>
     * 
     * @param fromPath
     *        The table or column to be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mapping withFromPath(java.util.Collection<String> fromPath) {
        setFromPath(fromPath);
        return this;
    }

    /**
     * <p>
     * The type of the data to be modified.
     * </p>
     * 
     * @param fromType
     *        The type of the data to be modified.
     */

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    /**
     * <p>
     * The type of the data to be modified.
     * </p>
     * 
     * @return The type of the data to be modified.
     */

    public String getFromType() {
        return this.fromType;
    }

    /**
     * <p>
     * The type of the data to be modified.
     * </p>
     * 
     * @param fromType
     *        The type of the data to be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mapping withFromType(String fromType) {
        setFromType(fromType);
        return this;
    }

    /**
     * <p>
     * The data type that the data is to be modified to.
     * </p>
     * 
     * @param toType
     *        The data type that the data is to be modified to.
     */

    public void setToType(String toType) {
        this.toType = toType;
    }

    /**
     * <p>
     * The data type that the data is to be modified to.
     * </p>
     * 
     * @return The data type that the data is to be modified to.
     */

    public String getToType() {
        return this.toType;
    }

    /**
     * <p>
     * The data type that the data is to be modified to.
     * </p>
     * 
     * @param toType
     *        The data type that the data is to be modified to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mapping withToType(String toType) {
        setToType(toType);
        return this;
    }

    /**
     * <p>
     * If true, then the column is removed.
     * </p>
     * 
     * @param dropped
     *        If true, then the column is removed.
     */

    public void setDropped(Boolean dropped) {
        this.dropped = dropped;
    }

    /**
     * <p>
     * If true, then the column is removed.
     * </p>
     * 
     * @return If true, then the column is removed.
     */

    public Boolean getDropped() {
        return this.dropped;
    }

    /**
     * <p>
     * If true, then the column is removed.
     * </p>
     * 
     * @param dropped
     *        If true, then the column is removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mapping withDropped(Boolean dropped) {
        setDropped(dropped);
        return this;
    }

    /**
     * <p>
     * If true, then the column is removed.
     * </p>
     * 
     * @return If true, then the column is removed.
     */

    public Boolean isDropped() {
        return this.dropped;
    }

    /**
     * <p>
     * Only applicable to nested data structures. If you want to change the parent structure, but also one of its
     * children, you can fill out this data strucutre. It is also <code>Mapping</code>, but its <code>FromPath</code>
     * will be the parent's <code>FromPath</code> plus the <code>FromPath</code> from this structure.
     * </p>
     * <p>
     * For the children part, suppose you have the structure:
     * </p>
     * <p>
     * <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     * </p>
     * <p>
     * You can specify a <code>Mapping</code> that looks like:
     * </p>
     * <p>
     * <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     * </p>
     * 
     * @return Only applicable to nested data structures. If you want to change the parent structure, but also one of
     *         its children, you can fill out this data strucutre. It is also <code>Mapping</code>, but its
     *         <code>FromPath</code> will be the parent's <code>FromPath</code> plus the <code>FromPath</code> from this
     *         structure.</p>
     *         <p>
     *         For the children part, suppose you have the structure:
     *         </p>
     *         <p>
     *         <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     *         </p>
     *         <p>
     *         You can specify a <code>Mapping</code> that looks like:
     *         </p>
     *         <p>
     *         <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     */

    public java.util.List<Mapping> getChildren() {
        return children;
    }

    /**
     * <p>
     * Only applicable to nested data structures. If you want to change the parent structure, but also one of its
     * children, you can fill out this data strucutre. It is also <code>Mapping</code>, but its <code>FromPath</code>
     * will be the parent's <code>FromPath</code> plus the <code>FromPath</code> from this structure.
     * </p>
     * <p>
     * For the children part, suppose you have the structure:
     * </p>
     * <p>
     * <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     * </p>
     * <p>
     * You can specify a <code>Mapping</code> that looks like:
     * </p>
     * <p>
     * <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     * </p>
     * 
     * @param children
     *        Only applicable to nested data structures. If you want to change the parent structure, but also one of its
     *        children, you can fill out this data strucutre. It is also <code>Mapping</code>, but its
     *        <code>FromPath</code> will be the parent's <code>FromPath</code> plus the <code>FromPath</code> from this
     *        structure.</p>
     *        <p>
     *        For the children part, suppose you have the structure:
     *        </p>
     *        <p>
     *        <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     *        </p>
     *        <p>
     *        You can specify a <code>Mapping</code> that looks like:
     *        </p>
     *        <p>
     *        <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     */

    public void setChildren(java.util.Collection<Mapping> children) {
        if (children == null) {
            this.children = null;
            return;
        }

        this.children = new java.util.ArrayList<Mapping>(children);
    }

    /**
     * <p>
     * Only applicable to nested data structures. If you want to change the parent structure, but also one of its
     * children, you can fill out this data strucutre. It is also <code>Mapping</code>, but its <code>FromPath</code>
     * will be the parent's <code>FromPath</code> plus the <code>FromPath</code> from this structure.
     * </p>
     * <p>
     * For the children part, suppose you have the structure:
     * </p>
     * <p>
     * <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     * </p>
     * <p>
     * You can specify a <code>Mapping</code> that looks like:
     * </p>
     * <p>
     * <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChildren(java.util.Collection)} or {@link #withChildren(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param children
     *        Only applicable to nested data structures. If you want to change the parent structure, but also one of its
     *        children, you can fill out this data strucutre. It is also <code>Mapping</code>, but its
     *        <code>FromPath</code> will be the parent's <code>FromPath</code> plus the <code>FromPath</code> from this
     *        structure.</p>
     *        <p>
     *        For the children part, suppose you have the structure:
     *        </p>
     *        <p>
     *        <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     *        </p>
     *        <p>
     *        You can specify a <code>Mapping</code> that looks like:
     *        </p>
     *        <p>
     *        <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mapping withChildren(Mapping... children) {
        if (this.children == null) {
            setChildren(new java.util.ArrayList<Mapping>(children.length));
        }
        for (Mapping ele : children) {
            this.children.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Only applicable to nested data structures. If you want to change the parent structure, but also one of its
     * children, you can fill out this data strucutre. It is also <code>Mapping</code>, but its <code>FromPath</code>
     * will be the parent's <code>FromPath</code> plus the <code>FromPath</code> from this structure.
     * </p>
     * <p>
     * For the children part, suppose you have the structure:
     * </p>
     * <p>
     * <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     * </p>
     * <p>
     * You can specify a <code>Mapping</code> that looks like:
     * </p>
     * <p>
     * <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     * </p>
     * 
     * @param children
     *        Only applicable to nested data structures. If you want to change the parent structure, but also one of its
     *        children, you can fill out this data strucutre. It is also <code>Mapping</code>, but its
     *        <code>FromPath</code> will be the parent's <code>FromPath</code> plus the <code>FromPath</code> from this
     *        structure.</p>
     *        <p>
     *        For the children part, suppose you have the structure:
     *        </p>
     *        <p>
     *        <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     *        </p>
     *        <p>
     *        You can specify a <code>Mapping</code> that looks like:
     *        </p>
     *        <p>
     *        <code>{ "FromPath": "OuterStructure", "ToKey": "OuterStructure", "ToType": "Struct", "Dropped": false, "Chidlren": [{ "FromPath": "inner", "ToKey": "inner", "ToType": "Double", "Dropped": false, }] }</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Mapping withChildren(java.util.Collection<Mapping> children) {
        setChildren(children);
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
        if (getToKey() != null)
            sb.append("ToKey: ").append(getToKey()).append(",");
        if (getFromPath() != null)
            sb.append("FromPath: ").append(getFromPath()).append(",");
        if (getFromType() != null)
            sb.append("FromType: ").append(getFromType()).append(",");
        if (getToType() != null)
            sb.append("ToType: ").append(getToType()).append(",");
        if (getDropped() != null)
            sb.append("Dropped: ").append(getDropped()).append(",");
        if (getChildren() != null)
            sb.append("Children: ").append(getChildren());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Mapping == false)
            return false;
        Mapping other = (Mapping) obj;
        if (other.getToKey() == null ^ this.getToKey() == null)
            return false;
        if (other.getToKey() != null && other.getToKey().equals(this.getToKey()) == false)
            return false;
        if (other.getFromPath() == null ^ this.getFromPath() == null)
            return false;
        if (other.getFromPath() != null && other.getFromPath().equals(this.getFromPath()) == false)
            return false;
        if (other.getFromType() == null ^ this.getFromType() == null)
            return false;
        if (other.getFromType() != null && other.getFromType().equals(this.getFromType()) == false)
            return false;
        if (other.getToType() == null ^ this.getToType() == null)
            return false;
        if (other.getToType() != null && other.getToType().equals(this.getToType()) == false)
            return false;
        if (other.getDropped() == null ^ this.getDropped() == null)
            return false;
        if (other.getDropped() != null && other.getDropped().equals(this.getDropped()) == false)
            return false;
        if (other.getChildren() == null ^ this.getChildren() == null)
            return false;
        if (other.getChildren() != null && other.getChildren().equals(this.getChildren()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getToKey() == null) ? 0 : getToKey().hashCode());
        hashCode = prime * hashCode + ((getFromPath() == null) ? 0 : getFromPath().hashCode());
        hashCode = prime * hashCode + ((getFromType() == null) ? 0 : getFromType().hashCode());
        hashCode = prime * hashCode + ((getToType() == null) ? 0 : getToType().hashCode());
        hashCode = prime * hashCode + ((getDropped() == null) ? 0 : getDropped().hashCode());
        hashCode = prime * hashCode + ((getChildren() == null) ? 0 : getChildren().hashCode());
        return hashCode;
    }

    @Override
    public Mapping clone() {
        try {
            return (Mapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.MappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
