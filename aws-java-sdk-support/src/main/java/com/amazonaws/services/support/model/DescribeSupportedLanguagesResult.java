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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/DescribeSupportedLanguages" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSupportedLanguagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A JSON-formatted array that contains the available ISO 639-1 language codes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SupportedLanguage> supportedLanguages;

    /**
     * <p>
     * A JSON-formatted array that contains the available ISO 639-1 language codes.
     * </p>
     * 
     * @return A JSON-formatted array that contains the available ISO 639-1 language codes.
     */

    public java.util.List<SupportedLanguage> getSupportedLanguages() {
        if (supportedLanguages == null) {
            supportedLanguages = new com.amazonaws.internal.SdkInternalList<SupportedLanguage>();
        }
        return supportedLanguages;
    }

    /**
     * <p>
     * A JSON-formatted array that contains the available ISO 639-1 language codes.
     * </p>
     * 
     * @param supportedLanguages
     *        A JSON-formatted array that contains the available ISO 639-1 language codes.
     */

    public void setSupportedLanguages(java.util.Collection<SupportedLanguage> supportedLanguages) {
        if (supportedLanguages == null) {
            this.supportedLanguages = null;
            return;
        }

        this.supportedLanguages = new com.amazonaws.internal.SdkInternalList<SupportedLanguage>(supportedLanguages);
    }

    /**
     * <p>
     * A JSON-formatted array that contains the available ISO 639-1 language codes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedLanguages(java.util.Collection)} or {@link #withSupportedLanguages(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedLanguages
     *        A JSON-formatted array that contains the available ISO 639-1 language codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSupportedLanguagesResult withSupportedLanguages(SupportedLanguage... supportedLanguages) {
        if (this.supportedLanguages == null) {
            setSupportedLanguages(new com.amazonaws.internal.SdkInternalList<SupportedLanguage>(supportedLanguages.length));
        }
        for (SupportedLanguage ele : supportedLanguages) {
            this.supportedLanguages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON-formatted array that contains the available ISO 639-1 language codes.
     * </p>
     * 
     * @param supportedLanguages
     *        A JSON-formatted array that contains the available ISO 639-1 language codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSupportedLanguagesResult withSupportedLanguages(java.util.Collection<SupportedLanguage> supportedLanguages) {
        setSupportedLanguages(supportedLanguages);
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
        if (getSupportedLanguages() != null)
            sb.append("SupportedLanguages: ").append(getSupportedLanguages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSupportedLanguagesResult == false)
            return false;
        DescribeSupportedLanguagesResult other = (DescribeSupportedLanguagesResult) obj;
        if (other.getSupportedLanguages() == null ^ this.getSupportedLanguages() == null)
            return false;
        if (other.getSupportedLanguages() != null && other.getSupportedLanguages().equals(this.getSupportedLanguages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSupportedLanguages() == null) ? 0 : getSupportedLanguages().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSupportedLanguagesResult clone() {
        try {
            return (DescribeSupportedLanguagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
