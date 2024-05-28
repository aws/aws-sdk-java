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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Controls how a specific <code>Dashboard</code> resource is parameterized in the returned CloudFormation template.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleExportJobDashboardOverrideProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleExportJobDashboardOverrideProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the specific <code>Dashboard</code> resource whose override properties are configured in this
     * structure.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A list of <code>Dashboard</code> resource properties to generate variables for in the returned CloudFormation
     * template.
     * </p>
     */
    private java.util.List<String> properties;

    /**
     * <p>
     * The ARN of the specific <code>Dashboard</code> resource whose override properties are configured in this
     * structure.
     * </p>
     * 
     * @param arn
     *        The ARN of the specific <code>Dashboard</code> resource whose override properties are configured in this
     *        structure.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the specific <code>Dashboard</code> resource whose override properties are configured in this
     * structure.
     * </p>
     * 
     * @return The ARN of the specific <code>Dashboard</code> resource whose override properties are configured in this
     *         structure.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the specific <code>Dashboard</code> resource whose override properties are configured in this
     * structure.
     * </p>
     * 
     * @param arn
     *        The ARN of the specific <code>Dashboard</code> resource whose override properties are configured in this
     *        structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleExportJobDashboardOverrideProperties withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A list of <code>Dashboard</code> resource properties to generate variables for in the returned CloudFormation
     * template.
     * </p>
     * 
     * @return A list of <code>Dashboard</code> resource properties to generate variables for in the returned
     *         CloudFormation template.
     * @see AssetBundleExportJobDashboardPropertyToOverride
     */

    public java.util.List<String> getProperties() {
        return properties;
    }

    /**
     * <p>
     * A list of <code>Dashboard</code> resource properties to generate variables for in the returned CloudFormation
     * template.
     * </p>
     * 
     * @param properties
     *        A list of <code>Dashboard</code> resource properties to generate variables for in the returned
     *        CloudFormation template.
     * @see AssetBundleExportJobDashboardPropertyToOverride
     */

    public void setProperties(java.util.Collection<String> properties) {
        if (properties == null) {
            this.properties = null;
            return;
        }

        this.properties = new java.util.ArrayList<String>(properties);
    }

    /**
     * <p>
     * A list of <code>Dashboard</code> resource properties to generate variables for in the returned CloudFormation
     * template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProperties(java.util.Collection)} or {@link #withProperties(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param properties
     *        A list of <code>Dashboard</code> resource properties to generate variables for in the returned
     *        CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleExportJobDashboardPropertyToOverride
     */

    public AssetBundleExportJobDashboardOverrideProperties withProperties(String... properties) {
        if (this.properties == null) {
            setProperties(new java.util.ArrayList<String>(properties.length));
        }
        for (String ele : properties) {
            this.properties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Dashboard</code> resource properties to generate variables for in the returned CloudFormation
     * template.
     * </p>
     * 
     * @param properties
     *        A list of <code>Dashboard</code> resource properties to generate variables for in the returned
     *        CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleExportJobDashboardPropertyToOverride
     */

    public AssetBundleExportJobDashboardOverrideProperties withProperties(java.util.Collection<String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * <p>
     * A list of <code>Dashboard</code> resource properties to generate variables for in the returned CloudFormation
     * template.
     * </p>
     * 
     * @param properties
     *        A list of <code>Dashboard</code> resource properties to generate variables for in the returned
     *        CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleExportJobDashboardPropertyToOverride
     */

    public AssetBundleExportJobDashboardOverrideProperties withProperties(AssetBundleExportJobDashboardPropertyToOverride... properties) {
        java.util.ArrayList<String> propertiesCopy = new java.util.ArrayList<String>(properties.length);
        for (AssetBundleExportJobDashboardPropertyToOverride value : properties) {
            propertiesCopy.add(value.toString());
        }
        if (getProperties() == null) {
            setProperties(propertiesCopy);
        } else {
            getProperties().addAll(propertiesCopy);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleExportJobDashboardOverrideProperties == false)
            return false;
        AssetBundleExportJobDashboardOverrideProperties other = (AssetBundleExportJobDashboardOverrideProperties) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleExportJobDashboardOverrideProperties clone() {
        try {
            return (AssetBundleExportJobDashboardOverrideProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleExportJobDashboardOverridePropertiesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
