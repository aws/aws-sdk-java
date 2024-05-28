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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a physical resource. A physical resource is a resource that exists in your account. It can be identified
 * using an Amazon Resource Name (ARN) or an Resilience Hub-native identifier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/PhysicalResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhysicalResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note>
     */
    private java.util.Map<String, java.util.List<String>> additionalInfo;
    /**
     * <p>
     * The application components that belong to this resource.
     * </p>
     */
    private java.util.List<AppComponent> appComponents;
    /**
     * <p>
     * Indicates if a resource is included or excluded from the assessment.
     * </p>
     */
    private Boolean excluded;
    /**
     * <p>
     * Logical identifier of the resource.
     * </p>
     */
    private LogicalResourceId logicalResourceId;
    /**
     * <p>
     * Name of the parent resource.
     * </p>
     */
    private String parentResourceName;
    /**
     * <p>
     * Identifier of the physical resource.
     * </p>
     */
    private PhysicalResourceId physicalResourceId;
    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * Type of resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Type of input source.
     * </p>
     */
    private String sourceType;

    /**
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note>
     * 
     * @return Additional configuration parameters for an Resilience Hub application. If you want to implement
     *         <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *         href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *         application configuration parameters</a>.</p> <note>
     *         <p>
     *         Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region
     *         and one associated account.
     *         </p>
     *         <p>
     *         Key: <code>"failover-regions"</code>
     *         </p>
     *         <p>
     *         Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     *         </p>
     */

    public java.util.Map<String, java.util.List<String>> getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note>
     * 
     * @param additionalInfo
     *        Additional configuration parameters for an Resilience Hub application. If you want to implement
     *        <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *        href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *        application configuration parameters</a>.</p> <note>
     *        <p>
     *        Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and
     *        one associated account.
     *        </p>
     *        <p>
     *        Key: <code>"failover-regions"</code>
     *        </p>
     *        <p>
     *        Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     *        </p>
     */

    public void setAdditionalInfo(java.util.Map<String, java.util.List<String>> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note>
     * 
     * @param additionalInfo
     *        Additional configuration parameters for an Resilience Hub application. If you want to implement
     *        <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *        href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *        application configuration parameters</a>.</p> <note>
     *        <p>
     *        Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and
     *        one associated account.
     *        </p>
     *        <p>
     *        Key: <code>"failover-regions"</code>
     *        </p>
     *        <p>
     *        Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource withAdditionalInfo(java.util.Map<String, java.util.List<String>> additionalInfo) {
        setAdditionalInfo(additionalInfo);
        return this;
    }

    /**
     * Add a single AdditionalInfo entry
     *
     * @see PhysicalResource#withAdditionalInfo
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource addAdditionalInfoEntry(String key, java.util.List<String> value) {
        if (null == this.additionalInfo) {
            this.additionalInfo = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.additionalInfo.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalInfo.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalInfo.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource clearAdditionalInfoEntries() {
        this.additionalInfo = null;
        return this;
    }

    /**
     * <p>
     * The application components that belong to this resource.
     * </p>
     * 
     * @return The application components that belong to this resource.
     */

    public java.util.List<AppComponent> getAppComponents() {
        return appComponents;
    }

    /**
     * <p>
     * The application components that belong to this resource.
     * </p>
     * 
     * @param appComponents
     *        The application components that belong to this resource.
     */

    public void setAppComponents(java.util.Collection<AppComponent> appComponents) {
        if (appComponents == null) {
            this.appComponents = null;
            return;
        }

        this.appComponents = new java.util.ArrayList<AppComponent>(appComponents);
    }

    /**
     * <p>
     * The application components that belong to this resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppComponents(java.util.Collection)} or {@link #withAppComponents(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param appComponents
     *        The application components that belong to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource withAppComponents(AppComponent... appComponents) {
        if (this.appComponents == null) {
            setAppComponents(new java.util.ArrayList<AppComponent>(appComponents.length));
        }
        for (AppComponent ele : appComponents) {
            this.appComponents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The application components that belong to this resource.
     * </p>
     * 
     * @param appComponents
     *        The application components that belong to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource withAppComponents(java.util.Collection<AppComponent> appComponents) {
        setAppComponents(appComponents);
        return this;
    }

    /**
     * <p>
     * Indicates if a resource is included or excluded from the assessment.
     * </p>
     * 
     * @param excluded
     *        Indicates if a resource is included or excluded from the assessment.
     */

    public void setExcluded(Boolean excluded) {
        this.excluded = excluded;
    }

    /**
     * <p>
     * Indicates if a resource is included or excluded from the assessment.
     * </p>
     * 
     * @return Indicates if a resource is included or excluded from the assessment.
     */

    public Boolean getExcluded() {
        return this.excluded;
    }

    /**
     * <p>
     * Indicates if a resource is included or excluded from the assessment.
     * </p>
     * 
     * @param excluded
     *        Indicates if a resource is included or excluded from the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource withExcluded(Boolean excluded) {
        setExcluded(excluded);
        return this;
    }

    /**
     * <p>
     * Indicates if a resource is included or excluded from the assessment.
     * </p>
     * 
     * @return Indicates if a resource is included or excluded from the assessment.
     */

    public Boolean isExcluded() {
        return this.excluded;
    }

    /**
     * <p>
     * Logical identifier of the resource.
     * </p>
     * 
     * @param logicalResourceId
     *        Logical identifier of the resource.
     */

    public void setLogicalResourceId(LogicalResourceId logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * Logical identifier of the resource.
     * </p>
     * 
     * @return Logical identifier of the resource.
     */

    public LogicalResourceId getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * Logical identifier of the resource.
     * </p>
     * 
     * @param logicalResourceId
     *        Logical identifier of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource withLogicalResourceId(LogicalResourceId logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * Name of the parent resource.
     * </p>
     * 
     * @param parentResourceName
     *        Name of the parent resource.
     */

    public void setParentResourceName(String parentResourceName) {
        this.parentResourceName = parentResourceName;
    }

    /**
     * <p>
     * Name of the parent resource.
     * </p>
     * 
     * @return Name of the parent resource.
     */

    public String getParentResourceName() {
        return this.parentResourceName;
    }

    /**
     * <p>
     * Name of the parent resource.
     * </p>
     * 
     * @param parentResourceName
     *        Name of the parent resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource withParentResourceName(String parentResourceName) {
        setParentResourceName(parentResourceName);
        return this;
    }

    /**
     * <p>
     * Identifier of the physical resource.
     * </p>
     * 
     * @param physicalResourceId
     *        Identifier of the physical resource.
     */

    public void setPhysicalResourceId(PhysicalResourceId physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * Identifier of the physical resource.
     * </p>
     * 
     * @return Identifier of the physical resource.
     */

    public PhysicalResourceId getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * Identifier of the physical resource.
     * </p>
     * 
     * @param physicalResourceId
     *        Identifier of the physical resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource withPhysicalResourceId(PhysicalResourceId physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
        return this;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * Type of resource.
     * </p>
     * 
     * @param resourceType
     *        Type of resource.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Type of resource.
     * </p>
     * 
     * @return Type of resource.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Type of resource.
     * </p>
     * 
     * @param resourceType
     *        Type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResource withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Type of input source.
     * </p>
     * 
     * @param sourceType
     *        Type of input source.
     * @see ResourceSourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * Type of input source.
     * </p>
     * 
     * @return Type of input source.
     * @see ResourceSourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * Type of input source.
     * </p>
     * 
     * @param sourceType
     *        Type of input source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceSourceType
     */

    public PhysicalResource withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * Type of input source.
     * </p>
     * 
     * @param sourceType
     *        Type of input source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceSourceType
     */

    public PhysicalResource withSourceType(ResourceSourceType sourceType) {
        this.sourceType = sourceType.toString();
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
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: ").append(getAdditionalInfo()).append(",");
        if (getAppComponents() != null)
            sb.append("AppComponents: ").append(getAppComponents()).append(",");
        if (getExcluded() != null)
            sb.append("Excluded: ").append(getExcluded()).append(",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getParentResourceName() != null)
            sb.append("ParentResourceName: ").append(getParentResourceName()).append(",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: ").append(getPhysicalResourceId()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhysicalResource == false)
            return false;
        PhysicalResource other = (PhysicalResource) obj;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        if (other.getAppComponents() == null ^ this.getAppComponents() == null)
            return false;
        if (other.getAppComponents() != null && other.getAppComponents().equals(this.getAppComponents()) == false)
            return false;
        if (other.getExcluded() == null ^ this.getExcluded() == null)
            return false;
        if (other.getExcluded() != null && other.getExcluded().equals(this.getExcluded()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getParentResourceName() == null ^ this.getParentResourceName() == null)
            return false;
        if (other.getParentResourceName() != null && other.getParentResourceName().equals(this.getParentResourceName()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        hashCode = prime * hashCode + ((getAppComponents() == null) ? 0 : getAppComponents().hashCode());
        hashCode = prime * hashCode + ((getExcluded() == null) ? 0 : getExcluded().hashCode());
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getParentResourceName() == null) ? 0 : getParentResourceName().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        return hashCode;
    }

    @Override
    public PhysicalResource clone() {
        try {
            return (PhysicalResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.PhysicalResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
