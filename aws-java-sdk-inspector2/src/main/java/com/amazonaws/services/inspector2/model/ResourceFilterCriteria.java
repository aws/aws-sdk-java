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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The resource filter criteria for a Software bill of materials (SBOM) report.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ResourceFilterCriteria" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceFilterCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account IDs used as resource filter criteria.
     * </p>
     */
    private java.util.List<ResourceStringFilter> accountId;
    /**
     * <p>
     * The EC2 instance tags used as resource filter criteria.
     * </p>
     */
    private java.util.List<ResourceMapFilter> ec2InstanceTags;
    /**
     * <p>
     * The ECR image tags used as resource filter criteria.
     * </p>
     */
    private java.util.List<ResourceStringFilter> ecrImageTags;
    /**
     * <p>
     * The ECR repository names used as resource filter criteria.
     * </p>
     */
    private java.util.List<ResourceStringFilter> ecrRepositoryName;
    /**
     * <p>
     * The Amazon Web Services Lambda function name used as resource filter criteria.
     * </p>
     */
    private java.util.List<ResourceStringFilter> lambdaFunctionName;
    /**
     * <p>
     * The Amazon Web Services Lambda function tags used as resource filter criteria.
     * </p>
     */
    private java.util.List<ResourceMapFilter> lambdaFunctionTags;
    /**
     * <p>
     * The resource IDs used as resource filter criteria.
     * </p>
     */
    private java.util.List<ResourceStringFilter> resourceId;
    /**
     * <p>
     * The resource types used as resource filter criteria.
     * </p>
     */
    private java.util.List<ResourceStringFilter> resourceType;

    /**
     * <p>
     * The account IDs used as resource filter criteria.
     * </p>
     * 
     * @return The account IDs used as resource filter criteria.
     */

    public java.util.List<ResourceStringFilter> getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The account IDs used as resource filter criteria.
     * </p>
     * 
     * @param accountId
     *        The account IDs used as resource filter criteria.
     */

    public void setAccountId(java.util.Collection<ResourceStringFilter> accountId) {
        if (accountId == null) {
            this.accountId = null;
            return;
        }

        this.accountId = new java.util.ArrayList<ResourceStringFilter>(accountId);
    }

    /**
     * <p>
     * The account IDs used as resource filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountId(java.util.Collection)} or {@link #withAccountId(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountId
     *        The account IDs used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withAccountId(ResourceStringFilter... accountId) {
        if (this.accountId == null) {
            setAccountId(new java.util.ArrayList<ResourceStringFilter>(accountId.length));
        }
        for (ResourceStringFilter ele : accountId) {
            this.accountId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The account IDs used as resource filter criteria.
     * </p>
     * 
     * @param accountId
     *        The account IDs used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withAccountId(java.util.Collection<ResourceStringFilter> accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The EC2 instance tags used as resource filter criteria.
     * </p>
     * 
     * @return The EC2 instance tags used as resource filter criteria.
     */

    public java.util.List<ResourceMapFilter> getEc2InstanceTags() {
        return ec2InstanceTags;
    }

    /**
     * <p>
     * The EC2 instance tags used as resource filter criteria.
     * </p>
     * 
     * @param ec2InstanceTags
     *        The EC2 instance tags used as resource filter criteria.
     */

    public void setEc2InstanceTags(java.util.Collection<ResourceMapFilter> ec2InstanceTags) {
        if (ec2InstanceTags == null) {
            this.ec2InstanceTags = null;
            return;
        }

        this.ec2InstanceTags = new java.util.ArrayList<ResourceMapFilter>(ec2InstanceTags);
    }

    /**
     * <p>
     * The EC2 instance tags used as resource filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2InstanceTags(java.util.Collection)} or {@link #withEc2InstanceTags(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ec2InstanceTags
     *        The EC2 instance tags used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withEc2InstanceTags(ResourceMapFilter... ec2InstanceTags) {
        if (this.ec2InstanceTags == null) {
            setEc2InstanceTags(new java.util.ArrayList<ResourceMapFilter>(ec2InstanceTags.length));
        }
        for (ResourceMapFilter ele : ec2InstanceTags) {
            this.ec2InstanceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 instance tags used as resource filter criteria.
     * </p>
     * 
     * @param ec2InstanceTags
     *        The EC2 instance tags used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withEc2InstanceTags(java.util.Collection<ResourceMapFilter> ec2InstanceTags) {
        setEc2InstanceTags(ec2InstanceTags);
        return this;
    }

    /**
     * <p>
     * The ECR image tags used as resource filter criteria.
     * </p>
     * 
     * @return The ECR image tags used as resource filter criteria.
     */

    public java.util.List<ResourceStringFilter> getEcrImageTags() {
        return ecrImageTags;
    }

    /**
     * <p>
     * The ECR image tags used as resource filter criteria.
     * </p>
     * 
     * @param ecrImageTags
     *        The ECR image tags used as resource filter criteria.
     */

    public void setEcrImageTags(java.util.Collection<ResourceStringFilter> ecrImageTags) {
        if (ecrImageTags == null) {
            this.ecrImageTags = null;
            return;
        }

        this.ecrImageTags = new java.util.ArrayList<ResourceStringFilter>(ecrImageTags);
    }

    /**
     * <p>
     * The ECR image tags used as resource filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEcrImageTags(java.util.Collection)} or {@link #withEcrImageTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ecrImageTags
     *        The ECR image tags used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withEcrImageTags(ResourceStringFilter... ecrImageTags) {
        if (this.ecrImageTags == null) {
            setEcrImageTags(new java.util.ArrayList<ResourceStringFilter>(ecrImageTags.length));
        }
        for (ResourceStringFilter ele : ecrImageTags) {
            this.ecrImageTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ECR image tags used as resource filter criteria.
     * </p>
     * 
     * @param ecrImageTags
     *        The ECR image tags used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withEcrImageTags(java.util.Collection<ResourceStringFilter> ecrImageTags) {
        setEcrImageTags(ecrImageTags);
        return this;
    }

    /**
     * <p>
     * The ECR repository names used as resource filter criteria.
     * </p>
     * 
     * @return The ECR repository names used as resource filter criteria.
     */

    public java.util.List<ResourceStringFilter> getEcrRepositoryName() {
        return ecrRepositoryName;
    }

    /**
     * <p>
     * The ECR repository names used as resource filter criteria.
     * </p>
     * 
     * @param ecrRepositoryName
     *        The ECR repository names used as resource filter criteria.
     */

    public void setEcrRepositoryName(java.util.Collection<ResourceStringFilter> ecrRepositoryName) {
        if (ecrRepositoryName == null) {
            this.ecrRepositoryName = null;
            return;
        }

        this.ecrRepositoryName = new java.util.ArrayList<ResourceStringFilter>(ecrRepositoryName);
    }

    /**
     * <p>
     * The ECR repository names used as resource filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEcrRepositoryName(java.util.Collection)} or {@link #withEcrRepositoryName(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param ecrRepositoryName
     *        The ECR repository names used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withEcrRepositoryName(ResourceStringFilter... ecrRepositoryName) {
        if (this.ecrRepositoryName == null) {
            setEcrRepositoryName(new java.util.ArrayList<ResourceStringFilter>(ecrRepositoryName.length));
        }
        for (ResourceStringFilter ele : ecrRepositoryName) {
            this.ecrRepositoryName.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ECR repository names used as resource filter criteria.
     * </p>
     * 
     * @param ecrRepositoryName
     *        The ECR repository names used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withEcrRepositoryName(java.util.Collection<ResourceStringFilter> ecrRepositoryName) {
        setEcrRepositoryName(ecrRepositoryName);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Lambda function name used as resource filter criteria.
     * </p>
     * 
     * @return The Amazon Web Services Lambda function name used as resource filter criteria.
     */

    public java.util.List<ResourceStringFilter> getLambdaFunctionName() {
        return lambdaFunctionName;
    }

    /**
     * <p>
     * The Amazon Web Services Lambda function name used as resource filter criteria.
     * </p>
     * 
     * @param lambdaFunctionName
     *        The Amazon Web Services Lambda function name used as resource filter criteria.
     */

    public void setLambdaFunctionName(java.util.Collection<ResourceStringFilter> lambdaFunctionName) {
        if (lambdaFunctionName == null) {
            this.lambdaFunctionName = null;
            return;
        }

        this.lambdaFunctionName = new java.util.ArrayList<ResourceStringFilter>(lambdaFunctionName);
    }

    /**
     * <p>
     * The Amazon Web Services Lambda function name used as resource filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLambdaFunctionName(java.util.Collection)} or {@link #withLambdaFunctionName(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param lambdaFunctionName
     *        The Amazon Web Services Lambda function name used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withLambdaFunctionName(ResourceStringFilter... lambdaFunctionName) {
        if (this.lambdaFunctionName == null) {
            setLambdaFunctionName(new java.util.ArrayList<ResourceStringFilter>(lambdaFunctionName.length));
        }
        for (ResourceStringFilter ele : lambdaFunctionName) {
            this.lambdaFunctionName.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Lambda function name used as resource filter criteria.
     * </p>
     * 
     * @param lambdaFunctionName
     *        The Amazon Web Services Lambda function name used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withLambdaFunctionName(java.util.Collection<ResourceStringFilter> lambdaFunctionName) {
        setLambdaFunctionName(lambdaFunctionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Lambda function tags used as resource filter criteria.
     * </p>
     * 
     * @return The Amazon Web Services Lambda function tags used as resource filter criteria.
     */

    public java.util.List<ResourceMapFilter> getLambdaFunctionTags() {
        return lambdaFunctionTags;
    }

    /**
     * <p>
     * The Amazon Web Services Lambda function tags used as resource filter criteria.
     * </p>
     * 
     * @param lambdaFunctionTags
     *        The Amazon Web Services Lambda function tags used as resource filter criteria.
     */

    public void setLambdaFunctionTags(java.util.Collection<ResourceMapFilter> lambdaFunctionTags) {
        if (lambdaFunctionTags == null) {
            this.lambdaFunctionTags = null;
            return;
        }

        this.lambdaFunctionTags = new java.util.ArrayList<ResourceMapFilter>(lambdaFunctionTags);
    }

    /**
     * <p>
     * The Amazon Web Services Lambda function tags used as resource filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLambdaFunctionTags(java.util.Collection)} or {@link #withLambdaFunctionTags(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param lambdaFunctionTags
     *        The Amazon Web Services Lambda function tags used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withLambdaFunctionTags(ResourceMapFilter... lambdaFunctionTags) {
        if (this.lambdaFunctionTags == null) {
            setLambdaFunctionTags(new java.util.ArrayList<ResourceMapFilter>(lambdaFunctionTags.length));
        }
        for (ResourceMapFilter ele : lambdaFunctionTags) {
            this.lambdaFunctionTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Lambda function tags used as resource filter criteria.
     * </p>
     * 
     * @param lambdaFunctionTags
     *        The Amazon Web Services Lambda function tags used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withLambdaFunctionTags(java.util.Collection<ResourceMapFilter> lambdaFunctionTags) {
        setLambdaFunctionTags(lambdaFunctionTags);
        return this;
    }

    /**
     * <p>
     * The resource IDs used as resource filter criteria.
     * </p>
     * 
     * @return The resource IDs used as resource filter criteria.
     */

    public java.util.List<ResourceStringFilter> getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The resource IDs used as resource filter criteria.
     * </p>
     * 
     * @param resourceId
     *        The resource IDs used as resource filter criteria.
     */

    public void setResourceId(java.util.Collection<ResourceStringFilter> resourceId) {
        if (resourceId == null) {
            this.resourceId = null;
            return;
        }

        this.resourceId = new java.util.ArrayList<ResourceStringFilter>(resourceId);
    }

    /**
     * <p>
     * The resource IDs used as resource filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceId(java.util.Collection)} or {@link #withResourceId(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceId
     *        The resource IDs used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withResourceId(ResourceStringFilter... resourceId) {
        if (this.resourceId == null) {
            setResourceId(new java.util.ArrayList<ResourceStringFilter>(resourceId.length));
        }
        for (ResourceStringFilter ele : resourceId) {
            this.resourceId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource IDs used as resource filter criteria.
     * </p>
     * 
     * @param resourceId
     *        The resource IDs used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withResourceId(java.util.Collection<ResourceStringFilter> resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The resource types used as resource filter criteria.
     * </p>
     * 
     * @return The resource types used as resource filter criteria.
     */

    public java.util.List<ResourceStringFilter> getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The resource types used as resource filter criteria.
     * </p>
     * 
     * @param resourceType
     *        The resource types used as resource filter criteria.
     */

    public void setResourceType(java.util.Collection<ResourceStringFilter> resourceType) {
        if (resourceType == null) {
            this.resourceType = null;
            return;
        }

        this.resourceType = new java.util.ArrayList<ResourceStringFilter>(resourceType);
    }

    /**
     * <p>
     * The resource types used as resource filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceType(java.util.Collection)} or {@link #withResourceType(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceType
     *        The resource types used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withResourceType(ResourceStringFilter... resourceType) {
        if (this.resourceType == null) {
            setResourceType(new java.util.ArrayList<ResourceStringFilter>(resourceType.length));
        }
        for (ResourceStringFilter ele : resourceType) {
            this.resourceType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource types used as resource filter criteria.
     * </p>
     * 
     * @param resourceType
     *        The resource types used as resource filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceFilterCriteria withResourceType(java.util.Collection<ResourceStringFilter> resourceType) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getEc2InstanceTags() != null)
            sb.append("Ec2InstanceTags: ").append(getEc2InstanceTags()).append(",");
        if (getEcrImageTags() != null)
            sb.append("EcrImageTags: ").append(getEcrImageTags()).append(",");
        if (getEcrRepositoryName() != null)
            sb.append("EcrRepositoryName: ").append(getEcrRepositoryName()).append(",");
        if (getLambdaFunctionName() != null)
            sb.append("LambdaFunctionName: ").append(getLambdaFunctionName()).append(",");
        if (getLambdaFunctionTags() != null)
            sb.append("LambdaFunctionTags: ").append(getLambdaFunctionTags()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
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

        if (obj instanceof ResourceFilterCriteria == false)
            return false;
        ResourceFilterCriteria other = (ResourceFilterCriteria) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getEc2InstanceTags() == null ^ this.getEc2InstanceTags() == null)
            return false;
        if (other.getEc2InstanceTags() != null && other.getEc2InstanceTags().equals(this.getEc2InstanceTags()) == false)
            return false;
        if (other.getEcrImageTags() == null ^ this.getEcrImageTags() == null)
            return false;
        if (other.getEcrImageTags() != null && other.getEcrImageTags().equals(this.getEcrImageTags()) == false)
            return false;
        if (other.getEcrRepositoryName() == null ^ this.getEcrRepositoryName() == null)
            return false;
        if (other.getEcrRepositoryName() != null && other.getEcrRepositoryName().equals(this.getEcrRepositoryName()) == false)
            return false;
        if (other.getLambdaFunctionName() == null ^ this.getLambdaFunctionName() == null)
            return false;
        if (other.getLambdaFunctionName() != null && other.getLambdaFunctionName().equals(this.getLambdaFunctionName()) == false)
            return false;
        if (other.getLambdaFunctionTags() == null ^ this.getLambdaFunctionTags() == null)
            return false;
        if (other.getLambdaFunctionTags() != null && other.getLambdaFunctionTags().equals(this.getLambdaFunctionTags()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceTags() == null) ? 0 : getEc2InstanceTags().hashCode());
        hashCode = prime * hashCode + ((getEcrImageTags() == null) ? 0 : getEcrImageTags().hashCode());
        hashCode = prime * hashCode + ((getEcrRepositoryName() == null) ? 0 : getEcrRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionName() == null) ? 0 : getLambdaFunctionName().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionTags() == null) ? 0 : getLambdaFunctionTags().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public ResourceFilterCriteria clone() {
        try {
            return (ResourceFilterCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.ResourceFilterCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
