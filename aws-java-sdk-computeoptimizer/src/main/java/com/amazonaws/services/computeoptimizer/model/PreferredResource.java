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
 * The preference to control which resource type values are considered when generating rightsizing recommendations. You
 * can specify this preference as a combination of include and exclude lists. You must specify either an
 * <code>includeList</code> or <code>excludeList</code>. If the preference is an empty set of resource type values, an
 * error occurs. For more information, see <a
 * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/rightsizing-preferences.html"> Rightsizing
 * recommendation preferences</a> in the <i>Compute Optimizer User Guide</i>.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * This preference is only available for the Amazon EC2 instance and Auto Scaling group resource types.
 * </p>
 * </li>
 * <li>
 * <p>
 * Compute Optimizer only supports the customization of <code>Ec2InstanceTypes</code>.
 * </p>
 * </li>
 * </ul>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/PreferredResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PreferredResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of preferred resource to customize.
     * </p>
     * <note>
     * <p>
     * Compute Optimizer only supports the customization of <code>Ec2InstanceTypes</code>.
     * </p>
     * </note>
     */
    private String name;
    /**
     * <p>
     * The preferred resource type values to include in the recommendation candidates. You can specify the exact
     * resource type value, such as m5.large, or use wild card expressions, such as m5. If this isn’t specified, all
     * supported resources are included by default. You can specify up to 1000 values in this list.
     * </p>
     */
    private java.util.List<String> includeList;
    /**
     * <p>
     * The preferred resource type values to exclude from the recommendation candidates. If this isn’t specified, all
     * supported resources are included by default. You can specify up to 1000 values in this list.
     * </p>
     */
    private java.util.List<String> excludeList;

    /**
     * <p>
     * The type of preferred resource to customize.
     * </p>
     * <note>
     * <p>
     * Compute Optimizer only supports the customization of <code>Ec2InstanceTypes</code>.
     * </p>
     * </note>
     * 
     * @param name
     *        The type of preferred resource to customize. </p> <note>
     *        <p>
     *        Compute Optimizer only supports the customization of <code>Ec2InstanceTypes</code>.
     *        </p>
     * @see PreferredResourceName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The type of preferred resource to customize.
     * </p>
     * <note>
     * <p>
     * Compute Optimizer only supports the customization of <code>Ec2InstanceTypes</code>.
     * </p>
     * </note>
     * 
     * @return The type of preferred resource to customize. </p> <note>
     *         <p>
     *         Compute Optimizer only supports the customization of <code>Ec2InstanceTypes</code>.
     *         </p>
     * @see PreferredResourceName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The type of preferred resource to customize.
     * </p>
     * <note>
     * <p>
     * Compute Optimizer only supports the customization of <code>Ec2InstanceTypes</code>.
     * </p>
     * </note>
     * 
     * @param name
     *        The type of preferred resource to customize. </p> <note>
     *        <p>
     *        Compute Optimizer only supports the customization of <code>Ec2InstanceTypes</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreferredResourceName
     */

    public PreferredResource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of preferred resource to customize.
     * </p>
     * <note>
     * <p>
     * Compute Optimizer only supports the customization of <code>Ec2InstanceTypes</code>.
     * </p>
     * </note>
     * 
     * @param name
     *        The type of preferred resource to customize. </p> <note>
     *        <p>
     *        Compute Optimizer only supports the customization of <code>Ec2InstanceTypes</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreferredResourceName
     */

    public PreferredResource withName(PreferredResourceName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The preferred resource type values to include in the recommendation candidates. You can specify the exact
     * resource type value, such as m5.large, or use wild card expressions, such as m5. If this isn’t specified, all
     * supported resources are included by default. You can specify up to 1000 values in this list.
     * </p>
     * 
     * @return The preferred resource type values to include in the recommendation candidates. You can specify the exact
     *         resource type value, such as m5.large, or use wild card expressions, such as m5. If this isn’t specified,
     *         all supported resources are included by default. You can specify up to 1000 values in this list.
     */

    public java.util.List<String> getIncludeList() {
        return includeList;
    }

    /**
     * <p>
     * The preferred resource type values to include in the recommendation candidates. You can specify the exact
     * resource type value, such as m5.large, or use wild card expressions, such as m5. If this isn’t specified, all
     * supported resources are included by default. You can specify up to 1000 values in this list.
     * </p>
     * 
     * @param includeList
     *        The preferred resource type values to include in the recommendation candidates. You can specify the exact
     *        resource type value, such as m5.large, or use wild card expressions, such as m5. If this isn’t specified,
     *        all supported resources are included by default. You can specify up to 1000 values in this list.
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
     * The preferred resource type values to include in the recommendation candidates. You can specify the exact
     * resource type value, such as m5.large, or use wild card expressions, such as m5. If this isn’t specified, all
     * supported resources are included by default. You can specify up to 1000 values in this list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludeList(java.util.Collection)} or {@link #withIncludeList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param includeList
     *        The preferred resource type values to include in the recommendation candidates. You can specify the exact
     *        resource type value, such as m5.large, or use wild card expressions, such as m5. If this isn’t specified,
     *        all supported resources are included by default. You can specify up to 1000 values in this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreferredResource withIncludeList(String... includeList) {
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
     * The preferred resource type values to include in the recommendation candidates. You can specify the exact
     * resource type value, such as m5.large, or use wild card expressions, such as m5. If this isn’t specified, all
     * supported resources are included by default. You can specify up to 1000 values in this list.
     * </p>
     * 
     * @param includeList
     *        The preferred resource type values to include in the recommendation candidates. You can specify the exact
     *        resource type value, such as m5.large, or use wild card expressions, such as m5. If this isn’t specified,
     *        all supported resources are included by default. You can specify up to 1000 values in this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreferredResource withIncludeList(java.util.Collection<String> includeList) {
        setIncludeList(includeList);
        return this;
    }

    /**
     * <p>
     * The preferred resource type values to exclude from the recommendation candidates. If this isn’t specified, all
     * supported resources are included by default. You can specify up to 1000 values in this list.
     * </p>
     * 
     * @return The preferred resource type values to exclude from the recommendation candidates. If this isn’t
     *         specified, all supported resources are included by default. You can specify up to 1000 values in this
     *         list.
     */

    public java.util.List<String> getExcludeList() {
        return excludeList;
    }

    /**
     * <p>
     * The preferred resource type values to exclude from the recommendation candidates. If this isn’t specified, all
     * supported resources are included by default. You can specify up to 1000 values in this list.
     * </p>
     * 
     * @param excludeList
     *        The preferred resource type values to exclude from the recommendation candidates. If this isn’t specified,
     *        all supported resources are included by default. You can specify up to 1000 values in this list.
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
     * The preferred resource type values to exclude from the recommendation candidates. If this isn’t specified, all
     * supported resources are included by default. You can specify up to 1000 values in this list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludeList(java.util.Collection)} or {@link #withExcludeList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param excludeList
     *        The preferred resource type values to exclude from the recommendation candidates. If this isn’t specified,
     *        all supported resources are included by default. You can specify up to 1000 values in this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreferredResource withExcludeList(String... excludeList) {
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
     * The preferred resource type values to exclude from the recommendation candidates. If this isn’t specified, all
     * supported resources are included by default. You can specify up to 1000 values in this list.
     * </p>
     * 
     * @param excludeList
     *        The preferred resource type values to exclude from the recommendation candidates. If this isn’t specified,
     *        all supported resources are included by default. You can specify up to 1000 values in this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreferredResource withExcludeList(java.util.Collection<String> excludeList) {
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

        if (obj instanceof PreferredResource == false)
            return false;
        PreferredResource other = (PreferredResource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIncludeList() == null ^ this.getIncludeList() == null)
            return false;
        if (other.getIncludeList() != null && other.getIncludeList().equals(this.getIncludeList()) == false)
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
        hashCode = prime * hashCode + ((getExcludeList() == null) ? 0 : getExcludeList().hashCode());
        return hashCode;
    }

    @Override
    public PreferredResource clone() {
        try {
            return (PreferredResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.PreferredResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
