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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteWebExperience" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteWebExperienceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business application linked to the Amazon Q Business web experience.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the Amazon Q Business web experience being deleted.
     * </p>
     */
    private String webExperienceId;

    /**
     * <p>
     * The identifier of the Amazon Q Business application linked to the Amazon Q Business web experience.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application linked to the Amazon Q Business web experience.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application linked to the Amazon Q Business web experience.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application linked to the Amazon Q Business web experience.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application linked to the Amazon Q Business web experience.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application linked to the Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWebExperienceRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience being deleted.
     * </p>
     * 
     * @param webExperienceId
     *        The identifier of the Amazon Q Business web experience being deleted.
     */

    public void setWebExperienceId(String webExperienceId) {
        this.webExperienceId = webExperienceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience being deleted.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business web experience being deleted.
     */

    public String getWebExperienceId() {
        return this.webExperienceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience being deleted.
     * </p>
     * 
     * @param webExperienceId
     *        The identifier of the Amazon Q Business web experience being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWebExperienceRequest withWebExperienceId(String webExperienceId) {
        setWebExperienceId(webExperienceId);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getWebExperienceId() != null)
            sb.append("WebExperienceId: ").append(getWebExperienceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteWebExperienceRequest == false)
            return false;
        DeleteWebExperienceRequest other = (DeleteWebExperienceRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getWebExperienceId() == null ^ this.getWebExperienceId() == null)
            return false;
        if (other.getWebExperienceId() != null && other.getWebExperienceId().equals(this.getWebExperienceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getWebExperienceId() == null) ? 0 : getWebExperienceId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteWebExperienceRequest clone() {
        return (DeleteWebExperienceRequest) super.clone();
    }

}
