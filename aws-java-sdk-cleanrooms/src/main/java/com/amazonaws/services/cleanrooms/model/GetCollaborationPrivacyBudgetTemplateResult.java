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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaborationPrivacyBudgetTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCollaborationPrivacyBudgetTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returns the details of the privacy budget template that you requested.
     * </p>
     */
    private CollaborationPrivacyBudgetTemplate collaborationPrivacyBudgetTemplate;

    /**
     * <p>
     * Returns the details of the privacy budget template that you requested.
     * </p>
     * 
     * @param collaborationPrivacyBudgetTemplate
     *        Returns the details of the privacy budget template that you requested.
     */

    public void setCollaborationPrivacyBudgetTemplate(CollaborationPrivacyBudgetTemplate collaborationPrivacyBudgetTemplate) {
        this.collaborationPrivacyBudgetTemplate = collaborationPrivacyBudgetTemplate;
    }

    /**
     * <p>
     * Returns the details of the privacy budget template that you requested.
     * </p>
     * 
     * @return Returns the details of the privacy budget template that you requested.
     */

    public CollaborationPrivacyBudgetTemplate getCollaborationPrivacyBudgetTemplate() {
        return this.collaborationPrivacyBudgetTemplate;
    }

    /**
     * <p>
     * Returns the details of the privacy budget template that you requested.
     * </p>
     * 
     * @param collaborationPrivacyBudgetTemplate
     *        Returns the details of the privacy budget template that you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCollaborationPrivacyBudgetTemplateResult withCollaborationPrivacyBudgetTemplate(
            CollaborationPrivacyBudgetTemplate collaborationPrivacyBudgetTemplate) {
        setCollaborationPrivacyBudgetTemplate(collaborationPrivacyBudgetTemplate);
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
        if (getCollaborationPrivacyBudgetTemplate() != null)
            sb.append("CollaborationPrivacyBudgetTemplate: ").append(getCollaborationPrivacyBudgetTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCollaborationPrivacyBudgetTemplateResult == false)
            return false;
        GetCollaborationPrivacyBudgetTemplateResult other = (GetCollaborationPrivacyBudgetTemplateResult) obj;
        if (other.getCollaborationPrivacyBudgetTemplate() == null ^ this.getCollaborationPrivacyBudgetTemplate() == null)
            return false;
        if (other.getCollaborationPrivacyBudgetTemplate() != null
                && other.getCollaborationPrivacyBudgetTemplate().equals(this.getCollaborationPrivacyBudgetTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollaborationPrivacyBudgetTemplate() == null) ? 0 : getCollaborationPrivacyBudgetTemplate().hashCode());
        return hashCode;
    }

    @Override
    public GetCollaborationPrivacyBudgetTemplateResult clone() {
        try {
            return (GetCollaborationPrivacyBudgetTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
