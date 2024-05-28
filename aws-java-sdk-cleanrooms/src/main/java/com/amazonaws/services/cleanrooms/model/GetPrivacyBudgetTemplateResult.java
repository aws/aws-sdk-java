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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetPrivacyBudgetTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPrivacyBudgetTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the details of the privacy budget template that you requested.
     * </p>
     */
    private PrivacyBudgetTemplate privacyBudgetTemplate;

    /**
     * <p>
     * Returns the details of the privacy budget template that you requested.
     * </p>
     * 
     * @param privacyBudgetTemplate
     *        Returns the details of the privacy budget template that you requested.
     */

    public void setPrivacyBudgetTemplate(PrivacyBudgetTemplate privacyBudgetTemplate) {
        this.privacyBudgetTemplate = privacyBudgetTemplate;
    }

    /**
     * <p>
     * Returns the details of the privacy budget template that you requested.
     * </p>
     * 
     * @return Returns the details of the privacy budget template that you requested.
     */

    public PrivacyBudgetTemplate getPrivacyBudgetTemplate() {
        return this.privacyBudgetTemplate;
    }

    /**
     * <p>
     * Returns the details of the privacy budget template that you requested.
     * </p>
     * 
     * @param privacyBudgetTemplate
     *        Returns the details of the privacy budget template that you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPrivacyBudgetTemplateResult withPrivacyBudgetTemplate(PrivacyBudgetTemplate privacyBudgetTemplate) {
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

        if (obj instanceof GetPrivacyBudgetTemplateResult == false)
            return false;
        GetPrivacyBudgetTemplateResult other = (GetPrivacyBudgetTemplateResult) obj;
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
    public GetPrivacyBudgetTemplateResult clone() {
        try {
            return (GetPrivacyBudgetTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
