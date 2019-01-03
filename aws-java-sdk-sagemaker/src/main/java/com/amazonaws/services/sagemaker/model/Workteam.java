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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about a labeling work team.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Workteam" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Workteam implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the work team.
     * </p>
     */
    private String workteamName;
    /**
     * <p>
     * The Amazon Cognito user groups that make up the work team.
     * </p>
     */
    private java.util.List<MemberDefinition> memberDefinitions;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the work team.
     * </p>
     */
    private String workteamArn;
    /**
     * <p>
     * The Amazon Marketplace identifier for a vendor's work team.
     * </p>
     */
    private java.util.List<String> productListingIds;
    /**
     * <p>
     * A description of the work team.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The URI of the labeling job's user interface. Workers open this URI to start labeling your data objects.
     * </p>
     */
    private String subDomain;
    /**
     * <p>
     * The date and time that the work team was created (timestamp).
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The date and time that the work team was last updated (timestamp).
     * </p>
     */
    private java.util.Date lastUpdatedDate;

    /**
     * <p>
     * The name of the work team.
     * </p>
     * 
     * @param workteamName
     *        The name of the work team.
     */

    public void setWorkteamName(String workteamName) {
        this.workteamName = workteamName;
    }

    /**
     * <p>
     * The name of the work team.
     * </p>
     * 
     * @return The name of the work team.
     */

    public String getWorkteamName() {
        return this.workteamName;
    }

    /**
     * <p>
     * The name of the work team.
     * </p>
     * 
     * @param workteamName
     *        The name of the work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workteam withWorkteamName(String workteamName) {
        setWorkteamName(workteamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Cognito user groups that make up the work team.
     * </p>
     * 
     * @return The Amazon Cognito user groups that make up the work team.
     */

    public java.util.List<MemberDefinition> getMemberDefinitions() {
        return memberDefinitions;
    }

    /**
     * <p>
     * The Amazon Cognito user groups that make up the work team.
     * </p>
     * 
     * @param memberDefinitions
     *        The Amazon Cognito user groups that make up the work team.
     */

    public void setMemberDefinitions(java.util.Collection<MemberDefinition> memberDefinitions) {
        if (memberDefinitions == null) {
            this.memberDefinitions = null;
            return;
        }

        this.memberDefinitions = new java.util.ArrayList<MemberDefinition>(memberDefinitions);
    }

    /**
     * <p>
     * The Amazon Cognito user groups that make up the work team.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberDefinitions(java.util.Collection)} or {@link #withMemberDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param memberDefinitions
     *        The Amazon Cognito user groups that make up the work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workteam withMemberDefinitions(MemberDefinition... memberDefinitions) {
        if (this.memberDefinitions == null) {
            setMemberDefinitions(new java.util.ArrayList<MemberDefinition>(memberDefinitions.length));
        }
        for (MemberDefinition ele : memberDefinitions) {
            this.memberDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Cognito user groups that make up the work team.
     * </p>
     * 
     * @param memberDefinitions
     *        The Amazon Cognito user groups that make up the work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workteam withMemberDefinitions(java.util.Collection<MemberDefinition> memberDefinitions) {
        setMemberDefinitions(memberDefinitions);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the work team.
     * </p>
     * 
     * @param workteamArn
     *        The Amazon Resource Name (ARN) that identifies the work team.
     */

    public void setWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the work team.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the work team.
     */

    public String getWorkteamArn() {
        return this.workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the work team.
     * </p>
     * 
     * @param workteamArn
     *        The Amazon Resource Name (ARN) that identifies the work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workteam withWorkteamArn(String workteamArn) {
        setWorkteamArn(workteamArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Marketplace identifier for a vendor's work team.
     * </p>
     * 
     * @return The Amazon Marketplace identifier for a vendor's work team.
     */

    public java.util.List<String> getProductListingIds() {
        return productListingIds;
    }

    /**
     * <p>
     * The Amazon Marketplace identifier for a vendor's work team.
     * </p>
     * 
     * @param productListingIds
     *        The Amazon Marketplace identifier for a vendor's work team.
     */

    public void setProductListingIds(java.util.Collection<String> productListingIds) {
        if (productListingIds == null) {
            this.productListingIds = null;
            return;
        }

        this.productListingIds = new java.util.ArrayList<String>(productListingIds);
    }

    /**
     * <p>
     * The Amazon Marketplace identifier for a vendor's work team.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductListingIds(java.util.Collection)} or {@link #withProductListingIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param productListingIds
     *        The Amazon Marketplace identifier for a vendor's work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workteam withProductListingIds(String... productListingIds) {
        if (this.productListingIds == null) {
            setProductListingIds(new java.util.ArrayList<String>(productListingIds.length));
        }
        for (String ele : productListingIds) {
            this.productListingIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Marketplace identifier for a vendor's work team.
     * </p>
     * 
     * @param productListingIds
     *        The Amazon Marketplace identifier for a vendor's work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workteam withProductListingIds(java.util.Collection<String> productListingIds) {
        setProductListingIds(productListingIds);
        return this;
    }

    /**
     * <p>
     * A description of the work team.
     * </p>
     * 
     * @param description
     *        A description of the work team.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the work team.
     * </p>
     * 
     * @return A description of the work team.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the work team.
     * </p>
     * 
     * @param description
     *        A description of the work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workteam withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The URI of the labeling job's user interface. Workers open this URI to start labeling your data objects.
     * </p>
     * 
     * @param subDomain
     *        The URI of the labeling job's user interface. Workers open this URI to start labeling your data objects.
     */

    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }

    /**
     * <p>
     * The URI of the labeling job's user interface. Workers open this URI to start labeling your data objects.
     * </p>
     * 
     * @return The URI of the labeling job's user interface. Workers open this URI to start labeling your data objects.
     */

    public String getSubDomain() {
        return this.subDomain;
    }

    /**
     * <p>
     * The URI of the labeling job's user interface. Workers open this URI to start labeling your data objects.
     * </p>
     * 
     * @param subDomain
     *        The URI of the labeling job's user interface. Workers open this URI to start labeling your data objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workteam withSubDomain(String subDomain) {
        setSubDomain(subDomain);
        return this;
    }

    /**
     * <p>
     * The date and time that the work team was created (timestamp).
     * </p>
     * 
     * @param createDate
     *        The date and time that the work team was created (timestamp).
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time that the work team was created (timestamp).
     * </p>
     * 
     * @return The date and time that the work team was created (timestamp).
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time that the work team was created (timestamp).
     * </p>
     * 
     * @param createDate
     *        The date and time that the work team was created (timestamp).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workteam withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The date and time that the work team was last updated (timestamp).
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time that the work team was last updated (timestamp).
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time that the work team was last updated (timestamp).
     * </p>
     * 
     * @return The date and time that the work team was last updated (timestamp).
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time that the work team was last updated (timestamp).
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time that the work team was last updated (timestamp).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workteam withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
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
        if (getWorkteamName() != null)
            sb.append("WorkteamName: ").append(getWorkteamName()).append(",");
        if (getMemberDefinitions() != null)
            sb.append("MemberDefinitions: ").append(getMemberDefinitions()).append(",");
        if (getWorkteamArn() != null)
            sb.append("WorkteamArn: ").append(getWorkteamArn()).append(",");
        if (getProductListingIds() != null)
            sb.append("ProductListingIds: ").append(getProductListingIds()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSubDomain() != null)
            sb.append("SubDomain: ").append(getSubDomain()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Workteam == false)
            return false;
        Workteam other = (Workteam) obj;
        if (other.getWorkteamName() == null ^ this.getWorkteamName() == null)
            return false;
        if (other.getWorkteamName() != null && other.getWorkteamName().equals(this.getWorkteamName()) == false)
            return false;
        if (other.getMemberDefinitions() == null ^ this.getMemberDefinitions() == null)
            return false;
        if (other.getMemberDefinitions() != null && other.getMemberDefinitions().equals(this.getMemberDefinitions()) == false)
            return false;
        if (other.getWorkteamArn() == null ^ this.getWorkteamArn() == null)
            return false;
        if (other.getWorkteamArn() != null && other.getWorkteamArn().equals(this.getWorkteamArn()) == false)
            return false;
        if (other.getProductListingIds() == null ^ this.getProductListingIds() == null)
            return false;
        if (other.getProductListingIds() != null && other.getProductListingIds().equals(this.getProductListingIds()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSubDomain() == null ^ this.getSubDomain() == null)
            return false;
        if (other.getSubDomain() != null && other.getSubDomain().equals(this.getSubDomain()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkteamName() == null) ? 0 : getWorkteamName().hashCode());
        hashCode = prime * hashCode + ((getMemberDefinitions() == null) ? 0 : getMemberDefinitions().hashCode());
        hashCode = prime * hashCode + ((getWorkteamArn() == null) ? 0 : getWorkteamArn().hashCode());
        hashCode = prime * hashCode + ((getProductListingIds() == null) ? 0 : getProductListingIds().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSubDomain() == null) ? 0 : getSubDomain().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        return hashCode;
    }

    @Override
    public Workteam clone() {
        try {
            return (Workteam) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.WorkteamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
