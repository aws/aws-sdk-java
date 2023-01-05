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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies elements that Amazon AppFlow includes in the file and folder names in the flow destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/PrefixConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrefixConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * </p>
     */
    private String prefixType;
    /**
     * <p>
     * Determines the level of granularity for the date and time that's included in the prefix.
     * </p>
     */
    private String prefixFormat;
    /**
     * <p>
     * Specifies whether the destination file path includes either or both of the following elements:
     * </p>
     * <dl>
     * <dt>EXECUTION_ID</dt>
     * <dd>
     * <p>
     * The ID that Amazon AppFlow assigns to the flow run.
     * </p>
     * </dd>
     * <dt>SCHEMA_VERSION</dt>
     * <dd>
     * <p>
     * The version number of your data schema. Amazon AppFlow assigns this version number. The version number increases
     * by one when you change any of the following settings in your flow configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Source-to-destination field mappings
     * </p>
     * </li>
     * <li>
     * <p>
     * Field data types
     * </p>
     * </li>
     * <li>
     * <p>
     * Partition keys
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     */
    private java.util.List<String> pathPrefixHierarchy;

    /**
     * <p>
     * Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * </p>
     * 
     * @param prefixType
     *        Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * @see PrefixType
     */

    public void setPrefixType(String prefixType) {
        this.prefixType = prefixType;
    }

    /**
     * <p>
     * Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * </p>
     * 
     * @return Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * @see PrefixType
     */

    public String getPrefixType() {
        return this.prefixType;
    }

    /**
     * <p>
     * Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * </p>
     * 
     * @param prefixType
     *        Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrefixType
     */

    public PrefixConfig withPrefixType(String prefixType) {
        setPrefixType(prefixType);
        return this;
    }

    /**
     * <p>
     * Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * </p>
     * 
     * @param prefixType
     *        Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrefixType
     */

    public PrefixConfig withPrefixType(PrefixType prefixType) {
        this.prefixType = prefixType.toString();
        return this;
    }

    /**
     * <p>
     * Determines the level of granularity for the date and time that's included in the prefix.
     * </p>
     * 
     * @param prefixFormat
     *        Determines the level of granularity for the date and time that's included in the prefix.
     * @see PrefixFormat
     */

    public void setPrefixFormat(String prefixFormat) {
        this.prefixFormat = prefixFormat;
    }

    /**
     * <p>
     * Determines the level of granularity for the date and time that's included in the prefix.
     * </p>
     * 
     * @return Determines the level of granularity for the date and time that's included in the prefix.
     * @see PrefixFormat
     */

    public String getPrefixFormat() {
        return this.prefixFormat;
    }

    /**
     * <p>
     * Determines the level of granularity for the date and time that's included in the prefix.
     * </p>
     * 
     * @param prefixFormat
     *        Determines the level of granularity for the date and time that's included in the prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrefixFormat
     */

    public PrefixConfig withPrefixFormat(String prefixFormat) {
        setPrefixFormat(prefixFormat);
        return this;
    }

    /**
     * <p>
     * Determines the level of granularity for the date and time that's included in the prefix.
     * </p>
     * 
     * @param prefixFormat
     *        Determines the level of granularity for the date and time that's included in the prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrefixFormat
     */

    public PrefixConfig withPrefixFormat(PrefixFormat prefixFormat) {
        this.prefixFormat = prefixFormat.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination file path includes either or both of the following elements:
     * </p>
     * <dl>
     * <dt>EXECUTION_ID</dt>
     * <dd>
     * <p>
     * The ID that Amazon AppFlow assigns to the flow run.
     * </p>
     * </dd>
     * <dt>SCHEMA_VERSION</dt>
     * <dd>
     * <p>
     * The version number of your data schema. Amazon AppFlow assigns this version number. The version number increases
     * by one when you change any of the following settings in your flow configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Source-to-destination field mappings
     * </p>
     * </li>
     * <li>
     * <p>
     * Field data types
     * </p>
     * </li>
     * <li>
     * <p>
     * Partition keys
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * 
     * @return Specifies whether the destination file path includes either or both of the following elements:</p>
     *         <dl>
     *         <dt>EXECUTION_ID</dt>
     *         <dd>
     *         <p>
     *         The ID that Amazon AppFlow assigns to the flow run.
     *         </p>
     *         </dd>
     *         <dt>SCHEMA_VERSION</dt>
     *         <dd>
     *         <p>
     *         The version number of your data schema. Amazon AppFlow assigns this version number. The version number
     *         increases by one when you change any of the following settings in your flow configuration:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Source-to-destination field mappings
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Field data types
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Partition keys
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     * @see PathPrefix
     */

    public java.util.List<String> getPathPrefixHierarchy() {
        return pathPrefixHierarchy;
    }

    /**
     * <p>
     * Specifies whether the destination file path includes either or both of the following elements:
     * </p>
     * <dl>
     * <dt>EXECUTION_ID</dt>
     * <dd>
     * <p>
     * The ID that Amazon AppFlow assigns to the flow run.
     * </p>
     * </dd>
     * <dt>SCHEMA_VERSION</dt>
     * <dd>
     * <p>
     * The version number of your data schema. Amazon AppFlow assigns this version number. The version number increases
     * by one when you change any of the following settings in your flow configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Source-to-destination field mappings
     * </p>
     * </li>
     * <li>
     * <p>
     * Field data types
     * </p>
     * </li>
     * <li>
     * <p>
     * Partition keys
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * 
     * @param pathPrefixHierarchy
     *        Specifies whether the destination file path includes either or both of the following elements:</p>
     *        <dl>
     *        <dt>EXECUTION_ID</dt>
     *        <dd>
     *        <p>
     *        The ID that Amazon AppFlow assigns to the flow run.
     *        </p>
     *        </dd>
     *        <dt>SCHEMA_VERSION</dt>
     *        <dd>
     *        <p>
     *        The version number of your data schema. Amazon AppFlow assigns this version number. The version number
     *        increases by one when you change any of the following settings in your flow configuration:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Source-to-destination field mappings
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Field data types
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Partition keys
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     * @see PathPrefix
     */

    public void setPathPrefixHierarchy(java.util.Collection<String> pathPrefixHierarchy) {
        if (pathPrefixHierarchy == null) {
            this.pathPrefixHierarchy = null;
            return;
        }

        this.pathPrefixHierarchy = new java.util.ArrayList<String>(pathPrefixHierarchy);
    }

    /**
     * <p>
     * Specifies whether the destination file path includes either or both of the following elements:
     * </p>
     * <dl>
     * <dt>EXECUTION_ID</dt>
     * <dd>
     * <p>
     * The ID that Amazon AppFlow assigns to the flow run.
     * </p>
     * </dd>
     * <dt>SCHEMA_VERSION</dt>
     * <dd>
     * <p>
     * The version number of your data schema. Amazon AppFlow assigns this version number. The version number increases
     * by one when you change any of the following settings in your flow configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Source-to-destination field mappings
     * </p>
     * </li>
     * <li>
     * <p>
     * Field data types
     * </p>
     * </li>
     * <li>
     * <p>
     * Partition keys
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPathPrefixHierarchy(java.util.Collection)} or {@link #withPathPrefixHierarchy(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param pathPrefixHierarchy
     *        Specifies whether the destination file path includes either or both of the following elements:</p>
     *        <dl>
     *        <dt>EXECUTION_ID</dt>
     *        <dd>
     *        <p>
     *        The ID that Amazon AppFlow assigns to the flow run.
     *        </p>
     *        </dd>
     *        <dt>SCHEMA_VERSION</dt>
     *        <dd>
     *        <p>
     *        The version number of your data schema. Amazon AppFlow assigns this version number. The version number
     *        increases by one when you change any of the following settings in your flow configuration:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Source-to-destination field mappings
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Field data types
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Partition keys
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PathPrefix
     */

    public PrefixConfig withPathPrefixHierarchy(String... pathPrefixHierarchy) {
        if (this.pathPrefixHierarchy == null) {
            setPathPrefixHierarchy(new java.util.ArrayList<String>(pathPrefixHierarchy.length));
        }
        for (String ele : pathPrefixHierarchy) {
            this.pathPrefixHierarchy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination file path includes either or both of the following elements:
     * </p>
     * <dl>
     * <dt>EXECUTION_ID</dt>
     * <dd>
     * <p>
     * The ID that Amazon AppFlow assigns to the flow run.
     * </p>
     * </dd>
     * <dt>SCHEMA_VERSION</dt>
     * <dd>
     * <p>
     * The version number of your data schema. Amazon AppFlow assigns this version number. The version number increases
     * by one when you change any of the following settings in your flow configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Source-to-destination field mappings
     * </p>
     * </li>
     * <li>
     * <p>
     * Field data types
     * </p>
     * </li>
     * <li>
     * <p>
     * Partition keys
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * 
     * @param pathPrefixHierarchy
     *        Specifies whether the destination file path includes either or both of the following elements:</p>
     *        <dl>
     *        <dt>EXECUTION_ID</dt>
     *        <dd>
     *        <p>
     *        The ID that Amazon AppFlow assigns to the flow run.
     *        </p>
     *        </dd>
     *        <dt>SCHEMA_VERSION</dt>
     *        <dd>
     *        <p>
     *        The version number of your data schema. Amazon AppFlow assigns this version number. The version number
     *        increases by one when you change any of the following settings in your flow configuration:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Source-to-destination field mappings
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Field data types
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Partition keys
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PathPrefix
     */

    public PrefixConfig withPathPrefixHierarchy(java.util.Collection<String> pathPrefixHierarchy) {
        setPathPrefixHierarchy(pathPrefixHierarchy);
        return this;
    }

    /**
     * <p>
     * Specifies whether the destination file path includes either or both of the following elements:
     * </p>
     * <dl>
     * <dt>EXECUTION_ID</dt>
     * <dd>
     * <p>
     * The ID that Amazon AppFlow assigns to the flow run.
     * </p>
     * </dd>
     * <dt>SCHEMA_VERSION</dt>
     * <dd>
     * <p>
     * The version number of your data schema. Amazon AppFlow assigns this version number. The version number increases
     * by one when you change any of the following settings in your flow configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Source-to-destination field mappings
     * </p>
     * </li>
     * <li>
     * <p>
     * Field data types
     * </p>
     * </li>
     * <li>
     * <p>
     * Partition keys
     * </p>
     * </li>
     * </ul>
     * </dd>
     * </dl>
     * 
     * @param pathPrefixHierarchy
     *        Specifies whether the destination file path includes either or both of the following elements:</p>
     *        <dl>
     *        <dt>EXECUTION_ID</dt>
     *        <dd>
     *        <p>
     *        The ID that Amazon AppFlow assigns to the flow run.
     *        </p>
     *        </dd>
     *        <dt>SCHEMA_VERSION</dt>
     *        <dd>
     *        <p>
     *        The version number of your data schema. Amazon AppFlow assigns this version number. The version number
     *        increases by one when you change any of the following settings in your flow configuration:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Source-to-destination field mappings
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Field data types
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Partition keys
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PathPrefix
     */

    public PrefixConfig withPathPrefixHierarchy(PathPrefix... pathPrefixHierarchy) {
        java.util.ArrayList<String> pathPrefixHierarchyCopy = new java.util.ArrayList<String>(pathPrefixHierarchy.length);
        for (PathPrefix value : pathPrefixHierarchy) {
            pathPrefixHierarchyCopy.add(value.toString());
        }
        if (getPathPrefixHierarchy() == null) {
            setPathPrefixHierarchy(pathPrefixHierarchyCopy);
        } else {
            getPathPrefixHierarchy().addAll(pathPrefixHierarchyCopy);
        }
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
        if (getPrefixType() != null)
            sb.append("PrefixType: ").append(getPrefixType()).append(",");
        if (getPrefixFormat() != null)
            sb.append("PrefixFormat: ").append(getPrefixFormat()).append(",");
        if (getPathPrefixHierarchy() != null)
            sb.append("PathPrefixHierarchy: ").append(getPathPrefixHierarchy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrefixConfig == false)
            return false;
        PrefixConfig other = (PrefixConfig) obj;
        if (other.getPrefixType() == null ^ this.getPrefixType() == null)
            return false;
        if (other.getPrefixType() != null && other.getPrefixType().equals(this.getPrefixType()) == false)
            return false;
        if (other.getPrefixFormat() == null ^ this.getPrefixFormat() == null)
            return false;
        if (other.getPrefixFormat() != null && other.getPrefixFormat().equals(this.getPrefixFormat()) == false)
            return false;
        if (other.getPathPrefixHierarchy() == null ^ this.getPathPrefixHierarchy() == null)
            return false;
        if (other.getPathPrefixHierarchy() != null && other.getPathPrefixHierarchy().equals(this.getPathPrefixHierarchy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefixType() == null) ? 0 : getPrefixType().hashCode());
        hashCode = prime * hashCode + ((getPrefixFormat() == null) ? 0 : getPrefixFormat().hashCode());
        hashCode = prime * hashCode + ((getPathPrefixHierarchy() == null) ? 0 : getPathPrefixHierarchy().hashCode());
        return hashCode;
    }

    @Override
    public PrefixConfig clone() {
        try {
            return (PrefixConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.PrefixConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
