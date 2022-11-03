/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of what case and related item data is published through the case event stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/EventIncludedData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventIncludedData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details of what case data is published through the case event stream.
     * </p>
     */
    private CaseEventIncludedData caseData;
    /**
     * <p>
     * Details of what related item data is published through the case event stream.
     * </p>
     */
    private RelatedItemEventIncludedData relatedItemData;

    /**
     * <p>
     * Details of what case data is published through the case event stream.
     * </p>
     * 
     * @param caseData
     *        Details of what case data is published through the case event stream.
     */

    public void setCaseData(CaseEventIncludedData caseData) {
        this.caseData = caseData;
    }

    /**
     * <p>
     * Details of what case data is published through the case event stream.
     * </p>
     * 
     * @return Details of what case data is published through the case event stream.
     */

    public CaseEventIncludedData getCaseData() {
        return this.caseData;
    }

    /**
     * <p>
     * Details of what case data is published through the case event stream.
     * </p>
     * 
     * @param caseData
     *        Details of what case data is published through the case event stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventIncludedData withCaseData(CaseEventIncludedData caseData) {
        setCaseData(caseData);
        return this;
    }

    /**
     * <p>
     * Details of what related item data is published through the case event stream.
     * </p>
     * 
     * @param relatedItemData
     *        Details of what related item data is published through the case event stream.
     */

    public void setRelatedItemData(RelatedItemEventIncludedData relatedItemData) {
        this.relatedItemData = relatedItemData;
    }

    /**
     * <p>
     * Details of what related item data is published through the case event stream.
     * </p>
     * 
     * @return Details of what related item data is published through the case event stream.
     */

    public RelatedItemEventIncludedData getRelatedItemData() {
        return this.relatedItemData;
    }

    /**
     * <p>
     * Details of what related item data is published through the case event stream.
     * </p>
     * 
     * @param relatedItemData
     *        Details of what related item data is published through the case event stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventIncludedData withRelatedItemData(RelatedItemEventIncludedData relatedItemData) {
        setRelatedItemData(relatedItemData);
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
        if (getCaseData() != null)
            sb.append("CaseData: ").append(getCaseData()).append(",");
        if (getRelatedItemData() != null)
            sb.append("RelatedItemData: ").append(getRelatedItemData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventIncludedData == false)
            return false;
        EventIncludedData other = (EventIncludedData) obj;
        if (other.getCaseData() == null ^ this.getCaseData() == null)
            return false;
        if (other.getCaseData() != null && other.getCaseData().equals(this.getCaseData()) == false)
            return false;
        if (other.getRelatedItemData() == null ^ this.getRelatedItemData() == null)
            return false;
        if (other.getRelatedItemData() != null && other.getRelatedItemData().equals(this.getRelatedItemData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaseData() == null) ? 0 : getCaseData().hashCode());
        hashCode = prime * hashCode + ((getRelatedItemData() == null) ? 0 : getRelatedItemData().hashCode());
        return hashCode;
    }

    @Override
    public EventIncludedData clone() {
        try {
            return (EventIncludedData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.EventIncludedDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
