/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Recommendations to rightsize resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/RightsizingRecommendation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RightsizingRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account that this recommendation is for.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Context regarding the current instance.
     * </p>
     */
    private CurrentInstance currentInstance;
    /**
     * <p>
     * Recommendation to either terminate or modify the resource.
     * </p>
     */
    private String rightsizingType;
    /**
     * <p>
     * Details for modification recommendations.
     * </p>
     */
    private ModifyRecommendationDetail modifyRecommendationDetail;
    /**
     * <p>
     * Details for termination recommendations.
     * </p>
     */
    private TerminateRecommendationDetail terminateRecommendationDetail;

    /**
     * <p>
     * The account that this recommendation is for.
     * </p>
     * 
     * @param accountId
     *        The account that this recommendation is for.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account that this recommendation is for.
     * </p>
     * 
     * @return The account that this recommendation is for.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account that this recommendation is for.
     * </p>
     * 
     * @param accountId
     *        The account that this recommendation is for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RightsizingRecommendation withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Context regarding the current instance.
     * </p>
     * 
     * @param currentInstance
     *        Context regarding the current instance.
     */

    public void setCurrentInstance(CurrentInstance currentInstance) {
        this.currentInstance = currentInstance;
    }

    /**
     * <p>
     * Context regarding the current instance.
     * </p>
     * 
     * @return Context regarding the current instance.
     */

    public CurrentInstance getCurrentInstance() {
        return this.currentInstance;
    }

    /**
     * <p>
     * Context regarding the current instance.
     * </p>
     * 
     * @param currentInstance
     *        Context regarding the current instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RightsizingRecommendation withCurrentInstance(CurrentInstance currentInstance) {
        setCurrentInstance(currentInstance);
        return this;
    }

    /**
     * <p>
     * Recommendation to either terminate or modify the resource.
     * </p>
     * 
     * @param rightsizingType
     *        Recommendation to either terminate or modify the resource.
     * @see RightsizingType
     */

    public void setRightsizingType(String rightsizingType) {
        this.rightsizingType = rightsizingType;
    }

    /**
     * <p>
     * Recommendation to either terminate or modify the resource.
     * </p>
     * 
     * @return Recommendation to either terminate or modify the resource.
     * @see RightsizingType
     */

    public String getRightsizingType() {
        return this.rightsizingType;
    }

    /**
     * <p>
     * Recommendation to either terminate or modify the resource.
     * </p>
     * 
     * @param rightsizingType
     *        Recommendation to either terminate or modify the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RightsizingType
     */

    public RightsizingRecommendation withRightsizingType(String rightsizingType) {
        setRightsizingType(rightsizingType);
        return this;
    }

    /**
     * <p>
     * Recommendation to either terminate or modify the resource.
     * </p>
     * 
     * @param rightsizingType
     *        Recommendation to either terminate or modify the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RightsizingType
     */

    public RightsizingRecommendation withRightsizingType(RightsizingType rightsizingType) {
        this.rightsizingType = rightsizingType.toString();
        return this;
    }

    /**
     * <p>
     * Details for modification recommendations.
     * </p>
     * 
     * @param modifyRecommendationDetail
     *        Details for modification recommendations.
     */

    public void setModifyRecommendationDetail(ModifyRecommendationDetail modifyRecommendationDetail) {
        this.modifyRecommendationDetail = modifyRecommendationDetail;
    }

    /**
     * <p>
     * Details for modification recommendations.
     * </p>
     * 
     * @return Details for modification recommendations.
     */

    public ModifyRecommendationDetail getModifyRecommendationDetail() {
        return this.modifyRecommendationDetail;
    }

    /**
     * <p>
     * Details for modification recommendations.
     * </p>
     * 
     * @param modifyRecommendationDetail
     *        Details for modification recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RightsizingRecommendation withModifyRecommendationDetail(ModifyRecommendationDetail modifyRecommendationDetail) {
        setModifyRecommendationDetail(modifyRecommendationDetail);
        return this;
    }

    /**
     * <p>
     * Details for termination recommendations.
     * </p>
     * 
     * @param terminateRecommendationDetail
     *        Details for termination recommendations.
     */

    public void setTerminateRecommendationDetail(TerminateRecommendationDetail terminateRecommendationDetail) {
        this.terminateRecommendationDetail = terminateRecommendationDetail;
    }

    /**
     * <p>
     * Details for termination recommendations.
     * </p>
     * 
     * @return Details for termination recommendations.
     */

    public TerminateRecommendationDetail getTerminateRecommendationDetail() {
        return this.terminateRecommendationDetail;
    }

    /**
     * <p>
     * Details for termination recommendations.
     * </p>
     * 
     * @param terminateRecommendationDetail
     *        Details for termination recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RightsizingRecommendation withTerminateRecommendationDetail(TerminateRecommendationDetail terminateRecommendationDetail) {
        setTerminateRecommendationDetail(terminateRecommendationDetail);
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
        if (getCurrentInstance() != null)
            sb.append("CurrentInstance: ").append(getCurrentInstance()).append(",");
        if (getRightsizingType() != null)
            sb.append("RightsizingType: ").append(getRightsizingType()).append(",");
        if (getModifyRecommendationDetail() != null)
            sb.append("ModifyRecommendationDetail: ").append(getModifyRecommendationDetail()).append(",");
        if (getTerminateRecommendationDetail() != null)
            sb.append("TerminateRecommendationDetail: ").append(getTerminateRecommendationDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RightsizingRecommendation == false)
            return false;
        RightsizingRecommendation other = (RightsizingRecommendation) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCurrentInstance() == null ^ this.getCurrentInstance() == null)
            return false;
        if (other.getCurrentInstance() != null && other.getCurrentInstance().equals(this.getCurrentInstance()) == false)
            return false;
        if (other.getRightsizingType() == null ^ this.getRightsizingType() == null)
            return false;
        if (other.getRightsizingType() != null && other.getRightsizingType().equals(this.getRightsizingType()) == false)
            return false;
        if (other.getModifyRecommendationDetail() == null ^ this.getModifyRecommendationDetail() == null)
            return false;
        if (other.getModifyRecommendationDetail() != null && other.getModifyRecommendationDetail().equals(this.getModifyRecommendationDetail()) == false)
            return false;
        if (other.getTerminateRecommendationDetail() == null ^ this.getTerminateRecommendationDetail() == null)
            return false;
        if (other.getTerminateRecommendationDetail() != null
                && other.getTerminateRecommendationDetail().equals(this.getTerminateRecommendationDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCurrentInstance() == null) ? 0 : getCurrentInstance().hashCode());
        hashCode = prime * hashCode + ((getRightsizingType() == null) ? 0 : getRightsizingType().hashCode());
        hashCode = prime * hashCode + ((getModifyRecommendationDetail() == null) ? 0 : getModifyRecommendationDetail().hashCode());
        hashCode = prime * hashCode + ((getTerminateRecommendationDetail() == null) ? 0 : getTerminateRecommendationDetail().hashCode());
        return hashCode;
    }

    @Override
    public RightsizingRecommendation clone() {
        try {
            return (RightsizingRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.RightsizingRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
