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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/UpdateAppVersionResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAppVersionResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Currently, there is no supported additional information for resources.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> additionalInfo;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * List of Application Components that this resource belongs to. If an Application Component is not part of the
     * Resilience Hub application, it will be added.
     * </p>
     */
    private java.util.List<String> appComponents;
    /**
     * <p>
     * Amazon Web Services account that owns the physical resource.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * Amazon Web Services region that owns the physical resource.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * Indicates if a resource is excluded from an Resilience Hub application.
     * </p>
     * <note>
     * <p>
     * You can exclude only imported resources from an Resilience Hub application.
     * </p>
     * </note>
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
     * Physical identifier of the resource.
     * </p>
     */
    private String physicalResourceId;
    /**
     * <p>
     * Name of the resource.
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
     * Currently, there is no supported additional information for resources.
     * </p>
     * 
     * @return Currently, there is no supported additional information for resources.
     */

    public java.util.Map<String, java.util.List<String>> getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * <p>
     * Currently, there is no supported additional information for resources.
     * </p>
     * 
     * @param additionalInfo
     *        Currently, there is no supported additional information for resources.
     */

    public void setAdditionalInfo(java.util.Map<String, java.util.List<String>> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * Currently, there is no supported additional information for resources.
     * </p>
     * 
     * @param additionalInfo
     *        Currently, there is no supported additional information for resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppVersionResourceRequest withAdditionalInfo(java.util.Map<String, java.util.List<String>> additionalInfo) {
        setAdditionalInfo(additionalInfo);
        return this;
    }

    /**
     * Add a single AdditionalInfo entry
     *
     * @see UpdateAppVersionResourceRequest#withAdditionalInfo
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppVersionResourceRequest addAdditionalInfoEntry(String key, java.util.List<String> value) {
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

    public UpdateAppVersionResourceRequest clearAdditionalInfoEntries() {
        this.additionalInfo = null;
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For
     *        more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *         <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>.
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For
     *        more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppVersionResourceRequest withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * List of Application Components that this resource belongs to. If an Application Component is not part of the
     * Resilience Hub application, it will be added.
     * </p>
     * 
     * @return List of Application Components that this resource belongs to. If an Application Component is not part of
     *         the Resilience Hub application, it will be added.
     */

    public java.util.List<String> getAppComponents() {
        return appComponents;
    }

    /**
     * <p>
     * List of Application Components that this resource belongs to. If an Application Component is not part of the
     * Resilience Hub application, it will be added.
     * </p>
     * 
     * @param appComponents
     *        List of Application Components that this resource belongs to. If an Application Component is not part of
     *        the Resilience Hub application, it will be added.
     */

    public void setAppComponents(java.util.Collection<String> appComponents) {
        if (appComponents == null) {
            this.appComponents = null;
            return;
        }

        this.appComponents = new java.util.ArrayList<String>(appComponents);
    }

    /**
     * <p>
     * List of Application Components that this resource belongs to. If an Application Component is not part of the
     * Resilience Hub application, it will be added.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppComponents(java.util.Collection)} or {@link #withAppComponents(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param appComponents
     *        List of Application Components that this resource belongs to. If an Application Component is not part of
     *        the Resilience Hub application, it will be added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppVersionResourceRequest withAppComponents(String... appComponents) {
        if (this.appComponents == null) {
            setAppComponents(new java.util.ArrayList<String>(appComponents.length));
        }
        for (String ele : appComponents) {
            this.appComponents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of Application Components that this resource belongs to. If an Application Component is not part of the
     * Resilience Hub application, it will be added.
     * </p>
     * 
     * @param appComponents
     *        List of Application Components that this resource belongs to. If an Application Component is not part of
     *        the Resilience Hub application, it will be added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppVersionResourceRequest withAppComponents(java.util.Collection<String> appComponents) {
        setAppComponents(appComponents);
        return this;
    }

    /**
     * <p>
     * Amazon Web Services account that owns the physical resource.
     * </p>
     * 
     * @param awsAccountId
     *        Amazon Web Services account that owns the physical resource.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * Amazon Web Services account that owns the physical resource.
     * </p>
     * 
     * @return Amazon Web Services account that owns the physical resource.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * Amazon Web Services account that owns the physical resource.
     * </p>
     * 
     * @param awsAccountId
     *        Amazon Web Services account that owns the physical resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppVersionResourceRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * Amazon Web Services region that owns the physical resource.
     * </p>
     * 
     * @param awsRegion
     *        Amazon Web Services region that owns the physical resource.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * Amazon Web Services region that owns the physical resource.
     * </p>
     * 
     * @return Amazon Web Services region that owns the physical resource.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * Amazon Web Services region that owns the physical resource.
     * </p>
     * 
     * @param awsRegion
     *        Amazon Web Services region that owns the physical resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppVersionResourceRequest withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * Indicates if a resource is excluded from an Resilience Hub application.
     * </p>
     * <note>
     * <p>
     * You can exclude only imported resources from an Resilience Hub application.
     * </p>
     * </note>
     * 
     * @param excluded
     *        Indicates if a resource is excluded from an Resilience Hub application.</p> <note>
     *        <p>
     *        You can exclude only imported resources from an Resilience Hub application.
     *        </p>
     */

    public void setExcluded(Boolean excluded) {
        this.excluded = excluded;
    }

    /**
     * <p>
     * Indicates if a resource is excluded from an Resilience Hub application.
     * </p>
     * <note>
     * <p>
     * You can exclude only imported resources from an Resilience Hub application.
     * </p>
     * </note>
     * 
     * @return Indicates if a resource is excluded from an Resilience Hub application.</p> <note>
     *         <p>
     *         You can exclude only imported resources from an Resilience Hub application.
     *         </p>
     */

    public Boolean getExcluded() {
        return this.excluded;
    }

    /**
     * <p>
     * Indicates if a resource is excluded from an Resilience Hub application.
     * </p>
     * <note>
     * <p>
     * You can exclude only imported resources from an Resilience Hub application.
     * </p>
     * </note>
     * 
     * @param excluded
     *        Indicates if a resource is excluded from an Resilience Hub application.</p> <note>
     *        <p>
     *        You can exclude only imported resources from an Resilience Hub application.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppVersionResourceRequest withExcluded(Boolean excluded) {
        setExcluded(excluded);
        return this;
    }

    /**
     * <p>
     * Indicates if a resource is excluded from an Resilience Hub application.
     * </p>
     * <note>
     * <p>
     * You can exclude only imported resources from an Resilience Hub application.
     * </p>
     * </note>
     * 
     * @return Indicates if a resource is excluded from an Resilience Hub application.</p> <note>
     *         <p>
     *         You can exclude only imported resources from an Resilience Hub application.
     *         </p>
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

    public UpdateAppVersionResourceRequest withLogicalResourceId(LogicalResourceId logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * Physical identifier of the resource.
     * </p>
     * 
     * @param physicalResourceId
     *        Physical identifier of the resource.
     */

    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * Physical identifier of the resource.
     * </p>
     * 
     * @return Physical identifier of the resource.
     */

    public String getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * Physical identifier of the resource.
     * </p>
     * 
     * @param physicalResourceId
     *        Physical identifier of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppVersionResourceRequest withPhysicalResourceId(String physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
        return this;
    }

    /**
     * <p>
     * Name of the resource.
     * </p>
     * 
     * @param resourceName
     *        Name of the resource.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * Name of the resource.
     * </p>
     * 
     * @return Name of the resource.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * Name of the resource.
     * </p>
     * 
     * @param resourceName
     *        Name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppVersionResourceRequest withResourceName(String resourceName) {
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

    public UpdateAppVersionResourceRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
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
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn()).append(",");
        if (getAppComponents() != null)
            sb.append("AppComponents: ").append(getAppComponents()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getExcluded() != null)
            sb.append("Excluded: ").append(getExcluded()).append(",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: ").append(getPhysicalResourceId()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAppVersionResourceRequest == false)
            return false;
        UpdateAppVersionResourceRequest other = (UpdateAppVersionResourceRequest) obj;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAppComponents() == null ^ this.getAppComponents() == null)
            return false;
        if (other.getAppComponents() != null && other.getAppComponents().equals(this.getAppComponents()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getExcluded() == null ^ this.getExcluded() == null)
            return false;
        if (other.getExcluded() != null && other.getExcluded().equals(this.getExcluded()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAppComponents() == null) ? 0 : getAppComponents().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getExcluded() == null) ? 0 : getExcluded().hashCode());
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAppVersionResourceRequest clone() {
        return (UpdateAppVersionResourceRequest) super.clone();
    }

}
