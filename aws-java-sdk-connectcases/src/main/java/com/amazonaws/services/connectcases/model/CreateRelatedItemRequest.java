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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateRelatedItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRelatedItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier of the case.
     * </p>
     */
    private String caseId;
    /**
     * <p>
     * The content of a related item to be created.
     * </p>
     */
    private RelatedItemInputContent content;
    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The type of a related item.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A unique identifier of the case.
     * </p>
     * 
     * @param caseId
     *        A unique identifier of the case.
     */

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * <p>
     * A unique identifier of the case.
     * </p>
     * 
     * @return A unique identifier of the case.
     */

    public String getCaseId() {
        return this.caseId;
    }

    /**
     * <p>
     * A unique identifier of the case.
     * </p>
     * 
     * @param caseId
     *        A unique identifier of the case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelatedItemRequest withCaseId(String caseId) {
        setCaseId(caseId);
        return this;
    }

    /**
     * <p>
     * The content of a related item to be created.
     * </p>
     * 
     * @param content
     *        The content of a related item to be created.
     */

    public void setContent(RelatedItemInputContent content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of a related item to be created.
     * </p>
     * 
     * @return The content of a related item to be created.
     */

    public RelatedItemInputContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of a related item to be created.
     * </p>
     * 
     * @param content
     *        The content of a related item to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelatedItemRequest withContent(RelatedItemInputContent content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @param domainId
     *        The unique identifier of the Cases domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @return The unique identifier of the Cases domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @param domainId
     *        The unique identifier of the Cases domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelatedItemRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The type of a related item.
     * </p>
     * 
     * @param type
     *        The type of a related item.
     * @see RelatedItemType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of a related item.
     * </p>
     * 
     * @return The type of a related item.
     * @see RelatedItemType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of a related item.
     * </p>
     * 
     * @param type
     *        The type of a related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelatedItemType
     */

    public CreateRelatedItemRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of a related item.
     * </p>
     * 
     * @param type
     *        The type of a related item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelatedItemType
     */

    public CreateRelatedItemRequest withType(RelatedItemType type) {
        this.type = type.toString();
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
        if (getCaseId() != null)
            sb.append("CaseId: ").append(getCaseId()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRelatedItemRequest == false)
            return false;
        CreateRelatedItemRequest other = (CreateRelatedItemRequest) obj;
        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateRelatedItemRequest clone() {
        return (CreateRelatedItemRequest) super.clone();
    }

}
