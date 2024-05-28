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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListWebExperiences" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWebExperiencesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of summary information for one or more Amazon Q Business experiences.
     * </p>
     */
    private java.util.List<WebExperience> webExperiences;
    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token, which you can use in a later request to list
     * the next set of messages.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of summary information for one or more Amazon Q Business experiences.
     * </p>
     * 
     * @return An array of summary information for one or more Amazon Q Business experiences.
     */

    public java.util.List<WebExperience> getWebExperiences() {
        return webExperiences;
    }

    /**
     * <p>
     * An array of summary information for one or more Amazon Q Business experiences.
     * </p>
     * 
     * @param webExperiences
     *        An array of summary information for one or more Amazon Q Business experiences.
     */

    public void setWebExperiences(java.util.Collection<WebExperience> webExperiences) {
        if (webExperiences == null) {
            this.webExperiences = null;
            return;
        }

        this.webExperiences = new java.util.ArrayList<WebExperience>(webExperiences);
    }

    /**
     * <p>
     * An array of summary information for one or more Amazon Q Business experiences.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWebExperiences(java.util.Collection)} or {@link #withWebExperiences(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param webExperiences
     *        An array of summary information for one or more Amazon Q Business experiences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWebExperiencesResult withWebExperiences(WebExperience... webExperiences) {
        if (this.webExperiences == null) {
            setWebExperiences(new java.util.ArrayList<WebExperience>(webExperiences.length));
        }
        for (WebExperience ele : webExperiences) {
            this.webExperiences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of summary information for one or more Amazon Q Business experiences.
     * </p>
     * 
     * @param webExperiences
     *        An array of summary information for one or more Amazon Q Business experiences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWebExperiencesResult withWebExperiences(java.util.Collection<WebExperience> webExperiences) {
        setWebExperiences(webExperiences);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token, which you can use in a later request to list
     * the next set of messages.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Q Business returns this token, which you can use in a later request
     *        to list the next set of messages.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token, which you can use in a later request to list
     * the next set of messages.
     * </p>
     * 
     * @return If the response is truncated, Amazon Q Business returns this token, which you can use in a later request
     *         to list the next set of messages.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Q Business returns this token, which you can use in a later request to list
     * the next set of messages.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Q Business returns this token, which you can use in a later request
     *        to list the next set of messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWebExperiencesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getWebExperiences() != null)
            sb.append("WebExperiences: ").append(getWebExperiences()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWebExperiencesResult == false)
            return false;
        ListWebExperiencesResult other = (ListWebExperiencesResult) obj;
        if (other.getWebExperiences() == null ^ this.getWebExperiences() == null)
            return false;
        if (other.getWebExperiences() != null && other.getWebExperiences().equals(this.getWebExperiences()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebExperiences() == null) ? 0 : getWebExperiences().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWebExperiencesResult clone() {
        try {
            return (ListWebExperiencesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
