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
package com.amazonaws.services.polly.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/PutLexicon" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutLexiconRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the lexicon. The name must follow the regular express format [0-9A-Za-z]{1,20}. That is, the name is a
     * case-sensitive alphanumeric string up to 20 characters long.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Content of the PLS lexicon as string data.
     * </p>
     */
    private String content;

    /**
     * <p>
     * Name of the lexicon. The name must follow the regular express format [0-9A-Za-z]{1,20}. That is, the name is a
     * case-sensitive alphanumeric string up to 20 characters long.
     * </p>
     * 
     * @param name
     *        Name of the lexicon. The name must follow the regular express format [0-9A-Za-z]{1,20}. That is, the name
     *        is a case-sensitive alphanumeric string up to 20 characters long.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the lexicon. The name must follow the regular express format [0-9A-Za-z]{1,20}. That is, the name is a
     * case-sensitive alphanumeric string up to 20 characters long.
     * </p>
     * 
     * @return Name of the lexicon. The name must follow the regular express format [0-9A-Za-z]{1,20}. That is, the name
     *         is a case-sensitive alphanumeric string up to 20 characters long.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the lexicon. The name must follow the regular express format [0-9A-Za-z]{1,20}. That is, the name is a
     * case-sensitive alphanumeric string up to 20 characters long.
     * </p>
     * 
     * @param name
     *        Name of the lexicon. The name must follow the regular express format [0-9A-Za-z]{1,20}. That is, the name
     *        is a case-sensitive alphanumeric string up to 20 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLexiconRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Content of the PLS lexicon as string data.
     * </p>
     * 
     * @param content
     *        Content of the PLS lexicon as string data.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * Content of the PLS lexicon as string data.
     * </p>
     * 
     * @return Content of the PLS lexicon as string data.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * Content of the PLS lexicon as string data.
     * </p>
     * 
     * @param content
     *        Content of the PLS lexicon as string data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLexiconRequest withContent(String content) {
        setContent(content);
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLexiconRequest == false)
            return false;
        PutLexiconRequest other = (PutLexiconRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public PutLexiconRequest clone() {
        return (PutLexiconRequest) super.clone();
    }

}
