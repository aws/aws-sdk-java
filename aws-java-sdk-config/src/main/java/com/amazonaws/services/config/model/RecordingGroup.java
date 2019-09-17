/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the types of AWS resource for which AWS Config records configuration changes.
 * </p>
 * <p>
 * In the recording group, you specify whether all supported types or specific types of resources are recorded.
 * </p>
 * <p>
 * By default, AWS Config records configuration changes for all supported types of regional resources that AWS Config
 * discovers in the region in which it is running. Regional resources are tied to a region and can be used only in that
 * region. Examples of regional resources are EC2 instances and EBS volumes.
 * </p>
 * <p>
 * You can also have AWS Config record configuration changes for supported types of global resources (for example, IAM
 * resources). Global resources are not tied to an individual region and can be used in all regions.
 * </p>
 * <important>
 * <p>
 * The configuration details for any global resource are the same in all regions. If you customize AWS Config in
 * multiple regions to record global resources, it will create multiple configuration items each time a global resource
 * changes: one configuration item for each region. These configuration items will contain identical data. To prevent
 * duplicate configuration items, you should consider customizing AWS Config in only one region to record global
 * resources, unless you want the configuration items to be available in multiple regions.
 * </p>
 * </important>
 * <p>
 * If you don't want AWS Config to record all resources, you can specify which types of resources it will record with
 * the <code>resourceTypes</code> parameter.
 * </p>
 * <p>
 * For a list of supported resource types, see <a
 * href="https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
 * >Supported Resource Types</a>.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/config/latest/developerguide/select-resources.html">Selecting Which Resources AWS
 * Config Records</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/RecordingGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordingGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether AWS Config records configuration changes for every supported type of regional resource.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of regional resource, it
     * starts recording resources of that type automatically.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, you cannot enumerate a list of <code>resourceTypes</code>.
     * </p>
     */
    private Boolean allSupported;
    /**
     * <p>
     * Specifies whether AWS Config includes all supported types of global resources (for example, IAM resources) with
     * the resources that it records.
     * </p>
     * <p>
     * Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     * <code>true</code>.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of global resource, it
     * starts recording resources of that type automatically.
     * </p>
     * <p>
     * The configuration details for any global resource are the same in all regions. To prevent duplicate configuration
     * items, you should consider customizing AWS Config in only one region to record global resources.
     * </p>
     */
    private Boolean includeGlobalResourceTypes;
    /**
     * <p>
     * A comma-separated list that specifies the types of AWS resources for which AWS Config records configuration
     * changes (for example, <code>AWS::EC2::Instance</code> or <code>AWS::CloudTrail::Trail</code>).
     * </p>
     * <p>
     * Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     * <code>false</code>.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of resource, it will not
     * record resources of that type unless you manually add that type to your recording group.
     * </p>
     * <p>
     * For a list of valid <code>resourceTypes</code> values, see the <b>resourceType Value</b> column in <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported AWS Resource Types</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypes;

    /**
     * <p>
     * Specifies whether AWS Config records configuration changes for every supported type of regional resource.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of regional resource, it
     * starts recording resources of that type automatically.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, you cannot enumerate a list of <code>resourceTypes</code>.
     * </p>
     * 
     * @param allSupported
     *        Specifies whether AWS Config records configuration changes for every supported type of regional
     *        resource.</p>
     *        <p>
     *        If you set this option to <code>true</code>, when AWS Config adds support for a new type of regional
     *        resource, it starts recording resources of that type automatically.
     *        </p>
     *        <p>
     *        If you set this option to <code>true</code>, you cannot enumerate a list of <code>resourceTypes</code>.
     */

    public void setAllSupported(Boolean allSupported) {
        this.allSupported = allSupported;
    }

    /**
     * <p>
     * Specifies whether AWS Config records configuration changes for every supported type of regional resource.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of regional resource, it
     * starts recording resources of that type automatically.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, you cannot enumerate a list of <code>resourceTypes</code>.
     * </p>
     * 
     * @return Specifies whether AWS Config records configuration changes for every supported type of regional
     *         resource.</p>
     *         <p>
     *         If you set this option to <code>true</code>, when AWS Config adds support for a new type of regional
     *         resource, it starts recording resources of that type automatically.
     *         </p>
     *         <p>
     *         If you set this option to <code>true</code>, you cannot enumerate a list of <code>resourceTypes</code>.
     */

    public Boolean getAllSupported() {
        return this.allSupported;
    }

    /**
     * <p>
     * Specifies whether AWS Config records configuration changes for every supported type of regional resource.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of regional resource, it
     * starts recording resources of that type automatically.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, you cannot enumerate a list of <code>resourceTypes</code>.
     * </p>
     * 
     * @param allSupported
     *        Specifies whether AWS Config records configuration changes for every supported type of regional
     *        resource.</p>
     *        <p>
     *        If you set this option to <code>true</code>, when AWS Config adds support for a new type of regional
     *        resource, it starts recording resources of that type automatically.
     *        </p>
     *        <p>
     *        If you set this option to <code>true</code>, you cannot enumerate a list of <code>resourceTypes</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordingGroup withAllSupported(Boolean allSupported) {
        setAllSupported(allSupported);
        return this;
    }

    /**
     * <p>
     * Specifies whether AWS Config records configuration changes for every supported type of regional resource.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of regional resource, it
     * starts recording resources of that type automatically.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, you cannot enumerate a list of <code>resourceTypes</code>.
     * </p>
     * 
     * @return Specifies whether AWS Config records configuration changes for every supported type of regional
     *         resource.</p>
     *         <p>
     *         If you set this option to <code>true</code>, when AWS Config adds support for a new type of regional
     *         resource, it starts recording resources of that type automatically.
     *         </p>
     *         <p>
     *         If you set this option to <code>true</code>, you cannot enumerate a list of <code>resourceTypes</code>.
     */

    public Boolean isAllSupported() {
        return this.allSupported;
    }

    /**
     * <p>
     * Specifies whether AWS Config includes all supported types of global resources (for example, IAM resources) with
     * the resources that it records.
     * </p>
     * <p>
     * Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     * <code>true</code>.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of global resource, it
     * starts recording resources of that type automatically.
     * </p>
     * <p>
     * The configuration details for any global resource are the same in all regions. To prevent duplicate configuration
     * items, you should consider customizing AWS Config in only one region to record global resources.
     * </p>
     * 
     * @param includeGlobalResourceTypes
     *        Specifies whether AWS Config includes all supported types of global resources (for example, IAM resources)
     *        with the resources that it records.</p>
     *        <p>
     *        Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     *        <code>true</code>.
     *        </p>
     *        <p>
     *        If you set this option to <code>true</code>, when AWS Config adds support for a new type of global
     *        resource, it starts recording resources of that type automatically.
     *        </p>
     *        <p>
     *        The configuration details for any global resource are the same in all regions. To prevent duplicate
     *        configuration items, you should consider customizing AWS Config in only one region to record global
     *        resources.
     */

    public void setIncludeGlobalResourceTypes(Boolean includeGlobalResourceTypes) {
        this.includeGlobalResourceTypes = includeGlobalResourceTypes;
    }

    /**
     * <p>
     * Specifies whether AWS Config includes all supported types of global resources (for example, IAM resources) with
     * the resources that it records.
     * </p>
     * <p>
     * Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     * <code>true</code>.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of global resource, it
     * starts recording resources of that type automatically.
     * </p>
     * <p>
     * The configuration details for any global resource are the same in all regions. To prevent duplicate configuration
     * items, you should consider customizing AWS Config in only one region to record global resources.
     * </p>
     * 
     * @return Specifies whether AWS Config includes all supported types of global resources (for example, IAM
     *         resources) with the resources that it records.</p>
     *         <p>
     *         Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     *         <code>true</code>.
     *         </p>
     *         <p>
     *         If you set this option to <code>true</code>, when AWS Config adds support for a new type of global
     *         resource, it starts recording resources of that type automatically.
     *         </p>
     *         <p>
     *         The configuration details for any global resource are the same in all regions. To prevent duplicate
     *         configuration items, you should consider customizing AWS Config in only one region to record global
     *         resources.
     */

    public Boolean getIncludeGlobalResourceTypes() {
        return this.includeGlobalResourceTypes;
    }

    /**
     * <p>
     * Specifies whether AWS Config includes all supported types of global resources (for example, IAM resources) with
     * the resources that it records.
     * </p>
     * <p>
     * Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     * <code>true</code>.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of global resource, it
     * starts recording resources of that type automatically.
     * </p>
     * <p>
     * The configuration details for any global resource are the same in all regions. To prevent duplicate configuration
     * items, you should consider customizing AWS Config in only one region to record global resources.
     * </p>
     * 
     * @param includeGlobalResourceTypes
     *        Specifies whether AWS Config includes all supported types of global resources (for example, IAM resources)
     *        with the resources that it records.</p>
     *        <p>
     *        Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     *        <code>true</code>.
     *        </p>
     *        <p>
     *        If you set this option to <code>true</code>, when AWS Config adds support for a new type of global
     *        resource, it starts recording resources of that type automatically.
     *        </p>
     *        <p>
     *        The configuration details for any global resource are the same in all regions. To prevent duplicate
     *        configuration items, you should consider customizing AWS Config in only one region to record global
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordingGroup withIncludeGlobalResourceTypes(Boolean includeGlobalResourceTypes) {
        setIncludeGlobalResourceTypes(includeGlobalResourceTypes);
        return this;
    }

    /**
     * <p>
     * Specifies whether AWS Config includes all supported types of global resources (for example, IAM resources) with
     * the resources that it records.
     * </p>
     * <p>
     * Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     * <code>true</code>.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of global resource, it
     * starts recording resources of that type automatically.
     * </p>
     * <p>
     * The configuration details for any global resource are the same in all regions. To prevent duplicate configuration
     * items, you should consider customizing AWS Config in only one region to record global resources.
     * </p>
     * 
     * @return Specifies whether AWS Config includes all supported types of global resources (for example, IAM
     *         resources) with the resources that it records.</p>
     *         <p>
     *         Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     *         <code>true</code>.
     *         </p>
     *         <p>
     *         If you set this option to <code>true</code>, when AWS Config adds support for a new type of global
     *         resource, it starts recording resources of that type automatically.
     *         </p>
     *         <p>
     *         The configuration details for any global resource are the same in all regions. To prevent duplicate
     *         configuration items, you should consider customizing AWS Config in only one region to record global
     *         resources.
     */

    public Boolean isIncludeGlobalResourceTypes() {
        return this.includeGlobalResourceTypes;
    }

    /**
     * <p>
     * A comma-separated list that specifies the types of AWS resources for which AWS Config records configuration
     * changes (for example, <code>AWS::EC2::Instance</code> or <code>AWS::CloudTrail::Trail</code>).
     * </p>
     * <p>
     * Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     * <code>false</code>.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of resource, it will not
     * record resources of that type unless you manually add that type to your recording group.
     * </p>
     * <p>
     * For a list of valid <code>resourceTypes</code> values, see the <b>resourceType Value</b> column in <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported AWS Resource Types</a>.
     * </p>
     * 
     * @return A comma-separated list that specifies the types of AWS resources for which AWS Config records
     *         configuration changes (for example, <code>AWS::EC2::Instance</code> or
     *         <code>AWS::CloudTrail::Trail</code>).</p>
     *         <p>
     *         Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     *         <code>false</code>.
     *         </p>
     *         <p>
     *         If you set this option to <code>true</code>, when AWS Config adds support for a new type of resource, it
     *         will not record resources of that type unless you manually add that type to your recording group.
     *         </p>
     *         <p>
     *         For a list of valid <code>resourceTypes</code> values, see the <b>resourceType Value</b> column in <a
     *         href=
     *         "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *         >Supported AWS Resource Types</a>.
     * @see ResourceType
     */

    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypes;
    }

    /**
     * <p>
     * A comma-separated list that specifies the types of AWS resources for which AWS Config records configuration
     * changes (for example, <code>AWS::EC2::Instance</code> or <code>AWS::CloudTrail::Trail</code>).
     * </p>
     * <p>
     * Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     * <code>false</code>.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of resource, it will not
     * record resources of that type unless you manually add that type to your recording group.
     * </p>
     * <p>
     * For a list of valid <code>resourceTypes</code> values, see the <b>resourceType Value</b> column in <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported AWS Resource Types</a>.
     * </p>
     * 
     * @param resourceTypes
     *        A comma-separated list that specifies the types of AWS resources for which AWS Config records
     *        configuration changes (for example, <code>AWS::EC2::Instance</code> or <code>AWS::CloudTrail::Trail</code>
     *        ).</p>
     *        <p>
     *        Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     *        <code>false</code>.
     *        </p>
     *        <p>
     *        If you set this option to <code>true</code>, when AWS Config adds support for a new type of resource, it
     *        will not record resources of that type unless you manually add that type to your recording group.
     *        </p>
     *        <p>
     *        For a list of valid <code>resourceTypes</code> values, see the <b>resourceType Value</b> column in <a
     *        href=
     *        "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported AWS Resource Types</a>.
     * @see ResourceType
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new com.amazonaws.internal.SdkInternalList<String>(resourceTypes);
    }

    /**
     * <p>
     * A comma-separated list that specifies the types of AWS resources for which AWS Config records configuration
     * changes (for example, <code>AWS::EC2::Instance</code> or <code>AWS::CloudTrail::Trail</code>).
     * </p>
     * <p>
     * Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     * <code>false</code>.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of resource, it will not
     * record resources of that type unless you manually add that type to your recording group.
     * </p>
     * <p>
     * For a list of valid <code>resourceTypes</code> values, see the <b>resourceType Value</b> column in <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported AWS Resource Types</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        A comma-separated list that specifies the types of AWS resources for which AWS Config records
     *        configuration changes (for example, <code>AWS::EC2::Instance</code> or <code>AWS::CloudTrail::Trail</code>
     *        ).</p>
     *        <p>
     *        Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     *        <code>false</code>.
     *        </p>
     *        <p>
     *        If you set this option to <code>true</code>, when AWS Config adds support for a new type of resource, it
     *        will not record resources of that type unless you manually add that type to your recording group.
     *        </p>
     *        <p>
     *        For a list of valid <code>resourceTypes</code> values, see the <b>resourceType Value</b> column in <a
     *        href=
     *        "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported AWS Resource Types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RecordingGroup withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A comma-separated list that specifies the types of AWS resources for which AWS Config records configuration
     * changes (for example, <code>AWS::EC2::Instance</code> or <code>AWS::CloudTrail::Trail</code>).
     * </p>
     * <p>
     * Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     * <code>false</code>.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of resource, it will not
     * record resources of that type unless you manually add that type to your recording group.
     * </p>
     * <p>
     * For a list of valid <code>resourceTypes</code> values, see the <b>resourceType Value</b> column in <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported AWS Resource Types</a>.
     * </p>
     * 
     * @param resourceTypes
     *        A comma-separated list that specifies the types of AWS resources for which AWS Config records
     *        configuration changes (for example, <code>AWS::EC2::Instance</code> or <code>AWS::CloudTrail::Trail</code>
     *        ).</p>
     *        <p>
     *        Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     *        <code>false</code>.
     *        </p>
     *        <p>
     *        If you set this option to <code>true</code>, when AWS Config adds support for a new type of resource, it
     *        will not record resources of that type unless you manually add that type to your recording group.
     *        </p>
     *        <p>
     *        For a list of valid <code>resourceTypes</code> values, see the <b>resourceType Value</b> column in <a
     *        href=
     *        "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported AWS Resource Types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RecordingGroup withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * A comma-separated list that specifies the types of AWS resources for which AWS Config records configuration
     * changes (for example, <code>AWS::EC2::Instance</code> or <code>AWS::CloudTrail::Trail</code>).
     * </p>
     * <p>
     * Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     * <code>false</code>.
     * </p>
     * <p>
     * If you set this option to <code>true</code>, when AWS Config adds support for a new type of resource, it will not
     * record resources of that type unless you manually add that type to your recording group.
     * </p>
     * <p>
     * For a list of valid <code>resourceTypes</code> values, see the <b>resourceType Value</b> column in <a href=
     * "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     * >Supported AWS Resource Types</a>.
     * </p>
     * 
     * @param resourceTypes
     *        A comma-separated list that specifies the types of AWS resources for which AWS Config records
     *        configuration changes (for example, <code>AWS::EC2::Instance</code> or <code>AWS::CloudTrail::Trail</code>
     *        ).</p>
     *        <p>
     *        Before you can set this option to <code>true</code>, you must set the <code>allSupported</code> option to
     *        <code>false</code>.
     *        </p>
     *        <p>
     *        If you set this option to <code>true</code>, when AWS Config adds support for a new type of resource, it
     *        will not record resources of that type unless you manually add that type to your recording group.
     *        </p>
     *        <p>
     *        For a list of valid <code>resourceTypes</code> values, see the <b>resourceType Value</b> column in <a
     *        href=
     *        "https://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources"
     *        >Supported AWS Resource Types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public RecordingGroup withResourceTypes(ResourceType... resourceTypes) {
        com.amazonaws.internal.SdkInternalList<String> resourceTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(resourceTypes.length);
        for (ResourceType value : resourceTypes) {
            resourceTypesCopy.add(value.toString());
        }
        if (getResourceTypes() == null) {
            setResourceTypes(resourceTypesCopy);
        } else {
            getResourceTypes().addAll(resourceTypesCopy);
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
        if (getAllSupported() != null)
            sb.append("AllSupported: ").append(getAllSupported()).append(",");
        if (getIncludeGlobalResourceTypes() != null)
            sb.append("IncludeGlobalResourceTypes: ").append(getIncludeGlobalResourceTypes()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordingGroup == false)
            return false;
        RecordingGroup other = (RecordingGroup) obj;
        if (other.getAllSupported() == null ^ this.getAllSupported() == null)
            return false;
        if (other.getAllSupported() != null && other.getAllSupported().equals(this.getAllSupported()) == false)
            return false;
        if (other.getIncludeGlobalResourceTypes() == null ^ this.getIncludeGlobalResourceTypes() == null)
            return false;
        if (other.getIncludeGlobalResourceTypes() != null && other.getIncludeGlobalResourceTypes().equals(this.getIncludeGlobalResourceTypes()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllSupported() == null) ? 0 : getAllSupported().hashCode());
        hashCode = prime * hashCode + ((getIncludeGlobalResourceTypes() == null) ? 0 : getIncludeGlobalResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        return hashCode;
    }

    @Override
    public RecordingGroup clone() {
        try {
            return (RecordingGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.RecordingGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
