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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisioningParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProvisioningParametersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the parameters used to provision the product.
     * </p>
     */
    private java.util.List<ProvisioningArtifactParameter> provisioningArtifactParameters;
    /**
     * <p>
     * Information about the constraints used to provision the product.
     * </p>
     */
    private java.util.List<ConstraintSummary> constraintSummaries;
    /**
     * <p>
     * Any additional metadata specifically related to the provisioning of the product. For example, see the
     * <code>Version</code> field of the CloudFormation template.
     * </p>
     */
    private java.util.List<UsageInstruction> usageInstructions;
    /**
     * <p>
     * Information about the TagOptions associated with the resource.
     * </p>
     */
    private java.util.List<TagOptionSummary> tagOptions;
    /**
     * <p>
     * An object that contains information about preferences, such as regions and accounts, for the provisioning
     * artifact.
     * </p>
     */
    private ProvisioningArtifactPreferences provisioningArtifactPreferences;

    /**
     * <p>
     * Information about the parameters used to provision the product.
     * </p>
     * 
     * @return Information about the parameters used to provision the product.
     */

    public java.util.List<ProvisioningArtifactParameter> getProvisioningArtifactParameters() {
        return provisioningArtifactParameters;
    }

    /**
     * <p>
     * Information about the parameters used to provision the product.
     * </p>
     * 
     * @param provisioningArtifactParameters
     *        Information about the parameters used to provision the product.
     */

    public void setProvisioningArtifactParameters(java.util.Collection<ProvisioningArtifactParameter> provisioningArtifactParameters) {
        if (provisioningArtifactParameters == null) {
            this.provisioningArtifactParameters = null;
            return;
        }

        this.provisioningArtifactParameters = new java.util.ArrayList<ProvisioningArtifactParameter>(provisioningArtifactParameters);
    }

    /**
     * <p>
     * Information about the parameters used to provision the product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisioningArtifactParameters(java.util.Collection)} or
     * {@link #withProvisioningArtifactParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisioningArtifactParameters
     *        Information about the parameters used to provision the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersResult withProvisioningArtifactParameters(ProvisioningArtifactParameter... provisioningArtifactParameters) {
        if (this.provisioningArtifactParameters == null) {
            setProvisioningArtifactParameters(new java.util.ArrayList<ProvisioningArtifactParameter>(provisioningArtifactParameters.length));
        }
        for (ProvisioningArtifactParameter ele : provisioningArtifactParameters) {
            this.provisioningArtifactParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the parameters used to provision the product.
     * </p>
     * 
     * @param provisioningArtifactParameters
     *        Information about the parameters used to provision the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersResult withProvisioningArtifactParameters(
            java.util.Collection<ProvisioningArtifactParameter> provisioningArtifactParameters) {
        setProvisioningArtifactParameters(provisioningArtifactParameters);
        return this;
    }

    /**
     * <p>
     * Information about the constraints used to provision the product.
     * </p>
     * 
     * @return Information about the constraints used to provision the product.
     */

    public java.util.List<ConstraintSummary> getConstraintSummaries() {
        return constraintSummaries;
    }

    /**
     * <p>
     * Information about the constraints used to provision the product.
     * </p>
     * 
     * @param constraintSummaries
     *        Information about the constraints used to provision the product.
     */

    public void setConstraintSummaries(java.util.Collection<ConstraintSummary> constraintSummaries) {
        if (constraintSummaries == null) {
            this.constraintSummaries = null;
            return;
        }

        this.constraintSummaries = new java.util.ArrayList<ConstraintSummary>(constraintSummaries);
    }

    /**
     * <p>
     * Information about the constraints used to provision the product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConstraintSummaries(java.util.Collection)} or {@link #withConstraintSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param constraintSummaries
     *        Information about the constraints used to provision the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersResult withConstraintSummaries(ConstraintSummary... constraintSummaries) {
        if (this.constraintSummaries == null) {
            setConstraintSummaries(new java.util.ArrayList<ConstraintSummary>(constraintSummaries.length));
        }
        for (ConstraintSummary ele : constraintSummaries) {
            this.constraintSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the constraints used to provision the product.
     * </p>
     * 
     * @param constraintSummaries
     *        Information about the constraints used to provision the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersResult withConstraintSummaries(java.util.Collection<ConstraintSummary> constraintSummaries) {
        setConstraintSummaries(constraintSummaries);
        return this;
    }

    /**
     * <p>
     * Any additional metadata specifically related to the provisioning of the product. For example, see the
     * <code>Version</code> field of the CloudFormation template.
     * </p>
     * 
     * @return Any additional metadata specifically related to the provisioning of the product. For example, see the
     *         <code>Version</code> field of the CloudFormation template.
     */

    public java.util.List<UsageInstruction> getUsageInstructions() {
        return usageInstructions;
    }

    /**
     * <p>
     * Any additional metadata specifically related to the provisioning of the product. For example, see the
     * <code>Version</code> field of the CloudFormation template.
     * </p>
     * 
     * @param usageInstructions
     *        Any additional metadata specifically related to the provisioning of the product. For example, see the
     *        <code>Version</code> field of the CloudFormation template.
     */

    public void setUsageInstructions(java.util.Collection<UsageInstruction> usageInstructions) {
        if (usageInstructions == null) {
            this.usageInstructions = null;
            return;
        }

        this.usageInstructions = new java.util.ArrayList<UsageInstruction>(usageInstructions);
    }

    /**
     * <p>
     * Any additional metadata specifically related to the provisioning of the product. For example, see the
     * <code>Version</code> field of the CloudFormation template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsageInstructions(java.util.Collection)} or {@link #withUsageInstructions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param usageInstructions
     *        Any additional metadata specifically related to the provisioning of the product. For example, see the
     *        <code>Version</code> field of the CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersResult withUsageInstructions(UsageInstruction... usageInstructions) {
        if (this.usageInstructions == null) {
            setUsageInstructions(new java.util.ArrayList<UsageInstruction>(usageInstructions.length));
        }
        for (UsageInstruction ele : usageInstructions) {
            this.usageInstructions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any additional metadata specifically related to the provisioning of the product. For example, see the
     * <code>Version</code> field of the CloudFormation template.
     * </p>
     * 
     * @param usageInstructions
     *        Any additional metadata specifically related to the provisioning of the product. For example, see the
     *        <code>Version</code> field of the CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersResult withUsageInstructions(java.util.Collection<UsageInstruction> usageInstructions) {
        setUsageInstructions(usageInstructions);
        return this;
    }

    /**
     * <p>
     * Information about the TagOptions associated with the resource.
     * </p>
     * 
     * @return Information about the TagOptions associated with the resource.
     */

    public java.util.List<TagOptionSummary> getTagOptions() {
        return tagOptions;
    }

    /**
     * <p>
     * Information about the TagOptions associated with the resource.
     * </p>
     * 
     * @param tagOptions
     *        Information about the TagOptions associated with the resource.
     */

    public void setTagOptions(java.util.Collection<TagOptionSummary> tagOptions) {
        if (tagOptions == null) {
            this.tagOptions = null;
            return;
        }

        this.tagOptions = new java.util.ArrayList<TagOptionSummary>(tagOptions);
    }

    /**
     * <p>
     * Information about the TagOptions associated with the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagOptions(java.util.Collection)} or {@link #withTagOptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagOptions
     *        Information about the TagOptions associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersResult withTagOptions(TagOptionSummary... tagOptions) {
        if (this.tagOptions == null) {
            setTagOptions(new java.util.ArrayList<TagOptionSummary>(tagOptions.length));
        }
        for (TagOptionSummary ele : tagOptions) {
            this.tagOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the TagOptions associated with the resource.
     * </p>
     * 
     * @param tagOptions
     *        Information about the TagOptions associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersResult withTagOptions(java.util.Collection<TagOptionSummary> tagOptions) {
        setTagOptions(tagOptions);
        return this;
    }

    /**
     * <p>
     * An object that contains information about preferences, such as regions and accounts, for the provisioning
     * artifact.
     * </p>
     * 
     * @param provisioningArtifactPreferences
     *        An object that contains information about preferences, such as regions and accounts, for the provisioning
     *        artifact.
     */

    public void setProvisioningArtifactPreferences(ProvisioningArtifactPreferences provisioningArtifactPreferences) {
        this.provisioningArtifactPreferences = provisioningArtifactPreferences;
    }

    /**
     * <p>
     * An object that contains information about preferences, such as regions and accounts, for the provisioning
     * artifact.
     * </p>
     * 
     * @return An object that contains information about preferences, such as regions and accounts, for the provisioning
     *         artifact.
     */

    public ProvisioningArtifactPreferences getProvisioningArtifactPreferences() {
        return this.provisioningArtifactPreferences;
    }

    /**
     * <p>
     * An object that contains information about preferences, such as regions and accounts, for the provisioning
     * artifact.
     * </p>
     * 
     * @param provisioningArtifactPreferences
     *        An object that contains information about preferences, such as regions and accounts, for the provisioning
     *        artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersResult withProvisioningArtifactPreferences(ProvisioningArtifactPreferences provisioningArtifactPreferences) {
        setProvisioningArtifactPreferences(provisioningArtifactPreferences);
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
        if (getProvisioningArtifactParameters() != null)
            sb.append("ProvisioningArtifactParameters: ").append(getProvisioningArtifactParameters()).append(",");
        if (getConstraintSummaries() != null)
            sb.append("ConstraintSummaries: ").append(getConstraintSummaries()).append(",");
        if (getUsageInstructions() != null)
            sb.append("UsageInstructions: ").append(getUsageInstructions()).append(",");
        if (getTagOptions() != null)
            sb.append("TagOptions: ").append(getTagOptions()).append(",");
        if (getProvisioningArtifactPreferences() != null)
            sb.append("ProvisioningArtifactPreferences: ").append(getProvisioningArtifactPreferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProvisioningParametersResult == false)
            return false;
        DescribeProvisioningParametersResult other = (DescribeProvisioningParametersResult) obj;
        if (other.getProvisioningArtifactParameters() == null ^ this.getProvisioningArtifactParameters() == null)
            return false;
        if (other.getProvisioningArtifactParameters() != null
                && other.getProvisioningArtifactParameters().equals(this.getProvisioningArtifactParameters()) == false)
            return false;
        if (other.getConstraintSummaries() == null ^ this.getConstraintSummaries() == null)
            return false;
        if (other.getConstraintSummaries() != null && other.getConstraintSummaries().equals(this.getConstraintSummaries()) == false)
            return false;
        if (other.getUsageInstructions() == null ^ this.getUsageInstructions() == null)
            return false;
        if (other.getUsageInstructions() != null && other.getUsageInstructions().equals(this.getUsageInstructions()) == false)
            return false;
        if (other.getTagOptions() == null ^ this.getTagOptions() == null)
            return false;
        if (other.getTagOptions() != null && other.getTagOptions().equals(this.getTagOptions()) == false)
            return false;
        if (other.getProvisioningArtifactPreferences() == null ^ this.getProvisioningArtifactPreferences() == null)
            return false;
        if (other.getProvisioningArtifactPreferences() != null
                && other.getProvisioningArtifactPreferences().equals(this.getProvisioningArtifactPreferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisioningArtifactParameters() == null) ? 0 : getProvisioningArtifactParameters().hashCode());
        hashCode = prime * hashCode + ((getConstraintSummaries() == null) ? 0 : getConstraintSummaries().hashCode());
        hashCode = prime * hashCode + ((getUsageInstructions() == null) ? 0 : getUsageInstructions().hashCode());
        hashCode = prime * hashCode + ((getTagOptions() == null) ? 0 : getTagOptions().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactPreferences() == null) ? 0 : getProvisioningArtifactPreferences().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProvisioningParametersResult clone() {
        try {
            return (DescribeProvisioningParametersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
