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
 * This object contains regions to setup the aggregator and an IAM role to retrieve organization details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/OrganizationAggregationSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationAggregationSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the IAM role used to retreive AWS Organization details associated with the aggregator account.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The source regions being aggregated.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> awsRegions;
    /**
     * <p>
     * If true, aggregate existing AWS Config regions and future regions.
     * </p>
     */
    private Boolean allAwsRegions;

    /**
     * <p>
     * ARN of the IAM role used to retreive AWS Organization details associated with the aggregator account.
     * </p>
     * 
     * @param roleArn
     *        ARN of the IAM role used to retreive AWS Organization details associated with the aggregator account.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * ARN of the IAM role used to retreive AWS Organization details associated with the aggregator account.
     * </p>
     * 
     * @return ARN of the IAM role used to retreive AWS Organization details associated with the aggregator account.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * ARN of the IAM role used to retreive AWS Organization details associated with the aggregator account.
     * </p>
     * 
     * @param roleArn
     *        ARN of the IAM role used to retreive AWS Organization details associated with the aggregator account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationAggregationSource withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The source regions being aggregated.
     * </p>
     * 
     * @return The source regions being aggregated.
     */

    public java.util.List<String> getAwsRegions() {
        if (awsRegions == null) {
            awsRegions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return awsRegions;
    }

    /**
     * <p>
     * The source regions being aggregated.
     * </p>
     * 
     * @param awsRegions
     *        The source regions being aggregated.
     */

    public void setAwsRegions(java.util.Collection<String> awsRegions) {
        if (awsRegions == null) {
            this.awsRegions = null;
            return;
        }

        this.awsRegions = new com.amazonaws.internal.SdkInternalList<String>(awsRegions);
    }

    /**
     * <p>
     * The source regions being aggregated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAwsRegions(java.util.Collection)} or {@link #withAwsRegions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param awsRegions
     *        The source regions being aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationAggregationSource withAwsRegions(String... awsRegions) {
        if (this.awsRegions == null) {
            setAwsRegions(new com.amazonaws.internal.SdkInternalList<String>(awsRegions.length));
        }
        for (String ele : awsRegions) {
            this.awsRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The source regions being aggregated.
     * </p>
     * 
     * @param awsRegions
     *        The source regions being aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationAggregationSource withAwsRegions(java.util.Collection<String> awsRegions) {
        setAwsRegions(awsRegions);
        return this;
    }

    /**
     * <p>
     * If true, aggregate existing AWS Config regions and future regions.
     * </p>
     * 
     * @param allAwsRegions
     *        If true, aggregate existing AWS Config regions and future regions.
     */

    public void setAllAwsRegions(Boolean allAwsRegions) {
        this.allAwsRegions = allAwsRegions;
    }

    /**
     * <p>
     * If true, aggregate existing AWS Config regions and future regions.
     * </p>
     * 
     * @return If true, aggregate existing AWS Config regions and future regions.
     */

    public Boolean getAllAwsRegions() {
        return this.allAwsRegions;
    }

    /**
     * <p>
     * If true, aggregate existing AWS Config regions and future regions.
     * </p>
     * 
     * @param allAwsRegions
     *        If true, aggregate existing AWS Config regions and future regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationAggregationSource withAllAwsRegions(Boolean allAwsRegions) {
        setAllAwsRegions(allAwsRegions);
        return this;
    }

    /**
     * <p>
     * If true, aggregate existing AWS Config regions and future regions.
     * </p>
     * 
     * @return If true, aggregate existing AWS Config regions and future regions.
     */

    public Boolean isAllAwsRegions() {
        return this.allAwsRegions;
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getAwsRegions() != null)
            sb.append("AwsRegions: ").append(getAwsRegions()).append(",");
        if (getAllAwsRegions() != null)
            sb.append("AllAwsRegions: ").append(getAllAwsRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationAggregationSource == false)
            return false;
        OrganizationAggregationSource other = (OrganizationAggregationSource) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getAwsRegions() == null ^ this.getAwsRegions() == null)
            return false;
        if (other.getAwsRegions() != null && other.getAwsRegions().equals(this.getAwsRegions()) == false)
            return false;
        if (other.getAllAwsRegions() == null ^ this.getAllAwsRegions() == null)
            return false;
        if (other.getAllAwsRegions() != null && other.getAllAwsRegions().equals(this.getAllAwsRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getAwsRegions() == null) ? 0 : getAwsRegions().hashCode());
        hashCode = prime * hashCode + ((getAllAwsRegions() == null) ? 0 : getAllAwsRegions().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationAggregationSource clone() {
        try {
            return (OrganizationAggregationSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.OrganizationAggregationSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
