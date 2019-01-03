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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeTrustedAdvisorChecks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrustedAdvisorChecksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en")
     * and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * </p>
     */
    private String language;

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

    public DescribeTrustedAdvisorChecksRequest withLanguage(String language) {
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

        if (obj instanceof DescribeTrustedAdvisorChecksRequest == false)
            return false;
        DescribeTrustedAdvisorChecksRequest other = (DescribeTrustedAdvisorChecksRequest) obj;
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

        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrustedAdvisorChecksRequest clone() {
        return (DescribeTrustedAdvisorChecksRequest) super.clone();
    }

}
