/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 */
public class DescribeProvisioningParametersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of parameters used to successfully provision the product. Each parameter includes a list of allowable
     * values and additional metadata about each parameter.
     * </p>
     */
    private java.util.List<ProvisioningArtifactParameter> provisioningArtifactParameters;
    /**
     * <p>
     * The list of constraint summaries that apply to provisioning this product.
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
     * The list of parameters used to successfully provision the product. Each parameter includes a list of allowable
     * values and additional metadata about each parameter.
     * </p>
     * 
     * @return The list of parameters used to successfully provision the product. Each parameter includes a list of
     *         allowable values and additional metadata about each parameter.
     */

    public java.util.List<ProvisioningArtifactParameter> getProvisioningArtifactParameters() {
        return provisioningArtifactParameters;
    }

    /**
     * <p>
     * The list of parameters used to successfully provision the product. Each parameter includes a list of allowable
     * values and additional metadata about each parameter.
     * </p>
     * 
     * @param provisioningArtifactParameters
     *        The list of parameters used to successfully provision the product. Each parameter includes a list of
     *        allowable values and additional metadata about each parameter.
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
     * The list of parameters used to successfully provision the product. Each parameter includes a list of allowable
     * values and additional metadata about each parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisioningArtifactParameters(java.util.Collection)} or
     * {@link #withProvisioningArtifactParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisioningArtifactParameters
     *        The list of parameters used to successfully provision the product. Each parameter includes a list of
     *        allowable values and additional metadata about each parameter.
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
     * The list of parameters used to successfully provision the product. Each parameter includes a list of allowable
     * values and additional metadata about each parameter.
     * </p>
     * 
     * @param provisioningArtifactParameters
     *        The list of parameters used to successfully provision the product. Each parameter includes a list of
     *        allowable values and additional metadata about each parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningParametersResult withProvisioningArtifactParameters(
            java.util.Collection<ProvisioningArtifactParameter> provisioningArtifactParameters) {
        setProvisioningArtifactParameters(provisioningArtifactParameters);
        return this;
    }

    /**
     * <p>
     * The list of constraint summaries that apply to provisioning this product.
     * </p>
     * 
     * @return The list of constraint summaries that apply to provisioning this product.
     */

    public java.util.List<ConstraintSummary> getConstraintSummaries() {
        return constraintSummaries;
    }

    /**
     * <p>
     * The list of constraint summaries that apply to provisioning this product.
     * </p>
     * 
     * @param constraintSummaries
     *        The list of constraint summaries that apply to provisioning this product.
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
     * The list of constraint summaries that apply to provisioning this product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConstraintSummaries(java.util.Collection)} or {@link #withConstraintSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param constraintSummaries
     *        The list of constraint summaries that apply to provisioning this product.
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
     * The list of constraint summaries that apply to provisioning this product.
     * </p>
     * 
     * @param constraintSummaries
     *        The list of constraint summaries that apply to provisioning this product.
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ProvisioningArtifactParameters: " + getProvisioningArtifactParameters() + ",");
        if (getConstraintSummaries() != null)
            sb.append("ConstraintSummaries: " + getConstraintSummaries() + ",");
        if (getUsageInstructions() != null)
            sb.append("UsageInstructions: " + getUsageInstructions());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisioningArtifactParameters() == null) ? 0 : getProvisioningArtifactParameters().hashCode());
        hashCode = prime * hashCode + ((getConstraintSummaries() == null) ? 0 : getConstraintSummaries().hashCode());
        hashCode = prime * hashCode + ((getUsageInstructions() == null) ? 0 : getUsageInstructions().hashCode());
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
