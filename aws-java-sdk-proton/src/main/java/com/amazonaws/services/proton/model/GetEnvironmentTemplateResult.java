/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetEnvironmentTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnvironmentTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The environment template detail data that's returned by AWS Proton.
     * </p>
     */
    private EnvironmentTemplate environmentTemplate;

    /**
     * <p>
     * The environment template detail data that's returned by AWS Proton.
     * </p>
     * 
     * @param environmentTemplate
     *        The environment template detail data that's returned by AWS Proton.
     */

    public void setEnvironmentTemplate(EnvironmentTemplate environmentTemplate) {
        this.environmentTemplate = environmentTemplate;
    }

    /**
     * <p>
     * The environment template detail data that's returned by AWS Proton.
     * </p>
     * 
     * @return The environment template detail data that's returned by AWS Proton.
     */

    public EnvironmentTemplate getEnvironmentTemplate() {
        return this.environmentTemplate;
    }

    /**
     * <p>
     * The environment template detail data that's returned by AWS Proton.
     * </p>
     * 
     * @param environmentTemplate
     *        The environment template detail data that's returned by AWS Proton.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentTemplateResult withEnvironmentTemplate(EnvironmentTemplate environmentTemplate) {
        setEnvironmentTemplate(environmentTemplate);
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
        if (getEnvironmentTemplate() != null)
            sb.append("EnvironmentTemplate: ").append(getEnvironmentTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEnvironmentTemplateResult == false)
            return false;
        GetEnvironmentTemplateResult other = (GetEnvironmentTemplateResult) obj;
        if (other.getEnvironmentTemplate() == null ^ this.getEnvironmentTemplate() == null)
            return false;
        if (other.getEnvironmentTemplate() != null && other.getEnvironmentTemplate().equals(this.getEnvironmentTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentTemplate() == null) ? 0 : getEnvironmentTemplate().hashCode());
        return hashCode;
    }

    @Override
    public GetEnvironmentTemplateResult clone() {
        try {
            return (GetEnvironmentTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
