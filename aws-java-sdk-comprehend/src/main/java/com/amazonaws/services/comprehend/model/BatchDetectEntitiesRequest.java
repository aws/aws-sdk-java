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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectEntities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDetectEntitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document
     * must contain fewer than 5,000 bytes of UTF-8 encoded characters.
     * </p>
     */
    private java.util.List<String> textList;
    /**
     * <p>
     * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in
     * the same language.
     * </p>
     */
    private String languageCode;

    /**
     * <p>
     * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document
     * must contain fewer than 5,000 bytes of UTF-8 encoded characters.
     * </p>
     * 
     * @return A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each
     *         document must contain fewer than 5,000 bytes of UTF-8 encoded characters.
     */

    public java.util.List<String> getTextList() {
        return textList;
    }

    /**
     * <p>
     * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document
     * must contain fewer than 5,000 bytes of UTF-8 encoded characters.
     * </p>
     * 
     * @param textList
     *        A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each
     *        document must contain fewer than 5,000 bytes of UTF-8 encoded characters.
     */

    public void setTextList(java.util.Collection<String> textList) {
        if (textList == null) {
            this.textList = null;
            return;
        }

        this.textList = new java.util.ArrayList<String>(textList);
    }

    /**
     * <p>
     * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document
     * must contain fewer than 5,000 bytes of UTF-8 encoded characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTextList(java.util.Collection)} or {@link #withTextList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param textList
     *        A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each
     *        document must contain fewer than 5,000 bytes of UTF-8 encoded characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectEntitiesRequest withTextList(String... textList) {
        if (this.textList == null) {
            setTextList(new java.util.ArrayList<String>(textList.length));
        }
        for (String ele : textList) {
            this.textList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document
     * must contain fewer than 5,000 bytes of UTF-8 encoded characters.
     * </p>
     * 
     * @param textList
     *        A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each
     *        document must contain fewer than 5,000 bytes of UTF-8 encoded characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectEntitiesRequest withTextList(java.util.Collection<String> textList) {
        setTextList(textList);
        return this;
    }

    /**
     * <p>
     * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in
     * the same language.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must
     *        be in the same language.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in
     * the same language.
     * </p>
     * 
     * @return The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must
     *         be in the same language.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in
     * the same language.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must
     *        be in the same language.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public BatchDetectEntitiesRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in
     * the same language.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must
     *        be in the same language.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public BatchDetectEntitiesRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
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
        if (getTextList() != null)
            sb.append("TextList: ").append(getTextList()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetectEntitiesRequest == false)
            return false;
        BatchDetectEntitiesRequest other = (BatchDetectEntitiesRequest) obj;
        if (other.getTextList() == null ^ this.getTextList() == null)
            return false;
        if (other.getTextList() != null && other.getTextList().equals(this.getTextList()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextList() == null) ? 0 : getTextList().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public BatchDetectEntitiesRequest clone() {
        return (BatchDetectEntitiesRequest) super.clone();
    }

}
