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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreatePrivacyBudgetTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePrivacyBudgetTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A summary of the elements in the privacy budget template.
     * </p>
     */
    private PrivacyBudgetTemplate privacyBudgetTemplate;

    /**
     * <p>
     * A summary of the elements in the privacy budget template.
     * </p>
     * 
     * @param privacyBudgetTemplate
     *        A summary of the elements in the privacy budget template.
     */

    public void setPrivacyBudgetTemplate(PrivacyBudgetTemplate privacyBudgetTemplate) {
        this.privacyBudgetTemplate = privacyBudgetTemplate;
    }

    /**
     * <p>
     * A summary of the elements in the privacy budget template.
     * </p>
     * 
     * @return A summary of the elements in the privacy budget template.
     */

    public PrivacyBudgetTemplate getPrivacyBudgetTemplate() {
        return this.privacyBudgetTemplate;
    }

    /**
     * <p>
     * A summary of the elements in the privacy budget template.
     * </p>
     * 
     * @param privacyBudgetTemplate
     *        A summary of the elements in the privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePrivacyBudgetTemplateResult withPrivacyBudgetTemplate(PrivacyBudgetTemplate privacyBudgetTemplate) {
        setPrivacyBudgetTemplate(privacyBudgetTemplate);
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
        if (getPrivacyBudgetTemplate() != null)
            sb.append("PrivacyBudgetTemplate: ").append(getPrivacyBudgetTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePrivacyBudgetTemplateResult == false)
            return false;
        CreatePrivacyBudgetTemplateResult other = (CreatePrivacyBudgetTemplateResult) obj;
        if (other.getPrivacyBudgetTemplate() == null ^ this.getPrivacyBudgetTemplate() == null)
            return false;
        if (other.getPrivacyBudgetTemplate() != null && other.getPrivacyBudgetTemplate().equals(this.getPrivacyBudgetTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrivacyBudgetTemplate() == null) ? 0 : getPrivacyBudgetTemplate().hashCode());
        return hashCode;
    }

    @Override
    public CreatePrivacyBudgetTemplateResult clone() {
        try {
            return (CreatePrivacyBudgetTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
