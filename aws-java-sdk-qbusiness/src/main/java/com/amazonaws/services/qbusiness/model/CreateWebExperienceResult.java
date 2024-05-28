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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateWebExperience" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWebExperienceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience.
     * </p>
     */
    private String webExperienceId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Q Business web experience.
     * </p>
     */
    private String webExperienceArn;

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience.
     * </p>
     * 
     * @param webExperienceId
     *        The identifier of the Amazon Q Business web experience.
     */

    public void setWebExperienceId(String webExperienceId) {
        this.webExperienceId = webExperienceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business web experience.
     */

    public String getWebExperienceId() {
        return this.webExperienceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business web experience.
     * </p>
     * 
     * @param webExperienceId
     *        The identifier of the Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebExperienceResult withWebExperienceId(String webExperienceId) {
        setWebExperienceId(webExperienceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Q Business web experience.
     * </p>
     * 
     * @param webExperienceArn
     *        The Amazon Resource Name (ARN) of an Amazon Q Business web experience.
     */

    public void setWebExperienceArn(String webExperienceArn) {
        this.webExperienceArn = webExperienceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Q Business web experience.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Amazon Q Business web experience.
     */

    public String getWebExperienceArn() {
        return this.webExperienceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Q Business web experience.
     * </p>
     * 
     * @param webExperienceArn
     *        The Amazon Resource Name (ARN) of an Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWebExperienceResult withWebExperienceArn(String webExperienceArn) {
        setWebExperienceArn(webExperienceArn);
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
        if (getWebExperienceId() != null)
            sb.append("WebExperienceId: ").append(getWebExperienceId()).append(",");
        if (getWebExperienceArn() != null)
            sb.append("WebExperienceArn: ").append(getWebExperienceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWebExperienceResult == false)
            return false;
        CreateWebExperienceResult other = (CreateWebExperienceResult) obj;
        if (other.getWebExperienceId() == null ^ this.getWebExperienceId() == null)
            return false;
        if (other.getWebExperienceId() != null && other.getWebExperienceId().equals(this.getWebExperienceId()) == false)
            return false;
        if (other.getWebExperienceArn() == null ^ this.getWebExperienceArn() == null)
            return false;
        if (other.getWebExperienceArn() != null && other.getWebExperienceArn().equals(this.getWebExperienceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebExperienceId() == null) ? 0 : getWebExperienceId().hashCode());
        hashCode = prime * hashCode + ((getWebExperienceArn() == null) ? 0 : getWebExperienceArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateWebExperienceResult clone() {
        try {
            return (CreateWebExperienceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
