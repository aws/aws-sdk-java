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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the effective preferred resources that Compute Optimizer considers as rightsizing recommendation
 * candidates.
 * </p>
 * <note>
 * <p>
 * Compute Optimizer only supports Amazon EC2 instance types.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/EffectivePreferredResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EffectivePreferredResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the preferred resource list.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The list of preferred resource values that you want considered as rightsizing recommendation candidates.
     * </p>
     */
    private java.util.List<String> includeList;
    /**
     * <p>
     * The expanded version of your preferred resource's include list.
     * </p>
     */
    private java.util.List<String> effectiveIncludeList;
    /**
     * <p>
     * The list of preferred resources values that you want excluded from rightsizing recommendation candidates.
     * </p>
     */
    private java.util.List<String> excludeList;

    /**
     * <p>
     * The name of the preferred resource list.
     * </p>
     * 
     * @param name
     *        The name of the preferred resource list.
     * @see PreferredResourceName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the preferred resource list.
     * </p>
     * 
     * @return The name of the preferred resource list.
     * @see PreferredResourceName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the preferred resource list.
     * </p>
     * 
     * @param name
     *        The name of the preferred resource list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreferredResourceName
     */

    public EffectivePreferredResource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the preferred resource list.
     * </p>
     * 
     * @param name
     *        The name of the preferred resource list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreferredResourceName
     */

    public EffectivePreferredResource withName(PreferredResourceName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The list of preferred resource values that you want considered as rightsizing recommendation candidates.
     * </p>
     * 
     * @return The list of preferred resource values that you want considered as rightsizing recommendation candidates.
     */

    public java.util.List<String> getIncludeList() {
        return includeList;
    }

    /**
     * <p>
     * The list of preferred resource values that you want considered as rightsizing recommendation candidates.
     * </p>
     * 
     * @param includeList
     *        The list of preferred resource values that you want considered as rightsizing recommendation candidates.
     */

    public void setIncludeList(java.util.Collection<String> includeList) {
        if (includeList == null) {
            this.includeList = null;
            return;
        }

        this.includeList = new java.util.ArrayList<String>(includeList);
    }

    /**
     * <p>
     * The list of preferred resource values that you want considered as rightsizing recommendation candidates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludeList(java.util.Collection)} or {@link #withIncludeList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param includeList
     *        The list of preferred resource values that you want considered as rightsizing recommendation candidates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectivePreferredResource withIncludeList(String... includeList) {
        if (this.includeList == null) {
            setIncludeList(new java.util.ArrayList<String>(includeList.length));
        }
        for (String ele : includeList) {
            this.includeList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of preferred resource values that you want considered as rightsizing recommendation candidates.
     * </p>
     * 
     * @param includeList
     *        The list of preferred resource values that you want considered as rightsizing recommendation candidates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectivePreferredResource withIncludeList(java.util.Collection<String> includeList) {
        setIncludeList(includeList);
        return this;
    }

    /**
     * <p>
     * The expanded version of your preferred resource's include list.
     * </p>
     * 
     * @return The expanded version of your preferred resource's include list.
     */

    public java.util.List<String> getEffectiveIncludeList() {
        return effectiveIncludeList;
    }

    /**
     * <p>
     * The expanded version of your preferred resource's include list.
     * </p>
     * 
     * @param effectiveIncludeList
     *        The expanded version of your preferred resource's include list.
     */

    public void setEffectiveIncludeList(java.util.Collection<String> effectiveIncludeList) {
        if (effectiveIncludeList == null) {
            this.effectiveIncludeList = null;
            return;
        }

        this.effectiveIncludeList = new java.util.ArrayList<String>(effectiveIncludeList);
    }

    /**
     * <p>
     * The expanded version of your preferred resource's include list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEffectiveIncludeList(java.util.Collection)} or {@link #withEffectiveIncludeList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param effectiveIncludeList
     *        The expanded version of your preferred resource's include list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectivePreferredResource withEffectiveIncludeList(String... effectiveIncludeList) {
        if (this.effectiveIncludeList == null) {
            setEffectiveIncludeList(new java.util.ArrayList<String>(effectiveIncludeList.length));
        }
        for (String ele : effectiveIncludeList) {
            this.effectiveIncludeList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The expanded version of your preferred resource's include list.
     * </p>
     * 
     * @param effectiveIncludeList
     *        The expanded version of your preferred resource's include list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectivePreferredResource withEffectiveIncludeList(java.util.Collection<String> effectiveIncludeList) {
        setEffectiveIncludeList(effectiveIncludeList);
        return this;
    }

    /**
     * <p>
     * The list of preferred resources values that you want excluded from rightsizing recommendation candidates.
     * </p>
     * 
     * @return The list of preferred resources values that you want excluded from rightsizing recommendation candidates.
     */

    public java.util.List<String> getExcludeList() {
        return excludeList;
    }

    /**
     * <p>
     * The list of preferred resources values that you want excluded from rightsizing recommendation candidates.
     * </p>
     * 
     * @param excludeList
     *        The list of preferred resources values that you want excluded from rightsizing recommendation candidates.
     */

    public void setExcludeList(java.util.Collection<String> excludeList) {
        if (excludeList == null) {
            this.excludeList = null;
            return;
        }

        this.excludeList = new java.util.ArrayList<String>(excludeList);
    }

    /**
     * <p>
     * The list of preferred resources values that you want excluded from rightsizing recommendation candidates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeList(java.util.Collection)} or {@link #withExcludeList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param excludeList
     *        The list of preferred resources values that you want excluded from rightsizing recommendation candidates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectivePreferredResource withExcludeList(String... excludeList) {
        if (this.excludeList == null) {
            setExcludeList(new java.util.ArrayList<String>(excludeList.length));
        }
        for (String ele : excludeList) {
            this.excludeList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of preferred resources values that you want excluded from rightsizing recommendation candidates.
     * </p>
     * 
     * @param excludeList
     *        The list of preferred resources values that you want excluded from rightsizing recommendation candidates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectivePreferredResource withExcludeList(java.util.Collection<String> excludeList) {
        setExcludeList(excludeList);
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
        if (getIncludeList() != null)
            sb.append("IncludeList: ").append(getIncludeList()).append(",");
        if (getEffectiveIncludeList() != null)
            sb.append("EffectiveIncludeList: ").append(getEffectiveIncludeList()).append(",");
        if (getExcludeList() != null)
            sb.append("ExcludeList: ").append(getExcludeList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EffectivePreferredResource == false)
            return false;
        EffectivePreferredResource other = (EffectivePreferredResource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIncludeList() == null ^ this.getIncludeList() == null)
            return false;
        if (other.getIncludeList() != null && other.getIncludeList().equals(this.getIncludeList()) == false)
            return false;
        if (other.getEffectiveIncludeList() == null ^ this.getEffectiveIncludeList() == null)
            return false;
        if (other.getEffectiveIncludeList() != null && other.getEffectiveIncludeList().equals(this.getEffectiveIncludeList()) == false)
            return false;
        if (other.getExcludeList() == null ^ this.getExcludeList() == null)
            return false;
        if (other.getExcludeList() != null && other.getExcludeList().equals(this.getExcludeList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIncludeList() == null) ? 0 : getIncludeList().hashCode());
        hashCode = prime * hashCode + ((getEffectiveIncludeList() == null) ? 0 : getEffectiveIncludeList().hashCode());
        hashCode = prime * hashCode + ((getExcludeList() == null) ? 0 : getExcludeList().hashCode());
        return hashCode;
    }

    @Override
    public EffectivePreferredResource clone() {
        try {
            return (EffectivePreferredResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.EffectivePreferredResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
