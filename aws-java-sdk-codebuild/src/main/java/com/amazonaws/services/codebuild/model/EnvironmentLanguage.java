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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of Docker images that are related by programming language and are managed by AWS CodeBuild.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/EnvironmentLanguage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentLanguage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The programming language for the Docker images.
     * </p>
     */
    private String language;
    /**
     * <p>
     * The list of Docker images that are related by the specified programming language.
     * </p>
     */
    private java.util.List<EnvironmentImage> images;

    /**
     * <p>
     * The programming language for the Docker images.
     * </p>
     * 
     * @param language
     *        The programming language for the Docker images.
     * @see LanguageType
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The programming language for the Docker images.
     * </p>
     * 
     * @return The programming language for the Docker images.
     * @see LanguageType
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The programming language for the Docker images.
     * </p>
     * 
     * @param language
     *        The programming language for the Docker images.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageType
     */

    public EnvironmentLanguage withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * The programming language for the Docker images.
     * </p>
     * 
     * @param language
     *        The programming language for the Docker images.
     * @see LanguageType
     */

    public void setLanguage(LanguageType language) {
        withLanguage(language);
    }

    /**
     * <p>
     * The programming language for the Docker images.
     * </p>
     * 
     * @param language
     *        The programming language for the Docker images.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageType
     */

    public EnvironmentLanguage withLanguage(LanguageType language) {
        this.language = language.toString();
        return this;
    }

    /**
     * <p>
     * The list of Docker images that are related by the specified programming language.
     * </p>
     * 
     * @return The list of Docker images that are related by the specified programming language.
     */

    public java.util.List<EnvironmentImage> getImages() {
        return images;
    }

    /**
     * <p>
     * The list of Docker images that are related by the specified programming language.
     * </p>
     * 
     * @param images
     *        The list of Docker images that are related by the specified programming language.
     */

    public void setImages(java.util.Collection<EnvironmentImage> images) {
        if (images == null) {
            this.images = null;
            return;
        }

        this.images = new java.util.ArrayList<EnvironmentImage>(images);
    }

    /**
     * <p>
     * The list of Docker images that are related by the specified programming language.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImages(java.util.Collection)} or {@link #withImages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param images
     *        The list of Docker images that are related by the specified programming language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentLanguage withImages(EnvironmentImage... images) {
        if (this.images == null) {
            setImages(new java.util.ArrayList<EnvironmentImage>(images.length));
        }
        for (EnvironmentImage ele : images) {
            this.images.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Docker images that are related by the specified programming language.
     * </p>
     * 
     * @param images
     *        The list of Docker images that are related by the specified programming language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentLanguage withImages(java.util.Collection<EnvironmentImage> images) {
        setImages(images);
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
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getImages() != null)
            sb.append("Images: ").append(getImages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentLanguage == false)
            return false;
        EnvironmentLanguage other = (EnvironmentLanguage) obj;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getImages() == null ^ this.getImages() == null)
            return false;
        if (other.getImages() != null && other.getImages().equals(this.getImages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getImages() == null) ? 0 : getImages().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentLanguage clone() {
        try {
            return (EnvironmentLanguage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.EnvironmentLanguageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
