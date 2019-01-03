/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorCheckResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrustedAdvisorCheckResultRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     */
    private String checkId;
    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en")
     * and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * </p>
     */
    private String language;

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     * 
     * @param checkId
     *        The unique identifier for the Trusted Advisor check.
     */

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     * 
     * @return The unique identifier for the Trusted Advisor check.
     */

    public String getCheckId() {
        return this.checkId;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     * 
     * @param checkId
     *        The unique identifier for the Trusted Advisor check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustedAdvisorCheckResultRequest withCheckId(String checkId) {
        setCheckId(checkId);
        return this;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en")
     * and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * </p>
     * 
     * @param language
     *        The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English
     *        ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en")
     * and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * </p>
     * 
     * @return The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English
     *         ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en")
     * and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * </p>
     * 
     * @param language
     *        The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English
     *        ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrustedAdvisorCheckResultRequest withLanguage(String language) {
        setLanguage(language);
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
        if (getCheckId() != null)
            sb.append("CheckId: ").append(getCheckId()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrustedAdvisorCheckResultRequest == false)
            return false;
        DescribeTrustedAdvisorCheckResultRequest other = (DescribeTrustedAdvisorCheckResultRequest) obj;
        if (other.getCheckId() == null ^ this.getCheckId() == null)
            return false;
        if (other.getCheckId() != null && other.getCheckId().equals(this.getCheckId()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckId() == null) ? 0 : getCheckId().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrustedAdvisorCheckResultRequest clone() {
        return (DescribeTrustedAdvisorCheckResultRequest) super.clone();
    }

}
